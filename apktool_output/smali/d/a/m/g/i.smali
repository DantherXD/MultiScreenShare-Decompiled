.class public final Ld/a/m/g/i;
.super Ld/a/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/m/g/i$a;,
        Ld/a/m/g/i$b;,
        Ld/a/m/g/i$c;
    }
.end annotation


# static fields
.field private static final b:Ld/a/m/g/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld/a/m/g/i;

    invoke-direct {v0}, Ld/a/m/g/i;-><init>()V

    sput-object v0, Ld/a/m/g/i;->b:Ld/a/m/g/i;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ld/a/h;-><init>()V

    return-void
.end method

.method public static d()Ld/a/m/g/i;
    .locals 1

    sget-object v0, Ld/a/m/g/i;->b:Ld/a/m/g/i;

    return-object v0
.end method


# virtual methods
.method public a()Ld/a/h$b;
    .locals 0

    new-instance p0, Ld/a/m/g/i$c;

    invoke-direct {p0}, Ld/a/m/g/i$c;-><init>()V

    return-object p0
.end method

.method public b(Ljava/lang/Runnable;)Ld/a/j/b;
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    sget-object p0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object p0
.end method

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;
    .locals 0

    :try_start_0
    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->sleep(J)V

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    invoke-static {p0}, Ld/a/n/a;->k(Ljava/lang/Throwable;)V

    :goto_0
    sget-object p0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object p0
.end method
