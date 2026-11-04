.class Landroidx/appcompat/app/f$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/l/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/app/f;->Q()Landroid/view/ViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/app/f;


# direct methods
.method constructor <init>(Landroidx/appcompat/app/f;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/app/f$c;->a:Landroidx/appcompat/app/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;La/g/l/d0;)La/g/l/d0;
    .locals 3

    invoke-virtual {p2}, La/g/l/d0;->i()I

    move-result v0

    iget-object p0, p0, Landroidx/appcompat/app/f$c;->a:Landroidx/appcompat/app/f;

    const/4 v1, 0x0

    invoke-virtual {p0, p2, v1}, Landroidx/appcompat/app/f;->L0(La/g/l/d0;Landroid/graphics/Rect;)I

    move-result p0

    if-eq v0, p0, :cond_0

    invoke-virtual {p2}, La/g/l/d0;->g()I

    move-result v0

    invoke-virtual {p2}, La/g/l/d0;->h()I

    move-result v1

    invoke-virtual {p2}, La/g/l/d0;->f()I

    move-result v2

    invoke-virtual {p2, v0, p0, v1, v2}, La/g/l/d0;->m(IIII)La/g/l/d0;

    move-result-object p2

    :cond_0
    invoke-static {p1, p2}, La/g/l/v;->a0(Landroid/view/View;La/g/l/d0;)La/g/l/d0;

    move-result-object p0

    return-object p0
.end method
