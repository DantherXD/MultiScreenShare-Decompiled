.class public La/e/a/m/m/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/e/a/m/m/o$a;
    }
.end annotation


# static fields
.field static a:I


# instance fields
.field b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/e/a/m/e;",
            ">;"
        }
    .end annotation
.end field

.field c:I

.field d:Z

.field e:I

.field f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "La/e/a/m/m/o$a;",
            ">;"
        }
    .end annotation
.end field

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, La/e/a/m/m/o;->b:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, La/e/a/m/m/o;->c:I

    const/4 v1, 0x0

    iput-boolean v1, p0, La/e/a/m/m/o;->d:Z

    iput v1, p0, La/e/a/m/m/o;->e:I

    const/4 v1, 0x0

    iput-object v1, p0, La/e/a/m/m/o;->f:Ljava/util/ArrayList;

    iput v0, p0, La/e/a/m/m/o;->g:I

    sget v0, La/e/a/m/m/o;->a:I

    add-int/lit8 v1, v0, 0x1

    sput v1, La/e/a/m/m/o;->a:I

    iput v0, p0, La/e/a/m/m/o;->c:I

    iput p1, p0, La/e/a/m/m/o;->e:I

    return-void
.end method

.method private e()Ljava/lang/String;
    .locals 1

    iget p0, p0, La/e/a/m/m/o;->e:I

    if-nez p0, :cond_0

    const-string p0, "Horizontal"

    return-object p0

    :cond_0
    const/4 v0, 0x1

    if-ne p0, v0, :cond_1

    const-string p0, "Vertical"

    return-object p0

    :cond_1
    const/4 v0, 0x2

    if-ne p0, v0, :cond_2

    const-string p0, "Both"

    return-object p0

    :cond_2
    const-string p0, "Unknown"

    return-object p0
.end method

.method private j(La/e/a/d;Ljava/util/ArrayList;I)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/e/a/d;",
            "Ljava/util/ArrayList<",
            "La/e/a/m/e;",
            ">;I)I"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/e;

    invoke-virtual {v1}, La/e/a/m/e;->I()La/e/a/m/e;

    move-result-object v1

    check-cast v1, La/e/a/m/f;

    invoke-virtual {p1}, La/e/a/d;->D()V

    invoke-virtual {v1, p1, v0}, La/e/a/m/e;->g(La/e/a/d;Z)V

    move v2, v0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/e/a/m/e;

    invoke-virtual {v3, p1, v0}, La/e/a/m/e;->g(La/e/a/d;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    iget v2, v1, La/e/a/m/f;->W0:I

    if-lez v2, :cond_1

    invoke-static {v1, p1, p2, v0}, La/e/a/m/b;->b(La/e/a/m/f;La/e/a/d;Ljava/util/ArrayList;I)V

    :cond_1
    const/4 v2, 0x1

    if-ne p3, v2, :cond_2

    iget v3, v1, La/e/a/m/f;->X0:I

    if-lez v3, :cond_2

    invoke-static {v1, p1, p2, v2}, La/e/a/m/b;->b(La/e/a/m/f;La/e/a/d;Ljava/util/ArrayList;I)V

    :cond_2
    :try_start_0
    invoke-virtual {p1}, La/e/a/d;->z()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, La/e/a/m/m/o;->f:Ljava/util/ArrayList;

    :goto_2
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_3

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/e/a/m/e;

    new-instance v3, La/e/a/m/m/o$a;

    invoke-direct {v3, p0, v2, p1, p3}, La/e/a/m/m/o$a;-><init>(La/e/a/m/m/o;La/e/a/m/e;La/e/a/d;I)V

    iget-object v2, p0, La/e/a/m/m/o;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    if-nez p3, :cond_4

    iget-object p0, v1, La/e/a/m/e;->P:La/e/a/m/d;

    invoke-virtual {p1, p0}, La/e/a/d;->x(Ljava/lang/Object;)I

    move-result p0

    iget-object p2, v1, La/e/a/m/e;->R:La/e/a/m/d;

    :goto_3
    invoke-virtual {p1, p2}, La/e/a/d;->x(Ljava/lang/Object;)I

    move-result p2

    invoke-virtual {p1}, La/e/a/d;->D()V

    sub-int/2addr p2, p0

    return p2

    :cond_4
    iget-object p0, v1, La/e/a/m/e;->Q:La/e/a/m/d;

    invoke-virtual {p1, p0}, La/e/a/d;->x(Ljava/lang/Object;)I

    move-result p0

    iget-object p2, v1, La/e/a/m/e;->S:La/e/a/m/d;

    goto :goto_3
.end method


# virtual methods
.method public a(La/e/a/m/e;)Z
    .locals 1

    iget-object v0, p0, La/e/a/m/m/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget-object p0, p0, La/e/a/m/m/o;->b:Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 p0, 0x1

    return p0
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "La/e/a/m/m/o;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, La/e/a/m/m/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, La/e/a/m/m/o;->g:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-lez v0, :cond_1

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/e/a/m/m/o;

    iget v3, p0, La/e/a/m/m/o;->g:I

    iget v4, v2, La/e/a/m/m/o;->c:I

    if-ne v3, v4, :cond_0

    iget v3, p0, La/e/a/m/m/o;->e:I

    invoke-virtual {p0, v3, v2}, La/e/a/m/m/o;->g(ILa/e/a/m/m/o;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public c()I
    .locals 0

    iget p0, p0, La/e/a/m/m/o;->c:I

    return p0
.end method

.method public d()I
    .locals 0

    iget p0, p0, La/e/a/m/m/o;->e:I

    return p0
.end method

.method public f(La/e/a/d;I)I
    .locals 1

    iget-object v0, p0, La/e/a/m/m/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget-object v0, p0, La/e/a/m/m/o;->b:Ljava/util/ArrayList;

    invoke-direct {p0, p1, v0, p2}, La/e/a/m/m/o;->j(La/e/a/d;Ljava/util/ArrayList;I)I

    move-result p0

    return p0
.end method

.method public g(ILa/e/a/m/m/o;)V
    .locals 3

    iget-object v0, p0, La/e/a/m/m/o;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/e;

    invoke-virtual {p2, v1}, La/e/a/m/m/o;->a(La/e/a/m/e;)Z

    invoke-virtual {p2}, La/e/a/m/m/o;->c()I

    move-result v2

    if-nez p1, :cond_0

    iput v2, v1, La/e/a/m/e;->I0:I

    goto :goto_0

    :cond_0
    iput v2, v1, La/e/a/m/e;->J0:I

    goto :goto_0

    :cond_1
    iget p1, p2, La/e/a/m/m/o;->c:I

    iput p1, p0, La/e/a/m/m/o;->g:I

    return-void
.end method

.method public h(Z)V
    .locals 0

    iput-boolean p1, p0, La/e/a/m/m/o;->d:Z

    return-void
.end method

.method public i(I)V
    .locals 0

    iput p1, p0, La/e/a/m/m/o;->e:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, La/e/a/m/m/o;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, La/e/a/m/m/o;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] <"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, La/e/a/m/m/o;->b:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/e;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, La/e/a/m/e;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " >"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
