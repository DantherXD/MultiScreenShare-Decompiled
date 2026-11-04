package com.blankj.utilcode.util;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public class UtilsFileProvider extends a.g.d.b {
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        k.b((Application) getContext().getApplicationContext());
        return true;
    }
}
