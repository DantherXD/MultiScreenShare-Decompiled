.class public Lcom/homwee/multiscreenshare/view/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/homwee/multiscreenshare/view/f;


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:I

.field private e:Landroid/widget/LinearLayout;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ljava/lang/String;III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/homwee/multiscreenshare/view/d;->d:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/view/d;->e:Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->a:Ljava/lang/String;

    iput p4, p0, Lcom/homwee/multiscreenshare/view/d;->d:I

    iput p2, p0, Lcom/homwee/multiscreenshare/view/d;->b:I

    iput p3, p0, Lcom/homwee/multiscreenshare/view/d;->c:I

    return-void
.end method

.method private b(Landroid/view/LayoutInflater;)V
    .locals 2

    const v0, 0x7f0b0030

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/view/d;->e:Landroid/widget/LinearLayout;

    const v1, 0x7f0800c6

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/view/d;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/view/d;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/view/d;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    const/high16 v1, 0x43dc0000    # 440.0f

    invoke-virtual {p1}, Landroid/view/LayoutInflater;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    invoke-static {v0, v1, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    float-to-int p1, p1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/d;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f0800cb

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->g:Landroid/widget/TextView;

    iget v0, p0, Lcom/homwee/multiscreenshare/view/d;->b:I

    if-nez v0, :cond_2

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->g:Landroid/widget/TextView;

    iget v0, p0, Lcom/homwee/multiscreenshare/view/d;->b:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f0800c8

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->h:Landroid/widget/TextView;

    iget v0, p0, Lcom/homwee/multiscreenshare/view/d;->c:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->e:Landroid/widget/LinearLayout;

    const v0, 0x7f0800c7

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->i:Landroid/widget/ImageView;

    iget p1, p0, Lcom/homwee/multiscreenshare/view/d;->d:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/d;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/homwee/multiscreenshare/m;->a(Landroid/content/Context;)Lcom/homwee/multiscreenshare/p;

    move-result-object p1

    iget v0, p0, Lcom/homwee/multiscreenshare/view/d;->d:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/homwee/multiscreenshare/p;->G(Ljava/lang/Integer;)Lcom/homwee/multiscreenshare/o;

    move-result-object p1

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/d;->i:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/j;->n0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    goto :goto_1

    :cond_3
    const-string p1, "help"

    const-string v0, "initView: img gone"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/d;->i:Landroid/widget/ImageView;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_1
    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/d;->e:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/view/d;->b(Landroid/view/LayoutInflater;)V

    :cond_0
    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/d;->e:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method public c()Z
    .locals 0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
