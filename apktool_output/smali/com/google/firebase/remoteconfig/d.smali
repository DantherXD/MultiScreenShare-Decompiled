.class public final synthetic Lcom/google/firebase/remoteconfig/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/c/a;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/i;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/d;->a:Lcom/google/firebase/remoteconfig/i;

    return-void
.end method


# virtual methods
.method public final a(Lc/b/a/a/c/h;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/d;->a:Lcom/google/firebase/remoteconfig/i;

    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/i;->m(Lcom/google/firebase/remoteconfig/i;Lc/b/a/a/c/h;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method
