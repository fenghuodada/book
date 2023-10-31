package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcwh extends zzdas {
    public zzcwh(Set set) {
        super(set);
    }

    public final void zza(final Context context) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcwf
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcwd) obj).zzbn(context);
            }
        });
    }

    public final void zzb(final Context context) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcwg
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcwd) obj).zzbp(context);
            }
        });
    }

    public final void zzc(final Context context) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcwe
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((zzcwd) obj).zzbq(context);
            }
        });
    }
}
