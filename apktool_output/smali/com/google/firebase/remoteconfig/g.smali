.class public final synthetic Lcom/google/firebase/remoteconfig/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/p;


# static fields
.field public static final synthetic a:Lcom/google/firebase/remoteconfig/g;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/remoteconfig/g;

    invoke-direct {v0}, Lcom/google/firebase/remoteconfig/g;-><init>()V

    sput-object v0, Lcom/google/firebase/remoteconfig/g;->a:Lcom/google/firebase/remoteconfig/g;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/components/n;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->lambda$getComponents$0(Lcom/google/firebase/components/n;)Lcom/google/firebase/remoteconfig/n;

    move-result-object p0

    return-object p0
.end method
