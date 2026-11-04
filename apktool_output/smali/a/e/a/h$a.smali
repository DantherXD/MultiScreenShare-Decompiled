.class La/e/a/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/e/a/h;->F(La/e/a/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "La/e/a/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:La/e/a/h;


# direct methods
.method constructor <init>(La/e/a/h;)V
    .locals 0

    iput-object p1, p0, La/e/a/h$a;->a:La/e/a/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/e/a/i;La/e/a/i;)I
    .locals 0

    iget p0, p1, La/e/a/i;->e:I

    iget p1, p2, La/e/a/i;->e:I

    sub-int/2addr p0, p1

    return p0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, La/e/a/i;

    check-cast p2, La/e/a/i;

    invoke-virtual {p0, p1, p2}, La/e/a/h$a;->a(La/e/a/i;La/e/a/i;)I

    move-result p0

    return p0
.end method
