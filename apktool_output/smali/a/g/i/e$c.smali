.class La/g/i/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


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
        "Ljava/util/concurrent/Callable<",
        "La/g/i/e$e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:La/g/i/d;

.field final synthetic e:I


# direct methods
.method constructor <init>(Ljava/lang/String;Landroid/content/Context;La/g/i/d;I)V
    .locals 0

    iput-object p1, p0, La/g/i/e$c;->b:Ljava/lang/String;

    iput-object p2, p0, La/g/i/e$c;->c:Landroid/content/Context;

    iput-object p3, p0, La/g/i/e$c;->d:La/g/i/d;

    iput p4, p0, La/g/i/e$c;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/g/i/e$e;
    .locals 3

    iget-object v0, p0, La/g/i/e$c;->b:Ljava/lang/String;

    iget-object v1, p0, La/g/i/e$c;->c:Landroid/content/Context;

    iget-object v2, p0, La/g/i/e$c;->d:La/g/i/d;

    iget p0, p0, La/g/i/e$c;->e:I

    invoke-static {v0, v1, v2, p0}, La/g/i/e;->c(Ljava/lang/String;Landroid/content/Context;La/g/i/d;I)La/g/i/e$e;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, La/g/i/e$c;->a()La/g/i/e$e;

    move-result-object p0

    return-object p0
.end method
