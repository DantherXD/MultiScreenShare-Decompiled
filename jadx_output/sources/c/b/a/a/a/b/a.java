package c.b.a.a.a.b;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2566a;

    public a(Context context) {
        this.f2566a = context;
    }

    public PackageInfo a(String str, int i) {
        return this.f2566a.getPackageManager().getPackageInfo(str, i);
    }
}
