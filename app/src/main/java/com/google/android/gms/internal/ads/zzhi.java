package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public class zzhi extends zzhc {
    public final zzhf zza = new zzhf();
    @Nullable
    public ByteBuffer zzb;
    public boolean zzc;
    public long zzd;
    @Nullable
    public ByteBuffer zze;
    private final int zzf;

    static {
        zzbr.zzb("media3.decoder");
    }

    public zzhi(int i, int i2) {
        this.zzf = i;
    }

    private final ByteBuffer zzm(int i) {
        int i2 = this.zzf;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.zzb;
        throw new zzhh(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzhc
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzc = false;
    }

    @EnsuresNonNull({"data"})
    public final void zzj(int i) {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer == null) {
            this.zzb = zzm(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.zzb = byteBuffer;
            return;
        }
        ByteBuffer zzm = zzm(i2);
        zzm.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            zzm.put(byteBuffer);
        }
        this.zzb = zzm;
    }

    public final void zzk() {
        ByteBuffer byteBuffer = this.zzb;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zze;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzl() {
        return zzd(1073741824);
    }
}
