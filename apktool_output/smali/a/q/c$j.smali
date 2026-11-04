.class La/q/c$j;
.super La/q/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/q/c;->n(Landroid/view/ViewGroup;La/q/s;La/q/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:La/q/c;


# direct methods
.method constructor <init>(La/q/c;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, La/q/c$j;->c:La/q/c;

    iput-object p2, p0, La/q/c$j;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, La/q/n;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, La/q/c$j;->a:Z

    return-void
.end method


# virtual methods
.method public a(La/q/m;)V
    .locals 0

    iget-object p0, p0, La/q/c$j;->b:Landroid/view/ViewGroup;

    const/4 p1, 0x0

    invoke-static {p0, p1}, La/q/x;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public b(La/q/m;)V
    .locals 0

    iget-object p0, p0, La/q/c$j;->b:Landroid/view/ViewGroup;

    const/4 p1, 0x1

    invoke-static {p0, p1}, La/q/x;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public d(La/q/m;)V
    .locals 1

    iget-object p1, p0, La/q/c$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, La/q/x;->c(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, La/q/c$j;->a:Z

    return-void
.end method

.method public e(La/q/m;)V
    .locals 2

    iget-boolean v0, p0, La/q/c$j;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, La/q/c$j;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/q/x;->c(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, La/q/m;->P(La/q/m$f;)La/q/m;

    return-void
.end method
