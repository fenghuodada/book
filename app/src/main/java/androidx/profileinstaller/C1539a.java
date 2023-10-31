package androidx.profileinstaller;

import java.io.File;

/* renamed from: androidx.profileinstaller.a */
/* loaded from: classes.dex */
public final class C1539a {
    /* renamed from: a */
    public static boolean m10481a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = m10481a(file2) && z;
        }
        return z;
    }
}
