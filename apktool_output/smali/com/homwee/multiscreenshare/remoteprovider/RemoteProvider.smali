.class public Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;
.super Landroid/content/ContentProvider;
.source ""


# static fields
.field private static final b:Landroid/content/UriMatcher;


# instance fields
.field private c:Landroid/content/Context;

.field d:Lcom/homwee/multiscreenshare/remoteprovider/b;

.field e:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/content/UriMatcher;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroid/content/UriMatcher;-><init>(I)V

    sput-object v0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->b:Landroid/content/UriMatcher;

    const-string v1, "com.homwee.multiscreenshare"

    const-string v2, "autopair"

    const/16 v3, 0xc

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/UriMatcher;->addURI(Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/ContentProvider;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->d:Lcom/homwee/multiscreenshare/remoteprovider/b;

    iput-object v0, p0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->e:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method

.method private a(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    sget-object p0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->b:Landroid/content/UriMatcher;

    invoke-virtual {p0, p1}, Landroid/content/UriMatcher;->match(Landroid/net/Uri;)I

    move-result p0

    const/16 p1, 0xc

    if-eq p0, p1, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    const-string p0, "ContentProvide Code12"

    invoke-static {p0}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    const-string p0, "autopair"

    :goto_0
    return-object p0
.end method

.method static synthetic b()V
    .locals 1

    sget-object v0, Lcom/homwee/multiscreenshare/MainActivity;->s:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method public insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;
    .locals 3

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->e:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    iget-object p0, p0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->c:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-virtual {p0, p1, v2}, Landroid/content/ContentResolver;->notifyChange(Landroid/net/Uri;Landroid/database/ContentObserver;)V

    return-object p1
.end method

.method public onCreate()Z
    .locals 3

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->c:Landroid/content/Context;

    new-instance v0, Lcom/homwee/multiscreenshare/remoteprovider/b;

    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/homwee/multiscreenshare/remoteprovider/b;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->d:Lcom/homwee/multiscreenshare/remoteprovider/b;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->e:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sget-object v0, Lcom/homwee/multiscreenshare/remoteprovider/a;->b:Lcom/homwee/multiscreenshare/remoteprovider/a;

    const-wide/16 v1, 0xbb8

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 p0, 0x1

    return p0
.end method

.method public query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    .locals 9

    invoke-direct {p0, p1}, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    const-string p1, "query"

    invoke-static {p1}, Lcom/homwee/multiscreenshare/r/e;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/homwee/multiscreenshare/remoteprovider/RemoteProvider;->e:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    invoke-virtual/range {v0 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p0

    return-object p0
.end method

.method public update(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    .locals 0

    const/4 p0, 0x0

    return p0
.end method
