.class final Lc/b/a/a/c/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lc/b/a/a/c/h;

.field private final synthetic c:Lc/b/a/a/c/y;


# direct methods
.method constructor <init>(Lc/b/a/a/c/y;Lc/b/a/a/c/h;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/c/z;->c:Lc/b/a/a/c/y;

    iput-object p2, p0, Lc/b/a/a/c/z;->b:Lc/b/a/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lc/b/a/a/c/z;->c:Lc/b/a/a/c/y;

    invoke-static {v0}, Lc/b/a/a/c/y;->e(Lc/b/a/a/c/y;)Lc/b/a/a/c/g;

    move-result-object v0

    iget-object v1, p0, Lc/b/a/a/c/z;->b:Lc/b/a/a/c/h;

    invoke-virtual {v1}, Lc/b/a/a/c/h;->j()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lc/b/a/a/c/g;->a(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object v0
    :try_end_0
    .catch Lc/b/a/a/c/f; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    iget-object p0, p0, Lc/b/a/a/c/z;->c:Lc/b/a/a/c/y;

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Continuation returned null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lc/b/a/a/c/y;->c(Ljava/lang/Exception;)V

    return-void

    :cond_0
    sget-object v1, Lc/b/a/a/c/j;->b:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lc/b/a/a/c/z;->c:Lc/b/a/a/c/y;

    invoke-virtual {v0, v1, v2}, Lc/b/a/a/c/h;->e(Ljava/util/concurrent/Executor;Lc/b/a/a/c/e;)Lc/b/a/a/c/h;

    iget-object v2, p0, Lc/b/a/a/c/z;->c:Lc/b/a/a/c/y;

    invoke-virtual {v0, v1, v2}, Lc/b/a/a/c/h;->d(Ljava/util/concurrent/Executor;Lc/b/a/a/c/d;)Lc/b/a/a/c/h;

    iget-object p0, p0, Lc/b/a/a/c/z;->c:Lc/b/a/a/c/y;

    invoke-virtual {v0, v1, p0}, Lc/b/a/a/c/h;->a(Ljava/util/concurrent/Executor;Lc/b/a/a/c/b;)Lc/b/a/a/c/h;

    return-void

    :catch_0
    move-exception v0

    iget-object p0, p0, Lc/b/a/a/c/z;->c:Lc/b/a/a/c/y;

    invoke-virtual {p0, v0}, Lc/b/a/a/c/y;->c(Ljava/lang/Exception;)V

    return-void

    :catch_1
    iget-object p0, p0, Lc/b/a/a/c/z;->c:Lc/b/a/a/c/y;

    invoke-virtual {p0}, Lc/b/a/a/c/y;->b()V

    return-void

    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    iget-object p0, p0, Lc/b/a/a/c/z;->c:Lc/b/a/a/c/y;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {p0, v0}, Lc/b/a/a/c/y;->c(Ljava/lang/Exception;)V

    return-void

    :cond_1
    invoke-virtual {p0, v0}, Lc/b/a/a/c/y;->c(Ljava/lang/Exception;)V

    return-void
.end method
