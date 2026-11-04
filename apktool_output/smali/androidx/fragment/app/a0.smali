.class Landroidx/fragment/app/a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/savedstate/c;
.implements Landroidx/lifecycle/s;


# instance fields
.field private final b:Landroidx/fragment/app/Fragment;

.field private final c:Landroidx/lifecycle/r;

.field private d:Landroidx/lifecycle/h;

.field private e:Landroidx/savedstate/b;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/r;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/a0;->d:Landroidx/lifecycle/h;

    iput-object v0, p0, Landroidx/fragment/app/a0;->e:Landroidx/savedstate/b;

    iput-object p1, p0, Landroidx/fragment/app/a0;->b:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/a0;->c:Landroidx/lifecycle/r;

    return-void
.end method


# virtual methods
.method public a()Landroidx/lifecycle/d;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e()V

    iget-object p0, p0, Landroidx/fragment/app/a0;->d:Landroidx/lifecycle/h;

    return-object p0
.end method

.method public c()Landroidx/savedstate/SavedStateRegistry;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e()V

    iget-object p0, p0, Landroidx/fragment/app/a0;->e:Landroidx/savedstate/b;

    invoke-virtual {p0}, Landroidx/savedstate/b;->b()Landroidx/savedstate/SavedStateRegistry;

    move-result-object p0

    return-object p0
.end method

.method d(Landroidx/lifecycle/d$b;)V
    .locals 0

    iget-object p0, p0, Landroidx/fragment/app/a0;->d:Landroidx/lifecycle/h;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/h;->h(Landroidx/lifecycle/d$b;)V

    return-void
.end method

.method e()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->d:Landroidx/lifecycle/h;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/h;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h;-><init>(Landroidx/lifecycle/g;)V

    iput-object v0, p0, Landroidx/fragment/app/a0;->d:Landroidx/lifecycle/h;

    invoke-static {p0}, Landroidx/savedstate/b;->a(Landroidx/savedstate/c;)Landroidx/savedstate/b;

    move-result-object v0

    iput-object v0, p0, Landroidx/fragment/app/a0;->e:Landroidx/savedstate/b;

    :cond_0
    return-void
.end method

.method f()Z
    .locals 0

    iget-object p0, p0, Landroidx/fragment/app/a0;->d:Landroidx/lifecycle/h;

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method g(Landroid/os/Bundle;)V
    .locals 0

    iget-object p0, p0, Landroidx/fragment/app/a0;->e:Landroidx/savedstate/b;

    invoke-virtual {p0, p1}, Landroidx/savedstate/b;->c(Landroid/os/Bundle;)V

    return-void
.end method

.method public h()Landroidx/lifecycle/r;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/a0;->e()V

    iget-object p0, p0, Landroidx/fragment/app/a0;->c:Landroidx/lifecycle/r;

    return-object p0
.end method

.method i(Landroid/os/Bundle;)V
    .locals 0

    iget-object p0, p0, Landroidx/fragment/app/a0;->e:Landroidx/savedstate/b;

    invoke-virtual {p0, p1}, Landroidx/savedstate/b;->d(Landroid/os/Bundle;)V

    return-void
.end method

.method j(Landroidx/lifecycle/d$c;)V
    .locals 0

    iget-object p0, p0, Landroidx/fragment/app/a0;->d:Landroidx/lifecycle/h;

    invoke-virtual {p0, p1}, Landroidx/lifecycle/h;->o(Landroidx/lifecycle/d$c;)V

    return-void
.end method
