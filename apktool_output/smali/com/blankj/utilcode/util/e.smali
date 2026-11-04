.class public Lcom/blankj/utilcode/util/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/blankj/utilcode/util/e$a;
    }
.end annotation


# direct methods
.method public static a(Lcom/blankj/utilcode/util/e$a;Lcom/blankj/utilcode/util/k$b;)Landroid/app/Notification;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/blankj/utilcode/util/e$a;",
            "Lcom/blankj/utilcode/util/k$b<",
            "Landroidx/core/app/f$c;",
            ">;)",
            "Landroid/app/Notification;"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    invoke-static {}, Lcom/blankj/utilcode/util/k;->a()Landroid/app/Application;

    move-result-object v2

    const-string v3, "notification"

    invoke-virtual {v2, v3}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/NotificationManager;

    invoke-virtual {p0}, Lcom/blankj/utilcode/util/e$a;->b()Landroid/app/NotificationChannel;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    new-instance v2, Landroidx/core/app/f$c;

    invoke-static {}, Lcom/blankj/utilcode/util/k;->a()Landroid/app/Application;

    move-result-object v3

    invoke-direct {v2, v3}, Landroidx/core/app/f$c;-><init>(Landroid/content/Context;)V

    if-lt v0, v1, :cond_1

    invoke-static {p0}, Lcom/blankj/utilcode/util/e$a;->a(Lcom/blankj/utilcode/util/e$a;)Landroid/app/NotificationChannel;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/NotificationChannel;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Landroidx/core/app/f$c;->c(Ljava/lang/String;)Landroidx/core/app/f$c;

    :cond_1
    if-eqz p1, :cond_2

    invoke-interface {p1, v2}, Lcom/blankj/utilcode/util/k$b;->a(Ljava/lang/Object;)V

    :cond_2
    invoke-virtual {v2}, Landroidx/core/app/f$c;->a()Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method
