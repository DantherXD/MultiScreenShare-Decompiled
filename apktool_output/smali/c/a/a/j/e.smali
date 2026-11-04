.class public Lc/a/a/j/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;
.implements Lc/a/a/i/q/f;


# static fields
.field public static final a:Lc/a/a/j/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/e;

    invoke-direct {v0}, Lc/a/a/j/e;-><init>()V

    sput-object v0, Lc/a/a/j/e;->a:Lc/a/a/j/e;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 0

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    if-nez p2, :cond_1

    iget p1, p0, Lc/a/a/j/z;->n:I

    sget-object p2, Lc/a/a/j/a0;->i:Lc/a/a/j/a0;

    iget p2, p2, Lc/a/a/j/a0;->z:I

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    :goto_0
    return-void

    :cond_1
    instance-of p1, p2, Ljava/math/BigInteger;

    if-eqz p1, :cond_2

    check-cast p2, Ljava/math/BigInteger;

    invoke-virtual {p2}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    return-void

    :cond_2
    check-cast p2, Ljava/math/BigDecimal;

    invoke-virtual {p2}, Ljava/math/BigDecimal;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    iget p1, p0, Lc/a/a/j/z;->n:I

    sget-object p3, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget p3, p3, Lc/a/a/j/a0;->z:I

    and-int/2addr p1, p3

    if-eqz p1, :cond_3

    const-class p1, Ljava/math/BigDecimal;

    if-eq p4, p1, :cond_3

    invoke-virtual {p2}, Ljava/math/BigDecimal;->scale()I

    move-result p1

    if-nez p1, :cond_3

    const/16 p1, 0x2e

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(I)V

    :cond_3
    return-void
.end method

.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
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

    iget-object p0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result p3

    const/16 v0, 0x10

    const/4 v1, 0x2

    if-ne p3, v1, :cond_1

    const-class p1, Ljava/math/BigInteger;

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Lc/a/a/i/e;->v()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0}, Lc/a/a/i/e;->t(I)V

    new-instance p0, Ljava/math/BigInteger;

    const/16 p2, 0xa

    invoke-direct {p0, p1, p2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lc/a/a/i/e;->g()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p0, v0}, Lc/a/a/i/e;->t(I)V

    return-object p1

    :cond_1
    const/4 v1, 0x3

    if-ne p3, v1, :cond_4

    invoke-virtual {p0}, Lc/a/a/i/e;->g()Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p0, v0}, Lc/a/a/i/e;->t(I)V

    const-class p0, Ljava/math/BigInteger;

    if-ne p2, p0, :cond_3

    invoke-virtual {p1}, Ljava/math/BigDecimal;->scale()I

    move-result p0

    const/16 p2, -0x64

    if-lt p0, p2, :cond_2

    const/16 p2, 0x64

    if-gt p0, p2, :cond_2

    invoke-virtual {p1}, Ljava/math/BigDecimal;->toBigInteger()Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/NumberFormatException;

    invoke-direct {p0}, Ljava/lang/NumberFormatException;-><init>()V

    throw p0

    :cond_3
    return-object p1

    :cond_4
    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_5

    const/4 p0, 0x0

    return-object p0

    :cond_5
    const-class p1, Ljava/math/BigInteger;

    if-ne p2, p1, :cond_6

    invoke-static {p0}, Lc/a/a/k/d;->g(Ljava/lang/Object;)Ljava/math/BigInteger;

    move-result-object p0

    return-object p0

    :cond_6
    invoke-static {p0}, Lc/a/a/k/d;->f(Ljava/lang/Object;)Ljava/math/BigDecimal;

    move-result-object p0

    return-object p0
.end method
