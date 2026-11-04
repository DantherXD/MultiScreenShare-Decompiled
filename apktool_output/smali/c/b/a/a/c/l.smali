.class final Lc/b/a/a/c/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/c/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/b/a/a/c/a<",
        "Ljava/lang/Void;",
        "Lc/b/a/a/c/h<",
        "Ljava/util/List<",
        "Lc/b/a/a/c/h<",
        "*>;>;>;>;"
    }
.end annotation


# instance fields
.field private final synthetic a:Ljava/util/Collection;


# direct methods
.method constructor <init>(Ljava/util/Collection;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/c/l;->a:Ljava/util/Collection;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lc/b/a/a/c/h;)Ljava/lang/Object;
    .locals 0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object p0, p0, Lc/b/a/a/c/l;->a:Ljava/util/Collection;

    invoke-interface {p1, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-static {p1}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method
