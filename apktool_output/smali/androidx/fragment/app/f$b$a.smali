.class Landroidx/fragment/app/f$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/f$b;->onAnimationEnd(Landroid/view/animation/Animation;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/fragment/app/f$b;


# direct methods
.method constructor <init>(Landroidx/fragment/app/f$b;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/f$b$a;->b:Landroidx/fragment/app/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/f$b$a;->b:Landroidx/fragment/app/f$b;

    iget-object v0, v0, Landroidx/fragment/app/f$b;->b:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->m()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/f$b$a;->b:Landroidx/fragment/app/f$b;

    iget-object v0, v0, Landroidx/fragment/app/f$b;->b:Landroidx/fragment/app/Fragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->q1(Landroid/view/View;)V

    iget-object p0, p0, Landroidx/fragment/app/f$b$a;->b:Landroidx/fragment/app/f$b;

    iget-object v0, p0, Landroidx/fragment/app/f$b;->c:Landroidx/fragment/app/x$g;

    iget-object v1, p0, Landroidx/fragment/app/f$b;->b:Landroidx/fragment/app/Fragment;

    iget-object p0, p0, Landroidx/fragment/app/f$b;->d:La/g/h/b;

    invoke-interface {v0, v1, p0}, Landroidx/fragment/app/x$g;->a(Landroidx/fragment/app/Fragment;La/g/h/b;)V

    :cond_0
    return-void
.end method
