.class Landroidx/appcompat/app/f$i$a;
.super La/g/l/b0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/f$i;->d(La/a/n/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/f$i;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/f$i;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/f$i$a;->a:Landroidx/appcompat/app/f$i;

    invoke-direct {p0}, La/g/l/b0;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Landroidx/appcompat/app/f$i$a;->a:Landroidx/appcompat/app/f$i;

    iget-object p1, p1, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object p1, p1, Landroidx/appcompat/app/f;->w:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Landroidx/appcompat/app/f$i$a;->a:Landroidx/appcompat/app/f$i;

    iget-object p1, p1, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object v0, p1, Landroidx/appcompat/app/f;->x:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroidx/appcompat/app/f;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/appcompat/app/f$i$a;->a:Landroidx/appcompat/app/f$i;

    iget-object p1, p1, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object p1, p1, Landroidx/appcompat/app/f;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, La/g/l/v;->l0(Landroid/view/View;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/appcompat/app/f$i$a;->a:Landroidx/appcompat/app/f$i;

    iget-object p1, p1, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object p1, p1, Landroidx/appcompat/app/f;->w:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    iget-object p1, p0, Landroidx/appcompat/app/f$i$a;->a:Landroidx/appcompat/app/f$i;

    iget-object p1, p1, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iget-object p1, p1, Landroidx/appcompat/app/f;->z:La/g/l/z;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, La/g/l/z;->f(La/g/l/a0;)La/g/l/z;

    iget-object p0, p0, Landroidx/appcompat/app/f$i$a;->a:Landroidx/appcompat/app/f$i;

    iget-object p0, p0, Landroidx/appcompat/app/f$i;->b:Landroidx/appcompat/app/f;

    iput-object v0, p0, Landroidx/appcompat/app/f;->z:La/g/l/z;

    iget-object p0, p0, Landroidx/appcompat/app/f;->C:Landroid/view/ViewGroup;

    invoke-static {p0}, La/g/l/v;->l0(Landroid/view/View;)V

    return-void
.end method
