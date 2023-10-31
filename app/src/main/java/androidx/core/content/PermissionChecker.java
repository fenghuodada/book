package androidx.core.content;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.C0619h;
import androidx.core.app.C0623j;
import androidx.core.util.C0799c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class PermissionChecker {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface PermissionResult {
    }

    /* renamed from: a */
    public static int m12018a(@NonNull Context context, @NonNull String str) {
        return m12017b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    /* renamed from: b */
    public static int m12017b(@NonNull Context context, @NonNull String str, int i, int i2, @Nullable String str2) {
        boolean z;
        int m12080c;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String m12079d = C0619h.m12079d(str);
        if (m12079d == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (myUid == i2 && C0799c.m11795a(packageName, str2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager m12070c = C0623j.m12070c(context);
                m12080c = C0623j.m12072a(m12070c, m12079d, Binder.getCallingUid(), str2);
                if (m12080c == 0) {
                    m12080c = C0623j.m12072a(m12070c, m12079d, i2, C0623j.m12071b(context));
                }
            } else {
                m12080c = C0619h.m12080c((AppOpsManager) C0619h.m12082a(context, AppOpsManager.class), m12079d, str2);
            }
        } else {
            m12080c = C0619h.m12080c((AppOpsManager) C0619h.m12082a(context, AppOpsManager.class), m12079d, str2);
        }
        if (m12080c == 0) {
            return 0;
        }
        return -2;
    }

    /* renamed from: c */
    public static int m12016c(@NonNull Context context, @NonNull String str) {
        return m12017b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
