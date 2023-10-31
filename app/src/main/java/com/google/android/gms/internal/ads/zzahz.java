package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class zzahz implements zzaao {
    public static final zzaav zza = new zzaav() { // from class: com.google.android.gms.internal.ads.zzahy
        @Override // com.google.android.gms.internal.ads.zzaav
        public final /* synthetic */ zzaao[] zza(Uri uri, Map map) {
            int i = zzaau.zza;
            return new zzaao[]{new zzahz()};
        }
    };
    private final zzaia zzb = new zzaia(null);
    private final zzfd zzc = new zzfd((int) Http2.INITIAL_MAX_FRAME_SIZE);
    private boolean zzd;

    @Override // com.google.android.gms.internal.ads.zzaao
    public final int zza(zzaap zzaapVar, zzabk zzabkVar) throws IOException {
        int zza2 = zzaapVar.zza(this.zzc.zzH(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
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
        int i;
        zzfd zzfdVar = new zzfd(10);
        int i2 = 0;
        while (true) {
            zzaae zzaaeVar = (zzaae) zzaapVar;
            zzaaeVar.zzm(zzfdVar.zzH(), 0, 10, false);
            zzfdVar.zzF(0);
            if (zzfdVar.zzm() != 4801587) {
                break;
            }
            zzfdVar.zzG(3);
            int zzj = zzfdVar.zzj();
            i2 += zzj + 10;
            zzaaeVar.zzl(zzj, false);
        }
        zzaapVar.zzj();
        zzaae zzaaeVar2 = (zzaae) zzaapVar;
        zzaaeVar2.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzaaeVar2.zzm(zzfdVar.zzH(), 0, 7, false);
            zzfdVar.zzF(0);
            int zzo = zzfdVar.zzo();
            if (zzo == 44096 || zzo == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] zzH = zzfdVar.zzH();
                if (zzH.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((zzH[2] & 255) << 8) | (zzH[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((zzH[4] & 255) << 16) | ((zzH[5] & 255) << 8) | (zzH[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (zzo == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzaaeVar2.zzl(i - 7, false);
            } else {
                zzaapVar.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzaaeVar2.zzl(i4, false);
                i3 = 0;
            }
        }
    }
}
