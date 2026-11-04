.class public final Lc/b/a/a/c/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/a/a/c/k$a;,
        Lc/b/a/a/c/k$b;
    }
.end annotation


# direct methods
.method public static a(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Callable;)Lc/b/a/a/c/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/util/concurrent/Callable<",
            "TTResult;>;)",
            "Lc/b/a/a/c/h<",
            "TTResult;>;"
        }
    .end annotation

    const-string v0, "Executor must not be null"

    invoke-static {p0, v0}, Lcom/google/android/gms/common/internal/b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Callback must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/b;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lc/b/a/a/c/d0;

    invoke-direct {v0}, Lc/b/a/a/c/d0;-><init>()V

    new-instance v1, Lc/b/a/a/c/h0;

    invoke-direct {v1, v0, p1}, Lc/b/a/a/c/h0;-><init>(Lc/b/a/a/c/d0;Ljava/util/concurrent/Callable;)V

    invoke-interface {p0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public static b(Ljava/lang/Exception;)Lc/b/a/a/c/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Lc/b/a/a/c/h<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lc/b/a/a/c/d0;

    invoke-direct {v0}, Lc/b/a/a/c/d0;-><init>()V

    invoke-virtual {v0, p0}, Lc/b/a/a/c/d0;->p(Ljava/lang/Exception;)V

    return-object v0
.end method

.method public static c(Ljava/lang/Object;)Lc/b/a/a/c/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TResult:",
            "Ljava/lang/Object;",
            ">(TTResult;)",
            "Lc/b/a/a/c/h<",
            "TTResult;>;"
        }
    .end annotation

    new-instance v0, Lc/b/a/a/c/d0;

    invoke-direct {v0}, Lc/b/a/a/c/d0;-><init>()V

    invoke-virtual {v0, p0}, Lc/b/a/a/c/d0;->q(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static d(Ljava/util/Collection;)Lc/b/a/a/c/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lc/b/a/a/c/h<",
            "*>;>;)",
            "Lc/b/a/a/c/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/b/a/a/c/h;

    const-string v2, "null tasks are not accepted"

    invoke-static {v1, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v0, Lc/b/a/a/c/d0;

    invoke-direct {v0}, Lc/b/a/a/c/d0;-><init>()V

    new-instance v1, Lc/b/a/a/c/k$a;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2, v0}, Lc/b/a/a/c/k$a;-><init>(ILc/b/a/a/c/d0;)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/b/a/a/c/h;

    invoke-static {v2, v1}, Lc/b/a/a/c/k;->g(Lc/b/a/a/c/h;Lc/b/a/a/c/k$b;)V

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_2
    const/4 p0, 0x0

    invoke-static {p0}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/util/Collection;)Lc/b/a/a/c/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lc/b/a/a/c/h<",
            "*>;>;)",
            "Lc/b/a/a/c/h<",
            "Ljava/util/List<",
            "Lc/b/a/a/c/h<",
            "*>;>;>;"
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lc/b/a/a/c/k;->d(Ljava/util/Collection;)Lc/b/a/a/c/h;

    move-result-object v0

    new-instance v1, Lc/b/a/a/c/l;

    invoke-direct {v1, p0}, Lc/b/a/a/c/l;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/c/h;->g(Lc/b/a/a/c/a;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public static varargs f([Lc/b/a/a/c/h;)Lc/b/a/a/c/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lc/b/a/a/c/h<",
            "*>;)",
            "Lc/b/a/a/c/h<",
            "Ljava/util/List<",
            "Lc/b/a/a/c/h<",
            "*>;>;>;"
        }
    .end annotation

    if-eqz p0, :cond_1

    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lc/b/a/a/c/k;->e(Ljava/util/Collection;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method private static g(Lc/b/a/a/c/h;Lc/b/a/a/c/k$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/c/h<",
            "*>;",
            "Lc/b/a/a/c/k$b;",
            ")V"
        }
    .end annotation

    sget-object v0, Lc/b/a/a/c/j;->b:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/c/h;->e(Ljava/util/concurrent/Executor;Lc/b/a/a/c/e;)Lc/b/a/a/c/h;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/c/h;->d(Ljava/util/concurrent/Executor;Lc/b/a/a/c/d;)Lc/b/a/a/c/h;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/c/h;->a(Ljava/util/concurrent/Executor;Lc/b/a/a/c/b;)Lc/b/a/a/c/h;

    return-void
.end method
