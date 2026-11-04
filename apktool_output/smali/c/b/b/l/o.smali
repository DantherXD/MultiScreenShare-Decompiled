.class public final Lc/b/b/l/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/b/g;


# instance fields
.field private final a:Lc/b/b/l/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc/b/b/l/j;

    invoke-direct {v0}, Lc/b/b/l/j;-><init>()V

    iput-object v0, p0, Lc/b/b/l/o;->a:Lc/b/b/l/j;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lc/b/b/a;IILjava/util/Map;)Lc/b/b/j/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc/b/b/a;",
            "II",
            "Ljava/util/Map<",
            "Lc/b/b/c;",
            "*>;)",
            "Lc/b/b/j/b;"
        }
    .end annotation

    sget-object v0, Lc/b/b/a;->p:Lc/b/b/a;

    if-ne p2, v0, :cond_0

    iget-object v1, p0, Lc/b/b/l/o;->a:Lc/b/b/l/j;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string p1, "0"

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lc/b/b/a;->i:Lc/b/b/a;

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v6}, Lc/b/b/l/j;->a(Ljava/lang/String;Lc/b/b/a;IILjava/util/Map;)Lc/b/b/j/b;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Can only encode UPC-A, but got "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
