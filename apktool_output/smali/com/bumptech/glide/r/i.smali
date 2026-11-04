.class public Lcom/bumptech/glide/r/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/bumptech/glide/r/d;
.implements Lcom/bumptech/glide/r/c;


# instance fields
.field private final a:Lcom/bumptech/glide/r/d;

.field private final b:Ljava/lang/Object;

.field private volatile c:Lcom/bumptech/glide/r/c;

.field private volatile d:Lcom/bumptech/glide/r/c;

.field private e:Lcom/bumptech/glide/r/d$a;

.field private f:Lcom/bumptech/glide/r/d$a;

.field private g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/bumptech/glide/r/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/bumptech/glide/r/d$a;->d:Lcom/bumptech/glide/r/d$a;

    iput-object v0, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    iput-object v0, p0, Lcom/bumptech/glide/r/i;->f:Lcom/bumptech/glide/r/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/bumptech/glide/r/i;->a:Lcom/bumptech/glide/r/d;

    return-void
.end method

.method private m()Z
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->a:Lcom/bumptech/glide/r/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/bumptech/glide/r/d;->l(Lcom/bumptech/glide/r/c;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private n()Z
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->a:Lcom/bumptech/glide/r/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/bumptech/glide/r/d;->k(Lcom/bumptech/glide/r/c;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private o()Z
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->a:Lcom/bumptech/glide/r/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Lcom/bumptech/glide/r/d;->a(Lcom/bumptech/glide/r/c;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/r/c;)Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/r/i;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p0, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    sget-object p1, Lcom/bumptech/glide/r/d$a;->e:Lcom/bumptech/glide/r/d$a;

    if-eq p0, p1, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    invoke-interface {v1}, Lcom/bumptech/glide/r/c;->b()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p0, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    invoke-interface {p0}, Lcom/bumptech/glide/r/c;->b()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public c()Lcom/bumptech/glide/r/d;
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/r/i;->a:Lcom/bumptech/glide/r/d;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/bumptech/glide/r/d;->c()Lcom/bumptech/glide/r/d;

    move-result-object p0

    :cond_0
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public clear()V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Lcom/bumptech/glide/r/i;->g:Z

    sget-object v1, Lcom/bumptech/glide/r/d$a;->d:Lcom/bumptech/glide/r/d$a;

    iput-object v1, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    iput-object v1, p0, Lcom/bumptech/glide/r/i;->f:Lcom/bumptech/glide/r/d$a;

    iget-object v1, p0, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    invoke-interface {v1}, Lcom/bumptech/glide/r/c;->clear()V

    iget-object p0, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    invoke-interface {p0}, Lcom/bumptech/glide/r/c;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public d(Lcom/bumptech/glide/r/c;)V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Lcom/bumptech/glide/r/d$a;->f:Lcom/bumptech/glide/r/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/r/i;->f:Lcom/bumptech/glide/r/d$a;

    monitor-exit v0

    return-void

    :cond_0
    sget-object p1, Lcom/bumptech/glide/r/d$a;->f:Lcom/bumptech/glide/r/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    iget-object p1, p0, Lcom/bumptech/glide/r/i;->a:Lcom/bumptech/glide/r/d;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lcom/bumptech/glide/r/d;->d(Lcom/bumptech/glide/r/c;)V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/r/i;->f:Lcom/bumptech/glide/r/d$a;

    invoke-virtual {v1}, Lcom/bumptech/glide/r/d$a;->a()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lcom/bumptech/glide/r/d$a;->c:Lcom/bumptech/glide/r/d$a;

    iput-object v1, p0, Lcom/bumptech/glide/r/i;->f:Lcom/bumptech/glide/r/d$a;

    iget-object v1, p0, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    invoke-interface {v1}, Lcom/bumptech/glide/r/c;->e()V

    :cond_0
    iget-object v1, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    invoke-virtual {v1}, Lcom/bumptech/glide/r/d$a;->a()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/bumptech/glide/r/d$a;->c:Lcom/bumptech/glide/r/d$a;

    iput-object v1, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    iget-object p0, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    invoke-interface {p0}, Lcom/bumptech/glide/r/c;->e()V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public f()V
    .locals 4

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/bumptech/glide/r/i;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    sget-object v3, Lcom/bumptech/glide/r/d$a;->e:Lcom/bumptech/glide/r/d$a;

    if-eq v2, v3, :cond_0

    iget-object v2, p0, Lcom/bumptech/glide/r/i;->f:Lcom/bumptech/glide/r/d$a;

    sget-object v3, Lcom/bumptech/glide/r/d$a;->b:Lcom/bumptech/glide/r/d$a;

    if-eq v2, v3, :cond_0

    iput-object v3, p0, Lcom/bumptech/glide/r/i;->f:Lcom/bumptech/glide/r/d$a;

    iget-object v2, p0, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    invoke-interface {v2}, Lcom/bumptech/glide/r/c;->f()V

    :cond_0
    iget-boolean v2, p0, Lcom/bumptech/glide/r/i;->g:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    sget-object v3, Lcom/bumptech/glide/r/d$a;->b:Lcom/bumptech/glide/r/d$a;

    if-eq v2, v3, :cond_1

    iput-object v3, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    iget-object v2, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    invoke-interface {v2}, Lcom/bumptech/glide/r/c;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    iput-boolean v1, p0, Lcom/bumptech/glide/r/i;->g:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    iput-boolean v1, p0, Lcom/bumptech/glide/r/i;->g:Z

    throw v2

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method

.method public g(Lcom/bumptech/glide/r/c;)V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/bumptech/glide/r/d$a;->e:Lcom/bumptech/glide/r/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/r/i;->f:Lcom/bumptech/glide/r/d$a;

    monitor-exit v0

    return-void

    :cond_0
    sget-object p1, Lcom/bumptech/glide/r/d$a;->e:Lcom/bumptech/glide/r/d$a;

    iput-object p1, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    iget-object p1, p0, Lcom/bumptech/glide/r/i;->a:Lcom/bumptech/glide/r/d;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Lcom/bumptech/glide/r/d;->g(Lcom/bumptech/glide/r/c;)V

    :cond_1
    iget-object p1, p0, Lcom/bumptech/glide/r/i;->f:Lcom/bumptech/glide/r/d$a;

    invoke-virtual {p1}, Lcom/bumptech/glide/r/d$a;->a()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p0, p0, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    invoke-interface {p0}, Lcom/bumptech/glide/r/c;->clear()V

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public h(Lcom/bumptech/glide/r/c;)Z
    .locals 3

    instance-of v0, p1, Lcom/bumptech/glide/r/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Lcom/bumptech/glide/r/i;

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    iget-object v2, p1, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    invoke-interface {v0, v2}, Lcom/bumptech/glide/r/c;->h(Lcom/bumptech/glide/r/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    iget-object v0, p0, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    if-nez v0, :cond_1

    iget-object p0, p1, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    if-nez p0, :cond_2

    goto :goto_1

    :cond_1
    iget-object p0, p0, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    iget-object p1, p1, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    invoke-interface {p0, p1}, Lcom/bumptech/glide/r/c;->h(Lcom/bumptech/glide/r/c;)Z

    move-result p0

    if-eqz p0, :cond_2

    :goto_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    sget-object v1, Lcom/bumptech/glide/r/d$a;->e:Lcom/bumptech/glide/r/d$a;

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public isRunning()Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    sget-object v1, Lcom/bumptech/glide/r/d$a;->b:Lcom/bumptech/glide/r/d$a;

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public j()Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    sget-object v1, Lcom/bumptech/glide/r/d$a;->d:Lcom/bumptech/glide/r/d$a;

    if-ne p0, v1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public k(Lcom/bumptech/glide/r/c;)Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/r/i;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/r/i;->b()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public l(Lcom/bumptech/glide/r/c;)Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/r/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/r/i;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lcom/bumptech/glide/r/i;->e:Lcom/bumptech/glide/r/d$a;

    sget-object p1, Lcom/bumptech/glide/r/d$a;->c:Lcom/bumptech/glide/r/d$a;

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public p(Lcom/bumptech/glide/r/c;Lcom/bumptech/glide/r/c;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/r/i;->c:Lcom/bumptech/glide/r/c;

    iput-object p2, p0, Lcom/bumptech/glide/r/i;->d:Lcom/bumptech/glide/r/c;

    return-void
.end method
