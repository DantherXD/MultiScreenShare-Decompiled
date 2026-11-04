.class public Lc/a/a/i/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/i/q/f;


# instance fields
.field private final a:[Lc/a/a/i/q/d;

.field private final b:[Lc/a/a/i/q/d;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc/a/a/i/q/d;",
            ">;"
        }
    .end annotation
.end field

.field protected final d:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final e:Lc/a/a/i/h;

.field private f:Ljava/util/concurrent/ConcurrentMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private transient g:[J

.field private transient h:[I


# direct methods
.method public constructor <init>(Lc/a/a/i/m;Ljava/lang/Class;Ljava/lang/reflect/Type;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/i/m;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Class;->getModifiers()I

    move-result v1

    iget-object v7, p1, Lc/a/a/i/m;->f:Lc/a/a/g;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    move-object v0, p2

    move-object v2, p3

    invoke-static/range {v0 .. v7}, Lc/a/a/i/h;->b(Ljava/lang/Class;ILjava/lang/reflect/Type;ZZZZLc/a/a/g;)Lc/a/a/i/h;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Lc/a/a/i/g;-><init>(Lc/a/a/i/m;Ljava/lang/Class;Ljava/lang/reflect/Type;Lc/a/a/i/h;)V

    return-void
.end method

.method public constructor <init>(Lc/a/a/i/m;Ljava/lang/Class;Ljava/lang/reflect/Type;Lc/a/a/i/h;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/i/m;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "Lc/a/a/i/h;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lc/a/a/i/g;->d:Ljava/lang/Class;

    iput-object p4, p0, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object p3, p4, Lc/a/a/i/h;->f:[Lc/a/a/k/a;

    array-length v0, p3

    new-array v0, v0, [Lc/a/a/i/q/d;

    iput-object v0, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length p3, p3

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v0

    :goto_0
    if-ge v2, p3, :cond_2

    iget-object v3, p4, Lc/a/a/i/h;->f:[Lc/a/a/k/a;

    aget-object v3, v3, v2

    invoke-virtual {p1, p1, p2, v3}, Lc/a/a/i/m;->b(Lc/a/a/i/m;Ljava/lang/Class;Lc/a/a/k/a;)Lc/a/a/i/q/d;

    move-result-object v4

    iget-object v5, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    aput-object v4, v5, v2

    iget-object v3, v3, Lc/a/a/k/a;->q:[Ljava/lang/String;

    array-length v5, v3

    move v6, v0

    :goto_1
    if-ge v6, v5, :cond_1

    aget-object v7, v3, v6

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    :cond_0
    invoke-interface {v1, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    iput-object v1, p0, Lc/a/a/i/g;->c:Ljava/util/Map;

    iget-object p1, p4, Lc/a/a/i/h;->e:[Lc/a/a/k/a;

    array-length p2, p1

    new-array p2, p2, [Lc/a/a/i/q/d;

    iput-object p2, p0, Lc/a/a/i/g;->a:[Lc/a/a/i/q/d;

    array-length p1, p1

    :goto_2
    if-ge v0, p1, :cond_3

    iget-object p2, p4, Lc/a/a/i/h;->e:[Lc/a/a/k/a;

    aget-object p2, p2, v0

    iget-object p2, p2, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lc/a/a/i/g;->f(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object p2

    iget-object p3, p0, Lc/a/a/i/g;->a:[Lc/a/a/i/q/d;

    aput-object p2, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method private d(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v0, p2

    move-object/from16 v9, p3

    const-class v10, Ljava/lang/Double;

    const-class v11, Ljava/lang/Float;

    const-class v12, Ljava/lang/Long;

    const-class v13, Ljava/lang/Integer;

    const-class v1, Lc/a/a/a;

    if-eq v0, v1, :cond_80

    const-class v1, Lc/a/a/e;

    if-ne v0, v1, :cond_0

    goto/16 :goto_4b

    :cond_0
    iget-object v14, v8, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v1, v14, Lc/a/a/i/e;->h:I

    const/16 v2, 0x8

    const/16 v15, 0x10

    const/4 v6, 0x0

    if-ne v1, v2, :cond_1

    invoke-virtual {v14, v15}, Lc/a/a/i/e;->t(I)V

    return-object v6

    :cond_1
    iget-boolean v5, v14, Lc/a/a/i/e;->A:Z

    iget-object v2, v8, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    if-eqz p4, :cond_2

    if-eqz v2, :cond_2

    iget-object v2, v2, Lc/a/a/i/l;->b:Lc/a/a/i/l;

    :cond_2
    move-object v4, v2

    const/16 v3, 0xd

    if-ne v1, v3, :cond_4

    :try_start_0
    invoke-virtual {v14, v15}, Lc/a/a/i/e;->t(I)V

    if-nez p4, :cond_3

    invoke-virtual/range {p0 .. p2}, Lc/a/a/i/g;->a(Lc/a/a/i/b;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_3
    move-object/from16 v0, p4

    :goto_0
    invoke-virtual {v8, v4}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    return-object v0

    :catchall_0
    move-exception v0

    move-object/from16 v10, p4

    :goto_1
    move-object v11, v4

    goto/16 :goto_4a

    :cond_4
    const/16 v2, 0xe

    if-ne v1, v2, :cond_7

    :try_start_1
    iget-object v2, v7, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-boolean v2, v2, Lc/a/a/i/h;->i:Z

    if-nez v2, :cond_6

    iget v2, v14, Lc/a/a/i/e;->j:I

    sget-object v3, Lc/a/a/i/d;->o:Lc/a/a/i/d;

    iget v3, v3, Lc/a/a/i/d;->u:I

    and-int/2addr v2, v3

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    goto :goto_3

    :cond_6
    :goto_2
    const/4 v2, 0x1

    :goto_3
    if-eqz v2, :cond_7

    invoke-direct/range {p0 .. p4}, Lc/a/a/i/g;->e(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v8, v4}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    return-object v0

    :cond_7
    const/16 v2, 0xc

    const/4 v3, 0x4

    if-eq v1, v2, :cond_b

    if-eq v1, v15, :cond_b

    :try_start_2
    invoke-virtual {v14}, Lc/a/a/i/e;->l()Z

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v0, :cond_8

    invoke-virtual {v8, v4}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    return-object v6

    :cond_8
    if-ne v1, v3, :cond_9

    :try_start_3
    invoke-virtual {v14}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_9

    invoke-virtual {v14}, Lc/a/a/i/e;->s()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v8, v4}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    return-object v6

    :cond_9
    :try_start_4
    new-instance v0, Ljava/lang/StringBuffer;

    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    const-string v1, "syntax error, expect {, actual "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v14}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    instance-of v1, v9, Ljava/lang/String;

    if-eqz v1, :cond_a

    const-string v1, ", fieldName "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;

    :cond_a
    new-instance v1, Lc/a/a/d;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_b
    :try_start_5
    iget v1, v8, Lc/a/a/i/b;->k:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_14

    const/4 v2, 0x2

    if-ne v1, v2, :cond_c

    const/4 v2, 0x0

    :try_start_6
    iput v2, v8, Lc/a/a/i/b;->k:I
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_4

    :cond_c
    const/4 v2, 0x0

    :goto_4
    :try_start_7
    iget-object v1, v7, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object v1, v1, Lc/a/a/i/h;->k:Ljava/lang/String;

    iget-object v2, v7, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v2, v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_14

    const-wide/16 v19, 0x0

    move-object/from16 v21, p4

    move-object/from16 v22, v4

    move-object/from16 v25, v6

    move-object/from16 v26, v25

    move-wide/from16 v3, v19

    const/4 v6, 0x0

    :goto_5
    cmp-long v27, v3, v19

    if-eqz v27, :cond_e

    :try_start_8
    invoke-virtual {v7, v3, v4}, Lc/a/a/i/g;->g(J)Lc/a/a/i/q/d;

    move-result-object v3

    if-eqz v3, :cond_d

    iget-object v4, v3, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v15, v4, Lc/a/a/k/a;->h:Ljava/lang/Class;

    goto :goto_6

    :cond_d
    const/4 v4, 0x0

    const/4 v15, 0x0

    :goto_6
    move-wide/from16 v28, v19

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object/from16 v10, v21

    move-object/from16 v11, v22

    :goto_7
    move-object/from16 v6, v25

    goto/16 :goto_4a

    :cond_e
    move-wide/from16 v28, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x0

    :goto_8
    if-nez v3, :cond_10

    if-ge v6, v2, :cond_f

    iget-object v3, v7, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    aget-object v3, v3, v6

    iget-object v4, v3, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v15, v4, Lc/a/a/k/a;->h:Ljava/lang/Class;

    :cond_f
    add-int/lit8 v6, v6, 0x1

    :cond_10
    move-object/from16 v42, v15

    move v15, v6

    move-object/from16 v6, v42

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    if-eqz v3, :cond_34

    move-object/from16 v33, v1

    iget-wide v0, v4, Lc/a/a/k/a;->p:J

    move/from16 v34, v2

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    move/from16 p4, v15

    const/4 v15, -0x2

    if-eq v6, v2, :cond_31

    if-ne v6, v13, :cond_11

    goto/16 :goto_15

    :cond_11
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v6, v2, :cond_2e

    if-ne v6, v12, :cond_12

    goto/16 :goto_12

    :cond_12
    const-class v2, Ljava/lang/String;

    if-ne v6, v2, :cond_15

    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->J(J)Ljava/lang/String;

    move-result-object v0

    iget v1, v14, Lc/a/a/i/e;->w:I

    if-lez v1, :cond_13

    :goto_9
    move/from16 v36, v30

    const/4 v2, 0x1

    const/4 v15, 0x1

    :goto_a
    const/16 v35, 0x0

    :goto_b
    move-wide/from16 v42, v31

    move-object/from16 v32, v0

    move-wide/from16 v30, v19

    goto/16 :goto_14

    :cond_13
    if-ne v1, v15, :cond_14

    :goto_c
    iget-wide v3, v14, Lc/a/a/i/e;->B:J

    goto/16 :goto_17

    :cond_14
    move/from16 v36, v30

    const/4 v2, 0x0

    const/4 v15, 0x0

    goto :goto_a

    :cond_15
    const-class v2, Ljava/util/Date;

    if-ne v6, v2, :cond_17

    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->z(J)Ljava/util/Date;

    move-result-object v0

    iget v1, v14, Lc/a/a/i/e;->w:I

    if-lez v1, :cond_16

    goto :goto_9

    :cond_16
    if-ne v1, v15, :cond_14

    goto :goto_c

    :cond_17
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v6, v2, :cond_2c

    const-class v2, Ljava/lang/Boolean;

    if-ne v6, v2, :cond_18

    goto/16 :goto_11

    :cond_18
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v6, v2, :cond_2a

    if-ne v6, v11, :cond_19

    goto/16 :goto_f

    :cond_19
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v6, v2, :cond_28

    if-ne v6, v10, :cond_1a

    goto/16 :goto_e

    :cond_1a
    iget-boolean v2, v4, Lc/a/a/k/a;->n:Z

    if-eqz v2, :cond_1d

    iget-object v2, v8, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v2, v6}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v2

    instance-of v2, v2, Lc/a/a/i/c;

    if-eqz v2, :cond_1d

    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->K(J)J

    move-result-wide v0

    iget v2, v14, Lc/a/a/i/e;->w:I

    if-lez v2, :cond_1b

    invoke-virtual {v3, v0, v1}, Lc/a/a/i/q/d;->a(J)Ljava/lang/Enum;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    goto :goto_d

    :cond_1b
    if-ne v2, v15, :cond_1c

    goto :goto_c

    :cond_1c
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_d
    move v15, v2

    move/from16 v36, v30

    const/16 v35, 0x0

    move v2, v1

    goto :goto_b

    :cond_1d
    const-class v2, [I

    if-ne v6, v2, :cond_1f

    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->H(J)[I

    move-result-object v0

    iget v1, v14, Lc/a/a/i/e;->w:I

    if-lez v1, :cond_1e

    goto :goto_9

    :cond_1e
    if-ne v1, v15, :cond_14

    goto :goto_c

    :cond_1f
    const-class v2, [F

    if-ne v6, v2, :cond_21

    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->E(J)[F

    move-result-object v0

    iget v1, v14, Lc/a/a/i/e;->w:I

    if-lez v1, :cond_20

    goto/16 :goto_9

    :cond_20
    if-ne v1, v15, :cond_14

    goto :goto_c

    :cond_21
    const-class v2, [D

    if-ne v6, v2, :cond_23

    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->B(J)[D

    move-result-object v0

    iget v1, v14, Lc/a/a/i/e;->w:I

    if-lez v1, :cond_22

    goto/16 :goto_9

    :cond_22
    if-ne v1, v15, :cond_14

    goto/16 :goto_c

    :cond_23
    const-class v2, [[F

    if-ne v6, v2, :cond_25

    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->F(J)[[F

    move-result-object v0

    iget v1, v14, Lc/a/a/i/e;->w:I

    if-lez v1, :cond_24

    goto/16 :goto_9

    :cond_24
    if-ne v1, v15, :cond_14

    goto/16 :goto_c

    :cond_25
    const-class v2, [[D

    if-ne v6, v2, :cond_27

    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->C(J)[[D

    move-result-object v0

    iget v1, v14, Lc/a/a/i/e;->w:I

    if-lez v1, :cond_26

    goto/16 :goto_9

    :cond_26
    if-ne v1, v15, :cond_14

    goto/16 :goto_c

    :cond_27
    iget-wide v0, v4, Lc/a/a/k/a;->p:J

    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->o(J)Z

    move-result v0

    if-eqz v0, :cond_37

    move/from16 v36, v30

    move-wide/from16 v0, v31

    const/4 v2, 0x1

    goto/16 :goto_18

    :cond_28
    :goto_e
    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->A(J)D

    move-result-wide v31

    iget v0, v14, Lc/a/a/i/e;->w:I

    if-lez v0, :cond_29

    goto :goto_10

    :cond_29
    if-ne v0, v15, :cond_35

    goto/16 :goto_c

    :cond_2a
    :goto_f
    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->D(J)F

    move-result v30

    iget v0, v14, Lc/a/a/i/e;->w:I

    if-lez v0, :cond_2b

    :goto_10
    move/from16 v36, v30

    move-wide/from16 v0, v31

    const/4 v2, 0x1

    const/4 v15, 0x1

    goto/16 :goto_19

    :cond_2b
    if-ne v0, v15, :cond_35

    goto/16 :goto_c

    :cond_2c
    :goto_11
    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->y(J)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget v1, v14, Lc/a/a/i/e;->w:I

    if-lez v1, :cond_2d

    goto/16 :goto_9

    :cond_2d
    if-ne v1, v15, :cond_14

    goto/16 :goto_c

    :cond_2e
    :goto_12
    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->I(J)J

    move-result-wide v0

    iget v2, v14, Lc/a/a/i/e;->w:I

    if-lez v2, :cond_2f

    move/from16 v36, v30

    const/4 v2, 0x1

    const/4 v15, 0x1

    :goto_13
    const/16 v35, 0x0

    move-wide/from16 v42, v31

    const/16 v32, 0x0

    move-wide/from16 v30, v0

    :goto_14
    move-wide/from16 v0, v42

    goto :goto_1b

    :cond_2f
    if-ne v2, v15, :cond_30

    goto/16 :goto_c

    :cond_30
    move/from16 v36, v30

    const/4 v2, 0x0

    const/4 v15, 0x0

    goto :goto_13

    :cond_31
    :goto_15
    invoke-virtual {v14, v0, v1}, Lc/a/a/i/e;->G(J)I

    move-result v0

    iget v1, v14, Lc/a/a/i/e;->w:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    if-lez v1, :cond_32

    move/from16 v35, v0

    move/from16 v36, v30

    move-wide/from16 v0, v31

    const/4 v2, 0x1

    const/4 v15, 0x1

    :goto_16
    const/16 v32, 0x0

    goto :goto_1a

    :cond_32
    if-ne v1, v15, :cond_33

    goto/16 :goto_c

    :goto_17
    move-object/from16 v0, p2

    move/from16 v6, p4

    move-object/from16 v1, v33

    move/from16 v2, v34

    goto/16 :goto_27

    :cond_33
    move/from16 v35, v0

    move/from16 v36, v30

    move-wide/from16 v0, v31

    const/4 v2, 0x0

    const/4 v15, 0x0

    goto :goto_16

    :cond_34
    move-object/from16 v33, v1

    move/from16 v34, v2

    move/from16 p4, v15

    :cond_35
    move/from16 v36, v30

    move-wide/from16 v0, v31

    const/4 v2, 0x0

    :goto_18
    const/4 v15, 0x0

    :goto_19
    const/16 v32, 0x0

    const/16 v35, 0x0

    :goto_1a
    move-wide/from16 v30, v19

    :goto_1b
    if-nez v2, :cond_50

    move-object/from16 v37, v4

    :try_start_9
    iget-object v4, v8, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    invoke-virtual {v14, v4}, Lc/a/a/i/e;->T(Lc/a/a/i/o;)Ljava/lang/String;

    move-result-object v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_c

    if-nez v4, :cond_38

    move-wide/from16 v38, v0

    :try_start_a
    iget v0, v14, Lc/a/a/i/e;->h:I

    const/16 v1, 0xd

    if-ne v0, v1, :cond_36

    const/16 v1, 0x10

    invoke-virtual {v14, v1}, Lc/a/a/i/e;->t(I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    move-object/from16 v2, p2

    move-object/from16 v41, v22

    move-object/from16 v40, v25

    goto/16 :goto_25

    :cond_36
    const/16 v1, 0x10

    if-ne v0, v1, :cond_39

    :cond_37
    move-object/from16 v2, p2

    move-object/from16 v41, v22

    move-object/from16 v40, v25

    move-object/from16 v0, v33

    const/16 v3, 0xd

    goto/16 :goto_26

    :cond_38
    move-wide/from16 v38, v0

    :cond_39
    :try_start_b
    const-string v0, "$ref"
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_c

    const/16 v1, 0x3a

    if-ne v0, v4, :cond_43

    if-eqz v22, :cond_43

    :try_start_c
    invoke-virtual {v14, v1}, Lc/a/a/i/e;->u(C)V

    iget v0, v14, Lc/a/a/i/e;->h:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_42

    invoke-virtual {v14}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v0

    const-string v1, "@"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    if-eqz v1, :cond_3a

    move-object/from16 v1, v22

    :try_start_d
    iget-object v0, v1, Lc/a/a/i/l;->a:Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    move-object v2, v0

    goto :goto_20

    :catchall_2
    move-exception v0

    move-object v11, v1

    move-object/from16 v10, v21

    goto/16 :goto_7

    :cond_3a
    move-object/from16 v1, v22

    :try_start_e
    const-string v2, ".."

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    if-eqz v2, :cond_3c

    :try_start_f
    iget-object v2, v1, Lc/a/a/i/l;->b:Lc/a/a/i/l;

    iget-object v3, v2, Lc/a/a/i/l;->a:Ljava/lang/Object;

    if-eqz v3, :cond_3b

    :goto_1c
    move-object/from16 v21, v3

    goto :goto_1e

    :cond_3b
    new-instance v3, Lc/a/a/i/b$a;

    invoke-direct {v3, v2, v0}, Lc/a/a/i/b$a;-><init>(Lc/a/a/i/l;Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Lc/a/a/i/b;->b(Lc/a/a/i/b$a;)V

    const/4 v0, 0x1

    :goto_1d
    iput v0, v8, Lc/a/a/i/b;->k:I
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    :goto_1e
    move-object/from16 v2, v21

    goto :goto_20

    :cond_3c
    :try_start_10
    const-string v2, "$"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_5

    if-eqz v2, :cond_3f

    move-object v2, v1

    :goto_1f
    :try_start_11
    iget-object v3, v2, Lc/a/a/i/l;->b:Lc/a/a/i/l;

    if-eqz v3, :cond_3d

    move-object v2, v3

    goto :goto_1f

    :cond_3d
    iget-object v3, v2, Lc/a/a/i/l;->a:Ljava/lang/Object;

    if-eqz v3, :cond_3e

    goto :goto_1c

    :cond_3e
    new-instance v3, Lc/a/a/i/b$a;

    invoke-direct {v3, v2, v0}, Lc/a/a/i/b$a;-><init>(Lc/a/a/i/l;Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Lc/a/a/i/b;->b(Lc/a/a/i/b$a;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    const/4 v0, 0x1

    goto :goto_1d

    :cond_3f
    :try_start_12
    new-instance v2, Lc/a/a/i/b$a;

    invoke-direct {v2, v1, v0}, Lc/a/a/i/b$a;-><init>(Lc/a/a/i/l;Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Lc/a/a/i/b;->b(Lc/a/a/i/b$a;)V

    const/4 v0, 0x1

    iput v0, v8, Lc/a/a/i/b;->k:I
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_5

    goto :goto_1e

    :goto_20
    const/16 v0, 0xd

    :try_start_13
    invoke-virtual {v14, v0}, Lc/a/a/i/e;->t(I)V

    iget v3, v14, Lc/a/a/i/e;->h:I

    if-ne v3, v0, :cond_41

    const/16 v0, 0x10

    invoke-virtual {v14, v0}, Lc/a/a/i/e;->t(I)V

    invoke-virtual {v8, v1, v2, v9}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_4

    move-object/from16 v3, v25

    if-eqz v3, :cond_40

    iput-object v2, v3, Lc/a/a/i/l;->a:Ljava/lang/Object;

    :cond_40
    invoke-virtual {v8, v1}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    return-object v2

    :cond_41
    move-object/from16 v3, v25

    :try_start_14
    new-instance v0, Lc/a/a/d;

    const-string v4, "illegal ref"

    invoke-direct {v0, v4}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_3

    :catchall_3
    move-exception v0

    goto :goto_21

    :catchall_4
    move-exception v0

    move-object/from16 v3, v25

    :goto_21
    move-object v11, v1

    move-object v10, v2

    move-object v6, v3

    goto/16 :goto_4a

    :catchall_5
    move-exception v0

    move-object/from16 v3, v25

    goto :goto_22

    :cond_42
    move-object/from16 v1, v22

    move-object/from16 v3, v25

    :try_start_15
    new-instance v2, Lc/a/a/d;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "illegal ref, "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    :catchall_6
    move-exception v0

    :goto_22
    move-object v11, v1

    move-object v6, v3

    :goto_23
    move-object/from16 v10, v21

    goto/16 :goto_4a

    :catchall_7
    move-exception v0

    move-object/from16 v3, v25

    move-object v6, v3

    goto/16 :goto_2b

    :cond_43
    move-object/from16 v41, v22

    move-object/from16 v40, v25

    const/4 v0, 0x1

    if-eqz v33, :cond_44

    move-object/from16 v0, v33

    :try_start_16
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v22
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    if-nez v22, :cond_45

    goto :goto_24

    :catchall_8
    move-exception v0

    move-object/from16 v10, v21

    goto/16 :goto_3c

    :cond_44
    move-object/from16 v0, v33

    :goto_24
    :try_start_17
    const-string v1, "@type"
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    if-ne v1, v4, :cond_4f

    const/16 v1, 0x3a

    :cond_45
    :try_start_18
    invoke-virtual {v14, v1}, Lc/a/a/i/e;->u(C)V

    iget v1, v14, Lc/a/a/i/e;->h:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_4e

    invoke-virtual {v14}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x10

    invoke-virtual {v14, v2}, Lc/a/a/i/e;->t(I)V

    move-object/from16 v2, p2

    instance-of v3, v2, Ljava/lang/Class;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    if-eqz v3, :cond_47

    :try_start_19
    move-object v3, v2

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_47

    iget v1, v14, Lc/a/a/i/e;->h:I

    const/16 v3, 0xd

    if-ne v1, v3, :cond_46

    invoke-virtual {v14}, Lc/a/a/i/e;->s()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    :goto_25
    move-object/from16 v14, v26

    move-object/from16 v6, v40

    move-object/from16 v11, v41

    const/16 v18, 0x0

    goto/16 :goto_41

    :cond_46
    :goto_26
    move/from16 v6, p4

    move-object v1, v0

    move-object v0, v2

    move-wide/from16 v3, v28

    move/from16 v2, v34

    move-object/from16 v25, v40

    move-object/from16 v22, v41

    :goto_27
    const/16 v15, 0x10

    goto/16 :goto_5

    :cond_47
    :try_start_1a
    iget-object v3, v8, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    iget-object v4, v7, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    invoke-virtual {v7, v3, v4, v1}, Lc/a/a/i/g;->h(Lc/a/a/i/m;Lc/a/a/i/h;Ljava/lang/String;)Lc/a/a/i/g;

    move-result-object v3
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_a

    if-nez v3, :cond_4a

    :try_start_1b
    iget-object v3, v8, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    iget-object v4, v7, Lc/a/a/i/g;->d:Ljava/lang/Class;

    iget v5, v14, Lc/a/a/i/e;->j:I

    invoke-virtual {v3, v1, v4, v5}, Lc/a/a/i/m;->a(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;

    move-result-object v3

    invoke-static/range {p2 .. p2}, Lc/a/a/k/d;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    if-eqz v2, :cond_49

    if-eqz v3, :cond_48

    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_48

    goto :goto_28

    :cond_48
    new-instance v0, Lc/a/a/d;

    const-string v1, "type not match"

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_49
    :goto_28
    iget-object v2, v8, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v2, v3}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v2
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_8

    move-object/from16 v42, v3

    move-object v3, v2

    move-object/from16 v2, v42

    goto :goto_29

    :cond_4a
    const/4 v2, 0x0

    :goto_29
    :try_start_1c
    instance-of v4, v3, Lc/a/a/i/g;
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_a

    if-eqz v4, :cond_4b

    :try_start_1d
    check-cast v3, Lc/a/a/i/g;

    const/4 v4, 0x0

    invoke-direct {v3, v8, v2, v9, v4}, Lc/a/a/i/g;->d(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v0, :cond_4c

    invoke-virtual {v3, v0}, Lc/a/a/i/g;->f(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object v0

    if-eqz v0, :cond_4c

    invoke-virtual {v0, v2, v1}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_8

    goto :goto_2a

    :cond_4b
    :try_start_1e
    invoke-interface {v3, v8, v2, v9}, Lc/a/a/i/q/f;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_a

    :cond_4c
    :goto_2a
    move-object/from16 v1, v40

    if-eqz v1, :cond_4d

    move-object/from16 v3, v21

    iput-object v3, v1, Lc/a/a/i/l;->a:Ljava/lang/Object;

    :cond_4d
    move-object/from16 v4, v41

    invoke-virtual {v8, v4}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    return-object v2

    :cond_4e
    move-object/from16 v3, v21

    move-object/from16 v1, v40

    move-object/from16 v4, v41

    :try_start_1f
    new-instance v0, Lc/a/a/d;

    const-string v2, "syntax error"

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_9

    :catchall_9
    move-exception v0

    move-object v6, v1

    move-object v10, v3

    goto/16 :goto_1

    :catchall_a
    move-exception v0

    move-object/from16 v3, v21

    move-object/from16 v1, v40

    move-object v6, v1

    move-object v10, v3

    goto/16 :goto_3d

    :cond_4f
    move-object/from16 v33, v0

    move-object/from16 v16, v4

    move-object/from16 v1, v40

    move-object/from16 v4, v41

    const/16 v22, 0xd

    const/16 v24, 0x0

    move-object/from16 v0, p2

    goto :goto_2c

    :catchall_b
    move-exception v0

    move-object/from16 v1, v40

    move-object v6, v1

    move-object/from16 v10, v21

    goto/16 :goto_3d

    :catchall_c
    move-exception v0

    move-object/from16 v1, v25

    move-object v6, v1

    :goto_2b
    move-object/from16 v10, v21

    move-object/from16 v11, v22

    goto/16 :goto_4a

    :cond_50
    move-wide/from16 v38, v0

    move-object/from16 v37, v4

    move-object/from16 v4, v22

    move-object/from16 v1, v25

    const/16 v22, 0xd

    const/16 v24, 0x0

    move-object/from16 v0, p2

    move-object/from16 v16, v24

    :goto_2c
    if-nez v21, :cond_53

    if-nez v26, :cond_53

    move-object/from16 v40, v1

    :try_start_20
    invoke-virtual/range {p0 .. p2}, Lc/a/a/i/g;->a(Lc/a/a/i/b;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_e

    if-nez v1, :cond_51

    move-object/from16 v25, v14

    :try_start_21
    new-instance v14, Ljava/util/HashMap;

    move-object/from16 v41, v10

    iget-object v10, v7, Lc/a/a/i/g;->a:[Lc/a/a/i/q/d;

    array-length v10, v10

    invoke-direct {v14, v10}, Ljava/util/HashMap;-><init>(I)V

    move-object/from16 v26, v14

    goto :goto_2d

    :catchall_d
    move-exception v0

    move-object v10, v1

    goto :goto_30

    :cond_51
    move-object/from16 v41, v10

    move-object/from16 v25, v14

    :goto_2d
    if-nez v5, :cond_52

    invoke-virtual {v8, v4, v1, v9}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;

    move-result-object v10
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_d

    move-object/from16 v40, v10

    move-object/from16 v14, v26

    move-object v10, v1

    goto :goto_2f

    :cond_52
    move-object v10, v1

    goto :goto_2e

    :catchall_e
    move-exception v0

    move-object v11, v4

    move-object/from16 v10, v21

    goto/16 :goto_49

    :cond_53
    move-object/from16 v40, v1

    move-object/from16 v41, v10

    move-object/from16 v25, v14

    move-object/from16 v10, v21

    :goto_2e
    move-object/from16 v14, v26

    :goto_2f
    if-eqz v2, :cond_6c

    if-nez v15, :cond_54

    :try_start_22
    invoke-virtual {v3, v8, v10, v0, v14}, Lc/a/a/i/q/d;->b(Lc/a/a/i/b;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V

    move/from16 v21, v5

    move-object/from16 v16, v11

    move-object/from16 v0, v25

    move-object/from16 v23, v33

    move/from16 v17, v34

    move-object/from16 v15, v41

    const/16 v18, 0x0

    move-object v11, v4

    move-object/from16 v25, v10

    move/from16 v10, v22

    const/16 v22, 0x4

    goto/16 :goto_3f

    :catchall_f
    move-exception v0

    :goto_30
    move-object v11, v4

    goto/16 :goto_49

    :cond_54
    if-nez v10, :cond_5d

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq v6, v1, :cond_5c

    if-ne v6, v13, :cond_55

    goto :goto_34

    :cond_55
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v6, v1, :cond_5b

    if-ne v6, v12, :cond_56

    goto :goto_33

    :cond_56
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v6, v1, :cond_5a

    if-ne v6, v11, :cond_57

    goto :goto_32

    :cond_57
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    move-object/from16 v15, v41

    if-eq v6, v1, :cond_59

    if-ne v6, v15, :cond_58

    goto :goto_31

    :cond_58
    move-object/from16 v1, v32

    goto :goto_35

    :cond_59
    :goto_31
    new-instance v1, Ljava/lang/Double;

    move-wide/from16 v2, v38

    invoke-direct {v1, v2, v3}, Ljava/lang/Double;-><init>(D)V

    goto :goto_35

    :cond_5a
    :goto_32
    move-object/from16 v15, v41

    new-instance v1, Ljava/lang/Float;

    move/from16 v2, v36

    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    goto :goto_35

    :cond_5b
    :goto_33
    move-object/from16 v15, v41

    invoke-static/range {v30 .. v31}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_35

    :cond_5c
    :goto_34
    move-object/from16 v15, v41

    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_35
    move-object/from16 v2, v37

    iget-object v2, v2, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-interface {v14, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_f

    move-object/from16 v41, v4

    move/from16 v21, v5

    goto/16 :goto_3b

    :cond_5d
    move/from16 v21, v5

    move/from16 v2, v36

    move-object/from16 v1, v37

    move-object/from16 v15, v41

    move-object/from16 v41, v4

    move-wide/from16 v4, v38

    if-nez v32, :cond_6a

    :try_start_23
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq v6, v0, :cond_68

    if-ne v6, v13, :cond_5e

    goto :goto_3a

    :cond_5e
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v6, v0, :cond_66

    if-ne v6, v12, :cond_5f

    goto :goto_39

    :cond_5f
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v6, v0, :cond_64

    if-ne v6, v11, :cond_60

    goto :goto_38

    :cond_60
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-eq v6, v0, :cond_62

    if-ne v6, v15, :cond_61

    goto :goto_36

    :cond_61
    move-object/from16 v2, v32

    invoke-virtual {v3, v10, v2}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_3b

    :cond_62
    :goto_36
    iget-boolean v2, v1, Lc/a/a/k/a;->e:Z

    if-eqz v2, :cond_63

    if-ne v6, v0, :cond_63

    invoke-virtual {v3, v10, v4, v5}, Lc/a/a/i/q/d;->c(Ljava/lang/Object;D)V

    goto :goto_3b

    :cond_63
    new-instance v0, Ljava/lang/Double;

    invoke-direct {v0, v4, v5}, Ljava/lang/Double;-><init>(D)V

    :goto_37
    invoke-virtual {v3, v10, v0}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_3b

    :cond_64
    :goto_38
    iget-boolean v4, v1, Lc/a/a/k/a;->e:Z

    if-eqz v4, :cond_65

    if-ne v6, v0, :cond_65

    invoke-virtual {v3, v10, v2}, Lc/a/a/i/q/d;->d(Ljava/lang/Object;F)V

    goto :goto_3b

    :cond_65
    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, v2}, Ljava/lang/Float;-><init>(F)V

    goto :goto_37

    :cond_66
    :goto_39
    iget-boolean v2, v1, Lc/a/a/k/a;->e:Z

    if-eqz v2, :cond_67

    if-ne v6, v0, :cond_67

    move-wide/from16 v4, v30

    invoke-virtual {v3, v10, v4, v5}, Lc/a/a/i/q/d;->f(Ljava/lang/Object;J)V

    goto :goto_3b

    :cond_67
    move-wide/from16 v4, v30

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_37

    :cond_68
    :goto_3a
    iget-boolean v2, v1, Lc/a/a/k/a;->e:Z

    if-eqz v2, :cond_69

    if-ne v6, v0, :cond_69

    move/from16 v0, v35

    invoke-virtual {v3, v10, v0}, Lc/a/a/i/q/d;->e(Ljava/lang/Object;I)V

    goto :goto_3b

    :cond_69
    move/from16 v0, v35

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_23
    .catch Ljava/lang/IllegalAccessException; {:try_start_23 .. :try_end_23} :catch_0
    .catchall {:try_start_23 .. :try_end_23} :catchall_10

    goto :goto_37

    :catch_0
    move-exception v0

    :try_start_24
    new-instance v2, Lc/a/a/d;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "set property error, "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1, v0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_6a
    move-object/from16 v2, v32

    invoke-virtual {v3, v10, v2}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3b
    move-object/from16 v0, v25

    iget v1, v0, Lc/a/a/i/e;->w:I
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_10

    const/4 v3, 0x4

    move-object/from16 v25, v10

    if-ne v1, v3, :cond_6b

    move-object/from16 v11, v41

    const/16 v18, 0x0

    goto/16 :goto_40

    :cond_6b
    move-object/from16 v16, v11

    move/from16 v10, v22

    move-object/from16 v23, v33

    move/from16 v17, v34

    move-object/from16 v11, v41

    const/16 v18, 0x0

    move/from16 v22, v3

    goto :goto_3f

    :catchall_10
    move-exception v0

    :goto_3c
    move-object/from16 v6, v40

    :goto_3d
    move-object/from16 v11, v41

    goto/16 :goto_4a

    :cond_6c
    move/from16 v21, v5

    move-object/from16 v0, v25

    move-object/from16 v23, v33

    move-object/from16 v15, v41

    const/4 v3, 0x4

    move-object/from16 v41, v4

    move-object/from16 v1, p0

    move/from16 v17, v34

    const/4 v4, 0x0

    move-object/from16 v2, p1

    move/from16 v18, v4

    move/from16 v6, v22

    const/4 v5, 0x1

    move/from16 v22, v3

    move-object/from16 v3, v16

    move-object/from16 v16, v11

    move-object/from16 v11, v41

    move-object v4, v10

    move-object/from16 v25, v10

    move v10, v5

    move-object/from16 v5, p2

    move v10, v6

    move-object v6, v14

    :try_start_25
    invoke-direct/range {v1 .. v6}, Lc/a/a/i/g;->j(Lc/a/a/i/b;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)Z

    move-result v1

    if-nez v1, :cond_6e

    iget v1, v0, Lc/a/a/i/e;->h:I

    if-ne v1, v10, :cond_6d

    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    goto :goto_40

    :cond_6d
    const/16 v2, 0x10

    :goto_3e
    const/4 v3, 0x0

    const/4 v4, 0x1

    goto/16 :goto_48

    :cond_6e
    iget v1, v0, Lc/a/a/i/e;->h:I

    const/16 v2, 0x11

    if-eq v1, v2, :cond_7e

    :goto_3f
    iget v1, v0, Lc/a/a/i/e;->h:I

    const/16 v2, 0x10

    if-ne v1, v2, :cond_6f

    goto :goto_3e

    :cond_6f
    if-ne v1, v10, :cond_7c

    invoke-virtual {v0, v2}, Lc/a/a/i/e;->t(I)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_13

    :goto_40
    move-object/from16 v21, v25

    move-object/from16 v6, v40

    :goto_41
    if-nez v21, :cond_79

    if-nez v14, :cond_72

    :try_start_26
    invoke-virtual/range {p0 .. p2}, Lc/a/a/i/g;->a(Lc/a/a/i/b;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_12

    if-nez v6, :cond_70

    :try_start_27
    invoke-virtual {v8, v11, v1, v9}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;

    move-result-object v6
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_11

    goto :goto_42

    :catchall_11
    move-exception v0

    move-object v10, v1

    goto/16 :goto_4a

    :cond_70
    :goto_42
    if-eqz v6, :cond_71

    iput-object v1, v6, Lc/a/a/i/l;->a:Ljava/lang/Object;

    :cond_71
    invoke-virtual {v8, v11}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    return-object v1

    :cond_72
    :try_start_28
    iget-object v0, v7, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object v0, v0, Lc/a/a/i/h;->n:[Ljava/lang/String;

    if-eqz v0, :cond_73

    array-length v1, v0

    goto :goto_43

    :cond_73
    iget-object v1, v7, Lc/a/a/i/g;->a:[Lc/a/a/i/q/d;

    array-length v1, v1

    :goto_43
    new-array v2, v1, [Ljava/lang/Object;

    move/from16 v3, v18

    :goto_44
    if-ge v3, v1, :cond_76

    iget-object v4, v7, Lc/a/a/i/g;->a:[Lc/a/a/i/q/d;

    aget-object v4, v4, v3

    iget-object v4, v4, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    if-eqz v0, :cond_74

    iget-object v5, v4, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-interface {v14, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_45

    :cond_74
    iget-object v5, v4, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-interface {v14, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    :goto_45
    if-nez v5, :cond_75

    iget-object v4, v4, Lc/a/a/k/a;->h:Ljava/lang/Class;

    invoke-static {v4}, Lc/a/a/k/d;->w(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    :cond_75
    aput-object v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_44

    :cond_76
    iget-object v1, v7, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object v3, v1, Lc/a/a/i/h;->c:Ljava/lang/reflect/Constructor;
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_12

    if-eqz v3, :cond_78

    :try_start_29
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_29
    .catch Ljava/lang/Exception; {:try_start_29 .. :try_end_29} :catch_1
    .catchall {:try_start_29 .. :try_end_29} :catchall_12

    if-eqz v0, :cond_7a

    :try_start_2a
    invoke-interface {v14}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_77
    :goto_46
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v7, v3}, Lc/a/a/i/g;->f(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object v3

    if-eqz v3, :cond_77

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_11

    goto :goto_46

    :catch_1
    move-exception v0

    move-object v1, v0

    :try_start_2b
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "create instance error, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v7, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object v3, v3, Lc/a/a/i/h;->c:Ljava/lang/reflect/Constructor;

    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_78
    iget-object v0, v1, Lc/a/a/i/h;->d:Ljava/lang/reflect/Method;
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_12

    if-eqz v0, :cond_79

    const/4 v3, 0x0

    :try_start_2c
    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v21
    :try_end_2c
    .catch Ljava/lang/Exception; {:try_start_2c .. :try_end_2c} :catch_2
    .catchall {:try_start_2c .. :try_end_2c} :catchall_12

    goto :goto_47

    :catch_2
    move-exception v0

    move-object v1, v0

    :try_start_2d
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "create factory method error, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v7, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object v3, v3, Lc/a/a/i/h;->d:Ljava/lang/reflect/Method;

    invoke-virtual {v3}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_12

    :catchall_12
    move-exception v0

    goto/16 :goto_23

    :cond_79
    :goto_47
    move-object/from16 v1, v21

    :cond_7a
    if-eqz v6, :cond_7b

    iput-object v1, v6, Lc/a/a/i/l;->a:Ljava/lang/Object;

    :cond_7b
    invoke-virtual {v8, v11}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    return-object v1

    :cond_7c
    const/4 v3, 0x0

    const/16 v4, 0x12

    if-eq v1, v4, :cond_7d

    const/4 v4, 0x1

    if-eq v1, v4, :cond_7d

    :goto_48
    move/from16 v6, p4

    move-object/from16 v22, v11

    move-object/from16 v26, v14

    move-object v10, v15

    move-object/from16 v11, v16

    move/from16 v5, v21

    move-object/from16 v1, v23

    move-object/from16 v21, v25

    move-wide/from16 v3, v28

    move-object/from16 v25, v40

    move-object v14, v0

    move v15, v2

    move/from16 v2, v17

    move-object/from16 v0, p2

    goto/16 :goto_5

    :cond_7d
    :try_start_2e
    new-instance v1, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "syntax error, unexpect token "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, v0, Lc/a/a/i/e;->h:I

    invoke-static {v0}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7e
    new-instance v0, Lc/a/a/d;

    const-string v1, "syntax error, unexpect token \':\'"

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_13

    :catchall_13
    move-exception v0

    move-object/from16 v10, v25

    :goto_49
    move-object/from16 v6, v40

    goto :goto_4a

    :catchall_14
    move-exception v0

    move-object v11, v4

    move-object v3, v6

    move-object/from16 v10, p4

    :goto_4a
    if-eqz v6, :cond_7f

    iput-object v10, v6, Lc/a/a/i/l;->a:Ljava/lang/Object;

    :cond_7f
    invoke-virtual {v8, v11}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    throw v0

    :cond_80
    :goto_4b
    invoke-virtual/range {p1 .. p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private e(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual/range {p0 .. p2}, Lc/a/a/i/g;->a(Lc/a/a/i/b;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, v0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v4, v4

    const/4 v5, 0x0

    :goto_0
    const/16 v6, 0x10

    const/16 v7, 0x2c

    if-ge v5, v4, :cond_2d

    add-int/lit8 v9, v4, -0x1

    const/16 v10, 0x5d

    if-ne v5, v9, :cond_0

    move v9, v10

    goto :goto_1

    :cond_0
    move v9, v7

    :goto_1
    iget-object v11, v0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    aget-object v11, v11, v5

    iget-object v12, v11, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v13, v12, Lc/a/a/k/a;->h:Ljava/lang/Class;

    :try_start_0
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/16 v15, 0xf

    if-ne v13, v14, :cond_6

    invoke-virtual {v2}, Lc/a/a/i/e;->O()J

    move-result-wide v13

    long-to-int v9, v13

    iget-boolean v13, v12, Lc/a/a/k/a;->e:Z

    if-eqz v13, :cond_1

    iget-object v11, v12, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v11, v3, v9}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    goto :goto_2

    :cond_1
    new-instance v13, Ljava/lang/Integer;

    invoke-direct {v13, v9}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v11, v3, v13}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_2
    iget-char v9, v2, Lc/a/a/i/e;->k:C

    if-ne v9, v7, :cond_3

    iget v7, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Lc/a/a/i/e;->l:I

    iget v9, v2, Lc/a/a/i/e;->y:I

    if-lt v7, v9, :cond_2

    const/16 v8, 0x1a

    goto :goto_3

    :cond_2
    iget-object v8, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_3
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    :goto_4
    iput v6, v2, Lc/a/a/i/e;->h:I

    goto :goto_7

    :cond_3
    if-ne v9, v10, :cond_5

    iget v6, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v2, Lc/a/a/i/e;->l:I

    iget v7, v2, Lc/a/a/i/e;->y:I

    if-lt v6, v7, :cond_4

    const/16 v8, 0x1a

    goto :goto_5

    :cond_4
    iget-object v7, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_5
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    :goto_6
    iput v15, v2, Lc/a/a/i/e;->h:I

    goto :goto_7

    :cond_5
    invoke-virtual {v2}, Lc/a/a/i/e;->s()V

    :goto_7
    move-object/from16 v14, p3

    goto/16 :goto_1d

    :cond_6
    const-class v14, Ljava/lang/String;

    const/16 v8, 0x22

    if-ne v13, v14, :cond_e

    iget-char v9, v2, Lc/a/a/i/e;->k:C

    if-ne v9, v8, :cond_7

    invoke-virtual {v2, v8}, Lc/a/a/i/e;->S(C)Ljava/lang/String;

    move-result-object v8

    goto :goto_9

    :cond_7
    const/16 v8, 0x6e

    if-ne v9, v8, :cond_d

    iget-object v8, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    const-string v9, "null"

    iget v13, v2, Lc/a/a/i/e;->l:I

    invoke-virtual {v8, v9, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_d

    iget v8, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v8, v8, 0x4

    iput v8, v2, Lc/a/a/i/e;->l:I

    iget v9, v2, Lc/a/a/i/e;->y:I

    if-lt v8, v9, :cond_8

    const/16 v8, 0x1a

    goto :goto_8

    :cond_8
    iget-object v9, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v9, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_8
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    const/4 v8, 0x0

    :goto_9
    iget-boolean v9, v12, Lc/a/a/k/a;->e:Z

    if-eqz v9, :cond_9

    iget-object v9, v12, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v9, v3, v8}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_a

    :cond_9
    invoke-virtual {v11, v3, v8}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_a
    iget-char v8, v2, Lc/a/a/i/e;->k:C

    if-ne v8, v7, :cond_b

    iget v7, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Lc/a/a/i/e;->l:I

    iget v8, v2, Lc/a/a/i/e;->y:I

    if-lt v7, v8, :cond_a

    const/16 v8, 0x1a

    goto :goto_b

    :cond_a
    iget-object v8, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_b
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    goto :goto_4

    :cond_b
    if-ne v8, v10, :cond_5

    iget v6, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v2, Lc/a/a/i/e;->l:I

    iget v7, v2, Lc/a/a/i/e;->y:I

    if-lt v6, v7, :cond_c

    const/16 v8, 0x1a

    goto :goto_c

    :cond_c
    iget-object v7, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_c
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    goto :goto_6

    :cond_d
    new-instance v0, Lc/a/a/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not match string. feild : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v14, p3

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    move-object/from16 v14, p3

    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v13, v8, :cond_14

    invoke-virtual {v2}, Lc/a/a/i/e;->O()J

    move-result-wide v8

    iget-boolean v13, v12, Lc/a/a/k/a;->e:Z

    if-eqz v13, :cond_f

    iget-object v11, v12, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v11, v3, v8, v9}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    goto :goto_d

    :cond_f
    new-instance v13, Ljava/lang/Long;

    invoke-direct {v13, v8, v9}, Ljava/lang/Long;-><init>(J)V

    invoke-virtual {v11, v3, v13}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_d
    iget-char v8, v2, Lc/a/a/i/e;->k:C

    if-ne v8, v7, :cond_11

    iget v7, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Lc/a/a/i/e;->l:I

    iget v8, v2, Lc/a/a/i/e;->y:I

    if-lt v7, v8, :cond_10

    const/16 v8, 0x1a

    goto :goto_e

    :cond_10
    iget-object v8, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_e
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    :goto_f
    iput v6, v2, Lc/a/a/i/e;->h:I

    goto/16 :goto_1d

    :cond_11
    if-ne v8, v10, :cond_13

    iget v6, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v2, Lc/a/a/i/e;->l:I

    iget v7, v2, Lc/a/a/i/e;->y:I

    if-lt v6, v7, :cond_12

    const/16 v8, 0x1a

    goto :goto_10

    :cond_12
    iget-object v7, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_10
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    :goto_11
    iput v15, v2, Lc/a/a/i/e;->h:I

    goto/16 :goto_1d

    :cond_13
    invoke-virtual {v2}, Lc/a/a/i/e;->s()V

    goto/16 :goto_1d

    :cond_14
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v13, v8, :cond_19

    invoke-virtual {v2}, Lc/a/a/i/e;->x()Z

    move-result v8

    iget-boolean v9, v12, Lc/a/a/k/a;->e:Z

    if-eqz v9, :cond_15

    iget-object v9, v12, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v9, v3, v8}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    goto :goto_12

    :cond_15
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    invoke-virtual {v11, v3, v8}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_12
    iget-char v8, v2, Lc/a/a/i/e;->k:C

    if-ne v8, v7, :cond_17

    iget v7, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Lc/a/a/i/e;->l:I

    iget v8, v2, Lc/a/a/i/e;->y:I

    if-lt v7, v8, :cond_16

    const/16 v8, 0x1a

    goto :goto_13

    :cond_16
    iget-object v8, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_13
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    goto :goto_f

    :cond_17
    if-ne v8, v10, :cond_13

    iget v6, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v2, Lc/a/a/i/e;->l:I

    iget v7, v2, Lc/a/a/i/e;->y:I

    if-lt v6, v7, :cond_18

    const/16 v8, 0x1a

    goto :goto_14

    :cond_18
    iget-object v7, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_14
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    goto :goto_11

    :cond_19
    invoke-virtual {v13}, Ljava/lang/Class;->isEnum()Z

    move-result v8

    if-eqz v8, :cond_20

    iget-char v8, v2, Lc/a/a/i/e;->k:C

    const/16 v9, 0x22

    if-ne v8, v9, :cond_1b

    iget-object v8, v1, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    invoke-virtual {v2, v8}, Lc/a/a/i/e;->T(Lc/a/a/i/o;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_1a

    const/4 v8, 0x0

    goto :goto_15

    :cond_1a
    invoke-static {v13, v8}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v8

    goto :goto_15

    :cond_1b
    const/16 v9, 0x30

    if-lt v8, v9, :cond_1f

    const/16 v9, 0x39

    if-gt v8, v9, :cond_1f

    invoke-virtual {v2}, Lc/a/a/i/e;->O()J

    move-result-wide v8

    long-to-int v8, v8

    move-object v9, v11

    check-cast v9, Lc/a/a/i/a;

    iget-object v13, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v9, v13}, Lc/a/a/i/a;->h(Lc/a/a/i/m;)Lc/a/a/i/q/f;

    move-result-object v9

    check-cast v9, Lc/a/a/i/c;

    iget-object v9, v9, Lc/a/a/i/c;->c:[Ljava/lang/Enum;

    aget-object v8, v9, v8

    :goto_15
    invoke-virtual {v11, v3, v8}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-char v8, v2, Lc/a/a/i/e;->k:C

    if-ne v8, v7, :cond_1d

    iget v7, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Lc/a/a/i/e;->l:I

    iget v8, v2, Lc/a/a/i/e;->y:I

    if-lt v7, v8, :cond_1c

    const/16 v8, 0x1a

    goto :goto_16

    :cond_1c
    iget-object v8, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_16
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    goto/16 :goto_f

    :cond_1d
    if-ne v8, v10, :cond_13

    iget v6, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v2, Lc/a/a/i/e;->l:I

    iget v7, v2, Lc/a/a/i/e;->y:I

    if-lt v6, v7, :cond_1e

    const/16 v8, 0x1a

    goto :goto_17

    :cond_1e
    iget-object v7, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_17
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    goto/16 :goto_11

    :cond_1f
    new-instance v0, Lc/a/a/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "illegal enum."

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    const-class v8, Ljava/util/Date;

    if-ne v13, v8, :cond_24

    iget-char v8, v2, Lc/a/a/i/e;->k:C

    const/16 v13, 0x31

    if-ne v8, v13, :cond_24

    invoke-virtual {v2}, Lc/a/a/i/e;->O()J

    move-result-wide v8

    new-instance v13, Ljava/util/Date;

    invoke-direct {v13, v8, v9}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v11, v3, v13}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-char v8, v2, Lc/a/a/i/e;->k:C

    if-ne v8, v7, :cond_22

    iget v7, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v2, Lc/a/a/i/e;->l:I

    iget v8, v2, Lc/a/a/i/e;->y:I

    if-lt v7, v8, :cond_21

    const/16 v8, 0x1a

    goto :goto_18

    :cond_21
    iget-object v8, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_18
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    goto/16 :goto_f

    :cond_22
    if-ne v8, v10, :cond_13

    iget v6, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v6, v6, 0x1

    iput v6, v2, Lc/a/a/i/e;->l:I

    iget v7, v2, Lc/a/a/i/e;->y:I

    if-lt v6, v7, :cond_23

    const/16 v8, 0x1a

    goto :goto_19

    :cond_23
    iget-object v7, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_19
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    goto/16 :goto_11

    :cond_24
    iget-char v8, v2, Lc/a/a/i/e;->k:C

    const/16 v13, 0x5b

    if-ne v8, v13, :cond_26

    iget v8, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v8, v8, 0x1

    iput v8, v2, Lc/a/a/i/e;->l:I

    iget v13, v2, Lc/a/a/i/e;->y:I

    if-lt v8, v13, :cond_25

    const/16 v8, 0x1a

    goto :goto_1a

    :cond_25
    iget-object v13, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v13, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_1a
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    const/16 v8, 0xe

    iput v8, v2, Lc/a/a/i/e;->h:I

    goto :goto_1c

    :cond_26
    const/16 v13, 0x7b

    if-ne v8, v13, :cond_28

    iget v8, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v8, v8, 0x1

    iput v8, v2, Lc/a/a/i/e;->l:I

    iget v13, v2, Lc/a/a/i/e;->y:I

    if-lt v8, v13, :cond_27

    const/16 v8, 0x1a

    goto :goto_1b

    :cond_27
    iget-object v13, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v13, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_1b
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    const/16 v8, 0xc

    iput v8, v2, Lc/a/a/i/e;->h:I

    goto :goto_1c

    :cond_28
    invoke-virtual {v2}, Lc/a/a/i/e;->s()V

    :goto_1c
    iget-object v8, v12, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    const/4 v13, 0x0

    invoke-virtual {v11, v1, v3, v8, v13}, Lc/a/a/i/q/d;->b(Lc/a/a/i/b;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v8, "syntax error"

    if-ne v9, v10, :cond_2a

    :try_start_1
    iget v6, v2, Lc/a/a/i/e;->h:I

    if-ne v6, v15, :cond_29

    goto :goto_1d

    :cond_29
    new-instance v0, Lc/a/a/d;

    invoke-direct {v0, v8}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    if-ne v9, v7, :cond_2c

    iget v7, v2, Lc/a/a/i/e;->h:I

    if-ne v7, v6, :cond_2b

    goto :goto_1d

    :cond_2b
    new-instance v0, Lc/a/a/d;

    invoke-direct {v0, v8}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2c
    :goto_1d
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "set "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v12, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "error"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_2d
    iget-char v0, v2, Lc/a/a/i/e;->k:C

    if-ne v0, v7, :cond_2f

    iget v0, v2, Lc/a/a/i/e;->l:I

    add-int/lit8 v0, v0, 0x1

    iput v0, v2, Lc/a/a/i/e;->l:I

    iget v1, v2, Lc/a/a/i/e;->y:I

    if-lt v0, v1, :cond_2e

    const/16 v8, 0x1a

    goto :goto_1e

    :cond_2e
    iget-object v1, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v8

    :goto_1e
    iput-char v8, v2, Lc/a/a/i/e;->k:C

    iput v6, v2, Lc/a/a/i/e;->h:I

    goto :goto_1f

    :cond_2f
    invoke-virtual {v2}, Lc/a/a/i/e;->s()V

    :goto_1f
    return-object v3
.end method

.method private j(Lc/a/a/i/b;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/i/b;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    iget-object v12, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v0, v10}, Lc/a/a/i/g;->f(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-direct {v0, v10}, Lc/a/a/i/g;->k(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object v2

    :cond_0
    sget-object v3, Lc/a/a/i/d;->r:Lc/a/a/i/d;

    iget v3, v3, Lc/a/a/i/d;->u:I

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-nez v2, :cond_9

    iget-object v4, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v4, v4, Lc/a/a/i/e;->j:I

    and-int/2addr v4, v3

    if-nez v4, :cond_1

    iget-object v4, v0, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget v4, v4, Lc/a/a/i/h;->m:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_9

    :cond_1
    iget-object v3, v0, Lc/a/a/i/g;->f:Ljava/util/concurrent/ConcurrentMap;

    if-nez v3, :cond_7

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    const/high16 v4, 0x3f400000    # 0.75f

    invoke-direct {v3, v14, v4, v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    iget-object v4, v0, Lc/a/a/i/g;->d:Ljava/lang/Class;

    :goto_0
    if-eqz v4, :cond_6

    const-class v5, Ljava/lang/Object;

    if-eq v4, v5, :cond_6

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v5

    array-length v6, v5

    move v7, v13

    :goto_1
    if-ge v7, v6, :cond_5

    aget-object v8, v5, v7

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9}, Lc/a/a/i/g;->f(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object v15

    if-eqz v15, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v15

    and-int/lit8 v16, v15, 0x10

    if-nez v16, :cond_4

    and-int/lit8 v15, v15, 0x8

    if-eqz v15, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v3, v9, v8}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    goto :goto_0

    :cond_6
    iput-object v3, v0, Lc/a/a/i/g;->f:Ljava/util/concurrent/ConcurrentMap;

    :cond_7
    iget-object v3, v0, Lc/a/a/i/g;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v10}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_9

    instance-of v2, v3, Lc/a/a/i/q/d;

    if-eqz v2, :cond_8

    move-object v2, v3

    check-cast v2, Lc/a/a/i/q/d;

    goto :goto_3

    :cond_8
    move-object v7, v3

    check-cast v7, Ljava/lang/reflect/Field;

    invoke-virtual {v7, v14}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    new-instance v15, Lc/a/a/k/a;

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v15

    move-object/from16 v3, p2

    invoke-direct/range {v2 .. v9}, Lc/a/a/k/a;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;II)V

    new-instance v2, Lc/a/a/i/a;

    iget-object v3, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    iget-object v4, v0, Lc/a/a/i/g;->d:Ljava/lang/Class;

    invoke-direct {v2, v3, v4, v15}, Lc/a/a/i/a;-><init>(Lc/a/a/i/m;Ljava/lang/Class;Lc/a/a/k/a;)V

    iget-object v3, v0, Lc/a/a/i/g;->f:Ljava/util/concurrent/ConcurrentMap;

    invoke-interface {v3, v10, v2}, Ljava/util/concurrent/ConcurrentMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    :goto_3
    if-nez v2, :cond_a

    invoke-virtual {v0, v1, v11, v10}, Lc/a/a/i/g;->i(Lc/a/a/i/b;Ljava/lang/Object;Ljava/lang/String;)V

    return v13

    :cond_a
    const/16 v0, 0x3a

    invoke-virtual {v12, v0}, Lc/a/a/i/e;->u(C)V

    move-object/from16 v0, p4

    move-object/from16 v3, p5

    invoke-virtual {v2, v1, v11, v0, v3}, Lc/a/a/i/q/d;->b(Lc/a/a/i/b;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V

    return v14
.end method

.method private k(Ljava/lang/String;)Lc/a/a/i/q/d;
    .locals 9

    invoke-static {p1}, Lc/a/a/k/d;->x(Ljava/lang/String;)J

    move-result-wide v0

    iget-object v2, p0, Lc/a/a/i/g;->g:[J

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iget-object v2, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v2, v2

    new-array v2, v2, [J

    move v4, v3

    :goto_0
    iget-object v5, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v6, v5

    if-ge v4, v6, :cond_0

    aget-object v5, v5, v4

    iget-object v5, v5, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v5, v5, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-static {v5}, Lc/a/a/k/d;->x(Ljava/lang/String;)J

    move-result-wide v5

    aput-wide v5, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2}, Ljava/util/Arrays;->sort([J)V

    iput-object v2, p0, Lc/a/a/i/g;->g:[J

    :cond_1
    iget-object v2, p0, Lc/a/a/i/g;->g:[J

    invoke-static {v2, v0, v1}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v0

    if-gez v0, :cond_2

    const-string v1, "is"

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc/a/a/k/d;->x(Ljava/lang/String;)J

    move-result-wide v4

    iget-object p1, p0, Lc/a/a/i/g;->g:[J

    invoke-static {p1, v4, v5}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v0

    goto :goto_1

    :cond_2
    move v1, v3

    :cond_3
    :goto_1
    const/4 p1, 0x0

    if-ltz v0, :cond_8

    iget-object v2, p0, Lc/a/a/i/g;->h:[I

    const/4 v4, -0x1

    if-nez v2, :cond_6

    iget-object v2, p0, Lc/a/a/i/g;->g:[J

    array-length v2, v2

    new-array v2, v2, [I

    invoke-static {v2, v4}, Ljava/util/Arrays;->fill([II)V

    :goto_2
    iget-object v5, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v6, v5

    if-ge v3, v6, :cond_5

    iget-object v6, p0, Lc/a/a/i/g;->g:[J

    aget-object v5, v5, v3

    iget-object v5, v5, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v5, v5, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-static {v5}, Lc/a/a/k/d;->x(Ljava/lang/String;)J

    move-result-wide v7

    invoke-static {v6, v7, v8}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v5

    if-ltz v5, :cond_4

    aput v3, v2, v5

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_5
    iput-object v2, p0, Lc/a/a/i/g;->h:[I

    :cond_6
    iget-object v2, p0, Lc/a/a/i/g;->h:[I

    aget v0, v2, v0

    if-eq v0, v4, :cond_8

    iget-object p0, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    aget-object p0, p0, v0

    iget-object v0, p0, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v0, v0, Lc/a/a/k/a;->h:Ljava/lang/Class;

    if-eqz v1, :cond_7

    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-eq v0, v1, :cond_7

    const-class v1, Ljava/lang/Boolean;

    if-eq v0, v1, :cond_7

    goto :goto_3

    :cond_7
    move-object p1, p0

    :cond_8
    :goto_3
    return-object p1
.end method


# virtual methods
.method protected a(Lc/a/a/i/b;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Ljava/lang/Class;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/a/a/i/g;->d:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result v0

    if-eqz v0, :cond_1

    check-cast p2, Ljava/lang/Class;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    iget-object p1, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget p1, p1, Lc/a/a/i/e;->j:I

    sget-object v0, Lc/a/a/i/d;->p:Lc/a/a/i/d;

    iget v0, v0, Lc/a/a/i/d;->u:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    move p1, v2

    :goto_0
    new-instance v0, Lc/a/a/e;

    invoke-direct {v0, p1}, Lc/a/a/e;-><init>(Z)V

    new-array p1, v1, [Ljava/lang/Class;

    aput-object p2, p1, v2

    invoke-static {p0, p1, v0}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    iget-object p2, p0, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object v0, p2, Lc/a/a/i/h;->a:Ljava/lang/reflect/Constructor;

    const/4 v3, 0x0

    if-nez v0, :cond_2

    iget-object v4, p2, Lc/a/a/i/h;->d:Ljava/lang/reflect/Method;

    if-nez v4, :cond_2

    return-object v3

    :cond_2
    iget-object v4, p2, Lc/a/a/i/h;->d:Ljava/lang/reflect/Method;

    if-eqz v4, :cond_3

    iget v5, p2, Lc/a/a/i/h;->b:I

    if-lez v5, :cond_3

    return-object v3

    :cond_3
    :try_start_0
    iget p2, p2, Lc/a/a/i/h;->b:I

    if-nez p2, :cond_5

    if-eqz v0, :cond_4

    new-array p2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_4
    new-array p2, v2, [Ljava/lang/Object;

    invoke-virtual {v4, v3, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_5
    new-array p2, v1, [Ljava/lang/Object;

    iget-object v1, p1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iget-object v1, v1, Lc/a/a/i/l;->a:Ljava/lang/Object;

    aput-object v1, p2, v2

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    :goto_1
    if-eqz p1, :cond_7

    iget-object p1, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget p1, p1, Lc/a/a/i/e;->j:I

    sget-object v0, Lc/a/a/i/d;->n:Lc/a/a/i/d;

    iget v0, v0, Lc/a/a/i/d;->u:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_7

    iget-object p1, p0, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object p1, p1, Lc/a/a/i/h;->e:[Lc/a/a/k/a;

    array-length v0, p1

    :goto_2
    if-ge v2, v0, :cond_7

    aget-object v1, p1, v2

    iget-object v3, v1, Lc/a/a/k/a;->h:Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    if-ne v3, v4, :cond_6

    const-string v3, ""

    invoke-virtual {v1, p2, v3}, Lc/a/a/k/a;->f(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_7
    return-object p2

    :catch_0
    move-exception p1

    new-instance p2, Lc/a/a/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "create instance error, class "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/a/a/i/g;->d:Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lc/a/a/i/g;->d(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public c(Ljava/util/Map;Lc/a/a/i/m;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lc/a/a/i/m;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object v1, v0, Lc/a/a/i/h;->c:Ljava/lang/reflect/Constructor;

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-nez v1, :cond_18

    iget-object v0, p0, Lc/a/a/i/g;->d:Ljava/lang/Class;

    invoke-virtual {p0, v2, v0}, Lc/a/a/i/g;->a(Lc/a/a/i/b;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p0, v4}, Lc/a/a/i/g;->f(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_8

    iget-object v5, v4, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v5, v5, Lc/a/a/k/a;->h:Ljava/lang/Class;

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_1
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_2

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_1

    :cond_2
    sget-object v6, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_3

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    goto :goto_1

    :cond_3
    sget-object v6, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_4

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    goto :goto_1

    :cond_4
    sget-object v6, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_5

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    goto :goto_1

    :cond_5
    sget-object v6, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_6

    const-wide/16 v5, 0x0

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_1

    :cond_6
    sget-object v6, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_7

    const/16 v1, 0x30

    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    goto :goto_1

    :cond_7
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v5, v6, :cond_8

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_8
    :goto_1
    iget-object v5, v4, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v6, v5, Lc/a/a/k/a;->c:Ljava/lang/reflect/Method;

    const/4 v7, 0x1

    if-eqz v6, :cond_9

    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v4

    aget-object v4, v4, v3

    invoke-static {v1, v4, p2}, Lc/a/a/k/d;->e(Ljava/lang/Object;Ljava/lang/reflect/Type;Lc/a/a/i/m;)Ljava/lang/Object;

    move-result-object v1

    new-array v4, v7, [Ljava/lang/Object;

    aput-object v1, v4, v3

    invoke-virtual {v6, v0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_9
    iget-object v6, v5, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    iget-object v5, v5, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v5, v8, :cond_b

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    if-ne v1, v8, :cond_a

    invoke-virtual {v6, v0, v3}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :cond_a
    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne v1, v8, :cond_14

    invoke-virtual {v6, v0, v7}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    goto/16 :goto_0

    :cond_b
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_c

    instance-of v7, v1, Ljava/lang/Number;

    if-eqz v7, :cond_14

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v6, v0, v1}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    goto/16 :goto_0

    :cond_c
    sget-object v7, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_d

    instance-of v7, v1, Ljava/lang/Number;

    if-eqz v7, :cond_14

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    invoke-virtual {v6, v0, v4, v5}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    goto/16 :goto_0

    :cond_d
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const/16 v8, 0xa

    if-ne v5, v7, :cond_10

    instance-of v7, v1, Ljava/lang/Number;

    if-eqz v7, :cond_e

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    :goto_2
    invoke-virtual {v6, v0, v1}, Ljava/lang/reflect/Field;->setFloat(Ljava/lang/Object;F)V

    goto/16 :goto_0

    :cond_e
    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_14

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v4, v8, :cond_f

    invoke-static {v1}, Lc/a/a/k/d;->N(Ljava/lang/String;)F

    move-result v1

    goto :goto_2

    :cond_f
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    goto :goto_2

    :cond_10
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v5, v7, :cond_13

    instance-of v7, v1, Ljava/lang/Number;

    if-eqz v7, :cond_11

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v4

    :goto_3
    invoke-virtual {v6, v0, v4, v5}, Ljava/lang/reflect/Field;->setDouble(Ljava/lang/Object;D)V

    goto/16 :goto_0

    :cond_11
    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_14

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    if-gt v4, v8, :cond_12

    invoke-static {v1}, Lc/a/a/k/d;->M(Ljava/lang/String;)D

    move-result-wide v4

    goto :goto_3

    :cond_12
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v4

    goto :goto_3

    :cond_13
    if-eqz v1, :cond_14

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    if-ne v5, v7, :cond_14

    :goto_4
    invoke-virtual {v6, v0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_14
    iget-object v4, v4, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v4, v4, Lc/a/a/k/a;->o:Ljava/lang/String;

    if-eqz v4, :cond_15

    const-class v7, Ljava/util/Date;

    if-ne v5, v7, :cond_15

    instance-of v7, v1, Ljava/lang/String;

    if-eqz v7, :cond_15

    :try_start_0
    new-instance v5, Ljava/text/SimpleDateFormat;

    invoke-direct {v5, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-object v1, v2

    goto :goto_4

    :cond_15
    instance-of v4, v5, Ljava/lang/reflect/ParameterizedType;

    if-eqz v4, :cond_16

    check-cast v5, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v1, v5, p2}, Lc/a/a/k/d;->d(Ljava/lang/Object;Ljava/lang/reflect/ParameterizedType;Lc/a/a/i/m;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_4

    :cond_16
    invoke-static {v1, v5, p2}, Lc/a/a/k/d;->e(Ljava/lang/Object;Ljava/lang/reflect/Type;Lc/a/a/i/m;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_4

    :cond_17
    return-object v0

    :cond_18
    iget-object p2, v0, Lc/a/a/i/h;->e:[Lc/a/a/k/a;

    array-length v0, p2

    new-array v1, v0, [Ljava/lang/Object;

    :goto_5
    if-ge v3, v0, :cond_1a

    aget-object v4, p2, v3

    iget-object v5, v4, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-interface {p1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_19

    iget-object v4, v4, Lc/a/a/k/a;->h:Ljava/lang/Class;

    invoke-static {v4}, Lc/a/a/k/d;->w(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    :cond_19
    aput-object v5, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_1a
    iget-object p1, p0, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object p1, p1, Lc/a/a/i/h;->c:Ljava/lang/reflect/Constructor;

    if-eqz p1, :cond_1b

    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :catch_1
    move-exception p1

    new-instance p2, Lc/a/a/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "create instance error, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object p0, p0, Lc/a/a/i/h;->c:Ljava/lang/reflect/Constructor;

    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->toGenericString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_1b
    :goto_6
    return-object v2
.end method

.method protected f(Ljava/lang/String;)Lc/a/a/i/q/d;
    .locals 8

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-boolean v1, v1, Lc/a/a/i/h;->h:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v3, v1

    if-ge v2, v3, :cond_2

    aget-object v1, v1, v2

    iget-object v3, v1, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v3, v3, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {v3, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0

    :cond_3
    iget-object v0, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    move v1, v2

    :goto_1
    if-gt v1, v0, :cond_6

    add-int v3, v1, v0

    ushr-int/lit8 v3, v3, 0x1

    iget-object v4, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    aget-object v4, v4, v3

    iget-object v4, v4, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v4, v4, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {v4, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v4

    if-gez v4, :cond_4

    add-int/lit8 v1, v3, 0x1

    goto :goto_1

    :cond_4
    if-lez v4, :cond_5

    add-int/lit8 v3, v3, -0x1

    move v0, v3

    goto :goto_1

    :cond_5
    iget-object p0, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    aget-object p0, p0, v3

    return-object p0

    :cond_6
    iget-object v0, p0, Lc/a/a/i/g;->c:Ljava/util/Map;

    if-eqz v0, :cond_7

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/a/a/i/q/d;

    return-object p0

    :cond_7
    iget-object v0, p0, Lc/a/a/i/g;->g:[J

    if-nez v0, :cond_9

    iget-object v0, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v0, v0

    new-array v0, v0, [J

    move v1, v2

    :goto_2
    iget-object v3, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v4, v3

    if-ge v1, v4, :cond_8

    aget-object v3, v3, v1

    iget-object v3, v3, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v3, v3, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-static {v3}, Lc/a/a/k/d;->x(Ljava/lang/String;)J

    move-result-wide v3

    aput-wide v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    invoke-static {v0}, Ljava/util/Arrays;->sort([J)V

    iput-object v0, p0, Lc/a/a/i/g;->g:[J

    :cond_9
    invoke-static {p1}, Lc/a/a/k/d;->x(Ljava/lang/String;)J

    move-result-wide v0

    iget-object v3, p0, Lc/a/a/i/g;->g:[J

    invoke-static {v3, v0, v1}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v0

    if-ltz v0, :cond_d

    iget-object v1, p0, Lc/a/a/i/g;->h:[I

    const/4 v3, -0x1

    if-nez v1, :cond_c

    iget-object v1, p0, Lc/a/a/i/g;->g:[J

    array-length v1, v1

    new-array v1, v1, [I

    invoke-static {v1, v3}, Ljava/util/Arrays;->fill([II)V

    :goto_3
    iget-object v4, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v5, v4

    if-ge v2, v5, :cond_b

    iget-object v5, p0, Lc/a/a/i/g;->g:[J

    aget-object v4, v4, v2

    iget-object v4, v4, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v4, v4, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-static {v4}, Lc/a/a/k/d;->x(Ljava/lang/String;)J

    move-result-wide v6

    invoke-static {v5, v6, v7}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v4

    if-ltz v4, :cond_a

    aput v2, v1, v4

    :cond_a
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_b
    iput-object v1, p0, Lc/a/a/i/g;->h:[I

    :cond_c
    iget-object v1, p0, Lc/a/a/i/g;->h:[I

    aget v0, v1, v0

    if-eq v0, v3, :cond_d

    iget-object p0, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    aget-object p0, p0, v0

    return-object p0

    :cond_d
    invoke-direct {p0, p1}, Lc/a/a/i/g;->k(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object p0

    return-object p0
.end method

.method protected g(J)Lc/a/a/i/q/d;
    .locals 4

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lc/a/a/i/g;->b:[Lc/a/a/i/q/d;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    iget-object v2, v1, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-wide v2, v2, Lc/a/a/k/a;->p:J

    cmp-long v2, v2, p1

    if-nez v2, :cond_0

    return-object v1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method protected h(Lc/a/a/i/m;Lc/a/a/i/h;Ljava/lang/String;)Lc/a/a/i/g;
    .locals 6

    iget-object p2, p2, Lc/a/a/i/h;->g:Lc/a/a/h/c;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p2}, Lc/a/a/h/c;->seeAlso()[Ljava/lang/Class;

    move-result-object p2

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p2, v2

    invoke-virtual {p1, v3}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v3

    instance-of v4, v3, Lc/a/a/i/g;

    if-eqz v4, :cond_2

    check-cast v3, Lc/a/a/i/g;

    iget-object v4, v3, Lc/a/a/i/g;->e:Lc/a/a/i/h;

    iget-object v5, v4, Lc/a/a/i/h;->j:Ljava/lang/String;

    invoke-virtual {v5, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    return-object v3

    :cond_1
    invoke-virtual {p0, p1, v4, p3}, Lc/a/a/i/g;->h(Lc/a/a/i/m;Lc/a/a/i/h;Ljava/lang/String;)Lc/a/a/i/g;

    move-result-object v3

    if-eqz v3, :cond_2

    return-object v3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method i(Lc/a/a/i/b;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 3

    iget-object v0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v1, v0, Lc/a/a/i/e;->j:I

    sget-object v2, Lc/a/a/i/d;->j:Lc/a/a/i/d;

    iget v2, v2, Lc/a/a/i/d;->u:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_4

    const/16 p0, 0x3a

    invoke-virtual {v0, p0}, Lc/a/a/i/e;->u(C)V

    const/4 p0, 0x0

    iget-object v0, p1, Lc/a/a/i/b;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/a/a/i/q/c;

    invoke-interface {p0, p2, p3}, Lc/a/a/i/q/c;->a(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Type;

    move-result-object p0

    goto :goto_0

    :cond_0
    if-nez p0, :cond_1

    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_1
    invoke-virtual {p1, p0}, Lc/a/a/i/b;->r(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    :goto_1
    instance-of v0, p2, Lc/a/a/i/q/a;

    if-eqz v0, :cond_2

    check-cast p2, Lc/a/a/i/q/a;

    invoke-interface {p2, p3, p0}, Lc/a/a/i/q/a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_2
    iget-object p1, p1, Lc/a/a/i/b;->m:Ljava/util/List;

    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/i/q/b;

    invoke-interface {v0, p2, p3, p0}, Lc/a/a/i/q/b;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    return-void

    :cond_4
    new-instance p1, Lc/a/a/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "setter not found, class "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/a/a/i/g;->d:Ljava/lang/Class;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", property "

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method
