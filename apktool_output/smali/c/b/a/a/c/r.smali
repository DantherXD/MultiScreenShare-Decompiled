.class final Lc/b/a/a/c/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lc/b/a/a/c/p;


# direct methods
.method constructor <init>(Lc/b/a/a/c/p;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/c/r;->b:Lc/b/a/a/c/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/c/r;->b:Lc/b/a/a/c/p;

    invoke-static {v0}, Lc/b/a/a/c/p;->b(Lc/b/a/a/c/p;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/b/a/a/c/r;->b:Lc/b/a/a/c/p;

    invoke-static {v1}, Lc/b/a/a/c/p;->c(Lc/b/a/a/c/p;)Lc/b/a/a/c/b;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object p0, p0, Lc/b/a/a/c/r;->b:Lc/b/a/a/c/p;

    invoke-static {p0}, Lc/b/a/a/c/p;->c(Lc/b/a/a/c/p;)Lc/b/a/a/c/b;

    move-result-object p0

    invoke-interface {p0}, Lc/b/a/a/c/b;->b()V

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
