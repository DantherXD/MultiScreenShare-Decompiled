.class public Lcom/google/firebase/p/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile a:Lcom/google/firebase/p/e;


# instance fields
.field private final b:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/google/firebase/p/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/google/firebase/p/e;->b:Ljava/util/Set;

    return-void
.end method

.method public static a()Lcom/google/firebase/p/e;
    .locals 2

    sget-object v0, Lcom/google/firebase/p/e;->a:Lcom/google/firebase/p/e;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/firebase/p/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/firebase/p/e;->a:Lcom/google/firebase/p/e;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/firebase/p/e;

    invoke-direct {v0}, Lcom/google/firebase/p/e;-><init>()V

    sput-object v0, Lcom/google/firebase/p/e;->a:Lcom/google/firebase/p/e;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method


# virtual methods
.method b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/firebase/p/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/p/e;->b:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object p0, p0, Lcom/google/firebase/p/e;->b:Ljava/util/Set;

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
