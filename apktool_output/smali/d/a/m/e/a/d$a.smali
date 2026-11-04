.class Ld/a/m/e/a/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld/a/m/e/a/d;->h(Ld/a/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ld/a/m/e/a/d$b;

.field final synthetic c:Ld/a/m/e/a/d;


# direct methods
.method constructor <init>(Ld/a/m/e/a/d;Ld/a/m/e/a/d$b;)V
    .locals 0

    iput-object p1, p0, Ld/a/m/e/a/d$a;->c:Ld/a/m/e/a/d;

    iput-object p2, p0, Ld/a/m/e/a/d$a;->b:Ld/a/m/e/a/d$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Ld/a/m/e/a/d$a;->c:Ld/a/m/e/a/d;

    iget-object v0, v0, Ld/a/m/e/a/a;->a:Ld/a/f;

    iget-object p0, p0, Ld/a/m/e/a/d$a;->b:Ld/a/m/e/a/d$b;

    invoke-interface {v0, p0}, Ld/a/f;->a(Ld/a/g;)V

    return-void
.end method
