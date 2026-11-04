.class public Lcom/homwee/multiscreenshare/view/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/homwee/multiscreenshare/view/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/homwee/multiscreenshare/view/b$a;
    }
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:Landroid/view/ViewGroup;

.field private e:Landroid/widget/ImageView;

.field private f:Z

.field private g:Lcom/homwee/multiscreenshare/view/b$a;


# direct methods
.method public constructor <init>(IIILcom/homwee/multiscreenshare/view/b$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/homwee/multiscreenshare/view/b;->c:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/view/b;->d:Landroid/view/ViewGroup;

    iput p2, p0, Lcom/homwee/multiscreenshare/view/b;->c:I

    iput p1, p0, Lcom/homwee/multiscreenshare/view/b;->a:I

    iput p3, p0, Lcom/homwee/multiscreenshare/view/b;->b:I

    iput-object p4, p0, Lcom/homwee/multiscreenshare/view/b;->g:Lcom/homwee/multiscreenshare/view/b$a;

    return-void
.end method

.method private b(Landroid/view/LayoutInflater;)V
    .locals 2

    const v0, 0x7f0b002e

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/b;->d:Landroid/view/ViewGroup;

    const v0, 0x7f0800f2

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/b;->e:Landroid/widget/ImageView;

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/b;->d:Landroid/view/ViewGroup;

    const v0, 0x7f0800e3

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iget v0, p0, Lcom/homwee/multiscreenshare/view/b;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/b;->d:Landroid/view/ViewGroup;

    const v1, 0x7f0801c1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget v1, p0, Lcom/homwee/multiscreenshare/view/b;->a:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/b;->d:Landroid/view/ViewGroup;

    const v1, 0x7f0801de

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget v1, p0, Lcom/homwee/multiscreenshare/view/b;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/b;->d:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/homwee/multiscreenshare/m;->a(Landroid/content/Context;)Lcom/homwee/multiscreenshare/p;

    move-result-object v0

    iget v1, p0, Lcom/homwee/multiscreenshare/view/b;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/homwee/multiscreenshare/p;->G(Ljava/lang/Integer;)Lcom/homwee/multiscreenshare/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->n0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/b;->g:Lcom/homwee/multiscreenshare/view/b$a;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/homwee/multiscreenshare/view/b;->f:Z

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/b;->e:Landroid/widget/ImageView;

    invoke-interface {p1, p0}, Lcom/homwee/multiscreenshare/view/b$a;->a(Landroid/widget/ImageView;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/b;->d:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/view/b;->b(Landroid/view/LayoutInflater;)V

    :cond_0
    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/b;->d:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/b;->g:Lcom/homwee/multiscreenshare/view/b$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/homwee/multiscreenshare/view/b;->e:Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    iget-boolean p0, p0, Lcom/homwee/multiscreenshare/view/b;->f:Z

    if-eqz p0, :cond_0

    invoke-interface {v0, v1}, Lcom/homwee/multiscreenshare/view/b$a;->a(Landroid/widget/ImageView;)V

    :cond_0
    return-void
.end method
