.class public final Ld/a/i/b/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/i/b/a$b;
    }
.end annotation


# static fields
.field private static final a:Ld/a/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld/a/i/b/a$a;

    invoke-direct {v0}, Ld/a/i/b/a$a;-><init>()V

    invoke-static {v0}, Ld/a/i/a/a;->d(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object v0

    sput-object v0, Ld/a/i/b/a;->a:Ld/a/h;

    return-void
.end method

.method public static a()Ld/a/h;
    .locals 1

    sget-object v0, Ld/a/i/b/a;->a:Ld/a/h;

    invoke-static {v0}, Ld/a/i/a/a;->e(Ld/a/h;)Ld/a/h;

    move-result-object v0

    return-object v0
.end method
