.class La/e/a/m/m/j;
.super La/e/a/m/m/p;
.source ""


# direct methods
.method public constructor <init>(La/e/a/m/e;)V
    .locals 1

    invoke-direct {p0, p1}, La/e/a/m/m/p;-><init>(La/e/a/m/e;)V

    iget-object v0, p1, La/e/a/m/e;->f:La/e/a/m/m/l;

    invoke-virtual {v0}, La/e/a/m/m/l;->f()V

    iget-object v0, p1, La/e/a/m/e;->g:La/e/a/m/m/n;

    invoke-virtual {v0}, La/e/a/m/m/n;->f()V

    check-cast p1, La/e/a/m/g;

    invoke-virtual {p1}, La/e/a/m/g;->p1()I

    move-result p1

    iput p1, p0, La/e/a/m/m/p;->f:I

    return-void
.end method

.method private q(La/e/a/m/m/f;)V
    .locals 1

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object p0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(La/e/a/m/m/d;)V
    .locals 2

    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-boolean v0, p1, La/e/a/m/m/f;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/e/a/m/m/f;

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    check-cast v0, La/e/a/m/g;

    const/high16 v1, 0x3f000000    # 0.5f

    iget p1, p1, La/e/a/m/m/f;->g:I

    int-to-float p1, p1

    invoke-virtual {v0}, La/e/a/m/g;->s1()F

    move-result v0

    mul-float/2addr p1, v0

    add-float/2addr p1, v1

    float-to-int p1, p1

    iget-object p0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-virtual {p0, p1}, La/e/a/m/m/f;->d(I)V

    return-void
.end method

.method d()V
    .locals 5

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    check-cast v0, La/e/a/m/g;

    invoke-virtual {v0}, La/e/a/m/g;->q1()I

    move-result v1

    invoke-virtual {v0}, La/e/a/m/g;->r1()I

    move-result v2

    invoke-virtual {v0}, La/e/a/m/g;->s1()F

    invoke-virtual {v0}, La/e/a/m/g;->p1()I

    move-result v0

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-ne v0, v3, :cond_2

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    if-eq v1, v4, :cond_0

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v2, v2, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v2, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    :goto_0
    iput v1, v0, La/e/a/m/m/f;->f:I

    goto :goto_1

    :cond_0
    if-eq v2, v4, :cond_1

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v1, v1, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    neg-int v1, v2

    goto :goto_0

    :cond_1
    iput-boolean v3, v0, La/e/a/m/m/f;->b:Z

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v1, v1, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-direct {p0, v0}, La/e/a/m/m/j;->q(La/e/a/m/m/f;)V

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    goto :goto_4

    :cond_2
    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    if-eq v1, v4, :cond_3

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v2, v2, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v2, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    :goto_2
    iput v1, v0, La/e/a/m/m/f;->f:I

    goto :goto_3

    :cond_3
    if-eq v2, v4, :cond_4

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v1, v1, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    neg-int v1, v2

    goto :goto_2

    :cond_4
    iput-boolean v3, v0, La/e/a/m/m/f;->b:Z

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v1, v1, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->b0:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-direct {p0, v0}, La/e/a/m/m/j;->q(La/e/a/m/m/f;)V

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    :goto_4
    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-direct {p0, v0}, La/e/a/m/m/j;->q(La/e/a/m/m/f;)V

    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    check-cast v0, La/e/a/m/g;

    invoke-virtual {v0}, La/e/a/m/g;->p1()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object p0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget p0, p0, La/e/a/m/m/f;->g:I

    invoke-virtual {v0, p0}, La/e/a/m/e;->j1(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object p0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget p0, p0, La/e/a/m/m/f;->g:I

    invoke-virtual {v0, p0}, La/e/a/m/e;->k1(I)V

    :goto_0
    return-void
.end method

.method f()V
    .locals 0

    iget-object p0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-virtual {p0}, La/e/a/m/m/f;->c()V

    return-void
.end method

.method m()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method
