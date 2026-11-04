.class public La/q/q;
.super La/q/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/q/q$b;
    }
.end annotation


# instance fields
.field private L:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/q/m;",
            ">;"
        }
    .end annotation
.end field

.field private M:Z

.field N:I

.field O:Z

.field private P:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/q/m;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, La/q/q;->M:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, La/q/q;->O:Z

    iput v0, p0, La/q/q;->P:I

    return-void
.end method

.method private f0(La/q/m;)V
    .locals 1

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, p1, La/q/m;->v:La/q/q;

    return-void
.end method

.method private o0()V
    .locals 3

    new-instance v0, La/q/q$b;

    invoke-direct {v0, p0}, La/q/q$b;-><init>(La/q/q;)V

    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/q/m;

    invoke-virtual {v2, v0}, La/q/m;->a(La/q/m$f;)La/q/m;

    goto :goto_0

    :cond_0
    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, La/q/q;->N:I

    return-void
.end method


# virtual methods
.method public N(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, La/q/m;->N(Landroid/view/View;)V

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/q/m;

    invoke-virtual {v2, p1}, La/q/m;->N(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic P(La/q/m$f;)La/q/m;
    .locals 0

    invoke-virtual {p0, p1}, La/q/q;->i0(La/q/m$f;)La/q/q;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic Q(Landroid/view/View;)La/q/m;
    .locals 0

    invoke-virtual {p0, p1}, La/q/q;->j0(Landroid/view/View;)La/q/q;

    move-result-object p0

    return-object p0
.end method

.method public R(Landroid/view/View;)V
    .locals 3

    invoke-super {p0, p1}, La/q/m;->R(Landroid/view/View;)V

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/q/m;

    invoke-virtual {v2, p1}, La/q/m;->R(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected T()V
    .locals 4

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, La/q/m;->a0()V

    invoke-virtual {p0}, La/q/m;->p()V

    return-void

    :cond_0
    invoke-direct {p0}, La/q/q;->o0()V

    iget-boolean v0, p0, La/q/q;->M:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    add-int/lit8 v2, v0, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/q/m;

    iget-object v2, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/q/m;

    new-instance v3, La/q/q$a;

    invoke-direct {v3, p0, v2}, La/q/q$a;-><init>(La/q/q;La/q/m;)V

    invoke-virtual {v1, v3}, La/q/m;->a(La/q/m$f;)La/q/m;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p0, p0, La/q/q;->L:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/q/m;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, La/q/m;->T()V

    goto :goto_2

    :cond_2
    iget-object p0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/q/m;

    invoke-virtual {v0}, La/q/m;->T()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public bridge synthetic U(J)La/q/m;
    .locals 0

    invoke-virtual {p0, p1, p2}, La/q/q;->k0(J)La/q/q;

    move-result-object p0

    return-object p0
.end method

.method public V(La/q/m$e;)V
    .locals 3

    invoke-super {p0, p1}, La/q/m;->V(La/q/m$e;)V

    iget v0, p0, La/q/q;->P:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, La/q/q;->P:I

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/q/m;

    invoke-virtual {v2, p1}, La/q/m;->V(La/q/m$e;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic W(Landroid/animation/TimeInterpolator;)La/q/m;
    .locals 0

    invoke-virtual {p0, p1}, La/q/q;->l0(Landroid/animation/TimeInterpolator;)La/q/q;

    move-result-object p0

    return-object p0
.end method

.method public X(La/q/g;)V
    .locals 2

    invoke-super {p0, p1}, La/q/m;->X(La/q/g;)V

    iget v0, p0, La/q/q;->P:I

    or-int/lit8 v0, v0, 0x4

    iput v0, p0, La/q/q;->P:I

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/q/m;

    invoke-virtual {v1, p1}, La/q/m;->X(La/q/g;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public Y(La/q/p;)V
    .locals 3

    invoke-super {p0, p1}, La/q/m;->Y(La/q/p;)V

    iget v0, p0, La/q/q;->P:I

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, La/q/q;->P:I

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/q/m;

    invoke-virtual {v2, p1}, La/q/m;->Y(La/q/p;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public bridge synthetic Z(J)La/q/m;
    .locals 0

    invoke-virtual {p0, p1, p2}, La/q/q;->n0(J)La/q/q;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic a(La/q/m$f;)La/q/m;
    .locals 0

    invoke-virtual {p0, p1}, La/q/q;->c0(La/q/m$f;)La/q/q;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic b(Landroid/view/View;)La/q/m;
    .locals 0

    invoke-virtual {p0, p1}, La/q/q;->d0(Landroid/view/View;)La/q/q;

    move-result-object p0

    return-object p0
.end method

.method b0(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-super {p0, p1}, La/q/m;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/q/m;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, La/q/m;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public c0(La/q/m$f;)La/q/q;
    .locals 0

    invoke-super {p0, p1}, La/q/m;->a(La/q/m$f;)La/q/m;

    move-result-object p0

    check-cast p0, La/q/q;

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, La/q/q;->m()La/q/m;

    move-result-object p0

    return-object p0
.end method

.method public d0(Landroid/view/View;)La/q/q;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/q/m;

    invoke-virtual {v1, p1}, La/q/m;->b(Landroid/view/View;)La/q/m;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, La/q/m;->b(Landroid/view/View;)La/q/m;

    move-result-object p0

    check-cast p0, La/q/q;

    return-object p0
.end method

.method public e0(La/q/m;)La/q/q;
    .locals 4

    invoke-direct {p0, p1}, La/q/q;->f0(La/q/m;)V

    iget-wide v0, p0, La/q/m;->g:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    invoke-virtual {p1, v0, v1}, La/q/m;->U(J)La/q/m;

    :cond_0
    iget v0, p0, La/q/q;->P:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, La/q/m;->s()Landroid/animation/TimeInterpolator;

    move-result-object v0

    invoke-virtual {p1, v0}, La/q/m;->W(Landroid/animation/TimeInterpolator;)La/q/m;

    :cond_1
    iget v0, p0, La/q/q;->P:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, La/q/m;->w()La/q/p;

    move-result-object v0

    invoke-virtual {p1, v0}, La/q/m;->Y(La/q/p;)V

    :cond_2
    iget v0, p0, La/q/q;->P:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_3

    invoke-virtual {p0}, La/q/m;->v()La/q/g;

    move-result-object v0

    invoke-virtual {p1, v0}, La/q/m;->X(La/q/g;)V

    :cond_3
    iget v0, p0, La/q/q;->P:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_4

    invoke-virtual {p0}, La/q/m;->r()La/q/m$e;

    move-result-object v0

    invoke-virtual {p1, v0}, La/q/m;->V(La/q/m$e;)V

    :cond_4
    return-object p0
.end method

.method public g(La/q/s;)V
    .locals 2

    iget-object v0, p1, La/q/s;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, La/q/m;->G(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/q/m;

    iget-object v1, p1, La/q/s;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, La/q/m;->G(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, La/q/m;->g(La/q/s;)V

    iget-object v1, p1, La/q/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public g0(I)La/q/m;
    .locals 1

    if-ltz p1, :cond_1

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/q/m;

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public h0()I
    .locals 0

    iget-object p0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method

.method i(La/q/s;)V
    .locals 3

    invoke-super {p0, p1}, La/q/m;->i(La/q/s;)V

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/q/m;

    invoke-virtual {v2, p1}, La/q/m;->i(La/q/s;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i0(La/q/m$f;)La/q/q;
    .locals 0

    invoke-super {p0, p1}, La/q/m;->P(La/q/m$f;)La/q/m;

    move-result-object p0

    check-cast p0, La/q/q;

    return-object p0
.end method

.method public j(La/q/s;)V
    .locals 2

    iget-object v0, p1, La/q/s;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, La/q/m;->G(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/q/m;

    iget-object v1, p1, La/q/s;->b:Landroid/view/View;

    invoke-virtual {v0, v1}, La/q/m;->G(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, La/q/m;->j(La/q/s;)V

    iget-object v1, p1, La/q/s;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public j0(Landroid/view/View;)La/q/q;
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/q/m;

    invoke-virtual {v1, p1}, La/q/m;->Q(Landroid/view/View;)La/q/m;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, La/q/m;->Q(Landroid/view/View;)La/q/m;

    move-result-object p0

    check-cast p0, La/q/q;

    return-object p0
.end method

.method public k0(J)La/q/q;
    .locals 4

    invoke-super {p0, p1, p2}, La/q/m;->U(J)La/q/m;

    iget-wide v0, p0, La/q/m;->g:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/q/m;

    invoke-virtual {v2, p1, p2}, La/q/m;->U(J)La/q/m;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public l0(Landroid/animation/TimeInterpolator;)La/q/q;
    .locals 3

    iget v0, p0, La/q/q;->P:I

    or-int/lit8 v0, v0, 0x1

    iput v0, p0, La/q/q;->P:I

    iget-object v0, p0, La/q/q;->L:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/q/m;

    invoke-virtual {v2, p1}, La/q/m;->W(Landroid/animation/TimeInterpolator;)La/q/m;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-super {p0, p1}, La/q/m;->W(Landroid/animation/TimeInterpolator;)La/q/m;

    move-result-object p0

    check-cast p0, La/q/q;

    return-object p0
.end method

.method public m()La/q/m;
    .locals 4

    invoke-super {p0}, La/q/m;->m()La/q/m;

    move-result-object v0

    check-cast v0, La/q/q;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, La/q/q;->L:Ljava/util/ArrayList;

    iget-object v1, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, p0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/q/m;

    invoke-virtual {v3}, La/q/m;->m()La/q/m;

    move-result-object v3

    invoke-direct {v0, v3}, La/q/q;->f0(La/q/m;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public m0(I)La/q/q;
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, La/q/q;->M:Z

    goto :goto_0

    :cond_0
    new-instance p0, Landroid/util/AndroidRuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid parameter for TransitionSet ordering: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iput-boolean v0, p0, La/q/q;->M:Z

    :goto_0
    return-object p0
.end method

.method public n0(J)La/q/q;
    .locals 0

    invoke-super {p0, p1, p2}, La/q/m;->Z(J)La/q/m;

    move-result-object p0

    check-cast p0, La/q/q;

    return-object p0
.end method

.method protected o(Landroid/view/ViewGroup;La/q/t;La/q/t;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "La/q/t;",
            "La/q/t;",
            "Ljava/util/ArrayList<",
            "La/q/s;",
            ">;",
            "Ljava/util/ArrayList<",
            "La/q/s;",
            ">;)V"
        }
    .end annotation

    move-object v0, p0

    invoke-virtual {p0}, La/q/m;->y()J

    move-result-wide v1

    iget-object v3, v0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    iget-object v5, v0, La/q/q;->L:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, La/q/m;

    const-wide/16 v7, 0x0

    cmp-long v5, v1, v7

    if-lez v5, :cond_2

    iget-boolean v5, v0, La/q/q;->M:Z

    if-nez v5, :cond_0

    if-nez v4, :cond_2

    :cond_0
    invoke-virtual {v6}, La/q/m;->y()J

    move-result-wide v9

    cmp-long v5, v9, v7

    if-lez v5, :cond_1

    add-long/2addr v9, v1

    invoke-virtual {v6, v9, v10}, La/q/m;->Z(J)La/q/m;

    goto :goto_1

    :cond_1
    invoke-virtual {v6, v1, v2}, La/q/m;->Z(J)La/q/m;

    :cond_2
    :goto_1
    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-virtual/range {v6 .. v11}, La/q/m;->o(Landroid/view/ViewGroup;La/q/t;La/q/t;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
