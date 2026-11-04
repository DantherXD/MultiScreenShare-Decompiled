.class public final Lc/a/a/j/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;
.implements Lc/a/a/i/q/f;


# static fields
.field public static final a:Lc/a/a/j/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/q;

    invoke-direct {v0}, Lc/a/a/j/q;-><init>()V

    sput-object v0, Lc/a/a/j/q;->a:Lc/a/a/j/q;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 5

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    if-nez p2, :cond_3

    sget-object p2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-eq p4, p2, :cond_2

    const-class p2, Ljava/lang/Character;

    if-ne p4, p2, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, Lc/a/a/j/z;->n:I

    sget-object p2, Lc/a/a/j/a0;->g:Lc/a/a/j/a0;

    iget p2, p2, Lc/a/a/j/a0;->z:I

    and-int/2addr p1, p2

    if-eqz p1, :cond_1

    invoke-static {p4}, Lc/a/a/k/d;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p1

    const-class p2, Ljava/util/Enumeration;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "[]"

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    goto :goto_1

    :cond_2
    :goto_0
    const-string p0, ""

    invoke-virtual {p1, p0}, Lc/a/a/j/m;->s(Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_3
    instance-of v0, p2, Ljava/util/regex/Pattern;

    if-eqz v0, :cond_4

    check-cast p2, Ljava/util/regex/Pattern;

    invoke-virtual {p2}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    move-result-object p0

    :goto_2
    invoke-virtual {p1, p0}, Lc/a/a/j/m;->s(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_4
    instance-of v0, p2, Ljava/util/TimeZone;

    if-eqz v0, :cond_5

    check-cast p2, Ljava/util/TimeZone;

    invoke-virtual {p2}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_5
    instance-of v0, p2, Ljava/util/Currency;

    if-eqz v0, :cond_6

    check-cast p2, Ljava/util/Currency;

    invoke-virtual {p2}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_6
    instance-of v0, p2, Ljava/lang/Class;

    if-eqz v0, :cond_7

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_7
    instance-of v0, p2, Ljava/lang/Character;

    if-eqz v0, :cond_9

    check-cast p2, Ljava/lang/Character;

    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p0

    if-nez p0, :cond_8

    const-string p0, "\u0000"

    goto :goto_2

    :cond_8
    invoke-virtual {p2}, Ljava/lang/Character;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_9
    instance-of v0, p2, Ljava/text/SimpleDateFormat;

    const/16 v1, 0x2c

    const/4 v2, 0x0

    if-eqz v0, :cond_b

    move-object p3, p2

    check-cast p3, Ljava/text/SimpleDateFormat;

    invoke-virtual {p3}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    move-result-object p3

    iget v0, p0, Lc/a/a/j/z;->n:I

    sget-object v3, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v3, v3, Lc/a/a/j/a0;->z:I

    and-int/2addr v0, v3

    if-eqz v0, :cond_a

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-eq v0, p4, :cond_a

    const/16 p4, 0x7b

    invoke-virtual {p0, p4}, Lc/a/a/j/z;->write(I)V

    const-string p4, "@type"

    invoke-virtual {p0, p4, v2}, Lc/a/a/j/z;->j(Ljava/lang/String;Z)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lc/a/a/j/m;->s(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lc/a/a/j/z;->write(I)V

    const-string p1, "val"

    invoke-virtual {p0, p1, v2}, Lc/a/a/j/z;->j(Ljava/lang/String;Z)V

    invoke-virtual {p0, p3}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    const/16 p1, 0x7d

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(I)V

    return-void

    :cond_a
    invoke-virtual {p0, p3}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_b
    instance-of v0, p2, Lc/a/a/f;

    if-eqz v0, :cond_c

    check-cast p2, Lc/a/a/f;

    invoke-interface {p2, p0}, Lc/a/a/f;->b(Ljava/lang/Appendable;)V

    goto/16 :goto_5

    :cond_c
    instance-of v0, p2, Lc/a/a/c;

    if-eqz v0, :cond_d

    check-cast p2, Lc/a/a/c;

    invoke-interface {p2}, Lc/a/a/c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    goto/16 :goto_5

    :cond_d
    instance-of v0, p2, Lc/a/a/j/l;

    if-eqz v0, :cond_e

    check-cast p2, Lc/a/a/j/l;

    invoke-interface {p2, p1, p3, p4}, Lc/a/a/j/l;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_5

    :cond_e
    instance-of v0, p2, Ljava/util/Enumeration;

    if-eqz v0, :cond_13

    const/4 v0, 0x0

    iget v3, p0, Lc/a/a/j/z;->n:I

    sget-object v4, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v4, v4, Lc/a/a/j/a0;->z:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_f

    instance-of v3, p4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_f

    check-cast p4, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p4}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p4

    aget-object v0, p4, v2

    :cond_f
    move-object p4, p2

    check-cast p4, Ljava/util/Enumeration;

    iget-object v3, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    invoke-virtual {p1, v3, p2, p3, v2}, Lc/a/a/j/m;->p(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 p2, 0x5b

    :try_start_0
    invoke-virtual {p0, p2}, Lc/a/a/j/z;->write(I)V

    :goto_3
    invoke-interface {p4}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result p2

    if-eqz p2, :cond_12

    invoke-interface {p4}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object p2

    add-int/lit8 p3, v2, 0x1

    if-eqz v2, :cond_10

    invoke-virtual {p0, v1}, Lc/a/a/j/z;->write(I)V

    :cond_10
    if-nez p2, :cond_11

    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    goto :goto_4

    :cond_11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    iget-object v4, p1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v4, v2}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v2

    add-int/lit8 v4, p3, -0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, p1, p2, v4, v0}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    :goto_4
    move v2, p3

    goto :goto_3

    :cond_12
    const/16 p2, 0x5d

    invoke-virtual {p0, p2}, Lc/a/a/j/z;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v3, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    goto :goto_5

    :catchall_0
    move-exception p0

    iput-object v3, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    throw p0

    :cond_13
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_2

    :goto_5
    return-void
.end method

.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    const-string p3, "android.net.Uri"

    const-class v0, Ljava/lang/StackTraceElement;

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Lc/a/a/j/q;->c(Lc/a/a/i/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    iget-object p0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v0, p1, Lc/a/a/i/b;->k:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ne v0, v1, :cond_3

    iput v2, p1, Lc/a/a/i/b;->k:I

    const/16 v0, 0x10

    invoke-virtual {p1, v0}, Lc/a/a/i/b;->a(I)V

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v0

    const/4 v3, 0x4

    const-string v4, "syntax error"

    if-ne v0, v3, :cond_2

    invoke-virtual {p0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v0

    const-string v3, "val"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc/a/a/i/e;->s()V

    const/16 p0, 0x11

    invoke-virtual {p1, p0}, Lc/a/a/i/b;->a(I)V

    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object p0

    const/16 v0, 0xd

    invoke-virtual {p1, v0}, Lc/a/a/i/b;->a(I)V

    goto :goto_0

    :cond_1
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v4}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v4}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    const/4 v0, 0x0

    if-nez p0, :cond_4

    return-object v0

    :cond_4
    instance-of v3, p0, Ljava/lang/String;

    if-eqz v3, :cond_14

    check-cast p0, Ljava/lang/String;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_5

    return-object v0

    :cond_5
    const-class v3, Ljava/util/UUID;

    if-ne p2, v3, :cond_6

    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0

    return-object p0

    :cond_6
    const-class v3, Ljava/lang/Class;

    if-ne p2, v3, :cond_7

    iget-object p1, p1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    iget-object p1, p1, Lc/a/a/i/m;->e:Ljava/lang/ClassLoader;

    invoke-static {p0, p1, v2}, Lc/a/a/k/d;->L(Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_7
    const-class v3, Ljava/util/Locale;

    const/4 v4, 0x1

    if-ne p2, v3, :cond_a

    const-string p1, "_"

    invoke-virtual {p0, p1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length p1, p0

    if-ne p1, v4, :cond_8

    new-instance p1, Ljava/util/Locale;

    aget-object p0, p0, v2

    invoke-direct {p1, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_8
    array-length p1, p0

    if-ne p1, v1, :cond_9

    new-instance p1, Ljava/util/Locale;

    aget-object p2, p0, v2

    aget-object p0, p0, v4

    invoke-direct {p1, p2, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_9
    new-instance p1, Ljava/util/Locale;

    aget-object p2, p0, v2

    aget-object p3, p0, v4

    aget-object p0, p0, v1

    invoke-direct {p1, p2, p3, p0}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1

    :cond_a
    const-class v1, Ljava/net/URI;

    if-ne p2, v1, :cond_b

    invoke-static {p0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object p0

    return-object p0

    :cond_b
    const-class v1, Ljava/net/URL;

    if-ne p2, v1, :cond_c

    :try_start_0
    new-instance p1, Ljava/net/URL;

    invoke-direct {p1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Lc/a/a/d;

    const-string p2, "create url error"

    invoke-direct {p1, p2, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_c
    const-class v1, Ljava/util/regex/Pattern;

    if-ne p2, v1, :cond_d

    invoke-static {p0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p0

    return-object p0

    :cond_d
    const-class v1, Ljava/nio/charset/Charset;

    if-ne p2, v1, :cond_e

    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p0

    return-object p0

    :cond_e
    const-class v1, Ljava/util/Currency;

    if-ne p2, v1, :cond_f

    invoke-static {p0}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p0

    return-object p0

    :cond_f
    const-class v1, Ljava/text/SimpleDateFormat;

    if-ne p2, v1, :cond_10

    new-instance p2, Ljava/text/SimpleDateFormat;

    iget-object p3, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-object p3, p3, Lc/a/a/i/e;->u:Ljava/util/Locale;

    invoke-direct {p2, p0, p3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iget-object p0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-object p0, p0, Lc/a/a/i/e;->t:Ljava/util/TimeZone;

    invoke-virtual {p2, p0}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    return-object p2

    :cond_10
    sget-object p1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-eq p2, p1, :cond_13

    const-class p1, Ljava/lang/Character;

    if-ne p2, p1, :cond_11

    goto :goto_1

    :cond_11
    instance-of p1, p2, Ljava/lang/Class;

    if-eqz p1, :cond_12

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_12

    :try_start_1
    invoke-static {p3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    const-string p2, "parse"

    new-array p3, v4, [Ljava/lang/Class;

    const-class v1, Ljava/lang/String;

    aput-object v1, p3, v2

    invoke-virtual {p1, p2, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p1

    new-array p2, v4, [Ljava/lang/Object;

    aput-object p0, p2, v2

    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    move-exception p0

    new-instance p1, Lc/a/a/d;

    const-string p2, "parse android.net.Uri error."

    invoke-direct {p1, p2, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_12
    invoke-static {p0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object p0

    return-object p0

    :cond_13
    :goto_1
    invoke-static {p0}, Lc/a/a/k/d;->k(Ljava/lang/Object;)Ljava/lang/Character;

    move-result-object p0

    return-object p0

    :cond_14
    instance-of p1, p0, Lc/a/a/e;

    if-eqz p1, :cond_17

    check-cast p0, Lc/a/a/e;

    const-class p1, Ljava/util/Currency;

    if-ne p2, p1, :cond_16

    const-string p1, "currency"

    invoke-virtual {p0, p1}, Lc/a/a/e;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_15

    invoke-static {p1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p0

    return-object p0

    :cond_15
    const-string p1, "currencyCode"

    invoke-virtual {p0, p1}, Lc/a/a/e;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_16

    invoke-static {p1}, Ljava/util/Currency;->getInstance(Ljava/lang/String;)Ljava/util/Currency;

    move-result-object p0

    return-object p0

    :cond_16
    const-class p1, Ljava/util/Map$Entry;

    if-ne p2, p1, :cond_17

    invoke-virtual {p0}, Lc/a/a/e;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_17
    new-instance p0, Lc/a/a/d;

    const-string p1, "except string value"

    invoke-direct {p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected c(Lc/a/a/i/b;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            ")TT;"
        }
    .end annotation

    iget-object p0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Lc/a/a/i/e;->s()V

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v0

    const/16 v3, 0xc

    const/16 v4, 0x10

    if-eq v0, v3, :cond_2

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v0

    if-ne v0, v4, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Lc/a/a/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "syntax error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result p0

    invoke-static {p0}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    const/4 v0, 0x0

    move v7, v0

    move-object v3, v1

    move-object v5, v3

    move-object v6, v5

    :cond_3
    :goto_1
    iget-object v8, p1, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    invoke-virtual {p0, v8}, Lc/a/a/i/e;->T(Lc/a/a/i/o;)Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xd

    if-nez v8, :cond_5

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v10

    if-ne v10, v9, :cond_4

    :goto_2
    invoke-virtual {p0, v4}, Lc/a/a/i/e;->t(I)V

    goto/16 :goto_5

    :cond_4
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v10

    if-ne v10, v4, :cond_5

    goto :goto_1

    :cond_5
    const/16 v10, 0x3a

    invoke-virtual {p0, v10}, Lc/a/a/i/e;->u(C)V

    const-string v10, "className"

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    const/4 v11, 0x4

    const-string v12, "syntax error"

    if-eqz v10, :cond_8

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v3

    if-ne v3, v2, :cond_6

    move-object v3, v1

    goto/16 :goto_4

    :cond_6
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v3

    if-ne v3, v11, :cond_7

    invoke-virtual {p0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v3

    goto/16 :goto_4

    :cond_7
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v12}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    const-string v10, "methodName"

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v5

    if-ne v5, v2, :cond_9

    move-object v5, v1

    goto/16 :goto_4

    :cond_9
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v5

    if-ne v5, v11, :cond_a

    invoke-virtual {p0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_4

    :cond_a
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v12}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_b
    const-string v10, "fileName"

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_e

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v6

    if-ne v6, v2, :cond_c

    move-object v6, v1

    goto/16 :goto_4

    :cond_c
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v6

    if-ne v6, v11, :cond_d

    invoke-virtual {p0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_4

    :cond_d
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v12}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_e
    const-string v10, "lineNumber"

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v7

    if-ne v7, v2, :cond_f

    move v7, v0

    goto/16 :goto_4

    :cond_f
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_10

    invoke-virtual {p0}, Lc/a/a/i/e;->j()I

    move-result v7

    goto :goto_4

    :cond_10
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v12}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    const-string v10, "nativeMethod"

    invoke-virtual {v10, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_15

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v8

    if-ne v8, v2, :cond_12

    :goto_3
    invoke-virtual {p0, v4}, Lc/a/a/i/e;->t(I)V

    goto :goto_4

    :cond_12
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v8

    const/4 v10, 0x6

    if-ne v8, v10, :cond_13

    goto :goto_3

    :cond_13
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v8

    const/4 v10, 0x7

    if-ne v8, v10, :cond_14

    goto :goto_3

    :cond_14
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v12}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_15
    const-string v10, "syntax error : "

    const-string v13, "@type"

    if-ne v8, v13, :cond_19

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v8

    if-ne v8, v11, :cond_17

    invoke-virtual {p0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v8

    const-string v11, "java.lang.StackTraceElement"

    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_16

    goto :goto_4

    :cond_16
    new-instance p0, Lc/a/a/d;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_17
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v8

    if-ne v8, v2, :cond_18

    :goto_4
    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result v8

    if-ne v8, v9, :cond_3

    goto/16 :goto_2

    :goto_5
    new-instance p0, Ljava/lang/StackTraceElement;

    invoke-direct {p0, v3, v5, v6, v7}, Ljava/lang/StackTraceElement;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object p0

    :cond_18
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v12}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_19
    new-instance p0, Lc/a/a/d;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0
.end method
