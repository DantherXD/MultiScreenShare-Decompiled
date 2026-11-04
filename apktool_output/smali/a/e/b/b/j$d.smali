.class La/e/b/b/j$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/e/b/b/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field a:F

.field b:F

.field c:I

.field d:I

.field final e:Ljava/lang/String;

.field final f:Ljava/lang/String;

.field final g:Ljava/lang/String;

.field final h:Ljava/lang/String;

.field final synthetic i:La/e/b/b/j;


# direct methods
.method constructor <init>(La/e/b/b/j;)V
    .locals 0

    iput-object p1, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, La/e/b/b/j$d;->a:F

    iput p1, p0, La/e/b/b/j$d;->b:F

    const/4 p1, -0x1

    iput p1, p0, La/e/b/b/j$d;->c:I

    iput p1, p0, La/e/b/b/j$d;->d:I

    const-string p1, "motion.progress"

    iput-object p1, p0, La/e/b/b/j$d;->e:Ljava/lang/String;

    const-string p1, "motion.velocity"

    iput-object p1, p0, La/e/b/b/j$d;->f:Ljava/lang/String;

    const-string p1, "motion.StartState"

    iput-object p1, p0, La/e/b/b/j$d;->g:Ljava/lang/String;

    const-string p1, "motion.EndState"

    iput-object p1, p0, La/e/b/b/j$d;->h:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method a()V
    .locals 4

    iget v0, p0, La/e/b/b/j$d;->c:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v2, p0, La/e/b/b/j$d;->d:I

    if-eq v2, v1, :cond_3

    :cond_0
    if-ne v0, v1, :cond_1

    iget-object v0, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    iget v2, p0, La/e/b/b/j$d;->d:I

    invoke-virtual {v0, v2}, La/e/b/b/j;->Q(I)V

    goto :goto_0

    :cond_1
    iget v2, p0, La/e/b/b/j$d;->d:I

    if-ne v2, v1, :cond_2

    iget-object v2, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    invoke-virtual {v2, v0, v1, v1}, La/e/b/b/j;->N(III)V

    goto :goto_0

    :cond_2
    iget-object v3, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    invoke-virtual {v3, v0, v2}, La/e/b/b/j;->O(II)V

    :goto_0
    iget-object v0, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    sget-object v2, La/e/b/b/j$f;->c:La/e/b/b/j$f;

    invoke-virtual {v0, v2}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    :cond_3
    iget v0, p0, La/e/b/b/j$d;->b:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, La/e/b/b/j$d;->a:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    iget-object v0, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    iget p0, p0, La/e/b/b/j$d;->a:F

    invoke-virtual {v0, p0}, La/e/b/b/j;->setProgress(F)V

    return-void

    :cond_5
    iget-object v0, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    iget v2, p0, La/e/b/b/j$d;->a:F

    iget v3, p0, La/e/b/b/j$d;->b:F

    invoke-virtual {v0, v2, v3}, La/e/b/b/j;->M(FF)V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, La/e/b/b/j$d;->a:F

    iput v0, p0, La/e/b/b/j$d;->b:F

    iput v1, p0, La/e/b/b/j$d;->c:I

    iput v1, p0, La/e/b/b/j$d;->d:I

    return-void
.end method

.method public b()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget v1, p0, La/e/b/b/j$d;->a:F

    const-string v2, "motion.progress"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget v1, p0, La/e/b/b/j$d;->b:F

    const-string v2, "motion.velocity"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    iget v1, p0, La/e/b/b/j$d;->c:I

    const-string v2, "motion.StartState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget p0, p0, La/e/b/b/j$d;->d:I

    const-string v1, "motion.EndState"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    invoke-static {v0}, La/e/b/b/j;->C(La/e/b/b/j;)I

    move-result v0

    iput v0, p0, La/e/b/b/j$d;->d:I

    iget-object v0, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    invoke-static {v0}, La/e/b/b/j;->D(La/e/b/b/j;)I

    move-result v0

    iput v0, p0, La/e/b/b/j$d;->c:I

    iget-object v0, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    invoke-virtual {v0}, La/e/b/b/j;->getVelocity()F

    move-result v0

    iput v0, p0, La/e/b/b/j$d;->b:F

    iget-object v0, p0, La/e/b/b/j$d;->i:La/e/b/b/j;

    invoke-virtual {v0}, La/e/b/b/j;->getProgress()F

    move-result v0

    iput v0, p0, La/e/b/b/j$d;->a:F

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, La/e/b/b/j$d;->d:I

    return-void
.end method

.method public e(F)V
    .locals 0

    iput p1, p0, La/e/b/b/j$d;->a:F

    return-void
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, La/e/b/b/j$d;->c:I

    return-void
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "motion.progress"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, La/e/b/b/j$d;->a:F

    const-string v0, "motion.velocity"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    move-result v0

    iput v0, p0, La/e/b/b/j$d;->b:F

    const-string v0, "motion.StartState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, La/e/b/b/j$d;->c:I

    const-string v0, "motion.EndState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, La/e/b/b/j$d;->d:I

    return-void
.end method

.method public h(F)V
    .locals 0

    iput p1, p0, La/e/b/b/j$d;->b:F

    return-void
.end method
