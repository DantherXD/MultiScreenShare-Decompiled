.class Lcom/bumptech/glide/load/p/r$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/p/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;La/g/k/e;)Lcom/bumptech/glide/load/p/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/p/n<",
            "TModel;TData;>;>;",
            "La/g/k/e<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)",
            "Lcom/bumptech/glide/load/p/q<",
            "TModel;TData;>;"
        }
    .end annotation

    new-instance p0, Lcom/bumptech/glide/load/p/q;

    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/load/p/q;-><init>(Ljava/util/List;La/g/k/e;)V

    return-object p0
.end method
