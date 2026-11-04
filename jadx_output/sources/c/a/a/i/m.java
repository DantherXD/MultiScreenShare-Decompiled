package c.a.a.i;

import c.a.a.j.b0;
import c.a.a.j.q;
import c.a.a.j.s;
import java.io.Closeable;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long[] f2473a = {-9164606388214699518L, -8720046426850100497L, -8649961213709896794L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3935185854875733362L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 823641066473609950L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3794316665763266033L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4241163808635564644L, 4254584350247334433L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5944107969236155580L, 6007332606592876737L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8389032537095247355L, 8409640769019589119L, 8488266005336625107L, 8537233257283452655L, 8838294710098435315L, 9140390920032557669L, 9140416208800006522L};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static m f2474b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c.a.a.k.b<c.a.a.i.q.f> f2475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f2476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ClassLoader f2477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.a.a.g f2478f;
    public boolean g;

    public m() {
        c.a.a.k.b<c.a.a.i.q.f> bVar = new c.a.a.k.b<>(1024);
        this.f2475c = bVar;
        this.f2476d = new o(16384);
        q qVar = q.f2529a;
        bVar.c(SimpleDateFormat.class, qVar);
        c.a.a.j.h hVar = c.a.a.j.h.f2508a;
        bVar.c(Date.class, hVar);
        bVar.c(Calendar.class, hVar);
        bVar.c(Map.class, k.f2467a);
        bVar.c(HashMap.class, k.f2467a);
        bVar.c(LinkedHashMap.class, k.f2467a);
        bVar.c(TreeMap.class, k.f2467a);
        bVar.c(ConcurrentMap.class, k.f2467a);
        bVar.c(ConcurrentHashMap.class, k.f2467a);
        c.a.a.j.g gVar = c.a.a.j.g.f2507a;
        bVar.c(Collection.class, gVar);
        bVar.c(List.class, gVar);
        bVar.c(ArrayList.class, gVar);
        i iVar = i.f2464a;
        bVar.c(Object.class, iVar);
        bVar.c(String.class, b0.f2499a);
        bVar.c(Character.TYPE, qVar);
        bVar.c(Character.class, qVar);
        Class cls = Byte.TYPE;
        s sVar = s.f2530a;
        bVar.c(cls, sVar);
        bVar.c(Byte.class, sVar);
        bVar.c(Short.TYPE, sVar);
        bVar.c(Short.class, sVar);
        bVar.c(Integer.TYPE, c.a.a.j.k.f2516a);
        bVar.c(Integer.class, c.a.a.j.k.f2516a);
        bVar.c(Long.TYPE, c.a.a.j.k.f2516a);
        bVar.c(Long.class, c.a.a.j.k.f2516a);
        c.a.a.j.e eVar = c.a.a.j.e.f2505a;
        bVar.c(BigInteger.class, eVar);
        bVar.c(BigDecimal.class, eVar);
        bVar.c(Float.TYPE, sVar);
        bVar.c(Float.class, sVar);
        bVar.c(Double.TYPE, sVar);
        bVar.c(Double.class, sVar);
        Class cls2 = Boolean.TYPE;
        c.a.a.j.f fVar = c.a.a.j.f.f2506a;
        bVar.c(cls2, fVar);
        bVar.c(Boolean.class, fVar);
        bVar.c(Class.class, qVar);
        c.a.a.j.b bVar2 = c.a.a.j.b.f2498a;
        bVar.c(char[].class, bVar2);
        bVar.c(Object[].class, bVar2);
        bVar.c(UUID.class, qVar);
        bVar.c(TimeZone.class, qVar);
        bVar.c(Locale.class, qVar);
        bVar.c(Currency.class, qVar);
        bVar.c(URI.class, qVar);
        bVar.c(URL.class, qVar);
        bVar.c(Pattern.class, qVar);
        bVar.c(Charset.class, qVar);
        bVar.c(Number.class, sVar);
        bVar.c(StackTraceElement.class, qVar);
        bVar.c(Serializable.class, iVar);
        bVar.c(Cloneable.class, iVar);
        bVar.c(Comparable.class, iVar);
        bVar.c(Closeable.class, iVar);
    }

    public static m e() {
        return f2474b;
    }

    public static boolean f(Class<?> cls) {
        return cls.isPrimitive() || cls == Boolean.class || cls == Character.class || cls == Byte.class || cls == Short.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == BigInteger.class || cls == BigDecimal.class || cls == String.class || cls == Date.class || cls == java.sql.Date.class || cls == Time.class || cls == Timestamp.class;
    }

    public Class<?> a(String str, Class<?> cls, int i) {
        if (str == null) {
            return null;
        }
        if (str.length() < 128) {
            if (str.length() >= 3) {
                long jCharAt = (((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L;
                if (jCharAt == -5808493101479473382L) {
                    throw new c.a.a.d("autoType is not support. " + str);
                }
                if ((jCharAt ^ ((long) str.charAt(str.length() - 1))) * 1099511628211L == 655701488918567152L) {
                    throw new c.a.a.d("autoType is not support. " + str);
                }
                long jCharAt2 = (((((((long) str.charAt(0)) ^ (-3750763034362895579L)) * 1099511628211L) ^ ((long) str.charAt(1))) * 1099511628211L) ^ ((long) str.charAt(2))) * 1099511628211L;
                for (int i2 = 3; i2 < str.length(); i2++) {
                    jCharAt2 = (jCharAt2 ^ ((long) str.charAt(i2))) * 1099511628211L;
                    if (Arrays.binarySearch(f2473a, jCharAt2) >= 0 && c.a.a.k.d.A(str) == null) {
                        throw new c.a.a.d("autoType is not support. " + str);
                    }
                }
                Class<?> clsA = c.a.a.k.d.A(str);
                if (clsA != null) {
                    return clsA;
                }
                Class<?> clsA2 = this.f2475c.a(str);
                if (clsA2 != null) {
                    return clsA2;
                }
                Class<?> clsL = c.a.a.k.d.L(str, this.f2477e, false);
                if (clsL != null && cls != null && clsL != HashMap.class) {
                    if (cls.isAssignableFrom(clsL)) {
                        c.a.a.k.d.a(str, clsL);
                        return clsL;
                    }
                    throw new c.a.a.d("type not match. " + str + " -> " + cls.getName());
                }
                if (clsL.isAnnotationPresent(c.a.a.h.c.class)) {
                    c.a.a.k.d.a(str, clsL);
                    return clsL;
                }
                int i3 = d.SupportAutoType.u;
                if ((i & i3) != 0 || (i3 & c.a.a.a.f2418d) != 0 || this.g) {
                    c.a.a.k.d.a(str, clsL);
                    return clsL;
                }
                throw new c.a.a.d("autoType is not support : " + str);
            }
        }
        throw new c.a.a.d("autoType is not support. " + str);
    }

    public c.a.a.i.q.d b(m mVar, Class<?> cls, c.a.a.k.a aVar) {
        Class<?> cls2 = aVar.h;
        return (cls2 == List.class || cls2 == ArrayList.class || (cls2.isArray() && !cls2.getComponentType().isPrimitive())) ? new j(mVar, cls, aVar) : new a(mVar, cls, aVar);
    }

    public c.a.a.i.q.f c(Class<?> cls, Type type) {
        c.a.a.i.q.f gVar;
        c.a.a.h.c cVar;
        Class<?> clsMappingTo;
        c.a.a.i.q.f fVarB = this.f2475c.b(type);
        if (fVarB != null) {
            return fVarB;
        }
        if (type == null) {
            type = cls;
        }
        c.a.a.i.q.f fVarB2 = this.f2475c.b(type);
        if (fVarB2 != null) {
            return fVarB2;
        }
        if (!f(cls) && (cVar = (c.a.a.h.c) cls.getAnnotation(c.a.a.h.c.class)) != null && (clsMappingTo = cVar.mappingTo()) != Void.class) {
            return c(clsMappingTo, clsMappingTo);
        }
        if ((type instanceof WildcardType) || (type instanceof TypeVariable) || (type instanceof ParameterizedType)) {
            fVarB2 = this.f2475c.b(cls);
        }
        if (fVarB2 != null) {
            return fVarB2;
        }
        c.a.a.i.q.f fVarB3 = this.f2475c.b(type);
        if (fVarB3 != null) {
            return fVarB3;
        }
        if (cls.isEnum()) {
            gVar = new c(cls);
        } else if (cls.isArray()) {
            gVar = c.a.a.j.b.f2498a;
        } else if (cls == Set.class || cls == HashSet.class || cls == Collection.class || cls == List.class || cls == ArrayList.class || Collection.class.isAssignableFrom(cls)) {
            gVar = c.a.a.j.g.f2507a;
        } else if (Map.class.isAssignableFrom(cls)) {
            gVar = k.f2467a;
        } else if (Throwable.class.isAssignableFrom(cls)) {
            gVar = new p(this, cls);
        } else {
            gVar = cls.getName().equals("android.net.Uri") ? q.f2529a : new g(this, cls, type);
        }
        g(type, gVar);
        return gVar;
    }

    public c.a.a.i.q.f d(Type type) {
        c.a.a.i.q.f fVarB = this.f2475c.b(type);
        if (fVarB != null) {
            return fVarB;
        }
        if (type instanceof Class) {
            return c((Class) type, type);
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            return rawType instanceof Class ? c((Class) rawType, type) : d(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return d(upperBounds[0]);
            }
        }
        return i.f2464a;
    }

    public void g(Type type, c.a.a.i.q.f fVar) {
        this.f2475c.c(type, fVar);
    }
}
