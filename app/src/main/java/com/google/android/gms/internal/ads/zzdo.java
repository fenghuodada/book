package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdo {
    private final zzfrr zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private zzdp zzd;
    private zzdp zze;
    private boolean zzf;

    public zzdo(zzfrr zzfrrVar) {
        this.zza = zzfrrVar;
        zzdp zzdpVar = zzdp.zza;
        this.zzd = zzdpVar;
        this.zze = zzdpVar;
        this.zzf = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z;
        ByteBuffer byteBuffer2;
        do {
            int i = 0;
            z = false;
            while (i <= zzi()) {
                if (!this.zzc[i].hasRemaining()) {
                    zzdr zzdrVar = (zzdr) this.zzb.get(i);
                    if (!zzdrVar.zzh()) {
                        zzdrVar.zze(i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzdr.zza);
                        this.zzc[i] = zzdrVar.zzb();
                        int i2 = ((byteBuffer2.remaining() - byteBuffer2.remaining()) > 0L ? 1 : ((byteBuffer2.remaining() - byteBuffer2.remaining()) == 0L ? 0 : -1));
                        boolean z2 = true;
                        if (i2 <= 0 && !this.zzc[i].hasRemaining()) {
                            z2 = false;
                        }
                        z |= z2;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzdr) this.zzb.get(i + 1)).zzd();
                    }
                }
                i++;
            }
        } while (z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdo) {
            zzdo zzdoVar = (zzdo) obj;
            if (this.zza.size() == zzdoVar.zza.size()) {
                for (int i = 0; i < this.zza.size(); i++) {
                    if (this.zza.get(i) != zzdoVar.zza.get(i)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzdp zza(zzdp zzdpVar) throws zzdq {
        if (zzdpVar.equals(zzdp.zza)) {
            throw new zzdq("Unhandled input format:", zzdpVar);
        }
        for (int i = 0; i < this.zza.size(); i++) {
            zzdr zzdrVar = (zzdr) this.zza.get(i);
            zzdp zza = zzdrVar.zza(zzdpVar);
            if (zzdrVar.zzg()) {
                zzdy.zzf(!zza.equals(zzdp.zza));
                zzdpVar = zza;
            }
        }
        this.zze = zzdpVar;
        return zzdpVar;
    }

    public final ByteBuffer zzb() {
        if (zzh()) {
            ByteBuffer byteBuffer = this.zzc[zzi()];
            if (!byteBuffer.hasRemaining()) {
                zzj(zzdr.zza);
            }
            return byteBuffer;
        }
        return zzdr.zza;
    }

    public final void zzc() {
        this.zzb.clear();
        this.zzd = this.zze;
        this.zzf = false;
        for (int i = 0; i < this.zza.size(); i++) {
            zzdr zzdrVar = (zzdr) this.zza.get(i);
            zzdrVar.zzc();
            if (zzdrVar.zzg()) {
                this.zzb.add(zzdrVar);
            }
        }
        this.zzc = new ByteBuffer[this.zzb.size()];
        for (int i2 = 0; i2 <= zzi(); i2++) {
            this.zzc[i2] = ((zzdr) this.zzb.get(i2)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzf) {
            return;
        }
        this.zzf = true;
        ((zzdr) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzf) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        for (int i = 0; i < this.zza.size(); i++) {
            zzdr zzdrVar = (zzdr) this.zza.get(i);
            zzdrVar.zzc();
            zzdrVar.zzf();
        }
        this.zzc = new ByteBuffer[0];
        zzdp zzdpVar = zzdp.zza;
        this.zzd = zzdpVar;
        this.zze = zzdpVar;
        this.zzf = false;
    }

    public final boolean zzg() {
        return this.zzf && ((zzdr) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
