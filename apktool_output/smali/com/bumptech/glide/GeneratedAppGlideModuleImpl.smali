.class final Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;
.super Lcom/bumptech/glide/GeneratedAppGlideModule;
.source ""


# instance fields
.field private final a:Lcom/homwee/multiscreenshare/GlideConfigModule;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lcom/bumptech/glide/GeneratedAppGlideModule;-><init>()V

    new-instance p1, Lcom/homwee/multiscreenshare/GlideConfigModule;

    invoke-direct {p1}, Lcom/homwee/multiscreenshare/GlideConfigModule;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lcom/homwee/multiscreenshare/GlideConfigModule;

    const-string p0, "Glide"

    const/4 p1, 0x3

    invoke-static {p0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Discovered AppGlideModule from annotation: com.homwee.multiscreenshare.GlideConfigModule"

    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/i;)V
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lcom/homwee/multiscreenshare/GlideConfigModule;

    invoke-virtual {p0, p1, p2, p3}, Lcom/homwee/multiscreenshare/GlideConfigModule;->a(Landroid/content/Context;Lcom/bumptech/glide/c;Lcom/bumptech/glide/i;)V

    return-void
.end method

.method public b(Landroid/content/Context;Lcom/bumptech/glide/d;)V
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lcom/homwee/multiscreenshare/GlideConfigModule;

    invoke-virtual {p0, p1, p2}, Lcom/homwee/multiscreenshare/GlideConfigModule;->b(Landroid/content/Context;Lcom/bumptech/glide/d;)V

    return-void
.end method

.method public c()Z
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lcom/homwee/multiscreenshare/GlideConfigModule;

    invoke-virtual {p0}, Lcom/bumptech/glide/p/a;->c()Z

    move-result p0

    return p0
.end method

.method public d()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method bridge synthetic e()Lcom/bumptech/glide/o/l$b;
    .locals 0

    invoke-virtual {p0}, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->f()Lcom/bumptech/glide/a;

    move-result-object p0

    return-object p0
.end method

.method f()Lcom/bumptech/glide/a;
    .locals 0

    new-instance p0, Lcom/bumptech/glide/a;

    invoke-direct {p0}, Lcom/bumptech/glide/a;-><init>()V

    return-object p0
.end method
