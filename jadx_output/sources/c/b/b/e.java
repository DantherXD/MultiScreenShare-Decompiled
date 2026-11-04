package c.b.b;

import c.b.b.l.j;
import c.b.b.l.k;
import c.b.b.l.l;
import c.b.b.l.o;
import c.b.b.l.s;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2843a;

        static {
            int[] iArr = new int[c.b.b.a.values().length];
            f2843a = iArr;
            try {
                iArr[c.b.b.a.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2843a[c.b.b.a.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2843a[c.b.b.a.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2843a[c.b.b.a.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2843a[c.b.b.a.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2843a[c.b.b.a.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2843a[c.b.b.a.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2843a[c.b.b.a.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2843a[c.b.b.a.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2843a[c.b.b.a.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2843a[c.b.b.a.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2843a[c.b.b.a.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2843a[c.b.b.a.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    @Override // c.b.b.g
    public c.b.b.j.b a(String str, c.b.b.a aVar, int i, int i2, Map<c, ?> map) {
        g kVar;
        switch (a.f2843a[aVar.ordinal()]) {
            case 1:
                kVar = new k();
                break;
            case 2:
                kVar = new s();
                break;
            case 3:
                kVar = new j();
                break;
            case 4:
                kVar = new o();
                break;
            case 5:
                kVar = new c.b.b.n.a();
                break;
            case 6:
                kVar = new c.b.b.l.f();
                break;
            case 7:
                kVar = new c.b.b.l.h();
                break;
            case 8:
                kVar = new c.b.b.l.d();
                break;
            case 9:
                kVar = new l();
                break;
            case 10:
                kVar = new c.b.b.m.a();
                break;
            case 11:
                kVar = new c.b.b.l.b();
                break;
            case 12:
                kVar = new c.b.b.k.a();
                break;
            case 13:
                kVar = new c.b.b.i.a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return kVar.a(str, aVar, i, i2, map);
    }
}
