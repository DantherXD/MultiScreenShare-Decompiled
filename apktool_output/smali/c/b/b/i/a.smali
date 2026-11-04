.class public final Lc/b/b/i/a;
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

.method private static b(Ljava/lang/String;Lc/b/b/a;IILjava/nio/charset/Charset;II)Lc/b/b/j/b;
    .locals 1

    sget-object v0, Lc/b/b/a;->b:Lc/b/b/a;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0, p4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-static {p0, p5, p6}, Lc/b/b/i/b/c;->d([BII)Lc/b/b/i/b/a;

    move-result-object p0

    invoke-static {p0, p2, p3}, Lc/b/b/i/a;->c(Lc/b/b/i/b/a;II)Lc/b/b/j/b;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Can only encode AZTEC, but got "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static c(Lc/b/b/i/b/a;II)Lc/b/b/j/b;
    .locals 9

    invoke-virtual {p0}, Lc/b/b/i/b/a;->a()Lc/b/b/j/b;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lc/b/b/j/b;->f()I

    move-result v0

    invoke-virtual {p0}, Lc/b/b/j/b;->e()I

    move-result v1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    move-result p2

    div-int v2, p1, v0

    div-int v3, p2, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    mul-int v3, v0, v2

    sub-int v3, p1, v3

    div-int/lit8 v3, v3, 0x2

    mul-int v4, v1, v2

    sub-int v4, p2, v4

    div-int/lit8 v4, v4, 0x2

    new-instance v5, Lc/b/b/j/b;

    invoke-direct {v5, p1, p2}, Lc/b/b/j/b;-><init>(II)V

    const/4 p1, 0x0

    move p2, p1

    :goto_0
    if-ge p2, v1, :cond_2

    move v6, p1

    move v7, v3

    :goto_1
    if-ge v6, v0, :cond_1

    invoke-virtual {p0, v6, p2}, Lc/b/b/j/b;->d(II)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v5, v7, v4, v2, v2}, Lc/b/b/j/b;->h(IIII)V

    :cond_0
    add-int/lit8 v6, v6, 0x1

    add-int/2addr v7, v2

    goto :goto_1

    :cond_1
    add-int/lit8 p2, p2, 0x1

    add-int/2addr v4, v2

    goto :goto_0

    :cond_2
    return-object v5

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lc/b/b/a;IILjava/util/Map;)Lc/b/b/j/b;
    .locals 9
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

    sget-object p0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    const/16 v0, 0x21

    const/4 v1, 0x0

    if-eqz p5, :cond_2

    sget-object v2, Lc/b/b/c;->c:Lc/b/b/c;

    invoke-interface {p5, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p0

    :cond_0
    sget-object v2, Lc/b/b/c;->b:Lc/b/b/c;

    invoke-interface {p5, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    :cond_1
    sget-object v2, Lc/b/b/c;->k:Lc/b/b/c;

    invoke-interface {p5, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :cond_2
    move-object v6, p0

    move v7, v0

    move v8, v1

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    invoke-static/range {v2 .. v8}, Lc/b/b/i/a;->b(Ljava/lang/String;Lc/b/b/a;IILjava/nio/charset/Charset;II)Lc/b/b/j/b;

    move-result-object p0

    return-object p0
.end method
