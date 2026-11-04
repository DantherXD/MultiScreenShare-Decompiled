.class public Lcom/bumptech/glide/load/q/h/e;
.super Lcom/bumptech/glide/load/q/f/b;
.source ""

# interfaces
.implements Lcom/bumptech/glide/load/o/r;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bumptech/glide/load/q/f/b<",
        "Lcom/bumptech/glide/load/q/h/c;",
        ">;",
        "Lcom/bumptech/glide/load/o/r;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/q/h/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/q/f/b;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/load/q/f/b;->b:Landroid/graphics/drawable/Drawable;

    check-cast p0, Lcom/bumptech/glide/load/q/h/c;

    invoke-virtual {p0}, Lcom/bumptech/glide/load/q/h/c;->i()I

    move-result p0

    return p0
.end method

.method public c()V
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/load/q/f/b;->b:Landroid/graphics/drawable/Drawable;

    check-cast p0, Lcom/bumptech/glide/load/q/h/c;

    invoke-virtual {p0}, Lcom/bumptech/glide/load/q/h/c;->e()Landroid/graphics/Bitmap;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void
.end method

.method public d()Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "Lcom/bumptech/glide/load/q/h/c;",
            ">;"
        }
    .end annotation

    const-class p0, Lcom/bumptech/glide/load/q/h/c;

    return-object p0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/q/f/b;->b:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lcom/bumptech/glide/load/q/h/c;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/q/h/c;->stop()V

    iget-object p0, p0, Lcom/bumptech/glide/load/q/f/b;->b:Landroid/graphics/drawable/Drawable;

    check-cast p0, Lcom/bumptech/glide/load/q/h/c;

    invoke-virtual {p0}, Lcom/bumptech/glide/load/q/h/c;->k()V

    return-void
.end method
