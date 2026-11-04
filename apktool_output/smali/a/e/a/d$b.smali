.class La/e/a/d$b;
.super La/e/a/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/e/a/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic g:La/e/a/d;


# direct methods
.method public constructor <init>(La/e/a/d;La/e/a/c;)V
    .locals 0

    iput-object p1, p0, La/e/a/d$b;->g:La/e/a/d;

    invoke-direct {p0}, La/e/a/b;-><init>()V

    new-instance p1, La/e/a/j;

    invoke-direct {p1, p0, p2}, La/e/a/j;-><init>(La/e/a/b;La/e/a/c;)V

    iput-object p1, p0, La/e/a/b;->e:La/e/a/b$a;

    return-void
.end method
