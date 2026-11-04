package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1686a = (IconCompat) aVar.v(remoteActionCompat.f1686a, 1);
        remoteActionCompat.f1687b = aVar.l(remoteActionCompat.f1687b, 2);
        remoteActionCompat.f1688c = aVar.l(remoteActionCompat.f1688c, 3);
        remoteActionCompat.f1689d = (PendingIntent) aVar.r(remoteActionCompat.f1689d, 4);
        remoteActionCompat.f1690e = aVar.h(remoteActionCompat.f1690e, 5);
        remoteActionCompat.f1691f = aVar.h(remoteActionCompat.f1691f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1686a, 1);
        aVar.D(remoteActionCompat.f1687b, 2);
        aVar.D(remoteActionCompat.f1688c, 3);
        aVar.H(remoteActionCompat.f1689d, 4);
        aVar.z(remoteActionCompat.f1690e, 5);
        aVar.z(remoteActionCompat.f1691f, 6);
    }
}
