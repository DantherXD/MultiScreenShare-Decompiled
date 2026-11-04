.class La/g/l/v$h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/l/v$h;->d(Landroid/view/View;La/g/l/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:La/g/l/d0;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:La/g/l/q;


# direct methods
.method constructor <init>(Landroid/view/View;La/g/l/q;)V
    .locals 0

    iput-object p1, p0, La/g/l/v$h$a;->b:Landroid/view/View;

    iput-object p2, p0, La/g/l/v$h$a;->c:La/g/l/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/g/l/v$h$a;->a:La/g/l/d0;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 4

    invoke-static {p2, p1}, La/g/l/d0;->t(Landroid/view/WindowInsets;Landroid/view/View;)La/g/l/d0;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_0

    iget-object v3, p0, La/g/l/v$h$a;->b:Landroid/view/View;

    invoke-static {p2, v3}, La/g/l/v$h;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    iget-object p2, p0, La/g/l/v$h$a;->a:La/g/l/d0;

    invoke-virtual {v0, p2}, La/g/l/d0;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p0, p0, La/g/l/v$h$a;->c:La/g/l/q;

    invoke-interface {p0, p1, v0}, La/g/l/q;->a(Landroid/view/View;La/g/l/d0;)La/g/l/d0;

    move-result-object p0

    :goto_0
    invoke-virtual {p0}, La/g/l/d0;->r()Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0

    :cond_0
    iput-object v0, p0, La/g/l/v$h$a;->a:La/g/l/d0;

    iget-object p0, p0, La/g/l/v$h$a;->c:La/g/l/q;

    invoke-interface {p0, p1, v0}, La/g/l/q;->a(Landroid/view/View;La/g/l/d0;)La/g/l/d0;

    move-result-object p0

    if-lt v1, v2, :cond_1

    invoke-virtual {p0}, La/g/l/d0;->r()Landroid/view/WindowInsets;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p1}, La/g/l/v;->l0(Landroid/view/View;)V

    goto :goto_0
.end method
