.class final Ld/a/m/e/a/c$a;
.super Ld/a/m/d/a;
.source ""

# interfaces
.implements Ld/a/g;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/e/a/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ld/a/m/d/a<",
        "TT;>;",
        "Ld/a/g<",
        "TT;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field final b:Ld/a/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/g<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final c:Ld/a/h$b;

.field final d:Z

.field final e:I

.field f:Ld/a/m/c/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/m/c/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field g:Ld/a/j/b;

.field h:Ljava/lang/Throwable;

.field volatile i:Z

.field volatile j:Z

.field k:I

.field l:Z


# direct methods
.method constructor <init>(Ld/a/g;Ld/a/h$b;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/g<",
            "-TT;>;",
            "Ld/a/h$b;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0}, Ld/a/m/d/a;-><init>()V

    iput-object p1, p0, Ld/a/m/e/a/c$a;->b:Ld/a/g;

    iput-object p2, p0, Ld/a/m/e/a/c$a;->c:Ld/a/h$b;

    iput-boolean p3, p0, Ld/a/m/e/a/c$a;->d:Z

    iput p4, p0, Ld/a/m/e/a/c$a;->e:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Ld/a/m/e/a/c$a;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Ld/a/m/e/a/c$a;->k:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    invoke-interface {v0, p1}, Ld/a/m/c/c;->offer(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, Ld/a/m/e/a/c$a;->j()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-boolean v0, p0, Ld/a/m/e/a/c$a;->i:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ld/a/m/e/a/c$a;->i:Z

    invoke-virtual {p0}, Ld/a/m/e/a/c$a;->j()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-boolean v0, p0, Ld/a/m/e/a/c$a;->j:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld/a/m/e/a/c$a;->j:Z

    iget-object v0, p0, Ld/a/m/e/a/c$a;->g:Ld/a/j/b;

    invoke-interface {v0}, Ld/a/j/b;->c()V

    iget-object v0, p0, Ld/a/m/e/a/c$a;->c:Ld/a/h$b;

    invoke-interface {v0}, Ld/a/j/b;->c()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    invoke-interface {p0}, Ld/a/m/c/c;->clear()V

    :cond_0
    return-void
.end method

.method public clear()V
    .locals 0

    iget-object p0, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    invoke-interface {p0}, Ld/a/m/c/c;->clear()V

    return-void
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Ld/a/m/e/a/c$a;->i:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ld/a/n/a;->k(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Ld/a/m/e/a/c$a;->h:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Ld/a/m/e/a/c$a;->i:Z

    invoke-virtual {p0}, Ld/a/m/e/a/c$a;->j()V

    return-void
.end method

.method public e(Ld/a/j/b;)V
    .locals 2

    iget-object v0, p0, Ld/a/m/e/a/c$a;->g:Ld/a/j/b;

    invoke-static {v0, p1}, Ld/a/m/a/b;->f(Ld/a/j/b;Ld/a/j/b;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Ld/a/m/e/a/c$a;->g:Ld/a/j/b;

    instance-of v0, p1, Ld/a/m/c/a;

    if-eqz v0, :cond_1

    check-cast p1, Ld/a/m/c/a;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, Ld/a/m/c/b;->f(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iput v0, p0, Ld/a/m/e/a/c$a;->k:I

    iput-object p1, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    iput-boolean v1, p0, Ld/a/m/e/a/c$a;->i:Z

    iget-object p1, p0, Ld/a/m/e/a/c$a;->b:Ld/a/g;

    invoke-interface {p1, p0}, Ld/a/g;->e(Ld/a/j/b;)V

    invoke-virtual {p0}, Ld/a/m/e/a/c$a;->j()V

    return-void

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iput v0, p0, Ld/a/m/e/a/c$a;->k:I

    iput-object p1, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    iget-object p1, p0, Ld/a/m/e/a/c$a;->b:Ld/a/g;

    invoke-interface {p1, p0}, Ld/a/g;->e(Ld/a/j/b;)V

    return-void

    :cond_1
    new-instance p1, Ld/a/m/f/a;

    iget v0, p0, Ld/a/m/e/a/c$a;->e:I

    invoke-direct {p1, v0}, Ld/a/m/f/a;-><init>(I)V

    iput-object p1, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    iget-object p1, p0, Ld/a/m/e/a/c$a;->b:Ld/a/g;

    invoke-interface {p1, p0}, Ld/a/g;->e(Ld/a/j/b;)V

    :cond_2
    return-void
.end method

.method public f(I)I
    .locals 1

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ld/a/m/e/a/c$a;->l:Z

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method g(ZZLd/a/g;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ld/a/g<",
            "-TT;>;)Z"
        }
    .end annotation

    iget-boolean v0, p0, Ld/a/m/e/a/c$a;->j:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p0, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    invoke-interface {p0}, Ld/a/m/c/c;->clear()V

    return v1

    :cond_0
    if-eqz p1, :cond_4

    iget-object p1, p0, Ld/a/m/e/a/c$a;->h:Ljava/lang/Throwable;

    iget-boolean v0, p0, Ld/a/m/e/a/c$a;->d:Z

    if-eqz v0, :cond_2

    if-eqz p2, :cond_4

    if-eqz p1, :cond_1

    invoke-interface {p3, p1}, Ld/a/g;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Ld/a/g;->b()V

    :goto_0
    iget-object p0, p0, Ld/a/m/e/a/c$a;->c:Ld/a/h$b;

    invoke-interface {p0}, Ld/a/j/b;->c()V

    return v1

    :cond_2
    if-eqz p1, :cond_3

    iget-object p2, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    invoke-interface {p2}, Ld/a/m/c/c;->clear()V

    invoke-interface {p3, p1}, Ld/a/g;->d(Ljava/lang/Throwable;)V

    iget-object p0, p0, Ld/a/m/e/a/c$a;->c:Ld/a/h$b;

    invoke-interface {p0}, Ld/a/j/b;->c()V

    return v1

    :cond_3
    if-eqz p2, :cond_4

    invoke-interface {p3}, Ld/a/g;->b()V

    iget-object p0, p0, Ld/a/m/e/a/c$a;->c:Ld/a/h$b;

    invoke-interface {p0}, Ld/a/j/b;->c()V

    return v1

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method h()V
    .locals 4

    const/4 v0, 0x1

    :cond_0
    iget-boolean v1, p0, Ld/a/m/e/a/c$a;->j:Z

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-boolean v1, p0, Ld/a/m/e/a/c$a;->i:Z

    iget-object v2, p0, Ld/a/m/e/a/c$a;->h:Ljava/lang/Throwable;

    iget-boolean v3, p0, Ld/a/m/e/a/c$a;->d:Z

    if-nez v3, :cond_2

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    iget-object v0, p0, Ld/a/m/e/a/c$a;->b:Ld/a/g;

    invoke-interface {v0, v2}, Ld/a/g;->d(Ljava/lang/Throwable;)V

    :goto_0
    iget-object p0, p0, Ld/a/m/e/a/c$a;->c:Ld/a/h$b;

    invoke-interface {p0}, Ld/a/j/b;->c()V

    return-void

    :cond_2
    iget-object v2, p0, Ld/a/m/e/a/c$a;->b:Ld/a/g;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ld/a/g;->a(Ljava/lang/Object;)V

    if-eqz v1, :cond_4

    iget-object v0, p0, Ld/a/m/e/a/c$a;->h:Ljava/lang/Throwable;

    if-eqz v0, :cond_3

    iget-object v1, p0, Ld/a/m/e/a/c$a;->b:Ld/a/g;

    invoke-interface {v1, v0}, Ld/a/g;->d(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, Ld/a/m/e/a/c$a;->b:Ld/a/g;

    invoke-interface {v0}, Ld/a/g;->b()V

    goto :goto_0

    :cond_4
    neg-int v0, v0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method i()V
    .locals 7

    iget-object v0, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    iget-object v1, p0, Ld/a/m/e/a/c$a;->b:Ld/a/g;

    const/4 v2, 0x1

    move v3, v2

    :cond_0
    iget-boolean v4, p0, Ld/a/m/e/a/c$a;->i:Z

    invoke-interface {v0}, Ld/a/m/c/c;->isEmpty()Z

    move-result v5

    invoke-virtual {p0, v4, v5, v1}, Ld/a/m/e/a/c$a;->g(ZZLd/a/g;)Z

    move-result v4

    if-eqz v4, :cond_1

    return-void

    :cond_1
    :goto_0
    iget-boolean v4, p0, Ld/a/m/e/a/c$a;->i:Z

    :try_start_0
    invoke-interface {v0}, Ld/a/m/c/c;->poll()Ljava/lang/Object;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v5, :cond_2

    move v6, v2

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {p0, v4, v6, v1}, Ld/a/m/e/a/c$a;->g(ZZLd/a/g;)Z

    move-result v4

    if-eqz v4, :cond_3

    return-void

    :cond_3
    if-eqz v6, :cond_4

    neg-int v3, v3

    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v3

    if-nez v3, :cond_0

    return-void

    :cond_4
    invoke-interface {v1, v5}, Ld/a/g;->a(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception v2

    invoke-static {v2}, Ld/a/k/b;->b(Ljava/lang/Throwable;)V

    iget-object v3, p0, Ld/a/m/e/a/c$a;->g:Ld/a/j/b;

    invoke-interface {v3}, Ld/a/j/b;->c()V

    invoke-interface {v0}, Ld/a/m/c/c;->clear()V

    invoke-interface {v1, v2}, Ld/a/g;->d(Ljava/lang/Throwable;)V

    iget-object p0, p0, Ld/a/m/e/a/c$a;->c:Ld/a/h$b;

    invoke-interface {p0}, Ld/a/j/b;->c()V

    return-void
.end method

.method public isEmpty()Z
    .locals 0

    iget-object p0, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    invoke-interface {p0}, Ld/a/m/c/c;->isEmpty()Z

    move-result p0

    return p0
.end method

.method j()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ld/a/m/e/a/c$a;->c:Ld/a/h$b;

    invoke-virtual {v0, p0}, Ld/a/h$b;->b(Ljava/lang/Runnable;)Ld/a/j/b;

    :cond_0
    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object p0, p0, Ld/a/m/e/a/c$a;->f:Ld/a/m/c/c;

    invoke-interface {p0}, Ld/a/m/c/c;->poll()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public run()V
    .locals 1

    iget-boolean v0, p0, Ld/a/m/e/a/c$a;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ld/a/m/e/a/c$a;->h()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ld/a/m/e/a/c$a;->i()V

    :goto_0
    return-void
.end method
