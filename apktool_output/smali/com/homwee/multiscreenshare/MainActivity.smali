.class public Lcom/homwee/multiscreenshare/MainActivity;
.super Landroidx/appcompat/app/c;
.source ""


# static fields
.field public static s:Ljava/lang/Boolean;


# instance fields
.field private A:Landroidx/recyclerview/widget/RecyclerView;

.field private B:Landroid/widget/TextView;

.field private C:Landroid/widget/TextView;

.field private D:Landroid/widget/TextView;

.field private E:Landroid/widget/TextView;

.field private F:Landroid/widget/ImageView;

.field private G:Landroid/widget/ImageView;

.field private H:Landroidx/constraintlayout/widget/ConstraintLayout;

.field private I:Landroidx/lifecycle/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/l<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private J:Landroidx/lifecycle/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/l<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private K:Ld/a/j/a;

.field private L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

.field private M:I

.field private N:Ljava/lang/String;

.field public O:Landroid/content/Context;

.field private P:Z

.field private Q:Lcom/homwee/multiscreenshare/MyApplication;

.field private R:Landroid/content/BroadcastReceiver;

.field private S:Landroid/content/BroadcastReceiver;

.field private T:Landroid/content/BroadcastReceiver;

.field private U:Landroid/content/BroadcastReceiver;

.field private V:Landroid/content/BroadcastReceiver;

.field private final W:Landroid/content/BroadcastReceiver;

.field private X:Landroid/content/ServiceConnection;

.field private Y:Landroid/content/ServiceConnection;

.field private t:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/homwee/multiscreenshare/view/e;",
            ">;"
        }
    .end annotation
.end field

.field private u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/homwee/multiscreenshare/view/g;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

.field private w:Lcom/homwee/multiscreenshare/q/a;

.field private x:Lcom/homwee/multiscreenshare/q/b;

.field private y:Lcom/homwee/multiscreenshare/r/b;

.field private z:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Lcom/homwee/multiscreenshare/MainActivity;->s:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v0, Landroidx/lifecycle/l;

    invoke-direct {v0}, Landroidx/lifecycle/l;-><init>()V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->I:Landroidx/lifecycle/l;

    new-instance v0, Landroidx/lifecycle/l;

    invoke-direct {v0}, Landroidx/lifecycle/l;-><init>()V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->J:Landroidx/lifecycle/l;

    new-instance v0, Ld/a/j/a;

    invoke-direct {v0}, Ld/a/j/a;-><init>()V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->K:Ld/a/j/a;

    const/4 v0, 0x0

    iput v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->M:I

    iput-boolean v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    new-instance v0, Lcom/homwee/multiscreenshare/MainActivity$b;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/MainActivity$b;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->R:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/homwee/multiscreenshare/MainActivity$c;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/MainActivity$c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->S:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/homwee/multiscreenshare/MainActivity$d;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/MainActivity$d;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->T:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/homwee/multiscreenshare/MainActivity$e;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/MainActivity$e;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->U:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/homwee/multiscreenshare/MainActivity$f;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/MainActivity$f;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->V:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/homwee/multiscreenshare/MainActivity$g;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/MainActivity$g;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->W:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/homwee/multiscreenshare/MainActivity$h;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/MainActivity$h;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->X:Landroid/content/ServiceConnection;

    new-instance v0, Lcom/homwee/multiscreenshare/MainActivity$i;

    invoke-direct {v0, p0}, Lcom/homwee/multiscreenshare/MainActivity$i;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->Y:Landroid/content/ServiceConnection;

    return-void
.end method

