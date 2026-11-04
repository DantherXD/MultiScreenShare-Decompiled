.class public final synthetic Lcom/homwee/multiscreenshare/remoteprovider/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic b:Lcom/homwee/multiscreenshare/remoteprovider/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/homwee/multiscreenshare/remoteprovider/a;

    invoke-direct {v0}, Lcom/homwee/multiscreenshare/remoteprovider/a;-><init>()V

    sput-object v0, Lcom/homwee/multiscreenshare/remoteprovider/a;->b:Lcom/homwee/multiscreenshare/remoteprovider/a;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    invoke-static {}, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->b()V

    return-void
.end method
