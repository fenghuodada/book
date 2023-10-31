package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.C1194j;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzes {
    private int zza;
    private long[] zzb;

    public zzes() {
        this(32);
    }

    public zzes(int i) {
        this.zzb = new long[32];
    }

    public final int zza() {
        return this.zza;
    }

    public final long zzb(int i) {
        if (i >= 0 && i < this.zza) {
            return this.zzb[i];
        }
        throw new IndexOutOfBoundsException(C1194j.m11060a("Invalid index ", i, ", size is ", this.zza));
    }

    public final void zzc(long j) {
        int i = this.zza;
        long[] jArr = this.zzb;
        if (i == jArr.length) {
            this.zzb = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.zzb;
        int i2 = this.zza;
        this.zza = i2 + 1;
        jArr2[i2] = j;
    }
}
