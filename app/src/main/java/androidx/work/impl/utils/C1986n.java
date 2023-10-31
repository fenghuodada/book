package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.work.AbstractC2005l;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.n */
/* loaded from: classes.dex */
public final class C1986n {

    /* renamed from: a */
    public static final String f4817a = AbstractC2005l.m9732e("WakeLocks");

    /* renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f4818b = new WeakHashMap<>();

    /* renamed from: a */
    public static PowerManager.WakeLock m9742a(@NonNull Context context, @NonNull String str) {
        String m12192b = C0552c.m12192b("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, m12192b);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f4818b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, m12192b);
        }
        return newWakeLock;
    }
}
