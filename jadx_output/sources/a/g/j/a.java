package a.g.j;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final d f557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a f560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final a f561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f562f;
    private final int g;
    private final d h;

    /* JADX INFO: renamed from: a.g.j.a$a, reason: collision with other inner class name */
    public static final class C0015a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f565c;

        public C0015a() {
            c(a.e(Locale.getDefault()));
        }

        private static a b(boolean z) {
            return z ? a.f561e : a.f560d;
        }

        private void c(boolean z) {
            this.f563a = z;
            this.f565c = a.f557a;
            this.f564b = 2;
        }

        public a a() {
            return (this.f564b == 2 && this.f565c == a.f557a) ? b(this.f563a) : new a(this.f563a, this.f564b, this.f565c);
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final byte[] f566a = new byte[1792];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private char f571f;

        static {
            for (int i = 0; i < 1792; i++) {
                f566a[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f567b = charSequence;
            this.f568c = z;
            this.f569d = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? f566a[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char cCharAt;
            int i = this.f570e;
            do {
                int i2 = this.f570e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f567b;
                int i3 = i2 - 1;
                this.f570e = i3;
                cCharAt = charSequence.charAt(i3);
                this.f571f = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f570e = i;
            this.f571f = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i = this.f570e;
                if (i >= this.f569d) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f567b;
                this.f570e = i + 1;
                cCharAt = charSequence.charAt(i);
                this.f571f = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i = this.f570e;
            while (true) {
                int i2 = this.f570e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f567b;
                int i3 = i2 - 1;
                this.f570e = i3;
                char cCharAt2 = charSequence.charAt(i3);
                this.f571f = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i4 = this.f570e;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f567b;
                        int i5 = i4 - 1;
                        this.f570e = i5;
                        cCharAt = charSequence2.charAt(i5);
                        this.f571f = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f570e = i;
            this.f571f = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i = this.f570e;
            while (true) {
                int i2 = this.f570e;
                if (i2 >= this.f569d) {
                    this.f570e = i;
                    this.f571f = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f567b;
                this.f570e = i2 + 1;
                char cCharAt2 = charSequence.charAt(i2);
                this.f571f = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i3 = this.f570e;
                        if (i3 >= this.f569d) {
                            break;
                        }
                        CharSequence charSequence2 = this.f567b;
                        this.f570e = i3 + 1;
                        cCharAt = charSequence2.charAt(i3);
                        this.f571f = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f567b.charAt(this.f570e - 1);
            this.f571f = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f567b, this.f570e);
                this.f570e -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f570e--;
            byte bC = c(this.f571f);
            if (!this.f568c) {
                return bC;
            }
            char c2 = this.f571f;
            if (c2 == '>') {
                return h();
            }
            return c2 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f567b.charAt(this.f570e);
            this.f571f = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f567b, this.f570e);
                this.f570e += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f570e++;
            byte bC = c(this.f571f);
            if (!this.f568c) {
                return bC;
            }
            char c2 = this.f571f;
            if (c2 == '<') {
                return i();
            }
            return c2 == '&' ? g() : bC;
        }

        int d() {
            this.f570e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f570e < this.f569d && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f570e > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                    default:
                        continue;
                }
                i3--;
            }
            return 0;
        }

        int e() {
            this.f570e = this.f569d;
            int i = 0;
            while (true) {
                int i2 = i;
                while (this.f570e > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i == 0) {
                            return -1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        d dVar = e.f589c;
        f557a = dVar;
        f558b = Character.toString((char) 8206);
        f559c = Character.toString((char) 8207);
        f560d = new a(false, 2, dVar);
        f561e = new a(true, 2, dVar);
    }

    a(boolean z, int i, d dVar) {
        this.f562f = z;
        this.g = i;
        this.h = dVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0015a().a();
    }

    static boolean e(Locale locale) {
        return f.b(locale) == 1;
    }

    private String f(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f562f && (zA || b(charSequence) == 1)) {
            return f558b;
        }
        if (this.f562f) {
            return (!zA || b(charSequence) == -1) ? f559c : "";
        }
        return "";
    }

    private String g(CharSequence charSequence, d dVar) {
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        if (!this.f562f && (zA || a(charSequence) == 1)) {
            return f558b;
        }
        if (this.f562f) {
            return (!zA || a(charSequence) == -1) ? f559c : "";
        }
        return "";
    }

    public boolean d() {
        return (this.g & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.h, true);
    }

    public CharSequence i(CharSequence charSequence, d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zA = dVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, zA ? e.f588b : e.f587a));
        }
        if (zA != this.f562f) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, zA ? e.f588b : e.f587a));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.h, true);
    }

    public String k(String str, d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return i(str, dVar, z).toString();
    }
}
