.class public Lc/a/a/j/m;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lc/a/a/j/x;

.field public final b:Lc/a/a/j/z;

.field protected c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/j/d;",
            ">;"
        }
    .end annotation
.end field

.field protected d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/j/a;",
            ">;"
        }
    .end annotation
.end field

.field protected e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/j/u;",
            ">;"
        }
    .end annotation
.end field

.field protected f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/j/c0;",
            ">;"
        }
    .end annotation
.end field

.field protected g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/j/r;",
            ">;"
        }
    .end annotation
.end field

.field protected h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/j/v;",
            ">;"
        }
    .end annotation
.end field

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Ljava/text/DateFormat;

.field protected l:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Ljava/lang/Object;",
            "Lc/a/a/j/w;",
            ">;"
        }
    .end annotation
.end field

.field protected m:Lc/a/a/j/w;

.field public n:Ljava/util/TimeZone;

.field public o:Ljava/util/Locale;


# direct methods
.method public constructor <init>(Lc/a/a/j/z;Lc/a/a/j/x;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc/a/a/j/m;->c:Ljava/util/List;

    iput-object v0, p0, Lc/a/a/j/m;->d:Ljava/util/List;

    iput-object v0, p0, Lc/a/a/j/m;->e:Ljava/util/List;

    iput-object v0, p0, Lc/a/a/j/m;->f:Ljava/util/List;

    iput-object v0, p0, Lc/a/a/j/m;->g:Ljava/util/List;

    iput-object v0, p0, Lc/a/a/j/m;->h:Ljava/util/List;

    const/4 v1, 0x0

    iput v1, p0, Lc/a/a/j/m;->i:I

    iput-object v0, p0, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    sget-object v0, Lc/a/a/a;->b:Ljava/util/TimeZone;

    iput-object v0, p0, Lc/a/a/j/m;->n:Ljava/util/TimeZone;

    sget-object v0, Lc/a/a/a;->c:Ljava/util/Locale;

    iput-object v0, p0, Lc/a/a/j/m;->o:Ljava/util/Locale;

    iput-object p1, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    iput-object p2, p0, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    sget-object p1, Lc/a/a/a;->b:Ljava/util/TimeZone;

    iput-object p1, p0, Lc/a/a/j/m;->n:Ljava/util/TimeZone;

    return-void
.end method

.method public static o(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object p0, p0, Lc/a/a/j/m;->f:Ljava/util/List;

    if-eqz p0, :cond_1

    if-eqz p2, :cond_0

    instance-of v0, p2, Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {p2}, Lc/a/a/a;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/j/c0;

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0, p1, v1, p3}, Lc/a/a/j/c0;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    goto :goto_0

    :cond_1
    return-object p3
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    iget-object p0, p0, Lc/a/a/j/m;->e:Ljava/util/List;

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    if-eqz p2, :cond_1

    instance-of v1, p2, Ljava/lang/String;

    if-nez v1, :cond_1

    invoke-static {p2}, Lc/a/a/a;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :cond_1
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc/a/a/j/u;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, p1, v2, p3}, Lc/a/a/j/u;->b(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 p0, 0x0

    return p0

    :cond_3
    return v0
.end method

.method public b(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4

    iget-object v0, p0, Lc/a/a/j/m;->h:Ljava/util/List;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/j/v;

    if-eqz p2, :cond_2

    instance-of v3, p2, Ljava/lang/String;

    if-nez v3, :cond_2

    invoke-static {p2}, Lc/a/a/a;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :cond_2
    move-object v3, p2

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2, p0, p1, v3}, Lc/a/a/j/v;->c(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_3
    return v1
.end method

.method public c(Lc/a/a/j/a0;Z)V
    .locals 0

    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    invoke-virtual {p0, p1, p2}, Lc/a/a/j/z;->d(Lc/a/a/j/a0;Z)V

    return-void
.end method

.method public d()V
    .locals 1

    iget v0, p0, Lc/a/a/j/m;->i:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lc/a/a/j/m;->i:I

    return-void
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/j/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/j/m;->d:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/a/a/j/m;->d:Ljava/util/List;

    :cond_0
    iget-object p0, p0, Lc/a/a/j/m;->d:Ljava/util/List;

    return-object p0
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/j/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/j/m;->c:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/a/a/j/m;->c:Ljava/util/List;

    :cond_0
    iget-object p0, p0, Lc/a/a/j/m;->c:Ljava/util/List;

    return-object p0
.end method

.method public g()Ljava/text/DateFormat;
    .locals 3

    iget-object v0, p0, Lc/a/a/j/m;->k:Ljava/text/DateFormat;

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/a/a/j/m;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lc/a/a/j/m;->j:Ljava/lang/String;

    iget-object v2, p0, Lc/a/a/j/m;->o:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Lc/a/a/j/m;->k:Ljava/text/DateFormat;

    iget-object v1, p0, Lc/a/a/j/m;->n:Ljava/util/TimeZone;

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_0
    iget-object p0, p0, Lc/a/a/j/m;->k:Ljava/text/DateFormat;

    return-object p0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/j/r;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/j/m;->g:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/a/a/j/m;->g:Ljava/util/List;

    :cond_0
    iget-object p0, p0, Lc/a/a/j/m;->g:Ljava/util/List;

    return-object p0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/j/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/j/m;->e:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/a/a/j/m;->e:Ljava/util/List;

    :cond_0
    iget-object p0, p0, Lc/a/a/j/m;->e:Ljava/util/List;

    return-object p0
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/j/v;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/j/m;->h:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/a/a/j/m;->h:Ljava/util/List;

    :cond_0
    iget-object p0, p0, Lc/a/a/j/m;->h:Ljava/util/List;

    return-object p0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/j/c0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/j/m;->f:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/a/a/j/m;->f:Ljava/util/List;

    :cond_0
    iget-object p0, p0, Lc/a/a/j/m;->f:Ljava/util/List;

    return-object p0
.end method

.method public l()V
    .locals 1

    iget v0, p0, Lc/a/a/j/m;->i:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lc/a/a/j/m;->i:I

    return-void
.end method

.method public m()V
    .locals 3

    iget-object v0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lc/a/a/j/z;->write(I)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lc/a/a/j/m;->i:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lc/a/a/j/z;->write(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object p0, p0, Lc/a/a/j/m;->g:Ljava/util/List;

    if-eqz p0, :cond_1

    if-eqz p2, :cond_0

    instance-of v0, p2, Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {p2}, Lc/a/a/a;->l(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/j/r;

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p1, p2, p3}, Lc/a/a/j/r;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method public p(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 2

    iget-object v0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    iget v0, v0, Lc/a/a/j/z;->n:I

    sget-object v1, Lc/a/a/j/a0;->p:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    and-int/2addr v0, v1

    if-nez v0, :cond_1

    new-instance v0, Lc/a/a/j/w;

    invoke-direct {v0, p1, p2, p3, p4}, Lc/a/a/j/w;-><init>(Lc/a/a/j/w;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v0, p0, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    iget-object p1, p0, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    :cond_0
    iget-object p1, p0, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    iget-object p0, p0, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    invoke-virtual {p1, p2, p0}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc/a/a/j/m;->j:Ljava/lang/String;

    iget-object p1, p0, Lc/a/a/j/m;->k:Ljava/text/DateFormat;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lc/a/a/j/m;->k:Ljava/text/DateFormat;

    :cond_0
    return-void
.end method

.method public final r(Ljava/lang/Object;)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v1, v0}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-interface {v0, p0, p1, v1, v1}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    new-instance p1, Lc/a/a/d;

    invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final s(Ljava/lang/String;)V
    .locals 2

    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    if-nez p1, :cond_1

    iget p1, p0, Lc/a/a/j/z;->n:I

    sget-object v0, Lc/a/a/j/a0;->h:Lc/a/a/j/a0;

    iget v0, v0, Lc/a/a/j/a0;->z:I

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const-string p1, ""

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    :goto_0
    return-void

    :cond_1
    iget v0, p0, Lc/a/a/j/z;->n:I

    sget-object v1, Lc/a/a/j/a0;->c:Lc/a/a/j/a0;

    iget v1, v1, Lc/a/a/j/a0;->z:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->r(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1}, Lc/a/a/j/z;->q(Ljava/lang/String;CZ)V

    :goto_1
    return-void
.end method

.method public t(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/j/m;->m:Lc/a/a/j/w;

    iget-object v1, v0, Lc/a/a/j/w;->b:Ljava/lang/Object;

    if-ne p1, v1, :cond_0

    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const-string p1, "{\"$ref\":\"@\"}"

    :goto_0
    invoke-virtual {p0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v1, v0, Lc/a/a/j/w;->a:Lc/a/a/j/w;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lc/a/a/j/w;->b:Ljava/lang/Object;

    if-ne p1, v1, :cond_1

    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const-string p1, "{\"$ref\":\"..\"}"

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v1, v0, Lc/a/a/j/w;->a:Lc/a/a/j/w;

    if-nez v1, :cond_3

    iget-object v0, v0, Lc/a/a/j/w;->b:Ljava/lang/Object;

    if-ne p1, v0, :cond_2

    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const-string p1, "{\"$ref\":\"$\"}"

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lc/a/a/j/m;->l:Ljava/util/IdentityHashMap;

    invoke-virtual {v0, p1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/a/a/j/w;

    invoke-virtual {p1}, Lc/a/a/j/w;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const-string v1, "{\"$ref\":\""

    invoke-virtual {v0, v1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    iget-object v0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    invoke-virtual {v0, p1}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    const-string p1, "\"}"

    goto :goto_0

    :cond_3
    move-object v0, v1

    goto :goto_1
.end method

.method public toString()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    invoke-virtual {p0}, Lc/a/a/j/z;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final u(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lc/a/a/j/m;->v(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V

    return-void
.end method

.method public final v(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V
    .locals 1

    if-nez p1, :cond_0

    :try_start_0
    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    invoke-virtual {p0}, Lc/a/a/j/z;->o()V

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p4

    iget-object v0, p0, Lc/a/a/j/m;->a:Lc/a/a/j/x;

    invoke-virtual {v0, p4}, Lc/a/a/j/x;->a(Ljava/lang/Class;)Lc/a/a/j/t;

    move-result-object p4

    invoke-interface {p4, p0, p1, p2, p3}, Lc/a/a/j/t;->a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    new-instance p1, Lc/a/a/d;

    invoke-virtual {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final w(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    instance-of v0, p1, Ljava/util/Date;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc/a/a/j/m;->g()Ljava/text/DateFormat;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lc/a/a/j/m;->o:Ljava/util/Locale;

    invoke-direct {v0, p2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iget-object p2, p0, Lc/a/a/j/m;->n:Ljava/util/TimeZone;

    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_0
    check-cast p1, Ljava/util/Date;

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    invoke-virtual {p0, p1}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {p0, p1}, Lc/a/a/j/m;->r(Ljava/lang/Object;)V

    return-void
.end method
