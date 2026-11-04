.class final Lc/b/a/a/c/m;
.super Ljava/lang/Object;
.source ""

# interfaces
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
        "Lc/b/a/a/c/a0<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Lc/b/a/a/c/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/c/a<",
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
.method public constructor <init>(Ljava/util/concurrent/Executor;Lc/b/a/a/c/a;Lc/b/a/a/c/d0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/c/a<",
            "TTResult;TTContinuationResult;>;",
            "Lc/b/a/a/c/d0<",
            "TTContinuationResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/b/a/a/c/m;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lc/b/a/a/c/m;->b:Lc/b/a/a/c/a;

    iput-object p3, p0, Lc/b/a/a/c/m;->c:Lc/b/a/a/c/d0;

    return-void
.end method

.method static synthetic b(Lc/b/a/a/c/m;)Lc/b/a/a/c/d0;
    .locals 0

    iget-object p0, p0, Lc/b/a/a/c/m;->c:Lc/b/a/a/c/d0;

    return-object p0
.end method

.method static synthetic c(Lc/b/a/a/c/m;)Lc/b/a/a/c/a;
    .locals 0

    iget-object p0, p0, Lc/b/a/a/c/m;->b:Lc/b/a/a/c/a;

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

    iget-object v0, p0, Lc/b/a/a/c/m;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lc/b/a/a/c/o;

    invoke-direct {v1, p0, p1}, Lc/b/a/a/c/o;-><init>(Lc/b/a/a/c/m;Lc/b/a/a/c/h;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
