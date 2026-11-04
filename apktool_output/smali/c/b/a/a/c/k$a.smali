.class final Lc/b/a/a/c/k$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/c/k$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/a/c/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:I

.field private final c:Lc/b/a/a/c/d0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/c/d0<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private d:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private e:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private f:I
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private g:Ljava/lang/Exception;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private h:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILc/b/a/a/c/d0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc/b/a/a/c/d0<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc/b/a/a/c/k$a;->a:Ljava/lang/Object;

    iput p1, p0, Lc/b/a/a/c/k$a;->b:I

    iput-object p2, p0, Lc/b/a/a/c/k$a;->c:Lc/b/a/a/c/d0;

    return-void
.end method

.method private final a()V
    .locals 6
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget v0, p0, Lc/b/a/a/c/k$a;->d:I

    iget v1, p0, Lc/b/a/a/c/k$a;->e:I

    add-int/2addr v0, v1

    iget v1, p0, Lc/b/a/a/c/k$a;->f:I

    add-int/2addr v0, v1

    iget v1, p0, Lc/b/a/a/c/k$a;->b:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lc/b/a/a/c/k$a;->g:Ljava/lang/Exception;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/b/a/a/c/k$a;->c:Lc/b/a/a/c/d0;

    new-instance v1, Ljava/util/concurrent/ExecutionException;

    iget v2, p0, Lc/b/a/a/c/k$a;->e:I

    iget v3, p0, Lc/b/a/a/c/k$a;->b:I

    const/16 v4, 0x36

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " out of "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " underlying tasks failed"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object p0, p0, Lc/b/a/a/c/k$a;->g:Ljava/lang/Exception;

    invoke-direct {v1, v2, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/c/d0;->p(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lc/b/a/a/c/k$a;->h:Z

    iget-object p0, p0, Lc/b/a/a/c/k$a;->c:Lc/b/a/a/c/d0;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc/b/a/a/c/d0;->r()Z

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lc/b/a/a/c/d0;->q(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    iget-object v0, p0, Lc/b/a/a/c/k$a;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lc/b/a/a/c/k$a;->f:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, p0, Lc/b/a/a/c/k$a;->f:I

    iput-boolean v2, p0, Lc/b/a/a/c/k$a;->h:Z

    invoke-direct {p0}, Lc/b/a/a/c/k$a;->a()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/c/k$a;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lc/b/a/a/c/k$a;->e:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lc/b/a/a/c/k$a;->e:I

    iput-object p1, p0, Lc/b/a/a/c/k$a;->g:Ljava/lang/Exception;

    invoke-direct {p0}, Lc/b/a/a/c/k$a;->a()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lc/b/a/a/c/k$a;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, p0, Lc/b/a/a/c/k$a;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lc/b/a/a/c/k$a;->d:I

    invoke-direct {p0}, Lc/b/a/a/c/k$a;->a()V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
