.class abstract La/r/a/a/i$f;
.super La/r/a/a/i$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/r/a/a/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "f"
.end annotation


# instance fields
.field protected a:[La/g/e/c$b;

.field b:Ljava/lang/String;

.field c:I

.field d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La/r/a/a/i$e;-><init>(La/r/a/a/i$a;)V

    iput-object v0, p0, La/r/a/a/i$f;->a:[La/g/e/c$b;

    const/4 v0, 0x0

    iput v0, p0, La/r/a/a/i$f;->c:I

    return-void
.end method

.method public constructor <init>(La/r/a/a/i$f;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La/r/a/a/i$e;-><init>(La/r/a/a/i$a;)V

    iput-object v0, p0, La/r/a/a/i$f;->a:[La/g/e/c$b;

    const/4 v0, 0x0

    iput v0, p0, La/r/a/a/i$f;->c:I

    iget-object v0, p1, La/r/a/a/i$f;->b:Ljava/lang/String;

    iput-object v0, p0, La/r/a/a/i$f;->b:Ljava/lang/String;

    iget v0, p1, La/r/a/a/i$f;->d:I

    iput v0, p0, La/r/a/a/i$f;->d:I

    iget-object p1, p1, La/r/a/a/i$f;->a:[La/g/e/c$b;

    invoke-static {p1}, La/g/e/c;->f([La/g/e/c$b;)[La/g/e/c$b;

    move-result-object p1

    iput-object p1, p0, La/r/a/a/i$f;->a:[La/g/e/c$b;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public d(Landroid/graphics/Path;)V
    .locals 0

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    iget-object p0, p0, La/r/a/a/i$f;->a:[La/g/e/c$b;

    if-eqz p0, :cond_0

    invoke-static {p0, p1}, La/g/e/c$b;->e([La/g/e/c$b;Landroid/graphics/Path;)V

    :cond_0
    return-void
.end method

.method public getPathData()[La/g/e/c$b;
    .locals 0

    iget-object p0, p0, La/r/a/a/i$f;->a:[La/g/e/c$b;

    return-object p0
.end method

.method public getPathName()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/r/a/a/i$f;->b:Ljava/lang/String;

    return-object p0
.end method

.method public setPathData([La/g/e/c$b;)V
    .locals 1

    iget-object v0, p0, La/r/a/a/i$f;->a:[La/g/e/c$b;

    invoke-static {v0, p1}, La/g/e/c;->b([La/g/e/c$b;[La/g/e/c$b;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, La/g/e/c;->f([La/g/e/c$b;)[La/g/e/c$b;

    move-result-object p1

    iput-object p1, p0, La/r/a/a/i$f;->a:[La/g/e/c$b;

    goto :goto_0

    :cond_0
    iget-object p0, p0, La/r/a/a/i$f;->a:[La/g/e/c$b;

    invoke-static {p0, p1}, La/g/e/c;->j([La/g/e/c$b;[La/g/e/c$b;)V

    :goto_0
    return-void
.end method
