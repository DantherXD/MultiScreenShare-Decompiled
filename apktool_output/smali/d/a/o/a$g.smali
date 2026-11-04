.class final Ld/a/o/a$g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld/a/o/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "g"
.end annotation


# static fields
.field static final a:Ld/a/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld/a/m/g/c;

    invoke-direct {v0}, Ld/a/m/g/c;-><init>()V

    sput-object v0, Ld/a/o/a$g;->a:Ld/a/h;

    return-void
.end method
