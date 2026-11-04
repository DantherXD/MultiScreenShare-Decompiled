package c.a.a.j;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class f implements t, c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f2506a = new f();

    private f() {
    }

    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) {
        z zVar = mVar.f2518b;
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zVar.write(bool.booleanValue() ? "true" : "false");
        } else if ((zVar.n & a0.WriteNullBooleanAsFalse.z) != 0) {
            zVar.write("false");
        } else {
            zVar.o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2 == 1) goto L5;
     */
    @Override // c.a.a.i.q.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T b(c.a.a.i.b r2, java.lang.reflect.Type r3, java.lang.Object r4) {
        /*
            r1 = this;
            c.a.a.i.e r1 = r2.f2432f
            int r3 = r1.e0()
            r4 = 16
            r0 = 6
            if (r3 != r0) goto L11
            r1.t(r4)
        Le:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L34
        L11:
            r0 = 7
            if (r3 != r0) goto L1a
            r1.t(r4)
        L17:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L34
        L1a:
            r0 = 2
            if (r3 != r0) goto L28
            int r2 = r1.j()
            r1.t(r4)
            r1 = 1
            if (r2 != r1) goto L17
            goto Le
        L28:
            java.lang.Object r1 = r2.j()
            if (r1 != 0) goto L30
            r1 = 0
            return r1
        L30:
            java.lang.Boolean r1 = c.a.a.k.d.h(r1)
        L34:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.j.f.b(c.a.a.i.b, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }
}
