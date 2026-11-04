package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f3830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3831b;

    public c(Context context) {
        b.d(context);
        Resources resources = context.getResources();
        this.f3830a = resources;
        this.f3831b = resources.getResourcePackageName(c.b.a.a.a.a.f2565a);
    }

    @Nullable
    public String a(String str) {
        int identifier = this.f3830a.getIdentifier(str, "string", this.f3831b);
        if (identifier == 0) {
            return null;
        }
        return this.f3830a.getString(identifier);
    }
}
