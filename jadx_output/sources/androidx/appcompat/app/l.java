package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f1139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LocationManager f1141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f1142d = new a();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f1144b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f1145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f1146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f1147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f1148f;

        a() {
        }
    }

    l(Context context, LocationManager locationManager) {
        this.f1140b = context;
        this.f1141c = locationManager;
    }

    static l a(Context context) {
        if (f1139a == null) {
            Context applicationContext = context.getApplicationContext();
            f1139a = new l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1139a;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = a.g.d.d.b(this.f1140b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = a.g.d.d.b(this.f1140b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f1141c.isProviderEnabled(str)) {
                return this.f1141c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f1142d.f1148f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        long j2;
        a aVar = this.f1142d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        k kVarB = k.b();
        kVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = kVarB.f1136b;
        kVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = kVarB.f1138d == 1;
        long j4 = kVarB.f1137c;
        long j5 = kVarB.f1136b;
        kVarB.a(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j6 = kVarB.f1137c;
        if (j4 == -1 || j5 == -1) {
            j = 43200000 + jCurrentTimeMillis;
        } else {
            if (jCurrentTimeMillis > j5) {
                j2 = 0 + j6;
            } else {
                j2 = jCurrentTimeMillis > j4 ? 0 + j5 : 0 + j4;
            }
            j = j2 + 60000;
        }
        aVar.f1143a = z;
        aVar.f1144b = j3;
        aVar.f1145c = j4;
        aVar.f1146d = j5;
        aVar.f1147e = j6;
        aVar.f1148f = j;
    }

    boolean d() {
        a aVar = this.f1142d;
        if (e()) {
            return aVar.f1143a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.f1143a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
