.class public final synthetic Lcom/google/firebase/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/n/b;


# instance fields
.field public final synthetic a:Lcom/google/firebase/f;

.field public final synthetic b:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/f;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/a;->a:Lcom/google/firebase/f;

    iput-object p2, p0, Lcom/google/firebase/a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/a;->a:Lcom/google/firebase/f;

    iget-object p0, p0, Lcom/google/firebase/a;->b:Landroid/content/Context;

    invoke-virtual {v0, p0}, Lcom/google/firebase/f;->r(Landroid/content/Context;)Lcom/google/firebase/o/a;

    move-result-object p0

    return-object p0
.end method
