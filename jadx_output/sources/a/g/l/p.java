package a.g.l;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f681b;

    public p(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f681b | this.f680a;
    }

    public void b(View view, View view2, int i) {
        c(view, view2, i, 0);
    }

    public void c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f681b = i;
        } else {
            this.f680a = i;
        }
    }

    public void d(View view, int i) {
        if (i == 1) {
            this.f681b = 0;
        } else {
            this.f680a = 0;
        }
    }
}
