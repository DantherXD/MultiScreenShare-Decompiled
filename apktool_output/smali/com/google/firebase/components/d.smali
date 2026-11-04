.class public final synthetic Lcom/google/firebase/components/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/n/b;


# instance fields
.field public final synthetic a:Lcom/google/firebase/components/r;

.field public final synthetic b:Lcom/google/firebase/components/m;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/components/r;Lcom/google/firebase/components/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/components/d;->a:Lcom/google/firebase/components/r;

    iput-object p2, p0, Lcom/google/firebase/components/d;->b:Lcom/google/firebase/components/m;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/components/d;->a:Lcom/google/firebase/components/r;

    iget-object p0, p0, Lcom/google/firebase/components/d;->b:Lcom/google/firebase/components/m;

    invoke-virtual {v0, p0}, Lcom/google/firebase/components/r;->k(Lcom/google/firebase/components/m;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
