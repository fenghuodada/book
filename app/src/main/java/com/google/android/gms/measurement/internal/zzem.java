package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;

/* loaded from: classes3.dex */
public final class zzem extends zzf {
    private final zzel zza;
    private boolean zzb;

    public zzem(zzgd zzgdVar) {
        super(zzgdVar);
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        this.zza = new zzel(this, zzaw, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0134  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzq(int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzem.zzq(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase == null) {
            this.zzb = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x023f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x023f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x023f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzi(int r23) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzem.zzi(int):java.util.List");
    }

    @WorkerThread
    public final void zzj() {
        int delete;
        zzg();
        try {
            SQLiteDatabase zzh = zzh();
            if (zzh == null || (delete = zzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzaA().zzj().zzb("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context zzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return zzaw.getDatabasePath("google_app_measurement_local.db").exists();
    }

    @WorkerThread
    public final boolean zzm() {
        int i;
        zzg();
        if (!this.zzb && zzl()) {
            int i2 = 5;
            for (i = 0; i < 5; i = i + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase zzh = zzh();
                        if (zzh == null) {
                            this.zzb = true;
                            return false;
                        }
                        zzh.beginTransaction();
                        zzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        zzh.setTransactionSuccessful();
                        zzh.endTransaction();
                        zzh.close();
                        return true;
                    } catch (SQLiteFullException e) {
                        this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e);
                        this.zzb = true;
                        i = 0 == 0 ? i + 1 : 0;
                        sQLiteDatabase.close();
                    } catch (SQLiteException e2) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e2);
                        this.zzb = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzt.zzaA().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] zzap = this.zzt.zzv().zzap(zzacVar);
        if (zzap.length > 131072) {
            this.zzt.zzaA().zzh().zza("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(2, zzap);
    }

    public final boolean zzo(zzau zzauVar) {
        Parcel obtain = Parcel.obtain();
        zzav.zza(zzauVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzt.zzaA().zzh().zza("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return zzq(0, marshall);
    }

    public final boolean zzp(zzlk zzlkVar) {
        Parcel obtain = Parcel.obtain();
        zzll.zza(zzlkVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.zzt.zzaA().zzh().zza("User property too long for local database. Sending directly to service");
            return false;
        }
        return zzq(1, marshall);
    }
}
