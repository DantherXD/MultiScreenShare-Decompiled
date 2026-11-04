.class public Lc/a/a/i/p;
.super Lc/a/a/i/g;
.source ""


# direct methods
.method public constructor <init>(Lc/a/a/i/m;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/i/m;",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p2}, Lc/a/a/i/g;-><init>(Lc/a/a/i/m;Ljava/lang/Class;Ljava/lang/reflect/Type;)V

    return-void
.end method


# virtual methods
.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18
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

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-class v3, Ljava/lang/String;

    iget-object v4, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v5, v4, Lc/a/a/i/e;->h:I

    const/16 v6, 0x8

    const/4 v7, 0x0

    if-ne v5, v6, :cond_0

    invoke-virtual {v4}, Lc/a/a/i/e;->s()V

    return-object v7

    :cond_0
    iget v8, v1, Lc/a/a/i/b;->k:I

    const-string v9, "syntax error"

    const/4 v10, 0x2

    const/4 v11, 0x0

    if-ne v8, v10, :cond_1

    iput v11, v1, Lc/a/a/i/b;->k:I

    goto :goto_0

    :cond_1
    const/16 v8, 0xc

    if-ne v5, v8, :cond_1c

    :goto_0
    if-eqz v2, :cond_2

    instance-of v5, v2, Ljava/lang/Class;

    if-eqz v5, :cond_2

    check-cast v2, Ljava/lang/Class;

    const-class v5, Ljava/lang/Throwable;

    invoke-virtual {v5, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    move-object v2, v7

    :goto_1
    move-object v5, v7

    move-object v8, v5

    move-object v12, v8

    move-object v13, v12

    :goto_2
    iget-object v14, v1, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    invoke-virtual {v4, v14}, Lc/a/a/i/e;->T(Lc/a/a/i/o;)Ljava/lang/String;

    move-result-object v14

    const/16 v15, 0xd

    const/16 v10, 0x10

    if-nez v14, :cond_4

    iget v7, v4, Lc/a/a/i/e;->h:I

    if-ne v7, v15, :cond_3

    invoke-virtual {v4, v10}, Lc/a/a/i/e;->t(I)V

    const/4 v15, 0x0

    goto/16 :goto_7

    :cond_3
    if-ne v7, v10, :cond_4

    const/4 v7, 0x0

    :goto_3
    const/4 v10, 0x2

    goto :goto_2

    :cond_4
    const/16 v7, 0x3a

    invoke-virtual {v4, v7}, Lc/a/a/i/e;->u(C)V

    const-string v7, "@type"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v15, 0x4

    if-eqz v7, :cond_6

    iget v2, v4, Lc/a/a/i/e;->h:I

    if-ne v2, v15, :cond_5

    invoke-virtual {v4}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v2

    iget-object v7, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    iget-object v7, v7, Lc/a/a/i/m;->e:Ljava/lang/ClassLoader;

    invoke-static {v2, v7, v11}, Lc/a/a/k/d;->L(Ljava/lang/String;Ljava/lang/ClassLoader;Z)Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v4, v10}, Lc/a/a/i/e;->t(I)V

    :goto_4
    const/4 v15, 0x0

    goto :goto_6

    :cond_5
    new-instance v0, Lc/a/a/d;

    invoke-direct {v0, v9}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    const-string v7, "message"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    iget v7, v4, Lc/a/a/i/e;->h:I

    if-ne v7, v6, :cond_7

    const/4 v12, 0x0

    goto :goto_5

    :cond_7
    if-ne v7, v15, :cond_8

    invoke-virtual {v4}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v7

    move-object v12, v7

    :goto_5
    invoke-virtual {v4}, Lc/a/a/i/e;->s()V

    goto :goto_4

    :cond_8
    new-instance v0, Lc/a/a/d;

    invoke-direct {v0, v9}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    const-string v7, "cause"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    const/4 v15, 0x0

    invoke-virtual {v0, v1, v15, v7}, Lc/a/a/i/p;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/Throwable;

    goto :goto_6

    :cond_a
    const/4 v15, 0x0

    const-string v7, "stackTrace"

    invoke-virtual {v7, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_b

    const-class v7, [Ljava/lang/StackTraceElement;

    invoke-virtual {v1, v7}, Lc/a/a/i/b;->q(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    move-object v13, v7

    check-cast v13, [Ljava/lang/StackTraceElement;

    goto :goto_6

    :cond_b
    if-nez v5, :cond_c

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_c
    invoke-virtual/range {p1 .. p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5, v14, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_6
    iget v7, v4, Lc/a/a/i/e;->h:I

    const/16 v14, 0xd

    if-ne v7, v14, :cond_1b

    invoke-virtual {v4, v10}, Lc/a/a/i/e;->t(I)V

    :goto_7
    if-nez v2, :cond_d

    new-instance v3, Ljava/lang/Exception;

    invoke-direct {v3, v12, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_c

    :cond_d
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v4

    array-length v6, v4

    move v7, v11

    move-object v9, v15

    move-object v10, v9

    move-object v14, v10

    :goto_8
    const/4 v15, 0x1

    if-ge v7, v6, :cond_11

    aget-object v16, v4, v7

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    array-length v11, v11

    if-nez v11, :cond_e

    move-object/from16 v14, v16

    goto :goto_9

    :cond_e
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    array-length v11, v11

    if-ne v11, v15, :cond_f

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    const/16 v17, 0x0

    aget-object v11, v11, v17

    if-ne v11, v3, :cond_f

    move-object/from16 v10, v16

    goto :goto_9

    :cond_f
    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    array-length v11, v11

    const/4 v15, 0x2

    if-ne v11, v15, :cond_10

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    const/4 v15, 0x0

    aget-object v11, v11, v15

    if-ne v11, v3, :cond_10

    invoke-virtual/range {v16 .. v16}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v11

    const/4 v15, 0x1

    aget-object v11, v11, v15

    const-class v15, Ljava/lang/Throwable;

    if-ne v11, v15, :cond_10

    move-object/from16 v9, v16

    :cond_10
    :goto_9
    add-int/lit8 v7, v7, 0x1

    const/4 v11, 0x0

    goto :goto_8

    :cond_11
    if-eqz v9, :cond_12

    const/4 v7, 0x2

    new-array v3, v7, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v12, v3, v4

    const/4 v4, 0x1

    aput-object v8, v3, v4

    invoke-virtual {v9, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    :goto_a
    check-cast v3, Ljava/lang/Throwable;

    goto :goto_b

    :cond_12
    if-eqz v10, :cond_13

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v12, v3, v4

    invoke-virtual {v10, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_a

    :cond_13
    if-eqz v14, :cond_14

    const/4 v10, 0x0

    new-array v3, v10, [Ljava/lang/Object;

    invoke-virtual {v14, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_a

    :cond_14
    const/4 v3, 0x0

    :goto_b
    if-nez v3, :cond_15

    new-instance v3, Ljava/lang/Exception;

    invoke-direct {v3, v12, v8}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_15
    :goto_c
    if-eqz v13, :cond_16

    invoke-virtual {v3, v13}, Ljava/lang/Throwable;->setStackTrace([Ljava/lang/StackTraceElement;)V

    :cond_16
    if-eqz v5, :cond_1a

    if-eqz v2, :cond_18

    iget-object v4, v0, Lc/a/a/i/g;->d:Ljava/lang/Class;

    if-ne v2, v4, :cond_17

    goto :goto_d

    :cond_17
    iget-object v0, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v0, v2}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v0

    instance-of v1, v0, Lc/a/a/i/g;

    if-eqz v1, :cond_18

    check-cast v0, Lc/a/a/i/g;

    goto :goto_d

    :cond_18
    const/4 v0, 0x0

    :goto_d
    if-eqz v0, :cond_1a

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_19
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v4}, Lc/a/a/i/g;->f(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object v4

    if-eqz v4, :cond_19

    invoke-virtual {v4, v3, v2}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_e

    :cond_1a
    return-object v3

    :catch_0
    move-exception v0

    new-instance v1, Lc/a/a/d;

    const-string v2, "create instance error"

    invoke-direct {v1, v2, v0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1b
    move-object v7, v15

    goto/16 :goto_3

    :cond_1c
    new-instance v0, Lc/a/a/d;

    invoke-direct {v0, v9}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method
