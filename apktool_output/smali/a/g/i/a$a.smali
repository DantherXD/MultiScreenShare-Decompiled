.class La/g/i/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/g/i/a;->c(Landroid/graphics/Typeface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:La/g/i/f$c;

.field final synthetic c:Landroid/graphics/Typeface;

.field final synthetic d:La/g/i/a;


# direct methods
.method constructor <init>(La/g/i/a;La/g/i/f$c;Landroid/graphics/Typeface;)V
    .locals 0

    iput-object p1, p0, La/g/i/a$a;->d:La/g/i/a;

    iput-object p2, p0, La/g/i/a$a;->b:La/g/i/f$c;

    iput-object p3, p0, La/g/i/a$a;->c:Landroid/graphics/Typeface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, La/g/i/a$a;->b:La/g/i/f$c;

    iget-object p0, p0, La/g/i/a$a;->c:Landroid/graphics/Typeface;

    invoke-virtual {v0, p0}, La/g/i/f$c;->b(Landroid/graphics/Typeface;)V

    return-void
.end method
