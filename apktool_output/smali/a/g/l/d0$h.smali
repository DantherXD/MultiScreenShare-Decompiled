.class La/g/l/d0$h;
.super La/g/l/d0$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/l/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "h"
.end annotation


# instance fields
.field private n:La/g/e/b;


# direct methods
.method constructor <init>(La/g/l/d0;La/g/l/d0$h;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/g/l/d0$g;-><init>(La/g/l/d0;La/g/l/d0$g;)V

    const/4 p1, 0x0

    iput-object p1, p0, La/g/l/d0$h;->n:La/g/e/b;

    iget-object p1, p2, La/g/l/d0$h;->n:La/g/e/b;

    iput-object p1, p0, La/g/l/d0$h;->n:La/g/e/b;

    return-void
.end method

.method constructor <init>(La/g/l/d0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/g/l/d0$g;-><init>(La/g/l/d0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, La/g/l/d0$h;->n:La/g/e/b;

    return-void
.end method


# virtual methods
.method b()La/g/l/d0;
    .locals 0

    iget-object p0, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeStableInsets()Landroid/view/WindowInsets;

    move-result-object p0

    invoke-static {p0}, La/g/l/d0;->s(Landroid/view/WindowInsets;)La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method c()La/g/l/d0;
    .locals 0

    iget-object p0, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->consumeSystemWindowInsets()Landroid/view/WindowInsets;

    move-result-object p0

    invoke-static {p0}, La/g/l/d0;->s(Landroid/view/WindowInsets;)La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method final h()La/g/e/b;
    .locals 4

    iget-object v0, p0, La/g/l/d0$h;->n:La/g/e/b;

    if-nez v0, :cond_0

    iget-object v0, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getStableInsetLeft()I

    move-result v0

    iget-object v1, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getStableInsetTop()I

    move-result v1

    iget-object v2, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getStableInsetRight()I

    move-result v2

    iget-object v3, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getStableInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, La/g/e/b;->b(IIII)La/g/e/b;

    move-result-object v0

    iput-object v0, p0, La/g/l/d0$h;->n:La/g/e/b;

    :cond_0
    iget-object p0, p0, La/g/l/d0$h;->n:La/g/e/b;

    return-object p0
.end method

.method k()Z
    .locals 0

    iget-object p0, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {p0}, Landroid/view/WindowInsets;->isConsumed()Z

    move-result p0

    return p0
.end method

.method public p(La/g/e/b;)V
    .locals 0

    iput-object p1, p0, La/g/l/d0$h;->n:La/g/e/b;

    return-void
.end method
