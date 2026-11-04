.class La/g/d/f/f$a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/d/f/f$a;->a(ILandroid/os/Handler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:La/g/d/f/f$a;


# direct methods
.method constructor <init>(La/g/d/f/f$a;I)V
    .locals 0

    iput-object p1, p0, La/g/d/f/f$a$b;->c:La/g/d/f/f$a;

    iput p2, p0, La/g/d/f/f$a$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, La/g/d/f/f$a$b;->c:La/g/d/f/f$a;

    iget p0, p0, La/g/d/f/f$a$b;->b:I

    invoke-virtual {v0, p0}, La/g/d/f/f$a;->d(I)V

    return-void
.end method
