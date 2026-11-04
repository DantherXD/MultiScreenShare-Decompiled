.class public Lcom/homwee/multiscreenshare/view/VerticalViewPager$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/homwee/multiscreenshare/view/VerticalViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/homwee/multiscreenshare/view/VerticalViewPager;


# direct methods
.method public constructor <init>(Lcom/homwee/multiscreenshare/view/VerticalViewPager;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/VerticalViewPager$c;->a:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;F)V
    .locals 2

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/VerticalViewPager$c;->a:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getLayoutDirection()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    neg-float p2, p2

    :cond_0
    const/high16 p0, -0x40800000    # -1.0f

    cmpg-float p0, p2, p0

    const/4 v0, 0x0

    if-gez p0, :cond_2

    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    :cond_2
    const/high16 p0, 0x3f800000    # 1.0f

    cmpg-float v1, p2, p0

    if-gtz v1, :cond_1

    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p0

    int-to-float p0, p0

    neg-float v0, p2

    mul-float/2addr p0, v0

    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr p2, p0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    :goto_0
    return-void
.end method
