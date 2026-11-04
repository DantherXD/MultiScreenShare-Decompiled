.class La/g/e/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/e/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/e/j;->h([La/g/i/f$b;I)La/g/i/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/g/e/j$c<",
        "La/g/i/f$b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:La/g/e/j;


# direct methods
.method constructor <init>(La/g/e/j;)V
    .locals 0

    iput-object p1, p0, La/g/e/j$a;->a:La/g/e/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/g/i/f$b;

    invoke-virtual {p0, p1}, La/g/e/j$a;->c(La/g/i/f$b;)I

    move-result p0

    return p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, La/g/i/f$b;

    invoke-virtual {p0, p1}, La/g/e/j$a;->d(La/g/i/f$b;)Z

    move-result p0

    return p0
.end method

.method public c(La/g/i/f$b;)I
    .locals 0

    invoke-virtual {p1}, La/g/i/f$b;->e()I

    move-result p0

    return p0
.end method

.method public d(La/g/i/f$b;)Z
    .locals 0

    invoke-virtual {p1}, La/g/i/f$b;->f()Z

    move-result p0

    return p0
.end method
