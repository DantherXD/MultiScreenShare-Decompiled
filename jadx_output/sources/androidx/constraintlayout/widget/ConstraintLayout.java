package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static j f1560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    SparseArray<View> f1561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<androidx.constraintlayout.widget.b> f1562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected a.e.a.m.f f1563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1564f;
    private int g;
    private int h;
    private int i;
    protected boolean j;
    private int k;
    private d l;
    protected androidx.constraintlayout.widget.c m;
    private int n;
    private HashMap<String, Integer> o;
    private int p;
    private int q;
    int r;
    int s;
    int t;
    int u;
    private SparseArray<a.e.a.m.e> v;
    c w;
    private int x;
    private int y;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1565a;

        static {
            int[] iArr = new int[a.e.a.m.e.b.values().length];
            f1565a = iArr;
            try {
                iArr[a.e.a.m.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1565a[a.e.a.m.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1565a[a.e.a.m.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1565a[a.e.a.m.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public int A;
        public int B;
        public int C;
        public int D;
        boolean E;
        boolean F;
        public float G;
        public float H;
        public String I;
        float J;
        int K;
        public float L;
        public float M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public int U;
        public float V;
        public float W;
        public int X;
        public int Y;
        public int Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1566a;
        public boolean a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1567b;
        public boolean b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1568c;
        public String c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1569d;
        public int d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1570e;
        boolean e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1571f;
        boolean f0;
        public int g;
        boolean g0;
        public int h;
        boolean h0;
        public int i;
        boolean i0;
        public int j;
        boolean j0;
        public int k;
        boolean k0;
        public int l;
        int l0;
        public int m;
        int m0;
        public int n;
        int n0;
        public int o;
        int o0;
        public int p;
        int p0;
        public int q;
        int q0;
        public float r;
        float r0;
        public int s;
        int s0;
        public int t;
        int t0;
        public int u;
        float u0;
        public int v;
        a.e.a.m.e v0;
        public int w;
        public boolean w0;
        public int x;
        public int y;
        public int z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f1572a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1572a = sparseIntArray;
                sparseIntArray.append(i.s2, 64);
                sparseIntArray.append(i.V1, 65);
                sparseIntArray.append(i.e2, 8);
                sparseIntArray.append(i.f2, 9);
                sparseIntArray.append(i.h2, 10);
                sparseIntArray.append(i.i2, 11);
                sparseIntArray.append(i.o2, 12);
                sparseIntArray.append(i.n2, 13);
                sparseIntArray.append(i.L1, 14);
                sparseIntArray.append(i.K1, 15);
                sparseIntArray.append(i.G1, 16);
                sparseIntArray.append(i.I1, 52);
                sparseIntArray.append(i.H1, 53);
                sparseIntArray.append(i.M1, 2);
                sparseIntArray.append(i.O1, 3);
                sparseIntArray.append(i.N1, 4);
                sparseIntArray.append(i.x2, 49);
                sparseIntArray.append(i.y2, 50);
                sparseIntArray.append(i.S1, 5);
                sparseIntArray.append(i.T1, 6);
                sparseIntArray.append(i.U1, 7);
                sparseIntArray.append(i.B1, 67);
                sparseIntArray.append(i.o1, 1);
                sparseIntArray.append(i.j2, 17);
                sparseIntArray.append(i.k2, 18);
                sparseIntArray.append(i.R1, 19);
                sparseIntArray.append(i.Q1, 20);
                sparseIntArray.append(i.C2, 21);
                sparseIntArray.append(i.F2, 22);
                sparseIntArray.append(i.D2, 23);
                sparseIntArray.append(i.A2, 24);
                sparseIntArray.append(i.E2, 25);
                sparseIntArray.append(i.B2, 26);
                sparseIntArray.append(i.z2, 55);
                sparseIntArray.append(i.G2, 54);
                sparseIntArray.append(i.a2, 29);
                sparseIntArray.append(i.p2, 30);
                sparseIntArray.append(i.P1, 44);
                sparseIntArray.append(i.c2, 45);
                sparseIntArray.append(i.r2, 46);
                sparseIntArray.append(i.b2, 47);
                sparseIntArray.append(i.q2, 48);
                sparseIntArray.append(i.E1, 27);
                sparseIntArray.append(i.D1, 28);
                sparseIntArray.append(i.t2, 31);
                sparseIntArray.append(i.W1, 32);
                sparseIntArray.append(i.v2, 33);
                sparseIntArray.append(i.u2, 34);
                sparseIntArray.append(i.w2, 35);
                sparseIntArray.append(i.Y1, 36);
                SparseIntArray sparseIntArray2 = f1572a;
                sparseIntArray2.append(i.X1, 37);
                sparseIntArray2.append(i.Z1, 38);
                sparseIntArray2.append(i.d2, 39);
                sparseIntArray2.append(i.m2, 40);
                sparseIntArray2.append(i.g2, 41);
                sparseIntArray2.append(i.J1, 42);
                sparseIntArray2.append(i.F1, 43);
                sparseIntArray2.append(i.l2, 51);
                sparseIntArray2.append(i.I2, 66);
            }
        }

        public b(int i, int i2) {
            super(i, i2);
            this.f1566a = -1;
            this.f1567b = -1;
            this.f1568c = -1.0f;
            this.f1569d = true;
            this.f1570e = -1;
            this.f1571f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new a.e.a.m.e();
            this.w0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            String str;
            super(context, attributeSet);
            this.f1566a = -1;
            this.f1567b = -1;
            this.f1568c = -1.0f;
            this.f1569d = true;
            this.f1570e = -1;
            this.f1571f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new a.e.a.m.e();
            this.w0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = a.f1572a.get(index);
                switch (i2) {
                    case 1:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId;
                        if (resourceId == -1) {
                            this.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 3:
                        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        continue;
                        break;
                    case 4:
                        float f2 = typedArrayObtainStyledAttributes.getFloat(index, this.r) % 360.0f;
                        this.r = f2;
                        if (f2 < 0.0f) {
                            this.r = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                        break;
                    case 5:
                        this.f1566a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1566a);
                        continue;
                        break;
                    case 6:
                        this.f1567b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1567b);
                        continue;
                        break;
                    case 7:
                        this.f1568c = typedArrayObtainStyledAttributes.getFloat(index, this.f1568c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1570e);
                        this.f1570e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1570e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f1571f);
                        this.f1571f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1571f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.g);
                        this.g = resourceId4;
                        if (resourceId4 == -1) {
                            this.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.h);
                        this.h = resourceId5;
                        if (resourceId5 == -1) {
                            this.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.i);
                        this.i = resourceId6;
                        if (resourceId6 == -1) {
                            this.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.l);
                        this.l = resourceId9;
                        if (resourceId9 == -1) {
                            this.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.m);
                        this.m = resourceId10;
                        if (resourceId10 == -1) {
                            this.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
                        this.s = resourceId11;
                        if (resourceId11 == -1) {
                            this.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.t);
                        this.t = resourceId12;
                        if (resourceId12 == -1) {
                            this.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
                        this.u = resourceId13;
                        if (resourceId13 == -1) {
                            this.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.v);
                        this.v = resourceId14;
                        if (resourceId14 == -1) {
                            this.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                        break;
                    case 21:
                        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        continue;
                        break;
                    case 22:
                        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.x);
                        continue;
                        break;
                    case 23:
                        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.y);
                        continue;
                        break;
                    case 24:
                        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.z);
                        continue;
                        break;
                    case 25:
                        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.A);
                        continue;
                        break;
                    case 26:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                        continue;
                        break;
                    case 27:
                        this.a0 = typedArrayObtainStyledAttributes.getBoolean(index, this.a0);
                        continue;
                        break;
                    case 28:
                        this.b0 = typedArrayObtainStyledAttributes.getBoolean(index, this.b0);
                        continue;
                        break;
                    case 29:
                        this.G = typedArrayObtainStyledAttributes.getFloat(index, this.G);
                        continue;
                        break;
                    case 30:
                        this.H = typedArrayObtainStyledAttributes.getFloat(index, this.H);
                        continue;
                        break;
                    case 31:
                        int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.P = i3;
                        if (i3 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                        break;
                    case 32:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.Q = i4;
                        if (i4 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                        break;
                    case 33:
                        try {
                            this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        break;
                    case 35:
                        this.V = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.V));
                        this.P = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.U) == -2) {
                                this.U = -2;
                            }
                        }
                        break;
                    case 38:
                        this.W = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.W));
                        this.Q = 2;
                        continue;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                d.r(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.L = typedArrayObtainStyledAttributes.getFloat(index, this.L);
                                break;
                            case 46:
                                this.M = typedArrayObtainStyledAttributes.getFloat(index, this.M);
                                break;
                            case 47:
                                this.N = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.O = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.X = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.X);
                                break;
                            case 50:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.Y);
                                break;
                            case 51:
                                this.c0 = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.n);
                                this.n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.o);
                                this.o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 55:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        d.p(this, typedArrayObtainStyledAttributes, index, 0);
                                        this.E = true;
                                        break;
                                    case 65:
                                        d.p(this, typedArrayObtainStyledAttributes, index, 1);
                                        this.F = true;
                                        break;
                                    case 66:
                                        this.d0 = typedArrayObtainStyledAttributes.getInt(index, this.d0);
                                        break;
                                    case 67:
                                        this.f1569d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1569d);
                                        continue;
                                }
                                break;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1566a = -1;
            this.f1567b = -1;
            this.f1568c = -1.0f;
            this.f1569d = true;
            this.f1570e = -1;
            this.f1571f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = 0.0f;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = Integer.MIN_VALUE;
            this.D = 0;
            this.E = true;
            this.F = true;
            this.G = 0.5f;
            this.H = 0.5f;
            this.I = null;
            this.J = 0.0f;
            this.K = 1;
            this.L = -1.0f;
            this.M = -1.0f;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 0;
            this.V = 1.0f;
            this.W = 1.0f;
            this.X = -1;
            this.Y = -1;
            this.Z = -1;
            this.a0 = false;
            this.b0 = false;
            this.c0 = null;
            this.d0 = 0;
            this.e0 = true;
            this.f0 = true;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = false;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = -1;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = Integer.MIN_VALUE;
            this.r0 = 0.5f;
            this.v0 = new a.e.a.m.e();
            this.w0 = false;
        }

        public void a() {
            this.h0 = false;
            this.e0 = true;
            this.f0 = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.b0) {
                this.f0 = false;
                if (this.Q == 0) {
                    this.Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.e0 = false;
                if (i == 0 && this.P == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f0 = false;
                if (i2 == 0 && this.Q == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.b0 = true;
                }
            }
            if (this.f1568c == -1.0f && this.f1566a == -1 && this.f1567b == -1) {
                return;
            }
            this.h0 = true;
            this.e0 = true;
            this.f0 = true;
            if (!(this.v0 instanceof a.e.a.m.g)) {
                this.v0 = new a.e.a.m.g();
            }
            ((a.e.a.m.g) this.v0).x1(this.Z);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0054  */
        /* JADX WARN: Code duplicated, block: B:22:0x005b  */
        /* JADX WARN: Code duplicated, block: B:25:0x0062  */
        /* JADX WARN: Code duplicated, block: B:28:0x0068  */
        /* JADX WARN: Code duplicated, block: B:31:0x006e  */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008e  */
        /* JADX WARN: Code duplicated, block: B:44:0x0095 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:45:0x0097  */
        /* JADX WARN: Code duplicated, block: B:77:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            boolean z2 = false;
            if (Build.VERSION.SDK_INT >= 17) {
                super.resolveLayoutDirection(i);
                if (1 == getLayoutDirection()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.n0 = -1;
            this.o0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.p0 = -1;
            this.q0 = -1;
            this.p0 = this.w;
            this.q0 = this.y;
            float f2 = this.G;
            this.r0 = f2;
            int i8 = this.f1566a;
            this.s0 = i8;
            int i9 = this.f1567b;
            this.t0 = i9;
            float f3 = this.f1568c;
            this.u0 = f3;
            if (z) {
                int i10 = this.s;
                if (i10 != -1) {
                    this.n0 = i10;
                } else {
                    int i11 = this.t;
                    if (i11 != -1) {
                        this.o0 = i11;
                    } else {
                        i2 = this.u;
                        if (i2 != -1) {
                            this.m0 = i2;
                            z2 = true;
                        }
                        i3 = this.v;
                        if (i3 != -1) {
                            this.l0 = i3;
                            z2 = true;
                        }
                        i4 = this.A;
                        if (i4 != Integer.MIN_VALUE) {
                            this.q0 = i4;
                        }
                        i5 = this.B;
                        if (i5 != Integer.MIN_VALUE) {
                            this.p0 = i5;
                        }
                        if (z2) {
                            this.r0 = 1.0f - f2;
                        }
                        if (this.h0 && this.Z == 1 && this.f1569d) {
                            if (f3 != -1.0f) {
                                this.u0 = 1.0f - f3;
                                this.s0 = -1;
                                this.t0 = -1;
                            } else {
                                if (i8 != -1) {
                                    this.t0 = i8;
                                    this.s0 = -1;
                                } else if (i9 != -1) {
                                    this.s0 = i9;
                                    this.t0 = -1;
                                }
                                this.u0 = -1.0f;
                            }
                        }
                    }
                }
                z2 = true;
                i2 = this.u;
                if (i2 != -1) {
                    this.m0 = i2;
                    z2 = true;
                }
                i3 = this.v;
                if (i3 != -1) {
                    this.l0 = i3;
                    z2 = true;
                }
                i4 = this.A;
                if (i4 != Integer.MIN_VALUE) {
                    this.q0 = i4;
                }
                i5 = this.B;
                if (i5 != Integer.MIN_VALUE) {
                    this.p0 = i5;
                }
                if (z2) {
                    this.r0 = 1.0f - f2;
                }
                if (this.h0) {
                    if (f3 != -1.0f) {
                        this.u0 = 1.0f - f3;
                        this.s0 = -1;
                        this.t0 = -1;
                    } else {
                        if (i8 != -1) {
                            this.t0 = i8;
                            this.s0 = -1;
                        } else if (i9 != -1) {
                            this.s0 = i9;
                            this.t0 = -1;
                        }
                        this.u0 = -1.0f;
                    }
                }
            } else {
                int i12 = this.s;
                if (i12 != -1) {
                    this.m0 = i12;
                }
                int i13 = this.t;
                if (i13 != -1) {
                    this.l0 = i13;
                }
                int i14 = this.u;
                if (i14 != -1) {
                    this.n0 = i14;
                }
                int i15 = this.v;
                if (i15 != -1) {
                    this.o0 = i15;
                }
                int i16 = this.A;
                if (i16 != Integer.MIN_VALUE) {
                    this.p0 = i16;
                }
                int i17 = this.B;
                if (i17 != Integer.MIN_VALUE) {
                    this.q0 = i17;
                }
            }
            if (this.u == -1 && this.v == -1 && this.t == -1 && this.s == -1) {
                int i18 = this.g;
                if (i18 != -1) {
                    this.n0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.h;
                    if (i19 != -1) {
                        this.o0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f1570e;
                if (i20 != -1) {
                    this.l0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                } else {
                    int i21 = this.f1571f;
                    if (i21 == -1) {
                        return;
                    }
                    this.m0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }

    class c implements a.e.a.m.m.b.InterfaceC0006b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f1573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1577e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1578f;
        int g;

        public c(ConstraintLayout constraintLayout) {
            this.f1573a = constraintLayout;
        }

        private boolean d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // a.e.a.m.m.b.InterfaceC0006b
        public final void a() {
            int childCount = this.f1573a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1573a.getChildAt(i);
                if (childAt instanceof g) {
                    ((g) childAt).a(this.f1573a);
                }
            }
            int size = this.f1573a.f1562d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((androidx.constraintlayout.widget.b) this.f1573a.f1562d.get(i2)).p(this.f1573a);
                }
            }
        }

        @Override // a.e.a.m.m.b.InterfaceC0006b
        @SuppressLint({"WrongCall"})
        public final void b(a.e.a.m.e eVar, a.e.a.m.m.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int baseline;
            int iMax;
            int iMax2;
            int iMakeMeasureSpec3;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            if (eVar == null) {
                return;
            }
            if (eVar.T() == 8 && !eVar.h0()) {
                aVar.h = 0;
                aVar.i = 0;
                aVar.j = 0;
                return;
            }
            if (eVar.I() == null) {
                return;
            }
            a.e.a.m.e.b bVar = aVar.f329d;
            a.e.a.m.e.b bVar2 = aVar.f330e;
            int iU = aVar.f331f;
            int iV = aVar.g;
            int iS = this.f1574b + this.f1575c;
            int iZ = this.f1576d;
            View view = (View) eVar.q();
            int[] iArr = a.f1565a;
            int i6 = iArr[bVar.ordinal()];
            if (i6 == 1) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iU, 1073741824);
            } else {
                if (i6 == 2) {
                    i4 = this.f1578f;
                    i5 = -2;
                } else if (i6 == 3) {
                    i4 = this.f1578f;
                    iZ += eVar.z();
                    i5 = -1;
                } else if (i6 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f1578f, iZ, -2);
                    boolean z = eVar.x == 1;
                    int i7 = aVar.m;
                    if (i7 == a.e.a.m.m.b.a.f327b || i7 == a.e.a.m.m.b.a.f328c) {
                        if (aVar.m == a.e.a.m.m.b.a.f328c || !z || (z && (view.getMeasuredHeight() == eVar.v())) || (view instanceof g) || eVar.l0()) {
                            iU = eVar.U();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iU, 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i4, iZ, i5);
            }
            int i8 = iArr[bVar2.ordinal()];
            if (i8 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iV, 1073741824);
            } else {
                if (i8 == 2) {
                    i2 = this.g;
                    i3 = -2;
                } else if (i8 == 3) {
                    i2 = this.g;
                    iS += eVar.S();
                    i3 = -1;
                } else if (i8 != 4) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, iS, -2);
                    boolean z2 = eVar.y == 1;
                    int i9 = aVar.m;
                    if (i9 == a.e.a.m.m.b.a.f327b || i9 == a.e.a.m.m.b.a.f328c) {
                        if (aVar.m == a.e.a.m.m.b.a.f328c || !z2 || (z2 && (view.getMeasuredWidth() == eVar.U())) || (view instanceof g) || eVar.m0()) {
                            iV = eVar.v();
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iV, 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, iS, i3);
            }
            a.e.a.m.f fVar = (a.e.a.m.f) eVar.I();
            if (fVar != null && a.e.a.m.j.b(ConstraintLayout.this.k, 256) && view.getMeasuredWidth() == eVar.U() && view.getMeasuredWidth() < fVar.U() && view.getMeasuredHeight() == eVar.v() && view.getMeasuredHeight() < fVar.v() && view.getBaseline() == eVar.n() && !eVar.k0()) {
                if (d(eVar.A(), iMakeMeasureSpec, eVar.U()) && d(eVar.B(), iMakeMeasureSpec2, eVar.v())) {
                    aVar.h = eVar.U();
                    aVar.i = eVar.v();
                    aVar.j = eVar.n();
                    return;
                }
            }
            a.e.a.m.e.b bVar3 = a.e.a.m.e.b.MATCH_CONSTRAINT;
            boolean z3 = bVar == bVar3;
            boolean z4 = bVar2 == bVar3;
            a.e.a.m.e.b bVar4 = a.e.a.m.e.b.MATCH_PARENT;
            boolean z5 = bVar2 == bVar4 || bVar2 == a.e.a.m.e.b.FIXED;
            boolean z6 = bVar == bVar4 || bVar == a.e.a.m.e.b.FIXED;
            boolean z7 = z3 && eVar.e0 > 0.0f;
            boolean z8 = z4 && eVar.e0 > 0.0f;
            if (view == null) {
                return;
            }
            b bVar5 = (b) view.getLayoutParams();
            int i10 = aVar.m;
            if (i10 != a.e.a.m.m.b.a.f327b && i10 != a.e.a.m.m.b.a.f328c && z3 && eVar.x == 0 && z4 && eVar.y == 0) {
                i = -1;
                iMax2 = 0;
                baseline = 0;
                iMax = 0;
            } else {
                if ((view instanceof k) && (eVar instanceof a.e.a.m.k)) {
                    ((k) view).t((a.e.a.m.k) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                eVar.S0(iMakeMeasureSpec, iMakeMeasureSpec2);
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                int i11 = eVar.A;
                iMax = i11 > 0 ? Math.max(i11, measuredWidth) : measuredWidth;
                int i12 = eVar.B;
                if (i12 > 0) {
                    iMax = Math.min(i12, iMax);
                }
                int i13 = eVar.D;
                iMax2 = i13 > 0 ? Math.max(i13, measuredHeight) : measuredHeight;
                int i14 = eVar.E;
                if (i14 > 0) {
                    iMax2 = Math.min(i14, iMax2);
                }
                if (!a.e.a.m.j.b(ConstraintLayout.this.k, 1)) {
                    if (z7 && z5) {
                        iMax = (int) ((iMax2 * eVar.e0) + 0.5f);
                    } else if (z8 && z6) {
                        iMax2 = (int) ((iMax / eVar.e0) + 0.5f);
                    }
                }
                if (measuredWidth != iMax || measuredHeight != iMax2) {
                    if (measuredWidth != iMax) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    }
                    if (measuredHeight != iMax2) {
                        iMakeMeasureSpec3 = iMakeMeasureSpec;
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    eVar.S0(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    iMax = view.getMeasuredWidth();
                    iMax2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
                i = -1;
            }
            boolean z9 = baseline != i;
            aVar.l = (iMax == aVar.f331f && iMax2 == aVar.g) ? false : true;
            if (bVar5.g0) {
                z9 = true;
            }
            if (z9 && baseline != -1 && eVar.n() != baseline) {
                aVar.l = true;
            }
            aVar.h = iMax;
            aVar.i = iMax2;
            aVar.k = z9;
            aVar.j = baseline;
        }

        public void c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f1574b = i3;
            this.f1575c = i4;
            this.f1576d = i5;
            this.f1577e = i6;
            this.f1578f = i;
            this.g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1561c = new SparseArray<>();
        this.f1562d = new ArrayList<>(4);
        this.f1563e = new a.e.a.m.f();
        this.f1564f = 0;
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = true;
        this.k = 257;
        this.l = null;
        this.m = null;
        this.n = -1;
        this.o = new HashMap<>();
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = new SparseArray<>();
        this.w = new c(this);
        this.x = 0;
        this.y = 0;
        q(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1561c = new SparseArray<>();
        this.f1562d = new ArrayList<>(4);
        this.f1563e = new a.e.a.m.f();
        this.f1564f = 0;
        this.g = 0;
        this.h = Integer.MAX_VALUE;
        this.i = Integer.MAX_VALUE;
        this.j = true;
        this.k = 257;
        this.l = null;
        this.m = null;
        this.n = -1;
        this.o = new HashMap<>();
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = new SparseArray<>();
        this.w = new c(this);
        this.x = 0;
        this.y = 0;
        q(attributeSet, i, 0);
    }

    private boolean A() {
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            }
        }
        if (z) {
            w();
        }
        return z;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Build.VERSION.SDK_INT >= 17 ? Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd()) : 0;
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static j getSharedValues() {
        if (f1560b == null) {
            f1560b = new j();
        }
        return f1560b;
    }

    private final a.e.a.m.e k(int i) {
        if (i == 0) {
            return this.f1563e;
        }
        View viewFindViewById = this.f1561c.get(i);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f1563e;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).v0;
    }

    private void q(AttributeSet attributeSet, int i, int i2) {
        this.f1563e.y0(this);
        this.f1563e.R1(this.w);
        this.f1561c.put(getId(), this);
        this.l = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.n1, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == i.s1) {
                    this.f1564f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1564f);
                } else if (index == i.t1) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == i.q1) {
                    this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                } else if (index == i.r1) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.i);
                } else if (index == i.H2) {
                    this.k = typedArrayObtainStyledAttributes.getInt(index, this.k);
                } else if (index == i.C1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            t(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.m = null;
                        }
                    }
                } else if (index == i.y1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.l = dVar;
                        dVar.m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.l = null;
                    }
                    this.n = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1563e.S1(this.k);
    }

    private void s() {
        this.j = true;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = 0;
        this.u = 0;
    }

    private void w() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            a.e.a.m.e eVarP = p(getChildAt(i));
            if (eVarP != null) {
                eVarP.r0();
            }
        }
        if (zIsInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    x(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    k(childAt.getId()).z0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.n != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.n && (childAt2 instanceof e)) {
                    this.l = ((e) childAt2).getConstraintSet();
                }
            }
        }
        d dVar = this.l;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f1563e.r1();
        int size = this.f1562d.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f1562d.get(i4).r(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof g) {
                ((g) childAt3).b(this);
            }
        }
        this.v.clear();
        this.v.put(0, this.f1563e);
        this.v.put(getId(), this.f1563e);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.v.put(childAt4.getId(), p(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            a.e.a.m.e eVarP2 = p(childAt5);
            if (eVarP2 != null) {
                b bVar = (b) childAt5.getLayoutParams();
                this.f1563e.c(eVarP2);
                d(zIsInEditMode, childAt5, eVarP2, bVar, this.v);
            }
        }
    }

    private void z(a.e.a.m.e eVar, b bVar, SparseArray<a.e.a.m.e> sparseArray, int i, a.e.a.m.d.b bVar2) {
        View view = this.f1561c.get(i);
        a.e.a.m.e eVar2 = sparseArray.get(i);
        if (eVar2 == null || view == null || !(view.getLayoutParams() instanceof b)) {
            return;
        }
        bVar.g0 = true;
        a.e.a.m.d.b bVar3 = a.e.a.m.d.b.BASELINE;
        if (bVar2 == bVar3) {
            b bVar4 = (b) view.getLayoutParams();
            bVar4.g0 = true;
            bVar4.v0.H0(true);
        }
        eVar.m(bVar3).a(eVar2.m(bVar2), bVar.D, bVar.C, true);
        eVar.H0(true);
        eVar.m(a.e.a.m.d.b.TOP).p();
        eVar.m(a.e.a.m.d.b.BOTTOM).p();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    protected void d(boolean z, View view, a.e.a.m.e eVar, b bVar, SparseArray<a.e.a.m.e> sparseArray) {
        int i;
        float f2;
        int i2;
        int i3;
        a.e.a.m.e eVar2;
        a.e.a.m.d.b bVar2;
        a.e.a.m.d.b bVar3;
        int i4;
        a.e.a.m.e eVar3;
        a.e.a.m.d.b bVar4;
        int i5;
        a.e.a.m.d.b bVar5;
        a.e.a.m.e eVar4;
        a.e.a.m.d.b bVar6;
        a.e.a.m.d.b bVar7;
        int i6;
        int i7;
        a.e.a.m.e eVar5;
        a.e.a.m.d.b bVar8;
        int i8;
        int i9;
        a.e.a.m.d.b bVar9;
        a.e.a.m.d.b bVar10;
        float f3;
        int i10;
        bVar.a();
        bVar.w0 = false;
        eVar.g1(view.getVisibility());
        if (bVar.j0) {
            eVar.Q0(true);
            eVar.g1(8);
        }
        eVar.y0(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b) view).n(eVar, this.f1563e.L1());
        }
        if (bVar.h0) {
            a.e.a.m.g gVar = (a.e.a.m.g) eVar;
            int i11 = bVar.s0;
            int i12 = bVar.t0;
            float f4 = bVar.u0;
            if (Build.VERSION.SDK_INT < 17) {
                i11 = bVar.f1566a;
                i12 = bVar.f1567b;
                f4 = bVar.f1568c;
            }
            if (f4 != -1.0f) {
                gVar.w1(f4);
                return;
            } else if (i11 != -1) {
                gVar.u1(i11);
                return;
            } else {
                if (i12 != -1) {
                    gVar.v1(i12);
                    return;
                }
                return;
            }
        }
        int i13 = bVar.l0;
        int i14 = bVar.m0;
        int i15 = bVar.n0;
        int i16 = bVar.o0;
        int i17 = bVar.p0;
        int i18 = bVar.q0;
        float f5 = bVar.r0;
        if (Build.VERSION.SDK_INT < 17) {
            i13 = bVar.f1570e;
            int i19 = bVar.f1571f;
            int i20 = bVar.g;
            int i21 = bVar.h;
            int i22 = bVar.w;
            int i23 = bVar.y;
            float f6 = bVar.G;
            if (i13 == -1 && i19 == -1) {
                int i24 = bVar.t;
                if (i24 != -1) {
                    i13 = i24;
                } else {
                    int i25 = bVar.s;
                    if (i25 != -1) {
                        i19 = i25;
                    }
                }
            }
            if (i20 == -1 && i21 == -1) {
                i2 = bVar.u;
                if (i2 == -1) {
                    int i26 = bVar.v;
                    if (i26 != -1) {
                        i = i23;
                        f2 = f6;
                        i17 = i22;
                        i3 = i26;
                        i14 = i19;
                        i2 = i20;
                    } else {
                        i2 = i20;
                        i = i23;
                        f2 = f6;
                        i17 = i22;
                        i3 = i21;
                        i14 = i19;
                    }
                } else {
                    i = i23;
                    f2 = f6;
                    i17 = i22;
                    i3 = i21;
                    i14 = i19;
                }
            } else {
                i2 = i20;
                i = i23;
                f2 = f6;
                i17 = i22;
                i3 = i21;
                i14 = i19;
            }
        } else {
            i = i18;
            f2 = f5;
            i2 = i15;
            i3 = i16;
        }
        int i27 = bVar.p;
        if (i27 != -1) {
            a.e.a.m.e eVar6 = sparseArray.get(i27);
            if (eVar6 != null) {
                eVar.j(eVar6, bVar.r, bVar.q);
            }
        } else {
            if (i13 != -1) {
                eVar2 = sparseArray.get(i13);
                if (eVar2 != null) {
                    bVar3 = a.e.a.m.d.b.LEFT;
                    i4 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                    bVar2 = bVar3;
                    eVar.c0(bVar2, eVar2, bVar3, i4, i17);
                }
            } else if (i14 != -1 && (eVar2 = sparseArray.get(i14)) != null) {
                bVar2 = a.e.a.m.d.b.LEFT;
                bVar3 = a.e.a.m.d.b.RIGHT;
                i4 = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
                eVar.c0(bVar2, eVar2, bVar3, i4, i17);
            }
            if (i2 != -1) {
                eVar3 = sparseArray.get(i2);
                if (eVar3 != null) {
                    bVar5 = a.e.a.m.d.b.RIGHT;
                    bVar4 = a.e.a.m.d.b.LEFT;
                    i5 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                    eVar.c0(bVar5, eVar3, bVar4, i5, i);
                }
            } else if (i3 != -1 && (eVar3 = sparseArray.get(i3)) != null) {
                bVar4 = a.e.a.m.d.b.RIGHT;
                i5 = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
                bVar5 = bVar4;
                eVar.c0(bVar5, eVar3, bVar4, i5, i);
            }
            int i28 = bVar.i;
            if (i28 != -1) {
                eVar4 = sparseArray.get(i28);
                if (eVar4 != null) {
                    bVar7 = a.e.a.m.d.b.TOP;
                    i6 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                    i7 = bVar.x;
                    bVar6 = bVar7;
                    eVar.c0(bVar6, eVar4, bVar7, i6, i7);
                }
            } else {
                int i29 = bVar.j;
                if (i29 != -1 && (eVar4 = sparseArray.get(i29)) != null) {
                    bVar6 = a.e.a.m.d.b.TOP;
                    bVar7 = a.e.a.m.d.b.BOTTOM;
                    i6 = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                    i7 = bVar.x;
                    eVar.c0(bVar6, eVar4, bVar7, i6, i7);
                }
            }
            int i30 = bVar.k;
            if (i30 != -1) {
                eVar5 = sparseArray.get(i30);
                if (eVar5 != null) {
                    bVar9 = a.e.a.m.d.b.BOTTOM;
                    bVar8 = a.e.a.m.d.b.TOP;
                    i8 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                    i9 = bVar.z;
                    eVar.c0(bVar9, eVar5, bVar8, i8, i9);
                }
            } else {
                int i31 = bVar.l;
                if (i31 != -1 && (eVar5 = sparseArray.get(i31)) != null) {
                    bVar8 = a.e.a.m.d.b.BOTTOM;
                    i8 = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
                    i9 = bVar.z;
                    bVar9 = bVar8;
                    eVar.c0(bVar9, eVar5, bVar8, i8, i9);
                }
            }
            int i32 = bVar.m;
            if (i32 != -1) {
                bVar10 = a.e.a.m.d.b.BASELINE;
            } else {
                i32 = bVar.n;
                if (i32 != -1) {
                    bVar10 = a.e.a.m.d.b.TOP;
                } else {
                    i32 = bVar.o;
                    if (i32 != -1) {
                        bVar10 = a.e.a.m.d.b.BOTTOM;
                    } else {
                        if (f2 >= 0.0f) {
                            eVar.J0(f2);
                        }
                        f3 = bVar.H;
                        if (f3 >= 0.0f) {
                            eVar.a1(f3);
                        }
                    }
                }
            }
            z(eVar, bVar, sparseArray, i32, bVar10);
            if (f2 >= 0.0f) {
                eVar.J0(f2);
            }
            f3 = bVar.H;
            if (f3 >= 0.0f) {
                eVar.a1(f3);
            }
        }
        if (z && ((i10 = bVar.X) != -1 || bVar.Y != -1)) {
            eVar.Y0(i10, bVar.Y);
        }
        if (bVar.e0) {
            eVar.M0(a.e.a.m.e.b.FIXED);
            eVar.h1(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar.M0(a.e.a.m.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            eVar.M0(bVar.a0 ? a.e.a.m.e.b.MATCH_CONSTRAINT : a.e.a.m.e.b.MATCH_PARENT);
            eVar.m(a.e.a.m.d.b.LEFT).g = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar.m(a.e.a.m.d.b.RIGHT).g = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar.M0(a.e.a.m.e.b.MATCH_CONSTRAINT);
            eVar.h1(0);
        }
        if (bVar.f0) {
            eVar.d1(a.e.a.m.e.b.FIXED);
            eVar.I0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar.d1(a.e.a.m.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            eVar.d1(bVar.b0 ? a.e.a.m.e.b.MATCH_CONSTRAINT : a.e.a.m.e.b.MATCH_PARENT);
            eVar.m(a.e.a.m.d.b.TOP).g = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar.m(a.e.a.m.d.b.BOTTOM).g = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar.d1(a.e.a.m.e.b.MATCH_CONSTRAINT);
            eVar.I0(0);
        }
        eVar.A0(bVar.I);
        eVar.O0(bVar.L);
        eVar.f1(bVar.M);
        eVar.K0(bVar.N);
        eVar.b1(bVar.O);
        eVar.i1(bVar.d0);
        eVar.N0(bVar.P, bVar.R, bVar.T, bVar.V);
        eVar.e1(bVar.Q, bVar.S, bVar.U, bVar.W);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.b> arrayList = this.f1562d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f1562d.get(i).q(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i6;
                        float f3 = i7;
                        float f4 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i7 + i8;
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void forceLayout() {
        s();
        super.forceLayout();
    }

    public Object g(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.o;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.o.get(str);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.i;
    }

    public int getMaxWidth() {
        return this.h;
    }

    public int getMinHeight() {
        return this.g;
    }

    public int getMinWidth() {
        return this.f1564f;
    }

    public int getOptimizationLevel() {
        return this.f1563e.G1();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f1563e.p == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f1563e.p = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f1563e.p = "parent";
            }
        }
        if (this.f1563e.r() == null) {
            a.e.a.m.f fVar = this.f1563e;
            fVar.z0(fVar.p);
            Log.v("ConstraintLayout", " setDebugName " + this.f1563e.r());
        }
        for (a.e.a.m.e eVar : this.f1563e.o1()) {
            View view = (View) eVar.q();
            if (view != null) {
                if (eVar.p == null && (id = view.getId()) != -1) {
                    eVar.p = getContext().getResources().getResourceEntryName(id);
                }
                if (eVar.r() == null) {
                    eVar.z0(eVar.p);
                    Log.v("ConstraintLayout", " setDebugName " + eVar.r());
                }
            }
        }
        this.f1563e.M(sb);
        return sb.toString();
    }

    public View l(int i) {
        return this.f1561c.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            b bVar = (b) childAt.getLayoutParams();
            a.e.a.m.e eVar = bVar.v0;
            if ((childAt.getVisibility() != 8 || bVar.h0 || bVar.i0 || bVar.k0 || zIsInEditMode) && !bVar.j0) {
                int iV = eVar.V();
                int iW = eVar.W();
                int iU = eVar.U() + iV;
                int iV2 = eVar.v() + iW;
                childAt.layout(iV, iW, iU, iV2);
                if ((childAt instanceof g) && (content = ((g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iV, iW, iU, iV2);
                }
            }
        }
        int size = this.f1562d.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f1562d.get(i6).o(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.x == i) {
            int i3 = this.y;
        }
        if (!this.j) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).isLayoutRequested()) {
                    this.j = true;
                    break;
                }
            }
        }
        boolean z = this.j;
        this.x = i;
        this.y = i2;
        this.f1563e.U1(r());
        if (this.j) {
            this.j = false;
            if (A()) {
                this.f1563e.W1();
            }
        }
        v(this.f1563e, this.k, i, i2);
        u(i, i2, this.f1563e.U(), this.f1563e.v(), this.f1563e.M1(), this.f1563e.K1());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        a.e.a.m.e eVarP = p(view);
        if ((view instanceof Guideline) && !(eVarP instanceof a.e.a.m.g)) {
            b bVar = (b) view.getLayoutParams();
            a.e.a.m.g gVar = new a.e.a.m.g();
            bVar.v0 = gVar;
            bVar.h0 = true;
            gVar.x1(bVar.Z);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            androidx.constraintlayout.widget.b bVar2 = (androidx.constraintlayout.widget.b) view;
            bVar2.s();
            ((b) view.getLayoutParams()).i0 = true;
            if (!this.f1562d.contains(bVar2)) {
                this.f1562d.add(bVar2);
            }
        }
        this.f1561c.put(view.getId(), view);
        this.j = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1561c.remove(view.getId());
        this.f1563e.q1(p(view));
        this.f1562d.remove(view);
        this.j = true;
    }

    public final a.e.a.m.e p(View view) {
        if (view == this) {
            return this.f1563e;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof b)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof b)) {
                return null;
            }
        }
        return ((b) view.getLayoutParams()).v0;
    }

    protected boolean r() {
        if (Build.VERSION.SDK_INT >= 17) {
            return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
        }
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        s();
        super.requestLayout();
    }

    public void setConstraintSet(d dVar) {
        this.l = dVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f1561c.remove(getId());
        super.setId(i);
        this.f1561c.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.i) {
            return;
        }
        this.i = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.h) {
            return;
        }
        this.h = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f1564f) {
            return;
        }
        this.f1564f = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        androidx.constraintlayout.widget.c cVar = this.m;
        if (cVar != null) {
            cVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.k = i;
        this.f1563e.S1(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected void t(int i) {
        this.m = new androidx.constraintlayout.widget.c(getContext(), this, i);
    }

    protected void u(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        c cVar = this.w;
        int i5 = cVar.f1577e;
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + cVar.f1576d, i, 0);
        int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.h, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.i, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.p = iMin;
        this.q = iMin2;
    }

    protected void v(a.e.a.m.f fVar, int i, int i2, int i3) {
        int iMax;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax2 = Math.max(0, getPaddingTop());
        int iMax3 = Math.max(0, getPaddingBottom());
        int i4 = iMax2 + iMax3;
        int paddingWidth = getPaddingWidth();
        this.w.c(i2, i3, iMax2, iMax3, paddingWidth, i4);
        if (Build.VERSION.SDK_INT >= 17) {
            int iMax4 = Math.max(0, getPaddingStart());
            int iMax5 = Math.max(0, getPaddingEnd());
            if (iMax4 <= 0 && iMax5 <= 0) {
                iMax4 = Math.max(0, getPaddingLeft());
            } else if (r()) {
                iMax4 = iMax5;
            }
            iMax = iMax4;
        } else {
            iMax = Math.max(0, getPaddingLeft());
        }
        int i5 = size - paddingWidth;
        int i6 = size2 - i4;
        y(fVar, mode, i5, mode2, i6);
        fVar.N1(i, mode, i5, mode2, i6, this.p, this.q, iMax, iMax2);
    }

    public void x(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.o == null) {
                this.o = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.o.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c A[PHI: r9
      0x002c: PHI (r9v2 a.e.a.m.e$b) = (r9v1 a.e.a.m.e$b), (r9v6 a.e.a.m.e$b) binds: [B:13:0x002a, B:10:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x004b A[PHI: r2
      0x004b: PHI (r2v2 a.e.a.m.e$b) = (r2v1 a.e.a.m.e$b), (r2v4 a.e.a.m.e$b) binds: [B:24:0x0049, B:21:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    protected void y(a.e.a.m.f fVar, int i, int i2, int i3, int i4) {
        a.e.a.m.e.b bVar;
        c cVar = this.w;
        int i5 = cVar.f1577e;
        int i6 = cVar.f1576d;
        a.e.a.m.e.b bVar2 = a.e.a.m.e.b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                bVar = a.e.a.m.e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.f1564f);
                }
            } else if (i != 1073741824) {
                bVar = bVar2;
            } else {
                i2 = Math.min(this.h - i6, i2);
                bVar = bVar2;
            }
            i2 = 0;
        } else {
            bVar = a.e.a.m.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.f1564f);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                bVar2 = a.e.a.m.e.b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.g);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.i - i5, i4);
            }
            i4 = 0;
        } else {
            bVar2 = a.e.a.m.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.g);
            }
        }
        if (i2 != fVar.U() || i4 != fVar.v()) {
            fVar.J1();
        }
        fVar.j1(0);
        fVar.k1(0);
        fVar.U0(this.h - i6);
        fVar.T0(this.i - i5);
        fVar.X0(0);
        fVar.W0(0);
        fVar.M0(bVar);
        fVar.h1(i2);
        fVar.d1(bVar2);
        fVar.I0(i4);
        fVar.X0(this.f1564f - i6);
        fVar.W0(this.g - i5);
    }
}
