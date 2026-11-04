package c.b.a.b.r;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Dialog f2790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2793e;

    public a(Dialog dialog, Rect rect) {
        this.f2790b = dialog;
        this.f2791c = rect.left;
        this.f2792d = rect.top;
        this.f2793e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f2791c + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        int top = this.f2792d + viewFindViewById.getTop();
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f2793e;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f2790b.onTouchEvent(motionEventObtain);
    }
}
