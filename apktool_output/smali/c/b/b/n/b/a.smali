.class public final enum Lc/b/b/n/b/a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lc/b/b/n/b/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lc/b/b/n/b/a;

.field public static final enum c:Lc/b/b/n/b/a;

.field public static final enum d:Lc/b/b/n/b/a;

.field public static final enum e:Lc/b/b/n/b/a;

.field private static final f:[Lc/b/b/n/b/a;

.field private static final synthetic g:[Lc/b/b/n/b/a;


# instance fields
.field private final h:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lc/b/b/n/b/a;

    const-string v1, "L"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lc/b/b/n/b/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lc/b/b/n/b/a;->b:Lc/b/b/n/b/a;

    new-instance v1, Lc/b/b/n/b/a;

    const-string v4, "M"

    invoke-direct {v1, v4, v3, v2}, Lc/b/b/n/b/a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lc/b/b/n/b/a;->c:Lc/b/b/n/b/a;

    new-instance v4, Lc/b/b/n/b/a;

    const-string v5, "Q"

    const/4 v6, 0x2

    const/4 v7, 0x3

    invoke-direct {v4, v5, v6, v7}, Lc/b/b/n/b/a;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lc/b/b/n/b/a;->d:Lc/b/b/n/b/a;

    new-instance v5, Lc/b/b/n/b/a;

    const-string v8, "H"

    invoke-direct {v5, v8, v7, v6}, Lc/b/b/n/b/a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lc/b/b/n/b/a;->e:Lc/b/b/n/b/a;

    const/4 v8, 0x4

    new-array v9, v8, [Lc/b/b/n/b/a;

    aput-object v0, v9, v2

    aput-object v1, v9, v3

    aput-object v4, v9, v6

    aput-object v5, v9, v7

    sput-object v9, Lc/b/b/n/b/a;->g:[Lc/b/b/n/b/a;

    new-array v8, v8, [Lc/b/b/n/b/a;

    aput-object v1, v8, v2

    aput-object v0, v8, v3

    aput-object v5, v8, v6

    aput-object v4, v8, v7

    sput-object v8, Lc/b/b/n/b/a;->f:[Lc/b/b/n/b/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lc/b/b/n/b/a;->h:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lc/b/b/n/b/a;
    .locals 1

    const-class v0, Lc/b/b/n/b/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lc/b/b/n/b/a;

    return-object p0
.end method

.method public static values()[Lc/b/b/n/b/a;
    .locals 1

    sget-object v0, Lc/b/b/n/b/a;->g:[Lc/b/b/n/b/a;

    invoke-virtual {v0}, [Lc/b/b/n/b/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lc/b/b/n/b/a;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 0

    iget p0, p0, Lc/b/b/n/b/a;->h:I

    return p0
.end method
