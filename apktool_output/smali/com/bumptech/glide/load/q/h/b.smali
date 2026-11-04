.class public final Lcom/bumptech/glide/load/q/h/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/bumptech/glide/n/a$a;


# instance fields
.field private final a:Lcom/bumptech/glide/load/o/a0/e;

.field private final b:Lcom/bumptech/glide/load/o/a0/b;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/o/a0/e;Lcom/bumptech/glide/load/o/a0/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/load/q/h/b;->a:Lcom/bumptech/glide/load/o/a0/e;

    iput-object p2, p0, Lcom/bumptech/glide/load/q/h/b;->b:Lcom/bumptech/glide/load/o/a0/b;

    return-void
.end method


# virtual methods
.method public a(I)[I
    .locals 1

    iget-object p0, p0, Lcom/bumptech/glide/load/q/h/b;->b:Lcom/bumptech/glide/load/o/a0/b;

    if-nez p0, :cond_0

    new-array p0, p1, [I

    return-object p0

    :cond_0
    const-class v0, [I

    invoke-interface {p0, p1, v0}, Lcom/bumptech/glide/load/o/a0/b;->d(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [I

    return-object p0
.end method

.method public b(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/load/q/h/b;->a:Lcom/bumptech/glide/load/o/a0/e;

    invoke-interface {p0, p1, p2, p3}, Lcom/bumptech/glide/load/o/a0/e;->e(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public c([B)V
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/load/q/h/b;->b:Lcom/bumptech/glide/load/o/a0/b;

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0, p1}, Lcom/bumptech/glide/load/o/a0/b;->put(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Landroid/graphics/Bitmap;)V
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/load/q/h/b;->a:Lcom/bumptech/glide/load/o/a0/e;

    invoke-interface {p0, p1}, Lcom/bumptech/glide/load/o/a0/e;->d(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public e(I)[B
    .locals 1

    iget-object p0, p0, Lcom/bumptech/glide/load/q/h/b;->b:Lcom/bumptech/glide/load/o/a0/b;

    if-nez p0, :cond_0

    new-array p0, p1, [B

    return-object p0

    :cond_0
    const-class v0, [B

    invoke-interface {p0, p1, v0}, Lcom/bumptech/glide/load/o/a0/b;->d(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [B

    return-object p0
.end method

.method public f([I)V
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/load/q/h/b;->b:Lcom/bumptech/glide/load/o/a0/b;

    if-nez p0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0, p1}, Lcom/bumptech/glide/load/o/a0/b;->put(Ljava/lang/Object;)V

    return-void
.end method
