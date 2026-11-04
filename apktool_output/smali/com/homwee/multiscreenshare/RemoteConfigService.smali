.class public Lcom/homwee/multiscreenshare/RemoteConfigService;
.super Landroid/app/Service;
.source ""


# instance fields
.field private b:Lcom/google/firebase/remoteconfig/i;

.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/homwee/multiscreenshare/RemoteConfigService;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/homwee/multiscreenshare/RemoteConfigService;)V
    .locals 0

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/RemoteConfigService;->e()V

    return-void
.end method

.method private b()V
    .locals 4

    new-instance v0, Landroid/app/NotificationChannel;

    const-string v1, "FOREGROUND_SERVICE_ID"

    const-string v2, "FOREGROUND_SERVICE_NAME"

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/app/NotificationChannel;->setLockscreenVisibility(I)V

    const-string v3, "notification"

    invoke-virtual {p0, v3}, Landroid/app/Service;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/NotificationManager;

    invoke-virtual {v3, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    new-instance v0, Landroid/app/Notification$Builder;

    invoke-direct {v0, p0, v1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const v1, 0x7f070056

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    move-result-object v0

    const-string v3, "ContentText"

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    const-string v3, "SubText"

    invoke-virtual {v0, v3}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Service;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v3, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v0

    const-string v1, "ContentTitle"

    invoke-virtual {v0, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, v2, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    return-void
.end method

.method private c()V
    .locals 2

    invoke-static {}, Lcom/google/firebase/remoteconfig/i;->d()Lcom/google/firebase/remoteconfig/i;

    move-result-object v0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/RemoteConfigService;->b:Lcom/google/firebase/remoteconfig/i;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/i;->c()Lc/b/a/a/c/h;

    move-result-object v0

    new-instance v1, Lcom/homwee/multiscreenshare/RemoteConfigService$a;

    invoke-direct {v1, p0}, Lcom/homwee/multiscreenshare/RemoteConfigService$a;-><init>(Lcom/homwee/multiscreenshare/RemoteConfigService;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/c/h;->b(Lc/b/a/a/c/c;)Lc/b/a/a/c/h;

    return-void
.end method

.method private d()Ljava/lang/String;
    .locals 1

    iget-object p0, p0, Lcom/homwee/multiscreenshare/RemoteConfigService;->c:Landroid/content/Context;

    const-string v0, "activity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager;

    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/app/ActivityManager$RunningTaskInfo;

    iget-object p0, p0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {p0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "No running tasks"

    return-object p0
.end method

.method private e()V
    .locals 3

    new-instance v0, Lc/a/a/e;

    invoke-direct {v0}, Lc/a/a/e;-><init>()V

    iget-object v1, p0, Lcom/homwee/multiscreenshare/RemoteConfigService;->b:Lcom/google/firebase/remoteconfig/i;

    const-string v2, "airplay_test"

    invoke-virtual {v1, v2}, Lcom/google/firebase/remoteconfig/i;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/a;->e(Ljava/lang/String;)Lc/a/a/e;

    move-result-object v1

    const-string v2, "airplay"

    invoke-virtual {v0, v2, v1}, Lc/a/a/e;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/RemoteConfigService;->b:Lcom/google/firebase/remoteconfig/i;

    const-string v2, "screen_share_test"

    invoke-virtual {v1, v2}, Lcom/google/firebase/remoteconfig/i;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/a;->e(Ljava/lang/String;)Lc/a/a/e;

    move-result-object v1

    const-string v2, "screen_share"

    invoke-virtual {v0, v2, v1}, Lc/a/a/e;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/RemoteConfigService;->b:Lcom/google/firebase/remoteconfig/i;

    const-string v2, "dlna_config_test"

    invoke-virtual {v1, v2}, Lcom/google/firebase/remoteconfig/i;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/a;->e(Ljava/lang/String;)Lc/a/a/e;

    move-result-object v1

    const-string v2, "dlna_config"

    invoke-virtual {v0, v2, v1}, Lc/a/a/e;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/homwee/multiscreenshare/RemoteConfigService;->b:Lcom/google/firebase/remoteconfig/i;

    const-string v2, "ad_config_test"

    invoke-virtual {v1, v2}, Lcom/google/firebase/remoteconfig/i;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/a;->e(Ljava/lang/String;)Lc/a/a/e;

    move-result-object v1

    const-string v2, "ad_config"

    invoke-virtual {v0, v2, v1}, Lc/a/a/e;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Remote config:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lc/a/a/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    invoke-virtual {v0}, Lc/a/a/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/homwee/multiscreenshare/RemoteConfigService;->f(Ljava/lang/String;)V

    return-void
.end method

.method private f(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, Lcom/homwee/multiscreenshare/r/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, "saveRemoteConfig"

    invoke-static {v0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/homwee/multiscreenshare/r/f;->c(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.homwee.intent.action.RemoteConfigReceiver"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/app/Service;->sendBroadcast(Landroid/content/Intent;)V

    new-instance v0, Lcom/homwee/multiscreenshare/remoteprovider/b;

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->c()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/homwee/multiscreenshare/remoteprovider/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "remoteconfig"

    invoke-virtual {v1, v2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "delete from autopair"

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string p1, "autopair"

    invoke-virtual {v0, p1, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    :cond_1
    invoke-direct {p0}, Lcom/homwee/multiscreenshare/RemoteConfigService;->d()Ljava/lang/String;

    move-result-object p1

    const-string v0, "com.homwee.mmp.screenshare"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "com.homwee.multiscreenshare"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result p0

    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :goto_0
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-virtual {p0}, Landroid/app/Service;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/RemoteConfigService;->c:Landroid/content/Context;

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/RemoteConfigService;->b()V

    invoke-direct {p0}, Lcom/homwee/multiscreenshare/RemoteConfigService;->c()V

    return-void
.end method

.method public onDestroy()V
    .locals 0

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result p0

    return p0
.end method
