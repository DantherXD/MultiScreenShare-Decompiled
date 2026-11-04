package com.homwee.multiscreenshare.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public class VerticalViewPager extends ViewPager {
    private boolean m0;

    private class b extends TimerTask {
        private b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            cancel();
            VerticalViewPager.this.m0 = true;
        }
    }

    public class c implements ViewPager.k {
        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.k
        public void a(View view, float f2) {
            if (VerticalViewPager.this.getLayoutDirection() == 1) {
                f2 = -f2;
            }
            if (f2 < -1.0f || f2 > 1.0f) {
                view.setAlpha(0.0f);
                return;
            }
            view.setAlpha(1.0f);
            view.setTranslationX(view.getWidth() * (-f2));
            view.setTranslationY(f2 * view.getHeight());
        }
    }

    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m0 = true;
        S();
    }

    private MotionEvent T(MotionEvent motionEvent) {
        float width = getWidth();
        float height = getHeight();
        motionEvent.setLocation((motionEvent.getY() / height) * width, (motionEvent.getX() / width) * height);
        return motionEvent;
    }

    public void S() {
        N(true, new c());
        setOverScrollMode(2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean o(KeyEvent keyEvent) {
        int i;
        if (!this.m0) {
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                i = 17;
            } else {
                if (keyCode != 20) {
                    if (keyCode != 97) {
                        return onKeyDown(keyEvent.getKeyCode(), keyEvent);
                    }
                    Log.d("ccc", "V-executeKeyEvent: KEYCODE_BUTTON_B");
                    return false;
                }
                i = 66;
            }
            c(i);
            this.m0 = false;
            new Timer().schedule(new b(), 200L);
        }
        return super.o(keyEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(T(motionEvent));
        T(motionEvent);
        return zOnInterceptTouchEvent;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(T(motionEvent));
    }
}
