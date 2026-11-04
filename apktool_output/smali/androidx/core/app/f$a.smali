.class public Landroidx/core/app/f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/app/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field final a:Landroid/os/Bundle;

.field private b:Landroidx/core/graphics/drawable/IconCompat;

.field private final c:[Landroidx/core/app/j;

.field private final d:[Landroidx/core/app/j;

.field private e:Z

.field f:Z

.field private final g:I

.field private final h:Z

.field public i:I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public j:Ljava/lang/CharSequence;

.field public k:Landroid/app/PendingIntent;


# virtual methods
.method public a()Landroid/app/PendingIntent;
    .locals 0

    iget-object p0, p0, Landroidx/core/app/f$a;->k:Landroid/app/PendingIntent;

    return-object p0
.end method

.method public b()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/core/app/f$a;->e:Z

    return p0
.end method

.method public c()[Landroidx/core/app/j;
    .locals 0

    iget-object p0, p0, Landroidx/core/app/f$a;->d:[Landroidx/core/app/j;

    return-object p0
.end method

.method public d()Landroid/os/Bundle;
    .locals 0

    iget-object p0, p0, Landroidx/core/app/f$a;->a:Landroid/os/Bundle;

    return-object p0
.end method

.method public e()Landroidx/core/graphics/drawable/IconCompat;
    .locals 3

    iget-object v0, p0, Landroidx/core/app/f$a;->b:Landroidx/core/graphics/drawable/IconCompat;

    if-nez v0, :cond_0

    iget v0, p0, Landroidx/core/app/f$a;->i:I

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    const-string v2, ""

    invoke-static {v1, v2, v0}, Landroidx/core/graphics/drawable/IconCompat;->b(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/app/f$a;->b:Landroidx/core/graphics/drawable/IconCompat;

    :cond_0
    iget-object p0, p0, Landroidx/core/app/f$a;->b:Landroidx/core/graphics/drawable/IconCompat;

    return-object p0
.end method

.method public f()[Landroidx/core/app/j;
    .locals 0

    iget-object p0, p0, Landroidx/core/app/f$a;->c:[Landroidx/core/app/j;

    return-object p0
.end method

.method public g()I
    .locals 0

    iget p0, p0, Landroidx/core/app/f$a;->g:I

    return p0
.end method

.method public h()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/core/app/f$a;->f:Z

    return p0
.end method

.method public i()Ljava/lang/CharSequence;
    .locals 0

    iget-object p0, p0, Landroidx/core/app/f$a;->j:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public j()Z
    .locals 0

    iget-boolean p0, p0, Landroidx/core/app/f$a;->h:Z

    return p0
.end method
