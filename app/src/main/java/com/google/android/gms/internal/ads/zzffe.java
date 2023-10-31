package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class zzffe {
    public static zzfff zza(Context context, int i) {
        zzbcp zzbcpVar;
        if (zzfft.zza()) {
            int i2 = i - 2;
            if (i2 != 20 && i2 != 21) {
                switch (i2) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zzbcpVar = zzbcw.zzc;
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zzbcpVar = zzbcw.zzd;
                        break;
                    case 5:
                        zzbcpVar = zzbcw.zzb;
                        break;
                }
            } else {
                zzbcpVar = zzbcw.zze;
            }
            if (((Boolean) zzbcpVar.zze()).booleanValue()) {
                return new zzffh(context, i);
            }
        }
        return new zzfgc();
    }

    public static zzfff zzb(Context context, int i, int i2, com.google.android.gms.ads.internal.client.zzl zzlVar) {
        zzfff zza = zza(context, i);
        if (zza instanceof zzffh) {
            zza.zzh();
            zza.zzm(i2);
            if (zzffp.zze(zzlVar.zzp)) {
                zza.zze(zzlVar.zzp);
            }
            return zza;
        }
        return zza;
    }
}
