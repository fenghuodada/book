package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzrg extends zzhi {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzrg() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzhi, com.google.android.gms.internal.ads.zzhc
    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzm() {
        return this.zzg;
    }

    public final long zzn() {
        return this.zzf;
    }

    public final void zzo(@IntRange(from = 1) int i) {
        this.zzh = i;
    }

    public final boolean zzp(zzhi zzhiVar) {
        ByteBuffer byteBuffer;
        zzdy.zzd(!zzhiVar.zzd(1073741824));
        zzdy.zzd(!zzhiVar.zzd(268435456));
        zzdy.zzd(!zzhiVar.zzd(4));
        if (zzq()) {
            if (this.zzg >= this.zzh || zzhiVar.zzd(Integer.MIN_VALUE) != zzd(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzhiVar.zzb;
            if (byteBuffer2 != null && (byteBuffer = this.zzb) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.zzg;
        this.zzg = i + 1;
        if (i == 0) {
            this.zzd = zzhiVar.zzd;
            if (zzhiVar.zzd(1)) {
                zzc(1);
            }
        }
        if (zzhiVar.zzd(Integer.MIN_VALUE)) {
            zzc(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = zzhiVar.zzb;
        if (byteBuffer3 != null) {
            zzj(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzhiVar.zzd;
        return true;
    }

    public final boolean zzq() {
        return this.zzg > 0;
    }
}
