package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
final class zzelb implements zzeqq {
    private final Set zza;

    public zzelb(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        final ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzfvr.zzh(new zzeqp() { // from class: com.google.android.gms.internal.ads.zzela
            @Override // com.google.android.gms.internal.ads.zzeqp
            public final void zzh(Object obj) {
                ((Bundle) obj).putStringArrayList("ad_types", arrayList);
            }
        });
    }
}
