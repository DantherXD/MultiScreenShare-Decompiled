.class La/g/l/e0/d$b;
.super La/g/l/e0/d$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/l/e0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# direct methods
.method constructor <init>(La/g/l/e0/d;)V
    .locals 0

    invoke-direct {p0, p1}, La/g/l/e0/d$a;-><init>(La/g/l/e0/d;)V

    return-void
.end method


# virtual methods
.method public findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 0

    iget-object p0, p0, La/g/l/e0/d$a;->a:La/g/l/e0/d;

    invoke-virtual {p0, p1}, La/g/l/e0/d;->d(I)La/g/l/e0/c;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, La/g/l/e0/c;->u0()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p0

    return-object p0
.end method
