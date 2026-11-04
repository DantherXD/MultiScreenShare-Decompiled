.class Lc/a/a/i/j;
.super Lc/a/a/i/q/d;
.source ""


# instance fields
.field private final e:Ljava/lang/reflect/Type;

.field private f:Lc/a/a/i/q/f;

.field private final g:Z


# direct methods
.method public constructor <init>(Lc/a/a/i/m;Ljava/lang/Class;Lc/a/a/k/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/i/m;",
            "Ljava/lang/Class<",
            "*>;",
            "Lc/a/a/k/a;",
            ")V"
        }
    .end annotation

    const/16 p1, 0xe

    invoke-direct {p0, p2, p3, p1}, Lc/a/a/i/q/d;-><init>(Ljava/lang/Class;Lc/a/a/k/a;I)V

    iget-object p1, p3, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    iget-object p2, p3, Lc/a/a/k/a;->h:Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->isArray()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/i/j;->e:Ljava/lang/reflect/Type;

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lc/a/a/k/d;->B(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/i/j;->e:Ljava/lang/reflect/Type;

    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lc/a/a/i/j;->g:Z

    return-void
.end method


# virtual methods
.method public b(Lc/a/a/i/b;Ljava/lang/Object;Ljava/lang/reflect/Type;Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/i/b;",
            "Ljava/lang/Object;",
            "Ljava/lang/reflect/Type;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v0}, Lc/a/a/i/e;->e0()I

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-eq v1, v3, :cond_4

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    invoke-virtual {v0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-boolean v0, p0, Lc/a/a/i/j;->g:Z

    if-eqz v0, :cond_1

    new-instance v2, Lc/a/a/b;

    invoke-direct {v2}, Lc/a/a/b;-><init>()V

    iget-object v0, p0, Lc/a/a/i/j;->e:Ljava/lang/reflect/Type;

    invoke-virtual {v2, v0}, Lc/a/a/b;->p(Ljava/lang/reflect/Type;)V

    move-object v0, v2

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v4, v2

    move-object v2, v0

    move-object v0, v4

    :goto_0
    iget-object v1, p1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iget-object v3, p0, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v3, v3, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {p1, v1, p2, v3}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;

    invoke-virtual {p0, p1, p3, v2}, Lc/a/a/i/j;->h(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/util/Collection;)V

    invoke-virtual {p1, v1}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    iget-boolean p1, p0, Lc/a/a/i/j;->g:Z

    if-eqz p1, :cond_2

    iget-object p1, p0, Lc/a/a/i/j;->e:Ljava/lang/reflect/Type;

    check-cast p1, Ljava/lang/Class;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p3

    invoke-static {p1, p3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/Object;

    invoke-interface {v2, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lc/a/a/b;->q(Ljava/lang/Object;)V

    :cond_2
    if-nez p2, :cond_3

    iget-object p0, p0, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object p0, p0, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-interface {p4, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-virtual {p0, p2, v2}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    return-void

    :cond_4
    :goto_2
    invoke-virtual {p0, p2, v2}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object p0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->s()V

    return-void
.end method

.method final h(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/util/Collection;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    iget-object v4, v0, Lc/a/a/i/j;->e:Ljava/lang/reflect/Type;

    iget-object v5, v0, Lc/a/a/i/j;->f:Lc/a/a/i/q/f;

    instance-of v6, v2, Ljava/lang/reflect/ParameterizedType;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v6, :cond_7

    instance-of v6, v4, Ljava/lang/reflect/TypeVariable;

    const/4 v9, 0x0

    const/4 v10, -0x1

    if-eqz v6, :cond_3

    move-object v6, v4

    check-cast v6, Ljava/lang/reflect/TypeVariable;

    move-object v11, v2

    check-cast v11, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v11}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v12

    instance-of v12, v12, Ljava/lang/Class;

    if-eqz v12, :cond_0

    invoke-interface {v11}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v9

    check-cast v9, Ljava/lang/Class;

    :cond_0
    if-eqz v9, :cond_2

    invoke-virtual {v9}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v12

    array-length v12, v12

    move v13, v7

    :goto_0
    if-ge v13, v12, :cond_2

    invoke-virtual {v9}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v14

    aget-object v14, v14, v13

    invoke-interface {v14}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-interface {v6}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_2
    move v13, v10

    :goto_1
    if-eq v13, v10, :cond_9

    invoke-interface {v11}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v4

    aget-object v4, v4, v13

    iget-object v6, v0, Lc/a/a/i/j;->e:Ljava/lang/reflect/Type;

    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    iget-object v5, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v5, v4}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v5

    goto/16 :goto_5

    :cond_3
    instance-of v6, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v6, :cond_9

    move-object v6, v4

    check-cast v6, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v6}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v11

    array-length v12, v11

    if-ne v12, v8, :cond_9

    aget-object v12, v11, v7

    instance-of v12, v12, Ljava/lang/reflect/TypeVariable;

    if-eqz v12, :cond_9

    aget-object v12, v11, v7

    check-cast v12, Ljava/lang/reflect/TypeVariable;

    move-object v13, v2

    check-cast v13, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v13}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v14

    instance-of v14, v14, Ljava/lang/Class;

    if-eqz v14, :cond_4

    invoke-interface {v13}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v9

    check-cast v9, Ljava/lang/Class;

    :cond_4
    if-eqz v9, :cond_6

    invoke-virtual {v9}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v14

    array-length v14, v14

    move v15, v7

    :goto_2
    if-ge v15, v14, :cond_6

    invoke-virtual {v9}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v16

    aget-object v16, v16, v15

    invoke-interface/range {v16 .. v16}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v12}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v15, v15, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    goto :goto_2

    :cond_6
    move v15, v10

    :goto_3
    if-eq v15, v10, :cond_9

    invoke-interface {v13}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v4

    aget-object v4, v4, v15

    const/4 v7, 0x0

    aput-object v4, v11, v7

    new-instance v4, Lc/a/a/k/c;

    invoke-interface {v6}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-interface {v6}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v6

    invoke-direct {v4, v11, v7, v6}, Lc/a/a/k/c;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    goto :goto_5

    :cond_7
    instance-of v6, v4, Ljava/lang/reflect/TypeVariable;

    if-eqz v6, :cond_9

    instance-of v6, v2, Ljava/lang/Class;

    if-eqz v6, :cond_9

    move-object v6, v2

    check-cast v6, Ljava/lang/Class;

    move-object v7, v4

    check-cast v7, Ljava/lang/reflect/TypeVariable;

    invoke-virtual {v6}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    invoke-virtual {v6}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v8

    array-length v8, v8

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v8, :cond_9

    invoke-virtual {v6}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v10

    aget-object v10, v10, v9

    invoke-interface {v10}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v7}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v10}, Ljava/lang/reflect/TypeVariable;->getBounds()[Ljava/lang/reflect/Type;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x1

    if-ne v7, v8, :cond_9

    const/4 v7, 0x0

    aget-object v4, v6, v7

    goto :goto_5

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_9
    :goto_5
    iget-object v6, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    if-nez v5, :cond_a

    iget-object v5, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v5, v4}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v5

    iput-object v5, v0, Lc/a/a/i/j;->f:Lc/a/a/i/q/f;

    :cond_a
    iget v0, v6, Lc/a/a/i/e;->h:I

    const/16 v7, 0xc

    const/16 v8, 0xe

    if-eq v0, v8, :cond_d

    if-ne v0, v7, :cond_b

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v5, v1, v4, v0}, Lc/a/a/i/q/f;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "exepct \'[\', but "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v6, Lc/a/a/i/e;->h:I

    invoke-static {v1}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    if-eqz v2, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", type : "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_c
    new-instance v1, Lc/a/a/d;

    invoke-direct {v1, v0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    const/4 v0, 0x0

    iget-char v2, v6, Lc/a/a/i/e;->k:C

    const/16 v9, 0xf

    const/16 v10, 0x22

    const/16 v11, 0x7b

    const/16 v12, 0x5b

    const/16 v13, 0x1a

    if-ne v2, v12, :cond_f

    iget v2, v6, Lc/a/a/i/e;->l:I

    const/4 v14, 0x1

    add-int/2addr v2, v14

    iput v2, v6, Lc/a/a/i/e;->l:I

    iget v14, v6, Lc/a/a/i/e;->y:I

    if-lt v2, v14, :cond_e

    move v2, v13

    goto :goto_6

    :cond_e
    iget-object v14, v6, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v14, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    :goto_6
    iput-char v2, v6, Lc/a/a/i/e;->k:C

    iput v8, v6, Lc/a/a/i/e;->h:I

    goto :goto_9

    :cond_f
    if-ne v2, v11, :cond_11

    iget v2, v6, Lc/a/a/i/e;->l:I

    const/4 v14, 0x1

    add-int/2addr v2, v14

    iput v2, v6, Lc/a/a/i/e;->l:I

    iget v14, v6, Lc/a/a/i/e;->y:I

    if-lt v2, v14, :cond_10

    move v2, v13

    goto :goto_7

    :cond_10
    iget-object v14, v6, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v14, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    :goto_7
    iput-char v2, v6, Lc/a/a/i/e;->k:C

    iput v7, v6, Lc/a/a/i/e;->h:I

    goto :goto_9

    :cond_11
    if-ne v2, v10, :cond_12

    invoke-virtual {v6}, Lc/a/a/i/e;->R()V

    goto :goto_9

    :cond_12
    const/16 v14, 0x5d

    if-ne v2, v14, :cond_14

    iget v2, v6, Lc/a/a/i/e;->l:I

    const/4 v14, 0x1

    add-int/2addr v2, v14

    iput v2, v6, Lc/a/a/i/e;->l:I

    iget v14, v6, Lc/a/a/i/e;->y:I

    if-lt v2, v14, :cond_13

    move v2, v13

    goto :goto_8

    :cond_13
    iget-object v14, v6, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v14, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    :goto_8
    iput-char v2, v6, Lc/a/a/i/e;->k:C

    iput v9, v6, Lc/a/a/i/e;->h:I

    :goto_9
    iget v2, v6, Lc/a/a/i/e;->h:I

    const/16 v14, 0x10

    if-ne v2, v14, :cond_15

    :cond_14
    invoke-virtual {v6}, Lc/a/a/i/e;->s()V

    goto :goto_9

    :cond_15
    if-ne v2, v9, :cond_18

    iget-char v0, v6, Lc/a/a/i/e;->k:C

    const/16 v1, 0x2c

    if-ne v0, v1, :cond_17

    iget v0, v6, Lc/a/a/i/e;->l:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, v6, Lc/a/a/i/e;->l:I

    iget v1, v6, Lc/a/a/i/e;->y:I

    if-lt v0, v1, :cond_16

    goto :goto_a

    :cond_16
    iget-object v1, v6, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v13

    :goto_a
    iput-char v13, v6, Lc/a/a/i/e;->k:C

    iput v14, v6, Lc/a/a/i/e;->h:I

    goto :goto_b

    :cond_17
    invoke-virtual {v6}, Lc/a/a/i/e;->s()V

    :goto_b
    return-void

    :cond_18
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v5, v1, v4, v2}, Lc/a/a/i/q/f;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget v2, v1, Lc/a/a/i/b;->k:I

    const/4 v15, 0x1

    if-ne v2, v15, :cond_19

    invoke-virtual {v1, v3}, Lc/a/a/i/b;->c(Ljava/util/Collection;)V

    :cond_19
    iget v2, v6, Lc/a/a/i/e;->h:I

    if-ne v2, v14, :cond_1f

    iget-char v2, v6, Lc/a/a/i/e;->k:C

    if-ne v2, v12, :cond_1b

    iget v2, v6, Lc/a/a/i/e;->l:I

    add-int/2addr v2, v15

    iput v2, v6, Lc/a/a/i/e;->l:I

    iget v14, v6, Lc/a/a/i/e;->y:I

    if-lt v2, v14, :cond_1a

    move v2, v13

    goto :goto_c

    :cond_1a
    iget-object v14, v6, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v14, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    :goto_c
    iput-char v2, v6, Lc/a/a/i/e;->k:C

    iput v8, v6, Lc/a/a/i/e;->h:I

    const/4 v14, 0x1

    goto :goto_e

    :cond_1b
    if-ne v2, v11, :cond_1d

    iget v2, v6, Lc/a/a/i/e;->l:I

    const/4 v14, 0x1

    add-int/2addr v2, v14

    iput v2, v6, Lc/a/a/i/e;->l:I

    iget v15, v6, Lc/a/a/i/e;->y:I

    if-lt v2, v15, :cond_1c

    move v2, v13

    goto :goto_d

    :cond_1c
    iget-object v15, v6, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v15, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    :goto_d
    iput-char v2, v6, Lc/a/a/i/e;->k:C

    iput v7, v6, Lc/a/a/i/e;->h:I

    goto :goto_e

    :cond_1d
    const/4 v14, 0x1

    if-ne v2, v10, :cond_1e

    invoke-virtual {v6}, Lc/a/a/i/e;->R()V

    goto :goto_e

    :cond_1e
    invoke-virtual {v6}, Lc/a/a/i/e;->s()V

    goto :goto_e

    :cond_1f
    move v14, v15

    :goto_e
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_9
.end method
