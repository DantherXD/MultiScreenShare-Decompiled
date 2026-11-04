.class final Ld/a/m/e/a/b$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source ""

# interfaces
.implements Ld/a/d;
.implements Ld/a/j/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/e/a/b;
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
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Ld/a/j/b;",
        ">;",
        "Ld/a/d<",
        "TT;>;",
        "Ld/a/j/b;"
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


# direct methods
.method constructor <init>(Ld/a/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/g<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ld/a/m/e/a/b$a;->b:Ld/a/g;

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

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "onNext called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ld/a/m/e/a/b$a;->d(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Ld/a/m/e/a/b$a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p0, p0, Ld/a/m/e/a/b$a;->b:Ld/a/g;

    invoke-interface {p0, p1}, Ld/a/g;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public b()Z
    .locals 0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/j/b;

    invoke-static {p0}, Ld/a/m/a/b;->b(Ld/a/j/b;)Z

    move-result p0

    return p0
.end method

.method public c()V
    .locals 0

    invoke-static {p0}, Ld/a/m/a/b;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "onError called with null. Null values are generally not allowed in 2.x operators and sources."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0}, Ld/a/m/e/a/b$a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    :try_start_0
    iget-object v0, p0, Ld/a/m/e/a/b$a;->b:Ld/a/g;

    invoke-interface {v0, p1}, Ld/a/g;->d(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ld/a/m/e/a/b$a;->c()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Ld/a/m/e/a/b$a;->c()V

    throw p1

    :cond_1
    invoke-static {p1}, Ld/a/n/a;->k(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
