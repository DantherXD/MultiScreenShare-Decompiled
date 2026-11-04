.class public final Lc/b/a/a/c/f0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lc/b/a/a/c/g0;

.field private static b:Lc/b/a/a/c/g0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lc/b/a/a/c/e0;->a:Lc/b/a/a/c/g0;

    sput-object v0, Lc/b/a/a/c/f0;->a:Lc/b/a/a/c/g0;

    sput-object v0, Lc/b/a/a/c/f0;->b:Lc/b/a/a/c/g0;

    return-void
.end method

.method public static a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lc/b/a/a/c/f0;->b:Lc/b/a/a/c/g0;

    invoke-interface {v0, p0}, Lc/b/a/a/c/g0;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    return-object p0
.end method

.method static final synthetic b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 0

    return-object p0
.end method
