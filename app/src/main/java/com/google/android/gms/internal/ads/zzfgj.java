package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzfgj {
    private final Context zza;
    private final Executor zzb;
    private final zzbzy zzc;
    private final zzfft zzd;

    public zzfgj(Context context, Executor executor, zzbzy zzbzyVar, zzfft zzfftVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzbzyVar;
        this.zzd = zzfftVar;
    }

    public final /* synthetic */ void zza(String str) {
        this.zzc.zza(str);
    }

    public final /* synthetic */ void zzb(String str, zzffq zzffqVar) {
        zzfff zza = zzffe.zza(this.zza, 14);
        zza.zzh();
        zza.zzf(this.zzc.zza(str));
        if (zzffqVar == null) {
            this.zzd.zzb(zza.zzl());
            return;
        }
        zzffqVar.zza(zza);
        zzffqVar.zzg();
    }

    public final void zzc(final String str, @Nullable final zzffq zzffqVar) {
        if (zzfft.zza() && ((Boolean) zzbcw.zzd.zze()).booleanValue()) {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgi
                @Override // java.lang.Runnable
                public final void run() {
                    zzfgj.this.zzb(str, zzffqVar);
                }
            });
        } else {
            this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfgh
                @Override // java.lang.Runnable
                public final void run() {
                    zzfgj.this.zza(str);
                }
            });
        }
    }

    public final void zzd(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzc((String) it.next(), null);
        }
    }
}
