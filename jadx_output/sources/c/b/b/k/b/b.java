package c.b.b.k.b;

/* JADX INFO: loaded from: classes.dex */
final class b implements g {
    b() {
    }

    private static char c(char c2, int i) {
        int i2 = c2 + ((i * 149) % 255) + 1;
        return i2 <= 255 ? (char) i2 : (char) (i2 - 256);
    }

    @Override // c.b.b.k.b.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (hVar.i()) {
            sb.append(hVar.c());
            hVar.f2899f++;
            if (j.n(hVar.d(), hVar.f2899f, b()) != b()) {
                hVar.o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int iA = hVar.a() + length + 1;
        hVar.q(iA);
        boolean z = hVar.g().a() - iA > 0;
        if (hVar.i() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i = 0; i < length2; i++) {
            hVar.r(c(sb.charAt(i), hVar.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}
