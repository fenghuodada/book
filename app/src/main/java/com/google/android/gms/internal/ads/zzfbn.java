package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Map;
import p060j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class zzfbn implements zzfbm {
    private final ConcurrentHashMap zza;
    private final zzfbt zzb;
    private final zzfbp zzc = new zzfbp();

    public zzfbn(zzfbt zzfbtVar) {
        this.zza = new ConcurrentHashMap(zzfbtVar.zzd);
        this.zzb = zzfbtVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfbt> creator = zzfbt.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgd)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfbw) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfbl) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfbl) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfbl) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzbzt.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    public final zzfbt zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    @Nullable
    public final synchronized zzfbv zzb(zzfbw zzfbwVar) {
        zzfbv zzfbvVar;
        zzfbl zzfblVar = (zzfbl) this.zza.get(zzfbwVar);
        if (zzfblVar != null) {
            zzfbvVar = zzfblVar.zze();
            if (zzfbvVar == null) {
                this.zzc.zze();
            }
            zzfcj zzf = zzfblVar.zzf();
            if (zzfbvVar != null) {
                zzaxm zza = zzaxs.zza();
                zzaxk zza2 = zzaxl.zza();
                zza2.zzd(2);
                zzaxo zza3 = zzaxp.zza();
                zza3.zza(zzf.zza);
                zza3.zzb(zzf.zzb);
                zza2.zza(zza3);
                zza.zza(zza2);
                zzfbvVar.zza.zzb().zzc().zze((zzaxs) zza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfbvVar = null;
        }
        return zzfbvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    @Deprecated
    public final zzfbw zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfbx(zzlVar, str, new zzbuk(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    public final synchronized boolean zzd(zzfbw zzfbwVar, zzfbv zzfbvVar) {
        boolean zzh;
        ConcurrentHashMap concurrentHashMap;
        zzfbl zzfblVar = (zzfbl) this.zza.get(zzfbwVar);
        zzfbvVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (zzfblVar == null) {
            zzfbt zzfbtVar = this.zzb;
            zzfblVar = new zzfbl(zzfbtVar.zzd, zzfbtVar.zze * 1000);
            int size = this.zza.size();
            zzfbt zzfbtVar2 = this.zzb;
            if (size == zzfbtVar2.zzc) {
                int i = zzfbtVar2.zzg;
                int i2 = i - 1;
                zzfbw zzfbwVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (Map.Entry entry : this.zza.entrySet()) {
                        if (((zzfbl) entry.getValue()).zzc() < j) {
                            j = ((zzfbl) entry.getValue()).zzc();
                            zzfbwVar2 = (zzfbw) entry.getKey();
                        }
                    }
                    if (zzfbwVar2 != null) {
                        concurrentHashMap = this.zza;
                        concurrentHashMap.remove(zzfbwVar2);
                    }
                    this.zzc.zzg();
                } else if (i2 != 1) {
                    if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfbl) entry2.getValue()).zza() < i3) {
                                i3 = ((zzfbl) entry2.getValue()).zza();
                                zzfbwVar2 = (zzfbw) entry2.getKey();
                            }
                        }
                        if (zzfbwVar2 != null) {
                            concurrentHashMap = this.zza;
                            concurrentHashMap.remove(zzfbwVar2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    for (Map.Entry entry3 : this.zza.entrySet()) {
                        if (((zzfbl) entry3.getValue()).zzd() < j) {
                            j = ((zzfbl) entry3.getValue()).zzd();
                            zzfbwVar2 = (zzfbw) entry3.getKey();
                        }
                    }
                    if (zzfbwVar2 != null) {
                        concurrentHashMap = this.zza;
                        concurrentHashMap.remove(zzfbwVar2);
                    }
                    this.zzc.zzg();
                }
            }
            this.zza.put(zzfbwVar, zzfblVar);
            this.zzc.zzd();
        }
        zzh = zzfblVar.zzh(zzfbvVar);
        this.zzc.zzc();
        zzfbo zza = this.zzc.zza();
        zzfcj zzf = zzfblVar.zzf();
        zzaxm zza2 = zzaxs.zza();
        zzaxk zza3 = zzaxl.zza();
        zza3.zzd(2);
        zzaxq zza4 = zzaxr.zza();
        zza4.zza(zza.zza);
        zza4.zzb(zza.zzb);
        zza4.zzc(zzf.zzb);
        zza3.zzc(zza4);
        zza2.zza(zza3);
        zzfbvVar.zza.zzb().zzc().zzf((zzaxs) zza2.zzal());
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfbm
    public final synchronized boolean zze(zzfbw zzfbwVar) {
        zzfbl zzfblVar = (zzfbl) this.zza.get(zzfbwVar);
        if (zzfblVar != null) {
            return zzfblVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}
