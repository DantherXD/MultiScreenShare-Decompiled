package a.g.j;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public class c implements Spannable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f574b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Spannable f575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PrecomputedText f577e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextPaint f578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextDirectionHeuristic f579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final PrecomputedText.Params f582e;

        /* JADX INFO: renamed from: a.g.j.c$a$a, reason: collision with other inner class name */
        public static class C0016a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final TextPaint f583a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private TextDirectionHeuristic f584b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f585c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f586d;

            public C0016a(TextPaint textPaint) {
                this.f583a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f585c = 1;
                    this.f586d = 1;
                } else {
                    this.f586d = 0;
                    this.f585c = 0;
                }
                this.f584b = i >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public a a() {
                return new a(this.f583a, this.f584b, this.f585c, this.f586d);
            }

            public C0016a b(int i) {
                this.f585c = i;
                return this;
            }

            public C0016a c(int i) {
                this.f586d = i;
                return this;
            }

            public C0016a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f584b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.f578a = params.getTextPaint();
            this.f579b = params.getTextDirection();
            this.f580c = params.getBreakStrategy();
            this.f581d = params.getHyphenationFrequency();
            this.f582e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @SuppressLint({"NewApi"})
        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f582e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f578a = textPaint;
            this.f579b = textDirectionHeuristic;
            this.f580c = i;
            this.f581d = i2;
        }

        public boolean a(a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f580c != aVar.b() || this.f581d != aVar.c())) || this.f578a.getTextSize() != aVar.e().getTextSize() || this.f578a.getTextScaleX() != aVar.e().getTextScaleX() || this.f578a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f578a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f578a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.f578a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f578a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f578a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.f578a.getTypeface() == null) {
                return aVar.e().getTypeface() == null;
            }
            return this.f578a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.f580c;
        }

        public int c() {
            return this.f581d;
        }

        public TextDirectionHeuristic d() {
            return this.f579b;
        }

        public TextPaint e() {
            return this.f578a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (a(aVar)) {
                return Build.VERSION.SDK_INT < 18 || this.f579b == aVar.d();
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return a.g.k.c.b(Float.valueOf(this.f578a.getTextSize()), Float.valueOf(this.f578a.getTextScaleX()), Float.valueOf(this.f578a.getTextSkewX()), Float.valueOf(this.f578a.getLetterSpacing()), Integer.valueOf(this.f578a.getFlags()), this.f578a.getTextLocales(), this.f578a.getTypeface(), Boolean.valueOf(this.f578a.isElegantTextHeight()), this.f579b, Integer.valueOf(this.f580c), Integer.valueOf(this.f581d));
            }
            if (i >= 21) {
                return a.g.k.c.b(Float.valueOf(this.f578a.getTextSize()), Float.valueOf(this.f578a.getTextScaleX()), Float.valueOf(this.f578a.getTextSkewX()), Float.valueOf(this.f578a.getLetterSpacing()), Integer.valueOf(this.f578a.getFlags()), this.f578a.getTextLocale(), this.f578a.getTypeface(), Boolean.valueOf(this.f578a.isElegantTextHeight()), this.f579b, Integer.valueOf(this.f580c), Integer.valueOf(this.f581d));
            }
            if (i < 18 && i < 17) {
                return a.g.k.c.b(Float.valueOf(this.f578a.getTextSize()), Float.valueOf(this.f578a.getTextScaleX()), Float.valueOf(this.f578a.getTextSkewX()), Integer.valueOf(this.f578a.getFlags()), this.f578a.getTypeface(), this.f579b, Integer.valueOf(this.f580c), Integer.valueOf(this.f581d));
            }
            return a.g.k.c.b(Float.valueOf(this.f578a.getTextSize()), Float.valueOf(this.f578a.getTextScaleX()), Float.valueOf(this.f578a.getTextSkewX()), Integer.valueOf(this.f578a.getFlags()), this.f578a.getTextLocale(), this.f578a.getTypeface(), this.f579b, Integer.valueOf(this.f580c), Integer.valueOf(this.f581d));
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00df  */
        /* JADX WARN: Instruction removed from duplicated block: B:14:0x00df, please report this as an issue */
        public String toString() {
            StringBuilder sb;
            Object textLocale;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f578a.getTextSize());
            sb2.append(", textScaleX=" + this.f578a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f578a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb2.append(", letterSpacing=" + this.f578a.getLetterSpacing());
                sb2.append(", elegantTextHeight=" + this.f578a.isElegantTextHeight());
            }
            if (i < 24) {
                if (i >= 17) {
                    sb = new StringBuilder();
                    sb.append(", textLocale=");
                    textLocale = this.f578a.getTextLocale();
                }
                sb2.append(", typeface=" + this.f578a.getTypeface());
                if (i >= 26) {
                    sb2.append(", variationSettings=" + this.f578a.getFontVariationSettings());
                }
                sb2.append(", textDir=" + this.f579b);
                sb2.append(", breakStrategy=" + this.f580c);
                sb2.append(", hyphenationFrequency=" + this.f581d);
                sb2.append("}");
                return sb2.toString();
            }
            sb = new StringBuilder();
            sb.append(", textLocale=");
            textLocale = this.f578a.getTextLocales();
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + this.f578a.getTypeface());
            if (i >= 26) {
                sb2.append(", variationSettings=" + this.f578a.getFontVariationSettings());
            }
            sb2.append(", textDir=" + this.f579b);
            sb2.append(", breakStrategy=" + this.f580c);
            sb2.append(", hyphenationFrequency=" + this.f581d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    public a a() {
        return this.f576d;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f575c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f575c.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f575c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f575c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f575c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f577e.getSpans(i, i2, cls) : (T[]) this.f575c.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f575c.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f575c.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f577e.removeSpan(obj);
        } else {
            this.f575c.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f577e.setSpan(obj, i, i2, i3);
        } else {
            this.f575c.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f575c.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f575c.toString();
    }
}
