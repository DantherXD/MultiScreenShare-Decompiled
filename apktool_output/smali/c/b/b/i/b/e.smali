.class final Lc/b/b/i/b/e;
.super Lc/b/b/i/b/g;
.source ""


# instance fields
.field private final c:S

.field private final d:S


# direct methods
.method constructor <init>(Lc/b/b/i/b/g;II)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/b/i/b/g;-><init>(Lc/b/b/i/b/g;)V

    int-to-short p1, p2

    iput-short p1, p0, Lc/b/b/i/b/e;->c:S

    int-to-short p1, p3

    iput-short p1, p0, Lc/b/b/i/b/e;->d:S

    return-void
.end method


# virtual methods
.method c(Lc/b/b/j/a;[B)V
    .locals 0

    iget-short p2, p0, Lc/b/b/i/b/e;->c:S

    iget-short p0, p0, Lc/b/b/i/b/e;->d:S

    invoke-virtual {p1, p2, p0}, Lc/b/b/j/a;->c(II)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-short v0, p0, Lc/b/b/i/b/e;->c:S

    iget-short v1, p0, Lc/b/b/i/b/e;->d:S

    const/4 v2, 0x1

    shl-int v3, v2, v1

    sub-int/2addr v3, v2

    and-int/2addr v0, v3

    shl-int v1, v2, v1

    or-int/2addr v0, v1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "<"

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-short p0, p0, Lc/b/b/i/b/e;->d:S

    shl-int p0, v2, p0

    or-int/2addr p0, v0

    invoke-static {p0}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x3e

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
