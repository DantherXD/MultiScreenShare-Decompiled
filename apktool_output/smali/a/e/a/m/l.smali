.class public La/e/a/m/l;
.super La/e/a/m/e;
.source ""


# instance fields
.field public K0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/e/a/m/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/e/a/m/e;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public c(La/e/a/m/e;)V
    .locals 1

    iget-object v0, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    check-cast v0, La/e/a/m/l;

    invoke-virtual {v0, p1}, La/e/a/m/l;->q1(La/e/a/m/e;)V

    :cond_0
    invoke-virtual {p1, p0}, La/e/a/m/e;->Z0(La/e/a/m/e;)V

    return-void
.end method

.method public o1()Ljava/util/ArrayList;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "La/e/a/m/e;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    return-object p0
.end method

.method public p1()V
    .locals 4

    iget-object v0, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/e/a/m/e;

    instance-of v3, v2, La/e/a/m/l;

    if-eqz v3, :cond_1

    check-cast v2, La/e/a/m/l;

    invoke-virtual {v2}, La/e/a/m/l;->p1()V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public q1(La/e/a/m/e;)V
    .locals 0

    iget-object p0, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1}, La/e/a/m/e;->r0()V

    return-void
.end method

.method public r0()V
    .locals 1

    iget-object v0, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-super {p0}, La/e/a/m/e;->r0()V

    return-void
.end method

.method public r1()V
    .locals 0

    iget-object p0, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public t0(La/e/a/c;)V
    .locals 3

    invoke-super {p0, p1}, La/e/a/m/e;->t0(La/e/a/c;)V

    iget-object v0, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/e/a/m/e;

    invoke-virtual {v2, p1}, La/e/a/m/e;->t0(La/e/a/c;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
