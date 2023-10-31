package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzauo {
    @VisibleForTesting
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    @Nullable
    public final zzaun zza(boolean z) {
        synchronized (this.zzb) {
            zzaun zzaunVar = null;
            if (this.zzc.isEmpty()) {
                zzbzt.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() < 2) {
                zzaun zzaunVar2 = (zzaun) this.zzc.get(0);
                if (z) {
                    this.zzc.remove(0);
                } else {
                    zzaunVar2.zzi();
                }
                return zzaunVar2;
            }
            int i2 = Integer.MIN_VALUE;
            int i3 = 0;
            for (zzaun zzaunVar3 : this.zzc) {
                int zzb = zzaunVar3.zzb();
                if (zzb > i2) {
                    i = i3;
                }
                int i4 = zzb > i2 ? zzb : i2;
                if (zzb > i2) {
                    zzaunVar = zzaunVar3;
                }
                i3++;
                i2 = i4;
            }
            this.zzc.remove(i);
            return zzaunVar;
        }
    }

    public final void zzb(zzaun zzaunVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int size = this.zzc.size();
                zzbzt.zze("Queue is full, current size = " + size);
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzaunVar.zzj(i);
            zzaunVar.zzn();
            this.zzc.add(zzaunVar);
        }
    }

    public final boolean zzc(zzaun zzaunVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzaun zzaunVar2 = (zzaun) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() && !zzaunVar.equals(zzaunVar2) && zzaunVar2.zzf().equals(zzaunVar.zzf())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzaunVar.equals(zzaunVar2) && zzaunVar2.zzd().equals(zzaunVar.zzd())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzaun zzaunVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzaunVar);
        }
    }
}
