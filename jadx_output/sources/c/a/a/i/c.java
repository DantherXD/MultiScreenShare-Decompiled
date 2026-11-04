package c.a.a.i;

import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c implements c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f2437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Enum[] f2438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Enum[] f2439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long[] f2440d;

    public c(Class<?> cls) {
        this.f2437a = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f2439c = enumArr;
        int length = enumArr.length;
        long[] jArr = new long[length];
        this.f2440d = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.f2439c;
            if (i >= enumArr2.length) {
                break;
            }
            String strName = enumArr2[i].name();
            long jCharAt = -3750763034362895579L;
            for (int i2 = 0; i2 < strName.length(); i2++) {
                jCharAt = (jCharAt ^ ((long) strName.charAt(i2))) * 1099511628211L;
            }
            jArr[i] = jCharAt;
            this.f2440d[i] = jCharAt;
            i++;
        }
        Arrays.sort(this.f2440d);
        this.f2438b = new Enum[this.f2439c.length];
        for (int i3 = 0; i3 < this.f2440d.length; i3++) {
            for (int i4 = 0; i4 < length; i4++) {
                if (this.f2440d[i3] == jArr[i4]) {
                    this.f2438b[i3] = this.f2439c[i4];
                    break;
                }
            }
        }
    }

    @Override // c.a.a.i.q.f
    public <T> T b(b bVar, Type type, Object obj) {
        try {
            e eVar = bVar.f2432f;
            int i = eVar.h;
            if (i == 2) {
                int iJ = eVar.j();
                eVar.t(16);
                if (iJ >= 0) {
                    Object[] objArr = this.f2439c;
                    if (iJ <= objArr.length) {
                        return (T) objArr[iJ];
                    }
                }
                throw new c.a.a.d("parse enum " + this.f2437a.getName() + " error, value : " + iJ);
            }
            if (i != 4) {
                if (i == 8) {
                    eVar.t(16);
                    return null;
                }
                throw new c.a.a.d("parse enum " + this.f2437a.getName() + " error, value : " + bVar.j());
            }
            String strB0 = eVar.b0();
            eVar.t(16);
            if (strB0.length() == 0) {
                return null;
            }
            long jCharAt = -3750763034362895579L;
            for (int i2 = 0; i2 < strB0.length(); i2++) {
                jCharAt = (jCharAt ^ ((long) strB0.charAt(i2))) * 1099511628211L;
            }
            int iBinarySearch = Arrays.binarySearch(this.f2440d, jCharAt);
            if (iBinarySearch < 0) {
                return null;
            }
            return (T) this.f2438b[iBinarySearch];
        } catch (c.a.a.d e2) {
            throw e2;
        } catch (Exception e3) {
            throw new c.a.a.d(e3.getMessage(), e3);
        }
    }
}
