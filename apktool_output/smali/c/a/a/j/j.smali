.class public final Lc/a/a/j/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/j/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lc/a/a/j/j;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lc/a/a/k/a;

.field protected final c:Z

.field protected final d:I

.field protected final e:Ljava/lang/String;

.field protected f:[C

.field private g:Lc/a/a/j/j$a;


# direct methods
.method public constructor <init>(Lc/a/a/k/a;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    invoke-virtual {p1}, Lc/a/a/k/a;->d()Lc/a/a/h/b;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lc/a/a/h/b;->serialzeFeatures()[Lc/a/a/j/a0;

    move-result-object v4

    array-length v5, v4

    move v6, v3

    move v7, v6

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v8, v4, v6

    sget-object v9, Lc/a/a/j/a0;->d:Lc/a/a/j/a0;

    if-ne v8, v9, :cond_0

    move v7, v2

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lc/a/a/h/b;->format()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v4

    :goto_1
    invoke-interface {v0}, Lc/a/a/h/b;->serialzeFeatures()[Lc/a/a/j/a0;

    move-result-object v0

    invoke-static {v0}, Lc/a/a/j/a0;->a([Lc/a/a/j/a0;)I

    move-result v0

    iput v0, p0, Lc/a/a/j/j;->d:I

    goto :goto_2

    :cond_3
    iput v3, p0, Lc/a/a/j/j;->d:I

    move v7, v3

    :goto_2
    iput-boolean v7, p0, Lc/a/a/j/j;->c:Z

    iput-object v1, p0, Lc/a/a/j/j;->e:Ljava/lang/String;

    iget-object p1, p1, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x3

    new-array v1, v1, [C

    iput-object v1, p0, Lc/a/a/j/j;->f:[C

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    iget-object v4, p0, Lc/a/a/j/j;->f:[C

    invoke-virtual {p1, v3, v1, v4, v2}, Ljava/lang/String;->getChars(II[CI)V

    iget-object p0, p0, Lc/a/a/j/j;->f:[C

    const/16 p1, 0x22

    aput-char p1, p0, v3

    add-int/lit8 v1, v0, 0x1

    aput-char p1, p0, v1

    add-int/lit8 v0, v0, 0x2

    const/16 p1, 0x3a

    aput-char p1, p0, v0

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/j;)I
    .locals 0

    iget-object p0, p0, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    iget-object p1, p1, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    invoke-virtual {p0, p1}, Lc/a/a/k/a;->a(Lc/a/a/k/a;)I

    move-result p0

    return p0
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    invoke-virtual {v0, p1}, Lc/a/a/k/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    iget-object p0, p0, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    iget-object v0, p0, Lc/a/a/k/a;->c:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/a/a/k/a;->d:Ljava/lang/reflect/Field;

    :goto_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance v0, Lc/a/a/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get property error\u3002 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public c(Lc/a/a/j/m;)V
    .locals 3

    iget-object p1, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    iget v0, p1, Lc/a/a/j/z;->n:I

    sget-object v1, Lc/a/a/j/a0;->b:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    and-int/2addr v1, v0

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    sget-object v1, Lc/a/a/j/a0;->c:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p0, Lc/a/a/j/j;->f:[C

    const/4 v0, 0x0

    array-length v1, p0

    invoke-virtual {p1, p0, v0, v1}, Lc/a/a/j/z;->write([CII)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p0, p0, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    iget-object p0, p0, Lc/a/a/k/a;->b:Ljava/lang/String;

    invoke-virtual {p1, p0, v2}, Lc/a/a/j/z;->j(Ljava/lang/String;Z)V

    :goto_1
    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lc/a/a/j/j;

    invoke-virtual {p0, p1}, Lc/a/a/j/j;->a(Lc/a/a/j/j;)I

    move-result p0

    return p0
.end method

.method public d(Lc/a/a/j/m;Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lc/a/a/j/j;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v0}, Lc/a/a/j/m;->w(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc/a/a/j/j;->g:Lc/a/a/j/j$a;

    if-nez v0, :cond_2

    if-nez p2, :cond_1

    iget-object v0, p0, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    iget-object v0, v0, Lc/a/a/k/a;->h:Ljava/lang/Class;

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    :goto_0
    iget-object v1, p1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v1, v0}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v1

    new-instance v2, Lc/a/a/j/j$a;

    invoke-direct {v2, v1, v0}, Lc/a/a/j/j$a;-><init>(Lc/a/a/j/t;Ljava/lang/Class;)V

    iput-object v2, p0, Lc/a/a/j/j;->g:Lc/a/a/j/j$a;

    :cond_2
    iget-object v0, p0, Lc/a/a/j/j;->g:Lc/a/a/j/j$a;

    if-nez p2, :cond_6

    iget p2, p0, Lc/a/a/j/j;->d:I

    sget-object v1, Lc/a/a/j/a0;->i:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    and-int/2addr p2, v1

    if-eqz p2, :cond_3

    const-class p2, Ljava/lang/Number;

    iget-object v1, v0, Lc/a/a/j/j$a;->b:Ljava/lang/Class;

    invoke-virtual {p2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const/16 p1, 0x30

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(I)V

    return-void

    :cond_3
    iget p2, p0, Lc/a/a/j/j;->d:I

    sget-object v1, Lc/a/a/j/a0;->j:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    and-int/2addr v1, p2

    if-eqz v1, :cond_4

    const-class v1, Ljava/lang/Boolean;

    iget-object v2, v0, Lc/a/a/j/j$a;->b:Ljava/lang/Class;

    if-ne v1, v2, :cond_4

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const-string p1, "false"

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    return-void

    :cond_4
    sget-object v1, Lc/a/a/j/a0;->g:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    and-int/2addr p2, v1

    if-eqz p2, :cond_5

    const-class p2, Ljava/util/Collection;

    iget-object v1, v0, Lc/a/a/j/j$a;->b:Ljava/lang/Class;

    invoke-virtual {p2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const-string p1, "[]"

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    return-void

    :cond_5
    iget-object p2, v0, Lc/a/a/j/j$a;->a:Lc/a/a/j/t;

    const/4 v1, 0x0

    iget-object p0, p0, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    iget-object p0, p0, Lc/a/a/k/a;->b:Ljava/lang/String;

    iget-object v0, v0, Lc/a/a/j/j$a;->b:Ljava/lang/Class;

    invoke-interface {p2, p1, v1, p0, v0}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    return-void

    :cond_6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    iget-object v2, v0, Lc/a/a/j/j$a;->b:Ljava/lang/Class;

    if-ne v1, v2, :cond_7

    iget-object v0, v0, Lc/a/a/j/j$a;->a:Lc/a/a/j/t;

    iget-object p0, p0, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    iget-object v1, p0, Lc/a/a/k/a;->b:Ljava/lang/String;

    iget-object p0, p0, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    invoke-interface {v0, p1, p2, v1, p0}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    return-void

    :cond_7
    iget-object v0, p1, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v0, v1}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v0

    iget-object p0, p0, Lc/a/a/j/j;->b:Lc/a/a/k/a;

    iget-object v1, p0, Lc/a/a/k/a;->b:Ljava/lang/String;

    iget-object p0, p0, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    invoke-interface {v0, p1, p2, v1, p0}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    return-void
.end method
