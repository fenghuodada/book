package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzaig implements zzaih {
    private final List zza;
    private final zzabr[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf = -9223372036854775807L;

    public zzaig(List list) {
        this.zza = list;
        this.zzb = new zzabr[list.size()];
    }

    private final boolean zzf(zzfd zzfdVar, int i) {
        if (zzfdVar.zza() == 0) {
            return false;
        }
        if (zzfdVar.zzk() != i) {
            this.zzc = false;
        }
        this.zzd--;
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zza(zzfd zzfdVar) {
        zzabr[] zzabrVarArr;
        if (this.zzc) {
            if (this.zzd != 2 || zzf(zzfdVar, 32)) {
                if (this.zzd != 1 || zzf(zzfdVar, 0)) {
                    int zzc = zzfdVar.zzc();
                    int zza = zzfdVar.zza();
                    for (zzabr zzabrVar : this.zzb) {
                        zzfdVar.zzF(zzc);
                        zzabrVar.zzq(zzfdVar, zza);
                    }
                    this.zze += zza;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzajq zzajqVar = (zzajq) this.zza.get(i);
            zzajtVar.zzc();
            zzabr zzv = zzaarVar.zzv(zzajtVar.zza(), 3);
            zzak zzakVar = new zzak();
            zzakVar.zzH(zzajtVar.zzb());
            zzakVar.zzS("application/dvbsubs");
            zzakVar.zzI(Collections.singletonList(zzajqVar.zzb));
            zzakVar.zzK(zzajqVar.zza);
            zzv.zzk(zzakVar.zzY());
            this.zzb[i] = zzv;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzc() {
        if (this.zzc) {
            if (this.zzf != -9223372036854775807L) {
                for (zzabr zzabrVar : this.zzb) {
                    zzabrVar.zzs(this.zzf, 1, this.zze, 0, null);
                }
            }
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzc = true;
        if (j != -9223372036854775807L) {
            this.zzf = j;
        }
        this.zze = 0;
        this.zzd = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}
