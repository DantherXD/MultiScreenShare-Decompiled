.class La/g/i/a$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/i/a;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:La/g/i/f$c;

.field final synthetic c:I

.field final synthetic d:La/g/i/a;


# direct methods
.method constructor <init>(La/g/i/a;La/g/i/f$c;I)V
    .locals 0

    iput-object p1, p0, La/g/i/a$b;->d:La/g/i/a;

    iput-object p2, p0, La/g/i/a$b;->b:La/g/i/f$c;

    iput p3, p0, La/g/i/a$b;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, La/g/i/a$b;->b:La/g/i/f$c;

    iget p0, p0, La/g/i/a$b;->c:I

    invoke-virtual {v0, p0}, La/g/i/f$c;->a(I)V

    return-void
.end method
