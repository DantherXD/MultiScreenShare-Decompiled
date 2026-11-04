.class public final La/g/d/f/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/g/d/f/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/g/d/f/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:La/g/i/d;

.field private final b:I

.field private final c:I

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/g/i/d;IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g/d/f/c$d;->a:La/g/i/d;

    iput p2, p0, La/g/d/f/c$d;->c:I

    iput p3, p0, La/g/d/f/c$d;->b:I

    iput-object p4, p0, La/g/d/f/c$d;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 0

    iget p0, p0, La/g/d/f/c$d;->c:I

    return p0
.end method

.method public b()La/g/i/d;
    .locals 0

    iget-object p0, p0, La/g/d/f/c$d;->a:La/g/i/d;

    return-object p0
.end method

.method public c()Ljava/lang/String;
    .locals 0

    iget-object p0, p0, La/g/d/f/c$d;->d:Ljava/lang/String;

    return-object p0
.end method

.method public d()I
    .locals 0

    iget p0, p0, La/g/d/f/c$d;->b:I

    return p0
.end method
