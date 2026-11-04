.class public final Lc/a/a/j/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;
.implements Lc/a/a/i/q/f;


# static fields
.field public static final a:Lc/a/a/j/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/b;

    invoke-direct {v0}, Lc/a/a/j/b;-><init>()V

    sput-object v0, Lc/a/a/j/b;->a:Lc/a/a/j/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private c(Lc/a/a/i/b;Ljava/lang/Class;Lc/a/a/b;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            "Ljava/lang/Class<",
            "*>;",
            "Lc/a/a/b;",
            ")TT;"
        }
    .end annotation

    if-nez p3, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p3}, Lc/a/a/b;->size()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    invoke-virtual {p3, v2}, Lc/a/a/b;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, p3, :cond_1

    invoke-static {v1, v2, v1}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p2, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    check-cast v3, Lc/a/a/b;

    invoke-direct {p0, p1, p2, v3}, Lc/a/a/j/b;->c(Lc/a/a/i/b;Ljava/lang/Class;Lc/a/a/b;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_1

    :cond_3
    iget-object v4, p1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-static {v3, p2, v4}, Lc/a/a/k/d;->b(Ljava/lang/Object;Ljava/lang/Class;Lc/a/a/i/m;)Ljava/lang/Object;

    move-result-object v3

    :goto_1
    invoke-static {v1, v2, v3}, Ljava/lang/reflect/Array;->set(Ljava/lang/Object;ILjava/lang/Object;)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    invoke-virtual {p3, v1}, Lc/a/a/b;->q(Ljava/lang/Object;)V

    invoke-virtual {p3, p2}, Lc/a/a/b;->p(Ljava/lang/reflect/Type;)V

    return-object v1
.end method


# virtual methods
.method public final a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 8

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    move-object p4, p2

    check-cast p4, [Ljava/lang/Object;

    const-string v0, "[]"

    if-nez p2, :cond_1

    iget p1, p0, Lc/a/a/j/z;->n:I

    sget-object p2, Lc/a/a/j/a0;->g:Lc/a/a/j/a0;

    iget p2, p2, Lc/a/a/j/a0;->z:I

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    invoke-virtual {p0, v0}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    :goto_0
    return-void

    :cond_1
    array-length v1, p4

    add-int/lit8 v2, v1, -0x1

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    invoke-virtual {p0, v0}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    return-void

    :cond_2
    iget-object v0, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    const/4 v3, 0x0

    invoke-virtual {p1, v0, p2, p3, v3}, Lc/a/a/j/m;->p(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 p2, 0x5b

    :try_start_0
    invoke-virtual {p0, p2}, Lc/a/a/j/z;->write(I)V

    iget p2, p0, Lc/a/a/j/z;->n:I

    sget-object p3, Lc/a/a/j/a0;->n:Lc/a/a/j/a0;

    iget p3, p3, Lc/a/a/j/a0;->z:I

    and-int/2addr p2, p3

    const/16 p3, 0x5d

    const/16 v4, 0x2c

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lc/a/a/j/m;->l()V

    invoke-virtual {p1}, Lc/a/a/j/m;->m()V

    :goto_1
    if-ge v3, v1, :cond_4

    if-eqz v3, :cond_3

    invoke-virtual {p0, v4}, Lc/a/a/j/z;->write(I)V

    invoke-virtual {p1}, Lc/a/a/j/m;->m()V

    :cond_3
    aget-object p2, p4, v3

    invoke-virtual {p1, p2}, Lc/a/a/j/m;->r(Ljava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Lc/a/a/j/m;->d()V

    invoke-virtual {p1}, Lc/a/a/j/m;->m()V

    invoke-virtual {p0, p3}, Lc/a/a/j/z;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v0, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    return-void

    :cond_5
    const/4 p2, 0x0

    move-object v1, p2

    move-object v5, v1

    :goto_2
    if-ge v3, v2, :cond_9

    :try_start_1
    aget-object v6, p4, v3

    if-nez v6, :cond_6

    const-string v6, "null,"

    invoke-virtual {p0, v6}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    goto :goto_4

    :cond_6
    iget-object v7, p1, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    if-eqz v7, :cond_7

    invoke-virtual {v7, v6}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {p1, v6}, Lc/a/a/j/m;->t(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    if-ne v7, v1, :cond_8

    invoke-interface {v5, p1, v6, p2, p2}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_3

    :cond_8
    iget-object v1, p1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v1, v7}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v5

    invoke-interface {v5, p1, v6, p2, p2}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    move-object v1, v7

    :goto_3
    invoke-virtual {p0, v4}, Lc/a/a/j/z;->write(I)V

    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_9
    aget-object p2, p4, v2

    if-nez p2, :cond_a

    const-string p2, "null]"

    invoke-virtual {p0, p2}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    goto :goto_6

    :cond_a
    iget-object p4, p1, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    if-eqz p4, :cond_b

    invoke-virtual {p4, p2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_b

    invoke-virtual {p1, p2}, Lc/a/a/j/m;->t(Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p1, p2, p4}, Lc/a/a/j/m;->u(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_5
    invoke-virtual {p0, p3}, Lc/a/a/j/z;->write(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_6
    iput-object v0, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    return-void

    :catchall_0
    move-exception p0

    iput-object v0, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    throw p0
.end method

.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
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

    iget-object v0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v0}, Lc/a/a/i/e;->e0()I

    move-result v1

    const/16 v2, 0x10

    const/16 v3, 0x8

    if-ne v1, v3, :cond_0

    invoke-virtual {v0, v2}, Lc/a/a/i/e;->t(I)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-class v3, [C

    const/4 v4, 0x4

    if-ne p2, v3, :cond_3

    if-ne v1, v4, :cond_1

    invoke-virtual {v0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v2}, Lc/a/a/i/e;->t(I)V

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x2

    if-ne v1, p0, :cond_2

    invoke-virtual {v0}, Lc/a/a/i/e;->k()Ljava/lang/Number;

    move-result-object p0

    invoke-virtual {v0, v2}, Lc/a/a/i/e;->t(I)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lc/a/a/a;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    return-object p0

    :cond_3
    if-ne v1, v4, :cond_4

    invoke-virtual {v0}, Lc/a/a/i/e;->a()[B

    move-result-object p0

    invoke-virtual {v0, v2}, Lc/a/a/i/e;->t(I)V

    return-object p0

    :cond_4
    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    new-instance v0, Lc/a/a/b;

    invoke-direct {v0}, Lc/a/a/b;-><init>()V

    invoke-virtual {p1, p2, v0, p3}, Lc/a/a/i/b;->m(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    invoke-direct {p0, p1, p2, v0}, Lc/a/a/j/b;->c(Lc/a/a/i/b;Ljava/lang/Class;Lc/a/a/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
