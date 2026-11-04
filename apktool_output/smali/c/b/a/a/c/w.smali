.class final Lc/b/a/a/c/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lc/b/a/a/c/h;

.field private final synthetic c:Lc/b/a/a/c/x;


# direct methods
.method constructor <init>(Lc/b/a/a/c/x;Lc/b/a/a/c/h;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/c/w;->c:Lc/b/a/a/c/x;

    iput-object p2, p0, Lc/b/a/a/c/w;->b:Lc/b/a/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/c/w;->c:Lc/b/a/a/c/x;

    invoke-static {v0}, Lc/b/a/a/c/x;->b(Lc/b/a/a/c/x;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/b/a/a/c/w;->c:Lc/b/a/a/c/x;

    invoke-static {v1}, Lc/b/a/a/c/x;->c(Lc/b/a/a/c/x;)Lc/b/a/a/c/e;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc/b/a/a/c/w;->c:Lc/b/a/a/c/x;

    invoke-static {v1}, Lc/b/a/a/c/x;->c(Lc/b/a/a/c/x;)Lc/b/a/a/c/e;

    move-result-object v1

    iget-object p0, p0, Lc/b/a/a/c/w;->b:Lc/b/a/a/c/h;

    invoke-virtual {p0}, Lc/b/a/a/c/h;->j()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {v1, p0}, Lc/b/a/a/c/e;->d(Ljava/lang/Object;)V

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
