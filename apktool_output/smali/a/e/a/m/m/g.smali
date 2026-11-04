.class La/e/a/m/m/g;
.super La/e/a/m/m/f;
.source ""


# instance fields
.field public m:I


# direct methods
.method public constructor <init>(La/e/a/m/m/p;)V
    .locals 0

    invoke-direct {p0, p1}, La/e/a/m/m/f;-><init>(La/e/a/m/m/p;)V

    instance-of p1, p1, La/e/a/m/m/l;

    if-eqz p1, :cond_0

    sget-object p1, La/e/a/m/m/f$a;->c:La/e/a/m/m/f$a;

    goto :goto_0

    :cond_0
    sget-object p1, La/e/a/m/m/f$a;->d:La/e/a/m/m/f$a;

    :goto_0
    iput-object p1, p0, La/e/a/m/m/f;->e:La/e/a/m/m/f$a;

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 1

    iget-boolean v0, p0, La/e/a/m/m/f;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, La/e/a/m/m/f;->j:Z

    iput p1, p0, La/e/a/m/m/f;->g:I

    iget-object p0, p0, La/e/a/m/m/f;->k:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, La/e/a/m/m/d;

    invoke-interface {p1, p1}, La/e/a/m/m/d;->a(La/e/a/m/m/d;)V

    goto :goto_0

    :cond_1
    return-void
.end method
