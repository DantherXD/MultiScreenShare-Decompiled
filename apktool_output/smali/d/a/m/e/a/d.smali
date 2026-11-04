.class public final Ld/a/m/e/a/d;
.super Ld/a/m/e/a/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/m/e/a/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ld/a/m/e/a/a<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final b:Ld/a/h;


# direct methods
.method public constructor <init>(Ld/a/f;Ld/a/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/f<",
            "TT;>;",
            "Ld/a/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ld/a/m/e/a/a;-><init>(Ld/a/f;)V

    iput-object p2, p0, Ld/a/m/e/a/d;->b:Ld/a/h;

    return-void
.end method


# virtual methods
.method public h(Ld/a/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/g<",
            "-TT;>;)V"
        }
    .end annotation

    new-instance v0, Ld/a/m/e/a/d$b;

    invoke-direct {v0, p1}, Ld/a/m/e/a/d$b;-><init>(Ld/a/g;)V

    invoke-interface {p1, v0}, Ld/a/g;->e(Ld/a/j/b;)V

    iget-object p1, p0, Ld/a/m/e/a/d;->b:Ld/a/h;

    new-instance v1, Ld/a/m/e/a/d$a;

    invoke-direct {v1, p0, v0}, Ld/a/m/e/a/d$a;-><init>(Ld/a/m/e/a/d;Ld/a/m/e/a/d$b;)V

    invoke-virtual {p1, v1}, Ld/a/h;->b(Ljava/lang/Runnable;)Ld/a/j/b;

    move-result-object p0

    invoke-virtual {v0, p0}, Ld/a/m/e/a/d$b;->f(Ld/a/j/b;)V

    return-void
.end method
