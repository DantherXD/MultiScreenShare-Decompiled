.class public abstract La/e/a/m/m/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/e/a/m/m/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/e/a/m/m/p$b;
    }
.end annotation


# instance fields
.field public a:I

.field b:La/e/a/m/e;

.field c:La/e/a/m/m/m;

.field protected d:La/e/a/m/e$b;

.field e:La/e/a/m/m/g;

.field public f:I

.field g:Z

.field public h:La/e/a/m/m/f;

.field public i:La/e/a/m/m/f;

.field protected j:La/e/a/m/m/p$b;


# direct methods
.method public constructor <init>(La/e/a/m/e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/e/a/m/m/g;

    invoke-direct {v0, p0}, La/e/a/m/m/g;-><init>(La/e/a/m/m/p;)V

    iput-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    const/4 v0, 0x0

    iput v0, p0, La/e/a/m/m/p;->f:I

    iput-boolean v0, p0, La/e/a/m/m/p;->g:Z

    new-instance v0, La/e/a/m/m/f;

    invoke-direct {v0, p0}, La/e/a/m/m/f;-><init>(La/e/a/m/m/p;)V

    iput-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    new-instance v0, La/e/a/m/m/f;

    invoke-direct {v0, p0}, La/e/a/m/m/f;-><init>(La/e/a/m/m/p;)V

    iput-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    sget-object v0, La/e/a/m/m/p$b;->b:La/e/a/m/m/p$b;

    iput-object v0, p0, La/e/a/m/m/p;->j:La/e/a/m/m/p$b;

    iput-object p1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    return-void
.end method

.method private l(II)V
    .locals 7

    iget v0, p0, La/e/a/m/m/p;->a:I

    if-eqz v0, :cond_8

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 p2, 0x2

    const/high16 v2, 0x3f000000    # 0.5f

    if-eq v0, p2, :cond_4

    const/4 p2, 0x3

    if-eq v0, p2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v3, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v4, v3, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v5, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v4, v5, :cond_1

    iget v4, v3, La/e/a/m/m/p;->a:I

    if-ne v4, p2, :cond_1

    iget-object v4, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v6, v4, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    if-ne v6, v5, :cond_1

    iget v4, v4, La/e/a/m/m/p;->a:I

    if-ne v4, p2, :cond_1

    goto :goto_5

    :cond_1
    if-nez p1, :cond_2

    iget-object v3, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    :cond_2
    iget-object p2, v3, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean p2, p2, La/e/a/m/m/f;->j:Z

    if-eqz p2, :cond_9

    invoke-virtual {v0}, La/e/a/m/e;->t()F

    move-result p2

    if-ne p1, v1, :cond_3

    iget-object p1, v3, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget p1, p1, La/e/a/m/m/f;->g:I

    int-to-float p1, p1

    div-float/2addr p1, p2

    add-float/2addr p1, v2

    float-to-int p1, p1

    goto :goto_0

    :cond_3
    iget-object p1, v3, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget p1, p1, La/e/a/m/m/f;->g:I

    int-to-float p1, p1

    mul-float/2addr p2, p1

    add-float/2addr p2, v2

    float-to-int p1, p2

    :goto_0
    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    goto :goto_3

    :cond_4
    iget-object p2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {p2}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object p2

    if-eqz p2, :cond_9

    if-nez p1, :cond_5

    iget-object p2, p2, La/e/a/m/e;->f:La/e/a/m/m/l;

    goto :goto_1

    :cond_5
    iget-object p2, p2, La/e/a/m/e;->g:La/e/a/m/m/n;

    :goto_1
    iget-object p2, p2, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, p2, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    if-nez p1, :cond_6

    iget v0, v0, La/e/a/m/e;->C:F

    goto :goto_2

    :cond_6
    iget v0, v0, La/e/a/m/e;->F:F

    :goto_2
    iget p2, p2, La/e/a/m/m/f;->g:I

    int-to-float p2, p2

    mul-float/2addr p2, v0

    add-float/2addr p2, v2

    float-to-int p2, p2

    goto :goto_4

    :cond_7
    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v0, v0, La/e/a/m/m/g;->m:I

    invoke-virtual {p0, v0, p1}, La/e/a/m/m/p;->g(II)I

    move-result p1

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_3
    invoke-virtual {p0, p1}, La/e/a/m/m/g;->d(I)V

    goto :goto_5

    :cond_8
    :goto_4
    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {p0, p2, p1}, La/e/a/m/m/p;->g(II)I

    move-result p0

    invoke-virtual {v0, p0}, La/e/a/m/m/g;->d(I)V

    :cond_9
    :goto_5
    return-void
.end method


# virtual methods
.method public a(La/e/a/m/m/d;)V
    .locals 0

    return-void
.end method

.method protected final b(La/e/a/m/m/f;La/e/a/m/m/f;I)V
    .locals 0

    iget-object p0, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, La/e/a/m/m/f;->f:I

    iget-object p0, p2, La/e/a/m/m/f;->k:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected final c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V
    .locals 1

    iget-object v0, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p1, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput p3, p1, La/e/a/m/m/f;->h:I

    iput-object p4, p1, La/e/a/m/m/f;->i:La/e/a/m/m/g;

    iget-object p0, p2, La/e/a/m/m/f;->k:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p0, p4, La/e/a/m/m/f;->k:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method abstract d()V
.end method

.method abstract e()V
.end method

.method abstract f()V
.end method

.method protected final g(II)I
    .locals 0

    iget-object p0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    if-nez p2, :cond_1

    iget p2, p0, La/e/a/m/e;->B:I

    iget p0, p0, La/e/a/m/e;->A:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-lez p2, :cond_0

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    :cond_0
    if-eq p0, p1, :cond_3

    goto :goto_0

    :cond_1
    iget p2, p0, La/e/a/m/e;->E:I

    iget p0, p0, La/e/a/m/e;->D:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-lez p2, :cond_2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    :cond_2
    if-eq p0, p1, :cond_3

    :goto_0
    move p1, p0

    :cond_3
    return p1
.end method

.method protected final h(La/e/a/m/d;)La/e/a/m/m/f;
    .locals 2

    iget-object p0, p1, La/e/a/m/d;->f:La/e/a/m/d;

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, La/e/a/m/d;->d:La/e/a/m/e;

    iget-object p0, p0, La/e/a/m/d;->e:La/e/a/m/d$b;

    sget-object v1, La/e/a/m/m/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v1, p0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_5

    const/4 v1, 0x2

    if-eq p0, v1, :cond_4

    const/4 v1, 0x3

    if-eq p0, v1, :cond_3

    const/4 v1, 0x4

    if-eq p0, v1, :cond_2

    const/4 v1, 0x5

    if-eq p0, v1, :cond_1

    goto :goto_2

    :cond_1
    iget-object p0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    goto :goto_0

    :cond_2
    iget-object p0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object p1, p0, La/e/a/m/m/n;->k:La/e/a/m/m/f;

    goto :goto_2

    :cond_3
    iget-object p0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    goto :goto_1

    :cond_4
    iget-object p0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    :goto_0
    iget-object p1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    goto :goto_2

    :cond_5
    iget-object p0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    :goto_1
    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    :goto_2
    return-object p1
.end method

.method protected final i(La/e/a/m/d;I)La/e/a/m/m/f;
    .locals 1

    iget-object p0, p1, La/e/a/m/d;->f:La/e/a/m/d;

    const/4 p1, 0x0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, La/e/a/m/d;->d:La/e/a/m/e;

    if-nez p2, :cond_1

    iget-object p2, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    goto :goto_0

    :cond_1
    iget-object p2, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    :goto_0
    iget-object p0, p0, La/e/a/m/d;->e:La/e/a/m/d$b;

    sget-object v0, La/e/a/m/m/p$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_3

    const/4 v0, 0x5

    if-eq p0, v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p2, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    goto :goto_1

    :cond_3
    iget-object p1, p2, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    :goto_1
    return-object p1
.end method

.method public j()J
    .locals 2

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, p0, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_0

    iget p0, p0, La/e/a/m/m/f;->g:I

    int-to-long v0, p0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k()Z
    .locals 0

    iget-boolean p0, p0, La/e/a/m/m/p;->g:Z

    return p0
.end method

.method abstract m()Z
.end method

.method protected n(La/e/a/m/m/d;La/e/a/m/d;La/e/a/m/d;I)V
    .locals 4

    invoke-virtual {p0, p2}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object p1

    invoke-virtual {p0, p3}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    iget-boolean v1, p1, La/e/a/m/m/f;->j:Z

    if-eqz v1, :cond_6

    iget-boolean v1, v0, La/e/a/m/m/f;->j:Z

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p1, La/e/a/m/m/f;->g:I

    invoke-virtual {p2}, La/e/a/m/d;->e()I

    move-result p2

    add-int/2addr v1, p2

    iget p2, v0, La/e/a/m/m/f;->g:I

    invoke-virtual {p3}, La/e/a/m/d;->e()I

    move-result p3

    sub-int/2addr p2, p3

    sub-int p3, p2, v1

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v2, v2, La/e/a/m/m/f;->j:Z

    if-nez v2, :cond_1

    iget-object v2, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v3, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v2, v3, :cond_1

    invoke-direct {p0, p4, p3}, La/e/a/m/m/p;->l(II)V

    :cond_1
    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v3, v2, La/e/a/m/m/f;->j:Z

    if-nez v3, :cond_2

    return-void

    :cond_2
    iget v2, v2, La/e/a/m/m/f;->g:I

    if-ne v2, p3, :cond_3

    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-virtual {p1, v1}, La/e/a/m/m/f;->d(I)V

    iget-object p0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-virtual {p0, p2}, La/e/a/m/m/f;->d(I)V

    return-void

    :cond_3
    iget-object p3, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    if-nez p4, :cond_4

    invoke-virtual {p3}, La/e/a/m/e;->w()F

    move-result p3

    goto :goto_0

    :cond_4
    invoke-virtual {p3}, La/e/a/m/e;->P()F

    move-result p3

    :goto_0
    const/high16 p4, 0x3f000000    # 0.5f

    if-ne p1, v0, :cond_5

    iget v1, p1, La/e/a/m/m/f;->g:I

    iget p2, v0, La/e/a/m/m/f;->g:I

    move p3, p4

    :cond_5
    sub-int/2addr p2, v1

    iget-object p1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget p1, p1, La/e/a/m/m/f;->g:I

    sub-int/2addr p2, p1

    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    int-to-float v0, v1

    add-float/2addr v0, p4

    int-to-float p2, p2

    mul-float/2addr p2, p3

    add-float/2addr v0, p2

    float-to-int p2, v0

    invoke-virtual {p1, p2}, La/e/a/m/m/f;->d(I)V

    iget-object p1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object p2, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget p2, p2, La/e/a/m/m/f;->g:I

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget p0, p0, La/e/a/m/m/f;->g:I

    add-int/2addr p2, p0

    invoke-virtual {p1, p2}, La/e/a/m/m/f;->d(I)V

    :cond_6
    :goto_1
    return-void
.end method

.method protected o(La/e/a/m/m/d;)V
    .locals 0

    return-void
.end method

.method protected p(La/e/a/m/m/d;)V
    .locals 0

    return-void
.end method
