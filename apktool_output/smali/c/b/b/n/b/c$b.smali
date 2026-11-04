.class public final Lc/b/b/n/b/c$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/b/n/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:I

.field private final b:[Lc/b/b/n/b/c$a;


# direct methods
.method varargs constructor <init>(I[Lc/b/b/n/b/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc/b/b/n/b/c$b;->a:I

    iput-object p2, p0, Lc/b/b/n/b/c$b;->b:[Lc/b/b/n/b/c$a;

    return-void
.end method


# virtual methods
.method public a()[Lc/b/b/n/b/c$a;
    .locals 0

    iget-object p0, p0, Lc/b/b/n/b/c$b;->b:[Lc/b/b/n/b/c$a;

    return-object p0
.end method

.method public b()I
    .locals 0

    iget p0, p0, Lc/b/b/n/b/c$b;->a:I

    return p0
.end method

.method public c()I
    .locals 4

    iget-object p0, p0, Lc/b/b/n/b/c$b;->b:[Lc/b/b/n/b/c$a;

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v3, p0, v1

    invoke-virtual {v3}, Lc/b/b/n/b/c$a;->a()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v2
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lc/b/b/n/b/c$b;->a:I

    invoke-virtual {p0}, Lc/b/b/n/b/c$b;->c()I

    move-result p0

    mul-int/2addr v0, p0

    return v0
.end method
