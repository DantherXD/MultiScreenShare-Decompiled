.class La/q/q$a;
.super La/q/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/q/q;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:La/q/m;

.field final synthetic b:La/q/q;


# direct methods
.method constructor <init>(La/q/q;La/q/m;)V
    .locals 0

    iput-object p1, p0, La/q/q$a;->b:La/q/q;

    iput-object p2, p0, La/q/q$a;->a:La/q/m;

    invoke-direct {p0}, La/q/n;-><init>()V

    return-void
.end method


# virtual methods
.method public e(La/q/m;)V
    .locals 1

    iget-object v0, p0, La/q/q$a;->a:La/q/m;

    invoke-virtual {v0}, La/q/m;->T()V

    invoke-virtual {p1, p0}, La/q/m;->P(La/q/m$f;)La/q/m;

    return-void
.end method
