.class final Ld/a/m/g/h$a;
.super Ld/a/h$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/g/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final b:Ljava/util/concurrent/ScheduledExecutorService;

.field final c:Ld/a/j/a;

.field volatile d:Z


# direct methods
.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ld/a/h$b;-><init>()V

    iput-object p1, p0, Ld/a/m/g/h$a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Ld/a/j/a;

    invoke-direct {p1}, Ld/a/j/a;-><init>()V

    iput-object p1, p0, Ld/a/m/g/h$a;->c:Ld/a/j/a;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    iget-boolean v0, p0, Ld/a/m/g/h$a;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld/a/m/g/h$a;->d:Z

    iget-object p0, p0, Ld/a/m/g/h$a;->c:Ld/a/j/a;

    invoke-virtual {p0}, Ld/a/j/a;->c()V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;
    .locals 3

    iget-boolean v0, p0, Ld/a/m/g/h$a;->d:Z

    if-eqz v0, :cond_0

    sget-object p0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object p0

    :cond_0
    invoke-static {p1}, Ld/a/n/a;->m(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    new-instance v0, Ld/a/m/g/f;

    iget-object v1, p0, Ld/a/m/g/h$a;->c:Ld/a/j/a;

    invoke-direct {v0, p1, v1}, Ld/a/m/g/f;-><init>(Ljava/lang/Runnable;Ld/a/m/a/a;)V

    iget-object p1, p0, Ld/a/m/g/h$a;->c:Ld/a/j/a;

    invoke-virtual {p1, v0}, Ld/a/j/a;->d(Ld/a/j/b;)Z

    const-wide/16 v1, 0x0

    cmp-long p1, p2, v1

    if-gtz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Ld/a/m/g/h$a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ScheduledExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ld/a/m/g/h$a;->b:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v0, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Ld/a/m/g/f;->a(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Ld/a/m/g/h$a;->c()V

    invoke-static {p1}, Ld/a/n/a;->k(Ljava/lang/Throwable;)V

    sget-object p0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object p0
.end method
