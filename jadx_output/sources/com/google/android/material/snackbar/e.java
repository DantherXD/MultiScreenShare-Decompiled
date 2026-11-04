package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static e f4162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f4163b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f4164c = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f4165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f4166e;

    class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    interface b {
        void a(int i);
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final WeakReference<b> f4168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f4169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f4170c;

        boolean a(b bVar) {
            return bVar != null && this.f4168a.get() == bVar;
        }
    }

    private e() {
    }

    private boolean a(c cVar, int i) {
        b bVar = cVar.f4168a.get();
        if (bVar == null) {
            return false;
        }
        this.f4164c.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    static e b() {
        if (f4162a == null) {
            f4162a = new e();
        }
        return f4162a;
    }

    private boolean d(b bVar) {
        c cVar = this.f4165d;
        return cVar != null && cVar.a(bVar);
    }

    private void g(c cVar) {
        int i = cVar.f4169b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        this.f4164c.removeCallbacksAndMessages(cVar);
        Handler handler = this.f4164c;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    void c(c cVar) {
        synchronized (this.f4163b) {
            if (this.f4165d == cVar || this.f4166e == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.f4163b) {
            if (d(bVar)) {
                c cVar = this.f4165d;
                if (!cVar.f4170c) {
                    cVar.f4170c = true;
                    this.f4164c.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f4163b) {
            if (d(bVar)) {
                c cVar = this.f4165d;
                if (cVar.f4170c) {
                    cVar.f4170c = false;
                    g(cVar);
                }
            }
        }
    }
}
