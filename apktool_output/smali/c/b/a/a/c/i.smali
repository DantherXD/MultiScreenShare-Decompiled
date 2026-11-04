.class public Lc/b/a/a/c/i;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lc/b/a/a/c/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/c/d0<",
            "TTResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc/b/a/a/c/d0;

    invoke-direct {v0}, Lc/b/a/a/c/d0;-><init>()V

    iput-object v0, p0, Lc/b/a/a/c/i;->a:Lc/b/a/a/c/d0;

    return-void
.end method


# virtual methods
.method public a()Lc/b/a/a/c/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/b/a/a/c/h<",
            "TTResult;>;"
        }
    .end annotation

    iget-object p0, p0, Lc/b/a/a/c/i;->a:Lc/b/a/a/c/d0;

    return-object p0
.end method

.method public b(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object p0, p0, Lc/b/a/a/c/i;->a:Lc/b/a/a/c/d0;

    invoke-virtual {p0, p1}, Lc/b/a/a/c/d0;->q(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Exception;)Z
    .locals 0

    iget-object p0, p0, Lc/b/a/a/c/i;->a:Lc/b/a/a/c/d0;

    invoke-virtual {p0, p1}, Lc/b/a/a/c/d0;->t(Ljava/lang/Exception;)Z

    move-result p0

    return p0
.end method

.method public d(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object p0, p0, Lc/b/a/a/c/i;->a:Lc/b/a/a/c/d0;

    invoke-virtual {p0, p1}, Lc/b/a/a/c/d0;->u(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
