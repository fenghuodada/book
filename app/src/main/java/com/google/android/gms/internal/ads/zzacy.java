package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzacy implements zzaao {
    private zzaar zzb;
    private int zzc;
    private int zzd;
    private int zze;
    @Nullable
    private zzaev zzg;
    private zzaap zzh;
    private zzadb zzi;
    @Nullable
    private zzagw zzj;
    private final zzfd zza = new zzfd(6);
    private long zzf = -1;

    private final int zze(zzaap zzaapVar) throws IOException {
        this.zza.zzC(2);
        ((zzaae) zzaapVar).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbz[0]);
        zzaar zzaarVar = this.zzb;
        zzaarVar.getClass();
        zzaarVar.zzC();
        this.zzb.zzN(new zzabm(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    private final void zzg(zzbz... zzbzVarArr) {
        zzaar zzaarVar = this.zzb;
        zzaarVar.getClass();
        zzabr zzv = zzaarVar.zzv(1024, 4);
        zzak zzakVar = new zzak();
        zzakVar.zzz("image/jpeg");
        zzakVar.zzM(new zzca(-9223372036854775807L, zzbzVarArr));
        zzv.zzk(zzakVar.zzY());
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
    @Override // com.google.android.gms.internal.ads.zzaao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzaap r24, com.google.android.gms.internal.ads.zzabk r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacy.zza(com.google.android.gms.internal.ads.zzaap, com.google.android.gms.internal.ads.zzabk):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzb = zzaarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzagw zzagwVar = this.zzj;
            zzagwVar.getClass();
            zzagwVar.zzc(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        if (zze(zzaapVar) != 65496) {
            return false;
        }
        int zze = zze(zzaapVar);
        this.zzd = zze;
        if (zze == 65504) {
            this.zza.zzC(2);
            zzaae zzaaeVar = (zzaae) zzaapVar;
            zzaaeVar.zzm(this.zza.zzH(), 0, 2, false);
            zzaaeVar.zzl(this.zza.zzo() - 2, false);
            zze = zze(zzaapVar);
            this.zzd = zze;
        }
        if (zze == 65505) {
            zzaae zzaaeVar2 = (zzaae) zzaapVar;
            zzaaeVar2.zzl(2, false);
            this.zza.zzC(6);
            zzaaeVar2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }
}
