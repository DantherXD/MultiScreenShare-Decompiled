.class public final synthetic Lcom/google/firebase/components/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Ljava/util/Map$Entry;

.field public final synthetic c:Lcom/google/firebase/l/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lcom/google/firebase/l/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/components/h;->b:Ljava/util/Map$Entry;

    iput-object p2, p0, Lcom/google/firebase/components/h;->c:Lcom/google/firebase/l/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/components/h;->b:Ljava/util/Map$Entry;

    iget-object p0, p0, Lcom/google/firebase/components/h;->c:Lcom/google/firebase/l/a;

    invoke-static {v0, p0}, Lcom/google/firebase/components/w;->c(Ljava/util/Map$Entry;Lcom/google/firebase/l/a;)V

    return-void
.end method
