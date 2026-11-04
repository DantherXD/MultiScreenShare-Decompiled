.class Lc/b/a/b/x/d$b;
.super Lc/b/a/b/x/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/b/a/b/x/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Lc/b/a/b/x/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/text/TextPaint;

.field final synthetic b:Lc/b/a/b/x/f;

.field final synthetic c:Lc/b/a/b/x/d;


# direct methods
.method constructor <init>(Lc/b/a/b/x/d;Landroid/text/TextPaint;Lc/b/a/b/x/f;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/b/x/d$b;->c:Lc/b/a/b/x/d;

    iput-object p2, p0, Lc/b/a/b/x/d$b;->a:Landroid/text/TextPaint;

    iput-object p3, p0, Lc/b/a/b/x/d$b;->b:Lc/b/a/b/x/f;

    invoke-direct {p0}, Lc/b/a/b/x/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iget-object p0, p0, Lc/b/a/b/x/d$b;->b:Lc/b/a/b/x/f;

    invoke-virtual {p0, p1}, Lc/b/a/b/x/f;->a(I)V

    return-void
.end method

.method public b(Landroid/graphics/Typeface;Z)V
    .locals 2

    iget-object v0, p0, Lc/b/a/b/x/d$b;->c:Lc/b/a/b/x/d;

    iget-object v1, p0, Lc/b/a/b/x/d$b;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, v1, p1}, Lc/b/a/b/x/d;->l(Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object p0, p0, Lc/b/a/b/x/d$b;->b:Lc/b/a/b/x/f;

    invoke-virtual {p0, p1, p2}, Lc/b/a/b/x/f;->b(Landroid/graphics/Typeface;Z)V

    return-void
.end method
