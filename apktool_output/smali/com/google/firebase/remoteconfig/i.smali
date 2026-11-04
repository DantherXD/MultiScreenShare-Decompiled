.class public Lcom/google/firebase/remoteconfig/i;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:[B


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/firebase/f;

.field private final d:Lcom/google/firebase/i/c;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lcom/google/firebase/remoteconfig/internal/j;

.field private final g:Lcom/google/firebase/remoteconfig/internal/j;

.field private final h:Lcom/google/firebase/remoteconfig/internal/j;

.field private final i:Lcom/google/firebase/remoteconfig/internal/l;

.field private final j:Lcom/google/firebase/remoteconfig/internal/m;

.field private final k:Lcom/google/firebase/remoteconfig/internal/n;

.field private final l:Lcom/google/firebase/installations/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/firebase/remoteconfig/i;->a:[B

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/google/firebase/f;Lcom/google/firebase/installations/h;Lcom/google/firebase/i/c;Ljava/util/concurrent/Executor;Lcom/google/firebase/remoteconfig/internal/j;Lcom/google/firebase/remoteconfig/internal/j;Lcom/google/firebase/remoteconfig/internal/j;Lcom/google/firebase/remoteconfig/internal/l;Lcom/google/firebase/remoteconfig/internal/m;Lcom/google/firebase/remoteconfig/internal/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/remoteconfig/i;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/firebase/remoteconfig/i;->c:Lcom/google/firebase/f;

    iput-object p3, p0, Lcom/google/firebase/remoteconfig/i;->l:Lcom/google/firebase/installations/h;

    iput-object p4, p0, Lcom/google/firebase/remoteconfig/i;->d:Lcom/google/firebase/i/c;

    iput-object p5, p0, Lcom/google/firebase/remoteconfig/i;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lcom/google/firebase/remoteconfig/i;->f:Lcom/google/firebase/remoteconfig/internal/j;

    iput-object p7, p0, Lcom/google/firebase/remoteconfig/i;->g:Lcom/google/firebase/remoteconfig/internal/j;

    iput-object p8, p0, Lcom/google/firebase/remoteconfig/i;->h:Lcom/google/firebase/remoteconfig/internal/j;

    iput-object p9, p0, Lcom/google/firebase/remoteconfig/i;->i:Lcom/google/firebase/remoteconfig/internal/l;

    iput-object p10, p0, Lcom/google/firebase/remoteconfig/i;->j:Lcom/google/firebase/remoteconfig/internal/m;

    iput-object p11, p0, Lcom/google/firebase/remoteconfig/i;->k:Lcom/google/firebase/remoteconfig/internal/n;

    return-void
.end method

.method public static d()Lcom/google/firebase/remoteconfig/i;
    .locals 1

    invoke-static {}, Lcom/google/firebase/f;->h()Lcom/google/firebase/f;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/i;->e(Lcom/google/firebase/f;)Lcom/google/firebase/remoteconfig/i;

    move-result-object v0

    return-object v0
.end method

.method public static e(Lcom/google/firebase/f;)Lcom/google/firebase/remoteconfig/i;
    .locals 1

    const-class v0, Lcom/google/firebase/remoteconfig/n;

    invoke-virtual {p0, v0}, Lcom/google/firebase/f;->f(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/remoteconfig/n;

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/n;->d()Lcom/google/firebase/remoteconfig/i;

    move-result-object p0

    return-object p0
.end method

.method private static g(Lcom/google/firebase/remoteconfig/internal/k;Lcom/google/firebase/remoteconfig/internal/k;)Z
    .locals 0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/k;->e()Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/k;->e()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/util/Date;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private synthetic h(Lc/b/a/a/c/h;Lc/b/a/a/c/h;Lc/b/a/a/c/h;)Lc/b/a/a/c/h;
    .locals 0

    invoke-virtual {p1}, Lc/b/a/a/c/h;->m()Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p1}, Lc/b/a/a/c/h;->j()Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lc/b/a/a/c/h;->j()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/k;

    invoke-virtual {p2}, Lc/b/a/a/c/h;->m()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Lc/b/a/a/c/h;->j()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/google/firebase/remoteconfig/internal/k;

    invoke-static {p1, p2}, Lcom/google/firebase/remoteconfig/i;->g(Lcom/google/firebase/remoteconfig/internal/k;Lcom/google/firebase/remoteconfig/internal/k;)Z

    move-result p2

    if-nez p2, :cond_1

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0

    :cond_1
    iget-object p2, p0, Lcom/google/firebase/remoteconfig/i;->g:Lcom/google/firebase/remoteconfig/internal/j;

    invoke-virtual {p2, p1}, Lcom/google/firebase/remoteconfig/internal/j;->k(Lcom/google/firebase/remoteconfig/internal/k;)Lc/b/a/a/c/h;

    move-result-object p1

    iget-object p2, p0, Lcom/google/firebase/remoteconfig/i;->e:Ljava/util/concurrent/Executor;

    new-instance p3, Lcom/google/firebase/remoteconfig/d;

    invoke-direct {p3, p0}, Lcom/google/firebase/remoteconfig/d;-><init>(Lcom/google/firebase/remoteconfig/i;)V

    invoke-virtual {p1, p2, p3}, Lc/b/a/a/c/h;->f(Ljava/util/concurrent/Executor;Lc/b/a/a/c/a;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic j(Lcom/google/firebase/remoteconfig/internal/l$a;)Lc/b/a/a/c/h;
    .locals 0

    const/4 p0, 0x0

    invoke-static {p0}, Lc/b/a/a/c/k;->c(Ljava/lang/Object;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method private synthetic k(Ljava/lang/Void;)Lc/b/a/a/c/h;
    .locals 0

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/i;->a()Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/google/firebase/remoteconfig/i;Lc/b/a/a/c/h;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/remoteconfig/i;->n(Lc/b/a/a/c/h;)Z

    move-result p0

    return p0
.end method

.method private n(Lc/b/a/a/c/h;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/c/h<",
            "Lcom/google/firebase/remoteconfig/internal/k;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lc/b/a/a/c/h;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/i;->f:Lcom/google/firebase/remoteconfig/internal/j;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/j;->b()V

    invoke-virtual {p1}, Lc/b/a/a/c/h;->j()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lc/b/a/a/c/h;->j()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/remoteconfig/internal/k;

    invoke-virtual {p1}, Lcom/google/firebase/remoteconfig/internal/k;->c()Lorg/json/JSONArray;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/i;->q(Lorg/json/JSONArray;)V

    goto :goto_0

    :cond_0
    const-string p0, "FirebaseRemoteConfig"

    const-string p1, "Activated configs written to disk are null."

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method static p(Lorg/json/JSONArray;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_0
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a()Lc/b/a/a/c/h;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/b/a/a/c/h<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/i;->f:Lcom/google/firebase/remoteconfig/internal/j;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/j;->c()Lc/b/a/a/c/h;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/i;->g:Lcom/google/firebase/remoteconfig/internal/j;

    invoke-virtual {v1}, Lcom/google/firebase/remoteconfig/internal/j;->c()Lc/b/a/a/c/h;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lc/b/a/a/c/h;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    invoke-static {v2}, Lc/b/a/a/c/k;->f([Lc/b/a/a/c/h;)Lc/b/a/a/c/h;

    move-result-object v2

    iget-object v3, p0, Lcom/google/firebase/remoteconfig/i;->e:Ljava/util/concurrent/Executor;

    new-instance v4, Lcom/google/firebase/remoteconfig/c;

    invoke-direct {v4, p0, v0, v1}, Lcom/google/firebase/remoteconfig/c;-><init>(Lcom/google/firebase/remoteconfig/i;Lc/b/a/a/c/h;Lc/b/a/a/c/h;)V

    invoke-virtual {v2, v3, v4}, Lc/b/a/a/c/h;->h(Ljava/util/concurrent/Executor;Lc/b/a/a/c/a;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public b()Lc/b/a/a/c/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/b/a/a/c/h<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/i;->i:Lcom/google/firebase/remoteconfig/internal/l;

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/l;->d()Lc/b/a/a/c/h;

    move-result-object p0

    sget-object v0, Lcom/google/firebase/remoteconfig/a;->a:Lcom/google/firebase/remoteconfig/a;

    invoke-virtual {p0, v0}, Lc/b/a/a/c/h;->n(Lc/b/a/a/c/g;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public c()Lc/b/a/a/c/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/b/a/a/c/h<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/i;->b()Lc/b/a/a/c/h;

    move-result-object v0

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/i;->e:Ljava/util/concurrent/Executor;

    new-instance v2, Lcom/google/firebase/remoteconfig/b;

    invoke-direct {v2, p0}, Lcom/google/firebase/remoteconfig/b;-><init>(Lcom/google/firebase/remoteconfig/i;)V

    invoke-virtual {v0, v1, v2}, Lc/b/a/a/c/h;->o(Ljava/util/concurrent/Executor;Lc/b/a/a/c/g;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public f(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/i;->j:Lcom/google/firebase/remoteconfig/internal/m;

    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/m;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public synthetic i(Lc/b/a/a/c/h;Lc/b/a/a/c/h;Lc/b/a/a/c/h;)Lc/b/a/a/c/h;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/firebase/remoteconfig/i;->h(Lc/b/a/a/c/h;Lc/b/a/a/c/h;Lc/b/a/a/c/h;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method public synthetic l(Ljava/lang/Void;)Lc/b/a/a/c/h;
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/firebase/remoteconfig/i;->k(Ljava/lang/Void;)Lc/b/a/a/c/h;

    move-result-object p0

    return-object p0
.end method

.method o()V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/i;->g:Lcom/google/firebase/remoteconfig/internal/j;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/j;->c()Lc/b/a/a/c/h;

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/i;->h:Lcom/google/firebase/remoteconfig/internal/j;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/j;->c()Lc/b/a/a/c/h;

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/i;->f:Lcom/google/firebase/remoteconfig/internal/j;

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/j;->c()Lc/b/a/a/c/h;

    return-void
.end method

.method q(Lorg/json/JSONArray;)V
    .locals 2

    const-string v0, "FirebaseRemoteConfig"

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/i;->d:Lcom/google/firebase/i/c;

    if-nez v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-static {p1}, Lcom/google/firebase/remoteconfig/i;->p(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p1

    iget-object p0, p0, Lcom/google/firebase/remoteconfig/i;->d:Lcom/google/firebase/i/c;

    invoke-virtual {p0, p1}, Lcom/google/firebase/i/c;->k(Ljava/util/List;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/firebase/i/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "Could not update ABT experiments."

    invoke-static {v0, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception p0

    const-string p1, "Could not parse ABT experiments from the JSON response."

    invoke-static {v0, p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
