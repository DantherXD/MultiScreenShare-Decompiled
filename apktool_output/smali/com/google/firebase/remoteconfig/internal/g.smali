.class public final synthetic Lcom/google/firebase/remoteconfig/internal/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/android/gms/common/util/c;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/google/firebase/remoteconfig/internal/k;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/common/util/c;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/g;->b:Lcom/google/android/gms/common/util/c;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/g;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/internal/g;->d:Lcom/google/firebase/remoteconfig/internal/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/g;->b:Lcom/google/android/gms/common/util/c;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/g;->c:Ljava/lang/String;

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/internal/g;->d:Lcom/google/firebase/remoteconfig/internal/k;

    invoke-static {v0, v1, p0}, Lcom/google/firebase/remoteconfig/internal/m;->f(Lcom/google/android/gms/common/util/c;Ljava/lang/String;Lcom/google/firebase/remoteconfig/internal/k;)V

    return-void
.end method