.method private C0()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.homwee.mmp.screenshare"

    const-string v3, "com.changhong.mmp.airplay.service.AirPlayInitService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAirplayTag()Z

    move-result v1

    const-string v2, "airplay"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getDlnaTag()Z

    move-result v1

    const-string v2, "dlna_config"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getScreenShareTag()Z

    move-result v1

    const-string v2, "screen_share"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const-string p0, "start mmp airplay"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method private D0()V
    .locals 4

    const-string v0, "MiracastService come from MultiscreenShare !!!!!!!!!"

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getScreenShareTag()Z

    move-result v1

    const-string v2, "screen_share"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_0
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.mediatek.androidbox"

    const-string v3, "com.mediatek.androidbox.MiracastService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method private F0()V
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->X:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    const-string p0, "unbindService"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method private G0()V
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->Y:Landroid/content/ServiceConnection;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unbindService(Landroid/content/ServiceConnection;)V

    const-string p0, "unbindService"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic K(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    return-object p0
.end method

.method static synthetic L(Lcom/homwee/multiscreenshare/MainActivity;Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;)Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    return-object p1
.end method

.method static synthetic M(Lcom/homwee/multiscreenshare/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->C0()V

    return-void
.end method

.method static synthetic N(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic O(Lcom/homwee/multiscreenshare/MainActivity;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic P(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/q/a;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->w:Lcom/homwee/multiscreenshare/q/a;

    return-object p0
.end method

.method static synthetic Q(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/q/b;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->x:Lcom/homwee/multiscreenshare/q/b;

    return-object p0
.end method

.method static synthetic R(Lcom/homwee/multiscreenshare/MainActivity;)Lcom/homwee/multiscreenshare/view/VerticalViewPager;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->v:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    return-object p0
.end method

.method static synthetic S(Lcom/homwee/multiscreenshare/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->z0()V

    return-void
.end method

.method static synthetic T(Lcom/homwee/multiscreenshare/MainActivity;)I
    .locals 0

    iget p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->M:I

    return p0
.end method

.method static synthetic U(Lcom/homwee/multiscreenshare/MainActivity;I)I
    .locals 0

    iput p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->M:I

    return p1
.end method

.method static synthetic V(Lcom/homwee/multiscreenshare/MainActivity;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method private W()V
    .locals 2

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->I:Landroidx/lifecycle/l;

    new-instance v1, Lcom/homwee/multiscreenshare/h;

    invoke-direct {v1, p0}, Lcom/homwee/multiscreenshare/h;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/LiveData;->f(Landroidx/lifecycle/g;Landroidx/lifecycle/m;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->J:Landroidx/lifecycle/l;

    new-instance v1, Lcom/homwee/multiscreenshare/d;

    invoke-direct {v1, p0}, Lcom/homwee/multiscreenshare/d;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/LiveData;->f(Landroidx/lifecycle/g;Landroidx/lifecycle/m;)V

    return-void
.end method

.method private X()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.mediatek.androidbox"

    const-string v2, "com.mediatek.androidbox.MiracastService"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->X:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Landroid/app/Activity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    const-string p0, "bindService"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method private Y()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.homwee.mmp.screenshare"

    const-string v2, "com.changhong.mmp.airplay.service.AirPlayInitService"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->Y:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Landroid/app/Activity;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    const-string p0, "bindService"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method private declared-synchronized Z(Ljava/lang/String;I)Ld/a/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Ld/a/c<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    if-eqz v0, :cond_0

    new-instance v0, Lcom/homwee/multiscreenshare/j;

    invoke-direct {v0, p1, p2}, Lcom/homwee/multiscreenshare/j;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Ld/a/c;->c(Ld/a/e;)Ld/a/c;

    move-result-object p1

    invoke-static {}, Ld/a/o/a;->a()Ld/a/h;

    move-result-object p2

    invoke-virtual {p1, p2}, Ld/a/c;->i(Ld/a/h;)Ld/a/c;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :cond_0
    :try_start_1
    new-instance v0, Lcom/homwee/multiscreenshare/i;

    invoke-direct {v0, p1, p2}, Lcom/homwee/multiscreenshare/i;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Ld/a/c;->c(Ld/a/e;)Ld/a/c;

    move-result-object p1

    invoke-static {}, Ld/a/o/a;->a()Ld/a/h;

    move-result-object p2

    invoke-virtual {p1, p2}, Ld/a/c;->i(Ld/a/h;)Ld/a/c;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private c0(Landroidx/viewpager/widget/ViewPager;)V
    .locals 3

    new-instance v0, Lcom/homwee/multiscreenshare/r/b;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-direct {v0, v1, v2}, Lcom/homwee/multiscreenshare/r/b;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->y:Lcom/homwee/multiscreenshare/r/b;

    const/16 v1, 0xc8

    invoke-virtual {v0, v1}, Lcom/homwee/multiscreenshare/r/b;->b(I)V

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->y:Lcom/homwee/multiscreenshare/r/b;

    invoke-virtual {p0, p1}, Lcom/homwee/multiscreenshare/r/b;->a(Landroidx/viewpager/widget/ViewPager;)V

    return-void
.end method

.method private d0()Ljava/lang/String;
    .locals 5

    const-string p0, ""

    :try_start_0
    const-string v0, "eth0"

    invoke-static {v0}, Ljava/net/NetworkInterface;->getByName(Ljava/lang/String;)Ljava/net/NetworkInterface;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/net/NetworkInterface;->getHardwareAddress()[B

    move-result-object v0

    const-string v1, "%02x:%02x:%02x:%02x:%02x:%02x"

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aget-byte v4, v0, v3

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aget-byte v4, v0, v3

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    aget-byte v4, v0, v3

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x3

    aget-byte v4, v0, v3

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x4

    aget-byte v4, v0, v3

    invoke-static {v4}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x5

    aget-byte v0, v0, v3

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    aput-object v0, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/net/SocketException;->printStackTrace()V

    :cond_0
    :goto_0
    return-object p0
.end method

.method public static e0(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    :try_start_0
    const-string v0, "android.os.SystemProperties"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "get"

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    aput-object p0, v2, v5

    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method private f0()V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const-string v1, "FACTORY_CONFIG"

    const-string v2, "FORCE_HDCP2X"

    invoke-static {v1, v2}, Lcom/homwee/multiscreenshare/MyApplication;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ro.board.platform"

    invoke-static {v2}, Lcom/homwee/multiscreenshare/MainActivity;->e0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "platForm = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    const v3, 0x7f0700ba

    const v4, 0x7f0700b9

    const v5, 0x7f07008d

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const v6, 0x7f07008c

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const v7, 0x7f0e004f

    const v8, 0x7f0e00a3

    const/4 v9, 0x0

    const-string v10, ""

    if-eqz v2, :cond_3

    const-string v11, "mt5867"

    invoke-virtual {v2, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v1, :cond_5

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v7, v6, v5, v10}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v4, v9, v8, v3}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v3, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v3, v9, v8, v4}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    :goto_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v4, v10}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    :cond_1
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v7, v6, v5, v10}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v4, v9, v8, v3}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    goto :goto_1

    :cond_2
    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v3, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v3, v9, v8, v4}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v4, v10}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v2, v7, v6, v5, v10}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v4, v9, v8, v3}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    goto :goto_2

    :cond_4
    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v3, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v3, v9, v8, v4}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    :goto_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v4, v10}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    :goto_3
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getScreenShareTag()Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_6
    iget-boolean v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    const v2, 0x7f070086

    const v3, 0x7f070085

    const-string v4, "screen_share_tag"

    if-eqz v1, :cond_7

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v5, Lcom/homwee/multiscreenshare/view/e;

    const v6, 0x7f0e0051

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v5, v6, v3, v2, v4}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v5, Lcom/homwee/multiscreenshare/view/e;

    const v6, 0x7f0e0050

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v5, v6, v3, v2, v4}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_4
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    const v3, 0x7f0e007f

    const v5, 0x7f0e009b

    const v6, 0x7f0e007e

    const v7, 0x7f0e009a

    if-eqz v2, :cond_9

    iget-boolean v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    const v8, 0x7f0700b0

    if-eqz v2, :cond_8

    new-instance v2, Lcom/homwee/multiscreenshare/view/b;

    new-instance v6, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v6, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v2, v5, v8, v3, v6}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/c;

    const v12, 0x7f0e009c

    const v13, 0x7f0e009e

    const v14, 0x7f0700b4

    const/4 v15, 0x1

    const v16, 0x7f07007b

    new-instance v3, Lcom/homwee/multiscreenshare/a;

    invoke-direct {v3, v0}, Lcom/homwee/multiscreenshare/a;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    move-object v11, v2

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v17}, Lcom/homwee/multiscreenshare/view/c;-><init>(IIIIILcom/homwee/multiscreenshare/view/c$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const v18, 0x7f0e00a2

    const v19, 0x7f0e00a1

    const v20, 0x7f0700b8

    const/16 v21, 0x1

    const v22, 0x7f07007b

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto/16 :goto_5

    :cond_8
    new-instance v2, Lcom/homwee/multiscreenshare/view/b;

    new-instance v3, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v3, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v2, v7, v8, v6, v3}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/c;

    const v12, 0x7f0e009c

    const v13, 0x7f0e009d

    const v14, 0x7f0700b4

    const/4 v15, 0x1

    const v16, 0x7f070083

    new-instance v3, Lcom/homwee/multiscreenshare/a;

    invoke-direct {v3, v0}, Lcom/homwee/multiscreenshare/a;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    move-object v11, v2

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v17}, Lcom/homwee/multiscreenshare/view/c;-><init>(IIIIILcom/homwee/multiscreenshare/view/c$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const v18, 0x7f0e009f

    const v19, 0x7f0e00a0

    const v20, 0x7f0700b8

    const/16 v21, 0x1

    const v22, 0x7f070083

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto/16 :goto_5

    :cond_9
    iget-boolean v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    const v8, 0x7f0700af

    if-eqz v2, :cond_a

    new-instance v2, Lcom/homwee/multiscreenshare/view/b;

    new-instance v6, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v6, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v2, v5, v8, v3, v6}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/c;

    const v12, 0x7f0e009c

    const v13, 0x7f0e009e

    const v14, 0x7f0700b2

    const/4 v15, 0x1

    const v16, 0x7f07007b

    new-instance v3, Lcom/homwee/multiscreenshare/a;

    invoke-direct {v3, v0}, Lcom/homwee/multiscreenshare/a;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    move-object v11, v2

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v17}, Lcom/homwee/multiscreenshare/view/c;-><init>(IIIIILcom/homwee/multiscreenshare/view/c$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const v18, 0x7f0e00a2

    const v19, 0x7f0e00a1

    const v20, 0x7f0700b6

    const/16 v21, 0x1

    const v22, 0x7f07007b

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto :goto_5

    :cond_a
    new-instance v2, Lcom/homwee/multiscreenshare/view/b;

    new-instance v3, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v3, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v2, v7, v8, v6, v3}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/c;

    const v12, 0x7f0e009c

    const v13, 0x7f0e009d

    const v14, 0x7f0700b2

    const/4 v15, 0x1

    const v16, 0x7f070083

    new-instance v3, Lcom/homwee/multiscreenshare/a;

    invoke-direct {v3, v0}, Lcom/homwee/multiscreenshare/a;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    move-object v11, v2

    move-object/from16 v17, v3

    invoke-direct/range {v11 .. v17}, Lcom/homwee/multiscreenshare/view/c;-><init>(IIIIILcom/homwee/multiscreenshare/view/c$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const v18, 0x7f0e009f

    const v19, 0x7f0e00a0

    const v20, 0x7f0700b6

    const/16 v21, 0x1

    const v22, 0x7f070083

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    :goto_5
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v5, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v5, v4}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAirplayTag()Z

    move-result v1

    if-eqz v1, :cond_e

    :cond_c
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    const v3, 0x7f0e004e

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f07008a

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const v5, 0x7f07008b

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "airplay_tag"

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_d

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v12, 0x0

    const v13, 0x7f0e0089

    const v14, 0x7f070099

    const/4 v15, 0x0

    const/16 v16, -0x1

    move-object v11, v2

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/16 v18, 0x0

    const v19, 0x7f0e008b

    const v20, 0x7f07009c

    const/16 v21, 0x0

    const/16 v22, -0x1

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto :goto_6

    :cond_d
    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v12, 0x0

    const v13, 0x7f0e0089

    const v14, 0x7f070098

    const/4 v15, 0x0

    const/16 v16, -0x1

    move-object v11, v2

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/16 v18, 0x0

    const v19, 0x7f0e008b

    const v20, 0x7f07009b

    const/16 v21, 0x0

    const/16 v22, -0x1

    move-object/from16 v17, v2

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    :goto_6
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v4, v6}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    const v2, 0x7f0e0081

    const v3, 0x7f0e0080

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getDlnaTag()Z

    move-result v1

    if-eqz v1, :cond_13

    :cond_f
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v4, Lcom/homwee/multiscreenshare/view/e;

    const v5, 0x7f0e002d

    invoke-virtual {v0, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f070094

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const v7, 0x7f070095

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "dlna_config_tag"

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v4

    const v5, 0x7f0e008c

    if-eqz v4, :cond_11

    iget-boolean v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    if-eqz v4, :cond_10

    new-instance v4, Lcom/homwee/multiscreenshare/view/b;

    const v6, 0x7f07009e

    new-instance v7, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v7, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v4, v5, v6, v2, v7}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v12, 0x7f0e0090

    const v13, 0x7f0e008f

    const v14, 0x7f0700a2

    const/4 v15, 0x1

    const v16, 0x7f07007b

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v18, 0x7f0e0091

    const v19, 0x7f0e0092

    const v20, 0x7f0700a4

    const/16 v21, 0x0

    const/16 v22, -0x1

    move-object/from16 v17, v4

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v12, 0x7f0e0093

    const v13, 0x7f0e0094

    const v14, 0x7f0700a6

    const/4 v15, 0x0

    const/16 v16, -0x1

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto/16 :goto_7

    :cond_10
    new-instance v4, Lcom/homwee/multiscreenshare/view/b;

    const v6, 0x7f07009e

    new-instance v7, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v7, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v4, v5, v6, v3, v7}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v12, 0x7f0e008d

    const v13, 0x7f0e008e

    const v14, 0x7f0700a2

    const/4 v15, 0x1

    const v16, 0x7f070083

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v18, 0x7f0e0091

    const v19, 0x7f0e0092

    const v20, 0x7f0700a4

    const/16 v21, 0x0

    const/16 v22, -0x1

    move-object/from16 v17, v4

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v12, 0x7f0e0093

    const v13, 0x7f0e0094

    const v14, 0x7f0700a6

    const/4 v15, 0x0

    const/16 v16, -0x1

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto/16 :goto_7

    :cond_11
    iget-boolean v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    if-eqz v4, :cond_12

    new-instance v4, Lcom/homwee/multiscreenshare/view/b;

    const v6, 0x7f07009d

    new-instance v7, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v7, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v4, v5, v6, v2, v7}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v12, 0x7f0e0090

    const v13, 0x7f0e008f

    const v14, 0x7f0700a0

    const/4 v15, 0x1

    const v16, 0x7f07007b

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v18, 0x7f0e0091

    const v19, 0x7f0e0092

    const v20, 0x7f0700a3

    const/16 v21, 0x0

    const/16 v22, -0x1

    move-object/from16 v17, v4

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v12, 0x7f0e0093

    const v13, 0x7f0e0094

    const v14, 0x7f0700a5

    const/4 v15, 0x0

    const/16 v16, -0x1

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto :goto_7

    :cond_12
    new-instance v4, Lcom/homwee/multiscreenshare/view/b;

    const v6, 0x7f07009d

    new-instance v7, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v7, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v4, v5, v6, v3, v7}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v12, 0x7f0e008d

    const v13, 0x7f0e008e

    const v14, 0x7f0700a0

    const/4 v15, 0x1

    const v16, 0x7f070083

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v18, 0x7f0e0091

    const v19, 0x7f0e0092

    const v20, 0x7f0700a3

    const/16 v21, 0x0

    const/16 v22, -0x1

    move-object/from16 v17, v4

    invoke-direct/range {v17 .. v22}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lcom/homwee/multiscreenshare/view/a;

    const v12, 0x7f0e0093

    const v13, 0x7f0e0094

    const v14, 0x7f0700a5

    const/4 v15, 0x0

    const/16 v16, -0x1

    move-object v11, v4

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    :goto_7
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v5, Lcom/homwee/multiscreenshare/view/g;

    iget-object v6, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v5, v1, v6, v8}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v4, Lcom/homwee/multiscreenshare/view/e;

    const v5, 0x7f0e0084

    invoke-virtual {v0, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f070090

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const v7, 0x7f070091

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v4, v5, v6, v7, v10}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v4

    if-eqz v4, :cond_15

    iget-boolean v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    if-eqz v4, :cond_14

    new-instance v3, Lcom/homwee/multiscreenshare/view/b;

    const v4, 0x7f0e0096

    const v5, 0x7f0700a8

    new-instance v6, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v6, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v3, v4, v5, v2, v6}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v12, 0x0

    const v13, 0x7f0e0099

    const v14, 0x7f0700ad

    const/4 v15, 0x1

    const v16, 0x7f07007b

    move-object v11, v2

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto/16 :goto_8

    :cond_14
    new-instance v2, Lcom/homwee/multiscreenshare/view/b;

    const v4, 0x7f0e0095

    const v5, 0x7f0700a8

    new-instance v6, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v6, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v2, v4, v5, v3, v6}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v12, 0x0

    const v13, 0x7f0e0098

    const v14, 0x7f0700ad

    const/4 v15, 0x1

    const v16, 0x7f070083

    move-object v11, v2

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto :goto_8

    :cond_15
    iget-boolean v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    if-eqz v4, :cond_16

    new-instance v3, Lcom/homwee/multiscreenshare/view/b;

    const v4, 0x7f0e0096

    const v5, 0x7f0700a7

    new-instance v6, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v6, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v3, v4, v5, v2, v6}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v12, 0x0

    const v13, 0x7f0e0099

    const v14, 0x7f0700ab

    const/4 v15, 0x1

    const v16, 0x7f07007b

    move-object v11, v2

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto :goto_8

    :cond_16
    new-instance v2, Lcom/homwee/multiscreenshare/view/b;

    const v4, 0x7f0e0095

    const v5, 0x7f0700a7

    new-instance v6, Lcom/homwee/multiscreenshare/c;

    invoke-direct {v6, v0}, Lcom/homwee/multiscreenshare/c;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v2, v4, v5, v3, v6}, Lcom/homwee/multiscreenshare/view/b;-><init>(IIILcom/homwee/multiscreenshare/view/b$a;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v12, 0x0

    const v13, 0x7f0e0098

    const v14, 0x7f0700ab

    const/4 v15, 0x1

    const v16, 0x7f070083

    move-object v11, v2

    invoke-direct/range {v11 .. v16}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    :goto_8
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v0, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v0, v10}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private g0()V
    .locals 3

    const v0, 0x7f080046

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, Lcom/homwee/multiscreenshare/q/a;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/homwee/multiscreenshare/q/a;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->w:Lcom/homwee/multiscreenshare/q/a;

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$p;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/homwee/multiscreenshare/q/c;

    const/high16 v2, 0x41000000    # 8.0f

    invoke-static {v2}, Lcom/blankj/utilcode/util/i;->a(F)I

    move-result v2

    invoke-direct {v1, v2}, Lcom/homwee/multiscreenshare/q/c;-><init>(I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->w:Lcom/homwee/multiscreenshare/q/a;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$h;)V

    return-void
