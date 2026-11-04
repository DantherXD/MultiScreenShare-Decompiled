.class public Le/g/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/g/i$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Le/g/i$a;


# instance fields
.field private final c:J

.field private final d:J

.field private final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/g/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/g/i$a;-><init>(Le/f/a/a;)V

    sput-object v0, Le/g/i;->b:Le/g/i$a;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    cmp-long v0, p5, v0

    if-eqz v0, :cond_1

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p5, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Le/g/i;->c:J

    invoke-static/range {p1 .. p6}, Le/e/a;->d(JJJ)J

    move-result-wide p1

    iput-wide p1, p0, Le/g/i;->d:J

    iput-wide p5, p0, Le/g/i;->e:J

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Step must be greater than Long.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Step must be non-zero."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Le/g/i;->c:J

    return-wide v0
.end method

.method public final b()J
    .locals 2

    iget-wide v0, p0, Le/g/i;->d:J

    return-wide v0
.end method

.method public c()Le/d/c;
    .locals 8

    new-instance v7, Le/g/j;

    iget-wide v1, p0, Le/g/i;->c:J

    iget-wide v3, p0, Le/g/i;->d:J

    iget-wide v5, p0, Le/g/i;->e:J

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Le/g/j;-><init>(JJJ)V

    return-object v7
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0}, Le/g/i;->c()Le/d/c;

    move-result-object p0

    return-object p0
.end method
