.class public Lc/a/a/j/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;
.implements Lc/a/a/i/q/f;


# static fields
.field public static a:Lc/a/a/j/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/b0;

    invoke-direct {v0}, Lc/a/a/j/b0;-><init>()V

    sput-object v0, Lc/a/a/j/b0;->a:Lc/a/a/j/b0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 0

    check-cast p2, Ljava/lang/String;

    iget-object p0, p1, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    return-void

    :cond_0
    invoke-virtual {p0, p2}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    return-void
.end method

.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p1}, Lc/a/a/i/b;->v()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
