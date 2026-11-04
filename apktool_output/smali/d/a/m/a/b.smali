.class public final enum Ld/a/m/a/b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ld/a/j/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld/a/m/a/b;",
        ">;",
        "Ld/a/j/b;"
    }
.end annotation


# static fields
.field public static final enum b:Ld/a/m/a/b;

.field private static final synthetic c:[Ld/a/m/a/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ld/a/m/a/b;

    const-string v1, "DISPOSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld/a/m/a/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld/a/m/a/b;->b:Ld/a/m/a/b;

    const/4 v1, 0x1

    new-array v1, v1, [Ld/a/m/a/b;

    aput-object v0, v1, v2

    sput-object v1, Ld/a/m/a/b;->c:[Ld/a/m/a/b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Ljava/util/concurrent/atomic/AtomicReference;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ld/a/j/b;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld/a/j/b;

    sget-object v1, Ld/a/m/a/b;->b:Ld/a/m/a/b;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ld/a/j/b;

    if-eq p0, v1, :cond_1

    if-eqz p0, :cond_0

    invoke-interface {p0}, Ld/a/j/b;->c()V

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Ld/a/j/b;)Z
    .locals 1

    sget-object v0, Ld/a/m/a/b;->b:Ld/a/m/a/b;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static d()V
    .locals 2

    new-instance v0, Ld/a/k/d;

    const-string v1, "Disposable already set!"

    invoke-direct {v0, v1}, Ld/a/k/d;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ld/a/n/a;->k(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static e(Ljava/util/concurrent/atomic/AtomicReference;Ld/a/j/b;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Ld/a/j/b;",
            ">;",
            "Ld/a/j/b;",
            ")Z"
        }
    .end annotation

    const-string v0, "d is null"

    invoke-static {p1, v0}, Ld/a/m/b/b;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, Ld/a/j/b;->c()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Ld/a/m/a/b;->b:Ld/a/m/a/b;

    if-eq p0, p1, :cond_0

    invoke-static {}, Ld/a/m/a/b;->d()V

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static f(Ld/a/j/b;Ld/a/j/b;)Z
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "next is null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Ld/a/n/a;->k(Ljava/lang/Throwable;)V

    return v0

    :cond_0
    if-eqz p0, :cond_1

    invoke-interface {p1}, Ld/a/j/b;->c()V

    invoke-static {}, Ld/a/m/a/b;->d()V

    return v0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Ld/a/m/a/b;
    .locals 1

    const-class v0, Ld/a/m/a/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld/a/m/a/b;

    return-object p0
.end method

.method public static values()[Ld/a/m/a/b;
    .locals 1

    sget-object v0, Ld/a/m/a/b;->c:[Ld/a/m/a/b;

    invoke-virtual {v0}, [Ld/a/m/a/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld/a/m/a/b;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 0

    return-void
.end method
