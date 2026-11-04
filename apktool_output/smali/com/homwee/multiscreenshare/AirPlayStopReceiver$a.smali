.class public Lcom/homwee/multiscreenshare/AirPlayStopReceiver$a;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/homwee/multiscreenshare/AirPlayStopReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/homwee/multiscreenshare/AirPlayStopReceiver;


# direct methods
.method public constructor <init>(Lcom/homwee/multiscreenshare/AirPlayStopReceiver;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/AirPlayStopReceiver$a;->a:Lcom/homwee/multiscreenshare/AirPlayStopReceiver;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "msg:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "multiscreenshare"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x23

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "msg_stop_airplay"

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p0, p0, Lcom/homwee/multiscreenshare/AirPlayStopReceiver$a;->a:Lcom/homwee/multiscreenshare/AirPlayStopReceiver;

    invoke-static {p0}, Lcom/homwee/multiscreenshare/AirPlayStopReceiver;->a(Lcom/homwee/multiscreenshare/AirPlayStopReceiver;)V

    :goto_0
    return-void
.end method
