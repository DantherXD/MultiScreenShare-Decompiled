.class public abstract Ld/a/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ld/a/f<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()I
    .locals 1

    invoke-static {}, Ld/a/b;->a()I

    move-result v0

    return v0
.end method

.method public static c(Ld/a/e;)Ld/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ld/a/e<",
            "TT;>;)",
            "Ld/a/c<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source is null"

    invoke-static {p0, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ld/a/m/e/a/b;

    invoke-direct {v0, p0}, Ld/a/m/e/a/b;-><init>(Ld/a/e;)V

    invoke-static {v0}, Ld/a/n/a;->j(Ld/a/c;)Ld/a/c;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ld/a/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/g<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, p1}, Ld/a/n/a;->n(Ld/a/c;Ld/a/g;)Ld/a/g;

    move-result-object p1

    const-string v0, "Plugin returned null Observer"

    invoke-static {p1, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ld/a/c;->h(Ld/a/g;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0}, Ld/a/k/b;->b(Ljava/lang/Throwable;)V

    invoke-static {p0}, Ld/a/n/a;->k(Ljava/lang/Throwable;)V

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Actually not, but can\'t throw other exceptions due to RS"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/NullPointerException;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p1

    :catch_0
    move-exception p0

    throw p0
.end method

.method public final d(Ld/a/h;)Ld/a/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/h;",
            ")",
            "Ld/a/c<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Ld/a/c;->b()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Ld/a/c;->e(Ld/a/h;ZI)Ld/a/c;

    move-result-object p0

    return-object p0
.end method

.method public final e(Ld/a/h;ZI)Ld/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/h;",
            "ZI)",
            "Ld/a/c<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p3, v0}, Ld/a/m/b/b;->d(ILjava/lang/String;)I

    new-instance v0, Ld/a/m/e/a/c;

    invoke-direct {v0, p0, p1, p2, p3}, Ld/a/m/e/a/c;-><init>(Ld/a/f;Ld/a/h;ZI)V

    invoke-static {v0}, Ld/a/n/a;->j(Ld/a/c;)Ld/a/c;

    move-result-object p0

    return-object p0
.end method

.method public final f(Ld/a/l/d;)Ld/a/j/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/l/d<",
            "-TT;>;)",
            "Ld/a/j/b;"
        }
    .end annotation

    sget-object v0, Ld/a/m/b/a;->f:Ld/a/l/d;

    sget-object v1, Ld/a/m/b/a;->c:Ld/a/l/a;

    invoke-static {}, Ld/a/m/b/a;->a()Ld/a/l/d;

    move-result-object v2

    invoke-virtual {p0, p1, v0, v1, v2}, Ld/a/c;->g(Ld/a/l/d;Ld/a/l/d;Ld/a/l/a;Ld/a/l/d;)Ld/a/j/b;

    move-result-object p0

    return-object p0
.end method

.method public final g(Ld/a/l/d;Ld/a/l/d;Ld/a/l/a;Ld/a/l/d;)Ld/a/j/b;
    .locals 1
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
            ">;)",
            "Ld/a/j/b;"
        }
    .end annotation

    const-string v0, "onNext is null"

    invoke-static {p1, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onSubscribe is null"

    invoke-static {p4, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ld/a/m/d/b;

    invoke-direct {v0, p1, p2, p3, p4}, Ld/a/m/d/b;-><init>(Ld/a/l/d;Ld/a/l/d;Ld/a/l/a;Ld/a/l/d;)V

    invoke-virtual {p0, v0}, Ld/a/c;->a(Ld/a/g;)V

    return-object v0
.end method

.method protected abstract h(Ld/a/g;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/g<",
            "-TT;>;)V"
        }
    .end annotation
.end method

.method public final i(Ld/a/h;)Ld/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld/a/h;",
            ")",
            "Ld/a/c<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ld/a/m/e/a/d;

    invoke-direct {v0, p0, p1}, Ld/a/m/e/a/d;-><init>(Ld/a/f;Ld/a/h;)V

    invoke-static {v0}, Ld/a/n/a;->j(Ld/a/c;)Ld/a/c;

    move-result-object p0

    return-object p0
.end method
