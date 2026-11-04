package com.homwee.multiscreenshare.r;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4671a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4672b = "UTF-8";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, a> f4673c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f4674d;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, Object> f4676b = new LinkedHashMap();

        public a() {
        }

        public Object c(String str) {
            return this.f4676b.get(str);
        }

        public Map<String, Object> d() {
            return this.f4676b;
        }

        public void e(String str, Object obj) {
            this.f4676b.put(str, obj);
        }
    }

    public c(File file) {
        this.f4674d = null;
        this.f4674d = file;
        d(file);
    }

    private void d(File file) {
        try {
            e(new BufferedReader(new FileReader(file)));
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void e(BufferedReader bufferedReader) {
        Pattern patternCompile = Pattern.compile("^\\[.*\\]$");
        a aVar = null;
        while (true) {
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return;
                    }
                    if (!line.startsWith("#")) {
                        if (patternCompile.matcher(line).matches()) {
                            String strTrim = line.trim();
                            a aVar2 = new a();
                            aVar2.f4675a = strTrim.substring(1, strTrim.length() - 1);
                            this.f4673c.put(aVar2.f4675a, aVar2);
                            aVar = aVar2;
                        } else {
                            String[] strArrSplit = line.split("=");
                            if (strArrSplit.length == 2) {
                                aVar.e(strArrSplit[0].trim(), strArrSplit[1].split(";")[0].trim());
                            }
                        }
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                            return;
                        } catch (IOException e3) {
                            e3.printStackTrace();
                            return;
                        }
                    }
                    return;
                }
            } catch (Throwable th) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }

    public Object a(String str, String str2) {
        return b(str, str2, null);
    }

    public Object b(String str, String str2, String str3) {
        a aVar = this.f4673c.get(str);
        if (aVar == null) {
            return null;
        }
        Object objC = aVar.c(str2);
        return (objC == null || objC.toString().trim().equals("")) ? str3 : objC;
    }

    public Map<String, a> c() {
        return this.f4673c;
    }
}
