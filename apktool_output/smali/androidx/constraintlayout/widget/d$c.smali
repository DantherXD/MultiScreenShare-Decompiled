.class public Landroidx/constraintlayout/widget/d$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/widget/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# static fields
.field private static a:Landroid/util/SparseIntArray;


# instance fields
.field public b:Z

.field public c:I

.field public d:I

.field public e:Ljava/lang/String;

.field public f:I

.field public g:I

.field public h:F

.field public i:I

.field public j:F

.field public k:F

.field public l:I

.field public m:Ljava/lang/String;

.field public n:I

.field public o:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->t6:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    sget-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->v6:I

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    sget-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->z6:I

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    sget-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->s6:I

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    sget-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->r6:I

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    sget-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->q6:I

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    sget-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->u6:I

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    sget-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->y6:I

    const/16 v2, 0x8

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    sget-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->x6:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    sget-object v0, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    sget v1, Landroidx/constraintlayout/widget/i;->w6:I

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->append(II)V

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/d$c;->b:Z

    const/4 v1, -0x1

    iput v1, p0, Landroidx/constraintlayout/widget/d$c;->c:I

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->d:I

    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/constraintlayout/widget/d$c;->e:Ljava/lang/String;

    iput v1, p0, Landroidx/constraintlayout/widget/d$c;->f:I

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->g:I

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->h:F

    iput v1, p0, Landroidx/constraintlayout/widget/d$c;->i:I

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->j:F

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->k:F

    iput v1, p0, Landroidx/constraintlayout/widget/d$c;->l:I

    iput-object v2, p0, Landroidx/constraintlayout/widget/d$c;->m:Ljava/lang/String;

    const/4 v0, -0x3

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->n:I

    iput v1, p0, Landroidx/constraintlayout/widget/d$c;->o:I

    return-void
.end method


# virtual methods
.method public a(Landroidx/constraintlayout/widget/d$c;)V
    .locals 1

    iget-boolean v0, p1, Landroidx/constraintlayout/widget/d$c;->b:Z

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/d$c;->b:Z

    iget v0, p1, Landroidx/constraintlayout/widget/d$c;->c:I

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->c:I

    iget-object v0, p1, Landroidx/constraintlayout/widget/d$c;->e:Ljava/lang/String;

    iput-object v0, p0, Landroidx/constraintlayout/widget/d$c;->e:Ljava/lang/String;

    iget v0, p1, Landroidx/constraintlayout/widget/d$c;->f:I

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->f:I

    iget v0, p1, Landroidx/constraintlayout/widget/d$c;->g:I

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->g:I

    iget v0, p1, Landroidx/constraintlayout/widget/d$c;->j:F

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->j:F

    iget v0, p1, Landroidx/constraintlayout/widget/d$c;->h:F

    iput v0, p0, Landroidx/constraintlayout/widget/d$c;->h:F

    iget p1, p1, Landroidx/constraintlayout/widget/d$c;->i:I

    iput p1, p0, Landroidx/constraintlayout/widget/d$c;->i:I

    return-void
.end method

.method b(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    sget-object v0, Landroidx/constraintlayout/widget/i;->p6:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const/4 p2, 0x1

    iput-boolean p2, p0, Landroidx/constraintlayout/widget/d$c;->b:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget-object v4, Landroidx/constraintlayout/widget/d$c;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v4, v3}, Landroid/util/SparseIntArray;->get(I)I

    move-result v4

    const/4 v5, 0x3

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    iget v4, v4, Landroid/util/TypedValue;->type:I

    const/4 v6, -0x2

    const/4 v7, -0x1

    if-ne v4, p2, :cond_0

    invoke-virtual {p1, v3, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->o:I

    if-eq v3, v7, :cond_4

    :goto_1
    iput v6, p0, Landroidx/constraintlayout/widget/d$c;->n:I

    goto/16 :goto_3

    :cond_0
    if-ne v4, v5, :cond_2

    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Landroidx/constraintlayout/widget/d$c;->m:Ljava/lang/String;

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-lez v4, :cond_1

    invoke-virtual {p1, v3, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->o:I

    goto :goto_1

    :cond_1
    iput v7, p0, Landroidx/constraintlayout/widget/d$c;->n:I

    goto :goto_3

    :cond_2
    iget v4, p0, Landroidx/constraintlayout/widget/d$c;->o:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->n:I

    goto :goto_3

    :pswitch_1
    iget v4, p0, Landroidx/constraintlayout/widget/d$c;->k:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->k:F

    goto :goto_3

    :pswitch_2
    iget v4, p0, Landroidx/constraintlayout/widget/d$c;->l:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->l:I

    goto :goto_3

    :pswitch_3
    iget v4, p0, Landroidx/constraintlayout/widget/d$c;->h:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->h:F

    goto :goto_3

    :pswitch_4
    iget v4, p0, Landroidx/constraintlayout/widget/d$c;->d:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->d:I

    goto :goto_3

    :pswitch_5
    iget v4, p0, Landroidx/constraintlayout/widget/d$c;->c:I

    invoke-static {p1, v3, v4}, Landroidx/constraintlayout/widget/d;->a(Landroid/content/res/TypedArray;II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->c:I

    goto :goto_3

    :pswitch_6
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->g:I

    goto :goto_3

    :pswitch_7
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v4

    iget v4, v4, Landroid/util/TypedValue;->type:I

    if-ne v4, v5, :cond_3

    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_3
    sget-object v4, La/e/a/k/a/b;->b:[Ljava/lang/String;

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    aget-object v3, v4, v3

    :goto_2
    iput-object v3, p0, Landroidx/constraintlayout/widget/d$c;->e:Ljava/lang/String;

    goto :goto_3

    :pswitch_8
    iget v4, p0, Landroidx/constraintlayout/widget/d$c;->f:I

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->f:I

    goto :goto_3

    :pswitch_9
    iget v4, p0, Landroidx/constraintlayout/widget/d$c;->j:F

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/d$c;->j:F

    :cond_4
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_5
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
