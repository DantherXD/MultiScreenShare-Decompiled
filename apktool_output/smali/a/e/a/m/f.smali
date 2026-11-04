.class public La/e/a/m/f;
.super La/e/a/m/l;
.source ""


# instance fields
.field L0:La/e/a/m/m/b;

.field public M0:La/e/a/m/m/e;

.field private N0:I

.field protected O0:La/e/a/m/m/b$b;

.field private P0:Z

.field public Q0:La/e/a/e;

.field protected R0:La/e/a/d;

.field S0:I

.field T0:I

.field U0:I

.field V0:I

.field public W0:I

.field public X0:I

.field Y0:[La/e/a/m/c;

.field Z0:[La/e/a/m/c;

.field public a1:Z

.field public b1:Z

.field public c1:Z

.field public d1:I

.field public e1:I

.field private f1:I

.field public g1:Z

.field private h1:Z

.field private i1:Z

.field j1:I

.field private k1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "La/e/a/m/d;",
            ">;"
        }
    .end annotation
.end field

.field private l1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "La/e/a/m/d;",
            ">;"
        }
    .end annotation
.end field

.field private m1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "La/e/a/m/d;",
            ">;"
        }
    .end annotation
.end field

.field private n1:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "La/e/a/m/d;",
            ">;"
        }
    .end annotation
.end field

.field o1:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "La/e/a/m/e;",
            ">;"
        }
    .end annotation
.end field

