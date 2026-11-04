.class public final Ld/a/i/a/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile a:Ld/a/l/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/e<",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;",
            "Ld/a/h;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile b:Ld/a/l/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/e<",
            "Ld/a/h;",
            "Ld/a/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static a(Ld/a/l/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ld/a/l/e<",
            "TT;TR;>;TT;)TR;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0, p1}, Ld/a/l/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld/a/k/b;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method static b(Ld/a/l/e;Ljava/util/concurrent/Callable;)Ld/a/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/l/e<",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;",
            "Ld/a/h;",
            ">;",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;)",
            "Ld/a/h;"
        }
    .end annotation

    invoke-static {p0, p1}, Ld/a/i/a/a;->a(Ld/a/l/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/h;

    const-string p1, "Scheduler Callable returned null"

    invoke-static {p0, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-object p0
.end method

.method static c(Ljava/util/concurrent/Callable;)Ld/a/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;)",
            "Ld/a/h;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/h;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Scheduler Callable returned null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld/a/k/b;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static d(Ljava/util/concurrent/Callable;)Ld/a/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;)",
            "Ld/a/h;"
        }
    .end annotation

    const-string v0, "scheduler == null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, Ld/a/i/a/a;->a:Ld/a/l/e;

    if-nez v0, :cond_0

    invoke-static {p0}, Ld/a/i/a/a;->c(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Ld/a/i/a/a;->b(Ld/a/l/e;Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ld/a/h;)Ld/a/h;
    .locals 1

    const-string v0, "scheduler == null"

    invoke-static {p0, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, Ld/a/i/a/a;->b:Ld/a/l/e;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Ld/a/i/a/a;->a(Ld/a/l/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/h;

    return-object p0
.end method
