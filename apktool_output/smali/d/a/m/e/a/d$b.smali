.class final Ld/a/m/e/a/d$b;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source ""

# interfaces
.implements Ld/a/g;
.implements Ld/a/j/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/e/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

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
.field final b:Ld/a/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/g<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final c:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ld/a/j/b;",
            ">;"
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

    iput-object p1, p0, Ld/a/m/e/a/d$b;->b:Ld/a/g;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Ld/a/m/e/a/d$b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object p0, p0, Ld/a/m/e/a/d$b;->b:Ld/a/g;

    invoke-interface {p0, p1}, Ld/a/g;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b()V
    .locals 0

    iget-object p0, p0, Ld/a/m/e/a/d$b;->b:Ld/a/g;

    invoke-interface {p0}, Ld/a/g;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Ld/a/m/e/a/d$b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0}, Ld/a/m/a/b;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    invoke-static {p0}, Ld/a/m/a/b;->a(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public d(Ljava/lang/Throwable;)V
    .locals 0

    iget-object p0, p0, Ld/a/m/e/a/d$b;->b:Ld/a/g;

    invoke-interface {p0, p1}, Ld/a/g;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public e(Ld/a/j/b;)V
    .locals 0

    iget-object p0, p0, Ld/a/m/e/a/d$b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p0, p1}, Ld/a/m/a/b;->e(Ljava/util/concurrent/atomic/AtomicReference;Ld/a/j/b;)Z

    return-void
.end method

.method f(Ld/a/j/b;)V
    .locals 0

    invoke-static {p0, p1}, Ld/a/m/a/b;->e(Ljava/util/concurrent/atomic/AtomicReference;Ld/a/j/b;)Z

    return-void
.end method
