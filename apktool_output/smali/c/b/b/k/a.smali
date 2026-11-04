.class public final Lc/b/b/k/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/b/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static b(Lc/b/b/n/c/b;II)Lc/b/b/j/b;
    .locals 10

    invoke-virtual {p0}, Lc/b/b/n/c/b;->e()I

    move-result v0

    invoke-virtual {p0}, Lc/b/b/n/c/b;->d()I

    move-result v1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result v3

    div-int v4, v2, v0

    div-int v5, v3, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    mul-int v5, v0, v4

    sub-int/2addr v2, v5

    div-int/lit8 v2, v2, 0x2

    mul-int v5, v1, v4

    sub-int/2addr v3, v5

    div-int/lit8 v3, v3, 0x2

    const/4 v5, 0x0

    if-lt p2, v1, :cond_1

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v6, Lc/b/b/j/b;

    invoke-direct {v6, p1, p2}, Lc/b/b/j/b;-><init>(II)V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v6, Lc/b/b/j/b;

    invoke-direct {v6, v0, v1}, Lc/b/b/j/b;-><init>(II)V

    move v2, v5

    move v3, v2

    :goto_1
    invoke-virtual {v6}, Lc/b/b/j/b;->b()V

    move p1, v5

    :goto_2
    if-ge p1, v1, :cond_4

    move v7, v2

    move p2, v5

    :goto_3
    if-ge p2, v0, :cond_3

    invoke-virtual {p0, p2, p1}, Lc/b/b/n/c/b;->b(II)B

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_2

    invoke-virtual {v6, v7, v3, v4, v4}, Lc/b/b/j/b;->h(IIII)V

    :cond_2
    add-int/lit8 p2, p2, 0x1

    add-int/2addr v7, v4

    goto :goto_3

    :cond_3
    add-int/lit8 p1, p1, 0x1

    add-int/2addr v3, v4

    goto :goto_2

    :cond_4
    return-object v6
.end method

