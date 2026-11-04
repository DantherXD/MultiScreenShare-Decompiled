.class public La/q/b;
.super La/q/q;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/q/q;-><init>()V

    invoke-direct {p0}, La/q/b;->p0()V

    return-void
.end method

.method private p0()V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, La/q/q;->m0(I)La/q/q;

    new-instance v1, La/q/d;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, La/q/d;-><init>(I)V

    invoke-virtual {p0, v1}, La/q/q;->e0(La/q/m;)La/q/q;

    move-result-object p0

    new-instance v1, La/q/c;

    invoke-direct {v1}, La/q/c;-><init>()V

    invoke-virtual {p0, v1}, La/q/q;->e0(La/q/m;)La/q/q;

    move-result-object p0

    new-instance v1, La/q/d;

    invoke-direct {v1, v0}, La/q/d;-><init>(I)V

    invoke-virtual {p0, v1}, La/q/q;->e0(La/q/m;)La/q/q;

    return-void
.end method
