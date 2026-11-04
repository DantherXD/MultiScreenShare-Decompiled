package com.homwee.multiscreenshare;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class CompleteReceiver extends BroadcastReceiver {
    static /* synthetic */ void a(Context context) {
        Intent intent = new Intent("com.homwee.intent.action.RemoteConfigService");
        intent.setClassName(context.getPackageName(), RemoteConfigService.class.getName());
        context.startForegroundService(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        String action = intent.getAction();
        com.homwee.multiscreenshare.r.e.d("CompleteReceiver action start = " + action);
        if ("android.intent.action.BOOT_COMPLETED".equals(action)) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.homwee.multiscreenshare.b
                @Override // java.lang.Runnable
                public final void run() {
                    CompleteReceiver.a(context);
                }
            }, 1000L);
        }
    }
}
