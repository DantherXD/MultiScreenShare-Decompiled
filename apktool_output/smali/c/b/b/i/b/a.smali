.class public final Lc/b/b/i/b/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field private d:I

.field private e:Lc/b/b/j/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lc/b/b/j/b;
    .locals 0

    iget-object p0, p0, Lc/b/b/i/b/a;->e:Lc/b/b/j/b;

    return-object p0
.end method

.method public b(I)V
    .locals 0

    iput p1, p0, Lc/b/b/i/b/a;->d:I

    return-void
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lc/b/b/i/b/a;->a:Z

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, Lc/b/b/i/b/a;->c:I

    return-void
.end method

.method public e(Lc/b/b/j/b;)V
    .locals 0

    iput-object p1, p0, Lc/b/b/i/b/a;->e:Lc/b/b/j/b;

    return-void
.end method

.method public f(I)V
    .locals 0

    iput p1, p0, Lc/b/b/i/b/a;->b:I

    return-void
.end method
