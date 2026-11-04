.class public final Lc/a/a/j/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/j/t;
.implements Lc/a/a/i/q/f;


# static fields
.field public static final a:Lc/a/a/j/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/a/a/j/h;

    invoke-direct {v0}, Lc/a/a/j/h;-><init>()V

    sput-object v0, Lc/a/a/j/h;->a:Lc/a/a/j/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/a/j/m;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    iget-object v2, v0, Lc/a/a/j/m;->b:Lc/a/a/j/z;

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lc/a/a/j/z;->o()V

    return-void

    :cond_0
    iget v3, v2, Lc/a/a/j/z;->n:I

    sget-object v4, Lc/a/a/j/a0;->o:Lc/a/a/j/a0;

    iget v4, v4, Lc/a/a/j/a0;->z:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    move-object/from16 v4, p4

    if-eq v3, v4, :cond_2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Ljava/util/Date;

    if-ne v3, v4, :cond_1

    const-string v0, "new Date("

    invoke-virtual {v2, v0}, Lc/a/a/j/z;->write(Ljava/lang/String;)V

    move-object v0, v1

    check-cast v0, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lc/a/a/j/z;->n(J)V

    const/16 v0, 0x29

    goto :goto_0

    :cond_1
    const/16 v3, 0x7b

    invoke-virtual {v2, v3}, Lc/a/a/j/z;->write(I)V

    const-string v3, "@type"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Lc/a/a/j/z;->j(Ljava/lang/String;Z)V

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lc/a/a/j/m;->s(Ljava/lang/String;)V

    const/16 v0, 0x2c

    invoke-virtual {v2, v0}, Lc/a/a/j/z;->write(I)V

    const-string v0, "val"

    invoke-virtual {v2, v0, v4}, Lc/a/a/j/z;->j(Ljava/lang/String;Z)V

    move-object v0, v1

    check-cast v0, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lc/a/a/j/z;->n(J)V

    const/16 v0, 0x7d

    :goto_0
    invoke-virtual {v2, v0}, Lc/a/a/j/z;->write(I)V

    return-void

    :cond_2
    instance-of v3, v1, Ljava/util/Calendar;

    if-eqz v3, :cond_3

    check-cast v1, Ljava/util/Calendar;

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    goto :goto_1

    :cond_3
    check-cast v1, Ljava/util/Date;

    :goto_1
    iget v3, v2, Lc/a/a/j/z;->n:I

    sget-object v4, Lc/a/a/j/a0;->r:Lc/a/a/j/a0;

    iget v4, v4, Lc/a/a/j/a0;->z:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_5

    invoke-virtual/range {p1 .. p1}, Lc/a/a/j/m;->g()Ljava/text/DateFormat;

    move-result-object v3

    if-nez v3, :cond_4

    new-instance v3, Ljava/text/SimpleDateFormat;

    sget-object v4, Lc/a/a/a;->e:Ljava/lang/String;

    iget-object v5, v0, Lc/a/a/j/m;->o:Ljava/util/Locale;

    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    iget-object v0, v0, Lc/a/a/j/m;->n:Ljava/util/TimeZone;

    invoke-virtual {v3, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_4
    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lc/a/a/j/z;->p(Ljava/lang/String;)V

    return-void

    :cond_5
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    iget v1, v2, Lc/a/a/j/z;->n:I

    sget-object v5, Lc/a/a/j/a0;->f:Lc/a/a/j/a0;

    iget v5, v5, Lc/a/a/j/a0;->z:I

    and-int/2addr v5, v1

    if-eqz v5, :cond_a

    sget-object v5, Lc/a/a/j/a0;->c:Lc/a/a/j/a0;

    iget v6, v5, Lc/a/a/j/a0;->z:I

    and-int/2addr v1, v6

    const/16 v6, 0x27

    const/16 v7, 0x22

    if-eqz v1, :cond_6

    invoke-virtual {v2, v6}, Lc/a/a/j/z;->write(I)V

    goto :goto_2

    :cond_6
    invoke-virtual {v2, v7}, Lc/a/a/j/z;->write(I)V

    :goto_2
    iget-object v1, v0, Lc/a/a/j/m;->n:Ljava/util/TimeZone;

    iget-object v0, v0, Lc/a/a/j/m;->o:Ljava/util/Locale;

    invoke-static {v1, v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    add-int/2addr v4, v1

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/16 v8, 0xb

    invoke-virtual {v0, v8}, Ljava/util/Calendar;->get(I)I

    move-result v8

    const/16 v9, 0xc

    invoke-virtual {v0, v9}, Ljava/util/Calendar;->get(I)I

    move-result v9

    const/16 v10, 0xd

    invoke-virtual {v0, v10}, Ljava/util/Calendar;->get(I)I

    move-result v11

    const/16 v12, 0xe

    invoke-virtual {v0, v12}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/16 v12, 0x10

    const/16 v13, 0x13

    const/16 v7, 0xa

    if-eqz v0, :cond_7

    const-string v16, "0000-00-00T00:00:00.000"

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->toCharArray()[C

    move-result-object v6

    int-to-long v14, v0

    const/16 v0, 0x17

    invoke-static {v14, v15, v0, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v14, v11

    invoke-static {v14, v15, v13, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v13, v9

    invoke-static {v13, v14, v12, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v8, v8

    invoke-static {v8, v9, v10, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v0, v1

    invoke-static {v0, v1, v7, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v0, v4

    const/4 v4, 0x7

    invoke-static {v0, v1, v4, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v0, v3

    const/4 v3, 0x4

    invoke-static {v0, v1, v3, v6}, Lc/a/a/j/z;->f(JI[C)V

    goto :goto_3

    :cond_7
    if-nez v11, :cond_8

    if-nez v9, :cond_8

    if-nez v8, :cond_8

    const-string v0, "0000-00-00"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v6

    int-to-long v0, v1

    invoke-static {v0, v1, v7, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v0, v4

    const/4 v4, 0x7

    invoke-static {v0, v1, v4, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v0, v3

    const/4 v3, 0x4

    invoke-static {v0, v1, v3, v6}, Lc/a/a/j/z;->f(JI[C)V

    goto :goto_3

    :cond_8
    const-string v0, "0000-00-00T00:00:00"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v6

    int-to-long v14, v11

    invoke-static {v14, v15, v13, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v13, v9

    invoke-static {v13, v14, v12, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v8, v8

    invoke-static {v8, v9, v10, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v0, v1

    invoke-static {v0, v1, v7, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v0, v4

    const/4 v4, 0x7

    invoke-static {v0, v1, v4, v6}, Lc/a/a/j/z;->f(JI[C)V

    int-to-long v0, v3

    const/4 v3, 0x4

    invoke-static {v0, v1, v3, v6}, Lc/a/a/j/z;->f(JI[C)V

    :goto_3
    invoke-virtual {v2, v6}, Ljava/io/Writer;->write([C)V

    iget v0, v2, Lc/a/a/j/z;->n:I

    iget v1, v5, Lc/a/a/j/a0;->z:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_9

    const/16 v0, 0x27

    goto :goto_4

    :cond_9
    const/16 v0, 0x22

    :goto_4
    invoke-virtual {v2, v0}, Lc/a/a/j/z;->write(I)V

    goto :goto_5

    :cond_a
    invoke-virtual {v2, v3, v4}, Lc/a/a/j/z;->n(J)V

    :goto_5
    return-void
.end method

.method public b(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lc/a/a/j/h;->d(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method protected c(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    const/4 p0, 0x0

    if-nez p4, :cond_0

    return-object p0

    :cond_0
    instance-of p3, p4, Ljava/util/Date;

    if-eqz p3, :cond_1

    return-object p4

    :cond_1
    instance-of p3, p4, Ljava/math/BigDecimal;

    if-eqz p3, :cond_2

    new-instance p0, Ljava/util/Date;

    check-cast p4, Ljava/math/BigDecimal;

    invoke-virtual {p4}, Ljava/math/BigDecimal;->longValueExact()J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Ljava/util/Date;-><init>(J)V

    return-object p0

    :cond_2
    instance-of p3, p4, Ljava/lang/Number;

    if-eqz p3, :cond_3

    new-instance p0, Ljava/util/Date;

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->longValue()J

    move-result-wide p1

    invoke-direct {p0, p1, p2}, Ljava/util/Date;-><init>(J)V

    return-object p0

    :cond_3
    instance-of p3, p4, Ljava/lang/String;

    if-eqz p3, :cond_a

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p3

    if-nez p3, :cond_4

    return-object p0

    :cond_4
    new-instance p3, Lc/a/a/i/e;

    invoke-direct {p3, p4}, Lc/a/a/i/e;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p3, v0}, Lc/a/a/i/e;->L(Z)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p0, p3, Lc/a/a/i/e;->v:Ljava/util/Calendar;

    const-class p1, Ljava/util/Calendar;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne p2, p1, :cond_5

    invoke-virtual {p3}, Lc/a/a/i/e;->e()V

    return-object p0

    :cond_5
    :try_start_1
    invoke-virtual {p0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p3}, Lc/a/a/i/e;->e()V

    return-object p0

    :cond_6
    invoke-virtual {p3}, Lc/a/a/i/e;->e()V

    const-string p2, "0000-00-00"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    const-string p2, "0000-00-00T00:00:00"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_9

    const-string p2, "0001-01-01T00:00:00+08:00"

    invoke-virtual {p2, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_7

    goto :goto_1

    :cond_7
    if-eqz p5, :cond_8

    new-instance p0, Ljava/text/SimpleDateFormat;

    invoke-direct {p0, p5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    invoke-virtual {p1}, Lc/a/a/i/b;->e()Ljava/text/DateFormat;

    move-result-object p0

    :goto_0
    :try_start_2
    invoke-virtual {p0, p4}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0
    :try_end_2
    .catch Ljava/text/ParseException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catch_0
    invoke-static {p4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide p0

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2, p0, p1}, Ljava/util/Date;-><init>(J)V

    return-object p2

    :cond_9
    :goto_1
    return-object p0

    :catchall_0
    move-exception p0

    invoke-virtual {p3}, Lc/a/a/i/e;->e()V

    throw p0

    :cond_a
    new-instance p0, Lc/a/a/d;

    const-string p1, "parse error"

    invoke-direct {p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public d(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lc/a/a/i/b;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p1, Lc/a/a/i/b;->f:Lc/a/a/i/e;

    invoke-virtual {v0}, Lc/a/a/i/e;->e0()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/16 v4, 0x10

    if-ne v1, v3, :cond_1

    invoke-virtual {v0}, Lc/a/a/i/e;->n()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v4}, Lc/a/a/i/e;->t(I)V

    :cond_0
    :goto_0
    move-object v7, v1

    goto/16 :goto_2

    :cond_1
    const/4 v5, 0x4

    if-ne v1, v5, :cond_4

    invoke-virtual {v0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4}, Lc/a/a/i/e;->t(I)V

    iget v3, v0, Lc/a/a/i/e;->j:I

    sget-object v4, Lc/a/a/i/d;->g:Lc/a/a/i/d;

    iget v4, v4, Lc/a/a/i/d;->u:I

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    new-instance v3, Lc/a/a/i/e;

    invoke-direct {v3, v1}, Lc/a/a/i/e;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lc/a/a/i/e;->L(Z)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v1, v3, Lc/a/a/i/e;->v:Ljava/util/Calendar;

    const-class v4, Ljava/util/Calendar;

    if-ne p2, v4, :cond_2

    invoke-virtual {v3}, Lc/a/a/i/e;->e()V

    return-object v1

    :cond_2
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    :cond_3
    invoke-virtual {v3}, Lc/a/a/i/e;->e()V

    goto :goto_0

    :cond_4
    const/16 v6, 0x8

    if-ne v1, v6, :cond_5

    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    move-object v7, v2

    goto/16 :goto_2

    :cond_5
    const/16 v6, 0xc

    const/16 v7, 0xd

    const/16 v8, 0x11

    const-string v9, "syntax error"

    if-ne v1, v6, :cond_a

    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    invoke-virtual {v0}, Lc/a/a/i/e;->e0()I

    move-result v1

    if-ne v1, v5, :cond_9

    invoke-virtual {v0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v1

    const-string v6, "@type"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    invoke-virtual {p1, v8}, Lc/a/a/i/b;->a(I)V

    invoke-virtual {v0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v1

    iget-object v6, p1, Lc/a/a/i/b;->c:Lc/a/a/i/m;

    iget v8, v0, Lc/a/a/i/e;->j:I

    invoke-virtual {v6, v1, v2, v8}, Lc/a/a/i/m;->a(Ljava/lang/String;Ljava/lang/Class;I)Ljava/lang/Class;

    move-result-object v1

    if-eqz v1, :cond_6

    move-object p2, v1

    :cond_6
    invoke-virtual {p1, v5}, Lc/a/a/i/b;->a(I)V

    invoke-virtual {p1, v4}, Lc/a/a/i/b;->a(I)V

    :cond_7
    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Lc/a/a/i/e;->u(C)V

    invoke-virtual {v0}, Lc/a/a/i/e;->e0()I

    move-result v1

    if-ne v1, v3, :cond_8

    invoke-virtual {v0}, Lc/a/a/i/e;->n()J

    move-result-wide v3

    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_1

    :cond_8
    new-instance p0, Lc/a/a/d;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "syntax error : "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lc/a/a/i/f;->a(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_9
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v9}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    iget v1, p1, Lc/a/a/i/b;->k:I

    if-ne v1, v3, :cond_d

    const/4 v1, 0x0

    iput v1, p1, Lc/a/a/i/b;->k:I

    invoke-virtual {p1, v4}, Lc/a/a/i/b;->a(I)V

    invoke-virtual {v0}, Lc/a/a/i/e;->e0()I

    move-result v1

    if-ne v1, v5, :cond_c

    invoke-virtual {v0}, Lc/a/a/i/e;->b0()Ljava/lang/String;

    move-result-object v1

    const-string v3, "val"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Lc/a/a/i/e;->s()V

    invoke-virtual {p1, v8}, Lc/a/a/i/b;->a(I)V

    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object v1

    :goto_1
    invoke-virtual {p1, v7}, Lc/a/a/i/b;->a(I)V

    goto/16 :goto_0

    :cond_b
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v9}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    new-instance p0, Lc/a/a/d;

    invoke-direct {p0, v9}, Lc/a/a/d;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    invoke-virtual {p1}, Lc/a/a/i/b;->j()Ljava/lang/Object;

    move-result-object v1

    goto/16 :goto_0

    :goto_2
    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v8, p4

    invoke-virtual/range {v3 .. v8}, Lc/a/a/j/h;->c(Lc/a/a/i/b;Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    const-class p1, Ljava/util/Calendar;

    if-ne p2, p1, :cond_10

    instance-of p1, p0, Ljava/util/Calendar;

    if-eqz p1, :cond_e

    return-object p0

    :cond_e
    check-cast p0, Ljava/util/Date;

    if-nez p0, :cond_f

    return-object v2

    :cond_f
    iget-object p1, v0, Lc/a/a/i/e;->t:Ljava/util/TimeZone;

    iget-object p2, v0, Lc/a/a/i/e;->u:Ljava/util/Locale;

    invoke-static {p1, p2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;Ljava/util/Locale;)Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1, p0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    return-object p1

    :cond_10
    return-object p0
.end method
