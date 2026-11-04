.class Lc/a/a/j/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 0

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    iget p1, p0, Lc/a/a/j/z;->n:I

    sget-object p3, Lc/a/a/j/a0;->e:Lc/a/a/j/a0;

    iget p3, p3, Lc/a/a/j/a0;->z:I

    and-int/2addr p1, p3

    check-cast p2, Ljava/lang/Enum;

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p1

    iget p2, p0, Lc/a/a/j/z;->n:I

    sget-object p3, Lc/a/a/j/a0;->c:Lc/a/a/j/a0;

    iget p3, p3, Lc/a/a/j/a0;->z:I

    and-int/2addr p2, p3

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, p3

    :goto_0
    if-eqz p2, :cond_1

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->r(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, p1, p3, p3}, Lc/a/a/j/z;->q(Ljava/lang/String;CZ)V

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->k(I)V

    :goto_1
    return-void
.end method
