.class La/g/i/g$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/i/g$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:La/g/k/a;

.field final synthetic c:Ljava/lang/Object;

.field final synthetic d:La/g/i/g$b;


# direct methods
.method constructor <init>(La/g/i/g$b;La/g/k/a;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, La/g/i/g$b$a;->d:La/g/i/g$b;

    iput-object p2, p0, La/g/i/g$b$a;->b:La/g/k/a;

    iput-object p3, p0, La/g/i/g$b$a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, La/g/i/g$b$a;->b:La/g/k/a;

    iget-object p0, p0, La/g/i/g$b$a;->c:Ljava/lang/Object;

    invoke-interface {v0, p0}, La/g/k/a;->a(Ljava/lang/Object;)V

    return-void
.end method
