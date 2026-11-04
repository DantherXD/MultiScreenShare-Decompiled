.class final Ld/a/m/g/b$c;
.super Ld/a/m/g/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/m/g/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation


# instance fields
.field private d:J


# direct methods
.method constructor <init>(Ljava/util/concurrent/ThreadFactory;)V
    .locals 2

    invoke-direct {p0, p1}, Ld/a/m/g/d;-><init>(Ljava/util/concurrent/ThreadFactory;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Ld/a/m/g/b$c;->d:J

    return-void
.end method


# virtual methods
.method public g()J
    .locals 2

    iget-wide v0, p0, Ld/a/m/g/b$c;->d:J

    return-wide v0
.end method

.method public h(J)V
    .locals 0

    iput-wide p1, p0, Ld/a/m/g/b$c;->d:J

    return-void
.end method
