package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzce extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzce(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzce zza(@Nullable String str, @Nullable Throwable th) {
        return new zzce(str, th, true, 1);
    }

    public static zzce zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzce(str, th, true, 0);
    }

    public static zzce zzc(@Nullable String str) {
        return new zzce(str, null, false, 1);
    }
}
