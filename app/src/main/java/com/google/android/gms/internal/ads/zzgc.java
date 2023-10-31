package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgc {
    public static final /* synthetic */ int zzj = 0;
    public final Uri zza;
    public final int zzb;
    @Nullable
    public final byte[] zzc;
    public final Map zzd;
    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    @Nullable
    public final String zzh;
    public final int zzi;

    static {
        zzbr.zzb("media3.datasource");
    }

    public zzgc(Uri uri) {
        this(uri, 0L, 1, null, Collections.emptyMap(), 0L, -1L, null, 0, null);
    }

    private zzgc(Uri uri, long j, int i, @Nullable byte[] bArr, Map map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        long j4 = j + j2;
        boolean z = false;
        zzdy.zzd(j4 >= 0);
        zzdy.zzd(j2 >= 0);
        if (j3 <= 0) {
            j3 = j3 == -1 ? -1L : j3;
            zzdy.zzd(z);
            this.zza = uri;
            this.zzb = 1;
            this.zzc = null;
            this.zzd = Collections.unmodifiableMap(new HashMap(map));
            this.zzf = j2;
            this.zze = j4;
            this.zzg = j3;
            this.zzh = null;
            this.zzi = i2;
        }
        z = true;
        zzdy.zzd(z);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j2;
        this.zze = j4;
        this.zzg = j3;
        this.zzh = null;
        this.zzi = i2;
    }

    @Deprecated
    public zzgc(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, j - j2, 1, null, Collections.emptyMap(), j2, j3, null, i, null);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zza);
        long j = this.zzf;
        long j2 = this.zzg;
        int i = this.zzi;
        StringBuilder sb = new StringBuilder("DataSpec[GET ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", null, ");
        return C0539e.m12264b(sb, i, "]");
    }

    public final boolean zza(int i) {
        return (this.zzi & i) == i;
    }
}
