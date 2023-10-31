package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgha {
    @Nullable
    private ArrayList zza = new ArrayList();
    private zzggx zzb = zzggx.zza;
    @Nullable
    private Integer zzc = null;

    public final zzgha zza(zzfxg zzfxgVar, int i, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            arrayList.add(new zzghc(zzfxgVar, i, str, str2, null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    public final zzgha zzb(zzggx zzggxVar) {
        if (this.zza != null) {
            this.zzb = zzggxVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zzgha zzc(int i) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zzghe zzd() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num == null) {
                zzghe zzgheVar = new zzghe(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
                this.zza = null;
                return zzgheVar;
            }
            int intValue = num.intValue();
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int zza = ((zzghc) arrayList.get(i)).zza();
                i++;
                if (zza == intValue) {
                    zzghe zzgheVar2 = new zzghe(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
                    this.zza = null;
                    return zzgheVar2;
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
