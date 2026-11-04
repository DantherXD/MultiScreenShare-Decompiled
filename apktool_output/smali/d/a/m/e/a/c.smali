.class public final Ld/a/m/e/a/c;
.super Ld/a/m/e/a/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/m/e/a/c$a;
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

.field final c:Z

.field final d:I


# direct methods
.method public constructor <init>(Ld/a/f;Ld/a/h;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/f<",
            "TT;>;",
            "Ld/a/h;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ld/a/m/e/a/a;-><init>(Ld/a/f;)V

    iput-object p2, p0, Ld/a/m/e/a/c;->b:Ld/a/h;

    iput-boolean p3, p0, Ld/a/m/e/a/c;->c:Z

    iput p4, p0, Ld/a/m/e/a/c;->d:I

    return-void
.end method


# virtual methods
.method protected h(Ld/a/g;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/g<",
            "-TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Ld/a/m/e/a/c;->b:Ld/a/h;

    instance-of v1, v0, Ld/a/m/g/i;

    if-eqz v1, :cond_0

    iget-object p0, p0, Ld/a/m/e/a/a;->a:Ld/a/f;

    invoke-interface {p0, p1}, Ld/a/f;->a(Ld/a/g;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ld/a/h;->a()Ld/a/h$b;

    move-result-object v0

    iget-object v1, p0, Ld/a/m/e/a/a;->a:Ld/a/f;

    new-instance v2, Ld/a/m/e/a/c$a;

    iget-boolean v3, p0, Ld/a/m/e/a/c;->c:Z

    iget p0, p0, Ld/a/m/e/a/c;->d:I

    invoke-direct {v2, p1, v0, v3, p0}, Ld/a/m/e/a/c$a;-><init>(Ld/a/g;Ld/a/h$b;ZI)V

    invoke-interface {v1, v2}, Ld/a/f;->a(Ld/a/g;)V

    :goto_0
    return-void
.end method
