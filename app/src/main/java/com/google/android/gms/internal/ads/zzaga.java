package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class zzaga extends zzagc {
    public final long zza;
    public final List zzb;
    public final List zzc;

    public zzaga(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzagc
    public final String toString() {
        String zzf = zzagc.zzf(this.zzd);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        return zzf + " leaves: " + arrays + " containers: " + arrays2;
    }

    @Nullable
    public final zzaga zza(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzaga zzagaVar = (zzaga) this.zzc.get(i2);
            if (zzagaVar.zzd == i) {
                return zzagaVar;
            }
        }
        return null;
    }

    @Nullable
    public final zzagb zzb(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzagb zzagbVar = (zzagb) this.zzb.get(i2);
            if (zzagbVar.zzd == i) {
                return zzagbVar;
            }
        }
        return null;
    }

    public final void zzc(zzaga zzagaVar) {
        this.zzc.add(zzagaVar);
    }

    public final void zzd(zzagb zzagbVar) {
        this.zzb.add(zzagbVar);
    }
}
