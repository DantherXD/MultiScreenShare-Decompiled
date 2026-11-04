.class public Lcom/homwee/multiscreenshare/view/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/Integer;

.field private d:Ljava/lang/Integer;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/homwee/multiscreenshare/view/e;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/homwee/multiscreenshare/view/e;->c:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/homwee/multiscreenshare/view/e;->d:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/homwee/multiscreenshare/view/e;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/e;->b:Ljava/lang/String;

    return-object p0
.end method

.method public b()Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/e;->d:Ljava/lang/Integer;

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/e;->e:Ljava/lang/String;

    return-object p0
.end method

.method public d()Ljava/lang/Integer;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/view/e;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public e()Z
    .locals 0

    iget-boolean p0, p0, Lcom/homwee/multiscreenshare/view/e;->a:Z

    return p0
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/homwee/multiscreenshare/view/e;->a:Z

    return-void
.end method
