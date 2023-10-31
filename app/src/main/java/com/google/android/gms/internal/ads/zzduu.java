package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes.dex */
public final class zzduu implements zzgvo {
    public static zzduu zza() {
        zzduu zzduuVar;
        zzduuVar = zzdut.zza;
        return zzduuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* synthetic */ Object zzb() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        zzgvw.zzb(uuid);
        return uuid;
    }
}
