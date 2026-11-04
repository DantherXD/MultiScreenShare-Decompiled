.class final Ld/a/m/b/a$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/l/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld/a/l/d<",
        "Lf/a/a;",
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
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lf/a/a;

    invoke-virtual {p0, p1}, Ld/a/m/b/a$k;->b(Lf/a/a;)V

    return-void
.end method

.method public b(Lf/a/a;)V
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Lf/a/a;->a(J)V

    return-void
.end method
