.class public final Ld/a/o/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld/a/o/a$g;,
        Ld/a/o/a$f;,
        Ld/a/o/a$e;,
        Ld/a/o/a$h;
    }
.end annotation


# static fields
.field static final a:Ld/a/h;

.field static final b:Ld/a/h;

.field static final c:Ld/a/h;

.field static final d:Ld/a/h;

.field static final e:Ld/a/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld/a/o/a$a;

    invoke-direct {v0}, Ld/a/o/a$a;-><init>()V

    invoke-static {v0}, Ld/a/n/a;->h(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object v0

    sput-object v0, Ld/a/o/a;->a:Ld/a/h;

    new-instance v0, Ld/a/o/a$b;

    invoke-direct {v0}, Ld/a/o/a$b;-><init>()V

    invoke-static {v0}, Ld/a/n/a;->e(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object v0

    sput-object v0, Ld/a/o/a;->b:Ld/a/h;

    new-instance v0, Ld/a/o/a$c;

    invoke-direct {v0}, Ld/a/o/a$c;-><init>()V

    invoke-static {v0}, Ld/a/n/a;->f(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object v0

    sput-object v0, Ld/a/o/a;->c:Ld/a/h;

    invoke-static {}, Ld/a/m/g/i;->d()Ld/a/m/g/i;

    move-result-object v0

    sput-object v0, Ld/a/o/a;->d:Ld/a/h;

    new-instance v0, Ld/a/o/a$d;

    invoke-direct {v0}, Ld/a/o/a$d;-><init>()V

    invoke-static {v0}, Ld/a/n/a;->g(Ljava/util/concurrent/Callable;)Ld/a/h;

    move-result-object v0

    sput-object v0, Ld/a/o/a;->e:Ld/a/h;

    return-void
.end method

.method public static a()Ld/a/h;
    .locals 1

    sget-object v0, Ld/a/o/a;->c:Ld/a/h;

    invoke-static {v0}, Ld/a/n/a;->l(Ld/a/h;)Ld/a/h;

    move-result-object v0

    return-object v0
.end method
