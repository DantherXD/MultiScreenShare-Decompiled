.class Lcom/homwee/multiscreenshare/MainActivity$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/homwee/multiscreenshare/q/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/homwee/multiscreenshare/MainActivity;->i0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/homwee/multiscreenshare/MainActivity;


# direct methods
.method constructor <init>(Lcom/homwee/multiscreenshare/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity$j;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$j;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->O(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/homwee/multiscreenshare/view/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/homwee/multiscreenshare/view/g;->o(Z)V

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity$j;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p0}, Lcom/homwee/multiscreenshare/MainActivity;->O(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/homwee/multiscreenshare/view/g;

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/view/g;->l()Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public b()I
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity$j;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p0}, Lcom/homwee/multiscreenshare/MainActivity;->O(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method