.end method

.method private h0()V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    const-string v1, "FACTORY_CONFIG"

    const-string v2, "FORCE_HDCP2X"

    invoke-static {v1, v2}, Lcom/homwee/multiscreenshare/MyApplication;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ro.board.platform"

    invoke-static {v2}, Lcom/homwee/multiscreenshare/MainActivity;->e0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "platForm = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    const v3, 0x7f0700ba

    const v4, 0x7f0700b9

    const-string v5, "Mirror for Android"

    const-string v6, "oboni"

    const-string v7, "fa"

    const v8, 0x7f0e00a3

    const/4 v9, 0x0

    const v10, 0x7f0e004d

    const-string v11, ""

    const v12, 0x7f07008b

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const v13, 0x7f07008a

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    if-eqz v2, :cond_7

    const-string v14, "mt5867"

    invoke-virtual {v2, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz v1, :cond_b

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-direct {v2, v5, v13, v12, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5, v13, v12, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5, v13, v12, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v4, v9, v8, v3}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    goto :goto_1

    :cond_2
    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v3, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v3, v9, v8, v4}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    :goto_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v4, v11}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_3
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-direct {v2, v5, v13, v12, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5, v13, v12, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5, v13, v12, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v4, v9, v8, v3}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    goto :goto_3

    :cond_6
    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v3, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v3, v9, v8, v4}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    :goto_3
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v4, v11}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-direct {v2, v5, v13, v12, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5, v13, v12, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_4

    :cond_9
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v10}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5, v13, v12, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_4
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_a

    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v4, v9, v8, v3}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    goto :goto_5

    :cond_a
    new-instance v2, Lcom/homwee/multiscreenshare/view/d;

    iget-object v3, v0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v2, v3, v9, v8, v4}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    :goto_5
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v4, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v4, v11}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    :goto_6
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_b
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAirplayTag()Z

    move-result v1

    if-eqz v1, :cond_10

    :cond_c
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    const v2, 0x7f0e004e

    const-string v3, "airplay_tag"

    if-eqz v1, :cond_e

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    const-string v4, "Mirror for iOS"

    invoke-direct {v2, v4, v13, v12, v3}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_d
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v4, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v13, v12, v3}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_7

    :cond_e
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v4, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v13, v12, v3}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_7
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_8
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_f

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v5, 0x0

    const v6, 0x7f0e0089

    const v7, 0x7f070099

    const/4 v8, 0x0

    const/4 v9, -0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v11, 0x0

    const v12, 0x7f0e008b

    const v13, 0x7f07009c

    const/4 v14, 0x0

    const/4 v15, -0x1

    move-object v10, v2

    invoke-direct/range {v10 .. v15}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto :goto_9

    :cond_f
    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v5, 0x0

    const v6, 0x7f0e0089

    const v7, 0x7f070098

    const/4 v8, 0x0

    const/4 v9, -0x1

    move-object v4, v2

    invoke-direct/range {v4 .. v9}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v11, 0x0

    const v12, 0x7f0e008b

    const v13, 0x7f07009b

    const/4 v14, 0x0

    const/4 v15, -0x1

    move-object v10, v2

    invoke-direct/range {v10 .. v15}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    :goto_9
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v4, Lcom/homwee/multiscreenshare/view/g;

    iget-object v5, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v4, v1, v5, v3}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getDlnaTag()Z

    move-result v1

    if-eqz v1, :cond_13

    :cond_11
    iget-object v1, v0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    const v3, 0x7f0e002d

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f070094

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const v5, 0x7f070095

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "dlna_config_tag"

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_12

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const v8, 0x7f0e0091

    const v9, 0x7f0e0092

    const v10, 0x7f0700a4

    const/4 v11, 0x0

    const/4 v12, -0x1

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const v14, 0x7f0e0093

    const v15, 0x7f0e0094

    const v16, 0x7f0700a6

    const/16 v17, 0x0

    const/16 v18, -0x1

    move-object v13, v2

    invoke-direct/range {v13 .. v18}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto :goto_a

    :cond_12
    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const v8, 0x7f0e0091

    const v9, 0x7f0e0092

    const v10, 0x7f0700a3

    const/4 v11, 0x0

    const/4 v12, -0x1

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const v14, 0x7f0e0093

    const v15, 0x7f0e0094

    const v16, 0x7f0700a5

    const/16 v17, 0x0

    const/16 v18, -0x1

    move-object v13, v2

    invoke-direct/range {v13 .. v18}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    :goto_a
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object v0, v0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v1, v0, v6}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    return-void
.end method

