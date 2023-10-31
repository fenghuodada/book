package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzccy {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzamx zzamxVar;
        zzamw zzamwVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator it = new zzams(new zzccx(duplicate), zzcda.zzb).zze().iterator();
            while (true) {
                zzamxVar = null;
                if (!it.hasNext()) {
                    zzamwVar = null;
                    break;
                }
                zzamu zzamuVar = (zzamu) it.next();
                if (zzamuVar instanceof zzamw) {
                    zzamwVar = (zzamw) zzamuVar;
                    break;
                }
            }
            Iterator it2 = zzamwVar.zze().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzamu zzamuVar2 = (zzamu) it2.next();
                if (zzamuVar2 instanceof zzamx) {
                    zzamxVar = (zzamx) zzamuVar2;
                    break;
                }
            }
            long zzd = (zzamxVar.zzd() * 1000) / zzamxVar.zze();
            this.zza = zzd;
            return zzd;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
