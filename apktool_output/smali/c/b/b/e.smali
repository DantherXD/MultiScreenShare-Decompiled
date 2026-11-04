.class public final Lc/b/b/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/b/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lc/b/b/a;IILjava/util/Map;)Lc/b/b/j/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc/b/b/a;",
            "II",
            "Ljava/util/Map<",
            "Lc/b/b/c;",
            "*>;)",
            "Lc/b/b/j/b;"
        }
    .end annotation

    sget-object p0, Lc/b/b/e$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p0, p0, v0

    packed-switch p0, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "No encoder available for format "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    new-instance p0, Lc/b/b/i/a;

    invoke-direct {p0}, Lc/b/b/i/a;-><init>()V

    goto :goto_0

    :pswitch_1
    new-instance p0, Lc/b/b/k/a;

    invoke-direct {p0}, Lc/b/b/k/a;-><init>()V

    goto :goto_0

    :pswitch_2
    new-instance p0, Lc/b/b/l/b;

    invoke-direct {p0}, Lc/b/b/l/b;-><init>()V

    goto :goto_0

    :pswitch_3
    new-instance p0, Lc/b/b/m/a;

    invoke-direct {p0}, Lc/b/b/m/a;-><init>()V

    goto :goto_0

    :pswitch_4
    new-instance p0, Lc/b/b/l/l;

    invoke-direct {p0}, Lc/b/b/l/l;-><init>()V

    goto :goto_0

    :pswitch_5
    new-instance p0, Lc/b/b/l/d;

    invoke-direct {p0}, Lc/b/b/l/d;-><init>()V

    goto :goto_0

    :pswitch_6
    new-instance p0, Lc/b/b/l/h;

    invoke-direct {p0}, Lc/b/b/l/h;-><init>()V

    goto :goto_0

    :pswitch_7
    new-instance p0, Lc/b/b/l/f;

    invoke-direct {p0}, Lc/b/b/l/f;-><init>()V

    goto :goto_0

    :pswitch_8
    new-instance p0, Lc/b/b/n/a;

    invoke-direct {p0}, Lc/b/b/n/a;-><init>()V

    goto :goto_0

    :pswitch_9
    new-instance p0, Lc/b/b/l/o;

    invoke-direct {p0}, Lc/b/b/l/o;-><init>()V

    goto :goto_0

    :pswitch_a
    new-instance p0, Lc/b/b/l/j;

    invoke-direct {p0}, Lc/b/b/l/j;-><init>()V

    goto :goto_0

    :pswitch_b
    new-instance p0, Lc/b/b/l/s;

    invoke-direct {p0}, Lc/b/b/l/s;-><init>()V

    goto :goto_0

    :pswitch_c
    new-instance p0, Lc/b/b/l/k;

    invoke-direct {p0}, Lc/b/b/l/k;-><init>()V

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lc/b/b/g;->a(Ljava/lang/String;Lc/b/b/a;IILjava/util/Map;)Lc/b/b/j/b;

    move-result-object p0

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
