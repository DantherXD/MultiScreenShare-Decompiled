package c.b.b.k.b;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f2895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.b.b.b f2896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c.b.b.b f2897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final StringBuilder f2898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f2899f;
    private int g;
    private k h;
    private int i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c2 = (char) (bytes[i] & 255);
            if (c2 == '?' && str.charAt(i) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb.append(c2);
        }
        this.f2894a = sb.toString();
        this.f2895b = l.FORCE_NONE;
        this.f2898e = new StringBuilder(str.length());
        this.g = -1;
    }

    private int h() {
        return this.f2894a.length() - this.i;
    }

    public int a() {
        return this.f2898e.length();
    }

    public StringBuilder b() {
        return this.f2898e;
    }

    public char c() {
        return this.f2894a.charAt(this.f2899f);
    }

    public String d() {
        return this.f2894a;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return h() - this.f2899f;
    }

    public k g() {
        return this.h;
    }

    public boolean i() {
        return this.f2899f < h();
    }

    public void j() {
        this.g = -1;
    }

    public void k() {
        this.h = null;
    }

    public void l(c.b.b.b bVar, c.b.b.b bVar2) {
        this.f2896c = bVar;
        this.f2897d = bVar2;
    }

    public void m(int i) {
        this.i = i;
    }

    public void n(l lVar) {
        this.f2895b = lVar;
    }

    public void o(int i) {
        this.g = i;
    }

    public void p() {
        q(a());
    }

    public void q(int i) {
        k kVar = this.h;
        if (kVar == null || i > kVar.a()) {
            this.h = k.l(i, this.f2895b, this.f2896c, this.f2897d, true);
        }
    }

    public void r(char c2) {
        this.f2898e.append(c2);
    }

    public void s(String str) {
        this.f2898e.append(str);
    }
}
