.class Lc/b/a/b/x/d$a;
.super La/g/d/f/f$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/b/a/b/x/d;->h(Landroid/content/Context;Lc/b/a/b/x/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/b/a/b/x/f;

.field final synthetic b:Lc/b/a/b/x/d;


# direct methods
.method constructor <init>(Lc/b/a/b/x/d;Lc/b/a/b/x/f;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/b/x/d$a;->b:Lc/b/a/b/x/d;

    iput-object p2, p0, Lc/b/a/b/x/d$a;->a:Lc/b/a/b/x/f;

    invoke-direct {p0}, La/g/d/f/f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 2

    iget-object v0, p0, Lc/b/a/b/x/d$a;->b:Lc/b/a/b/x/d;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lc/b/a/b/x/d;->c(Lc/b/a/b/x/d;Z)Z

    iget-object p0, p0, Lc/b/a/b/x/d$a;->a:Lc/b/a/b/x/f;

    invoke-virtual {p0, p1}, Lc/b/a/b/x/f;->a(I)V

    return-void
.end method

.method public e(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, Lc/b/a/b/x/d$a;->b:Lc/b/a/b/x/d;

    iget v1, v0, Lc/b/a/b/x/d;->f:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    invoke-static {v0, p1}, Lc/b/a/b/x/d;->b(Lc/b/a/b/x/d;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget-object p1, p0, Lc/b/a/b/x/d$a;->b:Lc/b/a/b/x/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lc/b/a/b/x/d;->c(Lc/b/a/b/x/d;Z)Z

    iget-object p1, p0, Lc/b/a/b/x/d$a;->a:Lc/b/a/b/x/f;

    iget-object p0, p0, Lc/b/a/b/x/d$a;->b:Lc/b/a/b/x/d;

    invoke-static {p0}, Lc/b/a/b/x/d;->a(Lc/b/a/b/x/d;)Landroid/graphics/Typeface;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p1, p0, v0}, Lc/b/a/b/x/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
