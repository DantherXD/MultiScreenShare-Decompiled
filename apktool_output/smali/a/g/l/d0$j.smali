.class La/g/l/d0$j;
.super La/g/l/d0$i;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/l/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "j"
.end annotation


# instance fields
.field private o:La/g/e/b;

.field private p:La/g/e/b;

.field private q:La/g/e/b;


# direct methods
.method constructor <init>(La/g/l/d0;La/g/l/d0$j;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/g/l/d0$i;-><init>(La/g/l/d0;La/g/l/d0$i;)V

    const/4 p1, 0x0

    iput-object p1, p0, La/g/l/d0$j;->o:La/g/e/b;

    iput-object p1, p0, La/g/l/d0$j;->p:La/g/e/b;

    iput-object p1, p0, La/g/l/d0$j;->q:La/g/e/b;

    return-void
.end method

.method constructor <init>(La/g/l/d0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/g/l/d0$i;-><init>(La/g/l/d0;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, La/g/l/d0$j;->o:La/g/e/b;

    iput-object p1, p0, La/g/l/d0$j;->p:La/g/e/b;

    iput-object p1, p0, La/g/l/d0$j;->q:La/g/e/b;

    return-void
.end method


# virtual methods
.method g()La/g/e/b;
    .locals 1

    iget-object v0, p0, La/g/l/d0$j;->p:La/g/e/b;

    if-nez v0, :cond_0

    iget-object v0, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getMandatorySystemGestureInsets()Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, La/g/e/b;->d(Landroid/graphics/Insets;)La/g/e/b;

    move-result-object v0

    iput-object v0, p0, La/g/l/d0$j;->p:La/g/e/b;

    :cond_0
    iget-object p0, p0, La/g/l/d0$j;->p:La/g/e/b;

    return-object p0
.end method

.method j(IIII)La/g/l/d0;
    .locals 0

    iget-object p0, p0, La/g/l/d0$g;->i:Landroid/view/WindowInsets;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/WindowInsets;->inset(IIII)Landroid/view/WindowInsets;

    move-result-object p0

    invoke-static {p0}, La/g/l/d0;->s(Landroid/view/WindowInsets;)La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method public p(La/g/e/b;)V
    .locals 0

    return-void
.end method
