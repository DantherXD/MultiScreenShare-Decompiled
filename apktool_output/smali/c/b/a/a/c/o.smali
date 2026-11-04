.class final Lc/b/a/a/c/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lc/b/a/a/c/h;

.field private final synthetic c:Lc/b/a/a/c/m;


# direct methods
.method constructor <init>(Lc/b/a/a/c/m;Lc/b/a/a/c/h;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/c/o;->c:Lc/b/a/a/c/m;

    iput-object p2, p0, Lc/b/a/a/c/o;->b:Lc/b/a/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/c/o;->b:Lc/b/a/a/c/h;

    invoke-virtual {v0}, Lc/b/a/a/c/h;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p0, p0, Lc/b/a/a/c/o;->c:Lc/b/a/a/c/m;

    invoke-static {p0}, Lc/b/a/a/c/m;->b(Lc/b/a/a/c/m;)Lc/b/a/a/c/d0;

    move-result-object p0

    invoke-virtual {p0}, Lc/b/a/a/c/d0;->r()Z

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lc/b/a/a/c/o;->c:Lc/b/a/a/c/m;

    invoke-static {v0}, Lc/b/a/a/c/m;->c(Lc/b/a/a/c/m;)Lc/b/a/a/c/a;

    move-result-object v0

    iget-object v1, p0, Lc/b/a/a/c/o;->b:Lc/b/a/a/c/h;

    invoke-interface {v0, v1}, Lc/b/a/a/c/a;->a(Lc/b/a/a/c/h;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Lc/b/a/a/c/f; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p0, p0, Lc/b/a/a/c/o;->c:Lc/b/a/a/c/m;

    invoke-static {p0}, Lc/b/a/a/c/m;->b(Lc/b/a/a/c/m;)Lc/b/a/a/c/d0;

    move-result-object p0

    invoke-virtual {p0, v0}, Lc/b/a/a/c/d0;->q(Ljava/lang/Object;)V

    return-void

    :catch_0
    move-exception v0

    iget-object p0, p0, Lc/b/a/a/c/o;->c:Lc/b/a/a/c/m;

    invoke-static {p0}, Lc/b/a/a/c/m;->b(Lc/b/a/a/c/m;)Lc/b/a/a/c/d0;

    move-result-object p0

    invoke-virtual {p0, v0}, Lc/b/a/a/c/d0;->p(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Ljava/lang/Exception;

    iget-object p0, p0, Lc/b/a/a/c/o;->c:Lc/b/a/a/c/m;

    invoke-static {p0}, Lc/b/a/a/c/m;->b(Lc/b/a/a/c/m;)Lc/b/a/a/c/d0;

    move-result-object p0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/lang/Exception;

    invoke-virtual {p0, v0}, Lc/b/a/a/c/d0;->p(Ljava/lang/Exception;)V

    return-void

    :cond_1
    invoke-virtual {p0, v0}, Lc/b/a/a/c/d0;->p(Ljava/lang/Exception;)V

    return-void
.end method
