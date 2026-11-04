.class public final La/g/l/d0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/l/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:La/g/l/d0$f;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, La/g/l/d0$e;

    invoke-direct {v0}, La/g/l/d0$e;-><init>()V

    :goto_0
    iput-object v0, p0, La/g/l/d0$b;->a:La/g/l/d0$f;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, La/g/l/d0$d;

    invoke-direct {v0}, La/g/l/d0$d;-><init>()V

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    new-instance v0, La/g/l/d0$c;

    invoke-direct {v0}, La/g/l/d0$c;-><init>()V

    goto :goto_0

    :cond_2
    new-instance v0, La/g/l/d0$f;

    invoke-direct {v0}, La/g/l/d0$f;-><init>()V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public constructor <init>(La/g/l/d0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, La/g/l/d0$e;

    invoke-direct {v0, p1}, La/g/l/d0$e;-><init>(La/g/l/d0;)V

    :goto_0
    iput-object v0, p0, La/g/l/d0$b;->a:La/g/l/d0$f;

    goto :goto_1

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, La/g/l/d0$d;

    invoke-direct {v0, p1}, La/g/l/d0$d;-><init>(La/g/l/d0;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x14

    if-lt v0, v1, :cond_2

    new-instance v0, La/g/l/d0$c;

    invoke-direct {v0, p1}, La/g/l/d0$c;-><init>(La/g/l/d0;)V

    goto :goto_0

    :cond_2
    new-instance v0, La/g/l/d0$f;

    invoke-direct {v0, p1}, La/g/l/d0$f;-><init>(La/g/l/d0;)V

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public a()La/g/l/d0;
    .locals 0

    iget-object p0, p0, La/g/l/d0$b;->a:La/g/l/d0$f;

    invoke-virtual {p0}, La/g/l/d0$f;->b()La/g/l/d0;

    move-result-object p0

    return-object p0
.end method

.method public b(La/g/e/b;)La/g/l/d0$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/g/l/d0$b;->a:La/g/l/d0$f;

    invoke-virtual {v0, p1}, La/g/l/d0$f;->d(La/g/e/b;)V

    return-object p0
.end method

.method public c(La/g/e/b;)La/g/l/d0$b;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, La/g/l/d0$b;->a:La/g/l/d0$f;

    invoke-virtual {v0, p1}, La/g/l/d0$f;->f(La/g/e/b;)V

    return-object p0
.end method
