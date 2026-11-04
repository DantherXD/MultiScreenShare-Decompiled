.class La/a/n/g$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/n/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field A:La/g/l/b;

.field private B:Ljava/lang/CharSequence;

.field private C:Ljava/lang/CharSequence;

.field private D:Landroid/content/res/ColorStateList;

.field private E:Landroid/graphics/PorterDuff$Mode;

.field final synthetic F:La/a/n/g;

.field private a:Landroid/view/Menu;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:I

.field private j:I

.field private k:Ljava/lang/CharSequence;

.field private l:Ljava/lang/CharSequence;

.field private m:I

.field private n:C

.field private o:I

.field private p:C

.field private q:I

.field private r:I

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:I

.field private w:I

.field private x:Ljava/lang/String;

.field private y:Ljava/lang/String;

.field private z:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/a/n/g;Landroid/view/Menu;)V
    .locals 0

    iput-object p1, p0, La/a/n/g$b;->F:La/a/n/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, La/a/n/g$b;->D:Landroid/content/res/ColorStateList;

    iput-object p1, p0, La/a/n/g$b;->E:Landroid/graphics/PorterDuff$Mode;

    iput-object p2, p0, La/a/n/g$b;->a:Landroid/view/Menu;

    invoke-virtual {p0}, La/a/n/g$b;->h()V

    return-void
.end method

.method private c(Ljava/lang/String;)C
    .locals 0

    const/4 p0, 0x0

    if-nez p1, :cond_0

    return p0

    :cond_0
    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    return p0
.end method

