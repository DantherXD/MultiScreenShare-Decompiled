.class public Le/g/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/g/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Ljava/lang/Character;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Le/g/a$a;


# instance fields
.field private final c:C

.field private final d:C

.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Le/g/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Le/g/a$a;-><init>(Le/f/a/a;)V

    sput-object v0, Le/g/a;->b:Le/g/a$a;

    return-void
.end method

.method public constructor <init>(CCI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p3, :cond_1

    const/high16 v0, -0x80000000

    if-eq p3, v0, :cond_0

    iput-char p1, p0, Le/g/a;->c:C

    invoke-static {p1, p2, p3}, Le/e/a;->c(III)I

    move-result p1

    int-to-char p1, p1

    iput-char p1, p0, Le/g/a;->d:C

    iput p3, p0, Le/g/a;->e:I

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
.method public final a()C
    .locals 0

    iget-char p0, p0, Le/g/a;->c:C

    return p0
.end method

.method public final b()C
    .locals 0

    iget-char p0, p0, Le/g/a;->d:C

    return p0
.end method

.method public c()Le/d/a;
    .locals 3

    new-instance v0, Le/g/b;

    iget-char v1, p0, Le/g/a;->c:C

    iget-char v2, p0, Le/g/a;->d:C

    iget p0, p0, Le/g/a;->e:I

    invoke-direct {v0, v1, v2, p0}, Le/g/b;-><init>(CCI)V

    return-object v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 0

    invoke-virtual {p0}, Le/g/a;->c()Le/d/a;

    move-result-object p0

    return-object p0
.end method
