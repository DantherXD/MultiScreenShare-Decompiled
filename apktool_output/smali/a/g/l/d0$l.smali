.class La/g/l/d0$l;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/l/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "l"
.end annotation


# static fields
.field static final a:La/g/l/d0;


# instance fields
.field final b:La/g/l/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, La/g/l/d0$b;

    invoke-direct {v0}, La/g/l/d0$b;-><init>()V

    invoke-virtual {v0}, La/g/l/d0$b;->a()La/g/l/d0;

    move-result-object v0

    invoke-virtual {v0}, La/g/l/d0;->a()La/g/l/d0;

    move-result-object v0

    invoke-virtual {v0}, La/g/l/d0;->b()La/g/l/d0;

    move-result-object v0

    invoke-virtual {v0}, La/g/l/d0;->c()La/g/l/d0;

    move-result-object v0

    sput-object v0, La/g/l/d0$l;->a:La/g/l/d0;

    return-void
.end method

.method constructor <init>(La/g/l/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g/l/d0$l;->b:La/g/l/d0;

    return-void
.end method


# virtual methods
.method a()La/g/l/d0;
    .locals 0

    iget-object p0, p0, La/g/l/d0$l;->b:La/g/l/d0;

    return-object p0
.end method

.method b()La/g/l/d0;
    .locals 0

    iget-object p0, p0, La/g/l/d0$l;->b:La/g/l/d0;

    return-object p0
.end method

.method c()La/g/l/d0;
    .locals 0

    iget-object p0, p0, La/g/l/d0$l;->b:La/g/l/d0;

    return-object p0
.end method

.method d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method e(La/g/l/d0;)V
    .locals 0

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La/g/l/d0$l;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->l()Z

    move-result v1

    invoke-virtual {p1}, La/g/l/d0$l;->l()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, La/g/l/d0$l;->k()Z

    move-result v1

    invoke-virtual {p1}, La/g/l/d0$l;->k()Z

    move-result v3

    if-ne v1, v3, :cond_2

    invoke-virtual {p0}, La/g/l/d0$l;->i()La/g/e/b;

    move-result-object v1

    invoke-virtual {p1}, La/g/l/d0$l;->i()La/g/e/b;

    move-result-object v3

    invoke-static {v1, v3}, La/g/k/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, La/g/l/d0$l;->h()La/g/e/b;

    move-result-object v1

    invoke-virtual {p1}, La/g/l/d0$l;->h()La/g/e/b;

    move-result-object v3

    invoke-static {v1, v3}, La/g/k/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, La/g/l/d0$l;->f()La/g/l/d;

    move-result-object p0

    invoke-virtual {p1}, La/g/l/d0$l;->f()La/g/l/d;

    move-result-object p1

    invoke-static {p0, p1}, La/g/k/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    move v0, v2

    :goto_0
    return v0
.end method

.method f()La/g/l/d;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method g()La/g/e/b;
    .locals 0

    invoke-virtual {p0}, La/g/l/d0$l;->i()La/g/e/b;

    move-result-object p0

    return-object p0
.end method

.method h()La/g/e/b;
    .locals 0

    sget-object p0, La/g/e/b;->a:La/g/e/b;

    return-object p0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0}, La/g/l/d0$l;->l()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0}, La/g/l/d0$l;->k()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p0}, La/g/l/d0$l;->i()La/g/e/b;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-virtual {p0}, La/g/l/d0$l;->h()La/g/e/b;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-virtual {p0}, La/g/l/d0$l;->f()La/g/l/d;

    move-result-object p0

    const/4 v1, 0x4

    aput-object p0, v0, v1

    invoke-static {v0}, La/g/k/c;->b([Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method i()La/g/e/b;
    .locals 0

    sget-object p0, La/g/e/b;->a:La/g/e/b;

    return-object p0
.end method

.method j(IIII)La/g/l/d0;
    .locals 0

    sget-object p0, La/g/l/d0$l;->a:La/g/l/d0;

    return-object p0
.end method

.method k()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method l()Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public m([La/g/e/b;)V
    .locals 0

    return-void
.end method

.method n(La/g/e/b;)V
    .locals 0

    return-void
.end method

.method o(La/g/l/d0;)V
    .locals 0

    return-void
.end method

.method public p(La/g/e/b;)V
    .locals 0

    return-void
.end method
