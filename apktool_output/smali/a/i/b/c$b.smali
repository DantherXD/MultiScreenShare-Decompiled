.class La/i/b/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/i/b/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:La/i/b/c;


# direct methods
.method constructor <init>(La/i/b/c;)V
    .locals 0

    iput-object p1, p0, La/i/b/c$b;->b:La/i/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object p0, p0, La/i/b/c$b;->b:La/i/b/c;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, La/i/b/c;->E(I)V

    return-void
.end method
