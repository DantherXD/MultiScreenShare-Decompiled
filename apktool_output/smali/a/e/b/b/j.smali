.class public La/e/b/b/j;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source ""

# interfaces
.implements La/g/l/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/e/b/b/j$e;,
        La/e/b/b/j$c;,
        La/e/b/b/j$d;,
        La/e/b/b/j$f;
    }
.end annotation


# static fields
.field public static z:Z


# instance fields
.field A:La/e/b/b/l;

.field private A0:La/e/b/b/j$d;

.field B:Landroid/view/animation/Interpolator;

.field private B0:Ljava/lang/Runnable;

.field C:Landroid/view/animation/Interpolator;

.field private C0:[I

.field D:F

.field D0:I

.field private E:I

.field private E0:I

.field F:I

.field private F0:Z

.field private G:I

.field G0:La/e/b/b/j$f;

.field private H:I

.field private H0:Z

.field private I:I

.field I0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private J:Z

.field K:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/View;",
            "La/e/b/b/g;",
            ">;"
        }
    .end annotation
.end field

.field private L:J

.field private M:F

.field N:F

.field O:F

.field private P:J

.field Q:F

.field private R:Z

.field S:Z

.field private T:La/e/b/b/j$e;

.field U:I

.field V:La/e/b/b/j$c;

.field private W:Z

.field private a0:La/e/b/a/b;

.field private b0:La/e/b/b/b;

.field c0:I

.field d0:I

.field e0:I

.field f0:I

.field g0:Z

.field h0:F

.field i0:F

.field j0:J

.field k0:F

.field private l0:Z

.field private m0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/e/b/b/h;",
            ">;"
        }
    .end annotation
.end field

.field private n0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/e/b/b/h;",
            ">;"
        }
    .end annotation
.end field

.field private o0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/e/b/b/h;",
            ">;"
        }
    .end annotation
.end field

.field private p0:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "La/e/b/b/j$e;",
            ">;"
        }
    .end annotation
.end field

.field private q0:I

.field private r0:J

.field private s0:F

.field private t0:I

.field private u0:F

.field v0:Z

.field protected w0:Z

.field x0:F

.field private y0:La/e/a/k/a/c;

.field private z0:Z


# direct methods
.method static synthetic B(La/e/b/b/j;)La/e/b/b/j$d;
    .locals 0

    iget-object p0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    return-object p0
.end method

.method static synthetic C(La/e/b/b/j;)I
    .locals 0

    iget p0, p0, La/e/b/b/j;->G:I

    return p0
.end method

.method static synthetic D(La/e/b/b/j;)I
    .locals 0

    iget p0, p0, La/e/b/b/j;->E:I

    return p0
.end method

.method private G()V
    .locals 6

    iget-object v0, p0, La/e/b/b/j;->T:La/e/b/b/j$e;

    if-nez v0, :cond_0

    iget-object v0, p0, La/e/b/b/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_6

    :cond_0
    iget v0, p0, La/e/b/b/j;->u0:F

    iget v1, p0, La/e/b/b/j;->N:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_6

    iget v0, p0, La/e/b/b/j;->t0:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq v0, v2, :cond_3

    iget-object v0, p0, La/e/b/b/j;->T:La/e/b/b/j$e;

    if-eqz v0, :cond_1

    iget v3, p0, La/e/b/b/j;->E:I

    iget v4, p0, La/e/b/b/j;->G:I

    invoke-interface {v0, p0, v3, v4}, La/e/b/b/j$e;->a(La/e/b/b/j;II)V

    :cond_1
    iget-object v0, p0, La/e/b/b/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/e/b/b/j$e;

    iget v4, p0, La/e/b/b/j;->E:I

    iget v5, p0, La/e/b/b/j;->G:I

    invoke-interface {v3, p0, v4, v5}, La/e/b/b/j$e;->a(La/e/b/b/j;II)V

    goto :goto_0

    :cond_2
    iput-boolean v1, p0, La/e/b/b/j;->v0:Z

    :cond_3
    iput v2, p0, La/e/b/b/j;->t0:I

    iget v0, p0, La/e/b/b/j;->N:F

    iput v0, p0, La/e/b/b/j;->u0:F

    iget-object v2, p0, La/e/b/b/j;->T:La/e/b/b/j$e;

    if-eqz v2, :cond_4

    iget v3, p0, La/e/b/b/j;->E:I

    iget v4, p0, La/e/b/b/j;->G:I

    invoke-interface {v2, p0, v3, v4, v0}, La/e/b/b/j$e;->b(La/e/b/b/j;IIF)V

    :cond_4
    iget-object v0, p0, La/e/b/b/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/e/b/b/j$e;

    iget v3, p0, La/e/b/b/j;->E:I

    iget v4, p0, La/e/b/b/j;->G:I

    iget v5, p0, La/e/b/b/j;->N:F

    invoke-interface {v2, p0, v3, v4, v5}, La/e/b/b/j$e;->b(La/e/b/b/j;IIF)V

    goto :goto_1

    :cond_5
    iput-boolean v1, p0, La/e/b/b/j;->v0:Z

    :cond_6
    return-void
.end method

.method private K()V
    .locals 5

    iget-object v0, p0, La/e/b/b/j;->T:La/e/b/b/j$e;

    if-nez v0, :cond_1

    iget-object v0, p0, La/e/b/b/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, La/e/b/b/j;->v0:Z

    iget-object v0, p0, La/e/b/b/j;->I0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, p0, La/e/b/b/j;->T:La/e/b/b/j$e;

    if-eqz v2, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2, p0, v3}, La/e/b/b/j$e;->c(La/e/b/b/j;I)V

    :cond_3
    iget-object v2, p0, La/e/b/b/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/e/b/b/j$e;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v3, p0, v4}, La/e/b/b/j$e;->c(La/e/b/b/j;I)V

    goto :goto_0

    :cond_4
    iget-object p0, p0, La/e/b/b/j;->I0:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method


# virtual methods
.method E(F)V
    .locals 2

    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, La/e/b/b/j;->O:F

    iget v1, p0, La/e/b/b/j;->N:F

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_1

    iget-boolean v0, p0, La/e/b/b/j;->R:Z

    if-eqz v0, :cond_1

    iput v1, p0, La/e/b/b/j;->O:F

    :cond_1
    iget v0, p0, La/e/b/b/j;->O:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x0

    iput-boolean v0, p0, La/e/b/b/j;->W:Z

    iput p1, p0, La/e/b/b/j;->Q:F

    const/4 p0, 0x0

    throw p0
