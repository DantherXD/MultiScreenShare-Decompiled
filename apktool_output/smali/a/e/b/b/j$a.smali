.class La/e/b/b/j$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/e/b/b/j;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:La/e/b/b/j;


# direct methods
.method constructor <init>(La/e/b/b/j;)V
    .locals 0

    iput-object p1, p0, La/e/b/b/j$a;->b:La/e/b/b/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    iget-object p0, p0, La/e/b/b/j$a;->b:La/e/b/b/j;

    invoke-static {p0}, La/e/b/b/j;->B(La/e/b/b/j;)La/e/b/b/j$d;

    move-result-object p0

    invoke-virtual {p0}, La/e/b/b/j$d;->a()V

    return-void
.end method
