package androidx.core.app;

import android.app.RemoteInput;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    static RemoteInput a(j jVar) {
        throw null;
    }

    static RemoteInput[] b(j[] jVarArr) {
        if (jVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[jVarArr.length];
        for (int i = 0; i < jVarArr.length; i++) {
            remoteInputArr[i] = a(jVarArr[i]);
        }
        return remoteInputArr;
    }
}
