package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzfy extends IOException {
    public final int zza;

    public zzfy(int i) {
        this.zza = i;
    }

    public zzfy(@Nullable String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzfy(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzfy(@Nullable Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
