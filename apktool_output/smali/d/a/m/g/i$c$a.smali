.class Ld/a/m/g/i$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/a/m/g/i$c;->e(Ljava/lang/Runnable;J)Ld/a/j/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ld/a/m/g/i$b;

.field final synthetic c:Ld/a/m/g/i$c;


# direct methods
.method constructor <init>(Ld/a/m/g/i$c;Ld/a/m/g/i$b;)V
    .locals 0

    iput-object p1, p0, Ld/a/m/g/i$c$a;->c:Ld/a/m/g/i$c;

    iput-object p2, p0, Ld/a/m/g/i$c$a;->b:Ld/a/m/g/i$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld/a/m/g/i$c$a;->b:Ld/a/m/g/i$b;

    const/4 v1, 0x1

    iput-boolean v1, v0, Ld/a/m/g/i$b;->e:Z

    iget-object v0, p0, Ld/a/m/g/i$c$a;->c:Ld/a/m/g/i$c;

    iget-object v0, v0, Ld/a/m/g/i$c;->b:Ljava/util/concurrent/PriorityBlockingQueue;

    iget-object p0, p0, Ld/a/m/g/i$c$a;->b:Ld/a/m/g/i$b;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/PriorityBlockingQueue;->remove(Ljava/lang/Object;)Z

    return-void
.end method
