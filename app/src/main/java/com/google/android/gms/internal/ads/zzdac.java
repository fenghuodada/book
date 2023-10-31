package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdac extends zzdas implements zzbhd {
    public zzdac(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbhd
    public final synchronized void zzbz(final String str, final String str2) {
        zzp(new zzdar() { // from class: com.google.android.gms.internal.ads.zzdab
            @Override // com.google.android.gms.internal.ads.zzdar
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
