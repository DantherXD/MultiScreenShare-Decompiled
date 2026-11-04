.class Lcom/homwee/multiscreenshare/MainActivity$b;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/homwee/multiscreenshare/MainActivity;
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

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private synthetic a(Lcom/homwee/multiscreenshare/view/e;)Z
    .locals 2

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->K(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getScreenShareTag()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/homwee/multiscreenshare/view/e;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "screen_share_tag"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->K(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getDlnaTag()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/homwee/multiscreenshare/view/e;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "dlna_config_tag"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p0}, Lcom/homwee/multiscreenshare/MainActivity;->K(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    move-result-object p0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAirplayTag()Z

    move-result p0

    if-nez p0, :cond_3

    invoke-virtual {p1}, Lcom/homwee/multiscreenshare/view/e;->c()Ljava/lang/String;

    move-result-object p0

    const-string p1, "airplay_tag"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private synthetic c(Lcom/homwee/multiscreenshare/view/g;)Z
    .locals 2

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->K(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getScreenShareTag()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/homwee/multiscreenshare/view/g;->m()Ljava/lang/String;

    move-result-object v0

    const-string v1, "screen_share_tag"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {v0}, Lcom/homwee/multiscreenshare/MainActivity;->K(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getDlnaTag()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/homwee/multiscreenshare/view/g;->m()Ljava/lang/String;

    move-result-object v0

    const-string v1, "dlna_config_tag"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p0}, Lcom/homwee/multiscreenshare/MainActivity;->K(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    move-result-object p0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAirplayTag()Z

    move-result p0

    if-nez p0, :cond_3

    invoke-virtual {p1}, Lcom/homwee/multiscreenshare/view/g;->m()Ljava/lang/String;

    move-result-object p0

    const-string p1, "airplay_tag"

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3

    :cond_2
    const/4 p0, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public synthetic b(Lcom/homwee/multiscreenshare/view/e;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/MainActivity$b;->a(Lcom/homwee/multiscreenshare/view/e;)Z

    move-result p0

    return p0
.end method

.method public synthetic d(Lcom/homwee/multiscreenshare/view/g;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/MainActivity$b;->c(Lcom/homwee/multiscreenshare/view/g;)Z

    move-result p0

    return p0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "com.homwee.intent.action.RemoteConfigReceiver"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {}, Lcom/homwee/multiscreenshare/r/f;->b()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/homwee/multiscreenshare/MainActivity;->L(Lcom/homwee/multiscreenshare/MainActivity;Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    iget-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p1}, Lcom/homwee/multiscreenshare/MainActivity;->M(Lcom/homwee/multiscreenshare/MainActivity;)V

    iget-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p1}, Lcom/homwee/multiscreenshare/MainActivity;->N(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget-object p2, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p2}, Lcom/homwee/multiscreenshare/MainActivity;->K(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p2}, Lcom/homwee/multiscreenshare/MainActivity;->N(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object p2

    new-instance v0, Lcom/homwee/multiscreenshare/f;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/f;-><init>(Lcom/homwee/multiscreenshare/MainActivity$b;)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    iget-object p2, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p2}, Lcom/homwee/multiscreenshare/MainActivity;->O(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object p2

    new-instance v0, Lcom/homwee/multiscreenshare/e;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/e;-><init>(Lcom/homwee/multiscreenshare/MainActivity$b;)V

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->removeIf(Ljava/util/function/Predicate;)Z

    iget-object p2, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p2}, Lcom/homwee/multiscreenshare/MainActivity;->P(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/q/a;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$h;->i()V

    iget-object p2, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p2}, Lcom/homwee/multiscreenshare/MainActivity;->Q(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/q/b;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/viewpager/widget/a;->i()V

    iget-object p2, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p2}, Lcom/homwee/multiscreenshare/MainActivity;->N(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-eq p1, p2, :cond_0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity$b;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-static {p0}, Lcom/homwee/multiscreenshare/MainActivity;->R(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    :cond_0
    return-void
.end method
