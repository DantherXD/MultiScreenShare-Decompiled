.class final Lc/b/a/a/c/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/c/b;
.implements Lc/b/a/a/c/d;
.implements Lc/b/a/a/c/e;
.implements Lc/b/a/a/c/a0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lc/b/a/a/c/b;",
        "Lc/b/a/a/c/d;",
        "Lc/b/a/a/c/e<",
        "TTContinuationResult;>;",
        "Lc/b/a/a/c/a0<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lc/b/a/a/c/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/c/g<",
            "TTResult;TTContinuationResult;>;"
        }
    .end annotation
.end field

.field private final c:Lc/b/a/a/c/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/c/d0<",
            "TTContinuationResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/g;Lc/b/a/a/c/d0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/c/g<",
            "TTResult;TTContinuationResult;>;",
            "Lc/b/a/a/c/d0<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/b/a/a/c/y;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lc/b/a/a/c/y;->b:Lc/b/a/a/c/g;

    iput-object p3, p0, Lc/b/a/a/c/y;->c:Lc/b/a/a/c/d0;

    return-void
.end method

.method static synthetic e(Lc/b/a/a/c/y;)Lc/b/a/a/c/g;
    .locals 0

    iget-object p0, p0, Lc/b/a/a/c/y;->b:Lc/b/a/a/c/g;

    return-object p0
.end method


# virtual methods
.method public final a(Lc/b/a/a/c/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/c/h<",
            "TTResult;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/c/y;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lc/b/a/a/c/z;

    invoke-direct {v1, p0, p1}, Lc/b/a/a/c/z;-><init>(Lc/b/a/a/c/y;Lc/b/a/a/c/h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final b()V
    .locals 0

    iget-object p0, p0, Lc/b/a/a/c/y;->c:Lc/b/a/a/c/d0;

    invoke-virtual {p0}, Lc/b/a/a/c/d0;->r()Z

    return-void
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 0

    iget-object p0, p0, Lc/b/a/a/c/y;->c:Lc/b/a/a/c/d0;

    invoke-virtual {p0, p1}, Lc/b/a/a/c/d0;->p(Ljava/lang/Exception;)V

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    iget-object p0, p0, Lc/b/a/a/c/y;->c:Lc/b/a/a/c/d0;

    invoke-virtual {p0, p1}, Lc/b/a/a/c/d0;->q(Ljava/lang/Object;)V

    return-void
.end method
