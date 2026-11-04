.class final Lc/b/a/a/c/h0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lc/b/a/a/c/d0;

.field private final synthetic c:Ljava/util/concurrent/Callable;


# direct methods
.method constructor <init>(Lc/b/a/a/c/d0;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/c/h0;->b:Lc/b/a/a/c/d0;

    iput-object p2, p0, Lc/b/a/a/c/h0;->c:Ljava/util/concurrent/Callable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/a/c/h0;->b:Lc/b/a/a/c/d0;

    iget-object v1, p0, Lc/b/a/a/c/h0;->c:Ljava/util/concurrent/Callable;

    invoke-interface {v1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/b/a/a/c/d0;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object p0, p0, Lc/b/a/a/c/h0;->b:Lc/b/a/a/c/d0;

    invoke-virtual {p0, v0}, Lc/b/a/a/c/d0;->p(Ljava/lang/Exception;)V

    return-void
.end method
