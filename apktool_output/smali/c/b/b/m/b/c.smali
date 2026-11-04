.class public final enum Lc/b/b/m/b/c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/b/b/m/b/c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc/b/b/m/b/c;

.field public static final enum c:Lc/b/b/m/b/c;

.field public static final enum d:Lc/b/b/m/b/c;

.field public static final enum e:Lc/b/b/m/b/c;

.field private static final synthetic f:[Lc/b/b/m/b/c;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lc/b/b/m/b/c;

    const-string v1, "AUTO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lc/b/b/m/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lc/b/b/m/b/c;->b:Lc/b/b/m/b/c;

    new-instance v1, Lc/b/b/m/b/c;

    const-string v3, "TEXT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lc/b/b/m/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lc/b/b/m/b/c;->c:Lc/b/b/m/b/c;

    new-instance v3, Lc/b/b/m/b/c;

    const-string v5, "BYTE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lc/b/b/m/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lc/b/b/m/b/c;->d:Lc/b/b/m/b/c;

    new-instance v5, Lc/b/b/m/b/c;

    const-string v7, "NUMERIC"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lc/b/b/m/b/c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lc/b/b/m/b/c;->e:Lc/b/b/m/b/c;

    const/4 v7, 0x4

    new-array v7, v7, [Lc/b/b/m/b/c;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lc/b/b/m/b/c;->f:[Lc/b/b/m/b/c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc/b/b/m/b/c;
    .locals 1

    const-class v0, Lc/b/b/m/b/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/b/b/m/b/c;

    return-object p0
.end method

.method public static values()[Lc/b/b/m/b/c;
    .locals 1

    sget-object v0, Lc/b/b/m/b/c;->f:[Lc/b/b/m/b/c;

    invoke-virtual {v0}, [Lc/b/b/m/b/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/b/b/m/b/c;

    return-object v0
.end method
