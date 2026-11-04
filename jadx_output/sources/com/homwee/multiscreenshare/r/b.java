package com.homwee.multiscreenshare.r;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class b extends Scroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4670a;

    public b(Context context, Interpolator interpolator) {
        super(context, interpolator);
        this.f4670a = 0;
    }

    public void a(ViewPager viewPager) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("o");
            declaredField.setAccessible(true);
            declaredField.set(viewPager, this);
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public void b(int i) {
        this.f4670a = i;
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, this.f4670a);
    }

    @Override // android.widget.Scroller
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f4670a);
    }
}
