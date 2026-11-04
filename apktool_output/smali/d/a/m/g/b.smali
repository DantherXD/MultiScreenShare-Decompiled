.class public final Ld/a/m/g/b;
.super Ld/a/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/m/g/b$c;,
        Ld/a/m/g/b$b;,
        Ld/a/m/g/b$a;
    }
.end annotation


# static fields
.field static final b:Ld/a/m/g/e;

.field static final c:Ld/a/m/g/e;

.field private static final d:Ljava/util/concurrent/TimeUnit;

.field static final e:Ld/a/m/g/b$c;

.field static final f:Ld/a/m/g/b$a;


# instance fields
.field final g:Ljava/util/concurrent/ThreadFactory;

.field final h:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ld/a/m/g/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    sput-object v0, Ld/a/m/g/b;->d:Ljava/util/concurrent/TimeUnit;

    new-instance v0, Ld/a/m/g/b$c;

    new-instance v1, Ld/a/m/g/e;

    const-string v2, "RxCachedThreadSchedulerShutdown"

    invoke-direct {v1, v2}, Ld/a/m/g/e;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ld/a/m/g/b$c;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Ld/a/m/g/b;->e:Ld/a/m/g/b$c;

    invoke-virtual {v0}, Ld/a/m/g/d;->c()V

    const-string v0, "rx2.io-priority"

    const/4 v1, 0x5

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0xa

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    new-instance v1, Ld/a/m/g/e;

    const-string v2, "RxCachedThreadScheduler"

    invoke-direct {v1, v2, v0}, Ld/a/m/g/e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ld/a/m/g/b;->b:Ld/a/m/g/e;

    new-instance v2, Ld/a/m/g/e;

    const-string v3, "RxCachedWorkerPoolEvictor"

    invoke-direct {v2, v3, v0}, Ld/a/m/g/e;-><init>(Ljava/lang/String;I)V

    sput-object v2, Ld/a/m/g/b;->c:Ld/a/m/g/e;

    new-instance v0, Ld/a/m/g/b$a;

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v4, v1}, Ld/a/m/g/b$a;-><init>(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Ld/a/m/g/b;->f:Ld/a/m/g/b$a;

    invoke-virtual {v0}, Ld/a/m/g/b$a;->e()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Ld/a/m/g/b;->b:Ld/a/m/g/e;

    invoke-direct {p0, v0}, Ld/a/m/g/b;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 1

    invoke-direct {p0}, Ld/a/h;-><init>()V

    iput-object p1, p0, Ld/a/m/g/b;->g:Ljava/util/concurrent/ThreadFactory;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Ld/a/m/g/b;->f:Ld/a/m/g/b$a;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ld/a/m/g/b;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ld/a/m/g/b;->d()V

    return-void
.end method


# virtual methods
.method public a()Ld/a/h$b;
    .locals 1

    new-instance v0, Ld/a/m/g/b$b;

    iget-object p0, p0, Ld/a/m/g/b;->h:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/m/g/b$a;

    invoke-direct {v0, p0}, Ld/a/m/g/b$b;-><init>(Ld/a/m/g/b$a;)V

    return-object v0
.end method

.method public d()V
    .locals 5

    new-instance v0, Ld/a/m/g/b$a;

    sget-object v1, Ld/a/m/g/b;->d:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Ld/a/m/g/b;->g:Ljava/util/concurrent/ThreadFactory;

    const-wide/16 v3, 0x3c

    invoke-direct {v0, v3, v4, v1, v2}, Ld/a/m/g/b$a;-><init>(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ThreadFactory;)V

    iget-object p0, p0, Ld/a/m/g/b;->h:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ld/a/m/g/b;->f:Ld/a/m/g/b$a;

    invoke-virtual {p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Ld/a/m/g/b$a;->e()V

    :cond_0
    return-void
.end method
