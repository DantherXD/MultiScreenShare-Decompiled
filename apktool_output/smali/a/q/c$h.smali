.class La/q/c$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/q/c;->n(Landroid/view/ViewGroup;La/q/s;La/q/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/q/c$k;

.field final synthetic b:La/q/c;

.field private mViewBounds:La/q/c$k;


# direct methods
.method constructor <init>(La/q/c;La/q/c$k;)V
    .locals 0

    iput-object p1, p0, La/q/c$h;->b:La/q/c;

    iput-object p2, p0, La/q/c$h;->a:La/q/c$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, La/q/c$h;->mViewBounds:La/q/c$k;

    return-void
.end method
