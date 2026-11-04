package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Iterable<Intent> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<Intent> f1740b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1741c;

    public interface a {
        Intent f();
    }

    private l(Context context) {
        this.f1741c = context;
    }

    public static l d(Context context) {
        return new l(context);
    }

    public l a(Intent intent) {
        this.f1740b.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l b(Activity activity) {
        Intent intentF = activity instanceof a ? ((a) activity).f() : null;
        if (intentF == null) {
            intentF = e.a(activity);
        }
        if (intentF != null) {
            ComponentName component = intentF.getComponent();
            if (component == null) {
                component = intentF.resolveActivity(this.f1741c.getPackageManager());
            }
            c(component);
            a(intentF);
        }
        return this;
    }

    public l c(ComponentName componentName) {
        int size = this.f1740b.size();
        try {
            Context context = this.f1741c;
            while (true) {
                Intent intentB = e.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f1740b.add(size, intentB);
                context = this.f1741c;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e2);
        }
    }

    public void e() {
        f(null);
    }

    public void f(Bundle bundle) {
        if (this.f1740b.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        ArrayList<Intent> arrayList = this.f1740b;
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (a.g.d.a.h(this.f1741c, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1741c.startActivity(intent);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1740b.iterator();
    }
}
