.class public final Ld/a/m/e/a/b;
.super Ld/a/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/m/e/a/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ld/a/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final a:Ld/a/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld/a/e<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld/a/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/e<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ld/a/c;-><init>()V

    iput-object p1, p0, Ld/a/m/e/a/b;->a:Ld/a/e;

    return-void
.end method


# virtual methods
.method protected h(Ld/a/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/g<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Ld/a/m/e/a/b$a;

    invoke-direct {v0, p1}, Ld/a/m/e/a/b$a;-><init>(Ld/a/g;)V

    invoke-interface {p1, v0}, Ld/a/g;->e(Ld/a/j/b;)V

    :try_start_0
    iget-object p0, p0, Ld/a/m/e/a/b;->a:Ld/a/e;

    invoke-interface {p0, v0}, Ld/a/e;->a(Ld/a/d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld/a/k/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v0, p0}, Ld/a/m/e/a/b$a;->d(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
