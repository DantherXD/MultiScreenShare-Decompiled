package c.a.a.j;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
class i implements t {
    i() {
    }

    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) {
        z zVar = mVar.f2518b;
        Enum r2 = (Enum) obj;
        if ((zVar.n & a0.WriteEnumUsingToString.z) == 0) {
            zVar.k(r2.ordinal());
            return;
        }
        String string = r2.toString();
        if ((zVar.n & a0.UseSingleQuotes.z) != 0) {
            zVar.r(string);
        } else {
            zVar.q(string, (char) 0, false);
        }
    }
}
