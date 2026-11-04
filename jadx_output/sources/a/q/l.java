package a.q;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f891b;

    public static l b(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.f870c);
    }

    static void c(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.f870c, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f890a) != this || (runnable = this.f891b) == null) {
            return;
        }
        runnable.run();
    }
}
