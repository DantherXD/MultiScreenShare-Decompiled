package a.e.a.m;

import a.e.a.m.m.n;
import a.e.a.m.m.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static float f308a = 0.5f;
    int A0;
    boolean B0;
    boolean C0;
    public float[] D0;
    protected e[] E0;
    protected e[] F0;
    e G0;
    e H0;
    public int I0;
    public int J0;
    private boolean L;
    public d W;
    public d[] X;
    protected ArrayList<d> Y;
    private boolean[] Z;
    public b[] a0;
    public e b0;
    int c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a.e.a.m.m.c f311d;
    int d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a.e.a.m.m.c f312e;
    public float e0;
    protected int f0;
    protected int g0;
    protected int h0;
    int i0;
    int j0;
    protected int k0;
    protected int l0;
    int m0;
    protected int n0;
    protected int o0;
    public String p;
    float p0;
    float q0;
    private Object r0;
    private int s0;
    private int t0;
    private String u0;
    private String v0;
    boolean w0;
    boolean x0;
    boolean y0;
    int z0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f309b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p[] f310c = new p[2];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a.e.a.m.m.l f313f = null;
    public n g = null;
    public boolean[] h = {true, true};
    boolean i = false;
    private boolean j = true;
    private boolean k = false;
    private boolean l = true;
    private int m = -1;
    private int n = -1;
    public a.e.a.l.a o = new a.e.a.l.a(this);
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    public int u = -1;
    public int v = -1;
    private int w = 0;
    public int x = 0;
    public int y = 0;
    public int[] z = new int[2];
    public int A = 0;
    public int B = 0;
    public float C = 1.0f;
    public int D = 0;
    public int E = 0;
    public float F = 1.0f;
    int G = -1;
    float H = 1.0f;
    private int[] I = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float J = 0.0f;
    private boolean K = false;
    private boolean M = false;
    private int N = 0;
    private int O = 0;
    public d P = new d(this, d.b.LEFT);
    public d Q = new d(this, d.b.TOP);
    public d R = new d(this, d.b.RIGHT);
    public d S = new d(this, d.b.BOTTOM);
    public d T = new d(this, d.b.BASELINE);
    d U = new d(this, d.b.CENTER_X);
    d V = new d(this, d.b.CENTER_Y);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f315b;

        static {
            int[] iArr = new int[b.values().length];
            f315b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f315b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f315b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f315b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f314a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f314a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f314a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f314a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f314a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f314a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f314a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f314a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f314a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.W = dVar;
        this.X = new d[]{this.P, this.R, this.Q, this.S, this.T, dVar};
        this.Y = new ArrayList<>();
        this.Z = new boolean[2];
        b bVar = b.FIXED;
        this.a0 = new b[]{bVar, bVar};
        this.b0 = null;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.0f;
        this.f0 = -1;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        float f2 = f308a;
        this.p0 = f2;
        this.q0 = f2;
        this.s0 = 0;
        this.t0 = 0;
        this.u0 = null;
        this.v0 = null;
        this.y0 = false;
        this.z0 = 0;
        this.A0 = 0;
        this.D0 = new float[]{-1.0f, -1.0f};
        this.E0 = new e[]{null, null};
        this.F0 = new e[]{null, null};
        this.G0 = null;
        this.H0 = null;
        this.I0 = -1;
        this.J0 = -1;
        d();
    }

    private void N(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, int i6, float f2, float f3) {
        sb.append(str);
        sb.append(" :  {\n");
        v0(sb, "      size", i, 0);
        v0(sb, "      min", i2, 0);
        v0(sb, "      max", i3, Integer.MAX_VALUE);
        v0(sb, "      matchMin", i5, 0);
        v0(sb, "      matchDef", i6, 0);
        u0(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    private void O(StringBuilder sb, String str, d dVar) {
        if (dVar.f301f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(dVar.f301f);
        sb.append("'");
        if (dVar.h != Integer.MIN_VALUE || dVar.g != 0) {
            sb.append(",");
            sb.append(dVar.g);
            if (dVar.h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(dVar.h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    private void d() {
        this.Y.add(this.P);
        this.Y.add(this.Q);
        this.Y.add(this.R);
        this.Y.add(this.S);
        this.Y.add(this.U);
        this.Y.add(this.V);
        this.Y.add(this.W);
        this.Y.add(this.T);
    }

    private boolean d0(int i) {
        int i2 = i * 2;
        d[] dVarArr = this.X;
        if (dVarArr[i2].f301f != null && dVarArr[i2].f301f.f301f != dVarArr[i2]) {
            int i3 = i2 + 1;
            if (dVarArr[i3].f301f != null && dVarArr[i3].f301f.f301f == dVarArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0163  */
    /* JADX WARN: Code duplicated, block: B:102:0x0166  */
    /* JADX WARN: Code duplicated, block: B:108:0x0188  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:206:0x031d  */
    /* JADX WARN: Code duplicated, block: B:207:0x0321  */
    /* JADX WARN: Code duplicated, block: B:244:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:246:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:252:0x0408  */
    /* JADX WARN: Code duplicated, block: B:254:0x043d  */
    /* JADX WARN: Code duplicated, block: B:262:0x0460  */
    /* JADX WARN: Code duplicated, block: B:272:0x0478  */
    /* JADX WARN: Code duplicated, block: B:275:0x0492  */
    /* JADX WARN: Code duplicated, block: B:285:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:288:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:289:0x04b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:309:0x04df  */
    /* JADX WARN: Code duplicated, block: B:311:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:313:0x04e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x0501 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:320:0x0503  */
    /* JADX WARN: Code duplicated, block: B:321:0x0508  */
    /* JADX WARN: Code duplicated, block: B:323:0x050b  */
    /* JADX WARN: Code duplicated, block: B:324:0x0510  */
    /* JADX WARN: Code duplicated, block: B:326:0x0513 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:359:0x0566 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:378:0x059a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095  */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:391:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:60:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:0x0116  */
    /* JADX WARN: Code duplicated, block: B:76:0x0118  */
    /* JADX WARN: Code duplicated, block: B:82:0x0121  */
    /* JADX WARN: Code duplicated, block: B:84:0x012c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0133  */
    /* JADX WARN: Code duplicated, block: B:90:0x0136  */
    /* JADX WARN: Code duplicated, block: B:91:0x013c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0143  */
    /* JADX WARN: Code duplicated, block: B:96:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x014a  */
    /* JADX WARN: Code duplicated, block: B:98:0x014e  */
    /* JADX WARN: Multi-variable type inference failed */
    private void i(a.e.a.d dVar, boolean z, boolean z2, boolean z3, boolean z4, a.e.a.i iVar, a.e.a.i iVar2, b bVar, boolean z5, d dVar2, d dVar3, int i, int i2, int i3, int i4, float f2, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f3, boolean z11) {
        int i9;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int iMin;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z13;
        d.b bVarJ;
        d.b bVar2;
        a.e.a.i iVarQ;
        e eVar;
        d.b bVar3;
        boolean z14;
        d dVar4;
        int iE;
        int i18;
        boolean z15;
        char c2;
        int i19;
        boolean z16;
        boolean z17;
        int i20;
        boolean z18;
        a.e.a.i iVar3;
        int i21;
        int i22;
        boolean z19;
        boolean z20;
        a.e.a.i iVar4;
        e eVar2;
        e eVar3;
        a.e.a.i iVar5;
        e eVar4;
        int i23;
        int i24;
        int iE2;
        int iMin2;
        int i25;
        int i26;
        boolean z21;
        int i27;
        int i28;
        boolean z22;
        int i29;
        int i30;
        boolean z23;
        e eVar5;
        e eVar6;
        int i31 = i8;
        a.e.a.i iVarQ2 = dVar.q(dVar2);
        a.e.a.i iVarQ3 = dVar.q(dVar3);
        a.e.a.i iVarQ4 = dVar.q(dVar2.i());
        a.e.a.i iVarQ5 = dVar.q(dVar3.i());
        if (a.e.a.d.w() != null) {
            a.e.a.d.w();
            throw null;
        }
        boolean zN = dVar2.n();
        boolean zN2 = dVar3.n();
        boolean zN3 = this.W.n();
        int i32 = zN2 ? (zN ? 1 : 0) + 1 : zN ? 1 : 0;
        if (zN3) {
            i32++;
        }
        int i33 = z6 ? 3 : i5;
        int i34 = a.f315b[bVar.ordinal()];
        if (i34 != 1 && i34 != 2 && i34 != 3 && i34 == 4) {
            i9 = i33;
            z12 = i9 != 4;
            i10 = this.m;
            if (i10 != -1 && z) {
                this.m = -1;
                i2 = i10;
                z12 = false;
            }
            i11 = this.n;
            if (i11 != -1 || z) {
                i11 = i2;
            } else {
                this.n = -1;
                z12 = false;
            }
            i12 = i11;
            if (this.t0 == 8) {
                iMin = 0;
                z12 = false;
            } else {
                iMin = i12;
            }
            if (!z11) {
                if (zN && !zN2 && !zN3) {
                    dVar.f(iVarQ2, i);
                } else if (zN && !zN2) {
                    i13 = 8;
                    dVar.e(iVarQ2, iVarQ4, dVar2.e(), 8);
                }
                i13 = 8;
            } else {
                i13 = 8;
            }
            if (!z12) {
                if (i32 == 2 && !z6 && (i9 == 1 || i9 == 0)) {
                    int iMax = Math.max(i7, iMin);
                    if (i31 > 0) {
                        iMax = Math.min(i31, iMax);
                    }
                    dVar.e(iVarQ3, iVarQ2, iMax, 8);
                    z13 = false;
                } else {
                    if (i7 == -2) {
                        i14 = iMin;
                    } else {
                        i14 = i7;
                    }
                    if (i31 == -2) {
                        i15 = iMin;
                    } else {
                        i15 = i31;
                    }
                    if (iMin > 0 && i9 != 1) {
                        iMin = 0;
                    }
                    if (i14 > 0) {
                        dVar.h(iVarQ3, iVarQ2, i14, 8);
                        iMin = Math.max(iMin, i14);
                    }
                    if (i15 > 0) {
                        if (z2 || i9 != 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            i16 = 8;
                            dVar.j(iVarQ3, iVarQ2, i15, 8);
                        } else {
                            i16 = 8;
                        }
                        iMin = Math.min(iMin, i15);
                    } else {
                        i16 = 8;
                    }
                    if (i9 == 1) {
                        if (z2) {
                            dVar.e(iVarQ3, iVarQ2, iMin, i16);
                        } else {
                            dVar.e(iVarQ3, iVarQ2, iMin, 5);
                            dVar.j(iVarQ3, iVarQ2, iMin, i16);
                        }
                        i31 = i15;
                        i32 = i32 == true ? 1 : 0;
                        iVarQ3 = iVarQ3;
                        z13 = z12;
                        iVarQ5 = iVarQ5;
                        z4 = z4;
                        i17 = i14;
                        iVarQ4 = iVarQ4;
                    } else if (i9 == 2) {
                        bVarJ = dVar2.j();
                        bVar2 = d.b.TOP;
                        if (bVarJ != bVar2 || dVar2.j() == d.b.BOTTOM) {
                            iVarQ = dVar.q(this.b0.m(bVar2));
                            eVar = this.b0;
                            bVar3 = d.b.BOTTOM;
                        } else {
                            iVarQ = dVar.q(this.b0.m(d.b.LEFT));
                            eVar = this.b0;
                            bVar3 = d.b.RIGHT;
                        }
                        a.e.a.i iVarQ6 = dVar.q(eVar.m(bVar3));
                        a.e.a.i iVar6 = iVarQ;
                        a.e.a.b bVarR = dVar.r();
                        int i35 = i15;
                        i32 = i32 == true ? 1 : 0;
                        iVarQ5 = iVarQ5;
                        int i36 = i14;
                        iVarQ4 = iVarQ4;
                        iVarQ3 = iVarQ3;
                        dVar.d(bVarR.k(iVarQ3, iVarQ2, iVarQ6, iVar6, f3));
                        if (z2) {
                            z12 = false;
                        }
                        i31 = i35;
                        i17 = i36;
                        z13 = z12;
                        z4 = z4;
                    } else {
                        int i37 = i15;
                        int i38 = i14;
                        i32 = i32 == true ? 1 : 0;
                        iVarQ4 = iVarQ4;
                        iVarQ3 = iVarQ3;
                        iVarQ5 = iVarQ5;
                        i31 = i37;
                        i17 = i38;
                        z13 = z12;
                        z4 = true;
                    }
                }
                if (z11 || z8) {
                    if (i32 >= 2 && z2 && z4) {
                        dVar.h(iVarQ2, iVar, 0, 8);
                        Object[] objArr = z || this.T.f301f == null;
                        if (!z && (dVar4 = this.T.f301f) != null) {
                            e eVar7 = dVar4.f299d;
                            if (eVar7.e0 != 0.0f) {
                                b[] bVarArr = eVar7.a0;
                                b bVar4 = bVarArr[0];
                                b bVar5 = b.MATCH_CONSTRAINT;
                                if (bVar4 == bVar5 && bVarArr[1] == bVar5) {
                                    objArr = true;
                                } else {
                                    objArr = false;
                                }
                            } else {
                                objArr = false;
                            }
                        }
                        if (objArr == true) {
                            dVar.h(iVar2, iVarQ3, 0, 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (zN || zN2 || zN3) {
                    if (!zN || zN2) {
                        if (zN || !zN2) {
                            iE = 0;
                            if (zN && zN2) {
                                e eVar8 = dVar2.f301f.f299d;
                                boolean z24 = false;
                                e eVar9 = dVar3.f301f.f299d;
                                e eVarI = I();
                                int i39 = 6;
                                if (z13) {
                                    if (i9 == 0) {
                                        if (i31 != 0 || i17 != 0) {
                                            z22 = false;
                                            i29 = 5;
                                            i30 = 5;
                                            z23 = true;
                                            z17 = true;
                                        } else if (iVarQ4.i && iVarQ5.i) {
                                            dVar.e(iVarQ2, iVarQ4, dVar2.e(), 8);
                                            dVar.e(iVarQ3, iVarQ5, -dVar3.e(), 8);
                                            return;
                                        } else {
                                            i29 = 8;
                                            i30 = 8;
                                            z23 = false;
                                            z17 = false;
                                            z22 = true;
                                        }
                                        if ((eVar8 instanceof a.e.a.m.a) || (eVar9 instanceof a.e.a.m.a)) {
                                            i19 = i29;
                                            z16 = z23;
                                            z24 = z22;
                                            c2 = 5;
                                            z15 = true;
                                            i20 = 4;
                                            iVar2 = iVar2;
                                        } else {
                                            i19 = i29;
                                            z16 = z23;
                                            z24 = z22;
                                            c2 = 5;
                                            z15 = true;
                                            iVar2 = iVar2;
                                            i20 = i30;
                                            i39 = 6;
                                        }
                                    } else {
                                        if (i9 == 2) {
                                            if ((eVar8 instanceof a.e.a.m.a) || (eVar9 instanceof a.e.a.m.a)) {
                                                c2 = 5;
                                                z15 = true;
                                                i20 = 4;
                                            } else {
                                                c2 = 5;
                                                z15 = true;
                                                i20 = 5;
                                            }
                                            i19 = 5;
                                        } else if (i9 == 1) {
                                            iVar2 = iVar2;
                                            z24 = false;
                                            i39 = 6;
                                            c2 = 5;
                                            z15 = true;
                                            i20 = 4;
                                            i19 = 8;
                                        } else if (i9 != 3) {
                                            z15 = true;
                                            c2 = 5;
                                            i20 = 4;
                                            i19 = 5;
                                            z16 = false;
                                            z17 = false;
                                        } else if (this.G == -1) {
                                            iVar2 = iVar2;
                                            c2 = 5;
                                            z15 = true;
                                            if (z9) {
                                                i39 = z2 ? 5 : 4;
                                            } else {
                                                i39 = 8;
                                            }
                                            i20 = 5;
                                            i19 = 8;
                                            z16 = true;
                                            z17 = true;
                                            z24 = true;
                                        } else if (z6) {
                                            if (i6 != 2) {
                                                z15 = true;
                                                if (i6 != 1) {
                                                    z21 = false;
                                                }
                                                if (z21) {
                                                    i27 = 5;
                                                    i28 = 4;
                                                } else {
                                                    i27 = 8;
                                                    i28 = 5;
                                                }
                                                i19 = i27;
                                                i20 = i28;
                                                z16 = z15;
                                                z17 = z16;
                                                z24 = z17;
                                                c2 = 5;
                                                iVar2 = iVar2;
                                            } else {
                                                z15 = true;
                                            }
                                            z21 = z15;
                                            if (z21) {
                                                i27 = 8;
                                                i28 = 5;
                                            } else {
                                                i27 = 5;
                                                i28 = 4;
                                            }
                                            i19 = i27;
                                            i20 = i28;
                                            z16 = z15;
                                            z17 = z16;
                                            z24 = z17;
                                            c2 = 5;
                                            iVar2 = iVar2;
                                        } else {
                                            z15 = true;
                                            if (i31 > 0) {
                                                z16 = true;
                                                z17 = true;
                                                z24 = true;
                                                c2 = 5;
                                                i20 = 5;
                                            } else if (i31 != 0 || i17 != 0) {
                                                z16 = true;
                                                z17 = true;
                                                z24 = true;
                                                c2 = 5;
                                                i20 = 4;
                                            } else if (z9) {
                                                iVar2 = iVar2;
                                                i19 = (eVar8 == eVarI || eVar9 == eVarI) ? 5 : 4;
                                                z16 = true;
                                                z17 = true;
                                                z24 = true;
                                                i39 = 6;
                                                c2 = 5;
                                                i20 = 4;
                                            } else {
                                                z16 = true;
                                                z17 = true;
                                                z24 = true;
                                                c2 = 5;
                                                i20 = 8;
                                            }
                                            i19 = 5;
                                        }
                                        z16 = true;
                                        z17 = true;
                                    }
                                    if (z17 || iVarQ4 != iVarQ5 || eVar8 == eVarI) {
                                        z18 = z15;
                                    } else {
                                        z17 = false;
                                        z18 = false;
                                    }
                                    if (z16) {
                                        if (z13 && !z7 && !z9 && iVarQ4 == iVar && iVarQ5 == iVar2) {
                                            z19 = false;
                                            i19 = 8;
                                            i26 = 8;
                                            z18 = false;
                                        } else {
                                            i26 = i39;
                                            z19 = z2;
                                        }
                                        iVar3 = iVarQ4;
                                        i21 = 8;
                                        i22 = 4;
                                        dVar.c(iVarQ2, iVar3, dVar2.e(), f2, iVarQ5, iVarQ3, dVar3.e(), i26);
                                    } else {
                                        iVar3 = iVarQ4;
                                        i21 = 8;
                                        i22 = 4;
                                        z19 = z2;
                                    }
                                    z20 = z18;
                                    if (this.t0 != i21 && !dVar3.l()) {
                                        return;
                                    }
                                    iVar4 = iVar3;
                                    if (z17) {
                                        if (z19 || iVar4 == iVarQ5 || z13) {
                                            eVar2 = eVar9;
                                            eVar3 = eVar8;
                                        } else {
                                            eVar3 = eVar8;
                                            if (eVar3 instanceof a.e.a.m.a) {
                                                eVar2 = eVar9;
                                            } else {
                                                eVar2 = eVar9;
                                                if (eVar2 instanceof a.e.a.m.a) {
                                                }
                                                iVar5 = iVarQ2;
                                                dVar.h(iVar5, iVar4, dVar2.e(), i25);
                                                dVar.j(iVarQ3, iVarQ5, -dVar3.e(), i25);
                                                i19 = i25;
                                            }
                                            i25 = 6;
                                            iVar5 = iVarQ2;
                                            dVar.h(iVar5, iVar4, dVar2.e(), i25);
                                            dVar.j(iVarQ3, iVarQ5, -dVar3.e(), i25);
                                            i19 = i25;
                                        }
                                        i25 = i19;
                                        iVar5 = iVarQ2;
                                        dVar.h(iVar5, iVar4, dVar2.e(), i25);
                                        dVar.j(iVarQ3, iVarQ5, -dVar3.e(), i25);
                                        i19 = i25;
                                    } else {
                                        eVar2 = eVar9;
                                        eVar3 = eVar8;
                                        iVar5 = iVarQ2;
                                    }
                                    if (z19 || !z10 || (eVar3 instanceof a.e.a.m.a) || (eVar2 instanceof a.e.a.m.a)) {
                                        eVar4 = eVarI;
                                    } else {
                                        eVar4 = eVarI;
                                        if (eVar2 != eVar4) {
                                            i23 = 6;
                                            i24 = 6;
                                            z20 = z15;
                                        }
                                        if (z20) {
                                            if (z24 || (z9 && !z3)) {
                                                iMin2 = i23;
                                            } else {
                                                int i40 = (eVar3 == eVar4 || eVar2 == eVar4) ? 6 : i23;
                                                if ((eVar3 instanceof g) || (eVar2 instanceof g)) {
                                                    i40 = 5;
                                                }
                                                if ((eVar3 instanceof a.e.a.m.a) || (eVar2 instanceof a.e.a.m.a)) {
                                                    i40 = 5;
                                                }
                                                if (z9) {
                                                    i40 = 5;
                                                }
                                                iMin2 = Math.max(i40, i23);
                                            }
                                            if (z19) {
                                                iMin2 = Math.min(i24, iMin2);
                                                if (z6 && !z9 && (eVar3 == eVar4 || eVar2 == eVar4)) {
                                                    iMin2 = i22;
                                                }
                                            }
                                            dVar.e(iVar5, iVar4, dVar2.e(), iMin2);
                                            dVar.e(iVarQ3, iVarQ5, -dVar3.e(), iMin2);
                                        }
                                        if (z19) {
                                            if (iVar == iVar4) {
                                                iE2 = dVar2.e();
                                            } else {
                                                iE2 = 0;
                                            }
                                            if (iVar4 != iVar) {
                                                i18 = 5;
                                                dVar.h(iVar5, iVar, iE2, 5);
                                            } else {
                                                i18 = 5;
                                            }
                                        } else {
                                            i18 = 5;
                                        }
                                        if (!z19 && z13) {
                                            iVarQ5 = iVarQ5;
                                            if (i3 == 0 && i17 == 0) {
                                                if (z13 && i9 == 3) {
                                                    iE = 0;
                                                    dVar.h(iVarQ3, iVar5, 0, i21);
                                                } else {
                                                    iE = 0;
                                                    dVar.h(iVarQ3, iVar5, 0, i18);
                                                }
                                            }
                                        }
                                        iE = 0;
                                    }
                                    i23 = i20;
                                    i24 = i19;
                                    if (z20) {
                                        if (z24) {
                                            iMin2 = i23;
                                        } else {
                                            iMin2 = i23;
                                        }
                                        if (z19) {
                                            iMin2 = Math.min(i24, iMin2);
                                            if (z6) {
                                                iMin2 = i22;
                                            }
                                        }
                                        dVar.e(iVar5, iVar4, dVar2.e(), iMin2);
                                        dVar.e(iVarQ3, iVarQ5, -dVar3.e(), iMin2);
                                    }
                                    if (z19) {
                                        i18 = 5;
                                    } else {
                                        if (iVar == iVar4) {
                                            iE2 = dVar2.e();
                                        } else {
                                            iE2 = 0;
                                        }
                                        if (iVar4 != iVar) {
                                            i18 = 5;
                                            dVar.h(iVar5, iVar, iE2, 5);
                                        } else {
                                            i18 = 5;
                                        }
                                    }
                                    if (!z19) {
                                    }
                                } else {
                                    z15 = true;
                                    if (iVarQ4.i && iVarQ5.i) {
                                        dVar.c(iVarQ2, iVarQ4, dVar2.e(), f2, iVarQ5, iVarQ3, dVar3.e(), 8);
                                        if (z2 && z4) {
                                            int iE3 = dVar3.f301f != null ? dVar3.e() : 0;
                                            if (iVarQ5 != iVar2) {
                                                dVar.h(iVar2, iVarQ3, iE3, 5);
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    c2 = 5;
                                    i19 = 5;
                                    z16 = true;
                                    z17 = true;
                                    i20 = 4;
                                }
                                z24 = false;
                                if (z17) {
                                    z18 = z15;
                                } else {
                                    z18 = z15;
                                }
                                if (z16) {
                                    if (z13) {
                                        i26 = i39;
                                        z19 = z2;
                                    } else {
                                        i26 = i39;
                                        z19 = z2;
                                    }
                                    iVar3 = iVarQ4;
                                    i21 = 8;
                                    i22 = 4;
                                    dVar.c(iVarQ2, iVar3, dVar2.e(), f2, iVarQ5, iVarQ3, dVar3.e(), i26);
                                } else {
                                    iVar3 = iVarQ4;
                                    i21 = 8;
                                    i22 = 4;
                                    z19 = z2;
                                }
                                z20 = z18;
                                if (this.t0 != i21) {
                                }
                                iVar4 = iVar3;
                                if (z17) {
                                    if (z19) {
                                        eVar2 = eVar9;
                                        eVar3 = eVar8;
                                        i25 = i19;
                                    } else {
                                        eVar2 = eVar9;
                                        eVar3 = eVar8;
                                        i25 = i19;
                                    }
                                    iVar5 = iVarQ2;
                                    dVar.h(iVar5, iVar4, dVar2.e(), i25);
                                    dVar.j(iVarQ3, iVarQ5, -dVar3.e(), i25);
                                    i19 = i25;
                                } else {
                                    eVar2 = eVar9;
                                    eVar3 = eVar8;
                                    iVar5 = iVarQ2;
                                }
                                if (z19) {
                                    eVar4 = eVarI;
                                    i23 = i20;
                                    i24 = i19;
                                } else {
                                    eVar4 = eVarI;
                                    i23 = i20;
                                    i24 = i19;
                                }
                                if (z20) {
                                    if (z24) {
                                        iMin2 = i23;
                                    } else {
                                        iMin2 = i23;
                                    }
                                    if (z19) {
                                        iMin2 = Math.min(i24, iMin2);
                                        if (z6) {
                                            iMin2 = i22;
                                        }
                                    }
                                    dVar.e(iVar5, iVar4, dVar2.e(), iMin2);
                                    dVar.e(iVarQ3, iVarQ5, -dVar3.e(), iMin2);
                                }
                                if (z19) {
                                    i18 = 5;
                                } else {
                                    if (iVar == iVar4) {
                                        iE2 = dVar2.e();
                                    } else {
                                        iE2 = 0;
                                    }
                                    if (iVar4 != iVar) {
                                        i18 = 5;
                                        dVar.h(iVar5, iVar, iE2, 5);
                                    } else {
                                        i18 = 5;
                                    }
                                }
                                if (!z19) {
                                }
                            } else {
                                i18 = 5;
                            }
                        } else {
                            dVar.e(iVarQ3, iVarQ5, -dVar3.e(), 8);
                            if (!z2) {
                                i18 = 5;
                                iE = 0;
                            } else if (this.k && iVarQ2.i && (eVar5 = this.b0) != null) {
                                f fVar = (f) eVar5;
                                if (z) {
                                    fVar.w1(dVar2);
                                } else {
                                    fVar.B1(dVar2);
                                }
                                i18 = 5;
                                iE = 0;
                            } else {
                                i18 = 5;
                                iE = 0;
                                dVar.h(iVarQ2, iVar, 0, 5);
                            }
                        }
                        z19 = z2;
                    } else {
                        z19 = z2;
                        i18 = (z2 && (dVar2.f301f.f299d instanceof a.e.a.m.a)) ? 8 : 5;
                    }
                    iVarQ5 = iVarQ5;
                    iE = 0;
                } else {
                    i18 = 5;
                    iE = 0;
                    z19 = z2;
                }
                if (z19 && z4) {
                    if (dVar3.f301f != null) {
                        iE = dVar3.e();
                    }
                    if (iVarQ5 != iVar2) {
                        if (!this.k || !iVarQ3.i || (eVar6 = this.b0) == null) {
                            dVar.h(iVar2, iVarQ3, iE, i18);
                            return;
                        }
                        f fVar2 = (f) eVar6;
                        if (z) {
                            fVar2.v1(dVar3);
                            return;
                        } else {
                            fVar2.A1(dVar3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (z5) {
                dVar.e(iVarQ3, iVarQ2, 0, 3);
                if (i3 > 0) {
                    dVar.h(iVarQ3, iVarQ2, i3, 8);
                }
                if (i4 < Integer.MAX_VALUE) {
                    dVar.j(iVarQ3, iVarQ2, i4, 8);
                }
            } else {
                dVar.e(iVarQ3, iVarQ2, iMin, i13);
            }
            z13 = z12;
            i17 = i7;
            if (z11) {
            }
            if (i32 >= 2) {
            }
        }
        i9 = i33;
        i10 = this.m;
        if (i10 != -1) {
            this.m = -1;
            i2 = i10;
            z12 = false;
        }
        i11 = this.n;
        if (i11 != -1) {
            i11 = i2;
        } else {
            i11 = i2;
        }
        i12 = i11;
        if (this.t0 == 8) {
            iMin = 0;
            z12 = false;
        } else {
            iMin = i12;
        }
        if (!z11) {
            i13 = 8;
        } else if (zN) {
            if (zN) {
                i13 = 8;
            } else {
                i13 = 8;
            }
        } else if (zN) {
            i13 = 8;
        } else {
            i13 = 8;
        }
        if (!z12) {
            if (i32 == 2) {
            }
            if (i7 == -2) {
                i14 = iMin;
            } else {
                i14 = i7;
            }
            if (i31 == -2) {
                i15 = iMin;
            } else {
                i15 = i31;
            }
            if (iMin > 0) {
                iMin = 0;
            }
            if (i14 > 0) {
                dVar.h(iVarQ3, iVarQ2, i14, 8);
                iMin = Math.max(iMin, i14);
            }
            if (i15 > 0) {
                if (z2) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (z14) {
                    i16 = 8;
                    dVar.j(iVarQ3, iVarQ2, i15, 8);
                } else {
                    i16 = 8;
                }
                iMin = Math.min(iMin, i15);
            } else {
                i16 = 8;
            }
            if (i9 == 1) {
                if (z2) {
                    dVar.e(iVarQ3, iVarQ2, iMin, i16);
                } else {
                    dVar.e(iVarQ3, iVarQ2, iMin, 5);
                    dVar.j(iVarQ3, iVarQ2, iMin, i16);
                }
                i31 = i15;
                i32 = i32 == true ? 1 : 0;
                iVarQ3 = iVarQ3;
                z13 = z12;
                iVarQ5 = iVarQ5;
                z4 = z4;
                i17 = i14;
                iVarQ4 = iVarQ4;
            } else if (i9 == 2) {
                bVarJ = dVar2.j();
                bVar2 = d.b.TOP;
                if (bVarJ != bVar2) {
                    iVarQ = dVar.q(this.b0.m(bVar2));
                    eVar = this.b0;
                    bVar3 = d.b.BOTTOM;
                } else {
                    iVarQ = dVar.q(this.b0.m(bVar2));
                    eVar = this.b0;
                    bVar3 = d.b.BOTTOM;
                }
                a.e.a.i iVarQ7 = dVar.q(eVar.m(bVar3));
                a.e.a.i iVar7 = iVarQ;
                a.e.a.b bVarR2 = dVar.r();
                int i310 = i15;
                i32 = i32 == true ? 1 : 0;
                iVarQ5 = iVarQ5;
                int i311 = i14;
                iVarQ4 = iVarQ4;
                iVarQ3 = iVarQ3;
                dVar.d(bVarR2.k(iVarQ3, iVarQ2, iVarQ7, iVar7, f3));
                if (z2) {
                    z12 = false;
                }
                i31 = i310;
                i17 = i311;
                z13 = z12;
                z4 = z4;
            } else {
                int i312 = i15;
                int i313 = i14;
                i32 = i32 == true ? 1 : 0;
                iVarQ4 = iVarQ4;
                iVarQ3 = iVarQ3;
                iVarQ5 = iVarQ5;
                i31 = i312;
                i17 = i313;
                z13 = z12;
                z4 = true;
            }
            if (z11) {
            }
            if (i32 >= 2) {
            }
        }
        if (z5) {
            dVar.e(iVarQ3, iVarQ2, 0, 3);
            if (i3 > 0) {
                dVar.h(iVarQ3, iVarQ2, i3, 8);
            }
            if (i4 < Integer.MAX_VALUE) {
                dVar.j(iVarQ3, iVarQ2, i4, 8);
            }
        } else {
            dVar.e(iVarQ3, iVarQ2, iMin, i13);
        }
        z13 = z12;
        i17 = i7;
        if (z11) {
        }
        if (i32 >= 2) {
        }
    }

    private void u0(StringBuilder sb, String str, float f2, float f3) {
        if (f2 == f3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    private void v0(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    private void w0(StringBuilder sb, String str, float f2, int i) {
        if (f2 == 0.0f) {
            return;
        }
        sb.append(str);
        sb.append(" :  [");
        sb.append(f2);
        sb.append(",");
        sb.append(i);
        sb.append("");
        sb.append("],\n");
    }

    public int A() {
        return this.N;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[PHI: r0
      0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    public void A0(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.e0 = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i3 = 0;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (strSubstring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (strSubstring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i3);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i3, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f2 = Float.parseFloat(strSubstring3);
                    float f3 = Float.parseFloat(strSubstring4);
                    if (f2 <= 0.0f || f3 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i2 == 1 ? Math.abs(f3 / f2) : Math.abs(f2 / f3);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.e0 = fAbs;
            this.f0 = i2;
        }
    }

    public int B() {
        return this.O;
    }

    public void B0(int i) {
        if (this.K) {
            int i2 = i - this.m0;
            int i3 = this.d0 + i2;
            this.h0 = i2;
            this.Q.s(i2);
            this.S.s(i3);
            this.T.s(i);
            this.r = true;
        }
    }

    public int C(int i) {
        if (i == 0) {
            return U();
        }
        if (i == 1) {
            return v();
        }
        return 0;
    }

    public void C0(int i, int i2) {
        if (this.q) {
            return;
        }
        this.P.s(i);
        this.R.s(i2);
        this.g0 = i;
        this.c0 = i2 - i;
        this.q = true;
    }

    public int D() {
        return this.I[1];
    }

    public void D0(int i) {
        this.P.s(i);
        this.g0 = i;
    }

    public int E() {
        return this.I[0];
    }

    public void E0(int i) {
        this.Q.s(i);
        this.h0 = i;
    }

    public int F() {
        return this.o0;
    }

    public void F0(int i, int i2) {
        if (this.r) {
            return;
        }
        this.Q.s(i);
        this.S.s(i2);
        this.h0 = i;
        this.d0 = i2 - i;
        if (this.K) {
            this.T.s(i + this.m0);
        }
        this.r = true;
    }

    public int G() {
        return this.n0;
    }

    public void G0(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        this.g0 = i;
        this.h0 = i2;
        if (this.t0 == 8) {
            this.c0 = 0;
            this.d0 = 0;
            return;
        }
        b[] bVarArr = this.a0;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i7 < (i6 = this.c0)) {
            i7 = i6;
        }
        if (bVarArr[1] == bVar2 && i8 < (i5 = this.d0)) {
            i8 = i5;
        }
        this.c0 = i7;
        this.d0 = i8;
        int i9 = this.o0;
        if (i8 < i9) {
            this.d0 = i9;
        }
        int i10 = this.n0;
        if (i7 < i10) {
            this.c0 = i10;
        }
        int i11 = this.B;
        if (i11 > 0 && bVarArr[0] == b.MATCH_CONSTRAINT) {
            this.c0 = Math.min(this.c0, i11);
        }
        int i12 = this.E;
        if (i12 > 0 && this.a0[1] == b.MATCH_CONSTRAINT) {
            this.d0 = Math.min(this.d0, i12);
        }
        int i13 = this.c0;
        if (i7 != i13) {
            this.m = i13;
        }
        int i14 = this.d0;
        if (i8 != i14) {
            this.n = i14;
        }
    }

    public e H(int i) {
        d dVar;
        d dVar2;
        if (i != 0) {
            if (i == 1 && (dVar2 = (dVar = this.S).f301f) != null && dVar2.f301f == dVar) {
                return dVar2.f299d;
            }
            return null;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f301f;
        if (dVar4 == null || dVar4.f301f != dVar3) {
            return null;
        }
        return dVar4.f299d;
    }

    public void H0(boolean z) {
        this.K = z;
    }

    public e I() {
        return this.b0;
    }

    public void I0(int i) {
        this.d0 = i;
        int i2 = this.o0;
        if (i < i2) {
            this.d0 = i2;
        }
    }

    public e J(int i) {
        d dVar;
        d dVar2;
        if (i != 0) {
            if (i == 1 && (dVar2 = (dVar = this.Q).f301f) != null && dVar2.f301f == dVar) {
                return dVar2.f299d;
            }
            return null;
        }
        d dVar3 = this.P;
        d dVar4 = dVar3.f301f;
        if (dVar4 == null || dVar4.f301f != dVar3) {
            return null;
        }
        return dVar4.f299d;
    }

    public void J0(float f2) {
        this.p0 = f2;
    }

    public int K() {
        return V() + this.c0;
    }

    public void K0(int i) {
        this.z0 = i;
    }

    public p L(int i) {
        if (i == 0) {
            return this.f313f;
        }
        if (i == 1) {
            return this.g;
        }
        return null;
    }

    public void L0(int i, int i2) {
        this.g0 = i;
        int i3 = i2 - i;
        this.c0 = i3;
        int i4 = this.n0;
        if (i3 < i4) {
            this.c0 = i4;
        }
    }

    public void M(StringBuilder sb) {
        sb.append("  " + this.p + ":{\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("    actualWidth:");
        sb2.append(this.c0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.d0);
        sb.append("\n");
        sb.append("    actualLeft:" + this.g0);
        sb.append("\n");
        sb.append("    actualTop:" + this.h0);
        sb.append("\n");
        O(sb, "left", this.P);
        O(sb, "top", this.Q);
        O(sb, "right", this.R);
        O(sb, "bottom", this.S);
        O(sb, "baseline", this.T);
        O(sb, "centerX", this.U);
        O(sb, "centerY", this.V);
        N(sb, "    width", this.c0, this.n0, this.I[0], this.m, this.A, this.x, this.C, this.D0[0]);
        N(sb, "    height", this.d0, this.o0, this.I[1], this.n, this.D, this.y, this.F, this.D0[1]);
        w0(sb, "    dimensionRatio", this.e0, this.f0);
        u0(sb, "    horizontalBias", this.p0, f308a);
        u0(sb, "    verticalBias", this.q0, f308a);
        v0(sb, "    horizontalChainStyle", this.z0, 0);
        v0(sb, "    verticalChainStyle", this.A0, 0);
        sb.append("  }");
    }

    public void M0(b bVar) {
        this.a0[0] = bVar;
    }

    public void N0(int i, int i2, int i3, float f2) {
        this.x = i;
        this.A = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.B = i3;
        this.C = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i != 0) {
            return;
        }
        this.x = 2;
    }

    public void O0(float f2) {
        this.D0[0] = f2;
    }

    public float P() {
        return this.q0;
    }

    protected void P0(int i, boolean z) {
        this.Z[i] = z;
    }

    public int Q() {
        return this.A0;
    }

    public void Q0(boolean z) {
        this.L = z;
    }

    public b R() {
        return this.a0[1];
    }

    public void R0(boolean z) {
        this.M = z;
    }

    public int S() {
        int i = this.P != null ? 0 + this.Q.g : 0;
        return this.R != null ? i + this.S.g : i;
    }

    public void S0(int i, int i2) {
        this.N = i;
        this.O = i2;
        V0(false);
    }

    public int T() {
        return this.t0;
    }

    public void T0(int i) {
        this.I[1] = i;
    }

    public int U() {
        if (this.t0 == 8) {
            return 0;
        }
        return this.c0;
    }

    public void U0(int i) {
        this.I[0] = i;
    }

    public int V() {
        e eVar = this.b0;
        return (eVar == null || !(eVar instanceof f)) ? this.g0 : ((f) eVar).S0 + this.g0;
    }

    public void V0(boolean z) {
        this.j = z;
    }

    public int W() {
        e eVar = this.b0;
        return (eVar == null || !(eVar instanceof f)) ? this.h0 : ((f) eVar).T0 + this.h0;
    }

    public void W0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.o0 = i;
    }

    public boolean X() {
        return this.K;
    }

    public void X0(int i) {
        if (i < 0) {
            i = 0;
        }
        this.n0 = i;
    }

    public boolean Y(int i) {
        if (i == 0) {
            return (this.P.f301f != null ? 1 : 0) + (this.R.f301f != null ? 1 : 0) < 2;
        }
        return ((this.Q.f301f != null ? 1 : 0) + (this.S.f301f != null ? 1 : 0)) + (this.T.f301f != null ? 1 : 0) < 2;
    }

    public void Y0(int i, int i2) {
        this.g0 = i;
        this.h0 = i2;
    }

    public boolean Z() {
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            if (this.Y.get(i).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(e eVar) {
        this.b0 = eVar;
    }

    public boolean a0() {
        return (this.m == -1 && this.n == -1) ? false : true;
    }

    public void a1(float f2) {
        this.q0 = f2;
    }

    public boolean b0(int i, int i2) {
        d dVar;
        d dVar2;
        if (i == 0) {
            d dVar3 = this.P.f301f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.R.f301f) != null && dVar2.m() && (this.R.f301f.d() - this.R.e()) - (this.P.f301f.d() + this.P.e()) >= i2;
        }
        d dVar4 = this.Q.f301f;
        return dVar4 != null && dVar4.m() && (dVar = this.S.f301f) != null && dVar.m() && (this.S.f301f.d() - this.S.e()) - (this.Q.f301f.d() + this.Q.e()) >= i2;
        return false;
    }

    public void b1(int i) {
        this.A0 = i;
    }

    public void c0(d.b bVar, e eVar, d.b bVar2, int i, int i2) {
        m(bVar).a(eVar.m(bVar2), i, i2, true);
    }

    public void c1(int i, int i2) {
        this.h0 = i;
        int i3 = i2 - i;
        this.d0 = i3;
        int i4 = this.o0;
        if (i3 < i4) {
            this.d0 = i4;
        }
    }

    public void d1(b bVar) {
        this.a0[1] = bVar;
    }

    public void e(f fVar, a.e.a.d dVar, HashSet<e> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.P1(64));
        }
        if (i == 0) {
            HashSet<d> hashSetC = this.P.c();
            if (hashSetC != null) {
                Iterator<d> it = hashSetC.iterator();
                while (it.hasNext()) {
                    it.next().f299d.e(fVar, dVar, hashSet, i, true);
                }
            }
            HashSet<d> hashSetC2 = this.R.c();
            if (hashSetC2 != null) {
                Iterator<d> it2 = hashSetC2.iterator();
                while (it2.hasNext()) {
                    it2.next().f299d.e(fVar, dVar, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetC3 = this.Q.c();
        if (hashSetC3 != null) {
            Iterator<d> it3 = hashSetC3.iterator();
            while (it3.hasNext()) {
                it3.next().f299d.e(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> hashSetC4 = this.S.c();
        if (hashSetC4 != null) {
            Iterator<d> it4 = hashSetC4.iterator();
            while (it4.hasNext()) {
                it4.next().f299d.e(fVar, dVar, hashSet, i, true);
            }
        }
        HashSet<d> hashSetC5 = this.T.c();
        if (hashSetC5 != null) {
            Iterator<d> it5 = hashSetC5.iterator();
            while (it5.hasNext()) {
                it5.next().f299d.e(fVar, dVar, hashSet, i, true);
            }
        }
    }

    public boolean e0() {
        return this.s;
    }

    public void e1(int i, int i2, int i3, float f2) {
        this.y = i;
        this.D = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.E = i3;
        this.F = f2;
        if (f2 <= 0.0f || f2 >= 1.0f || i != 0) {
            return;
        }
        this.y = 2;
    }

    boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0(int i) {
        return this.Z[i];
    }

    public void f1(float f2) {
        this.D0[1] = f2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15401. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public void g(a.e.a.d r54, boolean r55) {
        /*
            Method dump skipped, instruction units count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.m.e.g(a.e.a.d, boolean):void");
    }

    public boolean g0() {
        d dVar = this.P;
        d dVar2 = dVar.f301f;
        if (dVar2 != null && dVar2.f301f == dVar) {
            return true;
        }
        d dVar3 = this.R;
        d dVar4 = dVar3.f301f;
        return dVar4 != null && dVar4.f301f == dVar3;
    }

    public void g1(int i) {
        this.t0 = i;
    }

    public boolean h() {
        return this.t0 != 8;
    }

    public boolean h0() {
        return this.L;
    }

    public void h1(int i) {
        this.c0 = i;
        int i2 = this.n0;
        if (i < i2) {
            this.c0 = i2;
        }
    }

    public boolean i0() {
        d dVar = this.Q;
        d dVar2 = dVar.f301f;
        if (dVar2 != null && dVar2.f301f == dVar) {
            return true;
        }
        d dVar3 = this.S;
        d dVar4 = dVar3.f301f;
        return dVar4 != null && dVar4.f301f == dVar3;
    }

    public void i1(int i) {
        if (i < 0 || i > 3) {
            return;
        }
        this.w = i;
    }

    public void j(e eVar, float f2, int i) {
        d.b bVar = d.b.CENTER;
        c0(bVar, eVar, bVar, i, 0);
        this.J = f2;
    }

    public boolean j0() {
        return this.M;
    }

    public void j1(int i) {
        this.g0 = i;
    }

    public void k(a.e.a.d dVar) {
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        dVar.q(this.S);
        if (this.m0 > 0) {
            dVar.q(this.T);
        }
    }

    public boolean k0() {
        return this.j && this.t0 != 8;
    }

    public void k1(int i) {
        this.h0 = i;
    }

    public void l() {
        if (this.f313f == null) {
            this.f313f = new a.e.a.m.m.l(this);
        }
        if (this.g == null) {
            this.g = new n(this);
        }
    }

    public boolean l0() {
        return this.q || (this.P.m() && this.R.m());
    }

    public void l1(boolean z, boolean z2, boolean z3, boolean z4) {
        if (this.G == -1) {
            if (z3 && !z4) {
                this.G = 0;
            } else if (!z3 && z4) {
                this.G = 1;
                if (this.f0 == -1) {
                    this.H = 1.0f / this.H;
                }
            }
        }
        if (this.G == 0 && (!this.Q.n() || !this.S.n())) {
            this.G = 1;
        } else if (this.G == 1 && (!this.P.n() || !this.R.n())) {
            this.G = 0;
        }
        if (this.G == -1 && (!this.Q.n() || !this.S.n() || !this.P.n() || !this.R.n())) {
            if (this.Q.n() && this.S.n()) {
                this.G = 0;
            } else if (this.P.n() && this.R.n()) {
                this.H = 1.0f / this.H;
                this.G = 1;
            }
        }
        if (this.G == -1) {
            int i = this.A;
            if (i > 0 && this.D == 0) {
                this.G = 0;
            } else {
                if (i != 0 || this.D <= 0) {
                    return;
                }
                this.H = 1.0f / this.H;
                this.G = 1;
            }
        }
    }

    public d m(d.b bVar) {
        switch (a.f314a[bVar.ordinal()]) {
            case 1:
                return this.P;
            case 2:
                return this.Q;
            case 3:
                return this.R;
            case 4:
                return this.S;
            case 5:
                return this.T;
            case 6:
                return this.W;
            case 7:
                return this.U;
            case 8:
                return this.V;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.r || (this.Q.m() && this.S.m());
    }

    public void m1(boolean z, boolean z2) {
        int i;
        int i2;
        boolean zK = z & this.f313f.k();
        boolean zK2 = z2 & this.g.k();
        a.e.a.m.m.l lVar = this.f313f;
        int i3 = lVar.h.g;
        n nVar = this.g;
        int i4 = nVar.h.g;
        int i5 = lVar.i.g;
        int i6 = nVar.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i3 = 0;
            i6 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (zK) {
            this.g0 = i3;
        }
        if (zK2) {
            this.h0 = i4;
        }
        if (this.t0 == 8) {
            this.c0 = 0;
            this.d0 = 0;
            return;
        }
        if (zK) {
            if (this.a0[0] == b.FIXED && i8 < (i2 = this.c0)) {
                i8 = i2;
            }
            this.c0 = i8;
            int i10 = this.n0;
            if (i8 < i10) {
                this.c0 = i10;
            }
        }
        if (zK2) {
            if (this.a0[1] == b.FIXED && i9 < (i = this.d0)) {
                i9 = i;
            }
            this.d0 = i9;
            int i11 = this.o0;
            if (i9 < i11) {
                this.d0 = i11;
            }
        }
    }

    public int n() {
        return this.m0;
    }

    public boolean n0() {
        return this.t;
    }

    public void n1(a.e.a.d dVar, boolean z) {
        n nVar;
        a.e.a.m.m.l lVar;
        int iX = dVar.x(this.P);
        int iX2 = dVar.x(this.Q);
        int iX3 = dVar.x(this.R);
        int iX4 = dVar.x(this.S);
        if (z && (lVar = this.f313f) != null) {
            a.e.a.m.m.f fVar = lVar.h;
            if (fVar.j) {
                a.e.a.m.m.f fVar2 = lVar.i;
                if (fVar2.j) {
                    iX = fVar.g;
                    iX3 = fVar2.g;
                }
            }
        }
        if (z && (nVar = this.g) != null) {
            a.e.a.m.m.f fVar3 = nVar.h;
            if (fVar3.j) {
                a.e.a.m.m.f fVar4 = nVar.i;
                if (fVar4.j) {
                    iX2 = fVar3.g;
                    iX4 = fVar4.g;
                }
            }
        }
        int i = iX4 - iX2;
        if (iX3 - iX < 0 || i < 0 || iX == Integer.MIN_VALUE || iX == Integer.MAX_VALUE || iX2 == Integer.MIN_VALUE || iX2 == Integer.MAX_VALUE || iX3 == Integer.MIN_VALUE || iX3 == Integer.MAX_VALUE || iX4 == Integer.MIN_VALUE || iX4 == Integer.MAX_VALUE) {
            iX4 = 0;
            iX = 0;
            iX2 = 0;
            iX3 = 0;
        }
        G0(iX, iX2, iX3, iX4);
    }

    public float o(int i) {
        if (i == 0) {
            return this.p0;
        }
        if (i == 1) {
            return this.q0;
        }
        return -1.0f;
    }

    public void o0() {
        this.s = true;
    }

    public int p() {
        return W() + this.d0;
    }

    public void p0() {
        this.t = true;
    }

    public Object q() {
        return this.r0;
    }

    public boolean q0() {
        b[] bVarArr = this.a0;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.u0;
    }

    public void r0() {
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.T.p();
        this.U.p();
        this.V.p();
        this.W.p();
        this.b0 = null;
        this.J = 0.0f;
        this.c0 = 0;
        this.d0 = 0;
        this.e0 = 0.0f;
        this.f0 = -1;
        this.g0 = 0;
        this.h0 = 0;
        this.k0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = 0;
        this.o0 = 0;
        float f2 = f308a;
        this.p0 = f2;
        this.q0 = f2;
        b[] bVarArr = this.a0;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.r0 = null;
        this.s0 = 0;
        this.t0 = 0;
        this.v0 = null;
        this.w0 = false;
        this.x0 = false;
        this.z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.u = -1;
        this.v = -1;
        int[] iArr = this.I;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.x = 0;
        this.y = 0;
        this.C = 1.0f;
        this.F = 1.0f;
        this.B = Integer.MAX_VALUE;
        this.E = Integer.MAX_VALUE;
        this.A = 0;
        this.D = 0;
        this.i = false;
        this.G = -1;
        this.H = 1.0f;
        this.y0 = false;
        boolean[] zArr = this.h;
        zArr[0] = true;
        zArr[1] = true;
        this.M = false;
        boolean[] zArr2 = this.Z;
        zArr2[0] = false;
        zArr2[1] = false;
        this.j = true;
        int[] iArr2 = this.z;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.m = -1;
        this.n = -1;
    }

    public b s(int i) {
        if (i == 0) {
            return y();
        }
        if (i == 1) {
            return R();
        }
        return null;
    }

    public void s0() {
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        int size = this.Y.size();
        for (int i = 0; i < size; i++) {
            this.Y.get(i).q();
        }
    }

    public float t() {
        return this.e0;
    }

    public void t0(a.e.a.c cVar) {
        this.P.r(cVar);
        this.Q.r(cVar);
        this.R.r(cVar);
        this.S.r(cVar);
        this.T.r(cVar);
        this.W.r(cVar);
        this.U.r(cVar);
        this.V.r(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (this.v0 != null) {
            str = "type: " + this.v0 + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.u0 != null) {
            str2 = "id: " + this.u0 + " ";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.g0);
        sb.append(", ");
        sb.append(this.h0);
        sb.append(") - (");
        sb.append(this.c0);
        sb.append(" x ");
        sb.append(this.d0);
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        return this.f0;
    }

    public int v() {
        if (this.t0 == 8) {
            return 0;
        }
        return this.d0;
    }

    public float w() {
        return this.p0;
    }

    public int x() {
        return this.z0;
    }

    public void x0(int i) {
        this.m0 = i;
        this.K = i > 0;
    }

    public b y() {
        return this.a0[0];
    }

    public void y0(Object obj) {
        this.r0 = obj;
    }

    public int z() {
        d dVar = this.P;
        int i = dVar != null ? 0 + dVar.g : 0;
        d dVar2 = this.R;
        return dVar2 != null ? i + dVar2.g : i;
    }

    public void z0(String str) {
        this.u0 = str;
    }
}
