.class final Lcom/blankj/utilcode/util/j$a;
.super Ljava/util/concurrent/LinkedBlockingQueue;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/LinkedBlockingQueue<",
        "Ljava/lang/Runnable;",
        ">;"
    }
.end annotation


# instance fields
.field private volatile b:Lcom/blankj/utilcode/util/j$b;

.field private c:I


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/blankj/utilcode/util/j$a;->c:I

    return-void
.end method

.method constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    const v0, 0x7fffffff

    iput v0, p0, Lcom/blankj/utilcode/util/j$a;->c:I

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lcom/blankj/utilcode/util/j$a;->c:I

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/blankj/utilcode/util/j$a;Lcom/blankj/utilcode/util/j$b;)Lcom/blankj/utilcode/util/j$b;
    .locals 0

    iput-object p1, p0, Lcom/blankj/utilcode/util/j$a;->b:Lcom/blankj/utilcode/util/j$b;

    return-object p1
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)Z
    .locals 2

    iget v0, p0, Lcom/blankj/utilcode/util/j$a;->c:I

    invoke-virtual {p0}, Ljava/util/concurrent/LinkedBlockingQueue;->size()I

    move-result v1

    if-gt v0, v1, :cond_0

    iget-object v0, p0, Lcom/blankj/utilcode/util/j$a;->b:Lcom/blankj/utilcode/util/j$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/blankj/utilcode/util/j$a;->b:Lcom/blankj/utilcode/util/j$b;

    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->getPoolSize()I

    move-result v0

    iget-object v1, p0, Lcom/blankj/utilcode/util/j$a;->b:Lcom/blankj/utilcode/util/j$b;

    invoke-virtual {v1}, Ljava/util/concurrent/ThreadPoolExecutor;->getMaximumPoolSize()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-super {p0, p1}, Ljava/util/concurrent/LinkedBlockingQueue;->offer(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public bridge synthetic offer(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/lang/Runnable;

    invoke-virtual {p0, p1}, Lcom/blankj/utilcode/util/j$a;->b(Ljava/lang/Runnable;)Z

    move-result p0

    return p0
.end method
