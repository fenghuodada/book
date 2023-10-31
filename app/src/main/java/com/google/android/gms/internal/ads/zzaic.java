package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzaic implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzaib
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzaic(0)};
        }
    };
    private final zzaid zzb;
    private final zzfd zzc;
    private final zzfd zzd;
    private final zzfc zze;
    private zzaar zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;

    public zzaic() {
        this(0);
    }

    public zzaic(int i) {
        this.zzb = new zzaid(true, null);
        this.zzc = new zzfd(2048);
        this.zzh = -1L;
        zzfd zzfdVar = new zzfd(10);
        this.zzd = zzfdVar;
        byte[] zzH = zzfdVar.zzH();
        this.zze = new zzfc(zzH, zzH.length);
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final int zza(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        zzdy.zzb(this.zzf);
        int zza2 = zzaapVar.zza(this.zzc.zzH(), 0, 2048);
        if (!this.zzj) {
            this.zzf.zzN(new zzabm(-9223372036854775807L, 0L));
            this.zzj = true;
        }
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzi) {
            this.zzb.zzd(this.zzg, 4);
            this.zzi = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzf = zzaarVar;
        this.zzb.zzb(zzaarVar, new zzajt(Integer.MIN_VALUE, 0, 1));
        zzaarVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        this.zzi = false;
        this.zzb.zze();
        this.zzg = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        int i = 0;
        while (true) {
            zzaae zzaaeVar = (zzaae) zzaapVar;
            zzaaeVar.zzm(this.zzd.zzH(), 0, 10, false);
            this.zzd.zzF(0);
            if (this.zzd.zzm() != 4801587) {
                break;
            }
            this.zzd.zzG(3);
            int zzj = this.zzd.zzj();
            i += zzj + 10;
            zzaaeVar.zzl(zzj, false);
        }
        zzaapVar.zzj();
        zzaae zzaaeVar2 = (zzaae) zzaapVar;
        zzaaeVar2.zzl(i, false);
        if (this.zzh == -1) {
            this.zzh = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzaaeVar2.zzm(this.zzd.zzH(), 0, 2, false);
            this.zzd.zzF(0);
            if (zzaid.zzf(this.zzd.zzo())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzaaeVar2.zzm(this.zzd.zzH(), 0, 4, false);
                this.zze.zzj(14);
                int zzd = this.zze.zzd(13);
                if (zzd > 6) {
                    zzaaeVar2.zzl(zzd - 6, false);
                    i3 += zzd;
                }
            }
            i4++;
            zzaapVar.zzj();
            zzaaeVar2.zzl(i4, false);
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }
}
