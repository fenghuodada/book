package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzahw implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzahv
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzahw()};
        }
    };
    private final zzahx zzb = new zzahx(null);
    private final zzfd zzc = new zzfd(2786);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzaao
    public final int zza(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        int zza2 = zzaapVar.zza(this.zzc.zzH(), 0, 2786);
        if (zza2 == -1) {
            return -1;
        }
        this.zzc.zzF(0);
        this.zzc.zzE(zza2);
        if (!this.zzd) {
            this.zzb.zzd(0L, 4);
            this.zzd = true;
        }
        this.zzb.zza(this.zzc);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzb.zzb(zzaarVar, new zzajt(Integer.MIN_VALUE, 0, 1));
        zzaarVar.zzC();
        zzaarVar.zzN(new zzabm(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        this.zzd = false;
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        zzfd zzfdVar = new zzfd(10);
        int i = 0;
        while (true) {
            zzaae zzaaeVar = (zzaae) zzaapVar;
            zzaaeVar.zzm(zzfdVar.zzH(), 0, 10, false);
            zzfdVar.zzF(0);
            if (zzfdVar.zzm() != 4801587) {
                break;
            }
            zzfdVar.zzG(3);
            int zzj = zzfdVar.zzj();
            i += zzj + 10;
            zzaaeVar.zzl(zzj, false);
        }
        zzaapVar.zzj();
        zzaae zzaaeVar2 = (zzaae) zzaapVar;
        zzaaeVar2.zzl(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzaaeVar2.zzm(zzfdVar.zzH(), 0, 6, false);
            zzfdVar.zzF(0);
            if (zzfdVar.zzo() != 2935) {
                zzaapVar.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzaaeVar2.zzl(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int zzb = zzzp.zzb(zzfdVar.zzH());
                if (zzb == -1) {
                    return false;
                }
                zzaaeVar2.zzl(zzb - 6, false);
            }
        }
    }
}
