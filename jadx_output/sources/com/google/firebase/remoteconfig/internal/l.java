package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f4592a = TimeUnit.HOURS.toSeconds(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f4593b = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.installations.h f4594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.n.b<com.google.firebase.j.a.a> f4595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f4596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.gms.common.util.d f4597f;
    private final Random g;
    private final j h;
    private final ConfigFetchHttpClient i;
    private final n j;
    private final Map<String, String> k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Date f4598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k f4600c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f4601d;

        private a(Date date, int i, k kVar, String str) {
            this.f4598a = date;
            this.f4599b = i;
            this.f4600c = kVar;
            this.f4601d = str;
        }

        public static a a(Date date) {
            return new a(date, 1, null, null);
        }

        public static a b(k kVar, String str) {
            return new a(kVar.e(), 0, kVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public k d() {
            return this.f4600c;
        }

        String e() {
            return this.f4601d;
        }

        int f() {
            return this.f4599b;
        }
    }

    public l(com.google.firebase.installations.h hVar, com.google.firebase.n.b<com.google.firebase.j.a.a> bVar, Executor executor, com.google.android.gms.common.util.d dVar, Random random, j jVar, ConfigFetchHttpClient configFetchHttpClient, n nVar, Map<String, String> map) {
        this.f4594c = hVar;
        this.f4595d = bVar;
        this.f4596e = executor;
        this.f4597f = dVar;
        this.g = random;
        this.h = jVar;
        this.i = configFetchHttpClient;
        this.j = nVar;
        this.k = map;
    }

    private boolean a(long j, Date date) {
        Date dateD = this.j.d();
        if (dateD.equals(n.f4608a)) {
            return false;
        }
        return date.before(new Date(dateD.getTime() + TimeUnit.SECONDS.toMillis(j)));
    }

    private com.google.firebase.remoteconfig.m b(com.google.firebase.remoteconfig.m mVar) throws com.google.firebase.remoteconfig.j {
        String str;
        int iA = mVar.a();
        if (iA == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (iA == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (iA == 429) {
                throw new com.google.firebase.remoteconfig.j("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (iA != 500) {
                switch (iA) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new com.google.firebase.remoteconfig.m(mVar.a(), "Fetch failed: " + str, mVar);
    }

    private String c(long j) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j)));
    }

    private a f(String str, String str2, Date date) throws com.google.firebase.remoteconfig.k {
        try {
            a aVarFetch = this.i.fetch(this.i.c(), str, str2, k(), this.j.c(), this.k, date);
            if (aVarFetch.e() != null) {
                this.j.h(aVarFetch.e());
            }
            this.j.f();
            return aVarFetch;
        } catch (com.google.firebase.remoteconfig.m e2) {
            n.a aVarU = u(e2.a(), date);
            if (t(aVarU, e2.a())) {
                throw new com.google.firebase.remoteconfig.l(aVarU.a().getTime());
            }
            throw b(e2);
        }
    }

    private c.b.a.a.c.h<a> g(String str, String str2, Date date) {
        try {
            final a aVarF = f(str, str2, date);
            return aVarF.f() != 0 ? c.b.a.a.c.k.c(aVarF) : this.h.k(aVarF.d()).o(this.f4596e, new c.b.a.a.c.g() { // from class: com.google.firebase.remoteconfig.internal.f
                @Override // c.b.a.a.c.g
                public final c.b.a.a.c.h a(Object obj) {
                    return c.b.a.a.c.k.c(aVarF);
                }
            });
        } catch (com.google.firebase.remoteconfig.k e2) {
            return c.b.a.a.c.k.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public c.b.a.a.c.h<a> n(c.b.a.a.c.h<k> hVar, long j) {
        c.b.a.a.c.h hVarH;
        final Date date = new Date(this.f4597f.a());
        if (hVar.m() && a(j, date)) {
            return c.b.a.a.c.k.c(a.c(date));
        }
        Date dateI = i(date);
        if (dateI != null) {
            hVarH = c.b.a.a.c.k.b(new com.google.firebase.remoteconfig.l(c(dateI.getTime() - date.getTime()), dateI.getTime()));
        } else {
            final c.b.a.a.c.h<String> hVarA = this.f4594c.a();
            final c.b.a.a.c.h<com.google.firebase.installations.l> hVarB = this.f4594c.b(false);
            hVarH = c.b.a.a.c.k.f(hVarA, hVarB).h(this.f4596e, new c.b.a.a.c.a() { // from class: com.google.firebase.remoteconfig.internal.c
                @Override // c.b.a.a.c.a
                public final Object a(c.b.a.a.c.h hVar2) {
                    return this.f4562a.q(hVarA, hVarB, date, hVar2);
                }
            });
        }
        return hVarH.h(this.f4596e, new c.b.a.a.c.a() { // from class: com.google.firebase.remoteconfig.internal.e
            @Override // c.b.a.a.c.a
            public final Object a(c.b.a.a.c.h hVar2) {
                this.f4568a.s(date, hVar2);
                return hVar2;
            }
        });
    }

    private Date i(Date date) {
        Date dateA = this.j.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private long j(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f4593b;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.g.nextInt((int) millis));
    }

    private Map<String, String> k() {
        HashMap map = new HashMap();
        com.google.firebase.j.a.a aVarA = this.f4595d.a();
        if (aVarA == null) {
            return map;
        }
        for (Map.Entry<String, Object> entry : aVarA.a(false).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }

    private boolean l(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ c.b.a.a.c.h q(c.b.a.a.c.h hVar, c.b.a.a.c.h hVar2, Date date, c.b.a.a.c.h hVar3) {
        if (hVar.m()) {
            return !hVar2.m() ? c.b.a.a.c.k.b(new com.google.firebase.remoteconfig.j("Firebase Installations failed to get installation auth token for fetch.", hVar2.i())) : g((String) hVar.j(), ((com.google.firebase.installations.l) hVar2.j()).b(), date);
        }
        return c.b.a.a.c.k.b(new com.google.firebase.remoteconfig.j("Firebase Installations failed to get installation ID for fetch.", hVar.i()));
    }

    private /* synthetic */ c.b.a.a.c.h r(Date date, c.b.a.a.c.h hVar) {
        w(hVar, date);
        return hVar;
    }

    private boolean t(n.a aVar, int i) {
        return aVar.b() > 1 || i == 429;
    }

    private n.a u(int i, Date date) {
        if (l(i)) {
            v(date);
        }
        return this.j.a();
    }

    private void v(Date date) {
        int iB = this.j.a().b() + 1;
        this.j.g(iB, new Date(date.getTime() + j(iB)));
    }

    private void w(c.b.a.a.c.h<a> hVar, Date date) {
        if (hVar.m()) {
            this.j.j(date);
            return;
        }
        Exception excI = hVar.i();
        if (excI == null) {
            return;
        }
        boolean z = excI instanceof com.google.firebase.remoteconfig.l;
        n nVar = this.j;
        if (z) {
            nVar.k();
        } else {
            nVar.i();
        }
    }

    public c.b.a.a.c.h<a> d() {
        return e(this.j.e());
    }

    public c.b.a.a.c.h<a> e(final long j) {
        return this.h.c().h(this.f4596e, new c.b.a.a.c.a() { // from class: com.google.firebase.remoteconfig.internal.d
            @Override // c.b.a.a.c.a
            public final Object a(c.b.a.a.c.h hVar) {
                return this.f4566a.n(j, hVar);
            }
        });
    }

    public /* synthetic */ c.b.a.a.c.h s(Date date, c.b.a.a.c.h hVar) {
        r(date, hVar);
        return hVar;
    }
}
