.class public Lcom/homwee/multiscreenshare/r/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/homwee/multiscreenshare/r/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic c:Lcom/homwee/multiscreenshare/r/c;


# direct methods
.method public constructor <init>(Lcom/homwee/multiscreenshare/r/c;)V
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/r/c$a;->c:Lcom/homwee/multiscreenshare/r/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lcom/homwee/multiscreenshare/r/c$a;->b:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lcom/homwee/multiscreenshare/r/c$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/r/c$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lcom/homwee/multiscreenshare/r/c$a;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/homwee/multiscreenshare/r/c$a;->a:Ljava/lang/String;

    return-object p1
.end method


# virtual methods
.method public c(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/r/c$a;->b:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public d()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/homwee/multiscreenshare/r/c$a;->b:Ljava/util/Map;

    return-object p0
.end method

.method public e(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/r/c$a;->b:Ljava/util/Map;

    invoke-interface {p0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
