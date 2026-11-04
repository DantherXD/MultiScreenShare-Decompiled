package c.b.b.k.b;

/* JADX INFO: loaded from: classes.dex */
final class n extends c {
    n() {
    }

    @Override // c.b.b.k.b.c, c.b.b.k.b.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (hVar.i()) {
            char c2 = hVar.c();
            hVar.f2899f++;
            c(c2, sb);
            if (sb.length() % 3 == 0) {
                c.g(hVar, sb);
                if (j.n(hVar.d(), hVar.f2899f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb);
    }

    @Override // c.b.b.k.b.c
    int c(char c2, StringBuilder sb) {
        char c3;
        int i;
        if (c2 == '\r') {
            c3 = 0;
        } else {
            if (c2 != ' ') {
                if (c2 == '*') {
                    sb.append((char) 1);
                } else if (c2 != '>') {
                    if (c2 >= '0' && c2 <= '9') {
                        i = (c2 - '0') + 4;
                    } else if (c2 < 'A' || c2 > 'Z') {
                        j.e(c2);
                    } else {
                        i = (c2 - 'A') + 14;
                    }
                    c3 = (char) i;
                } else {
                    c3 = 2;
                }
                return 1;
            }
            c3 = 3;
        }
        sb.append(c3);
        return 1;
    }

    @Override // c.b.b.k.b.c
    public int e() {
        return 3;
    }

    @Override // c.b.b.k.b.c
    void f(h hVar, StringBuilder sb) {
        hVar.p();
        int iA = hVar.g().a() - hVar.a();
        hVar.f2899f -= sb.length();
        if (hVar.f() > 1 || iA > 1 || hVar.f() != iA) {
            hVar.r((char) 254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
