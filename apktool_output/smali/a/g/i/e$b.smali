.class La/g/i/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/k/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/i/e;->d(Landroid/content/Context;La/g/i/d;ILjava/util/concurrent/Executor;La/g/i/a;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/g/k/a<",
        "La/g/i/e$e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:La/g/i/a;


# direct methods
.method constructor <init>(La/g/i/a;)V
    .locals 0

    iput-object p1, p0, La/g/i/e$b;->a:La/g/i/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, La/g/i/e$e;

    invoke-virtual {p0, p1}, La/g/i/e$b;->b(La/g/i/e$e;)V

    return-void
.end method

.method public b(La/g/i/e$e;)V
    .locals 0

    iget-object p0, p0, La/g/i/e$b;->a:La/g/i/a;

    invoke-virtual {p0, p1}, La/g/i/a;->b(La/g/i/e$e;)V

    return-void
.end method
