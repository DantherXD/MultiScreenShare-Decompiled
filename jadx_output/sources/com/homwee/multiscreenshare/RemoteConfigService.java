package com.homwee.multiscreenshare;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.BitmapFactory;
import android.os.IBinder;
import android.os.Process;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RemoteConfigService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.firebase.remoteconfig.i f4646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f4647c;

    class a implements c.b.a.a.c.c<Boolean> {
        a() {
        }

        @Override // c.b.a.a.c.c
        public void a(c.b.a.a.c.h<Boolean> hVar) {
            StringBuilder sb;
            if (hVar.m()) {
                boolean zBooleanValue = hVar.j().booleanValue();
                sb = new StringBuilder();
                sb.append("Config params updated: ");
                sb.append(zBooleanValue);
            } else {
                sb = new StringBuilder();
                sb.append("RemoteCOnfig Fetch failed:");
                sb.append(hVar.i());
            }
            com.homwee.multiscreenshare.r.e.d(sb.toString());
            RemoteConfigService.this.e();
        }
    }

    private void b() {
        NotificationChannel notificationChannel = new NotificationChannel("FOREGROUND_SERVICE_ID", "FOREGROUND_SERVICE_NAME", 4);
        notificationChannel.setLockscreenVisibility(1);
        ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannel);
        startForeground(1, new Notification.Builder(this, "FOREGROUND_SERVICE_ID").setSmallIcon(R.drawable.app_icon).setContentText("ContentText").setSubText("SubText").setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.app_icon)).setContentTitle("ContentTitle").build());
    }

    private void c() {
        com.google.firebase.remoteconfig.i iVarD = com.google.firebase.remoteconfig.i.d();
        this.f4646b = iVarD;
        iVarD.c().b(new a());
    }

    private String d() {
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f4647c.getSystemService("activity")).getRunningTasks(10);
        return (runningTasks == null || runningTasks.isEmpty()) ? "No running tasks" : runningTasks.get(0).topActivity.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        c.a.a.e eVar = new c.a.a.e();
        eVar.put("airplay", c.a.a.a.e(this.f4646b.f("airplay_test")));
        eVar.put("screen_share", c.a.a.a.e(this.f4646b.f("screen_share_test")));
        eVar.put("dlna_config", c.a.a.a.e(this.f4646b.f("dlna_config_test")));
        eVar.put("ad_config", c.a.a.a.e(this.f4646b.f("ad_config_test")));
        com.homwee.multiscreenshare.r.e.d("Remote config:" + eVar.a());
        f(eVar.a());
    }

    private void f(String str) {
        String strA = com.homwee.multiscreenshare.r.f.a();
        if (strA.isEmpty() || !str.equals(strA)) {
            com.homwee.multiscreenshare.r.e.d("saveRemoteConfig");
            com.homwee.multiscreenshare.r.f.c(str);
            sendBroadcast(new Intent("com.homwee.intent.action.RemoteConfigReceiver"));
            SQLiteDatabase writableDatabase = new com.homwee.multiscreenshare.remoteprovider.b(MyApplication.c()).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remoteconfig", str);
            writableDatabase.execSQL("delete from autopair");
            writableDatabase.insert("autopair", "remoteconfig", contentValues);
        }
        String strD = d();
        if (strD.equals("com.homwee.mmp.screenshare") || strD.equalsIgnoreCase("com.homwee.multiscreenshare")) {
            stopSelf();
        } else {
            stopSelf();
            Process.killProcess(Process.myPid());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f4647c = getApplicationContext();
        b();
        c();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
