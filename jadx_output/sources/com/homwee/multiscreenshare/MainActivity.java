package com.homwee.multiscreenshare;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.homwee.multiscreenshare.bean.RemoteConfigBean;
import com.homwee.multiscreenshare.view.VerticalViewPager;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends androidx.appcompat.app.c {
    public static Boolean s = Boolean.FALSE;
    private RecyclerView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private ImageView F;
    private ImageView G;
    private ConstraintLayout H;
    private RemoteConfigBean L;
    private String N;
    public Context O;
    private MyApplication Q;
    private VerticalViewPager v;
    private com.homwee.multiscreenshare.q.a w;
    private com.homwee.multiscreenshare.q.b x;
    private com.homwee.multiscreenshare.r.b y;
    private Context z;
    private ArrayList<com.homwee.multiscreenshare.view.e> t = new ArrayList<>();
    private ArrayList<com.homwee.multiscreenshare.view.g> u = new ArrayList<>();
    private androidx.lifecycle.l<String> I = new androidx.lifecycle.l<>();
    private androidx.lifecycle.l<String> J = new androidx.lifecycle.l<>();
    private d.a.j.a K = new d.a.j.a();
    private int M = 0;
    private boolean P = false;
    private BroadcastReceiver R = new b();
    private BroadcastReceiver S = new c();
    private BroadcastReceiver T = new d();
    private BroadcastReceiver U = new e();
    private BroadcastReceiver V = new f();
    private final BroadcastReceiver W = new g();
    private ServiceConnection X = new h();
    private ServiceConnection Y = new i();

    class a implements ViewPager.j {
        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f2, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            if (MainActivity.this.M > -1 && MainActivity.this.M < MainActivity.this.u.size()) {
                ((com.homwee.multiscreenshare.view.e) MainActivity.this.t.get(MainActivity.this.M)).f(false);
                com.homwee.multiscreenshare.r.g.b(MainActivity.this.A.getChildAt(MainActivity.this.M));
                MainActivity.this.w.j(MainActivity.this.M, Boolean.FALSE);
                ((com.homwee.multiscreenshare.view.g) MainActivity.this.u.get(MainActivity.this.M)).o(false);
            }
            ((com.homwee.multiscreenshare.view.e) MainActivity.this.t.get(i)).f(true);
            com.homwee.multiscreenshare.r.g.a(MainActivity.this.A.getChildAt(i));
            MainActivity.this.w.j(i, Boolean.FALSE);
            MainActivity.this.M = i;
            ((com.homwee.multiscreenshare.view.g) MainActivity.this.u.get(i)).o(true);
        }
    }

    class b extends BroadcastReceiver {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ boolean b(com.homwee.multiscreenshare.view.e eVar) {
            return (!MainActivity.this.L.getScreenShareTag() && eVar.c().equals("screen_share_tag")) || (!MainActivity.this.L.getDlnaTag() && eVar.c().equals("dlna_config_tag")) || (!MainActivity.this.L.getAirplayTag() && eVar.c().equals("airplay_tag"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ boolean d(com.homwee.multiscreenshare.view.g gVar) {
            return (!MainActivity.this.L.getScreenShareTag() && gVar.m().equals("screen_share_tag")) || (!MainActivity.this.L.getDlnaTag() && gVar.m().equals("dlna_config_tag")) || (!MainActivity.this.L.getAirplayTag() && gVar.m().equals("airplay_tag"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.homwee.intent.action.RemoteConfigReceiver".equals(intent.getAction())) {
                MainActivity.this.L = com.homwee.multiscreenshare.r.f.b();
                MainActivity.this.C0();
                int size = MainActivity.this.t.size();
                if (MainActivity.this.L != null) {
                    MainActivity.this.t.removeIf(new Predicate() { // from class: com.homwee.multiscreenshare.f
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return this.f4654a.b((com.homwee.multiscreenshare.view.e) obj);
                        }
                    });
                    MainActivity.this.u.removeIf(new Predicate() { // from class: com.homwee.multiscreenshare.e
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return this.f4653a.d((com.homwee.multiscreenshare.view.g) obj);
                        }
                    });
                    MainActivity.this.w.i();
                    MainActivity.this.x.i();
                    if (size != MainActivity.this.t.size()) {
                        MainActivity.this.v.setCurrentItem(0);
                    }
                }
            }
        }
    }

    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.google.android.tv.intent.action.USER_DEVICE_NAME_UPDATED".equals(intent.getAction())) {
                MainActivity.this.A0();
            }
        }
    }

    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            com.homwee.multiscreenshare.r.e.d("action is = " + action);
            if (action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                String stringExtra = intent.getStringExtra("reason");
                com.homwee.multiscreenshare.r.e.d("reason is = " + stringExtra);
                if (!"homekey".equals(stringExtra)) {
                    return;
                }
            } else if (!action.equals("com.changhong.mmp.stop_by_kill")) {
                return;
            }
            MainActivity.this.z0();
            MainActivity.this.finish();
        }
    }

    class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MainActivity.this.finish();
        }
    }

    class f extends BroadcastReceiver {
        f() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                MainActivity.this.B0();
            }
        }
    }

    class g extends BroadcastReceiver {
        g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
                com.homwee.multiscreenshare.r.e.d("2024/12/10 SCREEN OFF FINISH !!!");
                MainActivity.this.finish();
            }
        }
    }

    class h implements ServiceConnection {
        h() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    class i implements ServiceConnection {
        i() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    class j implements com.homwee.multiscreenshare.q.b.a {
        j() {
        }

        @Override // com.homwee.multiscreenshare.q.b.a
        public View a(int i) {
            ((com.homwee.multiscreenshare.view.g) MainActivity.this.u.get(0)).o(true);
            return ((com.homwee.multiscreenshare.view.g) MainActivity.this.u.get(i)).l();
        }

        @Override // com.homwee.multiscreenshare.q.b.a
        public int b() {
            return MainActivity.this.u.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.homwee.mmp.screenshare", "com.changhong.mmp.airplay.service.AirPlayInitService"));
        RemoteConfigBean remoteConfigBean = this.L;
        if (remoteConfigBean != null) {
            intent.putExtra("airplay", remoteConfigBean.getAirplayTag());
            intent.putExtra("dlna_config", this.L.getDlnaTag());
            intent.putExtra("screen_share", this.L.getScreenShareTag());
        }
        startForegroundService(intent);
        com.homwee.multiscreenshare.r.e.d("start mmp airplay");
    }

    private void D0() {
        com.homwee.multiscreenshare.r.e.d("MiracastService come from MultiscreenShare !!!!!!!!!");
        Intent intent = new Intent();
        RemoteConfigBean remoteConfigBean = this.L;
        if (remoteConfigBean != null) {
            intent.putExtra("screen_share", remoteConfigBean.getScreenShareTag());
        }
        intent.setComponent(new ComponentName("com.mediatek.androidbox", "com.mediatek.androidbox.MiracastService"));
        startForegroundService(intent);
    }

    private void F0() {
        unbindService(this.X);
        com.homwee.multiscreenshare.r.e.d("unbindService");
    }

    private void G0() {
        unbindService(this.Y);
        com.homwee.multiscreenshare.r.e.d("unbindService");
    }

    private void W() {
        this.I.f(this, new androidx.lifecycle.m() { // from class: com.homwee.multiscreenshare.h
            @Override // androidx.lifecycle.m
            public final void a(Object obj) {
                this.f4657a.m0((String) obj);
            }
        });
        this.J.f(this, new androidx.lifecycle.m() { // from class: com.homwee.multiscreenshare.d
            @Override // androidx.lifecycle.m
            public final void a(Object obj) {
                this.f4652a.o0((String) obj);
            }
        });
    }

    private void X() {
        Intent intent = new Intent();
        intent.setClassName("com.mediatek.androidbox", "com.mediatek.androidbox.MiracastService");
        bindService(intent, this.X, 1);
        com.homwee.multiscreenshare.r.e.d("bindService");
    }

    private void Y() {
        Intent intent = new Intent();
        intent.setClassName("com.homwee.mmp.screenshare", "com.changhong.mmp.airplay.service.AirPlayInitService");
        bindService(intent, this.Y, 1);
        com.homwee.multiscreenshare.r.e.d("bindService");
    }

    private synchronized d.a.c<Bitmap> Z(final String str, final int i2) {
        if (this.P) {
            return d.a.c.c(new d.a.e() { // from class: com.homwee.multiscreenshare.j
                @Override // d.a.e
                public final void a(d.a.d dVar) {
                    dVar.a(b.a.a.a.a.c(str, i2, -16777216, BitmapFactory.decodeResource(MyApplication.c().getResources(), R.drawable.icon_kajito)));
                }
            }).i(d.a.o.a.a());
        }
        return d.a.c.c(new d.a.e() { // from class: com.homwee.multiscreenshare.i
            @Override // d.a.e
            public final void a(d.a.d dVar) {
                dVar.a(b.a.a.a.a.c(str, i2, -16777216, BitmapFactory.decodeResource(MyApplication.c().getResources(), R.drawable.icon_pango_remote)));
            }
        }).i(d.a.o.a.a());
    }

    private void c0(ViewPager viewPager) {
        com.homwee.multiscreenshare.r.b bVar = new com.homwee.multiscreenshare.r.b(viewPager.getContext(), new AccelerateDecelerateInterpolator());
        this.y = bVar;
        bVar.b(200);
        this.y.a(viewPager);
    }

    private String d0() {
        try {
            NetworkInterface byName = NetworkInterface.getByName("eth0");
            if (byName == null) {
                return "";
            }
            byte[] hardwareAddress = byName.getHardwareAddress();
            return String.format("%02x:%02x:%02x:%02x:%02x:%02x", Byte.valueOf(hardwareAddress[0]), Byte.valueOf(hardwareAddress[1]), Byte.valueOf(hardwareAddress[2]), Byte.valueOf(hardwareAddress[3]), Byte.valueOf(hardwareAddress[4]), Byte.valueOf(hardwareAddress[5]));
        } catch (SocketException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public static String e0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0116  */
    /* JADX WARN: Code duplicated, block: B:32:0x012d  */
    /* JADX WARN: Code duplicated, block: B:35:0x015d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0164  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:42:0x022d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0285  */
    /* JADX WARN: Code duplicated, block: B:50:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:57:0x031d  */
    /* JADX WARN: Code duplicated, block: B:59:0x034c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0350  */
    /* JADX WARN: Code duplicated, block: B:62:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:66:0x0446  */
    /* JADX WARN: Code duplicated, block: B:70:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:74:0x051d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0521  */
    /* JADX WARN: Code duplicated, block: B:77:0x0546  */
    private void f0() {
        ArrayList<com.homwee.multiscreenshare.view.g> arrayList;
        com.homwee.multiscreenshare.view.g gVar;
        RemoteConfigBean remoteConfigBean;
        ArrayList<com.homwee.multiscreenshare.view.e> arrayList2;
        com.homwee.multiscreenshare.view.e eVar;
        ArrayList arrayList3;
        com.homwee.multiscreenshare.view.a aVar;
        RemoteConfigBean remoteConfigBean2;
        ArrayList arrayList4;
        com.homwee.multiscreenshare.view.a aVar2;
        RemoteConfigBean remoteConfigBean3;
        ArrayList arrayList5;
        com.homwee.multiscreenshare.view.a aVar3;
        ArrayList arrayList6;
        com.homwee.multiscreenshare.view.a aVar4;
        this.t.clear();
        this.u.clear();
        String strA = MyApplication.a("FACTORY_CONFIG", "FORCE_HDCP2X");
        String strE0 = e0("ro.board.platform");
        com.homwee.multiscreenshare.r.e.d("platForm = " + strE0);
        Integer numValueOf = Integer.valueOf(R.drawable.icon_tv_miracast_selected);
        Integer numValueOf2 = Integer.valueOf(R.drawable.icon_tv_miracast);
        if (strE0 == null) {
            this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_miracast), numValueOf2, numValueOf, ""));
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(k0() ? new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast_rtl) : new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast));
            arrayList = this.u;
            gVar = new com.homwee.multiscreenshare.view.g(arrayList7, this.z, "");
        } else {
            if (strE0.equalsIgnoreCase("mt5867")) {
                if (strA != null && strA.equalsIgnoreCase("1")) {
                    this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_miracast), numValueOf2, numValueOf, ""));
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(k0() ? new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast_rtl) : new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast));
                    arrayList = this.u;
                    gVar = new com.homwee.multiscreenshare.view.g(arrayList8, this.z, "");
                }
                remoteConfigBean = this.L;
                if (remoteConfigBean != null || remoteConfigBean.getScreenShareTag()) {
                    if (this.P) {
                        arrayList2 = this.t;
                        eVar = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_pango_kajito), Integer.valueOf(R.drawable.icon_tv_cast_android), Integer.valueOf(R.drawable.icon_tv_cast_android_select), "screen_share_tag");
                    } else {
                        arrayList2 = this.t;
                        eVar = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_pango), Integer.valueOf(R.drawable.icon_tv_cast_android), Integer.valueOf(R.drawable.icon_tv_cast_android_select), "screen_share_tag");
                    }
                    arrayList2.add(eVar);
                    arrayList3 = new ArrayList();
                    if (k0()) {
                        if (this.P) {
                            arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01_kajito, R.drawable.img_screen_cast_01_rtl, R.string.qr_install_connect_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                                @Override // com.homwee.multiscreenshare.view.b.a
                                public final void a(ImageView imageView) {
                                    this.f4651a.b0(imageView);
                                }
                            }));
                            arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info_kajito, R.drawable.img_screen_cast_02_rtl_new, 1, R.drawable.icon_kajito, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                                @Override // com.homwee.multiscreenshare.view.c.a
                                public final void a(ImageView imageView) {
                                    this.f4649a.a0(imageView);
                                }
                            }));
                            aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03_kajito, R.string.str_screen_cast_03_info_kajito, R.drawable.img_screen_cast_03_rtl_new, 1, R.drawable.icon_kajito);
                        } else {
                            arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01, R.drawable.img_screen_cast_01_rtl, R.string.qr_install_connect, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                                @Override // com.homwee.multiscreenshare.view.b.a
                                public final void a(ImageView imageView) {
                                    this.f4651a.b0(imageView);
                                }
                            }));
                            arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info, R.drawable.img_screen_cast_02_rtl_new, 1, R.drawable.icon_pango_remote, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                                @Override // com.homwee.multiscreenshare.view.c.a
                                public final void a(ImageView imageView) {
                                    this.f4649a.a0(imageView);
                                }
                            }));
                            aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03, R.string.str_screen_cast_03_info, R.drawable.img_screen_cast_03_rtl_new, 1, R.drawable.icon_pango_remote);
                        }
                    } else if (this.P) {
                        arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01_kajito, R.drawable.img_screen_cast_01, R.string.qr_install_connect_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                            @Override // com.homwee.multiscreenshare.view.b.a
                            public final void a(ImageView imageView) {
                                this.f4651a.b0(imageView);
                            }
                        }));
                        arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info_kajito, R.drawable.img_screen_cast_02_new, 1, R.drawable.icon_kajito, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                            @Override // com.homwee.multiscreenshare.view.c.a
                            public final void a(ImageView imageView) {
                                this.f4649a.a0(imageView);
                            }
                        }));
                        aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03_kajito, R.string.str_screen_cast_03_info_kajito, R.drawable.img_screen_cast_03_new, 1, R.drawable.icon_kajito);
                    } else {
                        arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01, R.drawable.img_screen_cast_01, R.string.qr_install_connect, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                            @Override // com.homwee.multiscreenshare.view.b.a
                            public final void a(ImageView imageView) {
                                this.f4651a.b0(imageView);
                            }
                        }));
                        arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info, R.drawable.img_screen_cast_02_new, 1, R.drawable.icon_pango_remote, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                            @Override // com.homwee.multiscreenshare.view.c.a
                            public final void a(ImageView imageView) {
                                this.f4649a.a0(imageView);
                            }
                        }));
                        aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03, R.string.str_screen_cast_03_info, R.drawable.img_screen_cast_03_new, 1, R.drawable.icon_pango_remote);
                    }
                    arrayList3.add(aVar);
                    this.u.add(new com.homwee.multiscreenshare.view.g(arrayList3, this.z, "screen_share_tag"));
                }
                remoteConfigBean2 = this.L;
                if (remoteConfigBean2 != null || remoteConfigBean2.getAirplayTag()) {
                    this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), Integer.valueOf(R.drawable.icon_tv_iphone_new), Integer.valueOf(R.drawable.icon_tv_iphone_select), "airplay_tag"));
                    arrayList4 = new ArrayList();
                    if (k0()) {
                        arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01_rtl, 0, -1));
                        aVar2 = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03_rtl, 0, -1);
                    } else {
                        arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01, 0, -1));
                        aVar2 = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03, 0, -1);
                    }
                    arrayList4.add(aVar2);
                    this.u.add(new com.homwee.multiscreenshare.view.g(arrayList4, this.z, "airplay_tag"));
                }
                remoteConfigBean3 = this.L;
                if (remoteConfigBean3 != null || remoteConfigBean3.getDlnaTag()) {
                    this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.file_share), Integer.valueOf(R.drawable.icon_tv_share_new), Integer.valueOf(R.drawable.icon_tv_share_selected), "dlna_config_tag"));
                    arrayList5 = new ArrayList();
                    if (k0()) {
                        if (this.P) {
                            arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01_rtl, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                                @Override // com.homwee.multiscreenshare.view.b.a
                                public final void a(ImageView imageView) {
                                    this.f4651a.b0(imageView);
                                }
                            }));
                            arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02_kajito, R.string.str_file_share_02_info_kajito, R.drawable.img_file_share_02_rtl_new, 1, R.drawable.icon_kajito));
                            arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03_rtl, 0, -1));
                            aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04_rtl, 0, -1);
                        } else {
                            arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01_rtl, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                                @Override // com.homwee.multiscreenshare.view.b.a
                                public final void a(ImageView imageView) {
                                    this.f4651a.b0(imageView);
                                }
                            }));
                            arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02, R.string.str_file_share_02_info, R.drawable.img_file_share_02_rtl_new, 1, R.drawable.icon_pango_remote));
                            arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03_rtl, 0, -1));
                            aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04_rtl, 0, -1);
                        }
                    } else if (this.P) {
                        arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                            @Override // com.homwee.multiscreenshare.view.b.a
                            public final void a(ImageView imageView) {
                                this.f4651a.b0(imageView);
                            }
                        }));
                        arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02_kajito, R.string.str_file_share_02_info_kajito, R.drawable.img_file_share_02_new, 1, R.drawable.icon_kajito));
                        arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03, 0, -1));
                        aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04, 0, -1);
                    } else {
                        arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                            @Override // com.homwee.multiscreenshare.view.b.a
                            public final void a(ImageView imageView) {
                                this.f4651a.b0(imageView);
                            }
                        }));
                        arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02, R.string.str_file_share_02_info, R.drawable.img_file_share_02_new, 1, R.drawable.icon_pango_remote));
                        arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03, 0, -1));
                        aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04, 0, -1);
                    }
                    arrayList5.add(aVar3);
                    this.u.add(new com.homwee.multiscreenshare.view.g(arrayList5, this.z, "dlna_config_tag"));
                }
                this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.remote_control_app), Integer.valueOf(R.drawable.icon_tv_remote_new1), Integer.valueOf(R.drawable.icon_tv_remote_new1_select), ""));
                arrayList6 = new ArrayList();
                if (k0()) {
                    if (this.P) {
                        arrayList6.add(new com.homwee.multiscreenshare.view.b(R.string.str_remote_01_info_kajito, R.drawable.img_remote_01_rtl, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                            @Override // com.homwee.multiscreenshare.view.b.a
                            public final void a(ImageView imageView) {
                                this.f4651a.b0(imageView);
                            }
                        }));
                        aVar4 = new com.homwee.multiscreenshare.view.a(0, R.string.str_remote_03_info_kajito, R.drawable.img_remote_03_rtl_new, 1, R.drawable.icon_kajito);
                    } else {
                        arrayList6.add(new com.homwee.multiscreenshare.view.b(R.string.str_remote_01_info, R.drawable.img_remote_01_rtl, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                            @Override // com.homwee.multiscreenshare.view.b.a
                            public final void a(ImageView imageView) {
                                this.f4651a.b0(imageView);
                            }
                        }));
                        aVar4 = new com.homwee.multiscreenshare.view.a(0, R.string.str_remote_03_info, R.drawable.img_remote_03_rtl_new, 1, R.drawable.icon_pango_remote);
                    }
                } else if (this.P) {
                    arrayList6.add(new com.homwee.multiscreenshare.view.b(R.string.str_remote_01_info_kajito, R.drawable.img_remote_01, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    aVar4 = new com.homwee.multiscreenshare.view.a(0, R.string.str_remote_03_info_kajito, R.drawable.img_remote_03_new, 1, R.drawable.icon_kajito);
                } else {
                    arrayList6.add(new com.homwee.multiscreenshare.view.b(R.string.str_remote_01_info, R.drawable.img_remote_01, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    aVar4 = new com.homwee.multiscreenshare.view.a(0, R.string.str_remote_03_info, R.drawable.img_remote_03_new, 1, R.drawable.icon_pango_remote);
                }
                arrayList6.add(aVar4);
                this.u.add(new com.homwee.multiscreenshare.view.g(arrayList6, this.z, ""));
            }
            this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_miracast), numValueOf2, numValueOf, ""));
            ArrayList arrayList9 = new ArrayList();
            arrayList9.add(k0() ? new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast_rtl) : new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast));
            arrayList = this.u;
            gVar = new com.homwee.multiscreenshare.view.g(arrayList9, this.z, "");
        }
        arrayList.add(gVar);
        remoteConfigBean = this.L;
        if (remoteConfigBean != null) {
            if (this.P) {
                arrayList2 = this.t;
                eVar = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_pango_kajito), Integer.valueOf(R.drawable.icon_tv_cast_android), Integer.valueOf(R.drawable.icon_tv_cast_android_select), "screen_share_tag");
            } else {
                arrayList2 = this.t;
                eVar = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_pango), Integer.valueOf(R.drawable.icon_tv_cast_android), Integer.valueOf(R.drawable.icon_tv_cast_android_select), "screen_share_tag");
            }
            arrayList2.add(eVar);
            arrayList3 = new ArrayList();
            if (k0()) {
                if (this.P) {
                    arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01_kajito, R.drawable.img_screen_cast_01_rtl, R.string.qr_install_connect_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info_kajito, R.drawable.img_screen_cast_02_rtl_new, 1, R.drawable.icon_kajito, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                        @Override // com.homwee.multiscreenshare.view.c.a
                        public final void a(ImageView imageView) {
                            this.f4649a.a0(imageView);
                        }
                    }));
                    aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03_kajito, R.string.str_screen_cast_03_info_kajito, R.drawable.img_screen_cast_03_rtl_new, 1, R.drawable.icon_kajito);
                } else {
                    arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01, R.drawable.img_screen_cast_01_rtl, R.string.qr_install_connect, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info, R.drawable.img_screen_cast_02_rtl_new, 1, R.drawable.icon_pango_remote, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                        @Override // com.homwee.multiscreenshare.view.c.a
                        public final void a(ImageView imageView) {
                            this.f4649a.a0(imageView);
                        }
                    }));
                    aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03, R.string.str_screen_cast_03_info, R.drawable.img_screen_cast_03_rtl_new, 1, R.drawable.icon_pango_remote);
                }
            } else if (this.P) {
                arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01_kajito, R.drawable.img_screen_cast_01, R.string.qr_install_connect_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info_kajito, R.drawable.img_screen_cast_02_new, 1, R.drawable.icon_kajito, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                    @Override // com.homwee.multiscreenshare.view.c.a
                    public final void a(ImageView imageView) {
                        this.f4649a.a0(imageView);
                    }
                }));
                aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03_kajito, R.string.str_screen_cast_03_info_kajito, R.drawable.img_screen_cast_03_new, 1, R.drawable.icon_kajito);
            } else {
                arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01, R.drawable.img_screen_cast_01, R.string.qr_install_connect, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info, R.drawable.img_screen_cast_02_new, 1, R.drawable.icon_pango_remote, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                    @Override // com.homwee.multiscreenshare.view.c.a
                    public final void a(ImageView imageView) {
                        this.f4649a.a0(imageView);
                    }
                }));
                aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03, R.string.str_screen_cast_03_info, R.drawable.img_screen_cast_03_new, 1, R.drawable.icon_pango_remote);
            }
            arrayList3.add(aVar);
            this.u.add(new com.homwee.multiscreenshare.view.g(arrayList3, this.z, "screen_share_tag"));
        } else {
            if (this.P) {
                arrayList2 = this.t;
                eVar = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_pango_kajito), Integer.valueOf(R.drawable.icon_tv_cast_android), Integer.valueOf(R.drawable.icon_tv_cast_android_select), "screen_share_tag");
            } else {
                arrayList2 = this.t;
                eVar = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_pango), Integer.valueOf(R.drawable.icon_tv_cast_android), Integer.valueOf(R.drawable.icon_tv_cast_android_select), "screen_share_tag");
            }
            arrayList2.add(eVar);
            arrayList3 = new ArrayList();
            if (k0()) {
                if (this.P) {
                    arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01_kajito, R.drawable.img_screen_cast_01_rtl, R.string.qr_install_connect_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info_kajito, R.drawable.img_screen_cast_02_rtl_new, 1, R.drawable.icon_kajito, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                        @Override // com.homwee.multiscreenshare.view.c.a
                        public final void a(ImageView imageView) {
                            this.f4649a.a0(imageView);
                        }
                    }));
                    aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03_kajito, R.string.str_screen_cast_03_info_kajito, R.drawable.img_screen_cast_03_rtl_new, 1, R.drawable.icon_kajito);
                } else {
                    arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01, R.drawable.img_screen_cast_01_rtl, R.string.qr_install_connect, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info, R.drawable.img_screen_cast_02_rtl_new, 1, R.drawable.icon_pango_remote, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                        @Override // com.homwee.multiscreenshare.view.c.a
                        public final void a(ImageView imageView) {
                            this.f4649a.a0(imageView);
                        }
                    }));
                    aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03, R.string.str_screen_cast_03_info, R.drawable.img_screen_cast_03_rtl_new, 1, R.drawable.icon_pango_remote);
                }
            } else if (this.P) {
                arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01_kajito, R.drawable.img_screen_cast_01, R.string.qr_install_connect_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info_kajito, R.drawable.img_screen_cast_02_new, 1, R.drawable.icon_kajito, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                    @Override // com.homwee.multiscreenshare.view.c.a
                    public final void a(ImageView imageView) {
                        this.f4649a.a0(imageView);
                    }
                }));
                aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03_kajito, R.string.str_screen_cast_03_info_kajito, R.drawable.img_screen_cast_03_new, 1, R.drawable.icon_kajito);
            } else {
                arrayList3.add(new com.homwee.multiscreenshare.view.b(R.string.str_screen_cast_01, R.drawable.img_screen_cast_01, R.string.qr_install_connect, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                arrayList3.add(new com.homwee.multiscreenshare.view.c(R.string.str_screen_cast_02, R.string.str_screen_cast_02_info, R.drawable.img_screen_cast_02_new, 1, R.drawable.icon_pango_remote, new com.homwee.multiscreenshare.view.c.a() { // from class: com.homwee.multiscreenshare.a
                    @Override // com.homwee.multiscreenshare.view.c.a
                    public final void a(ImageView imageView) {
                        this.f4649a.a0(imageView);
                    }
                }));
                aVar = new com.homwee.multiscreenshare.view.a(R.string.str_screen_cast_03, R.string.str_screen_cast_03_info, R.drawable.img_screen_cast_03_new, 1, R.drawable.icon_pango_remote);
            }
            arrayList3.add(aVar);
            this.u.add(new com.homwee.multiscreenshare.view.g(arrayList3, this.z, "screen_share_tag"));
        }
        remoteConfigBean2 = this.L;
        if (remoteConfigBean2 != null) {
            this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), Integer.valueOf(R.drawable.icon_tv_iphone_new), Integer.valueOf(R.drawable.icon_tv_iphone_select), "airplay_tag"));
            arrayList4 = new ArrayList();
            if (k0()) {
                arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01_rtl, 0, -1));
                aVar2 = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03_rtl, 0, -1);
            } else {
                arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01, 0, -1));
                aVar2 = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03, 0, -1);
            }
            arrayList4.add(aVar2);
            this.u.add(new com.homwee.multiscreenshare.view.g(arrayList4, this.z, "airplay_tag"));
        } else {
            this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), Integer.valueOf(R.drawable.icon_tv_iphone_new), Integer.valueOf(R.drawable.icon_tv_iphone_select), "airplay_tag"));
            arrayList4 = new ArrayList();
            if (k0()) {
                arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01_rtl, 0, -1));
                aVar2 = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03_rtl, 0, -1);
            } else {
                arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01, 0, -1));
                aVar2 = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03, 0, -1);
            }
            arrayList4.add(aVar2);
            this.u.add(new com.homwee.multiscreenshare.view.g(arrayList4, this.z, "airplay_tag"));
        }
        remoteConfigBean3 = this.L;
        if (remoteConfigBean3 != null) {
            this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.file_share), Integer.valueOf(R.drawable.icon_tv_share_new), Integer.valueOf(R.drawable.icon_tv_share_selected), "dlna_config_tag"));
            arrayList5 = new ArrayList();
            if (k0()) {
                if (this.P) {
                    arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01_rtl, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02_kajito, R.string.str_file_share_02_info_kajito, R.drawable.img_file_share_02_rtl_new, 1, R.drawable.icon_kajito));
                    arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03_rtl, 0, -1));
                    aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04_rtl, 0, -1);
                } else {
                    arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01_rtl, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02, R.string.str_file_share_02_info, R.drawable.img_file_share_02_rtl_new, 1, R.drawable.icon_pango_remote));
                    arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03_rtl, 0, -1));
                    aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04_rtl, 0, -1);
                }
            } else if (this.P) {
                arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02_kajito, R.string.str_file_share_02_info_kajito, R.drawable.img_file_share_02_new, 1, R.drawable.icon_kajito));
                arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03, 0, -1));
                aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04, 0, -1);
            } else {
                arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02, R.string.str_file_share_02_info, R.drawable.img_file_share_02_new, 1, R.drawable.icon_pango_remote));
                arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03, 0, -1));
                aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04, 0, -1);
            }
            arrayList5.add(aVar3);
            this.u.add(new com.homwee.multiscreenshare.view.g(arrayList5, this.z, "dlna_config_tag"));
        } else {
            this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.file_share), Integer.valueOf(R.drawable.icon_tv_share_new), Integer.valueOf(R.drawable.icon_tv_share_selected), "dlna_config_tag"));
            arrayList5 = new ArrayList();
            if (k0()) {
                if (this.P) {
                    arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01_rtl, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02_kajito, R.string.str_file_share_02_info_kajito, R.drawable.img_file_share_02_rtl_new, 1, R.drawable.icon_kajito));
                    arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03_rtl, 0, -1));
                    aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04_rtl, 0, -1);
                } else {
                    arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01_rtl, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                        @Override // com.homwee.multiscreenshare.view.b.a
                        public final void a(ImageView imageView) {
                            this.f4651a.b0(imageView);
                        }
                    }));
                    arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02, R.string.str_file_share_02_info, R.drawable.img_file_share_02_rtl_new, 1, R.drawable.icon_pango_remote));
                    arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03_rtl, 0, -1));
                    aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04_rtl, 0, -1);
                }
            } else if (this.P) {
                arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02_kajito, R.string.str_file_share_02_info_kajito, R.drawable.img_file_share_02_new, 1, R.drawable.icon_kajito));
                arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03, 0, -1));
                aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04, 0, -1);
            } else {
                arrayList5.add(new com.homwee.multiscreenshare.view.b(R.string.str_file_share_01_info, R.drawable.img_file_share_01, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_02, R.string.str_file_share_02_info, R.drawable.img_file_share_02_new, 1, R.drawable.icon_pango_remote));
                arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03, 0, -1));
                aVar3 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04, 0, -1);
            }
            arrayList5.add(aVar3);
            this.u.add(new com.homwee.multiscreenshare.view.g(arrayList5, this.z, "dlna_config_tag"));
        }
        this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.remote_control_app), Integer.valueOf(R.drawable.icon_tv_remote_new1), Integer.valueOf(R.drawable.icon_tv_remote_new1_select), ""));
        arrayList6 = new ArrayList();
        if (k0()) {
            if (this.P) {
                arrayList6.add(new com.homwee.multiscreenshare.view.b(R.string.str_remote_01_info_kajito, R.drawable.img_remote_01_rtl, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                aVar4 = new com.homwee.multiscreenshare.view.a(0, R.string.str_remote_03_info_kajito, R.drawable.img_remote_03_rtl_new, 1, R.drawable.icon_kajito);
            } else {
                arrayList6.add(new com.homwee.multiscreenshare.view.b(R.string.str_remote_01_info, R.drawable.img_remote_01_rtl, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                    @Override // com.homwee.multiscreenshare.view.b.a
                    public final void a(ImageView imageView) {
                        this.f4651a.b0(imageView);
                    }
                }));
                aVar4 = new com.homwee.multiscreenshare.view.a(0, R.string.str_remote_03_info, R.drawable.img_remote_03_rtl_new, 1, R.drawable.icon_pango_remote);
            }
        } else if (this.P) {
            arrayList6.add(new com.homwee.multiscreenshare.view.b(R.string.str_remote_01_info_kajito, R.drawable.img_remote_01, R.string.qr_install_ios_kajito, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                @Override // com.homwee.multiscreenshare.view.b.a
                public final void a(ImageView imageView) {
                    this.f4651a.b0(imageView);
                }
            }));
            aVar4 = new com.homwee.multiscreenshare.view.a(0, R.string.str_remote_03_info_kajito, R.drawable.img_remote_03_new, 1, R.drawable.icon_kajito);
        } else {
            arrayList6.add(new com.homwee.multiscreenshare.view.b(R.string.str_remote_01_info, R.drawable.img_remote_01, R.string.qr_install_ios, new com.homwee.multiscreenshare.view.b.a() { // from class: com.homwee.multiscreenshare.c
                @Override // com.homwee.multiscreenshare.view.b.a
                public final void a(ImageView imageView) {
                    this.f4651a.b0(imageView);
                }
            }));
            aVar4 = new com.homwee.multiscreenshare.view.a(0, R.string.str_remote_03_info, R.drawable.img_remote_03_new, 1, R.drawable.icon_pango_remote);
        }
        arrayList6.add(aVar4);
        this.u.add(new com.homwee.multiscreenshare.view.g(arrayList6, this.z, ""));
    }

    private void g0() {
        this.A = (RecyclerView) findViewById(R.id.activity_list_view);
        this.w = new com.homwee.multiscreenshare.q.a(this.t, this.z);
        this.A.setLayoutManager(new LinearLayoutManager(this));
        this.A.h(new com.homwee.multiscreenshare.q.c(com.blankj.utilcode.util.i.a(8.0f)));
        this.A.setAdapter(this.w);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01e3 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:60:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:61:0x021e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0284  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ac  */
    private void h0() {
        ArrayList<com.homwee.multiscreenshare.view.e> arrayList;
        com.homwee.multiscreenshare.view.e eVar;
        ArrayList<com.homwee.multiscreenshare.view.g> arrayList2;
        com.homwee.multiscreenshare.view.g gVar;
        RemoteConfigBean remoteConfigBean;
        ArrayList<com.homwee.multiscreenshare.view.e> arrayList3;
        com.homwee.multiscreenshare.view.e eVar2;
        ArrayList arrayList4;
        com.homwee.multiscreenshare.view.a aVar;
        RemoteConfigBean remoteConfigBean2;
        ArrayList arrayList5;
        com.homwee.multiscreenshare.view.a aVar2;
        ArrayList<com.homwee.multiscreenshare.view.e> arrayList6;
        com.homwee.multiscreenshare.view.e eVar3;
        ArrayList<com.homwee.multiscreenshare.view.e> arrayList7;
        com.homwee.multiscreenshare.view.e eVar4;
        this.t.clear();
        this.u.clear();
        String strA = MyApplication.a("FACTORY_CONFIG", "FORCE_HDCP2X");
        String strE0 = e0("ro.board.platform");
        com.homwee.multiscreenshare.r.e.d("platForm = " + strE0);
        Integer numValueOf = Integer.valueOf(R.drawable.icon_tv_iphone_select);
        Integer numValueOf2 = Integer.valueOf(R.drawable.icon_tv_iphone_new);
        if (strE0 == null) {
            if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa") && Build.BRAND.equals("oboni")) {
                arrayList = this.t;
                eVar = new com.homwee.multiscreenshare.view.e("Mirror for Android", numValueOf2, numValueOf, "");
            } else {
                arrayList = this.t;
                eVar = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_android), numValueOf2, numValueOf, "");
            }
            arrayList.add(eVar);
            ArrayList arrayList8 = new ArrayList();
            arrayList8.add(k0() ? new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast_rtl) : new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast));
            arrayList2 = this.u;
            gVar = new com.homwee.multiscreenshare.view.g(arrayList8, this.z, "");
        } else {
            if (strE0.equalsIgnoreCase("mt5867")) {
                if (strA != null && strA.equalsIgnoreCase("1")) {
                    if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa") && Build.BRAND.equals("oboni")) {
                        arrayList7 = this.t;
                        eVar4 = new com.homwee.multiscreenshare.view.e("Mirror for Android", numValueOf2, numValueOf, "");
                    } else {
                        arrayList7 = this.t;
                        eVar4 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_android), numValueOf2, numValueOf, "");
                    }
                    arrayList7.add(eVar4);
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.add(k0() ? new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast_rtl) : new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast));
                    arrayList2 = this.u;
                    gVar = new com.homwee.multiscreenshare.view.g(arrayList9, this.z, "");
                }
                remoteConfigBean = this.L;
                if (remoteConfigBean != null || remoteConfigBean.getAirplayTag()) {
                    if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa") || !Build.BRAND.equals("oboni")) {
                        arrayList3 = this.t;
                        eVar2 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), numValueOf2, numValueOf, "airplay_tag");
                        arrayList3.add(eVar2);
                    } else {
                        this.t.add(new com.homwee.multiscreenshare.view.e("Mirror for iOS", numValueOf2, numValueOf, "airplay_tag"));
                    }
                    arrayList4 = new ArrayList();
                    if (k0()) {
                        arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01_rtl, 0, -1));
                        aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03_rtl, 0, -1);
                    } else {
                        arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01, 0, -1));
                        aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03, 0, -1);
                    }
                    arrayList4.add(aVar);
                    this.u.add(new com.homwee.multiscreenshare.view.g(arrayList4, this.z, "airplay_tag"));
                }
                remoteConfigBean2 = this.L;
                if (remoteConfigBean2 != null || remoteConfigBean2.getDlnaTag()) {
                    this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.file_share), Integer.valueOf(R.drawable.icon_tv_share_new), Integer.valueOf(R.drawable.icon_tv_share_selected), "dlna_config_tag"));
                    arrayList5 = new ArrayList();
                    if (k0()) {
                        arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03_rtl, 0, -1));
                        aVar2 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04_rtl, 0, -1);
                    } else {
                        arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03, 0, -1));
                        aVar2 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04, 0, -1);
                    }
                    arrayList5.add(aVar2);
                    this.u.add(new com.homwee.multiscreenshare.view.g(arrayList5, this.z, "dlna_config_tag"));
                }
                return;
            }
            if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa") && Build.BRAND.equals("oboni")) {
                arrayList6 = this.t;
                eVar3 = new com.homwee.multiscreenshare.view.e("Mirror for Android", numValueOf2, numValueOf, "");
            } else {
                arrayList6 = this.t;
                eVar3 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_android), numValueOf2, numValueOf, "");
            }
            arrayList6.add(eVar3);
            ArrayList arrayList10 = new ArrayList();
            arrayList10.add(k0() ? new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast_rtl) : new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast));
            arrayList2 = this.u;
            gVar = new com.homwee.multiscreenshare.view.g(arrayList10, this.z, "");
        }
        arrayList2.add(gVar);
        remoteConfigBean = this.L;
        if (remoteConfigBean != null) {
            if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa")) {
                arrayList3 = this.t;
                eVar2 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), numValueOf2, numValueOf, "airplay_tag");
            } else {
                arrayList3 = this.t;
                eVar2 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), numValueOf2, numValueOf, "airplay_tag");
            }
            arrayList3.add(eVar2);
            arrayList4 = new ArrayList();
            if (k0()) {
                arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01_rtl, 0, -1));
                aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03_rtl, 0, -1);
            } else {
                arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01, 0, -1));
                aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03, 0, -1);
            }
            arrayList4.add(aVar);
            this.u.add(new com.homwee.multiscreenshare.view.g(arrayList4, this.z, "airplay_tag"));
        } else {
            if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa")) {
                arrayList3 = this.t;
                eVar2 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), numValueOf2, numValueOf, "airplay_tag");
            } else {
                arrayList3 = this.t;
                eVar2 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), numValueOf2, numValueOf, "airplay_tag");
            }
            arrayList3.add(eVar2);
            arrayList4 = new ArrayList();
            if (k0()) {
                arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01_rtl, 0, -1));
                aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03_rtl, 0, -1);
            } else {
                arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01, 0, -1));
                aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03, 0, -1);
            }
            arrayList4.add(aVar);
            this.u.add(new com.homwee.multiscreenshare.view.g(arrayList4, this.z, "airplay_tag"));
        }
        remoteConfigBean2 = this.L;
        if (remoteConfigBean2 != null) {
        }
        this.t.add(new com.homwee.multiscreenshare.view.e(getString(R.string.file_share), Integer.valueOf(R.drawable.icon_tv_share_new), Integer.valueOf(R.drawable.icon_tv_share_selected), "dlna_config_tag"));
        arrayList5 = new ArrayList();
        if (k0()) {
            arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03_rtl, 0, -1));
            aVar2 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04_rtl, 0, -1);
        } else {
            arrayList5.add(new com.homwee.multiscreenshare.view.a(R.string.str_file_share_03, R.string.str_file_share_03_info, R.drawable.img_file_share_03, 0, -1));
            aVar2 = new com.homwee.multiscreenshare.view.a(R.string.str_file_share_04, R.string.str_file_share_04_info, R.drawable.img_file_share_04, 0, -1);
        }
        arrayList5.add(aVar2);
        this.u.add(new com.homwee.multiscreenshare.view.g(arrayList5, this.z, "dlna_config_tag"));
    }

    private void i0() {
        this.x = new com.homwee.multiscreenshare.q.b(new j());
        VerticalViewPager verticalViewPager = (VerticalViewPager) findViewById(R.id.activity_vertical_viewPager);
        this.v = verticalViewPager;
        verticalViewPager.setAdapter(this.x);
        this.v.setCurrentItem(0);
        c0(this.v);
        this.v.b(new a());
        this.A.setFocusable(false);
        this.A.post(new Runnable() { // from class: com.homwee.multiscreenshare.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f4664b.w0();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:43:0x017f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0189  */
    /* JADX WARN: Code duplicated, block: B:47:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c7  */
    private void j0() {
        ArrayList<com.homwee.multiscreenshare.view.e> arrayList;
        com.homwee.multiscreenshare.view.e eVar;
        ArrayList<com.homwee.multiscreenshare.view.g> arrayList2;
        com.homwee.multiscreenshare.view.g gVar;
        RemoteConfigBean remoteConfigBean;
        ArrayList<com.homwee.multiscreenshare.view.e> arrayList3;
        com.homwee.multiscreenshare.view.e eVar2;
        ArrayList arrayList4;
        com.homwee.multiscreenshare.view.a aVar;
        ArrayList<com.homwee.multiscreenshare.view.e> arrayList5;
        com.homwee.multiscreenshare.view.e eVar3;
        ArrayList<com.homwee.multiscreenshare.view.e> arrayList6;
        com.homwee.multiscreenshare.view.e eVar4;
        this.t.clear();
        this.u.clear();
        String strA = MyApplication.a("FACTORY_CONFIG", "FORCE_HDCP2X");
        String strE0 = e0("ro.board.platform");
        com.homwee.multiscreenshare.r.e.d("platForm = " + strE0);
        Integer numValueOf = Integer.valueOf(R.drawable.icon_tv_iphone_select);
        Integer numValueOf2 = Integer.valueOf(R.drawable.icon_tv_iphone_new);
        if (strE0 == null) {
            if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa")) {
                arrayList = this.t;
                eVar = new com.homwee.multiscreenshare.view.e("Mirror for Android", numValueOf2, numValueOf, "");
            } else {
                arrayList = this.t;
                eVar = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_android), numValueOf2, numValueOf, "");
            }
            arrayList.add(eVar);
            ArrayList arrayList7 = new ArrayList();
            arrayList7.add(k0() ? new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast_rtl) : new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast));
            arrayList2 = this.u;
            gVar = new com.homwee.multiscreenshare.view.g(arrayList7, this.z, "");
        } else {
            if (strE0.equalsIgnoreCase("mt5867")) {
                if (strA != null && strA.equalsIgnoreCase("1")) {
                    if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa")) {
                        arrayList6 = this.t;
                        eVar4 = new com.homwee.multiscreenshare.view.e("Mirror for Android", numValueOf2, numValueOf, "");
                    } else {
                        arrayList6 = this.t;
                        eVar4 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_android), numValueOf2, numValueOf, "");
                    }
                    arrayList6.add(eVar4);
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(k0() ? new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast_rtl) : new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast));
                    arrayList2 = this.u;
                    gVar = new com.homwee.multiscreenshare.view.g(arrayList8, this.z, "");
                }
                remoteConfigBean = this.L;
                if (remoteConfigBean != null || remoteConfigBean.getAirplayTag()) {
                    if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa")) {
                        arrayList3 = this.t;
                        eVar2 = new com.homwee.multiscreenshare.view.e("Mirror for iOS", numValueOf2, numValueOf, "airplay_tag");
                    } else {
                        arrayList3 = this.t;
                        eVar2 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), numValueOf2, numValueOf, "airplay_tag");
                    }
                    arrayList3.add(eVar2);
                    arrayList4 = new ArrayList();
                    if (k0()) {
                        arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01_rtl, 0, -1));
                        aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03_rtl, 0, -1);
                    } else {
                        arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01, 0, -1));
                        aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03, 0, -1);
                    }
                    arrayList4.add(aVar);
                    this.u.add(new com.homwee.multiscreenshare.view.g(arrayList4, this.z, "airplay_tag"));
                }
                return;
            }
            if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa")) {
                arrayList5 = this.t;
                eVar3 = new com.homwee.multiscreenshare.view.e("Mirror for Android", numValueOf2, numValueOf, "");
            } else {
                arrayList5 = this.t;
                eVar3 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_android), numValueOf2, numValueOf, "");
            }
            arrayList5.add(eVar3);
            ArrayList arrayList9 = new ArrayList();
            arrayList9.add(k0() ? new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast_rtl) : new com.homwee.multiscreenshare.view.d(this.N, 0, R.string.str_screen_cast_miracast_info, R.drawable.img_screen_cast_miracast));
            arrayList2 = this.u;
            gVar = new com.homwee.multiscreenshare.view.g(arrayList9, this.z, "");
        }
        arrayList2.add(gVar);
        remoteConfigBean = this.L;
        if (remoteConfigBean != null) {
        }
        if (this.O.getResources().getConfiguration().locale.getLanguage().endsWith("fa")) {
            arrayList3 = this.t;
            eVar2 = new com.homwee.multiscreenshare.view.e("Mirror for iOS", numValueOf2, numValueOf, "airplay_tag");
        } else {
            arrayList3 = this.t;
            eVar2 = new com.homwee.multiscreenshare.view.e(getString(R.string.mirror_for_ios), numValueOf2, numValueOf, "airplay_tag");
        }
        arrayList3.add(eVar2);
        arrayList4 = new ArrayList();
        if (k0()) {
            arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01_rtl, 0, -1));
            aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03_rtl, 0, -1);
        } else {
            arrayList4.add(new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_01_info, R.drawable.img_cast_iphone_01, 0, -1));
            aVar = new com.homwee.multiscreenshare.view.a(0, R.string.str_cast_iphone_03_info, R.drawable.img_cast_iphone_03, 0, -1);
        }
        arrayList4.add(aVar);
        this.u.add(new com.homwee.multiscreenshare.view.g(arrayList4, this.z, "airplay_tag"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m0(String str) {
        x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void o0(String str) {
        x0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void s0(ImageView imageView, Bitmap bitmap) {
        m.b(this).F(bitmap).W(false).n0(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void u0(ImageView imageView, Bitmap bitmap) {
        m.b(this).F(bitmap).W(false).n0(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w0() {
        this.t.get(0).f(true);
        com.homwee.multiscreenshare.r.g.a(this.A.getChildAt(0));
        this.w.i();
    }

    private void y0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.homwee.intent.action.RemoteConfigReceiver");
        registerReceiver(this.R, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.google.android.tv.intent.action.USER_DEVICE_NAME_UPDATED");
        registerReceiver(this.S, intentFilter2);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS");
        intentFilter3.addAction("com.changhong.mmp.stop_by_kill");
        registerReceiver(this.T, intentFilter3);
        IntentFilter intentFilter4 = new IntentFilter();
        intentFilter4.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(this.V, intentFilter4);
        IntentFilter intentFilter5 = new IntentFilter();
        intentFilter5.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.W, intentFilter5);
        a.n.a.a.b(this).c(this.U, new IntentFilter("ACTION_FINISH_SELF"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0() {
        Intent intent = new Intent("com.changhong.mmp.check_need_exit_airplay");
        intent.setComponent(new ComponentName("com.homwee.multiscreenshare", "com.homwee.multiscreenshare.AirPlayStopReceiver"));
        sendBroadcast(intent);
        com.homwee.multiscreenshare.r.e.d("send stop mmp airplay broadcast");
    }

    void A0() {
        String string;
        StringBuilder sb;
        StringBuilder sb2;
        String upperCase = d0().toUpperCase();
        String string2 = Settings.System.getString(getContentResolver(), "user_device_name");
        String str = "SmartTV";
        if (upperCase != null && upperCase.length() > 16) {
            String str2 = "(" + upperCase.substring(12, 14) + upperCase.substring(15, 17) + ")";
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Device");
            String str3 = Build.DEVICE;
            sb3.append(str3);
            sb3.append(",brand:");
            String str4 = Build.BRAND;
            sb3.append(str4);
            sb3.append(",ma:");
            sb3.append(str2);
            com.homwee.multiscreenshare.r.e.d(sb3.toString());
            if (str3.equals("jiri")) {
                if (!str4.equalsIgnoreCase("CHIQ")) {
                    if (!str4.equalsIgnoreCase("PHILIPS")) {
                        String str5 = Build.MODEL;
                        String str6 = "Thor T50";
                        if (!str5.equalsIgnoreCase("Thor T50")) {
                            str6 = "Thor T60";
                            if (!str5.equalsIgnoreCase("Thor T60")) {
                                str6 = "Thor Laser TV";
                                if (str5.equalsIgnoreCase("Thor Laser TV")) {
                                    if (string2 == null) {
                                        sb2 = new StringBuilder();
                                        sb2.append(str6);
                                        sb2.append(str2);
                                        string = sb2.toString();
                                    } else {
                                        sb = new StringBuilder();
                                    }
                                } else if (string2 == null) {
                                    string2 = "SmartTV" + str2;
                                }
                            } else if (string2 == null) {
                                sb2 = new StringBuilder();
                                sb2.append(str6);
                                sb2.append(str2);
                                string = sb2.toString();
                            } else {
                                sb = new StringBuilder();
                            }
                        } else if (string2 == null) {
                            sb2 = new StringBuilder();
                            sb2.append(str6);
                            sb2.append(str2);
                            string = sb2.toString();
                        } else {
                            sb = new StringBuilder();
                        }
                    } else if (string2 == null) {
                        sb2 = new StringBuilder();
                        str = "Screeneo U5";
                        sb2.append(str);
                        sb2.append(str2);
                        string = sb2.toString();
                    } else {
                        sb = new StringBuilder();
                    }
                    sb.append(string2);
                    sb.append(str2);
                    string = sb.toString();
                } else if (string2 == null) {
                    sb2 = new StringBuilder();
                    str = "B8U";
                    sb2.append(str);
                    sb2.append(str2);
                    string = sb2.toString();
                } else {
                    sb = new StringBuilder();
                    sb.append(string2);
                    sb.append(str2);
                    string = sb.toString();
                }
            } else if (string2 == null) {
                sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                string = sb2.toString();
            } else {
                sb = new StringBuilder();
                sb.append(string2);
                sb.append(str2);
                string = sb.toString();
            }
            this.B.setText(string);
            this.N = string;
            if (this.J.e() == null && this.J.e().equals(string)) {
                return;
            }
            this.J.j(string);
        }
        if (string2 == null) {
            string2 = "SmartTV";
        }
        string = string2;
        this.B.setText(string);
        this.N = string;
        if (this.J.e() == null) {
        }
        this.J.j(string);
    }

    public void B0() {
        String strA;
        String str;
        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService("connectivity");
        Network activeNetwork = connectivityManager.getActiveNetwork();
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        boolean zIsWifiEnabled = wifiManager.isWifiEnabled();
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        boolean z = false;
        boolean z2 = networkCapabilities != null && networkCapabilities.hasTransport(1);
        if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
            z = true;
        }
        if (networkCapabilities != null) {
            networkCapabilities.hasCapability(12);
        }
        if (zIsWifiEnabled) {
            if (z2) {
                com.homwee.multiscreenshare.r.e.d("wifi status step , wifi open, wifi connect");
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                strA = com.homwee.multiscreenshare.r.d.b(connectionInfo.getIpAddress());
                this.C.setText(connectionInfo.getSSID().replace("\"", ""));
            } else if (z) {
                str = "wifi status step , wifi open, eth connect";
                com.homwee.multiscreenshare.r.e.d(str);
                strA = com.homwee.multiscreenshare.r.d.a();
                this.F.setImageResource(R.drawable.icon_nowifi_new);
                this.G.setImageResource(R.drawable.icon_eth_new);
            } else {
                com.homwee.multiscreenshare.r.e.d("wifi status step , wifi open, no wifi no eth");
                this.C.setText("");
                strA = com.homwee.multiscreenshare.r.d.a();
            }
            this.F.setImageResource(R.drawable.icon_wifi_new);
            this.G.setImageResource(R.drawable.icon_noeth_new);
        } else if (z) {
            str = "wifi status step , wifi close, but eth connect";
            com.homwee.multiscreenshare.r.e.d(str);
            strA = com.homwee.multiscreenshare.r.d.a();
            this.F.setImageResource(R.drawable.icon_nowifi_new);
            this.G.setImageResource(R.drawable.icon_eth_new);
        } else {
            com.homwee.multiscreenshare.r.e.d("wifi status step , wifi close, no wifi no eth");
            this.C.setText("");
            strA = com.homwee.multiscreenshare.r.d.a();
            this.F.setImageResource(R.drawable.icon_nowifi_new);
            this.G.setImageResource(R.drawable.icon_noeth_new);
        }
        this.D.setText(strA);
        if (this.I.e() == null || !this.I.e().equals(strA)) {
            this.I.j(strA);
        }
    }

    public void E0() {
        Intent intent = new Intent();
        intent.setAction("com.mediatek.androidbox.MiracastService");
        intent.setPackage("com.mediatek.androidbox");
        stopService(intent);
    }

    public void a0(final ImageView imageView) {
        String str = "&device=" + this.J.e() + "&ip=" + this.I.e();
        com.homwee.multiscreenshare.r.e.b("生成二维码Bitmap,content=" + str);
        this.K.d(Z(str, com.blankj.utilcode.util.i.a(120.0f)).d(d.a.i.b.a.a()).f(new d.a.l.d() { // from class: com.homwee.multiscreenshare.g
            @Override // d.a.l.d
            public final void a(Object obj) {
                this.f4655a.s0(imageView, (Bitmap) obj);
            }
        }));
    }

    public void b0(final ImageView imageView) {
        StringBuilder sb;
        String str;
        c.a.a.e eVar = new c.a.a.e();
        RemoteConfigBean remoteConfigBean = this.L;
        eVar.put("isShareOK", (remoteConfigBean == null || remoteConfigBean.getScreenShareTag()) ? "0" : "1");
        RemoteConfigBean remoteConfigBean2 = this.L;
        eVar.put("isDlnaOK", (remoteConfigBean2 == null || remoteConfigBean2.getDlnaTag()) ? "0" : "1");
        if (this.P) {
            sb = new StringBuilder();
            str = "https://play.google.com/store/apps/details?id=com.homwee.tv.chremotecontralkajito&device=";
        } else {
            sb = new StringBuilder();
            str = "https://play.google.com/store/apps/details?id=com.homwee.tv.chremotecontral&hl=zh&gl=US&device=";
        }
        sb.append(str);
        sb.append(this.J.e());
        sb.append("&ip=");
        sb.append(this.I.e());
        sb.append("&remoteconfig=");
        sb.append(eVar.a());
        String string = sb.toString();
        com.homwee.multiscreenshare.r.e.b("生成二维码Bitmap,content=" + string);
        this.K.d(Z(string, com.blankj.utilcode.util.i.a(130.0f)).d(d.a.i.b.a.a()).f(new d.a.l.d() { // from class: com.homwee.multiscreenshare.k
            @Override // d.a.l.d
            public final void a(Object obj) {
                this.f4662a.u0(imageView, (Bitmap) obj);
            }
        }));
    }

    public boolean k0() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) > 0;
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        setContentView(R.layout.activity_main);
        this.O = this;
        this.B = (TextView) findViewById(R.id.tv_name);
        this.C = (TextView) findViewById(R.id.tv_wifi);
        this.F = (ImageView) findViewById(R.id.iv_wifi);
        this.E = (TextView) findViewById(R.id.tv_eth);
        this.G = (ImageView) findViewById(R.id.iv_eth);
        this.D = (TextView) findViewById(R.id.tv_ip);
        String strA = MyApplication.a("PangoRemoteMode", "PREnabled");
        A0();
        if (strA == null || strA.equals("1")) {
            f0();
        } else if (Build.BRAND.equals("AIWA")) {
            j0();
        } else {
            h0();
        }
        g0();
        i0();
        super.onConfigurationChanged(configuration);
    }

    @Override // androidx.fragment.app.e, androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_main);
        this.O = this;
        MyApplication myApplication = new MyApplication();
        this.Q = myApplication;
        this.P = myApplication.e();
        this.B = (TextView) findViewById(R.id.tv_name);
        this.C = (TextView) findViewById(R.id.tv_wifi);
        this.F = (ImageView) findViewById(R.id.iv_wifi);
        this.E = (TextView) findViewById(R.id.tv_eth);
        this.G = (ImageView) findViewById(R.id.iv_eth);
        this.D = (TextView) findViewById(R.id.tv_ip);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.layout_bg);
        this.H = constraintLayout;
        if (this.P) {
            constraintLayout.setBackgroundColor(getColor(R.color.kajito_back_ground_color));
        } else {
            constraintLayout.setBackgroundResource(R.drawable.bg_new);
        }
        this.z = this;
        s = Boolean.TRUE;
        this.L = com.homwee.multiscreenshare.r.f.b();
        String strA = MyApplication.a("PangoRemoteMode", "PREnabled");
        A0();
        if (strA == null || strA.equals("1")) {
            f0();
        } else if (Build.BRAND.equals("AIWA")) {
            j0();
        } else {
            h0();
        }
        g0();
        i0();
        y0();
        W();
        B0();
        com.homwee.multiscreenshare.r.e.d("onCreate Step 1");
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        com.homwee.multiscreenshare.r.e.d("MultiScreenShare onDestroy");
        super.onDestroy();
        z0();
        String strA = MyApplication.a("FACTORY_CONFIG", "FORCE_HDCP2X");
        String strE0 = e0("ro.board.platform");
        com.homwee.multiscreenshare.r.e.d("platForm = " + strE0);
        if (strE0 == null || !strE0.equalsIgnoreCase("mt5867") || (strA != null && strA.equalsIgnoreCase("1"))) {
            E0();
        }
        s = Boolean.FALSE;
        sendBroadcast(new Intent("com.changhong.STOP_DLNA_AIR_SERVICE"));
        unregisterReceiver(this.R);
        unregisterReceiver(this.S);
        unregisterReceiver(this.T);
        unregisterReceiver(this.V);
        unregisterReceiver(this.W);
        a.n.a.a.b(this).e(this.U);
        if (!this.K.f()) {
            this.K.c();
        }
        com.homwee.multiscreenshare.r.e.d("onDestroy Step 6");
        System.exit(0);
        Process.killProcess(Process.myPid());
    }

    @Override // androidx.appcompat.app.c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        com.homwee.multiscreenshare.r.e.d("onKeyDown~~~~~keyCode = " + i2 + " ScanCode = " + keyEvent.getScanCode());
        if (i2 != 82 || keyEvent.getScanCode() != 122) {
            return super.onKeyDown(i2, keyEvent);
        }
        finish();
        return true;
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        com.homwee.multiscreenshare.r.e.d("onNewIntent Step 8");
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.homwee.multiscreenshare.r.e.d("onPause Step 4");
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
        com.homwee.multiscreenshare.r.e.d("onRestart Step 7");
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onResume() {
        super.onResume();
        C0();
        String strA = MyApplication.a("FACTORY_CONFIG", "FORCE_HDCP2X");
        String strE0 = e0("ro.board.platform");
        if (strE0 == null || !strE0.equalsIgnoreCase("mt5867") || (strA != null && strA.equalsIgnoreCase("1"))) {
            D0();
            X();
        }
        Y();
        com.homwee.multiscreenshare.r.e.d("onResume Start Service");
        com.homwee.multiscreenshare.r.e.d("onResume Step 3");
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        com.homwee.multiscreenshare.r.e.d("onStart Step 2");
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.e, android.app.Activity
    protected void onStop() {
        super.onStop();
        String strA = MyApplication.a("FACTORY_CONFIG", "FORCE_HDCP2X");
        String strE0 = e0("ro.board.platform");
        if (strE0 == null || !strE0.equalsIgnoreCase("mt5867") || (strA != null && strA.equalsIgnoreCase("1"))) {
            F0();
        }
        G0();
        z0();
        com.homwee.multiscreenshare.r.e.d("onStop Step 5");
    }

    public void x0() {
        String strA = MyApplication.a("FACTORY_CONFIG", "FORCE_HDCP2X");
        String strE0 = e0("ro.board.platform");
        if (TextUtils.isEmpty(this.J.e()) || TextUtils.isEmpty(this.I.e())) {
            return;
        }
        com.homwee.multiscreenshare.r.e.b("wifi changed ip=" + this.I.e());
        com.homwee.multiscreenshare.r.e.b("wifi changed ip=" + this.u.size());
        ArrayList<com.homwee.multiscreenshare.view.g> arrayList = this.u;
        if (arrayList == null || arrayList.size() <= 1) {
            return;
        }
        com.homwee.multiscreenshare.view.g gVar = (strE0 == null || !strE0.equalsIgnoreCase("mt5867") || strA == null || strA.equalsIgnoreCase("1")) ? this.u.get(1) : this.u.get(0);
        ArrayList<com.homwee.multiscreenshare.view.f> arrayListK = gVar.k();
        if (gVar.m().equals("screen_share_tag") && arrayListK != null && arrayListK.size() > 1) {
            com.homwee.multiscreenshare.view.f fVar = arrayListK.get(k0() ? arrayListK.size() - 1 : 0);
            if (fVar instanceof com.homwee.multiscreenshare.view.b) {
                ((com.homwee.multiscreenshare.view.b) fVar).c();
            }
        }
        if (!gVar.m().equals("screen_share_tag") || arrayListK == null || arrayListK.size() <= 2) {
            return;
        }
        com.homwee.multiscreenshare.view.f fVar2 = k0() ? arrayListK.get(arrayListK.size() - 2) : arrayListK.get(1);
        if (fVar2 instanceof com.homwee.multiscreenshare.view.c) {
            ((com.homwee.multiscreenshare.view.c) fVar2).c();
        }
    }
}
