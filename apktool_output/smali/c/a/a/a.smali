.class public abstract Lc/a/a/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/f;
.implements Lc/a/a/c;


# static fields
.field public static b:Ljava/util/TimeZone;

.field public static c:Ljava/util/Locale;

.field public static d:I

.field public static e:Ljava/lang/String;

.field public static f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object v0

    sput-object v0, Lc/a/a/a;->b:Ljava/util/TimeZone;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    sput-object v0, Lc/a/a/a;->c:Ljava/util/Locale;

    sget-object v0, Lc/a/a/i/d;->i:Lc/a/a/i/d;

    iget v0, v0, Lc/a/a/i/d;->u:I

    or-int/lit8 v0, v0, 0x0

    sget-object v1, Lc/a/a/i/d;->k:Lc/a/a/i/d;

    iget v1, v1, Lc/a/a/i/d;->u:I

    or-int/2addr v0, v1

    sget-object v1, Lc/a/a/i/d;->j:Lc/a/a/i/d;

    iget v1, v1, Lc/a/a/i/d;->u:I

    or-int/2addr v0, v1

    sput v0, Lc/a/a/a;->d:I

    const-string v0, "yyyy-MM-dd HH:mm:ss"

    sput-object v0, Lc/a/a/a;->e:Ljava/lang/String;

    sget-object v0, Lc/a/a/j/a0;->b:Lc/a/a/j/a0;

    iget v0, v0, Lc/a/a/j/a0;->z:I

    or-int/lit8 v0, v0, 0x0

    sget-object v1, Lc/a/a/j/a0;->k:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    or-int/2addr v0, v1

    sget-object v1, Lc/a/a/j/a0;->e:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    or-int/2addr v0, v1

    sget-object v1, Lc/a/a/j/a0;->l:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    or-int/2addr v0, v1

    sput v0, Lc/a/a/a;->f:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    sget v0, Lc/a/a/a;->d:I

    invoke-static {p0, v0}, Lc/a/a/a;->d(Ljava/lang/String;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ljava/lang/String;I)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lc/a/a/i/b;

    sget-object v2, Lc/a/a/i/m;->b:Lc/a/a/i/m;

    invoke-direct {v1, p0, v2, p1}, Lc/a/a/i/b;-><init>(Ljava/lang/String;Lc/a/a/i/m;I)V

    invoke-virtual {v1, v0}, Lc/a/a/i/b;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v1, p0}, Lc/a/a/i/b;->i(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lc/a/a/i/b;->close()V

    return-object p0
.end method

.method public static final e(Ljava/lang/String;)Lc/a/a/e;
    .locals 3

    invoke-static {p0}, Lc/a/a/a;->c(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Lc/a/a/e;

    if-nez v0, :cond_3

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p0}, Lc/a/a/a;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/e;

    sget v1, Lc/a/a/a;->d:I

    sget-object v2, Lc/a/a/i/d;->s:Lc/a/a/i/d;

    iget v2, v2, Lc/a/a/i/d;->u:I

    and-int/2addr v1, v2

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "@type"

    invoke-virtual {v0, v1, p0}, Lc/a/a/e;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    check-cast p0, Lc/a/a/e;

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Lc/a/a/i/d;

    invoke-static {p0, p1, v0}, Lc/a/a/a;->g(Ljava/lang/String;Ljava/lang/Class;[Lc/a/a/i/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs g(Ljava/lang/String;Ljava/lang/Class;[Lc/a/a/i/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;[",
            "Lc/a/a/i/d;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lc/a/a/i/m;->b:Lc/a/a/i/m;

    sget v1, Lc/a/a/a;->d:I

    invoke-static {p0, p1, v0, v1, p2}, Lc/a/a/a;->h(Ljava/lang/String;Ljava/lang/reflect/Type;Lc/a/a/i/m;I[Lc/a/a/i/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs h(Ljava/lang/String;Ljava/lang/reflect/Type;Lc/a/a/i/m;I[Lc/a/a/i/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Lc/a/a/i/m;",
            "I[",
            "Lc/a/a/i/d;",
            ")TT;"
        }
    .end annotation

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lc/a/a/a;->i(Ljava/lang/String;Ljava/lang/reflect/Type;Lc/a/a/i/m;Lc/a/a/i/q/g;I[Lc/a/a/i/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs i(Ljava/lang/String;Ljava/lang/reflect/Type;Lc/a/a/i/m;Lc/a/a/i/q/g;I[Lc/a/a/i/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            "Lc/a/a/i/m;",
            "Lc/a/a/i/q/g;",
            "I[",
            "Lc/a/a/i/d;",
            ")TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    array-length v0, p5

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p5, v1

    iget v2, v2, Lc/a/a/i/d;->u:I

    or-int/2addr p4, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-instance p5, Lc/a/a/i/b;

    invoke-direct {p5, p0, p2, p4}, Lc/a/a/i/b;-><init>(Ljava/lang/String;Lc/a/a/i/m;I)V

    instance-of p0, p3, Lc/a/a/i/q/c;

    if-eqz p0, :cond_2

    invoke-virtual {p5}, Lc/a/a/i/b;->g()Ljava/util/List;

    move-result-object p0

    move-object p2, p3

    check-cast p2, Lc/a/a/i/q/c;

    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    instance-of p0, p3, Lc/a/a/i/q/b;

    if-eqz p0, :cond_3

    invoke-virtual {p5}, Lc/a/a/i/b;->f()Ljava/util/List;

    move-result-object p0

    move-object p2, p3

    check-cast p2, Lc/a/a/i/q/b;

    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    instance-of p0, p3, Lc/a/a/i/q/e;

    if-eqz p0, :cond_4

    check-cast p3, Lc/a/a/i/q/e;

    iput-object p3, p5, Lc/a/a/i/b;->n:Lc/a/a/i/q/e;

    :cond_4
    invoke-virtual {p5, p1}, Lc/a/a/i/b;->r(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p5, p0}, Lc/a/a/i/b;->i(Ljava/lang/Object;)V

    invoke-virtual {p5}, Lc/a/a/i/b;->close()V

    return-object p0
.end method

.method public static final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object v0, Lc/a/a/j/x;->a:Lc/a/a/j/x;

    invoke-static {p0, v0}, Lc/a/a/a;->k(Ljava/lang/Object;Lc/a/a/j/x;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/lang/Object;Lc/a/a/j/x;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p0, Lc/a/a/a;

    if-eqz v1, :cond_1

    check-cast p0, Lc/a/a/a;

    return-object p0

    :cond_1
    instance-of v1, p0, Ljava/util/Map;

    if-eqz v1, :cond_5

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result p1

    instance-of v0, p0, Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    goto :goto_0

    :cond_2
    instance-of v0, p0, Ljava/util/TreeMap;

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(I)V

    :goto_0
    new-instance p1, Lc/a/a/e;

    invoke-direct {p1, v0}, Lc/a/a/e;-><init>(Ljava/util/Map;)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lc/a/a/k/d;->t(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lc/a/a/e;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    return-object p1

    :cond_5
    instance-of v1, p0, Ljava/util/Collection;

    if-eqz v1, :cond_7

    check-cast p0, Ljava/util/Collection;

    new-instance p1, Lc/a/a/b;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-direct {p1, v0}, Lc/a/a/b;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/a;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lc/a/a/b;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    return-object p1

    :cond_7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v2

    if-eqz v2, :cond_8

    check-cast p0, Ljava/lang/Enum;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_8
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result p1

    new-instance v0, Lc/a/a/b;

    invoke-direct {v0, p1}, Lc/a/a/b;-><init>(I)V

    const/4 v1, 0x0

    :goto_3
    if-ge v1, p1, :cond_9

    invoke-static {p0, v1}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lc/a/a/a;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lc/a/a/b;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_9
    return-object v0

    :cond_a
    invoke-static {v1}, Lc/a/a/i/m;->f(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_b

    return-object p0

    :cond_b
    invoke-virtual {p1, v1}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object p1

    instance-of v1, p1, Lc/a/a/j/n;

    if-eqz v1, :cond_d

    check-cast p1, Lc/a/a/j/n;

    new-instance v0, Lc/a/a/e;

    invoke-direct {v0}, Lc/a/a/e;-><init>()V

    :try_start_0
    invoke-virtual {p1, p0}, Lc/a/a/j/n;->b(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lc/a/a/a;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lc/a/a/e;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :cond_c
    return-object v0

    :catch_0
    move-exception p0

    new-instance p1, Lc/a/a/d;

    const-string v0, "toJSON error"

    invoke-direct {p1, v0, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_d
    return-object v0
.end method

.method public static final l(Ljava/lang/Object;)Ljava/lang/String;
    .locals 6

    sget-object v1, Lc/a/a/j/x;->a:Lc/a/a/j/x;

    sget v4, Lc/a/a/a;->f:I

    const/4 v0, 0x0

    new-array v5, v0, [Lc/a/a/j/a0;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lc/a/a/a;->m(Ljava/lang/Object;Lc/a/a/j/x;[Lc/a/a/j/y;Ljava/lang/String;I[Lc/a/a/j/a0;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static varargs m(Ljava/lang/Object;Lc/a/a/j/x;[Lc/a/a/j/y;Ljava/lang/String;I[Lc/a/a/j/a0;)Ljava/lang/String;
    .locals 5

    new-instance v0, Lc/a/a/j/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p4, p5}, Lc/a/a/j/z;-><init>(Ljava/io/Writer;I[Lc/a/a/j/a0;)V

    :try_start_0
    new-instance p4, Lc/a/a/j/m;

    invoke-direct {p4, v0, p1}, Lc/a/a/j/m;-><init>(Lc/a/a/j/z;Lc/a/a/j/x;)V

    array-length p1, p5

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, p1, :cond_0

    aget-object v4, p5, v2

    invoke-virtual {p4, v4, v3}, Lc/a/a/j/m;->c(Lc/a/a/j/a0;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p4, p3}, Lc/a/a/j/m;->q(Ljava/lang/String;)V

    sget-object p1, Lc/a/a/j/a0;->r:Lc/a/a/j/a0;

    invoke-virtual {p4, p1, v3}, Lc/a/a/j/m;->c(Lc/a/a/j/a0;Z)V

    :cond_1
    if-eqz p2, :cond_9

    array-length p1, p2

    :goto_1
    if-ge v1, p1, :cond_9

    aget-object p3, p2, v1

    if-nez p3, :cond_2

    goto :goto_2

    :cond_2
    instance-of p5, p3, Lc/a/a/j/v;

    if-eqz p5, :cond_3

    invoke-virtual {p4}, Lc/a/a/j/m;->j()Ljava/util/List;

    move-result-object p5

    move-object v2, p3

    check-cast v2, Lc/a/a/j/v;

    invoke-interface {p5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    instance-of p5, p3, Lc/a/a/j/r;

    if-eqz p5, :cond_4

    invoke-virtual {p4}, Lc/a/a/j/m;->h()Ljava/util/List;

    move-result-object p5

    move-object v2, p3

    check-cast v2, Lc/a/a/j/r;

    invoke-interface {p5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    instance-of p5, p3, Lc/a/a/j/c0;

    if-eqz p5, :cond_5

    invoke-virtual {p4}, Lc/a/a/j/m;->k()Ljava/util/List;

    move-result-object p5

    move-object v2, p3

    check-cast v2, Lc/a/a/j/c0;

    invoke-interface {p5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    instance-of p5, p3, Lc/a/a/j/u;

    if-eqz p5, :cond_6

    invoke-virtual {p4}, Lc/a/a/j/m;->i()Ljava/util/List;

    move-result-object p5

    move-object v2, p3

    check-cast v2, Lc/a/a/j/u;

    invoke-interface {p5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    instance-of p5, p3, Lc/a/a/j/d;

    if-eqz p5, :cond_7

    invoke-virtual {p4}, Lc/a/a/j/m;->f()Ljava/util/List;

    move-result-object p5

    move-object v2, p3

    check-cast v2, Lc/a/a/j/d;

    invoke-interface {p5, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    instance-of p5, p3, Lc/a/a/j/a;

    if-eqz p5, :cond_8

    invoke-virtual {p4}, Lc/a/a/j/m;->e()Ljava/util/List;

    move-result-object p5

    check-cast p3, Lc/a/a/j/a;

    invoke-interface {p5, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_9
    invoke-virtual {p4, p0}, Lc/a/a/j/m;->r(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc/a/a/j/z;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lc/a/a/j/z;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lc/a/a/j/z;->close()V

    throw p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 4

    new-instance v0, Lc/a/a/j/z;

    sget v1, Lc/a/a/a;->f:I

    sget-object v2, Lc/a/a/j/a0;->x:[Lc/a/a/j/a0;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lc/a/a/j/z;-><init>(Ljava/io/Writer;I[Lc/a/a/j/a0;)V

    :try_start_0
    new-instance v1, Lc/a/a/j/m;

    sget-object v2, Lc/a/a/j/x;->a:Lc/a/a/j/x;

    invoke-direct {v1, v0, v2}, Lc/a/a/j/m;-><init>(Lc/a/a/j/z;Lc/a/a/j/x;)V

    invoke-virtual {v1, p0}, Lc/a/a/j/m;->r(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc/a/a/j/z;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lc/a/a/j/z;->close()V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {v0}, Lc/a/a/j/z;->close()V

    throw p0
.end method

.method public b(Ljava/lang/Appendable;)V
    .locals 4

    new-instance v0, Lc/a/a/j/z;

    sget v1, Lc/a/a/a;->f:I

    sget-object v2, Lc/a/a/j/a0;->x:[Lc/a/a/j/a0;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2}, Lc/a/a/j/z;-><init>(Ljava/io/Writer;I[Lc/a/a/j/a0;)V

    :try_start_0
    new-instance v1, Lc/a/a/j/m;

    sget-object v2, Lc/a/a/j/x;->a:Lc/a/a/j/x;

    invoke-direct {v1, v0, v2}, Lc/a/a/j/m;-><init>(Lc/a/a/j/z;Lc/a/a/j/x;)V

    invoke-virtual {v1, p0}, Lc/a/a/j/m;->r(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc/a/a/j/z;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lc/a/a/j/z;->close()V

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    :try_start_1
    new-instance p1, Lc/a/a/d;

    invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-virtual {v0}, Lc/a/a/j/z;->close()V

    throw p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Lc/a/a/a;->a()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
