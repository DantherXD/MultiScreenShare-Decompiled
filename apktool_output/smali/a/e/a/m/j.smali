.class public La/e/a/m/j;
.super Ljava/lang/Object;
.source ""


# static fields
.field static a:[Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x3

    new-array v0, v0, [Z

    sput-object v0, La/e/a/m/j;->a:[Z

    return-void
.end method

.method static a(La/e/a/m/f;La/e/a/d;La/e/a/m/e;)V
    .locals 6

    const/4 v0, -0x1

    iput v0, p2, La/e/a/m/e;->u:I

    iput v0, p2, La/e/a/m/e;->v:I

    iget-object v0, p0, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    sget-object v2, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    const/4 v3, 0x2

    if-eq v0, v2, :cond_0

    iget-object v0, p2, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    aget-object v0, v0, v1

    sget-object v1, La/e/a/m/e$b;->e:La/e/a/m/e$b;

    if-ne v0, v1, :cond_0

    iget-object v0, p2, La/e/a/m/e;->P:La/e/a/m/d;

    iget v0, v0, La/e/a/m/d;->g:I

    invoke-virtual {p0}, La/e/a/m/e;->U()I

    move-result v1

    iget-object v4, p2, La/e/a/m/e;->R:La/e/a/m/d;

    iget v4, v4, La/e/a/m/d;->g:I

    sub-int/2addr v1, v4

    iget-object v4, p2, La/e/a/m/e;->P:La/e/a/m/d;

    invoke-virtual {p1, v4}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v5

    iput-object v5, v4, La/e/a/m/d;->i:La/e/a/i;

    iget-object v4, p2, La/e/a/m/e;->R:La/e/a/m/d;

    invoke-virtual {p1, v4}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v5

    iput-object v5, v4, La/e/a/m/d;->i:La/e/a/i;

    iget-object v4, p2, La/e/a/m/e;->P:La/e/a/m/d;

    iget-object v4, v4, La/e/a/m/d;->i:La/e/a/i;

    invoke-virtual {p1, v4, v0}, La/e/a/d;->f(La/e/a/i;I)V

    iget-object v4, p2, La/e/a/m/e;->R:La/e/a/m/d;

    iget-object v4, v4, La/e/a/m/d;->i:La/e/a/i;

    invoke-virtual {p1, v4, v1}, La/e/a/d;->f(La/e/a/i;I)V

    iput v3, p2, La/e/a/m/e;->u:I

    invoke-virtual {p2, v0, v1}, La/e/a/m/e;->L0(II)V

    :cond_0
    iget-object v0, p0, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    if-eq v0, v2, :cond_3

    iget-object v0, p2, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    aget-object v0, v0, v1

    sget-object v1, La/e/a/m/e$b;->e:La/e/a/m/e$b;

    if-ne v0, v1, :cond_3

    iget-object v0, p2, La/e/a/m/e;->Q:La/e/a/m/d;

    iget v0, v0, La/e/a/m/d;->g:I

    invoke-virtual {p0}, La/e/a/m/e;->v()I

    move-result p0

    iget-object v1, p2, La/e/a/m/e;->S:La/e/a/m/d;

    iget v1, v1, La/e/a/m/d;->g:I

    sub-int/2addr p0, v1

    iget-object v1, p2, La/e/a/m/e;->Q:La/e/a/m/d;

    invoke-virtual {p1, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v2

    iput-object v2, v1, La/e/a/m/d;->i:La/e/a/i;

    iget-object v1, p2, La/e/a/m/e;->S:La/e/a/m/d;

    invoke-virtual {p1, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v2

    iput-object v2, v1, La/e/a/m/d;->i:La/e/a/i;

    iget-object v1, p2, La/e/a/m/e;->Q:La/e/a/m/d;

    iget-object v1, v1, La/e/a/m/d;->i:La/e/a/i;

    invoke-virtual {p1, v1, v0}, La/e/a/d;->f(La/e/a/i;I)V

    iget-object v1, p2, La/e/a/m/e;->S:La/e/a/m/d;

    iget-object v1, v1, La/e/a/m/d;->i:La/e/a/i;

    invoke-virtual {p1, v1, p0}, La/e/a/d;->f(La/e/a/i;I)V

    iget v1, p2, La/e/a/m/e;->m0:I

    if-gtz v1, :cond_1

    invoke-virtual {p2}, La/e/a/m/e;->T()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p2, La/e/a/m/e;->T:La/e/a/m/d;

    invoke-virtual {p1, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v2

    iput-object v2, v1, La/e/a/m/d;->i:La/e/a/i;

    iget-object v1, p2, La/e/a/m/e;->T:La/e/a/m/d;

    iget-object v1, v1, La/e/a/m/d;->i:La/e/a/i;

    iget v2, p2, La/e/a/m/e;->m0:I

    add-int/2addr v2, v0

    invoke-virtual {p1, v1, v2}, La/e/a/d;->f(La/e/a/i;I)V

    :cond_2
    iput v3, p2, La/e/a/m/e;->v:I

    invoke-virtual {p2, v0, p0}, La/e/a/m/e;->c1(II)V

    :cond_3
    return-void
.end method

.method public static final b(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
