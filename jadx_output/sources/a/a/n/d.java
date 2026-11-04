package a.a.n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f89a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f90b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f91c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f92d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f93e;

    public d() {
        super(null);
    }

    public d(Context context, int i) {
        super(context);
        this.f89a = i;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f90b = theme;
    }

    private Resources b() {
        Resources resources;
        if (this.f93e == null) {
            Configuration configuration = this.f92d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            } else {
                Resources resources2 = super.getResources();
                Configuration configuration2 = new Configuration(resources2.getConfiguration());
                configuration2.updateFrom(this.f92d);
                this.f93e = new Resources(resources2.getAssets(), resources2.getDisplayMetrics(), configuration2);
            }
            this.f93e = resources;
        }
        return this.f93e;
    }

    private void d() {
        boolean z = this.f90b == null;
        if (z) {
            this.f90b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f90b.setTo(theme);
            }
        }
        e(this.f90b, this.f89a, z);
    }

    public void a(Configuration configuration) {
        if (this.f93e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f92d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f92d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f89a;
    }

    protected void e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f91c == null) {
            this.f91c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f91c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f90b;
        if (theme != null) {
            return theme;
        }
        if (this.f89a == 0) {
            this.f89a = a.a.i.f46d;
        }
        d();
        return this.f90b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f89a != i) {
            this.f89a = i;
            d();
        }
    }
}
