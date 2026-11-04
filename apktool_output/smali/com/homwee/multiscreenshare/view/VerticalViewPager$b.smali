.class Lcom/homwee/multiscreenshare/view/VerticalViewPager$b;
.super Ljava/util/TimerTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/homwee/multiscreenshare/view/VerticalViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic b:Lcom/homwee/multiscreenshare/view/VerticalViewPager;


# direct methods
.method private constructor <init>(Lcom/homwee/multiscreenshare/view/VerticalViewPager;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/VerticalViewPager$b;->b:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/homwee/multiscreenshare/view/VerticalViewPager;Lcom/homwee/multiscreenshare/view/VerticalViewPager$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/view/VerticalViewPager$b;-><init>(Lcom/homwee/multiscreenshare/view/VerticalViewPager;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/TimerTask;->cancel()Z

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/VerticalViewPager$b;->b:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/homwee/multiscreenshare/view/VerticalViewPager;->R(Lcom/homwee/multiscreenshare/view/VerticalViewPager;Z)Z

    return-void
.end method
