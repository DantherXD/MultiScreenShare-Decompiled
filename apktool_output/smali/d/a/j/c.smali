.class public final Ld/a/j/c;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Ld/a/j/b;
    .locals 1

    sget-object v0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object v0
.end method

.method public static b(Ljava/util/concurrent/Future;)Ld/a/j/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;)",
            "Ld/a/j/b;"
        }
    .end annotation

    const-string v0, "future is null"

    invoke-static {p0, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Ld/a/j/c;->c(Ljava/util/concurrent/Future;Z)Ld/a/j/b;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/util/concurrent/Future;Z)Ld/a/j/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;Z)",
            "Ld/a/j/b;"
        }
    .end annotation

    const-string v0, "future is null"

    invoke-static {p0, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ld/a/j/d;

    invoke-direct {v0, p0, p1}, Ld/a/j/d;-><init>(Ljava/util/concurrent/Future;Z)V

    return-object v0
.end method

.method public static d(Ljava/lang/Runnable;)Ld/a/j/b;
    .locals 1

    const-string v0, "run is null"

    invoke-static {p0, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Ld/a/j/f;

    invoke-direct {v0, p0}, Ld/a/j/f;-><init>(Ljava/lang/Runnable;)V

    return-object v0
.end method
