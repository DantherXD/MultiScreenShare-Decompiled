package c.a.a.j;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f2500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t f2501b;

    c(Class<?> cls, t tVar) {
        this.f2500a = cls;
        this.f2501b = tVar;
    }

    @Override // c.a.a.j.t
    public final void a(m mVar, Object obj, Object obj2, Type type) {
        t tVarA;
        Integer numValueOf;
        z zVar = mVar.f2518b;
        if (obj == null) {
            if ((zVar.n & a0.WriteNullListAsEmpty.z) != 0) {
                zVar.write("[]");
                return;
            } else {
                zVar.o();
                return;
            }
        }
        int i = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            zVar.write(91);
            while (i < zArr.length) {
                if (i != 0) {
                    zVar.write(44);
                }
                zVar.h(zArr[i]);
                i++;
            }
            zVar.write(93);
            return;
        }
        if (obj instanceof byte[]) {
            zVar.i((byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            zVar.p(new String((char[]) obj));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length = dArr.length - 1;
            if (length == -1) {
                zVar.append("[]");
                return;
            }
            zVar.write(91);
            while (i < length) {
                double d2 = dArr[i];
                if (Double.isNaN(d2)) {
                    zVar.o();
                } else {
                    zVar.append(Double.toString(d2));
                }
                zVar.write(44);
                i++;
            }
            double d3 = dArr[length];
            if (Double.isNaN(d3)) {
                zVar.o();
            } else {
                zVar.append(Double.toString(d3));
            }
            zVar.write(93);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length2 = fArr.length - 1;
            if (length2 == -1) {
                zVar.append("[]");
                return;
            }
            zVar.write(91);
            while (i < length2) {
                float f2 = fArr[i];
                if (Float.isNaN(f2)) {
                    zVar.o();
                } else {
                    zVar.append(Float.toString(f2));
                }
                zVar.write(44);
                i++;
            }
            float f3 = fArr[length2];
            if (Float.isNaN(f3)) {
                zVar.o();
            } else {
                zVar.append(Float.toString(f3));
            }
            zVar.write(93);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            zVar.write(91);
            while (i < iArr.length) {
                if (i != 0) {
                    zVar.write(44);
                }
                zVar.k(iArr[i]);
                i++;
            }
            zVar.write(93);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            zVar.write(91);
            while (i < jArr.length) {
                if (i != 0) {
                    zVar.write(44);
                }
                zVar.n(jArr[i]);
                i++;
            }
            zVar.write(93);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            zVar.write(91);
            while (i < sArr.length) {
                if (i != 0) {
                    zVar.write(44);
                }
                zVar.k(sArr[i]);
                i++;
            }
            zVar.write(93);
            return;
        }
        Object[] objArr = (Object[]) obj;
        int length3 = objArr.length;
        w wVar = mVar.m;
        mVar.p(wVar, obj, obj2, 0);
        try {
            zVar.write(91);
            while (i < length3) {
                if (i != 0) {
                    zVar.write(44);
                }
                Object obj3 = objArr[i];
                if (obj3 != null) {
                    if (obj3.getClass() == this.f2500a) {
                        tVarA = this.f2501b;
                        numValueOf = Integer.valueOf(i);
                    } else {
                        tVarA = mVar.f2517a.a(obj3.getClass());
                        numValueOf = Integer.valueOf(i);
                    }
                    tVarA.a(mVar, obj3, numValueOf, null);
                } else if (zVar.g(a0.WriteNullStringAsEmpty) && (obj instanceof String[])) {
                    zVar.p("");
                } else {
                    zVar.append("null");
                }
                i++;
            }
            zVar.write(93);
        } finally {
            mVar.m = wVar;
        }
    }
}
