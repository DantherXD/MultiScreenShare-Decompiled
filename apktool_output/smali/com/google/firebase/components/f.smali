.class public final synthetic Lcom/google/firebase/components/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/google/firebase/components/z;

.field public final synthetic c:Lcom/google/firebase/n/b;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/components/z;Lcom/google/firebase/n/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/components/f;->b:Lcom/google/firebase/components/z;

    iput-object p2, p0, Lcom/google/firebase/components/f;->c:Lcom/google/firebase/n/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/components/f;->b:Lcom/google/firebase/components/z;

    iget-object p0, p0, Lcom/google/firebase/components/f;->c:Lcom/google/firebase/n/b;

    invoke-static {v0, p0}, Lcom/google/firebase/components/r;->m(Lcom/google/firebase/components/z;Lcom/google/firebase/n/b;)V

    return-void
.end method