.method private static c(Lc/b/b/k/b/e;Lc/b/b/k/b/k;II)Lc/b/b/j/b;
    .locals 11

    invoke-virtual {p1}, Lc/b/b/k/b/k;->h()I

    move-result v0

    invoke-virtual {p1}, Lc/b/b/k/b/k;->g()I

    move-result v1

    new-instance v2, Lc/b/b/n/c/b;

    invoke-virtual {p1}, Lc/b/b/k/b/k;->j()I

    move-result v3

    invoke-virtual {p1}, Lc/b/b/k/b/k;->i()I

    move-result v4

    invoke-direct {v2, v3, v4}, Lc/b/b/n/c/b;-><init>(II)V

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v4, v1, :cond_9

    iget v6, p1, Lc/b/b/k/b/k;->g:I

    rem-int v6, v4, v6

    const/4 v7, 0x1

    if-nez v6, :cond_2

    move v6, v3

    move v8, v6

    :goto_1
    invoke-virtual {p1}, Lc/b/b/k/b/k;->j()I

    move-result v9

    if-ge v6, v9, :cond_1

    rem-int/lit8 v9, v6, 0x2

    if-nez v9, :cond_0

    move v9, v7

    goto :goto_2

    :cond_0
    move v9, v3

    :goto_2
    invoke-virtual {v2, v8, v5, v9}, Lc/b/b/n/c/b;->g(IIZ)V

    add-int/2addr v8, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    :cond_2
    move v6, v3

    move v8, v6

    :goto_3
    if-ge v6, v0, :cond_6

    iget v9, p1, Lc/b/b/k/b/k;->f:I

    rem-int v9, v6, v9

    if-nez v9, :cond_3

    invoke-virtual {v2, v8, v5, v7}, Lc/b/b/n/c/b;->g(IIZ)V

    add-int/lit8 v8, v8, 0x1

    :cond_3
    invoke-virtual {p0, v6, v4}, Lc/b/b/k/b/e;->e(II)Z

    move-result v9

    invoke-virtual {v2, v8, v5, v9}, Lc/b/b/n/c/b;->g(IIZ)V

    add-int/2addr v8, v7

    iget v9, p1, Lc/b/b/k/b/k;->f:I

    rem-int v10, v6, v9

    sub-int/2addr v9, v7

    if-ne v10, v9, :cond_5

    rem-int/lit8 v9, v4, 0x2

    if-nez v9, :cond_4

    move v9, v7

    goto :goto_4

    :cond_4
    move v9, v3

    :goto_4
    invoke-virtual {v2, v8, v5, v9}, Lc/b/b/n/c/b;->g(IIZ)V

    add-int/lit8 v8, v8, 0x1

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    add-int/lit8 v5, v5, 0x1

    iget v6, p1, Lc/b/b/k/b/k;->g:I

    rem-int v8, v4, v6

    sub-int/2addr v6, v7

    if-ne v8, v6, :cond_8

    move v6, v3

    move v8, v6

    :goto_5
    invoke-virtual {p1}, Lc/b/b/k/b/k;->j()I

    move-result v9

    if-ge v6, v9, :cond_7

    invoke-virtual {v2, v8, v5, v7}, Lc/b/b/n/c/b;->g(IIZ)V

    add-int/2addr v8, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_7
    add-int/lit8 v5, v5, 0x1

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_9
    invoke-static {v2, p2, p3}, Lc/b/b/k/a;->b(Lc/b/b/n/c/b;II)Lc/b/b/j/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lc/b/b/a;IILjava/util/Map;)Lc/b/b/j/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc/b/b/a;",
            "II",
            "Ljava/util/Map<",
            "Lc/b/b/c;",
            "*>;)",
            "Lc/b/b/j/b;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_6

    sget-object p0, Lc/b/b/a;->g:Lc/b/b/a;

    if-ne p2, p0, :cond_5

    if-ltz p3, :cond_4

    if-ltz p4, :cond_4

    sget-object p0, Lc/b/b/k/b/l;->b:Lc/b/b/k/b/l;

    const/4 p2, 0x0

    if-eqz p5, :cond_3

    sget-object v0, Lc/b/b/c;->d:Lc/b/b/c;

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/b/k/b/l;

    if-eqz v0, :cond_0

    move-object p0, v0

    :cond_0
    sget-object v0, Lc/b/b/c;->e:Lc/b/b/c;

    invoke-interface {p5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/b/b;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, p2

    :goto_0
    sget-object v1, Lc/b/b/c;->f:Lc/b/b/c;

    invoke-interface {p5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Lc/b/b/b;

    if-eqz p5, :cond_2

    goto :goto_1

    :cond_2
    move-object p5, p2

    :goto_1
    move-object p2, v0

    goto :goto_2

    :cond_3
    move-object p5, p2

    :goto_2
    invoke-static {p1, p0, p2, p5}, Lc/b/b/k/b/j;->b(Ljava/lang/String;Lc/b/b/k/b/l;Lc/b/b/b;Lc/b/b/b;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v0, p0, p2, p5, v1}, Lc/b/b/k/b/k;->l(ILc/b/b/k/b/l;Lc/b/b/b;Lc/b/b/b;Z)Lc/b/b/k/b/k;

    move-result-object p0

    invoke-static {p1, p0}, Lc/b/b/k/b/i;->c(Ljava/lang/String;Lc/b/b/k/b/k;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lc/b/b/k/b/e;

    invoke-virtual {p0}, Lc/b/b/k/b/k;->h()I

    move-result p5

    invoke-virtual {p0}, Lc/b/b/k/b/k;->g()I

    move-result v0

    invoke-direct {p2, p1, p5, v0}, Lc/b/b/k/b/e;-><init>(Ljava/lang/CharSequence;II)V

    invoke-virtual {p2}, Lc/b/b/k/b/e;->h()V

    invoke-static {p2, p0, p3, p4}, Lc/b/b/k/a;->c(Lc/b/b/k/b/e;Lc/b/b/k/b/k;II)Lc/b/b/j/b;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Requested dimensions can\'t be negative: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x78

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Can only encode DATA_MATRIX, but got "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Found empty contents"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
