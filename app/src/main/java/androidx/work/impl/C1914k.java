package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import java.io.File;
import java.util.HashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.k */
/* loaded from: classes.dex */
public final class C1914k {

    /* renamed from: a */
    public static final String f4650a = AbstractC2005l.m9732e("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f4651b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static void m9818a(@NonNull Context context) {
        File databasePath;
        File file;
        String[] strArr;
        String format;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            String str = f4650a;
            AbstractC2005l.m9733c().mo9731a(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            hashMap.put(context.getDatabasePath("androidx.work.workdb"), new File(context.getNoBackupFilesDir(), "androidx.work.workdb"));
            for (String str2 : f4651b) {
                hashMap.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        AbstractC2005l.m9733c().mo9728f(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        format = String.format("Migrated %s to %s", file2, file3);
                    } else {
                        format = String.format("Renaming %s to %s failed", file2, file3);
                    }
                    AbstractC2005l.m9733c().mo9731a(str, format, new Throwable[0]);
                }
            }
        }
    }
}
