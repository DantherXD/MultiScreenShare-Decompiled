package c.a.a.j;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class b0 implements t, c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b0 f2499a = new b0();

    private b0() {
    }

    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) {
        String str = (String) obj;
        z zVar = mVar.f2518b;
        if (str == null) {
            zVar.o();
        } else {
            zVar.p(str);
        }
    }

    @Override // c.a.a.i.q.f
    public <T> T b(c.a.a.i.b bVar, Type type, Object obj) {
        return (T) bVar.v();
    }
}
