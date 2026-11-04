package c.a.a.j;

import java.lang.reflect.Type;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class k implements t, c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k f2516a = new k();

    private k() {
    }

    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) {
        int i;
        z zVar = mVar.f2518b;
        Number number = (Number) obj;
        if (number == null) {
            if ((zVar.n & a0.WriteNullNumberAsZero.z) != 0) {
                zVar.write(48);
                return;
            } else {
                zVar.o();
                return;
            }
        }
        if (obj instanceof Long) {
            zVar.n(number.longValue());
        } else {
            zVar.k(number.intValue());
        }
        if ((zVar.n & a0.WriteClassName.z) != 0) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                i = 66;
            } else if (cls == Short.class) {
                i = 83;
            } else {
                if (cls != Long.class) {
                    return;
                }
                long jLongValue = number.longValue();
                if (jLongValue > 2147483647L || jLongValue < -2147483648L || type == Long.class) {
                    return;
                } else {
                    i = 76;
                }
            }
            zVar.write(i);
        }
    }

    @Override // c.a.a.i.q.f
    public <T> T b(c.a.a.i.b bVar, Type type, Object obj) {
        T t;
        c.a.a.i.e eVar = bVar.f2432f;
        int iE0 = eVar.e0();
        if (iE0 == 8) {
            eVar.t(16);
            return null;
        }
        if (iE0 == 2) {
            if (type == Long.TYPE || type == Long.class) {
                t = (T) Long.valueOf(eVar.n());
            } else {
                try {
                    t = (T) Integer.valueOf(eVar.j());
                } catch (NumberFormatException e2) {
                    throw new c.a.a.d("int value overflow, field : " + obj, e2);
                }
            }
            eVar.t(16);
            return t;
        }
        if (iE0 == 3) {
            BigDecimal bigDecimalG = eVar.g();
            eVar.t(16);
            return (type == Long.TYPE || type == Long.class) ? (T) Long.valueOf(bigDecimalG.longValueExact()) : (T) Integer.valueOf(bigDecimalG.intValueExact());
        }
        Object objJ = bVar.j();
        try {
            return (type == Long.TYPE || type == Long.class) ? (T) c.a.a.k.d.r(objJ) : (T) c.a.a.k.d.p(objJ);
        } catch (Exception e3) {
            throw new c.a.a.d("cast error, field : " + obj + ", value " + objJ, e3);
        }
    }
}
