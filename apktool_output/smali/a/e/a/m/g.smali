.class public La/e/a/m/g;
.super La/e/a/m/e;
.source ""


# instance fields
.field protected K0:F

.field protected L0:I

.field protected M0:I

.field protected N0:Z

.field private O0:La/e/a/m/d;

.field private P0:I

.field private Q0:I

.field private R0:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, La/e/a/m/e;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    iput v0, p0, La/e/a/m/g;->K0:F

    const/4 v0, -0x1

    iput v0, p0, La/e/a/m/g;->L0:I

    iput v0, p0, La/e/a/m/g;->M0:I

    const/4 v0, 0x1

    iput-boolean v0, p0, La/e/a/m/g;->N0:Z

    iget-object v0, p0, La/e/a/m/e;->Q:La/e/a/m/d;

    iput-object v0, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    const/4 v0, 0x0

    iput v0, p0, La/e/a/m/g;->P0:I

    iput v0, p0, La/e/a/m/g;->Q0:I

    iget-object v1, p0, La/e/a/m/e;->Y:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, La/e/a/m/e;->Y:Ljava/util/ArrayList;

    iget-object v2, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, La/e/a/m/e;->X:[La/e/a/m/d;

    array-length v1, v1

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, La/e/a/m/e;->X:[La/e/a/m/d;

    iget-object v3, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public g(La/e/a/d;Z)V
    .locals 7

    invoke-virtual {p0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object p2

    check-cast p2, La/e/a/m/f;

    if-nez p2, :cond_0

    return-void

    :cond_0
    sget-object v0, La/e/a/m/d$b;->c:La/e/a/m/d$b;

    invoke-virtual {p2, v0}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v0

    sget-object v1, La/e/a/m/d$b;->e:La/e/a/m/d$b;

    invoke-virtual {p2, v1}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v1

    iget-object v2, p0, La/e/a/m/e;->b0:La/e/a/m/e;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v2, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    aget-object v2, v2, v4

    sget-object v5, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    if-ne v2, v5, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    iget v5, p0, La/e/a/m/g;->P0:I

    if-nez v5, :cond_3

    sget-object v0, La/e/a/m/d$b;->d:La/e/a/m/d$b;

    invoke-virtual {p2, v0}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v0

    sget-object v1, La/e/a/m/d$b;->f:La/e/a/m/d$b;

    invoke-virtual {p2, v1}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v1

    iget-object p2, p0, La/e/a/m/e;->b0:La/e/a/m/e;

    if-eqz p2, :cond_2

    iget-object p2, p2, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    aget-object p2, p2, v3

    sget-object v2, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    if-ne p2, v2, :cond_2

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_1
    move v2, v3

    :cond_3
    iget-boolean p2, p0, La/e/a/m/g;->R0:Z

    const/4 v3, -0x1

    const/4 v5, 0x5

    if-eqz p2, :cond_6

    iget-object p2, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {p2}, La/e/a/m/d;->m()Z

    move-result p2

    if-eqz p2, :cond_6

    iget-object p2, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {p1, p2}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object p2

    iget-object v6, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {v6}, La/e/a/m/d;->d()I

    move-result v6

    invoke-virtual {p1, p2, v6}, La/e/a/d;->f(La/e/a/i;I)V

    iget v6, p0, La/e/a/m/g;->L0:I

    if-eq v6, v3, :cond_4

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v0

    invoke-virtual {p1, v0, p2, v4, v5}, La/e/a/d;->h(La/e/a/i;La/e/a/i;II)V

    goto :goto_2

    :cond_4
    iget v6, p0, La/e/a/m/g;->M0:I

    if-eq v6, v3, :cond_5

    if-eqz v2, :cond_5

    invoke-virtual {p1, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v1

    invoke-virtual {p1, v0}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v0

    invoke-virtual {p1, p2, v0, v4, v5}, La/e/a/d;->h(La/e/a/i;La/e/a/i;II)V

    invoke-virtual {p1, v1, p2, v4, v5}, La/e/a/d;->h(La/e/a/i;La/e/a/i;II)V

    :cond_5
    :goto_2
    iput-boolean v4, p0, La/e/a/m/g;->R0:Z

    return-void

    :cond_6
    iget p2, p0, La/e/a/m/g;->L0:I

    const/16 v6, 0x8

    if-eq p2, v3, :cond_7

    iget-object p2, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {p1, p2}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object p2

    invoke-virtual {p1, v0}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v0

    iget p0, p0, La/e/a/m/g;->L0:I

    invoke-virtual {p1, p2, v0, p0, v6}, La/e/a/d;->e(La/e/a/i;La/e/a/i;II)La/e/a/b;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object p0

    invoke-virtual {p1, p0, p2, v4, v5}, La/e/a/d;->h(La/e/a/i;La/e/a/i;II)V

    goto :goto_3

    :cond_7
    iget p2, p0, La/e/a/m/g;->M0:I

    if-eq p2, v3, :cond_8

    iget-object p2, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {p1, p2}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object p2

    invoke-virtual {p1, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v1

    iget p0, p0, La/e/a/m/g;->M0:I

    neg-int p0, p0

    invoke-virtual {p1, p2, v1, p0, v6}, La/e/a/d;->e(La/e/a/i;La/e/a/i;II)La/e/a/b;

    if-eqz v2, :cond_9

    invoke-virtual {p1, v0}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object p0

    invoke-virtual {p1, p2, p0, v4, v5}, La/e/a/d;->h(La/e/a/i;La/e/a/i;II)V

    invoke-virtual {p1, v1, p2, v4, v5}, La/e/a/d;->h(La/e/a/i;La/e/a/i;II)V

    goto :goto_3

    :cond_8
    iget p2, p0, La/e/a/m/g;->K0:F

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float p2, p2, v0

    if-eqz p2, :cond_9

    iget-object p2, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {p1, p2}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object p2

    invoke-virtual {p1, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v0

    iget p0, p0, La/e/a/m/g;->K0:F

    invoke-static {p1, p2, v0, p0}, La/e/a/d;->s(La/e/a/d;La/e/a/i;La/e/a/i;F)La/e/a/b;

    move-result-object p0

    invoke-virtual {p1, p0}, La/e/a/d;->d(La/e/a/b;)V

    :cond_9
    :goto_3
    return-void
.end method

.method public h()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public l0()Z
    .locals 0

    iget-boolean p0, p0, La/e/a/m/g;->R0:Z

    return p0
.end method

.method public m(La/e/a/m/d$b;)La/e/a/m/d;
    .locals 2

    sget-object v0, La/e/a/m/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget p1, p0, La/e/a/m/g;->P0:I

    if-nez p1, :cond_2

    iget-object p0, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    return-object p0

    :cond_1
    iget p1, p0, La/e/a/m/g;->P0:I

    if-ne p1, v0, :cond_2

    iget-object p0, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    return-object p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public m0()Z
    .locals 0

    iget-boolean p0, p0, La/e/a/m/g;->R0:Z

    return p0
.end method

.method public n1(La/e/a/d;Z)V
    .locals 2

    invoke-virtual {p0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {p1, p2}, La/e/a/d;->x(Ljava/lang/Object;)I

    move-result p1

    iget p2, p0, La/e/a/m/g;->P0:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p2, v0, :cond_1

    invoke-virtual {p0, p1}, La/e/a/m/e;->j1(I)V

    invoke-virtual {p0, v1}, La/e/a/m/e;->k1(I)V

    invoke-virtual {p0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object p1

    invoke-virtual {p1}, La/e/a/m/e;->v()I

    move-result p1

    invoke-virtual {p0, p1}, La/e/a/m/e;->I0(I)V

    invoke-virtual {p0, v1}, La/e/a/m/e;->h1(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, La/e/a/m/e;->j1(I)V

    invoke-virtual {p0, p1}, La/e/a/m/e;->k1(I)V

    invoke-virtual {p0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object p1

    invoke-virtual {p1}, La/e/a/m/e;->U()I

    move-result p1

    invoke-virtual {p0, p1}, La/e/a/m/e;->h1(I)V

    invoke-virtual {p0, v1}, La/e/a/m/e;->I0(I)V

    :goto_0
    return-void
.end method

.method public o1()La/e/a/m/d;
    .locals 0

    iget-object p0, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    return-object p0
.end method

.method public p1()I
    .locals 0

    iget p0, p0, La/e/a/m/g;->P0:I

    return p0
.end method

.method public q1()I
    .locals 0

    iget p0, p0, La/e/a/m/g;->L0:I

    return p0
.end method

.method public r1()I
    .locals 0

    iget p0, p0, La/e/a/m/g;->M0:I

    return p0
.end method

.method public s1()F
    .locals 0

    iget p0, p0, La/e/a/m/g;->K0:F

    return p0
.end method

.method public t1(I)V
    .locals 1

    iget-object v0, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {v0, p1}, La/e/a/m/d;->s(I)V

    const/4 p1, 0x1

    iput-boolean p1, p0, La/e/a/m/g;->R0:Z

    return-void
.end method

.method public u1(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, La/e/a/m/g;->K0:F

    iput p1, p0, La/e/a/m/g;->L0:I

    iput v0, p0, La/e/a/m/g;->M0:I

    :cond_0
    return-void
.end method

.method public v1(I)V
    .locals 2

    const/4 v0, -0x1

    if-le p1, v0, :cond_0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, La/e/a/m/g;->K0:F

    iput v0, p0, La/e/a/m/g;->L0:I

    iput p1, p0, La/e/a/m/g;->M0:I

    :cond_0
    return-void
.end method

.method public w1(F)V
    .locals 1

    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    iput p1, p0, La/e/a/m/g;->K0:F

    const/4 p1, -0x1

    iput p1, p0, La/e/a/m/g;->L0:I

    iput p1, p0, La/e/a/m/g;->M0:I

    :cond_0
    return-void
.end method

.method public x1(I)V
    .locals 3

    iget v0, p0, La/e/a/m/g;->P0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, La/e/a/m/g;->P0:I

    iget-object p1, p0, La/e/a/m/e;->Y:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget p1, p0, La/e/a/m/g;->P0:I

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, La/e/a/m/e;->P:La/e/a/m/d;

    goto :goto_0

    :cond_1
    iget-object p1, p0, La/e/a/m/e;->Q:La/e/a/m/d;

    :goto_0
    iput-object p1, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    iget-object p1, p0, La/e/a/m/e;->Y:Ljava/util/ArrayList;

    iget-object v0, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, La/e/a/m/e;->X:[La/e/a/m/d;

    array-length p1, p1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    iget-object v1, p0, La/e/a/m/e;->X:[La/e/a/m/d;

    iget-object v2, p0, La/e/a/m/g;->O0:La/e/a/m/d;

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method
