.class final La/i/b/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/i/b/b$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/i/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/i/b/b$b<",
        "La/d/h<",
        "La/g/l/e0/c;",
        ">;",
        "La/g/l/e0/c;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/d/h;

    invoke-virtual {p0, p1}, La/i/b/a$b;->d(La/d/h;)I

    move-result p0

    return p0
.end method

.method public bridge synthetic b(Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 0

    check-cast p1, La/d/h;

    invoke-virtual {p0, p1, p2}, La/i/b/a$b;->c(La/d/h;I)La/g/l/e0/c;

    move-result-object p0

    return-object p0
.end method

.method public c(La/d/h;I)La/g/l/e0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/d/h<",
            "La/g/l/e0/c;",
            ">;I)",
            "La/g/l/e0/c;"
        }
    .end annotation

    invoke-virtual {p1, p2}, La/d/h;->k(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/g/l/e0/c;

    return-object p0
.end method

.method public d(La/d/h;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/d/h<",
            "La/g/l/e0/c;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p1}, La/d/h;->j()I

    move-result p0

    return p0
.end method
