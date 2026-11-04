.class final Lcom/bumptech/glide/t/l/a$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/k/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/t/l/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "La/g/k/e<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/t/l/a$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/t/l/a$d<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/bumptech/glide/t/l/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/t/l/a$g<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final c:La/g/k/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/g/k/e<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(La/g/k/e;Lcom/bumptech/glide/t/l/a$d;Lcom/bumptech/glide/t/l/a$g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/g/k/e<",
            "TT;>;",
            "Lcom/bumptech/glide/t/l/a$d<",
            "TT;>;",
            "Lcom/bumptech/glide/t/l/a$g<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/bumptech/glide/t/l/a$e;->c:La/g/k/e;

    iput-object p2, p0, Lcom/bumptech/glide/t/l/a$e;->a:Lcom/bumptech/glide/t/l/a$d;

    iput-object p3, p0, Lcom/bumptech/glide/t/l/a$e;->b:Lcom/bumptech/glide/t/l/a$g;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    instance-of v0, p1, Lcom/bumptech/glide/t/l/a$f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/bumptech/glide/t/l/a$f;

    invoke-interface {v0}, Lcom/bumptech/glide/t/l/a$f;->e()Lcom/bumptech/glide/t/l/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/t/l/c;->b(Z)V

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/t/l/a$e;->b:Lcom/bumptech/glide/t/l/a$g;

    invoke-interface {v0, p1}, Lcom/bumptech/glide/t/l/a$g;->a(Ljava/lang/Object;)V

    iget-object p0, p0, Lcom/bumptech/glide/t/l/a$e;->c:La/g/k/e;

    invoke-interface {p0, p1}, La/g/k/e;->a(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public b()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/t/l/a$e;->c:La/g/k/e;

    invoke-interface {v0}, La/g/k/e;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p0, p0, Lcom/bumptech/glide/t/l/a$e;->a:Lcom/bumptech/glide/t/l/a$d;

    invoke-interface {p0}, Lcom/bumptech/glide/t/l/a$d;->a()Ljava/lang/Object;

    move-result-object v0

    const/4 p0, 0x2

    const-string v1, "FactoryPools"

    invoke-static {v1, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Created new "

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    instance-of p0, v0, Lcom/bumptech/glide/t/l/a$f;

    if-eqz p0, :cond_1

    move-object p0, v0

    check-cast p0, Lcom/bumptech/glide/t/l/a$f;

    invoke-interface {p0}, Lcom/bumptech/glide/t/l/a$f;->e()Lcom/bumptech/glide/t/l/c;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/bumptech/glide/t/l/c;->b(Z)V

    :cond_1
    return-object v0
.end method
