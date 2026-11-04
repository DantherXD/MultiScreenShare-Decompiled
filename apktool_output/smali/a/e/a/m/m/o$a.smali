.class La/e/a/m/m/o$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/e/a/m/m/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "La/e/a/m/e;",
            ">;"
        }
    .end annotation
.end field

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field final synthetic h:La/e/a/m/m/o;


# direct methods
.method public constructor <init>(La/e/a/m/m/o;La/e/a/m/e;La/e/a/d;I)V
    .locals 0

    iput-object p1, p0, La/e/a/m/m/o$a;->h:La/e/a/m/m/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, La/e/a/m/m/o$a;->a:Ljava/lang/ref/WeakReference;

    iget-object p1, p2, La/e/a/m/e;->P:La/e/a/m/d;

    invoke-virtual {p3, p1}, La/e/a/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, La/e/a/m/m/o$a;->b:I

    iget-object p1, p2, La/e/a/m/e;->Q:La/e/a/m/d;

    invoke-virtual {p3, p1}, La/e/a/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, La/e/a/m/m/o$a;->c:I

    iget-object p1, p2, La/e/a/m/e;->R:La/e/a/m/d;

    invoke-virtual {p3, p1}, La/e/a/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, La/e/a/m/m/o$a;->d:I

    iget-object p1, p2, La/e/a/m/e;->S:La/e/a/m/d;

    invoke-virtual {p3, p1}, La/e/a/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, La/e/a/m/m/o$a;->e:I

    iget-object p1, p2, La/e/a/m/e;->T:La/e/a/m/d;

    invoke-virtual {p3, p1}, La/e/a/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, La/e/a/m/m/o$a;->f:I

    iput p4, p0, La/e/a/m/m/o$a;->g:I

    return-void
.end method
