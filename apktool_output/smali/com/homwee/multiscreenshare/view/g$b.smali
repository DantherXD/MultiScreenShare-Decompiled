.class Lcom/homwee/multiscreenshare/view/g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/homwee/multiscreenshare/q/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/homwee/multiscreenshare/view/g;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/homwee/multiscreenshare/view/g;


# direct methods
.method constructor <init>(Lcom/homwee/multiscreenshare/view/g;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/g$b;->a:Lcom/homwee/multiscreenshare/view/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g$b;->a:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/view/g;->b(Lcom/homwee/multiscreenshare/view/g;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/homwee/multiscreenshare/view/f;

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g$b;->a:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {p0}, Lcom/homwee/multiscreenshare/view/g;->h(Lcom/homwee/multiscreenshare/view/g;)Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-interface {p1, p0}, Lcom/homwee/multiscreenshare/view/f;->a(Landroid/view/LayoutInflater;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public b()I
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g$b;->a:Lcom/homwee/multiscreenshare/view/g;

    invoke-static {p0}, Lcom/homwee/multiscreenshare/view/g;->b(Lcom/homwee/multiscreenshare/view/g;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p0

    return p0
.end method
