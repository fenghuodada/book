package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzccx implements zzgva {
    private final ByteBuffer zza;

    public zzccx(ByteBuffer byteBuffer) {
        this.zza = byteBuffer.duplicate();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgva
    public final int zza(ByteBuffer byteBuffer) throws IOException {
        if (this.zza.remaining() != 0 || byteBuffer.remaining() <= 0) {
            int min = Math.min(byteBuffer.remaining(), this.zza.remaining());
            byte[] bArr = new byte[min];
            this.zza.get(bArr);
            byteBuffer.put(bArr);
            return min;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgva
    public final long zzb() throws IOException {
        return this.zza.position();
    }

    @Override // com.google.android.gms.internal.ads.zzgva
    public final long zzc() throws IOException {
        return this.zza.limit();
    }

    @Override // com.google.android.gms.internal.ads.zzgva
    public final ByteBuffer zzd(long j, long j2) throws IOException {
        int position = this.zza.position();
        this.zza.position((int) j);
        ByteBuffer slice = this.zza.slice();
        slice.limit((int) j2);
        this.zza.position(position);
        return slice;
    }

    @Override // com.google.android.gms.internal.ads.zzgva
    public final void zze(long j) throws IOException {
        this.zza.position((int) j);
    }
}
