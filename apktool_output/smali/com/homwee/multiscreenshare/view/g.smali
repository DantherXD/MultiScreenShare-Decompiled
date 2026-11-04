.class public Lcom/homwee/multiscreenshare/view/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/homwee/multiscreenshare/view/g$c;
    }
.end annotation


# instance fields
.field private a:I

.field private b:Landroid/view/View;

.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/homwee/multiscreenshare/view/f;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field private e:Landroid/view/LayoutInflater;

.field private f:Z

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Landroidx/viewpager/widget/ViewPager;

.field private l:Ljava/lang/String;

.field private m:Landroid/os/Handler;

.field private n:I

.field private o:Z

.field private p:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/homwee/multiscreenshare/view/f;",
            ">;",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0b0079

    iput v0, p0, Lcom/homwee/multiscreenshare/view/g;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/view/g;->b:Landroid/view/View;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/view/g;->m:Landroid/os/Handler;

    const/4 v0, 0x0

    iput v0, p0, Lcom/homwee/multiscreenshare/view/g;->n:I

    iput-boolean v0, p0, Lcom/homwee/multiscreenshare/view/g;->o:Z

    new-instance v1, Lcom/homwee/multiscreenshare/view/g$a;

    invoke-direct {v1, p0}, Lcom/homwee/multiscreenshare/view/g$a;-><init>(Lcom/homwee/multiscreenshare/view/g;)V

    iput-object v1, p0, Lcom/homwee/multiscreenshare/view/g;->p:Ljava/lang/Runnable;

    iput-object p2, p0, Lcom/homwee/multiscreenshare/view/g;->d:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iput-object p2, p0, Lcom/homwee/multiscreenshare/view/g;->e:Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/g;->c:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/homwee/multiscreenshare/view/g;->l:Ljava/lang/String;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    move-result p1

    if-lez p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/homwee/multiscreenshare/view/g;->f:Z

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/g;->d:Landroid/content/Context;

    const/high16 p2, 0x40c00000    # 6.0f

    invoke-static {p1, p2}, Lcom/homwee/multiscreenshare/r/a;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/homwee/multiscreenshare/view/g;->g:I

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/g;->d:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/homwee/multiscreenshare/r/a;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/homwee/multiscreenshare/view/g;->h:I

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/g;->d:Landroid/content/Context;

    const/high16 p2, 0x41700000    # 15.0f

    invoke-static {p1, p2}, Lcom/homwee/multiscreenshare/r/a;->a(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/homwee/multiscreenshare/view/g;->i:I

    const/16 p1, 0xc8

    iput p1, p0, Lcom/homwee/multiscreenshare/view/g;->j:I

    return-void
.end method

.method static synthetic a(Lcom/homwee/multiscreenshare/view/g;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/homwee/multiscreenshare/view/g;->o:Z

    return p0
.end method

.method static synthetic b(Lcom/homwee/multiscreenshare/view/g;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->c:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic c(Lcom/homwee/multiscreenshare/view/g;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/homwee/multiscreenshare/view/g;->f:Z

    return p0
.end method

.method static synthetic d(Lcom/homwee/multiscreenshare/view/g;)I
    .locals 0

    iget p0, p0, Lcom/homwee/multiscreenshare/view/g;->n:I

    return p0
.end method

.method static synthetic e(Lcom/homwee/multiscreenshare/view/g;I)I
    .locals 0

    iput p1, p0, Lcom/homwee/multiscreenshare/view/g;->n:I

    return p1
.end method

.method static synthetic f(Lcom/homwee/multiscreenshare/view/g;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->k:Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method static synthetic g(Lcom/homwee/multiscreenshare/view/g;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->m:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic h(Lcom/homwee/multiscreenshare/view/g;)Landroid/view/LayoutInflater;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->e:Landroid/view/LayoutInflater;

    return-object p0
.end method

.method static synthetic i(Lcom/homwee/multiscreenshare/view/g;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->p:Ljava/lang/Runnable;

    return-object p0
.end method

.method private j(Landroidx/viewpager/widget/ViewPager;)V
    .locals 3

    new-instance v0, Lcom/homwee/multiscreenshare/r/b;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/homwee/multiscreenshare/r/b;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iget p0, p0, Lcom/homwee/multiscreenshare/view/g;->j:I

    invoke-virtual {v0, p0}, Lcom/homwee/multiscreenshare/r/b;->b(I)V

    invoke-virtual {v0, p1}, Lcom/homwee/multiscreenshare/r/b;->a(Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method

.method private n()V
    .locals 7

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g;->e:Landroid/view/LayoutInflater;

    iget v1, p0, Lcom/homwee/multiscreenshare/view/g;->a:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/view/g;->b:Landroid/view/View;

    const v1, 0x7f080050

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    iget-boolean v1, p0, Lcom/homwee/multiscreenshare/view/g;->f:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/homwee/multiscreenshare/view/g;->c:Ljava/util/ArrayList;

    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    :cond_0
    iget-object v1, p0, Lcom/homwee/multiscreenshare/view/g;->b:Landroid/view/View;

    const v2, 0x7f080051

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/viewpager/widget/ViewPager;

    iput-object v1, p0, Lcom/homwee/multiscreenshare/view/g;->k:Landroidx/viewpager/widget/ViewPager;

    new-instance v1, Lcom/homwee/multiscreenshare/q/b;

    new-instance v2, Lcom/homwee/multiscreenshare/view/g$b;

    invoke-direct {v2, p0}, Lcom/homwee/multiscreenshare/view/g$b;-><init>(Lcom/homwee/multiscreenshare/view/g;)V

    invoke-direct {v1, v2}, Lcom/homwee/multiscreenshare/q/b;-><init>(Lcom/homwee/multiscreenshare/q/b$a;)V

    iget-object v2, p0, Lcom/homwee/multiscreenshare/view/g;->k:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/view/g;->k:Landroidx/viewpager/widget/ViewPager;

    invoke-direct {p0, v1}, Lcom/homwee/multiscreenshare/view/g;->j(Landroidx/viewpager/widget/ViewPager;)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    iget-object v3, p0, Lcom/homwee/multiscreenshare/view/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    new-instance v3, Landroid/view/View;

    iget-object v4, p0, Lcom/homwee/multiscreenshare/view/g;->d:Landroid/content/Context;

    invoke-direct {v3, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v4, 0x7f070059

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {v3, v1}, Landroid/view/View;->setEnabled(Z)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    iget v5, p0, Lcom/homwee/multiscreenshare/view/g;->g:I

    iget v6, p0, Lcom/homwee/multiscreenshare/view/g;->h:I

    invoke-direct {v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget v5, p0, Lcom/homwee/multiscreenshare/view/g;->i:I

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iput v5, v4, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v0, v3, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-boolean v2, p0, Lcom/homwee/multiscreenshare/view/g;->f:Z

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/homwee/multiscreenshare/view/g;->k:Landroidx/viewpager/widget/ViewPager;

    iget-object v4, p0, Lcom/homwee/multiscreenshare/view/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v3

    invoke-virtual {v2, v4}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/homwee/multiscreenshare/view/g;->k:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v2, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setEnabled(Z)V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/view/g;->k:Landroidx/viewpager/widget/ViewPager;

    new-instance v2, Lcom/homwee/multiscreenshare/view/g$c;

    iget-object v3, p0, Lcom/homwee/multiscreenshare/view/g;->c:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    iget-boolean v4, p0, Lcom/homwee/multiscreenshare/view/g;->f:Z

    invoke-direct {v2, p0, v3, v0, v4}, Lcom/homwee/multiscreenshare/view/g$c;-><init>(Lcom/homwee/multiscreenshare/view/g;ILandroid/widget/LinearLayout;Z)V

    invoke-virtual {v1, v2}, Landroidx/viewpager/widget/ViewPager;->b(Landroidx/viewpager/widget/ViewPager$j;)V

    return-void
.end method


# virtual methods
.method public k()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/homwee/multiscreenshare/view/f;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->c:Ljava/util/ArrayList;

    return-object p0
.end method

.method public l()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/view/g;->b:Landroid/view/View;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/view/g;->n()V

    :cond_0
    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->b:Landroid/view/View;

    return-object p0
.end method

.method public m()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->l:Ljava/lang/String;

    return-object p0
.end method

.method public o(Z)V
    .locals 2

    iput-boolean p1, p0, Lcom/homwee/multiscreenshare/view/g;->o:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/g;->m:Landroid/os/Handler;

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->p:Ljava/lang/Runnable;

    const-wide/16 v0, 0x1f40

    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/homwee/multiscreenshare/view/g;->m:Landroid/os/Handler;

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/g;->p:Ljava/lang/Runnable;

    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
