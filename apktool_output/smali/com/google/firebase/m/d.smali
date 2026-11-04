.class public Lcom/google/firebase/m/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/m/f;


# static fields
.field private static final a:Ljava/util/concurrent/ThreadFactory;


# instance fields
.field private b:Lcom/google/firebase/n/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/firebase/n/b<",
            "Lcom/google/firebase/m/g;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/firebase/m/e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/firebase/m/a;->b:Lcom/google/firebase/m/a;

    sput-object v0, Lcom/google/firebase/m/d;->a:Ljava/util/concurrent/ThreadFactory;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/util/Set;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Set<",
            "Lcom/google/firebase/m/e;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/google/firebase/components/y;

    new-instance v1, Lcom/google/firebase/m/b;

    invoke-direct {v1, p1}, Lcom/google/firebase/m/b;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/google/firebase/components/y;-><init>(Lcom/google/firebase/n/b;)V

    new-instance p1, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    sget-object v9, Lcom/google/firebase/m/d;->a:Ljava/util/concurrent/ThreadFactory;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0x1e

    move-object v2, p1

    invoke-direct/range {v2 .. v9}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    invoke-direct {p0, v0, p2, p1}, Lcom/google/firebase/m/d;-><init>(Lcom/google/firebase/n/b;Ljava/util/Set;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method constructor <init>(Lcom/google/firebase/n/b;Ljava/util/Set;Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/n/b<",
            "Lcom/google/firebase/m/g;",
            ">;",
            "Ljava/util/Set<",
            "Lcom/google/firebase/m/e;",
            ">;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/m/d;->b:Lcom/google/firebase/n/b;

    iput-object p2, p0, Lcom/google/firebase/m/d;->c:Ljava/util/Set;

    iput-object p3, p0, Lcom/google/firebase/m/d;->d:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static b()Lcom/google/firebase/components/m;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/firebase/components/m<",
            "Lcom/google/firebase/m/f;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/google/firebase/m/f;

    invoke-static {v0}, Lcom/google/firebase/components/m;->a(Ljava/lang/Class;)Lcom/google/firebase/components/m$b;

    move-result-object v0

    const-class v1, Landroid/content/Context;

    invoke-static {v1}, Lcom/google/firebase/components/t;->h(Ljava/lang/Class;)Lcom/google/firebase/components/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/components/m$b;->b(Lcom/google/firebase/components/t;)Lcom/google/firebase/components/m$b;

    move-result-object v0

    const-class v1, Lcom/google/firebase/m/e;

    invoke-static {v1}, Lcom/google/firebase/components/t;->i(Ljava/lang/Class;)Lcom/google/firebase/components/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/components/m$b;->b(Lcom/google/firebase/components/t;)Lcom/google/firebase/components/m$b;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/m/c;->a:Lcom/google/firebase/m/c;

    invoke-virtual {v0, v1}, Lcom/google/firebase/components/m$b;->e(Lcom/google/firebase/components/p;)Lcom/google/firebase/components/m$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/components/m$b;->c()Lcom/google/firebase/components/m;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/google/firebase/components/n;)Lcom/google/firebase/m/f;
    .locals 3

    new-instance v0, Lcom/google/firebase/m/d;

    const-class v1, Landroid/content/Context;

    invoke-interface {p0, v1}, Lcom/google/firebase/components/n;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v2, Lcom/google/firebase/m/e;

    invoke-interface {p0, v2}, Lcom/google/firebase/components/n;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/google/firebase/m/d;-><init>(Landroid/content/Context;Ljava/util/Set;)V

    return-object v0
.end method

.method static synthetic d(Landroid/content/Context;)Lcom/google/firebase/m/g;
    .locals 0

    invoke-static {p0}, Lcom/google/firebase/m/g;->a(Landroid/content/Context;)Lcom/google/firebase/m/g;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Ljava/lang/Runnable;)Ljava/lang/Thread;
    .locals 2

    new-instance v0, Ljava/lang/Thread;

    const-string v1, "heartbeat-information-executor"

    invoke-direct {v0, p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/google/firebase/m/f$a;
    .locals 3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/google/firebase/m/d;->b:Lcom/google/firebase/n/b;

    invoke-interface {v2}, Lcom/google/firebase/n/b;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/firebase/m/g;

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/firebase/m/g;->d(Ljava/lang/String;J)Z

    move-result p1

    iget-object p0, p0, Lcom/google/firebase/m/d;->b:Lcom/google/firebase/n/b;

    invoke-interface {p0}, Lcom/google/firebase/n/b;->a()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/m/g;

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/m/g;->c(J)Z

    move-result p0

    if-eqz p1, :cond_0

    if-eqz p0, :cond_0

    sget-object p0, Lcom/google/firebase/m/f$a;->e:Lcom/google/firebase/m/f$a;

    return-object p0

    :cond_0
    if-eqz p0, :cond_1

    sget-object p0, Lcom/google/firebase/m/f$a;->d:Lcom/google/firebase/m/f$a;

    return-object p0

    :cond_1
    if-eqz p1, :cond_2

    sget-object p0, Lcom/google/firebase/m/f$a;->c:Lcom/google/firebase/m/f$a;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/firebase/m/f$a;->b:Lcom/google/firebase/m/f$a;

    return-object p0
.end method
