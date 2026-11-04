package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f1612a = {0, 4, 8};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SparseIntArray f1613b = new SparseIntArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static SparseIntArray f1614c = new SparseIntArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f1615d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1616e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<String, androidx.constraintlayout.widget.a> f1617f = new HashMap<>();
    private boolean g = true;
    private HashMap<Integer, a> h = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f1619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0046d f1620c = new C0046d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f1621d = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f1622e = new b();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final e f1623f = new e();
        public HashMap<String, androidx.constraintlayout.widget.a> g = new HashMap<>();
        C0045a h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a$a, reason: collision with other inner class name */
        static class C0045a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int[] f1624a = new int[10];

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int[] f1625b = new int[10];

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f1626c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            int[] f1627d = new int[10];

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            float[] f1628e = new float[10];

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f1629f = 0;
            int[] g = new int[5];
            String[] h = new String[5];
            int i = 0;
            int[] j = new int[4];
            boolean[] k = new boolean[4];
            int l = 0;

            C0045a() {
            }

            void a(int i, float f2) {
                int i2 = this.f1629f;
                int[] iArr = this.f1627d;
                if (i2 >= iArr.length) {
                    this.f1627d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1628e;
                    this.f1628e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1627d;
                int i3 = this.f1629f;
                iArr2[i3] = i;
                float[] fArr2 = this.f1628e;
                this.f1629f = i3 + 1;
                fArr2[i3] = f2;
            }

            void b(int i, int i2) {
                int i3 = this.f1626c;
                int[] iArr = this.f1624a;
                if (i3 >= iArr.length) {
                    this.f1624a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1625b;
                    this.f1625b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1624a;
                int i4 = this.f1626c;
                iArr3[i4] = i;
                int[] iArr4 = this.f1625b;
                this.f1626c = i4 + 1;
                iArr4[i4] = i2;
            }

            void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(int i, ConstraintLayout.b bVar) {
            this.f1618a = i;
            b bVar2 = this.f1622e;
            bVar2.k = bVar.f1570e;
            bVar2.l = bVar.f1571f;
            bVar2.m = bVar.g;
            bVar2.n = bVar.h;
            bVar2.o = bVar.i;
            bVar2.p = bVar.j;
            bVar2.q = bVar.k;
            bVar2.r = bVar.l;
            bVar2.s = bVar.m;
            bVar2.t = bVar.n;
            bVar2.u = bVar.o;
            bVar2.v = bVar.s;
            bVar2.w = bVar.t;
            bVar2.x = bVar.u;
            bVar2.y = bVar.v;
            bVar2.z = bVar.G;
            bVar2.A = bVar.H;
            bVar2.B = bVar.I;
            bVar2.C = bVar.p;
            bVar2.D = bVar.q;
            bVar2.E = bVar.r;
            bVar2.F = bVar.X;
            bVar2.G = bVar.Y;
            bVar2.H = bVar.Z;
            bVar2.i = bVar.f1568c;
            b bVar3 = this.f1622e;
            bVar3.g = bVar.f1566a;
            bVar3.h = bVar.f1567b;
            bVar3.f1634e = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar3.f1635f = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar3.I = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar3.J = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar3.K = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar3.L = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar3.O = bVar.D;
            bVar3.W = bVar.M;
            bVar3.X = bVar.L;
            bVar3.Z = bVar.O;
            bVar3.Y = bVar.N;
            bVar3.o0 = bVar.a0;
            bVar3.p0 = bVar.b0;
            bVar3.a0 = bVar.P;
            bVar3.b0 = bVar.Q;
            bVar3.c0 = bVar.T;
            bVar3.d0 = bVar.U;
            bVar3.e0 = bVar.R;
            bVar3.f0 = bVar.S;
            bVar3.g0 = bVar.V;
            bVar3.h0 = bVar.W;
            bVar3.n0 = bVar.c0;
            bVar3.Q = bVar.x;
            b bVar4 = this.f1622e;
            bVar4.S = bVar.z;
            bVar4.P = bVar.w;
            bVar4.R = bVar.y;
            bVar4.U = bVar.A;
            bVar4.T = bVar.B;
            bVar4.V = bVar.C;
            bVar4.r0 = bVar.d0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar4.M = bVar.getMarginEnd();
                this.f1622e.N = bVar.getMarginStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(int i, androidx.constraintlayout.widget.e.a aVar) {
            f(i, aVar);
            this.f1620c.f1645d = aVar.x0;
            e eVar = this.f1623f;
            eVar.f1649c = aVar.A0;
            eVar.f1650d = aVar.B0;
            eVar.f1651e = aVar.C0;
            eVar.f1652f = aVar.D0;
            eVar.g = aVar.E0;
            eVar.h = aVar.F0;
            eVar.i = aVar.G0;
            eVar.k = aVar.H0;
            eVar.l = aVar.I0;
            eVar.m = aVar.J0;
            eVar.o = aVar.z0;
            eVar.n = aVar.y0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h(androidx.constraintlayout.widget.b bVar, int i, androidx.constraintlayout.widget.e.a aVar) {
            g(i, aVar);
            if (bVar instanceof Barrier) {
                b bVar2 = this.f1622e;
                bVar2.k0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.i0 = barrier.getType();
                this.f1622e.l0 = barrier.getReferencedIds();
                this.f1622e.j0 = barrier.getMargin();
            }
        }

        public void d(ConstraintLayout.b bVar) {
            b bVar2 = this.f1622e;
            bVar.f1570e = bVar2.k;
            bVar.f1571f = bVar2.l;
            bVar.g = bVar2.m;
            bVar.h = bVar2.n;
            bVar.i = bVar2.o;
            bVar.j = bVar2.p;
            bVar.k = bVar2.q;
            bVar.l = bVar2.r;
            bVar.m = bVar2.s;
            bVar.n = bVar2.t;
            bVar.o = bVar2.u;
            bVar.s = bVar2.v;
            bVar.t = bVar2.w;
            bVar.u = bVar2.x;
            bVar.v = bVar2.y;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.K;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.L;
            bVar.A = bVar2.U;
            bVar.B = bVar2.T;
            bVar.x = bVar2.Q;
            bVar.z = bVar2.S;
            bVar.G = bVar2.z;
            bVar.H = bVar2.A;
            b bVar3 = this.f1622e;
            bVar.p = bVar3.C;
            bVar.q = bVar3.D;
            bVar.r = bVar3.E;
            bVar.I = bVar3.B;
            bVar.X = bVar3.F;
            bVar.Y = bVar3.G;
            bVar.M = bVar3.W;
            bVar.L = bVar3.X;
            bVar.O = bVar3.Z;
            bVar.N = bVar3.Y;
            bVar.a0 = bVar3.o0;
            bVar.b0 = bVar3.p0;
            bVar.P = bVar3.a0;
            bVar.Q = bVar3.b0;
            bVar.T = bVar3.c0;
            bVar.U = bVar3.d0;
            bVar.R = bVar3.e0;
            bVar.S = bVar3.f0;
            bVar.V = bVar3.g0;
            bVar.W = bVar3.h0;
            bVar.Z = bVar3.H;
            bVar.f1568c = bVar3.i;
            bVar.f1566a = bVar3.g;
            bVar.f1567b = bVar3.h;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar3.f1634e;
            b bVar4 = this.f1622e;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar4.f1635f;
            String str = bVar4.n0;
            if (str != null) {
                bVar.c0 = str;
            }
            bVar.d0 = bVar4.r0;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(bVar4.N);
                bVar.setMarginEnd(this.f1622e.M);
            }
            bVar.a();
        }

        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f1622e.a(this.f1622e);
            aVar.f1621d.a(this.f1621d);
            aVar.f1620c.a(this.f1620c);
            aVar.f1623f.a(this.f1623f);
            aVar.f1618a = this.f1618a;
            aVar.h = this.h;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f1630a;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1635f;
        public int[] l0;
        public String m0;
        public String n0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1631b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1632c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1633d = false;
        public int g = -1;
        public int h = -1;
        public float i = -1.0f;
        public boolean j = true;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public int y = -1;
        public float z = 0.5f;
        public float A = 0.5f;
        public String B = null;
        public int C = -1;
        public int D = 0;
        public float E = 0.0f;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public int V = Integer.MIN_VALUE;
        public float W = -1.0f;
        public float X = -1.0f;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public int f0 = 0;
        public float g0 = 1.0f;
        public float h0 = 1.0f;
        public int i0 = -1;
        public int j0 = 0;
        public int k0 = -1;
        public boolean o0 = false;
        public boolean p0 = false;
        public boolean q0 = true;
        public int r0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1630a = sparseIntArray;
            sparseIntArray.append(i.K5, 24);
            f1630a.append(i.L5, 25);
            f1630a.append(i.N5, 28);
            f1630a.append(i.O5, 29);
            f1630a.append(i.T5, 35);
            f1630a.append(i.S5, 34);
            f1630a.append(i.u5, 4);
            f1630a.append(i.t5, 3);
            f1630a.append(i.r5, 1);
            f1630a.append(i.Z5, 6);
            f1630a.append(i.a6, 7);
            f1630a.append(i.B5, 17);
            f1630a.append(i.C5, 18);
            f1630a.append(i.D5, 19);
            f1630a.append(i.n5, 90);
            f1630a.append(i.Z4, 26);
            f1630a.append(i.P5, 31);
            f1630a.append(i.Q5, 32);
            f1630a.append(i.A5, 10);
            f1630a.append(i.z5, 9);
            f1630a.append(i.d6, 13);
            f1630a.append(i.g6, 16);
            f1630a.append(i.e6, 14);
            f1630a.append(i.b6, 11);
            f1630a.append(i.f6, 15);
            f1630a.append(i.c6, 12);
            f1630a.append(i.W5, 38);
            f1630a.append(i.I5, 37);
            f1630a.append(i.H5, 39);
            f1630a.append(i.V5, 40);
            f1630a.append(i.G5, 20);
            f1630a.append(i.U5, 36);
            f1630a.append(i.y5, 5);
            f1630a.append(i.J5, 91);
            f1630a.append(i.R5, 91);
            f1630a.append(i.M5, 91);
            f1630a.append(i.s5, 91);
            f1630a.append(i.q5, 91);
            f1630a.append(i.c5, 23);
            f1630a.append(i.e5, 27);
            f1630a.append(i.g5, 30);
            f1630a.append(i.h5, 8);
            f1630a.append(i.d5, 33);
            f1630a.append(i.f5, 2);
            f1630a.append(i.a5, 22);
            f1630a.append(i.b5, 21);
            f1630a.append(i.X5, 41);
            f1630a.append(i.E5, 42);
            f1630a.append(i.p5, 41);
            f1630a.append(i.o5, 42);
            f1630a.append(i.h6, 76);
            f1630a.append(i.v5, 61);
            f1630a.append(i.x5, 62);
            f1630a.append(i.w5, 63);
            f1630a.append(i.Y5, 69);
            f1630a.append(i.F5, 70);
            f1630a.append(i.l5, 71);
            f1630a.append(i.j5, 72);
            f1630a.append(i.k5, 73);
            f1630a.append(i.m5, 74);
            f1630a.append(i.i5, 75);
        }

        public void a(b bVar) {
            this.f1631b = bVar.f1631b;
            this.f1634e = bVar.f1634e;
            this.f1632c = bVar.f1632c;
            this.f1635f = bVar.f1635f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.k0 = bVar.k0;
            this.n0 = bVar.n0;
            int[] iArr = bVar.l0;
            if (iArr == null || bVar.m0 != null) {
                this.l0 = null;
            } else {
                this.l0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.m0 = bVar.m0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
            this.q0 = bVar.q0;
            this.r0 = bVar.r0;
        }

        void b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.Y4);
            this.f1632c = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = f1630a.get(index);
                switch (i2) {
                    case 1:
                        this.s = d.o(typedArrayObtainStyledAttributes, index, this.s);
                        break;
                    case 2:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 3:
                        this.r = d.o(typedArrayObtainStyledAttributes, index, this.r);
                        break;
                    case 4:
                        this.q = d.o(typedArrayObtainStyledAttributes, index, this.q);
                        break;
                    case 5:
                        this.B = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 7:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.G);
                        break;
                    case 8:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        }
                        break;
                    case 9:
                        this.y = d.o(typedArrayObtainStyledAttributes, index, this.y);
                        break;
                    case 10:
                        this.x = d.o(typedArrayObtainStyledAttributes, index, this.x);
                        break;
                    case 11:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 12:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 13:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 14:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 15:
                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                        break;
                    case 16:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 17:
                        this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                        break;
                    case 18:
                        this.h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.h);
                        break;
                    case 19:
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 20:
                        this.z = typedArrayObtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 21:
                        this.f1635f = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1635f);
                        break;
                    case 22:
                        this.f1634e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1634e);
                        break;
                    case 23:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 24:
                        this.k = d.o(typedArrayObtainStyledAttributes, index, this.k);
                        break;
                    case 25:
                        this.l = d.o(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 26:
                        this.H = typedArrayObtainStyledAttributes.getInt(index, this.H);
                        break;
                    case 27:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 28:
                        this.m = d.o(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case 29:
                        this.n = d.o(typedArrayObtainStyledAttributes, index, this.n);
                        break;
                    case 30:
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        }
                        break;
                    case 31:
                        this.v = d.o(typedArrayObtainStyledAttributes, index, this.v);
                        break;
                    case 32:
                        this.w = d.o(typedArrayObtainStyledAttributes, index, this.w);
                        break;
                    case 33:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 34:
                        this.p = d.o(typedArrayObtainStyledAttributes, index, this.p);
                        break;
                    case 35:
                        this.o = d.o(typedArrayObtainStyledAttributes, index, this.o);
                        break;
                    case 36:
                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                        break;
                    case 37:
                        this.X = typedArrayObtainStyledAttributes.getFloat(index, this.X);
                        break;
                    case 38:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 39:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 40:
                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                        break;
                    case 41:
                        d.p(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.p(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.C = d.o(typedArrayObtainStyledAttributes, index, this.C);
                                break;
                            case 62:
                                this.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.D);
                                break;
                            case 63:
                                this.E = typedArrayObtainStyledAttributes.getFloat(index, this.E);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.h0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.i0 = typedArrayObtainStyledAttributes.getInt(index, this.i0);
                                        continue;
                                    case 73:
                                        this.j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.j0);
                                        continue;
                                    case 74:
                                        this.m0 = typedArrayObtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.q0 = typedArrayObtainStyledAttributes.getBoolean(index, this.q0);
                                        continue;
                                    case 76:
                                        this.r0 = typedArrayObtainStyledAttributes.getInt(index, this.r0);
                                        continue;
                                    case 77:
                                        this.t = d.o(typedArrayObtainStyledAttributes, index, this.t);
                                        continue;
                                    case 78:
                                        this.u = d.o(typedArrayObtainStyledAttributes, index, this.u);
                                        continue;
                                    case 79:
                                        this.V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                        continue;
                                    case 80:
                                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                                        continue;
                                    case 81:
                                        this.a0 = typedArrayObtainStyledAttributes.getInt(index, this.a0);
                                        continue;
                                    case 82:
                                        this.b0 = typedArrayObtainStyledAttributes.getInt(index, this.b0);
                                        continue;
                                    case 83:
                                        this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        continue;
                                    case 84:
                                        this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        continue;
                                    case 85:
                                        this.f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f0);
                                        continue;
                                    case 86:
                                        this.e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        continue;
                                    case 87:
                                        this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                        continue;
                                    case 88:
                                        this.p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.p0);
                                        continue;
                                    case 89:
                                        this.n0 = typedArrayObtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.j = typedArrayObtainStyledAttributes.getBoolean(index, this.j);
                                        continue;
                                    case 91:
                                        sb = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb.append(str);
                                sb.append(Integer.toHexString(index));
                                sb.append("   ");
                                sb.append(f1630a.get(index));
                                Log.w("ConstraintSet", sb.toString());
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f1636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1637b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1638c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1639d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f1640e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1641f = -1;
        public int g = 0;
        public float h = Float.NaN;
        public int i = -1;
        public float j = Float.NaN;
        public float k = Float.NaN;
        public int l = -1;
        public String m = null;
        public int n = -3;
        public int o = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1636a = sparseIntArray;
            sparseIntArray.append(i.t6, 1);
            f1636a.append(i.v6, 2);
            f1636a.append(i.z6, 3);
            f1636a.append(i.s6, 4);
            f1636a.append(i.r6, 5);
            f1636a.append(i.q6, 6);
            f1636a.append(i.u6, 7);
            f1636a.append(i.y6, 8);
            f1636a.append(i.x6, 9);
            f1636a.append(i.w6, 10);
        }

        public void a(c cVar) {
            this.f1637b = cVar.f1637b;
            this.f1638c = cVar.f1638c;
            this.f1640e = cVar.f1640e;
            this.f1641f = cVar.f1641f;
            this.g = cVar.g;
            this.j = cVar.j;
            this.h = cVar.h;
            this.i = cVar.i;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.p6);
            this.f1637b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f1636a.get(index)) {
                    case 1:
                        this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 2:
                        this.f1641f = typedArrayObtainStyledAttributes.getInt(index, this.f1641f);
                        break;
                    case 3:
                        this.f1640e = typedArrayObtainStyledAttributes.peekValue(index).type == 3 ? typedArrayObtainStyledAttributes.getString(index) : a.e.a.k.a.b.f263b[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.g = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1638c = d.o(typedArrayObtainStyledAttributes, index, this.f1638c);
                        break;
                    case 6:
                        this.f1639d = typedArrayObtainStyledAttributes.getInteger(index, this.f1639d);
                        break;
                    case 7:
                        this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 8:
                        this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                        break;
                    case 9:
                        this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                        break;
                    case 10:
                        int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.o = resourceId;
                            if (resourceId != -1) {
                                this.n = -2;
                            }
                        } else if (i2 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.m = string;
                            if (string.indexOf("/") > 0) {
                                this.o = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.n = -2;
                            } else {
                                this.n = -1;
                            }
                        } else {
                            this.n = typedArrayObtainStyledAttributes.getInteger(index, this.o);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$d, reason: collision with other inner class name */
    public static class C0046d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1642a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1643b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1644c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1645d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1646e = Float.NaN;

        public void a(C0046d c0046d) {
            this.f1642a = c0046d.f1642a;
            this.f1643b = c0046d.f1643b;
            this.f1645d = c0046d.f1645d;
            this.f1646e = c0046d.f1646e;
            this.f1644c = c0046d.f1644c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.M6);
            this.f1642a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i.O6) {
                    this.f1645d = typedArrayObtainStyledAttributes.getFloat(index, this.f1645d);
                } else if (index == i.N6) {
                    this.f1643b = typedArrayObtainStyledAttributes.getInt(index, this.f1643b);
                    this.f1643b = d.f1612a[this.f1643b];
                } else if (index == i.Q6) {
                    this.f1644c = typedArrayObtainStyledAttributes.getInt(index, this.f1644c);
                } else if (index == i.P6) {
                    this.f1646e = typedArrayObtainStyledAttributes.getFloat(index, this.f1646e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static SparseIntArray f1647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1648b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f1649c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1650d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f1651e = 0.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f1652f = 1.0f;
        public float g = 1.0f;
        public float h = Float.NaN;
        public float i = Float.NaN;
        public int j = -1;
        public float k = 0.0f;
        public float l = 0.0f;
        public float m = 0.0f;
        public boolean n = false;
        public float o = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1647a = sparseIntArray;
            sparseIntArray.append(i.l7, 1);
            f1647a.append(i.m7, 2);
            f1647a.append(i.n7, 3);
            f1647a.append(i.j7, 4);
            f1647a.append(i.k7, 5);
            f1647a.append(i.f7, 6);
            f1647a.append(i.g7, 7);
            f1647a.append(i.h7, 8);
            f1647a.append(i.i7, 9);
            f1647a.append(i.o7, 10);
            f1647a.append(i.p7, 11);
            f1647a.append(i.q7, 12);
        }

        public void a(e eVar) {
            this.f1648b = eVar.f1648b;
            this.f1649c = eVar.f1649c;
            this.f1650d = eVar.f1650d;
            this.f1651e = eVar.f1651e;
            this.f1652f = eVar.f1652f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
            this.o = eVar.o;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.e7);
            this.f1648b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f1647a.get(index)) {
                    case 1:
                        this.f1649c = typedArrayObtainStyledAttributes.getFloat(index, this.f1649c);
                        break;
                    case 2:
                        this.f1650d = typedArrayObtainStyledAttributes.getFloat(index, this.f1650d);
                        break;
                    case 3:
                        this.f1651e = typedArrayObtainStyledAttributes.getFloat(index, this.f1651e);
                        break;
                    case 4:
                        this.f1652f = typedArrayObtainStyledAttributes.getFloat(index, this.f1652f);
                        break;
                    case 5:
                        this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 6:
                        this.h = typedArrayObtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 7:
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                        break;
                    case 8:
                        this.k = typedArrayObtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 9:
                        this.l = typedArrayObtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.m = typedArrayObtainStyledAttributes.getDimension(index, this.m);
                        }
                        break;
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.n = true;
                            this.o = typedArrayObtainStyledAttributes.getDimension(index, this.o);
                        }
                        break;
                    case 12:
                        this.j = d.o(typedArrayObtainStyledAttributes, index, this.j);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f1613b.append(i.A0, 25);
        f1613b.append(i.B0, 26);
        f1613b.append(i.D0, 29);
        f1613b.append(i.E0, 30);
        f1613b.append(i.K0, 36);
        f1613b.append(i.J0, 35);
        f1613b.append(i.h0, 4);
        f1613b.append(i.g0, 3);
        f1613b.append(i.c0, 1);
        f1613b.append(i.e0, 91);
        f1613b.append(i.d0, 92);
        f1613b.append(i.T0, 6);
        f1613b.append(i.U0, 7);
        f1613b.append(i.o0, 17);
        f1613b.append(i.p0, 18);
        f1613b.append(i.q0, 19);
        f1613b.append(i.Y, 99);
        f1613b.append(i.u, 27);
        f1613b.append(i.F0, 32);
        f1613b.append(i.G0, 33);
        f1613b.append(i.n0, 10);
        f1613b.append(i.m0, 9);
        f1613b.append(i.X0, 13);
        f1613b.append(i.a1, 16);
        f1613b.append(i.Y0, 14);
        f1613b.append(i.V0, 11);
        f1613b.append(i.Z0, 15);
        f1613b.append(i.W0, 12);
        f1613b.append(i.N0, 40);
        f1613b.append(i.y0, 39);
        f1613b.append(i.x0, 41);
        f1613b.append(i.M0, 42);
        f1613b.append(i.w0, 20);
        f1613b.append(i.L0, 37);
        f1613b.append(i.l0, 5);
        f1613b.append(i.z0, 87);
        f1613b.append(i.I0, 87);
        f1613b.append(i.C0, 87);
        f1613b.append(i.f0, 87);
        f1613b.append(i.b0, 87);
        f1613b.append(i.z, 24);
        f1613b.append(i.B, 28);
        f1613b.append(i.N, 31);
        f1613b.append(i.O, 8);
        f1613b.append(i.A, 34);
        f1613b.append(i.C, 2);
        f1613b.append(i.x, 23);
        f1613b.append(i.y, 21);
        f1613b.append(i.O0, 95);
        f1613b.append(i.r0, 96);
        f1613b.append(i.w, 22);
        f1613b.append(i.D, 43);
        f1613b.append(i.Q, 44);
        f1613b.append(i.L, 45);
        f1613b.append(i.M, 46);
        f1613b.append(i.K, 60);
        f1613b.append(i.I, 47);
        f1613b.append(i.J, 48);
        f1613b.append(i.E, 49);
        f1613b.append(i.F, 50);
        f1613b.append(i.G, 51);
        f1613b.append(i.H, 52);
        f1613b.append(i.P, 53);
        f1613b.append(i.P0, 54);
        f1613b.append(i.s0, 55);
        f1613b.append(i.Q0, 56);
        f1613b.append(i.t0, 57);
        f1613b.append(i.R0, 58);
        f1613b.append(i.u0, 59);
        f1613b.append(i.i0, 61);
        f1613b.append(i.k0, 62);
        f1613b.append(i.j0, 63);
        f1613b.append(i.R, 64);
        f1613b.append(i.k1, 65);
        f1613b.append(i.X, 66);
        f1613b.append(i.l1, 67);
        f1613b.append(i.d1, 79);
        f1613b.append(i.v, 38);
        f1613b.append(i.c1, 68);
        f1613b.append(i.S0, 69);
        f1613b.append(i.v0, 70);
        f1613b.append(i.b1, 97);
        f1613b.append(i.V, 71);
        f1613b.append(i.T, 72);
        f1613b.append(i.U, 73);
        f1613b.append(i.W, 74);
        f1613b.append(i.S, 75);
        f1613b.append(i.e1, 76);
        f1613b.append(i.H0, 77);
        f1613b.append(i.m1, 78);
        f1613b.append(i.a0, 80);
        f1613b.append(i.Z, 81);
        f1613b.append(i.f1, 82);
        f1613b.append(i.j1, 83);
        f1613b.append(i.i1, 84);
        f1613b.append(i.h1, 85);
        f1613b.append(i.g1, 86);
        SparseIntArray sparseIntArray = f1614c;
        int i = i.R3;
        sparseIntArray.append(i, 6);
        f1614c.append(i, 7);
        f1614c.append(i.M2, 27);
        f1614c.append(i.U3, 13);
        f1614c.append(i.X3, 16);
        f1614c.append(i.V3, 14);
        f1614c.append(i.S3, 11);
        f1614c.append(i.W3, 15);
        f1614c.append(i.T3, 12);
        f1614c.append(i.L3, 40);
        f1614c.append(i.E3, 39);
        f1614c.append(i.D3, 41);
        f1614c.append(i.K3, 42);
        f1614c.append(i.C3, 20);
        f1614c.append(i.J3, 37);
        f1614c.append(i.w3, 5);
        f1614c.append(i.F3, 87);
        f1614c.append(i.I3, 87);
        f1614c.append(i.G3, 87);
        f1614c.append(i.t3, 87);
        f1614c.append(i.s3, 87);
        f1614c.append(i.R2, 24);
        f1614c.append(i.T2, 28);
        f1614c.append(i.f3, 31);
        f1614c.append(i.g3, 8);
        f1614c.append(i.S2, 34);
        f1614c.append(i.U2, 2);
        f1614c.append(i.P2, 23);
        f1614c.append(i.Q2, 21);
        f1614c.append(i.M3, 95);
        f1614c.append(i.x3, 96);
        f1614c.append(i.O2, 22);
        f1614c.append(i.V2, 43);
        f1614c.append(i.i3, 44);
        f1614c.append(i.d3, 45);
        f1614c.append(i.e3, 46);
        f1614c.append(i.c3, 60);
        f1614c.append(i.a3, 47);
        f1614c.append(i.b3, 48);
        f1614c.append(i.W2, 49);
        f1614c.append(i.X2, 50);
        f1614c.append(i.Y2, 51);
        f1614c.append(i.Z2, 52);
        f1614c.append(i.h3, 53);
        f1614c.append(i.N3, 54);
        f1614c.append(i.y3, 55);
        f1614c.append(i.O3, 56);
        f1614c.append(i.z3, 57);
        f1614c.append(i.P3, 58);
        f1614c.append(i.A3, 59);
        f1614c.append(i.v3, 62);
        f1614c.append(i.u3, 63);
        f1614c.append(i.j3, 64);
        f1614c.append(i.i4, 65);
        f1614c.append(i.p3, 66);
        f1614c.append(i.j4, 67);
        f1614c.append(i.a4, 79);
        f1614c.append(i.N2, 38);
        f1614c.append(i.b4, 98);
        f1614c.append(i.Z3, 68);
        f1614c.append(i.Q3, 69);
        f1614c.append(i.B3, 70);
        f1614c.append(i.n3, 71);
        f1614c.append(i.l3, 72);
        f1614c.append(i.m3, 73);
        f1614c.append(i.o3, 74);
        f1614c.append(i.k3, 75);
        f1614c.append(i.c4, 76);
        f1614c.append(i.H3, 77);
        f1614c.append(i.k4, 78);
        f1614c.append(i.r3, 80);
        f1614c.append(i.q3, 81);
        f1614c.append(i.d4, 82);
        f1614c.append(i.h4, 83);
        f1614c.append(i.g4, 84);
        f1614c.append(i.f4, 85);
        f1614c.append(i.e4, 86);
        f1614c.append(i.Y3, 97);
    }

    private int[] j(View view, String str) {
        int iIntValue;
        Object objG;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objG = ((ConstraintLayout) view.getParent()).g(0, strTrim)) != null && (objG instanceof Integer)) {
                iIntValue = ((Integer) objG).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private a k(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? i.L2 : i.t);
        s(context, aVar, typedArrayObtainStyledAttributes, z);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a l(int i) {
        if (!this.h.containsKey(Integer.valueOf(i))) {
            this.h.put(Integer.valueOf(i), new a());
        }
        return this.h.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    static void p(Object obj, TypedArray typedArray, int i, int i2) {
        int i3;
        if (obj == null) {
            return;
        }
        int i4 = typedArray.peekValue(i).type;
        if (i4 == 3) {
            q(obj, typedArray.getString(i), i2);
            return;
        }
        int dimensionPixelSize = -2;
        boolean z = false;
        if (i4 != 5) {
            int i5 = typedArray.getInt(i, 0);
            if (i5 != -4) {
                dimensionPixelSize = (i5 == -3 || !(i5 == -2 || i5 == -1)) ? 0 : i5;
            } else {
                z = true;
            }
        } else {
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
        }
        if (obj instanceof ConstraintLayout.b) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
            if (i2 == 0) {
                ((ViewGroup.MarginLayoutParams) bVar).width = dimensionPixelSize;
                bVar.a0 = z;
                return;
            } else {
                ((ViewGroup.MarginLayoutParams) bVar).height = dimensionPixelSize;
                bVar.b0 = z;
                return;
            }
        }
        if (obj instanceof b) {
            b bVar2 = (b) obj;
            if (i2 == 0) {
                bVar2.f1634e = dimensionPixelSize;
                bVar2.o0 = z;
                return;
            } else {
                bVar2.f1635f = dimensionPixelSize;
                bVar2.p0 = z;
                return;
            }
        }
        if (obj instanceof a.C0045a) {
            a.C0045a c0045a = (a.C0045a) obj;
            if (i2 == 0) {
                c0045a.b(23, dimensionPixelSize);
                i3 = 80;
            } else {
                c0045a.b(21, dimensionPixelSize);
                i3 = 81;
            }
            c0045a.d(i3, z);
        }
    }

    static void q(Object obj, String str, int i) {
        int i2;
        int i3;
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    r(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).B = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0045a) {
                        ((a.C0045a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i == 0) {
                            bVar3.f1634e = 0;
                            bVar3.X = f2;
                            return;
                        } else {
                            bVar3.f1635f = 0;
                            bVar3.W = f2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0045a) {
                        a.C0045a c0045a = (a.C0045a) obj;
                        if (i == 0) {
                            c0045a.b(23, 0);
                            i3 = 39;
                        } else {
                            c0045a.b(21, 0);
                            i3 = 40;
                        }
                        c0045a.a(i3, f2);
                        return;
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i == 0) {
                            bVar5.f1634e = 0;
                            bVar5.g0 = fMax;
                            bVar5.a0 = 2;
                            return;
                        } else {
                            bVar5.f1635f = 0;
                            bVar5.h0 = fMax;
                            bVar5.b0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0045a) {
                        a.C0045a c0045a2 = (a.C0045a) obj;
                        if (i == 0) {
                            c0045a2.b(23, 0);
                            i2 = 54;
                        } else {
                            c0045a2.b(21, 0);
                            i2 = 55;
                        }
                        c0045a2.b(i2, 2);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void r(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i = 1;
                }
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            fAbs = i == 1 ? Math.abs(f3 / f2) : Math.abs(f2 / f3);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i;
    }

    private void s(Context context, a aVar, TypedArray typedArray, boolean z) {
        c cVar;
        String string;
        c cVar2;
        StringBuilder sb;
        String str;
        if (z) {
            t(context, aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != i.v && i.N != index && i.O != index) {
                aVar.f1621d.f1637b = true;
                aVar.f1622e.f1632c = true;
                aVar.f1620c.f1642a = true;
                aVar.f1623f.f1648b = true;
            }
            switch (f1613b.get(index)) {
                case 1:
                    b bVar = aVar.f1622e;
                    bVar.s = o(typedArray, index, bVar.s);
                    continue;
                    break;
                case 2:
                    b bVar2 = aVar.f1622e;
                    bVar2.L = typedArray.getDimensionPixelSize(index, bVar2.L);
                    continue;
                    break;
                case 3:
                    b bVar3 = aVar.f1622e;
                    bVar3.r = o(typedArray, index, bVar3.r);
                    continue;
                    break;
                case 4:
                    b bVar4 = aVar.f1622e;
                    bVar4.q = o(typedArray, index, bVar4.q);
                    continue;
                    break;
                case 5:
                    aVar.f1622e.B = typedArray.getString(index);
                    continue;
                    break;
                case 6:
                    b bVar5 = aVar.f1622e;
                    bVar5.F = typedArray.getDimensionPixelOffset(index, bVar5.F);
                    continue;
                    break;
                case 7:
                    b bVar6 = aVar.f1622e;
                    bVar6.G = typedArray.getDimensionPixelOffset(index, bVar6.G);
                    continue;
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar7 = aVar.f1622e;
                        bVar7.M = typedArray.getDimensionPixelSize(index, bVar7.M);
                    } else {
                        continue;
                    }
                    break;
                case 9:
                    b bVar8 = aVar.f1622e;
                    bVar8.y = o(typedArray, index, bVar8.y);
                    continue;
                    break;
                case 10:
                    b bVar9 = aVar.f1622e;
                    bVar9.x = o(typedArray, index, bVar9.x);
                    continue;
                    break;
                case 11:
                    b bVar10 = aVar.f1622e;
                    bVar10.S = typedArray.getDimensionPixelSize(index, bVar10.S);
                    continue;
                    break;
                case 12:
                    b bVar11 = aVar.f1622e;
                    bVar11.T = typedArray.getDimensionPixelSize(index, bVar11.T);
                    continue;
                    break;
                case 13:
                    b bVar12 = aVar.f1622e;
                    bVar12.P = typedArray.getDimensionPixelSize(index, bVar12.P);
                    continue;
                    break;
                case 14:
                    b bVar13 = aVar.f1622e;
                    bVar13.R = typedArray.getDimensionPixelSize(index, bVar13.R);
                    continue;
                    break;
                case 15:
                    b bVar14 = aVar.f1622e;
                    bVar14.U = typedArray.getDimensionPixelSize(index, bVar14.U);
                    continue;
                    break;
                case 16:
                    b bVar15 = aVar.f1622e;
                    bVar15.Q = typedArray.getDimensionPixelSize(index, bVar15.Q);
                    continue;
                    break;
                case 17:
                    b bVar16 = aVar.f1622e;
                    bVar16.g = typedArray.getDimensionPixelOffset(index, bVar16.g);
                    continue;
                    break;
                case 18:
                    b bVar17 = aVar.f1622e;
                    bVar17.h = typedArray.getDimensionPixelOffset(index, bVar17.h);
                    continue;
                    break;
                case 19:
                    b bVar18 = aVar.f1622e;
                    bVar18.i = typedArray.getFloat(index, bVar18.i);
                    continue;
                    break;
                case 20:
                    b bVar19 = aVar.f1622e;
                    bVar19.z = typedArray.getFloat(index, bVar19.z);
                    continue;
                    break;
                case 21:
                    b bVar20 = aVar.f1622e;
                    bVar20.f1635f = typedArray.getLayoutDimension(index, bVar20.f1635f);
                    continue;
                    break;
                case 22:
                    C0046d c0046d = aVar.f1620c;
                    c0046d.f1643b = typedArray.getInt(index, c0046d.f1643b);
                    C0046d c0046d2 = aVar.f1620c;
                    c0046d2.f1643b = f1612a[c0046d2.f1643b];
                    continue;
                    break;
                case 23:
                    b bVar21 = aVar.f1622e;
                    bVar21.f1634e = typedArray.getLayoutDimension(index, bVar21.f1634e);
                    continue;
                    break;
                case 24:
                    b bVar22 = aVar.f1622e;
                    bVar22.I = typedArray.getDimensionPixelSize(index, bVar22.I);
                    continue;
                    break;
                case 25:
                    b bVar23 = aVar.f1622e;
                    bVar23.k = o(typedArray, index, bVar23.k);
                    continue;
                    break;
                case 26:
                    b bVar24 = aVar.f1622e;
                    bVar24.l = o(typedArray, index, bVar24.l);
                    continue;
                    break;
                case 27:
                    b bVar25 = aVar.f1622e;
                    bVar25.H = typedArray.getInt(index, bVar25.H);
                    continue;
                    break;
                case 28:
                    b bVar26 = aVar.f1622e;
                    bVar26.J = typedArray.getDimensionPixelSize(index, bVar26.J);
                    continue;
                    break;
                case 29:
                    b bVar27 = aVar.f1622e;
                    bVar27.m = o(typedArray, index, bVar27.m);
                    continue;
                    break;
                case 30:
                    b bVar28 = aVar.f1622e;
                    bVar28.n = o(typedArray, index, bVar28.n);
                    continue;
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        b bVar29 = aVar.f1622e;
                        bVar29.N = typedArray.getDimensionPixelSize(index, bVar29.N);
                    } else {
                        continue;
                    }
                    break;
                case 32:
                    b bVar30 = aVar.f1622e;
                    bVar30.v = o(typedArray, index, bVar30.v);
                    continue;
                    break;
                case 33:
                    b bVar31 = aVar.f1622e;
                    bVar31.w = o(typedArray, index, bVar31.w);
                    continue;
                    break;
                case 34:
                    b bVar32 = aVar.f1622e;
                    bVar32.K = typedArray.getDimensionPixelSize(index, bVar32.K);
                    continue;
                    break;
                case 35:
                    b bVar33 = aVar.f1622e;
                    bVar33.p = o(typedArray, index, bVar33.p);
                    continue;
                    break;
                case 36:
                    b bVar34 = aVar.f1622e;
                    bVar34.o = o(typedArray, index, bVar34.o);
                    continue;
                    break;
                case 37:
                    b bVar35 = aVar.f1622e;
                    bVar35.A = typedArray.getFloat(index, bVar35.A);
                    continue;
                    break;
                case 38:
                    aVar.f1618a = typedArray.getResourceId(index, aVar.f1618a);
                    continue;
                    break;
                case 39:
                    b bVar36 = aVar.f1622e;
                    bVar36.X = typedArray.getFloat(index, bVar36.X);
                    continue;
                    break;
                case 40:
                    b bVar37 = aVar.f1622e;
                    bVar37.W = typedArray.getFloat(index, bVar37.W);
                    continue;
                    break;
                case 41:
                    b bVar38 = aVar.f1622e;
                    bVar38.Y = typedArray.getInt(index, bVar38.Y);
                    continue;
                    break;
                case 42:
                    b bVar39 = aVar.f1622e;
                    bVar39.Z = typedArray.getInt(index, bVar39.Z);
                    continue;
                    break;
                case 43:
                    C0046d c0046d3 = aVar.f1620c;
                    c0046d3.f1645d = typedArray.getFloat(index, c0046d3.f1645d);
                    continue;
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar = aVar.f1623f;
                        eVar.n = true;
                        eVar.o = typedArray.getDimension(index, eVar.o);
                    } else {
                        continue;
                    }
                    break;
                case 45:
                    e eVar2 = aVar.f1623f;
                    eVar2.f1650d = typedArray.getFloat(index, eVar2.f1650d);
                    continue;
                    break;
                case 46:
                    e eVar3 = aVar.f1623f;
                    eVar3.f1651e = typedArray.getFloat(index, eVar3.f1651e);
                    continue;
                    break;
                case 47:
                    e eVar4 = aVar.f1623f;
                    eVar4.f1652f = typedArray.getFloat(index, eVar4.f1652f);
                    continue;
                    break;
                case 48:
                    e eVar5 = aVar.f1623f;
                    eVar5.g = typedArray.getFloat(index, eVar5.g);
                    continue;
                    break;
                case 49:
                    e eVar6 = aVar.f1623f;
                    eVar6.h = typedArray.getDimension(index, eVar6.h);
                    continue;
                    break;
                case 50:
                    e eVar7 = aVar.f1623f;
                    eVar7.i = typedArray.getDimension(index, eVar7.i);
                    continue;
                    break;
                case 51:
                    e eVar8 = aVar.f1623f;
                    eVar8.k = typedArray.getDimension(index, eVar8.k);
                    continue;
                    break;
                case 52:
                    e eVar9 = aVar.f1623f;
                    eVar9.l = typedArray.getDimension(index, eVar9.l);
                    continue;
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        e eVar10 = aVar.f1623f;
                        eVar10.m = typedArray.getDimension(index, eVar10.m);
                    } else {
                        continue;
                    }
                    break;
                case 54:
                    b bVar40 = aVar.f1622e;
                    bVar40.a0 = typedArray.getInt(index, bVar40.a0);
                    continue;
                    break;
                case 55:
                    b bVar41 = aVar.f1622e;
                    bVar41.b0 = typedArray.getInt(index, bVar41.b0);
                    continue;
                    break;
                case 56:
                    b bVar42 = aVar.f1622e;
                    bVar42.c0 = typedArray.getDimensionPixelSize(index, bVar42.c0);
                    continue;
                    break;
                case 57:
                    b bVar43 = aVar.f1622e;
                    bVar43.d0 = typedArray.getDimensionPixelSize(index, bVar43.d0);
                    continue;
                    break;
                case 58:
                    b bVar44 = aVar.f1622e;
                    bVar44.e0 = typedArray.getDimensionPixelSize(index, bVar44.e0);
                    continue;
                    break;
                case 59:
                    b bVar45 = aVar.f1622e;
                    bVar45.f0 = typedArray.getDimensionPixelSize(index, bVar45.f0);
                    continue;
                    break;
                case 60:
                    e eVar11 = aVar.f1623f;
                    eVar11.f1649c = typedArray.getFloat(index, eVar11.f1649c);
                    continue;
                    break;
                case 61:
                    b bVar46 = aVar.f1622e;
                    bVar46.C = o(typedArray, index, bVar46.C);
                    continue;
                    break;
                case 62:
                    b bVar47 = aVar.f1622e;
                    bVar47.D = typedArray.getDimensionPixelSize(index, bVar47.D);
                    continue;
                    break;
                case 63:
                    b bVar48 = aVar.f1622e;
                    bVar48.E = typedArray.getFloat(index, bVar48.E);
                    continue;
                    break;
                case 64:
                    c cVar3 = aVar.f1621d;
                    cVar3.f1638c = o(typedArray, index, cVar3.f1638c);
                    continue;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1621d;
                        string = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1621d;
                        string = a.e.a.k.a.b.f263b[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1640e = string;
                    continue;
                    break;
                case 66:
                    aVar.f1621d.g = typedArray.getInt(index, 0);
                    continue;
                    break;
                case 67:
                    c cVar4 = aVar.f1621d;
                    cVar4.j = typedArray.getFloat(index, cVar4.j);
                    continue;
                    break;
                case 68:
                    C0046d c0046d4 = aVar.f1620c;
                    c0046d4.f1646e = typedArray.getFloat(index, c0046d4.f1646e);
                    continue;
                    break;
                case 69:
                    aVar.f1622e.g0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 70:
                    aVar.f1622e.h0 = typedArray.getFloat(index, 1.0f);
                    continue;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                    break;
                case 72:
                    b bVar49 = aVar.f1622e;
                    bVar49.i0 = typedArray.getInt(index, bVar49.i0);
                    continue;
                    break;
                case 73:
                    b bVar50 = aVar.f1622e;
                    bVar50.j0 = typedArray.getDimensionPixelSize(index, bVar50.j0);
                    continue;
                    break;
                case 74:
                    aVar.f1622e.m0 = typedArray.getString(index);
                    continue;
                    break;
                case 75:
                    b bVar51 = aVar.f1622e;
                    bVar51.q0 = typedArray.getBoolean(index, bVar51.q0);
                    continue;
                    break;
                case 76:
                    c cVar5 = aVar.f1621d;
                    cVar5.f1641f = typedArray.getInt(index, cVar5.f1641f);
                    continue;
                    break;
                case 77:
                    aVar.f1622e.n0 = typedArray.getString(index);
                    continue;
                    break;
                case 78:
                    C0046d c0046d5 = aVar.f1620c;
                    c0046d5.f1644c = typedArray.getInt(index, c0046d5.f1644c);
                    continue;
                    break;
                case 79:
                    c cVar6 = aVar.f1621d;
                    cVar6.h = typedArray.getFloat(index, cVar6.h);
                    continue;
                    break;
                case 80:
                    b bVar52 = aVar.f1622e;
                    bVar52.o0 = typedArray.getBoolean(index, bVar52.o0);
                    continue;
                    break;
                case 81:
                    b bVar53 = aVar.f1622e;
                    bVar53.p0 = typedArray.getBoolean(index, bVar53.p0);
                    continue;
                    break;
                case 82:
                    c cVar7 = aVar.f1621d;
                    cVar7.f1639d = typedArray.getInteger(index, cVar7.f1639d);
                    continue;
                    break;
                case 83:
                    e eVar12 = aVar.f1623f;
                    eVar12.j = o(typedArray, index, eVar12.j);
                    continue;
                    break;
                case 84:
                    c cVar8 = aVar.f1621d;
                    cVar8.l = typedArray.getInteger(index, cVar8.l);
                    continue;
                    break;
                case 85:
                    c cVar9 = aVar.f1621d;
                    cVar9.k = typedArray.getFloat(index, cVar9.k);
                    continue;
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        aVar.f1621d.o = typedArray.getResourceId(index, -1);
                        cVar2 = aVar.f1621d;
                        if (cVar2.o != -1) {
                            cVar2.n = -2;
                        } else {
                            continue;
                        }
                    } else if (i2 == 3) {
                        aVar.f1621d.m = typedArray.getString(index);
                        if (aVar.f1621d.m.indexOf("/") > 0) {
                            aVar.f1621d.o = typedArray.getResourceId(index, -1);
                            cVar2 = aVar.f1621d;
                            cVar2.n = -2;
                        } else {
                            aVar.f1621d.n = -1;
                        }
                    } else {
                        c cVar10 = aVar.f1621d;
                        cVar10.n = typedArray.getInteger(index, cVar10.o);
                    }
                    break;
                case 87:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
                case 91:
                    b bVar54 = aVar.f1622e;
                    bVar54.t = o(typedArray, index, bVar54.t);
                    continue;
                    break;
                case 92:
                    b bVar55 = aVar.f1622e;
                    bVar55.u = o(typedArray, index, bVar55.u);
                    continue;
                    break;
                case 93:
                    b bVar56 = aVar.f1622e;
                    bVar56.O = typedArray.getDimensionPixelSize(index, bVar56.O);
                    continue;
                    break;
                case 94:
                    b bVar57 = aVar.f1622e;
                    bVar57.V = typedArray.getDimensionPixelSize(index, bVar57.V);
                    continue;
                    break;
                case 95:
                    p(aVar.f1622e, typedArray, index, 0);
                    continue;
                    break;
                case 96:
                    p(aVar.f1622e, typedArray, index, 1);
                    continue;
                    break;
                case 97:
                    b bVar58 = aVar.f1622e;
                    bVar58.r0 = typedArray.getInt(index, bVar58.r0);
                    continue;
                    break;
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1613b.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
        b bVar59 = aVar.f1622e;
        if (bVar59.m0 != null) {
            bVar59.l0 = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007e  */
    private static void t(Context context, a aVar, TypedArray typedArray) {
        int i;
        int i2;
        int i3;
        int i4;
        int dimensionPixelOffset;
        int i5;
        int layoutDimension;
        int i6;
        float f2;
        float dimension;
        int i7;
        int i8;
        boolean z;
        int i9;
        c cVar;
        StringBuilder sb;
        String str;
        int indexCount = typedArray.getIndexCount();
        a.C0045a c0045a = new a.C0045a();
        aVar.h = c0045a;
        aVar.f1621d.f1637b = false;
        aVar.f1622e.f1632c = false;
        aVar.f1620c.f1642a = false;
        aVar.f1623f.f1648b = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            float f3 = 1.0f;
            int i11 = 21;
            switch (f1614c.get(index)) {
                case 2:
                    i = 2;
                    i2 = aVar.f1622e.L;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    sb.append(str);
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f1613b.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                case 5:
                    i3 = 5;
                    c0045a.c(i3, typedArray.getString(index));
                    break;
                case 6:
                    i = 6;
                    i4 = aVar.f1622e.F;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i4);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 7:
                    i = 7;
                    i4 = aVar.f1622e.G;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i4);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        i = 8;
                        i2 = aVar.f1622e.M;
                        dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                        c0045a.b(i, dimensionPixelOffset);
                    }
                    break;
                case 11:
                    i = 11;
                    i2 = aVar.f1622e.S;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 12:
                    i = 12;
                    i2 = aVar.f1622e.T;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 13:
                    i = 13;
                    i2 = aVar.f1622e.P;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 14:
                    i = 14;
                    i2 = aVar.f1622e.R;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 15:
                    i = 15;
                    i2 = aVar.f1622e.U;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 16:
                    i = 16;
                    i2 = aVar.f1622e.Q;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 17:
                    c0045a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f1622e.g));
                    break;
                case 18:
                    i = 18;
                    i4 = aVar.f1622e.h;
                    dimensionPixelOffset = typedArray.getDimensionPixelOffset(index, i4);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 19:
                    i5 = 19;
                    f3 = aVar.f1622e.i;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 20:
                    i5 = 20;
                    f3 = aVar.f1622e.z;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 21:
                    layoutDimension = typedArray.getLayoutDimension(index, aVar.f1622e.f1635f);
                    c0045a.b(i11, layoutDimension);
                    break;
                case 22:
                    i = 22;
                    dimensionPixelOffset = f1612a[typedArray.getInt(index, aVar.f1620c.f1643b)];
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 23:
                    i = 23;
                    dimensionPixelOffset = typedArray.getLayoutDimension(index, aVar.f1622e.f1634e);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 24:
                    i = 24;
                    i2 = aVar.f1622e.I;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 27:
                    i = 27;
                    i6 = aVar.f1622e.H;
                    dimensionPixelOffset = typedArray.getInt(index, i6);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 28:
                    i = 28;
                    i2 = aVar.f1622e.J;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        i = 31;
                        i2 = aVar.f1622e.N;
                        dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                        c0045a.b(i, dimensionPixelOffset);
                    }
                    break;
                case 34:
                    i = 34;
                    i2 = aVar.f1622e.K;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 37:
                    i5 = 37;
                    f3 = aVar.f1622e.A;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 38:
                    dimensionPixelOffset = typedArray.getResourceId(index, aVar.f1618a);
                    aVar.f1618a = dimensionPixelOffset;
                    i = 38;
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 39:
                    i5 = 39;
                    f3 = aVar.f1622e.X;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 40:
                    i5 = 40;
                    f3 = aVar.f1622e.W;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 41:
                    i = 41;
                    i6 = aVar.f1622e.Y;
                    dimensionPixelOffset = typedArray.getInt(index, i6);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 42:
                    i = 42;
                    i6 = aVar.f1622e.Z;
                    dimensionPixelOffset = typedArray.getInt(index, i6);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 43:
                    i5 = 43;
                    f3 = aVar.f1620c.f1645d;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        i5 = 44;
                        c0045a.d(44, true);
                        f2 = aVar.f1623f.o;
                        dimension = typedArray.getDimension(index, f2);
                        c0045a.a(i5, dimension);
                    }
                    break;
                case 45:
                    i5 = 45;
                    f3 = aVar.f1623f.f1650d;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 46:
                    i5 = 46;
                    f3 = aVar.f1623f.f1651e;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 47:
                    i5 = 47;
                    f3 = aVar.f1623f.f1652f;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 48:
                    i5 = 48;
                    f3 = aVar.f1623f.g;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 49:
                    i5 = 49;
                    f2 = aVar.f1623f.h;
                    dimension = typedArray.getDimension(index, f2);
                    c0045a.a(i5, dimension);
                    break;
                case 50:
                    i5 = 50;
                    f2 = aVar.f1623f.i;
                    dimension = typedArray.getDimension(index, f2);
                    c0045a.a(i5, dimension);
                    break;
                case 51:
                    i5 = 51;
                    f2 = aVar.f1623f.k;
                    dimension = typedArray.getDimension(index, f2);
                    c0045a.a(i5, dimension);
                    break;
                case 52:
                    i5 = 52;
                    f2 = aVar.f1623f.l;
                    dimension = typedArray.getDimension(index, f2);
                    c0045a.a(i5, dimension);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        i5 = 53;
                        f2 = aVar.f1623f.m;
                        dimension = typedArray.getDimension(index, f2);
                        c0045a.a(i5, dimension);
                    }
                    break;
                case 54:
                    i = 54;
                    i6 = aVar.f1622e.a0;
                    dimensionPixelOffset = typedArray.getInt(index, i6);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 55:
                    i = 55;
                    i6 = aVar.f1622e.b0;
                    dimensionPixelOffset = typedArray.getInt(index, i6);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 56:
                    i = 56;
                    i2 = aVar.f1622e.c0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 57:
                    i = 57;
                    i2 = aVar.f1622e.d0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 58:
                    i = 58;
                    i2 = aVar.f1622e.e0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 59:
                    i = 59;
                    i2 = aVar.f1622e.f0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 60:
                    i5 = 60;
                    f3 = aVar.f1623f.f1649c;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 62:
                    i = 62;
                    i2 = aVar.f1622e.D;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 63:
                    i5 = 63;
                    f3 = aVar.f1622e.E;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 64:
                    i = 64;
                    i7 = aVar.f1621d.f1638c;
                    dimensionPixelOffset = o(typedArray, index, i7);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 65:
                    c0045a.c(65, typedArray.peekValue(index).type == 3 ? typedArray.getString(index) : a.e.a.k.a.b.f263b[typedArray.getInteger(index, 0)]);
                    break;
                case 66:
                    i = 66;
                    dimensionPixelOffset = typedArray.getInt(index, 0);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 67:
                    i5 = 67;
                    f3 = aVar.f1621d.j;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 68:
                    i5 = 68;
                    f3 = aVar.f1620c.f1646e;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 69:
                    i5 = 69;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 70:
                    i5 = 70;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    i = 72;
                    i6 = aVar.f1622e.i0;
                    dimensionPixelOffset = typedArray.getInt(index, i6);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 73:
                    i = 73;
                    i2 = aVar.f1622e.j0;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 74:
                    i3 = 74;
                    c0045a.c(i3, typedArray.getString(index));
                    break;
                case 75:
                    i8 = 75;
                    z = aVar.f1622e.q0;
                    c0045a.d(i8, typedArray.getBoolean(index, z));
                    break;
                case 76:
                    i = 76;
                    i6 = aVar.f1621d.f1641f;
                    dimensionPixelOffset = typedArray.getInt(index, i6);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 77:
                    i3 = 77;
                    c0045a.c(i3, typedArray.getString(index));
                    break;
                case 78:
                    i = 78;
                    i6 = aVar.f1620c.f1644c;
                    dimensionPixelOffset = typedArray.getInt(index, i6);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 79:
                    i5 = 79;
                    f3 = aVar.f1621d.h;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 80:
                    i8 = 80;
                    z = aVar.f1622e.o0;
                    c0045a.d(i8, typedArray.getBoolean(index, z));
                    break;
                case 81:
                    i8 = 81;
                    z = aVar.f1622e.p0;
                    c0045a.d(i8, typedArray.getBoolean(index, z));
                    break;
                case 82:
                    i = 82;
                    i9 = aVar.f1621d.f1639d;
                    dimensionPixelOffset = typedArray.getInteger(index, i9);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 83:
                    i = 83;
                    i7 = aVar.f1623f.j;
                    dimensionPixelOffset = o(typedArray, index, i7);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 84:
                    i = 84;
                    i9 = aVar.f1621d.l;
                    dimensionPixelOffset = typedArray.getInteger(index, i9);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 85:
                    i5 = 85;
                    f3 = aVar.f1621d.k;
                    dimension = typedArray.getFloat(index, f3);
                    c0045a.a(i5, dimension);
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    i11 = 88;
                    if (i12 == 1) {
                        aVar.f1621d.o = typedArray.getResourceId(index, -1);
                        c0045a.b(89, aVar.f1621d.o);
                        cVar = aVar.f1621d;
                        if (cVar.o != -1) {
                            cVar.n = -2;
                            c0045a.b(88, -2);
                        }
                    } else if (i12 == 3) {
                        aVar.f1621d.m = typedArray.getString(index);
                        c0045a.c(90, aVar.f1621d.m);
                        if (aVar.f1621d.m.indexOf("/") > 0) {
                            aVar.f1621d.o = typedArray.getResourceId(index, -1);
                            c0045a.b(89, aVar.f1621d.o);
                            cVar = aVar.f1621d;
                            cVar.n = -2;
                            c0045a.b(88, -2);
                        } else {
                            aVar.f1621d.n = -1;
                            c0045a.b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f1621d;
                        cVar2.n = typedArray.getInteger(index, cVar2.o);
                        layoutDimension = aVar.f1621d.n;
                        c0045a.b(i11, layoutDimension);
                    }
                    break;
                case 87:
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    sb.append(str);
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(f1613b.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                case 93:
                    i = 93;
                    i2 = aVar.f1622e.O;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 94:
                    i = 94;
                    i2 = aVar.f1622e.V;
                    dimensionPixelOffset = typedArray.getDimensionPixelSize(index, i2);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 95:
                    p(c0045a, typedArray, index, 0);
                    break;
                case 96:
                    p(c0045a, typedArray, index, 1);
                    break;
                case 97:
                    i = 97;
                    i6 = aVar.f1622e.r0;
                    dimensionPixelOffset = typedArray.getInt(index, i6);
                    c0045a.b(i, dimensionPixelOffset);
                    break;
                case 98:
                    if (a.e.b.b.j.z) {
                        int resourceId = typedArray.getResourceId(index, aVar.f1618a);
                        aVar.f1618a = resourceId;
                        if (resourceId == -1) {
                            aVar.f1619b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f1619b = typedArray.getString(index);
                    } else {
                        aVar.f1618a = typedArray.getResourceId(index, aVar.f1618a);
                    }
                    break;
                case 99:
                    i8 = 99;
                    z = aVar.f1622e.j;
                    c0045a.d(i8, typedArray.getBoolean(index, z));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.h.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.h.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + a.e.b.b.a.b(childAt));
            } else {
                if (this.g && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.h.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = this.h.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f1622e.k0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(aVar.f1622e.i0);
                                barrier.setMargin(aVar.f1622e.j0);
                                barrier.setAllowsGoneWidget(aVar.f1622e.q0);
                                b bVar = aVar.f1622e;
                                int[] iArr = bVar.l0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.m0;
                                    if (str != null) {
                                        bVar.l0 = j(barrier, str);
                                        barrier.setReferencedIds(aVar.f1622e.l0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.d(bVar2);
                            if (z) {
                                androidx.constraintlayout.widget.a.e(childAt, aVar.g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0046d c0046d = aVar.f1620c;
                            if (c0046d.f1644c == 0) {
                                childAt.setVisibility(c0046d.f1643b);
                            }
                            int i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 17) {
                                childAt.setAlpha(aVar.f1620c.f1645d);
                                childAt.setRotation(aVar.f1623f.f1649c);
                                childAt.setRotationX(aVar.f1623f.f1650d);
                                childAt.setRotationY(aVar.f1623f.f1651e);
                                childAt.setScaleX(aVar.f1623f.f1652f);
                                childAt.setScaleY(aVar.f1623f.g);
                                e eVar = aVar.f1623f;
                                if (eVar.j != -1) {
                                    View viewFindViewById = ((View) childAt.getParent()).findViewById(aVar.f1623f.j);
                                    if (viewFindViewById != null) {
                                        float top = (viewFindViewById.getTop() + viewFindViewById.getBottom()) / 2.0f;
                                        float left = (viewFindViewById.getLeft() + viewFindViewById.getRight()) / 2.0f;
                                        if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                            float left2 = left - childAt.getLeft();
                                            float top2 = top - childAt.getTop();
                                            childAt.setPivotX(left2);
                                            childAt.setPivotY(top2);
                                        }
                                    }
                                } else {
                                    if (!Float.isNaN(eVar.h)) {
                                        childAt.setPivotX(aVar.f1623f.h);
                                    }
                                    if (!Float.isNaN(aVar.f1623f.i)) {
                                        childAt.setPivotY(aVar.f1623f.i);
                                    }
                                }
                                childAt.setTranslationX(aVar.f1623f.k);
                                childAt.setTranslationY(aVar.f1623f.l);
                                if (i2 >= 21) {
                                    childAt.setTranslationZ(aVar.f1623f.m);
                                    e eVar2 = aVar.f1623f;
                                    if (eVar2.n) {
                                        childAt.setElevation(eVar2.o);
                                    }
                                }
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = this.h.get(num);
            if (aVar2 != null) {
                if (aVar2.f1622e.k0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f1622e;
                    int[] iArr2 = bVar3.l0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.m0;
                        if (str2 != null) {
                            bVar3.l0 = j(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1622e.l0);
                        }
                    }
                    barrier2.setType(aVar2.f1622e.i0);
                    barrier2.setMargin(aVar2.f1622e.j0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.s();
                    aVar2.d(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (aVar2.f1622e.f1631b) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.d(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).i(constraintLayout);
            }
        }
    }

    public void e(int i, int i2) {
        a aVar;
        if (!this.h.containsKey(Integer.valueOf(i)) || (aVar = this.h.get(Integer.valueOf(i))) == null) {
            return;
        }
        switch (i2) {
            case 1:
                b bVar = aVar.f1622e;
                bVar.l = -1;
                bVar.k = -1;
                bVar.I = -1;
                bVar.P = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.f1622e;
                bVar2.n = -1;
                bVar2.m = -1;
                bVar2.J = -1;
                bVar2.R = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.f1622e;
                bVar3.p = -1;
                bVar3.o = -1;
                bVar3.K = 0;
                bVar3.Q = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.f1622e;
                bVar4.q = -1;
                bVar4.r = -1;
                bVar4.L = 0;
                bVar4.S = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.f1622e;
                bVar5.s = -1;
                bVar5.t = -1;
                bVar5.u = -1;
                bVar5.O = 0;
                bVar5.V = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.f1622e;
                bVar6.v = -1;
                bVar6.w = -1;
                bVar6.N = 0;
                bVar6.U = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.f1622e;
                bVar7.x = -1;
                bVar7.y = -1;
                bVar7.M = 0;
                bVar7.T = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.f1622e;
                bVar8.E = -1.0f;
                bVar8.D = -1;
                bVar8.C = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void f(Context context, int i) {
        g((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public void g(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.h.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.h.containsKey(Integer.valueOf(id))) {
                this.h.put(Integer.valueOf(id), new a());
            }
            a aVar = this.h.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = androidx.constraintlayout.widget.a.a(this.f1617f, childAt);
                aVar.f(id, bVar);
                aVar.f1620c.f1643b = childAt.getVisibility();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 17) {
                    aVar.f1620c.f1645d = childAt.getAlpha();
                    aVar.f1623f.f1649c = childAt.getRotation();
                    aVar.f1623f.f1650d = childAt.getRotationX();
                    aVar.f1623f.f1651e = childAt.getRotationY();
                    aVar.f1623f.f1652f = childAt.getScaleX();
                    aVar.f1623f.g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        e eVar = aVar.f1623f;
                        eVar.h = pivotX;
                        eVar.i = pivotY;
                    }
                    aVar.f1623f.k = childAt.getTranslationX();
                    aVar.f1623f.l = childAt.getTranslationY();
                    if (i2 >= 21) {
                        aVar.f1623f.m = childAt.getTranslationZ();
                        e eVar2 = aVar.f1623f;
                        if (eVar2.n) {
                            eVar2.o = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1622e.q0 = barrier.getAllowsGoneWidget();
                    aVar.f1622e.l0 = barrier.getReferencedIds();
                    aVar.f1622e.i0 = barrier.getType();
                    aVar.f1622e.j0 = barrier.getMargin();
                }
            }
        }
    }

    public void h(androidx.constraintlayout.widget.e eVar) {
        int childCount = eVar.getChildCount();
        this.h.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = eVar.getChildAt(i);
            androidx.constraintlayout.widget.e.a aVar = (androidx.constraintlayout.widget.e.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.g && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.h.containsKey(Integer.valueOf(id))) {
                this.h.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.h.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof androidx.constraintlayout.widget.b) {
                    aVar2.h((androidx.constraintlayout.widget.b) childAt, id, aVar);
                }
                aVar2.g(id, aVar);
            }
        }
    }

    public void i(int i, int i2, int i3, float f2) {
        b bVar = l(i).f1622e;
        bVar.C = i2;
        bVar.D = i3;
        bVar.E = f2;
    }

    public void m(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarK = k(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarK.f1622e.f1631b = true;
                    }
                    this.h.put(Integer.valueOf(aVarK.f1618a), aVarK);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public void n(Context context, XmlPullParser xmlPullParser) {
        a aVarK;
        try {
            int eventType = xmlPullParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    switch (xmlPullParser.getName()) {
                        case "Constraint":
                            aVarK = k(context, Xml.asAttributeSet(xmlPullParser), false);
                            break;
                        case "ConstraintOverride":
                            aVarK = k(context, Xml.asAttributeSet(xmlPullParser), true);
                            break;
                        case "Guideline":
                            aVarK = k(context, Xml.asAttributeSet(xmlPullParser), false);
                            b bVar = aVarK.f1622e;
                            bVar.f1631b = true;
                            bVar.f1632c = true;
                            break;
                        case "Barrier":
                            aVarK = k(context, Xml.asAttributeSet(xmlPullParser), false);
                            aVarK.f1622e.k0 = 1;
                            break;
                        case "PropertySet":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar.f1620c.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Transform":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar.f1623f.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Layout":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar.f1622e.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "Motion":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            aVar.f1621d.b(context, Xml.asAttributeSet(xmlPullParser));
                            continue;
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                            }
                            androidx.constraintlayout.widget.a.d(context, xmlPullParser, aVar.g);
                            continue;
                            break;
                            break;
                        default:
                            continue;
                            break;
                    }
                    aVar = aVarK;
                } else if (eventType == 3) {
                    String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.h.put(Integer.valueOf(aVar.f1618a), aVar);
                        aVar = null;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
