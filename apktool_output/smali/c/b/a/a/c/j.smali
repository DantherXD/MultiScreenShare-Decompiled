.class public final Lc/b/a/a/c/j;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/a/a/c/j$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field static final b:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/b/a/a/c/j$a;

    invoke-direct {v0}, Lc/b/a/a/c/j$a;-><init>()V

    sput-object v0, Lc/b/a/a/c/j;->a:Ljava/util/concurrent/Executor;

    new-instance v0, Lc/b/a/a/c/c0;

    invoke-direct {v0}, Lc/b/a/a/c/c0;-><init>()V

    sput-object v0, Lc/b/a/a/c/j;->b:Ljava/util/concurrent/Executor;

    return-void
.end method
