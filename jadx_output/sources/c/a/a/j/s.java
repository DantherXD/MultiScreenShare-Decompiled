package c.a.a.j;

import java.lang.reflect.Type;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public class s implements t, c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f2530a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DecimalFormat f2531b = null;

    private s() {
    }

    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) {
        String string;
        z zVar = mVar.f2518b;
        if (obj == null) {
            if ((zVar.n & a0.WriteNullNumberAsZero.z) != 0) {
                zVar.write(48);
                return;
            } else {
                zVar.o();
                return;
            }
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (Float.isNaN(fFloatValue) || Float.isInfinite(fFloatValue)) {
                zVar.o();
                return;
            }
            String string2 = Float.toString(fFloatValue);
            if (string2.endsWith(".0")) {
                string2 = string2.substring(0, string2.length() - 2);
            }
            zVar.write(string2);
            if ((zVar.n & a0.WriteClassName.z) != 0) {
                zVar.write(70);
                return;
            }
            return;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
            zVar.o();
            return;
        }
        DecimalFormat decimalFormat = this.f2531b;
        if (decimalFormat == null) {
            string = Double.toString(dDoubleValue);
            if (string.endsWith(".0")) {
                string = string.substring(0, string.length() - 2);
            }
        } else {
            string = decimalFormat.format(dDoubleValue);
        }
        zVar.append(string);
        if ((zVar.n & a0.WriteClassName.z) != 0) {
            zVar.write(68);
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [T, java.math.BigDecimal] */
    @Override // c.a.a.i.q.f
    public <T> T b(c.a.a.i.b bVar, Type type, Object obj) {
        c.a.a.i.e eVar = bVar.f2432f;
        int iE0 = eVar.e0();
        if (iE0 == 2) {
            if (type == Double.TYPE || type == Double.class) {
                String strV = eVar.v();
                eVar.t(16);
                return (T) Double.valueOf(Double.parseDouble(strV));
            }
            if (type == Float.TYPE || type == Float.class) {
                String strV2 = eVar.v();
                eVar.t(16);
                return (T) Float.valueOf(Float.parseFloat(strV2));
            }
            long jN = eVar.n();
            eVar.t(16);
            if (type == Short.TYPE || type == Short.class) {
                return (T) Short.valueOf((short) jN);
            }
            if (type == Byte.TYPE || type == Byte.class) {
                return (T) Byte.valueOf((byte) jN);
            }
            return (jN < -2147483648L || jN > 2147483647L) ? (T) Long.valueOf(jN) : (T) Integer.valueOf((int) jN);
        }
        if (iE0 != 3) {
            Object objJ = bVar.j();
            if (objJ == null) {
                return null;
            }
            if (type == Double.TYPE || type == Double.class) {
                return (T) c.a.a.k.d.m(objJ);
            }
            if (type == Float.TYPE || type == Float.class) {
                return (T) c.a.a.k.d.o(objJ);
            }
            if (type == Short.TYPE || type == Short.class) {
                return (T) c.a.a.k.d.s(objJ);
            }
            return (type == Byte.TYPE || type == Byte.class) ? (T) c.a.a.k.d.i(objJ) : (T) c.a.a.k.d.f(objJ);
        }
        if (type == Double.TYPE || type == Double.class) {
            String strV3 = eVar.v();
            eVar.t(16);
            return (T) Double.valueOf(Double.parseDouble(strV3));
        }
        if (type == Float.TYPE || type == Float.class) {
            String strV4 = eVar.v();
            eVar.t(16);
            return (T) Float.valueOf(Float.parseFloat(strV4));
        }
        ?? r7 = (T) eVar.g();
        eVar.t(16);
        if (type == Short.TYPE || type == Short.class) {
            return (T) Short.valueOf(r7.shortValueExact());
        }
        return (type == Byte.TYPE || type == Byte.class) ? (T) Byte.valueOf(r7.byteValueExact()) : r7;
    }
}
