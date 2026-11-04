package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f4138c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.b.a.b.x.d f4141f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f4136a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.b.a.b.x.f f4137b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4139d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WeakReference<b> f4140e = new WeakReference<>(null);

    class a extends c.b.a.b.x.f {
        a() {
        }

        @Override // c.b.a.b.x.f
        public void a(int i) {
            h.this.f4139d = true;
            b bVar = (b) h.this.f4140e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // c.b.a.b.x.f
        public void b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            h.this.f4139d = true;
            b bVar = (b) h.this.f4140e.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public h(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f4136a.measureText(charSequence, 0, charSequence.length());
    }

    public c.b.a.b.x.d d() {
        return this.f4141f;
    }

    public TextPaint e() {
        return this.f4136a;
    }

    public float f(String str) {
        if (!this.f4139d) {
            return this.f4138c;
        }
        float fC = c(str);
        this.f4138c = fC;
        this.f4139d = false;
        return fC;
    }

    public void g(b bVar) {
        this.f4140e = new WeakReference<>(bVar);
    }

    public void h(c.b.a.b.x.d dVar, Context context) {
        if (this.f4141f != dVar) {
            this.f4141f = dVar;
            if (dVar != null) {
                dVar.k(context, this.f4136a, this.f4137b);
                b bVar = this.f4140e.get();
                if (bVar != null) {
                    this.f4136a.drawableState = bVar.getState();
                }
                dVar.j(context, this.f4136a, this.f4137b);
                this.f4139d = true;
            }
            b bVar2 = this.f4140e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z) {
        this.f4139d = z;
    }

    public void j(Context context) {
        this.f4141f.j(context, this.f4136a, this.f4137b);
    }
}
