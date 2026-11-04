package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Random f1024a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Integer, String> f1025b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<String, Integer> f1026c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, c> f1027d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<String> f1028e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Map<String, b<?>> f1029f = new HashMap();
    final Map<String, Object> g = new HashMap();
    final Bundle h = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    class a<I> extends androidx.activity.result.c<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.f.a f1032c;

        a(String str, int i, androidx.activity.result.f.a aVar) {
            this.f1030a = str;
            this.f1031b = i;
            this.f1032c = aVar;
        }

        @Override // androidx.activity.result.c
        public void a() {
            d.this.i(this.f1030a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.activity.result.b<O> f1034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.activity.result.f.a<?, O> f1035b;

        b(androidx.activity.result.b<O> bVar, androidx.activity.result.f.a<?, O> aVar) {
            this.f1034a = bVar;
            this.f1035b = aVar;
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.lifecycle.d f1036a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ArrayList<androidx.lifecycle.e> f1037b;

        void a() {
            Iterator<androidx.lifecycle.e> it = this.f1037b.iterator();
            while (it.hasNext()) {
                this.f1036a.c(it.next());
            }
            this.f1037b.clear();
        }
    }

    private void a(int i, String str) {
        this.f1025b.put(Integer.valueOf(i), str);
        this.f1026c.put(str, Integer.valueOf(i));
    }

    private <O> void c(String str, int i, Intent intent, b<O> bVar) {
        androidx.activity.result.b<O> bVar2;
        if (bVar != null && (bVar2 = bVar.f1034a) != null) {
            bVar2.a(bVar.f1035b.a(i, intent));
        } else {
            this.g.remove(str);
            this.h.putParcelable(str, new androidx.activity.result.a(i, intent));
        }
    }

    private int d() {
        int iNextInt = this.f1024a.nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            if (!this.f1025b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            iNextInt = this.f1024a.nextInt(2147418112);
        }
    }

    private int h(String str) {
        Integer num = this.f1026c.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iD = d();
        a(iD, str);
        return iD;
    }

    public final boolean b(int i, int i2, Intent intent) {
        String str = this.f1025b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.f1028e.remove(str);
        c(str, i2, intent, this.f1029f.get(str));
        return true;
    }

    public final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f1028e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f1024a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < stringArrayList.size(); i++) {
            String str = stringArrayList.get(i);
            if (this.f1026c.containsKey(str)) {
                Integer numRemove = this.f1026c.remove(str);
                if (!this.h.containsKey(str)) {
                    this.f1025b.remove(numRemove);
                }
            }
            a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
        }
    }

    public final void f(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f1026c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f1026c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f1028e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f1024a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> androidx.activity.result.c<I> g(String str, androidx.activity.result.f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        int iH = h(str);
        this.f1029f.put(str, new b<>(bVar, aVar));
        if (this.g.containsKey(str)) {
            Object obj = this.g.get(str);
            this.g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar2 = (androidx.activity.result.a) this.h.getParcelable(str);
        if (aVar2 != null) {
            this.h.remove(str);
            bVar.a(aVar.a(aVar2.k(), aVar2.j()));
        }
        return new a(str, iH, aVar);
    }

    final void i(String str) {
        Integer numRemove;
        if (!this.f1028e.contains(str) && (numRemove = this.f1026c.remove(str)) != null) {
            this.f1025b.remove(numRemove);
        }
        this.f1029f.remove(str);
        if (this.g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.g.get(str));
            this.g.remove(str);
        }
        if (this.h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.h.getParcelable(str));
            this.h.remove(str);
        }
        c cVar = this.f1027d.get(str);
        if (cVar != null) {
            cVar.a();
            this.f1027d.remove(str);
        }
    }
}
