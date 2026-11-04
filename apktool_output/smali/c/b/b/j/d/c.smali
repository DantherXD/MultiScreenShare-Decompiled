.class public final Lc/b/b/j/d/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lc/b/b/j/d/a;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/b/b/j/d/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lc/b/b/j/d/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/b/b/j/d/c;->a:Lc/b/b/j/d/a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/b/b/j/d/c;->b:Ljava/util/List;

    new-instance p0, Lc/b/b/j/d/b;

    const/4 v1, 0x1

    new-array v2, v1, [I

    const/4 v3, 0x0

    aput v1, v2, v3

    invoke-direct {p0, p1, v2}, Lc/b/b/j/d/b;-><init>(Lc/b/b/j/d/a;[I)V

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(I)Lc/b/b/j/d/b;
    .locals 8

    iget-object v0, p0, Lc/b/b/j/d/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v0, p0, Lc/b/b/j/d/c;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/b/b/j/d/b;

    iget-object v1, p0, Lc/b/b/j/d/c;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    :goto_0
    if-gt v1, p1, :cond_0

    new-instance v3, Lc/b/b/j/d/b;

    iget-object v4, p0, Lc/b/b/j/d/c;->a:Lc/b/b/j/d/a;

    const/4 v5, 0x2

    new-array v5, v5, [I

    const/4 v6, 0x0

    aput v2, v5, v6

    add-int/lit8 v6, v1, -0x1

    invoke-virtual {v4}, Lc/b/b/j/d/a;->d()I

    move-result v7

    add-int/2addr v6, v7

    invoke-virtual {v4, v6}, Lc/b/b/j/d/a;->c(I)I

    move-result v6

    aput v6, v5, v2

    invoke-direct {v3, v4, v5}, Lc/b/b/j/d/b;-><init>(Lc/b/b/j/d/a;[I)V

    invoke-virtual {v0, v3}, Lc/b/b/j/d/b;->g(Lc/b/b/j/d/b;)Lc/b/b/j/d/b;

    move-result-object v0

    iget-object v3, p0, Lc/b/b/j/d/c;->b:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lc/b/b/j/d/c;->b:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/b/b/j/d/b;

    return-object p0
.end method


# virtual methods
.method public b([II)V
    .locals 5

    if-eqz p2, :cond_2

    array-length v0, p1

    sub-int/2addr v0, p2

    if-lez v0, :cond_1

    invoke-direct {p0, p2}, Lc/b/b/j/d/c;->a(I)Lc/b/b/j/d/b;

    move-result-object v1

    new-array v2, v0, [I

    const/4 v3, 0x0

    invoke-static {p1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v4, Lc/b/b/j/d/b;

    iget-object p0, p0, Lc/b/b/j/d/c;->a:Lc/b/b/j/d/a;

    invoke-direct {v4, p0, v2}, Lc/b/b/j/d/b;-><init>(Lc/b/b/j/d/a;[I)V

    const/4 p0, 0x1

    invoke-virtual {v4, p2, p0}, Lc/b/b/j/d/b;->h(II)Lc/b/b/j/d/b;

    move-result-object v2

    invoke-virtual {v2, v1}, Lc/b/b/j/d/b;->b(Lc/b/b/j/d/b;)[Lc/b/b/j/d/b;

    move-result-object v1

    aget-object p0, v1, p0

    invoke-virtual {p0}, Lc/b/b/j/d/b;->d()[I

    move-result-object p0

    array-length v1, p0

    sub-int/2addr p2, v1

    move v1, v3

    :goto_0
    if-ge v1, p2, :cond_0

    add-int v2, v0, v1

    aput v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr v0, p2

    array-length p2, p0

    invoke-static {p0, v3, p1, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "No data bytes provided"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "No error correction bytes"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
