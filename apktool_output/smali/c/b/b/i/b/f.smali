.class final Lc/b/b/i/b/f;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final a:Lc/b/b/i/b/f;


# instance fields
.field private final b:I

.field private final c:Lc/b/b/i/b/g;

.field private final d:I

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc/b/b/i/b/f;

    sget-object v1, Lc/b/b/i/b/g;->a:Lc/b/b/i/b/g;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2, v2}, Lc/b/b/i/b/f;-><init>(Lc/b/b/i/b/g;III)V

    sput-object v0, Lc/b/b/i/b/f;->a:Lc/b/b/i/b/f;

    return-void
.end method

.method private constructor <init>(Lc/b/b/i/b/g;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/b/b/i/b/f;->c:Lc/b/b/i/b/g;

    iput p2, p0, Lc/b/b/i/b/f;->b:I

    iput p3, p0, Lc/b/b/i/b/f;->d:I

    iput p4, p0, Lc/b/b/i/b/f;->e:I

    return-void
.end method


# virtual methods
.method a(I)Lc/b/b/i/b/f;
    .locals 5

    iget-object v0, p0, Lc/b/b/i/b/f;->c:Lc/b/b/i/b/g;

    iget v1, p0, Lc/b/b/i/b/f;->b:I

    iget v2, p0, Lc/b/b/i/b/f;->e:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    if-eq v1, v4, :cond_0

    const/4 v4, 0x2

    if-ne v1, v4, :cond_1

    :cond_0
    sget-object v4, Lc/b/b/i/b/d;->b:[[I

    aget-object v1, v4, v1

    aget v1, v1, v3

    const v4, 0xffff

    and-int/2addr v4, v1

    shr-int/lit8 v1, v1, 0x10

    invoke-virtual {v0, v4, v1}, Lc/b/b/i/b/g;->a(II)Lc/b/b/i/b/g;

    move-result-object v0

    add-int/2addr v2, v1

    move v1, v3

    :cond_1
    iget p0, p0, Lc/b/b/i/b/f;->d:I

    if-eqz p0, :cond_4

    const/16 v3, 0x1f

    if-ne p0, v3, :cond_2

    goto :goto_0

    :cond_2
    const/16 v3, 0x3e

    if-ne p0, v3, :cond_3

    const/16 v3, 0x9

    goto :goto_1

    :cond_3
    const/16 v3, 0x8

    goto :goto_1

    :cond_4
    :goto_0
    const/16 v3, 0x12

    :goto_1
    new-instance v4, Lc/b/b/i/b/f;

    add-int/lit8 p0, p0, 0x1

    add-int/2addr v2, v3

    invoke-direct {v4, v0, v1, p0, v2}, Lc/b/b/i/b/f;-><init>(Lc/b/b/i/b/g;III)V

    iget p0, v4, Lc/b/b/i/b/f;->d:I

    const/16 v0, 0x81e

    if-ne p0, v0, :cond_5

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {v4, p1}, Lc/b/b/i/b/f;->b(I)Lc/b/b/i/b/f;

    move-result-object v4

    :cond_5
    return-object v4
.end method

.method b(I)Lc/b/b/i/b/f;
    .locals 3

    iget v0, p0, Lc/b/b/i/b/f;->d:I

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v1, p0, Lc/b/b/i/b/f;->c:Lc/b/b/i/b/g;

    sub-int/2addr p1, v0

    invoke-virtual {v1, p1, v0}, Lc/b/b/i/b/g;->b(II)Lc/b/b/i/b/g;

    move-result-object p1

    new-instance v0, Lc/b/b/i/b/f;

    iget v1, p0, Lc/b/b/i/b/f;->b:I

    const/4 v2, 0x0

    iget p0, p0, Lc/b/b/i/b/f;->e:I

    invoke-direct {v0, p1, v1, v2, p0}, Lc/b/b/i/b/f;-><init>(Lc/b/b/i/b/g;III)V

    return-object v0
.end method

.method c()I
    .locals 0

    iget p0, p0, Lc/b/b/i/b/f;->d:I

    return p0
.end method

.method d()I
    .locals 0

    iget p0, p0, Lc/b/b/i/b/f;->e:I

    return p0
.end method

.method e()I
    .locals 0

    iget p0, p0, Lc/b/b/i/b/f;->b:I

    return p0
.end method

.method f(Lc/b/b/i/b/f;)Z
    .locals 3

    iget v0, p0, Lc/b/b/i/b/f;->e:I

    sget-object v1, Lc/b/b/i/b/d;->b:[[I

    iget v2, p0, Lc/b/b/i/b/f;->b:I

    aget-object v1, v1, v2

    iget v2, p1, Lc/b/b/i/b/f;->b:I

    aget v1, v1, v2

    shr-int/lit8 v1, v1, 0x10

    add-int/2addr v0, v1

    iget v1, p1, Lc/b/b/i/b/f;->d:I

    if-lez v1, :cond_1

    iget p0, p0, Lc/b/b/i/b/f;->d:I

    if-eqz p0, :cond_0

    if-le p0, v1, :cond_1

    :cond_0
    add-int/lit8 v0, v0, 0xa

    :cond_1
    iget p0, p1, Lc/b/b/i/b/f;->e:I

    if-gt v0, p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method g(II)Lc/b/b/i/b/f;
    .locals 3

    iget v0, p0, Lc/b/b/i/b/f;->e:I

    iget-object v1, p0, Lc/b/b/i/b/f;->c:Lc/b/b/i/b/g;

    iget p0, p0, Lc/b/b/i/b/f;->b:I

    if-eq p1, p0, :cond_0

    sget-object v2, Lc/b/b/i/b/d;->b:[[I

    aget-object p0, v2, p0

    aget p0, p0, p1

    const v2, 0xffff

    and-int/2addr v2, p0

    shr-int/lit8 p0, p0, 0x10

    invoke-virtual {v1, v2, p0}, Lc/b/b/i/b/g;->a(II)Lc/b/b/i/b/g;

    move-result-object v1

    add-int/2addr v0, p0

    :cond_0
    const/4 p0, 0x2

    if-ne p1, p0, :cond_1

    const/4 p0, 0x4

    goto :goto_0

    :cond_1
    const/4 p0, 0x5

    :goto_0
    invoke-virtual {v1, p2, p0}, Lc/b/b/i/b/g;->a(II)Lc/b/b/i/b/g;

    move-result-object p2

    new-instance v1, Lc/b/b/i/b/f;

    const/4 v2, 0x0

    add-int/2addr v0, p0

    invoke-direct {v1, p2, p1, v2, v0}, Lc/b/b/i/b/f;-><init>(Lc/b/b/i/b/g;III)V

    return-object v1
.end method

.method h(II)Lc/b/b/i/b/f;
    .locals 5

    iget-object v0, p0, Lc/b/b/i/b/f;->c:Lc/b/b/i/b/g;

    iget v1, p0, Lc/b/b/i/b/f;->b:I

    const/4 v2, 0x5

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    sget-object v4, Lc/b/b/i/b/d;->d:[[I

    aget-object v1, v4, v1

    aget p1, v1, p1

    invoke-virtual {v0, p1, v3}, Lc/b/b/i/b/g;->a(II)Lc/b/b/i/b/g;

    move-result-object p1

    invoke-virtual {p1, p2, v2}, Lc/b/b/i/b/g;->a(II)Lc/b/b/i/b/g;

    move-result-object p1

    new-instance p2, Lc/b/b/i/b/f;

    iget v0, p0, Lc/b/b/i/b/f;->b:I

    const/4 v1, 0x0

    iget p0, p0, Lc/b/b/i/b/f;->e:I

    add-int/2addr p0, v3

    add-int/2addr p0, v2

    invoke-direct {p2, p1, v0, v1, p0}, Lc/b/b/i/b/f;-><init>(Lc/b/b/i/b/g;III)V

    return-object p2
.end method

.method i([B)Lc/b/b/j/a;
    .locals 2

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    array-length v1, p1

    invoke-virtual {p0, v1}, Lc/b/b/i/b/f;->b(I)Lc/b/b/i/b/f;

    move-result-object p0

    iget-object p0, p0, Lc/b/b/i/b/f;->c:Lc/b/b/i/b/g;

    :goto_0
    if-eqz p0, :cond_0

    invoke-interface {v0, p0}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc/b/b/i/b/g;->d()Lc/b/b/i/b/g;

    move-result-object p0

    goto :goto_0

    :cond_0
    new-instance p0, Lc/b/b/j/a;

    invoke-direct {p0}, Lc/b/b/j/a;-><init>()V

    invoke-interface {v0}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/b/b/i/b/g;

    invoke-virtual {v1, p0, p1}, Lc/b/b/i/b/g;->c(Lc/b/b/j/a;[B)V

    goto :goto_1

    :cond_1
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    sget-object v1, Lc/b/b/i/b/d;->a:[Ljava/lang/String;

    iget v2, p0, Lc/b/b/i/b/f;->b:I

    aget-object v1, v1, v2

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lc/b/b/i/b/f;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget p0, p0, Lc/b/b/i/b/f;->d:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    const-string p0, "%s bits=%d bytes=%d"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
