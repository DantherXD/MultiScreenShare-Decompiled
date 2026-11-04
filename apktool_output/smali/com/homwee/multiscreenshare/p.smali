.class public Lcom/homwee/multiscreenshare/p;
.super Lcom/bumptech/glide/k;
.source ""


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/k;-><init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Class;)Lcom/homwee/multiscreenshare/o;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResourceType:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TResourceType;>;)",
            "Lcom/homwee/multiscreenshare/o<",
            "TResourceType;>;"
        }
    .end annotation

    new-instance v0, Lcom/homwee/multiscreenshare/o;

    iget-object v1, p0, Lcom/bumptech/glide/k;->e:Lcom/bumptech/glide/c;

    iget-object v2, p0, Lcom/bumptech/glide/k;->f:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p1, v2}, Lcom/homwee/multiscreenshare/o;-><init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/k;Ljava/lang/Class;Landroid/content/Context;)V

    return-object v0
.end method

.method public D()Lcom/homwee/multiscreenshare/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/homwee/multiscreenshare/o<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/bumptech/glide/k;->m()Lcom/bumptech/glide/j;

    move-result-object p0

    check-cast p0, Lcom/homwee/multiscreenshare/o;

    return-object p0
.end method

.method public E()Lcom/homwee/multiscreenshare/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/homwee/multiscreenshare/o<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lcom/bumptech/glide/k;->n()Lcom/bumptech/glide/j;

    move-result-object p0

    check-cast p0, Lcom/homwee/multiscreenshare/o;

    return-object p0
.end method

.method public F(Landroid/graphics/Bitmap;)Lcom/homwee/multiscreenshare/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            ")",
            "Lcom/homwee/multiscreenshare/o<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/bumptech/glide/k;->s(Landroid/graphics/Bitmap;)Lcom/bumptech/glide/j;

    move-result-object p0

    check-cast p0, Lcom/homwee/multiscreenshare/o;

    return-object p0
.end method

.method public G(Ljava/lang/Integer;)Lcom/homwee/multiscreenshare/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/homwee/multiscreenshare/o<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/bumptech/glide/k;->t(Ljava/lang/Integer;)Lcom/bumptech/glide/j;

    move-result-object p0

    check-cast p0, Lcom/homwee/multiscreenshare/o;

    return-object p0
.end method

.method public bridge synthetic l(Ljava/lang/Class;)Lcom/bumptech/glide/j;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/homwee/multiscreenshare/p;->C(Ljava/lang/Class;)Lcom/homwee/multiscreenshare/o;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic m()Lcom/bumptech/glide/j;
    .locals 0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/p;->D()Lcom/homwee/multiscreenshare/o;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic n()Lcom/bumptech/glide/j;
    .locals 0

    invoke-virtual {p0}, Lcom/homwee/multiscreenshare/p;->E()Lcom/homwee/multiscreenshare/o;

    move-result-object p0

    return-object p0
.end method

.method protected y(Lcom/bumptech/glide/r/f;)V
    .locals 1

    instance-of v0, p1, Lcom/homwee/multiscreenshare/n;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/homwee/multiscreenshare/n;

    invoke-direct {v0}, Lcom/homwee/multiscreenshare/n;-><init>()V

    invoke-virtual {v0, p1}, Lcom/homwee/multiscreenshare/n;->f0(Lcom/bumptech/glide/r/a;)Lcom/homwee/multiscreenshare/n;

    move-result-object p1

    :goto_0
    invoke-super {p0, p1}, Lcom/bumptech/glide/k;->y(Lcom/bumptech/glide/r/f;)V

    return-void
.end method
