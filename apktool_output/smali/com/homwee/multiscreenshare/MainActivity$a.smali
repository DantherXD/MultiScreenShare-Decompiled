.class Lcom/homwee/multiscreenshare/MainActivity$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/homwee/multiscreenshare/MainActivity;->i0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/homwee/multiscreenshare/MainActivity;


# direct methods
.method constructor <init>(Lcom/homwee/multiscreenshare/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IFI)V
    .locals 0

    return-void
.end method

.method public b(I)V
    .locals 0

    return-void
.end method

.method public c(I)V
    .locals 4

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->T(Lcom/homwee/multiscreenshare/MainActivity;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->T(Lcom/homwee/multiscreenshare/MainActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v1}, Lcom/homwee/multiscreenshare/MainActivity;->O(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->N(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v1}, Lcom/homwee/multiscreenshare/MainActivity;->T(Lcom/homwee/multiscreenshare/MainActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/homwee/multiscreenshare/view/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/homwee/multiscreenshare/view/e;->f(Z)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->V(Lcom/homwee/multiscreenshare/MainActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v2}, Lcom/homwee/multiscreenshare/MainActivity;->T(Lcom/homwee/multiscreenshare/MainActivity;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/g;->b(Landroid/view/View;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->P(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/q/a;

    move-result-object v0

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v2}, Lcom/homwee/multiscreenshare/MainActivity;->T(Lcom/homwee/multiscreenshare/MainActivity;)I

    move-result v2

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$h;->j(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->O(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object v0

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v2}, Lcom/homwee/multiscreenshare/MainActivity;->T(Lcom/homwee/multiscreenshare/MainActivity;)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/homwee/multiscreenshare/view/g;

    invoke-virtual {v0, v1}, Lcom/homwee/multiscreenshare/view/g;->o(Z)V

    :cond_0
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->N(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/homwee/multiscreenshare/view/e;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/homwee/multiscreenshare/view/e;->f(Z)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->V(Lcom/homwee/multiscreenshare/MainActivity;)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/g;->a(Landroid/view/View;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->P(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/q/a;

    move-result-object v0

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, p1, v2}, Landroidx/recyclerview/widget/RecyclerView$h;->j(ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0, p1}, Lcom/homwee/multiscreenshare/MainActivity;->U(Lcom/homwee/multiscreenshare/MainActivity;I)I

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity$a;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p0}, Lcom/homwee/multiscreenshare/MainActivity;->O(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/homwee/multiscreenshare/view/g;

    invoke-virtual {p0, v1}, Lcom/homwee/multiscreenshare/view/g;->o(Z)V

    return-void
.end method
