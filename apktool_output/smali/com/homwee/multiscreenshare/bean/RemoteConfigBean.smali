.class public Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;
    }
.end annotation


# instance fields
.field private ad_config:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

.field private airplay:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

.field private dlna_config:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

.field private screen_share:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAdTag()Z
    .locals 3

    iget-object v0, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->ad_config:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getBrand()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAd_config()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getBrand()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAd_config()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    move-result-object p0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getCountry()Ljava/util/List;

    move-result-object p0

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    :goto_0
    return v1
.end method

.method public getAd_config()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->ad_config:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    return-object p0
.end method

.method public getAirplay()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->airplay:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    return-object p0
.end method

.method public getAirplayTag()Z
    .locals 3

    iget-object v0, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->airplay:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getBrand()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAirplay()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getBrand()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAirplay()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    move-result-object p0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getCountry()Ljava/util/List;

    move-result-object p0

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public getDlnaTag()Z
    .locals 3

    iget-object v0, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->dlna_config:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getBrand()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getDlna_config()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getBrand()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getDlna_config()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    move-result-object p0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getCountry()Ljava/util/List;

    move-result-object p0

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public getDlna_config()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->dlna_config:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    return-object p0
.end method

.method public getScreenShareTag()Z
    .locals 3

    iget-object v0, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->screen_share:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getBrand()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getScreen_share()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getBrand()Ljava/util/List;

    move-result-object v0

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getScreen_share()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    move-result-object p0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;->getCountry()Ljava/util/List;

    move-result-object p0

    invoke-static {}, Lcom/homwee/multiscreenshare/MyApplication;->d()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    return v1
.end method

.method public getScreen_share()Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->screen_share:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    return-object p0
.end method

.method public setAd_config(Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->ad_config:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    return-void
.end method

.method public setAirplay(Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->airplay:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    return-void
.end method

.method public setDlna_config(Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->dlna_config:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    return-void
.end method

.method public setScreen_share(Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->screen_share:Lcom/homwee/multiscreenshare/bean/RemoteConfigBean$ConfigBean;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getDlnaTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getDlnaTag()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " getScreenShareTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getScreenShareTag()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " getAirplayTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAirplayTag()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " getAdTag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/bean/RemoteConfigBean;->getAdTag()Z

    move-result p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
