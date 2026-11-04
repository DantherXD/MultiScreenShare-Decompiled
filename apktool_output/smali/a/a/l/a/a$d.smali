.class La/a/l/a/a$d;
.super La/a/l/a/a$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/a/l/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "d"
.end annotation


# instance fields
.field private final a:La/r/a/a/c;


# direct methods
.method constructor <init>(La/r/a/a/c;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La/a/l/a/a$g;-><init>(La/a/l/a/a$a;)V

    iput-object p1, p0, La/a/l/a/a$d;->a:La/r/a/a/c;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 0

    iget-object p0, p0, La/a/l/a/a$d;->a:La/r/a/a/c;

    invoke-virtual {p0}, La/r/a/a/c;->start()V

    return-void
.end method

.method public d()V
    .locals 0

    iget-object p0, p0, La/a/l/a/a$d;->a:La/r/a/a/c;

    invoke-virtual {p0}, La/r/a/a/c;->stop()V

    return-void
.end method
