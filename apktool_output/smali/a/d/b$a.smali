.class La/d/b$a;
.super La/d/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/d/b;->d()La/d/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/d/f<",
        "TE;TE;>;"
    }
.end annotation


# instance fields
.field final synthetic d:La/d/b;


# direct methods
.method constructor <init>(La/d/b;)V
    .locals 0

    iput-object p1, p0, La/d/b$a;->d:La/d/b;

    invoke-direct {p0}, La/d/f;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 0

    iget-object p0, p0, La/d/b$a;->d:La/d/b;

    invoke-virtual {p0}, La/d/b;->clear()V

    return-void
.end method

.method protected b(II)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, La/d/b$a;->d:La/d/b;

    iget-object p0, p0, La/d/b;->i:[Ljava/lang/Object;

    aget-object p0, p0, p1

    return-object p0
.end method

.method protected c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "TE;TE;>;"
        }
    .end annotation

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string v0, "not a map"

    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method protected d()I
    .locals 0

    iget-object p0, p0, La/d/b$a;->d:La/d/b;

    iget p0, p0, La/d/b;->j:I

    return p0
.end method

.method protected e(Ljava/lang/Object;)I
    .locals 0

    iget-object p0, p0, La/d/b$a;->d:La/d/b;

    invoke-virtual {p0, p1}, La/d/b;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method protected f(Ljava/lang/Object;)I
    .locals 0

    iget-object p0, p0, La/d/b$a;->d:La/d/b;

    invoke-virtual {p0, p1}, La/d/b;->indexOf(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method protected g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;TE;)V"
        }
    .end annotation

    iget-object p0, p0, La/d/b$a;->d:La/d/b;

    invoke-virtual {p0, p1}, La/d/b;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected h(I)V
    .locals 0

    iget-object p0, p0, La/d/b$a;->d:La/d/b;

    invoke-virtual {p0, p1}, La/d/b;->g(I)Ljava/lang/Object;

    return-void
.end method

.method protected i(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "not a map"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
