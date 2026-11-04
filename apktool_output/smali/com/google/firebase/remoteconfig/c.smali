.class public final synthetic Lcom/google/firebase/remoteconfig/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/c/a;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/i;

.field public final synthetic b:Lc/b/a/a/c/h;

.field public final synthetic c:Lc/b/a/a/c/h;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/i;Lc/b/a/a/c/h;Lc/b/a/a/c/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/c;->a:Lcom/google/firebase/remoteconfig/i;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/c;->b:Lc/b/a/a/c/h;

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/c;->c:Lc/b/a/a/c/h;

    return-void
.end method


# virtual methods
.method public final a(Lc/b/a/a/c/h;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/c;->a:Lcom/google/firebase/remoteconfig/i;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/c;->b:Lc/b/a/a/c/h;

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/c;->c:Lc/b/a/a/c/h;

    invoke-virtual {v0, v1, p0, p1}, Lcom/google/firebase/remoteconfig/i;->i(Lc/b/a/a/c/h;Lc/b/a/a/c/h;Lc/b/a/a/c/h;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method
