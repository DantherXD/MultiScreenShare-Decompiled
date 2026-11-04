.class public La/e/b/a/e$a;
.super La/e/b/a/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/e/b/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/e/b/a/e;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;FJLa/e/a/k/a/c;)Z
    .locals 0

    iget-boolean p0, p0, La/e/a/k/a/f;->h:Z

    return p0
.end method

.method public c(Landroid/view/View;La/e/a/k/a/c;FJDD)Z
    .locals 6

    move-object v0, p0

    move v1, p3

    move-wide v2, p4

    move-object v4, p1

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, La/e/b/a/e;->a(FJLandroid/view/View;La/e/a/k/a/c;)F

    move-result p2

    invoke-static {p8, p9, p6, p7}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide p3

    invoke-static {p3, p4}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide p3

    double-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p2}, Landroid/view/View;->setRotation(F)V

    iget-boolean p0, p0, La/e/a/k/a/f;->h:Z

    return p0
.end method