.method private i0()V
    .locals 3

    new-instance v0, Lcom/homwee/multiscreenshare/q/b;

    new-instance v1, Lcom/homwee/multiscreenshare/MainActivity$j;

    invoke-direct {v1, p0}, Lcom/homwee/multiscreenshare/MainActivity$j;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-direct {v0, v1}, Lcom/homwee/multiscreenshare/q/b;-><init>(Lcom/homwee/multiscreenshare/q/b$a;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->x:Lcom/homwee/multiscreenshare/q/b;

    const v0, 0x7f080047

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->v:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->x:Lcom/homwee/multiscreenshare/q/b;

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/a;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->v:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->v:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    invoke-direct {p0, v0}, Lcom/homwee/multiscreenshare/MainActivity;->c0(Landroidx/viewpager/widget/ViewPager;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->v:Lcom/homwee/multiscreenshare/view/VerticalViewPager;

    new-instance v2, Lcom/homwee/multiscreenshare/MainActivity$a;

    invoke-direct {v2, p0}, Lcom/homwee/multiscreenshare/MainActivity$a;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-virtual {v0, v2}, Landroidx/viewpager/widget/ViewPager;->b(Landroidx/viewpager/widget/ViewPager$j;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setFocusable(Z)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/homwee/multiscreenshare/l;

    invoke-direct {v1, p0}, Lcom/homwee/multiscreenshare/l;-><init>(Lcom/homwee/multiscreenshare/MainActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private j0()V
    .locals 15

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const-string v0, "FACTORY_CONFIG"

    const-string v1, "FORCE_HDCP2X"

    invoke-static {v0, v1}, Lcom/homwee/multiscreenshare/MyApplication;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ro.board.platform"

    invoke-static {v1}, Lcom/homwee/multiscreenshare/MainActivity;->e0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "platForm = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    const v2, 0x7f0700ba

    const v3, 0x7f0700b9

    const-string v4, "Mirror for Android"

    const v5, 0x7f0e004d

    const-string v6, "fa"

    const v7, 0x7f0e00a3

    const/4 v8, 0x0

    const v9, 0x7f07008b

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const v10, 0x7f07008a

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const-string v11, ""

    if-eqz v1, :cond_5

    const-string v12, "mt5867"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v0, :cond_8

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v1, Lcom/homwee/multiscreenshare/view/e;

    invoke-direct {v1, v4, v10, v9, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v1, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {p0, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v10, v9, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lcom/homwee/multiscreenshare/view/d;

    iget-object v3, p0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v1, v3, v8, v7, v2}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/homwee/multiscreenshare/view/d;

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v1, v2, v8, v7, v3}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/g;

    iget-object v3, p0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v2, v0, v3, v11}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_6

    :cond_2
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v1, Lcom/homwee/multiscreenshare/view/e;

    invoke-direct {v1, v4, v10, v9, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v1, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {p0, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v10, v9, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Lcom/homwee/multiscreenshare/view/d;

    iget-object v3, p0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v1, v3, v8, v7, v2}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    goto :goto_3

    :cond_4
    new-instance v1, Lcom/homwee/multiscreenshare/view/d;

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v1, v2, v8, v7, v3}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    :goto_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/g;

    iget-object v3, p0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v2, v0, v3, v11}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_6

    :cond_5
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v1, Lcom/homwee/multiscreenshare/view/e;

    invoke-direct {v1, v4, v10, v9, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_4

    :cond_6
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v1, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {p0, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4, v10, v9, v11}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_4
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v1, Lcom/homwee/multiscreenshare/view/d;

    iget-object v3, p0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v1, v3, v8, v7, v2}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    goto :goto_5

    :cond_7
    new-instance v1, Lcom/homwee/multiscreenshare/view/d;

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    invoke-direct {v1, v2, v8, v7, v3}, Lcom/homwee/multiscreenshare/view/d;-><init>(Ljava/lang/String;III)V

    :goto_5
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/g;

    iget-object v3, p0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v2, v0, v3, v11}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    :goto_6
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAirplayTag()Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_9
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "airplay_tag"

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    const-string v3, "Mirror for iOS"

    invoke-direct {v2, v3, v10, v9, v1}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    goto :goto_7

    :cond_a
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    new-instance v2, Lcom/homwee/multiscreenshare/view/e;

    const v3, 0x7f0e004e

    invoke-virtual {p0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v10, v9, v1}, Lcom/homwee/multiscreenshare/view/e;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_7
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v4, 0x0

    const v5, 0x7f0e0089

    const v6, 0x7f070099

    const/4 v7, 0x0

    const/4 v8, -0x1

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v10, 0x0

    const v11, 0x7f0e008b

    const v12, 0x7f07009c

    const/4 v13, 0x0

    const/4 v14, -0x1

    move-object v9, v2

    invoke-direct/range {v9 .. v14}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    goto :goto_8

    :cond_b
    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v4, 0x0

    const v5, 0x7f0e0089

    const v6, 0x7f070098

    const/4 v7, 0x0

    const/4 v8, -0x1

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lcom/homwee/multiscreenshare/view/a;

    const/4 v10, 0x0

    const v11, 0x7f0e008b

    const v12, 0x7f07009b

    const/4 v13, 0x0

    const/4 v14, -0x1

    move-object v9, v2

    invoke-direct/range {v9 .. v14}, Lcom/homwee/multiscreenshare/view/a;-><init>(IIIII)V

    :goto_8
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    new-instance v3, Lcom/homwee/multiscreenshare/view/g;

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    invoke-direct {v3, v0, p0, v1}, Lcom/homwee/multiscreenshare/view/g;-><init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    return-void
.end method

.method private synthetic l0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->x0()V

    return-void
.end method

.method private synthetic n0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->x0()V

    return-void
.end method

.method static synthetic p0(Ljava/lang/String;ILd/a/d;)V
    .locals 2

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07007b

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    const/high16 v1, -0x1000000

    invoke-static {p0, p1, v1, v0}, Lb/a/a/a/a;->c(Ljava/lang/String;IILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-interface {p2, p0}, Ld/a/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic q0(Ljava/lang/String;ILd/a/d;)V
    .locals 2

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->c()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070083

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    const/high16 v1, -0x1000000

    invoke-static {p0, p1, v1, v0}, Lb/a/a/a/a;->c(Ljava/lang/String;IILandroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-interface {p2, p0}, Ld/a/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic r0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0}, Lcom/homwee/multiscreenshare/m;->b(Landroidx/fragment/app/e;)Lcom/homwee/multiscreenshare/p;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/homwee/multiscreenshare/p;->F(Landroid/graphics/Bitmap;)Lcom/homwee/multiscreenshare/o;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lcom/homwee/multiscreenshare/o;->L0(Z)Lcom/homwee/multiscreenshare/o;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/j;->n0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    return-void
.end method

.method private synthetic t0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0}, Lcom/homwee/multiscreenshare/m;->b(Landroidx/fragment/app/e;)Lcom/homwee/multiscreenshare/p;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/homwee/multiscreenshare/p;->F(Landroid/graphics/Bitmap;)Lcom/homwee/multiscreenshare/o;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lcom/homwee/multiscreenshare/o;->L0(Z)Lcom/homwee/multiscreenshare/o;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/j;->n0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    return-void
.end method

.method private synthetic v0()V
    .locals 3

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->t:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/homwee/multiscreenshare/view/e;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/homwee/multiscreenshare/view/e;->f(Z)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->A:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/g;->a(Landroid/view/View;)V

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->w:Lcom/homwee/multiscreenshare/q/a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$h;->i()V

    return-void
.end method

.method private y0()V
    .locals 3

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.homwee.intent.action.RemoteConfigReceiver"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->R:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "com.google.android.tv.intent.action.USER_DEVICE_NAME_UPDATED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->S:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "com.changhong.mmp.stop_by_kill"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->T:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->V:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->W:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v1, v0}, Landroid/app/Activity;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    invoke-static {p0}, La/n/a/a;->b(Landroid/content/Context;)La/n/a/a;

    move-result-object v0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->U:Landroid/content/BroadcastReceiver;

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "ACTION_FINISH_SELF"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, v1}, La/n/a/a;->c(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method private z0()V
    .locals 4

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.changhong.mmp.check_need_exit_airplay"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.homwee.multiscreenshare"

    const-string v3, "com.homwee.multiscreenshare.AirPlayStopReceiver"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    const-string p0, "send stop mmp airplay broadcast"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method A0()V
    .locals 7

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->d0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const-string v2, "user_device_name"

    invoke-static {v1, v2}, Landroid/provider/Settings$System;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "SmartTV"

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x10

    if-le v3, v4, :cond_c

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0xc

    const/16 v5, 0xe

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0xf

    const/16 v5, 0x11

    invoke-virtual {v0, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ",brand:"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Landroid/os/Build;->BRAND:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ",ma:"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    const-string v3, "jiri"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    const-string v3, "CHIQ"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    if-nez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "B8U"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :goto_2
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_5

    :cond_1
    const-string v3, "PHILIPS"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Screeneo U5"

    goto :goto_0

    :cond_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_2

    :cond_3
    sget-object v3, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v4, "Thor T50"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    if-nez v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_3
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_2

    :cond_5
    const-string v4, "Thor T60"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    if-nez v1, :cond_6

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_3

    :cond_6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_2

    :cond_7
    const-string v4, "Thor Laser TV"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_9

    if-nez v1, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_3

    :cond_8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_2

    :cond_9
    if-nez v1, :cond_d

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_a
    if-nez v1, :cond_b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_0

    :cond_b
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    goto/16 :goto_2

    :cond_c
    if-nez v1, :cond_d

    move-object v1, v2

    :cond_d
    :goto_4
    move-object v0, v1

    :goto_5
    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->B:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->N:Ljava/lang/String;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->J:Landroidx/lifecycle/l;

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_e

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->J:Landroidx/lifecycle/l;

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_e
    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->J:Landroidx/lifecycle/l;

    invoke-virtual {p0, v0}, Landroidx/lifecycle/l;->j(Ljava/lang/Object;)V

    :cond_f
    return-void
.end method

.method public B0()V
    .locals 8

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "wifi"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/wifi/WifiManager;

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v3

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v1

    :goto_0
    if-eqz v0, :cond_1

    const/4 v6, 0x3

    invoke-virtual {v0, v6}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v6

    if-eqz v6, :cond_1

    move v1, v4

    :cond_1
    if-eqz v0, :cond_2

    const/16 v4, 0xc

    invoke-virtual {v0, v4}, Landroid/net/NetworkCapabilities;->hasCapability(I)Z

    move-result v0

    :cond_2
    const v0, 0x7f070078

    const v4, 0x7f070080

    const v6, 0x7f070082

    const-string v7, ""

    if-eqz v3, :cond_5

    const v3, 0x7f070097

    if-eqz v5, :cond_3

    const-string v0, "wifi status step , wifi open, wifi connect"

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getIpAddress()I

    move-result v1

    invoke-static {v1}, Lcom/homwee/multiscreenshare/r/d;->b(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSSID()Ljava/lang/String;

    move-result-object v0

    const-string v2, "\""

    invoke-virtual {v0, v2, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->C:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_3

    :cond_3
    if-eqz v1, :cond_4

    const-string v1, "wifi status step , wifi open, eth connect"

    goto :goto_2

    :cond_4
    const-string v0, "wifi status step , wifi open, no wifi no eth"

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->C:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/homwee/multiscreenshare/r/d;->a()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_5
    if-eqz v1, :cond_6

    const-string v1, "wifi status step , wifi close, but eth connect"

    :goto_2
    invoke-static {v1}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    invoke-static {}, Lcom/homwee/multiscreenshare/r/d;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->G:Landroid/widget/ImageView;

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_4

    :cond_6
    const-string v0, "wifi status step , wifi close, no wifi no eth"

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->C:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/homwee/multiscreenshare/r/d;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->F:Landroid/widget/ImageView;

    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_3
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->G:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_4
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->I:Landroidx/lifecycle/l;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->I:Landroidx/lifecycle/l;

    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    :cond_7
    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->I:Landroidx/lifecycle/l;

    invoke-virtual {p0, v1}, Landroidx/lifecycle/l;->j(Ljava/lang/Object;)V

    :cond_8
    return-void
.end method

.method public E0()V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.mediatek.androidbox.MiracastService"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.mediatek.androidbox"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->stopService(Landroid/content/Intent;)Z

    return-void
.end method

.method public a0(Landroid/widget/ImageView;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "&device="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->J:Landroidx/lifecycle/l;

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&ip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->I:Landroidx/lifecycle/l;

    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u751f\u6210\u4e8c\u7ef4\u7801Bitmap,content="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/homwee/multiscreenshare/r/e;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->K:Ld/a/j/a;

    const/high16 v2, 0x42f00000    # 120.0f

    invoke-static {v2}, Lcom/blankj/utilcode/util/i;->a(F)I

    move-result v2

    invoke-direct {p0, v0, v2}, Lcom/homwee/multiscreenshare/MainActivity;->Z(Ljava/lang/String;I)Ld/a/c;

    move-result-object v0

    invoke-static {}, Ld/a/i/b/a;->a()Ld/a/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Ld/a/c;->d(Ld/a/h;)Ld/a/c;

    move-result-object v0

    new-instance v2, Lcom/homwee/multiscreenshare/g;

    invoke-direct {v2, p0, p1}, Lcom/homwee/multiscreenshare/g;-><init>(Lcom/homwee/multiscreenshare/MainActivity;Landroid/widget/ImageView;)V

    invoke-virtual {v0, v2}, Ld/a/c;->f(Ld/a/l/d;)Ld/a/j/b;

    move-result-object p0

    invoke-virtual {v1, p0}, Ld/a/j/a;->d(Ld/a/j/b;)Z

    return-void
.end method

.method public b0(Landroid/widget/ImageView;)V
    .locals 5

    new-instance v0, Lc/a/a/e;

    invoke-direct {v0}, Lc/a/a/e;-><init>()V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    const-string v2, "1"

    const-string v3, "0"

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getScreenShareTag()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v2

    goto :goto_1

    :cond_1
    :goto_0
    move-object v1, v3

    :goto_1
    const-string v4, "isShareOK"

    invoke-virtual {v0, v4, v1}, Lc/a/a/e;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getDlnaTag()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    move-object v2, v3

    :cond_3
    const-string v1, "isDlnaOK"

    invoke-virtual {v0, v1, v2}, Lc/a/a/e;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    const-string v2, "&remoteconfig="

    const-string v3, "&ip="

    if-eqz v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "https://play.google.com/store/apps/details?id=com.homwee.tv.chremotecontralkajito&device="

    goto :goto_2

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "https://play.google.com/store/apps/details?id=com.homwee.tv.chremotecontral&hl=zh&gl=US&device="

    :goto_2
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/homwee/multiscreenshare/MainActivity;->J:Landroidx/lifecycle/l;

    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/homwee/multiscreenshare/MainActivity;->I:Landroidx/lifecycle/l;

    invoke-virtual {v3}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lc/a/a/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u751f\u6210\u4e8c\u7ef4\u7801Bitmap,content="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/homwee/multiscreenshare/r/e;->b(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->K:Ld/a/j/a;

    const/high16 v2, 0x43020000    # 130.0f

    invoke-static {v2}, Lcom/blankj/utilcode/util/i;->a(F)I

    move-result v2

    invoke-direct {p0, v0, v2}, Lcom/homwee/multiscreenshare/MainActivity;->Z(Ljava/lang/String;I)Ld/a/c;

    move-result-object v0

    invoke-static {}, Ld/a/i/b/a;->a()Ld/a/h;

    move-result-object v2

    invoke-virtual {v0, v2}, Ld/a/c;->d(Ld/a/h;)Ld/a/c;

    move-result-object v0

    new-instance v2, Lcom/homwee/multiscreenshare/k;

    invoke-direct {v2, p0, p1}, Lcom/homwee/multiscreenshare/k;-><init>(Lcom/homwee/multiscreenshare/MainActivity;Landroid/widget/ImageView;)V

    invoke-virtual {v0, v2}, Ld/a/c;->f(Ld/a/l/d;)Ld/a/j/b;

    move-result-object p0

    invoke-virtual {v1, p0}, Ld/a/j/a;->d(Ld/a/j/b;)Z

    return-void
.end method

.method public k0()Z
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

.method public synthetic m0(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/MainActivity;->l0(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic o0(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/MainActivity;->n0(Ljava/lang/String;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    const v0, 0x7f0b001c

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->setContentView(I)V

    iput-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    const v0, 0x7f0801dd

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->B:Landroid/widget/TextView;

    const v0, 0x7f0801df

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->C:Landroid/widget/TextView;

    const v0, 0x7f0800f3

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->F:Landroid/widget/ImageView;

    const v0, 0x7f0801db

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->E:Landroid/widget/TextView;

    const v0, 0x7f0800f0

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->G:Landroid/widget/ImageView;

    const v0, 0x7f0801dc

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->D:Landroid/widget/TextView;

    const-string v0, "PangoRemoteMode"

    const-string v1, "PREnabled"

    invoke-static {v0, v1}, Lcom/homwee/multiscreenshare/MyApplication;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->A0()V

    if-eqz v0, :cond_2

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v1, "AIWA"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->j0()V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->h0()V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->f0()V

    :goto_1
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->g0()V

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->i0()V

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0b001c

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    iput-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->O:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    check-cast p1, Lcom/homwee/multiscreenshare/MyApplication;

    new-instance p1, Lcom/homwee/multiscreenshare/MyApplication;

    invoke-direct {p1}, Lcom/homwee/multiscreenshare/MyApplication;-><init>()V

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->Q:Lcom/homwee/multiscreenshare/MyApplication;

    invoke-virtual {p1}, Lcom/homwee/multiscreenshare/MyApplication;->e()Z

    move-result p1

    iput-boolean p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    const p1, 0x7f0801dd

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->B:Landroid/widget/TextView;

    const p1, 0x7f0801df

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->C:Landroid/widget/TextView;

    const p1, 0x7f0800f3

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->F:Landroid/widget/ImageView;

    const p1, 0x7f0801db

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->E:Landroid/widget/TextView;

    const p1, 0x7f0800f0

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->G:Landroid/widget/ImageView;

    const p1, 0x7f0801dc

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->D:Landroid/widget/TextView;

    const p1, 0x7f0800f8

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->H:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-boolean v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->P:Z

    if-eqz v0, :cond_0

    const v0, 0x7f050071

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    goto :goto_0

    :cond_0
    const v0, 0x7f07005e

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    :goto_0
    iput-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->z:Landroid/content/Context;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object p1, Lcom/homwee/multiscreenshare/MainActivity;->s:Ljava/lang/Boolean;

    invoke-static {}, Lcom/homwee/multiscreenshare/r/f;->b()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    move-result-object p1

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity;->L:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;

    const-string p1, "PangoRemoteMode"

    const-string v0, "PREnabled"

    invoke-static {p1, v0}, Lcom/homwee/multiscreenshare/MyApplication;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->A0()V

    if-eqz p1, :cond_3

    const-string v0, "1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v0, "AIWA"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->j0()V

    goto :goto_2

    :cond_2
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->h0()V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->f0()V

    :goto_2
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->g0()V

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->i0()V

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->y0()V

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->W()V

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->B0()V

    const-string p0, "onCreate Step 1"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 4

    const-string v0, "MultiScreenShare onDestroy"

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/appcompat/app/c;->onDestroy()V

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->z0()V

    const-string v0, "FACTORY_CONFIG"

    const-string v1, "FORCE_HDCP2X"

    invoke-static {v0, v1}, Lcom/homwee/multiscreenshare/MyApplication;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ro.board.platform"

    invoke-static {v1}, Lcom/homwee/multiscreenshare/MainActivity;->e0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "platForm = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    if-eqz v1, :cond_0

    const-string v2, "mt5867"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_1

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->E0()V

    :cond_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Lcom/homwee/multiscreenshare/MainActivity;->s:Ljava/lang/Boolean;

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.changhong.STOP_DLNA_AIR_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->sendBroadcast(Landroid/content/Intent;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->R:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->S:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->T:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->V:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->W:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    invoke-static {p0}, La/n/a/a;->b(Landroid/content/Context;)La/n/a/a;

    move-result-object v0

    iget-object v1, p0, Lcom/homwee/multiscreenshare/MainActivity;->U:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, La/n/a/a;->e(Landroid/content/BroadcastReceiver;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->K:Ld/a/j/a;

    invoke-virtual {v0}, Ld/a/j/a;->f()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity;->K:Ld/a/j/a;

    invoke-virtual {p0}, Ld/a/j/a;->c()V

    :cond_2
    const-string p0, "onDestroy Step 6"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p0

    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onKeyDown~~~~~keyCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ScanCode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    const/16 v0, 0x52

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v0

    const/16 v1, 0x7a

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/appcompat/app/c;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method protected onNewIntent(Landroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/e;->onNewIntent(Landroid/content/Intent;)V

    const-string p0, "onNewIntent Step 8"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method protected onPause()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/e;->onPause()V

    const-string p0, "onPause Step 4"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method protected onRestart()V
    .locals 0

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    const-string p0, "onRestart Step 7"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method protected onResume()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/e;->onResume()V

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->C0()V

    const-string v0, "FACTORY_CONFIG"

    const-string v1, "FORCE_HDCP2X"

    invoke-static {v0, v1}, Lcom/homwee/multiscreenshare/MyApplication;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ro.board.platform"

    invoke-static {v1}, Lcom/homwee/multiscreenshare/MainActivity;->e0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "mt5867"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_1

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->D0()V

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->X()V

    :cond_1
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->Y()V

    const-string p0, "onResume Start Service"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    const-string p0, "onResume Step 3"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method protected onStart()V
    .locals 0

    invoke-super {p0}, Landroidx/appcompat/app/c;->onStart()V

    const-string p0, "onStart Step 2"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method protected onStop()V
    .locals 3

    invoke-super {p0}, Landroidx/appcompat/app/c;->onStop()V

    const-string v0, "FACTORY_CONFIG"

    const-string v1, "FORCE_HDCP2X"

    invoke-static {v0, v1}, Lcom/homwee/multiscreenshare/MyApplication;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ro.board.platform"

    invoke-static {v1}, Lcom/homwee/multiscreenshare/MainActivity;->e0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "mt5867"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_1

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->F0()V

    :cond_1
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->G0()V

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->z0()V

    const-string p0, "onStop Step 5"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic s0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/homwee/multiscreenshare/MainActivity;->r0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public synthetic u0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/homwee/multiscreenshare/MainActivity;->t0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public synthetic w0()V
    .locals 0

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/MainActivity;->v0()V

    return-void
.end method

.method public x0()V
    .locals 6

    const-string v0, "FACTORY_CONFIG"

    const-string v1, "FORCE_HDCP2X"

    invoke-static {v0, v1}, Lcom/homwee/multiscreenshare/MyApplication;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ro.board.platform"

    invoke-static {v1}, Lcom/homwee/multiscreenshare/MainActivity;->e0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->J:Landroidx/lifecycle/l;

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->I:Landroidx/lifecycle/l;

    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "wifi changed ip="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/homwee/multiscreenshare/MainActivity;->I:Landroidx/lifecycle/l;

    invoke-virtual {v4}, Landroidx/lifecycle/LiveData;->e()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/homwee/multiscreenshare/r/e;->b(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/homwee/multiscreenshare/r/e;->b(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-le v2, v3, :cond_5

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const-string v4, "mt5867"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/homwee/multiscreenshare/MainActivity;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    :goto_1
    check-cast v0, Lcom/homwee/multiscreenshare/view/g;

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/view/g;->k()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/view/g;->m()Ljava/lang/String;

    move-result-object v4

    const-string v5, "screen_share_tag"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-le v4, v3, :cond_3

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v3

    :cond_2
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/homwee/multiscreenshare/view/f;

    instance-of v4, v2, Lcom/homwee/multiscreenshare/view/b;

    if-eqz v4, :cond_3

    check-cast v2, Lcom/homwee/multiscreenshare/view/b;

    invoke-virtual {v2}, Lcom/homwee/multiscreenshare/view/b;->c()V

    :cond_3
    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/view/g;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x2

    if-le v0, v2, :cond_5

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/MainActivity;->k0()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p0

    sub-int/2addr p0, v2

    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    goto :goto_2

    :cond_4
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    :goto_2
    check-cast p0, Lcom/homwee/multiscreenshare/view/f;

    instance-of v0, p0, Lcom/homwee/multiscreenshare/view/c;

    if-eqz v0, :cond_5

    check-cast p0, Lcom/homwee/multiscreenshare/view/c;

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/view/c;->c()V

    :cond_5
    return-void
.end method
