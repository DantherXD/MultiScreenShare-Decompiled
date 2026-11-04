.class Lcom/bumptech/glide/load/q/d/l$c;
.super Lcom/bumptech/glide/load/q/d/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/q/d/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/bumptech/glide/load/q/d/l;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IIII)Lcom/bumptech/glide/load/q/d/l$g;
    .locals 1

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/load/q/d/l$c;->b(IIII)F

    move-result p0

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float p0, p0, v0

    if-nez p0, :cond_0

    sget-object p0, Lcom/bumptech/glide/load/q/d/l$g;->c:Lcom/bumptech/glide/load/q/d/l$g;

    goto :goto_0

    :cond_0
    sget-object p0, Lcom/bumptech/glide/load/q/d/l;->c:Lcom/bumptech/glide/load/q/d/l;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/load/q/d/l;->a(IIII)Lcom/bumptech/glide/load/q/d/l$g;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public b(IIII)F
    .locals 0

    sget-object p0, Lcom/bumptech/glide/load/q/d/l;->c:Lcom/bumptech/glide/load/q/d/l;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/load/q/d/l;->b(IIII)F

    move-result p0

    const/high16 p1, 0x3f800000    # 1.0f

    invoke-static {p1, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    return p0
.end method
