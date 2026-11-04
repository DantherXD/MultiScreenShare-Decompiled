.class public La/g/l/d0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/g/l/d0$a;,
        La/g/l/d0$m;,
        La/g/l/d0$e;,
        La/g/l/d0$d;,
        La/g/l/d0$c;,
        La/g/l/d0$f;,
        La/g/l/d0$b;,
        La/g/l/d0$k;,
        La/g/l/d0$j;,
        La/g/l/d0$i;,
        La/g/l/d0$h;,
        La/g/l/d0$g;,
        La/g/l/d0$l;
    }
.end annotation


# static fields
.field public static final a:La/g/l/d0;


# instance fields
.field private final b:La/g/l/d0$l;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, La/g/l/d0$k;->r:La/g/l/d0;

    goto :goto_0

    :cond_0
    sget-object v0, La/g/l/d0$l;->a:La/g/l/d0;

    :goto_0
    sput-object v0, La/g/l/d0;->a:La/g/l/d0;

    return-void
.end method

.method public constructor <init>(La/g/l/d0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_5

    iget-object p1, p1, La/g/l/d0;->b:La/g/l/d0$l;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    instance-of v1, p1, La/g/l/d0$k;

    if-eqz v1, :cond_0

    new-instance v0, La/g/l/d0$k;

    move-object v1, p1

    check-cast v1, La/g/l/d0$k;

    invoke-direct {v0, p0, v1}, La/g/l/d0$k;-><init>(La/g/l/d0;La/g/l/d0$k;)V

    :goto_0
    iput-object v0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    instance-of v1, p1, La/g/l/d0$j;

    if-eqz v1, :cond_1

    new-instance v0, La/g/l/d0$j;

    move-object v1, p1

    check-cast v1, La/g/l/d0$j;

    invoke-direct {v0, p0, v1}, La/g/l/d0$j;-><init>(La/g/l/d0;La/g/l/d0$j;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    instance-of v1, p1, La/g/l/d0$i;

    if-eqz v1, :cond_2

    new-instance v0, La/g/l/d0$i;

    move-object v1, p1

    check-cast v1, La/g/l/d0$i;

    invoke-direct {v0, p0, v1}, La/g/l/d0$i;-><init>(La/g/l/d0;La/g/l/d0$i;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    instance-of v1, p1, La/g/l/d0$h;

    if-eqz v1, :cond_3

    new-instance v0, La/g/l/d0$h;

    move-object v1, p1

    check-cast v1, La/g/l/d0$h;

    invoke-direct {v0, p0, v1}, La/g/l/d0$h;-><init>(La/g/l/d0;La/g/l/d0$h;)V

    goto :goto_0

    :cond_3
    const/16 v1, 0x14

    if-lt v0, v1, :cond_4

    instance-of v0, p1, La/g/l/d0$g;

    if-eqz v0, :cond_4

    new-instance v0, La/g/l/d0$g;

    move-object v1, p1

    check-cast v1, La/g/l/d0$g;

    invoke-direct {v0, p0, v1}, La/g/l/d0$g;-><init>(La/g/l/d0;La/g/l/d0$g;)V

    goto :goto_0

    :cond_4
    new-instance v0, La/g/l/d0$l;

    invoke-direct {v0, p0}, La/g/l/d0$l;-><init>(La/g/l/d0;)V

    goto :goto_0

    :goto_1
    invoke-virtual {p1, p0}, La/g/l/d0$l;->e(La/g/l/d0;)V

    goto :goto_2

    :cond_5
    new-instance p1, La/g/l/d0$l;

    invoke-direct {p1, p0}, La/g/l/d0$l;-><init>(La/g/l/d0;)V

    iput-object p1, p0, La/g/l/d0;->b:La/g/l/d0$l;

    :goto_2
    return-void
.end method

.method private constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, La/g/l/d0$k;

    invoke-direct {v0, p0, p1}, La/g/l/d0$k;-><init>(La/g/l/d0;Landroid/view/WindowInsets;)V

    :goto_0
    iput-object v0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, La/g/l/d0$j;

    invoke-direct {v0, p0, p1}, La/g/l/d0$j;-><init>(La/g/l/d0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_2

    new-instance v0, La/g/l/d0$i;

    invoke-direct {v0, p0, p1}, La/g/l/d0$i;-><init>(La/g/l/d0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_2
    const/16 v1, 0x15

    if-lt v0, v1, :cond_3

    new-instance v0, La/g/l/d0$h;

    invoke-direct {v0, p0, p1}, La/g/l/d0$h;-><init>(La/g/l/d0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_3
    const/16 v1, 0x14

    if-lt v0, v1, :cond_4

    new-instance v0, La/g/l/d0$g;

    invoke-direct {v0, p0, p1}, La/g/l/d0$g;-><init>(La/g/l/d0;Landroid/view/WindowInsets;)V

    goto :goto_0

    :cond_4
    new-instance p1, La/g/l/d0$l;

    invoke-direct {p1, p0}, La/g/l/d0$l;-><init>(La/g/l/d0;)V

    iput-object p1, p0, La/g/l/d0;->b:La/g/l/d0$l;

    :goto_1
    return-void
.end method

.method static k(La/g/e/b;IIII)La/g/e/b;
    .locals 5

    iget v0, p0, La/g/e/b;->b:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, La/g/e/b;->c:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, La/g/e/b;->d:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, La/g/e/b;->e:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, La/g/e/b;->b(IIII)La/g/e/b;

    move-result-object p0

    return-object p0
.end method

.method public static s(Landroid/view/WindowInsets;)La/g/l/d0;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, La/g/l/d0;->t(Landroid/view/WindowInsets;Landroid/view/View;)La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method public static t(Landroid/view/WindowInsets;Landroid/view/View;)La/g/l/d0;
    .locals 1

    new-instance v0, La/g/l/d0;

    invoke-static {p0}, La/g/k/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/view/WindowInsets;

    invoke-direct {v0, p0}, La/g/l/d0;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, La/g/l/v;->J(Landroid/view/View;)La/g/l/d0;

    move-result-object p0

    invoke-virtual {v0, p0}, La/g/l/d0;->p(La/g/l/d0;)V

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v0, p0}, La/g/l/d0;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public a()La/g/l/d0;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->a()La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method public b()La/g/l/d0;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->b()La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method public c()La/g/l/d0;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->c()La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method d(Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0, p1}, La/g/l/d0$l;->d(Landroid/view/View;)V

    return-void
.end method

.method public e()La/g/e/b;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->g()La/g/e/b;

    move-result-object p0

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of v0, p1, La/g/l/d0;

    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    check-cast p1, La/g/l/d0;

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    iget-object p1, p1, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-static {p0, p1}, La/g/k/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public f()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->i()La/g/e/b;

    move-result-object p0

    iget p0, p0, La/g/e/b;->e:I

    return p0
.end method

.method public g()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->i()La/g/e/b;

    move-result-object p0

    iget p0, p0, La/g/e/b;->b:I

    return p0
.end method

.method public h()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->i()La/g/e/b;

    move-result-object p0

    iget p0, p0, La/g/e/b;->d:I

    return p0
.end method

.method public hashCode()I
    .locals 0

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, La/g/l/d0$l;->hashCode()I

    move-result p0

    :goto_0
    return p0
.end method

.method public i()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->i()La/g/e/b;

    move-result-object p0

    iget p0, p0, La/g/e/b;->c:I

    return p0
.end method

.method public j(IIII)La/g/l/d0;
    .locals 0

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0, p1, p2, p3, p4}, La/g/l/d0$l;->j(IIII)La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method public l()Z
    .locals 0

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0}, La/g/l/d0$l;->k()Z

    move-result p0

    return p0
.end method

.method public m(IIII)La/g/l/d0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, La/g/l/d0$b;

    invoke-direct {v0, p0}, La/g/l/d0$b;-><init>(La/g/l/d0;)V

    invoke-static {p1, p2, p3, p4}, La/g/e/b;->b(IIII)La/g/e/b;

    move-result-object p0

    invoke-virtual {v0, p0}, La/g/l/d0$b;->c(La/g/e/b;)La/g/l/d0$b;

    move-result-object p0

    invoke-virtual {p0}, La/g/l/d0$b;->a()La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method n([La/g/e/b;)V
    .locals 0

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0, p1}, La/g/l/d0$l;->m([La/g/e/b;)V

    return-void
.end method

.method o(La/g/e/b;)V
    .locals 0

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0, p1}, La/g/l/d0$l;->n(La/g/e/b;)V

    return-void
.end method

.method p(La/g/l/d0;)V
    .locals 0

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0, p1}, La/g/l/d0$l;->o(La/g/l/d0;)V

    return-void
.end method

.method q(La/g/e/b;)V
    .locals 0

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    invoke-virtual {p0, p1}, La/g/l/d0$l;->p(La/g/e/b;)V

    return-void
.end method

.method public r()Landroid/view/WindowInsets;
    .locals 1

    iget-object p0, p0, La/g/l/d0;->b:La/g/l/d0$l;

    instance-of v0, p0, La/g/l/d0$g;

    if-eqz v0, :cond_0

    check-cast p0, La/g/l/d0$g;

    iget-object p0, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
