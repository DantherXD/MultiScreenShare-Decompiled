package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class MessengerUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, a> f3006a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Map<String, ?> f3007b = new HashMap();

    public static class ServerService extends Service {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ConcurrentHashMap<Integer, Messenger> f3008b = new ConcurrentHashMap<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SuppressLint({"HandlerLeak"})
        private final Handler f3009c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Messenger f3010d;

        class a extends Handler {
            a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    ServerService.this.f3008b.put(Integer.valueOf(message.arg1), message.replyTo);
                    return;
                }
                if (i == 1) {
                    ServerService.this.f3008b.remove(Integer.valueOf(message.arg1));
                } else if (i != 2) {
                    super.handleMessage(message);
                } else {
                    ServerService.this.e(message);
                    ServerService.this.d(message);
                }
            }
        }

        public ServerService() {
            a aVar = new a();
            this.f3009c = aVar;
            this.f3010d = new Messenger(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Message message) {
            String string;
            a aVar;
            Bundle data = message.getData();
            if (data == null || (string = data.getString("MESSENGER_UTILS")) == null || (aVar = (a) MessengerUtils.f3006a.get(string)) == null) {
                return;
            }
            aVar.a(data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(Message message) {
            Message messageObtain = Message.obtain(message);
            for (Messenger messenger : this.f3008b.values()) {
                if (messenger != null) {
                    try {
                        messenger.send(Message.obtain(messageObtain));
                    } catch (RemoteException e2) {
                        e2.printStackTrace();
                    }
                }
            }
            messageObtain.recycle();
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return this.f3010d.getBinder();
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            Bundle extras;
            if (Build.VERSION.SDK_INT >= 26) {
                startForeground(1, m.f(e.a.f3014a, null));
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                Message messageObtain = Message.obtain(this.f3009c, 2);
                messageObtain.replyTo = this.f3010d;
                messageObtain.setData(extras);
                e(messageObtain);
                d(messageObtain);
            }
            return 2;
        }
    }

    public interface a {
        void a(Bundle bundle);
    }
}
