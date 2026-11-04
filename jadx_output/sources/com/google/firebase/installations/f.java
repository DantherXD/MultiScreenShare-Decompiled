package com.google.firebase.installations;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f4416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileLock f4417b;

    private f(FileChannel fileChannel, FileLock fileLock) {
        this.f4416a = fileChannel;
        this.f4417b = fileLock;
    }

    static f a(Context context, String str) {
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), str), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new f(channel, fileLockLock);
                } catch (IOException | Error | OverlappingFileLockException e2) {
                    e = e2;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e3) {
                e = e3;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e4) {
            e = e4;
            channel = null;
            fileLockLock = null;
        }
    }

    void b() {
        try {
            this.f4417b.release();
            this.f4416a.close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }
}
