package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzajr {
    public final int zza;
    @Nullable
    public final String zzb;
    public final List zzc;
    public final byte[] zzd;

    public zzajr(int i, @Nullable String str, @Nullable List list, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.zzd = bArr;
    }
}
