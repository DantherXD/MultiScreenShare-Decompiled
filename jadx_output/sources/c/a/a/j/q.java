package c.a.a.j;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class q implements t, c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f2529a = new q();

    private q() {
    }

    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) {
        String string;
        z zVar = mVar.f2518b;
        if (obj == null) {
            if (type == Character.TYPE || type == Character.class) {
                mVar.s("");
                return;
            } else if ((zVar.n & a0.WriteNullListAsEmpty.z) == 0 || !Enumeration.class.isAssignableFrom(c.a.a.k.d.z(type))) {
                zVar.o();
                return;
            } else {
                zVar.write("[]");
                return;
            }
        }
        if (obj instanceof Pattern) {
            string = ((Pattern) obj).pattern();
        } else if (obj instanceof TimeZone) {
            string = ((TimeZone) obj).getID();
        } else if (obj instanceof Currency) {
            string = ((Currency) obj).getCurrencyCode();
        } else if (obj instanceof Class) {
            string = ((Class) obj).getName();
        } else if (obj instanceof Character) {
            Character ch = (Character) obj;
            string = ch.charValue() == 0 ? "\u0000" : ch.toString();
        } else {
            int i = 0;
            if (obj instanceof SimpleDateFormat) {
                String pattern = ((SimpleDateFormat) obj).toPattern();
                if ((zVar.n & a0.WriteClassName.z) == 0 || obj.getClass() == type) {
                    zVar.p(pattern);
                    return;
                }
                zVar.write(123);
                zVar.j("@type", false);
                mVar.s(obj.getClass().getName());
                zVar.write(44);
                zVar.j("val", false);
                zVar.p(pattern);
                zVar.write(125);
                return;
            }
            if (obj instanceof c.a.a.f) {
                ((c.a.a.f) obj).b(zVar);
                return;
            }
            if (obj instanceof c.a.a.c) {
                zVar.write(((c.a.a.c) obj).a());
                return;
            }
            if (obj instanceof l) {
                ((l) obj).a(mVar, obj2, type);
                return;
            }
            if (obj instanceof Enumeration) {
                Type type2 = null;
                if ((zVar.n & a0.WriteClassName.z) != 0 && (type instanceof ParameterizedType)) {
                    type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                }
                Enumeration enumeration = (Enumeration) obj;
                w wVar = mVar.m;
                mVar.p(wVar, obj, obj2, 0);
                try {
                    zVar.write(91);
                    while (enumeration.hasMoreElements()) {
                        Object objNextElement = enumeration.nextElement();
                        int i2 = i + 1;
                        if (i != 0) {
                            zVar.write(44);
                        }
                        if (objNextElement == null) {
                            zVar.o();
                        } else {
                            mVar.f2517a.a(objNextElement.getClass()).a(mVar, objNextElement, Integer.valueOf(i2 - 1), type2);
                        }
                        i = i2;
                    }
                    zVar.write(93);
                    return;
                } finally {
                    mVar.m = wVar;
                }
            }
            string = obj.toString();
        }
        mVar.s(string);
    }

    /* JADX WARN: Type inference failed for: r7v6, types: [T, java.text.SimpleDateFormat] */
    @Override // c.a.a.i.q.f
    public <T> T b(c.a.a.i.b bVar, Type type, Object obj) {
        Object objJ;
        if (type == StackTraceElement.class) {
            return (T) c(bVar);
        }
        c.a.a.i.e eVar = bVar.f2432f;
        if (bVar.k == 2) {
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
            bVar.a(13);
        } else {
            objJ = bVar.j();
        }
        if (objJ == null) {
            return null;
        }
        if (!(objJ instanceof String)) {
            if (objJ instanceof c.a.a.e) {
                c.a.a.e eVar2 = (c.a.a.e) objJ;
                if (type == Currency.class) {
                    String strO = eVar2.o("currency");
                    if (strO != null) {
                        return (T) Currency.getInstance(strO);
                    }
                    String strO2 = eVar2.o("currencyCode");
                    if (strO2 != null) {
                        return (T) Currency.getInstance(strO2);
                    }
                }
                if (type == Map.Entry.class) {
                    return (T) eVar2.entrySet().iterator().next();
                }
            }
            throw new c.a.a.d("except string value");
        }
        String str = (String) objJ;
        if (str.length() == 0) {
            return null;
        }
        if (type == UUID.class) {
            return (T) UUID.fromString(str);
        }
        if (type == Class.class) {
            return (T) c.a.a.k.d.L(str, bVar.f2429c.f2477e, false);
        }
        if (type == Locale.class) {
            String[] strArrSplit = str.split("_");
            if (strArrSplit.length == 1) {
                return (T) new Locale(strArrSplit[0]);
            }
            return strArrSplit.length == 2 ? (T) new Locale(strArrSplit[0], strArrSplit[1]) : (T) new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        }
        if (type == URI.class) {
            return (T) URI.create(str);
        }
        if (type == URL.class) {
            try {
                return (T) new URL(str);
            } catch (MalformedURLException e2) {
                throw new c.a.a.d("create url error", e2);
            }
        }
        if (type == Pattern.class) {
            return (T) Pattern.compile(str);
        }
        if (type == Charset.class) {
            return (T) Charset.forName(str);
        }
        if (type == Currency.class) {
            return (T) Currency.getInstance(str);
        }
        if (type == SimpleDateFormat.class) {
            ?? r7 = (T) new SimpleDateFormat(str, bVar.f2432f.u);
            r7.setTimeZone(bVar.f2432f.t);
            return r7;
        }
        if (type == Character.TYPE || type == Character.class) {
            return (T) c.a.a.k.d.k(str);
        }
        if (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName())) {
            return (T) TimeZone.getTimeZone(str);
        }
        try {
            return (T) Class.forName("android.net.Uri").getMethod("parse", String.class).invoke(null, str);
        } catch (Exception e3) {
            throw new c.a.a.d("parse android.net.Uri error.", e3);
        }
    }

    protected <T> T c(c.a.a.i.b bVar) {
        c.a.a.i.e eVar = bVar.f2432f;
        if (eVar.e0() == 8) {
            eVar.s();
            return null;
        }
        if (eVar.e0() != 12 && eVar.e0() != 16) {
            throw new c.a.a.d("syntax error: " + c.a.a.i.f.a(eVar.e0()));
        }
        int iJ = 0;
        String strB0 = null;
        String strB1 = null;
        String strB2 = null;
        while (true) {
            String strT = eVar.T(bVar.f2428b);
            if (strT == null) {
                if (eVar.e0() == 13) {
                    break;
                }
                if (eVar.e0() == 16) {
                    continue;
                }
            }
            eVar.u(':');
            if ("className".equals(strT)) {
                if (eVar.e0() == 8) {
                    strB0 = null;
                } else {
                    if (eVar.e0() != 4) {
                        throw new c.a.a.d("syntax error");
                    }
                    strB0 = eVar.b0();
                }
            } else if ("methodName".equals(strT)) {
                if (eVar.e0() == 8) {
                    strB1 = null;
                } else {
                    if (eVar.e0() != 4) {
                        throw new c.a.a.d("syntax error");
                    }
                    strB1 = eVar.b0();
                }
            } else if ("fileName".equals(strT)) {
                if (eVar.e0() == 8) {
                    strB2 = null;
                } else {
                    if (eVar.e0() != 4) {
                        throw new c.a.a.d("syntax error");
                    }
                    strB2 = eVar.b0();
                }
            } else if ("lineNumber".equals(strT)) {
                if (eVar.e0() == 8) {
                    iJ = 0;
                } else {
                    if (eVar.e0() != 2) {
                        throw new c.a.a.d("syntax error");
                    }
                    iJ = eVar.j();
                }
            } else if ("nativeMethod".equals(strT)) {
                if (eVar.e0() != 8 && eVar.e0() != 6 && eVar.e0() != 7) {
                    throw new c.a.a.d("syntax error");
                }
                eVar.t(16);
            } else {
                if (strT != "@type") {
                    throw new c.a.a.d("syntax error : " + strT);
                }
                if (eVar.e0() == 4) {
                    String strB3 = eVar.b0();
                    if (!strB3.equals("java.lang.StackTraceElement")) {
                        throw new c.a.a.d("syntax error : " + strB3);
                    }
                } else if (eVar.e0() != 8) {
                    throw new c.a.a.d("syntax error");
                }
            }
            if (eVar.e0() == 13) {
                break;
            }
        }
        eVar.t(16);
        return (T) new StackTraceElement(strB0, strB1, strB2, iJ);
    }
}
