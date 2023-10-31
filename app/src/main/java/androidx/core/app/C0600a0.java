package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* renamed from: androidx.core.app.a0 */
/* loaded from: classes.dex */
public final class C0600a0 {

    /* renamed from: a */
    public final Context f2261a;

    /* renamed from: b */
    public final NotificationManager f2262b;

    static {
        new HashSet();
    }

    public C0600a0(Context context) {
        this.f2261a = context;
        this.f2262b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: a */
    public final boolean m12103a() {
        boolean areNotificationsEnabled;
        if (Build.VERSION.SDK_INT >= 24) {
            areNotificationsEnabled = this.f2262b.areNotificationsEnabled();
            return areNotificationsEnabled;
        }
        Context context = this.f2261a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
