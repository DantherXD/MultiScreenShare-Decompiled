.class La/g/l/f0/b$a;
.super Landroid/view/inputmethod/InputConnectionWrapper;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/l/f0/b;->a(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;La/g/l/f0/b$c;)Landroid/view/inputmethod/InputConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/g/l/f0/b$c;


# direct methods
.method constructor <init>(Landroid/view/inputmethod/InputConnection;ZLa/g/l/f0/b$c;)V
    .locals 0

    iput-object p3, p0, La/g/l/f0/b$a;->a:La/g/l/f0/b$c;

    invoke-direct {p0, p1, p2}, Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V

    return-void
.end method


# virtual methods
.method public commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z
    .locals 2

    iget-object v0, p0, La/g/l/f0/b$a;->a:La/g/l/f0/b$c;

    invoke-static {p1}, La/g/l/f0/c;->f(Ljava/lang/Object;)La/g/l/f0/c;

    move-result-object v1

    invoke-interface {v0, v1, p2, p3}, La/g/l/f0/b$c;->a(La/g/l/f0/c;ILandroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/inputmethod/InputConnectionWrapper;->commitContent(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z

    move-result p0

    return p0
.end method
