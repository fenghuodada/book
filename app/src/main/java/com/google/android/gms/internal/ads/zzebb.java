package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class zzebb implements zzfvn {
    final /* synthetic */ zzfdg zza;

    public zzebb(zzebc zzebcVar, zzfdg zzfdgVar) {
        this.zza = zzfdgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzbzt.zzg("Failed to get offline buffered ping database: ".concat(String.valueOf(th.getMessage())));
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zza((SQLiteDatabase) obj);
        } catch (Exception e) {
            zzbzt.zzg("Error executing function on offline buffered ping database: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
