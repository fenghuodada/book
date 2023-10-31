package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class zzdzu implements zzfvn {
    final /* synthetic */ zzfdg zza;

    public zzdzu(zzdzv zzdzvVar, zzfdg zzfdgVar) {
        this.zza = zzfdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzbzt.zzg("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            zzbzt.zzg("Error executing function on offline signal database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
