.class Ld/a/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/a/h;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ld/a/j/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/Runnable;

.field final synthetic c:Ld/a/h$b;

.field final synthetic d:Ld/a/h;


# direct methods
.method constructor <init>(Ld/a/h;Ljava/lang/Runnable;Ld/a/h$b;)V
    .locals 0

    iput-object p1, p0, Ld/a/h$a;->d:Ld/a/h;

    iput-object p2, p0, Ld/a/h$a;->b:Ljava/lang/Runnable;

    iput-object p3, p0, Ld/a/h$a;->c:Ld/a/h$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Ld/a/h$a;->b:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p0, p0, Ld/a/h$a;->c:Ld/a/h$b;

    invoke-interface {p0}, Ld/a/j/b;->c()V

    return-void

    :catchall_0
    move-exception v0

    iget-object p0, p0, Ld/a/h$a;->c:Ld/a/h$b;

    invoke-interface {p0}, Ld/a/j/b;->c()V

    throw v0
.end method
