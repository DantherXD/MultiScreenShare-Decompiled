.class La/g/i/a;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:La/g/i/f$c;

.field private final b:Landroid/os/Handler;


# direct methods
.method constructor <init>(La/g/i/f$c;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g/i/a;->a:La/g/i/f$c;

    iput-object p2, p0, La/g/i/a;->b:Landroid/os/Handler;

    return-void
.end method

.method private a(I)V
    .locals 3

    iget-object v0, p0, La/g/i/a;->a:La/g/i/f$c;

    iget-object v1, p0, La/g/i/a;->b:Landroid/os/Handler;

    new-instance v2, La/g/i/a$b;

    invoke-direct {v2, p0, v0, p1}, La/g/i/a$b;-><init>(La/g/i/a;La/g/i/f$c;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private c(Landroid/graphics/Typeface;)V
    .locals 3

    iget-object v0, p0, La/g/i/a;->a:La/g/i/f$c;

    iget-object v1, p0, La/g/i/a;->b:Landroid/os/Handler;

    new-instance v2, La/g/i/a$a;

    invoke-direct {v2, p0, v0, p1}, La/g/i/a$a;-><init>(La/g/i/a;La/g/i/f$c;Landroid/graphics/Typeface;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method b(La/g/i/e$e;)V
    .locals 1

    invoke-virtual {p1}, La/g/i/e$e;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, La/g/i/e$e;->a:Landroid/graphics/Typeface;

    invoke-direct {p0, p1}, La/g/i/a;->c(Landroid/graphics/Typeface;)V

    goto :goto_0

    :cond_0
    iget p1, p1, La/g/i/e$e;->b:I

    invoke-direct {p0, p1}, La/g/i/a;->a(I)V

    :goto_0
    return-void
.end method
