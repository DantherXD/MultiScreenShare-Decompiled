.class public Lcom/bumptech/glide/o/o;
.super Landroidx/fragment/app/Fragment;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/o/o$a;
    }
.end annotation


# instance fields
.field private final c0:Lcom/bumptech/glide/o/a;

.field private final d0:Lcom/bumptech/glide/o/m;

.field private final e0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/bumptech/glide/o/o;",
            ">;"
        }
    .end annotation
.end field

.field private f0:Lcom/bumptech/glide/o/o;

.field private g0:Lcom/bumptech/glide/k;

.field private h0:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/bumptech/glide/o/a;

    invoke-direct {v0}, Lcom/bumptech/glide/o/a;-><init>()V

    invoke-direct {p0, v0}, Lcom/bumptech/glide/o/o;-><init>(Lcom/bumptech/glide/o/a;)V

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/o/a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Lcom/bumptech/glide/o/o$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/o/o$a;-><init>(Lcom/bumptech/glide/o/o;)V

    iput-object v0, p0, Lcom/bumptech/glide/o/o;->d0:Lcom/bumptech/glide/o/m;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/o/o;->e0:Ljava/util/Set;

    iput-object p1, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/a;

    return-void
.end method

.method private C1(Lcom/bumptech/glide/o/o;)V
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/o/o;->e0:Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private F1()Landroidx/fragment/app/Fragment;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/o/o;->h0:Landroidx/fragment/app/Fragment;

    :goto_0
    return-object v0
.end method

.method private static I1(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;
    .locals 1

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroidx/fragment/app/Fragment;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->y()Landroidx/fragment/app/n;

    move-result-object p0

    return-object p0
.end method

.method private J1(Landroidx/fragment/app/Fragment;)Z
    .locals 1

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->F1()Landroidx/fragment/app/Fragment;

    move-result-object p0

    :goto_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->D()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->D()Landroidx/fragment/app/Fragment;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private K1(Landroid/content/Context;Landroidx/fragment/app/n;)V
    .locals 1

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->O1()V

    invoke-static {p1}, Lcom/bumptech/glide/c;->c(Landroid/content/Context;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->k()Lcom/bumptech/glide/o/l;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/o/l;->j(Landroid/content/Context;Landroidx/fragment/app/n;)Lcom/bumptech/glide/o/o;

    move-result-object p1

    iput-object p1, p0, Lcom/bumptech/glide/o/o;->f0:Lcom/bumptech/glide/o/o;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/bumptech/glide/o/o;->f0:Lcom/bumptech/glide/o/o;

    invoke-direct {p1, p0}, Lcom/bumptech/glide/o/o;->C1(Lcom/bumptech/glide/o/o;)V

    :cond_0
    return-void
.end method

.method private L1(Lcom/bumptech/glide/o/o;)V
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/o/o;->e0:Ljava/util/Set;

    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private O1()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->f0:Lcom/bumptech/glide/o/o;

    if-eqz v0, :cond_0

    invoke-direct {v0, p0}, Lcom/bumptech/glide/o/o;->L1(Lcom/bumptech/glide/o/o;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/o/o;->f0:Lcom/bumptech/glide/o/o;

    :cond_0
    return-void
.end method


# virtual methods
.method D1()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/bumptech/glide/o/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->f0:Lcom/bumptech/glide/o/o;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p0, p0, Lcom/bumptech/glide/o/o;->e0:Ljava/util/Set;

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lcom/bumptech/glide/o/o;->f0:Lcom/bumptech/glide/o/o;

    invoke-virtual {v1}, Lcom/bumptech/glide/o/o;->D1()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bumptech/glide/o/o;

    invoke-direct {v2}, Lcom/bumptech/glide/o/o;->F1()Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/bumptech/glide/o/o;->J1(Landroidx/fragment/app/Fragment;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method E1()Lcom/bumptech/glide/o/a;
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/a;

    return-object p0
.end method

.method public G1()Lcom/bumptech/glide/k;
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/o/o;->g0:Lcom/bumptech/glide/k;

    return-object p0
.end method

.method public H1()Lcom/bumptech/glide/o/m;
    .locals 0

    iget-object p0, p0, Lcom/bumptech/glide/o/o;->d0:Lcom/bumptech/glide/o/m;

    return-object p0
.end method

.method public I0()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->I0()V

    iget-object p0, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/a;

    invoke-virtual {p0}, Lcom/bumptech/glide/o/a;->d()V

    return-void
.end method

.method public J0()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->J0()V

    iget-object p0, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/a;

    invoke-virtual {p0}, Lcom/bumptech/glide/o/a;->e()V

    return-void
.end method

.method M1(Landroidx/fragment/app/Fragment;)V
    .locals 1

    iput-object p1, p0, Lcom/bumptech/glide/o/o;->h0:Landroidx/fragment/app/Fragment;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->q()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/o/o;->I1(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->q()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/o/o;->K1(Landroid/content/Context;Landroidx/fragment/app/n;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public N1(Lcom/bumptech/glide/k;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/o/o;->g0:Lcom/bumptech/glide/k;

    return-void
.end method

.method public i0(Landroid/content/Context;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->i0(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/bumptech/glide/o/o;->I1(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;

    move-result-object p1

    const/4 v0, 0x5

    const-string v1, "SupportRMFragment"

    if-nez p1, :cond_1

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "Unable to register fragment with root, ancestor detached"

    invoke-static {v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p0, v2, p1}, Lcom/bumptech/glide/o/o;->K1(Landroid/content/Context;Landroidx/fragment/app/n;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "Unable to register fragment with root"

    invoke-static {v1, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_0
    return-void
.end method

.method public q0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->q0()V

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/a;->c()V

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->O1()V

    return-void
.end method

.method public t0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->t0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/o/o;->h0:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->O1()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->F1()Landroidx/fragment/app/Fragment;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
