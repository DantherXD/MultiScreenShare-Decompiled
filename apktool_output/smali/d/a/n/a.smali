.class public final Ld/a/n/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field static volatile a:Ld/a/l/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field static volatile b:Ld/a/l/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/e<",
            "-",
            "Ljava/lang/Runnable;",
            "+",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field static volatile c:Ld/a/l/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/e<",
            "-",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;+",
            "Ld/a/h;",
            ">;"
        }
    .end annotation
.end field

.field static volatile d:Ld/a/l/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/e<",
            "-",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;+",
            "Ld/a/h;",
            ">;"
        }
    .end annotation
.end field

.field static volatile e:Ld/a/l/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/e<",
            "-",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;+",
            "Ld/a/h;",
            ">;"
        }
    .end annotation
.end field

.field static volatile f:Ld/a/l/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/e<",
            "-",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;+",
            "Ld/a/h;",
            ">;"
        }
    .end annotation
.end field

.field static volatile g:Ld/a/l/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/e<",
            "-",
            "Ld/a/h;",
            "+",
            "Ld/a/h;",
            ">;"
        }
    .end annotation
.end field

.field static volatile h:Ld/a/l/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/e<",
            "-",
            "Ld/a/c;",
            "+",
            "Ld/a/c;",
            ">;"
        }
    .end annotation
.end field

.field static volatile i:Ld/a/l/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/b<",
            "-",
            "Ld/a/c;",
            "-",
            "Ld/a/g;",
            "+",
            "Ld/a/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static a(Ld/a/l/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ld/a/l/b<",
            "TT;TU;TR;>;TT;TU;)TR;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0, p1, p2}, Ld/a/l/b;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld/a/m/h/a;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method static b(Ld/a/l/e;Ljava/lang/Object;)Ljava/lang/Object;
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

    invoke-static {p0}, Ld/a/m/h/a;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method static c(Ld/a/l/e;Ljava/util/concurrent/Callable;)Ld/a/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/l/e<",
            "-",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;+",
            "Ld/a/h;",
            ">;",
            "Ljava/util/concurrent/Callable<",
            "Ld/a/h;",
            ">;)",
            "Ld/a/h;"
        }
    .end annotation

    invoke-static {p0, p1}, Ld/a/n/a;->b(Ld/a/l/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Scheduler Callable result can\'t be null"

    invoke-static {p0, p1}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/h;

    return-object p0
.end method

.method static d(Ljava/util/concurrent/Callable;)Ld/a/h;
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

    const-string v0, "Scheduler Callable result can\'t be null"

    invoke-static {p0, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld/a/m/h/a;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static e(Ljava/util/concurrent/Callable;)Ld/a/h;
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

    const-string v0, "Scheduler Callable can\'t be null"

    invoke-static {p0, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, Ld/a/n/a;->c:Ld/a/l/e;

    if-nez v0, :cond_0

    invoke-static {p0}, Ld/a/n/a;->d(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Ld/a/n/a;->c(Ld/a/l/e;Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/util/concurrent/Callable;)Ld/a/h;
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

    const-string v0, "Scheduler Callable can\'t be null"

    invoke-static {p0, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, Ld/a/n/a;->e:Ld/a/l/e;

    if-nez v0, :cond_0

    invoke-static {p0}, Ld/a/n/a;->d(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Ld/a/n/a;->c(Ld/a/l/e;Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/util/concurrent/Callable;)Ld/a/h;
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

    const-string v0, "Scheduler Callable can\'t be null"

    invoke-static {p0, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, Ld/a/n/a;->f:Ld/a/l/e;

    if-nez v0, :cond_0

    invoke-static {p0}, Ld/a/n/a;->d(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Ld/a/n/a;->c(Ld/a/l/e;Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/util/concurrent/Callable;)Ld/a/h;
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

    const-string v0, "Scheduler Callable can\'t be null"

    invoke-static {p0, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    sget-object v0, Ld/a/n/a;->d:Ld/a/l/e;

    if-nez v0, :cond_0

    invoke-static {p0}, Ld/a/n/a;->d(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Ld/a/n/a;->c(Ld/a/l/e;Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object p0

    return-object p0
.end method

.method static i(Ljava/lang/Throwable;)Z
    .locals 2

    instance-of v0, p0, Ld/a/k/c;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p0, Ljava/lang/IllegalStateException;

    if-eqz v0, :cond_1

    return v1

    :cond_1
    instance-of v0, p0, Ljava/lang/NullPointerException;

    if-eqz v0, :cond_2

    return v1

    :cond_2
    instance-of v0, p0, Ljava/lang/IllegalArgumentException;

    if-eqz v0, :cond_3

    return v1

    :cond_3
    instance-of p0, p0, Ld/a/k/a;

    if-eqz p0, :cond_4

    return v1

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static j(Ld/a/c;)Ld/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ld/a/c<",
            "TT;>;)",
            "Ld/a/c<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Ld/a/n/a;->h:Ld/a/l/e;

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, Ld/a/n/a;->b(Ld/a/l/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/c;

    :cond_0
    return-object p0
.end method

.method public static k(Ljava/lang/Throwable;)V
    .locals 2

    sget-object v0, Ld/a/n/a;->a:Ld/a/l/d;

    if-nez p0, :cond_0

    new-instance p0, Ljava/lang/NullPointerException;

    const-string v1, "onError called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-direct {p0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ld/a/n/a;->i(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v1, Ld/a/k/e;

    invoke-direct {v1, p0}, Ld/a/k/e;-><init>(Ljava/lang/Throwable;)V

    move-object p0, v1

    :cond_1
    :goto_0
    if-eqz v0, :cond_2

    :try_start_0
    invoke-interface {v0, p0}, Ld/a/l/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {v0}, Ld/a/n/a;->o(Ljava/lang/Throwable;)V

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    invoke-static {p0}, Ld/a/n/a;->o(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static l(Ld/a/h;)Ld/a/h;
    .locals 1

    sget-object v0, Ld/a/n/a;->g:Ld/a/l/e;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Ld/a/n/a;->b(Ld/a/l/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/h;

    return-object p0
.end method

.method public static m(Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 1

    sget-object v0, Ld/a/n/a;->b:Ld/a/l/e;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Ld/a/n/a;->b(Ld/a/l/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Runnable;

    return-object p0
.end method

.method public static n(Ld/a/c;Ld/a/g;)Ld/a/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ld/a/c<",
            "TT;>;",
            "Ld/a/g<",
            "-TT;>;)",
            "Ld/a/g<",
            "-TT;>;"
        }
    .end annotation

    sget-object v0, Ld/a/n/a;->i:Ld/a/l/b;

    if-eqz v0, :cond_0

    invoke-static {v0, p0, p1}, Ld/a/n/a;->a(Ld/a/l/b;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/g;

    return-object p0

    :cond_0
    return-object p1
.end method

.method static o(Ljava/lang/Throwable;)V
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v1

    invoke-interface {v1, v0, p0}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    return-void
.end method
