package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.datastore.preferences.protobuf.C1169e;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.h0 */
/* loaded from: classes.dex */
public final class C6584h0 extends SQLiteOpenHelper {

    /* renamed from: c */
    public static final String f10412c = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: d */
    public static final int f10413d = 5;

    /* renamed from: e */
    public static final List<InterfaceC6585a> f10414e = Arrays.asList(new InterfaceC6585a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.c0
        @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6584h0.InterfaceC6585a
        /* renamed from: a */
        public final void mo6233a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
            sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
            sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
            sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
        }
    }, new InterfaceC6585a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d0
        @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6584h0.InterfaceC6585a
        /* renamed from: a */
        public final void mo6233a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
            sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
        }
    }, new InterfaceC6585a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e0
        @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6584h0.InterfaceC6585a
        /* renamed from: a */
        public final void mo6233a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
        }
    }, new InterfaceC6585a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f0
        @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6584h0.InterfaceC6585a
        /* renamed from: a */
        public final void mo6233a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
            sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
        }
    }, new InterfaceC6585a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g0
        @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6584h0.InterfaceC6585a
        /* renamed from: a */
        public final void mo6233a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
            sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
            sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
            sQLiteDatabase.execSQL(C6584h0.f10412c);
        }
    });

    /* renamed from: a */
    public final int f10415a;

    /* renamed from: b */
    public boolean f10416b;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.h0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6585a {
        /* renamed from: a */
        void mo6233a(SQLiteDatabase sQLiteDatabase);
    }

    @Inject
    public C6584h0(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f10416b = false;
        this.f10415a = i;
    }

    /* renamed from: a */
    public static void m6234a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<InterfaceC6585a> list = f10414e;
        if (i2 <= list.size()) {
            while (i < i2) {
                list.get(i).mo6233a(sQLiteDatabase);
                i++;
            }
            return;
        }
        StringBuilder m11130b = C1169e.m11130b("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
        m11130b.append(list.size());
        m11130b.append(" migrations are provided");
        throw new IllegalArgumentException(m11130b.toString());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f10416b = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f10416b) {
            onConfigure(sQLiteDatabase);
        }
        m6234a(sQLiteDatabase, 0, this.f10415a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f10416b) {
            onConfigure(sQLiteDatabase);
        }
        m6234a(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f10416b) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.f10416b) {
            onConfigure(sQLiteDatabase);
        }
        m6234a(sQLiteDatabase, i, i2);
    }
}
