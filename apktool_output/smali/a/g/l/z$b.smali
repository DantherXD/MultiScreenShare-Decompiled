.class La/g/l/z$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/l/z;->i(La/g/l/c0;)La/g/l/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/g/l/c0;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:La/g/l/z;


# direct methods
.method constructor <init>(La/g/l/z;La/g/l/c0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, La/g/l/z$b;->c:La/g/l/z;

    iput-object p2, p0, La/g/l/z$b;->a:La/g/l/c0;

    iput-object p3, p0, La/g/l/z$b;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 0

    iget-object p1, p0, La/g/l/z$b;->a:La/g/l/c0;

    iget-object p0, p0, La/g/l/z$b;->b:Landroid/view/View;

    invoke-interface {p1, p0}, La/g/l/c0;->a(Landroid/view/View;)V

    return-void
.end method
