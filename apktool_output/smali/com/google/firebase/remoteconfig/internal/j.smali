.class public Lcom/google/firebase/remoteconfig/internal/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/remoteconfig/internal/j$b;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/firebase/remoteconfig/internal/j;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Ljava/util/concurrent/Executor;


# instance fields
.field private final c:Ljava/util/concurrent/ExecutorService;

.field private final d:Lcom/google/firebase/remoteconfig/internal/o;

.field private e:Lc/b/a/a/c/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/c/h<",
            "Lcom/google/firebase/remoteconfig/internal/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/google/firebase/remoteconfig/internal/j;->a:Ljava/util/Map;

    sget-object v0, Lcom/google/firebase/remoteconfig/internal/i;->a:Lcom/google/firebase/remoteconfig/internal/i;

    sput-object v0, Lcom/google/firebase/remoteconfig/internal/j;->b:Ljava/util/concurrent/Executor;

    return-void
.end method

.method private constructor <init>(Ljava/util/concurrent/ExecutorService;Lcom/google/firebase/remoteconfig/internal/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/j;->c:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/j;->d:Lcom/google/firebase/remoteconfig/internal/o;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Lc/b/a/a/c/h;

    return-void
.end method

.method private static a(Lc/b/a/a/c/h;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/b/a/a/c/h<",
            "TTResult;>;J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TTResult;"
        }
    .end annotation

    new-instance v0, Lcom/google/firebase/remoteconfig/internal/j$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/firebase/remoteconfig/internal/j$b;-><init>(Lcom/google/firebase/remoteconfig/internal/j$a;)V

    sget-object v1, Lcom/google/firebase/remoteconfig/internal/j;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v1, v0}, Lc/b/a/a/c/h;->e(Ljava/util/concurrent/Executor;Lc/b/a/a/c/e;)Lc/b/a/a/c/h;

    invoke-virtual {p0, v1, v0}, Lc/b/a/a/c/h;->d(Ljava/util/concurrent/Executor;Lc/b/a/a/c/d;)Lc/b/a/a/c/h;

    invoke-virtual {p0, v1, v0}, Lc/b/a/a/c/h;->a(Ljava/util/concurrent/Executor;Lc/b/a/a/c/b;)Lc/b/a/a/c/h;

    invoke-virtual {v0, p1, p2, p3}, Lcom/google/firebase/remoteconfig/internal/j$b;->a(JLjava/util/concurrent/TimeUnit;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lc/b/a/a/c/h;->m()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lc/b/a/a/c/h;->j()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Ljava/util/concurrent/ExecutionException;

    invoke-virtual {p0}, Lc/b/a/a/c/h;->i()Ljava/lang/Exception;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    new-instance p0, Ljava/util/concurrent/TimeoutException;

    const-string p1, "Task await timed out."

    invoke-direct {p0, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static declared-synchronized f(Ljava/util/concurrent/ExecutorService;Lcom/google/firebase/remoteconfig/internal/o;)Lcom/google/firebase/remoteconfig/internal/j;
    .locals 4

    const-class v0, Lcom/google/firebase/remoteconfig/internal/j;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/o;->b()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/google/firebase/remoteconfig/internal/j;->a:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Lcom/google/firebase/remoteconfig/internal/j;

    invoke-direct {v3, p0, p1}, Lcom/google/firebase/remoteconfig/internal/j;-><init>(Ljava/util/concurrent/ExecutorService;Lcom/google/firebase/remoteconfig/internal/o;)V

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/remoteconfig/internal/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private synthetic g(Lcom/google/firebase/remoteconfig/internal/k;)Ljava/lang/Void;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/internal/j;->d:Lcom/google/firebase/remoteconfig/internal/o;

    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/o;->e(Lcom/google/firebase/remoteconfig/internal/k;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method private synthetic i(ZLcom/google/firebase/remoteconfig/internal/k;Ljava/lang/Void;)Lc/b/a/a/c/h;
    .locals 0

    if-eqz p1, :cond_0

    invoke-direct {p0, p2}, Lcom/google/firebase/remoteconfig/internal/j;->m(Lcom/google/firebase/remoteconfig/internal/k;)V

    :cond_0
    invoke-static {p2}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method private declared-synchronized m(Lcom/google/firebase/remoteconfig/internal/k;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object p1

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Lc/b/a/a/c/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public b()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Lc/b/a/a/c/h;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/internal/j;->d:Lcom/google/firebase/remoteconfig/internal/o;

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/o;->a()Ljava/lang/Void;

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public declared-synchronized c()Lc/b/a/a/c/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/b/a/a/c/h<",
            "Lcom/google/firebase/remoteconfig/internal/k;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Lc/b/a/a/c/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/a/a/c/h;->l()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Lc/b/a/a/c/h;

    invoke-virtual {v0}, Lc/b/a/a/c/h;->m()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/j;->c:Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/j;->d:Lcom/google/firebase/remoteconfig/internal/o;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/firebase/remoteconfig/internal/h;

    invoke-direct {v2, v1}, Lcom/google/firebase/remoteconfig/internal/h;-><init>(Lcom/google/firebase/remoteconfig/internal/o;)V

    invoke-static {v0, v2}, Lc/b/a/a/c/k;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lc/b/a/a/c/h;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Lc/b/a/a/c/h;

    :cond_1
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Lc/b/a/a/c/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public d()Lcom/google/firebase/remoteconfig/internal/k;
    .locals 2

    const-wide/16 v0, 0x5

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/remoteconfig/internal/j;->e(J)Lcom/google/firebase/remoteconfig/internal/k;

    move-result-object p0

    return-object p0
.end method

.method e(J)Lcom/google/firebase/remoteconfig/internal/k;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Lc/b/a/a/c/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/a/a/c/h;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/google/firebase/remoteconfig/internal/j;->e:Lc/b/a/a/c/h;

    invoke-virtual {p1}, Lc/b/a/a/c/h;->j()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/k;

    monitor-exit p0

    return-object p1

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/j;->c()Lc/b/a/a/c/h;

    move-result-object p0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, p1, p2, v0}, Lcom/google/firebase/remoteconfig/internal/j;->a(Lc/b/a/a/c/h;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/remoteconfig/internal/k;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "FirebaseRemoteConfig"

    const-string p2, "Reading from storage file failed."

    invoke-static {p1, p2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public synthetic h(Lcom/google/firebase/remoteconfig/internal/k;)Ljava/lang/Void;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/remoteconfig/internal/j;->g(Lcom/google/firebase/remoteconfig/internal/k;)Ljava/lang/Void;

    move-result-object p0

    return-object p0
.end method

.method public synthetic j(ZLcom/google/firebase/remoteconfig/internal/k;Ljava/lang/Void;)Lc/b/a/a/c/h;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/remoteconfig/internal/j;->i(ZLcom/google/firebase/remoteconfig/internal/k;Ljava/lang/Void;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public k(Lcom/google/firebase/remoteconfig/internal/k;)Lc/b/a/a/c/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/remoteconfig/internal/k;",
            ")",
            "Lc/b/a/a/c/h<",
            "Lcom/google/firebase/remoteconfig/internal/k;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/firebase/remoteconfig/internal/j;->l(Lcom/google/firebase/remoteconfig/internal/k;Z)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public l(Lcom/google/firebase/remoteconfig/internal/k;Z)Lc/b/a/a/c/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/remoteconfig/internal/k;",
            "Z)",
            "Lc/b/a/a/c/h<",
            "Lcom/google/firebase/remoteconfig/internal/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/j;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/google/firebase/remoteconfig/internal/a;

    invoke-direct {v1, p0, p1}, Lcom/google/firebase/remoteconfig/internal/a;-><init>(Lcom/google/firebase/remoteconfig/internal/j;Lcom/google/firebase/remoteconfig/internal/k;)V

    invoke-static {v0, v1}, Lc/b/a/a/c/k;->a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lc/b/a/a/c/h;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/j;->c:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lcom/google/firebase/remoteconfig/internal/b;

    invoke-direct {v2, p0, p2, p1}, Lcom/google/firebase/remoteconfig/internal/b;-><init>(Lcom/google/firebase/remoteconfig/internal/j;ZLcom/google/firebase/remoteconfig/internal/k;)V

    invoke-virtual {v0, v1, v2}, Lc/b/a/a/c/h;->o(Ljava/util/concurrent/Executor;Lc/b/a/a/c/g;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method
