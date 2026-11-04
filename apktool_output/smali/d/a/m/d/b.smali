.class public final Ld/a/m/d/b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source ""

# interfaces
.implements Ld/a/g;
.implements Ld/a/j/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Ld/a/j/b;",
        ">;",
        "Ld/a/g<",
        "TT;>;",
        "Ld/a/j/b;"
    }
.end annotation


# instance fields
.field final b:Ld/a/l/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/d<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final c:Ld/a/l/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field final d:Ld/a/l/a;

.field final e:Ld/a/l/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/l/d<",
            "-",
            "Ld/a/j/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld/a/l/d;Ld/a/l/d;Ld/a/l/a;Ld/a/l/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/l/d<",
            "-TT;>;",
            "Ld/a/l/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Ld/a/l/a;",
            "Ld/a/l/d<",
            "-",
            "Ld/a/j/b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ld/a/m/d/b;->b:Ld/a/l/d;

    iput-object p2, p0, Ld/a/m/d/b;->c:Ld/a/l/d;

    iput-object p3, p0, Ld/a/m/d/b;->d:Ld/a/l/a;

    iput-object p4, p0, Ld/a/m/d/b;->e:Ld/a/l/d;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ld/a/m/d/b;->f()Z

    move-result v0

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Ld/a/m/d/b;->b:Ld/a/l/d;

    invoke-interface {v0, p1}, Ld/a/l/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ld/a/k/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Ld/a/m/d/b;->d(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public b()V
    .locals 1

    invoke-virtual {p0}, Ld/a/m/d/b;->f()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ld/a/m/a/b;->b:Ld/a/m/a/b;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :try_start_0
    iget-object p0, p0, Ld/a/m/d/b;->d:Ld/a/l/a;

    invoke-interface {p0}, Ld/a/l/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld/a/k/b;->b(Ljava/lang/Throwable;)V

    invoke-static {p0}, Ld/a/n/a;->k(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public c()V
    .locals 0

    invoke-static {p0}, Ld/a/m/a/b;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 3

    invoke-virtual {p0}, Ld/a/m/d/b;->f()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Ld/a/m/a/b;->b:Ld/a/m/a/b;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    :try_start_0
    iget-object p0, p0, Ld/a/m/d/b;->c:Ld/a/l/d;

    invoke-interface {p0, p1}, Ld/a/l/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld/a/k/b;->b(Ljava/lang/Throwable;)V

    new-instance v0, Ld/a/k/a;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Throwable;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    aput-object p0, v1, p1

    invoke-direct {v0, v1}, Ld/a/k/a;-><init>([Ljava/lang/Throwable;)V

    invoke-static {v0}, Ld/a/n/a;->k(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public e(Ld/a/j/b;)V
    .locals 0

    invoke-static {p0, p1}, Ld/a/m/a/b;->e(Ljava/util/concurrent/atomic/AtomicReference;Ld/a/j/b;)Z

    move-result p1

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Ld/a/m/d/b;->e:Ld/a/l/d;

    invoke-interface {p1, p0}, Ld/a/l/d;->a(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Ld/a/k/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Ld/a/m/d/b;->d(Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method public f()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    sget-object v0, Ld/a/m/a/b;->b:Ld/a/m/a/b;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
