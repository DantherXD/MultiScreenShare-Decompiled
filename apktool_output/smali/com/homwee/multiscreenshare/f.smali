.class public final synthetic Lcom/homwee/multiscreenshare/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:Lcom/homwee/multiscreenshare/MainActivity$b;


# direct methods
.method public synthetic constructor <init>(Lcom/homwee/multiscreenshare/MainActivity$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/homwee/multiscreenshare/f;->a:Lcom/homwee/multiscreenshare/MainActivity$b;

    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/f;->a:Lcom/homwee/multiscreenshare/MainActivity$b;

    check-cast p1, Lcom/homwee/multiscreenshare/view/e;

    invoke-virtual {p0, p1}, Lcom/homwee/multiscreenshare/MainActivity$b;->b(Lcom/homwee/multiscreenshare/view/e;)Z

    move-result p0

    return p0
.end method
