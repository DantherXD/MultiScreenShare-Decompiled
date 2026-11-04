package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class g extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1656d;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f1655c == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f1655c.getLayoutParams();
        bVar2.v0.g1(0);
        a.e.a.m.e.b bVarY = bVar.v0.y();
        a.e.a.m.e.b bVar3 = a.e.a.m.e.b.FIXED;
        if (bVarY != bVar3) {
            bVar.v0.h1(bVar2.v0.U());
        }
        if (bVar.v0.R() != bVar3) {
            bVar.v0.I0(bVar2.v0.v());
        }
        bVar2.v0.g1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1654b == -1 && !isInEditMode()) {
            setVisibility(this.f1656d);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f1654b);
        this.f1655c = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).j0 = true;
            this.f1655c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1655c;
    }

    public int getEmptyVisibility() {
        return this.f1656d;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f1654b == i) {
            return;
        }
        View view = this.f1655c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f1655c.getLayoutParams()).j0 = false;
            this.f1655c = null;
        }
        this.f1654b = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f1656d = i;
    }
}
