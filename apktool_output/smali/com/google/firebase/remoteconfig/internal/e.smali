.class public final synthetic Lcom/google/firebase/remoteconfig/internal/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/c/a;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/internal/l;

.field public final synthetic b:Ljava/util/Date;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/internal/l;Ljava/util/Date;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/e;->a:Lcom/google/firebase/remoteconfig/internal/l;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/e;->b:Ljava/util/Date;

    return-void
.end method


# virtual methods
.method public final a(Lc/b/a/a/c/h;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->a:Lcom/google/firebase/remoteconfig/internal/l;

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/internal/e;->b:Ljava/util/Date;

    invoke-virtual {v0, p0, p1}, Lcom/google/firebase/remoteconfig/internal/l;->s(Ljava/util/Date;Lc/b/a/a/c/h;)Lc/b/a/a/c/h;

    return-object p1
.end method
