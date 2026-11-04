.class final Lc/b/b/k/b/n;
.super Lc/b/b/k/b/c;
.source ""


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc/b/b/k/b/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/b/k/b/h;)V
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :cond_0
    invoke-virtual {p1}, Lc/b/b/k/b/h;->i()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lc/b/b/k/b/h;->c()C

    move-result v1

    iget v2, p1, Lc/b/b/k/b/h;->f:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p1, Lc/b/b/k/b/h;->f:I

    invoke-virtual {p0, v1, v0}, Lc/b/b/k/b/n;->c(CLjava/lang/StringBuilder;)I

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    rem-int/lit8 v1, v1, 0x3

    if-nez v1, :cond_0

    invoke-static {p1, v0}, Lc/b/b/k/b/c;->g(Lc/b/b/k/b/h;Ljava/lang/StringBuilder;)V

    invoke-virtual {p1}, Lc/b/b/k/b/h;->d()Ljava/lang/String;

    move-result-object v1

    iget v2, p1, Lc/b/b/k/b/h;->f:I

    invoke-virtual {p0}, Lc/b/b/k/b/n;->e()I

    move-result v3

    invoke-static {v1, v2, v3}, Lc/b/b/k/b/j;->n(Ljava/lang/CharSequence;II)I

    move-result v1

    invoke-virtual {p0}, Lc/b/b/k/b/n;->e()I

    move-result v2

    if-eq v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lc/b/b/k/b/h;->o(I)V

    :cond_1
    invoke-virtual {p0, p1, v0}, Lc/b/b/k/b/n;->f(Lc/b/b/k/b/h;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method c(CLjava/lang/StringBuilder;)I
    .locals 2

    const/16 p0, 0xd

    const/4 v0, 0x1

    if-eq p1, p0, :cond_5

    const/16 p0, 0x20

    if-eq p1, p0, :cond_4

    const/16 p0, 0x2a

    if-eq p1, p0, :cond_3

    const/16 p0, 0x3e

    if-eq p1, p0, :cond_2

    const/16 p0, 0x30

    if-lt p1, p0, :cond_0

    const/16 v1, 0x39

    if-gt p1, v1, :cond_0

    sub-int/2addr p1, p0

    add-int/lit8 p1, p1, 0x4

    :goto_0
    int-to-char p0, p1

    goto :goto_1

    :cond_0
    const/16 p0, 0x41

    if-lt p1, p0, :cond_1

    const/16 v1, 0x5a

    if-gt p1, v1, :cond_1

    sub-int/2addr p1, p0

    add-int/lit8 p1, p1, 0xe

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lc/b/b/k/b/j;->e(C)V

    goto :goto_2

    :cond_2
    const/4 p0, 0x2

    goto :goto_1

    :cond_3
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    const/4 p0, 0x3

    goto :goto_1

    :cond_5
    const/4 p0, 0x0

    :goto_1
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    return v0
.end method

.method public e()I
    .locals 0

    const/4 p0, 0x3

    return p0
.end method

.method f(Lc/b/b/k/b/h;Ljava/lang/StringBuilder;)V
    .locals 1

    invoke-virtual {p1}, Lc/b/b/k/b/h;->p()V

    invoke-virtual {p1}, Lc/b/b/k/b/h;->g()Lc/b/b/k/b/k;

    move-result-object p0

    invoke-virtual {p0}, Lc/b/b/k/b/k;->a()I

    move-result p0

    invoke-virtual {p1}, Lc/b/b/k/b/h;->a()I

    move-result v0

    sub-int/2addr p0, v0

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result p2

    iget v0, p1, Lc/b/b/k/b/h;->f:I

    sub-int/2addr v0, p2

    iput v0, p1, Lc/b/b/k/b/h;->f:I

    invoke-virtual {p1}, Lc/b/b/k/b/h;->f()I

    move-result p2

    const/4 v0, 0x1

    if-gt p2, v0, :cond_0

    if-gt p0, v0, :cond_0

    invoke-virtual {p1}, Lc/b/b/k/b/h;->f()I

    move-result p2

    if-eq p2, p0, :cond_1

    :cond_0
    const/16 p0, 0xfe

    invoke-virtual {p1, p0}, Lc/b/b/k/b/h;->r(C)V

    :cond_1
    invoke-virtual {p1}, Lc/b/b/k/b/h;->e()I

    move-result p0

    if-gez p0, :cond_2

    const/4 p0, 0x0

    invoke-virtual {p1, p0}, Lc/b/b/k/b/h;->o(I)V

    :cond_2
    return-void
.end method
