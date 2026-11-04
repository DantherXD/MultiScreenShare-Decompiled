package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DataSetObservable f2411a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DataSetObserver f2412b;

    public abstract void a(ViewGroup viewGroup, int i, Object obj);

    @Deprecated
    public void b(View view) {
    }

    public void c(ViewGroup viewGroup) {
        b(viewGroup);
    }

    public abstract int d();

    public abstract int e(Object obj);

    public float f(int i) {
        return 1.0f;
    }

    public abstract Object g(ViewGroup viewGroup, int i);

    public abstract boolean h(View view, Object obj);

    public void i() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f2412b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f2411a.notifyChanged();
    }

    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable k() {
        return null;
    }

    @Deprecated
    public void l(View view, int i, Object obj) {
    }

    public void m(ViewGroup viewGroup, int i, Object obj) {
        l(viewGroup, i, obj);
    }

    void n(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f2412b = dataSetObserver;
        }
    }

    @Deprecated
    public void o(View view) {
    }

    public void p(ViewGroup viewGroup) {
        o(viewGroup);
    }
}
