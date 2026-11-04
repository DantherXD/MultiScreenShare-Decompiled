package com.bumptech.glide.o;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
final class e implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f3697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final c.a f3698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f3699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final BroadcastReceiver f3701f = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            e eVar = e.this;
            boolean z = eVar.f3699d;
            eVar.f3699d = eVar.l(context);
            if (z != e.this.f3699d) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f3699d);
                }
                e eVar2 = e.this;
                eVar2.f3698c.a(eVar2.f3699d);
            }
        }
    }

    e(Context context, c.a aVar) {
        this.f3697b = context.getApplicationContext();
        this.f3698c = aVar;
    }

    private void m() {
        if (this.f3700e) {
            return;
        }
        this.f3699d = l(this.f3697b);
        try {
            this.f3697b.registerReceiver(this.f3701f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f3700e = true;
        } catch (SecurityException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e2);
            }
        }
    }

    private void n() {
        if (this.f3700e) {
            this.f3697b.unregisterReceiver(this.f3701f);
            this.f3700e = false;
        }
    }

    @Override // com.bumptech.glide.o.i
    public void a() {
        m();
    }

    @Override // com.bumptech.glide.o.i
    public void f() {
        n();
    }

    @Override // com.bumptech.glide.o.i
    public void k() {
    }

    @SuppressLint({"MissingPermission"})
    boolean l(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) com.bumptech.glide.t.j.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e2);
            }
            return true;
        }
    }
}
