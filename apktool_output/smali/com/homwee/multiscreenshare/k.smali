.class public final synthetic Lcom/homwee/multiscreenshare/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/l/d;


# instance fields
.field public final synthetic a:Lcom/homwee/multiscreenshare/MainActivity;

.field public final synthetic b:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Lcom/homwee/multiscreenshare/MainActivity;Landroid/widget/ImageView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/homwee/multiscreenshare/k;->a:Lcom/homwee/multiscreenshare/MainActivity;

    iput-object p2, p0, Lcom/homwee/multiscreenshare/k;->b:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/k;->a:Lcom/homwee/multiscreenshare/MainActivity;

    iget-object p0, p0, Lcom/homwee/multiscreenshare/k;->b:Landroid/widget/ImageView;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, p0, p1}, Lcom/homwee/multiscreenshare/MainActivity;->u0(Landroid/widget/ImageView;Landroid/graphics/Bitmap;)V

    return-void
.end method
