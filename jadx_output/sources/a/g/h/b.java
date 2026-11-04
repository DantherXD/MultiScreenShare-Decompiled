package a.g.h;

import android.os.Build;
import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f504d;

    public interface a {
        void a();
    }

    private void d() {
        while (this.f504d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.f501a) {
                return;
            }
            this.f501a = true;
            this.f504d = true;
            a aVar = this.f502b;
            Object obj = this.f503c;
            if (aVar != null) {
                try {
                    aVar.a();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f504d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null && Build.VERSION.SDK_INT >= 16) {
                ((CancellationSignal) obj).cancel();
            }
            synchronized (this) {
                this.f504d = false;
                notifyAll();
            }
        }
    }

    public boolean b() {
        boolean z;
        synchronized (this) {
            z = this.f501a;
        }
        return z;
    }

    public void c(a aVar) {
        synchronized (this) {
            d();
            if (this.f502b == aVar) {
                return;
            }
            this.f502b = aVar;
            if (this.f501a && aVar != null) {
                aVar.a();
            }
        }
    }
}
