package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.MobileAds;

/* loaded from: classes.dex */
public final class zzfba {
    public static com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        if (th instanceof zzebz) {
            zzebz zzebzVar = (zzebz) th;
            return zzc(zzebzVar.zza(), zzebzVar.zzb());
        } else if (th instanceof zzdtz) {
            return th.getMessage() == null ? zzd(((zzdtz) th).zza(), null, null) : zzd(((zzdtz) th).zza(), th.getMessage(), null);
        } else if (th instanceof com.google.android.gms.ads.internal.util.zzay) {
            com.google.android.gms.ads.internal.util.zzay zzayVar = (com.google.android.gms.ads.internal.util.zzay) th;
            return new com.google.android.gms.ads.internal.client.zze(zzayVar.zza(), zzfpo.zzc(zzayVar.getMessage()), MobileAds.ERROR_DOMAIN, null, null);
        } else {
            return zzd(1, null, null);
        }
    }

    public static com.google.android.gms.ads.internal.client.zze zzb(Throwable th, @Nullable zzeca zzecaVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.ads.internal.client.zze zza = zza(th);
        int i = zza.zza;
        if ((i == 3 || i == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza.zzd = null;
        }
        if (zzecaVar != null) {
            zza.zze = zzecaVar.zzb();
        }
        return zza;
    }

    public static com.google.android.gms.ads.internal.client.zze zzc(int i, com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (i != 0) {
            if (i == 8) {
                if (((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhN)).intValue() > 0) {
                    return zzeVar;
                }
                i = 8;
            }
            return zzd(i, null, zzeVar);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.internal.client.zze zzd(int r8, @androidx.annotation.Nullable java.lang.String r9, @androidx.annotation.Nullable com.google.android.gms.ads.internal.client.zze r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfba.zzd(int, java.lang.String, com.google.android.gms.ads.internal.client.zze):com.google.android.gms.ads.internal.client.zze");
    }
}
