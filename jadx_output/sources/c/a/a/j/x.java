package c.a.a.j;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.AbstractSequentialList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f2536a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.a.a.k.b<t> f2537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f2538c = "@type";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.a.a.g f2539d;

    public x() {
        c.a.a.k.b<t> bVar = new c.a.a.k.b<>(1024);
        this.f2537b = bVar;
        bVar.c(Boolean.class, f.f2506a);
        q qVar = q.f2529a;
        bVar.c(Character.class, qVar);
        bVar.c(Byte.class, k.f2516a);
        bVar.c(Short.class, k.f2516a);
        bVar.c(Integer.class, k.f2516a);
        bVar.c(Long.class, k.f2516a);
        s sVar = s.f2530a;
        bVar.c(Float.class, sVar);
        bVar.c(Double.class, sVar);
        bVar.c(Number.class, sVar);
        e eVar = e.f2505a;
        bVar.c(BigDecimal.class, eVar);
        bVar.c(BigInteger.class, eVar);
        bVar.c(String.class, b0.f2499a);
        bVar.c(Object[].class, b.f2498a);
        bVar.c(Class.class, qVar);
        bVar.c(SimpleDateFormat.class, qVar);
        bVar.c(Locale.class, qVar);
        bVar.c(Currency.class, qVar);
        bVar.c(TimeZone.class, qVar);
        bVar.c(UUID.class, qVar);
        bVar.c(URI.class, qVar);
        bVar.c(URL.class, qVar);
        bVar.c(Pattern.class, qVar);
        bVar.c(Charset.class, qVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public t a(Class<?> cls) {
        c.a.a.k.b<t> bVar;
        t iVar;
        Class<? super Object> superclass;
        boolean z;
        t nVar;
        t tVar;
        t tVarB = this.f2537b.b(cls);
        if (tVarB != null) {
            return tVarB;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            if (AbstractSequentialList.class.isAssignableFrom(cls)) {
                bVar = this.f2537b;
                iVar = g.f2507a;
            } else if (List.class.isAssignableFrom(cls)) {
                bVar = this.f2537b;
                iVar = new o();
            } else if (Collection.class.isAssignableFrom(cls)) {
                bVar = this.f2537b;
                iVar = g.f2507a;
            } else if (Date.class.isAssignableFrom(cls)) {
                bVar = this.f2537b;
                iVar = h.f2508a;
            } else if (c.a.a.c.class.isAssignableFrom(cls) || l.class.isAssignableFrom(cls) || c.a.a.f.class.isAssignableFrom(cls)) {
                bVar = this.f2537b;
                iVar = q.f2529a;
            } else if (cls.isEnum() || !((superclass = cls.getSuperclass()) == null || superclass == Object.class || !superclass.isEnum())) {
                bVar = this.f2537b;
                iVar = new i();
            } else if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                t tVarA = a(componentType);
                c.a.a.k.b<t> bVar2 = this.f2537b;
                c cVar = new c(componentType, tVarA);
                bVar2.c(cls, cVar);
                tVar = cVar;
            } else {
                if (Throwable.class.isAssignableFrom(cls)) {
                    n nVar2 = new n(cls, this.f2539d);
                    nVar2.f2527e |= a0.WriteClassName.z;
                    nVar = nVar2;
                } else if (TimeZone.class.isAssignableFrom(cls) || Charset.class.isAssignableFrom(cls) || Enumeration.class.isAssignableFrom(cls)) {
                    bVar = this.f2537b;
                    iVar = q.f2529a;
                } else {
                    if (!Calendar.class.isAssignableFrom(cls)) {
                        Class<?>[] interfaces = cls.getInterfaces();
                        int length = interfaces.length;
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            z = true;
                            if (i >= length) {
                                z = false;
                                break;
                            }
                            Class<?> cls2 = interfaces[i];
                            if (cls2.getName().equals("net.sf.cglib.proxy.Factory") || cls2.getName().equals("org.springframework.cglib.proxy.Factory")) {
                                z = false;
                                z2 = true;
                                break;
                            }
                            if (cls2.getName().equals("javassist.util.proxy.ProxyObject")) {
                                break;
                            }
                            i++;
                        }
                        if (z2 || z) {
                            t tVarA2 = a(cls.getSuperclass());
                            this.f2537b.c(cls, tVarA2);
                            return tVarA2;
                        }
                        nVar = cls.getName().startsWith("android.net.Uri$") ? q.f2529a : new n(cls, this.f2539d);
                    }
                    bVar = this.f2537b;
                    iVar = h.f2508a;
                }
                this.f2537b.c(cls, nVar);
                tVar = nVar;
            }
            if (tVar == null) {
                return this.f2537b.b(cls);
            }
            return tVar;
        }
        bVar = this.f2537b;
        iVar = new p();
        bVar.c(cls, iVar);
        tVar = iVar;
        if (tVar == null) {
            return this.f2537b.b(cls);
        }
        return tVar;
    }
}
