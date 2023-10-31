package androidx.core.p003os;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresOptIn;
import androidx.annotation.RestrictTo;
import java.util.Locale;

/* renamed from: androidx.core.os.BuildCompat */
/* loaded from: classes.dex */
public final class BuildCompat {

    @RequiresOptIn
    /* renamed from: androidx.core.os.BuildCompat$PrereleaseSdkCheck */
    /* loaded from: classes.dex */
    public @interface PrereleaseSdkCheck {
    }

    @RestrictTo({RestrictTo.EnumC0076a.TESTS})
    /* renamed from: a */
    public static boolean m11868a(@NonNull String str, @NonNull String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @ChecksSdkIntAtLeast(api = 31, codename = "S")
    @SuppressLint({"RestrictedApi"})
    @Deprecated
    /* renamed from: b */
    public static boolean m11867b() {
        int i = Build.VERSION.SDK_INT;
        return i >= 31 || (i >= 30 && m11868a("S", Build.VERSION.CODENAME));
    }

    @ChecksSdkIntAtLeast(api = 33, codename = "Tiramisu")
    @PrereleaseSdkCheck
    /* renamed from: c */
    public static boolean m11866c() {
        int i = Build.VERSION.SDK_INT;
        return i >= 33 || (i >= 32 && m11868a("Tiramisu", Build.VERSION.CODENAME));
    }
}
