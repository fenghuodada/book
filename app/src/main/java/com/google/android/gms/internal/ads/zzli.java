package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
/* loaded from: classes.dex */
public final class zzli {
    private final zzik zza;

    @Deprecated
    public zzli(Context context, zzcek zzcekVar) {
        this.zza = new zzik(context, zzcekVar);
    }

    @Deprecated
    public final zzli zza(final zzkg zzkgVar) {
        zzik zzikVar = this.zza;
        zzdy.zzf(!zzikVar.zzq);
        zzkgVar.getClass();
        zzikVar.zzf = new zzfpp() { // from class: com.google.android.gms.internal.ads.zzic
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                return zzkg.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzli zzb(final zzxd zzxdVar) {
        zzik zzikVar = this.zza;
        zzdy.zzf(!zzikVar.zzq);
        zzxdVar.getClass();
        zzikVar.zze = new zzfpp() { // from class: com.google.android.gms.internal.ads.zzid
            @Override // com.google.android.gms.internal.ads.zzfpp
            public final Object zza() {
                return zzxd.this;
            }
        };
        return this;
    }

    @Deprecated
    public final zzlj zzc() {
        zzik zzikVar = this.zza;
        zzdy.zzf(!zzikVar.zzq);
        zzikVar.zzq = true;
        return new zzlj(zzikVar);
    }
}
