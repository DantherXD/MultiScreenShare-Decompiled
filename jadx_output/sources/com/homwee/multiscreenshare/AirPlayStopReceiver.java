package com.homwee.multiscreenshare;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class AirPlayStopReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f4628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f4629b;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            Log.i("multiscreenshare", "msg:" + message.what);
            if (message.what != 35) {
                return;
            }
            Log.i("multiscreenshare", "msg_stop_airplay");
            AirPlayStopReceiver.this.e();
        }
    }

    private String b() {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f4629b.getSystemService("activity")).getRunningTasks(10);
        return (runningTasks == null || runningTasks.isEmpty()) ? "No running tasks" : runningTasks.get(0).topActivity.getPackageName();
    }

    private void c() {
        com.homwee.multiscreenshare.r.e.d("Now send message kill self!!!");
        a.n.a.a.b(this.f4629b).d(new Intent("ACTION_FINISH_SELF"));
    }

    private void d() {
        this.f4628a.sendEmptyMessageDelayed(35, 3000L);
        Log.i("multiscreenshare", "service oncheck");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        String strB = b();
        Log.i("multiscreenshare", "topPackageName:" + strB);
        if (strB.equals("com.homwee.mmp.screenshare") || strB.equalsIgnoreCase("com.homwee.multiscreenshare") || strB.equals("com.mediatek.androidbox")) {
            return;
        }
        this.f4629b.sendBroadcast(new Intent("com.changhong.STOP_DLNA_AIR_SERVICE"));
        c();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Log.i("multiscreenshare", "recive " + intent.getAction());
        if (intent.getAction().equalsIgnoreCase("com.changhong.mmp.check_need_exit_airplay")) {
            Log.i("multiscreenshare", "recive ");
            this.f4628a = new a();
            this.f4629b = context;
            d();
        }
    }
}
