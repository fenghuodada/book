package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class zzavj implements Comparator {
    public zzavj(zzavk zzavkVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzauy zzauyVar = (zzauy) obj;
        zzauy zzauyVar2 = (zzauy) obj2;
        if (zzauyVar.zzd() < zzauyVar2.zzd()) {
            return -1;
        }
        if (zzauyVar.zzd() <= zzauyVar2.zzd()) {
            if (zzauyVar.zzb() < zzauyVar2.zzb()) {
                return -1;
            }
            if (zzauyVar.zzb() <= zzauyVar2.zzb()) {
                float zza = (zzauyVar.zza() - zzauyVar.zzd()) * (zzauyVar.zzc() - zzauyVar.zzb());
                float zza2 = (zzauyVar2.zza() - zzauyVar2.zzd()) * (zzauyVar2.zzc() - zzauyVar2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
