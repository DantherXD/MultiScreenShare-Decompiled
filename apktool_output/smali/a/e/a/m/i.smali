.class public La/e/a/m/i;
.super La/e/a/m/e;
.source ""

# interfaces
.implements La/e/a/m/h;


# instance fields
.field public K0:[La/e/a/m/e;

.field public L0:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/e/a/m/e;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [La/e/a/m/e;

    iput-object v0, p0, La/e/a/m/i;->K0:[La/e/a/m/e;

    const/4 v0, 0x0

    iput v0, p0, La/e/a/m/i;->L0:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La/e/a/m/i;->L0:I

    iget-object p0, p0, La/e/a/m/i;->K0:[La/e/a/m/e;

    const/4 v0, 0x0

    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public b(La/e/a/m/f;)V
    .locals 0

    return-void
.end method

.method public c(La/e/a/m/e;)V
    .locals 3

    if-eq p1, p0, :cond_2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, La/e/a/m/i;->L0:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, La/e/a/m/i;->K0:[La/e/a/m/e;

    array-length v2, v1

    if-le v0, v2, :cond_1

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/e/a/m/e;

    iput-object v0, p0, La/e/a/m/i;->K0:[La/e/a/m/e;

    :cond_1
    iget-object v0, p0, La/e/a/m/i;->K0:[La/e/a/m/e;

    iget v1, p0, La/e/a/m/i;->L0:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/e/a/m/i;->L0:I

    :cond_2
    :goto_0
    return-void
.end method

.method public o1(Ljava/util/ArrayList;ILa/e/a/m/m/o;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La/e/a/m/m/o;",
            ">;I",
            "La/e/a/m/m/o;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, La/e/a/m/i;->L0:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, La/e/a/m/i;->K0:[La/e/a/m/e;

    aget-object v2, v2, v1

    invoke-virtual {p3, v2}, La/e/a/m/m/o;->a(La/e/a/m/e;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget v1, p0, La/e/a/m/i;->L0:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, La/e/a/m/i;->K0:[La/e/a/m/e;

    aget-object v1, v1, v0

    invoke-static {v1, p2, p1, p3}, La/e/a/m/m/i;->a(La/e/a/m/e;ILjava/util/ArrayList;La/e/a/m/m/o;)La/e/a/m/m/o;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method public p1(I)I
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, La/e/a/m/i;->L0:I

    const/4 v2, -0x1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, La/e/a/m/i;->K0:[La/e/a/m/e;

    aget-object v1, v1, v0

    if-nez p1, :cond_0

    iget v3, v1, La/e/a/m/e;->I0:I

    if-eq v3, v2, :cond_0

    return v3

    :cond_0
    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    iget v1, v1, La/e/a/m/e;->J0:I

    if-eq v1, v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v2
.end method
