.class final Lc/a/a/j/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;


# instance fields
.field private final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field private final b:Lc/a/a/j/t;


# direct methods
.method constructor <init>(Ljava/lang/Class;Lc/a/a/j/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lc/a/a/j/t;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/j/c;->a:Ljava/lang/Class;

    iput-object p2, p0, Lc/a/a/j/c;->b:Lc/a/a/j/t;

    return-void
.end method


# virtual methods
.method public final a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 9

    iget-object p4, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const-string v0, "[]"

    if-nez p2, :cond_1

    iget p0, p4, Lc/a/a/j/z;->n:I

    sget-object p1, Lc/a/a/j/a0;->g:Lc/a/a/j/a0;

    iget p1, p1, Lc/a/a/j/a0;->z:I

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    invoke-virtual {p4, v0}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Lc/a/a/j/z;->o()V

    :goto_0
    return-void

    :cond_1
    instance-of v1, p2, [Z

    const/16 v2, 0x2c

    const/16 v3, 0x5d

    const/16 v4, 0x5b

    const/4 v5, 0x0

    if-eqz v1, :cond_4

    check-cast p2, [Z

    invoke-virtual {p4, v4}, Lc/a/a/j/z;->write(I)V

    :goto_1
    array-length p0, p2

    if-ge v5, p0, :cond_3

    if-eqz v5, :cond_2

    invoke-virtual {p4, v2}, Lc/a/a/j/z;->write(I)V

    :cond_2
    aget-boolean p0, p2, v5

    invoke-virtual {p4, p0}, Lc/a/a/j/z;->h(Z)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p4, v3}, Lc/a/a/j/z;->write(I)V

    return-void

    :cond_4
    instance-of v1, p2, [B

    if-eqz v1, :cond_5

    check-cast p2, [B

    invoke-virtual {p4, p2}, Lc/a/a/j/z;->i([B)V

    return-void

    :cond_5
    instance-of v1, p2, [C

    if-eqz v1, :cond_6

    check-cast p2, [C

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, p2}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {p4, p0}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    return-void

    :cond_6
    instance-of v1, p2, [D

    const/4 v6, -0x1

    if-eqz v1, :cond_b

    check-cast p2, [D

    array-length p0, p2

    add-int/lit8 p0, p0, -0x1

    if-ne p0, v6, :cond_7

    invoke-virtual {p4, v0}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    return-void

    :cond_7
    invoke-virtual {p4, v4}, Lc/a/a/j/z;->write(I)V

    :goto_2
    if-ge v5, p0, :cond_9

    aget-wide v0, p2, v5

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p4}, Lc/a/a/j/z;->o()V

    goto :goto_3

    :cond_8
    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    :goto_3
    invoke-virtual {p4, v2}, Lc/a/a/j/z;->write(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_9
    aget-wide p0, p2, p0

    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {p4}, Lc/a/a/j/z;->o()V

    goto :goto_4

    :cond_a
    invoke-static {p0, p1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p0}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    :goto_4
    invoke-virtual {p4, v3}, Lc/a/a/j/z;->write(I)V

    return-void

    :cond_b
    instance-of v1, p2, [F

    if-eqz v1, :cond_10

    check-cast p2, [F

    array-length p0, p2

    add-int/lit8 p0, p0, -0x1

    if-ne p0, v6, :cond_c

    invoke-virtual {p4, v0}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    return-void

    :cond_c
    invoke-virtual {p4, v4}, Lc/a/a/j/z;->write(I)V

    :goto_5
    if-ge v5, p0, :cond_e

    aget p1, p2, v5

    invoke-static {p1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p3

    if-eqz p3, :cond_d

    invoke-virtual {p4}, Lc/a/a/j/z;->o()V

    goto :goto_6

    :cond_d
    invoke-static {p1}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    :goto_6
    invoke-virtual {p4, v2}, Lc/a/a/j/z;->write(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_e
    aget p0, p2, p0

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result p1

    if-eqz p1, :cond_f

    invoke-virtual {p4}, Lc/a/a/j/z;->o()V

    goto :goto_7

    :cond_f
    invoke-static {p0}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p4, p0}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    :goto_7
    invoke-virtual {p4, v3}, Lc/a/a/j/z;->write(I)V

    return-void

    :cond_10
    instance-of v0, p2, [I

    if-eqz v0, :cond_13

    check-cast p2, [I

    invoke-virtual {p4, v4}, Lc/a/a/j/z;->write(I)V

    :goto_8
    array-length p0, p2

    if-ge v5, p0, :cond_12

    if-eqz v5, :cond_11

    invoke-virtual {p4, v2}, Lc/a/a/j/z;->write(I)V

    :cond_11
    aget p0, p2, v5

    invoke-virtual {p4, p0}, Lc/a/a/j/z;->k(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_12
    invoke-virtual {p4, v3}, Lc/a/a/j/z;->write(I)V

    return-void

    :cond_13
    instance-of v0, p2, [J

    if-eqz v0, :cond_16

    check-cast p2, [J

    invoke-virtual {p4, v4}, Lc/a/a/j/z;->write(I)V

    :goto_9
    array-length p0, p2

    if-ge v5, p0, :cond_15

    if-eqz v5, :cond_14

    invoke-virtual {p4, v2}, Lc/a/a/j/z;->write(I)V

    :cond_14
    aget-wide p0, p2, v5

    invoke-virtual {p4, p0, p1}, Lc/a/a/j/z;->n(J)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_15
    invoke-virtual {p4, v3}, Lc/a/a/j/z;->write(I)V

    return-void

    :cond_16
    instance-of v0, p2, [S

    if-eqz v0, :cond_19

    check-cast p2, [S

    invoke-virtual {p4, v4}, Lc/a/a/j/z;->write(I)V

    :goto_a
    array-length p0, p2

    if-ge v5, p0, :cond_18

    if-eqz v5, :cond_17

    invoke-virtual {p4, v2}, Lc/a/a/j/z;->write(I)V

    :cond_17
    aget-short p0, p2, v5

    invoke-virtual {p4, p0}, Lc/a/a/j/z;->k(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_18
    invoke-virtual {p4, v3}, Lc/a/a/j/z;->write(I)V

    return-void

    :cond_19
    move-object v0, p2

    check-cast v0, [Ljava/lang/Object;

    array-length v1, v0

    iget-object v6, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    invoke-virtual {p1, v6, p2, p3, v5}, Lc/a/a/j/m;->p(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    :try_start_0
    invoke-virtual {p4, v4}, Lc/a/a/j/z;->write(I)V

    :goto_b
    if-ge v5, v1, :cond_1e

    if-eqz v5, :cond_1a

    invoke-virtual {p4, v2}, Lc/a/a/j/z;->write(I)V

    :cond_1a
    aget-object p3, v0, v5

    if-nez p3, :cond_1c

    sget-object p3, Lc/a/a/j/a0;->h:Lc/a/a/j/a0;

    invoke-virtual {p4, p3}, Lc/a/a/j/z;->g(Lc/a/a/j/a0;)Z

    move-result p3

    if-eqz p3, :cond_1b

    instance-of p3, p2, [Ljava/lang/String;

    if-eqz p3, :cond_1b

    const-string p3, ""

    invoke-virtual {p4, p3}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    goto :goto_d

    :cond_1b
    const-string p3, "null"

    invoke-virtual {p4, p3}, Lc/a/a/j/z;->b(Ljava/lang/CharSequence;)Lc/a/a/j/z;

    goto :goto_d

    :cond_1c
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    iget-object v7, p0, Lc/a/a/j/c;->a:Ljava/lang/Class;

    const/4 v8, 0x0

    if-ne v4, v7, :cond_1d

    iget-object v4, p0, Lc/a/a/j/c;->b:Lc/a/a/j/t;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :goto_c
    invoke-interface {v4, p1, p3, v7, v8}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_d

    :cond_1d
    iget-object v4, p1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    invoke-virtual {v4, v7}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_c

    :goto_d
    add-int/lit8 v5, v5, 0x1

    goto :goto_b

    :cond_1e
    invoke-virtual {p4, v3}, Lc/a/a/j/z;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v6, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    return-void

    :catchall_0
    move-exception p0

    iput-object v6, p1, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    throw p0
.end method
