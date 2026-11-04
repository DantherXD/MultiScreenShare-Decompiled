package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
final class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f1758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ColorStateList f1759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f1760d;

    f(f fVar) {
        this.f1759c = null;
        this.f1760d = d.f1752b;
        if (fVar != null) {
            this.f1757a = fVar.f1757a;
            this.f1758b = fVar.f1758b;
            this.f1759c = fVar.f1759c;
            this.f1760d = fVar.f1760d;
        }
    }

    boolean a() {
        return this.f1758b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f1757a;
        Drawable.ConstantState constantState = this.f1758b;
        return (constantState != null ? constantState.getChangingConfigurations() : 0) | i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new e(this, resources) : new d(this, resources);
    }
}
