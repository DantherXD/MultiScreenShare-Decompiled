.class public final Lc/a/a/j/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    iget-object v3, v1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    iget v4, v3, Lc/a/a/j/z;->n:I

    sget-object v5, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v5, v5, Lc/a/a/j/a0;->z:I

    and-int/2addr v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    const/4 v7, 0x0

    if-eqz v4, :cond_1

    invoke-static/range {p4 .. p4}, Lc/a/a/k/d;->B(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v7

    :cond_1
    const-string v8, "[]"

    if-nez v0, :cond_3

    iget v0, v3, Lc/a/a/j/z;->n:I

    sget-object v1, Lc/a/a/j/a0;->g:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {v3, v8}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lc/a/a/j/z;->o()V

    :goto_1
    return-void

    :cond_3
    move-object v9, v0

    check-cast v9, Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    if-nez v10, :cond_4

    invoke-virtual {v3, v8}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    return-void

    :cond_4
    iget-object v8, v1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    iget v11, v3, Lc/a/a/j/z;->n:I

    sget-object v12, Lc/a/a/j/a0;->p:Lc/a/a/j/a0;

    iget v12, v12, Lc/a/a/j/a0;->z:I

    and-int/2addr v11, v12

    if-nez v11, :cond_6

    new-instance v11, Lc/a/a/j/w;

    invoke-direct {v11, v8, v0, v2, v5}, Lc/a/a/j/w;-><init>(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v11, v1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    iget-object v11, v1, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    if-nez v11, :cond_5

    new-instance v11, Ljava/util/IdentityHashMap;

    invoke-direct {v11}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v11, v1, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    :cond_5
    iget-object v11, v1, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    iget-object v12, v1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    invoke-virtual {v11, v0, v12}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :try_start_0
    iget v11, v3, Lc/a/a/j/z;->n:I

    sget-object v12, Lc/a/a/j/a0;->n:Lc/a/a/j/a0;

    iget v12, v12, Lc/a/a/j/a0;->z:I

    and-int/2addr v11, v12

    const/16 v12, 0x2c

    const/16 v13, 0x5d

    const/16 v14, 0x5b

    if-eqz v11, :cond_b

    invoke-virtual {v3, v14}, Lc/a/a/j/z;->write(I)V

    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->l()V

    move v4, v5

    :goto_2
    if-ge v4, v10, :cond_a

    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-eqz v4, :cond_7

    invoke-virtual {v3, v12}, Lc/a/a/j/z;->write(I)V

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->m()V

    if-eqz v6, :cond_9

    iget-object v11, v1, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    if-eqz v11, :cond_8

    invoke-virtual {v11, v6}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual {v1, v6}, Lc/a/a/j/m;->t(Ljava/lang/Object;)V

    goto :goto_3

    :cond_8
    iget-object v11, v1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v11, v14}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v11

    new-instance v14, Lc/a/a/j/w;

    invoke-direct {v14, v8, v0, v2, v5}, Lc/a/a/j/w;-><init>(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v14, v1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v11, v1, v6, v14, v7}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_3

    :cond_9
    iget-object v6, v1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    invoke-virtual {v6}, Lc/a/a/j/z;->o()V

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_a
    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->d()V

    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->m()V

    invoke-virtual {v3, v13}, Lc/a/a/j/z;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v8, v1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    return-void

    :cond_b
    :try_start_1
    iget v10, v3, Lc/a/a/j/z;->m:I

    add-int/2addr v10, v6

    iget-object v11, v3, Lc/a/a/j/z;->l:[C

    array-length v11, v11

    if-le v10, v11, :cond_d

    iget-object v11, v3, Lc/a/a/j/z;->o:Ljava/io/Writer;

    if-nez v11, :cond_c

    invoke-virtual {v3, v10}, Lc/a/a/j/z;->e(I)V

    goto :goto_4

    :cond_c
    invoke-virtual {v3}, Lc/a/a/j/z;->flush()V

    move v10, v6

    :cond_d
    :goto_4
    iget-object v11, v3, Lc/a/a/j/z;->l:[C

    iget v15, v3, Lc/a/a/j/z;->m:I

    aput-char v14, v11, v15

    iput v10, v3, Lc/a/a/j/z;->m:I

    move v10, v5

    :goto_5
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v11

    if-ge v10, v11, :cond_19

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    if-eqz v10, :cond_10

    iget v14, v3, Lc/a/a/j/z;->m:I

    add-int/2addr v14, v6

    iget-object v15, v3, Lc/a/a/j/z;->l:[C

    array-length v15, v15

    if-le v14, v15, :cond_f

    iget-object v15, v3, Lc/a/a/j/z;->o:Ljava/io/Writer;

    if-nez v15, :cond_e

    invoke-virtual {v3, v14}, Lc/a/a/j/z;->e(I)V

    goto :goto_6

    :cond_e
    invoke-virtual {v3}, Lc/a/a/j/z;->flush()V

    move v14, v6

    :cond_f
    :goto_6
    iget-object v15, v3, Lc/a/a/j/z;->l:[C

    iget v13, v3, Lc/a/a/j/z;->m:I

    aput-char v12, v15, v13

    iput v14, v3, Lc/a/a/j/z;->m:I

    :cond_10
    if-nez v11, :cond_11

    const-string v11, "null"

    invoke-virtual {v3, v11}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    goto/16 :goto_7

    :cond_11
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    const-class v14, Ljava/lang/Integer;

    if-ne v13, v14, :cond_12

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    invoke-virtual {v3, v11}, Lc/a/a/j/z;->k(I)V

    goto :goto_7

    :cond_12
    const-class v14, Ljava/lang/Long;

    if-ne v13, v14, :cond_14

    check-cast v11, Ljava/lang/Long;

    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    move-result-wide v13

    if-eqz v4, :cond_13

    invoke-virtual {v3, v13, v14}, Lc/a/a/j/z;->n(J)V

    const/16 v11, 0x4c

    invoke-virtual {v3, v11}, Lc/a/a/j/z;->write(I)V

    goto :goto_7

    :cond_13
    invoke-virtual {v3, v13, v14}, Lc/a/a/j/z;->n(J)V

    goto :goto_7

    :cond_14
    const-class v14, Ljava/lang/String;

    if-ne v13, v14, :cond_16

    check-cast v11, Ljava/lang/String;

    iget v13, v3, Lc/a/a/j/z;->n:I

    sget-object v14, Lc/a/a/j/a0;->c:Lc/a/a/j/a0;

    iget v14, v14, Lc/a/a/j/a0;->z:I

    and-int/2addr v13, v14

    if-eqz v13, :cond_15

    invoke-virtual {v3, v11}, Lc/a/a/j/z;->r(Ljava/lang/String;)V

    goto :goto_7

    :cond_15
    invoke-virtual {v3, v11, v5, v6}, Lc/a/a/j/z;->q(Ljava/lang/String;CZ)V

    goto :goto_7

    :cond_16
    iget v13, v3, Lc/a/a/j/z;->n:I

    sget-object v14, Lc/a/a/j/a0;->p:Lc/a/a/j/a0;

    iget v14, v14, Lc/a/a/j/a0;->z:I

    and-int/2addr v13, v14

    if-nez v13, :cond_17

    new-instance v13, Lc/a/a/j/w;

    invoke-direct {v13, v8, v0, v2, v5}, Lc/a/a/j/w;-><init>(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v13, v1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    :cond_17
    iget-object v13, v1, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    if-eqz v13, :cond_18

    invoke-virtual {v13, v11}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_18

    invoke-virtual {v1, v11}, Lc/a/a/j/m;->t(Ljava/lang/Object;)V

    goto :goto_7

    :cond_18
    iget-object v13, v1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v13, v14}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v13

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v13, v1, v11, v14, v7}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    :goto_7
    add-int/lit8 v10, v10, 0x1

    const/16 v13, 0x5d

    goto/16 :goto_5

    :cond_19
    iget v0, v3, Lc/a/a/j/z;->m:I

    add-int/2addr v0, v6

    iget-object v2, v3, Lc/a/a/j/z;->l:[C

    array-length v2, v2

    if-le v0, v2, :cond_1b

    iget-object v2, v3, Lc/a/a/j/z;->o:Ljava/io/Writer;

    if-nez v2, :cond_1a

    invoke-virtual {v3, v0}, Lc/a/a/j/z;->e(I)V

    goto :goto_8

    :cond_1a
    invoke-virtual {v3}, Lc/a/a/j/z;->flush()V

    goto :goto_9

    :cond_1b
    :goto_8
    move v6, v0

    :goto_9
    iget-object v0, v3, Lc/a/a/j/z;->l:[C

    iget v2, v3, Lc/a/a/j/z;->m:I

    const/16 v4, 0x5d

    aput-char v4, v0, v2

    iput v6, v3, Lc/a/a/j/z;->m:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v8, v1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    return-void

    :catchall_0
    move-exception v0

    iput-object v8, v1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    throw v0
.end method
