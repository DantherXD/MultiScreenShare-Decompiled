.class public final Lc/b/b/d;
.super Lc/b/b/f;
.source ""


# static fields
.field private static final d:Lc/b/b/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc/b/b/d;

    invoke-direct {v0}, Lc/b/b/d;-><init>()V

    sput-object v0, Lc/b/b/d;->d:Lc/b/b/d;

    sget-object v1, Lc/b/b/f;->c:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc/b/b/f;-><init>()V

    return-void
.end method

.method public static a()Lc/b/b/d;
    .locals 1

    sget-boolean v0, Lc/b/b/f;->b:Z

    if-eqz v0, :cond_0

    new-instance v0, Lc/b/b/d;

    invoke-direct {v0}, Lc/b/b/d;-><init>()V

    return-object v0

    :cond_0
    sget-object v0, Lc/b/b/d;->d:Lc/b/b/d;

    return-object v0
.end method
