package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(29)
/* renamed from: androidx.core.app.j */
/* loaded from: classes.dex */
public final class C0623j {
    @DoNotInline
    /* renamed from: a */
    public static int m12072a(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    @NonNull
    @DoNotInline
    /* renamed from: b */
    public static String m12071b(@NonNull Context context) {
        String opPackageName;
        opPackageName = context.getOpPackageName();
        return opPackageName;
    }

    @Nullable
    @DoNotInline
    /* renamed from: c */
    public static AppOpsManager m12070c(@NonNull Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
