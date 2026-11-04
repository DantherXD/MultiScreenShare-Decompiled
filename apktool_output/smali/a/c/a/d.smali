.class La/c/a/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/c/a/f;


# instance fields
.field final a:Landroid/graphics/RectF;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, La/c/a/d;->a:Landroid/graphics/RectF;

    return-void
.end method

.method private n(La/c/a/e;)La/c/a/h;
    .locals 0

    invoke-interface {p1}, La/c/a/e;->d()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    check-cast p0, La/c/a/h;

    return-object p0
.end method


# virtual methods
.method public a(La/c/a/e;)F
    .locals 0

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object p0

    invoke-virtual {p0}, La/c/a/h;->i()F

    move-result p0

    return p0
.end method

.method public b(La/c/a/e;)F
    .locals 0

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object p0

    invoke-virtual {p0}, La/c/a/h;->g()F

    move-result p0

    return p0
.end method

.method public c(La/c/a/e;)F
    .locals 0

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object p0

    invoke-virtual {p0}, La/c/a/h;->j()F

    move-result p0

    return p0
.end method

.method public d(La/c/a/e;)F
    .locals 0

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object p0

    invoke-virtual {p0}, La/c/a/h;->k()F

    move-result p0

    return p0
.end method

.method public e(La/c/a/e;)V
    .locals 0

    return-void
.end method

.method public f(La/c/a/e;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object p0

    invoke-virtual {p0}, La/c/a/h;->f()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public g(La/c/a/e;F)V
    .locals 0

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object p0

    invoke-virtual {p0, p2}, La/c/a/h;->r(F)V

    return-void
.end method

.method public h(La/c/a/e;F)V
    .locals 1

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object v0

    invoke-virtual {v0, p2}, La/c/a/h;->p(F)V

    invoke-virtual {p0, p1}, La/c/a/d;->o(La/c/a/e;)V

    return-void
.end method

.method public i(La/c/a/e;)V
    .locals 2

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object v0

    invoke-interface {p1}, La/c/a/e;->f()Z

    move-result v1

    invoke-virtual {v0, v1}, La/c/a/h;->m(Z)V

    invoke-virtual {p0, p1}, La/c/a/d;->o(La/c/a/e;)V

    return-void
.end method

.method public j(La/c/a/e;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object p0

    invoke-virtual {p0, p2}, La/c/a/h;->o(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public k(La/c/a/e;)F
    .locals 0

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object p0

    invoke-virtual {p0}, La/c/a/h;->l()F

    move-result p0

    return p0
.end method

.method public l(La/c/a/e;F)V
    .locals 1

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object v0

    invoke-virtual {v0, p2}, La/c/a/h;->q(F)V

    invoke-virtual {p0, p1}, La/c/a/d;->o(La/c/a/e;)V

    return-void
.end method

.method public m()V
    .locals 1

    new-instance v0, La/c/a/d$a;

    invoke-direct {v0, p0}, La/c/a/d$a;-><init>(La/c/a/d;)V

    sput-object v0, La/c/a/h;->b:La/c/a/h$a;

    return-void
.end method

.method public o(La/c/a/e;)V
    .locals 4

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-direct {p0, p1}, La/c/a/d;->n(La/c/a/e;)La/c/a/h;

    move-result-object v1

    invoke-virtual {v1, v0}, La/c/a/h;->h(Landroid/graphics/Rect;)V

    invoke-virtual {p0, p1}, La/c/a/d;->d(La/c/a/e;)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {p0, p1}, La/c/a/d;->c(La/c/a/e;)F

    move-result p0

    float-to-double v2, p0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int p0, v2

    invoke-interface {p1, v1, p0}, La/c/a/e;->e(II)V

    iget p0, v0, Landroid/graphics/Rect;->left:I

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v2, v0, Landroid/graphics/Rect;->right:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-interface {p1, p0, v1, v2, v0}, La/c/a/e;->a(IIII)V

    return-void
.end method
