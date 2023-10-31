package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class zzfci {
    private final zzfbm zza;
    private final zzfcg zzb;
    private final zzfbi zzc;
    private zzfco zze;
    private int zzf = 1;
    private final ArrayDeque zzd = new ArrayDeque();

    public zzfci(zzfbm zzfbmVar, zzfbi zzfbiVar, zzfcg zzfcgVar) {
        this.zza = zzfbmVar;
        this.zzc = zzfbiVar;
        this.zzb = zzfcgVar;
        zzfbiVar.zzb(new zzfcd(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzga)).booleanValue() && !com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                zzfch zzfchVar = (zzfch) this.zzd.pollFirst();
                if (zzfchVar == null || (zzfchVar.zza() != null && this.zza.zze(zzfchVar.zza()))) {
                    zzfco zzfcoVar = new zzfco(this.zza, this.zzb, zzfchVar);
                    this.zze = zzfcoVar;
                    zzfcoVar.zzd(new zzfce(this, zzfchVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    @Nullable
    public final synchronized zzfwb zza(zzfch zzfchVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzfchVar);
    }

    public final synchronized void zze(zzfch zzfchVar) {
        this.zzd.add(zzfchVar);
    }

    public final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
