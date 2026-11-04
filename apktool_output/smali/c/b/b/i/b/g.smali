.class abstract Lc/b/b/i/b/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final a:Lc/b/b/i/b/g;


# instance fields
.field private final b:Lc/b/b/i/b/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lc/b/b/i/b/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lc/b/b/i/b/e;-><init>(Lc/b/b/i/b/g;II)V

    sput-object v0, Lc/b/b/i/b/g;->a:Lc/b/b/i/b/g;

    return-void
.end method

.method constructor <init>(Lc/b/b/i/b/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/b/b/i/b/g;->b:Lc/b/b/i/b/g;

    return-void
.end method


# virtual methods
.method final a(II)Lc/b/b/i/b/g;
    .locals 1

    new-instance v0, Lc/b/b/i/b/e;

    invoke-direct {v0, p0, p1, p2}, Lc/b/b/i/b/e;-><init>(Lc/b/b/i/b/g;II)V

    return-object v0
.end method

.method final b(II)Lc/b/b/i/b/g;
    .locals 1

    new-instance v0, Lc/b/b/i/b/b;

    invoke-direct {v0, p0, p1, p2}, Lc/b/b/i/b/b;-><init>(Lc/b/b/i/b/g;II)V

    return-object v0
.end method

.method abstract c(Lc/b/b/j/a;[B)V
.end method

.method final d()Lc/b/b/i/b/g;
    .locals 0

    iget-object p0, p0, Lc/b/b/i/b/g;->b:Lc/b/b/i/b/g;

    return-object p0
.end method
