.class La/g/l/d0$k;
.super La/g/l/d0$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/l/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "k"
.end annotation


# static fields
.field static final r:La/g/l/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    invoke-static {v0}, La/g/l/d0;->s(Landroid/view/WindowInsets;)La/g/l/d0;

    move-result-object v0

    sput-object v0, La/g/l/d0$k;->r:La/g/l/d0;

    return-void
.end method

.method constructor <init>(La/g/l/d0;La/g/l/d0$k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/g/l/d0$j;-><init>(La/g/l/d0;La/g/l/d0$j;)V

    return-void
.end method

.method constructor <init>(La/g/l/d0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, La/g/l/d0$j;-><init>(La/g/l/d0;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method
