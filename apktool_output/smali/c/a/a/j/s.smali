.class public Lc/a/a/j/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;
.implements Lc/a/a/i/q/f;


# static fields
.field public static final a:Lc/a/a/j/s;


# instance fields
.field private b:Ljava/text/DecimalFormat;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/s;

    invoke-direct {v0}, Lc/a/a/j/s;-><init>()V

    sput-object v0, Lc/a/a/j/s;->a:Lc/a/a/j/s;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc/a/a/j/s;->b:Ljava/text/DecimalFormat;

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 2

    iget-object p1, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    if-nez p2, :cond_1

    iget p0, p1, Lc/a/a/j/z;->n:I

    sget-object p2, Lc/a/a/j/a0;->i:Lc/a/a/j/a0;

    iget p2, p2, Lc/a/a/j/a0;->z:I

    and-int/2addr p0, p2

    if-eqz p0, :cond_0

    const/16 p0, 0x30

    invoke-virtual {p1, p0}, Lc/a/a/j/z;->write(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lc/a/a/j/z;->o()V

    :goto_0
    return-void

    :cond_1
    instance-of p3, p2, Ljava/lang/Float;

    const/4 p4, 0x0

    const-string v0, ".0"

    if-eqz p3, :cond_6

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p2

    if-eqz p2, :cond_2

    :goto_1
    invoke-virtual {p1}, Lc/a/a/j/z;->o()V

    goto :goto_2

    :cond_2
    invoke-static {p0}, Ljava/lang/Float;->isInfinite(F)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, -0x2

    invoke-virtual {p0, p4, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    :cond_4
    invoke-virtual {p1, p0}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    iget p0, p1, Lc/a/a/j/z;->n:I

    sget-object p2, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget p2, p2, Lc/a/a/j/a0;->z:I

    and-int/2addr p0, p2

    if-eqz p0, :cond_5

    const/16 p0, 0x46

    invoke-virtual {p1, p0}, Lc/a/a/j/z;->write(I)V

    :cond_5
    :goto_2
    return-void

    :cond_6
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v1

    if-eqz v1, :cond_7

    :goto_3
    invoke-virtual {p1}, Lc/a/a/j/z;->o()V

    goto :goto_5

    :cond_7
    invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    iget-object p0, p0, Lc/a/a/j/s;->b:Ljava/text/DecimalFormat;

    if-nez p0, :cond_9

    invoke-static {p2, p3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p2

    add-int/lit8 p2, p2, -0x2

    invoke-virtual {p0, p4, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    goto :goto_4

    :cond_9
    invoke-virtual {p0, p2, p3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    :cond_a
    :goto_4
    invoke-virtual {p1, p0}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    iget p0, p1, Lc/a/a/j/z;->n:I

    sget-object p2, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget p2, p2, Lc/a/a/j/a0;->z:I

    and-int/2addr p0, p2

    if-eqz p0, :cond_b

    const/16 p0, 0x44

    invoke-virtual {p1, p0}, Lc/a/a/j/z;->write(I)V

    :cond_b
    :goto_5
    return-void
.end method

.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
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

    const-class p0, Ljava/lang/Byte;

    const-class p3, Ljava/lang/Short;

    const-class v0, Ljava/lang/Float;

    const-class v1, Ljava/lang/Double;

    iget-object v2, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v2}, Lc/a/a/i/e;->e0()I

    move-result v3

    const/16 v4, 0x10

    const/4 v5, 0x2

    if-ne v3, v5, :cond_9

    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq p2, p1, :cond_8

    if-ne p2, v1, :cond_0

    goto :goto_3

    :cond_0
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq p2, p1, :cond_7

    if-ne p2, v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Lc/a/a/i/e;->n()J

    move-result-wide v0

    invoke-virtual {v2, v4}, Lc/a/a/i/e;->t(I)V

    sget-object p1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq p2, p1, :cond_6

    if-ne p2, p3, :cond_2

    goto :goto_1

    :cond_2
    sget-object p1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq p2, p1, :cond_5

    if-ne p2, p0, :cond_3

    goto :goto_0

    :cond_3
    const-wide/32 p0, -0x80000000

    cmp-long p0, v0, p0

    if-ltz p0, :cond_4

    const-wide/32 p0, 0x7fffffff

    cmp-long p0, v0, p0

    if-gtz p0, :cond_4

    long-to-int p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_5
    :goto_0
    long-to-int p0, v0

    int-to-byte p0, p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_1
    long-to-int p0, v0

    int-to-short p0, p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    :cond_7
    :goto_2
    invoke-virtual {v2}, Lc/a/a/i/e;->v()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, v4}, Lc/a/a/i/e;->t(I)V

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_8
    :goto_3
    invoke-virtual {v2}, Lc/a/a/i/e;->v()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, v4}, Lc/a/a/i/e;->t(I)V

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_9
    const/4 v5, 0x3

    if-ne v3, v5, :cond_12

    sget-object p1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq p2, p1, :cond_11

    if-ne p2, v1, :cond_a

    goto :goto_7

    :cond_a
    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq p2, p1, :cond_10

    if-ne p2, v0, :cond_b

    goto :goto_6

    :cond_b
    invoke-virtual {v2}, Lc/a/a/i/e;->g()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {v2, v4}, Lc/a/a/i/e;->t(I)V

    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_f

    if-ne p2, p3, :cond_c

    goto :goto_5

    :cond_c
    sget-object p3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq p2, p3, :cond_e

    if-ne p2, p0, :cond_d

    goto :goto_4

    :cond_d
    return-object p1

    :cond_e
    :goto_4
    invoke-virtual {p1}, Ljava/math/BigDecimal;->byteValueExact()B

    move-result p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    :cond_f
    :goto_5
    invoke-virtual {p1}, Ljava/math/BigDecimal;->shortValueExact()S

    move-result p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    :cond_10
    :goto_6
    invoke-virtual {v2}, Lc/a/a/i/e;->v()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, v4}, Lc/a/a/i/e;->t(I)V

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_11
    :goto_7
    invoke-virtual {v2}, Lc/a/a/i/e;->v()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, v4}, Lc/a/a/i/e;->t(I)V

    invoke-static {p0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_12
    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_13

    const/4 p0, 0x0

    return-object p0

    :cond_13
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq p2, v2, :cond_1b

    if-ne p2, v1, :cond_14

    goto :goto_b

    :cond_14
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq p2, v1, :cond_1a

    if-ne p2, v0, :cond_15

    goto :goto_a

    :cond_15
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_19

    if-ne p2, p3, :cond_16

    goto :goto_9

    :cond_16
    sget-object p3, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq p2, p3, :cond_18

    if-ne p2, p0, :cond_17

    goto :goto_8

    :cond_17
    invoke-static {p1}, Lc/a/a/k/d;->f(Ljava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0

    :cond_18
    :goto_8
    invoke-static {p1}, Lc/a/a/k/d;->i(Ljava/lang/Object;)Ljava/lang/Byte;

    move-result-object p0

    return-object p0

    :cond_19
    :goto_9
    invoke-static {p1}, Lc/a/a/k/d;->s(Ljava/lang/Object;)Ljava/lang/Short;

    move-result-object p0

    return-object p0

    :cond_1a
    :goto_a
    invoke-static {p1}, Lc/a/a/k/d;->o(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_1b
    :goto_b
    invoke-static {p1}, Lc/a/a/k/d;->m(Ljava/lang/Object;)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method
