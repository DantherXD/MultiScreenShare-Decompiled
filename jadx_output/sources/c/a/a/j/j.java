package c.a.a.j;

import java.lang.reflect.Member;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparable<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.a.a.k.a f2509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f2510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f2511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f2512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected char[] f2513f;
    private a g;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        t f2514a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Class<?> f2515b;

        public a(t tVar, Class<?> cls) {
            this.f2514a = tVar;
            this.f2515b = cls;
        }
    }

    public j(c.a.a.k.a aVar) {
        boolean z;
        this.f2509b = aVar;
        c.a.a.h.b bVarD = aVar.d();
        String str = null;
        if (bVarD != null) {
            z = false;
            for (a0 a0Var : bVarD.serialzeFeatures()) {
                if (a0Var == a0.WriteMapNullValue) {
                    z = true;
                }
            }
            String strTrim = bVarD.format().trim();
            str = strTrim.length() != 0 ? strTrim : null;
            this.f2511d = a0.a(bVarD.serialzeFeatures());
        } else {
            this.f2511d = 0;
            z = false;
        }
        this.f2510c = z;
        this.f2512e = str;
        String str2 = aVar.f2545b;
        int length = str2.length();
        this.f2513f = new char[length + 3];
        str2.getChars(0, str2.length(), this.f2513f, 1);
        char[] cArr = this.f2513f;
        cArr[0] = '\"';
        cArr[length + 1] = '\"';
        cArr[length + 2] = ':';
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        return this.f2509b.compareTo(jVar.f2509b);
    }

    public Object b(Object obj) {
        try {
            return this.f2509b.c(obj);
        } catch (Exception e2) {
            c.a.a.k.a aVar = this.f2509b;
            Member member = aVar.f2546c;
            if (member == null) {
                member = aVar.f2547d;
            }
            throw new c.a.a.d("get property error。 " + (member.getDeclaringClass().getName() + "." + member.getName()), e2);
        }
    }

    public void c(m mVar) {
        z zVar = mVar.f2518b;
        int i = zVar.n;
        if ((a0.QuoteFieldNames.z & i) == 0 || (i & a0.UseSingleQuotes.z) != 0) {
            zVar.j(this.f2509b.f2545b, true);
        } else {
            char[] cArr = this.f2513f;
            zVar.write(cArr, 0, cArr.length);
        }
    }

    public void d(m mVar, Object obj) {
        String str = this.f2512e;
        if (str != null) {
            mVar.w(obj, str);
            return;
        }
        if (this.g == null) {
            Class<?> cls = obj == null ? this.f2509b.h : obj.getClass();
            this.g = new a(mVar.f2517a.a(cls), cls);
        }
        a aVar = this.g;
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            if (cls2 == aVar.f2515b) {
                t tVar = aVar.f2514a;
                c.a.a.k.a aVar2 = this.f2509b;
                tVar.a(mVar, obj, aVar2.f2545b, aVar2.i);
                return;
            } else {
                t tVarA = mVar.f2517a.a(cls2);
                c.a.a.k.a aVar3 = this.f2509b;
                tVarA.a(mVar, obj, aVar3.f2545b, aVar3.i);
                return;
            }
        }
        if ((this.f2511d & a0.WriteNullNumberAsZero.z) != 0 && Number.class.isAssignableFrom(aVar.f2515b)) {
            mVar.f2518b.write(48);
            return;
        }
        int i = this.f2511d;
        if ((a0.WriteNullBooleanAsFalse.z & i) != 0 && Boolean.class == aVar.f2515b) {
            mVar.f2518b.write("false");
        } else if ((i & a0.WriteNullListAsEmpty.z) == 0 || !Collection.class.isAssignableFrom(aVar.f2515b)) {
            aVar.f2514a.a(mVar, null, this.f2509b.f2545b, aVar.f2515b);
        } else {
            mVar.f2518b.write("[]");
        }
    }
}