.end method

.method F(Z)V
    .locals 23

    move-object/from16 v0, p0

    iget-wide v1, v0, La/e/b/b/j;->P:J

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    invoke-virtual/range {p0 .. p0}, La/e/b/b/j;->getNanoTime()J

    move-result-wide v1

    iput-wide v1, v0, La/e/b/b/j;->P:J

    :cond_0
    iget v1, v0, La/e/b/b/j;->O:F

    const/4 v2, 0x0

    cmpl-float v3, v1, v2

    const/4 v4, -0x1

    const/high16 v5, 0x3f800000    # 1.0f

    if-lez v3, :cond_1

    cmpg-float v3, v1, v5

    if-gez v3, :cond_1

    iput v4, v0, La/e/b/b/j;->F:I

    :cond_1
    iget-boolean v3, v0, La/e/b/b/j;->l0:Z

    const/4 v7, 0x0

    if-nez v3, :cond_3

    iget-boolean v3, v0, La/e/b/b/j;->S:Z

    if-eqz v3, :cond_2

    if-nez p1, :cond_3

    iget v3, v0, La/e/b/b/j;->Q:F

    cmpl-float v3, v3, v1

    if-eqz v3, :cond_2

    goto :goto_0

    :cond_2
    const/4 v6, 0x1

    goto/16 :goto_f

    :cond_3
    :goto_0
    iget v3, v0, La/e/b/b/j;->Q:F

    sub-float/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v1

    invoke-virtual/range {p0 .. p0}, La/e/b/b/j;->getNanoTime()J

    move-result-wide v8

    iget-object v3, v0, La/e/b/b/j;->B:Landroid/view/animation/Interpolator;

    instance-of v10, v3, La/e/b/b/i;

    const v11, 0x3089705f    # 1.0E-9f

    if-nez v10, :cond_4

    iget-wide v12, v0, La/e/b/b/j;->P:J

    sub-long v12, v8, v12

    long-to-float v10, v12

    mul-float/2addr v10, v1

    mul-float/2addr v10, v11

    iget v12, v0, La/e/b/b/j;->M:F

    div-float/2addr v10, v12

    goto :goto_1

    :cond_4
    move v10, v2

    :goto_1
    iget v12, v0, La/e/b/b/j;->O:F

    add-float/2addr v12, v10

    iget-boolean v13, v0, La/e/b/b/j;->R:Z

    if-eqz v13, :cond_5

    iget v12, v0, La/e/b/b/j;->Q:F

    :cond_5
    cmpl-float v13, v1, v2

    if-lez v13, :cond_6

    iget v14, v0, La/e/b/b/j;->Q:F

    cmpl-float v14, v12, v14

    if-gez v14, :cond_7

    :cond_6
    cmpg-float v14, v1, v2

    if-gtz v14, :cond_8

    iget v14, v0, La/e/b/b/j;->Q:F

    cmpg-float v14, v12, v14

    if-gtz v14, :cond_8

    :cond_7
    iget v12, v0, La/e/b/b/j;->Q:F

    iput-boolean v7, v0, La/e/b/b/j;->S:Z

    const/4 v14, 0x1

    goto :goto_2

    :cond_8
    move v14, v7

    :goto_2
    iput v12, v0, La/e/b/b/j;->O:F

    iput v12, v0, La/e/b/b/j;->N:F

    iput-wide v8, v0, La/e/b/b/j;->P:J

    const v15, 0x3727c5ac    # 1.0E-5f

    const/16 v16, 0x0

    if-eqz v3, :cond_e

    if-nez v14, :cond_e

    iget-boolean v14, v0, La/e/b/b/j;->W:Z

    if-eqz v14, :cond_b

    iget-wide v6, v0, La/e/b/b/j;->L:J

    sub-long v6, v8, v6

    long-to-float v6, v6

    mul-float/2addr v6, v11

    invoke-interface {v3, v6}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v3

    iget-object v6, v0, La/e/b/b/j;->B:Landroid/view/animation/Interpolator;

    iget-object v7, v0, La/e/b/b/j;->a0:La/e/b/a/b;

    if-eq v6, v7, :cond_a

    iput v3, v0, La/e/b/b/j;->O:F

    iput-wide v8, v0, La/e/b/b/j;->P:J

    instance-of v7, v6, La/e/b/b/i;

    if-eqz v7, :cond_d

    check-cast v6, La/e/b/b/i;

    invoke-virtual {v6}, La/e/b/b/i;->a()F

    move-result v6

    iput v6, v0, La/e/b/b/j;->D:F

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v7

    iget v8, v0, La/e/b/b/j;->M:F

    mul-float/2addr v7, v8

    cmpg-float v7, v7, v15

    cmpl-float v7, v6, v2

    if-lez v7, :cond_9

    cmpl-float v7, v3, v5

    if-ltz v7, :cond_9

    iput v5, v0, La/e/b/b/j;->O:F

    const/4 v7, 0x0

    iput-boolean v7, v0, La/e/b/b/j;->S:Z

    move v3, v5

    goto :goto_3

    :cond_9
    const/4 v7, 0x0

    :goto_3
    cmpg-float v6, v6, v2

    if-gez v6, :cond_d

    cmpg-float v6, v3, v2

    if-gtz v6, :cond_d

    iput v2, v0, La/e/b/b/j;->O:F

    iput-boolean v7, v0, La/e/b/b/j;->S:Z

    move v12, v2

    goto :goto_5

    :cond_a
    throw v16

    :cond_b
    invoke-interface {v3, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v3

    iget-object v6, v0, La/e/b/b/j;->B:Landroid/view/animation/Interpolator;

    instance-of v7, v6, La/e/b/b/i;

    if-eqz v7, :cond_c

    check-cast v6, La/e/b/b/i;

    invoke-virtual {v6}, La/e/b/b/i;->a()F

    move-result v6

    goto :goto_4

    :cond_c
    add-float/2addr v12, v10

    invoke-interface {v6, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v6

    sub-float/2addr v6, v3

    mul-float/2addr v6, v1

    div-float/2addr v6, v10

    :goto_4
    iput v6, v0, La/e/b/b/j;->D:F

    :cond_d
    move v12, v3

    goto :goto_5

    :cond_e
    iput v10, v0, La/e/b/b/j;->D:F

    :goto_5
    iget v3, v0, La/e/b/b/j;->D:F

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v3, v3, v15

    if-lez v3, :cond_f

    sget-object v3, La/e/b/b/j$f;->d:La/e/b/b/j$f;

    invoke-virtual {v0, v3}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    :cond_f
    if-lez v13, :cond_10

    iget v3, v0, La/e/b/b/j;->Q:F

    cmpl-float v3, v12, v3

    if-gez v3, :cond_11

    :cond_10
    cmpg-float v3, v1, v2

    if-gtz v3, :cond_12

    iget v3, v0, La/e/b/b/j;->Q:F

    cmpg-float v3, v12, v3

    if-gtz v3, :cond_12

    :cond_11
    iget v12, v0, La/e/b/b/j;->Q:F

    const/4 v3, 0x0

    iput-boolean v3, v0, La/e/b/b/j;->S:Z

    :cond_12
    cmpl-float v3, v12, v5

    if-gez v3, :cond_14

    cmpg-float v3, v12, v2

    if-gtz v3, :cond_13

    goto :goto_6

    :cond_13
    const/4 v7, 0x0

    goto :goto_7

    :cond_14
    :goto_6
    const/4 v7, 0x0

    iput-boolean v7, v0, La/e/b/b/j;->S:Z

    sget-object v3, La/e/b/b/j$f;->e:La/e/b/b/j$f;

    invoke-virtual {v0, v3}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    :goto_7
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    iput-boolean v7, v0, La/e/b/b/j;->l0:Z

    invoke-virtual/range {p0 .. p0}, La/e/b/b/j;->getNanoTime()J

    move-result-wide v8

    iput v12, v0, La/e/b/b/j;->x0:F

    iget-object v6, v0, La/e/b/b/j;->C:Landroid/view/animation/Interpolator;

    if-nez v6, :cond_15

    move v6, v12

    goto :goto_8

    :cond_15
    invoke-interface {v6, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v6

    :goto_8
    iget-object v10, v0, La/e/b/b/j;->C:Landroid/view/animation/Interpolator;

    if-eqz v10, :cond_16

    iget v11, v0, La/e/b/b/j;->M:F

    div-float v11, v1, v11

    add-float/2addr v11, v12

    invoke-interface {v10, v11}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v10

    iput v10, v0, La/e/b/b/j;->D:F

    iget-object v11, v0, La/e/b/b/j;->C:Landroid/view/animation/Interpolator;

    invoke-interface {v11, v12}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v11

    sub-float/2addr v10, v11

    iput v10, v0, La/e/b/b/j;->D:F

    :cond_16
    move v10, v7

    :goto_9
    if-ge v10, v3, :cond_18

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    iget-object v15, v0, La/e/b/b/j;->K:Ljava/util/HashMap;

    invoke-virtual {v15, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v17, v15

    check-cast v17, La/e/b/b/g;

    if-eqz v17, :cond_17

    iget-boolean v15, v0, La/e/b/b/j;->l0:Z

    iget-object v7, v0, La/e/b/b/j;->y0:La/e/a/k/a/c;

    move-object/from16 v18, v11

    move/from16 v19, v6

    move-wide/from16 v20, v8

    move-object/from16 v22, v7

    invoke-virtual/range {v17 .. v22}, La/e/b/b/g;->c(Landroid/view/View;FJLa/e/a/k/a/c;)Z

    move-result v7

    or-int/2addr v7, v15

    iput-boolean v7, v0, La/e/b/b/j;->l0:Z

    :cond_17
    add-int/lit8 v10, v10, 0x1

    const/4 v7, 0x0

    goto :goto_9

    :cond_18
    if-lez v13, :cond_19

    iget v3, v0, La/e/b/b/j;->Q:F

    cmpl-float v3, v12, v3

    if-gez v3, :cond_1a

    :cond_19
    cmpg-float v3, v1, v2

    if-gtz v3, :cond_1b

    iget v3, v0, La/e/b/b/j;->Q:F

    cmpg-float v3, v12, v3

    if-gtz v3, :cond_1b

    :cond_1a
    const/4 v7, 0x1

    goto :goto_a

    :cond_1b
    const/4 v7, 0x0

    :goto_a
    iget-boolean v3, v0, La/e/b/b/j;->l0:Z

    if-nez v3, :cond_1c

    iget-boolean v3, v0, La/e/b/b/j;->S:Z

    if-nez v3, :cond_1c

    if-eqz v7, :cond_1c

    sget-object v3, La/e/b/b/j$f;->e:La/e/b/b/j$f;

    invoke-virtual {v0, v3}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    :cond_1c
    iget-boolean v3, v0, La/e/b/b/j;->w0:Z

    if-eqz v3, :cond_1d

    invoke-virtual/range {p0 .. p0}, La/e/b/b/j;->requestLayout()V

    :cond_1d
    iget-boolean v3, v0, La/e/b/b/j;->l0:Z

    const/4 v6, 0x1

    xor-int/2addr v7, v6

    or-int/2addr v3, v7

    iput-boolean v3, v0, La/e/b/b/j;->l0:Z

    cmpg-float v7, v12, v2

    if-gtz v7, :cond_1f

    iget v7, v0, La/e/b/b/j;->E:I

    if-eq v7, v4, :cond_1f

    iget v4, v0, La/e/b/b/j;->F:I

    if-ne v4, v7, :cond_1e

    goto :goto_b

    :cond_1e
    iput v7, v0, La/e/b/b/j;->F:I

    throw v16

    :cond_1f
    :goto_b
    float-to-double v7, v12

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    cmpl-double v4, v7, v9

    if-ltz v4, :cond_21

    iget v4, v0, La/e/b/b/j;->F:I

    iget v7, v0, La/e/b/b/j;->G:I

    if-ne v4, v7, :cond_20

    goto :goto_c

    :cond_20
    iput v7, v0, La/e/b/b/j;->F:I

    throw v16

    :cond_21
    :goto_c
    if-nez v3, :cond_25

    iget-boolean v3, v0, La/e/b/b/j;->S:Z

    if-eqz v3, :cond_22

    goto :goto_d

    :cond_22
    if-lez v13, :cond_23

    cmpl-float v3, v12, v5

    if-eqz v3, :cond_24

    :cond_23
    cmpg-float v3, v1, v2

    if-gez v3, :cond_26

    cmpl-float v3, v12, v2

    if-nez v3, :cond_26

    :cond_24
    sget-object v3, La/e/b/b/j$f;->e:La/e/b/b/j$f;

    invoke-virtual {v0, v3}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    goto :goto_e

    :cond_25
    :goto_d
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_26
    :goto_e
    iget-boolean v3, v0, La/e/b/b/j;->l0:Z

    if-nez v3, :cond_29

    iget-boolean v3, v0, La/e/b/b/j;->S:Z

    if-nez v3, :cond_29

    if-lez v13, :cond_27

    cmpl-float v3, v12, v5

    if-eqz v3, :cond_28

    :cond_27
    cmpg-float v1, v1, v2

    if-gez v1, :cond_29

    cmpl-float v1, v12, v2

    if-nez v1, :cond_29

    :cond_28
    invoke-virtual/range {p0 .. p0}, La/e/b/b/j;->J()V

    :cond_29
    :goto_f
    iget v1, v0, La/e/b/b/j;->O:F

    cmpl-float v3, v1, v5

    if-ltz v3, :cond_2b

    iget v1, v0, La/e/b/b/j;->F:I

    iget v2, v0, La/e/b/b/j;->G:I

    if-eq v1, v2, :cond_2a

    goto :goto_10

    :cond_2a
    const/4 v6, 0x0

    :goto_10
    iput v2, v0, La/e/b/b/j;->F:I

    move v7, v6

    goto :goto_11

    :cond_2b
    cmpg-float v1, v1, v2

    if-gtz v1, :cond_2c

    iget v1, v0, La/e/b/b/j;->F:I

    iget v2, v0, La/e/b/b/j;->E:I

    if-eq v1, v2, :cond_2a

    goto :goto_10

    :cond_2c
    const/4 v7, 0x0

    :goto_11
    iget-boolean v1, v0, La/e/b/b/j;->H0:Z

    or-int/2addr v1, v7

    iput-boolean v1, v0, La/e/b/b/j;->H0:Z

    if-eqz v7, :cond_2d

    iget-boolean v1, v0, La/e/b/b/j;->z0:Z

    if-nez v1, :cond_2d

    invoke-virtual/range {p0 .. p0}, La/e/b/b/j;->requestLayout()V

    :cond_2d
    iget v1, v0, La/e/b/b/j;->O:F

    iput v1, v0, La/e/b/b/j;->N:F

    return-void
.end method

.method protected H()V
    .locals 4

    iget-object v0, p0, La/e/b/b/j;->T:La/e/b/b/j$e;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, La/e/b/b/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    iget v0, p0, La/e/b/b/j;->t0:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_2

    iget v0, p0, La/e/b/b/j;->F:I

    iput v0, p0, La/e/b/b/j;->t0:I

    iget-object v0, p0, La/e/b/b/j;->I0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La/e/b/b/j;->I0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget v3, p0, La/e/b/b/j;->F:I

    if-eq v0, v3, :cond_2

    if-eq v3, v2, :cond_2

    iget-object v0, p0, La/e/b/b/j;->I0:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-direct {p0}, La/e/b/b/j;->K()V

    iget-object v0, p0, La/e/b/b/j;->B0:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_3
    iget-object v0, p0, La/e/b/b/j;->C0:[I

    if-eqz v0, :cond_4

    iget v2, p0, La/e/b/b/j;->D0:I

    if-lez v2, :cond_4

    const/4 v2, 0x0

    aget v0, v0, v2

    invoke-virtual {p0, v0}, La/e/b/b/j;->Q(I)V

    iget-object v0, p0, La/e/b/b/j;->C0:[I

    array-length v3, v0

    sub-int/2addr v3, v1

    invoke-static {v0, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, La/e/b/b/j;->D0:I

    sub-int/2addr v0, v1

    iput v0, p0, La/e/b/b/j;->D0:I

    :cond_4
    return-void
.end method

.method public I(I)La/e/b/b/l$a;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method J()V
    .locals 0

    iget-object p0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public L()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public M(FF)V
    .locals 2

    invoke-virtual {p0}, La/e/b/b/j;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    if-nez v0, :cond_0

    new-instance v0, La/e/b/b/j$d;

    invoke-direct {v0, p0}, La/e/b/b/j$d;-><init>(La/e/b/b/j;)V

    iput-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    :cond_0
    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {v0, p1}, La/e/b/b/j$d;->e(F)V

    iget-object p0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {p0, p2}, La/e/b/b/j$d;->h(F)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, La/e/b/b/j;->setProgress(F)V

    sget-object v0, La/e/b/b/j$f;->d:La/e/b/b/j$f;

    invoke-virtual {p0, v0}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    iput p2, p0, La/e/b/b/j;->D:F

    const/4 v0, 0x0

    cmpl-float p2, p2, v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p2, :cond_3

    if-lez p2, :cond_2

    :goto_0
    move v0, v1

    :cond_2
    invoke-virtual {p0, v0}, La/e/b/b/j;->E(F)V

    goto :goto_1

    :cond_3
    cmpl-float p2, p1, v0

    if-eqz p2, :cond_4

    cmpl-float p2, p1, v1

    if-eqz p2, :cond_4

    const/high16 p2, 0x3f000000    # 0.5f

    cmpl-float p1, p1, p2

    if-lez p1, :cond_2

    goto :goto_0

    :cond_4
    :goto_1
    return-void
.end method

.method public N(III)V
    .locals 1

    sget-object v0, La/e/b/b/j$f;->c:La/e/b/b/j$f;

    invoke-virtual {p0, v0}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    iput p1, p0, La/e/b/b/j;->F:I

    const/4 v0, -0x1

    iput v0, p0, La/e/b/b/j;->E:I

    iput v0, p0, La/e/b/b/j;->G:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Landroidx/constraintlayout/widget/c;

    if-eqz v0, :cond_0

    int-to-float p0, p2

    int-to-float p2, p3

    invoke-virtual {v0, p1, p0, p2}, Landroidx/constraintlayout/widget/c;->d(IFF)V

    goto :goto_0

    :cond_0
    iget-object p0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez p0, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 p0, 0x0

    throw p0
.end method

.method public O(II)V
    .locals 1

    invoke-virtual {p0}, La/e/b/b/j;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    if-nez v0, :cond_0

    new-instance v0, La/e/b/b/j$d;

    invoke-direct {v0, p0}, La/e/b/b/j$d;-><init>(La/e/b/b/j;)V

    iput-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    :cond_0
    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {v0, p1}, La/e/b/b/j$d;->f(I)V

    iget-object p0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {p0, p2}, La/e/b/b/j$d;->d(I)V

    return-void

    :cond_1
    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v0, :cond_2

    return-void

    :cond_2
    iput p1, p0, La/e/b/b/j;->E:I

    iput p2, p0, La/e/b/b/j;->G:I

    const/4 p0, 0x0

    throw p0
.end method

.method public P()V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, La/e/b/b/j;->E(F)V

    const/4 v0, 0x0

    iput-object v0, p0, La/e/b/b/j;->B0:Ljava/lang/Runnable;

    return-void
.end method

.method public Q(I)V
    .locals 1

    invoke-virtual {p0}, La/e/b/b/j;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    if-nez v0, :cond_0

    new-instance v0, La/e/b/b/j$d;

    invoke-direct {v0, p0}, La/e/b/b/j$d;-><init>(La/e/b/b/j;)V

    iput-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    :cond_0
    iget-object p0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {p0, p1}, La/e/b/b/j$d;->d(I)V

    return-void

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p0, p1, v0, v0}, La/e/b/b/j;->R(III)V

    return-void
.end method

.method public R(III)V
    .locals 1

    const/4 v0, -0x1

    invoke-virtual {p0, p1, p2, p3, v0}, La/e/b/b/j;->S(IIII)V

    return-void
.end method

.method public S(IIII)V
    .locals 4

    iget-object p2, p0, La/e/b/b/j;->A:La/e/b/b/l;

    const/4 p3, 0x0

    if-nez p2, :cond_8

    iget p2, p0, La/e/b/b/j;->F:I

    if-ne p2, p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, La/e/b/b/j;->E:I

    const/high16 v1, 0x447a0000    # 1000.0f

    const/4 v2, 0x0

    if-ne v0, p1, :cond_2

    invoke-virtual {p0, v2}, La/e/b/b/j;->E(F)V

    if-lez p4, :cond_1

    int-to-float p1, p4

    div-float/2addr p1, v1

    iput p1, p0, La/e/b/b/j;->M:F

    :cond_1
    return-void

    :cond_2
    iget v0, p0, La/e/b/b/j;->G:I

    const/high16 v3, 0x3f800000    # 1.0f

    if-ne v0, p1, :cond_4

    invoke-virtual {p0, v3}, La/e/b/b/j;->E(F)V

    if-lez p4, :cond_3

    int-to-float p1, p4

    div-float/2addr p1, v1

    iput p1, p0, La/e/b/b/j;->M:F

    :cond_3
    return-void

    :cond_4
    iput p1, p0, La/e/b/b/j;->G:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_6

    invoke-virtual {p0, p2, p1}, La/e/b/b/j;->O(II)V

    invoke-virtual {p0, v3}, La/e/b/b/j;->E(F)V

    iput v2, p0, La/e/b/b/j;->O:F

    invoke-virtual {p0}, La/e/b/b/j;->P()V

    if-lez p4, :cond_5

    int-to-float p1, p4

    div-float/2addr p1, v1

    iput p1, p0, La/e/b/b/j;->M:F

    :cond_5
    return-void

    :cond_6
    const/4 p1, 0x0

    iput-boolean p1, p0, La/e/b/b/j;->W:Z

    iput v3, p0, La/e/b/b/j;->Q:F

    iput v2, p0, La/e/b/b/j;->N:F

    iput v2, p0, La/e/b/b/j;->O:F

    invoke-virtual {p0}, La/e/b/b/j;->getNanoTime()J

    move-result-wide v1

    iput-wide v1, p0, La/e/b/b/j;->P:J

    invoke-virtual {p0}, La/e/b/b/j;->getNanoTime()J

    move-result-wide v1

    iput-wide v1, p0, La/e/b/b/j;->L:J

    iput-boolean p1, p0, La/e/b/b/j;->R:Z

    iput-object p3, p0, La/e/b/b/j;->B:Landroid/view/animation/Interpolator;

    if-ne p4, v0, :cond_7

    throw p3

    :cond_7
    iput v0, p0, La/e/b/b/j;->E:I

    throw p3

    :cond_8
    throw p3
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 10

    iget-object v0, p0, La/e/b/b/j;->o0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/b/b/h;

    invoke-virtual {v1, p1}, La/e/b/b/h;->x(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La/e/b/b/j;->F(Z)V

    iget-object v1, p0, La/e/b/b/j;->A:La/e/b/b/l;

    const/4 v2, 0x0

    if-nez v1, :cond_9

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->dispatchDraw(Landroid/graphics/Canvas;)V

    iget-object v1, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v1, :cond_1

    return-void

    :cond_1
    iget v1, p0, La/e/b/b/j;->U:I

    const/4 v3, 0x1

    and-int/2addr v1, v3

    if-ne v1, v3, :cond_5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_5

    iget v1, p0, La/e/b/b/j;->q0:I

    add-int/2addr v1, v3

    iput v1, p0, La/e/b/b/j;->q0:I

    invoke-virtual {p0}, La/e/b/b/j;->getNanoTime()J

    move-result-wide v4

    iget-wide v6, p0, La/e/b/b/j;->r0:J

    const-wide/16 v8, -0x1

    cmp-long v1, v6, v8

    if-eqz v1, :cond_2

    sub-long v6, v4, v6

    const-wide/32 v8, 0xbebc200

    cmp-long v1, v6, v8

    if-lez v1, :cond_3

    iget v1, p0, La/e/b/b/j;->q0:I

    int-to-float v1, v1

    long-to-float v6, v6

    const v7, 0x3089705f    # 1.0E-9f

    mul-float/2addr v6, v7

    div-float/2addr v1, v6

    const/high16 v6, 0x42c80000    # 100.0f

    mul-float/2addr v1, v6

    float-to-int v1, v1

    int-to-float v1, v1

    div-float/2addr v1, v6

    iput v1, p0, La/e/b/b/j;->s0:F

    iput v0, p0, La/e/b/b/j;->q0:I

    :cond_2
    iput-wide v4, p0, La/e/b/b/j;->r0:J

    :cond_3
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    const/high16 v1, 0x42280000    # 42.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {p0}, La/e/b/b/j;->getProgress()F

    move-result v1

    const/high16 v4, 0x447a0000    # 1000.0f

    mul-float/2addr v1, v4

    float-to-int v1, v1

    int-to-float v1, v1

    const/high16 v4, 0x41200000    # 10.0f

    div-float/2addr v1, v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, p0, La/e/b/b/j;->s0:F

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v6, " fps "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, La/e/b/b/j;->E:I

    invoke-static {p0, v6}, La/e/b/b/a;->c(La/e/b/b/j;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " -> "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v5, p0, La/e/b/b/j;->G:I

    invoke-static {p0, v5}, La/e/b/b/a;->c(La/e/b/b/j;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " (progress: "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " ) state="

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/e/b/b/j;->F:I

    const/4 v5, -0x1

    if-ne v1, v5, :cond_4

    const-string v1, "undefined"

    goto :goto_1

    :cond_4
    invoke-static {p0, v1}, La/e/b/b/a;->c(La/e/b/b/j;I)Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v5, -0x1000000

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v5, 0x41300000    # 11.0f

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v6

    add-int/lit8 v6, v6, -0x1d

    int-to-float v6, v6

    invoke-virtual {p1, v1, v5, v6, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const v5, -0x77ff78

    invoke-virtual {v0, v5}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getHeight()I

    move-result v5

    add-int/lit8 v5, v5, -0x1e

    int-to-float v5, v5

    invoke-virtual {p1, v1, v4, v5, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_5
    iget v0, p0, La/e/b/b/j;->U:I

    if-le v0, v3, :cond_7

    iget-object p1, p0, La/e/b/b/j;->V:La/e/b/b/j$c;

    if-nez p1, :cond_6

    new-instance p1, La/e/b/b/j$c;

    invoke-direct {p1, p0}, La/e/b/b/j$c;-><init>(La/e/b/b/j;)V

    iput-object p1, p0, La/e/b/b/j;->V:La/e/b/b/j$c;

    :cond_6
    throw v2

    :cond_7
    iget-object p0, p0, La/e/b/b/j;->o0:Ljava/util/ArrayList;

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/b/b/h;

    invoke-virtual {v0, p1}, La/e/b/b/h;->w(Landroid/graphics/Canvas;)V

    goto :goto_2

    :cond_8
    return-void

    :cond_9
    throw v2
.end method

.method public getConstraintSetIds()[I
    .locals 1

    iget-object p0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    throw v0
.end method

.method public getCurrentState()I
    .locals 0

    iget p0, p0, La/e/b/b/j;->F:I

    return p0
.end method

.method public getDefinedTransitions()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "La/e/b/b/l$a;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    throw v0
.end method

.method public getDesignTool()La/e/b/b/b;
    .locals 1

    iget-object v0, p0, La/e/b/b/j;->b0:La/e/b/b/b;

    if-nez v0, :cond_0

    new-instance v0, La/e/b/b/b;

    invoke-direct {v0, p0}, La/e/b/b/b;-><init>(La/e/b/b/j;)V

    iput-object v0, p0, La/e/b/b/j;->b0:La/e/b/b/b;

    :cond_0
    iget-object p0, p0, La/e/b/b/j;->b0:La/e/b/b/b;

    return-object p0
.end method

.method public getEndState()I
    .locals 0

    iget p0, p0, La/e/b/b/j;->G:I

    return p0
.end method

.method protected getNanoTime()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public getProgress()F
    .locals 0

    iget p0, p0, La/e/b/b/j;->O:F

    return p0
.end method

.method public getScene()La/e/b/b/l;
    .locals 0

    iget-object p0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    return-object p0
.end method

.method public getStartState()I
    .locals 0

    iget p0, p0, La/e/b/b/j;->E:I

    return p0
.end method

.method public getTargetPosition()F
    .locals 0

    iget p0, p0, La/e/b/b/j;->Q:F

    return p0
.end method

.method public getTransitionState()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    if-nez v0, :cond_0

    new-instance v0, La/e/b/b/j$d;

    invoke-direct {v0, p0}, La/e/b/b/j$d;-><init>(La/e/b/b/j;)V

    iput-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    :cond_0
    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {v0}, La/e/b/b/j$d;->c()V

    iget-object p0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {p0}, La/e/b/b/j$d;->b()Landroid/os/Bundle;

    move-result-object p0

    return-object p0
.end method

.method public getTransitionTimeMs()J
    .locals 2

    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v0, :cond_0

    iget p0, p0, La/e/b/b/j;->M:F

    const/high16 v0, 0x447a0000    # 1000.0f

    mul-float/2addr p0, v0

    float-to-long v0, p0

    return-wide v0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public getVelocity()F
    .locals 0

    iget p0, p0, La/e/b/b/j;->D:F

    return p0
.end method

.method public h(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    invoke-virtual {p0}, La/e/b/b/j;->getNanoTime()J

    move-result-wide p1

    iput-wide p1, p0, La/e/b/b/j;->j0:J

    const/4 p1, 0x0

    iput p1, p0, La/e/b/b/j;->k0:F

    iput p1, p0, La/e/b/b/j;->h0:F

    iput p1, p0, La/e/b/b/j;->i0:F

    return-void
.end method

.method public i(Landroid/view/View;I)V
    .locals 0

    iget-object p1, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-eqz p1, :cond_1

    iget p0, p0, La/e/b/b/j;->k0:F

    const/4 p1, 0x0

    cmpl-float p0, p0, p1

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method public isAttachedToWindow()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    invoke-super {p0}, Landroid/view/ViewGroup;->isAttachedToWindow()Z

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public j(Landroid/view/View;II[II)V
    .locals 0

    iget-object p0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public m(Landroid/view/View;IIIII[I)V
    .locals 0

    iget-boolean p1, p0, La/e/b/b/j;->g0:Z

    const/4 p6, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    :cond_0
    aget p1, p7, p6

    add-int/2addr p1, p4

    aput p1, p7, p6

    const/4 p1, 0x1

    aget p2, p7, p1

    add-int/2addr p2, p5

    aput p2, p7, p1

    :cond_1
    iput-boolean p6, p0, La/e/b/b/j;->g0:Z

    return-void
.end method

.method public n(Landroid/view/View;IIIII)V
    .locals 0

    return-void
.end method

.method public o(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    iget-object p0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method protected onAttachedToWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    iput v0, p0, La/e/b/b/j;->E0:I

    :cond_0
    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget v0, p0, La/e/b/b/j;->F:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    goto :goto_0

    :cond_1
    throw v1

    :cond_2
    :goto_0
    invoke-virtual {p0}, La/e/b/b/j;->J()V

    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    if-eqz v0, :cond_4

    iget-boolean v1, p0, La/e/b/b/j;->F0:Z

    if-eqz v1, :cond_3

    new-instance v0, La/e/b/b/j$a;

    invoke-direct {v0, p0}, La/e/b/b/j$a;-><init>(La/e/b/b/j;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, La/e/b/b/j$d;->a()V

    goto :goto_1

    :cond_4
    iget-object p0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez p0, :cond_5

    :goto_1
    return-void

    :cond_5
    throw v1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p1, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-eqz p1, :cond_1

    iget-boolean p0, p0, La/e/b/b/j;->J:Z

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method protected onLayout(ZIIII)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, La/e/b/b/j;->z0:Z

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v2, :cond_0

    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, La/e/b/b/j;->z0:Z

    return-void

    :cond_0
    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    :try_start_1
    iget p1, p0, La/e/b/b/j;->e0:I

    if-ne p1, p4, :cond_1

    iget p1, p0, La/e/b/b/j;->f0:I

    if-eq p1, p5, :cond_2

    :cond_1
    invoke-virtual {p0}, La/e/b/b/j;->L()V

    invoke-virtual {p0, v0}, La/e/b/b/j;->F(Z)V

    :cond_2
    iput p4, p0, La/e/b/b/j;->e0:I

    iput p5, p0, La/e/b/b/j;->f0:I

    iput p4, p0, La/e/b/b/j;->c0:I

    iput p5, p0, La/e/b/b/j;->d0:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-boolean v1, p0, La/e/b/b/j;->z0:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, La/e/b/b/j;->z0:Z

    throw p1
.end method

.method protected onMeasure(II)V
    .locals 1

    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v0, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;->onMeasure(II)V

    return-void

    :cond_0
    iget v0, p0, La/e/b/b/j;->H:I

    if-ne v0, p1, :cond_1

    iget v0, p0, La/e/b/b/j;->I:I

    :cond_1
    iget-boolean v0, p0, La/e/b/b/j;->H0:Z

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    iput-boolean v0, p0, La/e/b/b/j;->H0:Z

    invoke-virtual {p0}, La/e/b/b/j;->J()V

    invoke-direct {p0}, La/e/b/b/j;->K()V

    :cond_2
    iget-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Z

    iput p1, p0, La/e/b/b/j;->H:I

    iput p2, p0, La/e/b/b/j;->I:I

    const/4 p0, 0x0

    throw p0
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 0

    iget-object p1, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->r()Z

    const/4 p0, 0x0

    throw p0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, La/e/b/b/j;->J:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public onViewAdded(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    instance-of v0, p1, La/e/b/b/h;

    if-eqz v0, :cond_6

    check-cast p1, La/e/b/b/h;

    iget-object v0, p0, La/e/b/b/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, La/e/b/b/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    :cond_0
    iget-object v0, p0, La/e/b/b/j;->p0:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, La/e/b/b/h;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, La/e/b/b/j;->m0:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/e/b/b/j;->m0:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, La/e/b/b/j;->m0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p1}, La/e/b/b/h;->u()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, La/e/b/b/j;->n0:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/e/b/b/j;->n0:Ljava/util/ArrayList;

    :cond_3
    iget-object v0, p0, La/e/b/b/j;->n0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    invoke-virtual {p1}, La/e/b/b/h;->t()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, La/e/b/b/j;->o0:Ljava/util/ArrayList;

    if-nez v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/e/b/b/j;->o0:Ljava/util/ArrayList;

    :cond_5
    iget-object p0, p0, La/e/b/b/j;->o0:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    iget-object v0, p0, La/e/b/b/j;->m0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_0
    iget-object p0, p0, La/e/b/b/j;->n0:Ljava/util/ArrayList;

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public requestLayout()V
    .locals 2

    iget-boolean v0, p0, La/e/b/b/j;->w0:Z

    if-nez v0, :cond_1

    iget v0, p0, La/e/b/b/j;->F:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    invoke-super {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setDebugMode(I)V
    .locals 0

    iput p1, p0, La/e/b/b/j;->U:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public setDelayedApplicationOfInitialState(Z)V
    .locals 0

    iput-boolean p1, p0, La/e/b/b/j;->F0:Z

    return-void
.end method

.method public setInteractionEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, La/e/b/b/j;->J:Z

    return-void
.end method

.method public setInterpolatedProgress(F)V
    .locals 1

    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, La/e/b/b/j;->setProgress(F)V

    return-void

    :cond_0
    sget-object p1, La/e/b/b/j$f;->d:La/e/b/b/j$f;

    invoke-virtual {p0, p1}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public setOnHide(F)V
    .locals 3

    iget-object v0, p0, La/e/b/b/j;->n0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/e/b/b/j;->n0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/e/b/b/h;

    invoke-virtual {v2, p1}, La/e/b/b/h;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setOnShow(F)V
    .locals 3

    iget-object v0, p0, La/e/b/b/j;->m0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, La/e/b/b/j;->m0:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/e/b/b/h;

    invoke-virtual {v2, p1}, La/e/b/b/h;->setProgress(F)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public setProgress(F)V
    .locals 5

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    const/high16 v2, 0x3f800000    # 1.0f

    if-ltz v1, :cond_0

    cmpl-float v3, p1, v2

    if-lez v3, :cond_1

    :cond_0
    const-string v3, "MotionLayout"

    const-string v4, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"

    invoke-static {v3, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0}, La/e/b/b/j;->isAttachedToWindow()Z

    move-result v3

    if-nez v3, :cond_3

    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    if-nez v0, :cond_2

    new-instance v0, La/e/b/b/j$d;

    invoke-direct {v0, p0}, La/e/b/b/j$d;-><init>(La/e/b/b/j;)V

    iput-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    :cond_2
    iget-object p0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {p0, p1}, La/e/b/b/j$d;->e(F)V

    return-void

    :cond_3
    if-gtz v1, :cond_5

    iget v1, p0, La/e/b/b/j;->O:F

    cmpl-float v1, v1, v2

    if-nez v1, :cond_4

    iget v1, p0, La/e/b/b/j;->F:I

    iget v2, p0, La/e/b/b/j;->G:I

    if-ne v1, v2, :cond_4

    sget-object v1, La/e/b/b/j$f;->d:La/e/b/b/j$f;

    invoke-virtual {p0, v1}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    :cond_4
    iget v1, p0, La/e/b/b/j;->E:I

    iput v1, p0, La/e/b/b/j;->F:I

    iget v1, p0, La/e/b/b/j;->O:F

    cmpl-float v0, v1, v0

    if-nez v0, :cond_8

    :goto_0
    sget-object v0, La/e/b/b/j$f;->e:La/e/b/b/j$f;

    goto :goto_1

    :cond_5
    cmpl-float v1, p1, v2

    if-ltz v1, :cond_7

    iget v1, p0, La/e/b/b/j;->O:F

    cmpl-float v0, v1, v0

    if-nez v0, :cond_6

    iget v0, p0, La/e/b/b/j;->F:I

    iget v1, p0, La/e/b/b/j;->E:I

    if-ne v0, v1, :cond_6

    sget-object v0, La/e/b/b/j$f;->d:La/e/b/b/j$f;

    invoke-virtual {p0, v0}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    :cond_6
    iget v0, p0, La/e/b/b/j;->G:I

    iput v0, p0, La/e/b/b/j;->F:I

    iget v0, p0, La/e/b/b/j;->O:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_8

    goto :goto_0

    :cond_7
    const/4 v0, -0x1

    iput v0, p0, La/e/b/b/j;->F:I

    sget-object v0, La/e/b/b/j$f;->d:La/e/b/b/j$f;

    :goto_1
    invoke-virtual {p0, v0}, La/e/b/b/j;->setState(La/e/b/b/j$f;)V

    :cond_8
    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v0, :cond_9

    return-void

    :cond_9
    const/4 v0, 0x1

    iput-boolean v0, p0, La/e/b/b/j;->R:Z

    iput p1, p0, La/e/b/b/j;->Q:F

    iput p1, p0, La/e/b/b/j;->N:F

    const-wide/16 v1, -0x1

    iput-wide v1, p0, La/e/b/b/j;->P:J

    iput-wide v1, p0, La/e/b/b/j;->L:J

    const/4 p1, 0x0

    iput-object p1, p0, La/e/b/b/j;->B:Landroid/view/animation/Interpolator;

    iput-boolean v0, p0, La/e/b/b/j;->S:Z

    invoke-virtual {p0}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public setScene(La/e/b/b/l;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->r()Z

    const/4 p0, 0x0

    throw p0
.end method

.method setStartState(I)V
    .locals 1

    invoke-virtual {p0}, La/e/b/b/j;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    if-nez v0, :cond_0

    new-instance v0, La/e/b/b/j$d;

    invoke-direct {v0, p0}, La/e/b/b/j$d;-><init>(La/e/b/b/j;)V

    iput-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    :cond_0
    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {v0, p1}, La/e/b/b/j$d;->f(I)V

    iget-object p0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {p0, p1}, La/e/b/b/j$d;->d(I)V

    return-void

    :cond_1
    iput p1, p0, La/e/b/b/j;->F:I

    return-void
.end method

.method setState(La/e/b/b/j$f;)V
    .locals 4

    sget-object v0, La/e/b/b/j$f;->e:La/e/b/b/j$f;

    if-ne p1, v0, :cond_0

    iget v1, p0, La/e/b/b/j;->F:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, La/e/b/b/j;->G0:La/e/b/b/j$f;

    iput-object p1, p0, La/e/b/b/j;->G0:La/e/b/b/j$f;

    sget-object v2, La/e/b/b/j$f;->d:La/e/b/b/j$f;

    if-ne v1, v2, :cond_1

    if-ne p1, v2, :cond_1

    invoke-direct {p0}, La/e/b/b/j;->G()V

    :cond_1
    sget-object v3, La/e/b/b/j$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    if-ne p1, v0, :cond_5

    :goto_0
    invoke-virtual {p0}, La/e/b/b/j;->H()V

    goto :goto_1

    :cond_3
    if-ne p1, v2, :cond_4

    invoke-direct {p0}, La/e/b/b/j;->G()V

    :cond_4
    if-ne p1, v0, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    return-void
.end method

.method public setTransition(I)V
    .locals 1

    iget-object v0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, La/e/b/b/j;->I(I)La/e/b/b/l$a;

    const/4 p0, 0x0

    throw p0
.end method

.method protected setTransition(La/e/b/b/l$a;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public setTransitionDuration(I)V
    .locals 0

    iget-object p0, p0, La/e/b/b/j;->A:La/e/b/b/l;

    if-nez p0, :cond_0

    const-string p0, "MotionLayout"

    const-string p1, "MotionScene not defined"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public setTransitionListener(La/e/b/b/j$e;)V
    .locals 0

    iput-object p1, p0, La/e/b/b/j;->T:La/e/b/b/j$e;

    return-void
.end method

.method public setTransitionState(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    if-nez v0, :cond_0

    new-instance v0, La/e/b/b/j$d;

    invoke-direct {v0, p0}, La/e/b/b/j$d;-><init>(La/e/b/b/j;)V

    iput-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    :cond_0
    iget-object v0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {v0, p1}, La/e/b/b/j$d;->g(Landroid/os/Bundle;)V

    invoke-virtual {p0}, La/e/b/b/j;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p0, p0, La/e/b/b/j;->A0:La/e/b/b/j$d;

    invoke-virtual {p0}, La/e/b/b/j$d;->a()V

    :cond_1
    return-void
.end method

.method protected t(I)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Landroidx/constraintlayout/widget/c;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget v2, p0, La/e/b/b/j;->E:I

    invoke-static {v0, v2}, La/e/b/b/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "->"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, La/e/b/b/j;->G:I

    invoke-static {v0, v2}, La/e/b/b/a;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " (pos:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, La/e/b/b/j;->O:F

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " Dpos/Dt:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, La/e/b/b/j;->D:F

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
