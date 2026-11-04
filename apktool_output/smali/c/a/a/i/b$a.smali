.class public Lc/a/a/i/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/i/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Lc/a/a/i/l;

.field private final b:Ljava/lang/String;

.field public c:Lc/a/a/i/q/d;

.field public d:Lc/a/a/i/l;


# direct methods
.method public constructor <init>(Lc/a/a/i/l;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/i/b$a;->a:Lc/a/a/i/l;

    iput-object p2, p0, Lc/a/a/i/b$a;->b:Ljava/lang/String;

    return-void
.end method

.method static synthetic a(Lc/a/a/i/b$a;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lc/a/a/i/b$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic b(Lc/a/a/i/b$a;)Lc/a/a/i/l;
    .locals 0

    iget-object p0, p0, Lc/a/a/i/b$a;->a:Lc/a/a/i/l;

    return-object p0
.end method