.field public p1:La/e/a/m/m/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, La/e/a/m/l;-><init>()V

    new-instance v0, La/e/a/m/m/b;

    invoke-direct {v0, p0}, La/e/a/m/m/b;-><init>(La/e/a/m/f;)V

    iput-object v0, p0, La/e/a/m/f;->L0:La/e/a/m/m/b;

    new-instance v0, La/e/a/m/m/e;

    invoke-direct {v0, p0}, La/e/a/m/m/e;-><init>(La/e/a/m/f;)V

    iput-object v0, p0, La/e/a/m/f;->M0:La/e/a/m/m/e;

    const/4 v0, 0x0

    iput-object v0, p0, La/e/a/m/f;->O0:La/e/a/m/m/b$b;

    const/4 v1, 0x0

    iput-boolean v1, p0, La/e/a/m/f;->P0:Z

    new-instance v2, La/e/a/d;

    invoke-direct {v2}, La/e/a/d;-><init>()V

    iput-object v2, p0, La/e/a/m/f;->R0:La/e/a/d;

    iput v1, p0, La/e/a/m/f;->W0:I

    iput v1, p0, La/e/a/m/f;->X0:I

    const/4 v2, 0x4

    new-array v3, v2, [La/e/a/m/c;

    iput-object v3, p0, La/e/a/m/f;->Y0:[La/e/a/m/c;

    new-array v2, v2, [La/e/a/m/c;

    iput-object v2, p0, La/e/a/m/f;->Z0:[La/e/a/m/c;

    iput-boolean v1, p0, La/e/a/m/f;->a1:Z

    iput-boolean v1, p0, La/e/a/m/f;->b1:Z

    iput-boolean v1, p0, La/e/a/m/f;->c1:Z

    iput v1, p0, La/e/a/m/f;->d1:I

    iput v1, p0, La/e/a/m/f;->e1:I

    const/16 v2, 0x101

    iput v2, p0, La/e/a/m/f;->f1:I

    iput-boolean v1, p0, La/e/a/m/f;->g1:Z

    iput-boolean v1, p0, La/e/a/m/f;->h1:Z

    iput-boolean v1, p0, La/e/a/m/f;->i1:Z

    iput v1, p0, La/e/a/m/f;->j1:I

    iput-object v0, p0, La/e/a/m/f;->k1:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, La/e/a/m/f;->l1:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, La/e/a/m/f;->m1:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, La/e/a/m/f;->n1:Ljava/lang/ref/WeakReference;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    new-instance v0, La/e/a/m/m/b$a;

    invoke-direct {v0}, La/e/a/m/m/b$a;-><init>()V

    iput-object v0, p0, La/e/a/m/f;->p1:La/e/a/m/m/b$a;

    return-void
.end method

.method public static O1(ILa/e/a/m/e;La/e/a/m/m/b$b;La/e/a/m/m/b$a;I)Z
    .locals 5

    const/4 p0, 0x0

    if-nez p2, :cond_0

    return p0

    :cond_0
    invoke-virtual {p1}, La/e/a/m/e;->T()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_13

    instance-of v0, p1, La/e/a/m/g;

    if-nez v0, :cond_13

    instance-of v0, p1, La/e/a/m/a;

    if-eqz v0, :cond_1

    goto/16 :goto_9

    :cond_1
    invoke-virtual {p1}, La/e/a/m/e;->y()La/e/a/m/e$b;

    move-result-object v0

    iput-object v0, p3, La/e/a/m/m/b$a;->d:La/e/a/m/e$b;

    invoke-virtual {p1}, La/e/a/m/e;->R()La/e/a/m/e$b;

    move-result-object v0

    iput-object v0, p3, La/e/a/m/m/b$a;->e:La/e/a/m/e$b;

    invoke-virtual {p1}, La/e/a/m/e;->U()I

    move-result v0

    iput v0, p3, La/e/a/m/m/b$a;->f:I

    invoke-virtual {p1}, La/e/a/m/e;->v()I

    move-result v0

    iput v0, p3, La/e/a/m/m/b$a;->g:I

    iput-boolean p0, p3, La/e/a/m/m/b$a;->l:Z

    iput p4, p3, La/e/a/m/m/b$a;->m:I

    iget-object p4, p3, La/e/a/m/m/b$a;->d:La/e/a/m/e$b;

    sget-object v0, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    const/4 v1, 0x1

    if-ne p4, v0, :cond_2

    move p4, v1

    goto :goto_0

    :cond_2
    move p4, p0

    :goto_0
    iget-object v2, p3, La/e/a/m/m/b$a;->e:La/e/a/m/e$b;

    if-ne v2, v0, :cond_3

    move v0, v1

    goto :goto_1

    :cond_3
    move v0, p0

    :goto_1
    const/4 v2, 0x0

    if-eqz p4, :cond_4

    iget v3, p1, La/e/a/m/e;->e0:F

    cmpl-float v3, v3, v2

    if-lez v3, :cond_4

    move v3, v1

    goto :goto_2

    :cond_4
    move v3, p0

    :goto_2
    if-eqz v0, :cond_5

    iget v4, p1, La/e/a/m/e;->e0:F

    cmpl-float v2, v4, v2

    if-lez v2, :cond_5

    move v2, v1

    goto :goto_3

    :cond_5
    move v2, p0

    :goto_3
    if-eqz p4, :cond_7

    invoke-virtual {p1, p0}, La/e/a/m/e;->Y(I)Z

    move-result v4

    if-eqz v4, :cond_7

    iget v4, p1, La/e/a/m/e;->x:I

    if-nez v4, :cond_7

    if-nez v3, :cond_7

    sget-object p4, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    iput-object p4, p3, La/e/a/m/m/b$a;->d:La/e/a/m/e$b;

    if-eqz v0, :cond_6

    iget p4, p1, La/e/a/m/e;->y:I

    if-nez p4, :cond_6

    sget-object p4, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    iput-object p4, p3, La/e/a/m/m/b$a;->d:La/e/a/m/e$b;

    :cond_6
    move p4, p0

    :cond_7
    if-eqz v0, :cond_9

    invoke-virtual {p1, v1}, La/e/a/m/e;->Y(I)Z

    move-result v4

    if-eqz v4, :cond_9

    iget v4, p1, La/e/a/m/e;->y:I

    if-nez v4, :cond_9

    if-nez v2, :cond_9

    sget-object v0, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    iput-object v0, p3, La/e/a/m/m/b$a;->e:La/e/a/m/e$b;

    if-eqz p4, :cond_8

    iget v0, p1, La/e/a/m/e;->x:I

    if-nez v0, :cond_8

    sget-object v0, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    iput-object v0, p3, La/e/a/m/m/b$a;->e:La/e/a/m/e$b;

    :cond_8
    move v0, p0

    :cond_9
    invoke-virtual {p1}, La/e/a/m/e;->l0()Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object p4, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    iput-object p4, p3, La/e/a/m/m/b$a;->d:La/e/a/m/e$b;

    move p4, p0

    :cond_a
    invoke-virtual {p1}, La/e/a/m/e;->m0()Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v0, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    iput-object v0, p3, La/e/a/m/m/b$a;->e:La/e/a/m/e$b;

    move v0, p0

    :cond_b
    const/4 v4, 0x4

    if-eqz v3, :cond_e

    iget-object v3, p1, La/e/a/m/e;->z:[I

    aget p0, v3, p0

    if-ne p0, v4, :cond_c

    sget-object p0, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    iput-object p0, p3, La/e/a/m/m/b$a;->d:La/e/a/m/e$b;

    goto :goto_5

    :cond_c
    if-nez v0, :cond_e

    iget-object p0, p3, La/e/a/m/m/b$a;->e:La/e/a/m/e$b;

    sget-object v0, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    if-ne p0, v0, :cond_d

    iget p0, p3, La/e/a/m/m/b$a;->g:I

    goto :goto_4

    :cond_d
    sget-object p0, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    iput-object p0, p3, La/e/a/m/m/b$a;->d:La/e/a/m/e$b;

    invoke-interface {p2, p1, p3}, La/e/a/m/m/b$b;->b(La/e/a/m/e;La/e/a/m/m/b$a;)V

    iget p0, p3, La/e/a/m/m/b$a;->i:I

    :goto_4
    iput-object v0, p3, La/e/a/m/m/b$a;->d:La/e/a/m/e$b;

    invoke-virtual {p1}, La/e/a/m/e;->t()F

    move-result v0

    int-to-float p0, p0

    mul-float/2addr v0, p0

    float-to-int p0, v0

    iput p0, p3, La/e/a/m/m/b$a;->f:I

    :cond_e
    :goto_5
    if-eqz v2, :cond_12

    iget-object p0, p1, La/e/a/m/e;->z:[I

    aget p0, p0, v1

    if-ne p0, v4, :cond_f

    sget-object p0, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    iput-object p0, p3, La/e/a/m/m/b$a;->e:La/e/a/m/e$b;

    goto :goto_8

    :cond_f
    if-nez p4, :cond_12

    iget-object p0, p3, La/e/a/m/m/b$a;->d:La/e/a/m/e$b;

    sget-object p4, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    if-ne p0, p4, :cond_10

    iget p0, p3, La/e/a/m/m/b$a;->f:I

    goto :goto_6

    :cond_10
    sget-object p0, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    iput-object p0, p3, La/e/a/m/m/b$a;->e:La/e/a/m/e$b;

    invoke-interface {p2, p1, p3}, La/e/a/m/m/b$b;->b(La/e/a/m/e;La/e/a/m/m/b$a;)V

    iget p0, p3, La/e/a/m/m/b$a;->h:I

    :goto_6
    iput-object p4, p3, La/e/a/m/m/b$a;->e:La/e/a/m/e$b;

    invoke-virtual {p1}, La/e/a/m/e;->u()I

    move-result p4

    const/4 v0, -0x1

    if-ne p4, v0, :cond_11

    int-to-float p0, p0

    invoke-virtual {p1}, La/e/a/m/e;->t()F

    move-result p4

    div-float/2addr p0, p4

    float-to-int p0, p0

    goto :goto_7

    :cond_11
    invoke-virtual {p1}, La/e/a/m/e;->t()F

    move-result p4

    int-to-float p0, p0

    mul-float/2addr p4, p0

    float-to-int p0, p4

    :goto_7
    iput p0, p3, La/e/a/m/m/b$a;->g:I

    :cond_12
    :goto_8
    invoke-interface {p2, p1, p3}, La/e/a/m/m/b$b;->b(La/e/a/m/e;La/e/a/m/m/b$a;)V

    iget p0, p3, La/e/a/m/m/b$a;->h:I

    invoke-virtual {p1, p0}, La/e/a/m/e;->h1(I)V

    iget p0, p3, La/e/a/m/m/b$a;->i:I

    invoke-virtual {p1, p0}, La/e/a/m/e;->I0(I)V

    iget-boolean p0, p3, La/e/a/m/m/b$a;->k:Z

    invoke-virtual {p1, p0}, La/e/a/m/e;->H0(Z)V

    iget p0, p3, La/e/a/m/m/b$a;->j:I

    invoke-virtual {p1, p0}, La/e/a/m/e;->x0(I)V

    sget p0, La/e/a/m/m/b$a;->a:I

    iput p0, p3, La/e/a/m/m/b$a;->m:I

    iget-boolean p0, p3, La/e/a/m/m/b$a;->l:Z

    return p0

    :cond_13
    :goto_9
    iput p0, p3, La/e/a/m/m/b$a;->h:I

    iput p0, p3, La/e/a/m/m/b$a;->i:I

    return p0
.end method

.method private Q1()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La/e/a/m/f;->W0:I

    iput v0, p0, La/e/a/m/f;->X0:I

    return-void
.end method

.method private u1(La/e/a/m/e;)V
    .locals 5

    iget v0, p0, La/e/a/m/f;->W0:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, La/e/a/m/f;->Z0:[La/e/a/m/c;

    array-length v2, v1

    if-lt v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/e/a/m/c;

    iput-object v0, p0, La/e/a/m/f;->Z0:[La/e/a/m/c;

    :cond_0
    iget-object v0, p0, La/e/a/m/f;->Z0:[La/e/a/m/c;

    iget v1, p0, La/e/a/m/f;->W0:I

    new-instance v2, La/e/a/m/c;

    const/4 v3, 0x0

    invoke-virtual {p0}, La/e/a/m/f;->L1()Z

    move-result v4

    invoke-direct {v2, p1, v3, v4}, La/e/a/m/c;-><init>(La/e/a/m/e;IZ)V

    aput-object v2, v0, v1

    iget p1, p0, La/e/a/m/f;->W0:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La/e/a/m/f;->W0:I

    return-void
.end method

.method private x1(La/e/a/m/d;La/e/a/i;)V
    .locals 2

    iget-object v0, p0, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v0, p1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object p1

    iget-object p0, p0, La/e/a/m/f;->R0:La/e/a/d;

    const/4 v0, 0x0

    const/4 v1, 0x5

    invoke-virtual {p0, p2, p1, v0, v1}, La/e/a/d;->h(La/e/a/i;La/e/a/i;II)V

    return-void
.end method

.method private y1(La/e/a/m/d;La/e/a/i;)V
    .locals 2

    iget-object v0, p0, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v0, p1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object p1

    iget-object p0, p0, La/e/a/m/f;->R0:La/e/a/d;

    const/4 v0, 0x0

    const/4 v1, 0x5

    invoke-virtual {p0, p1, p2, v0, v1}, La/e/a/d;->h(La/e/a/i;La/e/a/i;II)V

    return-void
.end method

.method private z1(La/e/a/m/e;)V
    .locals 5

    iget v0, p0, La/e/a/m/f;->X0:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, La/e/a/m/f;->Y0:[La/e/a/m/c;

    array-length v3, v2

    if-lt v0, v3, :cond_0

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/e/a/m/c;

    iput-object v0, p0, La/e/a/m/f;->Y0:[La/e/a/m/c;

    :cond_0
    iget-object v0, p0, La/e/a/m/f;->Y0:[La/e/a/m/c;

    iget v2, p0, La/e/a/m/f;->X0:I

    new-instance v3, La/e/a/m/c;

    invoke-virtual {p0}, La/e/a/m/f;->L1()Z

    move-result v4

    invoke-direct {v3, p1, v1, v4}, La/e/a/m/c;-><init>(La/e/a/m/e;IZ)V

    aput-object v3, v0, v2

    iget p1, p0, La/e/a/m/f;->X0:I

    add-int/2addr p1, v1

    iput p1, p0, La/e/a/m/f;->X0:I

    return-void
.end method


# virtual methods
.method A1(La/e/a/m/d;)V
    .locals 2

    iget-object v0, p0, La/e/a/m/f;->m1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, La/e/a/m/d;->d()I

    move-result v0

    iget-object v1, p0, La/e/a/m/f;->m1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/d;

    invoke-virtual {v1}, La/e/a/m/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/e/a/m/f;->m1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method B1(La/e/a/m/d;)V
    .locals 2

    iget-object v0, p0, La/e/a/m/f;->k1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, La/e/a/m/d;->d()I

    move-result v0

    iget-object v1, p0, La/e/a/m/f;->k1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/d;

    invoke-virtual {v1}, La/e/a/m/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/e/a/m/f;->k1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public C1(Z)Z
    .locals 0

    iget-object p0, p0, La/e/a/m/f;->M0:La/e/a/m/m/e;

    invoke-virtual {p0, p1}, La/e/a/m/m/e;->f(Z)Z

    move-result p0

    return p0
.end method

.method public D1(Z)Z
    .locals 0

    iget-object p0, p0, La/e/a/m/f;->M0:La/e/a/m/m/e;

    invoke-virtual {p0, p1}, La/e/a/m/m/e;->g(Z)Z

    move-result p0

    return p0
.end method

.method public E1(ZI)Z
    .locals 0

    iget-object p0, p0, La/e/a/m/f;->M0:La/e/a/m/m/e;

    invoke-virtual {p0, p1, p2}, La/e/a/m/m/e;->h(ZI)Z

    move-result p0

    return p0
.end method

.method public F1()La/e/a/m/m/b$b;
    .locals 0

    iget-object p0, p0, La/e/a/m/f;->O0:La/e/a/m/m/b$b;

    return-object p0
.end method

.method public G1()I
    .locals 0

    iget p0, p0, La/e/a/m/f;->f1:I

    return p0
.end method

.method public H1()La/e/a/d;
    .locals 0

    iget-object p0, p0, La/e/a/m/f;->R0:La/e/a/d;

    return-object p0
.end method

.method public I1()V
    .locals 0

    iget-object p0, p0, La/e/a/m/f;->M0:La/e/a/m/m/e;

    invoke-virtual {p0}, La/e/a/m/m/e;->j()V

    return-void
.end method

.method public J1()V
    .locals 0

    iget-object p0, p0, La/e/a/m/f;->M0:La/e/a/m/m/e;

    invoke-virtual {p0}, La/e/a/m/m/e;->k()V

    return-void
.end method

.method public K1()Z
    .locals 0

    iget-boolean p0, p0, La/e/a/m/f;->i1:Z

    return p0
.end method

.method public L1()Z
    .locals 0

    iget-boolean p0, p0, La/e/a/m/f;->P0:Z

    return p0
.end method

.method public M(Ljava/lang/StringBuilder;)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La/e/a/m/e;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":{\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "  actualWidth:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/e/a/m/e;->c0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "  actualHeight:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, La/e/a/m/e;->d0:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La/e/a/m/l;->o1()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/e;

    invoke-virtual {v0, p1}, La/e/a/m/e;->M(Ljava/lang/StringBuilder;)V

    const-string v0, ",\n"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string p0, "}"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public M1()Z
    .locals 0

    iget-boolean p0, p0, La/e/a/m/f;->h1:Z

    return p0
.end method

.method public N1(IIIIIIIII)J
    .locals 11

    move-object v1, p0

    move/from16 v3, p8

    iput v3, v1, La/e/a/m/f;->S0:I

    move/from16 v4, p9

    iput v4, v1, La/e/a/m/f;->T0:I

    iget-object v0, v1, La/e/a/m/f;->L0:La/e/a/m/m/b;

    move v2, p1

    move v5, p2

    move v6, p3

    move v7, p4

    move/from16 v8, p5

    move/from16 v9, p6

    move/from16 v10, p7

    invoke-virtual/range {v0 .. v10}, La/e/a/m/m/b;->d(La/e/a/m/f;IIIIIIIII)J

    move-result-wide v0

    return-wide v0
.end method

.method public P1(I)Z
    .locals 0

    iget p0, p0, La/e/a/m/f;->f1:I

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public R1(La/e/a/m/m/b$b;)V
    .locals 0

    iput-object p1, p0, La/e/a/m/f;->O0:La/e/a/m/m/b$b;

    iget-object p0, p0, La/e/a/m/f;->M0:La/e/a/m/m/e;

    invoke-virtual {p0, p1}, La/e/a/m/m/e;->n(La/e/a/m/m/b$b;)V

    return-void
.end method

.method public S1(I)V
    .locals 0

    iput p1, p0, La/e/a/m/f;->f1:I

    const/16 p1, 0x200

    invoke-virtual {p0, p1}, La/e/a/m/f;->P1(I)Z

    move-result p0

    sput-boolean p0, La/e/a/d;->a:Z

    return-void
.end method

.method public T1(I)V
    .locals 0

    iput p1, p0, La/e/a/m/f;->N0:I

    return-void
.end method

.method public U1(Z)V
    .locals 0

    iput-boolean p1, p0, La/e/a/m/f;->P0:Z

    return-void
.end method

.method public V1(La/e/a/d;[Z)Z
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    aput-boolean v1, p2, v0

    const/16 p2, 0x40

    invoke-virtual {p0, p2}, La/e/a/m/f;->P1(I)Z

    move-result p2

    invoke-virtual {p0, p1, p2}, La/e/a/m/e;->n1(La/e/a/d;Z)V

    iget-object v0, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v3, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/e/a/m/e;

    invoke-virtual {v3, p1, p2}, La/e/a/m/e;->n1(La/e/a/d;Z)V

    invoke-virtual {v3}, La/e/a/m/e;->a0()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public W1()V
    .locals 1

    iget-object v0, p0, La/e/a/m/f;->L0:La/e/a/m/m/b;

    invoke-virtual {v0, p0}, La/e/a/m/m/b;->e(La/e/a/m/f;)V

    return-void
.end method

.method public m1(ZZ)V
    .locals 3

    invoke-super {p0, p1, p2}, La/e/a/m/e;->m1(ZZ)V

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

    invoke-virtual {v2, p1, p2}, La/e/a/m/e;->m1(ZZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public p1()V
    .locals 18

    move-object/from16 v1, p0

    const/4 v2, 0x0

    iput v2, v1, La/e/a/m/e;->g0:I

    iput v2, v1, La/e/a/m/e;->h0:I

    iput-boolean v2, v1, La/e/a/m/f;->h1:Z

    iput-boolean v2, v1, La/e/a/m/f;->i1:Z

    iget-object v0, v1, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->U()I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->v()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    iget-object v5, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    const/4 v6, 0x1

    aget-object v7, v5, v6

    aget-object v5, v5, v2

    iget-object v8, v1, La/e/a/m/f;->Q0:La/e/a/e;

    const/4 v9, 0x0

    if-nez v8, :cond_23

    iget v8, v1, La/e/a/m/f;->N0:I

    if-nez v8, :cond_2

    iget v8, v1, La/e/a/m/f;->f1:I

    invoke-static {v8, v6}, La/e/a/m/j;->b(II)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual/range {p0 .. p0}, La/e/a/m/f;->F1()La/e/a/m/m/b$b;

    move-result-object v8

    invoke-static {v1, v8}, La/e/a/m/m/h;->h(La/e/a/m/f;La/e/a/m/m/b$b;)V

    move v8, v2

    :goto_0
    if-ge v8, v3, :cond_2

    iget-object v10, v1, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v10, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/e/a/m/e;

    invoke-virtual {v10}, La/e/a/m/e;->k0()Z

    move-result v11

    if-eqz v11, :cond_1

    instance-of v11, v10, La/e/a/m/g;

    if-nez v11, :cond_1

    instance-of v11, v10, La/e/a/m/a;

    if-nez v11, :cond_1

    instance-of v11, v10, La/e/a/m/k;

    if-nez v11, :cond_1

    invoke-virtual {v10}, La/e/a/m/e;->j0()Z

    move-result v11

    if-nez v11, :cond_1

    invoke-virtual {v10, v2}, La/e/a/m/e;->s(I)La/e/a/m/e$b;

    move-result-object v11

    invoke-virtual {v10, v6}, La/e/a/m/e;->s(I)La/e/a/m/e$b;

    move-result-object v12

    sget-object v13, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v11, v13, :cond_0

    iget v11, v10, La/e/a/m/e;->x:I

    if-eq v11, v6, :cond_0

    if-ne v12, v13, :cond_0

    iget v11, v10, La/e/a/m/e;->y:I

    if-eq v11, v6, :cond_0

    move v11, v6

    goto :goto_1

    :cond_0
    move v11, v2

    :goto_1
    if-nez v11, :cond_1

    new-instance v11, La/e/a/m/m/b$a;

    invoke-direct {v11}, La/e/a/m/m/b$a;-><init>()V

    iget-object v12, v1, La/e/a/m/f;->O0:La/e/a/m/m/b$b;

    sget v13, La/e/a/m/m/b$a;->a:I

    invoke-static {v2, v10, v12, v11, v13}, La/e/a/m/f;->O1(ILa/e/a/m/e;La/e/a/m/m/b$b;La/e/a/m/m/b$a;I)Z

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_2
    const/4 v8, 0x2

    if-le v3, v8, :cond_8

    sget-object v10, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    if-eq v5, v10, :cond_3

    if-ne v7, v10, :cond_8

    :cond_3
    iget v11, v1, La/e/a/m/f;->f1:I

    const/16 v12, 0x400

    invoke-static {v11, v12}, La/e/a/m/j;->b(II)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual/range {p0 .. p0}, La/e/a/m/f;->F1()La/e/a/m/m/b$b;

    move-result-object v11

    invoke-static {v1, v11}, La/e/a/m/m/i;->c(La/e/a/m/f;La/e/a/m/m/b$b;)Z

    move-result v11

    if-eqz v11, :cond_8

    if-ne v5, v10, :cond_5

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->U()I

    move-result v11

    if-ge v0, v11, :cond_4

    if-lez v0, :cond_4

    invoke-virtual {v1, v0}, La/e/a/m/e;->h1(I)V

    iput-boolean v6, v1, La/e/a/m/f;->h1:Z

    goto :goto_2

    :cond_4
    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->U()I

    move-result v0

    :cond_5
    :goto_2
    if-ne v7, v10, :cond_7

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->v()I

    move-result v10

    if-ge v4, v10, :cond_6

    if-lez v4, :cond_6

    invoke-virtual {v1, v4}, La/e/a/m/e;->I0(I)V

    iput-boolean v6, v1, La/e/a/m/f;->i1:Z

    goto :goto_3

    :cond_6
    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->v()I

    move-result v4

    :cond_7
    :goto_3
    move v10, v4

    move v4, v0

    move v0, v6

    goto :goto_4

    :cond_8
    move v10, v4

    move v4, v0

    move v0, v2

    :goto_4
    const/16 v11, 0x40

    invoke-virtual {v1, v11}, La/e/a/m/f;->P1(I)Z

    move-result v12

    if-nez v12, :cond_a

    const/16 v12, 0x80

    invoke-virtual {v1, v12}, La/e/a/m/f;->P1(I)Z

    move-result v12

    if-eqz v12, :cond_9

    goto :goto_5

    :cond_9
    move v12, v2

    goto :goto_6

    :cond_a
    :goto_5
    move v12, v6

    :goto_6
    iget-object v13, v1, La/e/a/m/f;->R0:La/e/a/d;

    iput-boolean v2, v13, La/e/a/d;->q:Z

    iput-boolean v2, v13, La/e/a/d;->r:Z

    iget v14, v1, La/e/a/m/f;->f1:I

    if-eqz v14, :cond_b

    if-eqz v12, :cond_b

    iput-boolean v6, v13, La/e/a/d;->r:Z

    :cond_b
    iget-object v12, v1, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->y()La/e/a/m/e$b;

    move-result-object v13

    sget-object v14, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    if-eq v13, v14, :cond_d

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->R()La/e/a/m/e$b;

    move-result-object v13

    if-ne v13, v14, :cond_c

    goto :goto_7

    :cond_c
    move v13, v2

    goto :goto_8

    :cond_d
    :goto_7
    move v13, v6

    :goto_8
    invoke-direct/range {p0 .. p0}, La/e/a/m/f;->Q1()V

    move v14, v2

    :goto_9
    if-ge v14, v3, :cond_f

    iget-object v15, v1, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, La/e/a/m/e;

    instance-of v2, v15, La/e/a/m/l;

    if-eqz v2, :cond_e

    check-cast v15, La/e/a/m/l;

    invoke-virtual {v15}, La/e/a/m/l;->p1()V

    :cond_e
    add-int/lit8 v14, v14, 0x1

    const/4 v2, 0x0

    goto :goto_9

    :cond_f
    invoke-virtual {v1, v11}, La/e/a/m/f;->P1(I)Z

    move-result v2

    move v11, v0

    move v14, v6

    const/4 v0, 0x0

    :goto_a
    if-eqz v14, :cond_21

    add-int/lit8 v15, v0, 0x1

    :try_start_0
    iget-object v0, v1, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v0}, La/e/a/d;->D()V

    invoke-direct/range {p0 .. p0}, La/e/a/m/f;->Q1()V

    iget-object v0, v1, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v1, v0}, La/e/a/m/e;->k(La/e/a/d;)V

    const/4 v0, 0x0

    :goto_b
    if-ge v0, v3, :cond_10

    iget-object v6, v1, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/e/a/m/e;

    iget-object v8, v1, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v6, v8}, La/e/a/m/e;->k(La/e/a/d;)V

    add-int/lit8 v0, v0, 0x1

    const/4 v6, 0x1

    const/4 v8, 0x2

    goto :goto_b

    :cond_10
    iget-object v0, v1, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v1, v0}, La/e/a/m/f;->t1(La/e/a/d;)Z

    move-result v14

    iget-object v0, v1, La/e/a/m/f;->k1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_11

    iget-object v0, v1, La/e/a/m/f;->k1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/d;

    iget-object v6, v1, La/e/a/m/f;->R0:La/e/a/d;

    iget-object v8, v1, La/e/a/m/e;->Q:La/e/a/m/d;

    invoke-virtual {v6, v8}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, La/e/a/m/f;->y1(La/e/a/m/d;La/e/a/i;)V

    iput-object v9, v1, La/e/a/m/f;->k1:Ljava/lang/ref/WeakReference;

    :cond_11
    iget-object v0, v1, La/e/a/m/f;->m1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_12

    iget-object v0, v1, La/e/a/m/f;->m1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/d;

    iget-object v6, v1, La/e/a/m/f;->R0:La/e/a/d;

    iget-object v8, v1, La/e/a/m/e;->S:La/e/a/m/d;

    invoke-virtual {v6, v8}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, La/e/a/m/f;->x1(La/e/a/m/d;La/e/a/i;)V

    iput-object v9, v1, La/e/a/m/f;->m1:Ljava/lang/ref/WeakReference;

    :cond_12
    iget-object v0, v1, La/e/a/m/f;->l1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_13

    iget-object v0, v1, La/e/a/m/f;->l1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/d;

    iget-object v6, v1, La/e/a/m/f;->R0:La/e/a/d;

    iget-object v8, v1, La/e/a/m/e;->P:La/e/a/m/d;

    invoke-virtual {v6, v8}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, La/e/a/m/f;->y1(La/e/a/m/d;La/e/a/i;)V

    iput-object v9, v1, La/e/a/m/f;->l1:Ljava/lang/ref/WeakReference;

    :cond_13
    iget-object v0, v1, La/e/a/m/f;->n1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_14

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v0, v1, La/e/a/m/f;->n1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/d;

    iget-object v6, v1, La/e/a/m/f;->R0:La/e/a/d;

    iget-object v8, v1, La/e/a/m/e;->R:La/e/a/m/d;

    invoke-virtual {v6, v8}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v6

    invoke-direct {v1, v0, v6}, La/e/a/m/f;->x1(La/e/a/m/d;La/e/a/i;)V

    iput-object v9, v1, La/e/a/m/f;->n1:Ljava/lang/ref/WeakReference;

    :cond_14
    if-eqz v14, :cond_15

    iget-object v0, v1, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v0}, La/e/a/d;->z()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_c

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    sget-object v6, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "EXCEPTION : "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_15
    :goto_c
    iget-object v0, v1, La/e/a/m/f;->R0:La/e/a/d;

    if-eqz v14, :cond_16

    sget-object v6, La/e/a/m/j;->a:[Z

    invoke-virtual {v1, v0, v6}, La/e/a/m/f;->V1(La/e/a/d;[Z)Z

    move-result v0

    goto :goto_e

    :cond_16
    invoke-virtual {v1, v0, v2}, La/e/a/m/e;->n1(La/e/a/d;Z)V

    const/4 v0, 0x0

    :goto_d
    if-ge v0, v3, :cond_17

    iget-object v6, v1, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/e/a/m/e;

    iget-object v8, v1, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v6, v8, v2}, La/e/a/m/e;->n1(La/e/a/d;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_d

    :cond_17
    const/4 v0, 0x0

    :goto_e
    const/16 v6, 0x8

    if-eqz v13, :cond_1a

    if-ge v15, v6, :cond_1a

    sget-object v8, La/e/a/m/j;->a:[Z

    const/4 v9, 0x2

    aget-boolean v8, v8, v9

    if-eqz v8, :cond_1a

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v14, 0x0

    :goto_f
    if-ge v8, v3, :cond_18

    iget-object v6, v1, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/e/a/m/e;

    move/from16 v16, v0

    iget v0, v6, La/e/a/m/e;->g0:I

    invoke-virtual {v6}, La/e/a/m/e;->U()I

    move-result v17

    add-int v0, v0, v17

    invoke-static {v14, v0}, Ljava/lang/Math;->max(II)I

    move-result v14

    iget v0, v6, La/e/a/m/e;->h0:I

    invoke-virtual {v6}, La/e/a/m/e;->v()I

    move-result v6

    add-int/2addr v0, v6

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int/lit8 v8, v8, 0x1

    move/from16 v0, v16

    const/16 v6, 0x8

    goto :goto_f

    :cond_18
    move/from16 v16, v0

    iget v0, v1, La/e/a/m/e;->n0:I

    invoke-static {v0, v14}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v6, v1, La/e/a/m/e;->o0:I

    invoke-static {v6, v9}, Ljava/lang/Math;->max(II)I

    move-result v6

    sget-object v8, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    if-ne v5, v8, :cond_19

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->U()I

    move-result v9

    if-ge v9, v0, :cond_19

    invoke-virtual {v1, v0}, La/e/a/m/e;->h1(I)V

    iget-object v0, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    const/4 v9, 0x0

    aput-object v8, v0, v9

    const/4 v11, 0x1

    const/16 v16, 0x1

    :cond_19
    if-ne v7, v8, :cond_1b

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->v()I

    move-result v0

    if-ge v0, v6, :cond_1b

    invoke-virtual {v1, v6}, La/e/a/m/e;->I0(I)V

    iget-object v0, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    const/4 v6, 0x1

    aput-object v8, v0, v6

    const/4 v11, 0x1

    const/16 v16, 0x1

    goto :goto_10

    :cond_1a
    move/from16 v16, v0

    :cond_1b
    :goto_10
    iget v0, v1, La/e/a/m/e;->n0:I

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->U()I

    move-result v6

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->U()I

    move-result v6

    if-le v0, v6, :cond_1c

    invoke-virtual {v1, v0}, La/e/a/m/e;->h1(I)V

    iget-object v0, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    sget-object v6, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    const/4 v8, 0x0

    aput-object v6, v0, v8

    const/4 v11, 0x1

    const/16 v16, 0x1

    :cond_1c
    iget v0, v1, La/e/a/m/e;->o0:I

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->v()I

    move-result v6

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->v()I

    move-result v6

    if-le v0, v6, :cond_1d

    invoke-virtual {v1, v0}, La/e/a/m/e;->I0(I)V

    iget-object v0, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    sget-object v6, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    const/4 v8, 0x1

    aput-object v6, v0, v8

    move v6, v8

    move/from16 v16, v6

    goto :goto_11

    :cond_1d
    const/4 v8, 0x1

    move v6, v11

    :goto_11
    if-nez v6, :cond_1f

    iget-object v0, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    const/4 v9, 0x0

    aget-object v0, v0, v9

    sget-object v11, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    if-ne v0, v11, :cond_1e

    if-lez v4, :cond_1e

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->U()I

    move-result v0

    if-le v0, v4, :cond_1e

    iput-boolean v8, v1, La/e/a/m/f;->h1:Z

    iget-object v0, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    sget-object v6, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    aput-object v6, v0, v9

    invoke-virtual {v1, v4}, La/e/a/m/e;->h1(I)V

    move v6, v8

    move/from16 v16, v6

    :cond_1e
    iget-object v0, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    aget-object v0, v0, v8

    if-ne v0, v11, :cond_1f

    if-lez v10, :cond_1f

    invoke-virtual/range {p0 .. p0}, La/e/a/m/e;->v()I

    move-result v0

    if-le v0, v10, :cond_1f

    iput-boolean v8, v1, La/e/a/m/f;->i1:Z

    iget-object v0, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    sget-object v6, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    aput-object v6, v0, v8

    invoke-virtual {v1, v10}, La/e/a/m/e;->I0(I)V

    const/16 v0, 0x8

    const/4 v6, 0x1

    const/4 v11, 0x1

    goto :goto_12

    :cond_1f
    move v11, v6

    move/from16 v6, v16

    const/16 v0, 0x8

    :goto_12
    if-le v15, v0, :cond_20

    const/4 v14, 0x0

    goto :goto_13

    :cond_20
    move v14, v6

    :goto_13
    move v0, v15

    const/4 v6, 0x1

    const/4 v8, 0x2

    const/4 v9, 0x0

    goto/16 :goto_a

    :cond_21
    iput-object v12, v1, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    if-eqz v11, :cond_22

    iget-object v0, v1, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    const/4 v2, 0x0

    aput-object v5, v0, v2

    const/4 v2, 0x1

    aput-object v7, v0, v2

    :cond_22
    iget-object v0, v1, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v0}, La/e/a/d;->v()La/e/a/c;

    move-result-object v0

    invoke-virtual {v1, v0}, La/e/a/m/l;->t0(La/e/a/c;)V

    return-void

    :cond_23
    move-object v1, v9

    throw v1
.end method

.method public r0()V
    .locals 1

    iget-object v0, p0, La/e/a/m/f;->R0:La/e/a/d;

    invoke-virtual {v0}, La/e/a/d;->D()V

    const/4 v0, 0x0

    iput v0, p0, La/e/a/m/f;->S0:I

    iput v0, p0, La/e/a/m/f;->U0:I

    iput v0, p0, La/e/a/m/f;->T0:I

    iput v0, p0, La/e/a/m/f;->V0:I

    iput-boolean v0, p0, La/e/a/m/f;->g1:Z

    invoke-super {p0}, La/e/a/m/l;->r0()V

    return-void
.end method

.method s1(La/e/a/m/e;I)V
    .locals 1

    if-nez p2, :cond_0

    invoke-direct {p0, p1}, La/e/a/m/f;->u1(La/e/a/m/e;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p2, v0, :cond_1

    invoke-direct {p0, p1}, La/e/a/m/f;->z1(La/e/a/m/e;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public t1(La/e/a/d;)Z
    .locals 12

    const/16 v0, 0x40

    invoke-virtual {p0, v0}, La/e/a/m/f;->P1(I)Z

    move-result v0

    invoke-virtual {p0, p1, v0}, La/e/a/m/e;->g(La/e/a/d;Z)V

    iget-object v1, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v3, v1, :cond_1

    iget-object v6, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/e/a/m/e;

    invoke-virtual {v6, v2, v2}, La/e/a/m/e;->P0(IZ)V

    invoke-virtual {v6, v5, v2}, La/e/a/m/e;->P0(IZ)V

    instance-of v6, v6, La/e/a/m/a;

    if-eqz v6, :cond_0

    move v4, v5

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-eqz v4, :cond_3

    move v3, v2

    :goto_1
    if-ge v3, v1, :cond_3

    iget-object v4, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/e/a/m/e;

    instance-of v6, v4, La/e/a/m/a;

    if-eqz v6, :cond_2

    check-cast v4, La/e/a/m/a;

    invoke-virtual {v4}, La/e/a/m/a;->v1()V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    iget-object v3, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    move v3, v2

    :goto_2
    if-ge v3, v1, :cond_6

    iget-object v4, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/e/a/m/e;

    invoke-virtual {v4}, La/e/a/m/e;->f()Z

    move-result v6

    if-eqz v6, :cond_5

    instance-of v6, v4, La/e/a/m/k;

    if-eqz v6, :cond_4

    iget-object v6, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v6, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v4, p1, v0}, La/e/a/m/e;->g(La/e/a/d;Z)V

    :cond_5
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    :goto_4
    iget-object v3, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    if-lez v3, :cond_a

    iget-object v3, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    iget-object v4, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/e/a/m/e;

    check-cast v6, La/e/a/m/k;

    iget-object v7, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v6, v7}, La/e/a/m/k;->r1(Ljava/util/HashSet;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v6, p1, v0}, La/e/a/m/e;->g(La/e/a/d;Z)V

    iget-object v4, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v4, v6}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :cond_8
    iget-object v4, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v4

    if-ne v3, v4, :cond_6

    iget-object v3, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/e/a/m/e;

    invoke-virtual {v4, p1, v0}, La/e/a/m/e;->g(La/e/a/d;Z)V

    goto :goto_5

    :cond_9
    iget-object v3, p0, La/e/a/m/f;->o1:Ljava/util/HashSet;

    invoke-virtual {v3}, Ljava/util/HashSet;->clear()V

    goto :goto_4

    :cond_a
    sget-boolean v3, La/e/a/d;->a:Z

    if-eqz v3, :cond_e

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move v4, v2

    :goto_6
    if-ge v4, v1, :cond_c

    iget-object v6, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/e/a/m/e;

    invoke-virtual {v6}, La/e/a/m/e;->f()Z

    move-result v7

    if-nez v7, :cond_b

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_b
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, La/e/a/m/e;->y()La/e/a/m/e$b;

    move-result-object v1

    sget-object v4, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    if-ne v1, v4, :cond_d

    move v10, v2

    goto :goto_7

    :cond_d
    move v10, v5

    :goto_7
    const/4 v11, 0x0

    move-object v6, p0

    move-object v7, p0

    move-object v8, p1

    move-object v9, v3

    invoke-virtual/range {v6 .. v11}, La/e/a/m/e;->e(La/e/a/m/f;La/e/a/d;Ljava/util/HashSet;IZ)V

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/e/a/m/e;

    invoke-static {p0, p1, v3}, La/e/a/m/j;->a(La/e/a/m/f;La/e/a/d;La/e/a/m/e;)V

    invoke-virtual {v3, p1, v0}, La/e/a/m/e;->g(La/e/a/d;Z)V

    goto :goto_8

    :cond_e
    move v3, v2

    :goto_9
    if-ge v3, v1, :cond_14

    iget-object v4, p0, La/e/a/m/l;->K0:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/e/a/m/e;

    instance-of v6, v4, La/e/a/m/f;

    if-eqz v6, :cond_12

    iget-object v6, v4, La/e/a/m/e;->a0:[La/e/a/m/e$b;

    aget-object v7, v6, v2

    aget-object v6, v6, v5

    sget-object v8, La/e/a/m/e$b;->c:La/e/a/m/e$b;

    if-ne v7, v8, :cond_f

    sget-object v9, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    invoke-virtual {v4, v9}, La/e/a/m/e;->M0(La/e/a/m/e$b;)V

    :cond_f
    if-ne v6, v8, :cond_10

    sget-object v9, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    invoke-virtual {v4, v9}, La/e/a/m/e;->d1(La/e/a/m/e$b;)V

    :cond_10
    invoke-virtual {v4, p1, v0}, La/e/a/m/e;->g(La/e/a/d;Z)V

    if-ne v7, v8, :cond_11

    invoke-virtual {v4, v7}, La/e/a/m/e;->M0(La/e/a/m/e$b;)V

    :cond_11
    if-ne v6, v8, :cond_13

    invoke-virtual {v4, v6}, La/e/a/m/e;->d1(La/e/a/m/e$b;)V

    goto :goto_a

    :cond_12
    invoke-static {p0, p1, v4}, La/e/a/m/j;->a(La/e/a/m/f;La/e/a/d;La/e/a/m/e;)V

    invoke-virtual {v4}, La/e/a/m/e;->f()Z

    move-result v6

    if-nez v6, :cond_13

    invoke-virtual {v4, p1, v0}, La/e/a/m/e;->g(La/e/a/d;Z)V

    :cond_13
    :goto_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_14
    iget v0, p0, La/e/a/m/f;->W0:I

    const/4 v1, 0x0

    if-lez v0, :cond_15

    invoke-static {p0, p1, v1, v2}, La/e/a/m/b;->b(La/e/a/m/f;La/e/a/d;Ljava/util/ArrayList;I)V

    :cond_15
    iget v0, p0, La/e/a/m/f;->X0:I

    if-lez v0, :cond_16

    invoke-static {p0, p1, v1, v5}, La/e/a/m/b;->b(La/e/a/m/f;La/e/a/d;Ljava/util/ArrayList;I)V

    :cond_16
    return v5
.end method

.method public v1(La/e/a/m/d;)V
    .locals 2

    iget-object v0, p0, La/e/a/m/f;->n1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, La/e/a/m/d;->d()I

    move-result v0

    iget-object v1, p0, La/e/a/m/f;->n1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/d;

    invoke-virtual {v1}, La/e/a/m/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/e/a/m/f;->n1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method

.method public w1(La/e/a/m/d;)V
    .locals 2

    iget-object v0, p0, La/e/a/m/f;->l1:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, La/e/a/m/d;->d()I

    move-result v0

    iget-object v1, p0, La/e/a/m/f;->l1:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/d;

    invoke-virtual {v1}, La/e/a/m/d;->d()I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, La/e/a/m/f;->l1:Ljava/lang/ref/WeakReference;

    :cond_1
    return-void
.end method
