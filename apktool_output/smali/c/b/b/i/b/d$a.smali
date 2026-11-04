.class Lc/b/b/i/b/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/b/b/i/b/d;->a()Lc/b/b/j/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lc/b/b/i/b/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lc/b/b/i/b/d;


# direct methods
.method constructor <init>(Lc/b/b/i/b/d;)V
    .locals 0

    iput-object p1, p0, Lc/b/b/i/b/d$a;->a:Lc/b/b/i/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/b/i/b/f;Lc/b/b/i/b/f;)I
    .locals 0

    invoke-virtual {p1}, Lc/b/b/i/b/f;->d()I

    move-result p0

    invoke-virtual {p2}, Lc/b/b/i/b/f;->d()I

    move-result p1

    sub-int/2addr p0, p1

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lc/b/b/i/b/f;

    check-cast p2, Lc/b/b/i/b/f;

    invoke-virtual {p0, p1, p2}, Lc/b/b/i/b/d$a;->a(Lc/b/b/i/b/f;Lc/b/b/i/b/f;)I

    move-result p0

    return p0
.end method
