package com.google.android.material.bottomappbar;

import c.b.a.b.a0.f;
import c.b.a.b.a0.m;

/* JADX INFO: loaded from: classes.dex */
public class a extends f implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f3920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f3922f;
    private float g;

    @Override // c.b.a.b.a0.f
    public void b(float f2, float f3, float f4, m mVar) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13 = this.f3920d;
        if (f13 == 0.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f14 = ((this.f3919c * 2.0f) + f13) / 2.0f;
        float f15 = f4 * this.f3918b;
        float f16 = f3 + this.f3922f;
        float f17 = (this.f3921e * f4) + ((1.0f - f4) * f14);
        if (f17 / f14 >= 1.0f) {
            mVar.m(f2, 0.0f);
            return;
        }
        float f18 = this.g;
        float f19 = f18 * f4;
        boolean z = f18 == -1.0f || Math.abs((f18 * 2.0f) - f13) < 0.1f;
        if (z) {
            f5 = f17;
            f6 = 0.0f;
        } else {
            f6 = 1.75f;
            f5 = 0.0f;
        }
        float f20 = f14 + f15;
        float f21 = f5 + f15;
        float fSqrt = (float) Math.sqrt((f20 * f20) - (f21 * f21));
        float f22 = f16 - fSqrt;
        float f23 = f16 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f21));
        float f24 = (90.0f - degrees) + f6;
        mVar.m(f22, 0.0f);
        float f25 = f15 * 2.0f;
        mVar.a(f22 - f15, 0.0f, f22 + f15, f25, 270.0f, degrees);
        if (z) {
            f8 = f16 - f14;
            f9 = (-f14) - f5;
            f7 = f16 + f14;
            f10 = f14 - f5;
            f11 = 180.0f - f24;
            f12 = (f24 * 2.0f) - 180.0f;
        } else {
            float f26 = this.f3919c;
            float f27 = f19 * 2.0f;
            float f28 = f16 - f14;
            mVar.a(f28, -(f19 + f26), f28 + f26 + f27, f26 + f19, 180.0f - f24, ((f24 * 2.0f) - 180.0f) / 2.0f);
            f7 = f16 + f14;
            float f29 = this.f3919c;
            mVar.m(f7 - ((f29 / 2.0f) + f19), f29 + f19);
            float f30 = this.f3919c;
            f8 = f7 - (f27 + f30);
            f9 = -(f19 + f30);
            f10 = f30 + f19;
            f11 = 90.0f;
            f12 = f24 - 90.0f;
        }
        mVar.a(f8, f9, f7, f10, f11, f12);
        mVar.a(f23 - f15, 0.0f, f23 + f15, f25, 270.0f - degrees, degrees);
        mVar.m(f2, 0.0f);
    }

    float c() {
        return this.f3921e;
    }

    public float d() {
        return this.g;
    }

    float e() {
        return this.f3919c;
    }

    float f() {
        return this.f3918b;
    }

    public float g() {
        return this.f3920d;
    }

    void h(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f3921e = f2;
    }

    public void i(float f2) {
        this.g = f2;
    }

    void j(float f2) {
        this.f3919c = f2;
    }

    void k(float f2) {
        this.f3918b = f2;
    }

    public void l(float f2) {
        this.f3920d = f2;
    }

    void m(float f2) {
        this.f3922f = f2;
    }
}
