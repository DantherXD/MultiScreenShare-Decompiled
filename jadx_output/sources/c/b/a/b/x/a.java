package c.b.a.b.x;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f2800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0064a f2801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f2802c;

    /* JADX INFO: renamed from: c.b.a.b.x.a$a, reason: collision with other inner class name */
    public interface InterfaceC0064a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0064a interfaceC0064a, Typeface typeface) {
        this.f2800a = typeface;
        this.f2801b = interfaceC0064a;
    }

    private void d(Typeface typeface) {
        if (this.f2802c) {
            return;
        }
        this.f2801b.a(typeface);
    }

    @Override // c.b.a.b.x.f
    public void a(int i) {
        d(this.f2800a);
    }

    @Override // c.b.a.b.x.f
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.f2802c = true;
    }
}
