.class Landroidx/appcompat/app/f$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/a/n/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation


# instance fields
.field private a:La/a/n/b$a;

.field final synthetic b:Landroidx/appcompat/app/f;


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/f;La/a/n/b$a;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Landroidx/appcompat/app/f$i;->a:La/a/n/b$a;

    return-void
.end method


# virtual methods
.method public a(La/a/n/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object v0, v0, Landroidx/appcompat/app/f;->C:Landroid/view/ViewGroup;

    invoke-static {v0}, La/g/l/v;->l0(Landroid/view/View;)V

    iget-object p0, p0, Landroidx/appcompat/app/f$i;->a:La/a/n/b$a;

    invoke-interface {p0, p1, p2}, La/a/n/b$a;->a(La/a/n/b;Landroid/view/Menu;)Z

    move-result p0

    return p0
.end method

.method public b(La/a/n/b;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p0, p0, Landroidx/appcompat/app/f$i;->a:La/a/n/b$a;

    invoke-interface {p0, p1, p2}, La/a/n/b$a;->b(La/a/n/b;Landroid/view/MenuItem;)Z

    move-result p0

    return p0
.end method

.method public c(La/a/n/b;Landroid/view/Menu;)Z
    .locals 0

    iget-object p0, p0, Landroidx/appcompat/app/f$i;->a:La/a/n/b$a;

    invoke-interface {p0, p1, p2}, La/a/n/b$a;->c(La/a/n/b;Landroid/view/Menu;)Z

    move-result p0

    return p0
.end method

.method public d(La/a/n/b;)V
    .locals 2

    iget-object v0, p0, Landroidx/appcompat/app/f$i;->a:La/a/n/b$a;

    invoke-interface {v0, p1}, La/a/n/b$a;->d(La/a/n/b;)V

    iget-object p1, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object v0, p1, Landroidx/appcompat/app/f;->x:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object p1, p1, Landroidx/appcompat/app/f;->m:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object v0, v0, Landroidx/appcompat/app/f;->y:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object v0, p1, Landroidx/appcompat/app/f;->w:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroidx/appcompat/app/f;->V()V

    iget-object p1, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object v0, p1, Landroidx/appcompat/app/f;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, La/g/l/v;->d(Landroid/view/View;)La/g/l/z;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, La/g/l/z;->a(F)La/g/l/z;

    move-result-object v0

    iput-object v0, p1, Landroidx/appcompat/app/f;->z:La/g/l/z;

    iget-object p1, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object p1, p1, Landroidx/appcompat/app/f;->z:La/g/l/z;

    new-instance v0, Landroidx/appcompat/app/f$i$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/f$i$a;-><init>(Landroidx/appcompat/app/f$i;)V

    invoke-virtual {p1, v0}, La/g/l/z;->f(La/g/l/a0;)La/g/l/z;

    :cond_1
    iget-object p1, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object v0, p1, Landroidx/appcompat/app/f;->o:Landroidx/appcompat/app/d;

    if-eqz v0, :cond_2

    iget-object p1, p1, Landroidx/appcompat/app/f;->v:La/a/n/b;

    invoke-interface {v0, p1}, Landroidx/appcompat/app/d;->i(La/a/n/b;)V

    :cond_2
    iget-object p0, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/appcompat/app/f;->v:La/a/n/b;

    iget-object p0, p0, Landroidx/appcompat/app/f;->C:Landroid/view/ViewGroup;

    invoke-static {p0}, La/g/l/v;->l0(Landroid/view/View;)V

    return-void
.end method
