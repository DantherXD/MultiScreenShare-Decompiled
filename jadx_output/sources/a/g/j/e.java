package a.g.j;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.g.j.d f587a = new C0017e(null, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.g.j.d f588b = new C0017e(null, true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.g.j.d f589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a.g.j.d f590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a.g.j.d f591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a.g.j.d f592f;

    private static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f593a = new a(true);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f594b;

        private a(boolean z) {
            this.f594b = z;
        }

        @Override // a.g.j.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int iA = e.a(Character.getDirectionality(charSequence.charAt(i)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                    } else if (!this.f594b) {
                        return 1;
                    }
                    i++;
                    z = z;
                } else if (this.f594b) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f594b ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f595a = new b();

        private b() {
        }

        @Override // a.g.j.e.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int iB = 2;
            while (i < i3 && iB == 2) {
                iB = e.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return iB;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    private static abstract class d implements a.g.j.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f596a;

        d(c cVar) {
            this.f596a = cVar;
        }

        private boolean c(CharSequence charSequence, int i, int i2) {
            int iA = this.f596a.a(charSequence, i, i2);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        @Override // a.g.j.d
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.f596a == null ? b() : c(charSequence, i, i2);
        }

        protected abstract boolean b();
    }

    /* JADX INFO: renamed from: a.g.j.e$e, reason: collision with other inner class name */
    private static class C0017e extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f597b;

        C0017e(c cVar, boolean z) {
            super(cVar);
            this.f597b = z;
        }

        @Override // a.g.j.e.d
        protected boolean b() {
            return this.f597b;
        }
    }

    private static class f extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f f598b = new f();

        f() {
            super(null);
        }

        @Override // a.g.j.e.d
        protected boolean b() {
            return a.g.j.f.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f595a;
        f589c = new C0017e(bVar, false);
        f590d = new C0017e(bVar, true);
        f591e = new C0017e(a.f593a, false);
        f592f = f.f598b;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
