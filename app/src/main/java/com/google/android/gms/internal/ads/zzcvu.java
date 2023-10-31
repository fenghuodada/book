package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Set;

@VisibleForTesting
/* loaded from: classes.dex */
public final class zzcvu extends zzdas implements zzcvm {
    @VisibleForTesting
    public zzcvu(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcvr
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcvy) obj).zzk(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zzb() {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcvs
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcvy) obj).zzk(zzfba.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zzc(final zzdex zzdexVar) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcvt
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcvy) obj).zzk(zzfba.zzd(12, zzdex.this.getMessage(), null));
            }
        });
    }
}
