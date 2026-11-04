.class public Le/g/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/g/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Le/g/f$a;


# instance fields
.field private final c:I

.field private final d:I

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/g/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/g/f$a;-><init>(Le/f/a/a;)V

    sput-object v0, Le/g/f;->b:Le/g/f$a;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_0

    iput p1, p0, Le/g/f;->c:I

    invoke-static {p1, p2, p3}, Le/e/a;->c(III)I

    move-result p1

    iput p1, p0, Le/g/f;->d:I

    iput p3, p0, Le/g/f;->e:I

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Step must be non-zero."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()I
    .locals 0

    iget p0, p0, Le/g/f;->c:I

    return p0
.end method

.method public final b()I
    .locals 0

    iget p0, p0, Le/g/f;->d:I

    return p0
.end method

.method public c()Le/d/b;
    .locals 3

    new-instance v0, Le/g/g;

    iget v1, p0, Le/g/f;->c:I

    iget v2, p0, Le/g/f;->d:I

    iget p0, p0, Le/g/f;->e:I

    invoke-direct {v0, v1, v2, p0}, Le/g/g;-><init>(III)V

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0}, Le/g/f;->c()Le/d/b;

    move-result-object p0

    return-object p0
.end method
