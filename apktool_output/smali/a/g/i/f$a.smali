.class public La/g/i/f$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/i/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:I

.field private final b:[La/g/i/f$b;


# direct methods
.method public constructor <init>(I[La/g/i/f$b;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/g/i/f$a;->a:I

    iput-object p2, p0, La/g/i/f$a;->b:[La/g/i/f$b;

    return-void
.end method

.method static a(I[La/g/i/f$b;)La/g/i/f$a;
    .locals 1

    new-instance v0, La/g/i/f$a;

    invoke-direct {v0, p0, p1}, La/g/i/f$a;-><init>(I[La/g/i/f$b;)V

    return-object v0
.end method


# virtual methods
.method public b()[La/g/i/f$b;
    .locals 0

    iget-object p0, p0, La/g/i/f$a;->b:[La/g/i/f$b;

    return-object p0
.end method

.method public c()I
    .locals 0

    iget p0, p0, La/g/i/f$a;->a:I

    return p0
.end method
