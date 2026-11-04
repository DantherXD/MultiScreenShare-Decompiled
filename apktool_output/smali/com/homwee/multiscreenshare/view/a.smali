.class public Lcom/homwee/multiscreenshare/view/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/homwee/multiscreenshare/view/f;


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/widget/ImageView;

.field private k:Z

.field private l:Lcom/homwee/multiscreenshare/MyApplication;


# direct methods
.method public constructor <init>(IIIII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/homwee/multiscreenshare/view/a;->c:I

    iput v0, p0, Lcom/homwee/multiscreenshare/view/a;->e:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/view/a;->f:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/homwee/multiscreenshare/view/a;->k:Z

    iput p3, p0, Lcom/homwee/multiscreenshare/view/a;->e:I

    iput p1, p0, Lcom/homwee/multiscreenshare/view/a;->a:I

    iput p2, p0, Lcom/homwee/multiscreenshare/view/a;->d:I

    iput p4, p0, Lcom/homwee/multiscreenshare/view/a;->b:I

    iput p5, p0, Lcom/homwee/multiscreenshare/view/a;->c:I

    return-void
.end method

.method private b(Landroid/view/LayoutInflater;)V
    .locals 3

    const v0, 0x7f0b002d

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f0800cb

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->g:Landroid/widget/TextView;

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f0800c5

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->j:Landroid/widget/ImageView;

    new-instance p1, Lcom/homwee/multiscreenshare/MyApplication;

    invoke-direct {p1}, Lcom/homwee/multiscreenshare/MyApplication;-><init>()V

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->l:Lcom/homwee/multiscreenshare/MyApplication;

    invoke-virtual {p1}, Lcom/homwee/multiscreenshare/MyApplication;->e()Z

    move-result p1

    iput-boolean p1, p0, Lcom/homwee/multiscreenshare/view/a;->k:Z

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ViewHolder1 mIsKAJITO is = "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Lcom/homwee/multiscreenshare/view/a;->k:Z

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "20250324"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget p1, p0, Lcom/homwee/multiscreenshare/view/a;->a:I

    const/4 v0, 0x4

    const/4 v1, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->g:Landroid/widget/TextView;

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->g:Landroid/widget/TextView;

    iget v2, p0, Lcom/homwee/multiscreenshare/view/a;->a:I

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    iget p1, p0, Lcom/homwee/multiscreenshare/view/a;->b:I

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->j:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->j:Landroid/widget/ImageView;

    iget v0, p0, Lcom/homwee/multiscreenshare/view/a;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->j:Landroid/widget/ImageView;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f0800c8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->h:Landroid/widget/TextView;

    iget v0, p0, Lcom/homwee/multiscreenshare/view/a;->d:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->f:Landroid/widget/LinearLayout;

    const v0, 0x7f0800c7

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->i:Landroid/widget/ImageView;

    iget p1, p0, Lcom/homwee/multiscreenshare/view/a;->e:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/a;->f:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/homwee/multiscreenshare/m;->a(Landroid/content/Context;)Lcom/homwee/multiscreenshare/p;

    move-result-object p1

    iget v0, p0, Lcom/homwee/multiscreenshare/view/a;->e:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/homwee/multiscreenshare/p;->G(Ljava/lang/Integer;)Lcom/homwee/multiscreenshare/o;

    move-result-object p1

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/a;->i:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/j;->n0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    goto :goto_2

    :cond_2
    const-string p1, "help"

    const-string v0, "initView: img gone"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/a;->i:Landroid/widget/ImageView;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_2
    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/a;->f:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/view/a;->b(Landroid/view/LayoutInflater;)V

    :cond_0
    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/a;->f:Landroid/widget/LinearLayout;

    return-object p0
.end method
