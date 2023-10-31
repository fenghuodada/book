package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.InlineMe;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

@KeepForSdk
/* loaded from: classes.dex */
public abstract class GservicesValue<T> {
    private static final Object zzc = new Object();
    @NonNull
    protected final String zza;
    @NonNull
    protected final Object zzb;
    @Nullable
    private Object zzd = null;

    public GservicesValue(@NonNull String str, @NonNull Object obj) {
        this.zza = str;
        this.zzb = obj;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (zzc) {
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Float> value(@NonNull String str, @NonNull Float f) {
        return new zzd(str, f);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Integer> value(@NonNull String str, @NonNull Integer num) {
        return new zzc(str, num);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Long> value(@NonNull String str, @NonNull Long l) {
        return new zzb(str, l);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<String> value(@NonNull String str, @NonNull String str2) {
        return new zze(str, str2);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Boolean> value(@NonNull String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get() {
        T t = (T) this.zzd;
        if (t != null) {
            return t;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = zzc;
        synchronized (obj) {
        }
        synchronized (obj) {
        }
        try {
            return (T) zza(this.zza);
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            T t2 = (T) zza(this.zza);
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return t2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @NonNull
    @Deprecated
    @InlineMe(replacement = "this.get()")
    @KeepForSdk
    public final T getBinderSafe() {
        return get();
    }

    @VisibleForTesting
    @KeepForSdk
    public void override(@NonNull T t) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzd = t;
        Object obj = zzc;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public void resetOverride() {
        this.zzd = null;
    }

    @NonNull
    public abstract Object zza(@NonNull String str);
}
