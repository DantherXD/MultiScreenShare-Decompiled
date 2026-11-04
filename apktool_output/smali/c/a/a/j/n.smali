.class public Lc/a/a/j/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;


# static fields
.field private static final a:[C

.field private static final b:[C


# instance fields
.field private final c:[Lc/a/a/j/j;

.field private final d:[Lc/a/a/j/j;

.field protected e:I

.field protected final f:Ljava/lang/String;

.field protected final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lc/a/a/j/n;->a:[C

    const/4 v0, 0x5

    new-array v0, v0, [C

    fill-array-data v0, :array_1

    sput-object v0, Lc/a/a/j/n;->b:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x74s
        0x72s
        0x75s
        0x65s
    .end array-data

    :array_1
    .array-data 2
        0x66s
        0x61s
        0x6cs
        0x73s
        0x65s
    .end array-data
.end method

.method public constructor <init>(Ljava/lang/Class;ILjava/util/Map;ZZZZLc/a/a/g;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;ZZZZ",
            "Lc/a/a/g;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Lc/a/a/j/n;->e:I

    const/4 v2, 0x0

    if-eqz p5, :cond_0

    const-class v3, Lc/a/a/h/c;

    move-object/from16 v13, p1

    invoke-virtual {v13, v3}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lc/a/a/h/c;

    goto :goto_0

    :cond_0
    move-object/from16 v13, p1

    move-object v3, v2

    :goto_0
    if-eqz v3, :cond_9

    invoke-interface {v3}, Lc/a/a/h/c;->serialzeFeatures()[Lc/a/a/j/a0;

    move-result-object v4

    invoke-static {v4}, Lc/a/a/j/a0;->a([Lc/a/a/j/a0;)I

    move-result v4

    iput v4, v0, Lc/a/a/j/n;->e:I

    invoke-interface {v3}, Lc/a/a/h/c;->typeName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_1

    move-object v4, v2

    move-object v6, v4

    goto :goto_5

    :cond_1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v5

    move-object v6, v2

    :goto_1
    if-eqz v5, :cond_4

    const-class v7, Ljava/lang/Object;

    if-eq v5, v7, :cond_4

    const-class v7, Lc/a/a/h/c;

    invoke-virtual {v5, v7}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v7

    check-cast v7, Lc/a/a/h/c;

    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {v7}, Lc/a/a/h/c;->typeKey()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v5

    goto :goto_1

    :cond_4
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    move-result-object v5

    array-length v7, v5

    move v8, v1

    :goto_3
    if-ge v8, v7, :cond_6

    aget-object v9, v5, v8

    const-class v10, Lc/a/a/h/c;

    invoke-virtual {v9, v10}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v9

    check-cast v9, Lc/a/a/h/c;

    if-eqz v9, :cond_5

    invoke-interface {v9}, Lc/a/a/h/c;->typeKey()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_4

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    if-eqz v6, :cond_7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_7

    move-object v6, v2

    :cond_7
    :goto_5
    if-nez p8, :cond_8

    invoke-interface {v3}, Lc/a/a/h/c;->naming()Lc/a/a/g;

    move-result-object v5

    sget-object v7, Lc/a/a/g;->b:Lc/a/a/g;

    if-eq v5, v7, :cond_8

    move-object v14, v5

    goto :goto_6

    :cond_8
    move-object/from16 v14, p8

    goto :goto_6

    :cond_9
    move-object/from16 v14, p8

    move-object v4, v2

    move-object v6, v4

    :goto_6
    iput-object v4, v0, Lc/a/a/j/n;->f:Ljava/lang/String;

    iput-object v6, v0, Lc/a/a/j/n;->g:Ljava/lang/String;

    const/4 v9, 0x0

    move-object/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p4

    move-object v7, v3

    move-object/from16 v8, p3

    move/from16 v10, p6

    move/from16 v11, p7

    move-object v12, v14

    invoke-static/range {v4 .. v12}, Lc/a/a/k/d;->u(Ljava/lang/Class;IZLc/a/a/h/c;Ljava/util/Map;ZZZLc/a/a/g;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lc/a/a/k/a;

    new-instance v7, Lc/a/a/j/j;

    invoke-direct {v7, v6}, Lc/a/a/j/j;-><init>(Lc/a/a/k/a;)V

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_a
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [Lc/a/a/j/j;

    invoke-interface {v5, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Lc/a/a/j/j;

    iput-object v4, v0, Lc/a/a/j/n;->c:[Lc/a/a/j/j;

    if-eqz v3, :cond_b

    invoke-interface {v3}, Lc/a/a/h/c;->orders()[Ljava/lang/String;

    move-result-object v2

    :cond_b
    if-eqz v2, :cond_d

    array-length v2, v2

    if-eqz v2, :cond_d

    const/4 v9, 0x1

    move-object/from16 v4, p1

    move/from16 v5, p2

    move/from16 v6, p4

    move-object v7, v3

    move-object/from16 v8, p3

    move/from16 v10, p6

    move/from16 v11, p7

    move-object v12, v14

    invoke-static/range {v4 .. v12}, Lc/a/a/k/d;->u(Ljava/lang/Class;IZLc/a/a/h/c;Ljava/util/Map;ZZZLc/a/a/g;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/k/a;

    new-instance v4, Lc/a/a/j/j;

    invoke-direct {v4, v3}, Lc/a/a/j/j;-><init>(Lc/a/a/k/a;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_c
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lc/a/a/j/j;

    invoke-interface {v2, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lc/a/a/j/j;

    iput-object v1, v0, Lc/a/a/j/n;->d:[Lc/a/a/j/j;

    goto :goto_9

    :cond_d
    array-length v2, v4

    new-array v2, v2, [Lc/a/a/j/j;

    array-length v3, v4

    invoke-static {v4, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    invoke-static {v2, v4}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_e

    iput-object v4, v0, Lc/a/a/j/n;->d:[Lc/a/a/j/j;

    goto :goto_9

    :cond_e
    iput-object v2, v0, Lc/a/a/j/n;->d:[Lc/a/a/j/j;

    :goto_9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lc/a/a/g;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lc/a/a/g;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lc/a/a/j/n;-><init>(Ljava/lang/Class;ILjava/util/Map;ZZZZLc/a/a/g;)V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    const-class v6, Ljava/lang/String;

    iget-object v7, v2, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    if-nez v3, :cond_0

    invoke-virtual {v7}, Lc/a/a/j/z;->o()V

    return-void

    :cond_0
    iget-object v8, v2, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    if-eqz v8, :cond_1

    iget v8, v8, Lc/a/a/j/w;->d:I

    sget-object v9, Lc/a/a/j/a0;->p:Lc/a/a/j/a0;

    iget v9, v9, Lc/a/a/j/a0;->z:I

    and-int/2addr v8, v9

    if-nez v8, :cond_2

    :cond_1
    iget-object v8, v2, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    if-eqz v8, :cond_2

    invoke-virtual {v8, v3}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual/range {p1 .. p2}, Lc/a/a/j/m;->t(Ljava/lang/Object;)V

    return-void

    :cond_2
    iget v8, v7, Lc/a/a/j/z;->n:I

    sget-object v9, Lc/a/a/j/a0;->l:Lc/a/a/j/a0;

    iget v9, v9, Lc/a/a/j/a0;->z:I

    and-int/2addr v9, v8

    if-eqz v9, :cond_3

    iget-object v9, v1, Lc/a/a/j/n;->d:[Lc/a/a/j/j;

    goto :goto_0

    :cond_3
    iget-object v9, v1, Lc/a/a/j/n;->c:[Lc/a/a/j/j;

    :goto_0
    iget-object v10, v2, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    sget-object v11, Lc/a/a/j/a0;->p:Lc/a/a/j/a0;

    iget v11, v11, Lc/a/a/j/a0;->z:I

    and-int/2addr v8, v11

    if-nez v8, :cond_5

    new-instance v8, Lc/a/a/j/w;

    iget v11, v1, Lc/a/a/j/n;->e:I

    invoke-direct {v8, v10, v3, v4, v11}, Lc/a/a/j/w;-><init>(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v8, v2, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    iget-object v8, v2, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    if-nez v8, :cond_4

    new-instance v8, Ljava/util/IdentityHashMap;

    invoke-direct {v8}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v8, v2, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    :cond_4
    iget-object v8, v2, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    iget-object v11, v2, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    invoke-virtual {v8, v3, v11}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_5
    iget v8, v1, Lc/a/a/j/n;->e:I

    sget-object v11, Lc/a/a/j/a0;->u:Lc/a/a/j/a0;

    iget v11, v11, Lc/a/a/j/a0;->z:I

    and-int/2addr v8, v11

    const/4 v13, 0x1

    if-nez v8, :cond_7

    iget v8, v7, Lc/a/a/j/z;->n:I

    and-int/2addr v8, v11

    if-eqz v8, :cond_6

    goto :goto_1

    :cond_6
    const/4 v8, 0x0

    goto :goto_2

    :cond_7
    :goto_1
    move v8, v13

    :goto_2
    if-eqz v8, :cond_8

    const/16 v11, 0x5b

    goto :goto_3

    :cond_8
    const/16 v11, 0x7b

    :goto_3
    if-eqz v8, :cond_9

    const/16 v14, 0x5d

    goto :goto_4

    :cond_9
    const/16 v14, 0x7d

    :goto_4
    :try_start_0
    iget v15, v7, Lc/a/a/j/z;->m:I

    add-int/2addr v15, v13

    iget-object v13, v7, Lc/a/a/j/z;->l:[C

    array-length v13, v13
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-le v15, v13, :cond_b

    :try_start_1
    iget-object v13, v7, Lc/a/a/j/z;->o:Ljava/io/Writer;

    if-nez v13, :cond_a

    invoke-virtual {v7, v15}, Lc/a/a/j/z;->e(I)V

    goto :goto_5

    :cond_a
    invoke-virtual {v7}, Lc/a/a/j/z;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v15, 0x1

    goto :goto_5

    :catchall_0
    move-exception v0

    move-object v3, v0

    move-object v1, v10

    goto/16 :goto_3c

    :catch_0
    move-exception v0

    move-object v3, v0

    move-object v1, v10

    goto/16 :goto_3b

    :cond_b
    :goto_5
    :try_start_2
    iget-object v13, v7, Lc/a/a/j/z;->l:[C

    iget v12, v7, Lc/a/a/j/z;->m:I

    aput-char v11, v13, v12

    iput v15, v7, Lc/a/a/j/z;->m:I

    array-length v11, v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-lez v11, :cond_c

    :try_start_3
    iget v11, v7, Lc/a/a/j/z;->n:I

    sget-object v12, Lc/a/a/j/a0;->n:Lc/a/a/j/a0;

    iget v12, v12, Lc/a/a/j/a0;->z:I

    and-int/2addr v11, v12

    if-eqz v11, :cond_c

    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->l()V

    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->m()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_c
    :try_start_4
    iget v11, v1, Lc/a/a/j/n;->e:I

    sget-object v12, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v12, v12, Lc/a/a/j/a0;->z:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    and-int/2addr v11, v12

    if-nez v11, :cond_e

    :try_start_5
    iget v11, v7, Lc/a/a/j/z;->n:I

    and-int/2addr v12, v11

    if-eqz v12, :cond_d

    if-nez v5, :cond_e

    sget-object v12, Lc/a/a/j/a0;->s:Lc/a/a/j/a0;

    iget v12, v12, Lc/a/a/j/a0;->z:I

    and-int/2addr v11, v12

    if-eqz v11, :cond_e

    iget-object v11, v2, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    if-eqz v11, :cond_d

    iget-object v11, v11, Lc/a/a/j/w;->a:Lc/a/a/j/w;

    if-eqz v11, :cond_d

    goto :goto_6

    :cond_d
    const/4 v11, 0x0

    goto :goto_7

    :cond_e
    :goto_6
    const/4 v11, 0x1

    :goto_7
    if-eqz v11, :cond_11

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    if-eq v11, v5, :cond_11

    iget-object v5, v1, Lc/a/a/j/n;->g:Ljava/lang/String;

    if-eqz v5, :cond_f

    goto :goto_8

    :cond_f
    iget-object v5, v2, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    iget-object v5, v5, Lc/a/a/j/x;->c:Ljava/lang/String;

    :goto_8
    const/4 v11, 0x0

    invoke-virtual {v7, v5, v11}, Lc/a/a/j/z;->j(Ljava/lang/String;Z)V

    iget-object v5, v1, Lc/a/a/j/n;->f:Ljava/lang/String;

    if-nez v5, :cond_10

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    :cond_10
    invoke-virtual {v2, v5}, Lc/a/a/j/m;->s(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const/4 v5, 0x1

    goto :goto_9

    :cond_11
    const/4 v5, 0x0

    :goto_9
    const/16 v11, 0x2c

    if-eqz v5, :cond_12

    move v5, v11

    goto :goto_a

    :cond_12
    const/4 v5, 0x0

    :goto_a
    :try_start_6
    iget-object v12, v2, Lc/a/a/j/m;->c:Ljava/util/List;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-eqz v12, :cond_13

    :try_start_7
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_b
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_13

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lc/a/a/j/d;

    invoke-virtual {v13, v2, v3, v5}, Lc/a/a/j/d;->d(Lc/a/a/j/m;Ljava/lang/Object;C)C

    move-result v5
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto :goto_b

    :cond_13
    if-ne v5, v11, :cond_14

    const/4 v5, 0x1

    goto :goto_c

    :cond_14
    const/4 v5, 0x0

    :goto_c
    :try_start_8
    iget v12, v7, Lc/a/a/j/z;->n:I

    sget-object v13, Lc/a/a/j/a0;->b:Lc/a/a/j/a0;

    iget v13, v13, Lc/a/a/j/a0;->z:I
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    and-int/2addr v13, v12

    if-eqz v13, :cond_15

    :try_start_9
    sget-object v13, Lc/a/a/j/a0;->c:Lc/a/a/j/a0;

    iget v13, v13, Lc/a/a/j/a0;->z:I
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    and-int/2addr v13, v12

    if-nez v13, :cond_15

    const/4 v13, 0x1

    goto :goto_d

    :cond_15
    const/4 v13, 0x0

    :goto_d
    :try_start_a
    sget-object v15, Lc/a/a/j/a0;->c:Lc/a/a/j/a0;

    iget v15, v15, Lc/a/a/j/a0;->z:I

    and-int/2addr v15, v12

    if-eqz v15, :cond_16

    const/4 v15, 0x1

    goto :goto_e

    :cond_16
    const/4 v15, 0x0

    :goto_e
    sget-object v11, Lc/a/a/j/a0;->w:Lc/a/a/j/a0;

    iget v11, v11, Lc/a/a/j/a0;->z:I

    and-int/2addr v11, v12

    if-eqz v11, :cond_17

    const/4 v11, 0x1

    goto :goto_f

    :cond_17
    const/4 v11, 0x0

    :goto_f
    iget-object v12, v2, Lc/a/a/j/m;->e:Ljava/util/List;

    move/from16 v16, v5

    iget-object v5, v2, Lc/a/a/j/m;->g:Ljava/util/List;

    iget-object v4, v2, Lc/a/a/j/m;->f:Ljava/util/List;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    move-object/from16 v17, v10

    :try_start_b
    iget-object v10, v2, Lc/a/a/j/m;->h:Ljava/util/List;

    move/from16 v18, v14

    move/from16 v19, v15

    const/4 v14, 0x0

    :goto_10
    array-length v15, v9
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    if-ge v14, v15, :cond_66

    :try_start_c
    aget-object v15, v9, v14

    move-object/from16 v20, v9

    iget-object v9, v15, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    move/from16 v21, v14

    iget-object v14, v9, Lc/a/a/k/a;->h:Ljava/lang/Class;

    move/from16 v22, v13

    iget-object v13, v9, Lc/a/a/k/a;->b:Ljava/lang/String;

    move/from16 v23, v11

    iget v11, v7, Lc/a/a/j/z;->n:I

    move-object/from16 v24, v6

    sget-object v6, Lc/a/a/j/a0;->k:Lc/a/a/j/a0;

    iget v6, v6, Lc/a/a/j/a0;->z:I

    and-int/2addr v6, v11

    if-eqz v6, :cond_18

    iget-object v6, v9, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    if-eqz v6, :cond_18

    iget-boolean v6, v9, Lc/a/a/k/a;->f:Z

    if-eqz v6, :cond_18

    goto :goto_12

    :cond_18
    iget-object v6, v1, Lc/a/a/j/n;->g:Ljava/lang/String;

    if-eqz v6, :cond_19

    invoke-virtual {v6, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_19

    goto :goto_12

    :cond_19
    if-eqz v10, :cond_1b

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lc/a/a/j/v;

    invoke-interface {v11, v2, v3, v13}, Lc/a/a/j/v;->c(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_1a

    const/4 v6, 0x0

    goto :goto_11

    :cond_1b
    const/4 v6, 0x1

    :goto_11
    if-nez v6, :cond_1c

    :goto_12
    move-object/from16 v31, v4

    move-object/from16 v30, v5

    move-object/from16 v32, v10

    :goto_13
    move-object/from16 v34, v12

    :goto_14
    move-object/from16 v3, v24

    goto/16 :goto_26

    :cond_1c
    const/4 v6, 0x0

    const-wide/16 v25, 0x0

    iget-boolean v11, v9, Lc/a/a/k/a;->e:Z

    if-eqz v11, :cond_20

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v14, v11, :cond_1d

    iget-object v11, v9, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v11, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v11

    move-wide/from16 v28, v25

    const/16 v25, 0x0

    const/16 v27, 0x0

    move/from16 v26, v11

    const/4 v11, 0x1

    goto :goto_17

    :cond_1d
    sget-object v11, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v14, v11, :cond_1e

    iget-object v11, v9, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v11, v3}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    move-result-wide v25

    move-wide/from16 v28, v25

    const/4 v11, 0x1

    const/16 v25, 0x0

    goto :goto_16

    :cond_1e
    sget-object v11, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v14, v11, :cond_1f

    iget-object v11, v9, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v11, v3}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z

    move-result v11

    move/from16 v27, v11

    move-wide/from16 v28, v25

    const/4 v11, 0x1

    const/16 v25, 0x0

    const/16 v26, 0x0

    goto :goto_17

    :cond_1f
    iget-object v6, v9, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v6, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_15

    :cond_20
    invoke-virtual {v15, v3}, Lc/a/a/j/j;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :goto_15
    move-wide/from16 v28, v25

    const/4 v11, 0x0

    const/16 v25, 0x1

    :goto_16
    const/16 v26, 0x0

    const/16 v27, 0x0

    :goto_17
    if-eqz v12, :cond_26

    if-eqz v11, :cond_23

    move-object/from16 v30, v6

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v14, v6, :cond_21

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_18
    const/16 v25, 0x1

    goto :goto_19

    :cond_21
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v14, v6, :cond_22

    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_18

    :cond_22
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v14, v6, :cond_24

    invoke-static/range {v27 .. v27}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_18

    :cond_23
    move-object/from16 v30, v6

    :cond_24
    move-object/from16 v6, v30

    :goto_19
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v30

    :goto_1a
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->hasNext()Z

    move-result v31

    if-eqz v31, :cond_27

    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v31

    move-object/from16 v32, v10

    move-object/from16 v10, v31

    check-cast v10, Lc/a/a/j/u;

    invoke-interface {v10, v3, v13, v6}, Lc/a/a/j/u;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_25

    const/4 v10, 0x0

    goto :goto_1b

    :cond_25
    move-object/from16 v10, v32

    goto :goto_1a

    :cond_26
    move-object/from16 v30, v6

    :cond_27
    move-object/from16 v32, v10

    const/4 v10, 0x1

    :goto_1b
    if-nez v10, :cond_28

    move-object/from16 v31, v4

    move-object/from16 v30, v5

    goto/16 :goto_13

    :cond_28
    if-eqz v5, :cond_2c

    if-eqz v11, :cond_2b

    if-nez v25, :cond_2b

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v14, v10, :cond_29

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_1c
    const/16 v25, 0x1

    goto :goto_1d

    :cond_29
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v14, v10, :cond_2a

    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_1c

    :cond_2a
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v14, v10, :cond_2b

    invoke-static/range {v27 .. v27}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_1c

    :cond_2b
    :goto_1d
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object/from16 v30, v5

    move-object v5, v13

    :goto_1e
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v31

    if-eqz v31, :cond_2d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v31

    move-object/from16 v33, v10

    move-object/from16 v10, v31

    check-cast v10, Lc/a/a/j/r;

    invoke-interface {v10, v3, v5, v6}, Lc/a/a/j/r;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    move-object/from16 v10, v33

    goto :goto_1e

    :cond_2c
    move-object/from16 v30, v5

    move-object v5, v13

    :cond_2d
    if-eqz v4, :cond_32

    if-eqz v11, :cond_30

    if-nez v25, :cond_30

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v14, v10, :cond_2e

    invoke-static/range {v26 .. v26}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    :goto_1f
    const/16 v25, 0x1

    goto :goto_20

    :cond_2e
    sget-object v10, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v14, v10, :cond_2f

    invoke-static/range {v28 .. v29}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    goto :goto_1f

    :cond_2f
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v14, v10, :cond_30

    invoke-static/range {v27 .. v27}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_1f

    :cond_30
    :goto_20
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    move-object/from16 v31, v4

    move-object v4, v6

    :goto_21
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v33

    if-eqz v33, :cond_31

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v33

    move-object/from16 v34, v6

    move-object/from16 v6, v33

    check-cast v6, Lc/a/a/j/c0;

    invoke-interface {v6, v3, v13, v4}, Lc/a/a/j/c0;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    move-object/from16 v6, v34

    goto :goto_21

    :cond_31
    move-object/from16 v34, v6

    move-object v6, v4

    move-object/from16 v4, v34

    goto :goto_22

    :cond_32
    move-object/from16 v31, v4

    move-object v4, v6

    :goto_22
    const-string v10, ""

    if-eqz v25, :cond_40

    if-nez v6, :cond_40

    move-object/from16 v33, v6

    :try_start_d
    iget v6, v9, Lc/a/a/k/a;->r:I

    move-object/from16 v34, v12

    iget v12, v1, Lc/a/a/j/n;->e:I

    or-int/2addr v6, v12

    iget v12, v7, Lc/a/a/j/z;->n:I

    or-int/2addr v6, v12

    const-class v3, Ljava/lang/Boolean;

    if-ne v14, v3, :cond_36

    sget-object v3, Lc/a/a/j/a0;->j:Lc/a/a/j/a0;

    iget v3, v3, Lc/a/a/j/a0;->z:I

    move-object/from16 v35, v9

    sget-object v9, Lc/a/a/j/a0;->d:Lc/a/a/j/a0;

    iget v9, v9, Lc/a/a/j/a0;->z:I

    or-int/2addr v9, v3

    if-nez v8, :cond_33

    and-int v36, v6, v9

    if-nez v36, :cond_33

    and-int/2addr v9, v12

    if-nez v9, :cond_33

    goto/16 :goto_14

    :cond_33
    and-int/2addr v6, v3

    if-nez v6, :cond_35

    and-int/2addr v3, v12

    if-eqz v3, :cond_34

    goto :goto_23

    :cond_34
    move-object/from16 v6, v33

    goto :goto_24

    :cond_35
    :goto_23
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_24
    move-object/from16 v3, v24

    move-object/from16 v24, v10

    goto/16 :goto_25

    :cond_36
    move-object/from16 v35, v9

    move-object/from16 v3, v24

    if-ne v14, v3, :cond_39

    sget-object v9, Lc/a/a/j/a0;->h:Lc/a/a/j/a0;

    iget v9, v9, Lc/a/a/j/a0;->z:I

    move-object/from16 v24, v10

    sget-object v10, Lc/a/a/j/a0;->d:Lc/a/a/j/a0;

    iget v10, v10, Lc/a/a/j/a0;->z:I

    or-int/2addr v10, v9

    if-nez v8, :cond_37

    and-int v36, v6, v10

    if-nez v36, :cond_37

    and-int/2addr v10, v12

    if-nez v10, :cond_37

    goto/16 :goto_26

    :cond_37
    and-int/2addr v6, v9

    if-nez v6, :cond_38

    and-int v6, v12, v9

    if-eqz v6, :cond_41

    :cond_38
    move-object/from16 v6, v24

    goto/16 :goto_25

    :cond_39
    move-object/from16 v24, v10

    const-class v9, Ljava/lang/Number;

    invoke-virtual {v9, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_3c

    sget-object v9, Lc/a/a/j/a0;->i:Lc/a/a/j/a0;

    iget v9, v9, Lc/a/a/j/a0;->z:I

    sget-object v10, Lc/a/a/j/a0;->d:Lc/a/a/j/a0;

    iget v10, v10, Lc/a/a/j/a0;->z:I

    or-int/2addr v10, v9

    if-nez v8, :cond_3a

    and-int v12, v6, v10

    if-nez v12, :cond_3a

    iget v12, v7, Lc/a/a/j/z;->n:I

    and-int/2addr v10, v12

    if-nez v10, :cond_3a

    goto/16 :goto_26

    :cond_3a
    and-int/2addr v6, v9

    if-nez v6, :cond_3b

    iget v6, v7, Lc/a/a/j/z;->n:I

    and-int/2addr v6, v9

    if-eqz v6, :cond_41

    :cond_3b
    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object v6, v9

    goto :goto_25

    :cond_3c
    const-class v9, Ljava/util/Collection;

    invoke-virtual {v9, v14}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-eqz v9, :cond_3f

    sget-object v9, Lc/a/a/j/a0;->g:Lc/a/a/j/a0;

    iget v9, v9, Lc/a/a/j/a0;->z:I

    sget-object v10, Lc/a/a/j/a0;->d:Lc/a/a/j/a0;

    iget v10, v10, Lc/a/a/j/a0;->z:I

    or-int/2addr v10, v9

    if-nez v8, :cond_3d

    and-int v12, v6, v10

    if-nez v12, :cond_3d

    iget v12, v7, Lc/a/a/j/z;->n:I

    and-int/2addr v10, v12

    if-nez v10, :cond_3d

    goto/16 :goto_26

    :cond_3d
    and-int/2addr v6, v9

    if-nez v6, :cond_3e

    iget v6, v7, Lc/a/a/j/z;->n:I

    and-int/2addr v6, v9

    if-eqz v6, :cond_41

    :cond_3e
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v6

    goto :goto_25

    :cond_3f
    if-nez v8, :cond_41

    iget-boolean v6, v15, Lc/a/a/j/j;->c:Z

    if-nez v6, :cond_41

    sget-object v6, Lc/a/a/j/a0;->d:Lc/a/a/j/a0;

    invoke-virtual {v7, v6}, Lc/a/a/j/z;->g(Lc/a/a/j/a0;)Z

    move-result v6

    if-nez v6, :cond_41

    goto :goto_26

    :cond_40
    move-object/from16 v33, v6

    move-object/from16 v35, v9

    move-object/from16 v34, v12

    move-object/from16 v3, v24

    move-object/from16 v24, v10

    :cond_41
    move-object/from16 v6, v33

    :goto_25
    if-eqz v25, :cond_44

    if-eqz v6, :cond_44

    if-eqz v23, :cond_44

    sget-object v9, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq v14, v9, :cond_42

    sget-object v9, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq v14, v9, :cond_42

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-eq v14, v9, :cond_42

    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-eq v14, v9, :cond_42

    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq v14, v9, :cond_42

    sget-object v9, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne v14, v9, :cond_43

    :cond_42
    instance-of v9, v6, Ljava/lang/Number;

    if-eqz v9, :cond_43

    move-object v9, v6

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->byteValue()B

    move-result v9

    if-nez v9, :cond_43

    goto :goto_26

    :cond_43
    sget-object v9, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v14, v9, :cond_44

    instance-of v9, v6, Ljava/lang/Boolean;

    if-eqz v9, :cond_44

    move-object v9, v6

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-nez v9, :cond_44

    :goto_26
    const/4 v5, 0x0

    const/16 v33, 0x2c

    goto/16 :goto_34

    :cond_44
    if-eqz v16, :cond_47

    iget v9, v7, Lc/a/a/j/z;->m:I

    const/4 v10, 0x1

    add-int/2addr v9, v10

    iget-object v10, v7, Lc/a/a/j/z;->l:[C

    array-length v10, v10

    if-le v9, v10, :cond_46

    iget-object v10, v7, Lc/a/a/j/z;->o:Ljava/io/Writer;

    if-nez v10, :cond_45

    invoke-virtual {v7, v9}, Lc/a/a/j/z;->e(I)V

    goto :goto_27

    :cond_45
    invoke-virtual {v7}, Lc/a/a/j/z;->flush()V

    const/4 v9, 0x1

    :cond_46
    :goto_27
    iget-object v10, v7, Lc/a/a/j/z;->l:[C

    iget v12, v7, Lc/a/a/j/z;->m:I

    const/16 v33, 0x2c

    aput-char v33, v10, v12

    iput v9, v7, Lc/a/a/j/z;->m:I

    iget v9, v7, Lc/a/a/j/z;->n:I

    sget-object v10, Lc/a/a/j/a0;->n:Lc/a/a/j/a0;

    iget v10, v10, Lc/a/a/j/a0;->z:I

    and-int/2addr v9, v10

    if-eqz v9, :cond_48

    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->m()V

    goto :goto_28

    :cond_47
    const/16 v33, 0x2c

    :cond_48
    :goto_28
    if-eq v5, v13, :cond_4b

    if-nez v8, :cond_49

    const/4 v4, 0x1

    invoke-virtual {v7, v5, v4}, Lc/a/a/j/z;->j(Ljava/lang/String;Z)V

    :cond_49
    :goto_29
    invoke-virtual {v2, v6}, Lc/a/a/j/m;->r(Ljava/lang/Object;)V

    :cond_4a
    :goto_2a
    const/4 v5, 0x0

    goto/16 :goto_33

    :cond_4b
    if-eq v4, v6, :cond_4c

    if-nez v8, :cond_49

    invoke-virtual {v15, v2}, Lc/a/a/j/j;->c(Lc/a/a/j/m;)V

    goto :goto_29

    :cond_4c
    if-nez v8, :cond_51

    if-eqz v22, :cond_50

    iget-object v4, v15, Lc/a/a/j/j;->f:[C

    array-length v5, v4

    iget v9, v7, Lc/a/a/j/z;->m:I

    add-int/2addr v9, v5

    iget-object v10, v7, Lc/a/a/j/z;->l:[C

    array-length v10, v10

    if-le v9, v10, :cond_4f

    iget-object v10, v7, Lc/a/a/j/z;->o:Ljava/io/Writer;

    if-nez v10, :cond_4d

    invoke-virtual {v7, v9}, Lc/a/a/j/z;->e(I)V

    goto :goto_2b

    :cond_4d
    const/4 v9, 0x0

    :cond_4e
    iget-object v10, v7, Lc/a/a/j/z;->l:[C

    array-length v12, v10

    iget v13, v7, Lc/a/a/j/z;->m:I

    sub-int/2addr v12, v13

    invoke-static {v4, v9, v10, v13, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v10, v7, Lc/a/a/j/z;->l:[C

    array-length v10, v10

    iput v10, v7, Lc/a/a/j/z;->m:I

    invoke-virtual {v7}, Lc/a/a/j/z;->flush()V

    sub-int/2addr v5, v12

    add-int/2addr v9, v12

    iget-object v10, v7, Lc/a/a/j/z;->l:[C

    array-length v10, v10

    if-gt v5, v10, :cond_4e

    move v10, v9

    move v9, v5

    goto :goto_2c

    :cond_4f
    :goto_2b
    const/4 v10, 0x0

    :goto_2c
    iget-object v12, v7, Lc/a/a/j/z;->l:[C

    iget v13, v7, Lc/a/a/j/z;->m:I

    invoke-static {v4, v10, v12, v13, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v9, v7, Lc/a/a/j/z;->m:I

    goto :goto_2d

    :cond_50
    invoke-virtual {v15, v2}, Lc/a/a/j/j;->c(Lc/a/a/j/m;)V

    :cond_51
    :goto_2d
    if-eqz v11, :cond_5b

    if-nez v25, :cond_5b

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v14, v4, :cond_58

    const/high16 v4, -0x80000000

    move/from16 v11, v26

    if-ne v11, v4, :cond_52

    const-string v4, "-2147483648"

    invoke-virtual {v7, v4}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    goto :goto_2a

    :cond_52
    if-gez v11, :cond_53

    neg-int v4, v11

    goto :goto_2e

    :cond_53
    move v4, v11

    :goto_2e
    const/4 v5, 0x0

    :cond_54
    sget-object v6, Lc/a/a/j/z;->c:[I

    aget v6, v6, v5

    add-int/lit8 v5, v5, 0x1

    if-gt v4, v6, :cond_54

    if-gez v11, :cond_55

    add-int/lit8 v5, v5, 0x1

    :cond_55
    iget v4, v7, Lc/a/a/j/z;->m:I

    add-int/2addr v4, v5

    iget-object v6, v7, Lc/a/a/j/z;->l:[C

    array-length v6, v6

    if-le v4, v6, :cond_57

    iget-object v6, v7, Lc/a/a/j/z;->o:Ljava/io/Writer;

    if-nez v6, :cond_56

    invoke-virtual {v7, v4}, Lc/a/a/j/z;->e(I)V

    goto :goto_2f

    :cond_56
    new-array v6, v5, [C

    int-to-long v9, v11

    invoke-static {v9, v10, v5, v6}, Lc/a/a/j/z;->f(JI[C)V

    const/4 v9, 0x0

    invoke-virtual {v7, v6, v9, v5}, Lc/a/a/j/z;->write([CII)V

    const/4 v5, 0x1

    goto :goto_30

    :cond_57
    :goto_2f
    const/4 v5, 0x0

    :goto_30
    if-nez v5, :cond_4a

    int-to-long v5, v11

    iget-object v9, v7, Lc/a/a/j/z;->l:[C

    invoke-static {v5, v6, v4, v9}, Lc/a/a/j/z;->f(JI[C)V

    iput v4, v7, Lc/a/a/j/z;->m:I

    goto/16 :goto_2a

    :cond_58
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v14, v4, :cond_59

    iget-object v4, v2, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    move-wide/from16 v5, v28

    invoke-virtual {v4, v5, v6}, Lc/a/a/j/z;->n(J)V

    goto/16 :goto_2a

    :cond_59
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v14, v4, :cond_4a

    if-eqz v27, :cond_5a

    iget-object v4, v2, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    sget-object v5, Lc/a/a/j/n;->a:[C

    array-length v6, v5

    const/4 v9, 0x0

    invoke-virtual {v4, v5, v9, v6}, Lc/a/a/j/z;->write([CII)V

    goto/16 :goto_2a

    :cond_5a
    iget-object v4, v2, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    sget-object v5, Lc/a/a/j/n;->b:[C

    array-length v6, v5

    const/4 v9, 0x0

    invoke-virtual {v4, v5, v9, v6}, Lc/a/a/j/z;->write([CII)V

    goto/16 :goto_2a

    :cond_5b
    if-nez v8, :cond_65

    if-ne v14, v3, :cond_60

    iget v4, v15, Lc/a/a/j/j;->d:I

    iget v5, v1, Lc/a/a/j/n;->e:I

    or-int/2addr v4, v5

    if-nez v6, :cond_5e

    iget v5, v7, Lc/a/a/j/z;->n:I

    sget-object v6, Lc/a/a/j/a0;->h:Lc/a/a/j/a0;

    iget v6, v6, Lc/a/a/j/a0;->z:I

    and-int/2addr v5, v6

    if-nez v5, :cond_5d

    and-int/2addr v4, v6

    if-eqz v4, :cond_5c

    goto :goto_31

    :cond_5c
    invoke-virtual {v7}, Lc/a/a/j/z;->o()V

    goto/16 :goto_2a

    :cond_5d
    :goto_31
    move-object/from16 v4, v24

    invoke-virtual {v7, v4}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    goto/16 :goto_2a

    :cond_5e
    check-cast v6, Ljava/lang/String;

    if-eqz v19, :cond_5f

    invoke-virtual {v7, v6}, Lc/a/a/j/z;->r(Ljava/lang/String;)V

    goto/16 :goto_2a

    :cond_5f
    const/4 v4, 0x0

    const/4 v5, 0x1

    invoke-virtual {v7, v6, v4, v5}, Lc/a/a/j/z;->q(Ljava/lang/String;CZ)V

    goto/16 :goto_2a

    :cond_60
    move-object/from16 v4, v35

    iget-boolean v4, v4, Lc/a/a/k/a;->n:Z

    if-eqz v4, :cond_65

    if-eqz v6, :cond_64

    iget v4, v7, Lc/a/a/j/z;->n:I

    sget-object v5, Lc/a/a/j/a0;->e:Lc/a/a/j/a0;

    iget v5, v5, Lc/a/a/j/a0;->z:I

    and-int/2addr v4, v5

    if-eqz v4, :cond_63

    check-cast v6, Ljava/lang/Enum;

    invoke-virtual {v6}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v4

    iget v5, v7, Lc/a/a/j/z;->n:I

    sget-object v6, Lc/a/a/j/a0;->c:Lc/a/a/j/a0;

    iget v6, v6, Lc/a/a/j/a0;->z:I

    and-int/2addr v5, v6

    if-eqz v5, :cond_61

    const/4 v11, 0x1

    goto :goto_32

    :cond_61
    const/4 v11, 0x0

    :goto_32
    if-eqz v11, :cond_62

    invoke-virtual {v7, v4}, Lc/a/a/j/z;->r(Ljava/lang/String;)V

    goto/16 :goto_2a

    :cond_62
    const/4 v5, 0x0

    invoke-virtual {v7, v4, v5, v5}, Lc/a/a/j/z;->q(Ljava/lang/String;CZ)V

    goto :goto_33

    :cond_63
    const/4 v5, 0x0

    check-cast v6, Ljava/lang/Enum;

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    invoke-virtual {v7, v4}, Lc/a/a/j/z;->k(I)V

    goto :goto_33

    :cond_64
    const/4 v5, 0x0

    invoke-virtual {v7}, Lc/a/a/j/z;->o()V

    goto :goto_33

    :cond_65
    const/4 v5, 0x0

    invoke-virtual {v15, v2, v6}, Lc/a/a/j/j;->d(Lc/a/a/j/m;Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :goto_33
    const/16 v16, 0x1

    :goto_34
    add-int/lit8 v14, v21, 0x1

    move-object v6, v3

    move-object/from16 v9, v20

    move/from16 v13, v22

    move/from16 v11, v23

    move-object/from16 v5, v30

    move-object/from16 v4, v31

    move-object/from16 v10, v32

    move-object/from16 v12, v34

    move-object/from16 v3, p2

    goto/16 :goto_10

    :catchall_1
    move-exception v0

    move-object v3, v0

    move-object/from16 v1, v17

    goto/16 :goto_3c

    :catch_1
    move-exception v0

    move-object v3, v0

    move-object/from16 v1, v17

    goto/16 :goto_3b

    :cond_66
    move-object/from16 v20, v9

    const/4 v5, 0x0

    const/16 v33, 0x2c

    :try_start_e
    iget-object v1, v2, Lc/a/a/j/m;->d:Ljava/util/List;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    if-eqz v1, :cond_68

    if-eqz v16, :cond_67

    move/from16 v12, v33

    goto :goto_35

    :cond_67
    move v12, v5

    :goto_35
    :try_start_f
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_36
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_68

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/a/a/j/a;

    move-object/from16 v4, p2

    invoke-virtual {v3, v2, v4, v12}, Lc/a/a/j/a;->d(Lc/a/a/j/m;Ljava/lang/Object;C)C

    move-result v12
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    goto :goto_36

    :cond_68
    move-object/from16 v9, v20

    :try_start_10
    array-length v1, v9
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_2
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    if-lez v1, :cond_69

    :try_start_11
    iget v1, v7, Lc/a/a/j/z;->n:I

    sget-object v3, Lc/a/a/j/a0;->n:Lc/a/a/j/a0;

    iget v3, v3, Lc/a/a/j/a0;->z:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_69

    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->d()V

    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->m()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    :cond_69
    :try_start_12
    iget v1, v7, Lc/a/a/j/z;->m:I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    iget-object v4, v7, Lc/a/a/j/z;->l:[C

    array-length v4, v4
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_2
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    if-le v1, v4, :cond_6b

    :try_start_13
    iget-object v4, v7, Lc/a/a/j/z;->o:Ljava/io/Writer;

    if-nez v4, :cond_6a

    invoke-virtual {v7, v1}, Lc/a/a/j/z;->e(I)V

    goto :goto_37

    :cond_6a
    invoke-virtual {v7}, Lc/a/a/j/z;->flush()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_1
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    move v13, v3

    goto :goto_38

    :cond_6b
    :goto_37
    move v13, v1

    :goto_38
    :try_start_14
    iget-object v1, v7, Lc/a/a/j/z;->l:[C

    iget v3, v7, Lc/a/a/j/z;->m:I

    aput-char v18, v1, v3

    iput v13, v7, Lc/a/a/j/z;->m:I
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_2
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    move-object/from16 v1, v17

    iput-object v1, v2, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    return-void

    :catchall_2
    move-exception v0

    move-object/from16 v1, v17

    goto :goto_39

    :catch_2
    move-exception v0

    move-object/from16 v1, v17

    goto :goto_3a

    :catchall_3
    move-exception v0

    move-object v1, v10

    :goto_39
    move-object v3, v0

    goto :goto_3c

    :catch_3
    move-exception v0

    move-object v1, v10

    :goto_3a
    move-object v3, v0

    :goto_3b
    :try_start_15
    const-string v4, "write javaBean error, fastjson version 1.1.72"

    move-object/from16 v5, p3

    if-eqz v5, :cond_6c

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", fieldName : "

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_6c
    new-instance v5, Lc/a/a/d;

    invoke-direct {v5, v4, v3}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v5
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_4

    :catchall_4
    move-exception v0

    goto :goto_39

    :goto_3c
    iput-object v1, v2, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    throw v3
.end method

.method public b(Ljava/lang/Object;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    iget-object v1, p0, Lc/a/a/j/n;->d:[Lc/a/a/j/j;

    array-length v1, v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    iget-object p0, p0, Lc/a/a/j/n;->d:[Lc/a/a/j/j;

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    iget-object v4, v3, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    iget-object v4, v4, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {v3, p1}, Lc/a/a/j/j;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
