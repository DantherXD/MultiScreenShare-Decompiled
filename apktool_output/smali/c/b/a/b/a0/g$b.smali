.class Lc/b/a/b/a0/g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/b/a0/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/b/a/b/a0/g;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lc/b/a/b/a0/g;


# direct methods
.method constructor <init>(Lc/b/a/b/a0/g;F)V
    .locals 0

    iput-object p1, p0, Lc/b/a/b/a0/g$b;->b:Lc/b/a/b/a0/g;

    iput p2, p0, Lc/b/a/b/a0/g$b;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/b/a/b/a0/c;)Lc/b/a/b/a0/c;
    .locals 1

    instance-of v0, p1, Lc/b/a/b/a0/i;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lc/b/a/b/a0/b;

    iget p0, p0, Lc/b/a/b/a0/g$b;->a:F

    invoke-direct {v0, p0, p1}, Lc/b/a/b/a0/b;-><init>(FLc/b/a/b/a0/c;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
