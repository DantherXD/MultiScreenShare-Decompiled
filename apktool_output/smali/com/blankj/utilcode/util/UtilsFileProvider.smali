.class public Lcom/blankj/utilcode/util/UtilsFileProvider;
.super La/g/d/b;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/g/d/b;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()Z
    .locals 0

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    check-cast p0, Landroid/app/Application;

    invoke-static {p0}, Lcom/blankj/utilcode/util/k;->b(Landroid/app/Application;)V

    const/4 p0, 0x1

    return p0
.end method
