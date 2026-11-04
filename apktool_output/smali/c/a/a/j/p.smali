.class public final Lc/a/a/j/p;
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
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 11

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    return-void

    :cond_0
    move-object p4, p2

    check-cast p4, Ljava/util/Map;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lc/a/a/e;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_1

    const-class v1, Ljava/util/HashMap;

    if-eq v0, v1, :cond_1

    const-class v1, Ljava/util/LinkedHashMap;

    if-ne v0, v1, :cond_2

    :cond_1
    const-string v0, "@type"

    invoke-interface {p4, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v2

    goto :goto_0

    :cond_2
    move v0, v3

    :goto_0
    iget v1, p0, Lc/a/a/j/z;->n:I

    sget-object v4, Lc/a/a/j/a0;->l:Lc/a/a/j/a0;

    iget v4, v4, Lc/a/a/j/a0;->z:I

    and-int/2addr v1, v4

    if-eqz v1, :cond_4

    instance-of v1, p4, Lc/a/a/e;

    if-eqz v1, :cond_3

    check-cast p4, Lc/a/a/e;

    invoke-virtual {p4}, Lc/a/a/e;->n()Ljava/util/Map;

    move-result-object p4

    :cond_3
    instance-of v1, p4, Ljava/util/SortedMap;

    if-nez v1, :cond_4

    instance-of v1, p4, Ljava/util/LinkedHashMap;

    if-nez v1, :cond_4

    :try_start_0
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1, p4}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p4, v1

    :catch_0
    :cond_4
    iget-object v1, p1, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    if-eqz v1, :cond_5

    invoke-virtual {v1, p2}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1, p2}, Lc/a/a/j/m;->t(Ljava/lang/Object;)V

    return-void

    :cond_5
    iget-object v1, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    invoke-virtual {p1, v1, p2, p3, v3}, Lc/a/a/j/m;->p(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    const/16 p3, 0x7b

    :try_start_1
    invoke-virtual {p0, p3}, Lc/a/a/j/z;->write(I)V

    invoke-virtual {p1}, Lc/a/a/j/m;->l()V

    iget p3, p0, Lc/a/a/j/z;->n:I

    sget-object v4, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v4, v4, Lc/a/a/j/a0;->z:I

    and-int/2addr p3, v4

    if-eqz p3, :cond_6

    if-nez v0, :cond_6

    iget-object p3, p1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    iget-object p3, p3, Lc/a/a/j/x;->c:Ljava/lang/String;

    invoke-virtual {p0, p3, v3}, Lc/a/a/j/z;->j(Ljava/lang/String;Z)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    move p3, v3

    goto :goto_1

    :cond_6
    move p3, v2

    :goto_1
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    move-object v5, v4

    move-object v6, v5

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {p1, p2, v7}, Lc/a/a/j/m;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {p1, p2, v7, v8}, Lc/a/a/j/m;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {p1, p2, v7, v8}, Lc/a/a/j/m;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {p1, p2, v7, v8}, Lc/a/a/j/m;->o(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_9

    iget v9, p0, Lc/a/a/j/z;->n:I

    sget-object v10, Lc/a/a/j/a0;->d:Lc/a/a/j/a0;

    iget v10, v10, Lc/a/a/j/a0;->z:I

    and-int/2addr v9, v10

    if-nez v9, :cond_9

    goto :goto_2

    :cond_9
    instance-of v9, v7, Ljava/lang/String;

    const/16 v10, 0x2c

    if-eqz v9, :cond_c

    move-object v9, v7

    check-cast v9, Ljava/lang/String;

    if-nez p3, :cond_a

    invoke-virtual {p0, v10}, Lc/a/a/j/z;->write(I)V

    :cond_a
    iget p3, p0, Lc/a/a/j/z;->n:I

    sget-object v10, Lc/a/a/j/a0;->n:Lc/a/a/j/a0;

    iget v10, v10, Lc/a/a/j/a0;->z:I

    and-int/2addr p3, v10

    if-eqz p3, :cond_b

    invoke-virtual {p1}, Lc/a/a/j/m;->m()V

    :cond_b
    invoke-virtual {p0, v9, v2}, Lc/a/a/j/z;->j(Ljava/lang/String;Z)V

    goto :goto_4

    :cond_c
    if-nez p3, :cond_d

    invoke-virtual {p0, v10}, Lc/a/a/j/z;->write(I)V

    :cond_d
    iget p3, p0, Lc/a/a/j/z;->n:I

    sget-object v9, Lc/a/a/j/a0;->v:Lc/a/a/j/a0;

    iget v9, v9, Lc/a/a/j/a0;->z:I

    and-int/2addr p3, v9

    if-eqz p3, :cond_e

    instance-of p3, v7, Ljava/lang/Enum;

    if-nez p3, :cond_e

    invoke-static {v7}, Lc/a/a/a;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lc/a/a/j/m;->s(Ljava/lang/String;)V

    goto :goto_3

    :cond_e
    invoke-virtual {p1, v7}, Lc/a/a/j/m;->r(Ljava/lang/Object;)V

    :goto_3
    const/16 p3, 0x3a

    invoke-virtual {p0, p3}, Lc/a/a/j/z;->write(I)V

    :goto_4
    if-nez v8, :cond_f

    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    :goto_5
    move p3, v3

    goto :goto_2

    :cond_f
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    if-ne p3, v5, :cond_10

    invoke-interface {v6, p1, v8, v7, v4}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_5

    :cond_10
    iget-object v5, p1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v5, p3}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v5

    invoke-interface {v5, p1, v8, v7, v4}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v6, v5

    move-object v5, p3

    goto :goto_5

    :cond_11
    iput-object v1, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    invoke-virtual {p1}, Lc/a/a/j/m;->d()V

    iget p2, p0, Lc/a/a/j/z;->n:I

    sget-object p3, Lc/a/a/j/a0;->n:Lc/a/a/j/a0;

    iget p3, p3, Lc/a/a/j/a0;->z:I

    and-int/2addr p2, p3

    if-eqz p2, :cond_12

    invoke-interface {p4}, Ljava/util/Map;->size()I

    move-result p2

    if-lez p2, :cond_12

    invoke-virtual {p1}, Lc/a/a/j/m;->m()V

    :cond_12
    const/16 p1, 0x7d

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(I)V

    return-void

    :catchall_0
    move-exception p0

    iput-object v1, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    throw p0
.end method
