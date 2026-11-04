package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    @Deprecated
    public Fragment f(Context context, String str, Bundle bundle) {
        return Fragment.W(context, str, bundle);
    }

    public abstract View g(int i);

    public abstract boolean i();
}
