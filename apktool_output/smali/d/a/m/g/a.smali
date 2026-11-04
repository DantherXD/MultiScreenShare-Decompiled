.class public final Ld/a/m/g/a;
.super Ld/a/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/m/g/a$c;,
        Ld/a/m/g/a$a;,
        Ld/a/m/g/a$b;
    }
.end annotation


# static fields
.field static final b:Ld/a/m/g/a$b;

.field static final c:Ld/a/m/g/e;

.field static final d:I

.field static final e:Ld/a/m/g/a$c;


# instance fields
.field final f:Ljava/util/concurrent/ThreadFactory;

.field final g:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ld/a/m/g/a$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0

    const-string v1, "rx2.computation-threads"

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Ld/a/m/g/a;->d(II)I

    move-result v0

    sput v0, Ld/a/m/g/a;->d:I

    new-instance v0, Ld/a/m/g/a$c;

    new-instance v1, Ld/a/m/g/e;

    const-string v3, "RxComputationShutdown"

    invoke-direct {v1, v3}, Ld/a/m/g/e;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ld/a/m/g/a$c;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    sput-object v0, Ld/a/m/g/a;->e:Ld/a/m/g/a$c;

    invoke-virtual {v0}, Ld/a/m/g/d;->c()V

    const-string v0, "rx2.computation-priority"

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

    new-instance v3, Ld/a/m/g/e;

    const-string v4, "RxComputationThreadPool"

    invoke-direct {v3, v4, v0, v1}, Ld/a/m/g/e;-><init>(Ljava/lang/String;IZ)V

    sput-object v3, Ld/a/m/g/a;->c:Ld/a/m/g/e;

    new-instance v0, Ld/a/m/g/a$b;

    invoke-direct {v0, v2, v3}, Ld/a/m/g/a$b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    sput-object v0, Ld/a/m/g/a;->b:Ld/a/m/g/a$b;

    invoke-virtual {v0}, Ld/a/m/g/a$b;->b()V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Ld/a/m/g/a;->c:Ld/a/m/g/e;

    invoke-direct {p0, v0}, Ld/a/m/g/a;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 1

    invoke-direct {p0}, Ld/a/h;-><init>()V

    iput-object p1, p0, Ld/a/m/g/a;->f:Ljava/util/concurrent/ThreadFactory;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Ld/a/m/g/a;->b:Ld/a/m/g/a$b;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ld/a/m/g/a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ld/a/m/g/a;->e()V

    return-void
.end method

.method static d(II)I
    .locals 0

    if-lez p1, :cond_1

    if-le p1, p0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    :cond_1
    :goto_0
    return p0
.end method


# virtual methods
.method public a()Ld/a/h$b;
    .locals 1

    new-instance v0, Ld/a/m/g/a$a;

    iget-object p0, p0, Ld/a/m/g/a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/m/g/a$b;

    invoke-virtual {p0}, Ld/a/m/g/a$b;->a()Ld/a/m/g/a$c;

    move-result-object p0

    invoke-direct {v0, p0}, Ld/a/m/g/a$a;-><init>(Ld/a/m/g/a$c;)V

    return-object v0
.end method

.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;
    .locals 0

    iget-object p0, p0, Ld/a/m/g/a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/m/g/a$b;

    invoke-virtual {p0}, Ld/a/m/g/a$b;->a()Ld/a/m/g/a$c;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3, p4}, Ld/a/m/g/d;->f(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;

    move-result-object p0

    return-object p0
.end method

.method public e()V
    .locals 3

    new-instance v0, Ld/a/m/g/a$b;

    sget v1, Ld/a/m/g/a;->d:I

    iget-object v2, p0, Ld/a/m/g/a;->f:Ljava/util/concurrent/ThreadFactory;

    invoke-direct {v0, v1, v2}, Ld/a/m/g/a$b;-><init>(ILjava/util/concurrent/ThreadFactory;)V

    iget-object p0, p0, Ld/a/m/g/a;->g:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v1, Ld/a/m/g/a;->b:Ld/a/m/g/a$b;

    invoke-virtual {p0, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {v0}, Ld/a/m/g/a$b;->b()V

    :cond_0
    return-void
.end method
