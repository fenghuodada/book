package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzear {
    private final zzawx zza;
    private final Context zzb;
    private final zzdzv zzc;
    private final zzbzz zzd;
    private final String zze;
    private final zzfen zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzear(Context context, zzbzz zzbzzVar, zzawx zzawxVar, zzdzv zzdzvVar, String str, zzfen zzfenVar) {
        this.zzb = context;
        this.zzd = zzbzzVar;
        this.zza = zzawxVar;
        this.zzc = zzdzvVar;
        this.zze = str;
        this.zzf = zzfenVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzazg zzazgVar = (zzazg) arrayList.get(i);
            if (zzazgVar.zzw() == 2 && zzazgVar.zze() > j) {
                j = zzazgVar.zze();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
            return null;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzid)).booleanValue()) {
            zzfem zzb = zzfem.zzb("oa_upload");
            zzb.zza("oa_failed_reqs", String.valueOf(zzeak.zza(sQLiteDatabase, 0)));
            zzb.zza("oa_total_reqs", String.valueOf(zzeak.zza(sQLiteDatabase, 1)));
            zzb.zza("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("oa_last_successful_time", String.valueOf(zzeak.zzb(sQLiteDatabase, 2)));
            zzb.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
            this.zzf.zzb(zzb);
            ArrayList zzc = zzeak.zzc(sQLiteDatabase);
            zzc(sQLiteDatabase, zzc);
            int size = zzc.size();
            for (int i = 0; i < size; i++) {
                zzazg zzazgVar = (zzazg) zzc.get(i);
                zzfem zzb2 = zzfem.zzb("oa_signals");
                zzb2.zza("oa_session_id", this.zzg.zzP() ? "" : this.zze);
                zzazb zzf = zzazgVar.zzf();
                String valueOf = zzf.zzf() ? String.valueOf(zzf.zzh() - 1) : "-1";
                String obj = zzfsf.zzb(zzazgVar.zzk(), new zzfon() { // from class: com.google.android.gms.internal.ads.zzeaq
                    @Override // com.google.android.gms.internal.ads.zzfon
                    public final Object apply(Object obj2) {
                        return ((zzaxv) obj2).name();
                    }
                }).toString();
                zzb2.zza("oa_sig_ts", String.valueOf(zzazgVar.zze()));
                zzb2.zza("oa_sig_status", String.valueOf(zzazgVar.zzw() - 1));
                zzb2.zza("oa_sig_resp_lat", String.valueOf(zzazgVar.zzd()));
                zzb2.zza("oa_sig_render_lat", String.valueOf(zzazgVar.zzc()));
                zzb2.zza("oa_sig_formats", obj);
                zzb2.zza("oa_sig_nw_type", valueOf);
                zzb2.zza("oa_sig_wifi", String.valueOf(zzazgVar.zzx() - 1));
                zzb2.zza("oa_sig_airplane", String.valueOf(zzazgVar.zzt() - 1));
                zzb2.zza("oa_sig_data", String.valueOf(zzazgVar.zzu() - 1));
                zzb2.zza("oa_sig_nw_resp", String.valueOf(zzazgVar.zza()));
                zzb2.zza("oa_sig_offline", String.valueOf(zzazgVar.zzv() - 1));
                zzb2.zza("oa_sig_nw_state", String.valueOf(zzazgVar.zzj().zza()));
                if (zzf.zze() && zzf.zzf() && zzf.zzh() == 2) {
                    zzb2.zza("oa_sig_cell_type", String.valueOf(zzf.zzg() - 1));
                }
                this.zzf.zzb(zzb2);
            }
        } else {
            ArrayList zzc2 = zzeak.zzc(sQLiteDatabase);
            zzazh zza = zzazl.zza();
            zza.zzb(this.zzb.getPackageName());
            zza.zzd(Build.MODEL);
            zza.zze(zzeak.zza(sQLiteDatabase, 0));
            zza.zza(zzc2);
            zza.zzg(zzeak.zza(sQLiteDatabase, 1));
            zza.zzc(zzeak.zza(sQLiteDatabase, 3));
            zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
            zza.zzf(zzeak.zzb(sQLiteDatabase, 2));
            final zzazl zzazlVar = (zzazl) zza.zzal();
            zzc(sQLiteDatabase, zzc2);
            this.zza.zzb(new zzaww() { // from class: com.google.android.gms.internal.ads.zzeao
                @Override // com.google.android.gms.internal.ads.zzaww
                public final void zza(zzaym zzaymVar) {
                    zzaymVar.zzi(zzazl.this);
                }
            });
            zzazw zza2 = zzazx.zza();
            zza2.zza(this.zzd.zzb);
            zza2.zzc(this.zzd.zzc);
            zza2.zzb(true == this.zzd.zzd ? 0 : 2);
            final zzazx zzazxVar = (zzazx) zza2.zzal();
            this.zza.zzb(new zzaww() { // from class: com.google.android.gms.internal.ads.zzeap
                @Override // com.google.android.gms.internal.ads.zzaww
                public final void zza(zzaym zzaymVar) {
                    zzazx zzazxVar2 = zzazx.this;
                    zzaye zzayeVar = (zzaye) zzaymVar.zzb().zzaB();
                    zzayeVar.zzb(zzazxVar2);
                    zzaymVar.zzg(zzayeVar);
                }
            });
            this.zza.zzc(10004);
        }
        zzeak.zzf(sQLiteDatabase);
        return null;
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzean
                @Override // com.google.android.gms.internal.ads.zzfdg
                public final Object zza(Object obj) {
                    zzear.this.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            zzbzt.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
