.class public abstract Ld/a/h;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/h$b;
    }
.end annotation


# static fields
.field static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v1, "rx2.scheduler.drift-tolerance"

    const-wide/16 v2, 0xf

    invoke-static {v1, v2, v3}, Ljava/lang/Long;->getLong(Ljava/lang/String;J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ld/a/h;->a:J

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Ld/a/h$b;
.end method

.method public b(Ljava/lang/Runnable;)Ld/a/j/b;
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x0

    invoke-virtual {p0, p1, v1, v2, v0}, Ld/a/h;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;

    move-result-object p0

    return-object p0
.end method

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;
    .locals 2

    invoke-virtual {p0}, Ld/a/h;->a()Ld/a/h$b;

    move-result-object v0

    invoke-static {p1}, Ld/a/n/a;->m(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    new-instance v1, Ld/a/h$a;

    invoke-direct {v1, p0, p1, v0}, Ld/a/h$a;-><init>(Ld/a/h;Ljava/lang/Runnable;Ld/a/h$b;)V

    invoke-virtual {v0, v1, p2, p3, p4}, Ld/a/h$b;->d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;

    return-object v0
.end method
