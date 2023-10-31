package com.google.android.gms.internal.ads;

import java.io.IOException;
import okhttp3.internal.p064ws.RealWebSocket;

/* loaded from: classes.dex */
final class zzafo {
    private final zzfd zza = new zzfd(8);
    private int zzb;

    private final long zzb(zzaap zzaapVar) throws IOException {
        zzaae zzaaeVar = (zzaae) zzaapVar;
        int i = 0;
        zzaaeVar.zzm(this.zza.zzH(), 0, 1, false);
        int i2 = this.zza.zzH()[0] & 255;
        if (i2 != 0) {
            int i3 = 128;
            int i4 = 0;
            while ((i2 & i3) == 0) {
                i3 >>= 1;
                i4++;
            }
            int i5 = i2 & (~i3);
            zzaaeVar.zzm(this.zza.zzH(), 1, i4, false);
            while (i < i4) {
                i++;
                i5 = (this.zza.zzH()[i] & 255) + (i5 << 8);
            }
            this.zzb = i4 + 1 + this.zzb;
            return i5;
        }
        return Long.MIN_VALUE;
    }

    public final boolean zza(zzaap zzaapVar) throws IOException {
        long zzb;
        int i;
        long zzd = zzaapVar.zzd();
        int i2 = (zzd > (-1L) ? 1 : (zzd == (-1L) ? 0 : -1));
        long j = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (i2 != 0 && zzd <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j = zzd;
        }
        zzaae zzaaeVar = (zzaae) zzaapVar;
        zzaaeVar.zzm(this.zza.zzH(), 0, 4, false);
        long zzs = this.zza.zzs();
        this.zzb = 4;
        while (zzs != 440786851) {
            int i3 = (int) j;
            int i4 = this.zzb + 1;
            this.zzb = i4;
            if (i4 == i3) {
                return false;
            }
            zzaaeVar.zzm(this.zza.zzH(), 0, 1, false);
            zzs = ((zzs << 8) & (-256)) | (this.zza.zzH()[0] & 255);
        }
        long zzb2 = zzb(zzaapVar);
        long j2 = this.zzb;
        if (zzb2 != Long.MIN_VALUE && (i2 == 0 || j2 + zzb2 < zzd)) {
            while (true) {
                int i5 = (this.zzb > (j2 + zzb2) ? 1 : (this.zzb == (j2 + zzb2) ? 0 : -1));
                if (i5 < 0) {
                    if (zzb(zzaapVar) == Long.MIN_VALUE || (zzb = zzb(zzaapVar)) < 0) {
                        return false;
                    }
                    if (i != 0) {
                        int i6 = (int) zzb;
                        zzaaeVar.zzl(i6, false);
                        this.zzb += i6;
                    }
                } else if (i5 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
