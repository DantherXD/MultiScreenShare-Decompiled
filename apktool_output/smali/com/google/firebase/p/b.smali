.class public final synthetic Lcom/google/firebase/p/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/p;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/google/firebase/p/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/google/firebase/p/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/p/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/google/firebase/p/b;->b:Lcom/google/firebase/p/h$a;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/components/n;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/p/b;->a:Ljava/lang/String;

    iget-object p0, p0, Lcom/google/firebase/p/b;->b:Lcom/google/firebase/p/h$a;

    invoke-static {v0, p0, p1}, Lcom/google/firebase/p/h;->c(Ljava/lang/String;Lcom/google/firebase/p/h$a;Lcom/google/firebase/components/n;)Lcom/google/firebase/p/g;

    move-result-object p0

    return-object p0
.end method
