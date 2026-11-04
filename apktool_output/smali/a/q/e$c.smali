.class La/q/e$c;
.super La/q/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/q/e;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:Ljava/util/ArrayList;

.field final synthetic e:Ljava/lang/Object;

.field final synthetic f:Ljava/util/ArrayList;

.field final synthetic g:La/q/e;


# direct methods
.method constructor <init>(La/q/e;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, La/q/e$c;->g:La/q/e;

    iput-object p2, p0, La/q/e$c;->a:Ljava/lang/Object;

    iput-object p3, p0, La/q/e$c;->b:Ljava/util/ArrayList;

    iput-object p4, p0, La/q/e$c;->c:Ljava/lang/Object;

    iput-object p5, p0, La/q/e$c;->d:Ljava/util/ArrayList;

    iput-object p6, p0, La/q/e$c;->e:Ljava/lang/Object;

    iput-object p7, p0, La/q/e$c;->f:Ljava/util/ArrayList;

    invoke-direct {p0}, La/q/n;-><init>()V

    return-void
.end method


# virtual methods
.method public c(La/q/m;)V
    .locals 3

    iget-object p1, p0, La/q/e$c;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, La/q/e$c;->g:La/q/e;

    iget-object v2, p0, La/q/e$c;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v2, v0}, La/q/e;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_0
    iget-object p1, p0, La/q/e$c;->c:Ljava/lang/Object;

    if-eqz p1, :cond_1

    iget-object v1, p0, La/q/e$c;->g:La/q/e;

    iget-object v2, p0, La/q/e$c;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, v2, v0}, La/q/e;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_1
    iget-object p1, p0, La/q/e$c;->e:Ljava/lang/Object;

    if-eqz p1, :cond_2

    iget-object v1, p0, La/q/e$c;->g:La/q/e;

    iget-object p0, p0, La/q/e$c;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p1, p0, v0}, La/q/e;->q(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :cond_2
    return-void
.end method

.method public e(La/q/m;)V
    .locals 0

    invoke-virtual {p1, p0}, La/q/m;->P(La/q/m$f;)La/q/m;

    return-void
.end method
