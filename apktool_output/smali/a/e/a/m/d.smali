.class public La/e/a/m/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/e/a/m/d$b;
    }
.end annotation


# instance fields
.field private a:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "La/e/a/m/d;",
            ">;"
        }
    .end annotation
.end field

.field private b:I

.field private c:Z

.field public final d:La/e/a/m/e;

.field public final e:La/e/a/m/d$b;

.field public f:La/e/a/m/d;

.field public g:I

.field h:I

.field i:La/e/a/i;


# direct methods
.method public constructor <init>(La/e/a/m/e;La/e/a/m/d$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, La/e/a/m/d;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, La/e/a/m/d;->g:I

    const/high16 v0, -0x80000000

    iput v0, p0, La/e/a/m/d;->h:I

    iput-object p1, p0, La/e/a/m/d;->d:La/e/a/m/e;

    iput-object p2, p0, La/e/a/m/d;->e:La/e/a/m/d$b;

    return-void
.end method


# virtual methods
.method public a(La/e/a/m/d;IIZ)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, La/e/a/m/d;->p()V

    return v0

    :cond_0
    if-nez p4, :cond_1

    invoke-virtual {p0, p1}, La/e/a/m/d;->o(La/e/a/m/d;)Z

    move-result p4

    if-nez p4, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    iput-object p1, p0, La/e/a/m/d;->f:La/e/a/m/d;

    iget-object p4, p1, La/e/a/m/d;->a:Ljava/util/HashSet;

    if-nez p4, :cond_2

    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p1, La/e/a/m/d;->a:Ljava/util/HashSet;

    :cond_2
    iget-object p1, p0, La/e/a/m/d;->f:La/e/a/m/d;

    iget-object p1, p1, La/e/a/m/d;->a:Ljava/util/HashSet;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    iput p2, p0, La/e/a/m/d;->g:I

    iput p3, p0, La/e/a/m/d;->h:I

    return v0
.end method

.method public b(ILjava/util/ArrayList;La/e/a/m/m/o;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "La/e/a/m/m/o;",
            ">;",
            "La/e/a/m/m/o;",
            ")V"
        }
    .end annotation

    iget-object p0, p0, La/e/a/m/d;->a:Ljava/util/HashSet;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/e/a/m/d;

    iget-object v0, v0, La/e/a/m/d;->d:La/e/a/m/e;

    invoke-static {v0, p1, p2, p3}, La/e/a/m/m/i;->a(La/e/a/m/e;ILjava/util/ArrayList;La/e/a/m/m/o;)La/e/a/m/m/o;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c()Ljava/util/HashSet;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "La/e/a/m/d;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, La/e/a/m/d;->a:Ljava/util/HashSet;

    return-object p0
.end method

.method public d()I
    .locals 1

    iget-boolean v0, p0, La/e/a/m/d;->c:Z

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget p0, p0, La/e/a/m/d;->b:I

    return p0
.end method

.method public e()I
    .locals 3

    iget-object v0, p0, La/e/a/m/d;->d:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->T()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    iget v0, p0, La/e/a/m/d;->h:I

    const/high16 v2, -0x80000000

    if-eq v0, v2, :cond_1

    iget-object v0, p0, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz v0, :cond_1

    iget-object v0, v0, La/e/a/m/d;->d:La/e/a/m/e;

    invoke-virtual {v0}, La/e/a/m/e;->T()I

    move-result v0

    if-ne v0, v1, :cond_1

    iget p0, p0, La/e/a/m/d;->h:I

    return p0

    :cond_1
    iget p0, p0, La/e/a/m/d;->g:I

    return p0
.end method

.method public final f()La/e/a/m/d;
    .locals 2

    sget-object v0, La/e/a/m/d$a;->a:[I

    iget-object v1, p0, La/e/a/m/d;->e:La/e/a/m/d$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/AssertionError;

    iget-object p0, p0, La/e/a/m/d;->e:La/e/a/m/d$b;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :pswitch_0
    iget-object p0, p0, La/e/a/m/d;->d:La/e/a/m/e;

    iget-object p0, p0, La/e/a/m/e;->Q:La/e/a/m/d;

    return-object p0

    :pswitch_1
    iget-object p0, p0, La/e/a/m/d;->d:La/e/a/m/e;

    iget-object p0, p0, La/e/a/m/e;->S:La/e/a/m/d;

    return-object p0

    :pswitch_2
    iget-object p0, p0, La/e/a/m/d;->d:La/e/a/m/e;

    iget-object p0, p0, La/e/a/m/e;->P:La/e/a/m/d;

    return-object p0

    :pswitch_3
    iget-object p0, p0, La/e/a/m/d;->d:La/e/a/m/e;

    iget-object p0, p0, La/e/a/m/e;->R:La/e/a/m/d;

    return-object p0

    :pswitch_4
    const/4 p0, 0x0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public g()La/e/a/m/e;
    .locals 0

    iget-object p0, p0, La/e/a/m/d;->d:La/e/a/m/e;

    return-object p0
.end method

.method public h()La/e/a/i;
    .locals 0

    iget-object p0, p0, La/e/a/m/d;->i:La/e/a/i;

    return-object p0
.end method

.method public i()La/e/a/m/d;
    .locals 0

    iget-object p0, p0, La/e/a/m/d;->f:La/e/a/m/d;

    return-object p0
.end method

.method public j()La/e/a/m/d$b;
    .locals 0

    iget-object p0, p0, La/e/a/m/d;->e:La/e/a/m/d$b;

    return-object p0
.end method

.method public k()Z
    .locals 2

    iget-object p0, p0, La/e/a/m/d;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/e/a/m/d;

    invoke-virtual {v1}, La/e/a/m/d;->f()La/e/a/m/d;

    move-result-object v1

    invoke-virtual {v1}, La/e/a/m/d;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0
.end method

.method public l()Z
    .locals 1

    iget-object p0, p0, La/e/a/m/d;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/HashSet;->size()I

    move-result p0

    if-lez p0, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public m()Z
    .locals 0

    iget-boolean p0, p0, La/e/a/m/d;->c:Z

    return p0
.end method

.method public n()Z
    .locals 0

    iget-object p0, p0, La/e/a/m/d;->f:La/e/a/m/d;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public o(La/e/a/m/d;)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, La/e/a/m/d;->j()La/e/a/m/d$b;

    move-result-object v1

    iget-object v2, p0, La/e/a/m/d;->e:La/e/a/m/d$b;

    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    sget-object v1, La/e/a/m/d$b;->g:La/e/a/m/d$b;

    if-ne v2, v1, :cond_2

    invoke-virtual {p1}, La/e/a/m/d;->g()La/e/a/m/e;

    move-result-object p1

    invoke-virtual {p1}, La/e/a/m/e;->X()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, La/e/a/m/d;->g()La/e/a/m/e;

    move-result-object p0

    invoke-virtual {p0}, La/e/a/m/e;->X()Z

    move-result p0

    if-nez p0, :cond_2

    :cond_1
    return v0

    :cond_2
    return v3

    :cond_3
    sget-object v4, La/e/a/m/d$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v4, v2

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    iget-object p0, p0, La/e/a/m/d;->e:La/e/a/m/d$b;

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    return v0

    :pswitch_1
    sget-object p0, La/e/a/m/d$b;->c:La/e/a/m/d$b;

    if-eq v1, p0, :cond_5

    sget-object p0, La/e/a/m/d$b;->e:La/e/a/m/d$b;

    if-ne v1, p0, :cond_4

    goto :goto_0

    :cond_4
    return v3

    :cond_5
    :goto_0
    return v0

    :pswitch_2
    sget-object p0, La/e/a/m/d$b;->d:La/e/a/m/d$b;

    if-eq v1, p0, :cond_7

    sget-object p0, La/e/a/m/d$b;->f:La/e/a/m/d$b;

    if-ne v1, p0, :cond_6

    goto :goto_1

    :cond_6
    move p0, v0

    goto :goto_2

    :cond_7
    :goto_1
    move p0, v3

    :goto_2
    invoke-virtual {p1}, La/e/a/m/d;->g()La/e/a/m/e;

    move-result-object p1

    instance-of p1, p1, La/e/a/m/g;

    if-eqz p1, :cond_a

    if-nez p0, :cond_8

    sget-object p0, La/e/a/m/d$b;->j:La/e/a/m/d$b;

    if-ne v1, p0, :cond_9

    :cond_8
    move v0, v3

    :cond_9
    move p0, v0

    :cond_a
    return p0

    :pswitch_3
    sget-object p0, La/e/a/m/d$b;->c:La/e/a/m/d$b;

    if-eq v1, p0, :cond_c

    sget-object p0, La/e/a/m/d$b;->e:La/e/a/m/d$b;

    if-ne v1, p0, :cond_b

    goto :goto_3

    :cond_b
    move p0, v0

    goto :goto_4

    :cond_c
    :goto_3
    move p0, v3

    :goto_4
    invoke-virtual {p1}, La/e/a/m/d;->g()La/e/a/m/e;

    move-result-object p1

    instance-of p1, p1, La/e/a/m/g;

    if-eqz p1, :cond_f

    if-nez p0, :cond_d

    sget-object p0, La/e/a/m/d$b;->i:La/e/a/m/d$b;

    if-ne v1, p0, :cond_e

    :cond_d
    move v0, v3

    :cond_e
    move p0, v0

    :cond_f
    return p0

    :pswitch_4
    sget-object p0, La/e/a/m/d$b;->g:La/e/a/m/d$b;

    if-eq v1, p0, :cond_10

    sget-object p0, La/e/a/m/d$b;->i:La/e/a/m/d$b;

    if-eq v1, p0, :cond_10

    sget-object p0, La/e/a/m/d$b;->j:La/e/a/m/d$b;

    if-eq v1, p0, :cond_10

    move v0, v3

    :cond_10
    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public p()V
    .locals 2

    iget-object v0, p0, La/e/a/m/d;->f:La/e/a/m/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, La/e/a/m/d;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, La/e/a/m/d;->f:La/e/a/m/d;

    iget-object v0, v0, La/e/a/m/d;->a:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, La/e/a/m/d;->f:La/e/a/m/d;

    iput-object v1, v0, La/e/a/m/d;->a:Ljava/util/HashSet;

    :cond_0
    iput-object v1, p0, La/e/a/m/d;->a:Ljava/util/HashSet;

    iput-object v1, p0, La/e/a/m/d;->f:La/e/a/m/d;

    const/4 v0, 0x0

    iput v0, p0, La/e/a/m/d;->g:I

    const/high16 v1, -0x80000000

    iput v1, p0, La/e/a/m/d;->h:I

    iput-boolean v0, p0, La/e/a/m/d;->c:Z

    iput v0, p0, La/e/a/m/d;->b:I

    return-void
.end method

.method public q()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, La/e/a/m/d;->c:Z

    iput v0, p0, La/e/a/m/d;->b:I

    return-void
.end method

.method public r(La/e/a/c;)V
    .locals 2

    iget-object p1, p0, La/e/a/m/d;->i:La/e/a/i;

    if-nez p1, :cond_0

    new-instance p1, La/e/a/i;

    sget-object v0, La/e/a/i$a;->b:La/e/a/i$a;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, La/e/a/i;-><init>(La/e/a/i$a;Ljava/lang/String;)V

    iput-object p1, p0, La/e/a/m/d;->i:La/e/a/i;

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, La/e/a/i;->e()V

    :goto_0
    return-void
.end method

.method public s(I)V
    .locals 0

    iput p1, p0, La/e/a/m/d;->b:I

    const/4 p1, 0x1

    iput-boolean p1, p0, La/e/a/m/d;->c:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, La/e/a/m/d;->d:La/e/a/m/e;

    invoke-virtual {v1}, La/e/a/m/e;->r()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, La/e/a/m/d;->e:La/e/a/m/d$b;

    invoke-virtual {p0}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
