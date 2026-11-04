package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends b {
    private int k;
    private int l;
    private a.e.a.m.a m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    private void t(a.e.a.m.e eVar, int i, boolean z) {
        this.l = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.k;
            if (i2 == 5) {
                this.l = 0;
            } else if (i2 == 6) {
                this.l = 1;
            }
        } else {
            int i3 = this.k;
            if (z) {
                if (i3 == 5) {
                    this.l = 1;
                } else if (i3 == 6) {
                    this.l = 0;
                }
            } else if (i3 == 5) {
                this.l = 0;
            } else if (i3 == 6) {
                this.l = 1;
            }
        }
        if (eVar instanceof a.e.a.m.a) {
            ((a.e.a.m.a) eVar).x1(this.l);
        }
    }

    public boolean getAllowsGoneWidget() {
        return this.m.r1();
    }

    public int getMargin() {
        return this.m.t1();
    }

    public int getType() {
        return this.k;
    }

    @Override // androidx.constraintlayout.widget.b
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.m = new a.e.a.m.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i.w1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == i.v1) {
                    this.m.w1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == i.x1) {
                    this.m.y1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1594e = this.m;
        s();
    }

    @Override // androidx.constraintlayout.widget.b
    public void n(a.e.a.m.e eVar, boolean z) {
        t(eVar, this.k, z);
    }

    public void setAllowsGoneWidget(boolean z) {
        this.m.w1(z);
    }

    public void setDpMargin(int i) {
        this.m.y1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.m.y1(i);
    }

    public void setType(int i) {
        this.k = i;
    }
}
