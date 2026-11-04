.class public Lcom/homwee/multiscreenshare/view/VerticalViewPager;
.super Landroidx/viewpager/widget/ViewPager;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/homwee/multiscreenshare/view/VerticalViewPager$b;,
        Lcom/homwee/multiscreenshare/view/VerticalViewPager$c;
    }
.end annotation


# instance fields
.field private m0:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->m0:Z

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->S()V

    return-void
.end method

.method static synthetic R(Lcom/homwee/multiscreenshare/view/VerticalViewPager;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->m0:Z

    return p1
.end method

.method private T(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;
    .locals 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result p0

    int-to-float p0, p0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    div-float/2addr v1, p0

    mul-float/2addr v1, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    div-float/2addr v2, v0

    mul-float/2addr v2, p0

    invoke-virtual {p1, v1, v2}, Landroid/view/MotionEvent;->setLocation(FF)V

    return-object p1
.end method


# virtual methods
.method public S()V
    .locals 2

    new-instance v0, Lcom/homwee/multiscreenshare/view/VerticalViewPager$c;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/view/VerticalViewPager$c;-><init>(Lcom/homwee/multiscreenshare/view/VerticalViewPager;)V

    const/4 v1, 0x1

    invoke-virtual {p0, v1, v0}, Landroidx/viewpager/widget/ViewPager;->N(ZLandroidx/viewpager/widget/ViewPager$k;)V

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setOverScrollMode(I)V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->o(Landroid/view/KeyEvent;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public o(Landroid/view/KeyEvent;)Z
    .locals 4

    iget-boolean v0, p0, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->m0:Z

    if-nez v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x13

    const/4 v2, 0x0

    if-eq v0, v1, :cond_3

    const/16 v1, 0x14

    if-eq v0, v1, :cond_2

    const/16 v1, 0x61

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0

    :cond_1
    const-string p0, "ccc"

    const-string p1, "V-executeKeyEvent: KEYCODE_BUTTON_B"

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v2

    :cond_2
    const/16 v0, 0x42

    goto :goto_0

    :cond_3
    const/16 v0, 0x11

    :goto_0
    invoke-virtual {p0, v0}, Landroidx/viewpager/widget/ViewPager;->c(I)Z

    iput-boolean v2, p0, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->m0:Z

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lcom/homwee/multiscreenshare/view/VerticalViewPager$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/homwee/multiscreenshare/view/VerticalViewPager$b;-><init>(Lcom/homwee/multiscreenshare/view/VerticalViewPager;Lcom/homwee/multiscreenshare/view/VerticalViewPager$a;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :cond_4
    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->o(Landroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->T(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    invoke-super {p0, v0}, Landroidx/viewpager/widget/ViewPager;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->T(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    return v0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->T(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object p1

    invoke-super {p0, p1}, Landroidx/viewpager/widget/ViewPager;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method
