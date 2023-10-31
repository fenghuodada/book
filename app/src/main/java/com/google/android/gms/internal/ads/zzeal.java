package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class zzeal implements zzfee {
    private final zzdzz zza;
    private final zzead zzb;

    public zzeal(zzdzz zzdzzVar, zzead zzeadVar) {
        this.zza = zzdzzVar;
        this.zzb = zzeadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbB(zzfdx zzfdxVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbC(zzfdx zzfdxVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfU)).booleanValue() && zzfdx.RENDERER == zzfdxVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzc(zzfdx zzfdxVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfU)).booleanValue()) {
            if (zzfdx.RENDERER == zzfdxVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
            } else if (zzfdx.PRELOADED_LOADER == zzfdxVar || zzfdx.SERVER_TRANSACTION == zzfdxVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                final zzead zzeadVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzeadVar.zza.zza(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzeac
                    @Override // com.google.android.gms.internal.ads.zzfdg
                    public final Object zza(Object obj) {
                        zzead zzeadVar2 = zzead.this;
                        long j = zzd;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeadVar2.zzf()) {
                            return null;
                        }
                        zzazf zzg = zzazg.zzg();
                        zzg.zzh(j);
                        byte[] zzax = ((zzazg) zzg.zzal()).zzax();
                        zzeak.zzg(sQLiteDatabase, false, false);
                        zzeak.zzd(sQLiteDatabase, j, zzax);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzd(zzfdx zzfdxVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfU)).booleanValue() && zzfdx.RENDERER == zzfdxVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }
}
