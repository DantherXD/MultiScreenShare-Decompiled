.class La/q/q$b;
.super La/q/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/q/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field a:La/q/q;


# direct methods
.method constructor <init>(La/q/q;)V
    .locals 0

    invoke-direct {p0}, La/q/n;-><init>()V

    iput-object p1, p0, La/q/q$b;->a:La/q/q;

    return-void
.end method


# virtual methods
.method public c(La/q/m;)V
    .locals 1

    iget-object p1, p0, La/q/q$b;->a:La/q/q;

    iget-boolean v0, p1, La/q/q;->O:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, La/q/m;->a0()V

    iget-object p0, p0, La/q/q$b;->a:La/q/q;

    const/4 p1, 0x1

    iput-boolean p1, p0, La/q/q;->O:Z

    :cond_0
    return-void
.end method

.method public e(La/q/m;)V
    .locals 2

    iget-object v0, p0, La/q/q$b;->a:La/q/q;

    iget v1, v0, La/q/q;->N:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, La/q/q;->N:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, La/q/q;->O:Z

    invoke-virtual {v0}, La/q/m;->p()V

    :cond_0
    invoke-virtual {p1, p0}, La/q/m;->P(La/q/m$f;)La/q/m;

    return-void
.end method
