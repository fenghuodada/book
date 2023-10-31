package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzebc extends SQLiteOpenHelper {
    private final Context zza;
    private final zzfwc zzb;

    public zzebc(Context context, zzfwc zzfwcVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhS)).intValue());
        this.zza = context;
        this.zzb = zzfwcVar;
    }

    public static /* synthetic */ Void zzb(zzbzy zzbzyVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzbzyVar);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, zzbzy zzbzyVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzbzyVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzbzy zzbzyVar) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{ImagesContract.URL}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(ImagesContract.URL);
                if (columnIndex != -1) {
                    strArr[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzbzyVar.zza(strArr[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final /* synthetic */ Void zza(zzebe zzebeVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzebeVar.zza));
        contentValues.put("gws_query_id", zzebeVar.zzb);
        contentValues.put(ImagesContract.URL, zzebeVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzebeVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbr zzv = com.google.android.gms.ads.internal.util.zzs.zzv(this.zza);
        if (zzv != null) {
            try {
                zzv.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzeaz
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                zzebc.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzebe zzebeVar) {
        zze(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzeax
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                zzebc.this.zza(zzebeVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzfdg zzfdgVar) {
        zzfvr.zzq(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeav
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzebc.this.getWritableDatabase();
            }
        }), new zzebb(this, zzfdgVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final zzbzy zzbzyVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeaw
            @Override // java.lang.Runnable
            public final void run() {
                zzebc.zzf(sQLiteDatabase, str, zzbzyVar);
            }
        });
    }

    public final void zzh(final zzbzy zzbzyVar, final String str) {
        zze(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzeba
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                zzebc.this.zzg((SQLiteDatabase) obj, zzbzyVar, str);
                return null;
            }
        });
    }
}
