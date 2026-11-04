.class final Ld/a/m/g/i$c;
.super Ld/a/h$b;
.source ""

# interfaces
.implements Ld/a/j/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/g/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field final b:Ljava/util/concurrent/PriorityBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/PriorityBlockingQueue<",
            "Ld/a/m/g/i$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field final d:Ljava/util/concurrent/atomic/AtomicInteger;

.field volatile e:Z


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ld/a/h$b;-><init>()V

    new-instance v0, Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-direct {v0}, Ljava/util/concurrent/PriorityBlockingQueue;-><init>()V

    iput-object v0, p0, Ld/a/m/g/i$c;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ld/a/m/g/i$c;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ld/a/m/g/i$c;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)Ld/a/j/b;
    .locals 2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0}, Ld/a/h$b;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, Ld/a/m/g/i$c;->e(Ljava/lang/Runnable;J)Ld/a/j/b;

    move-result-object p0

    return-object p0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld/a/m/g/i$c;->e:Z

    return-void
.end method

.method public d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;
    .locals 2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v0}, Ld/a/h$b;->a(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    invoke-virtual {p4, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide p2

    add-long/2addr v0, p2

    new-instance p2, Ld/a/m/g/i$a;

    invoke-direct {p2, p1, p0, v0, v1}, Ld/a/m/g/i$a;-><init>(Ljava/lang/Runnable;Ld/a/m/g/i$c;J)V

    invoke-virtual {p0, p2, v0, v1}, Ld/a/m/g/i$c;->e(Ljava/lang/Runnable;J)Ld/a/j/b;

    move-result-object p0

    return-object p0
.end method

.method e(Ljava/lang/Runnable;J)Ld/a/j/b;
    .locals 1

    iget-boolean v0, p0, Ld/a/m/g/i$c;->e:Z

    if-eqz v0, :cond_0

    sget-object p0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object p0

    :cond_0
    new-instance v0, Ld/a/m/g/i$b;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    iget-object p3, p0, Ld/a/m/g/i$c;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p3

    invoke-direct {v0, p1, p2, p3}, Ld/a/m/g/i$b;-><init>(Ljava/lang/Runnable;Ljava/lang/Long;I)V

    iget-object p1, p0, Ld/a/m/g/i$c;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/PriorityBlockingQueue;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Ld/a/m/g/i$c;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x1

    :cond_1
    :goto_0
    iget-object p2, p0, Ld/a/m/g/i$c;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    invoke-virtual {p2}, Ljava/util/concurrent/PriorityBlockingQueue;->poll()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld/a/m/g/i$b;

    if-nez p2, :cond_2

    iget-object p2, p0, Ld/a/m/g/i$c;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    neg-int p1, p1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result p1

    if-nez p1, :cond_1

    sget-object p0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object p0

    :cond_2
    iget-boolean p3, p2, Ld/a/m/g/i$b;->e:Z

    if-nez p3, :cond_1

    iget-object p2, p2, Ld/a/m/g/i$b;->b:Ljava/lang/Runnable;

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_3
    new-instance p1, Ld/a/m/g/i$c$a;

    invoke-direct {p1, p0, v0}, Ld/a/m/g/i$c$a;-><init>(Ld/a/m/g/i$c;Ld/a/m/g/i$b;)V

    invoke-static {p1}, Ld/a/j/c;->d(Ljava/lang/Runnable;)Ld/a/j/b;

    move-result-object p0

    return-object p0
.end method
