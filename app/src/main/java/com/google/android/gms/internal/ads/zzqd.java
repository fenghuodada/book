package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class zzqd {
    private ByteBuffer zza = zzdr.zza;
    private int zzc = 0;
    private int zzb = 2;

    public final void zza(zzhi zzhiVar) {
        ByteBuffer byteBuffer = zzhiVar.zzb;
        byteBuffer.getClass();
        if (byteBuffer.limit() - zzhiVar.zzb.position() == 0) {
            return;
        }
        ByteBuffer byteBuffer2 = zzhiVar.zzb;
        int position = byteBuffer2.position();
        int limit = byteBuffer2.limit();
        int i = limit - position;
        int i2 = (i + 255) / 255;
        int i3 = i2 + 27 + i;
        if (this.zza.capacity() < i3) {
            this.zza = ByteBuffer.allocate(i3).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.zza.clear();
        }
        ByteBuffer byteBuffer3 = this.zza;
        byteBuffer3.put((byte) 79);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 103);
        byteBuffer3.put((byte) 83);
        byteBuffer3.put((byte) 0);
        byteBuffer3.put((byte) 0);
        int zzb = this.zzc + zzabj.zzb(byteBuffer2);
        this.zzc = zzb;
        byteBuffer3.putLong(zzb);
        byteBuffer3.putInt(0);
        byteBuffer3.putInt(this.zzb);
        this.zzb++;
        byteBuffer3.putInt(0);
        byteBuffer3.put((byte) i2);
        for (int i4 = 0; i4 < i2; i4++) {
            if (i >= 255) {
                byteBuffer3.put((byte) -1);
                i -= 255;
            } else {
                byteBuffer3.put((byte) i);
                i = 0;
            }
        }
        while (position < limit) {
            byteBuffer3.put(byteBuffer2.get(position));
            position++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        byteBuffer3.putInt(22, zzfn.zzd(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        byteBuffer3.position(0);
        this.zza = byteBuffer3;
        zzhiVar.zzb();
        zzhiVar.zzj(this.zza.remaining());
        zzhiVar.zzb.put(this.zza);
        zzhiVar.zzk();
    }

    public final void zzb() {
        this.zza = zzdr.zza;
        this.zzc = 0;
        this.zzb = 2;
    }
}
