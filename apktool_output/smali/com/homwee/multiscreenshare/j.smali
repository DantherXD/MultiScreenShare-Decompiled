.class public final synthetic Lcom/homwee/multiscreenshare/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld/a/e;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/homwee/multiscreenshare/j;->a:Ljava/lang/String;

    iput p2, p0, Lcom/homwee/multiscreenshare/j;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ld/a/d;)V
    .locals 1

    iget-object v0, p0, Lcom/homwee/multiscreenshare/j;->a:Ljava/lang/String;

    iget p0, p0, Lcom/homwee/multiscreenshare/j;->b:I

    invoke-static {v0, p0, p1}, Lcom/homwee/multiscreenshare/MainActivity;->p0(Ljava/lang/String;ILd/a/d;)V

    return-void
.end method
