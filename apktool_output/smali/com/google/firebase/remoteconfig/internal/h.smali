.class public final synthetic Lcom/google/firebase/remoteconfig/internal/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lcom/google/firebase/remoteconfig/internal/o;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/h;->b:Lcom/google/firebase/remoteconfig/internal/o;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/internal/h;->b:Lcom/google/firebase/remoteconfig/internal/o;

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/o;->d()Lcom/google/firebase/remoteconfig/internal/k;

    move-result-object p0

    return-object p0
.end method
