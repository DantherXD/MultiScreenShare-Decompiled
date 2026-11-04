.class final Lc/b/a/a/c/d0;
.super Lc/b/a/a/c/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lc/b/a/a/c/h<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lc/b/a/a/c/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/c/b0<",
            "TTResult;>;"
        }
    .end annotation
.end field

.field private c:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private volatile d:Z

.field private e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private f:Ljava/lang/Exception;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc/b/a/a/c/h;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    new-instance v0, Lc/b/a/a/c/b0;

    invoke-direct {v0}, Lc/b/a/a/c/b0;-><init>()V

    iput-object v0, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    return-void
.end method

.method private final s()V
    .locals 1
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean p0, p0, Lc/b/a/a/c/d0;->c:Z

    const-string v0, "Task is not yet complete"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/b;->f(ZLjava/lang/Object;)V

    return-void
.end method

.method private final v()V
    .locals 1
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean p0, p0, Lc/b/a/a/c/d0;->c:Z

    xor-int/lit8 p0, p0, 0x1

    const-string v0, "Task is already complete"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/b;->f(ZLjava/lang/Object;)V

    return-void
.end method

.method private final w()V
    .locals 1
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean p0, p0, Lc/b/a/a/c/d0;->d:Z

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Task is already canceled."

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final x()V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    invoke-virtual {v0, p0}, Lc/b/a/a/c/b0;->a(Lc/b/a/a/c/h;)V

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final a(Ljava/util/concurrent/Executor;Lc/b/a/a/c/b;)Lc/b/a/a/c/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/c/b;",
            ")",
            "Lc/b/a/a/c/h<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    new-instance v1, Lc/b/a/a/c/p;

    invoke-static {p1}, Lc/b/a/a/c/f0;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lc/b/a/a/c/p;-><init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/b;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/c/b0;->b(Lc/b/a/a/c/a0;)V

    invoke-direct {p0}, Lc/b/a/a/c/d0;->x()V

    return-object p0
.end method

.method public final b(Lc/b/a/a/c/c;)Lc/b/a/a/c/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/c/c<",
            "TTResult;>;)",
            "Lc/b/a/a/c/h<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lc/b/a/a/c/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/c/h;->c(Ljava/util/concurrent/Executor;Lc/b/a/a/c/c;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public final c(Ljava/util/concurrent/Executor;Lc/b/a/a/c/c;)Lc/b/a/a/c/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/c/c<",
            "TTResult;>;)",
            "Lc/b/a/a/c/h<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    new-instance v1, Lc/b/a/a/c/t;

    invoke-static {p1}, Lc/b/a/a/c/f0;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lc/b/a/a/c/t;-><init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/c;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/c/b0;->b(Lc/b/a/a/c/a0;)V

    invoke-direct {p0}, Lc/b/a/a/c/d0;->x()V

    return-object p0
.end method

.method public final d(Ljava/util/concurrent/Executor;Lc/b/a/a/c/d;)Lc/b/a/a/c/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/c/d;",
            ")",
            "Lc/b/a/a/c/h<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    new-instance v1, Lc/b/a/a/c/u;

    invoke-static {p1}, Lc/b/a/a/c/f0;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lc/b/a/a/c/u;-><init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/d;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/c/b0;->b(Lc/b/a/a/c/a0;)V

    invoke-direct {p0}, Lc/b/a/a/c/d0;->x()V

    return-object p0
.end method

.method public final e(Ljava/util/concurrent/Executor;Lc/b/a/a/c/e;)Lc/b/a/a/c/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/c/e<",
            "-TTResult;>;)",
            "Lc/b/a/a/c/h<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    new-instance v1, Lc/b/a/a/c/x;

    invoke-static {p1}, Lc/b/a/a/c/f0;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lc/b/a/a/c/x;-><init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/e;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/c/b0;->b(Lc/b/a/a/c/a0;)V

    invoke-direct {p0}, Lc/b/a/a/c/d0;->x()V

    return-object p0
.end method

.method public final f(Ljava/util/concurrent/Executor;Lc/b/a/a/c/a;)Lc/b/a/a/c/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/c/a<",
            "TTResult;TTContinuationResult;>;)",
            "Lc/b/a/a/c/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lc/b/a/a/c/d0;

    invoke-direct {v0}, Lc/b/a/a/c/d0;-><init>()V

    iget-object v1, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    new-instance v2, Lc/b/a/a/c/m;

    invoke-static {p1}, Lc/b/a/a/c/f0;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v2, p1, p2, v0}, Lc/b/a/a/c/m;-><init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/a;Lc/b/a/a/c/d0;)V

    invoke-virtual {v1, v2}, Lc/b/a/a/c/b0;->b(Lc/b/a/a/c/a0;)V

    invoke-direct {p0}, Lc/b/a/a/c/d0;->x()V

    return-object v0
.end method

