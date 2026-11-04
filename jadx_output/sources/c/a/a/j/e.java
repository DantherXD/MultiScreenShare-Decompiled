package c.a.a.j;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class e implements t, c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f2505a = new e();

    private e() {
    }

    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) {
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
        if (obj instanceof BigInteger) {
            zVar.write(((BigInteger) obj).toString());
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        zVar.write(bigDecimal.toString());
        if ((zVar.n & a0.WriteClassName.z) == 0 || type == BigDecimal.class || bigDecimal.scale() != 0) {
            return;
        }
        zVar.write(46);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.math.BigDecimal] */
    @Override // c.a.a.i.q.f
    public <T> T b(c.a.a.i.b bVar, Type type, Object obj) {
        c.a.a.i.e eVar = bVar.f2432f;
        int iE0 = eVar.e0();
        if (iE0 == 2) {
            if (type == BigInteger.class) {
                String strV = eVar.v();
                eVar.t(16);
                return (T) new BigInteger(strV, 10);
            }
            T t = (T) eVar.g();
            eVar.t(16);
            return t;
        }
        if (iE0 != 3) {
            Object objJ = bVar.j();
            if (objJ == null) {
                return null;
            }
            return type == BigInteger.class ? (T) c.a.a.k.d.g(objJ) : (T) c.a.a.k.d.f(objJ);
        }
        ?? r3 = (T) eVar.g();
        eVar.t(16);
        if (type != BigInteger.class) {
            return r3;
        }
        int iScale = r3.scale();
        if (iScale < -100 || iScale > 100) {
            throw new NumberFormatException();
        }
        return (T) r3.toBigInteger();
    }
}
