package a.e.b.b;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class h extends androidx.constraintlayout.widget.b implements j.e {
    private boolean k;
    private boolean l;
    private float m;
    protected View[] n;

    @Override // a.e.b.b.j.e
    public void a(j jVar, int i, int i2) {
    }

    @Override // a.e.b.b.j.e
    public void b(j jVar, int i, int i2, float f2) {
    }

    @Override // a.e.b.b.j.e
    public void c(j jVar, int i) {
    }

    public float getProgress() {
        return this.m;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.B6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.i.D6) {
                    this.k = typedArrayObtainStyledAttributes.getBoolean(index, this.k);
                } else if (index == androidx.constraintlayout.widget.i.C6) {
                    this.l = typedArrayObtainStyledAttributes.getBoolean(index, this.l);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f2) {
        this.m = f2;
        int i = 0;
        if (this.f1592c > 0) {
            this.n = l((ConstraintLayout) getParent());
            while (i < this.f1592c) {
                y(this.n[i], f2);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof h)) {
                y(childAt, f2);
            }
            i++;
        }
    }

    public boolean t() {
        return false;
    }

    public boolean u() {
        return this.l;
    }

    public boolean v() {
        return this.k;
    }

    public void w(Canvas canvas) {
    }

    public void x(Canvas canvas) {
    }

    public void y(View view, float f2) {
    }
}
