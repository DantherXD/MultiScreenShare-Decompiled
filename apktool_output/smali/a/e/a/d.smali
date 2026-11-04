.class public La/e/a/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/e/a/d$a;,
        La/e/a/d$b;
    }
.end annotation


# static fields
.field public static a:Z = false

.field public static b:Z = true

.field public static c:Z = true

.field public static d:Z = true

.field public static e:Z = false

.field private static f:I = 0x3e8

.field public static g:La/e/a/e;

.field public static h:J

.field public static i:J


# instance fields
.field public j:Z

.field k:I

.field private l:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "La/e/a/i;",
            ">;"
        }
    .end annotation
.end field

.field private m:La/e/a/d$a;

.field private n:I

.field private o:I

.field p:[La/e/a/b;

.field public q:Z

.field public r:Z

.field private s:[Z

.field t:I

.field u:I

.field private v:I

.field final w:La/e/a/c;

.field private x:[La/e/a/i;

.field private y:I

.field private z:La/e/a/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/e/a/d;->j:Z

    iput v0, p0, La/e/a/d;->k:I

    const/4 v1, 0x0

    iput-object v1, p0, La/e/a/d;->l:Ljava/util/HashMap;

    const/16 v2, 0x20

    iput v2, p0, La/e/a/d;->n:I

    iput v2, p0, La/e/a/d;->o:I

    iput-object v1, p0, La/e/a/d;->p:[La/e/a/b;

    iput-boolean v0, p0, La/e/a/d;->q:Z

    iput-boolean v0, p0, La/e/a/d;->r:Z

    new-array v1, v2, [Z

    iput-object v1, p0, La/e/a/d;->s:[Z

    const/4 v1, 0x1

    iput v1, p0, La/e/a/d;->t:I

    iput v0, p0, La/e/a/d;->u:I

    iput v2, p0, La/e/a/d;->v:I

    sget v1, La/e/a/d;->f:I

    new-array v1, v1, [La/e/a/i;

    iput-object v1, p0, La/e/a/d;->x:[La/e/a/i;

    iput v0, p0, La/e/a/d;->y:I

    new-array v0, v2, [La/e/a/b;

    iput-object v0, p0, La/e/a/d;->p:[La/e/a/b;

    invoke-direct {p0}, La/e/a/d;->C()V

    new-instance v0, La/e/a/c;

    invoke-direct {v0}, La/e/a/c;-><init>()V

    iput-object v0, p0, La/e/a/d;->w:La/e/a/c;

    new-instance v1, La/e/a/h;

    invoke-direct {v1, v0}, La/e/a/h;-><init>(La/e/a/c;)V

    iput-object v1, p0, La/e/a/d;->m:La/e/a/d$a;

    sget-boolean v1, La/e/a/d;->e:Z

    if-eqz v1, :cond_0

    new-instance v1, La/e/a/d$b;

    invoke-direct {v1, p0, v0}, La/e/a/d$b;-><init>(La/e/a/d;La/e/a/c;)V

    goto :goto_0

    :cond_0
    new-instance v1, La/e/a/b;

    invoke-direct {v1, v0}, La/e/a/b;-><init>(La/e/a/c;)V

    :goto_0
    iput-object v1, p0, La/e/a/d;->z:La/e/a/d$a;

    return-void
.end method

.method private final B(La/e/a/d$a;Z)I
    .locals 11

    sget-object p2, La/e/a/d;->g:La/e/a/e;

    const/4 v0, 0x0

    if-nez p2, :cond_e

    const/4 p2, 0x0

    move v1, p2

    :goto_0
    iget v2, p0, La/e/a/d;->t:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, La/e/a/d;->s:[Z

    aput-boolean p2, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move v1, p2

    move v2, v1

    :cond_1
    :goto_1
    if-nez v1, :cond_d

    sget-object v3, La/e/a/d;->g:La/e/a/e;

    if-nez v3, :cond_c

    add-int/lit8 v2, v2, 0x1

    iget v3, p0, La/e/a/d;->t:I

    mul-int/lit8 v3, v3, 0x2

    if-lt v2, v3, :cond_2

    return v2

    :cond_2
    invoke-interface {p1}, La/e/a/d$a;->getKey()La/e/a/i;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    iget-object v3, p0, La/e/a/d;->s:[Z

    invoke-interface {p1}, La/e/a/d$a;->getKey()La/e/a/i;

    move-result-object v5

    iget v5, v5, La/e/a/i;->e:I

    aput-boolean v4, v3, v5

    :cond_3
    iget-object v3, p0, La/e/a/d;->s:[Z

    invoke-interface {p1, p0, v3}, La/e/a/d$a;->a(La/e/a/d;[Z)La/e/a/i;

    move-result-object v3

    if-eqz v3, :cond_5

    iget-object v5, p0, La/e/a/d;->s:[Z

    iget v6, v3, La/e/a/i;->e:I

    aget-boolean v7, v5, v6

    if-eqz v7, :cond_4

    return v2

    :cond_4
    aput-boolean v4, v5, v6

    :cond_5
    if-eqz v3, :cond_b

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v5, -0x1

    move v6, p2

    move v7, v5

    :goto_2
    iget v8, p0, La/e/a/d;->u:I

    if-ge v6, v8, :cond_9

    iget-object v8, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v8, v8, v6

    iget-object v9, v8, La/e/a/b;->a:La/e/a/i;

    iget-object v9, v9, La/e/a/i;->l:La/e/a/i$a;

    sget-object v10, La/e/a/i$a;->b:La/e/a/i$a;

    if-ne v9, v10, :cond_6

    goto :goto_3

    :cond_6
    iget-boolean v9, v8, La/e/a/b;->f:Z

    if-eqz v9, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v8, v3}, La/e/a/b;->t(La/e/a/i;)Z

    move-result v9

    if-eqz v9, :cond_8

    iget-object v9, v8, La/e/a/b;->e:La/e/a/b$a;

    invoke-interface {v9, v3}, La/e/a/b$a;->b(La/e/a/i;)F

    move-result v9

    const/4 v10, 0x0

    cmpg-float v10, v9, v10

    if-gez v10, :cond_8

    iget v8, v8, La/e/a/b;->b:F

    neg-float v8, v8

    div-float/2addr v8, v9

    cmpg-float v9, v8, v4

    if-gez v9, :cond_8

    move v7, v6

    move v4, v8

    :cond_8
    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_9
    if-le v7, v5, :cond_1

    iget-object v4, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v4, v4, v7

    iget-object v6, v4, La/e/a/b;->a:La/e/a/i;

    iput v5, v6, La/e/a/i;->f:I

    sget-object v5, La/e/a/d;->g:La/e/a/e;

    if-nez v5, :cond_a

    invoke-virtual {v4, v3}, La/e/a/b;->x(La/e/a/i;)V

    iget-object v3, v4, La/e/a/b;->a:La/e/a/i;

    iput v7, v3, La/e/a/i;->f:I

    invoke-virtual {v3, p0, v4}, La/e/a/i;->h(La/e/a/d;La/e/a/b;)V

    goto/16 :goto_1

    :cond_a
    throw v0

    :cond_b
    move v1, v4

    goto/16 :goto_1

    :cond_c
    throw v0

    :cond_d
    return v2

    :cond_e
    throw v0
.end method

.method private C()V
    .locals 4

    sget-boolean v0, La/e/a/d;->e:Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :goto_0
    iget v0, p0, La/e/a/d;->u:I

    if-ge v2, v0, :cond_3

    iget-object v0, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v0, v0, v2

    if-eqz v0, :cond_0

    iget-object v3, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v3, v3, La/e/a/c;->a:La/e/a/f;

    invoke-interface {v3, v0}, La/e/a/f;->a(Ljava/lang/Object;)Z

    :cond_0
    iget-object v0, p0, La/e/a/d;->p:[La/e/a/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget v0, p0, La/e/a/d;->u:I

    if-ge v2, v0, :cond_3

    iget-object v0, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v0, v0, v2

    if-eqz v0, :cond_2

    iget-object v3, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v3, v3, La/e/a/c;->b:La/e/a/f;

    invoke-interface {v3, v0}, La/e/a/f;->a(Ljava/lang/Object;)Z

    :cond_2
    iget-object v0, p0, La/e/a/d;->p:[La/e/a/b;

    aput-object v1, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method private a(La/e/a/i$a;Ljava/lang/String;)La/e/a/i;
    .locals 2

    iget-object v0, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v0, v0, La/e/a/c;->c:La/e/a/f;

    invoke-interface {v0}, La/e/a/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/i;

    if-nez v0, :cond_0

    new-instance v0, La/e/a/i;

    invoke-direct {v0, p1, p2}, La/e/a/i;-><init>(La/e/a/i$a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, La/e/a/i;->e()V

    :goto_0
    invoke-virtual {v0, p1, p2}, La/e/a/i;->g(La/e/a/i$a;Ljava/lang/String;)V

    iget p1, p0, La/e/a/d;->y:I

    sget p2, La/e/a/d;->f:I

    if-lt p1, p2, :cond_1

    mul-int/lit8 p2, p2, 0x2

    sput p2, La/e/a/d;->f:I

    iget-object p1, p0, La/e/a/d;->x:[La/e/a/i;

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [La/e/a/i;

    iput-object p1, p0, La/e/a/d;->x:[La/e/a/i;

    :cond_1
    iget-object p1, p0, La/e/a/d;->x:[La/e/a/i;

    iget p2, p0, La/e/a/d;->y:I

    add-int/lit8 v1, p2, 0x1

    iput v1, p0, La/e/a/d;->y:I

    aput-object v0, p1, p2

    return-object v0
.end method

.method private final l(La/e/a/b;)V
    .locals 7

    sget-boolean v0, La/e/a/d;->c:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, La/e/a/b;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, La/e/a/b;->a:La/e/a/i;

    iget p1, p1, La/e/a/b;->b:F

    invoke-virtual {v0, p0, p1}, La/e/a/i;->f(La/e/a/d;F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, La/e/a/d;->p:[La/e/a/b;

    iget v1, p0, La/e/a/d;->u:I

    aput-object p1, v0, v1

    iget-object v0, p1, La/e/a/b;->a:La/e/a/i;

    iput v1, v0, La/e/a/i;->f:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/e/a/d;->u:I

    invoke-virtual {v0, p0, p1}, La/e/a/i;->h(La/e/a/d;La/e/a/b;)V

    :goto_0
    sget-boolean p1, La/e/a/d;->c:Z

    if-eqz p1, :cond_8

    iget-boolean p1, p0, La/e/a/d;->j:Z

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    move v0, p1

    :goto_1
    iget v1, p0, La/e/a/d;->u:I

    if-ge v0, v1, :cond_7

    iget-object v1, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v1, v1, v0

    if-nez v1, :cond_1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v2, "WTF"

    invoke-virtual {v1, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_1
    iget-object v1, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v2, v1, v0

    if-eqz v2, :cond_6

    aget-object v2, v1, v0

    iget-boolean v2, v2, La/e/a/b;->f:Z

    if-eqz v2, :cond_6

    aget-object v1, v1, v0

    iget-object v2, v1, La/e/a/b;->a:La/e/a/i;

    iget v3, v1, La/e/a/b;->b:F

    invoke-virtual {v2, p0, v3}, La/e/a/i;->f(La/e/a/d;F)V

    sget-boolean v2, La/e/a/d;->e:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v2, v2, La/e/a/c;->a:La/e/a/f;

    goto :goto_2

    :cond_2
    iget-object v2, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v2, v2, La/e/a/c;->b:La/e/a/f;

    :goto_2
    invoke-interface {v2, v1}, La/e/a/f;->a(Ljava/lang/Object;)Z

    iget-object v1, p0, La/e/a/d;->p:[La/e/a/b;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v1, v0, 0x1

    move v3, v1

    :goto_3
    iget v4, p0, La/e/a/d;->u:I

    if-ge v1, v4, :cond_4

    iget-object v3, p0, La/e/a/d;->p:[La/e/a/b;

    add-int/lit8 v4, v1, -0x1

    aget-object v5, v3, v1

    aput-object v5, v3, v4

    aget-object v5, v3, v4

    iget-object v5, v5, La/e/a/b;->a:La/e/a/i;

    iget v5, v5, La/e/a/i;->f:I

    if-ne v5, v1, :cond_3

    aget-object v3, v3, v4

    iget-object v3, v3, La/e/a/b;->a:La/e/a/i;

    iput v4, v3, La/e/a/i;->f:I

    :cond_3
    add-int/lit8 v3, v1, 0x1

    move v6, v3

    move v3, v1

    move v1, v6

    goto :goto_3

    :cond_4
    if-ge v3, v4, :cond_5

    iget-object v1, p0, La/e/a/d;->p:[La/e/a/b;

    aput-object v2, v1, v3

    :cond_5
    add-int/lit8 v4, v4, -0x1

    iput v4, p0, La/e/a/d;->u:I

    add-int/lit8 v0, v0, -0x1

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_7
    iput-boolean p1, p0, La/e/a/d;->j:Z

    :cond_8
    return-void
.end method

.method private n()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, La/e/a/d;->u:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v1, v1, v0

    iget-object v2, v1, La/e/a/b;->a:La/e/a/i;

    iget v1, v1, La/e/a/b;->b:F

    iput v1, v2, La/e/a/i;->h:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static s(La/e/a/d;La/e/a/i;La/e/a/i;F)La/e/a/b;
    .locals 0

    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object p0

    invoke-virtual {p0, p1, p2, p3}, La/e/a/b;->j(La/e/a/i;La/e/a/i;F)La/e/a/b;

    move-result-object p0

    return-object p0
.end method

.method private u(La/e/a/d$a;)I
    .locals 19

    move-object/from16 v0, p0

    const/4 v2, 0x0

    :goto_0
    iget v3, v0, La/e/a/d;->u:I

    const/4 v4, 0x0

    if-ge v2, v3, :cond_2

    iget-object v3, v0, La/e/a/d;->p:[La/e/a/b;

    aget-object v6, v3, v2

    iget-object v6, v6, La/e/a/b;->a:La/e/a/i;

    iget-object v6, v6, La/e/a/i;->l:La/e/a/i$a;

    sget-object v7, La/e/a/i$a;->b:La/e/a/i$a;

    if-ne v6, v7, :cond_0

    goto :goto_1

    :cond_0
    aget-object v3, v3, v2

    iget v3, v3, La/e/a/b;->b:F

    cmpg-float v3, v3, v4

    if-gez v3, :cond_1

    const/4 v2, 0x1

    goto :goto_2

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_2
    if-eqz v2, :cond_17

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_3
    :goto_3
    if-nez v2, :cond_16

    sget-object v6, La/e/a/d;->g:La/e/a/e;

    if-nez v6, :cond_15

    add-int/lit8 v3, v3, 0x1

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    const/4 v9, 0x0

    const/4 v10, -0x1

    const/4 v11, -0x1

    const/4 v12, 0x0

    :goto_4
    iget v13, v0, La/e/a/d;->u:I

    if-ge v9, v13, :cond_12

    iget-object v13, v0, La/e/a/d;->p:[La/e/a/b;

    aget-object v13, v13, v9

    iget-object v14, v13, La/e/a/b;->a:La/e/a/i;

    iget-object v14, v14, La/e/a/i;->l:La/e/a/i$a;

    sget-object v15, La/e/a/i$a;->b:La/e/a/i$a;

    if-ne v14, v15, :cond_4

    goto/16 :goto_b

    :cond_4
    iget-boolean v14, v13, La/e/a/b;->f:Z

    if-eqz v14, :cond_5

    goto/16 :goto_b

    :cond_5
    iget v14, v13, La/e/a/b;->b:F

    cmpg-float v14, v14, v4

    if-gez v14, :cond_11

    sget-boolean v14, La/e/a/d;->d:Z

    const/16 v15, 0x9

    if-eqz v14, :cond_b

    iget-object v14, v13, La/e/a/b;->e:La/e/a/b$a;

    invoke-interface {v14}, La/e/a/b$a;->k()I

    move-result v14

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v14, :cond_11

    iget-object v5, v13, La/e/a/b;->e:La/e/a/b$a;

    invoke-interface {v5, v1}, La/e/a/b$a;->g(I)La/e/a/i;

    move-result-object v5

    iget-object v7, v13, La/e/a/b;->e:La/e/a/b$a;

    invoke-interface {v7, v5}, La/e/a/b$a;->b(La/e/a/i;)F

    move-result v7

    cmpg-float v16, v7, v4

    if-gtz v16, :cond_6

    goto :goto_7

    :cond_6
    const/4 v8, 0x0

    :goto_6
    if-ge v8, v15, :cond_a

    iget-object v15, v5, La/e/a/i;->j:[F

    aget v15, v15, v8

    div-float/2addr v15, v7

    cmpg-float v18, v15, v6

    if-gez v18, :cond_7

    if-eq v8, v12, :cond_8

    :cond_7
    if-le v8, v12, :cond_9

    :cond_8
    iget v11, v5, La/e/a/i;->e:I

    move v12, v8

    move v10, v9

    move v6, v15

    :cond_9
    add-int/lit8 v8, v8, 0x1

    const/16 v15, 0x9

    goto :goto_6

    :cond_a
    :goto_7
    add-int/lit8 v1, v1, 0x1

    const/16 v15, 0x9

    goto :goto_5

    :cond_b
    const/4 v1, 0x1

    :goto_8
    iget v5, v0, La/e/a/d;->t:I

    if-ge v1, v5, :cond_11

    iget-object v5, v0, La/e/a/d;->w:La/e/a/c;

    iget-object v5, v5, La/e/a/c;->d:[La/e/a/i;

    aget-object v5, v5, v1

    iget-object v7, v13, La/e/a/b;->e:La/e/a/b$a;

    invoke-interface {v7, v5}, La/e/a/b$a;->b(La/e/a/i;)F

    move-result v7

    cmpg-float v8, v7, v4

    if-gtz v8, :cond_c

    const/16 v14, 0x9

    goto :goto_a

    :cond_c
    const/4 v8, 0x0

    const/16 v14, 0x9

    :goto_9
    if-ge v8, v14, :cond_10

    iget-object v15, v5, La/e/a/i;->j:[F

    aget v15, v15, v8

    div-float/2addr v15, v7

    cmpg-float v17, v15, v6

    if-gez v17, :cond_d

    if-eq v8, v12, :cond_e

    :cond_d
    if-le v8, v12, :cond_f

    :cond_e
    move v11, v1

    move v12, v8

    move v10, v9

    move v6, v15

    :cond_f
    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_10
    :goto_a
    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_11
    :goto_b
    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_4

    :cond_12
    const/4 v1, -0x1

    if-eq v10, v1, :cond_14

    iget-object v5, v0, La/e/a/d;->p:[La/e/a/b;

    aget-object v5, v5, v10

    iget-object v6, v5, La/e/a/b;->a:La/e/a/i;

    iput v1, v6, La/e/a/i;->f:I

    sget-object v1, La/e/a/d;->g:La/e/a/e;

    if-nez v1, :cond_13

    iget-object v1, v0, La/e/a/d;->w:La/e/a/c;

    iget-object v1, v1, La/e/a/c;->d:[La/e/a/i;

    aget-object v1, v1, v11

    invoke-virtual {v5, v1}, La/e/a/b;->x(La/e/a/i;)V

    iget-object v1, v5, La/e/a/b;->a:La/e/a/i;

    iput v10, v1, La/e/a/i;->f:I

    invoke-virtual {v1, v0, v5}, La/e/a/i;->h(La/e/a/d;La/e/a/b;)V

    goto :goto_c

    :cond_13
    const/4 v1, 0x0

    throw v1

    :cond_14
    const/4 v2, 0x1

    :goto_c
    iget v1, v0, La/e/a/d;->t:I

    div-int/lit8 v1, v1, 0x2

    if-le v3, v1, :cond_3

    const/4 v2, 0x1

    goto/16 :goto_3

    :cond_15
    const/4 v1, 0x0

    throw v1

    :cond_16
    move v1, v3

    goto :goto_d

    :cond_17
    const/4 v1, 0x0

    :goto_d
    return v1
.end method

.method public static w()La/e/a/e;
    .locals 1

    sget-object v0, La/e/a/d;->g:La/e/a/e;

    return-object v0
.end method

.method private y()V
    .locals 3

    iget v0, p0, La/e/a/d;->n:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p0, La/e/a/d;->n:I

    iget-object v1, p0, La/e/a/d;->p:[La/e/a/b;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/e/a/b;

    iput-object v0, p0, La/e/a/d;->p:[La/e/a/b;

    iget-object v0, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v1, v0, La/e/a/c;->d:[La/e/a/i;

    iget v2, p0, La/e/a/d;->n:I

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [La/e/a/i;

    iput-object v1, v0, La/e/a/c;->d:[La/e/a/i;

    iget v0, p0, La/e/a/d;->n:I

    new-array v1, v0, [Z

    iput-object v1, p0, La/e/a/d;->s:[Z

    iput v0, p0, La/e/a/d;->o:I

    iput v0, p0, La/e/a/d;->v:I

    sget-object p0, La/e/a/d;->g:La/e/a/e;

    if-nez p0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method A(La/e/a/d$a;)V
    .locals 1

    sget-object v0, La/e/a/d;->g:La/e/a/e;

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, La/e/a/d;->u(La/e/a/d$a;)I

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, La/e/a/d;->B(La/e/a/d$a;Z)I

    invoke-direct {p0}, La/e/a/d;->n()V

    return-void

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method

.method public D()V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v3, v2, La/e/a/c;->d:[La/e/a/i;

    array-length v4, v3

    if-ge v1, v4, :cond_1

    aget-object v2, v3, v1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, La/e/a/i;->e()V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, v2, La/e/a/c;->c:La/e/a/f;

    iget-object v2, p0, La/e/a/d;->x:[La/e/a/i;

    iget v3, p0, La/e/a/d;->y:I

    invoke-interface {v1, v2, v3}, La/e/a/f;->c([Ljava/lang/Object;I)V

    iput v0, p0, La/e/a/d;->y:I

    iget-object v1, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v1, v1, La/e/a/c;->d:[La/e/a/i;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, La/e/a/d;->l:Ljava/util/HashMap;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    :cond_2
    iput v0, p0, La/e/a/d;->k:I

    iget-object v1, p0, La/e/a/d;->m:La/e/a/d$a;

    invoke-interface {v1}, La/e/a/d$a;->clear()V

    const/4 v1, 0x1

    iput v1, p0, La/e/a/d;->t:I

    move v1, v0

    :goto_1
    iget v2, p0, La/e/a/d;->u:I

    if-ge v1, v2, :cond_4

    iget-object v2, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v3, v2, v1

    if-eqz v3, :cond_3

    aget-object v2, v2, v1

    iput-boolean v0, v2, La/e/a/b;->c:Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    invoke-direct {p0}, La/e/a/d;->C()V

    iput v0, p0, La/e/a/d;->u:I

    sget-boolean v0, La/e/a/d;->e:Z

    if-eqz v0, :cond_5

    new-instance v0, La/e/a/d$b;

    iget-object v1, p0, La/e/a/d;->w:La/e/a/c;

    invoke-direct {v0, p0, v1}, La/e/a/d$b;-><init>(La/e/a/d;La/e/a/c;)V

    goto :goto_2

    :cond_5
    new-instance v0, La/e/a/b;

    iget-object v1, p0, La/e/a/d;->w:La/e/a/c;

    invoke-direct {v0, v1}, La/e/a/b;-><init>(La/e/a/c;)V

    :goto_2
    iput-object v0, p0, La/e/a/d;->z:La/e/a/d$a;

    return-void
.end method

.method public b(La/e/a/m/e;La/e/a/m/e;FI)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    sget-object v3, La/e/a/m/d$b;->c:La/e/a/m/d$b;

    invoke-virtual {v1, v3}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v4

    invoke-virtual {v0, v4}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v6

    sget-object v4, La/e/a/m/d$b;->d:La/e/a/m/d$b;

    invoke-virtual {v1, v4}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v5

    invoke-virtual {v0, v5}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v8

    sget-object v5, La/e/a/m/d$b;->e:La/e/a/m/d$b;

    invoke-virtual {v1, v5}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v7

    invoke-virtual {v0, v7}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v13

    sget-object v7, La/e/a/m/d$b;->f:La/e/a/m/d$b;

    invoke-virtual {v1, v7}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v1

    invoke-virtual {v0, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v9

    invoke-virtual {v2, v3}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v1

    invoke-virtual {v0, v1}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v1

    invoke-virtual {v2, v4}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v3

    invoke-virtual {v0, v3}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v10

    invoke-virtual {v2, v5}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v3

    invoke-virtual {v0, v3}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v3

    invoke-virtual {v2, v7}, La/e/a/m/e;->m(La/e/a/m/d$b;)La/e/a/m/d;

    move-result-object v2

    invoke-virtual {v0, v2}, La/e/a/d;->q(Ljava/lang/Object;)La/e/a/i;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object v2

    move/from16 v4, p3

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    move/from16 v7, p4

    move-object/from16 p1, v3

    move-wide/from16 p2, v4

    int-to-double v3, v7

    mul-double/2addr v14, v3

    double-to-float v12, v14

    move-object v7, v2

    invoke-virtual/range {v7 .. v12}, La/e/a/b;->q(La/e/a/i;La/e/a/i;La/e/a/i;La/e/a/i;F)La/e/a/b;

    invoke-virtual {v0, v2}, La/e/a/d;->d(La/e/a/b;)V

    invoke-virtual/range {p0 .. p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object v2

    invoke-static/range {p2 .. p3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    mul-double/2addr v7, v3

    double-to-float v10, v7

    move-object v5, v2

    move-object v7, v13

    move-object v8, v1

    move-object/from16 v9, p1

    invoke-virtual/range {v5 .. v10}, La/e/a/b;->q(La/e/a/i;La/e/a/i;La/e/a/i;La/e/a/i;F)La/e/a/b;

    invoke-virtual {v0, v2}, La/e/a/d;->d(La/e/a/b;)V

    return-void
.end method

.method public c(La/e/a/i;La/e/a/i;IFLa/e/a/i;La/e/a/i;II)V
    .locals 11

    move-object v0, p0

    move/from16 v1, p8

    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object v10

    move-object v2, v10

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v9, p7

    invoke-virtual/range {v2 .. v9}, La/e/a/b;->h(La/e/a/i;La/e/a/i;IFLa/e/a/i;La/e/a/i;I)La/e/a/b;

    const/16 v2, 0x8

    if-eq v1, v2, :cond_0

    invoke-virtual {v10, p0, v1}, La/e/a/b;->d(La/e/a/d;I)La/e/a/b;

    :cond_0
    invoke-virtual {p0, v10}, La/e/a/d;->d(La/e/a/b;)V

    return-void
.end method

.method public d(La/e/a/b;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    sget-object v0, La/e/a/d;->g:La/e/a/e;

    const/4 v1, 0x0

    if-nez v0, :cond_d

    iget v0, p0, La/e/a/d;->u:I

    const/4 v2, 0x1

    add-int/2addr v0, v2

    iget v3, p0, La/e/a/d;->v:I

    if-ge v0, v3, :cond_1

    iget v0, p0, La/e/a/d;->t:I

    add-int/2addr v0, v2

    iget v3, p0, La/e/a/d;->o:I

    if-lt v0, v3, :cond_2

    :cond_1
    invoke-direct {p0}, La/e/a/d;->y()V

    :cond_2
    const/4 v0, 0x0

    iget-boolean v3, p1, La/e/a/b;->f:Z

    if-nez v3, :cond_b

    invoke-virtual {p1, p0}, La/e/a/b;->D(La/e/a/d;)V

    invoke-virtual {p1}, La/e/a/b;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    return-void

    :cond_3
    invoke-virtual {p1}, La/e/a/b;->r()V

    invoke-virtual {p1, p0}, La/e/a/b;->f(La/e/a/d;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p0}, La/e/a/d;->p()La/e/a/i;

    move-result-object v3

    iput-object v3, p1, La/e/a/b;->a:La/e/a/i;

    iget v4, p0, La/e/a/d;->u:I

    invoke-direct {p0, p1}, La/e/a/d;->l(La/e/a/b;)V

    iget v5, p0, La/e/a/d;->u:I

    add-int/2addr v4, v2

    if-ne v5, v4, :cond_8

    iget-object v0, p0, La/e/a/d;->z:La/e/a/d$a;

    invoke-interface {v0, p1}, La/e/a/d$a;->c(La/e/a/d$a;)V

    iget-object v0, p0, La/e/a/d;->z:La/e/a/d$a;

    invoke-direct {p0, v0, v2}, La/e/a/d;->B(La/e/a/d$a;Z)I

    iget v0, v3, La/e/a/i;->f:I

    const/4 v4, -0x1

    if-ne v0, v4, :cond_9

    iget-object v0, p1, La/e/a/b;->a:La/e/a/i;

    if-ne v0, v3, :cond_5

    invoke-virtual {p1, v3}, La/e/a/b;->v(La/e/a/i;)La/e/a/i;

    move-result-object v0

    if-eqz v0, :cond_5

    sget-object v3, La/e/a/d;->g:La/e/a/e;

    if-nez v3, :cond_4

    invoke-virtual {p1, v0}, La/e/a/b;->x(La/e/a/i;)V

    goto :goto_0

    :cond_4
    throw v1

    :cond_5
    :goto_0
    iget-boolean v0, p1, La/e/a/b;->f:Z

    if-nez v0, :cond_6

    iget-object v0, p1, La/e/a/b;->a:La/e/a/i;

    invoke-virtual {v0, p0, p1}, La/e/a/i;->h(La/e/a/d;La/e/a/b;)V

    :cond_6
    sget-boolean v0, La/e/a/d;->e:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v0, v0, La/e/a/c;->a:La/e/a/f;

    goto :goto_1

    :cond_7
    iget-object v0, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v0, v0, La/e/a/c;->b:La/e/a/f;

    :goto_1
    invoke-interface {v0, p1}, La/e/a/f;->a(Ljava/lang/Object;)Z

    iget v0, p0, La/e/a/d;->u:I

    sub-int/2addr v0, v2

    iput v0, p0, La/e/a/d;->u:I

    goto :goto_2

    :cond_8
    move v2, v0

    :cond_9
    :goto_2
    invoke-virtual {p1}, La/e/a/b;->s()Z

    move-result v0

    if-nez v0, :cond_a

    return-void

    :cond_a
    move v0, v2

    :cond_b
    if-nez v0, :cond_c

    invoke-direct {p0, p1}, La/e/a/d;->l(La/e/a/b;)V

    :cond_c
    return-void

    :cond_d
    throw v1
.end method

.method public e(La/e/a/i;La/e/a/i;II)La/e/a/b;
    .locals 3

    sget-boolean v0, La/e/a/d;->b:Z

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    if-ne p4, v1, :cond_0

    iget-boolean v0, p2, La/e/a/i;->i:Z

    if-eqz v0, :cond_0

    iget v0, p1, La/e/a/i;->f:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget p2, p2, La/e/a/i;->h:F

    int-to-float p3, p3

    add-float/2addr p2, p3

    invoke-virtual {p1, p0, p2}, La/e/a/i;->f(La/e/a/d;F)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, La/e/a/b;->n(La/e/a/i;La/e/a/i;I)La/e/a/b;

    if-eq p4, v1, :cond_1

    invoke-virtual {v0, p0, p4}, La/e/a/b;->d(La/e/a/d;I)La/e/a/b;

    :cond_1
    invoke-virtual {p0, v0}, La/e/a/d;->d(La/e/a/b;)V

    return-object v0
.end method

.method public f(La/e/a/i;I)V
    .locals 5

    sget-boolean v0, La/e/a/d;->b:Z

    const/4 v1, -0x1

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iget v0, p1, La/e/a/i;->f:I

    if-ne v0, v1, :cond_2

    int-to-float p2, p2

    invoke-virtual {p1, p0, p2}, La/e/a/i;->f(La/e/a/d;F)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, La/e/a/d;->k:I

    add-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    iget-object v1, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v1, v1, La/e/a/c;->d:[La/e/a/i;

    aget-object v1, v1, v0

    if-eqz v1, :cond_0

    iget-boolean v3, v1, La/e/a/i;->p:Z

    if-eqz v3, :cond_0

    iget v3, v1, La/e/a/i;->q:I

    iget v4, p1, La/e/a/i;->e:I

    if-ne v3, v4, :cond_0

    iget v3, v1, La/e/a/i;->r:F

    add-float/2addr v3, p2

    invoke-virtual {v1, p0, v3}, La/e/a/i;->f(La/e/a/d;F)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void

    :cond_2
    iget v0, p1, La/e/a/i;->f:I

    if-eq v0, v1, :cond_5

    iget-object v1, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v0, v1, v0

    iget-boolean v1, v0, La/e/a/b;->f:Z

    if-eqz v1, :cond_3

    :goto_1
    int-to-float p0, p2

    iput p0, v0, La/e/a/b;->b:F

    goto :goto_3

    :cond_3
    iget-object v1, v0, La/e/a/b;->e:La/e/a/b$a;

    invoke-interface {v1}, La/e/a/b$a;->k()I

    move-result v1

    if-nez v1, :cond_4

    iput-boolean v2, v0, La/e/a/b;->f:Z

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, La/e/a/b;->m(La/e/a/i;I)La/e/a/b;

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, La/e/a/b;->i(La/e/a/i;I)La/e/a/b;

    :goto_2
    invoke-virtual {p0, v0}, La/e/a/d;->d(La/e/a/b;)V

    :goto_3
    return-void
.end method

.method public g(La/e/a/i;La/e/a/i;IZ)V
    .locals 2

    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object p4

    invoke-virtual {p0}, La/e/a/d;->t()La/e/a/i;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, La/e/a/i;->g:I

    invoke-virtual {p4, p1, p2, v0, p3}, La/e/a/b;->o(La/e/a/i;La/e/a/i;La/e/a/i;I)La/e/a/b;

    invoke-virtual {p0, p4}, La/e/a/d;->d(La/e/a/b;)V

    return-void
.end method

.method public h(La/e/a/i;La/e/a/i;II)V
    .locals 3

    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object v0

    invoke-virtual {p0}, La/e/a/d;->t()La/e/a/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, La/e/a/i;->g:I

    invoke-virtual {v0, p1, p2, v1, p3}, La/e/a/b;->o(La/e/a/i;La/e/a/i;La/e/a/i;I)La/e/a/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, La/e/a/b;->e:La/e/a/b$a;

    invoke-interface {p1, v1}, La/e/a/b$a;->b(La/e/a/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, La/e/a/d;->m(La/e/a/b;II)V

    :cond_0
    invoke-virtual {p0, v0}, La/e/a/d;->d(La/e/a/b;)V

    return-void
.end method

.method public i(La/e/a/i;La/e/a/i;IZ)V
    .locals 2

    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object p4

    invoke-virtual {p0}, La/e/a/d;->t()La/e/a/i;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, La/e/a/i;->g:I

    invoke-virtual {p4, p1, p2, v0, p3}, La/e/a/b;->p(La/e/a/i;La/e/a/i;La/e/a/i;I)La/e/a/b;

    invoke-virtual {p0, p4}, La/e/a/d;->d(La/e/a/b;)V

    return-void
.end method

.method public j(La/e/a/i;La/e/a/i;II)V
    .locals 3

    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object v0

    invoke-virtual {p0}, La/e/a/d;->t()La/e/a/i;

    move-result-object v1

    const/4 v2, 0x0

    iput v2, v1, La/e/a/i;->g:I

    invoke-virtual {v0, p1, p2, v1, p3}, La/e/a/b;->p(La/e/a/i;La/e/a/i;La/e/a/i;I)La/e/a/b;

    const/16 p1, 0x8

    if-eq p4, p1, :cond_0

    iget-object p1, v0, La/e/a/b;->e:La/e/a/b$a;

    invoke-interface {p1, v1}, La/e/a/b$a;->b(La/e/a/i;)F

    move-result p1

    const/high16 p2, -0x40800000    # -1.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1, p4}, La/e/a/d;->m(La/e/a/b;II)V

    :cond_0
    invoke-virtual {p0, v0}, La/e/a/d;->d(La/e/a/b;)V

    return-void
.end method

.method public k(La/e/a/i;La/e/a/i;La/e/a/i;La/e/a/i;FI)V
    .locals 7

    invoke-virtual {p0}, La/e/a/d;->r()La/e/a/b;

    move-result-object v6

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, La/e/a/b;->k(La/e/a/i;La/e/a/i;La/e/a/i;La/e/a/i;F)La/e/a/b;

    const/16 p1, 0x8

    if-eq p6, p1, :cond_0

    invoke-virtual {v6, p0, p6}, La/e/a/b;->d(La/e/a/d;I)La/e/a/b;

    :cond_0
    invoke-virtual {p0, v6}, La/e/a/d;->d(La/e/a/b;)V

    return-void
.end method

.method m(La/e/a/b;II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p3, v0}, La/e/a/d;->o(ILjava/lang/String;)La/e/a/i;

    move-result-object p0

    invoke-virtual {p1, p0, p2}, La/e/a/b;->e(La/e/a/i;I)La/e/a/b;

    return-void
.end method

.method public o(ILjava/lang/String;)La/e/a/i;
    .locals 2

    sget-object v0, La/e/a/d;->g:La/e/a/e;

    if-nez v0, :cond_1

    iget v0, p0, La/e/a/d;->t:I

    add-int/lit8 v0, v0, 0x1

    iget v1, p0, La/e/a/d;->o:I

    if-lt v0, v1, :cond_0

    invoke-direct {p0}, La/e/a/d;->y()V

    :cond_0
    sget-object v0, La/e/a/i$a;->e:La/e/a/i$a;

    invoke-direct {p0, v0, p2}, La/e/a/d;->a(La/e/a/i$a;Ljava/lang/String;)La/e/a/i;

    move-result-object p2

    iget v0, p0, La/e/a/d;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, La/e/a/d;->k:I

    iget v1, p0, La/e/a/d;->t:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/e/a/d;->t:I

    iput v0, p2, La/e/a/i;->e:I

    iput p1, p2, La/e/a/i;->g:I

    iget-object p1, p0, La/e/a/d;->w:La/e/a/c;

    iget-object p1, p1, La/e/a/c;->d:[La/e/a/i;

    aput-object p2, p1, v0

    iget-object p0, p0, La/e/a/d;->m:La/e/a/d$a;

    invoke-interface {p0, p2}, La/e/a/d$a;->b(La/e/a/i;)V

    return-object p2

    :cond_1
    const/4 p0, 0x0

    throw p0
.end method

.method public p()La/e/a/i;
    .locals 3

    sget-object v0, La/e/a/d;->g:La/e/a/e;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget v0, p0, La/e/a/d;->t:I

    add-int/lit8 v0, v0, 0x1

    iget v2, p0, La/e/a/d;->o:I

    if-lt v0, v2, :cond_0

    invoke-direct {p0}, La/e/a/d;->y()V

    :cond_0
    sget-object v0, La/e/a/i$a;->d:La/e/a/i$a;

    invoke-direct {p0, v0, v1}, La/e/a/d;->a(La/e/a/i$a;Ljava/lang/String;)La/e/a/i;

    move-result-object v0

    iget v1, p0, La/e/a/d;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/e/a/d;->k:I

    iget v2, p0, La/e/a/d;->t:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, La/e/a/d;->t:I

    iput v1, v0, La/e/a/i;->e:I

    iget-object p0, p0, La/e/a/d;->w:La/e/a/c;

    iget-object p0, p0, La/e/a/c;->d:[La/e/a/i;

    aput-object v0, p0, v1

    return-object v0

    :cond_1
    throw v1
.end method

.method public q(Ljava/lang/Object;)La/e/a/i;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget v1, p0, La/e/a/d;->t:I

    add-int/lit8 v1, v1, 0x1

    iget v2, p0, La/e/a/d;->o:I

    if-lt v1, v2, :cond_1

    invoke-direct {p0}, La/e/a/d;->y()V

    :cond_1
    instance-of v1, p1, La/e/a/m/d;

    if-eqz v1, :cond_5

    check-cast p1, La/e/a/m/d;

    invoke-virtual {p1}, La/e/a/m/d;->h()La/e/a/i;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, La/e/a/d;->w:La/e/a/c;

    invoke-virtual {p1, v0}, La/e/a/m/d;->r(La/e/a/c;)V

    invoke-virtual {p1}, La/e/a/m/d;->h()La/e/a/i;

    move-result-object p1

    move-object v0, p1

    :cond_2
    iget p1, v0, La/e/a/i;->e:I

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    iget v2, p0, La/e/a/d;->k:I

    if-gt p1, v2, :cond_3

    iget-object v2, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v2, v2, La/e/a/c;->d:[La/e/a/i;

    aget-object v2, v2, p1

    if-nez v2, :cond_5

    :cond_3
    if-eq p1, v1, :cond_4

    invoke-virtual {v0}, La/e/a/i;->e()V

    :cond_4
    iget p1, p0, La/e/a/d;->k:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, La/e/a/d;->k:I

    iget v1, p0, La/e/a/d;->t:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/e/a/d;->t:I

    iput p1, v0, La/e/a/i;->e:I

    sget-object v1, La/e/a/i$a;->b:La/e/a/i$a;

    iput-object v1, v0, La/e/a/i;->l:La/e/a/i$a;

    iget-object p0, p0, La/e/a/d;->w:La/e/a/c;

    iget-object p0, p0, La/e/a/c;->d:[La/e/a/i;

    aput-object v0, p0, p1

    :cond_5
    return-object v0
.end method

.method public r()La/e/a/b;
    .locals 5

    sget-boolean v0, La/e/a/d;->e:Z

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v0, v0, La/e/a/c;->a:La/e/a/f;

    invoke-interface {v0}, La/e/a/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/b;

    if-nez v0, :cond_1

    new-instance v0, La/e/a/d$b;

    iget-object v3, p0, La/e/a/d;->w:La/e/a/c;

    invoke-direct {v0, p0, v3}, La/e/a/d$b;-><init>(La/e/a/d;La/e/a/c;)V

    sget-wide v3, La/e/a/d;->i:J

    add-long/2addr v3, v1

    sput-wide v3, La/e/a/d;->i:J

    goto :goto_0

    :cond_0
    iget-object v0, p0, La/e/a/d;->w:La/e/a/c;

    iget-object v0, v0, La/e/a/c;->b:La/e/a/f;

    invoke-interface {v0}, La/e/a/f;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/b;

    if-nez v0, :cond_1

    new-instance v0, La/e/a/b;

    iget-object p0, p0, La/e/a/d;->w:La/e/a/c;

    invoke-direct {v0, p0}, La/e/a/b;-><init>(La/e/a/c;)V

    sget-wide v3, La/e/a/d;->h:J

    add-long/2addr v3, v1

    sput-wide v3, La/e/a/d;->h:J

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, La/e/a/b;->y()V

    :goto_0
    invoke-static {}, La/e/a/i;->c()V

    return-object v0
.end method

.method public t()La/e/a/i;
    .locals 3

    sget-object v0, La/e/a/d;->g:La/e/a/e;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget v0, p0, La/e/a/d;->t:I

    add-int/lit8 v0, v0, 0x1

    iget v2, p0, La/e/a/d;->o:I

    if-lt v0, v2, :cond_0

    invoke-direct {p0}, La/e/a/d;->y()V

    :cond_0
    sget-object v0, La/e/a/i$a;->d:La/e/a/i$a;

    invoke-direct {p0, v0, v1}, La/e/a/d;->a(La/e/a/i$a;Ljava/lang/String;)La/e/a/i;

    move-result-object v0

    iget v1, p0, La/e/a/d;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/e/a/d;->k:I

    iget v2, p0, La/e/a/d;->t:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, La/e/a/d;->t:I

    iput v1, v0, La/e/a/i;->e:I

    iget-object p0, p0, La/e/a/d;->w:La/e/a/c;

    iget-object p0, p0, La/e/a/c;->d:[La/e/a/i;

    aput-object v0, p0, v1

    return-object v0

    :cond_1
    throw v1
.end method

.method public v()La/e/a/c;
    .locals 0

    iget-object p0, p0, La/e/a/d;->w:La/e/a/c;

    return-object p0
.end method

.method public x(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/e/a/m/d;

    invoke-virtual {p1}, La/e/a/m/d;->h()La/e/a/i;

    move-result-object p0

    if-eqz p0, :cond_0

    iget p0, p0, La/e/a/i;->h:F

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public z()V
    .locals 4

    sget-object v0, La/e/a/d;->g:La/e/a/e;

    const/4 v1, 0x0

    if-nez v0, :cond_8

    iget-object v0, p0, La/e/a/d;->m:La/e/a/d$a;

    invoke-interface {v0}, La/e/a/d$a;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, La/e/a/d;->n()V

    return-void

    :cond_0
    iget-boolean v0, p0, La/e/a/d;->q:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, La/e/a/d;->r:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, La/e/a/d;->m:La/e/a/d$a;

    invoke-virtual {p0, v0}, La/e/a/d;->A(La/e/a/d$a;)V

    goto :goto_4

    :cond_2
    :goto_1
    sget-object v0, La/e/a/d;->g:La/e/a/e;

    if-nez v0, :cond_7

    const/4 v0, 0x0

    move v2, v0

    :goto_2
    iget v3, p0, La/e/a/d;->u:I

    if-ge v2, v3, :cond_4

    iget-object v3, p0, La/e/a/d;->p:[La/e/a/b;

    aget-object v3, v3, v2

    iget-boolean v3, v3, La/e/a/b;->f:Z

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x1

    :goto_3
    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    sget-object v0, La/e/a/d;->g:La/e/a/e;

    if-nez v0, :cond_6

    invoke-direct {p0}, La/e/a/d;->n()V

    :goto_4
    return-void

    :cond_6
    throw v1

    :cond_7
    throw v1

    :cond_8
    throw v1
.end method
