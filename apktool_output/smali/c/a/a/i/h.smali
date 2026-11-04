.class Lc/a/a/i/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field final a:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field final b:I

.field final c:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field

.field final d:Ljava/lang/reflect/Method;

.field final e:[Lc/a/a/k/a;

.field final f:[Lc/a/a/k/a;

.field final g:Lc/a/a/h/c;

.field h:Z

.field final i:Z

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:J

.field public final m:I

.field public final n:[Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;[Lc/a/a/k/a;[Lc/a/a/k/a;Lc/a/a/h/c;[Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/lang/reflect/Constructor<",
            "*>;",
            "Ljava/lang/reflect/Method;",
            "[",
            "Lc/a/a/k/a;",
            "[",
            "Lc/a/a/k/a;",
            "Lc/a/a/h/c;",
            "[",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/a/a/i/h;->h:Z

    iput-object p2, p0, Lc/a/a/i/h;->a:Ljava/lang/reflect/Constructor;

    iput-object p3, p0, Lc/a/a/i/h;->c:Ljava/lang/reflect/Constructor;

    iput-object p4, p0, Lc/a/a/i/h;->d:Ljava/lang/reflect/Method;

    iput-object p5, p0, Lc/a/a/i/h;->e:[Lc/a/a/k/a;

    iput-object p7, p0, Lc/a/a/i/h;->g:Lc/a/a/h/c;

    const/4 p3, 0x0

    if-eqz p8, :cond_0

    array-length v1, p8

    array-length v2, p5

    if-ne v1, v2, :cond_0

    iput-object p3, p0, Lc/a/a/i/h;->n:[Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p8, p0, Lc/a/a/i/h;->n:[Ljava/lang/String;

    :goto_0
    if-eqz p7, :cond_3

    invoke-interface {p7}, Lc/a/a/h/c;->typeName()Ljava/lang/String;

    move-result-object p8

    invoke-virtual {p8}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p8

    :goto_1
    iput-object p8, p0, Lc/a/a/i/h;->j:Ljava/lang/String;

    invoke-interface {p7}, Lc/a/a/h/c;->typeKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p8

    if-lez p8, :cond_2

    move-object p3, p1

    :cond_2
    iput-object p3, p0, Lc/a/a/i/h;->k:Ljava/lang/String;

    invoke-interface {p7}, Lc/a/a/h/c;->parseFeatures()[Lc/a/a/i/d;

    move-result-object p1

    array-length p3, p1

    move p8, v0

    move v1, p8

    :goto_2
    if-ge p8, p3, :cond_4

    aget-object v2, p1, p8

    iget v2, v2, Lc/a/a/i/d;->u:I

    or-int/2addr v1, v2

    add-int/lit8 p8, p8, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/i/h;->j:Ljava/lang/String;

    iput-object p3, p0, Lc/a/a/i/h;->k:Ljava/lang/String;

    move v1, v0

    :cond_4
    iget-object p1, p0, Lc/a/a/i/h;->k:Ljava/lang/String;

    if-nez p1, :cond_5

    const-wide/16 v2, 0x0

    goto :goto_3

    :cond_5
    invoke-static {p1}, Lc/a/a/k/d;->x(Ljava/lang/String;)J

    move-result-wide v2

    :goto_3
    iput-wide v2, p0, Lc/a/a/i/h;->l:J

    iput v1, p0, Lc/a/a/i/h;->m:I

    if-eqz p7, :cond_7

    invoke-interface {p7}, Lc/a/a/h/c;->parseFeatures()[Lc/a/a/i/d;

    move-result-object p1

    array-length p3, p1

    move p7, v0

    move p8, p7

    :goto_4
    if-ge p7, p3, :cond_8

    aget-object v1, p1, p7

    sget-object v2, Lc/a/a/i/d;->o:Lc/a/a/i/d;

    if-ne v1, v2, :cond_6

    const/4 p8, 0x1

    :cond_6
    add-int/lit8 p7, p7, 0x1

    goto :goto_4

    :cond_7
    move p8, v0

    :cond_8
    iput-boolean p8, p0, Lc/a/a/i/h;->i:Z

    invoke-direct {p0, p5, p6}, Lc/a/a/i/h;->c([Lc/a/a/k/a;[Lc/a/a/k/a;)[Lc/a/a/k/a;

    move-result-object p1

    invoke-static {p5, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_9

    goto :goto_5

    :cond_9
    move-object p5, p1

    :goto_5
    iput-object p5, p0, Lc/a/a/i/h;->f:[Lc/a/a/k/a;

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    array-length v0, p1

    goto :goto_6

    :cond_a
    if-eqz p4, :cond_b

    invoke-virtual {p4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object p1

    array-length v0, p1

    :cond_b
    :goto_6
    iput v0, p0, Lc/a/a/i/h;->b:I

    return-void
.end method

.method static a(Ljava/util/List;Lc/a/a/k/a;Z)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc/a/a/k/a;",
            ">;",
            "Lc/a/a/k/a;",
            "Z)Z"
        }
    .end annotation

    if-nez p2, :cond_2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/k/a;

    iget-object v3, v2, Lc/a/a/k/a;->b:Ljava/lang/String;

    iget-object v4, p1, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-boolean v2, v2, Lc/a/a/k/a;->k:Z

    if-eqz v2, :cond_0

    iget-boolean v2, p1, Lc/a/a/k/a;->k:Z

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    return v0

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0
.end method

.method public static b(Ljava/lang/Class;ILjava/lang/reflect/Type;ZZZZLc/a/a/g;)Lc/a/a/i/h;
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I",
            "Ljava/lang/reflect/Type;",
            "ZZZZ",
            "Lc/a/a/g;",
            ")",
            "Lc/a/a/i/h;"
        }
    .end annotation

    move-object/from16 v11, p0

    move/from16 v12, p1

    move/from16 v13, p3

    move-object/from16 v14, p7

    const-class v15, Ljava/lang/Object;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Lc/a/a/k/d;->J(Ljava/lang/Class;)Z

    move-result v1

    and-int/lit16 v2, v12, 0x400

    const/16 v16, 0x0

    const/4 v8, 0x1

    const/4 v7, 0x0

    if-nez v2, :cond_3

    array-length v3, v0

    if-eq v3, v8, :cond_0

    if-nez v1, :cond_3

    :cond_0
    :try_start_0
    new-array v3, v7, [Ljava/lang/Class;

    invoke-virtual {v11, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object/from16 v3, v16

    :goto_0
    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->isMemberClass()Z

    move-result v4

    if-eqz v4, :cond_2

    and-int/lit8 v4, v12, 0x8

    if-nez v4, :cond_2

    array-length v4, v0

    move v5, v7

    :goto_1
    if-ge v5, v4, :cond_2

    aget-object v6, v0, v5

    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    move-object/from16 v18, v3

    array-length v3, v7

    const/16 v17, 0x0

    if-ne v3, v8, :cond_1

    aget-object v3, v7, v17

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v7, v6

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    move/from16 v7, v17

    move-object/from16 v3, v18

    goto :goto_1

    :cond_2
    move-object/from16 v18, v3

    move/from16 v17, v7

    move-object/from16 v7, v18

    goto :goto_2

    :cond_3
    move/from16 v17, v7

    move-object/from16 v7, v16

    :goto_2
    const/16 v18, 0x0

    if-eqz v13, :cond_4

    move-object/from16 v20, v15

    move-object/from16 v8, v16

    move-object v15, v8

    goto/16 :goto_7

    :cond_4
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    move-object v4, v11

    move-object/from16 v5, v16

    :goto_3
    if-eqz v4, :cond_b

    if-eq v4, v15, :cond_b

    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v6

    array-length v8, v6

    move-object/from16 v20, v15

    move/from16 v15, v17

    :goto_4
    if-ge v15, v8, :cond_a

    move/from16 v21, v8

    aget-object v8, v6, v15

    move-object/from16 v22, v6

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getModifiers()I

    move-result v6

    and-int/lit8 v23, v6, 0x8

    if-eqz v23, :cond_6

    const-class v6, Lc/a/a/h/a;

    invoke-virtual {v8, v6}, Ljava/lang/reflect/Method;->isAnnotationPresent(Ljava/lang/Class;)Z

    move-result v6

    if-eqz v6, :cond_8

    if-nez v5, :cond_5

    move-object v5, v8

    goto :goto_6

    :cond_5
    new-instance v0, Lc/a/a/d;

    const-string v1, "multi-json creator"

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    and-int/lit8 v23, v6, 0x2

    if-nez v23, :cond_8

    move-object/from16 v23, v5

    and-int/lit16 v5, v6, 0x100

    if-nez v5, :cond_9

    and-int/lit8 v5, v6, 0x4

    if-eqz v5, :cond_7

    goto :goto_5

    :cond_7
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    move-object/from16 v23, v5

    :cond_9
    :goto_5
    move-object/from16 v5, v23

    :goto_6
    add-int/lit8 v15, v15, 0x1

    move/from16 v8, v21

    move-object/from16 v6, v22

    goto :goto_4

    :cond_a
    move-object/from16 v23, v5

    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v4

    move-object/from16 v15, v20

    const/4 v8, 0x1

    goto :goto_3

    :cond_b
    move-object/from16 v20, v15

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [Ljava/lang/reflect/Method;

    invoke-interface {v3, v4}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-object v8, v4

    move-object v15, v5

    :goto_7
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->isInterface()Z

    move-result v3

    if-nez v3, :cond_d

    if-eqz v2, :cond_c

    goto :goto_8

    :cond_c
    move/from16 v2, v17

    goto :goto_9

    :cond_d
    :goto_8
    const/4 v2, 0x1

    :goto_9
    if-eqz v7, :cond_f

    if-eqz v2, :cond_e

    goto :goto_a

    :cond_e
    move-object/from16 v26, v6

    move-object/from16 v29, v8

    move-object v14, v9

    move-object/from16 v22, v16

    move/from16 v8, v17

    move-object v9, v7

    goto/16 :goto_22

    :cond_f
    :goto_a
    array-length v3, v0

    move/from16 v4, v17

    :goto_b
    if-ge v4, v3, :cond_11

    aget-object v5, v0, v4

    move/from16 v21, v3

    const-class v3, Lc/a/a/h/a;

    invoke-virtual {v5, v3}, Ljava/lang/reflect/Constructor;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lc/a/a/h/a;

    if-eqz v3, :cond_10

    goto :goto_c

    :cond_10
    add-int/lit8 v4, v4, 0x1

    move/from16 v3, v21

    goto :goto_b

    :cond_11
    move-object/from16 v5, v16

    :goto_c
    const-string v4, "illegal json creator"

    if-eqz v5, :cond_1a

    invoke-static {v11, v5, v12}, Lc/a/a/k/d;->O(Ljava/lang/Class;Ljava/lang/reflect/Member;I)Z

    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    if-eqz p6, :cond_12

    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    move-object/from16 v18, v0

    goto :goto_d

    :cond_12
    move-object/from16 v18, v3

    :goto_d
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v21

    move/from16 v2, v17

    :goto_e
    array-length v0, v3

    if-ge v2, v0, :cond_17

    aget-object v0, v21, v2

    array-length v1, v0

    move-object/from16 v22, v4

    move/from16 v4, v17

    :goto_f
    if-ge v4, v1, :cond_14

    move/from16 v23, v1

    aget-object v1, v0, v4

    move-object/from16 v24, v0

    instance-of v0, v1, Lc/a/a/h/b;

    if-eqz v0, :cond_13

    check-cast v1, Lc/a/a/h/b;

    goto :goto_10

    :cond_13
    add-int/lit8 v4, v4, 0x1

    move/from16 v1, v23

    move-object/from16 v0, v24

    goto :goto_f

    :cond_14
    move-object/from16 v1, v16

    :goto_10
    if-eqz v1, :cond_16

    aget-object v4, v3, v2

    aget-object v23, v18, v2

    invoke-interface {v1}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0, v6, v9}, Lc/a/a/k/d;->C(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/Map;)Ljava/lang/reflect/Field;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-static {v11, v0, v12}, Lc/a/a/k/d;->O(Ljava/lang/Class;Ljava/lang/reflect/Member;I)Z

    :cond_15
    invoke-interface {v1}, Lc/a/a/h/b;->ordinal()I

    move-result v24

    invoke-interface {v1}, Lc/a/a/h/b;->serialzeFeatures()[Lc/a/a/j/a0;

    move-result-object v25

    invoke-static/range {v25 .. v25}, Lc/a/a/j/a0;->a([Lc/a/a/j/a0;)I

    move-result v25

    new-instance v14, Lc/a/a/k/a;

    invoke-interface {v1}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v26, v0

    move-object v0, v14

    move/from16 v27, v2

    move-object/from16 v2, p0

    move-object/from16 v28, v3

    move-object v3, v4

    move-object/from16 v29, v8

    move-object/from16 v8, v22

    move-object/from16 v4, v23

    move-object/from16 v22, v5

    move-object/from16 v5, v26

    move-object/from16 v23, v9

    move-object v9, v6

    move/from16 v6, v24

    move-object/from16 v30, v7

    move-object/from16 v24, v9

    move/from16 v9, v17

    move/from16 v7, v25

    invoke-direct/range {v0 .. v7}, Lc/a/a/k/a;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;II)V

    invoke-static {v10, v14, v13}, Lc/a/a/i/h;->a(Ljava/util/List;Lc/a/a/k/a;Z)Z

    add-int/lit8 v2, v27, 0x1

    move-object/from16 v14, p7

    move-object v4, v8

    move-object/from16 v5, v22

    move-object/from16 v9, v23

    move-object/from16 v6, v24

    move-object/from16 v3, v28

    move-object/from16 v8, v29

    move-object/from16 v7, v30

    goto :goto_e

    :cond_16
    move-object/from16 v8, v22

    new-instance v0, Lc/a/a/d;

    invoke-direct {v0, v8}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    move-object/from16 v22, v5

    move-object/from16 v24, v6

    move-object/from16 v30, v7

    move-object/from16 v29, v8

    move-object/from16 v23, v9

    move/from16 v9, v17

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Lc/a/a/k/a;

    invoke-interface {v10, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    new-array v2, v0, [Lc/a/a/k/a;

    invoke-static {v1, v9, v2, v9, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    if-eqz p4, :cond_18

    const-class v2, Lc/a/a/h/c;

    invoke-virtual {v11, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v2

    check-cast v2, Lc/a/a/h/c;

    :cond_18
    new-array v2, v0, [Ljava/lang/String;

    move v7, v9

    :goto_11
    if-ge v7, v0, :cond_19

    aget-object v3, v1, v7

    iget-object v3, v3, Lc/a/a/k/a;->b:Ljava/lang/String;

    aput-object v3, v2, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_11

    :cond_19
    move-object/from16 v18, v2

    move v8, v9

    move-object/from16 v14, v23

    :goto_12
    move-object/from16 v26, v24

    goto/16 :goto_21

    :cond_1a
    move-object/from16 v22, v5

    move-object/from16 v24, v6

    move-object/from16 v30, v7

    move-object/from16 v29, v8

    move-object/from16 v23, v9

    move/from16 v9, v17

    move-object v8, v4

    if-eqz v15, :cond_23

    invoke-static {v11, v15, v12}, Lc/a/a/k/d;->O(Ljava/lang/Class;Ljava/lang/reflect/Member;I)Z

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v14

    array-length v0, v14

    if-lez v0, :cond_22

    if-eqz p6, :cond_1b

    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    move-object v12, v0

    goto :goto_13

    :cond_1b
    move-object v12, v14

    :goto_13
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v17

    move v7, v9

    :goto_14
    array-length v0, v14

    if-ge v7, v0, :cond_1f

    aget-object v0, v17, v7

    array-length v1, v0

    move v2, v9

    :goto_15
    if-ge v2, v1, :cond_1d

    aget-object v3, v0, v2

    instance-of v4, v3, Lc/a/a/h/b;

    if-eqz v4, :cond_1c

    check-cast v3, Lc/a/a/h/b;

    goto :goto_16

    :cond_1c
    add-int/lit8 v2, v2, 0x1

    goto :goto_15

    :cond_1d
    move-object/from16 v3, v16

    :goto_16
    if-eqz v3, :cond_1e

    aget-object v4, v14, v7

    aget-object v5, v12, v7

    invoke-interface {v3}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v6, v23

    move-object/from16 v2, v24

    invoke-static {v11, v0, v2, v6}, Lc/a/a/k/d;->C(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/Map;)Ljava/lang/reflect/Field;

    move-result-object v19

    invoke-interface {v3}, Lc/a/a/h/b;->ordinal()I

    move-result v20

    invoke-interface {v3}, Lc/a/a/h/b;->serialzeFeatures()[Lc/a/a/j/a0;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/j/a0;->a([Lc/a/a/j/a0;)I

    move-result v21

    new-instance v1, Lc/a/a/k/a;

    invoke-interface {v3}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v3

    move-object v0, v1

    move-object v9, v1

    move-object v1, v3

    move-object v3, v2

    move-object/from16 v2, p0

    move-object/from16 v24, v14

    move-object v14, v3

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v5, v19

    move-object/from16 v25, v14

    move-object v14, v6

    move/from16 v6, v20

    move/from16 v19, v7

    move/from16 v7, v21

    invoke-direct/range {v0 .. v7}, Lc/a/a/k/a;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;II)V

    invoke-static {v10, v9, v13}, Lc/a/a/i/h;->a(Ljava/util/List;Lc/a/a/k/a;Z)Z

    add-int/lit8 v7, v19, 0x1

    move-object/from16 v23, v14

    move-object/from16 v14, v24

    move-object/from16 v24, v25

    const/4 v9, 0x0

    goto :goto_14

    :cond_1e
    new-instance v0, Lc/a/a/d;

    invoke-direct {v0, v8}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    new-array v5, v0, [Lc/a/a/k/a;

    invoke-interface {v10, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    new-array v1, v0, [Lc/a/a/k/a;

    const/4 v2, 0x0

    invoke-static {v5, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    invoke-static {v5, v1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_20

    move-object v6, v5

    goto :goto_17

    :cond_20
    move-object v6, v1

    :goto_17
    if-eqz p4, :cond_21

    const-class v0, Lc/a/a/h/c;

    invoke-virtual {v11, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lc/a/a/h/c;

    move-object v7, v0

    goto :goto_18

    :cond_21
    move-object/from16 v7, v16

    :goto_18
    new-instance v9, Lc/a/a/i/h;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v9

    move-object/from16 v1, p0

    move-object v4, v15

    move-object/from16 v8, v18

    invoke-direct/range {v0 .. v8}, Lc/a/a/i/h;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;[Lc/a/a/k/a;[Lc/a/a/k/a;Lc/a/a/h/c;[Ljava/lang/String;)V

    return-object v9

    :cond_22
    move-object/from16 v14, v23

    move v8, v9

    goto/16 :goto_12

    :cond_23
    move-object/from16 v14, v23

    move-object/from16 v25, v24

    if-nez v2, :cond_31

    const-string v2, "default constructor not found. "

    if-eqz v1, :cond_30

    array-length v1, v0

    if-lez v1, :cond_30

    invoke-static/range {p0 .. p0}, Lc/a/a/k/d;->F(Ljava/lang/Class;)[Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2f

    array-length v1, v0

    move-object/from16 v9, v22

    const/4 v7, 0x0

    :goto_19
    if-ge v7, v1, :cond_26

    aget-object v2, v0, v7

    invoke-virtual {v2}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v3

    array-length v4, v3

    if-lez v4, :cond_24

    array-length v4, v3

    const/4 v5, 0x1

    sub-int/2addr v4, v5

    aget-object v4, v3, v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "e.f.a.a"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_24

    goto :goto_1a

    :cond_24
    if-eqz v9, :cond_25

    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v4

    array-length v4, v4

    array-length v3, v3

    if-lt v4, v3, :cond_25

    goto :goto_1a

    :cond_25
    move-object v9, v2

    :goto_1a
    add-int/lit8 v7, v7, 0x1

    goto :goto_19

    :cond_26
    const/4 v2, 0x1

    invoke-virtual {v9, v2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    invoke-static {v11, v9, v12}, Lc/a/a/k/d;->O(Ljava/lang/Class;Ljava/lang/reflect/Member;I)Z

    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v7

    if-eqz p6, :cond_27

    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v0

    move-object/from16 v17, v0

    goto :goto_1b

    :cond_27
    move-object/from16 v17, v7

    :goto_1b
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterAnnotations()[[Ljava/lang/annotation/Annotation;

    move-result-object v18

    const/4 v6, 0x0

    :goto_1c
    array-length v0, v7

    if-ge v6, v0, :cond_2d

    aget-object v0, v8, v6

    aget-object v1, v18, v6

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1d
    if-ge v3, v2, :cond_29

    aget-object v4, v1, v3

    instance-of v5, v4, Lc/a/a/h/b;

    if-eqz v5, :cond_28

    check-cast v4, Lc/a/a/h/b;

    goto :goto_1e

    :cond_28
    add-int/lit8 v3, v3, 0x1

    goto :goto_1d

    :cond_29
    move-object/from16 v4, v16

    :goto_1e
    aget-object v3, v7, v6

    aget-object v5, v17, v6

    move-object/from16 v2, v25

    invoke-static {v11, v0, v2, v14}, Lc/a/a/k/d;->C(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/Map;)Ljava/lang/reflect/Field;

    move-result-object v1

    if-eqz v1, :cond_2a

    if-nez v4, :cond_2a

    const-class v4, Lc/a/a/h/b;

    invoke-virtual {v1, v4}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v4

    check-cast v4, Lc/a/a/h/b;

    :cond_2a
    if-eqz v4, :cond_2c

    invoke-interface {v4}, Lc/a/a/h/b;->ordinal()I

    move-result v21

    invoke-interface {v4}, Lc/a/a/h/b;->serialzeFeatures()[Lc/a/a/j/a0;

    move-result-object v22

    invoke-static/range {v22 .. v22}, Lc/a/a/j/a0;->a([Lc/a/a/j/a0;)I

    move-result v22

    invoke-interface {v4}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v24

    if-eqz v24, :cond_2b

    move-object v0, v4

    :cond_2b
    move-object v4, v0

    goto :goto_1f

    :cond_2c
    move-object v4, v0

    const/16 v21, 0x0

    const/16 v22, 0x0

    :goto_1f
    new-instance v0, Lc/a/a/k/a;

    move-object/from16 v24, v0

    move-object/from16 v25, v1

    move-object v1, v4

    move-object/from16 v26, v2

    move-object/from16 v2, p0

    move-object v4, v5

    move-object/from16 v5, v25

    move/from16 v25, v6

    move/from16 v6, v21

    move-object/from16 v21, v7

    move/from16 v7, v22

    invoke-direct/range {v0 .. v7}, Lc/a/a/k/a;-><init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;II)V

    invoke-static {v10, v0, v13}, Lc/a/a/i/h;->a(Ljava/util/List;Lc/a/a/k/a;Z)Z

    add-int/lit8 v6, v25, 0x1

    move-object/from16 v7, v21

    move-object/from16 v25, v26

    goto :goto_1c

    :cond_2d
    move-object/from16 v26, v25

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [Lc/a/a/k/a;

    invoke-interface {v10, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    new-array v2, v0, [Lc/a/a/k/a;

    const/4 v8, 0x0

    invoke-static {v1, v8, v2, v8, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    new-array v2, v0, [Ljava/lang/String;

    move v7, v8

    :goto_20
    if-ge v7, v0, :cond_2e

    aget-object v3, v1, v7

    iget-object v3, v3, Lc/a/a/k/a;->b:Ljava/lang/String;

    aput-object v3, v2, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_20

    :cond_2e
    move-object/from16 v18, v2

    move-object/from16 v22, v9

    goto :goto_21

    :cond_2f
    new-instance v0, Lc/a/a/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_30
    new-instance v0, Lc/a/a/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    move-object/from16 v26, v25

    const/4 v8, 0x0

    :goto_21
    move-object/from16 v9, v30

    :goto_22
    if-eqz v9, :cond_32

    invoke-static {v11, v9, v12}, Lc/a/a/k/d;->O(Ljava/lang/Class;Ljava/lang/reflect/Member;I)Z

    :cond_32
    const/4 v7, 0x3

    const/4 v6, 0x4

    if-nez v13, :cond_4a

    move-object/from16 v5, v29

    array-length v4, v5

    move v3, v8

    :goto_23
    if-ge v3, v4, :cond_49

    aget-object v2, v5, v3

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v1, v6, :cond_34

    :cond_33
    move/from16 v29, v3

    move/from16 v24, v4

    move-object/from16 v31, v5

    move-object/from16 v17, v9

    move-object/from16 v25, v15

    move-object/from16 v33, v26

    const/16 v27, 0x1

    :goto_24
    move-object v15, v10

    move-object/from16 v26, v14

    goto/16 :goto_2e

    :cond_34
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    if-eq v1, v6, :cond_35

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v6

    if-ne v1, v6, :cond_33

    :cond_35
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    const/4 v6, 0x1

    if-eq v1, v6, :cond_36

    :goto_25
    move/from16 v29, v3

    move/from16 v24, v4

    move-object/from16 v31, v5

    move/from16 v27, v6

    move-object/from16 v17, v9

    move-object/from16 v25, v15

    move-object/from16 v33, v26

    goto :goto_24

    :cond_36
    if-eqz p5, :cond_37

    const-class v1, Lc/a/a/h/b;

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lc/a/a/h/b;

    goto :goto_26

    :cond_37
    move-object/from16 v1, v16

    :goto_26
    if-nez v1, :cond_38

    if-eqz p5, :cond_38

    invoke-static {v11, v2}, Lc/a/a/k/d;->G(Ljava/lang/Class;Ljava/lang/reflect/Method;)Lc/a/a/h/b;

    move-result-object v1

    :cond_38
    move-object/from16 v19, v1

    if-eqz v19, :cond_3b

    invoke-interface/range {v19 .. v19}, Lc/a/a/h/b;->deserialize()Z

    move-result v1

    if-nez v1, :cond_39

    goto :goto_25

    :cond_39
    invoke-interface/range {v19 .. v19}, Lc/a/a/h/b;->ordinal()I

    move-result v21

    invoke-interface/range {v19 .. v19}, Lc/a/a/h/b;->serialzeFeatures()[Lc/a/a/j/a0;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/j/a0;->a([Lc/a/a/j/a0;)I

    move-result v23

    invoke-interface/range {v19 .. v19}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_3a

    invoke-interface/range {v19 .. v19}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Lc/a/a/k/a;

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v27, v0

    move-object/from16 v28, v2

    move/from16 v29, v3

    move-object/from16 v3, v24

    move/from16 v24, v4

    move-object/from16 v4, p0

    move-object/from16 v30, v5

    move-object/from16 v5, p2

    move/from16 v17, v6

    move/from16 v6, v21

    move/from16 v7, v23

    move/from16 v17, v8

    move-object/from16 v31, v30

    move-object/from16 v8, v19

    move-object/from16 v17, v9

    move-object/from16 v32, v26

    move-object/from16 v9, v25

    move-object/from16 v25, v15

    move-object v15, v10

    move/from16 v10, p6

    invoke-direct/range {v0 .. v10}, Lc/a/a/k/a;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILc/a/a/h/b;Lc/a/a/h/b;Z)V

    invoke-static {v15, v0, v13}, Lc/a/a/i/h;->a(Ljava/util/List;Lc/a/a/k/a;Z)Z

    move-object/from16 v10, v28

    invoke-static {v11, v10, v12}, Lc/a/a/k/d;->O(Ljava/lang/Class;Ljava/lang/reflect/Member;I)Z

    goto :goto_28

    :cond_3a
    move/from16 v29, v3

    move/from16 v24, v4

    move-object/from16 v31, v5

    move-object/from16 v17, v9

    move-object/from16 v25, v15

    move-object/from16 v32, v26

    move-object v15, v10

    move-object v10, v2

    move/from16 v7, v21

    goto :goto_27

    :cond_3b
    move/from16 v29, v3

    move/from16 v24, v4

    move-object/from16 v31, v5

    move-object/from16 v17, v9

    move-object/from16 v25, v15

    move-object/from16 v32, v26

    move-object v15, v10

    move-object v10, v2

    const/4 v7, 0x0

    const/16 v23, 0x0

    :goto_27
    const-string v1, "set"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3d

    :cond_3c
    :goto_28
    move-object/from16 v26, v14

    move-object/from16 v33, v32

    const/16 v27, 0x1

    goto/16 :goto_2e

    :cond_3d
    const/4 v9, 0x3

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v2

    if-eqz v2, :cond_3f

    sget-boolean v1, Lc/a/a/k/d;->a:Z

    if-eqz v1, :cond_3e

    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/k/d;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v6, v32

    const/4 v8, 0x4

    goto :goto_2a

    :cond_3e
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v8, 0x4

    invoke-virtual {v0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_29

    :cond_3f
    const/4 v8, 0x4

    const/16 v2, 0x5f

    if-ne v1, v2, :cond_40

    invoke-virtual {v0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :goto_29
    move-object/from16 v6, v32

    goto :goto_2a

    :cond_40
    const/16 v2, 0x66

    if-ne v1, v2, :cond_41

    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_29

    :cond_41
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x5

    if-lt v1, v2, :cond_3c

    invoke-virtual {v0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-virtual {v0, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/k/d;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_29

    :goto_2a
    invoke-static {v11, v0, v6, v14}, Lc/a/a/k/d;->C(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/Map;)Ljava/lang/reflect/Field;

    move-result-object v1

    if-nez v1, :cond_43

    invoke-virtual {v10}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v2

    const/4 v5, 0x0

    aget-object v2, v2, v5

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    if-ne v2, v3, :cond_42

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "is"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1, v6, v14}, Lc/a/a/k/d;->C(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/reflect/Field;Ljava/util/Map;)Ljava/lang/reflect/Field;

    move-result-object v1

    goto :goto_2b

    :cond_42
    const/4 v4, 0x1

    goto :goto_2b

    :cond_43
    const/4 v4, 0x1

    const/4 v5, 0x0

    :goto_2b
    move-object v3, v1

    if-eqz v3, :cond_46

    if-eqz p5, :cond_44

    const-class v1, Lc/a/a/h/b;

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lc/a/a/h/b;

    move-object/from16 v21, v1

    goto :goto_2c

    :cond_44
    move-object/from16 v21, v16

    :goto_2c
    if-eqz v21, :cond_46

    invoke-interface/range {v21 .. v21}, Lc/a/a/h/b;->ordinal()I

    move-result v7

    invoke-interface/range {v21 .. v21}, Lc/a/a/h/b;->serialzeFeatures()[Lc/a/a/j/a0;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/j/a0;->a([Lc/a/a/j/a0;)I

    move-result v23

    invoke-interface/range {v21 .. v21}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_45

    invoke-interface/range {v21 .. v21}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lc/a/a/k/a;

    move-object v0, v2

    move-object/from16 v26, v14

    move-object v14, v2

    move-object v2, v10

    move/from16 v27, v4

    move-object/from16 v4, p0

    move v10, v5

    move-object/from16 v5, p2

    move-object/from16 v33, v6

    move v6, v7

    move/from16 v7, v23

    move-object/from16 v8, v19

    move-object/from16 v9, v21

    move/from16 v10, p6

    invoke-direct/range {v0 .. v10}, Lc/a/a/k/a;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILc/a/a/h/b;Lc/a/a/h/b;Z)V

    invoke-static {v15, v14, v13}, Lc/a/a/i/h;->a(Ljava/util/List;Lc/a/a/k/a;Z)Z

    goto :goto_2e

    :cond_45
    move/from16 v27, v4

    move-object/from16 v33, v6

    move-object/from16 v26, v14

    if-nez v19, :cond_47

    move-object/from16 v14, p7

    move v6, v7

    move-object/from16 v8, v21

    goto :goto_2d

    :cond_46
    move/from16 v27, v4

    move-object/from16 v33, v6

    move-object/from16 v26, v14

    :cond_47
    move-object/from16 v14, p7

    move v6, v7

    move-object/from16 v8, v19

    :goto_2d
    move/from16 v7, v23

    if-eqz v14, :cond_48

    invoke-virtual {v14, v0}, Lc/a/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_48
    move-object v1, v0

    new-instance v9, Lc/a/a/k/a;

    const/4 v3, 0x0

    const/16 v19, 0x0

    move-object v0, v9

    move-object v2, v10

    move-object/from16 v4, p0

    move-object/from16 v5, p2

    move-object/from16 v34, v9

    move-object/from16 v9, v19

    move-object v14, v10

    move/from16 v10, p6

    invoke-direct/range {v0 .. v10}, Lc/a/a/k/a;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILc/a/a/h/b;Lc/a/a/h/b;Z)V

    move-object/from16 v0, v34

    invoke-static {v15, v0, v13}, Lc/a/a/i/h;->a(Ljava/util/List;Lc/a/a/k/a;Z)Z

    invoke-static {v11, v14, v12}, Lc/a/a/k/d;->O(Ljava/lang/Class;Ljava/lang/reflect/Member;I)Z

    :goto_2e
    add-int/lit8 v3, v29, 0x1

    move-object v10, v15

    move-object/from16 v9, v17

    move/from16 v4, v24

    move-object/from16 v15, v25

    move-object/from16 v14, v26

    move-object/from16 v5, v31

    move-object/from16 v26, v33

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x0

    goto/16 :goto_23

    :cond_49
    move-object/from16 v31, v5

    move-object/from16 v17, v9

    move-object/from16 v25, v15

    move-object/from16 v33, v26

    goto :goto_2f

    :cond_4a
    move-object/from16 v17, v9

    move-object/from16 v25, v15

    move-object/from16 v33, v26

    move-object/from16 v31, v29

    :goto_2f
    const/16 v27, 0x1

    move-object v15, v10

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v1, v33

    array-length v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, v1

    const/4 v7, 0x0

    :goto_30
    if-ge v7, v2, :cond_50

    aget-object v3, v1, v7

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    and-int/lit8 v5, v4, 0x8

    if-eqz v5, :cond_4b

    goto :goto_33

    :cond_4b
    and-int/lit8 v4, v4, 0x10

    if-eqz v4, :cond_4e

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v4

    const-class v5, Ljava/util/Map;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-nez v5, :cond_4d

    const-class v5, Ljava/util/Collection;

    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_4c

    goto :goto_31

    :cond_4c
    const/4 v8, 0x0

    goto :goto_32

    :cond_4d
    :goto_31
    move/from16 v8, v27

    :goto_32
    if-nez v8, :cond_4e

    goto :goto_33

    :cond_4e
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    and-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_4f

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4f
    :goto_33
    add-int/lit8 v7, v7, 0x1

    goto :goto_30

    :cond_50
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    :goto_34
    if-eqz v1, :cond_57

    move-object/from16 v2, v20

    if-eq v1, v2, :cond_57

    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    array-length v4, v3

    const/4 v7, 0x0

    :goto_35
    if-ge v7, v4, :cond_56

    aget-object v5, v3, v7

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v6

    and-int/lit8 v8, v6, 0x8

    if-eqz v8, :cond_51

    goto :goto_38

    :cond_51
    and-int/lit8 v8, v6, 0x10

    if-eqz v8, :cond_54

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v8

    const-class v9, Ljava/util/Map;

    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v9

    if-nez v9, :cond_53

    const-class v9, Ljava/util/Collection;

    invoke-virtual {v9, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_52

    goto :goto_36

    :cond_52
    const/4 v8, 0x0

    goto :goto_37

    :cond_53
    :goto_36
    move/from16 v8, v27

    :goto_37
    if-nez v8, :cond_54

    goto :goto_38

    :cond_54
    and-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_55

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_55
    :goto_38
    add-int/lit8 v7, v7, 0x1

    goto :goto_35

    :cond_56
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v1

    move-object/from16 v20, v2

    goto :goto_34

    :cond_57
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_39
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5f

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/reflect/Field;

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_3a
    if-ge v7, v1, :cond_59

    invoke-interface {v15, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/k/a;

    iget-object v2, v2, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_58

    move/from16 v8, v27

    :cond_58
    add-int/lit8 v7, v7, 0x1

    goto :goto_3a

    :cond_59
    if-eqz v8, :cond_5a

    goto :goto_39

    :cond_5a
    if-eqz p5, :cond_5b

    const-class v1, Lc/a/a/h/b;

    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lc/a/a/h/b;

    move-object v9, v1

    goto :goto_3b

    :cond_5b
    move-object/from16 v9, v16

    :goto_3b
    if-eqz v9, :cond_5d

    invoke-interface {v9}, Lc/a/a/h/b;->ordinal()I

    move-result v1

    invoke-interface {v9}, Lc/a/a/h/b;->serialzeFeatures()[Lc/a/a/j/a0;

    move-result-object v2

    invoke-static {v2}, Lc/a/a/j/a0;->a([Lc/a/a/j/a0;)I

    move-result v2

    invoke-interface {v9}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_5c

    invoke-interface {v9}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v0

    :cond_5c
    move-object/from16 v10, p7

    move v6, v1

    move v7, v2

    goto :goto_3c

    :cond_5d
    move-object/from16 v10, p7

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_3c
    if-eqz v10, :cond_5e

    invoke-virtual {v10, v0}, Lc/a/a/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_5e
    move-object v1, v0

    invoke-static {v11, v3, v12}, Lc/a/a/k/d;->O(Ljava/lang/Class;Ljava/lang/reflect/Member;I)Z

    new-instance v8, Lc/a/a/k/a;

    const/4 v2, 0x0

    const/16 v19, 0x0

    move-object v0, v8

    move-object/from16 v4, p0

    move-object/from16 v5, p2

    move-object/from16 v35, v8

    move-object/from16 v8, v19

    move/from16 v10, p6

    invoke-direct/range {v0 .. v10}, Lc/a/a/k/a;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILc/a/a/h/b;Lc/a/a/h/b;Z)V

    move-object/from16 v0, v35

    invoke-static {v15, v0, v13}, Lc/a/a/i/h;->a(Ljava/util/List;Lc/a/a/k/a;Z)Z

    goto/16 :goto_39

    :cond_5f
    if-nez v13, :cond_67

    move-object/from16 v14, v31

    array-length v10, v14

    const/4 v9, 0x0

    :goto_3d
    if-ge v9, v10, :cond_67

    aget-object v8, v14, v9

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v7, 0x4

    if-ge v1, v7, :cond_60

    goto/16 :goto_41

    :cond_60
    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_66

    const/4 v6, 0x3

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v1

    if-eqz v1, :cond_65

    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v1, v1

    if-eqz v1, :cond_61

    goto/16 :goto_40

    :cond_61
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    const-class v2, Ljava/util/Collection;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-nez v2, :cond_62

    const-class v2, Ljava/util/Map;

    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_65

    :cond_62
    if-eqz p5, :cond_63

    const-class v1, Lc/a/a/h/b;

    invoke-virtual {v8, v1}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lc/a/a/h/b;

    move-object/from16 v19, v1

    goto :goto_3e

    :cond_63
    move-object/from16 v19, v16

    :goto_3e
    if-eqz v19, :cond_64

    invoke-interface/range {v19 .. v19}, Lc/a/a/h/b;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_64

    goto :goto_3f

    :cond_64
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    :goto_3f
    new-instance v5, Lc/a/a/k/a;

    const/4 v3, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object v0, v5

    move-object v2, v8

    move-object/from16 v4, p0

    move-object/from16 v36, v5

    move-object/from16 v5, p2

    move/from16 v24, v6

    move/from16 v6, v20

    move/from16 v20, v7

    move/from16 v7, v21

    move-object/from16 v37, v8

    move-object/from16 v8, v19

    move/from16 v19, v9

    move-object/from16 v9, v23

    move/from16 v21, v10

    move/from16 v10, p6

    invoke-direct/range {v0 .. v10}, Lc/a/a/k/a;-><init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILc/a/a/h/b;Lc/a/a/h/b;Z)V

    move-object/from16 v0, v36

    invoke-static {v15, v0, v13}, Lc/a/a/i/h;->a(Ljava/util/List;Lc/a/a/k/a;Z)Z

    move-object/from16 v0, v37

    invoke-static {v11, v0, v12}, Lc/a/a/k/d;->O(Ljava/lang/Class;Ljava/lang/reflect/Member;I)Z

    goto :goto_42

    :cond_65
    :goto_40
    move/from16 v24, v6

    move/from16 v20, v7

    move/from16 v19, v9

    move/from16 v21, v10

    goto :goto_42

    :cond_66
    :goto_41
    move/from16 v20, v7

    move/from16 v19, v9

    move/from16 v21, v10

    const/16 v24, 0x3

    :goto_42
    add-int/lit8 v9, v19, 0x1

    move/from16 v10, v21

    goto/16 :goto_3d

    :cond_67
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    new-array v5, v0, [Lc/a/a/k/a;

    invoke-interface {v15, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    new-array v6, v0, [Lc/a/a/k/a;

    const/4 v1, 0x0

    invoke-static {v5, v1, v6, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v6}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    if-eqz p4, :cond_68

    const-class v0, Lc/a/a/h/c;

    invoke-virtual {v11, v0}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lc/a/a/h/c;

    move-object v7, v0

    goto :goto_43

    :cond_68
    move-object/from16 v7, v16

    :goto_43
    new-instance v9, Lc/a/a/i/h;

    move-object v0, v9

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    move-object/from16 v3, v22

    move-object/from16 v4, v25

    move-object/from16 v8, v18

    invoke-direct/range {v0 .. v8}, Lc/a/a/i/h;-><init>(Ljava/lang/Class;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Constructor;Ljava/lang/reflect/Method;[Lc/a/a/k/a;[Lc/a/a/k/a;Lc/a/a/h/c;[Ljava/lang/String;)V

    return-object v9
.end method

.method private c([Lc/a/a/k/a;[Lc/a/a/k/a;)[Lc/a/a/k/a;
    .locals 8

    iget-object v0, p0, Lc/a/a/i/h;->g:Lc/a/a/h/c;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    invoke-interface {v0}, Lc/a/a/h/c;->orders()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    array-length v1, v0

    if-eqz v1, :cond_14

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, v0

    const/4 v4, 0x1

    if-ge v2, v3, :cond_4

    move v3, v1

    :goto_1
    array-length v5, p2

    if-ge v3, v5, :cond_2

    aget-object v5, p2, v3

    iget-object v5, v5, Lc/a/a/k/a;->b:Ljava/lang/String;

    aget-object v6, v0, v2

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v3, v4

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_2
    if-nez v3, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    move v2, v4

    :goto_3
    if-nez v2, :cond_5

    return-object p2

    :cond_5
    array-length v2, v0

    array-length p1, p1

    if-ne v2, p1, :cond_c

    move p1, v1

    :goto_4
    array-length v2, v0

    if-ge p1, v2, :cond_7

    aget-object v2, p2, p1

    iget-object v2, v2, Lc/a/a/k/a;->b:Ljava/lang/String;

    aget-object v3, v0, p1

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    move p1, v1

    goto :goto_5

    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_4

    :cond_7
    move p1, v4

    :goto_5
    if-eqz p1, :cond_8

    return-object p2

    :cond_8
    array-length p1, p2

    new-array p1, p1, [Lc/a/a/k/a;

    move v2, v1

    :goto_6
    array-length v3, v0

    if-ge v2, v3, :cond_b

    move v3, v1

    :goto_7
    array-length v5, p2

    if-ge v3, v5, :cond_a

    aget-object v5, p2, v3

    iget-object v5, v5, Lc/a/a/k/a;->b:Ljava/lang/String;

    aget-object v6, v0, v2

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    aget-object v3, p2, v3

    aput-object v3, p1, v2

    goto :goto_8

    :cond_9
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_a
    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_b
    iput-boolean v4, p0, Lc/a/a/i/h;->h:Z

    return-object p1

    :cond_c
    array-length p1, p2

    new-array v2, p1, [Lc/a/a/k/a;

    move v3, v1

    :goto_9
    array-length v5, v0

    if-ge v3, v5, :cond_f

    move v5, v1

    :goto_a
    array-length v6, p2

    if-ge v5, v6, :cond_e

    aget-object v6, p2, v5

    iget-object v6, v6, Lc/a/a/k/a;->b:Ljava/lang/String;

    aget-object v7, v0, v3

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    aget-object v5, p2, v5

    aput-object v5, v2, v3

    goto :goto_b

    :cond_d
    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_e
    :goto_b
    add-int/lit8 v3, v3, 0x1

    goto :goto_9

    :cond_f
    array-length v0, v0

    move v3, v1

    :goto_c
    array-length v5, p2

    if-ge v3, v5, :cond_13

    move v5, v1

    :goto_d
    if-ge v5, p1, :cond_11

    if-ge v5, v0, :cond_11

    aget-object v6, v2, v3

    aget-object v7, p2, v5

    invoke-virtual {v6, v7}, Lc/a/a/k/a;->b(Lc/a/a/k/a;)Z

    move-result v6

    if-eqz v6, :cond_10

    move v5, v4

    goto :goto_e

    :cond_10
    add-int/lit8 v5, v5, 0x1

    goto :goto_d

    :cond_11
    move v5, v1

    :goto_e
    if-nez v5, :cond_12

    aget-object v5, p2, v3

    aput-object v5, v2, v0

    add-int/lit8 v0, v0, 0x1

    :cond_12
    add-int/lit8 v3, v3, 0x1

    goto :goto_c

    :cond_13
    iput-boolean v4, p0, Lc/a/a/i/h;->h:Z

    :cond_14
    return-object p2
.end method
