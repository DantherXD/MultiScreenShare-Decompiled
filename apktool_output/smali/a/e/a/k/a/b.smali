.class public La/e/a/k/a/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field static a:La/e/a/k/a/b;

.field public static b:[Ljava/lang/String;


# instance fields
.field c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, La/e/a/k/a/b;

    invoke-direct {v0}, La/e/a/k/a/b;-><init>()V

    sput-object v0, La/e/a/k/a/b;->a:La/e/a/k/a/b;

    const-string v0, "standard"

    const-string v1, "accelerate"

    const-string v2, "decelerate"

    const-string v3, "linear"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, La/e/a/k/a/b;->b:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "identity"

    iput-object v0, p0, La/e/a/k/a/b;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(D)D
    .locals 0

    return-wide p1
.end method

.method public b(D)D
    .locals 0

    const-wide/high16 p0, 0x3ff0000000000000L    # 1.0

    return-wide p0
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/e/a/k/a/b;->c:Ljava/lang/String;

    return-object p0
.end method
