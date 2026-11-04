.class public final enum Ld/a/m/a/c;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ld/a/m/c/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld/a/m/a/c;",
        ">;",
        "Ld/a/m/c/a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Ld/a/m/a/c;

.field public static final enum c:Ld/a/m/a/c;

.field private static final synthetic d:[Ld/a/m/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ld/a/m/a/c;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld/a/m/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld/a/m/a/c;->b:Ld/a/m/a/c;

    new-instance v1, Ld/a/m/a/c;

    const-string v3, "NEVER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ld/a/m/a/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ld/a/m/a/c;->c:Ld/a/m/a/c;

    const/4 v3, 0x2

    new-array v3, v3, [Ld/a/m/a/c;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Ld/a/m/a/c;->d:[Ld/a/m/a/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ld/a/m/a/c;
    .locals 1

    const-class v0, Ld/a/m/a/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld/a/m/a/c;

    return-object p0
.end method

.method public static values()[Ld/a/m/a/c;
    .locals 1

    sget-object v0, Ld/a/m/a/c;->d:[Ld/a/m/a/c;

    invoke-virtual {v0}, [Ld/a/m/a/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld/a/m/a/c;

    return-object v0
.end method


# virtual methods
.method public c()V
    .locals 0

    return-void
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method public f(I)I
    .locals 0

    and-int/lit8 p0, p1, 0x2

    return p0
.end method

.method public isEmpty()Z
    .locals 0

    const/4 p0, 0x1

    return p0
.end method

.method public offer(Ljava/lang/Object;)Z
    .locals 0

    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Should not be called!"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public poll()Ljava/lang/Object;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method
