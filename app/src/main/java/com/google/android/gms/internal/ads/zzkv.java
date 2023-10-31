package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzkv implements zzkm {
    public final zztg zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzkv(zztn zztnVar, boolean z) {
        this.zza = new zztg(zztnVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final zzcx zza() {
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzkm
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
