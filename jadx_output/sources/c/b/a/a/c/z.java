package c.b.a.a.c;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class z implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ y f2627c;

    z(y yVar, h hVar) {
        this.f2627c = yVar;
        this.f2626b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            h hVarA = this.f2627c.f2624b.a(this.f2626b.j());
            if (hVarA == null) {
                this.f2627c.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f2585b;
            hVarA.e(executor, this.f2627c);
            hVarA.d(executor, this.f2627c);
            hVarA.a(executor, this.f2627c);
        } catch (f e2) {
            boolean z = e2.getCause() instanceof Exception;
            y yVar = this.f2627c;
            if (z) {
                yVar.c((Exception) e2.getCause());
            } else {
                yVar.c(e2);
            }
        } catch (CancellationException unused) {
            this.f2627c.b();
        } catch (Exception e3) {
            this.f2627c.c(e3);
        }
    }
}
