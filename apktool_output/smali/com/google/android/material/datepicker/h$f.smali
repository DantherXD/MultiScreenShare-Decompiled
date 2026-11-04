.class Lcom/google/android/material/datepicker/h$f;
.super La/g/l/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/h;->L1(Landroid/view/View;Lcom/google/android/material/datepicker/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/google/android/material/datepicker/h;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/h;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/h$f;->d:Lcom/google/android/material/datepicker/h;

    invoke-direct {p0}, La/g/l/a;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;La/g/l/e0/c;)V
    .locals 0

    invoke-super {p0, p1, p2}, La/g/l/a;->g(Landroid/view/View;La/g/l/e0/c;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/h$f;->d:Lcom/google/android/material/datepicker/h;

    invoke-static {p1}, Lcom/google/android/material/datepicker/h;->J1(Lcom/google/android/material/datepicker/h;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    iget-object p0, p0, Lcom/google/android/material/datepicker/h$f;->d:Lcom/google/android/material/datepicker/h;

    if-nez p1, :cond_0

    sget p1, Lc/b/a/b/i;->o:I

    goto :goto_0

    :cond_0
    sget p1, Lc/b/a/b/i;->m:I

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->Q(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p0}, La/g/l/e0/c;->g0(Ljava/lang/CharSequence;)V

    return-void
.end method
