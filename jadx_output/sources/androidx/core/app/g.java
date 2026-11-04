package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Notification.Builder f1725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f1726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RemoteViews f1727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RemoteViews f1728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<Bundle> f1729f = new ArrayList();
    private final Bundle g = new Bundle();
    private int h;
    private RemoteViews i;

    g(f.c cVar) {
        Icon icon;
        List<String> listD;
        Bundle bundle;
        String str;
        this.f1726c = cVar;
        this.f1724a = cVar.f1718a;
        int i = Build.VERSION.SDK_INT;
        Context context = cVar.f1718a;
        this.f1725b = i >= 26 ? new Notification.Builder(context, cVar.K) : new Notification.Builder(context);
        Notification notification = cVar.S;
        this.f1725b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f1722e).setContentText(cVar.f1723f).setContentInfo(cVar.k).setContentIntent(cVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.h, (notification.flags & 128) != 0).setLargeIcon(cVar.j).setNumber(cVar.l).setProgress(cVar.t, cVar.u, cVar.v);
        if (i < 21) {
            this.f1725b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i >= 16) {
            this.f1725b.setSubText(cVar.q).setUsesChronometer(cVar.o).setPriority(cVar.m);
            Iterator<f.a> it = cVar.f1719b.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            Bundle bundle2 = cVar.D;
            if (bundle2 != null) {
                this.g.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (cVar.z) {
                    this.g.putBoolean("android.support.localOnly", true);
                }
                String str2 = cVar.w;
                if (str2 != null) {
                    this.g.putString("android.support.groupKey", str2);
                    if (cVar.x) {
                        bundle = this.g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = cVar.y;
                if (str3 != null) {
                    this.g.putString("android.support.sortKey", str3);
                }
            }
            this.f1727d = cVar.H;
            this.f1728e = cVar.I;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            this.f1725b.setShowWhen(cVar.n);
        }
        if (i2 >= 19 && i2 < 21 && (listD = d(e(cVar.f1720c), cVar.V)) != null && !listD.isEmpty()) {
            this.g.putStringArray("android.people", (String[]) listD.toArray(new String[listD.size()]));
        }
        if (i2 >= 20) {
            this.f1725b.setLocalOnly(cVar.z).setGroup(cVar.w).setGroupSummary(cVar.x).setSortKey(cVar.y);
            this.h = cVar.P;
        }
        if (i2 >= 21) {
            this.f1725b.setCategory(cVar.C).setColor(cVar.E).setVisibility(cVar.F).setPublicVersion(cVar.G).setSound(notification.sound, notification.audioAttributes);
            List listD2 = i2 < 28 ? d(e(cVar.f1720c), cVar.V) : cVar.V;
            if (listD2 != null && !listD2.isEmpty()) {
                Iterator it2 = listD2.iterator();
                while (it2.hasNext()) {
                    this.f1725b.addPerson((String) it2.next());
                }
            }
            this.i = cVar.J;
            if (cVar.f1721d.size() > 0) {
                Bundle bundle3 = cVar.b().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i3 = 0; i3 < cVar.f1721d.size(); i3++) {
                    bundle5.putBundle(Integer.toString(i3), h.b(cVar.f1721d.get(i3)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                cVar.b().putBundle("android.car.EXTENSIONS", bundle3);
                this.g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23 && (icon = cVar.U) != null) {
            this.f1725b.setSmallIcon(icon);
        }
        if (i4 >= 24) {
            this.f1725b.setExtras(cVar.D).setRemoteInputHistory(cVar.s);
            RemoteViews remoteViews = cVar.H;
            if (remoteViews != null) {
                this.f1725b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = cVar.I;
            if (remoteViews2 != null) {
                this.f1725b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = cVar.J;
            if (remoteViews3 != null) {
                this.f1725b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i4 >= 26) {
            this.f1725b.setBadgeIconType(cVar.L).setSettingsText(cVar.r).setShortcutId(cVar.M).setTimeoutAfter(cVar.O).setGroupAlertBehavior(cVar.P);
            if (cVar.B) {
                this.f1725b.setColorized(cVar.A);
            }
            if (!TextUtils.isEmpty(cVar.K)) {
                this.f1725b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<i> it3 = cVar.f1720c.iterator();
            while (it3.hasNext()) {
                this.f1725b.addPerson(it3.next().h());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            this.f1725b.setAllowSystemGeneratedContextualActions(cVar.Q);
            this.f1725b.setBubbleMetadata(f.b.a(cVar.R));
            if (cVar.N != null) {
                throw null;
            }
        }
        if (cVar.T) {
            if (this.f1726c.x) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.f1725b.setVibrate(null);
            this.f1725b.setSound(null);
            int i6 = notification.defaults & (-2);
            notification.defaults = i6;
            int i7 = i6 & (-3);
            notification.defaults = i7;
            this.f1725b.setDefaults(i7);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f1726c.w)) {
                    this.f1725b.setGroup("silent");
                }
                this.f1725b.setGroupAlertBehavior(this.h);
            }
        }
    }

    private void a(f.a aVar) {
        int i = Build.VERSION.SDK_INT;
        if (i < 20) {
            if (i >= 16) {
                this.f1729f.add(h.f(this.f1725b, aVar));
                return;
            }
            return;
        }
        IconCompat iconCompatE = aVar.e();
        Notification.Action.Builder builder = i >= 23 ? new Notification.Action.Builder(iconCompatE != null ? iconCompatE.l() : null, aVar.i(), aVar.a()) : new Notification.Action.Builder(iconCompatE != null ? iconCompatE.c() : 0, aVar.i(), aVar.a());
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : j.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (i2 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i2 >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.f1725b.addAction(builder.build());
    }

    private static List<String> d(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        a.d.b bVar = new a.d.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> e(List<i> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void f(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }

    public Notification b() {
        f.d dVar = this.f1726c.p;
        if (dVar != null || dVar != null) {
            throw null;
        }
        Notification notificationC = c();
        f.c cVar = this.f1726c;
        RemoteViews remoteViews = cVar.H;
        if (remoteViews != null) {
            notificationC.contentView = remoteViews;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && dVar != null) {
            throw null;
        }
        if (i >= 21 && dVar != null) {
            f.d dVar2 = cVar.p;
            throw null;
        }
        if (i < 16 || dVar == null || f.a(notificationC) == null) {
            return notificationC;
        }
        throw null;
    }

    protected Notification c() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f1725b.build();
        }
        if (i >= 24) {
            Notification notificationBuild = this.f1725b.build();
            if (this.h != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.h == 2) {
                    f(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.h == 1) {
                    f(notificationBuild);
                }
            }
            return notificationBuild;
        }
        if (i >= 21) {
            this.f1725b.setExtras(this.g);
            Notification notificationBuild2 = this.f1725b.build();
            RemoteViews remoteViews = this.f1727d;
            if (remoteViews != null) {
                notificationBuild2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f1728e;
            if (remoteViews2 != null) {
                notificationBuild2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.i;
            if (remoteViews3 != null) {
                notificationBuild2.headsUpContentView = remoteViews3;
            }
            if (this.h != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && this.h == 2) {
                    f(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && this.h == 1) {
                    f(notificationBuild2);
                }
            }
            return notificationBuild2;
        }
        if (i >= 20) {
            this.f1725b.setExtras(this.g);
            Notification notificationBuild3 = this.f1725b.build();
            RemoteViews remoteViews4 = this.f1727d;
            if (remoteViews4 != null) {
                notificationBuild3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f1728e;
            if (remoteViews5 != null) {
                notificationBuild3.bigContentView = remoteViews5;
            }
            if (this.h != 0) {
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) != 0 && this.h == 2) {
                    f(notificationBuild3);
                }
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) == 0 && this.h == 1) {
                    f(notificationBuild3);
                }
            }
            return notificationBuild3;
        }
        if (i >= 19) {
            SparseArray<Bundle> sparseArrayA = h.a(this.f1729f);
            if (sparseArrayA != null) {
                this.g.putSparseParcelableArray("android.support.actionExtras", sparseArrayA);
            }
            this.f1725b.setExtras(this.g);
            Notification notificationBuild4 = this.f1725b.build();
            RemoteViews remoteViews6 = this.f1727d;
            if (remoteViews6 != null) {
                notificationBuild4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f1728e;
            if (remoteViews7 != null) {
                notificationBuild4.bigContentView = remoteViews7;
            }
            return notificationBuild4;
        }
        if (i < 16) {
            return this.f1725b.getNotification();
        }
        Notification notificationBuild5 = this.f1725b.build();
        Bundle bundleA = f.a(notificationBuild5);
        Bundle bundle = new Bundle(this.g);
        for (String str : this.g.keySet()) {
            if (bundleA.containsKey(str)) {
                bundle.remove(str);
            }
        }
        bundleA.putAll(bundle);
        SparseArray<Bundle> sparseArrayA2 = h.a(this.f1729f);
        if (sparseArrayA2 != null) {
            f.a(notificationBuild5).putSparseParcelableArray("android.support.actionExtras", sparseArrayA2);
        }
        RemoteViews remoteViews8 = this.f1727d;
        if (remoteViews8 != null) {
            notificationBuild5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.f1728e;
        if (remoteViews9 != null) {
            notificationBuild5.bigContentView = remoteViews9;
        }
        return notificationBuild5;
    }
}