.method public final g(Lc/b/a/a/c/a;)Lc/b/a/a/c/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/b/a/a/c/a<",
            "TTResult;",
            "Lc/b/a/a/c/h<",
            "TTContinuationResult;>;>;)",
            "Lc/b/a/a/c/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lc/b/a/a/c/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/c/h;->h(Ljava/util/concurrent/Executor;Lc/b/a/a/c/a;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public final h(Ljava/util/concurrent/Executor;Lc/b/a/a/c/a;)Lc/b/a/a/c/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/c/a<",
            "TTResult;",
            "Lc/b/a/a/c/h<",
            "TTContinuationResult;>;>;)",
            "Lc/b/a/a/c/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lc/b/a/a/c/d0;

    invoke-direct {v0}, Lc/b/a/a/c/d0;-><init>()V

    iget-object v1, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    new-instance v2, Lc/b/a/a/c/n;

    invoke-static {p1}, Lc/b/a/a/c/f0;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v2, p1, p2, v0}, Lc/b/a/a/c/n;-><init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/a;Lc/b/a/a/c/d0;)V

    invoke-virtual {v1, v2}, Lc/b/a/a/c/b0;->b(Lc/b/a/a/c/a0;)V

    invoke-direct {p0}, Lc/b/a/a/c/d0;->x()V

    return-object v0
.end method

.method public final i()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, Lc/b/a/a/c/d0;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final j()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lc/b/a/a/c/d0;->s()V

    invoke-direct {p0}, Lc/b/a/a/c/d0;->w()V

    iget-object v1, p0, Lc/b/a/a/c/d0;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object p0, p0, Lc/b/a/a/c/d0;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object p0

    :cond_0
    new-instance v1, Lc/b/a/a/c/f;

    iget-object p0, p0, Lc/b/a/a/c/d0;->f:Ljava/lang/Exception;

    invoke-direct {v1, p0}, Lc/b/a/a/c/f;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final k()Z
    .locals 0

    iget-boolean p0, p0, Lc/b/a/a/c/d0;->d:Z

    return p0
.end method

.method public final l()Z
    .locals 1

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean p0, p0, Lc/b/a/a/c/d0;->c:Z

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final m()Z
    .locals 2

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lc/b/a/a/c/d0;->d:Z

    if-nez v1, :cond_0

    iget-object p0, p0, Lc/b/a/a/c/d0;->f:Ljava/lang/Exception;

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final n(Lc/b/a/a/c/g;)Lc/b/a/a/c/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/b/a/a/c/g<",
            "TTResult;TTContinuationResult;>;)",
            "Lc/b/a/a/c/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    sget-object v0, Lc/b/a/a/c/j;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/c/h;->o(Ljava/util/concurrent/Executor;Lc/b/a/a/c/g;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public final o(Ljava/util/concurrent/Executor;Lc/b/a/a/c/g;)Lc/b/a/a/c/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TContinuationResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/c/g<",
            "TTResult;TTContinuationResult;>;)",
            "Lc/b/a/a/c/h<",
            "TTContinuationResult;>;"
        }
    .end annotation

    new-instance v0, Lc/b/a/a/c/d0;

    invoke-direct {v0}, Lc/b/a/a/c/d0;-><init>()V

    iget-object v1, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    new-instance v2, Lc/b/a/a/c/y;

    invoke-static {p1}, Lc/b/a/a/c/f0;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v2, p1, p2, v0}, Lc/b/a/a/c/y;-><init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/g;Lc/b/a/a/c/d0;)V

    invoke-virtual {v1, v2}, Lc/b/a/a/c/b0;->b(Lc/b/a/a/c/a0;)V

    invoke-direct {p0}, Lc/b/a/a/c/d0;->x()V

    return-object v0
.end method

.method public final p(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lc/b/a/a/c/d0;->v()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    iput-object p1, p0, Lc/b/a/a/c/d0;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    invoke-virtual {p1, p0}, Lc/b/a/a/c/b0;->a(Lc/b/a/a/c/h;)V

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public final q(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lc/b/a/a/c/d0;->v()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    iput-object p1, p0, Lc/b/a/a/c/d0;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    invoke-virtual {p1, p0}, Lc/b/a/a/c/b0;->a(Lc/b/a/a/c/h;)V

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public final r()Z
    .locals 2

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    monitor-exit v0

    return p0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    iput-boolean v1, p0, Lc/b/a/a/c/d0;->d:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    invoke-virtual {v0, p0}, Lc/b/a/a/c/b0;->a(Lc/b/a/a/c/h;)V

    return v1

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public final t(Ljava/lang/Exception;)Z
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    monitor-exit v0

    return p0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    iput-object p1, p0, Lc/b/a/a/c/d0;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    invoke-virtual {p1, p0}, Lc/b/a/a/c/b0;->a(Lc/b/a/a/c/h;)V

    return v1

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public final u(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/c/d0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    if-eqz v1, :cond_0

    const/4 p0, 0x0

    monitor-exit v0

    return p0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lc/b/a/a/c/d0;->c:Z

    iput-object p1, p0, Lc/b/a/a/c/d0;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc/b/a/a/c/d0;->b:Lc/b/a/a/c/b0;

    invoke-virtual {p1, p0}, Lc/b/a/a/c/b0;->a(Lc/b/a/a/c/h;)V

    return v1

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
