.class public Lcom/homwee/multiscreenshare/q/a;
.super Landroidx/recyclerview/widget/RecyclerView$h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/homwee/multiscreenshare/q/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$h<",
        "Lcom/homwee/multiscreenshare/q/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/homwee/multiscreenshare/view/e;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/util/List;Landroid/content/Context;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/homwee/multiscreenshare/view/e;",
            ">;",
            "Landroid/content/Context;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$h;-><init>()V

    iput-object p1, p0, Lcom/homwee/multiscreenshare/q/a;->d:Ljava/util/List;

    iput-object p2, p0, Lcom/homwee/multiscreenshare/q/a;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public d()I
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/q/a;->d:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    return p0
.end method

.method public bridge synthetic l(Landroidx/recyclerview/widget/RecyclerView$e0;I)V
    .locals 0

    check-cast p1, Lcom/homwee/multiscreenshare/q/a$a;

    invoke-virtual {p0, p1, p2}, Lcom/homwee/multiscreenshare/q/a;->w(Lcom/homwee/multiscreenshare/q/a$a;I)V

    return-void
.end method

.method public bridge synthetic n(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$e0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/homwee/multiscreenshare/q/a;->x(Landroid/view/ViewGroup;I)Lcom/homwee/multiscreenshare/q/a$a;

    move-result-object p0

    return-object p0
.end method

.method public w(Lcom/homwee/multiscreenshare/q/a$a;I)V
    .locals 2

    iget-object v0, p0, Lcom/homwee/multiscreenshare/q/a;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/homwee/multiscreenshare/view/e;

    invoke-static {p1}, Lcom/homwee/multiscreenshare/q/a$a;->M(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/homwee/multiscreenshare/view/e;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p2}, Lcom/homwee/multiscreenshare/view/e;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/homwee/multiscreenshare/q/a$a;->M(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/q/a;->e:Landroid/content/Context;

    const v1, 0x7f050074

    invoke-virtual {p0, v1}, Landroid/content/Context;->getColor(I)I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {p1}, Lcom/homwee/multiscreenshare/q/a$a;->N(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/LinearLayout;

    move-result-object p0

    const v0, 0x7f07005c

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    invoke-static {p1}, Lcom/homwee/multiscreenshare/q/a$a;->O(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p2}, Lcom/homwee/multiscreenshare/view/e;->b()Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/homwee/multiscreenshare/q/a$a;->M(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/TextView;

    move-result-object v0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/q/a;->e:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v1, 0x7f0500fc

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p0

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {p1}, Lcom/homwee/multiscreenshare/q/a$a;->N(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/LinearLayout;

    move-result-object p0

    const v0, 0x7f07005d

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    invoke-static {p1}, Lcom/homwee/multiscreenshare/q/a$a;->O(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/ImageView;

    move-result-object p0

    invoke-virtual {p2}, Lcom/homwee/multiscreenshare/view/e;->d()Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public x(Landroid/view/ViewGroup;I)Lcom/homwee/multiscreenshare/q/a$a;
    .locals 1

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p0

    const p2, 0x7f0b0032

    const/4 v0, 0x0

    invoke-virtual {p0, p2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p0

    new-instance p1, Lcom/homwee/multiscreenshare/q/a$a;

    invoke-direct {p1, p0}, Lcom/homwee/multiscreenshare/q/a$a;-><init>(Landroid/view/View;)V

    return-object p1
.end method
