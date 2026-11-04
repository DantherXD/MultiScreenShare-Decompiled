.class public Lcom/homwee/multiscreenshare/view/g$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/homwee/multiscreenshare/view/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/widget/LinearLayout;

.field private c:Z

.field final synthetic d:Lcom/homwee/multiscreenshare/view/g;


# direct methods
.method public constructor <init>(Lcom/homwee/multiscreenshare/view/g;ILandroid/widget/LinearLayout;Z)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/g$c;->d:Lcom/homwee/multiscreenshare/view/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/homwee/multiscreenshare/view/g$c;->a:I

    iput-object p3, p0, Lcom/homwee/multiscreenshare/view/g$c;->b:Landroid/widget/LinearLayout;

    iput-boolean p4, p0, Lcom/homwee/multiscreenshare/view/g$c;->c:Z

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
    .locals 5

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g$c;->d:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v0, p1}, Lcom/homwee/multiscreenshare/view/g;->e(Lcom/homwee/multiscreenshare/view/g;I)I

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g$c;->d:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/view/g;->g(Lcom/homwee/multiscreenshare/view/g;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/homwee/multiscreenshare/view/g$c;->d:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v1}, Lcom/homwee/multiscreenshare/view/g;->i(Lcom/homwee/multiscreenshare/view/g;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g$c;->d:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/view/g;->g(Lcom/homwee/multiscreenshare/view/g;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/homwee/multiscreenshare/view/g$c;->d:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v1}, Lcom/homwee/multiscreenshare/view/g;->i(Lcom/homwee/multiscreenshare/view/g;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x1f40

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lcom/homwee/multiscreenshare/view/g$c;->a:I

    if-ge v1, v2, :cond_3

    iget-boolean v3, p0, Lcom/homwee/multiscreenshare/view/g$c;->c:Z

    const/4 v4, 0x1

    if-nez v3, :cond_1

    iget-object v2, p0, Lcom/homwee/multiscreenshare/view/g$c;->b:Landroid/widget/LinearLayout;

    if-ne v1, p1, :cond_0

    invoke-virtual {v2, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    goto :goto_1

    :cond_0
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    goto :goto_2

    :cond_1
    iget-object v3, p0, Lcom/homwee/multiscreenshare/view/g$c;->b:Landroid/widget/LinearLayout;

    add-int/lit8 v2, v2, -0x1

    if-ne v1, p1, :cond_2

    sub-int/2addr v2, p1

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    :goto_1
    invoke-virtual {v2, v4}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_3

    :cond_2
    sub-int/2addr v2, v1

    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    :goto_2
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
