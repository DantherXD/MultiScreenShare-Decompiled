.class public final Lc/a/a/j/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;
.implements Lc/a/a/i/q/f;


# static fields
.field public static a:Lc/a/a/j/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/k;

    invoke-direct {v0}, Lc/a/a/j/k;-><init>()V

    sput-object v0, Lc/a/a/j/k;->a:Lc/a/a/j/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 2

    const-class p0, Ljava/lang/Long;

    iget-object p1, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    move-object p3, p2

    check-cast p3, Ljava/lang/Number;

    if-nez p3, :cond_1

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
    instance-of p2, p2, Ljava/lang/Long;

    if-eqz p2, :cond_2

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lc/a/a/j/z;->n(J)V

    goto :goto_1

    :cond_2
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p1, p2}, Lc/a/a/j/z;->k(I)V

    :goto_1
    iget p2, p1, Lc/a/a/j/z;->n:I

    sget-object v0, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v0, v0, Lc/a/a/j/a0;->z:I

    and-int/2addr p2, v0

    if-eqz p2, :cond_5

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/lang/Byte;

    if-ne p2, v0, :cond_3

    const/16 p0, 0x42

    :goto_2
    invoke-virtual {p1, p0}, Lc/a/a/j/z;->write(I)V

    goto :goto_3

    :cond_3
    const-class v0, Ljava/lang/Short;

    if-ne p2, v0, :cond_4

    const/16 p0, 0x53

    goto :goto_2

    :cond_4
    if-ne p2, p0, :cond_5

    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    move-result-wide p2

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p2, v0

    if-gtz v0, :cond_5

    const-wide/32 v0, -0x80000000

    cmp-long p2, p2, v0

    if-ltz p2, :cond_5

    if-eq p4, p0, :cond_5

    const/16 p0, 0x4c

    goto :goto_2

    :cond_5
    :goto_3
    return-void
.end method

.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
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

    const-class p0, Ljava/lang/Long;

    iget-object v0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v0}, Lc/a/a/i/e;->e0()I

    move-result v1

    const/16 v2, 0x10

    const/16 v3, 0x8

    if-ne v1, v3, :cond_0

    invoke-virtual {v0, v2}, Lc/a/a/i/e;->t(I)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    sget-object p1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq p2, p1, :cond_2

    if-ne p2, p0, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-virtual {v0}, Lc/a/a/i/e;->j()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    new-instance p1, Lc/a/a/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "int value overflow, field : "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lc/a/a/i/e;->n()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    :goto_1
    invoke-virtual {v0, v2}, Lc/a/a/i/e;->t(I)V

    goto :goto_4

    :cond_3
    const/4 v3, 0x3

    if-ne v1, v3, :cond_6

    invoke-virtual {v0}, Lc/a/a/i/e;->g()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {v0, v2}, Lc/a/a/i/e;->t(I)V

    sget-object p3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq p2, p3, :cond_5

    if-ne p2, p0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Ljava/math/BigDecimal;->intValueExact()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_4

    :cond_5
    :goto_2
    invoke-virtual {p1}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_4

    :cond_6
    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object p1

    :try_start_1
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq p2, v0, :cond_8

    if-ne p2, p0, :cond_7

    goto :goto_3

    :cond_7
    invoke-static {p1}, Lc/a/a/k/d;->p(Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_4

    :cond_8
    :goto_3
    invoke-static {p1}, Lc/a/a/k/d;->r(Ljava/lang/Object;)Ljava/lang/Long;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_4
    return-object p0

    :catch_1
    move-exception p0

    new-instance p2, Lc/a/a/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "cast error, field : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", value "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
