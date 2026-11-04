.class Lcom/homwee/multiscreenshare/q/a$a;
.super Landroidx/recyclerview/widget/RecyclerView$e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/homwee/multiscreenshare/q/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private u:Landroid/widget/TextView;

.field private v:Landroid/widget/ImageView;

.field private w:Landroid/widget/LinearLayout;


# direct methods
.method constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$e0;-><init>(Landroid/view/View;)V

    const v0, 0x7f0800ef

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/q/a$a;->u:Landroid/widget/TextView;

    const v0, 0x7f0800ed

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/q/a$a;->v:Landroid/widget/ImageView;

    const v0, 0x7f080060

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/homwee/multiscreenshare/q/a$a;->w:Landroid/widget/LinearLayout;

    return-void
.end method

.method static synthetic M(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/q/a$a;->u:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic N(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/LinearLayout;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/q/a$a;->w:Landroid/widget/LinearLayout;

    return-object p0
.end method

.method static synthetic O(Lcom/homwee/multiscreenshare/q/a$a;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/homwee/multiscreenshare/q/a$a;->v:Landroid/widget/ImageView;

    return-object p0
.end method
