.class Lcom/homwee/multiscreenshare/view/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/homwee/multiscreenshare/view/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/homwee/multiscreenshare/view/g;


# direct methods
.method constructor <init>(Lcom/homwee/multiscreenshare/view/g;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/g$a;->b:Lcom/homwee/multiscreenshare/view/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g$a;->b:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/view/g;->a(Lcom/homwee/multiscreenshare/view/g;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g$a;->b:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/view/g;->b(Lcom/homwee/multiscreenshare/view/g;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v2, p0, Lcom/homwee/multiscreenshare/view/g$a;->b:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v2}, Lcom/homwee/multiscreenshare/view/g;->c(Lcom/homwee/multiscreenshare/view/g;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/homwee/multiscreenshare/view/g$a;->b:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v2}, Lcom/homwee/multiscreenshare/view/g;->d(Lcom/homwee/multiscreenshare/view/g;)I

    move-result v3

    sub-int/2addr v3, v1

    add-int/2addr v3, v0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/homwee/multiscreenshare/view/g$a;->b:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v2}, Lcom/homwee/multiscreenshare/view/g;->d(Lcom/homwee/multiscreenshare/view/g;)I

    move-result v3

    add-int/2addr v3, v1

    :goto_0
    rem-int/2addr v3, v0

    invoke-static {v2, v3}, Lcom/homwee/multiscreenshare/view/g;->e(Lcom/homwee/multiscreenshare/view/g;I)I

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g$a;->b:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/view/g;->f(Lcom/homwee/multiscreenshare/view/g;)Landroidx/viewpager/widget/ViewPager;

    move-result-object v0

    iget-object v2, p0, Lcom/homwee/multiscreenshare/view/g$a;->b:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v2}, Lcom/homwee/multiscreenshare/view/g;->d(Lcom/homwee/multiscreenshare/view/g;)I

    move-result v2

    invoke-virtual {v0, v2, v1}, Landroidx/viewpager/widget/ViewPager;->K(IZ)V

    :cond_1
    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g$a;->b:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/view/g;->g(Lcom/homwee/multiscreenshare/view/g;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x1f40

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method
