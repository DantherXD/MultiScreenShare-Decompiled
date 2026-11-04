.class La/c/a/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/c/a/f;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private n(La/c/a/e;)La/c/a/g;
    .locals 0

    invoke-interface {p1}, La/c/a/e;->d()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    check-cast p0, La/c/a/g;

    return-object p0
.end method


# virtual methods
.method public a(La/c/a/e;)F
    .locals 0

    invoke-direct {p0, p1}, La/c/a/c;->n(La/c/a/e;)La/c/a/g;

    move-result-object p0

    invoke-virtual {p0}, La/c/a/g;->c()F

    move-result p0

    return p0
.end method

.method public b(La/c/a/e;)F
    .locals 0

    invoke-direct {p0, p1}, La/c/a/c;->n(La/c/a/e;)La/c/a/g;

    move-result-object p0

    invoke-virtual {p0}, La/c/a/g;->d()F

    move-result p0

    return p0
.end method

.method public c(La/c/a/e;)F
    .locals 0

    invoke-virtual {p0, p1}, La/c/a/c;->b(La/c/a/e;)F

    move-result p0

    const/high16 p1, 0x40000000    # 2.0f

    mul-float/2addr p0, p1

    return p0
.end method

.method public d(La/c/a/e;)F
    .locals 0

    invoke-virtual {p0, p1}, La/c/a/c;->b(La/c/a/e;)F

    move-result p0

    const/high16 p1, 0x40000000    # 2.0f

    mul-float/2addr p0, p1

    return p0
.end method

.method public e(La/c/a/e;)V
    .locals 1

    invoke-virtual {p0, p1}, La/c/a/c;->a(La/c/a/e;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, La/c/a/c;->l(La/c/a/e;F)V

    return-void
.end method

.method public f(La/c/a/e;)Landroid/content/res/ColorStateList;
    .locals 0

    invoke-direct {p0, p1}, La/c/a/c;->n(La/c/a/e;)La/c/a/g;

    move-result-object p0

    invoke-virtual {p0}, La/c/a/g;->b()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public g(La/c/a/e;F)V
    .locals 0

    invoke-interface {p1}, La/c/a/e;->b()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public h(La/c/a/e;F)V
    .locals 0

    invoke-direct {p0, p1}, La/c/a/c;->n(La/c/a/e;)La/c/a/g;

    move-result-object p0

    invoke-virtual {p0, p2}, La/c/a/g;->h(F)V

    return-void
.end method

.method public i(La/c/a/e;)V
    .locals 1

    invoke-virtual {p0, p1}, La/c/a/c;->a(La/c/a/e;)F

    move-result v0

    invoke-virtual {p0, p1, v0}, La/c/a/c;->l(La/c/a/e;F)V

    return-void
.end method

.method public j(La/c/a/e;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-direct {p0, p1}, La/c/a/c;->n(La/c/a/e;)La/c/a/g;

    move-result-object p0

    invoke-virtual {p0, p2}, La/c/a/g;->f(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public k(La/c/a/e;)F
    .locals 0

    invoke-interface {p1}, La/c/a/e;->b()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result p0

    return p0
.end method

.method public l(La/c/a/e;F)V
    .locals 3

    invoke-direct {p0, p1}, La/c/a/c;->n(La/c/a/e;)La/c/a/g;

    move-result-object v0

    invoke-interface {p1}, La/c/a/e;->c()Z

    move-result v1

    invoke-interface {p1}, La/c/a/e;->f()Z

    move-result v2

    invoke-virtual {v0, p2, v1, v2}, La/c/a/g;->g(FZZ)V

    invoke-virtual {p0, p1}, La/c/a/c;->o(La/c/a/e;)V

    return-void
.end method

.method public m()V
    .locals 0

    return-void
.end method

.method public o(La/c/a/e;)V
    .locals 4

    invoke-interface {p1}, La/c/a/e;->c()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    invoke-interface {p1, p0, p0, p0, p0}, La/c/a/e;->a(IIII)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, La/c/a/c;->a(La/c/a/e;)F

    move-result v0

    invoke-virtual {p0, p1}, La/c/a/c;->b(La/c/a/e;)F

    move-result p0

    invoke-interface {p1}, La/c/a/e;->f()Z

    move-result v1

    invoke-static {v0, p0, v1}, La/c/a/h;->c(FFZ)F

    move-result v1

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-interface {p1}, La/c/a/e;->f()Z

    move-result v2

    invoke-static {v0, p0, v2}, La/c/a/h;->d(FFZ)F

    move-result p0

    float-to-double v2, p0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int p0, v2

    invoke-interface {p1, v1, p0, v1, p0}, La/c/a/e;->a(IIII)V

    return-void
.end method
