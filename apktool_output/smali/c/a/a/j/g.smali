.class public Lc/a/a/j/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;
.implements Lc/a/a/i/q/f;


# static fields
.field public static final a:Lc/a/a/j/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/g;

    invoke-direct {v0}, Lc/a/a/j/g;-><init>()V

    sput-object v0, Lc/a/a/j/g;->a:Lc/a/a/j/g;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 4

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    if-nez p2, :cond_1

    iget p1, p0, Lc/a/a/j/z;->n:I

    sget-object p2, Lc/a/a/j/a0;->g:Lc/a/a/j/a0;

    iget p2, p2, Lc/a/a/j/a0;->z:I

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const-string p1, "[]"

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    iget v1, p0, Lc/a/a/j/z;->n:I

    sget-object v2, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v3, v2, Lc/a/a/j/a0;->z:I

    and-int/2addr v1, v3

    if-eqz v1, :cond_2

    invoke-static {p4}, Lc/a/a/k/d;->B(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    :cond_2
    move-object p4, p2

    check-cast p4, Ljava/util/Collection;

    iget-object v1, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    const/4 v3, 0x0

    invoke-virtual {p1, v1, p2, p3, v3}, Lc/a/a/j/m;->p(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    iget p2, p0, Lc/a/a/j/z;->n:I

    iget p3, v2, Lc/a/a/j/a0;->z:I

    and-int/2addr p2, p3

    if-eqz p2, :cond_4

    const-class p2, Ljava/util/HashSet;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    if-ne p2, p3, :cond_3

    const-string p2, "Set"

    :goto_1
    invoke-virtual {p0, p2}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    goto :goto_2

    :cond_3
    const-class p2, Ljava/util/TreeSet;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    if-ne p2, p3, :cond_4

    const-string p2, "TreeSet"

    goto :goto_1

    :cond_4
    :goto_2
    const/16 p2, 0x5b

    :try_start_0
    invoke-virtual {p0, p2}, Lc/a/a/j/z;->write(I)V

    invoke-interface {p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 p4, v3, 0x1

    if-eqz v3, :cond_5

    const/16 v2, 0x2c

    invoke-virtual {p0, v2}, Lc/a/a/j/z;->write(I)V

    :cond_5
    if-nez p3, :cond_6

    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    goto :goto_4

    :cond_6
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Ljava/lang/Integer;

    if-ne v2, v3, :cond_7

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    invoke-virtual {p0, p3}, Lc/a/a/j/z;->k(I)V

    goto :goto_4

    :cond_7
    const-class v3, Ljava/lang/Long;

    if-ne v2, v3, :cond_8

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {p0, v2, v3}, Lc/a/a/j/z;->n(J)V

    iget p3, p0, Lc/a/a/j/z;->n:I

    sget-object v2, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v2, v2, Lc/a/a/j/a0;->z:I

    and-int/2addr p3, v2

    if-eqz p3, :cond_9

    const/16 p3, 0x4c

    invoke-virtual {p0, p3}, Lc/a/a/j/z;->write(I)V

    goto :goto_4

    :cond_8
    iget-object v3, p1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v3, v2}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v2

    add-int/lit8 v3, p4, -0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, p1, p3, v3, v0}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    :cond_9
    :goto_4
    move v3, p4

    goto :goto_3

    :cond_a
    const/16 p2, 0x5d

    invoke-virtual {p0, p2}, Lc/a/a/j/z;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    return-void

    :catchall_0
    move-exception p0

    iput-object v1, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    throw p0
.end method

.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
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

    iget-object p0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->e0()I

    move-result p0

    const/16 v0, 0x8

    if-ne p0, v0, :cond_0

    iget-object p0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    const/16 p1, 0x10

    invoke-virtual {p0, p1}, Lc/a/a/i/e;->t(I)V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-class p0, Lc/a/a/b;

    if-ne p2, p0, :cond_1

    new-instance p0, Lc/a/a/b;

    invoke-direct {p0}, Lc/a/a/b;-><init>()V

    invoke-virtual {p1, p0}, Lc/a/a/i/b;->n(Ljava/util/Collection;)V

    return-object p0

    :cond_1
    move-object p0, p2

    :goto_0
    instance-of v0, p0, Ljava/lang/Class;

    if-eqz v0, :cond_a

    check-cast p0, Ljava/lang/Class;

    const-class v0, Ljava/util/AbstractCollection;

    if-eq p0, v0, :cond_9

    const-class v0, Ljava/util/Collection;

    if-ne p0, v0, :cond_2

    goto/16 :goto_2

    :cond_2
    const-class v0, Ljava/util/HashSet;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p0, Ljava/util/HashSet;

    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    goto/16 :goto_3

    :cond_3
    const-class v0, Ljava/util/LinkedHashSet;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance p0, Ljava/util/LinkedHashSet;

    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    goto :goto_3

    :cond_4
    const-class v0, Ljava/util/TreeSet;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p0, Ljava/util/TreeSet;

    invoke-direct {p0}, Ljava/util/TreeSet;-><init>()V

    goto :goto_3

    :cond_5
    const-class v0, Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_3

    :cond_6
    const-class v0, Ljava/util/EnumSet;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_8

    instance-of p0, p2, Ljava/lang/reflect/ParameterizedType;

    if-eqz p0, :cond_7

    move-object p0, p2

    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p0

    const/4 v0, 0x0

    aget-object p0, p0, v0

    goto :goto_1

    :cond_7
    const-class p0, Ljava/lang/Object;

    :goto_1
    check-cast p0, Ljava/lang/Class;

    invoke-static {p0}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p0

    goto :goto_3

    :cond_8
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p0, v0

    goto :goto_3

    :catch_0
    new-instance p1, Lc/a/a/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "create instane error, class "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    :goto_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    invoke-static {p2}, Lc/a/a/k/d;->B(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object p2

    invoke-virtual {p1, p2, p0, p3}, Lc/a/a/i/b;->m(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    return-object p0

    :cond_a
    instance-of v0, p0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v0, :cond_b

    check-cast p0, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {p0}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object p0

    goto/16 :goto_0

    :cond_b
    new-instance p0, Lc/a/a/d;

    const-string p1, "TODO"

    invoke-direct {p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0
.end method
