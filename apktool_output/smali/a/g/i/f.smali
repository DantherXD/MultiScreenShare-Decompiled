.class public La/g/i/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/g/i/f$c;,
        La/g/i/f$a;,
        La/g/i/f$b;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;La/g/i/d;IZILandroid/os/Handler;La/g/i/f$c;)Landroid/graphics/Typeface;
    .locals 1

    new-instance v0, La/g/i/a;

    invoke-direct {v0, p6, p5}, La/g/i/a;-><init>(La/g/i/f$c;Landroid/os/Handler;)V

    if-eqz p3, :cond_0

    invoke-static {p0, p1, v0, p2, p4}, La/g/i/e;->e(Landroid/content/Context;La/g/i/d;La/g/i/a;II)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p3, 0x0

    invoke-static {p0, p1, p2, p3, v0}, La/g/i/e;->d(Landroid/content/Context;La/g/i/d;ILjava/util/concurrent/Executor;La/g/i/a;)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method
