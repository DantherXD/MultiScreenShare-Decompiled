.class final Ld/a/m/g/i$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/g/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ld/a/m/g/i$b;",
        ">;"
    }
.end annotation


# instance fields
.field final b:Ljava/lang/Runnable;

.field final c:J

.field final d:I

.field volatile e:Z


# direct methods
.method constructor <init>(Ljava/lang/Runnable;Ljava/lang/Long;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/a/m/g/i$b;->b:Ljava/lang/Runnable;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    iput-wide p1, p0, Ld/a/m/g/i$b;->c:J

    iput p3, p0, Ld/a/m/g/i$b;->d:I

    return-void
.end method


# virtual methods
.method public a(Ld/a/m/g/i$b;)I
    .locals 4

    iget-wide v0, p0, Ld/a/m/g/i$b;->c:J

    iget-wide v2, p1, Ld/a/m/g/i$b;->c:J

    invoke-static {v0, v1, v2, v3}, Ld/a/m/b/b;->b(JJ)I

    move-result v0

    if-nez v0, :cond_0

    iget p0, p0, Ld/a/m/g/i$b;->d:I

    iget p1, p1, Ld/a/m/g/i$b;->d:I

    invoke-static {p0, p1}, Ld/a/m/b/b;->a(II)I

    move-result p0

    return p0

    :cond_0
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ld/a/m/g/i$b;

    invoke-virtual {p0, p1}, Ld/a/m/g/i$b;->a(Ld/a/m/g/i$b;)I

    move-result p0

    return p0
.end method
