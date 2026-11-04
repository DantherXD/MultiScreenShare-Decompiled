.class La/g/l/z$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/l/z;->g(Landroid/view/View;La/g/l/a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/g/l/a0;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:La/g/l/z;


# direct methods
.method constructor <init>(La/g/l/z;La/g/l/a0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, La/g/l/z$a;->c:La/g/l/z;

    iput-object p2, p0, La/g/l/z$a;->a:La/g/l/a0;

    iput-object p3, p0, La/g/l/z$a;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, La/g/l/z$a;->a:La/g/l/a0;

    iget-object p0, p0, La/g/l/z$a;->b:Landroid/view/View;

    invoke-interface {p1, p0}, La/g/l/a0;->c(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, La/g/l/z$a;->a:La/g/l/a0;

    iget-object p0, p0, La/g/l/z$a;->b:Landroid/view/View;

    invoke-interface {p1, p0}, La/g/l/a0;->a(Landroid/view/View;)V

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, La/g/l/z$a;->a:La/g/l/a0;

    iget-object p0, p0, La/g/l/z$a;->b:Landroid/view/View;

    invoke-interface {p1, p0}, La/g/l/a0;->b(Landroid/view/View;)V

    return-void
.end method
