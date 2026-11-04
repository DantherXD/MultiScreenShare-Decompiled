package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, o> f4615a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4617c;

    private o(Context context, String str) {
        this.f4616b = context;
        this.f4617c = str;
    }

    public static synchronized o c(Context context, String str) {
        Map<String, o> map;
        map = f4615a;
        if (!map.containsKey(str)) {
            map.put(str, new o(context, str));
        }
        return map.get(str);
    }

    public synchronized Void a() {
        this.f4616b.deleteFile(this.f4617c);
        return null;
    }

    String b() {
        return this.f4617c;
    }

    @Nullable
    public synchronized k d() {
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        try {
            try {
                fileInputStreamOpenFileInput = this.f4616b.openFileInput(this.f4617c);
                try {
                    int iAvailable = fileInputStreamOpenFileInput.available();
                    byte[] bArr = new byte[iAvailable];
                    fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                    k kVarB = k.b(new JSONObject(new String(bArr, "UTF-8")));
                    fileInputStreamOpenFileInput.close();
                    return kVarB;
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileInputStreamOpenFileInput != null) {
                        fileInputStreamOpenFileInput.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        } catch (FileNotFoundException | JSONException unused2) {
            fileInputStreamOpenFileInput = null;
        } catch (Throwable th4) {
            fileInputStreamOpenFileInput = null;
            th = th4;
        }
    }

    public synchronized Void e(k kVar) {
        FileOutputStream fileOutputStreamOpenFileOutput = this.f4616b.openFileOutput(this.f4617c, 0);
        try {
            fileOutputStreamOpenFileOutput.write(kVar.toString().getBytes("UTF-8"));
            fileOutputStreamOpenFileOutput.close();
        } catch (Throwable th) {
            fileOutputStreamOpenFileOutput.close();
            throw th;
        }
        return null;
    }
}
