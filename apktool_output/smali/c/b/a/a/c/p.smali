.class final Lc/b/a/a/c/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/c/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lc/b/a/a/c/a0<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/lang/Object;

.field private c:Lc/b/a/a/c/b;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc/b/a/a/c/p;->b:Ljava/lang/Object;

    iput-object p1, p0, Lc/b/a/a/c/p;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lc/b/a/a/c/p;->c:Lc/b/a/a/c/b;

    return-void
.end method

.method static synthetic b(Lc/b/a/a/c/p;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lc/b/a/a/c/p;->b:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic c(Lc/b/a/a/c/p;)Lc/b/a/a/c/b;
    .locals 0

    iget-object p0, p0, Lc/b/a/a/c/p;->c:Lc/b/a/a/c/b;

    return-object p0
.end method


# virtual methods
.method public final a(Lc/b/a/a/c/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/c/h<",
            "TTResult;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lc/b/a/a/c/h;->k()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lc/b/a/a/c/p;->b:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lc/b/a/a/c/p;->c:Lc/b/a/a/c/b;

    if-nez v0, :cond_0

    monitor-exit p1

    return-void

    :cond_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc/b/a/a/c/p;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lc/b/a/a/c/r;

    invoke-direct {v0, p0}, Lc/b/a/a/c/r;-><init>(Lc/b/a/a/c/p;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method
