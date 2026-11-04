.class public La/e/a/m/m/n;
.super La/e/a/m/m/p;
.source ""


# instance fields
.field public k:La/e/a/m/m/f;

.field l:La/e/a/m/m/g;


# direct methods
.method public constructor <init>(La/e/a/m/e;)V
    .locals 2

    invoke-direct {p0, p1}, La/e/a/m/m/p;-><init>(La/e/a/m/e;)V

    new-instance p1, La/e/a/m/m/f;

    invoke-direct {p1, p0}, La/e/a/m/m/f;-><init>(La/e/a/m/m/p;)V

    iput-object p1, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    const/4 v0, 0x0

    iput-object v0, p0, La/e/a/m/m/n;->l:La/e/a/m/m/g;

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    sget-object v1, La/e/a/m/m/f$a;->g:La/e/a/m/m/f$a;

    iput-object v1, v0, La/e/a/m/m/f;->e:La/e/a/m/m/f$a;

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    sget-object v1, La/e/a/m/m/f$a;->h:La/e/a/m/m/f$a;

    iput-object v1, v0, La/e/a/m/m/f;->e:La/e/a/m/m/f$a;

    sget-object v0, La/e/a/m/m/f$a;->i:La/e/a/m/m/f$a;

    iput-object v0, p1, La/e/a/m/m/f;->e:La/e/a/m/m/f$a;

    const/4 p1, 0x1

    iput p1, p0, La/e/a/m/m/p;->f:I

    return-void
.end method


