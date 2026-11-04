.class public final synthetic Lcom/google/firebase/remoteconfig/internal/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/c/a;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/l;

.field public final synthetic b:Lc/b/a/a/c/h;

.field public final synthetic c:Lc/b/a/a/c/h;

.field public final synthetic d:Ljava/util/Date;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/l;Lc/b/a/a/c/h;Lc/b/a/a/c/h;Ljava/util/Date;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/c;->a:Lcom/google/firebase/remoteconfig/internal/l;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/c;->b:Lc/b/a/a/c/h;

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/internal/c;->c:Lc/b/a/a/c/h;

    iput-object p4, p0, Lcom/google/firebase/remoteconfig/internal/c;->d:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final a(Lc/b/a/a/c/h;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/c;->a:Lcom/google/firebase/remoteconfig/internal/l;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/c;->b:Lc/b/a/a/c/h;

    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/c;->c:Lc/b/a/a/c/h;

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/internal/c;->d:Ljava/util/Date;

    invoke-virtual {v0, v1, v2, p0, p1}, Lcom/google/firebase/remoteconfig/internal/l;->q(Lc/b/a/a/c/h;Lc/b/a/a/c/h;Ljava/util/Date;Lc/b/a/a/c/h;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method
