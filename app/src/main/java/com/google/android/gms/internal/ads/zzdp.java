package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.datastore.preferences.protobuf.C1169e;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzdp {
    public static final zzdp zza = new zzdp(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdp(int i, int i2, int i3) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = zzfn.zzC(i3) ? zzfn.zzk(i3, i2) : -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdp) {
            zzdp zzdpVar = (zzdp) obj;
            return this.zzb == zzdpVar.zzb && this.zzc == zzdpVar.zzc && this.zzd == zzdpVar.zzd;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        int i = this.zzb;
        int i2 = this.zzc;
        return C0539e.m12264b(C1169e.m11130b("AudioFormat[sampleRate=", i, ", channelCount=", i2, ", encoding="), this.zzd, "]");
    }
}
