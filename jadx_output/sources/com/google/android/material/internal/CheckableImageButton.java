package com.google.android.material.internal;

import a.g.l.v;
import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends androidx.appcompat.widget.m implements Checkable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f4104d = {R.attr.state_checked};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4106f;
    private boolean g;

    class a extends a.g.l.a {
        a() {
        }

        @Override // a.g.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // a.g.l.a
        public void g(View view, a.g.l.e0.c cVar) {
            super.g(view, cVar);
            cVar.U(CheckableImageButton.this.a());
            cVar.V(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends a.i.a.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f4108d;

        static class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            k(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void k(Parcel parcel) {
            this.f4108d = parcel.readInt() == 1;
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f4108d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.B);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4106f = true;
        this.g = true;
        v.o0(this, new a());
    }

    public boolean a() {
        return this.f4106f;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4105e;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f4105e) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f4104d;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.j());
        setChecked(bVar.f4108d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f4108d = this.f4105e;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f4106f != z) {
            this.f4106f = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f4106f || this.f4105e == z) {
            return;
        }
        this.f4105e = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.g = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.g) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f4105e);
    }
}
