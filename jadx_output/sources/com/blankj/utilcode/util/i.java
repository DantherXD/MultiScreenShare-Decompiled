package com.blankj.utilcode.util;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static int a(float f2) {
        return (int) ((f2 * Resources.getSystem().getDisplayMetrics().density) + 0.5f);
    }
}
