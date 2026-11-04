.class public La/e/a/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/e/a/b$a;


# static fields
.field private static a:F = 0.001f


# instance fields
.field private final b:I

.field private c:I

.field private d:I

.field e:[I

.field f:[I

.field g:[I

.field h:[F

.field i:[I

.field j:[I

.field k:I

.field l:I

.field private final m:La/e/a/b;

.field protected final n:La/e/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(La/e/a/b;La/e/a/c;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, La/e/a/j;->b:I

    const/16 v1, 0x10

    iput v1, p0, La/e/a/j;->c:I

    iput v1, p0, La/e/a/j;->d:I

    new-array v2, v1, [I

    iput-object v2, p0, La/e/a/j;->e:[I

    new-array v2, v1, [I

    iput-object v2, p0, La/e/a/j;->f:[I

    new-array v2, v1, [I

    iput-object v2, p0, La/e/a/j;->g:[I

    new-array v2, v1, [F

    iput-object v2, p0, La/e/a/j;->h:[F

    new-array v2, v1, [I

    iput-object v2, p0, La/e/a/j;->i:[I

    new-array v1, v1, [I

    iput-object v1, p0, La/e/a/j;->j:[I

    const/4 v1, 0x0

    iput v1, p0, La/e/a/j;->k:I

    iput v0, p0, La/e/a/j;->l:I

    iput-object p1, p0, La/e/a/j;->m:La/e/a/b;

    iput-object p2, p0, La/e/a/j;->n:La/e/a/c;

    invoke-virtual {p0}, La/e/a/j;->clear()V

    return-void
.end method

.method private l(La/e/a/i;I)V
    .locals 3

    iget p1, p1, La/e/a/i;->e:I

    iget v0, p0, La/e/a/j;->d:I

    rem-int/2addr p1, v0

    iget-object v0, p0, La/e/a/j;->e:[I

    aget v1, v0, p1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    aput p2, v0, p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, La/e/a/j;->f:[I

    aget v0, p1, v1

    if-eq v0, v2, :cond_1

    aget v1, p1, v1

    goto :goto_0

    :cond_1
    aput p2, p1, v1

    :goto_1
    iget-object p0, p0, La/e/a/j;->f:[I

    aput v2, p0, p2

    return-void
.end method

.method private m(ILa/e/a/i;F)V
    .locals 2

    iget-object v0, p0, La/e/a/j;->g:[I

    iget v1, p2, La/e/a/i;->e:I

    aput v1, v0, p1

    iget-object v0, p0, La/e/a/j;->h:[F

    aput p3, v0, p1

    iget-object p3, p0, La/e/a/j;->i:[I

    const/4 v0, -0x1

    aput v0, p3, p1

    iget-object p3, p0, La/e/a/j;->j:[I

    aput v0, p3, p1

    iget-object p1, p0, La/e/a/j;->m:La/e/a/b;

    invoke-virtual {p2, p1}, La/e/a/i;->a(La/e/a/b;)V

    iget p1, p2, La/e/a/i;->o:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p2, La/e/a/i;->o:I

    iget p1, p0, La/e/a/j;->k:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La/e/a/j;->k:I

    return-void
.end method

.method private n()I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, La/e/a/j;->c:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, La/e/a/j;->g:[I

    aget v1, v1, v0

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method private o()V
    .locals 4

    iget v0, p0, La/e/a/j;->c:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, La/e/a/j;->g:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, La/e/a/j;->g:[I

    iget-object v1, p0, La/e/a/j;->h:[F

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object v1

    iput-object v1, p0, La/e/a/j;->h:[F

    iget-object v1, p0, La/e/a/j;->i:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, La/e/a/j;->i:[I

    iget-object v1, p0, La/e/a/j;->j:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, La/e/a/j;->j:[I

    iget-object v1, p0, La/e/a/j;->f:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, La/e/a/j;->f:[I

    iget v1, p0, La/e/a/j;->c:I

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/e/a/j;->g:[I

    const/4 v3, -0x1

    aput v3, v2, v1

    iget-object v2, p0, La/e/a/j;->f:[I

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, La/e/a/j;->c:I

    return-void
.end method

.method private q(ILa/e/a/i;F)V
    .locals 3

    invoke-direct {p0}, La/e/a/j;->n()I

    move-result v0

    invoke-direct {p0, v0, p2, p3}, La/e/a/j;->m(ILa/e/a/i;F)V

    const/4 p3, -0x1

    if-eq p1, p3, :cond_0

    iget-object v1, p0, La/e/a/j;->i:[I

    aput p1, v1, v0

    iget-object v1, p0, La/e/a/j;->j:[I

    aget v2, v1, p1

    aput v2, v1, v0

    aput v0, v1, p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, La/e/a/j;->i:[I

    aput p3, p1, v0

    iget p1, p0, La/e/a/j;->k:I

    if-lez p1, :cond_1

    iget-object p1, p0, La/e/a/j;->j:[I

    iget v1, p0, La/e/a/j;->l:I

    aput v1, p1, v0

    iput v0, p0, La/e/a/j;->l:I

    goto :goto_0

    :cond_1
    iget-object p1, p0, La/e/a/j;->j:[I

    aput p3, p1, v0

    :goto_0
    iget-object p1, p0, La/e/a/j;->j:[I

    aget v1, p1, v0

    if-eq v1, p3, :cond_2

    iget-object p3, p0, La/e/a/j;->i:[I

    aget p1, p1, v0

    aput v0, p3, p1

    :cond_2
    invoke-direct {p0, p2, v0}, La/e/a/j;->l(La/e/a/i;I)V

    return-void
.end method

.method private r(La/e/a/i;)V
    .locals 5

    iget p1, p1, La/e/a/i;->e:I

    iget v0, p0, La/e/a/j;->d:I

    rem-int v0, p1, v0

    iget-object v1, p0, La/e/a/j;->e:[I

    aget v2, v1, v0

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    return-void

    :cond_0
    iget-object v4, p0, La/e/a/j;->g:[I

    aget v4, v4, v2

    if-ne v4, p1, :cond_1

    iget-object p0, p0, La/e/a/j;->f:[I

    aget p1, p0, v2

    aput p1, v1, v0

    aput v3, p0, v2

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, La/e/a/j;->f:[I

    aget v1, v0, v2

    if-eq v1, v3, :cond_2

    iget-object v1, p0, La/e/a/j;->g:[I

    aget v4, v0, v2

    aget v1, v1, v4

    if-eq v1, p1, :cond_2

    aget v2, v0, v2

    goto :goto_0

    :cond_2
    aget v1, v0, v2

    if-eq v1, v3, :cond_3

    iget-object p0, p0, La/e/a/j;->g:[I

    aget p0, p0, v1

    if-ne p0, p1, :cond_3

    aget p0, v0, v1

    aput p0, v0, v2

    aput v3, v0, v1

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public a(I)F
    .locals 4

    iget v0, p0, La/e/a/j;->k:I

    iget v1, p0, La/e/a/j;->l:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    if-ne v2, p1, :cond_0

    iget-object p0, p0, La/e/a/j;->h:[F

    aget p0, p0, v1

    return p0

    :cond_0
    iget-object v3, p0, La/e/a/j;->j:[I

    aget v1, v3, v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return p0
.end method

.method public b(La/e/a/i;)F
    .locals 1

    invoke-virtual {p0, p1}, La/e/a/j;->p(La/e/a/i;)I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object p0, p0, La/e/a/j;->h:[F

    aget p0, p0, p1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public c(La/e/a/i;Z)F
    .locals 7

    invoke-virtual {p0, p1}, La/e/a/j;->p(La/e/a/i;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-direct {p0, p1}, La/e/a/j;->r(La/e/a/i;)V

    iget-object v2, p0, La/e/a/j;->h:[F

    aget v2, v2, v0

    iget v3, p0, La/e/a/j;->l:I

    if-ne v3, v0, :cond_1

    iget-object v3, p0, La/e/a/j;->j:[I

    aget v3, v3, v0

    iput v3, p0, La/e/a/j;->l:I

    :cond_1
    iget-object v3, p0, La/e/a/j;->g:[I

    aput v1, v3, v0

    iget-object v3, p0, La/e/a/j;->i:[I

    aget v4, v3, v0

    if-eq v4, v1, :cond_2

    iget-object v4, p0, La/e/a/j;->j:[I

    aget v5, v3, v0

    aget v6, v4, v0

    aput v6, v4, v5

    :cond_2
    iget-object v4, p0, La/e/a/j;->j:[I

    aget v5, v4, v0

    if-eq v5, v1, :cond_3

    aget v1, v4, v0

    aget v0, v3, v0

    aput v0, v3, v1

    :cond_3
    iget v0, p0, La/e/a/j;->k:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, La/e/a/j;->k:I

    iget v0, p1, La/e/a/i;->o:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p1, La/e/a/i;->o:I

    if-eqz p2, :cond_4

    iget-object p0, p0, La/e/a/j;->m:La/e/a/b;

    invoke-virtual {p1, p0}, La/e/a/i;->d(La/e/a/b;)V

    :cond_4
    return v2
.end method

.method public clear()V
    .locals 5

    iget v0, p0, La/e/a/j;->k:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, La/e/a/j;->g(I)La/e/a/i;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, La/e/a/j;->m:La/e/a/b;

    invoke-virtual {v3, v4}, La/e/a/i;->d(La/e/a/b;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_1
    iget v2, p0, La/e/a/j;->c:I

    const/4 v3, -0x1

    if-ge v0, v2, :cond_2

    iget-object v2, p0, La/e/a/j;->g:[I

    aput v3, v2, v0

    iget-object v2, p0, La/e/a/j;->f:[I

    aput v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_2
    iget v2, p0, La/e/a/j;->d:I

    if-ge v0, v2, :cond_3

    iget-object v2, p0, La/e/a/j;->e:[I

    aput v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    iput v1, p0, La/e/a/j;->k:I

    iput v3, p0, La/e/a/j;->l:I

    return-void
.end method

.method public d(La/e/a/i;)Z
    .locals 0

    invoke-virtual {p0, p1}, La/e/a/j;->p(La/e/a/i;)I

    move-result p0

    const/4 p1, -0x1

    if-eq p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public e(La/e/a/b;Z)F
    .locals 7

    iget-object v0, p1, La/e/a/b;->a:La/e/a/i;

    invoke-virtual {p0, v0}, La/e/a/j;->b(La/e/a/i;)F

    move-result v0

    iget-object v1, p1, La/e/a/b;->a:La/e/a/i;

    invoke-virtual {p0, v1, p2}, La/e/a/j;->c(La/e/a/i;Z)F

    iget-object p1, p1, La/e/a/b;->e:La/e/a/b$a;

    check-cast p1, La/e/a/j;

    invoke-virtual {p1}, La/e/a/j;->k()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_1

    iget-object v4, p1, La/e/a/j;->g:[I

    aget v5, v4, v3

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    iget-object v5, p1, La/e/a/j;->h:[F

    aget v5, v5, v3

    iget-object v6, p0, La/e/a/j;->n:La/e/a/c;

    iget-object v6, v6, La/e/a/c;->d:[La/e/a/i;

    aget v4, v4, v3

    aget-object v4, v6, v4

    mul-float/2addr v5, v0

    invoke-virtual {p0, v4, v5, p2}, La/e/a/j;->h(La/e/a/i;FZ)V

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public f(La/e/a/i;F)V
    .locals 8

    sget v0, La/e/a/j;->a:F

    neg-float v1, v0

    cmpl-float v1, p2, v1

    const/4 v2, 0x1

    if-lez v1, :cond_0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    invoke-virtual {p0, p1, v2}, La/e/a/j;->c(La/e/a/i;Z)F

    return-void

    :cond_0
    iget v0, p0, La/e/a/j;->k:I

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-direct {p0, v1, p1, p2}, La/e/a/j;->m(ILa/e/a/i;F)V

    invoke-direct {p0, p1, v1}, La/e/a/j;->l(La/e/a/i;I)V

    iput v1, p0, La/e/a/j;->l:I

    goto :goto_2

    :cond_1
    invoke-virtual {p0, p1}, La/e/a/j;->p(La/e/a/i;)I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_2

    iget-object p0, p0, La/e/a/j;->h:[F

    aput p2, p0, v0

    goto :goto_2

    :cond_2
    iget v0, p0, La/e/a/j;->k:I

    add-int/2addr v0, v2

    iget v2, p0, La/e/a/j;->c:I

    if-lt v0, v2, :cond_3

    invoke-direct {p0}, La/e/a/j;->o()V

    :cond_3
    iget v0, p0, La/e/a/j;->k:I

    iget v2, p0, La/e/a/j;->l:I

    move v4, v3

    :goto_0
    if-ge v1, v0, :cond_7

    iget-object v5, p0, La/e/a/j;->g:[I

    aget v6, v5, v2

    iget v7, p1, La/e/a/i;->e:I

    if-ne v6, v7, :cond_4

    iget-object p0, p0, La/e/a/j;->h:[F

    aput p2, p0, v2

    return-void

    :cond_4
    aget v5, v5, v2

    if-ge v5, v7, :cond_5

    move v4, v2

    :cond_5
    iget-object v5, p0, La/e/a/j;->j:[I

    aget v2, v5, v2

    if-ne v2, v3, :cond_6

    goto :goto_1

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_7
    :goto_1
    invoke-direct {p0, v4, p1, p2}, La/e/a/j;->q(ILa/e/a/i;F)V

    :goto_2
    return-void
.end method

.method public g(I)La/e/a/i;
    .locals 6

    iget v0, p0, La/e/a/j;->k:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget v2, p0, La/e/a/j;->l:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_3

    const/4 v4, -0x1

    if-ne v3, p1, :cond_1

    if-eq v2, v4, :cond_1

    iget-object p1, p0, La/e/a/j;->n:La/e/a/c;

    iget-object p1, p1, La/e/a/c;->d:[La/e/a/i;

    iget-object p0, p0, La/e/a/j;->g:[I

    aget p0, p0, v2

    aget-object p0, p1, p0

    return-object p0

    :cond_1
    iget-object v5, p0, La/e/a/j;->j:[I

    aget v2, v5, v2

    if-ne v2, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method

.method public h(La/e/a/i;FZ)V
    .locals 4

    sget v0, La/e/a/j;->a:F

    neg-float v1, v0

    cmpl-float v1, p2, v1

    if-lez v1, :cond_0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, La/e/a/j;->p(La/e/a/i;)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0, p1, p2}, La/e/a/j;->f(La/e/a/i;F)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, La/e/a/j;->h:[F

    aget v2, v1, v0

    add-float/2addr v2, p2

    aput v2, v1, v0

    aget p2, v1, v0

    sget v2, La/e/a/j;->a:F

    neg-float v3, v2

    cmpl-float p2, p2, v3

    if-lez p2, :cond_2

    aget p2, v1, v0

    cmpg-float p2, p2, v2

    if-gez p2, :cond_2

    const/4 p2, 0x0

    aput p2, v1, v0

    invoke-virtual {p0, p1, p3}, La/e/a/j;->c(La/e/a/i;Z)F

    :cond_2
    :goto_0
    return-void
.end method

.method public i(F)V
    .locals 5

    iget v0, p0, La/e/a/j;->k:I

    iget v1, p0, La/e/a/j;->l:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, La/e/a/j;->h:[F

    aget v4, v3, v1

    div-float/2addr v4, p1

    aput v4, v3, v1

    iget-object v3, p0, La/e/a/j;->j:[I

    aget v1, v3, v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public j()V
    .locals 6

    iget v0, p0, La/e/a/j;->k:I

    iget v1, p0, La/e/a/j;->l:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, La/e/a/j;->h:[F

    aget v4, v3, v1

    const/high16 v5, -0x40800000    # -1.0f

    mul-float/2addr v4, v5

    aput v4, v3, v1

    iget-object v3, p0, La/e/a/j;->j:[I

    aget v1, v3, v1

    const/4 v3, -0x1

    if-ne v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public k()I
    .locals 0

    iget p0, p0, La/e/a/j;->k:I

    return p0
.end method

.method public p(La/e/a/i;)I
    .locals 5

    iget v0, p0, La/e/a/j;->k:I

    const/4 v1, -0x1

    if-eqz v0, :cond_5

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget p1, p1, La/e/a/i;->e:I

    iget v0, p0, La/e/a/j;->d:I

    rem-int v0, p1, v0

    iget-object v2, p0, La/e/a/j;->e:[I

    aget v0, v2, v0

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    iget-object v2, p0, La/e/a/j;->g:[I

    aget v2, v2, v0

    if-ne v2, p1, :cond_2

    return v0

    :cond_2
    :goto_0
    iget-object v2, p0, La/e/a/j;->f:[I

    aget v3, v2, v0

    if-eq v3, v1, :cond_3

    iget-object v3, p0, La/e/a/j;->g:[I

    aget v4, v2, v0

    aget v3, v3, v4

    if-eq v3, p1, :cond_3

    aget v0, v2, v0

    goto :goto_0

    :cond_3
    aget v3, v2, v0

    if-ne v3, v1, :cond_4

    return v1

    :cond_4
    iget-object p0, p0, La/e/a/j;->g:[I

    aget v3, v2, v0

    aget p0, p0, v3

    if-ne p0, p1, :cond_5

    aget p0, v2, v0

    return p0

    :cond_5
    :goto_1
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " { "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget v1, p0, La/e/a/j;->k:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p0, v2}, La/e/a/j;->g(I)La/e/a/i;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_3

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " = "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, La/e/a/j;->a(I)F

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3}, La/e/a/j;->p(La/e/a/i;)I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "[p: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, La/e/a/j;->i:[I

    aget v4, v4, v3

    const-string v5, "none"

    const/4 v6, -0x1

    if-eq v4, v6, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, La/e/a/j;->n:La/e/a/c;

    iget-object v0, v0, La/e/a/c;->d:[La/e/a/i;

    iget-object v7, p0, La/e/a/j;->g:[I

    iget-object v8, p0, La/e/a/j;->i:[I

    aget v8, v8, v3

    aget v7, v7, v8

    aget-object v0, v0, v7

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", n: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, La/e/a/j;->j:[I

    aget v4, v4, v3

    if-eq v4, v6, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, La/e/a/j;->n:La/e/a/c;

    iget-object v0, v0, La/e/a/c;->d:[La/e/a/i;

    iget-object v5, p0, La/e/a/j;->g:[I

    iget-object v6, p0, La/e/a/j;->j:[I

    aget v3, v6, v3

    aget v3, v5, v3

    aget-object v0, v0, v3

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " }"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
