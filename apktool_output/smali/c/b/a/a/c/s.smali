.class final Lc/b/a/a/c/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lc/b/a/a/c/h;

.field private final synthetic c:Lc/b/a/a/c/t;


# direct methods
.method constructor <init>(Lc/b/a/a/c/t;Lc/b/a/a/c/h;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/c/s;->c:Lc/b/a/a/c/t;

    iput-object p2, p0, Lc/b/a/a/c/s;->b:Lc/b/a/a/c/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/c/s;->c:Lc/b/a/a/c/t;

    invoke-static {v0}, Lc/b/a/a/c/t;->b(Lc/b/a/a/c/t;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/b/a/a/c/s;->c:Lc/b/a/a/c/t;

    invoke-static {v1}, Lc/b/a/a/c/t;->c(Lc/b/a/a/c/t;)Lc/b/a/a/c/c;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc/b/a/a/c/s;->c:Lc/b/a/a/c/t;

    invoke-static {v1}, Lc/b/a/a/c/t;->c(Lc/b/a/a/c/t;)Lc/b/a/a/c/c;

    move-result-object v1

    iget-object p0, p0, Lc/b/a/a/c/s;->b:Lc/b/a/a/c/h;

    invoke-interface {v1, p0}, Lc/b/a/a/c/c;->a(Lc/b/a/a/c/h;)V

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
