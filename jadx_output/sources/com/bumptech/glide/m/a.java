package com.bumptech.glide.m;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f3643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f3644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f3645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f3646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3647f;
    private long g;
    private final int h;
    private Writer j;
    private int l;
    private long i = 0;
    private final LinkedHashMap<String, d> k = new LinkedHashMap<>(0, 0.75f, true);
    private long m = 0;
    final ThreadPoolExecutor n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable<Void> o = new CallableC0086a();

    /* JADX INFO: renamed from: com.bumptech.glide.m.a$a, reason: collision with other inner class name */
    class CallableC0086a implements Callable<Void> {
        CallableC0086a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                if (a.this.j == null) {
                    return null;
                }
                a.this.z();
                if (a.this.r()) {
                    a.this.w();
                    a.this.l = 0;
                }
                return null;
            }
        }
    }

    private static final class b implements ThreadFactory {
        private b() {
        }

        /* synthetic */ b(CallableC0086a callableC0086a) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f3649a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f3650b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3651c;

        private c(d dVar) {
            this.f3649a = dVar;
            this.f3650b = dVar.f3657e ? null : new boolean[a.this.h];
        }

        /* synthetic */ c(a aVar, d dVar, CallableC0086a callableC0086a) {
            this(dVar);
        }

        public void a() {
            a.this.k(this, false);
        }

        public void b() {
            if (this.f3651c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.k(this, true);
            this.f3651c = true;
        }

        public File f(int i) {
            File fileK;
            synchronized (a.this) {
                if (this.f3649a.f3658f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f3649a.f3657e) {
                    this.f3650b[i] = true;
                }
                fileK = this.f3649a.k(i);
                if (!a.this.f3643b.exists()) {
                    a.this.f3643b.mkdirs();
                }
            }
            return fileK;
        }
    }

    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f3654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f3655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f3656d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f3658f;
        private long g;

        private d(String str) {
            this.f3653a = str;
            this.f3654b = new long[a.this.h];
            this.f3655c = new File[a.this.h];
            this.f3656d = new File[a.this.h];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < a.this.h; i++) {
                sb.append(i);
                this.f3655c[i] = new File(a.this.f3643b, sb.toString());
                sb.append(".tmp");
                this.f3656d[i] = new File(a.this.f3643b, sb.toString());
                sb.setLength(length);
            }
        }

        /* synthetic */ d(a aVar, String str, CallableC0086a callableC0086a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.h) {
                throw m(strArr);
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    this.f3654b[i] = Long.parseLong(strArr[i]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i) {
            return this.f3655c[i];
        }

        public File k(int i) {
            return this.f3656d[i];
        }

        public String l() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.f3654b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f3659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f3660b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f3661c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f3662d;

        private e(String str, long j, File[] fileArr, long[] jArr) {
            this.f3659a = str;
            this.f3660b = j;
            this.f3662d = fileArr;
            this.f3661c = jArr;
        }

        /* synthetic */ e(a aVar, String str, long j, File[] fileArr, long[] jArr, CallableC0086a callableC0086a) {
            this(str, j, fileArr, jArr);
        }

        public File a(int i) {
            return this.f3662d[i];
        }
    }

    private a(File file, int i, int i2, long j) {
        this.f3643b = file;
        this.f3647f = i;
        this.f3644c = new File(file, "journal");
        this.f3645d = new File(file, "journal.tmp");
        this.f3646e = new File(file, "journal.bkp");
        this.h = i2;
        this.g = j;
    }

    private void i() {
        if (this.j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void j(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k(c cVar, boolean z) {
        d dVar = cVar.f3649a;
        if (dVar.f3658f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.f3657e) {
            for (int i = 0; i < this.h; i++) {
                if (!cVar.f3650b[i]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!dVar.k(i).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.h; i2++) {
            File fileK = dVar.k(i2);
            if (!z) {
                m(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i2);
                fileK.renameTo(fileJ);
                long j = dVar.f3654b[i2];
                long length = fileJ.length();
                dVar.f3654b[i2] = length;
                this.i = (this.i - j) + length;
            }
        }
        this.l++;
        dVar.f3658f = null;
        if (dVar.f3657e || z) {
            dVar.f3657e = true;
            this.j.append((CharSequence) "CLEAN");
            this.j.append(' ');
            this.j.append((CharSequence) dVar.f3653a);
            this.j.append((CharSequence) dVar.l());
            this.j.append('\n');
            if (z) {
                long j2 = this.m;
                this.m = 1 + j2;
                dVar.g = j2;
            }
        } else {
            this.k.remove(dVar.f3653a);
            this.j.append((CharSequence) "REMOVE");
            this.j.append(' ');
            this.j.append((CharSequence) dVar.f3653a);
            this.j.append('\n');
        }
        p(this.j);
        if (this.i > this.g || r()) {
            this.n.submit(this.o);
        }
    }

    private static void m(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c o(String str, long j) {
        i();
        d dVar = this.k.get(str);
        CallableC0086a callableC0086a = null;
        if (j != -1 && (dVar == null || dVar.g != j)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0086a);
            this.k.put(str, dVar);
        } else if (dVar.f3658f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0086a);
        dVar.f3658f = cVar;
        this.j.append((CharSequence) "DIRTY");
        this.j.append(' ');
        this.j.append((CharSequence) str);
        this.j.append('\n');
        p(this.j);
        return cVar;
    }

    @TargetApi(26)
    private static void p(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r() {
        int i = this.l;
        return i >= 2000 && i >= this.k.size();
    }

    public static a s(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                y(file2, file3, false);
            }
        }
        a aVar = new a(file, i, i2, j);
        if (aVar.f3644c.exists()) {
            try {
                aVar.u();
                aVar.t();
                return aVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                aVar.l();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i, i2, j);
        aVar2.w();
        return aVar2;
    }

    private void t() throws IOException {
        m(this.f3645d);
        Iterator<d> it = this.k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f3658f == null) {
                while (i < this.h) {
                    this.i += next.f3654b[i];
                    i++;
                }
            } else {
                next.f3658f = null;
                while (i < this.h) {
                    m(next.j(i));
                    m(next.k(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    private void u() {
        com.bumptech.glide.m.b bVar = new com.bumptech.glide.m.b(new FileInputStream(this.f3644c), com.bumptech.glide.m.c.f3670a);
        try {
            String strD = bVar.d();
            String strD2 = bVar.d();
            String strD3 = bVar.d();
            String strD4 = bVar.d();
            String strD5 = bVar.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f3647f).equals(strD3) || !Integer.toString(this.h).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    v(bVar.d());
                    i++;
                } catch (EOFException unused) {
                    this.l = i - this.k.size();
                    if (bVar.c()) {
                        w();
                    } else {
                        this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3644c, true), com.bumptech.glide.m.c.f3670a));
                    }
                    com.bumptech.glide.m.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th) {
            com.bumptech.glide.m.c.a(bVar);
            throw th;
        }
    }

    private void v(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = this.k.get(strSubstring);
        CallableC0086a callableC0086a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0086a);
            this.k.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f3657e = true;
            dVar.f3658f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f3658f = new c(this, dVar, callableC0086a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w() {
        Writer writer = this.j;
        if (writer != null) {
            j(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3645d), com.bumptech.glide.m.c.f3670a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f3647f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.k.values()) {
                bufferedWriter.write(dVar.f3658f != null ? "DIRTY " + dVar.f3653a + '\n' : "CLEAN " + dVar.f3653a + dVar.l() + '\n');
            }
            j(bufferedWriter);
            if (this.f3644c.exists()) {
                y(this.f3644c, this.f3646e, true);
            }
            y(this.f3645d, this.f3644c, false);
            this.f3646e.delete();
            this.j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f3644c, true), com.bumptech.glide.m.c.f3670a));
        } catch (Throwable th) {
            j(bufferedWriter);
            throw th;
        }
    }

    private static void y(File file, File file2, boolean z) throws IOException {
        if (z) {
            m(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        while (this.i > this.g) {
            x(this.k.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.j == null) {
            return;
        }
        for (d dVar : new ArrayList(this.k.values())) {
            if (dVar.f3658f != null) {
                dVar.f3658f.a();
            }
        }
        z();
        j(this.j);
        this.j = null;
    }

    public void l() throws IOException {
        close();
        com.bumptech.glide.m.c.b(this.f3643b);
    }

    public c n(String str) {
        return o(str, -1L);
    }

    public synchronized e q(String str) {
        i();
        d dVar = this.k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f3657e) {
            return null;
        }
        for (File file : dVar.f3655c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.l++;
        this.j.append((CharSequence) "READ");
        this.j.append(' ');
        this.j.append((CharSequence) str);
        this.j.append('\n');
        if (r()) {
            this.n.submit(this.o);
        }
        return new e(this, str, dVar.g, dVar.f3655c, dVar.f3654b, null);
    }

    public synchronized boolean x(String str) {
        i();
        d dVar = this.k.get(str);
        if (dVar != null && dVar.f3658f == null) {
            for (int i = 0; i < this.h; i++) {
                File fileJ = dVar.j(i);
                if (fileJ.exists() && !fileJ.delete()) {
                    throw new IOException("failed to delete " + fileJ);
                }
                this.i -= dVar.f3654b[i];
                dVar.f3654b[i] = 0;
            }
            this.l++;
            this.j.append((CharSequence) "REMOVE");
            this.j.append(' ');
            this.j.append((CharSequence) str);
            this.j.append('\n');
            this.k.remove(str);
            if (r()) {
                this.n.submit(this.o);
            }
            return true;
        }
        return false;
    }
}
