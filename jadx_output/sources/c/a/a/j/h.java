package c.a.a.j;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class h implements t, c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f2508a = new h();

    private h() {
    }

    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) throws IOException {
        char[] charArray;
        int i;
        z zVar = mVar.f2518b;
        if (obj == null) {
            zVar.o();
            return;
        }
        if ((zVar.n & a0.WriteClassName.z) != 0 && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                zVar.write("new Date(");
                zVar.n(((Date) obj).getTime());
                i = 41;
            } else {
                zVar.write(123);
                zVar.j("@type", false);
                mVar.s(obj.getClass().getName());
                zVar.write(44);
                zVar.j("val", false);
                zVar.n(((Date) obj).getTime());
                i = 125;
            }
            zVar.write(i);
            return;
        }
        Date time = obj instanceof Calendar ? ((Calendar) obj).getTime() : (Date) obj;
        if ((zVar.n & a0.WriteDateUseDateFormat.z) != 0) {
            DateFormat dateFormatG = mVar.g();
            if (dateFormatG == null) {
                dateFormatG = new SimpleDateFormat(c.a.a.a.f2419e, mVar.o);
                dateFormatG.setTimeZone(mVar.n);
            }
            zVar.p(dateFormatG.format(time));
            return;
        }
        long time2 = time.getTime();
        int i2 = zVar.n;
        if ((a0.UseISO8601DateFormat.z & i2) == 0) {
            zVar.n(time2);
            return;
        }
        a0 a0Var = a0.UseSingleQuotes;
        if ((i2 & a0Var.z) != 0) {
            zVar.write(39);
        } else {
            zVar.write(34);
        }
        Calendar calendar = Calendar.getInstance(mVar.n, mVar.o);
        calendar.setTimeInMillis(time2);
        int i3 = calendar.get(1);
        int i4 = calendar.get(2) + 1;
        int i5 = calendar.get(5);
        int i6 = calendar.get(11);
        int i7 = calendar.get(12);
        int i8 = calendar.get(13);
        int i9 = calendar.get(14);
        if (i9 != 0) {
            charArray = "0000-00-00T00:00:00.000".toCharArray();
            z.f(i9, 23, charArray);
            z.f(i8, 19, charArray);
            z.f(i7, 16, charArray);
            z.f(i6, 13, charArray);
            z.f(i5, 10, charArray);
            z.f(i4, 7, charArray);
            z.f(i3, 4, charArray);
        } else if (i8 == 0 && i7 == 0 && i6 == 0) {
            charArray = "0000-00-00".toCharArray();
            z.f(i5, 10, charArray);
            z.f(i4, 7, charArray);
            z.f(i3, 4, charArray);
        } else {
            charArray = "0000-00-00T00:00:00".toCharArray();
            z.f(i8, 19, charArray);
            z.f(i7, 16, charArray);
            z.f(i6, 13, charArray);
            z.f(i5, 10, charArray);
            z.f(i4, 7, charArray);
            z.f(i3, 4, charArray);
        }
        zVar.write(charArray);
        zVar.write((zVar.n & a0Var.z) != 0 ? 39 : 34);
    }

    @Override // c.a.a.i.q.f
    public <T> T b(c.a.a.i.b bVar, Type type, Object obj) {
        return (T) d(bVar, type, obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, java.util.Calendar] */
    protected <T> T c(c.a.a.i.b bVar, Type type, Object obj, Object obj2, String str) {
        if (obj2 == 0) {
            return null;
        }
        if (obj2 instanceof Date) {
            return obj2;
        }
        if (obj2 instanceof BigDecimal) {
            return (T) new Date(((BigDecimal) obj2).longValueExact());
        }
        if (obj2 instanceof Number) {
            return (T) new Date(((Number) obj2).longValue());
        }
        if (!(obj2 instanceof String)) {
            throw new c.a.a.d("parse error");
        }
        String str2 = (String) obj2;
        if (str2.length() == 0) {
            return null;
        }
        c.a.a.i.e eVar = new c.a.a.i.e(str2);
        try {
            if (eVar.L(false)) {
                ?? r1 = (T) eVar.v;
                if (type == Calendar.class) {
                    eVar.e();
                    return r1;
                }
                T t = (T) r1.getTime();
                eVar.e();
                return t;
            }
            eVar.e();
            if ("0000-00-00".equals(str2) || "0000-00-00T00:00:00".equalsIgnoreCase(str2) || "0001-01-01T00:00:00+08:00".equalsIgnoreCase(str2)) {
                return null;
            }
            try {
                return (T) (str != null ? new SimpleDateFormat(str) : bVar.e()).parse(str2);
            } catch (ParseException unused) {
                return (T) new Date(Long.parseLong(str2));
            }
        } catch (Throwable th) {
            eVar.e();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [T, java.util.Calendar] */
    /* JADX WARN: Type inference failed for: r1v19, types: [T, java.util.Calendar] */
    public <T> T d(c.a.a.i.b bVar, Type type, Object obj, String str) {
        Object objJ;
        Object obj2;
        String strB0;
        Object time;
        T t;
        Object objJ2;
        c.a.a.i.e eVar = bVar.f2432f;
        int iE0 = eVar.e0();
        if (iE0 == 2) {
            Object objValueOf = Long.valueOf(eVar.n());
            eVar.t(16);
            objJ2 = objValueOf;
        } else {
            if (iE0 != 4) {
                if (iE0 == 8) {
                    eVar.s();
                    obj2 = null;
                } else {
                    if (iE0 == 12) {
                        eVar.s();
                        if (eVar.e0() != 4) {
                            throw new c.a.a.d("syntax error");
                        }
                        if ("@type".equals(eVar.b0())) {
                            eVar.s();
                            bVar.a(17);
                            Type typeA = bVar.f2429c.a(eVar.b0(), null, eVar.j);
                            if (typeA != null) {
                                type = typeA;
                            }
                            bVar.a(4);
                            bVar.a(16);
                        }
                        eVar.u(':');
                        int iE1 = eVar.e0();
                        if (iE1 != 2) {
                            throw new c.a.a.d("syntax error : " + c.a.a.i.f.a(iE1));
                        }
                        long jN = eVar.n();
                        eVar.s();
                        objJ = Long.valueOf(jN);
                    } else if (bVar.k == 2) {
                        bVar.k = 0;
                        bVar.a(16);
                        if (eVar.e0() != 4) {
                            throw new c.a.a.d("syntax error");
                        }
                        if (!"val".equals(eVar.b0())) {
                            throw new c.a.a.d("syntax error");
                        }
                        eVar.s();
                        bVar.a(17);
                        objJ = bVar.j();
                    } else {
                        objJ2 = bVar.j();
                    }
                    bVar.a(13);
                    objJ2 = objJ;
                }
                t = (T) c(bVar, type, obj, obj2, str);
                if (type != Calendar.class && !(t instanceof Calendar)) {
                    Date date = (Date) t;
                    if (date == null) {
                        return null;
                    }
                    ?? r11 = (T) Calendar.getInstance(eVar.t, eVar.u);
                    r11.setTime(date);
                    return r11;
                }
            }
            strB0 = eVar.b0();
            eVar.t(16);
            if ((eVar.j & c.a.a.i.d.AllowISO8601DateFormat.u) != 0) {
                c.a.a.i.e eVar2 = new c.a.a.i.e(strB0);
                if (eVar2.L(true)) {
                    ?? r1 = (T) eVar2.v;
                    if (type == Calendar.class) {
                        objJ2 = strB0;
                        time = strB0;
                        eVar2.e();
                        return r1;
                    }
                    objJ2 = strB0;
                    time = strB0;
                    time = r1.getTime();
                }
                objJ2 = strB0;
                time = strB0;
                eVar2.e();
                objJ2 = time;
            }
        }
        objJ2 = strB0;
        obj2 = objJ2;
        t = (T) c(bVar, type, obj, obj2, str);
        return type != Calendar.class ? t : t;
    }
}
