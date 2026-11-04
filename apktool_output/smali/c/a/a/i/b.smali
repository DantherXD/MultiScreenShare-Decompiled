.class public Lc/a/a/i/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/i/b$a;
    }
.end annotation


# instance fields
.field public final b:Lc/a/a/i/o;

.field public c:Lc/a/a/i/m;

.field private d:Ljava/lang/String;

.field private e:Ljava/text/DateFormat;

.field public final f:Lc/a/a/i/e;

.field protected g:Lc/a/a/i/l;

.field private h:[Lc/a/a/i/l;

.field private i:I

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/i/b$a;",
            ">;"
        }
    .end annotation
.end field

.field public k:I

.field protected l:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/i/q/c;",
            ">;"
        }
    .end annotation
.end field

.field protected m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/i/q/b;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lc/a/a/i/q/e;


# direct methods
.method public constructor <init>(Lc/a/a/i/e;Lc/a/a/i/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lc/a/a/a;->e:Ljava/lang/String;

    iput-object v0, p0, Lc/a/a/i/b;->d:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lc/a/a/i/b;->i:I

    iput v0, p0, Lc/a/a/i/b;->k:I

    const/4 v0, 0x0

    iput-object v0, p0, Lc/a/a/i/b;->l:Ljava/util/List;

    iput-object v0, p0, Lc/a/a/i/b;->m:Ljava/util/List;

    iput-object v0, p0, Lc/a/a/i/b;->n:Lc/a/a/i/q/e;

    iput-object p1, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iput-object p2, p0, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    iget-object p2, p2, Lc/a/a/i/m;->d:Lc/a/a/i/o;

    iput-object p2, p0, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    iget-char p0, p1, Lc/a/a/i/e;->k:C

    const/16 p2, 0x1a

    const/16 v0, 0x7b

    if-ne p0, v0, :cond_1

    iget p0, p1, Lc/a/a/i/e;->l:I

    add-int/lit8 p0, p0, 0x1

    iput p0, p1, Lc/a/a/i/e;->l:I

    iget v0, p1, Lc/a/a/i/e;->y:I

    if-lt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p1, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result p2

    :goto_0
    iput-char p2, p1, Lc/a/a/i/e;->k:C

    const/16 p0, 0xc

    :goto_1
    iput p0, p1, Lc/a/a/i/e;->h:I

    goto :goto_3

    :cond_1
    const/16 v0, 0x5b

    if-ne p0, v0, :cond_3

    iget p0, p1, Lc/a/a/i/e;->l:I

    add-int/lit8 p0, p0, 0x1

    iput p0, p1, Lc/a/a/i/e;->l:I

    iget v0, p1, Lc/a/a/i/e;->y:I

    if-lt p0, v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object p2, p1, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {p2, p0}, Ljava/lang/String;->charAt(I)C

    move-result p2

    :goto_2
    iput-char p2, p1, Lc/a/a/i/e;->k:C

    const/16 p0, 0xe

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lc/a/a/i/e;->s()V

    :goto_3
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lc/a/a/i/m;I)V
    .locals 1

    new-instance v0, Lc/a/a/i/e;

    invoke-direct {v0, p1, p3}, Lc/a/a/i/e;-><init>(Ljava/lang/String;I)V

    invoke-direct {p0, v0, p2}, Lc/a/a/i/b;-><init>(Lc/a/a/i/e;Lc/a/a/i/m;)V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v1, v0, Lc/a/a/i/e;->h:I

    if-ne v1, p1, :cond_0

    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    return-void

    :cond_0
    new-instance v0, Lc/a/a/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syntax error, expect "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", actual "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget p0, p0, Lc/a/a/i/e;->h:I

    invoke-static {p0}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected b(Lc/a/a/i/b$a;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/i/b;->j:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lc/a/a/i/b;->j:Ljava/util/List;

    :cond_0
    iget-object p0, p0, Lc/a/a/i/b;->j:Ljava/util/List;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method protected c(Ljava/util/Collection;)V
    .locals 4

    instance-of v0, p1, Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lc/a/a/i/b;->h()Lc/a/a/i/b$a;

    move-result-object v0

    new-instance v2, Lc/a/a/i/n;

    move-object v3, p1

    check-cast v3, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v2, p0, v3, p1}, Lc/a/a/i/n;-><init>(Lc/a/a/i/b;Ljava/util/List;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lc/a/a/i/b;->h()Lc/a/a/i/b$a;

    move-result-object v0

    new-instance v2, Lc/a/a/i/n;

    invoke-direct {v2, p1}, Lc/a/a/i/n;-><init>(Ljava/util/Collection;)V

    :goto_0
    iput-object v2, v0, Lc/a/a/i/b$a;->c:Lc/a/a/i/q/d;

    iget-object p1, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iput-object p1, v0, Lc/a/a/i/b$a;->d:Lc/a/a/i/l;

    iput v1, p0, Lc/a/a/i/b;->k:I

    return-void
.end method

.method public close()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v1, v0, Lc/a/a/i/e;->h:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v2, 0x14

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lc/a/a/i/e;->e()V

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Lc/a/a/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not close json text, token : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v2, v2, Lc/a/a/i/e;->h:I

    invoke-static {v2}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->e()V

    throw v0
.end method

.method protected d(Ljava/util/Map;Ljava/lang/Object;)V
    .locals 1

    new-instance v0, Lc/a/a/i/n;

    invoke-direct {v0, p1, p2}, Lc/a/a/i/n;-><init>(Ljava/util/Map;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc/a/a/i/b;->h()Lc/a/a/i/b$a;

    move-result-object p1

    iput-object v0, p1, Lc/a/a/i/b$a;->c:Lc/a/a/i/q/d;

    iget-object p2, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iput-object p2, p1, Lc/a/a/i/b$a;->d:Lc/a/a/i/l;

    const/4 p1, 0x0

    iput p1, p0, Lc/a/a/i/b;->k:I

    return-void
.end method

.method public e()Ljava/text/DateFormat;
    .locals 3

    iget-object v0, p0, Lc/a/a/i/b;->e:Ljava/text/DateFormat;

    if-nez v0, :cond_0

    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lc/a/a/i/b;->d:Ljava/lang/String;

    iget-object v2, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-object v2, v2, Lc/a/a/i/e;->u:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iput-object v0, p0, Lc/a/a/i/b;->e:Ljava/text/DateFormat;

    iget-object v1, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-object v1, v1, Lc/a/a/i/e;->t:Ljava/util/TimeZone;

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_0
    iget-object p0, p0, Lc/a/a/i/b;->e:Ljava/text/DateFormat;

    return-object p0
.end method

.method public f()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/i/q/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/i/b;->m:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lc/a/a/i/b;->m:Ljava/util/List;

    :cond_0
    iget-object p0, p0, Lc/a/a/i/b;->m:Ljava/util/List;

    return-object p0
.end method

.method public g()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lc/a/a/i/q/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/i/b;->l:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lc/a/a/i/b;->l:Ljava/util/List;

    :cond_0
    iget-object p0, p0, Lc/a/a/i/b;->l:Ljava/util/List;

    return-object p0
.end method

.method protected h()Lc/a/a/i/b$a;
    .locals 1

    iget-object p0, p0, Lc/a/a/i/b;->j:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/a/a/i/b$a;

    return-object p0
.end method

.method public i(Ljava/lang/Object;)V
    .locals 8

    iget-object p1, p0, Lc/a/a/i/b;->j:Ljava/util/List;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_6

    iget-object v2, p0, Lc/a/a/i/b;->j:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc/a/a/i/b$a;

    iget-object v3, v2, Lc/a/a/i/b$a;->c:Lc/a/a/i/q/d;

    if-nez v3, :cond_1

    goto :goto_3

    :cond_1
    iget-object v4, v2, Lc/a/a/i/b$a;->d:Lc/a/a/i/l;

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    iget-object v4, v4, Lc/a/a/i/l;->a:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    move-object v4, v5

    :goto_1
    invoke-static {v2}, Lc/a/a/i/b$a;->a(Lc/a/a/i/b$a;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "$"

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v2, v0

    :goto_2
    iget v7, p0, Lc/a/a/i/b;->i:I

    if-ge v2, v7, :cond_5

    iget-object v7, p0, Lc/a/a/i/b;->h:[Lc/a/a/i/l;

    aget-object v7, v7, v2

    invoke-virtual {v7}, Lc/a/a/i/l;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    iget-object v5, p0, Lc/a/a/i/b;->h:[Lc/a/a/i/l;

    aget-object v5, v5, v2

    iget-object v5, v5, Lc/a/a/i/l;->a:Ljava/lang/Object;

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-static {v2}, Lc/a/a/i/b$a;->b(Lc/a/a/i/b$a;)Lc/a/a/i/l;

    move-result-object v2

    iget-object v5, v2, Lc/a/a/i/l;->a:Ljava/lang/Object;

    :cond_5
    invoke-virtual {v3, v4, v5}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public j()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lc/a/a/i/b;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v1, v0, Lc/a/a/i/e;->h:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_a

    const/4 v3, 0x3

    const/4 v4, 0x1

    if-eq v1, v3, :cond_8

    const/4 v3, 0x4

    const/16 v5, 0x10

    if-eq v1, v3, :cond_5

    const/16 v3, 0xc

    if-eq v1, v3, :cond_3

    const/16 v3, 0xe

    if-eq v1, v3, :cond_2

    const/4 v3, 0x0

    const-string v4, "syntax error, "

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    new-instance p1, Lc/a/a/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    new-instance v0, Ljava/util/TreeSet;

    invoke-direct {v0}, Ljava/util/TreeSet;-><init>()V

    :goto_0
    invoke-virtual {p0, v0, p1}, Lc/a/a/i/b;->o(Ljava/util/Collection;Ljava/lang/Object;)V

    return-object v0

    :pswitch_1
    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {v0}, Lc/a/a/i/e;->l()Z

    move-result p1

    if-eqz p1, :cond_0

    return-object v3

    :cond_0
    new-instance p1, Lc/a/a/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    const/16 p1, 0x12

    invoke-virtual {v0, p1}, Lc/a/a/i/e;->t(I)V

    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v1, v0, Lc/a/a/i/e;->h:I

    if-ne v1, p1, :cond_1

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Lc/a/a/i/e;->t(I)V

    invoke-virtual {p0, p1}, Lc/a/a/i/b;->a(I)V

    iget-object p1, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p1}, Lc/a/a/i/e;->k()Ljava/lang/Number;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v2}, Lc/a/a/i/b;->a(I)V

    const/16 p1, 0xb

    invoke-virtual {p0, p1}, Lc/a/a/i/b;->a(I)V

    new-instance p0, Ljava/util/Date;

    invoke-direct {p0, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p0

    :cond_1
    new-instance p1, Lc/a/a/d;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_4
    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    return-object v3

    :pswitch_5
    invoke-virtual {v0, v5}, Lc/a/a/i/e;->t(I)V

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :pswitch_6
    invoke-virtual {v0, v5}, Lc/a/a/i/e;->t(I)V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_2
    new-instance v0, Lc/a/a/b;

    invoke-direct {v0}, Lc/a/a/b;-><init>()V

    goto/16 :goto_0

    :cond_3
    iget v0, v0, Lc/a/a/i/e;->j:I

    sget-object v1, Lc/a/a/i/d;->p:Lc/a/a/i/d;

    iget v1, v1, Lc/a/a/i/d;->u:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    new-instance v0, Lc/a/a/e;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {v0, v1}, Lc/a/a/e;-><init>(Ljava/util/Map;)V

    goto :goto_1

    :cond_4
    new-instance v0, Lc/a/a/e;

    invoke-direct {v0}, Lc/a/a/e;-><init>()V

    :goto_1
    invoke-virtual {p0, v0, p1}, Lc/a/a/i/b;->t(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-virtual {v0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v0, v5}, Lc/a/a/i/e;->t(I)V

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget p0, p0, Lc/a/a/i/e;->j:I

    sget-object v0, Lc/a/a/i/d;->g:Lc/a/a/i/d;

    iget v0, v0, Lc/a/a/i/d;->u:I

    and-int/2addr p0, v0

    if-eqz p0, :cond_7

    new-instance p0, Lc/a/a/i/e;

    invoke-direct {p0, p1}, Lc/a/a/i/e;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, v4}, Lc/a/a/i/e;->L(Z)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p0, Lc/a/a/i/e;->v:Ljava/util/Calendar;

    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lc/a/a/i/e;->e()V

    return-object p1

    :cond_6
    invoke-virtual {p0}, Lc/a/a/i/e;->e()V

    goto :goto_2

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lc/a/a/i/e;->e()V

    throw p1

    :cond_7
    :goto_2
    return-object p1

    :cond_8
    iget p1, v0, Lc/a/a/i/e;->j:I

    sget-object v1, Lc/a/a/i/d;->i:Lc/a/a/i/d;

    iget v1, v1, Lc/a/a/i/d;->u:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_9

    goto :goto_3

    :cond_9
    const/4 v4, 0x0

    :goto_3
    invoke-virtual {v0, v4}, Lc/a/a/i/e;->f(Z)Ljava/lang/Number;

    move-result-object p1

    :goto_4
    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->s()V

    return-object p1

    :cond_a
    invoke-virtual {v0}, Lc/a/a/i/e;->k()Ljava/lang/Number;

    move-result-object p1

    goto :goto_4

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x14
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method public l(Ljava/lang/reflect/Type;Ljava/util/Collection;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lc/a/a/i/b;->m(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V

    return-void
.end method

.method public m(Ljava/lang/reflect/Type;Ljava/util/Collection;Ljava/lang/Object;)V
    .locals 9

    const-class v0, Ljava/lang/String;

    iget-object v1, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v2, v1, Lc/a/a/i/e;->h:I

    const/16 v3, 0x15

    if-eq v2, v3, :cond_0

    const/16 v3, 0x16

    if-ne v2, v3, :cond_1

    :cond_0
    invoke-virtual {v1}, Lc/a/a/i/e;->s()V

    :cond_1
    iget-object v1, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v2, v1, Lc/a/a/i/e;->h:I

    const/16 v3, 0xe

    if-ne v2, v3, :cond_e

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v3, 0x4

    if-ne v2, p1, :cond_2

    sget-object v2, Lc/a/a/j/k;->a:Lc/a/a/j/k;

    const/4 v4, 0x2

    :goto_0
    invoke-virtual {v1, v4}, Lc/a/a/i/e;->t(I)V

    goto :goto_1

    :cond_2
    if-ne v0, p1, :cond_3

    sget-object v2, Lc/a/a/j/b0;->a:Lc/a/a/j/b0;

    invoke-virtual {v1, v3}, Lc/a/a/i/e;->t(I)V

    goto :goto_1

    :cond_3
    iget-object v1, p0, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v1, p1}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v2

    iget-object v1, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    const/16 v4, 0xc

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iget-object v4, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-boolean v4, v4, Lc/a/a/i/e;->A:Z

    if-nez v4, :cond_4

    invoke-virtual {p0, v1, p2, p3}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;

    :cond_4
    const/4 p3, 0x0

    :goto_2
    :try_start_0
    iget-object v4, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v5, v4, Lc/a/a/i/e;->h:I

    const/16 v6, 0x10

    if-ne v5, v6, :cond_5

    invoke-virtual {v4}, Lc/a/a/i/e;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :cond_5
    const/16 v7, 0xf

    if-ne v5, v7, :cond_6

    iput-object v1, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    invoke-virtual {v4, v6}, Lc/a/a/i/e;->t(I)V

    return-void

    :cond_6
    :try_start_1
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v8, 0x0

    if-ne v7, p1, :cond_7

    sget-object v4, Lc/a/a/j/k;->a:Lc/a/a/j/k;

    invoke-virtual {v4, p0, v8, v8}, Lc/a/a/j/k;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    :goto_3
    invoke-interface {p2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_7
    if-ne v0, p1, :cond_a

    if-ne v5, v3, :cond_8

    invoke-virtual {v4}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v5, v6}, Lc/a/a/i/e;->t(I)V

    goto :goto_3

    :cond_8
    invoke-virtual {p0}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_9

    goto :goto_4

    :cond_9
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    :goto_4
    move-object v4, v8

    goto :goto_3

    :cond_a
    const/16 v7, 0x8

    if-ne v5, v7, :cond_b

    invoke-virtual {v4}, Lc/a/a/i/e;->s()V

    goto :goto_5

    :cond_b
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, p0, p1, v4}, Lc/a/a/i/q/f;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    :goto_5
    invoke-interface {p2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget v4, p0, Lc/a/a/i/b;->k:I

    const/4 v5, 0x1

    if-ne v4, v5, :cond_c

    invoke-virtual {p0, p2}, Lc/a/a/i/b;->c(Ljava/util/Collection;)V

    :cond_c
    :goto_6
    iget-object v4, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v5, v4, Lc/a/a/i/e;->h:I

    if-ne v5, v6, :cond_d

    invoke-virtual {v4}, Lc/a/a/i/e;->s()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_d
    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :catchall_0
    move-exception p1

    iput-object v1, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    throw p1

    :cond_e
    new-instance p1, Lc/a/a/d;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "exepct \'[\', but "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget p3, p3, Lc/a/a/i/e;->h:I

    invoke-static {p3}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, ", "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(Ljava/util/Collection;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc/a/a/i/b;->o(Ljava/util/Collection;Ljava/lang/Object;)V

    return-void
.end method

.method public final o(Ljava/util/Collection;Ljava/lang/Object;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v3, v2, Lc/a/a/i/e;->h:I

    const/16 v4, 0x15

    if-eq v3, v4, :cond_0

    const/16 v4, 0x16

    if-ne v3, v4, :cond_1

    :cond_0
    invoke-virtual {v2}, Lc/a/a/i/e;->s()V

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v3, v2, Lc/a/a/i/e;->h:I

    :cond_1
    const/16 v2, 0xe

    if-ne v3, v2, :cond_2a

    iget-object v3, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-boolean v3, v3, Lc/a/a/i/e;->A:Z

    iget-object v4, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    if-nez v3, :cond_2

    move-object/from16 v5, p2

    invoke-virtual {v1, v4, v0, v5}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;

    :cond_2
    :try_start_0
    iget-object v5, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-char v6, v5, Lc/a/a/i/e;->k:C

    const/16 v7, 0x7b

    const/16 v8, 0x5d

    const/4 v10, 0x4

    const/16 v11, 0xc

    const/16 v13, 0x22

    const/16 v14, 0x10

    const/4 v15, 0x1

    if-eq v6, v13, :cond_7

    if-ne v6, v8, :cond_4

    invoke-virtual {v5}, Lc/a/a/i/e;->q()C

    iget-object v0, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v0, v14}, Lc/a/a/i/e;->t(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_3

    iput-object v4, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_3
    return-void

    :cond_4
    if-ne v6, v7, :cond_6

    :try_start_1
    iget v6, v5, Lc/a/a/i/e;->l:I

    add-int/2addr v6, v15

    iput v6, v5, Lc/a/a/i/e;->l:I

    iget v9, v5, Lc/a/a/i/e;->y:I

    if-lt v6, v9, :cond_5

    const/16 v6, 0x1a

    goto :goto_0

    :cond_5
    iget-object v9, v5, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v9, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    :goto_0
    iput-char v6, v5, Lc/a/a/i/e;->k:C

    iget-object v5, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iput v11, v5, Lc/a/a/i/e;->h:I

    goto :goto_1

    :cond_6
    invoke-virtual {v5, v11}, Lc/a/a/i/e;->t(I)V

    :goto_1
    const/4 v5, 0x0

    goto :goto_2

    :cond_7
    iget v6, v5, Lc/a/a/i/e;->j:I

    sget-object v9, Lc/a/a/i/d;->g:Lc/a/a/i/d;

    iget v9, v9, Lc/a/a/i/d;->u:I

    and-int/2addr v6, v9

    if-nez v6, :cond_8

    move v5, v15

    goto :goto_2

    :cond_8
    invoke-virtual {v5, v10}, Lc/a/a/i/e;->t(I)V

    goto :goto_1

    :goto_2
    const/4 v6, 0x0

    :goto_3
    if-eqz v5, :cond_11

    iget-object v9, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-char v7, v9, Lc/a/a/i/e;->k:C

    if-ne v7, v13, :cond_11

    invoke-virtual {v9, v13}, Lc/a/a/i/e;->S(C)Ljava/lang/String;

    move-result-object v7

    iget-object v9, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-char v12, v9, Lc/a/a/i/e;->k:C

    const/16 v2, 0x2c

    if-ne v12, v2, :cond_c

    iget v2, v9, Lc/a/a/i/e;->l:I

    add-int/2addr v2, v15

    iput v2, v9, Lc/a/a/i/e;->l:I

    iget v12, v9, Lc/a/a/i/e;->y:I

    if-lt v2, v12, :cond_9

    const/16 v2, 0x1a

    goto :goto_4

    :cond_9
    iget-object v12, v9, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v12, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    :goto_4
    iput-char v2, v9, Lc/a/a/i/e;->k:C

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget v7, v1, Lc/a/a/i/b;->k:I

    if-ne v7, v15, :cond_a

    invoke-virtual/range {p0 .. p1}, Lc/a/a/i/b;->c(Ljava/util/Collection;)V

    :cond_a
    if-ne v2, v13, :cond_b

    const/4 v9, 0x0

    goto/16 :goto_10

    :cond_b
    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v2}, Lc/a/a/i/e;->s()V

    const/4 v5, 0x0

    goto :goto_6

    :cond_c
    if-ne v12, v8, :cond_10

    iget v2, v9, Lc/a/a/i/e;->l:I

    add-int/2addr v2, v15

    iput v2, v9, Lc/a/a/i/e;->l:I

    iget v5, v9, Lc/a/a/i/e;->y:I

    if-lt v2, v5, :cond_d

    const/16 v2, 0x1a

    goto :goto_5

    :cond_d
    iget-object v5, v9, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    :goto_5
    iput-char v2, v9, Lc/a/a/i/e;->k:C

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget v2, v1, Lc/a/a/i/b;->k:I

    if-ne v2, v15, :cond_e

    invoke-virtual/range {p0 .. p1}, Lc/a/a/i/b;->c(Ljava/util/Collection;)V

    :cond_e
    iget-object v0, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v0, v14}, Lc/a/a/i/e;->t(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_f

    iput-object v4, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_f
    return-void

    :cond_10
    :try_start_2
    invoke-virtual {v9}, Lc/a/a/i/e;->s()V

    :cond_11
    :goto_6
    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    :goto_7
    iget v2, v2, Lc/a/a/i/e;->h:I

    if-ne v2, v14, :cond_12

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v2}, Lc/a/a/i/e;->s()V

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    goto :goto_7

    :cond_12
    const/4 v7, 0x2

    const/4 v9, 0x0

    if-eq v2, v7, :cond_22

    const/4 v7, 0x3

    if-eq v2, v7, :cond_20

    if-eq v2, v10, :cond_1e

    const/4 v7, 0x6

    if-eq v2, v7, :cond_1d

    const/4 v7, 0x7

    if-eq v2, v7, :cond_1c

    const/16 v7, 0x8

    if-eq v2, v7, :cond_1b

    if-eq v2, v11, :cond_19

    const/16 v7, 0x14

    if-eq v2, v7, :cond_18

    const/16 v7, 0x17

    if-eq v2, v7, :cond_17

    const/16 v7, 0xe

    if-eq v2, v7, :cond_16

    const/16 v9, 0xf

    if-eq v2, v9, :cond_14

    invoke-virtual/range {p0 .. p0}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object v9

    :cond_13
    :goto_8
    move-object v2, v9

    const/4 v9, 0x0

    goto/16 :goto_e

    :cond_14
    iget-object v0, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v0, v14}, Lc/a/a/i/e;->t(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v3, :cond_15

    iput-object v4, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_15
    return-void

    :cond_16
    :try_start_3
    new-instance v9, Lc/a/a/b;

    invoke-direct {v9}, Lc/a/a/b;-><init>()V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v9, v2}, Lc/a/a/i/b;->o(Ljava/util/Collection;Ljava/lang/Object;)V

    goto :goto_8

    :cond_17
    const/16 v7, 0xe

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    :goto_9
    invoke-virtual {v2, v10}, Lc/a/a/i/e;->t(I)V

    goto :goto_8

    :cond_18
    new-instance v0, Lc/a/a/d;

    const-string v2, "unclosed jsonArray"

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    const/16 v7, 0xe

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v2, v2, Lc/a/a/i/e;->j:I

    sget-object v9, Lc/a/a/i/d;->p:Lc/a/a/i/d;

    iget v9, v9, Lc/a/a/i/d;->u:I

    and-int/2addr v2, v9

    if-eqz v2, :cond_1a

    new-instance v2, Lc/a/a/e;

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {v2, v9}, Lc/a/a/e;-><init>(Ljava/util/Map;)V

    goto :goto_a

    :cond_1a
    new-instance v2, Lc/a/a/e;

    invoke-direct {v2}, Lc/a/a/e;-><init>()V

    :goto_a
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v1, v2, v9}, Lc/a/a/i/b;->t(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_8

    :cond_1b
    const/16 v7, 0xe

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    goto :goto_9

    :cond_1c
    const/16 v7, 0xe

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    :goto_b
    invoke-virtual {v2, v14}, Lc/a/a/i/e;->t(I)V

    goto :goto_8

    :cond_1d
    const/16 v7, 0xe

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    goto :goto_b

    :cond_1e
    const/16 v7, 0xe

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v2}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v9

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v2, v14}, Lc/a/a/i/e;->t(I)V

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v2, v2, Lc/a/a/i/e;->j:I

    sget-object v12, Lc/a/a/i/d;->g:Lc/a/a/i/d;

    iget v12, v12, Lc/a/a/i/d;->u:I

    and-int/2addr v2, v12

    if-eqz v2, :cond_13

    new-instance v2, Lc/a/a/i/e;

    invoke-direct {v2, v9}, Lc/a/a/i/e;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v15}, Lc/a/a/i/e;->L(Z)Z

    move-result v12

    if-eqz v12, :cond_1f

    iget-object v9, v2, Lc/a/a/i/e;->v:Ljava/util/Calendar;

    invoke-virtual {v9}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v9

    :cond_1f
    invoke-virtual {v2}, Lc/a/a/i/e;->e()V

    goto/16 :goto_8

    :cond_20
    const/16 v7, 0xe

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v9, v2, Lc/a/a/i/e;->j:I

    sget-object v12, Lc/a/a/i/d;->i:Lc/a/a/i/d;

    iget v12, v12, Lc/a/a/i/d;->u:I

    and-int/2addr v9, v12

    if-eqz v9, :cond_21

    invoke-virtual {v2, v15}, Lc/a/a/i/e;->f(Z)Ljava/lang/Number;

    move-result-object v2

    const/4 v9, 0x0

    goto :goto_c

    :cond_21
    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Lc/a/a/i/e;->f(Z)Ljava/lang/Number;

    move-result-object v2

    :goto_c
    iget-object v12, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    :goto_d
    invoke-virtual {v12, v14}, Lc/a/a/i/e;->t(I)V

    goto :goto_e

    :cond_22
    const/16 v7, 0xe

    const/4 v9, 0x0

    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v2}, Lc/a/a/i/e;->k()Ljava/lang/Number;

    move-result-object v2

    iget-object v12, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    goto :goto_d

    :goto_e
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget v2, v1, Lc/a/a/i/b;->k:I

    if-ne v2, v15, :cond_23

    invoke-virtual/range {p0 .. p1}, Lc/a/a/i/b;->c(Ljava/util/Collection;)V

    :cond_23
    iget-object v2, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v12, v2, Lc/a/a/i/e;->h:I

    if-ne v12, v14, :cond_28

    iget-char v12, v2, Lc/a/a/i/e;->k:C

    if-ne v12, v13, :cond_24

    iget v12, v2, Lc/a/a/i/e;->l:I

    iput v12, v2, Lc/a/a/i/e;->i:I

    invoke-virtual {v2}, Lc/a/a/i/e;->R()V

    goto :goto_10

    :cond_24
    const/16 v7, 0x30

    if-lt v12, v7, :cond_25

    const/16 v7, 0x39

    if-gt v12, v7, :cond_25

    iget v7, v2, Lc/a/a/i/e;->l:I

    iput v7, v2, Lc/a/a/i/e;->i:I

    invoke-virtual {v2}, Lc/a/a/i/e;->P()V

    goto :goto_10

    :cond_25
    const/16 v7, 0x7b

    if-ne v12, v7, :cond_27

    iput v11, v2, Lc/a/a/i/e;->h:I

    iget v12, v2, Lc/a/a/i/e;->l:I

    add-int/2addr v12, v15

    iput v12, v2, Lc/a/a/i/e;->l:I

    iget v7, v2, Lc/a/a/i/e;->y:I

    if-lt v12, v7, :cond_26

    const/16 v7, 0x1a

    goto :goto_f

    :cond_26
    iget-object v7, v2, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v12}, Ljava/lang/String;->charAt(I)C

    move-result v7

    :goto_f
    iput-char v7, v2, Lc/a/a/i/e;->k:C

    goto :goto_10

    :cond_27
    invoke-virtual {v2}, Lc/a/a/i/e;->s()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_28
    :goto_10
    add-int/lit8 v6, v6, 0x1

    const/16 v2, 0xe

    const/16 v7, 0x7b

    goto/16 :goto_3

    :catchall_0
    move-exception v0

    if-nez v3, :cond_29

    iput-object v4, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_29
    throw v0

    :cond_2a
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "syntax error, expect [, actual "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", pos "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v1, v1, Lc/a/a/i/e;->i:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public p()Lc/a/a/e;
    .locals 2

    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v0, v0, Lc/a/a/i/e;->j:I

    sget-object v1, Lc/a/a/i/d;->p:Lc/a/a/i/d;

    iget v1, v1, Lc/a/a/i/d;->u:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    new-instance v0, Lc/a/a/e;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {v0, v1}, Lc/a/a/e;-><init>(Ljava/util/Map;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lc/a/a/e;

    invoke-direct {v0}, Lc/a/a/e;-><init>()V

    :goto_0
    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lc/a/a/i/b;->t(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc/a/a/e;

    return-object p0
.end method

.method public q(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc/a/a/i/b;->s(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public r(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc/a/a/i/b;->s(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public s(Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v1, v0, Lc/a/a/i/e;->h:I

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v2, 0x4

    if-ne v1, v2, :cond_2

    const-class v1, [B

    if-ne p1, v1, :cond_1

    invoke-virtual {v0}, Lc/a/a/i/e;->a()[B

    move-result-object p1

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->s()V

    return-object p1

    :cond_1
    const-class v1, [C

    if-ne p1, v1, :cond_2

    invoke-virtual {v0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object p1

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0}, Lc/a/a/i/e;->s()V

    invoke-virtual {p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object p0

    return-object p0

    :cond_2
    iget-object v0, p0, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v0, p1}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v0

    :try_start_0
    invoke-interface {v0, p0, p1, p2}, Lc/a/a/i/q/f;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Lc/a/a/d; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Lc/a/a/d;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    throw p0
.end method

.method public final t(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    iget-object v3, v1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v4, v3, Lc/a/a/i/e;->h:I

    const/16 v5, 0x8

    const/4 v6, 0x0

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, Lc/a/a/i/e;->s()V

    return-object v6

    :cond_0
    const/16 v7, 0xc

    const/16 v8, 0x10

    if-eq v4, v7, :cond_2

    if-ne v4, v8, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Lc/a/a/d;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "syntax error, expect {, actual "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    instance-of v4, v0, Lc/a/a/e;

    if-eqz v4, :cond_3

    move-object v4, v0

    check-cast v4, Lc/a/a/e;

    invoke-virtual {v4}, Lc/a/a/e;->n()Ljava/util/Map;

    move-result-object v4

    const/4 v11, 0x1

    goto :goto_1

    :cond_3
    move-object v4, v0

    const/4 v11, 0x0

    :goto_1
    iget v12, v3, Lc/a/a/i/e;->j:I

    sget-object v13, Lc/a/a/i/d;->g:Lc/a/a/i/d;

    iget v13, v13, Lc/a/a/i/d;->u:I

    and-int/2addr v12, v13

    if-eqz v12, :cond_4

    const/4 v12, 0x1

    goto :goto_2

    :cond_4
    const/4 v12, 0x0

    :goto_2
    iget-boolean v13, v3, Lc/a/a/i/e;->A:Z

    iget-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    const/4 v15, 0x0

    :goto_3
    :try_start_0
    iget-char v6, v3, Lc/a/a/i/e;->k:C

    const/16 v5, 0x7d

    const/16 v7, 0x22

    if-eq v6, v7, :cond_5

    if-eq v6, v5, :cond_5

    invoke-virtual {v3}, Lc/a/a/i/e;->a0()V

    :goto_4
    iget-char v6, v3, Lc/a/a/i/e;->k:C

    :cond_5
    const/16 v8, 0x2c

    if-ne v6, v8, :cond_6

    invoke-virtual {v3}, Lc/a/a/i/e;->q()C

    invoke-virtual {v3}, Lc/a/a/i/e;->a0()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :cond_6
    const-string v8, "expect \':\' at "

    const/16 v9, 0x3a

    const-string v10, "syntax error, "

    const/16 v5, 0x1a

    if-ne v6, v7, :cond_9

    :try_start_1
    iget-object v6, v1, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    invoke-virtual {v3, v6, v7}, Lc/a/a/i/e;->U(Lc/a/a/i/o;C)Ljava/lang/String;

    move-result-object v6

    iget-char v7, v3, Lc/a/a/i/e;->k:C

    if-eq v7, v9, :cond_8

    invoke-virtual {v3}, Lc/a/a/i/e;->a0()V

    iget-char v7, v3, Lc/a/a/i/e;->k:C

    if-ne v7, v9, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Lc/a/a/i/e;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", name "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_5
    const/4 v7, 0x0

    goto/16 :goto_9

    :cond_9
    const/16 v7, 0x7d

    if-ne v6, v7, :cond_c

    iget v2, v3, Lc/a/a/i/e;->l:I

    const/4 v4, 0x1

    add-int/2addr v2, v4

    iput v2, v3, Lc/a/a/i/e;->l:I

    iget v4, v3, Lc/a/a/i/e;->y:I

    if-lt v2, v4, :cond_a

    goto :goto_6

    :cond_a
    iget-object v4, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_6
    iput-char v5, v3, Lc/a/a/i/e;->k:C

    const/4 v2, 0x0

    iput v2, v3, Lc/a/a/i/e;->o:I

    const/16 v2, 0x10

    invoke-virtual {v3, v2}, Lc/a/a/i/e;->t(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v13, :cond_b

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_b
    return-object v0

    :cond_c
    const/16 v7, 0x27

    if-ne v6, v7, :cond_f

    :try_start_2
    iget-object v6, v1, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    invoke-virtual {v3, v6, v7}, Lc/a/a/i/e;->U(Lc/a/a/i/o;C)Ljava/lang/String;

    move-result-object v6

    iget-char v7, v3, Lc/a/a/i/e;->k:C

    if-eq v7, v9, :cond_d

    invoke-virtual {v3}, Lc/a/a/i/e;->a0()V

    :cond_d
    iget-char v7, v3, Lc/a/a/i/e;->k:C

    if-ne v7, v9, :cond_e

    goto :goto_5

    :cond_e
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Lc/a/a/i/e;->i:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    if-eq v6, v5, :cond_74

    const/16 v7, 0x2c

    if-eq v6, v7, :cond_73

    const/16 v7, 0x30

    if-lt v6, v7, :cond_10

    const/16 v7, 0x39

    if-le v6, v7, :cond_11

    :cond_10
    const/16 v7, 0x2d

    if-ne v6, v7, :cond_15

    :cond_11
    const/4 v6, 0x0

    iput v6, v3, Lc/a/a/i/e;->o:I

    invoke-virtual {v3}, Lc/a/a/i/e;->P()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget v6, v3, Lc/a/a/i/e;->h:I

    const/4 v7, 0x2

    if-ne v6, v7, :cond_12

    invoke-virtual {v3}, Lc/a/a/i/e;->k()Ljava/lang/Number;

    move-result-object v6

    goto :goto_7

    :cond_12
    const/4 v6, 0x1

    invoke-virtual {v3, v6}, Lc/a/a/i/e;->f(Z)Ljava/lang/Number;

    move-result-object v7

    move-object v6, v7

    :goto_7
    if-eqz v11, :cond_13

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_13
    :try_start_4
    iget-char v7, v3, Lc/a/a/i/e;->k:C

    if-ne v7, v9, :cond_14

    goto/16 :goto_5

    :cond_14
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "parse number key error, "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "parse number key error, "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    const/16 v7, 0x7b

    if-eq v6, v7, :cond_18

    const/16 v7, 0x5b

    if-ne v6, v7, :cond_16

    goto :goto_8

    :cond_16
    iget-object v6, v1, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    invoke-virtual {v3, v6}, Lc/a/a/i/e;->V(Lc/a/a/i/o;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lc/a/a/i/e;->a0()V

    iget-char v7, v3, Lc/a/a/i/e;->k:C

    if-ne v7, v9, :cond_17

    if-eqz v11, :cond_8

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    goto/16 :goto_5

    :cond_17
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Lc/a/a/i/e;->l:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", actual "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    :goto_8
    invoke-virtual {v3}, Lc/a/a/i/e;->s()V

    invoke-virtual/range {p0 .. p0}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x1

    :goto_9
    const/16 v8, 0xd

    if-nez v7, :cond_1c

    iget v7, v3, Lc/a/a/i/e;->l:I

    const/4 v9, 0x1

    add-int/2addr v7, v9

    iput v7, v3, Lc/a/a/i/e;->l:I

    iget v9, v3, Lc/a/a/i/e;->y:I

    if-lt v7, v9, :cond_19

    move v7, v5

    goto :goto_a

    :cond_19
    iget-object v9, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v9, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    :goto_a
    iput-char v7, v3, Lc/a/a/i/e;->k:C

    :goto_b
    const/16 v9, 0x20

    if-gt v7, v9, :cond_1b

    const/16 v9, 0x20

    if-eq v7, v9, :cond_1a

    const/16 v9, 0xa

    if-eq v7, v9, :cond_1a

    if-eq v7, v8, :cond_1a

    const/16 v9, 0x9

    if-eq v7, v9, :cond_1a

    const/16 v9, 0xc

    if-eq v7, v9, :cond_1a

    const/16 v9, 0x8

    if-ne v7, v9, :cond_1d

    goto :goto_c

    :cond_1a
    const/16 v9, 0x8

    :goto_c
    invoke-virtual {v3}, Lc/a/a/i/e;->q()C

    iget-char v7, v3, Lc/a/a/i/e;->k:C

    goto :goto_b

    :cond_1b
    const/16 v9, 0x8

    goto :goto_d

    :cond_1c
    const/16 v9, 0x8

    iget-char v7, v3, Lc/a/a/i/e;->k:C

    :cond_1d
    :goto_d
    const/4 v5, 0x0

    iput v5, v3, Lc/a/a/i/e;->o:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v5, "@type"

    if-ne v6, v5, :cond_30

    :try_start_5
    sget-object v9, Lc/a/a/i/d;->q:Lc/a/a/i/d;

    invoke-virtual {v3, v9}, Lc/a/a/i/e;->m(Lc/a/a/i/d;)Z

    move-result v9

    if-nez v9, :cond_30

    iget-object v6, v1, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    const/16 v7, 0x22

    invoke-virtual {v3, v6, v7}, Lc/a/a/i/e;->U(Lc/a/a/i/o;C)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    :goto_e
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v7, v9, :cond_20

    invoke-virtual {v6, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0x30

    if-lt v9, v10, :cond_1f

    const/16 v10, 0x39

    if-le v9, v10, :cond_1e

    goto :goto_f

    :cond_1e
    add-int/lit8 v7, v7, 0x1

    goto :goto_e

    :cond_1f
    :goto_f
    const/4 v7, 0x0

    goto :goto_10

    :cond_20
    const/4 v7, 0x1

    :goto_10
    if-nez v7, :cond_21

    iget-object v7, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    iget v9, v3, Lc/a/a/i/e;->j:I

    const/4 v10, 0x0

    invoke-virtual {v7, v6, v10, v9}, Lc/a/a/i/m;->a(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;

    move-result-object v7

    goto :goto_11

    :cond_21
    const/4 v10, 0x0

    move-object v7, v10

    :goto_11
    if-nez v7, :cond_22

    invoke-interface {v0, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x8

    const/16 v7, 0xc

    const/16 v8, 0x10

    goto/16 :goto_3

    :cond_22
    const/16 v4, 0x10

    invoke-virtual {v3, v4}, Lc/a/a/i/e;->t(I)V

    iget v5, v3, Lc/a/a/i/e;->h:I

    if-ne v5, v8, :cond_2a

    invoke-virtual {v3, v4}, Lc/a/a/i/e;->t(I)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    iget-object v2, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v2, v7}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v2

    instance-of v3, v2, Lc/a/a/i/g;

    if-eqz v3, :cond_24

    check-cast v2, Lc/a/a/i/g;

    invoke-virtual {v2, v1, v7}, Lc/a/a/i/g;->a(Lc/a/a/i/b;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_23
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    instance-of v8, v5, Ljava/lang/String;

    if-eqz v8, :cond_23

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v2, v5}, Lc/a/a/i/g;->f(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object v5

    if-eqz v5, :cond_23

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v5, v3, v4}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_12

    :cond_24
    move-object v3, v10

    :cond_25
    if-nez v3, :cond_28

    const-class v0, Ljava/lang/Cloneable;

    if-ne v7, v0, :cond_26

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    goto :goto_13

    :cond_26
    const-string v0, "java.util.Collections$EmptyMap"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    goto :goto_13

    :cond_27
    invoke-virtual {v7}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :cond_28
    :goto_13
    if-nez v13, :cond_29

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_29
    return-object v3

    :catch_1
    move-exception v0

    :try_start_7
    new-instance v2, Lc/a/a/d;

    const-string v3, "create instance error"

    invoke-direct {v2, v3, v0}, Lc/a/a/d;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_2a
    const/4 v3, 0x2

    iput v3, v1, Lc/a/a/i/b;->k:I

    iget-object v3, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    if-eqz v3, :cond_2b

    instance-of v3, v2, Ljava/lang/Integer;

    if-nez v3, :cond_2b

    invoke-virtual/range {p0 .. p0}, Lc/a/a/i/b;->w()V

    :cond_2b
    invoke-interface/range {p1 .. p1}, Ljava/util/Map;->size()I

    move-result v3

    if-lez v3, :cond_2d

    iget-object v2, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-static {v0, v7, v2}, Lc/a/a/k/d;->b(Ljava/lang/Object;Ljava/lang/Class;Lc/a/a/i/m;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v0}, Lc/a/a/i/b;->u(Ljava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-nez v13, :cond_2c

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_2c
    return-object v0

    :cond_2d
    :try_start_8
    iget-object v0, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v0, v7}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v0

    invoke-interface {v0, v1, v7, v2}, Lc/a/a/i/q/f;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v0, v0, Lc/a/a/i/k;

    if-eqz v0, :cond_2e

    const/4 v0, 0x0

    iput v0, v1, Lc/a/a/i/b;->k:I
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :cond_2e
    if-nez v13, :cond_2f

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_2f
    return-object v2

    :cond_30
    const/4 v5, 0x0

    :try_start_9
    const-string v9, "$ref"

    const/4 v5, 0x4

    if-ne v6, v9, :cond_3d

    if-eqz v14, :cond_3d

    sget-object v9, Lc/a/a/i/d;->q:Lc/a/a/i/d;

    invoke-virtual {v3, v9}, Lc/a/a/i/e;->m(Lc/a/a/i/d;)Z

    move-result v9

    if-nez v9, :cond_3d

    invoke-virtual {v3, v5}, Lc/a/a/i/e;->t(I)V

    iget v0, v3, Lc/a/a/i/e;->h:I

    if-ne v0, v5, :cond_3c

    invoke-virtual {v3}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v8}, Lc/a/a/i/e;->t(I)V

    const-string v2, "@"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_32

    iget-object v0, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iget-object v2, v0, Lc/a/a/i/l;->a:Ljava/lang/Object;

    instance-of v4, v2, [Ljava/lang/Object;

    if-nez v4, :cond_33

    instance-of v4, v2, Ljava/util/Collection;

    if-eqz v4, :cond_31

    goto :goto_14

    :cond_31
    iget-object v0, v0, Lc/a/a/i/l;->b:Lc/a/a/i/l;

    if-eqz v0, :cond_39

    iget-object v6, v0, Lc/a/a/i/l;->a:Ljava/lang/Object;

    goto :goto_18

    :cond_32
    const-string v2, ".."

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    iget-object v2, v14, Lc/a/a/i/l;->a:Ljava/lang/Object;

    if-eqz v2, :cond_34

    :cond_33
    :goto_14
    move-object v6, v2

    goto :goto_18

    :cond_34
    new-instance v2, Lc/a/a/i/b$a;

    invoke-direct {v2, v14, v0}, Lc/a/a/i/b$a;-><init>(Lc/a/a/i/l;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lc/a/a/i/b;->b(Lc/a/a/i/b$a;)V

    const/4 v0, 0x1

    :goto_15
    iput v0, v1, Lc/a/a/i/b;->k:I

    goto :goto_17

    :cond_35
    const-string v2, "$"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_38

    move-object v2, v14

    :goto_16
    iget-object v4, v2, Lc/a/a/i/l;->b:Lc/a/a/i/l;

    if-eqz v4, :cond_36

    move-object v2, v4

    goto :goto_16

    :cond_36
    iget-object v4, v2, Lc/a/a/i/l;->a:Ljava/lang/Object;

    if-eqz v4, :cond_37

    move-object v6, v4

    goto :goto_18

    :cond_37
    new-instance v4, Lc/a/a/i/b$a;

    invoke-direct {v4, v2, v0}, Lc/a/a/i/b$a;-><init>(Lc/a/a/i/l;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Lc/a/a/i/b;->b(Lc/a/a/i/b$a;)V

    const/4 v0, 0x1

    goto :goto_15

    :cond_38
    new-instance v2, Lc/a/a/i/b$a;

    invoke-direct {v2, v14, v0}, Lc/a/a/i/b$a;-><init>(Lc/a/a/i/l;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lc/a/a/i/b;->b(Lc/a/a/i/b$a;)V

    const/4 v0, 0x1

    goto :goto_15

    :cond_39
    :goto_17
    const/4 v6, 0x0

    :goto_18
    iget v0, v3, Lc/a/a/i/e;->h:I

    if-ne v0, v8, :cond_3b

    const/16 v0, 0x10

    invoke-virtual {v3, v0}, Lc/a/a/i/e;->t(I)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    if-nez v13, :cond_3a

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_3a
    return-object v6

    :cond_3b
    :try_start_a
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3c
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "illegal ref, "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, v3, Lc/a/a/i/e;->h:I

    invoke-static {v3}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3d
    if-nez v13, :cond_3f

    if-nez v15, :cond_3f

    iget-object v9, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    invoke-virtual {v1, v9, v0, v2}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;

    move-result-object v9

    if-nez v14, :cond_3e

    move-object v14, v9

    :cond_3e
    const/16 v9, 0x22

    const/4 v15, 0x1

    goto :goto_19

    :cond_3f
    const/16 v9, 0x22

    :goto_19
    if-ne v7, v9, :cond_43

    invoke-virtual {v3, v9}, Lc/a/a/i/e;->S(C)Ljava/lang/String;

    move-result-object v5

    if-eqz v12, :cond_41

    new-instance v7, Lc/a/a/i/e;

    invoke-direct {v7, v5}, Lc/a/a/i/e;-><init>(Ljava/lang/String;)V

    const/4 v9, 0x1

    invoke-virtual {v7, v9}, Lc/a/a/i/e;->L(Z)Z

    move-result v16

    if-eqz v16, :cond_40

    iget-object v5, v7, Lc/a/a/i/e;->v:Ljava/util/Calendar;

    invoke-virtual {v5}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    :cond_40
    invoke-virtual {v7}, Lc/a/a/i/e;->e()V

    :cond_41
    if-eqz v4, :cond_42

    goto :goto_1a

    :cond_42
    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1b

    :cond_43
    const/16 v9, 0x30

    if-lt v7, v9, :cond_44

    const/16 v9, 0x39

    if-le v7, v9, :cond_45

    :cond_44
    const/16 v9, 0x2d

    if-ne v7, v9, :cond_46

    :cond_45
    invoke-virtual {v3}, Lc/a/a/i/e;->Q()Ljava/lang/Number;

    move-result-object v5

    :goto_1a
    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1b
    move/from16 v17, v11

    goto/16 :goto_27

    :cond_46
    const/16 v9, 0x5b

    if-ne v7, v9, :cond_4e

    const/16 v5, 0xe

    iput v5, v3, Lc/a/a/i/e;->h:I

    iget v5, v3, Lc/a/a/i/e;->l:I

    const/4 v7, 0x1

    add-int/2addr v5, v7

    iput v5, v3, Lc/a/a/i/e;->l:I

    iget v7, v3, Lc/a/a/i/e;->y:I

    if-lt v5, v7, :cond_47

    const/16 v5, 0x1a

    goto :goto_1c

    :cond_47
    iget-object v7, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_1c
    iput-char v5, v3, Lc/a/a/i/e;->k:C

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    if-eqz v2, :cond_48

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-class v9, Ljava/lang/Integer;

    if-ne v7, v9, :cond_48

    const/4 v7, 0x1

    goto :goto_1d

    :cond_48
    const/4 v7, 0x0

    :goto_1d
    if-nez v7, :cond_49

    invoke-virtual {v1, v14}, Lc/a/a/i/b;->y(Lc/a/a/i/l;)V

    :cond_49
    invoke-virtual {v1, v5, v6}, Lc/a/a/i/b;->o(Ljava/util/Collection;Ljava/lang/Object;)V

    new-instance v7, Lc/a/a/b;

    invoke-direct {v7, v5}, Lc/a/a/b;-><init>(Ljava/util/List;)V

    if-eqz v4, :cond_4a

    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1e

    :cond_4a
    invoke-interface {v0, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1e
    iget v5, v3, Lc/a/a/i/e;->h:I

    if-ne v5, v8, :cond_4c

    const/16 v6, 0x10

    invoke-virtual {v3, v6}, Lc/a/a/i/e;->t(I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    if-nez v13, :cond_4b

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_4b
    return-object v0

    :cond_4c
    const/16 v6, 0x10

    if-ne v5, v6, :cond_4d

    move v8, v6

    move/from16 v17, v11

    :goto_1f
    const/4 v5, 0x0

    const/4 v7, 0x1

    goto/16 :goto_2f

    :cond_4d
    :try_start_b
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4e
    const/16 v9, 0x7b

    if-ne v7, v9, :cond_5e

    iget v5, v3, Lc/a/a/i/e;->l:I

    const/4 v7, 0x1

    add-int/2addr v5, v7

    iput v5, v3, Lc/a/a/i/e;->l:I

    iget v7, v3, Lc/a/a/i/e;->y:I

    if-lt v5, v7, :cond_4f

    const/16 v5, 0x1a

    goto :goto_20

    :cond_4f
    iget-object v7, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_20
    iput-char v5, v3, Lc/a/a/i/e;->k:C

    const/16 v9, 0xc

    iput v9, v3, Lc/a/a/i/e;->h:I

    instance-of v5, v2, Ljava/lang/Integer;

    iget v7, v3, Lc/a/a/i/e;->j:I

    sget-object v9, Lc/a/a/i/d;->p:Lc/a/a/i/d;

    iget v9, v9, Lc/a/a/i/d;->u:I

    and-int/2addr v7, v9

    if-eqz v7, :cond_50

    new-instance v7, Lc/a/a/e;

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-direct {v7, v9}, Lc/a/a/e;-><init>(Ljava/util/Map;)V

    goto :goto_21

    :cond_50
    new-instance v7, Lc/a/a/e;

    invoke-direct {v7}, Lc/a/a/e;-><init>()V

    :goto_21
    if-nez v13, :cond_51

    if-nez v5, :cond_51

    invoke-virtual {v1, v14, v7, v6}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;

    move-result-object v9

    goto :goto_22

    :cond_51
    const/4 v9, 0x0

    :goto_22
    iget-object v8, v1, Lc/a/a/i/b;->n:Lc/a/a/i/q/e;

    if-eqz v8, :cond_53

    if-eqz v6, :cond_52

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    move/from16 v17, v11

    goto :goto_23

    :cond_52
    move/from16 v17, v11

    const/4 v8, 0x0

    :goto_23
    iget-object v11, v1, Lc/a/a/i/b;->n:Lc/a/a/i/q/e;

    invoke-interface {v11, v0, v8}, Lc/a/a/i/q/e;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/reflect/Type;

    move-result-object v8

    if-eqz v8, :cond_54

    iget-object v11, v1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v11, v8}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v11

    invoke-interface {v11, v1, v8, v6}, Lc/a/a/i/q/f;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    const/4 v11, 0x1

    goto :goto_24

    :cond_53
    move/from16 v17, v11

    :cond_54
    const/4 v8, 0x0

    const/4 v11, 0x0

    :goto_24
    if-nez v11, :cond_55

    invoke-virtual {v1, v7, v6}, Lc/a/a/i/b;->t(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    :cond_55
    if-eqz v9, :cond_56

    if-eq v7, v8, :cond_56

    iput-object v0, v9, Lc/a/a/i/l;->a:Ljava/lang/Object;

    :cond_56
    iget v7, v1, Lc/a/a/i/b;->k:I

    const/4 v9, 0x1

    if-ne v7, v9, :cond_57

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v0, v7}, Lc/a/a/i/b;->d(Ljava/util/Map;Ljava/lang/Object;)V

    :cond_57
    if-eqz v4, :cond_58

    invoke-interface {v4, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_25

    :cond_58
    invoke-interface {v0, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_25
    if-eqz v5, :cond_59

    invoke-virtual {v1, v14, v8, v6}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;

    :cond_59
    iget v5, v3, Lc/a/a/i/e;->h:I

    const/16 v6, 0xd

    if-ne v5, v6, :cond_5c

    const/16 v6, 0x10

    invoke-virtual {v3, v6}, Lc/a/a/i/e;->t(I)V

    if-nez v13, :cond_5a

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :cond_5a
    if-nez v13, :cond_5b

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_5b
    return-object v0

    :cond_5c
    const/16 v6, 0x10

    if-ne v5, v6, :cond_5d

    move v8, v6

    goto/16 :goto_1f

    :cond_5d
    :try_start_c
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5e
    move/from16 v17, v11

    const/16 v8, 0x74

    if-ne v7, v8, :cond_5f

    iget-object v5, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    const-string v7, "true"

    iget v8, v3, Lc/a/a/i/e;->l:I

    invoke-virtual {v5, v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_60

    iget v5, v3, Lc/a/a/i/e;->l:I

    add-int/lit8 v5, v5, 0x3

    iput v5, v3, Lc/a/a/i/e;->l:I

    invoke-virtual {v3}, Lc/a/a/i/e;->q()C

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_26
    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_27

    :cond_5f
    const/16 v8, 0x66

    if-ne v7, v8, :cond_6e

    iget-object v7, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    const-string v8, "false"

    iget v9, v3, Lc/a/a/i/e;->l:I

    invoke-virtual {v7, v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_60

    iget v7, v3, Lc/a/a/i/e;->l:I

    add-int/2addr v7, v5

    iput v7, v3, Lc/a/a/i/e;->l:I

    invoke-virtual {v3}, Lc/a/a/i/e;->q()C

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_26

    :cond_60
    :goto_27
    iget-char v5, v3, Lc/a/a/i/e;->k:C

    const/16 v6, 0x2c

    if-eq v5, v6, :cond_61

    const/16 v6, 0x7d

    if-eq v5, v6, :cond_61

    invoke-virtual {v3}, Lc/a/a/i/e;->a0()V

    iget-char v5, v3, Lc/a/a/i/e;->k:C

    :cond_61
    const/16 v6, 0x2c

    if-ne v5, v6, :cond_63

    iget v5, v3, Lc/a/a/i/e;->l:I

    const/4 v6, 0x1

    add-int/2addr v5, v6

    iput v5, v3, Lc/a/a/i/e;->l:I

    iget v6, v3, Lc/a/a/i/e;->y:I

    if-lt v5, v6, :cond_62

    const/16 v5, 0x1a

    goto :goto_28

    :cond_62
    iget-object v6, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_28
    iput-char v5, v3, Lc/a/a/i/e;->k:C

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/16 v8, 0x10

    goto/16 :goto_2f

    :cond_63
    const/16 v4, 0x7d

    if-ne v5, v4, :cond_6d

    iget v4, v3, Lc/a/a/i/e;->l:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v3, Lc/a/a/i/e;->l:I

    iget v5, v3, Lc/a/a/i/e;->y:I

    if-lt v4, v5, :cond_64

    const/16 v4, 0x1a

    goto :goto_29

    :cond_64
    iget-object v5, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    :goto_29
    iput-char v4, v3, Lc/a/a/i/e;->k:C

    const/4 v5, 0x0

    iput v5, v3, Lc/a/a/i/e;->o:I

    const/16 v5, 0x2c

    if-ne v4, v5, :cond_66

    iget v4, v3, Lc/a/a/i/e;->l:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v3, Lc/a/a/i/e;->l:I

    iget v5, v3, Lc/a/a/i/e;->y:I

    if-lt v4, v5, :cond_65

    const/16 v5, 0x1a

    goto :goto_2a

    :cond_65
    iget-object v5, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_2a
    iput-char v5, v3, Lc/a/a/i/e;->k:C

    const/16 v4, 0x10

    :goto_2b
    iput v4, v3, Lc/a/a/i/e;->h:I

    goto :goto_2e

    :cond_66
    const/16 v5, 0x7d

    if-ne v4, v5, :cond_68

    iget v4, v3, Lc/a/a/i/e;->l:I

    const/4 v5, 0x1

    add-int/2addr v4, v5

    iput v4, v3, Lc/a/a/i/e;->l:I

    iget v5, v3, Lc/a/a/i/e;->y:I

    if-lt v4, v5, :cond_67

    const/16 v5, 0x1a

    goto :goto_2c

    :cond_67
    iget-object v5, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_2c
    iput-char v5, v3, Lc/a/a/i/e;->k:C

    const/16 v4, 0xd

    goto :goto_2b

    :cond_68
    const/16 v5, 0x5d

    if-ne v4, v5, :cond_6a

    iget v4, v3, Lc/a/a/i/e;->l:I

    const/4 v7, 0x1

    add-int/2addr v4, v7

    iput v4, v3, Lc/a/a/i/e;->l:I

    iget v5, v3, Lc/a/a/i/e;->y:I

    if-lt v4, v5, :cond_69

    const/16 v5, 0x1a

    goto :goto_2d

    :cond_69
    iget-object v5, v3, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v5, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_2d
    iput-char v5, v3, Lc/a/a/i/e;->k:C

    const/16 v4, 0xf

    iput v4, v3, Lc/a/a/i/e;->h:I

    goto :goto_2e

    :cond_6a
    invoke-virtual {v3}, Lc/a/a/i/e;->s()V

    :goto_2e
    if-nez v13, :cond_6b

    iget-object v3, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    invoke-virtual {v1, v3, v0, v2}, Lc/a/a/i/b;->x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :cond_6b
    if-nez v13, :cond_6c

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_6c
    return-object v0

    :cond_6d
    :try_start_d
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6e
    const/4 v5, 0x0

    const/4 v7, 0x1

    invoke-virtual {v3}, Lc/a/a/i/e;->s()V

    invoke-virtual/range {p0 .. p0}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    const-class v11, Lc/a/a/e;

    if-ne v9, v11, :cond_6f

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    :cond_6f
    invoke-interface {v0, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v6, v3, Lc/a/a/i/e;->h:I

    const/16 v8, 0xd

    if-ne v6, v8, :cond_71

    const/16 v8, 0x10

    invoke-virtual {v3, v8}, Lc/a/a/i/e;->t(I)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    if-nez v13, :cond_70

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_70
    return-object v0

    :cond_71
    const/16 v8, 0x10

    if-ne v6, v8, :cond_72

    :goto_2f
    move/from16 v11, v17

    const/16 v5, 0x8

    const/16 v7, 0xc

    goto/16 :goto_3

    :cond_72
    :try_start_e
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_73
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_74
    new-instance v0, Lc/a/a/d;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lc/a/a/i/e;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :catchall_0
    move-exception v0

    if-nez v13, :cond_75

    iput-object v14, v1, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    :cond_75
    throw v0
.end method

.method public u(Ljava/lang/Object;)V
    .locals 10

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v1, v0}, Lc/a/a/i/m;->d(Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v1

    instance-of v2, v1, Lc/a/a/i/g;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lc/a/a/i/g;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    iget-object v2, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v2, v2, Lc/a/a/i/e;->h:I

    const/16 v4, 0xc

    const/16 v5, 0x10

    if-eq v2, v4, :cond_2

    if-ne v2, v5, :cond_1

    goto :goto_1

    :cond_1
    new-instance p0, Lc/a/a/d;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "syntax error, expect {, actual "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_1
    iget-object v2, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-object v4, p0, Lc/a/a/i/b;->b:Lc/a/a/i/o;

    invoke-virtual {v2, v4}, Lc/a/a/i/e;->T(Lc/a/a/i/o;)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0xd

    if-nez v2, :cond_4

    iget-object v6, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v7, v6, Lc/a/a/i/e;->h:I

    if-ne v7, v4, :cond_3

    invoke-virtual {v6, v5}, Lc/a/a/i/e;->t(I)V

    return-void

    :cond_3
    if-ne v7, v5, :cond_4

    goto :goto_1

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1, v2}, Lc/a/a/i/g;->f(Ljava/lang/String;)Lc/a/a/i/q/d;

    move-result-object v6

    goto :goto_2

    :cond_5
    move-object v6, v3

    :goto_2
    const/16 v7, 0x3a

    if-nez v6, :cond_7

    iget-object v6, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v8, v6, Lc/a/a/i/e;->j:I

    sget-object v9, Lc/a/a/i/d;->j:Lc/a/a/i/d;

    iget v9, v9, Lc/a/a/i/d;->u:I

    and-int/2addr v8, v9

    if-eqz v8, :cond_6

    invoke-virtual {v6, v7}, Lc/a/a/i/e;->u(C)V

    invoke-virtual {p0}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    iget-object v2, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v6, v2, Lc/a/a/i/e;->h:I

    if-ne v6, v4, :cond_2

    invoke-virtual {v2}, Lc/a/a/i/e;->s()V

    return-void

    :cond_6
    new-instance p0, Lc/a/a/d;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setter not found, class "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", property "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    iget-object v2, v6, Lc/a/a/i/q/d;->a:Lc/a/a/k/a;

    iget-object v8, v2, Lc/a/a/k/a;->h:Ljava/lang/Class;

    iget-object v2, v2, Lc/a/a/k/a;->i:Ljava/lang/reflect/Type;

    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_8

    :goto_3
    iget-object v8, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v8, v7}, Lc/a/a/i/e;->u(C)V

    sget-object v7, Lc/a/a/j/k;->a:Lc/a/a/j/k;

    invoke-virtual {v7, p0, v2, v3}, Lc/a/a/j/k;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    goto :goto_4

    :cond_8
    const-class v9, Ljava/lang/String;

    if-ne v8, v9, :cond_9

    iget-object v2, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v2, v7}, Lc/a/a/i/e;->u(C)V

    invoke-virtual {p0}, Lc/a/a/i/b;->v()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_9
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    if-ne v8, v9, :cond_a

    goto :goto_3

    :cond_a
    iget-object v9, p0, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    invoke-virtual {v9, v8, v2}, Lc/a/a/i/m;->c(Ljava/lang/Class;Ljava/lang/reflect/Type;)Lc/a/a/i/q/f;

    move-result-object v8

    iget-object v9, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v9, v7}, Lc/a/a/i/e;->u(C)V

    invoke-interface {v8, p0, v2, v3}, Lc/a/a/i/q/f;->b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_4
    invoke-virtual {v6, p1, v2}, Lc/a/a/i/q/d;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v2, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v6, v2, Lc/a/a/i/e;->h:I

    if-ne v6, v5, :cond_b

    goto/16 :goto_1

    :cond_b
    if-ne v6, v4, :cond_2

    invoke-virtual {v2, v5}, Lc/a/a/i/e;->t(I)V

    return-void
.end method

.method public v()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget v1, v0, Lc/a/a/i/e;->h:I

    const/16 v2, 0x10

    const/4 v3, 0x4

    if-ne v1, v3, :cond_6

    invoke-virtual {v0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-char v3, v1, Lc/a/a/i/e;->k:C

    const/16 v4, 0x2c

    const/16 v5, 0x1a

    if-ne v3, v4, :cond_1

    iget v3, v1, Lc/a/a/i/e;->l:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v1, Lc/a/a/i/e;->l:I

    iget v4, v1, Lc/a/a/i/e;->y:I

    if-lt v3, v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, v1, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_0
    iput-char v5, v1, Lc/a/a/i/e;->k:C

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iput v2, p0, Lc/a/a/i/e;->h:I

    goto :goto_4

    :cond_1
    const/16 v2, 0x5d

    if-ne v3, v2, :cond_3

    iget v2, v1, Lc/a/a/i/e;->l:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lc/a/a/i/e;->l:I

    iget v3, v1, Lc/a/a/i/e;->y:I

    if-lt v2, v3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, v1, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_1
    iput-char v5, v1, Lc/a/a/i/e;->k:C

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    const/16 v1, 0xf

    :goto_2
    iput v1, p0, Lc/a/a/i/e;->h:I

    goto :goto_4

    :cond_3
    const/16 v2, 0x7d

    if-ne v3, v2, :cond_5

    iget v2, v1, Lc/a/a/i/e;->l:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lc/a/a/i/e;->l:I

    iget v3, v1, Lc/a/a/i/e;->y:I

    if-lt v2, v3, :cond_4

    goto :goto_3

    :cond_4
    iget-object v3, v1, Lc/a/a/i/e;->x:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    :goto_3
    iput-char v5, v1, Lc/a/a/i/e;->k:C

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    const/16 v1, 0xd

    goto :goto_2

    :cond_5
    invoke-virtual {v1}, Lc/a/a/i/e;->s()V

    :goto_4
    return-object v0

    :cond_6
    const/4 v3, 0x2

    if-ne v1, v3, :cond_7

    invoke-virtual {v0}, Lc/a/a/i/e;->v()Ljava/lang/String;

    move-result-object v0

    iget-object p0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {p0, v2}, Lc/a/a/i/e;->t(I)V

    return-object v0

    :cond_7
    invoke-virtual {p0}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_8

    const/4 p0, 0x0

    return-object p0

    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method protected w()V
    .locals 4

    iget-object v0, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iget-object v0, v0, Lc/a/a/i/l;->b:Lc/a/a/i/l;

    iput-object v0, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iget-object v0, p0, Lc/a/a/i/b;->h:[Lc/a/a/i/l;

    iget v1, p0, Lc/a/a/i/b;->i:I

    add-int/lit8 v2, v1, -0x1

    const/4 v3, 0x0

    aput-object v3, v0, v2

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Lc/a/a/i/b;->i:I

    return-void
.end method

.method protected x(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)Lc/a/a/i/l;
    .locals 2

    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-boolean v0, v0, Lc/a/a/i/e;->A:Z

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lc/a/a/i/l;

    invoke-direct {v0, p1, p2, p3}, Lc/a/a/i/l;-><init>(Lc/a/a/i/l;Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    iget p1, p0, Lc/a/a/i/b;->i:I

    add-int/lit8 p2, p1, 0x1

    iput p2, p0, Lc/a/a/i/b;->i:I

    iget-object p2, p0, Lc/a/a/i/b;->h:[Lc/a/a/i/l;

    if-nez p2, :cond_1

    const/16 p2, 0x8

    new-array p2, p2, [Lc/a/a/i/l;

    iput-object p2, p0, Lc/a/a/i/b;->h:[Lc/a/a/i/l;

    goto :goto_0

    :cond_1
    array-length p3, p2

    if-lt p1, p3, :cond_2

    array-length p3, p2

    mul-int/lit8 p3, p3, 0x3

    div-int/lit8 p3, p3, 0x2

    new-array p3, p3, [Lc/a/a/i/l;

    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {p2, v1, p3, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p3, p0, Lc/a/a/i/b;->h:[Lc/a/a/i/l;

    :cond_2
    :goto_0
    iget-object p2, p0, Lc/a/a/i/b;->h:[Lc/a/a/i/l;

    iget-object p0, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    aput-object p0, p2, p1

    return-object p0
.end method

.method public y(Lc/a/a/i/l;)V
    .locals 1

    iget-object v0, p0, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    iget-boolean v0, v0, Lc/a/a/i/e;->A:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lc/a/a/i/b;->g:Lc/a/a/i/l;

    return-void
.end method
