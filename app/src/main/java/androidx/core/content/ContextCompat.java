package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.app.C0600a0;
import androidx.core.content.res.C0673c;
import androidx.core.content.res.C0676f;
import androidx.core.p003os.BuildCompat;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class ContextCompat {

    /* renamed from: a */
    public static final Object f2323a = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* loaded from: classes.dex */
    public @interface RegisterReceiverFlags {
    }

    @RequiresApi(16)
    /* renamed from: androidx.core.content.ContextCompat$a */
    /* loaded from: classes.dex */
    public static class C0649a {
        @DoNotInline
        /* renamed from: a */
        public static void m12038a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12037b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    @RequiresApi(19)
    /* renamed from: androidx.core.content.ContextCompat$b */
    /* loaded from: classes.dex */
    public static class C0650b {
        @DoNotInline
        /* renamed from: a */
        public static File[] m12036a(Context context) {
            return context.getExternalCacheDirs();
        }

        @DoNotInline
        /* renamed from: b */
        public static File[] m12035b(Context context, String str) {
            return context.getExternalFilesDirs(str);
        }

        @DoNotInline
        /* renamed from: c */
        public static File[] m12034c(Context context) {
            return context.getObbDirs();
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.content.ContextCompat$c */
    /* loaded from: classes.dex */
    public static class C0651c {
        @DoNotInline
        /* renamed from: a */
        public static File m12033a(Context context) {
            return context.getCodeCacheDir();
        }

        @DoNotInline
        /* renamed from: b */
        public static Drawable m12032b(Context context, int i) {
            return context.getDrawable(i);
        }

        @DoNotInline
        /* renamed from: c */
        public static File m12031c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.core.content.ContextCompat$d */
    /* loaded from: classes.dex */
    public static class C0652d {
        @DoNotInline
        /* renamed from: a */
        public static int m12030a(Context context, int i) {
            return context.getColor(i);
        }

        @DoNotInline
        /* renamed from: b */
        public static <T> T m12029b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        /* renamed from: c */
        public static String m12028c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.core.content.ContextCompat$e */
    /* loaded from: classes.dex */
    public static class C0653e {
        @DoNotInline
        /* renamed from: a */
        public static Context m12027a(Context context) {
            Context createDeviceProtectedStorageContext;
            createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
            return createDeviceProtectedStorageContext;
        }

        @DoNotInline
        /* renamed from: b */
        public static File m12026b(Context context) {
            File dataDir;
            dataDir = context.getDataDir();
            return dataDir;
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m12025c(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    @RequiresApi(26)
    /* renamed from: androidx.core.content.ContextCompat$f */
    /* loaded from: classes.dex */
    public static class C0654f {
        @DoNotInline
        /* renamed from: a */
        public static Intent m12024a(Context context, @Nullable BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            Intent registerReceiver;
            if ((i & 4) != 0 && str == null) {
                Object obj = ContextCompat.f2323a;
                String str2 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
                if (PermissionChecker.m12016c(context, str2) == 0) {
                    return context.registerReceiver(broadcastReceiver, intentFilter, str2, handler);
                }
                throw new RuntimeException(C0663f.m12005a("Permission ", str2, " is required by your application to receive broadcasts, please add it to your manifest"));
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1);
            return registerReceiver;
        }

        @DoNotInline
        /* renamed from: b */
        public static ComponentName m12023b(Context context, Intent intent) {
            ComponentName startForegroundService;
            startForegroundService = context.startForegroundService(intent);
            return startForegroundService;
        }
    }

    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    /* renamed from: a */
    public static int m12040a(@NonNull Context context, @NonNull String str) {
        if (str != null) {
            if (!BuildCompat.m11866c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new C0600a0(context).m12103a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    @Nullable
    /* renamed from: b */
    public static ColorStateList m12039b(@NonNull Context context, @ColorRes int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0676f.C0679c c0679c;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        C0676f.C0680d c0680d = new C0676f.C0680d(resources, theme);
        synchronized (C0676f.f2358c) {
            SparseArray<C0676f.C0679c> sparseArray = C0676f.f2357b.get(c0680d);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (c0679c = sparseArray.get(i)) != null) {
                if (c0679c.f2360b.equals(resources.getConfiguration()) && ((theme == null && c0679c.f2361c == 0) || (theme != null && c0679c.f2361c == theme.hashCode()))) {
                    colorStateList2 = c0679c.f2359a;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal<TypedValue> threadLocal = C0676f.f2356a;
            TypedValue typedValue = threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z = true;
            resources.getValue(i, typedValue, true);
            int i2 = typedValue.type;
            if (!((i2 < 28 || i2 > 31) ? false : false)) {
                try {
                    colorStateList = C0673c.m11994a(resources, resources.getXml(i), theme);
                } catch (Exception e) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateList != null) {
                C0676f.m11990a(c0680d, i, colorStateList, theme);
                return colorStateList;
            }
            return C0676f.C0678b.m11983b(resources, i, theme);
        }
        return colorStateList2;
    }
}
