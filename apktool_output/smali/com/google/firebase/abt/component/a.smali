.class public final synthetic Lcom/google/firebase/abt/component/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/firebase/components/p;


# static fields
.field public static final synthetic a:Lcom/google/firebase/abt/component/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/abt/component/a;

    invoke-direct {v0}, Lcom/google/firebase/abt/component/a;-><init>()V

    sput-object v0, Lcom/google/firebase/abt/component/a;->a:Lcom/google/firebase/abt/component/a;

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

    invoke-static {p1}, Lcom/google/firebase/abt/component/AbtRegistrar;->lambda$getComponents$0(Lcom/google/firebase/components/n;)Lcom/google/firebase/abt/component/b;

    move-result-object p0

    return-object p0
.end method
