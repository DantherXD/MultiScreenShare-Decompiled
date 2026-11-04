.class La/a/l/a/d;
.super La/a/l/a/b;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedAPI"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/a/l/a/d$a;
    }
.end annotation


# instance fields
.field private n:La/a/l/a/d$a;

.field private o:Z


# direct methods
.method constructor <init>(La/a/l/a/d$a;)V
    .locals 0

    invoke-direct {p0}, La/a/l/a/b;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, La/a/l/a/d;->h(La/a/l/a/b$d;)V

    :cond_0
    return-void
.end method

.method constructor <init>(La/a/l/a/d$a;Landroid/content/res/Resources;)V
    .locals 1

    invoke-direct {p0}, La/a/l/a/b;-><init>()V

    new-instance v0, La/a/l/a/d$a;

    invoke-direct {v0, p1, p0, p2}, La/a/l/a/d$a;-><init>(La/a/l/a/d$a;La/a/l/a/d;Landroid/content/res/Resources;)V

    invoke-virtual {p0, v0}, La/a/l/a/d;->h(La/a/l/a/b$d;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, La/a/l/a/d;->onStateChange([I)Z

    return-void
.end method


# virtual methods
.method public applyTheme(Landroid/content/res/Resources$Theme;)V
    .locals 0

    invoke-super {p0, p1}, La/a/l/a/b;->applyTheme(Landroid/content/res/Resources$Theme;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getState()[I

    move-result-object p1

    invoke-virtual {p0, p1}, La/a/l/a/d;->onStateChange([I)Z

    return-void
.end method

.method bridge synthetic b()La/a/l/a/b$d;
    .locals 0

    invoke-virtual {p0}, La/a/l/a/d;->j()La/a/l/a/d$a;

    move-result-object p0

    return-object p0
.end method

.method h(La/a/l/a/b$d;)V
    .locals 1

    invoke-super {p0, p1}, La/a/l/a/b;->h(La/a/l/a/b$d;)V

    instance-of v0, p1, La/a/l/a/d$a;

    if-eqz v0, :cond_0

    check-cast p1, La/a/l/a/d$a;

    iput-object p1, p0, La/a/l/a/d;->n:La/a/l/a/d$a;

    :cond_0
    return-void
.end method

.method public isStateful()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method j()La/a/l/a/d$a;
    .locals 3

    new-instance v0, La/a/l/a/d$a;

    iget-object v1, p0, La/a/l/a/d;->n:La/a/l/a/d$a;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p0, v2}, La/a/l/a/d$a;-><init>(La/a/l/a/d$a;La/a/l/a/d;Landroid/content/res/Resources;)V

    return-object v0
.end method

.method k(Landroid/util/AttributeSet;)[I
    .locals 7

    invoke-interface {p1}, Landroid/util/AttributeSet;->getAttributeCount()I

    move-result p0

    new-array v0, p0, [I

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, p0, :cond_2

    invoke-interface {p1, v2}, Landroid/util/AttributeSet;->getAttributeNameResource(I)I

    move-result v4

    if-eqz v4, :cond_1

    const v5, 0x10100d0

    if-eq v4, v5, :cond_1

    const v5, 0x1010199

    if-eq v4, v5, :cond_1

    add-int/lit8 v5, v3, 0x1

    invoke-interface {p1, v2, v1}, Landroid/util/AttributeSet;->getAttributeBooleanValue(IZ)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    neg-int v4, v4

    :goto_1
    aput v4, v0, v3

    move v3, v5

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v0, v3}, Landroid/util/StateSet;->trimStateSet([II)[I

    move-result-object p0

    return-object p0
.end method

.method public mutate()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-boolean v0, p0, La/a/l/a/d;->o:Z

    if-nez v0, :cond_0

    invoke-super {p0}, La/a/l/a/b;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_0

    iget-object v0, p0, La/a/l/a/d;->n:La/a/l/a/d$a;

    invoke-virtual {v0}, La/a/l/a/d$a;->r()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/l/a/d;->o:Z

    :cond_0
    return-object p0
.end method

.method protected onStateChange([I)Z
    .locals 2

    invoke-super {p0, p1}, La/a/l/a/b;->onStateChange([I)Z

    move-result v0

    iget-object v1, p0, La/a/l/a/d;->n:La/a/l/a/d$a;

    invoke-virtual {v1, p1}, La/a/l/a/d$a;->A([I)I

    move-result p1

    if-gez p1, :cond_0

    iget-object p1, p0, La/a/l/a/d;->n:La/a/l/a/d$a;

    sget-object v1, Landroid/util/StateSet;->WILD_CARD:[I

    invoke-virtual {p1, v1}, La/a/l/a/d$a;->A([I)I

    move-result p1

    :cond_0
    invoke-virtual {p0, p1}, La/a/l/a/b;->g(I)Z

    move-result p0

    if-nez p0, :cond_2

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method
