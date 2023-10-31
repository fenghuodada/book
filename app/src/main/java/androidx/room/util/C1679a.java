package androidx.room.util;

import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.a */
/* loaded from: classes.dex */
public final class C1679a {

    /* renamed from: e */
    public static final HashMap f4093e = new HashMap();

    /* renamed from: a */
    public final File f4094a;

    /* renamed from: b */
    public final Lock f4095b;

    /* renamed from: c */
    public final boolean f4096c;

    /* renamed from: d */
    public FileChannel f4097d;

    public C1679a(@NonNull File file, @NonNull String str, boolean z) {
        Lock lock;
        File file2 = new File(file, C0063d.m13053a(str, ".lck"));
        this.f4094a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = f4093e;
        synchronized (hashMap) {
            lock = (Lock) hashMap.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                hashMap.put(absolutePath, lock);
            }
        }
        this.f4095b = lock;
        this.f4096c = z;
    }

    /* renamed from: a */
    public final void m10060a() {
        FileChannel fileChannel = this.f4097d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f4095b.unlock();
    }
}
