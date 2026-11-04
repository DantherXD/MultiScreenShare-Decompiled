.class public La/e/a/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/e/a/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "La/e/a/i;",
        ">;"
    }
.end annotation


# static fields
.field private static b:I = 0x1


# instance fields
.field public c:Z

.field private d:Ljava/lang/String;

.field public e:I

.field f:I

.field public g:I

.field public h:F

.field public i:Z

.field j:[F

.field k:[F

.field l:La/e/a/i$a;

.field m:[La/e/a/b;

.field n:I

.field public o:I

.field p:Z

.field q:I

.field r:F

.field s:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "La/e/a/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(La/e/a/i$a;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p2, -0x1

    iput p2, p0, La/e/a/i;->e:I

    iput p2, p0, La/e/a/i;->f:I

    const/4 v0, 0x0

    iput v0, p0, La/e/a/i;->g:I

    iput-boolean v0, p0, La/e/a/i;->i:Z

    const/16 v1, 0x9

    new-array v2, v1, [F

    iput-object v2, p0, La/e/a/i;->j:[F

    new-array v1, v1, [F

    iput-object v1, p0, La/e/a/i;->k:[F

    const/16 v1, 0x10

    new-array v1, v1, [La/e/a/b;

    iput-object v1, p0, La/e/a/i;->m:[La/e/a/b;

    iput v0, p0, La/e/a/i;->n:I

    iput v0, p0, La/e/a/i;->o:I

    iput-boolean v0, p0, La/e/a/i;->p:Z

    iput p2, p0, La/e/a/i;->q:I

    const/4 p2, 0x0

    iput p2, p0, La/e/a/i;->r:F

    const/4 p2, 0x0

    iput-object p2, p0, La/e/a/i;->s:Ljava/util/HashSet;

    iput-object p1, p0, La/e/a/i;->l:La/e/a/i$a;

    return-void
.end method

.method static c()V
    .locals 1

    sget v0, La/e/a/i;->b:I

    add-int/lit8 v0, v0, 0x1

    sput v0, La/e/a/i;->b:I

    return-void
.end method


# virtual methods
.method public final a(La/e/a/b;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, La/e/a/i;->n:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, La/e/a/i;->m:[La/e/a/b;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, La/e/a/i;->m:[La/e/a/b;

    array-length v2, v0

    if-lt v1, v2, :cond_2

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La/e/a/b;

    iput-object v0, p0, La/e/a/i;->m:[La/e/a/b;

    :cond_2
    iget-object v0, p0, La/e/a/i;->m:[La/e/a/b;

    iget v1, p0, La/e/a/i;->n:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La/e/a/i;->n:I

    return-void
.end method

.method public b(La/e/a/i;)I
    .locals 0

    iget p0, p0, La/e/a/i;->e:I

    iget p1, p1, La/e/a/i;->e:I

    sub-int/2addr p0, p1

    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/e/a/i;

    invoke-virtual {p0, p1}, La/e/a/i;->b(La/e/a/i;)I

    move-result p0

    return p0
.end method

.method public final d(La/e/a/b;)V
    .locals 4

    iget v0, p0, La/e/a/i;->n:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, La/e/a/i;->m:[La/e/a/b;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    :goto_1
    add-int/lit8 p1, v0, -0x1

    if-ge v1, p1, :cond_0

    iget-object p1, p0, La/e/a/i;->m:[La/e/a/b;

    add-int/lit8 v2, v1, 0x1

    aget-object v3, p1, v2

    aput-object v3, p1, v1

    move v1, v2

    goto :goto_1

    :cond_0
    iget p1, p0, La/e/a/i;->n:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, La/e/a/i;->n:I

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public e()V
    .locals 6

    const/4 v0, 0x0

    iput-object v0, p0, La/e/a/i;->d:Ljava/lang/String;

    sget-object v1, La/e/a/i$a;->f:La/e/a/i$a;

    iput-object v1, p0, La/e/a/i;->l:La/e/a/i$a;

    const/4 v1, 0x0

    iput v1, p0, La/e/a/i;->g:I

    const/4 v2, -0x1

    iput v2, p0, La/e/a/i;->e:I

    iput v2, p0, La/e/a/i;->f:I

    const/4 v3, 0x0

    iput v3, p0, La/e/a/i;->h:F

    iput-boolean v1, p0, La/e/a/i;->i:Z

    iput-boolean v1, p0, La/e/a/i;->p:Z

    iput v2, p0, La/e/a/i;->q:I

    iput v3, p0, La/e/a/i;->r:F

    iget v2, p0, La/e/a/i;->n:I

    move v4, v1

    :goto_0
    if-ge v4, v2, :cond_0

    iget-object v5, p0, La/e/a/i;->m:[La/e/a/b;

    aput-object v0, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, La/e/a/i;->n:I

    iput v1, p0, La/e/a/i;->o:I

    iput-boolean v1, p0, La/e/a/i;->c:Z

    iget-object p0, p0, La/e/a/i;->k:[F

    invoke-static {p0, v3}, Ljava/util/Arrays;->fill([FF)V

    return-void
.end method

.method public f(La/e/a/d;F)V
    .locals 3

    iput p2, p0, La/e/a/i;->h:F

    const/4 p2, 0x1

    iput-boolean p2, p0, La/e/a/i;->i:Z

    const/4 p2, 0x0

    iput-boolean p2, p0, La/e/a/i;->p:Z

    const/4 v0, -0x1

    iput v0, p0, La/e/a/i;->q:I

    const/4 v1, 0x0

    iput v1, p0, La/e/a/i;->r:F

    iget v1, p0, La/e/a/i;->n:I

    iput v0, p0, La/e/a/i;->f:I

    move v0, p2

    :goto_0
    if-ge v0, v1, :cond_0

    iget-object v2, p0, La/e/a/i;->m:[La/e/a/b;

    aget-object v2, v2, v0

    invoke-virtual {v2, p1, p0, p2}, La/e/a/b;->A(La/e/a/d;La/e/a/i;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iput p2, p0, La/e/a/i;->n:I

    return-void
.end method

.method public g(La/e/a/i$a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, La/e/a/i;->l:La/e/a/i$a;

    return-void
.end method

.method public final h(La/e/a/d;La/e/a/b;)V
    .locals 4

    iget v0, p0, La/e/a/i;->n:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, La/e/a/i;->m:[La/e/a/b;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2, v1}, La/e/a/b;->B(La/e/a/d;La/e/a/b;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, La/e/a/i;->n:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, La/e/a/i;->d:Ljava/lang/String;

    const-string v1, ""

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, La/e/a/i;->d:Ljava/lang/String;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, La/e/a/i;->e:I

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
