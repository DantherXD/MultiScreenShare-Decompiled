.class public La/e/a/m/m/l;
.super La/e/a/m/m/p;
.source ""


# static fields
.field private static k:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, La/e/a/m/m/l;->k:[I

    return-void
.end method

.method public constructor <init>(La/e/a/m/e;)V
    .locals 1

    invoke-direct {p0, p1}, La/e/a/m/m/p;-><init>(La/e/a/m/e;)V

    iget-object p1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    sget-object v0, La/e/a/m/m/f$a;->e:La/e/a/m/m/f$a;

    iput-object v0, p1, La/e/a/m/m/f;->e:La/e/a/m/m/f$a;

    iget-object p1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    sget-object v0, La/e/a/m/m/f$a;->f:La/e/a/m/m/f$a;

    iput-object v0, p1, La/e/a/m/m/f;->e:La/e/a/m/m/f$a;

    const/4 p1, 0x0

    iput p1, p0, La/e/a/m/m/p;->f:I

    return-void
.end method

.method private q([IIIIIFI)V
    .locals 1

    sub-int/2addr p3, p2

    sub-int/2addr p5, p4

    const/4 p0, -0x1

    const/4 p2, 0x0

    const/high16 p4, 0x3f000000    # 0.5f

    const/4 v0, 0x1

    if-eq p7, p0, :cond_2

    if-eqz p7, :cond_1

    if-eq p7, v0, :cond_0

    goto :goto_0

    :cond_0
    int-to-float p0, p3

    mul-float/2addr p0, p6

    add-float/2addr p0, p4

    float-to-int p0, p0

    aput p3, p1, p2

    aput p0, p1, v0

    goto :goto_0

    :cond_1
    int-to-float p0, p5

    mul-float/2addr p0, p6

    add-float/2addr p0, p4

    float-to-int p0, p0

    aput p0, p1, p2

    aput p5, p1, v0

    goto :goto_0

    :cond_2
    int-to-float p0, p5

    mul-float/2addr p0, p6

    add-float/2addr p0, p4

    float-to-int p0, p0

    int-to-float p7, p3

    div-float/2addr p7, p6

    add-float/2addr p7, p4

    float-to-int p4, p7

    if-gt p0, p3, :cond_3

    if-gt p5, p5, :cond_3

    aput p0, p1, p2

    aput p5, p1, v0

    goto :goto_0

    :cond_3
    if-gt p3, p3, :cond_4

    if-gt p4, p5, :cond_4

    aput p3, p1, p2

    aput p4, p1, v0

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public a(La/e/a/m/m/d;)V
    .locals 16

    move-object/from16 v8, p0

    sget-object v0, La/e/a/m/m/l$a;->a:[I

    iget-object v1, v8, La/e/a/m/m/p;->j:La/e/a/m/m/p$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v0, v9, :cond_2

    if-eq v0, v1, :cond_1

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v0, La/e/a/m/e;->P:La/e/a/m/d;

    iget-object v0, v0, La/e/a/m/e;->R:La/e/a/m/d;

    move-object/from16 v3, p1

    invoke-virtual {v8, v3, v1, v0, v10}, La/e/a/m/m/p;->n(La/e/a/m/m/d;La/e/a/m/d;La/e/a/m/d;I)V

    return-void

    :cond_1
    move-object/from16 v3, p1

    invoke-virtual/range {p0 .. p1}, La/e/a/m/m/p;->o(La/e/a/m/m/d;)V

    goto :goto_0

    :cond_2
    move-object/from16 v3, p1

    invoke-virtual/range {p0 .. p1}, La/e/a/m/m/p;->p(La/e/a/m/m/d;)V

    :goto_0
    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, v0, La/e/a/m/m/f;->j:Z

    const/high16 v11, 0x3f000000    # 0.5f

    if-nez v0, :cond_21

    iget-object v0, v8, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v3, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v0, v3, :cond_21

    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v3, v0, La/e/a/m/e;->x:I

    if-eq v3, v1, :cond_20

    if-eq v3, v2, :cond_3

    goto/16 :goto_11

    :cond_3
    iget v1, v0, La/e/a/m/e;->y:I

    const/4 v3, -0x1

    if-eqz v1, :cond_7

    if-ne v1, v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, La/e/a/m/e;->u()I

    move-result v0

    if-eq v0, v3, :cond_6

    if-eqz v0, :cond_5

    if-eq v0, v9, :cond_6

    move v0, v10

    goto :goto_2

    :cond_5
    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v1, v1, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v1, v1, La/e/a/m/m/f;->g:I

    int-to-float v1, v1

    invoke-virtual {v0}, La/e/a/m/e;->t()F

    move-result v0

    div-float/2addr v1, v0

    goto :goto_1

    :cond_6
    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v1, v1, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v1, v1, La/e/a/m/m/f;->g:I

    int-to-float v1, v1

    invoke-virtual {v0}, La/e/a/m/e;->t()F

    move-result v0

    mul-float/2addr v1, v0

    :goto_1
    add-float/2addr v1, v11

    float-to-int v0, v1

    :goto_2
    iget-object v1, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v1, v0}, La/e/a/m/m/g;->d(I)V

    goto/16 :goto_11

    :cond_7
    :goto_3
    iget-object v1, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v12, v1, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v13, v1, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, v0, La/e/a/m/e;->P:La/e/a/m/d;

    iget-object v1, v1, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v1, :cond_8

    move v1, v9

    goto :goto_4

    :cond_8
    move v1, v10

    :goto_4
    iget-object v2, v0, La/e/a/m/e;->Q:La/e/a/m/d;

    iget-object v2, v2, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v2, :cond_9

    move v2, v9

    goto :goto_5

    :cond_9
    move v2, v10

    :goto_5
    iget-object v4, v0, La/e/a/m/e;->R:La/e/a/m/d;

    iget-object v4, v4, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v4, :cond_a

    move v4, v9

    goto :goto_6

    :cond_a
    move v4, v10

    :goto_6
    iget-object v5, v0, La/e/a/m/e;->S:La/e/a/m/d;

    iget-object v5, v5, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v5, :cond_b

    move v5, v9

    goto :goto_7

    :cond_b
    move v5, v10

    :goto_7
    invoke-virtual {v0}, La/e/a/m/e;->u()I

    move-result v14

    if-eqz v1, :cond_14

    if-eqz v2, :cond_14

    if-eqz v4, :cond_14

    if-eqz v5, :cond_14

    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->t()F

    move-result v15

    iget-boolean v0, v12, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_e

    iget-boolean v0, v13, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_e

    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-boolean v1, v0, La/e/a/m/m/f;->c:Z

    if-eqz v1, :cond_d

    iget-object v1, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-boolean v1, v1, La/e/a/m/m/f;->c:Z

    if-nez v1, :cond_c

    goto :goto_8

    :cond_c
    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget-object v1, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v1, v1, La/e/a/m/m/f;->f:I

    add-int v2, v0, v1

    iget-object v0, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget-object v1, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget v1, v1, La/e/a/m/m/f;->f:I

    sub-int v3, v0, v1

    iget v0, v12, La/e/a/m/m/f;->g:I

    iget v1, v12, La/e/a/m/m/f;->f:I

    add-int v4, v0, v1

    iget v0, v13, La/e/a/m/m/f;->g:I

    iget v1, v13, La/e/a/m/m/f;->f:I

    sub-int v5, v0, v1

    sget-object v1, La/e/a/m/m/l;->k:[I

    move-object/from16 v0, p0

    move v6, v15

    move v7, v14

    invoke-direct/range {v0 .. v7}, La/e/a/m/m/l;->q([IIIIIFI)V

    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    sget-object v1, La/e/a/m/m/l;->k:[I

    aget v1, v1, v10

    invoke-virtual {v0, v1}, La/e/a/m/m/g;->d(I)V

    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    sget-object v1, La/e/a/m/m/l;->k:[I

    aget v1, v1, v9

    invoke-virtual {v0, v1}, La/e/a/m/m/g;->d(I)V

    :cond_d
    :goto_8
    return-void

    :cond_e
    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-boolean v1, v0, La/e/a/m/m/f;->j:Z

    if-eqz v1, :cond_11

    iget-object v1, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-boolean v2, v1, La/e/a/m/m/f;->j:Z

    if-eqz v2, :cond_11

    iget-boolean v2, v12, La/e/a/m/m/f;->c:Z

    if-eqz v2, :cond_10

    iget-boolean v2, v13, La/e/a/m/m/f;->c:Z

    if-nez v2, :cond_f

    goto :goto_9

    :cond_f
    iget v2, v0, La/e/a/m/m/f;->g:I

    iget v0, v0, La/e/a/m/m/f;->f:I

    add-int/2addr v2, v0

    iget v0, v1, La/e/a/m/m/f;->g:I

    iget v1, v1, La/e/a/m/m/f;->f:I

    sub-int v3, v0, v1

    iget-object v0, v12, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget v1, v12, La/e/a/m/m/f;->f:I

    add-int v4, v0, v1

    iget-object v0, v13, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget v1, v13, La/e/a/m/m/f;->f:I

    sub-int v5, v0, v1

    sget-object v1, La/e/a/m/m/l;->k:[I

    move-object/from16 v0, p0

    move v6, v15

    move v7, v14

    invoke-direct/range {v0 .. v7}, La/e/a/m/m/l;->q([IIIIIFI)V

    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    sget-object v1, La/e/a/m/m/l;->k:[I

    aget v1, v1, v10

    invoke-virtual {v0, v1}, La/e/a/m/m/g;->d(I)V

    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    sget-object v1, La/e/a/m/m/l;->k:[I

    aget v1, v1, v9

    invoke-virtual {v0, v1}, La/e/a/m/m/g;->d(I)V

    goto :goto_a

    :cond_10
    :goto_9
    return-void

    :cond_11
    :goto_a
    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-boolean v1, v0, La/e/a/m/m/f;->c:Z

    if-eqz v1, :cond_13

    iget-object v1, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-boolean v1, v1, La/e/a/m/m/f;->c:Z

    if-eqz v1, :cond_13

    iget-boolean v1, v12, La/e/a/m/m/f;->c:Z

    if-eqz v1, :cond_13

    iget-boolean v1, v13, La/e/a/m/m/f;->c:Z

    if-nez v1, :cond_12

    goto :goto_b

    :cond_12
    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget-object v1, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v1, v1, La/e/a/m/m/f;->f:I

    add-int v2, v0, v1

    iget-object v0, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget-object v1, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget v1, v1, La/e/a/m/m/f;->f:I

    sub-int v3, v0, v1

    iget-object v0, v12, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget v1, v12, La/e/a/m/m/f;->f:I

    add-int v4, v0, v1

    iget-object v0, v13, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget v1, v13, La/e/a/m/m/f;->f:I

    sub-int v5, v0, v1

    sget-object v1, La/e/a/m/m/l;->k:[I

    move-object/from16 v0, p0

    move v6, v15

    move v7, v14

    invoke-direct/range {v0 .. v7}, La/e/a/m/m/l;->q([IIIIIFI)V

    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    sget-object v1, La/e/a/m/m/l;->k:[I

    aget v1, v1, v10

    invoke-virtual {v0, v1}, La/e/a/m/m/g;->d(I)V

    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    sget-object v1, La/e/a/m/m/l;->k:[I

    aget v1, v1, v9

    goto/16 :goto_f

    :cond_13
    :goto_b
    return-void

    :cond_14
    if-eqz v1, :cond_1a

    if-eqz v4, :cond_1a

    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-boolean v0, v0, La/e/a/m/m/f;->c:Z

    if-eqz v0, :cond_19

    iget-object v0, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-boolean v0, v0, La/e/a/m/m/f;->c:Z

    if-nez v0, :cond_15

    goto :goto_d

    :cond_15
    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->t()F

    move-result v0

    iget-object v1, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, v1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/m/f;

    iget v1, v1, La/e/a/m/m/f;->g:I

    iget-object v2, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v2, v2, La/e/a/m/m/f;->f:I

    add-int/2addr v1, v2

    iget-object v2, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, v2, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/e/a/m/m/f;

    iget v2, v2, La/e/a/m/m/f;->g:I

    iget-object v4, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget v4, v4, La/e/a/m/m/f;->f:I

    sub-int/2addr v2, v4

    if-eq v14, v3, :cond_17

    if-eqz v14, :cond_17

    if-eq v14, v9, :cond_16

    goto/16 :goto_11

    :cond_16
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v10}, La/e/a/m/m/p;->g(II)I

    move-result v1

    int-to-float v2, v1

    div-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v9}, La/e/a/m/m/p;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_18

    int-to-float v1, v3

    mul-float/2addr v1, v0

    goto :goto_c

    :cond_17
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v10}, La/e/a/m/m/p;->g(II)I

    move-result v1

    int-to-float v2, v1

    mul-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v9}, La/e/a/m/m/p;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_18

    int-to-float v1, v3

    div-float/2addr v1, v0

    :goto_c
    add-float/2addr v1, v11

    float-to-int v1, v1

    :cond_18
    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v0, v1}, La/e/a/m/m/g;->d(I)V

    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v0, v3}, La/e/a/m/m/g;->d(I)V

    goto/16 :goto_11

    :cond_19
    :goto_d
    return-void

    :cond_1a
    if-eqz v2, :cond_21

    if-eqz v5, :cond_21

    iget-boolean v0, v12, La/e/a/m/m/f;->c:Z

    if-eqz v0, :cond_1f

    iget-boolean v0, v13, La/e/a/m/m/f;->c:Z

    if-nez v0, :cond_1b

    goto :goto_10

    :cond_1b
    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->t()F

    move-result v0

    iget-object v1, v12, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/m/f;

    iget v1, v1, La/e/a/m/m/f;->g:I

    iget v2, v12, La/e/a/m/m/f;->f:I

    add-int/2addr v1, v2

    iget-object v2, v13, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/e/a/m/m/f;

    iget v2, v2, La/e/a/m/m/f;->g:I

    iget v4, v13, La/e/a/m/m/f;->f:I

    sub-int/2addr v2, v4

    if-eq v14, v3, :cond_1d

    if-eqz v14, :cond_1c

    if-eq v14, v9, :cond_1d

    goto :goto_11

    :cond_1c
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v9}, La/e/a/m/m/p;->g(II)I

    move-result v1

    int-to-float v2, v1

    mul-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v10}, La/e/a/m/m/p;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_1e

    int-to-float v1, v3

    div-float/2addr v1, v0

    goto :goto_e

    :cond_1d
    sub-int/2addr v2, v1

    invoke-virtual {v8, v2, v9}, La/e/a/m/m/p;->g(II)I

    move-result v1

    int-to-float v2, v1

    div-float/2addr v2, v0

    add-float/2addr v2, v11

    float-to-int v2, v2

    invoke-virtual {v8, v2, v10}, La/e/a/m/m/p;->g(II)I

    move-result v3

    if-eq v2, v3, :cond_1e

    int-to-float v1, v3

    mul-float/2addr v1, v0

    :goto_e
    add-float/2addr v1, v11

    float-to-int v1, v1

    :cond_1e
    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v0, v3}, La/e/a/m/m/g;->d(I)V

    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    :goto_f
    invoke-virtual {v0, v1}, La/e/a/m/m/g;->d(I)V

    goto :goto_11

    :cond_1f
    :goto_10
    return-void

    :cond_20
    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_21

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v1, v0, La/e/a/m/m/f;->j:Z

    if-eqz v1, :cond_21

    iget-object v1, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v1, v1, La/e/a/m/e;->C:F

    iget v0, v0, La/e/a/m/m/f;->g:I

    int-to-float v0, v0

    mul-float/2addr v0, v1

    add-float/2addr v0, v11

    float-to-int v0, v0

    goto/16 :goto_2

    :cond_21
    :goto_11
    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-boolean v1, v0, La/e/a/m/m/f;->c:Z

    if-eqz v1, :cond_29

    iget-object v1, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-boolean v2, v1, La/e/a/m/m/f;->c:Z

    if-nez v2, :cond_22

    goto/16 :goto_12

    :cond_22
    iget-boolean v0, v0, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_23

    iget-boolean v0, v1, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_23

    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, v0, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_23

    return-void

    :cond_23
    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, v0, La/e/a/m/m/f;->j:Z

    if-nez v0, :cond_24

    iget-object v0, v8, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v0, v1, :cond_24

    iget-object v0, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v1, v0, La/e/a/m/e;->x:I

    if-nez v1, :cond_24

    invoke-virtual {v0}, La/e/a/m/e;->g0()Z

    move-result v0

    if-nez v0, :cond_24

    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget-object v1, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, v1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget-object v2, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v3, v2, La/e/a/m/m/f;->f:I

    add-int/2addr v0, v3

    iget v1, v1, La/e/a/m/m/f;->g:I

    iget-object v3, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget v3, v3, La/e/a/m/m/f;->f:I

    add-int/2addr v1, v3

    sub-int v3, v1, v0

    invoke-virtual {v2, v0}, La/e/a/m/m/f;->d(I)V

    iget-object v0, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-virtual {v0, v1}, La/e/a/m/m/f;->d(I)V

    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v0, v3}, La/e/a/m/m/g;->d(I)V

    return-void

    :cond_24
    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, v0, La/e/a/m/m/f;->j:Z

    if-nez v0, :cond_26

    iget-object v0, v8, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v0, v1, :cond_26

    iget v0, v8, La/e/a/m/m/p;->a:I

    if-ne v0, v9, :cond_26

    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_26

    iget-object v0, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_26

    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget-object v1, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, v1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/m/f;

    iget v0, v0, La/e/a/m/m/f;->g:I

    iget-object v2, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v2, v2, La/e/a/m/m/f;->f:I

    add-int/2addr v0, v2

    iget v1, v1, La/e/a/m/m/f;->g:I

    iget-object v2, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget v2, v2, La/e/a/m/m/f;->f:I

    add-int/2addr v1, v2

    sub-int/2addr v1, v0

    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v0, v0, La/e/a/m/m/g;->m:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v1, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v2, v1, La/e/a/m/e;->B:I

    iget v1, v1, La/e/a/m/e;->A:I

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-lez v2, :cond_25

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_25
    iget-object v1, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v1, v0}, La/e/a/m/m/g;->d(I)V

    :cond_26
    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, v0, La/e/a/m/m/f;->j:Z

    if-nez v0, :cond_27

    return-void

    :cond_27
    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/m/f;

    iget-object v1, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, v1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/m/f;

    iget v2, v0, La/e/a/m/m/f;->g:I

    iget-object v3, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v3, v3, La/e/a/m/m/f;->f:I

    add-int/2addr v2, v3

    iget v3, v1, La/e/a/m/m/f;->g:I

    iget-object v4, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget v4, v4, La/e/a/m/m/f;->f:I

    add-int/2addr v3, v4

    iget-object v4, v8, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v4}, La/e/a/m/e;->w()F

    move-result v4

    if-ne v0, v1, :cond_28

    iget v2, v0, La/e/a/m/m/f;->g:I

    iget v3, v1, La/e/a/m/m/f;->g:I

    move v4, v11

    :cond_28
    sub-int/2addr v3, v2

    iget-object v0, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v0, v0, La/e/a/m/m/f;->g:I

    sub-int/2addr v3, v0

    iget-object v0, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    int-to-float v1, v2

    add-float/2addr v1, v11

    int-to-float v2, v3

    mul-float/2addr v2, v4

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0, v1}, La/e/a/m/m/f;->d(I)V

    iget-object v0, v8, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, v8, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget v1, v1, La/e/a/m/m/f;->g:I

    iget-object v2, v8, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v2, v2, La/e/a/m/m/f;->g:I

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, La/e/a/m/m/f;->d(I)V

    :cond_29
    :goto_12
    return-void
.end method

.method d()V
    .locals 6

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-boolean v1, v0, La/e/a/m/e;->b:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v0}, La/e/a/m/e;->U()I

    move-result v0

    invoke-virtual {v1, v0}, La/e/a/m/m/g;->d(I)V

    :cond_0
    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v0, v0, La/e/a/m/m/f;->j:Z

    if-nez v0, :cond_3

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->y()La/e/a/m/e$b;

    move-result-object v0

    iput-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-eq v0, v1, :cond_5

    sget-object v1, La/e/a/m/e$b;->e:La/e/a/m/e$b;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, La/e/a/m/e;->y()La/e/a/m/e$b;

    move-result-object v2

    sget-object v3, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    if-eq v2, v3, :cond_1

    invoke-virtual {v0}, La/e/a/m/e;->y()La/e/a/m/e$b;

    move-result-object v2

    if-ne v2, v1, :cond_2

    :cond_1
    invoke-virtual {v0}, La/e/a/m/e;->U()I

    move-result v1

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->P:La/e/a/m/d;

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->R:La/e/a/m/d;

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    sub-int/2addr v1, v2

    iget-object v2, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v3, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v3, v3, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v4, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v4, v4, La/e/a/m/e;->P:La/e/a/m/d;

    invoke-virtual {v4}, La/e/a/m/d;->e()I

    move-result v4

    invoke-virtual {p0, v2, v3, v4}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v2, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v3, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v3, v3, La/e/a/m/e;->R:La/e/a/m/d;

    invoke-virtual {v3}, La/e/a/m/d;->e()I

    move-result v3

    neg-int v3, v3

    invoke-virtual {p0, v2, v0, v3}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {p0, v1}, La/e/a/m/m/g;->d(I)V

    return-void

    :cond_2
    iget-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v1}, La/e/a/m/e;->U()I

    move-result v1

    invoke-virtual {v0, v1}, La/e/a/m/m/g;->d(I)V

    goto :goto_0

    :cond_3
    iget-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->e:La/e/a/m/e$b;

    if-ne v0, v1, :cond_5

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, La/e/a/m/e;->y()La/e/a/m/e$b;

    move-result-object v2

    sget-object v3, La/e/a/m/e$b;->b:La/e/a/m/e$b;

    if-eq v2, v3, :cond_4

    invoke-virtual {v0}, La/e/a/m/e;->y()La/e/a/m/e$b;

    move-result-object v2

    if-ne v2, v1, :cond_5

    :cond_4
    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v2, v2, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v3, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v3, v3, La/e/a/m/e;->P:La/e/a/m/d;

    invoke-virtual {v3}, La/e/a/m/d;->e()I

    move-result v3

    invoke-virtual {p0, v1, v2, v3}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->R:La/e/a/m/d;

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    return-void

    :cond_5
    :goto_0
    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-boolean v1, v0, La/e/a/m/m/f;->j:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_c

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-boolean v4, v1, La/e/a/m/e;->b:Z

    if-eqz v4, :cond_c

    iget-object v0, v1, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v4, v0, v2

    iget-object v4, v4, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v4, :cond_9

    aget-object v4, v0, v3

    iget-object v4, v4, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v4, :cond_9

    invoke-virtual {v1}, La/e/a/m/e;->g0()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v1, v1, v2

    invoke-virtual {v1}, La/e/a/m/d;->e()I

    move-result v1

    iput v1, v0, La/e/a/m/m/f;->f:I

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object p0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object p0, p0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object p0, p0, v3

    goto/16 :goto_7

    :cond_6
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v4, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v4, v4, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v4, v2

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    :cond_7
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v2, v3

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    :cond_8
    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iput-boolean v3, v0, La/e/a/m/m/f;->b:Z

    iget-object p0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iput-boolean v3, p0, La/e/a/m/m/f;->b:Z

    goto/16 :goto_9

    :cond_9
    aget-object v4, v0, v2

    iget-object v4, v4, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v4, :cond_a

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v3, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v3, v3, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v3, v2

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    goto :goto_1

    :cond_a
    aget-object v2, v0, v3

    iget-object v2, v2, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v2, :cond_b

    aget-object v0, v0, v3

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v2, v3

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v2, v2, La/e/a/m/m/f;->g:I

    neg-int v2, v2

    goto :goto_2

    :cond_b
    instance-of v0, v1, La/e/a/m/h;

    if-nez v0, :cond_1a

    invoke-virtual {v1}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    sget-object v1, La/e/a/m/d$b;->h:La/e/a/m/d$b;

    invoke-virtual {v0, v1}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v0

    iget-object v0, v0, La/e/a/m/d;->f:La/e/a/m/d;

    if-nez v0, :cond_1a

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v2}, La/e/a/m/e;->V()I

    move-result v2

    :goto_1
    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget v2, v2, La/e/a/m/m/f;->g:I

    :goto_2
    invoke-virtual {p0, v0, v1, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    goto/16 :goto_9

    :cond_c
    iget-object v1, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v4, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    if-ne v1, v4, :cond_13

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v4, v1, La/e/a/m/e;->x:I

    const/4 v5, 0x2

    if-eq v4, v5, :cond_11

    const/4 v5, 0x3

    if-eq v4, v5, :cond_d

    goto/16 :goto_6

    :cond_d
    iget v4, v1, La/e/a/m/e;->y:I

    if-ne v4, v5, :cond_10

    iget-object v4, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iput-object p0, v4, La/e/a/m/m/f;->a:La/e/a/m/m/d;

    iget-object v4, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iput-object p0, v4, La/e/a/m/m/f;->a:La/e/a/m/m/d;

    iget-object v4, v1, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v5, v4, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iput-object p0, v5, La/e/a/m/m/f;->a:La/e/a/m/m/d;

    iget-object v4, v4, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iput-object p0, v4, La/e/a/m/m/f;->a:La/e/a/m/m/d;

    iput-object p0, v0, La/e/a/m/m/f;->a:La/e/a/m/m/d;

    invoke-virtual {v1}, La/e/a/m/e;->i0()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v1, v1, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v1, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iput-object p0, v1, La/e/a/m/m/f;->a:La/e/a/m/m/d;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v1, v1, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v1, v1, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    goto :goto_4

    :cond_e
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->g0()Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v1, v1, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    goto/16 :goto_5

    :cond_f
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    goto :goto_3

    :cond_10
    iget-object v1, v1, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v1, v1, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v1, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iput-boolean v3, v0, La/e/a/m/m/f;->b:Z

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    :goto_3
    iget-object v0, v0, La/e/a/m/m/f;->l:Ljava/util/List;

    :goto_4
    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    goto :goto_5

    :cond_11
    invoke-virtual {v1}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-nez v0, :cond_12

    goto :goto_6

    :cond_12
    iget-object v0, v0, La/e/a/m/e;->g:La/e/a/m/m/n;

    iget-object v0, v0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v1, v1, La/e/a/m/m/f;->l:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iput-boolean v3, v0, La/e/a/m/m/f;->b:Z

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iget-object v0, v0, La/e/a/m/m/f;->k:Ljava/util/List;

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    :goto_5
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_13
    :goto_6
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v4, v1, v2

    iget-object v4, v4, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v4, :cond_17

    aget-object v4, v1, v3

    iget-object v4, v4, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v4, :cond_17

    invoke-virtual {v0}, La/e/a/m/e;->g0()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v1, v1, v2

    invoke-virtual {v1}, La/e/a/m/d;->e()I

    move-result v1

    iput v1, v0, La/e/a/m/m/f;->f:I

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object p0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object p0, p0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object p0, p0, v3

    :goto_7
    invoke-virtual {p0}, La/e/a/m/d;->e()I

    move-result p0

    neg-int p0, p0

    iput p0, v0, La/e/a/m/m/f;->f:I

    goto/16 :goto_9

    :cond_14
    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v0, v0, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v0, v0, v2

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    iget-object v1, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v1, v1, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v1, v1, v3

    invoke-virtual {p0, v1}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v1

    if-eqz v0, :cond_15

    invoke-virtual {v0, p0}, La/e/a/m/m/f;->b(La/e/a/m/m/d;)V

    :cond_15
    if-eqz v1, :cond_16

    invoke-virtual {v1, p0}, La/e/a/m/m/f;->b(La/e/a/m/m/d;)V

    :cond_16
    sget-object v0, La/e/a/m/m/p$b;->e:La/e/a/m/m/p$b;

    iput-object v0, p0, La/e/a/m/m/p;->j:La/e/a/m/m/p$b;

    goto :goto_9

    :cond_17
    aget-object v4, v1, v2

    iget-object v4, v4, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v4, :cond_18

    aget-object v0, v1, v2

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v4, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v4, v4, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v4, v2

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    goto :goto_8

    :cond_18
    aget-object v2, v1, v3

    iget-object v2, v2, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v2, :cond_19

    aget-object v0, v1, v3

    invoke-virtual {p0, v0}, La/e/a/m/m/p;->h(La/e/a/m/d;)La/e/a/m/m/f;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget-object v2, v2, La/e/a/m/e;->X:[La/e/a/m/d;

    aget-object v2, v2, v3

    invoke-virtual {v2}, La/e/a/m/d;->e()I

    move-result v2

    neg-int v2, v2

    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    const/4 v2, -0x1

    iget-object v3, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {p0, v0, v1, v2, v3}, La/e/a/m/m/p;->c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V

    goto :goto_9

    :cond_19
    instance-of v1, v0, La/e/a/m/h;

    if-nez v1, :cond_1a

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    if-eqz v0, :cond_1a

    iget-object v0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v0

    iget-object v0, v0, La/e/a/m/e;->f:La/e/a/m/m/l;

    iget-object v0, v0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {v2}, La/e/a/m/e;->V()I

    move-result v2

    :goto_8
    invoke-virtual {p0, v1, v0, v2}, La/e/a/m/m/p;->b(La/e/a/m/m/f;La/e/a/m/m/f;I)V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-object v2, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {p0, v0, v1, v3, v2}, La/e/a/m/m/p;->c(La/e/a/m/m/f;La/e/a/m/m/f;ILa/e/a/m/m/g;)V

    :cond_1a
    :goto_9
    return-void
.end method

.method public e()V
    .locals 2

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iget-boolean v1, v0, La/e/a/m/m/f;->j:Z

    if-eqz v1, :cond_0

    iget-object p0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget v0, v0, La/e/a/m/m/f;->g:I

    invoke-virtual {p0, v0}, La/e/a/m/e;->j1(I)V

    :cond_0
    return-void
.end method

.method f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, La/e/a/m/m/p;->c:La/e/a/m/m/m;

    iget-object v0, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-virtual {v0}, La/e/a/m/m/f;->c()V

    iget-object v0, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-virtual {v0}, La/e/a/m/m/f;->c()V

    iget-object v0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    invoke-virtual {v0}, La/e/a/m/m/f;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/e/a/m/m/p;->g:Z

    return-void
.end method

.method m()Z
    .locals 3

    iget-object v0, p0, La/e/a/m/m/p;->d:La/e/a/m/e$b;

    sget-object v1, La/e/a/m/e$b;->d:La/e/a/m/e$b;

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object p0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    iget p0, p0, La/e/a/m/e;->x:I

    if-nez p0, :cond_0

    return v2

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    return v2
.end method

.method r()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, La/e/a/m/m/p;->g:Z

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    invoke-virtual {v1}, La/e/a/m/m/f;->c()V

    iget-object v1, p0, La/e/a/m/m/p;->h:La/e/a/m/m/f;

    iput-boolean v0, v1, La/e/a/m/m/f;->j:Z

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    invoke-virtual {v1}, La/e/a/m/m/f;->c()V

    iget-object v1, p0, La/e/a/m/m/p;->i:La/e/a/m/m/f;

    iput-boolean v0, v1, La/e/a/m/m/f;->j:Z

    iget-object p0, p0, La/e/a/m/m/p;->e:La/e/a/m/m/g;

    iput-boolean v0, p0, La/e/a/m/m/f;->j:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HorizontalRun "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, La/e/a/m/m/p;->b:La/e/a/m/e;

    invoke-virtual {p0}, La/e/a/m/e;->r()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
