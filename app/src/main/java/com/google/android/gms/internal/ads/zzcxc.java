package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcxc extends zzdas implements zzbhb {
    private final Bundle zzb;

    public zzcxc(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbhb
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcxb
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
