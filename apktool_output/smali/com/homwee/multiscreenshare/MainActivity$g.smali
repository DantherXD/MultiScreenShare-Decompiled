.class Lcom/homwee/multiscreenshare/MainActivity$g;
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

    iput-object p1, p0, Lcom/homwee/multiscreenshare/MainActivity$g;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "android.intent.action.CLOSE_SYSTEM_DIALOGS"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "2024/12/10 SCREEN OFF FINISH !!!"

    invoke-static {p1}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    iget-object p0, p0, Lcom/homwee/multiscreenshare/MainActivity$g;->a:Lcom/homwee/multiscreenshare/MainActivity;

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method
