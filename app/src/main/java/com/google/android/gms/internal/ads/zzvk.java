package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzvk {
    public final int zzc;
    private final zzfrr zze;
    private int zzf;
    public static final zzvk zza = new zzvk(new zzcz[0]);
    private static final String zzd = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzvj
    };

    public zzvk(zzcz... zzczVarArr) {
        this.zze = zzfrr.zzk(zzczVarArr);
        this.zzc = zzczVarArr.length;
        int i = 0;
        while (i < this.zze.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zze.size(); i3++) {
                if (((zzcz) this.zze.get(i)).equals(this.zze.get(i3))) {
                    zzer.zzc("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvk.class == obj.getClass()) {
            zzvk zzvkVar = (zzvk) obj;
            if (this.zzc == zzvkVar.zzc && this.zze.equals(zzvkVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i == 0) {
            int hashCode = this.zze.hashCode();
            this.zzf = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzcz zzczVar) {
        int indexOf = this.zze.indexOf(zzczVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzcz zzb(int i) {
        return (zzcz) this.zze.get(i);
    }
}
