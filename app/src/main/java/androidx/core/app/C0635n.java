package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.app.n */
/* loaded from: classes.dex */
public final class C0635n {

    @RequiresApi(16)
    /* renamed from: androidx.core.app.n$a */
    /* loaded from: classes.dex */
    public static class C0636a {
        @DoNotInline
        /* renamed from: a */
        public static Intent m12063a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m12062b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m12061c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    @Nullable
    /* renamed from: a */
    public static Intent m12065a(@NonNull Activity activity) {
        Intent m12063a = C0636a.m12063a(activity);
        if (m12063a != null) {
            return m12063a;
        }
        try {
            String m12064b = m12064b(activity, activity.getComponentName());
            if (m12064b == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, m12064b);
            try {
                if (m12064b(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + m12064b + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Nullable
    /* renamed from: b */
    public static String m12064b(@NonNull Context context, @NonNull ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i >= 29 ? 269222528 : i >= 24 ? 787072 : 640);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }
}
