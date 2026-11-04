.class final Ld/a/m/g/b$b;
.super Ld/a/h$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/g/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final b:Ld/a/j/a;

.field private final c:Ld/a/m/g/b$a;

.field private final d:Ld/a/m/g/b$c;

.field final e:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method constructor <init>(Ld/a/m/g/b$a;)V
    .locals 1

    invoke-direct {p0}, Ld/a/h$b;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Ld/a/m/g/b$b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Ld/a/m/g/b$b;->c:Ld/a/m/g/b$a;

    new-instance v0, Ld/a/j/a;

    invoke-direct {v0}, Ld/a/j/a;-><init>()V

    iput-object v0, p0, Ld/a/m/g/b$b;->b:Ld/a/j/a;

    invoke-virtual {p1}, Ld/a/m/g/b$a;->b()Ld/a/m/g/b$c;

    move-result-object p1

    iput-object p1, p0, Ld/a/m/g/b$b;->d:Ld/a/m/g/b$c;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 3

    iget-object v0, p0, Ld/a/m/g/b$b;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld/a/m/g/b$b;->b:Ld/a/j/a;

    invoke-virtual {v0}, Ld/a/j/a;->c()V

    iget-object v0, p0, Ld/a/m/g/b$b;->c:Ld/a/m/g/b$a;

    iget-object p0, p0, Ld/a/m/g/b$b;->d:Ld/a/m/g/b$c;

    invoke-virtual {v0, p0}, Ld/a/m/g/b$a;->d(Ld/a/m/g/b$c;)V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;
    .locals 6

    iget-object v0, p0, Ld/a/m/g/b$b;->b:Ld/a/j/a;

    invoke-virtual {v0}, Ld/a/j/a;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object p0

    :cond_0
    iget-object v0, p0, Ld/a/m/g/b$b;->d:Ld/a/m/g/b$c;

    iget-object v5, p0, Ld/a/m/g/b$b;->b:Ld/a/j/a;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Ld/a/m/g/d;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ld/a/m/a/a;)Ld/a/m/g/f;

    move-result-object p0

    return-object p0
.end method
