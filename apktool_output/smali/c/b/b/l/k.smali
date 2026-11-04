.class public final Lc/b/b/l/k;
.super Lc/b/b/l/q;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc/b/b/l/q;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lc/b/b/a;IILjava/util/Map;)Lc/b/b/j/b;
    .locals 1
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

    sget-object v0, Lc/b/b/a;->h:Lc/b/b/a;

    if-ne p2, v0, :cond_0

    invoke-super/range {p0 .. p5}, Lc/b/b/l/n;->a(Ljava/lang/String;Lc/b/b/a;IILjava/util/Map;)Lc/b/b/j/b;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Can only encode EAN_8, but got "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public c(Ljava/lang/String;)[Z
    .locals 7

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p0

    const/4 v0, 0x7

    if-eq p0, v0, :cond_2

    const/16 v1, 0x8

    if-ne p0, v1, :cond_1

    :try_start_0
    invoke-static {p1}, Lc/b/b/l/p;->a(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Contents do not pass checksum"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Lc/b/b/d; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Illegal contents"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "Requested contents should be 8 digits long, but got "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lc/b/b/l/p;->b(Ljava/lang/CharSequence;)I

    move-result p0
    :try_end_1
    .catch Lc/b/b/d; {:try_start_1 .. :try_end_1} :catch_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    const/16 p0, 0x43

    new-array p0, p0, [Z

    sget-object v1, Lc/b/b/l/p;->a:[I

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p0, v2, v1, v3}, Lc/b/b/l/n;->b([ZI[IZ)I

    move-result v1

    add-int/2addr v1, v2

    move v4, v2

    :goto_1
    const/4 v5, 0x3

    const/16 v6, 0xa

    if-gt v4, v5, :cond_3

    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v5

    sget-object v6, Lc/b/b/l/p;->d:[[I

    aget-object v5, v6, v5

    invoke-static {p0, v1, v5, v2}, Lc/b/b/l/n;->b([ZI[IZ)I

    move-result v5

    add-int/2addr v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    sget-object v4, Lc/b/b/l/p;->b:[I

    invoke-static {p0, v1, v4, v2}, Lc/b/b/l/n;->b([ZI[IZ)I

    move-result v2

    add-int/2addr v1, v2

    const/4 v2, 0x4

    :goto_2
    if-gt v2, v0, :cond_4

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4, v6}, Ljava/lang/Character;->digit(CI)I

    move-result v4

    sget-object v5, Lc/b/b/l/p;->d:[[I

    aget-object v4, v5, v4

    invoke-static {p0, v1, v4, v3}, Lc/b/b/l/n;->b([ZI[IZ)I

    move-result v4

    add-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    sget-object p1, Lc/b/b/l/p;->a:[I

    invoke-static {p0, v1, p1, v3}, Lc/b/b/l/n;->b([ZI[IZ)I

    return-object p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method
