package com.google.android.material.appbar;

import a.g.l.v;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f3873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3878f = true;
    private boolean g = true;

    public d(View view) {
        this.f3873a = view;
    }

    void a() {
        View view = this.f3873a;
        v.Z(view, this.f3876d - (view.getTop() - this.f3874b));
        View view2 = this.f3873a;
        v.Y(view2, this.f3877e - (view2.getLeft() - this.f3875c));
    }

    public int b() {
        return this.f3876d;
    }

    void c() {
        this.f3874b = this.f3873a.getTop();
        this.f3875c = this.f3873a.getLeft();
    }

    public boolean d(int i) {
        if (!this.g || this.f3877e == i) {
            return false;
        }
        this.f3877e = i;
        a();
        return true;
    }

    public boolean e(int i) {
        if (!this.f3878f || this.f3876d == i) {
            return false;
        }
        this.f3876d = i;
        a();
        return true;
    }
}
