.class public Lc/a/a/i/a;
.super Lc/a/a/i/q/d;
.source ""


# instance fields
.field protected e:Lc/a/a/i/q/f;


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

    const/4 p1, 0x2

    invoke-direct {p0, p2, p3, p1}, Lc/a/a/i/q/d;-><init>(Ljava/lang/Class;Lc/a/a/k/a;I)V

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

    iget-object v0, p0, Lc/a/a/i/a;->e:Lc/a/a/i/q/f;

    if-nez v0, :cond_0

    iget-object v0, p1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    iget-object v1, p0, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v2, v1, Lc/a/a/k/a;->h:Ljava/lang/Class;

    iget-object v1, v1, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    invoke-virtual {v0, v2, v1}, Lc/a/a/i/m;->c(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v0

    iput-object v0, p0, Lc/a/a/i/a;->e:Lc/a/a/i/q/f;

    :cond_0
    iget-object v0, p0, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v0, v0, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    instance-of v1, p3, Ljava/lang/reflect/ParameterizedType;

    if-eqz v1, :cond_2

    iget-object v2, p1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    if-eqz v2, :cond_1

    iput-object p3, v2, Lc/a/a/i/l;->d:Ljava/lang/reflect/Type;

    :cond_1
    iget-object v2, p0, Lc/a/a/i/q/d;->b:Ljava/lang/Class;

    invoke-static {v2, p3, v0}, Lc/a/a/k/a;->e(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v0

    iget-object v2, p1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v2, v0}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v2

    iput-object v2, p0, Lc/a/a/i/a;->e:Lc/a/a/i/q/f;

    :cond_2
    instance-of v2, v0, Ljava/lang/reflect/ParameterizedType;

    if-eqz v2, :cond_3

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    check-cast p3, Ljava/lang/reflect/ParameterizedType;

    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-interface {p3}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/Class;

    if-eqz v4, :cond_3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    move-result-object v3

    invoke-interface {p3}, Ljava/lang/reflect/ParameterizedType;->getActualTypeArguments()[Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-static {v2, v3, p3}, Lc/a/a/k/d;->y([Ljava/lang/reflect/Type;[Ljava/lang/reflect/TypeVariable;[Ljava/lang/reflect/Type;)Z

    move-result p3

    if-eqz p3, :cond_3

    new-instance v0, Lc/a/a/k/c;

    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    move-result-object p3

    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getRawType()Ljava/lang/reflect/Type;

    move-result-object v1

    invoke-direct {v0, v2, p3, v1}, Lc/a/a/k/c;-><init>([Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    :cond_3
    iget-object p3, p0, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v1, p3, Lc/a/a/k/a;->o:Ljava/lang/String;

    if-eqz v1, :cond_4

    iget-object v2, p0, Lc/a/a/i/a;->e:Lc/a/a/i/q/f;

    instance-of v3, v2, Lc/a/a/j/h;

    if-eqz v3, :cond_4

    check-cast v2, Lc/a/a/j/h;

    iget-object p3, p3, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {v2, p1, v0, p3, v1}, Lc/a/a/j/h;->d(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    :cond_4
    iget-object v1, p0, Lc/a/a/i/a;->e:Lc/a/a/i/q/f;

    iget-object p3, p3, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-interface {v1, p1, v0, p3}, Lc/a/a/i/q/f;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    :goto_0
    iget v0, p1, Lc/a/a/i/b;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    invoke-virtual {p1}, Lc/a/a/i/b;->h()Lc/a/a/i/b$a;

    move-result-object p2

    iput-object p0, p2, Lc/a/a/i/b$a;->c:Lc/a/a/i/q/d;

    iget-object p0, p1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iput-object p0, p2, Lc/a/a/i/b$a;->d:Lc/a/a/i/l;

    const/4 p0, 0x0

    iput p0, p1, Lc/a/a/i/b;->k:I

    goto :goto_1

    :cond_5
    if-nez p2, :cond_6

    iget-object p0, p0, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object p0, p0, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-interface {p4, p0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_6
    if-nez p3, :cond_8

    iget-object p1, p0, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object p1, p1, Lc/a/a/k/a;->h:Ljava/lang/Class;

    sget-object p4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    if-eq p1, p4, :cond_7

    sget-object p4, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    if-eq p1, p4, :cond_7

    sget-object p4, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    if-eq p1, p4, :cond_7

    sget-object p4, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    if-ne p1, p4, :cond_8

    :cond_7
    return-void

    :cond_8
    invoke-virtual {p0, p2, p3}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public h(Lc/a/a/i/m;)Lc/a/a/i/q/f;
    .locals 2

    iget-object v0, p0, Lc/a/a/i/a;->e:Lc/a/a/i/q/f;

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v1, v0, Lc/a/a/k/a;->h:Ljava/lang/Class;

    iget-object v0, v0, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    invoke-virtual {p1, v1, v0}, Lc/a/a/i/m;->c(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object p1

    iput-object p1, p0, Lc/a/a/i/a;->e:Lc/a/a/i/q/f;

    :cond_0
    iget-object p0, p0, Lc/a/a/i/a;->e:Lc/a/a/i/q/f;

    return-object p0
.end method
