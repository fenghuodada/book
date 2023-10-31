package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.analytics.C6652m;

/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes3.dex */
public final class zzaj extends SQLiteOpenHelper {
    final /* synthetic */ zzak zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzak zzakVar, Context context, String str) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzakVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final SQLiteDatabase getWritableDatabase() {
        zzkq zzkqVar;
        zzkq zzkqVar2;
        zzkq zzkqVar3;
        zzak zzakVar = this.zza;
        zzkqVar = zzakVar.zzk;
        zzakVar.zzt.zzf();
        if (zzkqVar.zzc(3600000L)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                zzkqVar2 = this.zza.zzk;
                zzkqVar2.zzb();
                C6652m.m6131a(this.zza.zzt, "Opening the database failed, dropping and recreating it");
                this.zza.zzt.zzf();
                if (!this.zza.zzt.zzaw().getDatabasePath("google_app_measurement.db").delete()) {
                    this.zza.zzt.zzaA().zzd().zzb("Failed to delete corrupted db file", "google_app_measurement.db");
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    zzkqVar3 = this.zza.zzk;
                    zzkqVar3.zza();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.zza.zzt.zzaA().zzd().zzb("Failed to open freshly created database", e);
                    throw e;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzal.zzb(this.zza.zzt.zzaA(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        zzet zzaA = this.zza.zzt.zzaA();
        strArr = zzak.zza;
        zzal.zza(zzaA, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        zzet zzaA2 = this.zza.zzt.zzaA();
        strArr2 = zzak.zzb;
        zzal.zza(zzaA2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
        zzet zzaA3 = this.zza.zzt.zzaA();
        strArr3 = zzak.zzc;
        zzal.zza(zzaA3, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
        zzet zzaA4 = this.zza.zzt.zzaA();
        strArr4 = zzak.zze;
        zzal.zza(zzaA4, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        zzet zzaA5 = this.zza.zzt.zzaA();
        strArr5 = zzak.zzd;
        zzal.zza(zzaA5, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
        zzet zzaA6 = this.zza.zzt.zzaA();
        strArr6 = zzak.zzg;
        zzal.zza(zzaA6, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", strArr6);
        zzet zzaA7 = this.zza.zzt.zzaA();
        strArr7 = zzak.zzh;
        zzal.zza(zzaA7, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", strArr7);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        zzet zzaA8 = this.zza.zzt.zzaA();
        strArr8 = zzak.zzi;
        zzal.zza(zzaA8, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr8);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        zzal.zza(this.zza.zzt.zzaA(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @WorkerThread
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}