# virtual methods
.method public a(La/e/a/m/m/d;)V
    .locals 6

    sget-object v0, La/e/a/m/m/n$a;->a:[I

    iget-object v1, p0, La/e/a/m/m/p;->j:La/e/a/m/m/p$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v0, La/e/a/m/e;->Q:La/e/a/m/d;

    iget-object v0, v0, La/e/a/m/e;->S:La/e/a/m/d;

    invoke-virtual {p0, p1, v1, v0, v3}, La/e/a/m/m/p;->n(La/e/a/m/m/d;La/e/a/m/d;La/e/a/m/d;I)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, La/e/a/m/m/p;->o(La/e/a/m/m/d;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0, p1}, La/e/a/m/m/p;->p(La/e/a/m/m/d;)V

    :goto_0
    iget-object p1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, p1, La/e/a/m/m/f;->c:Z

    const/high16 v4, 0x3f000000    # 0.5f

    const/4 v5, 0x0

    if-eqz v0, :cond_7

    iget-boolean p1, p1, La/e/a/m/m/f;->j:Z

    if-nez p1, :cond_7

    iget-object p1, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v0, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne p1, v0, :cond_7

    iget-object p1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v0, p1, La/e/a/m/e;->y:I

    if-eq v0, v2, :cond_6

    if-eq v0, v1, :cond_3

    goto :goto_3

    :cond_3
    iget-object v0, p1, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, v0, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_7

    invoke-virtual {p1}, La/e/a/m/e;->u()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_5

    if-eqz p1, :cond_4

    if-eq p1, v3, :cond_5

    move p1, v5

    goto :goto_2

    :cond_4
    iget-object p1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, p1, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v0, v0, La/e/a/m/m/f;->g:I

    int-to-float v0, v0

    invoke-virtual {p1}, La/e/a/m/e;->t()F

    move-result p1

    mul-float/2addr v0, p1

    goto :goto_1

    :cond_5
    iget-object p1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, p1, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v0, v0, La/e/a/m/m/f;->g:I

    int-to-float v0, v0

    invoke-virtual {p1}, La/e/a/m/e;->t()F

    move-result p1

    div-float/2addr v0, p1

    :goto_1
    add-float/2addr v0, v4

    float-to-int p1, v0

    :goto_2
    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v0, p1}, La/e/a/m/m/g;->d(I)V

    goto :goto_3

    :cond_6
    invoke-virtual {p1}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p1, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object p1, p1, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, p1, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v0, v0, La/e/a/m/e;->F:F

    iget p1, p1, La/e/a/m/m/f;->g:I

    int-to-float p1, p1

    mul-float/2addr p1, v0

    add-float/2addr p1, v4

    float-to-int p1, p1

    goto :goto_2

    :cond_7
    :goto_3
    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-boolean v0, p1, La/e/a/m/m/f;->c:Z

    if-eqz v0, :cond_f

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-boolean v1, v0, La/e/a/m/m/f;->c:Z

    if-nez v1, :cond_8

    goto/16 :goto_5

    :cond_8
    iget-boolean p1, p1, La/e/a/m/m/f;->j:Z

    if-eqz p1, :cond_9

    iget-boolean p1, v0, La/e/a/m/m/f;->j:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean p1, p1, La/e/a/m/m/f;->j:Z

    if-eqz p1, :cond_9

    return-void

    :cond_9
    iget-object p1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean p1, p1, La/e/a/m/m/f;->j:Z

    if-nez p1, :cond_a

    iget-object p1, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v0, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne p1, v0, :cond_a

    iget-object p1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v0, p1, La/e/a/m/e;->x:I

    if-nez v0, :cond_a

    invoke-virtual {p1}, La/e/a/m/e;->i0()Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object p1, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/e/a/m/m/f;

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget p1, p1, La/e/a/m/m/f;->g:I

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v2, v1, La/e/a/m/m/f;->f:I

    add-int/2addr p1, v2

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget-object v2, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget v2, v2, La/e/a/m/m/f;->f:I

    add-int/2addr v0, v2

    sub-int v2, v0, p1

    invoke-virtual {v1, p1}, La/e/a/m/m/f;->d(I)V

    iget-object p1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-virtual {p1, v0}, La/e/a/m/m/f;->d(I)V

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {p0, v2}, La/e/a/m/m/g;->d(I)V

    return-void

    :cond_a
    iget-object p1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean p1, p1, La/e/a/m/m/f;->j:Z

    if-nez p1, :cond_c

    iget-object p1, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v0, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne p1, v0, :cond_c

    iget p1, p0, La/e/a/m/m/p;->a:I

    if-ne p1, v3, :cond_c

    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object p1, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_c

    iget-object p1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object p1, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_c

    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object p1, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/e/a/m/m/f;

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget p1, p1, La/e/a/m/m/f;->g:I

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v1, v1, La/e/a/m/m/f;->f:I

    add-int/2addr p1, v1

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget v1, v1, La/e/a/m/m/f;->f:I

    add-int/2addr v0, v1

    sub-int/2addr v0, p1

    iget-object p1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v1, p1, La/e/a/m/m/g;->m:I

    if-ge v0, v1, :cond_b

    invoke-virtual {p1, v0}, La/e/a/m/m/g;->d(I)V

    goto :goto_4

    :cond_b
    invoke-virtual {p1, v1}, La/e/a/m/m/g;->d(I)V

    :cond_c
    :goto_4
    iget-object p1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean p1, p1, La/e/a/m/m/f;->j:Z

    if-nez p1, :cond_d

    return-void

    :cond_d
    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object p1, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_f

    iget-object p1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object p1, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_f

    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object p1, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/e/a/m/m/f;

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget v1, p1, La/e/a/m/m/f;->g:I

    iget-object v2, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v2, v2, La/e/a/m/m/f;->f:I

    add-int/2addr v1, v2

    iget v2, v0, La/e/a/m/m/f;->g:I

    iget-object v3, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget v3, v3, La/e/a/m/m/f;->f:I

    add-int/2addr v2, v3

    iget-object v3, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v3}, La/e/a/m/e;->P()F

    move-result v3

    if-ne p1, v0, :cond_e

    iget v1, p1, La/e/a/m/m/f;->g:I

    iget v2, v0, La/e/a/m/m/f;->g:I

    move v3, v4

    :cond_e
    sub-int/2addr v2, v1

    iget-object p1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget p1, p1, La/e/a/m/m/f;->g:I

    sub-int/2addr v2, p1

    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    int-to-float v0, v1

    add-float/2addr v0, v4

    int-to-float v1, v2

    mul-float/2addr v1, v3

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p1, v0}, La/e/a/m/m/f;->d(I)V

    iget-object p1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget p0, p0, La/e/a/m/m/f;->g:I

    add-int/2addr v0, p0

    invoke-virtual {p1, v0}, La/e/a/m/m/f;->d(I)V

    :cond_f
    :goto_5
    return-void
