.class public La/g/e/d$a;
.super La/g/i/f$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/e/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:La/g/d/f/f$a;


# direct methods
.method public constructor <init>(La/g/d/f/f$a;)V
    .locals 0

    invoke-direct {p0}, La/g/i/f$c;-><init>()V

    iput-object p1, p0, La/g/e/d$a;->a:La/g/d/f/f$a;

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    iget-object p0, p0, La/g/e/d$a;->a:La/g/d/f/f$a;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, La/g/d/f/f$a;->d(I)V

    :cond_0
    return-void
.end method

.method public b(Landroid/graphics/Typeface;)V
    .locals 0

    iget-object p0, p0, La/g/e/d$a;->a:La/g/d/f/f$a;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, La/g/d/f/f$a;->e(Landroid/graphics/Typeface;)V

    :cond_0
    return-void
.end method
