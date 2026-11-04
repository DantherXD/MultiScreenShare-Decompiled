.class public final Lc/a/a/j/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;
.implements Lc/a/a/i/q/f;


# static fields
.field public static final a:Lc/a/a/j/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/f;

    invoke-direct {v0}, Lc/a/a/j/f;-><init>()V

    sput-object v0, Lc/a/a/j/f;->a:Lc/a/a/j/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 0

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    check-cast p2, Ljava/lang/Boolean;

    const-string p1, "false"

    if-nez p2, :cond_1

    iget p2, p0, Lc/a/a/j/z;->n:I

    sget-object p3, Lc/a/a/j/a0;->j:Lc/a/a/j/a0;

    iget p3, p3, Lc/a/a/j/a0;->z:I

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p1, "true"

    :cond_2
    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    return-void
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

    move-result p2

    const/16 p3, 0x10

    const/4 v0, 0x6

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p3}, Lc/a/a/i/e;->t(I)V

    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_0
    const/4 v0, 0x7

    if-ne p2, v0, :cond_2

    invoke-virtual {p0, p3}, Lc/a/a/i/e;->t(I)V

    :cond_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    invoke-virtual {p0}, Lc/a/a/i/e;->j()I

    move-result p1

    invoke-virtual {p0, p3}, Lc/a/a/i/e;->t(I)V

    const/4 p0, 0x1

    if-ne p1, p0, :cond_1

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_4

    const/4 p0, 0x0

    return-object p0

    :cond_4
    invoke-static {p0}, Lc/a/a/k/d;->h(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    :goto_1
    return-object p0
.end method
