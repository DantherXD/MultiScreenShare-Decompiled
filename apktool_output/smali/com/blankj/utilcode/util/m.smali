.class Lcom/blankj/utilcode/util/m;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static a(F)I
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/i;->a(F)I

    move-result p0

    return p0
.end method

.method static b(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p0}, Lcom/blankj/utilcode/util/c;->a(Landroid/app/Activity;)V

    return-void
.end method

.method static c()I
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/h;->a()I

    move-result v0

    return v0
.end method

.method static d()Landroid/app/Application;
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/l;->b:Lcom/blankj/utilcode/util/l;

    invoke-virtual {v0}, Lcom/blankj/utilcode/util/l;->f()Landroid/app/Application;

    move-result-object v0

    return-object v0
.end method

.method static e()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/blankj/utilcode/util/f;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static f(Lcom/blankj/utilcode/util/e$a;Lcom/blankj/utilcode/util/k$b;)Landroid/app/Notification;
    .locals 0
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

    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/e;->a(Lcom/blankj/utilcode/util/e$a;Lcom/blankj/utilcode/util/k$b;)Landroid/app/Notification;

    move-result-object p0

    return-object p0
.end method

.method static g()Lcom/blankj/utilcode/util/g;
    .locals 1

    const-string v0, "Utils"

    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->a(Ljava/lang/String;)Lcom/blankj/utilcode/util/g;

    move-result-object v0

    return-object v0
.end method

.method static h(Landroid/app/Application;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/l;->b:Lcom/blankj/utilcode/util/l;

    invoke-virtual {v0, p0}, Lcom/blankj/utilcode/util/l;->g(Landroid/app/Application;)V

    return-void
.end method

.method static i()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Runnable;

    invoke-static {}, Lcom/blankj/utilcode/util/a;->f()Ljava/lang/Runnable;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/blankj/utilcode/util/m;->j([Ljava/lang/Runnable;)V

    return-void
.end method

.method private static varargs j([Ljava/lang/Runnable;)V
    .locals 4

    array-length v0, p0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p0, v1

    invoke-static {}, Lcom/blankj/utilcode/util/j;->b()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method static k(Ljava/lang/Runnable;J)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/blankj/utilcode/util/j;->e(Ljava/lang/Runnable;J)V

    return-void
.end method

.method static l(Landroid/app/Application;)V
    .locals 1

    sget-object v0, Lcom/blankj/utilcode/util/l;->b:Lcom/blankj/utilcode/util/l;

    invoke-virtual {v0, p0}, Lcom/blankj/utilcode/util/l;->l(Landroid/app/Application;)V

    return-void
.end method