.method private e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object p0, p0, La/a/n/g$b;->F:La/a/n/g;

    iget-object p0, p0, La/a/n/g;->e:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    invoke-static {p1, v0, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p0

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    invoke-virtual {p0, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Cannot instantiate class: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SupportMenuInflater"

    invoke-static {p2, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p0, 0x0

    return-object p0
.end method

.method private i(Landroid/view/MenuItem;)V
    .locals 5

    iget-boolean v0, p0, La/a/n/g$b;->s:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, La/a/n/g$b;->t:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, La/a/n/g$b;->u:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, La/a/n/g$b;->r:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, La/a/n/g$b;->l:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, La/a/n/g$b;->m:I

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    iget v0, p0, La/a/n/g$b;->v:I

    if-ltz v0, :cond_1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    :cond_1
    iget-object v0, p0, La/a/n/g$b;->z:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, La/a/n/g$b;->F:La/a/n/g;

    iget-object v0, v0, La/a/n/g;->e:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, La/a/n/g$a;

    iget-object v1, p0, La/a/n/g$b;->F:La/a/n/g;

    invoke-virtual {v1}, La/a/n/g;->b()Ljava/lang/Object;

    move-result-object v1

    iget-object v4, p0, La/a/n/g$b;->z:Ljava/lang/String;

    invoke-direct {v0, v1, v4}, La/a/n/g$a;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "The android:onClick attribute cannot be used within a restricted context"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    iget v0, p0, La/a/n/g$b;->r:I

    const/4 v1, 0x2

    if-lt v0, v1, :cond_5

    instance-of v0, p1, Landroidx/appcompat/view/menu/i;

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Landroidx/appcompat/view/menu/i;

    invoke-virtual {v0, v3}, Landroidx/appcompat/view/menu/i;->t(Z)V

    goto :goto_2

    :cond_4
    instance-of v0, p1, Landroidx/appcompat/view/menu/j;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Landroidx/appcompat/view/menu/j;

    invoke-virtual {v0, v3}, Landroidx/appcompat/view/menu/j;->h(Z)V

    :cond_5
    :goto_2
    iget-object v0, p0, La/a/n/g$b;->x:Ljava/lang/String;

    if-eqz v0, :cond_6

    sget-object v1, La/a/n/g;->a:[Ljava/lang/Class;

    iget-object v2, p0, La/a/n/g$b;->F:La/a/n/g;

    iget-object v2, v2, La/a/n/g;->c:[Ljava/lang/Object;

    invoke-direct {p0, v0, v1, v2}, La/a/n/g$b;->e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    move v2, v3

    :cond_6
    iget v0, p0, La/a/n/g$b;->w:I

    if-lez v0, :cond_8

    if-nez v2, :cond_7

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    goto :goto_3

    :cond_7
    const-string v0, "SupportMenuInflater"

    const-string v1, "Ignoring attribute \'itemActionViewLayout\'. Action view already specified."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_8
    :goto_3
    iget-object v0, p0, La/a/n/g$b;->A:La/g/l/b;

    if-eqz v0, :cond_9

    invoke-static {p1, v0}, La/g/l/i;->a(Landroid/view/MenuItem;La/g/l/b;)Landroid/view/MenuItem;

    :cond_9
    iget-object v0, p0, La/a/n/g$b;->B:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, La/g/l/i;->c(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    iget-object v0, p0, La/a/n/g$b;->C:Ljava/lang/CharSequence;

    invoke-static {p1, v0}, La/g/l/i;->g(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V

    iget-char v0, p0, La/a/n/g$b;->n:C

    iget v1, p0, La/a/n/g$b;->o:I

    invoke-static {p1, v0, v1}, La/g/l/i;->b(Landroid/view/MenuItem;CI)V

    iget-char v0, p0, La/a/n/g$b;->p:C

    iget v1, p0, La/a/n/g$b;->q:I

    invoke-static {p1, v0, v1}, La/g/l/i;->f(Landroid/view/MenuItem;CI)V

    iget-object v0, p0, La/a/n/g$b;->E:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_a

    invoke-static {p1, v0}, La/g/l/i;->e(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V

    :cond_a
    iget-object p0, p0, La/a/n/g$b;->D:Landroid/content/res/ColorStateList;

    if-eqz p0, :cond_b

    invoke-static {p1, p0}, La/g/l/i;->d(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/n/g$b;->h:Z

    iget-object v0, p0, La/a/n/g$b;->a:Landroid/view/Menu;

    iget v1, p0, La/a/n/g$b;->b:I

    iget v2, p0, La/a/n/g$b;->i:I

    iget v3, p0, La/a/n/g$b;->j:I

    iget-object v4, p0, La/a/n/g$b;->k:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-direct {p0, v0}, La/a/n/g$b;->i(Landroid/view/MenuItem;)V

    return-void
.end method

.method public b()Landroid/view/SubMenu;
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/n/g$b;->h:Z

    iget-object v0, p0, La/a/n/g$b;->a:Landroid/view/Menu;

    iget v1, p0, La/a/n/g$b;->b:I

    iget v2, p0, La/a/n/g$b;->i:I

    iget v3, p0, La/a/n/g$b;->j:I

    iget-object v4, p0, La/a/n/g$b;->k:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v1

    invoke-direct {p0, v1}, La/a/n/g$b;->i(Landroid/view/MenuItem;)V

    return-object v0
.end method

.method public d()Z
    .locals 0

    iget-boolean p0, p0, La/a/n/g$b;->h:Z

    return p0
.end method

.method public f(Landroid/util/AttributeSet;)V
    .locals 2

    iget-object v0, p0, La/a/n/g$b;->F:La/a/n/g;

    iget-object v0, v0, La/a/n/g;->e:Landroid/content/Context;

    sget-object v1, La/a/j;->r1:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    sget v0, La/a/j;->t1:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->b:I

    sget v0, La/a/j;->v1:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->c:I

    sget v0, La/a/j;->w1:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->d:I

    sget v0, La/a/j;->x1:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->e:I

    sget v0, La/a/j;->u1:I

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, La/a/n/g$b;->f:Z

    sget v0, La/a/j;->s1:I

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, La/a/n/g$b;->g:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public g(Landroid/util/AttributeSet;)V
    .locals 6

    iget-object v0, p0, La/a/n/g$b;->F:La/a/n/g;

    iget-object v0, v0, La/a/n/g;->e:Landroid/content/Context;

    sget-object v1, La/a/j;->y1:[I

    invoke-static {v0, p1, v1}, Landroidx/appcompat/widget/x0;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Landroidx/appcompat/widget/x0;

    move-result-object p1

    sget v0, La/a/j;->B1:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/x0;->n(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->i:I

    sget v0, La/a/j;->E1:I

    iget v2, p0, La/a/n/g$b;->c:I

    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/x0;->k(II)I

    move-result v0

    sget v2, La/a/j;->F1:I

    iget v3, p0, La/a/n/g$b;->d:I

    invoke-virtual {p1, v2, v3}, Landroidx/appcompat/widget/x0;->k(II)I

    move-result v2

    const/high16 v3, -0x10000

    and-int/2addr v0, v3

    const v3, 0xffff

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    iput v0, p0, La/a/n/g$b;->j:I

    sget v0, La/a/j;->G1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->p(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, La/a/n/g$b;->k:Ljava/lang/CharSequence;

    sget v0, La/a/j;->H1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->p(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, La/a/n/g$b;->l:Ljava/lang/CharSequence;

    sget v0, La/a/j;->z1:I

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/x0;->n(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->m:I

    sget v0, La/a/j;->I1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->o(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, La/a/n/g$b;->c(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, La/a/n/g$b;->n:C

    sget v0, La/a/j;->P1:I

    const/16 v2, 0x1000

    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/x0;->k(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->o:I

    sget v0, La/a/j;->J1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->o(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, La/a/n/g$b;->c(Ljava/lang/String;)C

    move-result v0

    iput-char v0, p0, La/a/n/g$b;->p:C

    sget v0, La/a/j;->T1:I

    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/x0;->k(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->q:I

    sget v0, La/a/j;->K1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->s(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/x0;->a(IZ)Z

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, La/a/n/g$b;->e:I

    :goto_0
    iput v0, p0, La/a/n/g$b;->r:I

    sget v0, La/a/j;->C1:I

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/x0;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, La/a/n/g$b;->s:Z

    sget v0, La/a/j;->D1:I

    iget-boolean v2, p0, La/a/n/g$b;->f:Z

    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/x0;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, La/a/n/g$b;->t:Z

    sget v0, La/a/j;->A1:I

    iget-boolean v2, p0, La/a/n/g$b;->g:Z

    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/x0;->a(IZ)Z

    move-result v0

    iput-boolean v0, p0, La/a/n/g$b;->u:Z

    sget v0, La/a/j;->U1:I

    const/4 v2, -0x1

    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/x0;->k(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->v:I

    sget v0, La/a/j;->L1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->o(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/n/g$b;->z:Ljava/lang/String;

    sget v0, La/a/j;->M1:I

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/widget/x0;->n(II)I

    move-result v0

    iput v0, p0, La/a/n/g$b;->w:I

    sget v0, La/a/j;->O1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->o(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/n/g$b;->x:Ljava/lang/String;

    sget v0, La/a/j;->N1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->o(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/n/g$b;->y:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    const/4 v4, 0x0

    if-eqz v3, :cond_2

    iget v5, p0, La/a/n/g$b;->w:I

    if-nez v5, :cond_2

    iget-object v5, p0, La/a/n/g$b;->x:Ljava/lang/String;

    if-nez v5, :cond_2

    sget-object v3, La/a/n/g;->b:[Ljava/lang/Class;

    iget-object v5, p0, La/a/n/g$b;->F:La/a/n/g;

    iget-object v5, v5, La/a/n/g;->d:[Ljava/lang/Object;

    invoke-direct {p0, v0, v3, v5}, La/a/n/g$b;->e(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/g/l/b;

    iput-object v0, p0, La/a/n/g$b;->A:La/g/l/b;

    goto :goto_2

    :cond_2
    if-eqz v3, :cond_3

    const-string v0, "SupportMenuInflater"

    const-string v3, "Ignoring attribute \'actionProviderClass\'. Action view already specified."

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    iput-object v4, p0, La/a/n/g$b;->A:La/g/l/b;

    :goto_2
    sget v0, La/a/j;->Q1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->p(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, La/a/n/g$b;->B:Ljava/lang/CharSequence;

    sget v0, La/a/j;->V1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->p(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, La/a/n/g$b;->C:Ljava/lang/CharSequence;

    sget v0, La/a/j;->S1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->s(I)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/widget/x0;->k(II)I

    move-result v0

    iget-object v2, p0, La/a/n/g$b;->E:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v2}, Landroidx/appcompat/widget/f0;->d(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    iput-object v0, p0, La/a/n/g$b;->E:Landroid/graphics/PorterDuff$Mode;

    goto :goto_3

    :cond_4
    iput-object v4, p0, La/a/n/g$b;->E:Landroid/graphics/PorterDuff$Mode;

    :goto_3
    sget v0, La/a/j;->R1:I

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->s(I)Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/x0;->c(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, La/a/n/g$b;->D:Landroid/content/res/ColorStateList;

    goto :goto_4

    :cond_5
    iput-object v4, p0, La/a/n/g$b;->D:Landroid/content/res/ColorStateList;

    :goto_4
    invoke-virtual {p1}, Landroidx/appcompat/widget/x0;->w()V

    iput-boolean v1, p0, La/a/n/g$b;->h:Z

    return-void
.end method

.method public h()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La/a/n/g$b;->b:I

    iput v0, p0, La/a/n/g$b;->c:I

    iput v0, p0, La/a/n/g$b;->d:I

    iput v0, p0, La/a/n/g$b;->e:I

    const/4 v0, 0x1

    iput-boolean v0, p0, La/a/n/g$b;->f:Z

    iput-boolean v0, p0, La/a/n/g$b;->g:Z

    return-void
.end method
