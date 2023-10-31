package androidx.core.p003os;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* renamed from: androidx.core.os.s */
/* loaded from: classes.dex */
public final class C0752s {

    @RequiresApi(24)
    /* renamed from: androidx.core.os.s$a */
    /* loaded from: classes.dex */
    public static class C0753a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m11829a(Context context) {
            boolean isUserUnlocked;
            isUserUnlocked = ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
            return isUserUnlocked;
        }
    }

    /* renamed from: a */
    public static boolean m11830a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0753a.m11829a(context);
        }
        return true;
    }
}
