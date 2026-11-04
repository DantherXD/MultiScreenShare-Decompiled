.class final Ld/a/m/g/a$a;
.super Ld/a/h$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/g/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final b:Ld/a/m/a/d;

.field private final c:Ld/a/j/a;

.field private final d:Ld/a/m/a/d;

.field private final e:Ld/a/m/g/a$c;

.field volatile f:Z


# direct methods
.method constructor <init>(Ld/a/m/g/a$c;)V
    .locals 2

    invoke-direct {p0}, Ld/a/h$b;-><init>()V

    iput-object p1, p0, Ld/a/m/g/a$a;->e:Ld/a/m/g/a$c;

    new-instance p1, Ld/a/m/a/d;

    invoke-direct {p1}, Ld/a/m/a/d;-><init>()V

    iput-object p1, p0, Ld/a/m/g/a$a;->b:Ld/a/m/a/d;

    new-instance v0, Ld/a/j/a;

    invoke-direct {v0}, Ld/a/j/a;-><init>()V

    iput-object v0, p0, Ld/a/m/g/a$a;->c:Ld/a/j/a;

    new-instance v1, Ld/a/m/a/d;

    invoke-direct {v1}, Ld/a/m/a/d;-><init>()V

    iput-object v1, p0, Ld/a/m/g/a$a;->d:Ld/a/m/a/d;

    invoke-virtual {v1, p1}, Ld/a/m/a/d;->d(Ld/a/j/b;)Z

    invoke-virtual {v1, v0}, Ld/a/m/a/d;->d(Ld/a/j/b;)Z

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)Ld/a/j/b;
    .locals 6

    iget-boolean v0, p0, Ld/a/m/g/a$a;->f:Z

    if-eqz v0, :cond_0

    sget-object p0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object p0

    :cond_0
    iget-object v0, p0, Ld/a/m/g/a$a;->e:Ld/a/m/g/a$c;

    const-wide/16 v2, 0x0

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v5, p0, Ld/a/m/g/a$a;->b:Ld/a/m/a/d;

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Ld/a/m/g/d;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ld/a/m/a/a;)Ld/a/m/g/f;

    move-result-object p0

    return-object p0
.end method

.method public c()V
    .locals 1

    iget-boolean v0, p0, Ld/a/m/g/a$a;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld/a/m/g/a$a;->f:Z

    iget-object p0, p0, Ld/a/m/g/a$a;->d:Ld/a/m/a/d;

    invoke-virtual {p0}, Ld/a/m/a/d;->c()V

    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;
    .locals 6

    iget-boolean v0, p0, Ld/a/m/g/a$a;->f:Z

    if-eqz v0, :cond_0

    sget-object p0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    return-object p0

    :cond_0
    iget-object v0, p0, Ld/a/m/g/a$a;->e:Ld/a/m/g/a$c;

    iget-object v5, p0, Ld/a/m/g/a$a;->c:Ld/a/j/a;

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Ld/a/m/g/d;->e(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ld/a/m/a/a;)Ld/a/m/g/f;

    move-result-object p0

    return-object p0
.end method
