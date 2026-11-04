.class La/i/b/a$c;
.super La/g/l/e0/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/i/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic b:La/i/b/a;


# direct methods
.method constructor <init>(La/i/b/a;)V
    .locals 0

    iput-object p1, p0, La/i/b/a$c;->b:La/i/b/a;

    invoke-direct {p0}, La/g/l/e0/d;-><init>()V

    return-void
.end method


# virtual methods
.method public b(I)La/g/l/e0/c;
    .locals 0

    iget-object p0, p0, La/i/b/a$c;->b:La/i/b/a;

    invoke-virtual {p0, p1}, La/i/b/a;->H(I)La/g/l/e0/c;

    move-result-object p0

    invoke-static {p0}, La/g/l/e0/c;->M(La/g/l/e0/c;)La/g/l/e0/c;

    move-result-object p0

    return-object p0
.end method

.method public d(I)La/g/l/e0/c;
    .locals 1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    iget-object p1, p0, La/i/b/a$c;->b:La/i/b/a;

    iget p1, p1, La/i/b/a;->n:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, La/i/b/a$c;->b:La/i/b/a;

    iget p1, p1, La/i/b/a;->o:I

    :goto_0
    const/high16 v0, -0x80000000

    if-ne p1, v0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    invoke-virtual {p0, p1}, La/i/b/a$c;->b(I)La/g/l/e0/c;

    move-result-object p0

    return-object p0
.end method

.method public f(IILandroid/os/Bundle;)Z
    .locals 0

    iget-object p0, p0, La/i/b/a$c;->b:La/i/b/a;

    invoke-virtual {p0, p1, p2, p3}, La/i/b/a;->P(IILandroid/os/Bundle;)Z

    move-result p0

    return p0
.end method