.end method

.method d()V
    .locals 9

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-boolean v1, v0, La/e/a/m/e;->b:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v0}, La/e/a/m/e;->v()I

    move-result v0

    invoke-virtual {v1, v0}, La/e/a/m/m/g;->d(I)V

    :cond_0
    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, v0, La/e/a/m/m/f;->j:Z

    if-nez v0, :cond_3

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->R()La/e/a/m/e$b;

    move-result-object v0

    iput-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->X()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, La/e/a/m/m/a;

    invoke-direct {v0, p0}, La/e/a/m/m/a;-><init>(La/e/a/m/m/p;)V

    iput-object v0, p0, La/e/a/m/m/n;->l:La/e/a/m/m/g;

    :cond_1
    iget-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-eq v0, v1, :cond_4

    sget-object v1, La/e/a/m/e$b;->e:La/e/a/m/e$b;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, La/e/a/m/e;->R()La/e/a/m/e$b;

    move-result-object v1

    sget-object v2, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    if-ne v1, v2, :cond_2

    invoke-virtual {v0}, La/e/a/m/e;->v()I

    move-result v1

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->Q:La/e/a/m/d;

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->S:La/e/a/m/d;

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v3, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v3, v3, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v4, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v4, v4, La/e/a/m/e;->Q:La/e/a/m/d;

    invoke-virtual {v4}, La/e/a/m/d;->e()I

    move-result v4

    invoke-virtual {p0, v2, v3, v4}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v2, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v3, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v3, v3, La/e/a/m/e;->S:La/e/a/m/d;

    invoke-virtual {v3}, La/e/a/m/d;->e()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {p0, v2, v0, v3}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {p0, v1}, La/e/a/m/m/g;->d(I)V

    return-void

    :cond_2
    iget-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v1}, La/e/a/m/e;->v()I

    move-result v1

    invoke-virtual {v0, v1}, La/e/a/m/m/g;->d(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->e:La/e/a/m/e$b;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, La/e/a/m/e;->R()La/e/a/m/e$b;

    move-result-object v1

    sget-object v2, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    if-ne v1, v2, :cond_4

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v2, v2, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v3, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v3, v3, La/e/a/m/e;->Q:La/e/a/m/d;

    invoke-virtual {v3}, La/e/a/m/d;->e()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->S:La/e/a/m/d;

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    return-void

    :cond_4
    :goto_0
    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v1, v0, La/e/a/m/m/f;->j:Z

    const/4 v2, 0x0

    const/4 v3, 0x4

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x3

    if-eqz v1, :cond_d

    iget-object v7, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-boolean v8, v7, La/e/a/m/e;->b:Z

    if-eqz v8, :cond_d

    iget-object v0, v7, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v1, v0, v5

    iget-object v1, v1, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v1, :cond_8

    aget-object v1, v0, v6

    iget-object v1, v1, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v1, :cond_8

    invoke-virtual {v7}, La/e/a/m/e;->i0()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v1, v1, v5

    invoke-virtual {v1}, La/e/a/m/d;->e()I

    move-result v1

    iput v1, v0, La/e/a/m/m/f;->f:I

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v1, v1, v6

    invoke-virtual {v1}, La/e/a/m/d;->e()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, La/e/a/m/m/f;->f:I

    goto :goto_1

    :cond_5
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v2, v5

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    :cond_6
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v0, v0, v6

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v2, v6

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    :cond_7
    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iput-boolean v4, v0, La/e/a/m/m/f;->b:Z

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iput-boolean v4, v0, La/e/a/m/m/f;->b:Z

    :goto_1
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->X()Z

    move-result v0

    if-eqz v0, :cond_1e

    :goto_2
    iget-object v0, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v2}, La/e/a/m/e;->n()I

    move-result v2

    :goto_3
    invoke-virtual {p0, v0, v1, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    goto/16 :goto_b

    :cond_8
    aget-object v1, v0, v5

    iget-object v1, v1, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v1, :cond_9

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v2, v5

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v2, v2, La/e/a/m/m/f;->g:I

    invoke-virtual {p0, v0, v1, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->X()Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_2

    :cond_9
    aget-object v1, v0, v6

    iget-object v1, v1, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v1, :cond_b

    aget-object v0, v0, v6

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v2, v6

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v2, v2, La/e/a/m/m/f;->g:I

    neg-int v2, v2

    invoke-virtual {p0, v0, v1, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    :cond_a
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->X()Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_2

    :cond_b
    aget-object v1, v0, v3

    iget-object v1, v1, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v1, :cond_c

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object v1, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v2}, La/e/a/m/e;->n()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v0, v1, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v2, v2, La/e/a/m/m/f;->g:I

    goto/16 :goto_3

    :cond_c
    instance-of v0, v7, La/e/a/m/h;

    if-nez v0, :cond_1e

    invoke-virtual {v7}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    sget-object v1, La/e/a/m/d$b;->h:La/e/a/m/d$b;

    invoke-virtual {v0, v1}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v0

    iget-object v0, v0, La/e/a/m/d;->f:La/e/a/m/d;

    if-nez v0, :cond_1e

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v2}, La/e/a/m/e;->W()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v2, v2, La/e/a/m/m/f;->g:I

    invoke-virtual {p0, v0, v1, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->X()Z

    move-result v0

    if-eqz v0, :cond_1e

    goto/16 :goto_2

    :cond_d
    if-nez v1, :cond_12

    iget-object v1, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v7, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v1, v7, :cond_12

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v1, v0, La/e/a/m/e;->y:I

    if-eq v1, v5, :cond_10

    if-eq v1, v6, :cond_e

    goto :goto_5

    :cond_e
    invoke-virtual {v0}, La/e/a/m/e;->i0()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v1, v0, La/e/a/m/e;->x:I

    if-ne v1, v6, :cond_f

    goto :goto_5

    :cond_f
    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    goto :goto_4

    :cond_10
    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-nez v0, :cond_11

    goto :goto_5

    :cond_11
    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    :goto_4
    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v1, v1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iput-boolean v4, v0, La/e/a/m/m/f;->b:Z

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_12
    invoke-virtual {v0, p0}, La/e/a/m/m/f;->b(La/e/a/m/m/d;)V

    :cond_13
    :goto_5
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v7, v1, v5

    iget-object v7, v7, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v7, :cond_17

    aget-object v7, v1, v6

    iget-object v7, v7, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v7, :cond_17

    invoke-virtual {v0}, La/e/a/m/e;->i0()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v1, v1, v5

    invoke-virtual {v1}, La/e/a/m/d;->e()I

    move-result v1

    iput v1, v0, La/e/a/m/m/f;->f:I

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v1, v1, v6

    invoke-virtual {v1}, La/e/a/m/d;->e()I

    move-result v1

    neg-int v1, v1

    iput v1, v0, La/e/a/m/m/f;->f:I

    goto :goto_6

    :cond_14
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v0, v0, v5

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v1, v1, v6

    invoke-virtual {p0, v1}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v1

    if-eqz v0, :cond_15

    invoke-virtual {v0, p0}, La/e/a/m/m/f;->b(La/e/a/m/m/d;)V

    :cond_15
    if-eqz v1, :cond_16

    invoke-virtual {v1, p0}, La/e/a/m/m/f;->b(La/e/a/m/m/d;)V

    :cond_16
    sget-object v0, La/e/a/m/m/p$b;->e:La/e/a/m/m/p$b;

    iput-object v0, p0, La/e/a/m/m/p;->j:La/e/a/m/m/p$b;

    :goto_6
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->X()Z

    move-result v0

    if-eqz v0, :cond_1d

    :goto_7
    iget-object v0, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/n;->l:La/e/a/m/m/g;

    :goto_8
    invoke-virtual {p0, v0, v1, v4, v2}, La/e/a/m/m/p;->c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V

    goto/16 :goto_a

    :cond_17
    aget-object v7, v1, v5

    iget-object v7, v7, La/e/a/m/d;->f:La/e/a/m/d;

    const/4 v8, 0x0

    if-eqz v7, :cond_19

    aget-object v0, v1, v5

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v2, v5

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {p0, v0, v1, v4, v2}, La/e/a/m/m/p;->c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->X()Z

    move-result v0

    if-eqz v0, :cond_18

    iget-object v0, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/n;->l:La/e/a/m/m/g;

    invoke-virtual {p0, v0, v1, v4, v2}, La/e/a/m/m/p;->c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V

    :cond_18
    iget-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v0, v1, :cond_1d

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->t()F

    move-result v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_1d

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v2, v0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    if-ne v2, v1, :cond_1d

    goto/16 :goto_9

    :cond_19
    aget-object v5, v1, v6

    iget-object v5, v5, La/e/a/m/d;->f:La/e/a/m/d;

    const/4 v7, -0x1

    if-eqz v5, :cond_1a

    aget-object v0, v1, v6

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v2, v6

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {p0, v0, v1, v7, v2}, La/e/a/m/m/p;->c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->X()Z

    move-result v0

    if-eqz v0, :cond_1d

    goto/16 :goto_7

    :cond_1a
    aget-object v5, v1, v3

    iget-object v5, v5, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v5, :cond_1b

    aget-object v0, v1, v3

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v1, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/n;->l:La/e/a/m/m/g;

    invoke-virtual {p0, v0, v1, v7, v2}, La/e/a/m/m/p;->c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    goto/16 :goto_8

    :cond_1b
    instance-of v1, v0, La/e/a/m/h;

    if-nez v1, :cond_1d

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v2}, La/e/a/m/e;->W()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {p0, v0, v1, v4, v2}, La/e/a/m/m/p;->c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->X()Z

    move-result v0

    if-eqz v0, :cond_1c

    iget-object v0, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/n;->l:La/e/a/m/m/g;

    invoke-virtual {p0, v0, v1, v4, v2}, La/e/a/m/m/p;->c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V

    :cond_1c
    iget-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v0, v1, :cond_1d

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->t()F

    move-result v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_1d

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v2, v0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    if-ne v2, v1, :cond_1d

    :goto_9
    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v1, v1, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iput-object p0, v0, La/e/a/m/m/f;->a:La/e/a/m/m/d;

    :cond_1d
    :goto_a
    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1e

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iput-boolean v4, p0, La/e/a/m/m/f;->c:Z

    :cond_1e
    :goto_b
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-boolean v1, v0, La/e/a/m/m/f;->j:Z

    if-eqz v1, :cond_0

    iget-object p0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v0, v0, La/e/a/m/m/f;->g:I

    invoke-virtual {p0, v0}, La/e/a/m/e;->k1(I)V

    :cond_0
    return-void
.end method

.method f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La/e/a/m/m/p;->c:La/e/a/m/m/m;

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-virtual {v0}, La/e/a/m/m/f;->c()V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-virtual {v0}, La/e/a/m/m/f;->c()V

    iget-object v0, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    invoke-virtual {v0}, La/e/a/m/m/f;->c()V

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v0}, La/e/a/m/m/f;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/e/a/m/m/p;->g:Z

    return-void
.end method

.method m()Z
    .locals 3

    iget-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object p0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget p0, p0, La/e/a/m/e;->y:I

    if-nez p0, :cond_0

    return v2

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v2
.end method

.method q()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, La/e/a/m/m/p;->g:Z

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-virtual {v1}, La/e/a/m/m/f;->c()V

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iput-boolean v0, v1, La/e/a/m/m/f;->j:Z

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-virtual {v1}, La/e/a/m/m/f;->c()V

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iput-boolean v0, v1, La/e/a/m/m/f;->j:Z

    iget-object v1, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    invoke-virtual {v1}, La/e/a/m/m/f;->c()V

    iget-object v1, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    iput-boolean v0, v1, La/e/a/m/m/f;->j:Z

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iput-boolean v0, p0, La/e/a/m/m/f;->j:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "VerticalRun "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {p0}, La/e/a/m/e;->r()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
