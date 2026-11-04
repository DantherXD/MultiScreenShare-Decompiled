.class final Lc/b/a/a/c/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lc/b/a/a/c/h;

.field private final synthetic c:Lc/b/a/a/c/u;


# direct methods
.method constructor <init>(Lc/b/a/a/c/u;Lc/b/a/a/c/h;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/c/v;->c:Lc/b/a/a/c/u;

    iput-object p2, p0, Lc/b/a/a/c/v;->b:Lc/b/a/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/c/v;->c:Lc/b/a/a/c/u;

    invoke-static {v0}, Lc/b/a/a/c/u;->b(Lc/b/a/a/c/u;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/b/a/a/c/v;->c:Lc/b/a/a/c/u;

    invoke-static {v1}, Lc/b/a/a/c/u;->c(Lc/b/a/a/c/u;)Lc/b/a/a/c/d;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc/b/a/a/c/v;->c:Lc/b/a/a/c/u;

    invoke-static {v1}, Lc/b/a/a/c/u;->c(Lc/b/a/a/c/u;)Lc/b/a/a/c/d;

    move-result-object v1

    iget-object p0, p0, Lc/b/a/a/c/v;->b:Lc/b/a/a/c/h;

    invoke-virtual {p0}, Lc/b/a/a/c/h;->i()Ljava/lang/Exception;

    move-result-object p0

    invoke-interface {v1, p0}, Lc/b/a/a/c/d;->c(Ljava/lang/Exception;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
