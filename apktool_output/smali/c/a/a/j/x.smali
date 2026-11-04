.class public Lc/a/a/j/x;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lc/a/a/j/x;


# instance fields
.field private final b:Lc/a/a/k/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/k/b<",
            "Lc/a/a/j/t;",
            ">;"
        }
    .end annotation
.end field

.field protected c:Ljava/lang/String;

.field public d:Lc/a/a/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/x;

    invoke-direct {v0}, Lc/a/a/j/x;-><init>()V

    sput-object v0, Lc/a/a/j/x;->a:Lc/a/a/j/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "@type"

    iput-object v0, p0, Lc/a/a/j/x;->c:Ljava/lang/String;

    new-instance v0, Lc/a/a/k/b;

    const/16 v1, 0x400

    invoke-direct {v0, v1}, Lc/a/a/k/b;-><init>(I)V

    iput-object v0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    const-class p0, Ljava/lang/Boolean;

    sget-object v1, Lc/a/a/j/f;->a:Lc/a/a/j/f;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/Character;

    sget-object v1, Lc/a/a/j/q;->a:Lc/a/a/j/q;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/Byte;

    sget-object v2, Lc/a/a/j/k;->a:Lc/a/a/j/k;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/Short;

    sget-object v2, Lc/a/a/j/k;->a:Lc/a/a/j/k;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/Integer;

    sget-object v2, Lc/a/a/j/k;->a:Lc/a/a/j/k;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/Long;

    sget-object v2, Lc/a/a/j/k;->a:Lc/a/a/j/k;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/Float;

    sget-object v2, Lc/a/a/j/s;->a:Lc/a/a/j/s;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/Double;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/Number;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/math/BigDecimal;

    sget-object v2, Lc/a/a/j/e;->a:Lc/a/a/j/e;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/math/BigInteger;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/String;

    sget-object v2, Lc/a/a/j/b0;->a:Lc/a/a/j/b0;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, [Ljava/lang/Object;

    sget-object v2, Lc/a/a/j/b;->a:Lc/a/a/j/b;

    invoke-virtual {v0, p0, v2}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/lang/Class;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/text/SimpleDateFormat;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/util/Locale;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/util/Currency;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/util/TimeZone;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/util/UUID;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/net/URI;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/net/URL;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    const-class p0, Ljava/nio/charset/Charset;

    invoke-virtual {v0, p0, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lc/a/a/j/t;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lc/a/a/j/t;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    invoke-virtual {v0, p1}, Lc/a/a/k/b;->b(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/j/t;

    if-nez v0, :cond_17

    const-class v0, Ljava/util/Map;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    new-instance v1, Lc/a/a/j/p;

    invoke-direct {v1}, Lc/a/a/j/p;-><init>()V

    :goto_0
    invoke-virtual {v0, p1, v1}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    move-object v0, v1

    goto/16 :goto_a

    :cond_0
    const-class v0, Ljava/util/AbstractSequentialList;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    iget-object v0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    sget-object v1, Lc/a/a/j/g;->a:Lc/a/a/j/g;

    goto :goto_0

    :cond_1
    const-class v0, Ljava/util/List;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    new-instance v1, Lc/a/a/j/o;

    invoke-direct {v1}, Lc/a/a/j/o;-><init>()V

    goto :goto_0

    :cond_2
    const-class v0, Ljava/util/Collection;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    const-class v0, Ljava/util/Date;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    :goto_2
    iget-object v0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    sget-object v1, Lc/a/a/j/h;->a:Lc/a/a/j/h;

    goto :goto_0

    :cond_4
    const-class v0, Lc/a/a/c;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_3
    iget-object v0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    sget-object v1, Lc/a/a/j/q;->a:Lc/a/a/j/q;

    goto :goto_0

    :cond_5
    const-class v0, Lc/a/a/j/l;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    const-class v0, Lc/a/a/f;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_8

    const-class v1, Ljava/lang/Object;

    if-eq v0, v1, :cond_8

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_8

    goto/16 :goto_9

    :cond_8
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v1

    iget-object v2, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    new-instance v3, Lc/a/a/j/c;

    invoke-direct {v3, v0, v1}, Lc/a/a/j/c;-><init>(Ljava/lang/Class;Lc/a/a/j/t;)V

    invoke-virtual {v2, p1, v3}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    move-object v0, v3

    goto/16 :goto_a

    :cond_9
    const-class v0, Ljava/lang/Throwable;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Lc/a/a/j/n;

    iget-object v1, p0, Lc/a/a/j/x;->d:Lc/a/a/g;

    invoke-direct {v0, p1, v1}, Lc/a/a/j/n;-><init>(Ljava/lang/Class;Lc/a/a/g;)V

    iget v1, v0, Lc/a/a/j/n;->e:I

    sget-object v2, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v2, v2, Lc/a/a/j/a0;->z:I

    or-int/2addr v1, v2

    iput v1, v0, Lc/a/a/j/n;->e:I

    :goto_4
    iget-object v1, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    invoke-virtual {v1, p1, v0}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    goto/16 :goto_a

    :cond_a
    const-class v0, Ljava/util/TimeZone;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_3

    :cond_b
    const-class v0, Ljava/nio/charset/Charset;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_3

    :cond_c
    const-class v0, Ljava/util/Enumeration;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_d

    goto/16 :goto_3

    :cond_d
    const-class v0, Ljava/util/Calendar;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_e

    goto/16 :goto_2

    :cond_e
    invoke-virtual {p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_5
    const/4 v4, 0x1

    if-ge v3, v1, :cond_12

    aget-object v5, v0, v3

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "net.sf.cglib.proxy.Factory"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    const-string v7, "org.springframework.cglib.proxy.Factory"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_f

    goto :goto_6

    :cond_f
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-string v6, "javassist.util.proxy.ProxyObject"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    goto :goto_7

    :cond_10
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_11
    :goto_6
    move v8, v4

    move v4, v2

    move v2, v8

    goto :goto_7

    :cond_12
    move v4, v2

    :goto_7
    if-nez v2, :cond_15

    if-eqz v4, :cond_13

    goto :goto_8

    :cond_13
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.net.Uri$"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v0, Lc/a/a/j/q;->a:Lc/a/a/j/q;

    goto :goto_4

    :cond_14
    new-instance v0, Lc/a/a/j/n;

    iget-object v1, p0, Lc/a/a/j/x;->d:Lc/a/a/g;

    invoke-direct {v0, p1, v1}, Lc/a/a/j/n;-><init>(Ljava/lang/Class;Lc/a/a/g;)V

    goto/16 :goto_4

    :cond_15
    :goto_8
    invoke-virtual {p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p0, v0}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v0

    iget-object p0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    invoke-virtual {p0, p1, v0}, Lc/a/a/k/b;->c(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z

    return-object v0

    :cond_16
    :goto_9
    iget-object v0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    new-instance v1, Lc/a/a/j/i;

    invoke-direct {v1}, Lc/a/a/j/i;-><init>()V

    goto/16 :goto_0

    :goto_a
    if-nez v0, :cond_17

    iget-object p0, p0, Lc/a/a/j/x;->b:Lc/a/a/k/b;

    invoke-virtual {p0, p1}, Lc/a/a/k/b;->b(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lc/a/a/j/t;

    :cond_17
    return-object v0
.end method
