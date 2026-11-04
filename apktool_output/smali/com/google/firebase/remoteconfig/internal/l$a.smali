.class public Lcom/google/firebase/remoteconfig/internal/l$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/remoteconfig/internal/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Date;

.field private final b:I

.field private final c:Lcom/google/firebase/remoteconfig/internal/k;

.field private final d:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/util/Date;ILcom/google/firebase/remoteconfig/internal/k;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/l$a;->a:Ljava/util/Date;

    iput p2, p0, Lcom/google/firebase/remoteconfig/internal/l$a;->b:I

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/internal/l$a;->c:Lcom/google/firebase/remoteconfig/internal/k;

    iput-object p4, p0, Lcom/google/firebase/remoteconfig/internal/l$a;->d:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/util/Date;)Lcom/google/firebase/remoteconfig/internal/l$a;
    .locals 3

    new-instance v0, Lcom/google/firebase/remoteconfig/internal/l$a;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2, v2}, Lcom/google/firebase/remoteconfig/internal/l$a;-><init>(Ljava/util/Date;ILcom/google/firebase/remoteconfig/internal/k;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Lcom/google/firebase/remoteconfig/internal/k;Ljava/lang/String;)Lcom/google/firebase/remoteconfig/internal/l$a;
    .locals 3

    new-instance v0, Lcom/google/firebase/remoteconfig/internal/l$a;

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/k;->e()Ljava/util/Date;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, p0, p1}, Lcom/google/firebase/remoteconfig/internal/l$a;-><init>(Ljava/util/Date;ILcom/google/firebase/remoteconfig/internal/k;Ljava/lang/String;)V

    return-object v0
.end method

.method public static c(Ljava/util/Date;)Lcom/google/firebase/remoteconfig/internal/l$a;
    .locals 3

    new-instance v0, Lcom/google/firebase/remoteconfig/internal/l$a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2, v2}, Lcom/google/firebase/remoteconfig/internal/l$a;-><init>(Ljava/util/Date;ILcom/google/firebase/remoteconfig/internal/k;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public d()Lcom/google/firebase/remoteconfig/internal/k;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/internal/l$a;->c:Lcom/google/firebase/remoteconfig/internal/k;

    return-object p0
.end method

.method e()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/internal/l$a;->d:Ljava/lang/String;

    return-object p0
.end method

.method f()I
    .locals 0

    iget p0, p0, Lcom/google/firebase/remoteconfig/internal/l$a;->b:I

    return p0
.end method
