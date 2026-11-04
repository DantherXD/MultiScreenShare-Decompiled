package a.e.b.b;

import a.g.l.n;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class j extends ConstraintLayout implements n {
    public static boolean z;
    l A;
    private d A0;
    Interpolator B;
    private Runnable B0;
    Interpolator C;
    private int[] C0;
    float D;
    int D0;
    private int E;
    private int E0;
    int F;
    private boolean F0;
    private int G;
    f G0;
    private int H;
    private boolean H0;
    private int I;
    ArrayList<Integer> I0;
    private boolean J;
    HashMap<View, g> K;
    private long L;
    private float M;
    float N;
    float O;
    private long P;
    float Q;
    private boolean R;
    boolean S;
    private e T;
    int U;
    c V;
    private boolean W;
    private a.e.b.a.b a0;
    private a.e.b.b.b b0;
    int c0;
    int d0;
    int e0;
    int f0;
    boolean g0;
    float h0;
    float i0;
    long j0;
    float k0;
    private boolean l0;
    private ArrayList<h> m0;
    private ArrayList<h> n0;
    private ArrayList<h> o0;
    private CopyOnWriteArrayList<e> p0;
    private int q0;
    private long r0;
    private float s0;
    private int t0;
    private float u0;
    boolean v0;
    protected boolean w0;
    float x0;
    private a.e.a.k.a.c y0;
    private boolean z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.A0.a();
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f401a;

        static {
            int[] iArr = new int[f.values().length];
            f401a = iArr;
            try {
                iArr[f.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f401a[f.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f401a[f.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f401a[f.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int[] f402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float[] f403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Paint f404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Paint f407f;
        Paint g;
        private float[] h;
        DashPathEffect n;
        int q;
        final int i = -21965;
        final int j = -2067046;
        final int k = -13391360;
        final int l = 1996488704;
        final int m = 10;
        Rect o = new Rect();
        boolean p = false;

        public c() {
            this.q = 1;
            Paint paint = new Paint();
            this.f404c = paint;
            paint.setAntiAlias(true);
            this.f404c.setColor(-21965);
            this.f404c.setStrokeWidth(2.0f);
            this.f404c.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f405d = paint2;
            paint2.setAntiAlias(true);
            this.f405d.setColor(-2067046);
            this.f405d.setStrokeWidth(2.0f);
            this.f405d.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f406e = paint3;
            paint3.setAntiAlias(true);
            this.f406e.setColor(-13391360);
            this.f406e.setStrokeWidth(2.0f);
            this.f406e.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f407f = paint4;
            paint4.setAntiAlias(true);
            this.f407f.setColor(-13391360);
            this.f407f.setTextSize(j.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.h = new float[8];
            Paint paint5 = new Paint();
            this.g = paint5;
            paint5.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.n = dashPathEffect;
            this.f406e.setPathEffect(dashPathEffect);
            this.f403b = new float[100];
            this.f402a = new int[50];
            if (this.p) {
                this.f404c.setStrokeWidth(8.0f);
                this.g.setStrokeWidth(8.0f);
                this.f405d.setStrokeWidth(8.0f);
                this.q = 4;
            }
        }
    }

    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f408a = Float.NaN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f409b = Float.NaN;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f410c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f411d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final String f412e = "motion.progress";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final String f413f = "motion.velocity";
        final String g = "motion.StartState";
        final String h = "motion.EndState";

        d() {
        }

        void a() {
            int i = this.f410c;
            if (i != -1 || this.f411d != -1) {
                if (i == -1) {
                    j.this.Q(this.f411d);
                } else {
                    int i2 = this.f411d;
                    if (i2 == -1) {
                        j.this.N(i, -1, -1);
                    } else {
                        j.this.O(i, i2);
                    }
                }
                j.this.setState(f.SETUP);
            }
            if (Float.isNaN(this.f409b)) {
                if (Float.isNaN(this.f408a)) {
                    return;
                }
                j.this.setProgress(this.f408a);
            } else {
                j.this.M(this.f408a, this.f409b);
                this.f408a = Float.NaN;
                this.f409b = Float.NaN;
                this.f410c = -1;
                this.f411d = -1;
            }
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f408a);
            bundle.putFloat("motion.velocity", this.f409b);
            bundle.putInt("motion.StartState", this.f410c);
            bundle.putInt("motion.EndState", this.f411d);
            return bundle;
        }

        public void c() {
            this.f411d = j.this.G;
            this.f410c = j.this.E;
            this.f409b = j.this.getVelocity();
            this.f408a = j.this.getProgress();
        }

        public void d(int i) {
            this.f411d = i;
        }

        public void e(float f2) {
            this.f408a = f2;
        }

        public void f(int i) {
            this.f410c = i;
        }

        public void g(Bundle bundle) {
            this.f408a = bundle.getFloat("motion.progress");
            this.f409b = bundle.getFloat("motion.velocity");
            this.f410c = bundle.getInt("motion.StartState");
            this.f411d = bundle.getInt("motion.EndState");
        }

        public void h(float f2) {
            this.f409b = f2;
        }
    }

    public interface e {
        void a(j jVar, int i, int i2);

        void b(j jVar, int i, int i2, float f2);

        void c(j jVar, int i);
    }

    enum f {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void G() {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        if ((this.T == null && ((copyOnWriteArrayList = this.p0) == null || copyOnWriteArrayList.isEmpty())) || this.u0 == this.N) {
            return;
        }
        if (this.t0 != -1) {
            e eVar = this.T;
            if (eVar != null) {
                eVar.a(this, this.E, this.G);
            }
            CopyOnWriteArrayList<e> copyOnWriteArrayList2 = this.p0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<e> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.E, this.G);
                }
            }
            this.v0 = true;
        }
        this.t0 = -1;
        float f2 = this.N;
        this.u0 = f2;
        e eVar2 = this.T;
        if (eVar2 != null) {
            eVar2.b(this, this.E, this.G, f2);
        }
        CopyOnWriteArrayList<e> copyOnWriteArrayList3 = this.p0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<e> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().b(this, this.E, this.G, this.N);
            }
        }
        this.v0 = true;
    }

    private void K() {
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        if (this.T == null && ((copyOnWriteArrayList = this.p0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.v0 = false;
        for (Integer num : this.I0) {
            e eVar = this.T;
            if (eVar != null) {
                eVar.c(this, num.intValue());
            }
            CopyOnWriteArrayList<e> copyOnWriteArrayList2 = this.p0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<e> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().c(this, num.intValue());
                }
            }
        }
        this.I0.clear();
    }

    void E(float f2) {
        if (this.A == null) {
            return;
        }
        float f3 = this.O;
        float f4 = this.N;
        if (f3 != f4 && this.R) {
            this.O = f4;
        }
        if (this.O == f2) {
            return;
        }
        this.W = false;
        this.Q = f2;
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:159:0x021b A[PHI: r2
      0x021b: PHI (r2v3 int) = (r2v1 int), (r2v4 int) binds: [B:164:0x0228, B:157:0x0218] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r23v0, types: [a.e.b.b.j, android.view.ViewGroup] */
    void F(boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        float interpolation;
        boolean z6;
        boolean z7;
        int i2;
        if (this.P == -1) {
            this.P = getNanoTime();
        }
        float f2 = this.O;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.F = -1;
        }
        if (this.l0 || (this.S && (z2 || this.Q != f2))) {
            float fSignum = Math.signum(this.Q - f2);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.B;
            float f3 = !(interpolator instanceof i) ? (((nanoTime - this.P) * fSignum) * 1.0E-9f) / this.M : 0.0f;
            float f4 = this.O + f3;
            if (this.R) {
                f4 = this.Q;
            }
            if ((fSignum <= 0.0f || f4 < this.Q) && (fSignum > 0.0f || f4 > this.Q)) {
                z3 = false;
            } else {
                f4 = this.Q;
                this.S = false;
                z3 = true;
            }
            this.O = f4;
            this.N = f4;
            this.P = nanoTime;
            if (interpolator == null || z3) {
                this.D = f3;
            } else {
                if (this.W) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.L) * 1.0E-9f);
                    Interpolator interpolator2 = this.B;
                    if (interpolator2 == this.a0) {
                        throw null;
                    }
                    this.O = interpolation;
                    this.P = nanoTime;
                    if (interpolator2 instanceof i) {
                        float fA = ((i) interpolator2).a();
                        this.D = fA;
                        int i3 = ((Math.abs(fA) * this.M) > 1.0E-5f ? 1 : ((Math.abs(fA) * this.M) == 1.0E-5f ? 0 : -1));
                        if (fA <= 0.0f || interpolation < 1.0f) {
                            z6 = false;
                        } else {
                            this.O = 1.0f;
                            z6 = false;
                            this.S = false;
                            interpolation = 1.0f;
                        }
                        if (fA < 0.0f && interpolation <= 0.0f) {
                            this.O = 0.0f;
                            this.S = z6;
                            f4 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f4);
                    Interpolator interpolator3 = this.B;
                    this.D = interpolator3 instanceof i ? ((i) interpolator3).a() : ((interpolator3.getInterpolation(f4 + f3) - interpolation) * fSignum) / f3;
                }
                f4 = interpolation;
            }
            if (Math.abs(this.D) > 1.0E-5f) {
                setState(f.MOVING);
            }
            if ((fSignum > 0.0f && f4 >= this.Q) || (fSignum <= 0.0f && f4 <= this.Q)) {
                f4 = this.Q;
                this.S = false;
            }
            if (f4 >= 1.0f || f4 <= 0.0f) {
                z4 = false;
                this.S = false;
                setState(f.FINISHED);
            } else {
                z4 = false;
            }
            int childCount = getChildCount();
            this.l0 = z4;
            long nanoTime2 = getNanoTime();
            this.x0 = f4;
            Interpolator interpolator4 = this.C;
            float interpolation2 = interpolator4 == null ? f4 : interpolator4.getInterpolation(f4);
            Interpolator interpolator5 = this.C;
            if (interpolator5 != null) {
                float interpolation3 = interpolator5.getInterpolation((fSignum / this.M) + f4);
                this.D = interpolation3;
                this.D = interpolation3 - this.C.getInterpolation(f4);
            }
            for (?? r10 = z4; r10 < childCount; r10++) {
                View childAt = getChildAt(r10);
                g gVar = this.K.get(childAt);
                if (gVar != null) {
                    this.l0 = gVar.c(childAt, interpolation2, nanoTime2, this.y0) | this.l0;
                }
            }
            boolean z8 = (fSignum > 0.0f && f4 >= this.Q) || (fSignum <= 0.0f && f4 <= this.Q);
            if (!this.l0 && !this.S && z8) {
                setState(f.FINISHED);
            }
            if (this.w0) {
                requestLayout();
            }
            z5 = true;
            boolean z9 = this.l0 | (!z8);
            this.l0 = z9;
            if (f4 <= 0.0f && (i = this.E) != -1 && this.F != i) {
                this.F = i;
                throw null;
            }
            if (f4 >= 1.0d) {
                int i4 = this.F;
                int i5 = this.G;
                if (i4 != i5) {
                    this.F = i5;
                    throw null;
                }
            }
            if (z9 || this.S) {
                invalidate();
            } else if ((fSignum > 0.0f && f4 == 1.0f) || (fSignum < 0.0f && f4 == 0.0f)) {
                setState(f.FINISHED);
            }
            if (!this.l0 && !this.S && ((fSignum > 0.0f && f4 == 1.0f) || (fSignum < 0.0f && f4 == 0.0f))) {
                J();
            }
        } else {
            z5 = true;
        }
        float f5 = this.O;
        if (f5 >= 1.0f) {
            int i6 = this.F;
            i2 = this.G;
            if (i6 == i2) {
                z5 = false;
            }
            this.F = i2;
            z7 = z5;
        } else if (f5 <= 0.0f) {
            int i7 = this.F;
            i2 = this.E;
            if (i7 == i2) {
                z5 = false;
            }
            this.F = i2;
            z7 = z5;
        } else {
            z7 = false;
        }
        this.H0 |= z7;
        if (z7 && !this.z0) {
            requestLayout();
        }
        this.N = this.O;
    }

    protected void H() {
        int iIntValue;
        CopyOnWriteArrayList<e> copyOnWriteArrayList;
        if ((this.T != null || ((copyOnWriteArrayList = this.p0) != null && !copyOnWriteArrayList.isEmpty())) && this.t0 == -1) {
            this.t0 = this.F;
            if (this.I0.isEmpty()) {
                iIntValue = -1;
            } else {
                ArrayList<Integer> arrayList = this.I0;
                iIntValue = arrayList.get(arrayList.size() - 1).intValue();
            }
            int i = this.F;
            if (iIntValue != i && i != -1) {
                this.I0.add(Integer.valueOf(i));
            }
        }
        K();
        Runnable runnable = this.B0;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.C0;
        if (iArr == null || this.D0 <= 0) {
            return;
        }
        Q(iArr[0]);
        int[] iArr2 = this.C0;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.D0--;
    }

    public l.a I(int i) {
        throw null;
    }

    void J() {
        if (this.A != null) {
            throw null;
        }
    }

    public void L() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public void M(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.A0 == null) {
                this.A0 = new d();
            }
            this.A0.e(f2);
            this.A0.h(f3);
            return;
        }
        setProgress(f2);
        setState(f.MOVING);
        this.D = f3;
        float f4 = 0.0f;
        if (f3 != 0.0f) {
            if (f3 > 0.0f) {
                f4 = 1.0f;
            }
        } else {
            if (f2 == 0.0f || f2 == 1.0f) {
                return;
            }
            if (f2 > 0.5f) {
                f4 = 1.0f;
            }
        }
        E(f4);
    }

    public void N(int i, int i2, int i3) {
        setState(f.SETUP);
        this.F = i;
        this.E = -1;
        this.G = -1;
        androidx.constraintlayout.widget.c cVar = this.m;
        if (cVar != null) {
            cVar.d(i, i2, i3);
        } else if (this.A != null) {
            throw null;
        }
    }

    public void O(int i, int i2) {
        if (isAttachedToWindow()) {
            if (this.A == null) {
                return;
            }
            this.E = i;
            this.G = i2;
            throw null;
        }
        if (this.A0 == null) {
            this.A0 = new d();
        }
        this.A0.f(i);
        this.A0.d(i2);
    }

    public void P() {
        E(1.0f);
        this.B0 = null;
    }

    public void Q(int i) {
        if (isAttachedToWindow()) {
            R(i, -1, -1);
            return;
        }
        if (this.A0 == null) {
            this.A0 = new d();
        }
        this.A0.d(i);
    }

    public void R(int i, int i2, int i3) {
        S(i, i2, i3, -1);
    }

    public void S(int i, int i2, int i3, int i4) {
        if (this.A != null) {
            throw null;
        }
        int i5 = this.F;
        if (i5 == i) {
            return;
        }
        if (this.E == i) {
            E(0.0f);
            if (i4 > 0) {
                this.M = i4 / 1000.0f;
                return;
            }
            return;
        }
        if (this.G == i) {
            E(1.0f);
            if (i4 > 0) {
                this.M = i4 / 1000.0f;
                return;
            }
            return;
        }
        this.G = i;
        if (i5 != -1) {
            O(i5, i);
            E(1.0f);
            this.O = 0.0f;
            P();
            if (i4 > 0) {
                this.M = i4 / 1000.0f;
                return;
            }
            return;
        }
        this.W = false;
        this.Q = 1.0f;
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = getNanoTime();
        this.L = getNanoTime();
        this.R = false;
        this.B = null;
        if (i4 == -1) {
            throw null;
        }
        this.E = -1;
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.o0;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().x(canvas);
            }
        }
        F(false);
        if (this.A != null) {
            throw null;
        }
        super.dispatchDraw(canvas);
        if (this.A == null) {
            return;
        }
        if ((this.U & 1) == 1 && !isInEditMode()) {
            this.q0++;
            long nanoTime = getNanoTime();
            long j = this.r0;
            if (j != -1) {
                long j2 = nanoTime - j;
                if (j2 > 200000000) {
                    this.s0 = ((int) ((this.q0 / (j2 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.q0 = 0;
                    this.r0 = nanoTime;
                }
            } else {
                this.r0 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            String str = this.s0 + " fps " + a.e.b.b.a.c(this, this.E) + " -> ";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(a.e.b.b.a.c(this, this.G));
            sb.append(" (progress: ");
            sb.append(progress);
            sb.append(" ) state=");
            int i = this.F;
            sb.append(i == -1 ? "undefined" : a.e.b.b.a.c(this, i));
            String string = sb.toString();
            paint.setColor(-16777216);
            canvas.drawText(string, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(string, 10.0f, getHeight() - 30, paint);
        }
        if (this.U > 1) {
            if (this.V != null) {
                throw null;
            }
            this.V = new c();
            throw null;
        }
        ArrayList<h> arrayList2 = this.o0;
        if (arrayList2 != null) {
            Iterator<h> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                it2.next().w(canvas);
            }
        }
    }

    public int[] getConstraintSetIds() {
        if (this.A == null) {
            return null;
        }
        throw null;
    }

    public int getCurrentState() {
        return this.F;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        if (this.A == null) {
            return null;
        }
        throw null;
    }

    public a.e.b.b.b getDesignTool() {
        if (this.b0 == null) {
            this.b0 = new a.e.b.b.b(this);
        }
        return this.b0;
    }

    public int getEndState() {
        return this.G;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.O;
    }

    public l getScene() {
        return this.A;
    }

    public int getStartState() {
        return this.E;
    }

    public float getTargetPosition() {
        return this.Q;
    }

    public Bundle getTransitionState() {
        if (this.A0 == null) {
            this.A0 = new d();
        }
        this.A0.c();
        return this.A0.b();
    }

    public long getTransitionTimeMs() {
        if (this.A == null) {
            return (long) (this.M * 1000.0f);
        }
        throw null;
    }

    public float getVelocity() {
        return this.D;
    }

    @Override // a.g.l.m
    public void h(View view, View view2, int i, int i2) {
        this.j0 = getNanoTime();
        this.k0 = 0.0f;
        this.h0 = 0.0f;
        this.i0 = 0.0f;
    }

    @Override // a.g.l.m
    public void i(View view, int i) {
        if (this.A != null && this.k0 != 0.0f) {
            throw null;
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return getWindowToken() != null;
    }

    @Override // a.g.l.m
    public void j(View view, int i, int i2, int[] iArr, int i3) {
        if (this.A != null) {
            throw null;
        }
    }

    @Override // a.g.l.n
    public void m(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.g0 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.g0 = false;
    }

    @Override // a.g.l.m
    public void n(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // a.g.l.m
    public boolean o(View view, View view2, int i, int i2) {
        if (this.A == null) {
            return false;
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Display display;
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 17 && (display = getDisplay()) != null) {
            this.E0 = display.getRotation();
        }
        if (this.A != null && this.F != -1) {
            throw null;
        }
        J();
        d dVar = this.A0;
        if (dVar == null) {
            if (this.A != null) {
                throw null;
            }
        } else if (this.F0) {
            post(new a());
        } else {
            dVar.a();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A == null || !this.J) {
            return false;
        }
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        this.z0 = true;
        try {
            if (this.A == null) {
                super.onLayout(z2, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.e0 != i5 || this.f0 != i6) {
                L();
                F(true);
            }
            this.e0 = i5;
            this.f0 = i6;
            this.c0 = i5;
            this.d0 = i6;
        } finally {
            this.z0 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.A == null) {
            super.onMeasure(i, i2);
            return;
        }
        if (this.H == i) {
            int i3 = this.I;
        }
        if (this.H0) {
            this.H0 = false;
            J();
            K();
        }
        boolean z2 = this.j;
        this.H = i;
        this.I = i2;
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.g.l.o
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, a.g.l.o
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (this.A == null) {
            return;
        }
        r();
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.A == null || !this.J) {
            return super.onTouchEvent(motionEvent);
        }
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.p0 == null) {
                this.p0 = new CopyOnWriteArrayList<>();
            }
            this.p0.add(hVar);
            if (hVar.v()) {
                if (this.m0 == null) {
                    this.m0 = new ArrayList<>();
                }
                this.m0.add(hVar);
            }
            if (hVar.u()) {
                if (this.n0 == null) {
                    this.n0 = new ArrayList<>();
                }
                this.n0.add(hVar);
            }
            if (hVar.t()) {
                if (this.o0 == null) {
                    this.o0 = new ArrayList<>();
                }
                this.o0.add(hVar);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.m0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.n0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.w0 && this.F == -1 && this.A != null) {
            throw null;
        }
        super.requestLayout();
    }

    public void setDebugMode(int i) {
        this.U = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z2) {
        this.F0 = z2;
    }

    public void setInteractionEnabled(boolean z2) {
        this.J = z2;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.A == null) {
            setProgress(f2);
        } else {
            setState(f.MOVING);
            throw null;
        }
    }

    public void setOnHide(float f2) {
        ArrayList<h> arrayList = this.n0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.n0.get(i).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<h> arrayList = this.m0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.m0.get(i).setProgress(f2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r5.O == 0.0f) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r0 = a.e.b.b.j.f.f417e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r5.O == 1.0f) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setProgress(float r6) {
        /*
            r5 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto Lb
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L12
        Lb:
            java.lang.String r3 = "MotionLayout"
            java.lang.String r4 = "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"
            android.util.Log.w(r3, r4)
        L12:
            boolean r3 = r5.isAttachedToWindow()
            if (r3 != 0) goto L29
            a.e.b.b.j$d r0 = r5.A0
            if (r0 != 0) goto L23
            a.e.b.b.j$d r0 = new a.e.b.b.j$d
            r0.<init>()
            r5.A0 = r0
        L23:
            a.e.b.b.j$d r5 = r5.A0
            r5.e(r6)
            return
        L29:
            if (r1 > 0) goto L49
            float r1 = r5.O
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L3c
            int r1 = r5.F
            int r2 = r5.G
            if (r1 != r2) goto L3c
            a.e.b.b.j$f r1 = a.e.b.b.j.f.MOVING
            r5.setState(r1)
        L3c:
            int r1 = r5.E
            r5.F = r1
            float r1 = r5.O
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L71
        L46:
            a.e.b.b.j$f r0 = a.e.b.b.j.f.FINISHED
            goto L6e
        L49:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 < 0) goto L69
            float r1 = r5.O
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L5e
            int r0 = r5.F
            int r1 = r5.E
            if (r0 != r1) goto L5e
            a.e.b.b.j$f r0 = a.e.b.b.j.f.MOVING
            r5.setState(r0)
        L5e:
            int r0 = r5.G
            r5.F = r0
            float r0 = r5.O
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L71
            goto L46
        L69:
            r0 = -1
            r5.F = r0
            a.e.b.b.j$f r0 = a.e.b.b.j.f.MOVING
        L6e:
            r5.setState(r0)
        L71:
            a.e.b.b.l r0 = r5.A
            if (r0 != 0) goto L76
            return
        L76:
            r0 = 1
            r5.R = r0
            r5.Q = r6
            r5.N = r6
            r1 = -1
            r5.P = r1
            r5.L = r1
            r6 = 0
            r5.B = r6
            r5.S = r0
            r5.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.b.b.j.setProgress(float):void");
    }

    public void setScene(l lVar) {
        r();
        throw null;
    }

    void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.F = i;
            return;
        }
        if (this.A0 == null) {
            this.A0 = new d();
        }
        this.A0.f(i);
        this.A0.d(i);
    }

    void setState(f fVar) {
        f fVar2 = f.FINISHED;
        if (fVar == fVar2 && this.F == -1) {
            return;
        }
        f fVar3 = this.G0;
        this.G0 = fVar;
        f fVar4 = f.MOVING;
        if (fVar3 == fVar4 && fVar == fVar4) {
            G();
        }
        int i = b.f401a[fVar3.ordinal()];
        if (i == 1 || i == 2) {
            if (fVar == fVar4) {
                G();
            }
            if (fVar != fVar2) {
                return;
            }
        } else if (i != 3 || fVar != fVar2) {
            return;
        }
        H();
    }

    public void setTransition(int i) {
        if (this.A == null) {
            return;
        }
        I(i);
        throw null;
    }

    protected void setTransition(l.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i) {
        if (this.A != null) {
            throw null;
        }
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(e eVar) {
        this.T = eVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.A0 == null) {
            this.A0 = new d();
        }
        this.A0.g(bundle);
        if (isAttachedToWindow()) {
            this.A0.a();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void t(int i) {
        this.m = null;
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return a.e.b.b.a.a(context, this.E) + "->" + a.e.b.b.a.a(context, this.G) + " (pos:" + this.O + " Dpos/Dt:" + this.D;
    }
}
