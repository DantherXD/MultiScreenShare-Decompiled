.class La/g/e/j$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/e/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/e/j;->f(La/g/d/f/c$b;I)La/g/d/f/c$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/g/e/j$c<",
        "La/g/d/f/c$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:La/g/e/j;


# direct methods
.method constructor <init>(La/g/e/j;)V
    .locals 0

    iput-object p1, p0, La/g/e/j$b;->a:La/g/e/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/g/d/f/c$c;

    invoke-virtual {p0, p1}, La/g/e/j$b;->c(La/g/d/f/c$c;)I

    move-result p0

    return p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, La/g/d/f/c$c;

    invoke-virtual {p0, p1}, La/g/e/j$b;->d(La/g/d/f/c$c;)Z

    move-result p0

    return p0
.end method

.method public c(La/g/d/f/c$c;)I
    .locals 0

    invoke-virtual {p1}, La/g/d/f/c$c;->e()I

    move-result p0

    return p0
.end method

.method public d(La/g/d/f/c$c;)Z
    .locals 0

    invoke-virtual {p1}, La/g/d/f/c$c;->f()Z

    move-result p0

    return p0
.end method
