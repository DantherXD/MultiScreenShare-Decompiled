package c.b.b.l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements c.b.b.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f2935a = new j();

    @Override // c.b.b.g
    public c.b.b.j.b a(String str, c.b.b.a aVar, int i, int i2, Map<c.b.b.c, ?> map) {
        if (aVar == c.b.b.a.UPC_A) {
            return this.f2935a.a("0".concat(String.valueOf(str)), c.b.b.a.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
