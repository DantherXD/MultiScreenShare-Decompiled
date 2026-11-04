package com.google.android.material.timepicker;

import a.g.l.v;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import c.b.a.b.h;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: classes.dex */
class TimePickerView extends ConstraintLayout {
    private final Chip A;
    private final ClockHandView B;
    private final ClockFaceView C;
    private final MaterialButtonToggleGroup D;
    private final View.OnClickListener E;
    private f F;
    private g G;
    private e H;
    private final Chip z;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.G != null) {
                TimePickerView.this.G.a(((Integer) view.getTag(c.b.a.b.f.F)).intValue());
            }
        }
    }

    class b implements MaterialButtonToggleGroup.e {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.e
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2 = i == c.b.a.b.f.i ? 1 : 0;
            if (TimePickerView.this.F == null || !z) {
                return;
            }
            TimePickerView.this.F.a(i2);
        }
    }

    class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean zOnDoubleTap = super.onDoubleTap(motionEvent);
            if (TimePickerView.this.H != null) {
                TimePickerView.this.H.a();
            }
            return zOnDoubleTap;
        }
    }

    class d implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GestureDetector f4263b;

        d(GestureDetector gestureDetector) {
            this.f4263b = gestureDetector;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f4263b.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface e {
        void a();
    }

    interface f {
        void a(int i);
    }

    interface g {
        void a(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = new a();
        LayoutInflater.from(context).inflate(h.i, this);
        this.C = (ClockFaceView) findViewById(c.b.a.b.f.g);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(c.b.a.b.f.j);
        this.D = materialButtonToggleGroup;
        materialButtonToggleGroup.g(new b());
        this.z = (Chip) findViewById(c.b.a.b.f.m);
        this.A = (Chip) findViewById(c.b.a.b.f.k);
        this.B = (ClockHandView) findViewById(c.b.a.b.f.h);
        F();
        E();
    }

    private void E() {
        Chip chip = this.z;
        int i = c.b.a.b.f.F;
        chip.setTag(i, 12);
        this.A.setTag(i, 10);
        this.z.setOnClickListener(this.E);
        this.A.setOnClickListener(this.E);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void F() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.z.setOnTouchListener(dVar);
        this.A.setOnTouchListener(dVar);
    }

    private void G() {
        if (this.D.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(this);
            dVar.e(c.b.a.b.f.f2728f, v.C(this) == 0 ? 2 : 1);
            dVar.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        G();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            G();
        }
    }
}
