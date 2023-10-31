package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class zzcvg extends zzdas implements com.google.android.gms.ads.internal.client.zza {
    public zzcvg(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzcvf
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zza) obj).onAdClicked();
            }
        });
    }
}
