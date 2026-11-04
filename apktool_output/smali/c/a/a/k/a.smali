.class public Lc/a/a/k/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lc/a/a/k/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/reflect/Method;

.field public final d:Ljava/lang/reflect/Field;

.field public final e:Z

.field public final f:Z

.field private g:I

.field public final h:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final i:Ljava/lang/reflect/Type;

.field public final j:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public final k:Z

.field private final l:Lc/a/a/h/b;

.field private final m:Lc/a/a/h/b;

.field public final n:Z

.field public final o:Ljava/lang/String;

.field public final p:J

.field public final q:[Ljava/lang/String;

.field public final r:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Field;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Field;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lc/a/a/k/a;->g:I

    if-gez p6, :cond_0

    move p6, v0

    :cond_0
    iput-object p1, p0, Lc/a/a/k/a;->b:Ljava/lang/String;

    iput-object p2, p0, Lc/a/a/k/a;->j:Ljava/lang/Class;

    iput-object p3, p0, Lc/a/a/k/a;->h:Ljava/lang/Class;

    iput-object p4, p0, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    const/4 p2, 0x0

    iput-object p2, p0, Lc/a/a/k/a;->c:Ljava/lang/reflect/Method;

    iput-object p5, p0, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    iput p6, p0, Lc/a/a/k/a;->g:I

    iput p7, p0, Lc/a/a/k/a;->r:I

    invoke-virtual {p3}, Ljava/lang/Class;->isEnum()Z

    move-result p4

    const/4 p6, 0x1

    if-eqz p4, :cond_1

    const-class p4, Lc/a/a/c;

    invoke-virtual {p4, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p3

    if-nez p3, :cond_1

    move p3, p6

    goto :goto_0

    :cond_1
    move p3, v0

    :goto_0
    iput-boolean p3, p0, Lc/a/a/k/a;->n:Z

    iput-object p2, p0, Lc/a/a/k/a;->l:Lc/a/a/h/b;

    iput-object p2, p0, Lc/a/a/k/a;->m:Lc/a/a/h/b;

    if-eqz p5, :cond_2

    invoke-virtual {p5}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result p3

    and-int/lit8 p4, p3, 0x1

    iput-boolean p6, p0, Lc/a/a/k/a;->e:Z

    invoke-static {p3}, Ljava/lang/reflect/Modifier;->isTransient(I)Z

    move-result p3

    iput-boolean p3, p0, Lc/a/a/k/a;->f:Z

    goto :goto_1

    :cond_2
    iput-boolean v0, p0, Lc/a/a/k/a;->e:Z

    iput-boolean v0, p0, Lc/a/a/k/a;->f:Z

    :goto_1
    iput-boolean v0, p0, Lc/a/a/k/a;->k:Z

    const-wide p3, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    move p5, v0

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p6

    if-ge p5, p6, :cond_3

    invoke-virtual {p1, p5}, Ljava/lang/String;->charAt(I)C

    move-result p6

    int-to-long p6, p6

    xor-long/2addr p3, p6

    const-wide p6, 0x100000001b3L

    mul-long/2addr p3, p6

    add-int/lit8 p5, p5, 0x1

    goto :goto_2

    :cond_3
    iput-wide p3, p0, Lc/a/a/k/a;->p:J

    iput-object p2, p0, Lc/a/a/k/a;->o:Ljava/lang/String;

    new-array p1, v0, [Ljava/lang/String;

    iput-object p1, p0, Lc/a/a/k/a;->q:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Ljava/lang/Class;Ljava/lang/reflect/Type;IILc/a/a/h/b;Lc/a/a/h/b;Z)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Field;",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "II",
            "Lc/a/a/h/b;",
            "Lc/a/a/h/b;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    const-class v6, Lc/a/a/c;

    const-class v7, Ljava/lang/Object;

    const-class v8, Ljava/lang/String;

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const/4 v9, 0x0

    iput v9, v0, Lc/a/a/k/a;->g:I

    if-gez p6, :cond_0

    move v10, v9

    goto :goto_0

    :cond_0
    move/from16 v10, p6

    :goto_0
    iput-object v1, v0, Lc/a/a/k/a;->b:Ljava/lang/String;

    iput-object v2, v0, Lc/a/a/k/a;->c:Ljava/lang/reflect/Method;

    iput-object v3, v0, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    iput v10, v0, Lc/a/a/k/a;->g:I

    move-object/from16 v10, p8

    iput-object v10, v0, Lc/a/a/k/a;->m:Lc/a/a/h/b;

    move-object/from16 v10, p9

    iput-object v10, v0, Lc/a/a/k/a;->l:Lc/a/a/h/b;

    move/from16 v10, p7

    iput v10, v0, Lc/a/a/k/a;->r:I

    invoke-virtual/range {p0 .. p0}, Lc/a/a/k/a;->d()Lc/a/a/h/b;

    move-result-object v10

    const/4 v11, 0x0

    if-eqz v10, :cond_2

    invoke-interface {v10}, Lc/a/a/h/b;->format()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v13

    if-nez v13, :cond_1

    move-object v12, v11

    :cond_1
    invoke-interface {v10}, Lc/a/a/h/b;->alternateNames()[Ljava/lang/String;

    move-result-object v10

    iput-object v10, v0, Lc/a/a/k/a;->q:[Ljava/lang/String;

    goto :goto_1

    :cond_2
    new-array v10, v9, [Ljava/lang/String;

    iput-object v10, v0, Lc/a/a/k/a;->q:[Ljava/lang/String;

    move-object v12, v11

    :goto_1
    iput-object v12, v0, Lc/a/a/k/a;->o:Ljava/lang/String;

    if-eqz v3, :cond_6

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v12

    if-eqz v2, :cond_4

    and-int/lit8 v13, v12, 0x1

    if-eqz v13, :cond_3

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v13

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v14

    if-ne v13, v14, :cond_3

    goto :goto_2

    :cond_3
    move v13, v9

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v13, 0x1

    :goto_3
    iput-boolean v13, v0, Lc/a/a/k/a;->e:Z

    and-int/lit16 v12, v12, 0x80

    if-eqz v12, :cond_5

    const/4 v12, 0x1

    goto :goto_4

    :cond_5
    move v12, v9

    :goto_4
    iput-boolean v12, v0, Lc/a/a/k/a;->f:Z

    goto :goto_5

    :cond_6
    iput-boolean v9, v0, Lc/a/a/k/a;->e:Z

    iput-boolean v9, v0, Lc/a/a/k/a;->f:Z

    :goto_5
    const-wide v12, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    move v14, v9

    :goto_6
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v15

    if-ge v14, v15, :cond_7

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v15

    int-to-long v9, v15

    xor-long/2addr v9, v12

    const-wide v12, 0x100000001b3L

    mul-long/2addr v12, v9

    add-int/lit8 v14, v14, 0x1

    const/4 v9, 0x0

    goto :goto_6

    :cond_7
    iput-wide v12, v0, Lc/a/a/k/a;->p:J

    if-eqz v2, :cond_d

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v1

    array-length v3, v1

    const/4 v9, 0x1

    if-ne v3, v9, :cond_a

    const/4 v9, 0x0

    aget-object v1, v1, v9

    const-class v3, Ljava/lang/Class;

    if-eq v1, v3, :cond_9

    if-eq v1, v8, :cond_9

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_7

    :cond_8
    if-eqz p10, :cond_9

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v3

    aget-object v3, v3, v9

    goto :goto_8

    :cond_9
    :goto_7
    move-object v3, v1

    :goto_8
    iput-boolean v9, v0, Lc/a/a/k/a;->k:Z

    const/4 v10, 0x1

    goto :goto_b

    :cond_a
    const/4 v9, 0x0

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    move-result-object v1

    const-class v3, Ljava/lang/Class;

    if-ne v1, v3, :cond_c

    :cond_b
    move-object v3, v1

    :goto_9
    const/4 v10, 0x1

    goto :goto_a

    :cond_c
    if-eqz p10, :cond_b

    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v3

    goto :goto_9

    :goto_a
    iput-boolean v10, v0, Lc/a/a/k/a;->k:Z

    :goto_b
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v2

    iput-object v2, v0, Lc/a/a/k/a;->j:Ljava/lang/Class;

    goto :goto_e

    :cond_d
    const/4 v9, 0x0

    const/4 v10, 0x1

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-nez v2, :cond_f

    if-eq v1, v8, :cond_f

    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_c

    :cond_e
    if-eqz p10, :cond_f

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    move-result-object v2

    goto :goto_d

    :cond_f
    :goto_c
    move-object v2, v1

    :goto_d
    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v8

    iput-object v8, v0, Lc/a/a/k/a;->j:Ljava/lang/Class;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v3

    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    move-result v3

    iput-boolean v3, v0, Lc/a/a/k/a;->k:Z

    move-object v3, v2

    :goto_e
    if-eqz v4, :cond_16

    if-ne v1, v7, :cond_16

    instance-of v2, v3, Ljava/lang/reflect/TypeVariable;

    if-eqz v2, :cond_16

    move-object v2, v3

    check-cast v2, Ljava/lang/reflect/TypeVariable;

    instance-of v8, v5, Ljava/lang/reflect/ParameterizedType;

    if-eqz v8, :cond_10

    move-object v8, v5

    check-cast v8, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v8}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v8

    goto :goto_f

    :cond_10
    move-object v8, v11

    :goto_f
    move-object v12, v4

    :goto_10
    if-eqz v12, :cond_12

    if-eq v12, v7, :cond_12

    iget-object v13, v0, Lc/a/a/k/a;->j:Ljava/lang/Class;

    if-eq v12, v13, :cond_12

    invoke-virtual {v12}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object v13

    instance-of v14, v13, Ljava/lang/reflect/ParameterizedType;

    if-eqz v14, :cond_11

    check-cast v13, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v13}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v13

    invoke-virtual {v12}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v14

    invoke-static {v13, v14, v8}, Lc/a/a/k/d;->y([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z

    move-object v8, v13

    :cond_11
    invoke-virtual {v12}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v12

    goto :goto_10

    :cond_12
    if-eqz v8, :cond_14

    iget-object v7, v0, Lc/a/a/k/a;->j:Ljava/lang/Class;

    invoke-virtual {v7}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v7

    move v12, v9

    :goto_11
    array-length v13, v7

    if-ge v12, v13, :cond_14

    aget-object v13, v7, v12

    invoke-virtual {v2, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_13

    aget-object v11, v8, v12

    goto :goto_12

    :cond_13
    add-int/lit8 v12, v12, 0x1

    goto :goto_11

    :cond_14
    :goto_12
    if-eqz v11, :cond_16

    invoke-static {v11}, Lc/a/a/k/d;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    iput-object v2, v0, Lc/a/a/k/a;->h:Ljava/lang/Class;

    iput-object v11, v0, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {v6, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_15

    move v9, v10

    :cond_15
    iput-boolean v9, v0, Lc/a/a/k/a;->n:Z

    return-void

    :cond_16
    instance-of v2, v3, Ljava/lang/Class;

    if-nez v2, :cond_1a

    if-eqz v5, :cond_17

    goto :goto_13

    :cond_17
    move-object v5, v4

    :goto_13
    invoke-static {v4, v5, v3}, Lc/a/a/k/a;->e(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v2

    if-eq v2, v3, :cond_19

    instance-of v3, v2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v3, :cond_18

    :goto_14
    invoke-static {v2}, Lc/a/a/k/d;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v1

    goto :goto_15

    :cond_18
    instance-of v3, v2, Ljava/lang/Class;

    if-eqz v3, :cond_19

    goto :goto_14

    :cond_19
    :goto_15
    move-object v3, v2

    :cond_1a
    iput-object v3, v0, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    iput-object v1, v0, Lc/a/a/k/a;->h:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-nez v2, :cond_1b

    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-virtual {v6, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-nez v1, :cond_1b

    move v9, v10

    :cond_1b
    iput-boolean v9, v0, Lc/a/a/k/a;->n:Z

    return-void
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/reflect/Type;"
        }
    .end annotation

    if-eqz p0, :cond_c

    if-nez p1, :cond_0

    goto/16 :goto_5

    :cond_0
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {v0}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lc/a/a/k/a;->e(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p0

    if-eq v0, p0, :cond_1

    invoke-static {p0}, Lc/a/a/k/d;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0

    :cond_1
    return-object p2

    :cond_2
    invoke-static {p1}, Lc/a/a/k/d;->H(Ljava/lang/reflect/Type;)Z

    move-result v0

    if-nez v0, :cond_3

    return-object p2

    :cond_3
    instance-of v0, p2, Ljava/lang/reflect/TypeVariable;

    if-eqz v0, :cond_5

    invoke-static {p1}, Lc/a/a/k/d;->E(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v0}, Lc/a/a/k/d;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v2

    move-object v3, p2

    check-cast v3, Ljava/lang/reflect/TypeVariable;

    move v4, v1

    :goto_0
    invoke-virtual {v2}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v5

    array-length v5, v5

    if-ge v4, v5, :cond_5

    invoke-virtual {v2}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v5

    aget-object v5, v5, v4

    invoke-interface {v5}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    aget-object p0, p0, v4

    return-object p0

    :cond_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_5
    instance-of v0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_c

    move-object v0, p2

    check-cast v0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v2

    instance-of v3, p1, Ljava/lang/reflect/ParameterizedType;

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    :goto_1
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object p0

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p1

    instance-of p1, p1, Ljava/lang/reflect/ParameterizedType;

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    move-result-object p1

    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    goto :goto_1

    :cond_7
    move-object p0, v4

    move-object p1, p0

    :goto_2
    move v3, v1

    move v5, v3

    :goto_3
    array-length v6, v2

    if-ge v3, v6, :cond_b

    if-eqz p1, :cond_b

    aget-object v6, v2, v3

    instance-of v7, v6, Ljava/lang/reflect/TypeVariable;

    if-eqz v7, :cond_a

    check-cast v6, Ljava/lang/reflect/TypeVariable;

    move v7, v1

    :goto_4
    array-length v8, p0

    if-ge v7, v8, :cond_a

    aget-object v8, p0, v7

    invoke-interface {v8}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v6}, Ljava/lang/reflect/TypeVariable;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    if-nez v4, :cond_8

    invoke-interface {p1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v4

    :cond_8
    aget-object v5, v4, v7

    aput-object v5, v2, v3

    const/4 v5, 0x1

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_b
    if-eqz v5, :cond_c

    new-instance p0, Lc/a/a/k/c;

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object p1

    invoke-interface {v0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-direct {p0, v2, p1, p2}, Lc/a/a/k/c;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    return-object p0

    :cond_c
    :goto_5
    return-object p2
.end method


# virtual methods
.method public a(Lc/a/a/k/a;)I
    .locals 2

    iget v0, p0, Lc/a/a/k/a;->g:I

    iget v1, p1, Lc/a/a/k/a;->g:I

    if-ge v0, v1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-le v0, v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    iget-object p0, p0, Lc/a/a/k/a;->b:Ljava/lang/String;

    iget-object p1, p1, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public b(Lc/a/a/k/a;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0, p1}, Lc/a/a/k/a;->a(Lc/a/a/k/a;)I

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lc/a/a/k/a;->e:Z

    if-eqz v0, :cond_0

    iget-object p0, p0, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    iget-object p0, p0, Lc/a/a/k/a;->c:Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lc/a/a/k/a;

    invoke-virtual {p0, p1}, Lc/a/a/k/a;->a(Lc/a/a/k/a;)I

    move-result p0

    return p0
.end method

.method public d()Lc/a/a/h/b;
    .locals 1

    iget-object v0, p0, Lc/a/a/k/a;->l:Lc/a/a/h/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object p0, p0, Lc/a/a/k/a;->m:Lc/a/a/h/b;

    return-object p0
.end method

.method public f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/k/a;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    new-array p0, p0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, p0, v1

    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    iget-object p0, p0, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lc/a/a/k/a;->b:Ljava/lang/String;

    return-object p0
.end method
