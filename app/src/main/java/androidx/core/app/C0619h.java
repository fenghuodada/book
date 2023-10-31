package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* renamed from: androidx.core.app.h */
/* loaded from: classes.dex */
public final class C0619h {
    @DoNotInline
    /* renamed from: a */
    public static <T> T m12082a(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    @DoNotInline
    /* renamed from: b */
    public static int m12081b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    @DoNotInline
    /* renamed from: c */
    public static int m12080c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    @DoNotInline
    /* renamed from: d */
    public static String m12079d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
