package com.google.android.gms.internal.measurement;

import com.google.android.exoplayer2.analytics.C6651l;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbc extends zzaw {
    public zzbc() {
        this.zza.add(zzbl.AND);
        this.zza.add(zzbl.NOT);
        this.zza.add(zzbl.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        int ordinal = zzh.zze(str).ordinal();
        if (ordinal != 1) {
            if (ordinal != 47) {
                if (ordinal != 50) {
                    return super.zzb(str);
                }
                zzap zzb = zzgVar.zzb((zzap) C6651l.m6132a(zzbl.OR, 2, list, 0));
                if (zzb.zzg().booleanValue()) {
                    return zzb;
                }
            } else {
                return new zzaf(Boolean.valueOf(!zzgVar.zzb((zzap) C6651l.m6132a(zzbl.NOT, 1, list, 0)).zzg().booleanValue()));
            }
        } else {
            zzap zzb2 = zzgVar.zzb((zzap) C6651l.m6132a(zzbl.AND, 2, list, 0));
            if (!zzb2.zzg().booleanValue()) {
                return zzb2;
            }
        }
        return zzgVar.zzb((zzap) list.get(1));
    }
}
