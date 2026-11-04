.class public Lcom/homwee/multiscreenshare/q/c;
.super Landroidx/recyclerview/widget/RecyclerView$o;
.source ""


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$o;-><init>()V

    iput p1, p0, Lcom/homwee/multiscreenshare/q/c;->a:I

    return-void
.end method


# virtual methods
.method public e(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$b0;)V
    .locals 0

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->d0(Landroid/view/View;)I

    move-result p2

    if-eqz p2, :cond_0

    iget p0, p0, Lcom/homwee/multiscreenshare/q/c;->a:I

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    iput p0, p1, Landroid/graphics/Rect;->top:I

    return-void
.end method
