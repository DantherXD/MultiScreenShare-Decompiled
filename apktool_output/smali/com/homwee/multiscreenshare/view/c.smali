.class public Lcom/homwee/multiscreenshare/view/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/homwee/multiscreenshare/view/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/homwee/multiscreenshare/view/c$a;
    }
.end annotation


# instance fields
.field private a:Landroid/view/ViewGroup;

.field private b:Landroid/widget/ImageView;

.field private c:Landroid/widget/ImageView;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Z

.field private j:Z

.field private k:Lcom/homwee/multiscreenshare/MyApplication;

.field private l:Lcom/homwee/multiscreenshare/view/c$a;


# direct methods
.method public constructor <init>(IIIIILcom/homwee/multiscreenshare/view/c$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    const/4 v0, -0x1

    iput v0, p0, Lcom/homwee/multiscreenshare/view/c;->d:I

    iput v0, p0, Lcom/homwee/multiscreenshare/view/c;->h:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/homwee/multiscreenshare/view/c;->j:Z

    iput p1, p0, Lcom/homwee/multiscreenshare/view/c;->e:I

    iput p3, p0, Lcom/homwee/multiscreenshare/view/c;->d:I

    iput p2, p0, Lcom/homwee/multiscreenshare/view/c;->f:I

    iput p4, p0, Lcom/homwee/multiscreenshare/view/c;->g:I

    iput p5, p0, Lcom/homwee/multiscreenshare/view/c;->h:I

    iput-object p6, p0, Lcom/homwee/multiscreenshare/view/c;->l:Lcom/homwee/multiscreenshare/view/c$a;

    return-void
.end method

.method private b(Landroid/view/LayoutInflater;)V
    .locals 2

    const v0, 0x7f0b002f

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    new-instance p1, Lcom/homwee/multiscreenshare/MyApplication;

    invoke-direct {p1}, Lcom/homwee/multiscreenshare/MyApplication;-><init>()V

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/c;->k:Lcom/homwee/multiscreenshare/MyApplication;

    invoke-virtual {p1}, Lcom/homwee/multiscreenshare/MyApplication;->e()Z

    move-result p1

    iput-boolean p1, p0, Lcom/homwee/multiscreenshare/view/c;->j:Z

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ViewHolder3 mIsKAJITO is = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/homwee/multiscreenshare/view/c;->j:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "20250324"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    const v0, 0x7f0800f1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/c;->c:Landroid/widget/ImageView;

    iget v0, p0, Lcom/homwee/multiscreenshare/view/c;->g:I

    if-nez v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/homwee/multiscreenshare/view/c;->h:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/c;->c:Landroid/widget/ImageView;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    const v0, 0x7f0800f2

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/c;->b:Landroid/widget/ImageView;

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    const v0, 0x7f0800e3

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iget v0, p0, Lcom/homwee/multiscreenshare/view/c;->d:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    const v1, 0x7f0800cb

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget v1, p0, Lcom/homwee/multiscreenshare/view/c;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    const v1, 0x7f0801c1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget v1, p0, Lcom/homwee/multiscreenshare/view/c;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/homwee/multiscreenshare/m;->a(Landroid/content/Context;)Lcom/homwee/multiscreenshare/p;

    move-result-object v0

    iget v1, p0, Lcom/homwee/multiscreenshare/view/c;->d:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/homwee/multiscreenshare/p;->G(Ljava/lang/Integer;)Lcom/homwee/multiscreenshare/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->n0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/c;->l:Lcom/homwee/multiscreenshare/view/c$a;

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/homwee/multiscreenshare/view/c;->i:Z

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/c;->b:Landroid/widget/ImageView;

    invoke-interface {p1, p0}, Lcom/homwee/multiscreenshare/view/c$a;->a(Landroid/widget/ImageView;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/view/c;->b(Landroid/view/LayoutInflater;)V

    :cond_0
    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/c;->a:Landroid/view/ViewGroup;

    return-object p0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/c;->l:Lcom/homwee/multiscreenshare/view/c$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/homwee/multiscreenshare/view/c;->b:Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    iget-boolean p0, p0, Lcom/homwee/multiscreenshare/view/c;->i:Z

    if-eqz p0, :cond_0

    invoke-interface {v0, v1}, Lcom/homwee/multiscreenshare/view/c$a;->a(Landroid/widget/ImageView;)V

    :cond_0
    return-void
.end method
