package com.vungle.warren.persistence;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.C10089k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.vungle.warren.persistence.c */
/* loaded from: classes3.dex */
public final class C9919c extends SQLiteOpenHelper {

    /* renamed from: b */
    public static final /* synthetic */ int f19917b = 0;

    /* renamed from: a */
    public final InterfaceC9921b f19918a;

    /* renamed from: com.vungle.warren.persistence.c$a */
    /* loaded from: classes3.dex */
    public static class C9920a extends Exception {
        public C9920a(String str) {
            super(str);
        }
    }

    /* renamed from: com.vungle.warren.persistence.c$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9921b {
    }

    /* renamed from: com.vungle.warren.persistence.c$c */
    /* loaded from: classes3.dex */
    public static class C9922c extends ContextWrapper {
        public C9922c(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        @SuppressLint({"NewApi"})
        public final File getDatabasePath(String str) {
            File databasePath = super.getDatabasePath(str);
            File file = new File(getApplicationContext().getNoBackupFilesDir(), str);
            try {
                C10089k.m1268b(new File(databasePath.getPath()));
                C10089k.m1268b(new File(databasePath.getPath() + "-journal"));
            } catch (IOException unused) {
                int i = C9919c.f19917b;
                VungleLogger.m1602d("c", "DatabaseHelper", "Failed to delete old db/-journal");
            }
            return file;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory) {
            return SQLiteDatabase.openDatabase(getDatabasePath(str).getPath(), cursorFactory, ((i & 8) != 0 ? 536870912 : 0) | 268435456 | ((i & 16) != 0 ? 16 : 0));
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final SQLiteDatabase openOrCreateDatabase(String str, int i, SQLiteDatabase.CursorFactory cursorFactory, DatabaseErrorHandler databaseErrorHandler) {
            return SQLiteDatabase.openDatabase(getDatabasePath(str).getPath(), cursorFactory, ((i & 8) != 0 ? 536870912 : 0) | 268435456 | ((i & 16) != 0 ? 16 : 0), databaseErrorHandler);
        }
    }

    public C9919c(@NonNull Context context, @NonNull C9928h.C9944o c9944o) {
        super(new C9922c(context.getApplicationContext()), "vungle_db", (SQLiteDatabase.CursorFactory) null, 11);
        this.f19918a = c9944o;
    }

    /* renamed from: a */
    public final synchronized SQLiteDatabase m1411a() {
        return getWritableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onCreate(SQLiteDatabase sQLiteDatabase) {
        ((C9928h.C9944o) this.f19918a).m1372a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C9928h.C9944o c9944o = (C9928h.C9944o) this.f19918a;
        c9944o.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM sqlite_master WHERE type='table'", null);
        while (rawQuery != null && rawQuery.moveToNext()) {
            String string = rawQuery.getString(1);
            if (!string.equals("android_metadata") && !string.startsWith("sqlite_")) {
                arrayList.add(string);
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) it.next()));
        }
        c9944o.m1372a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        ((C9928h.C9944o) this.f19918a).getClass();
        if (i < 2) {
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN status INTEGER DEFAULT 1");
        }
        if (i < 3) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS vision_data(_id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp NUMERIC, creative TEXT, campaign TEXT, advertiser TEXT )");
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN ad_size TEXT ");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN tt_download NUMERIC DEFAULT -1");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN ad_size TEXT ");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN refresh_duration NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN supported_template_types NUMERIC DEFAULT 0");
        }
        if (i < 4) {
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN header_bidding SHORT ");
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN header_bidding SHORT ");
        }
        if (i < 5) {
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN autocache_priority NUMERIC DEFAULT 2147483647");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_timestamp NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN ad_request_start_time NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN init_timestamp NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN asset_download_duration NUMERIC DEFAULT 0");
        }
        if (i < 6) {
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_enable_om_sdk NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_om_sdk_extra_vast TEXT ");
        }
        if (i < 7) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS analytic_url(_id INTEGER PRIMARY KEY AUTOINCREMENT,  item_id TEXT UNIQUE)");
        }
        if (i < 8) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cache_bust(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, id TEXT, time_window_end INTEGER, id_type INTEGER, event_ids TEXT, timestamp_processed INTEGER )");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_request_timestamp NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN max_hb_cache NUMERIC DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE placement ADD COLUMN recommended_ad_size TEXT ");
        }
        if (i < 9) {
            sQLiteDatabase.execSQL("ALTER TABLE report ADD COLUMN play_remote_url SHORT DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_assets_fully_downloaded SHORT DEFAULT 0");
        }
        if (i < 10) {
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_click_coordinates_enabled SHORT DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_deep_link TEXT ");
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_notifications TEXT ");
        }
        if (i < 11) {
            sQLiteDatabase.execSQL("ALTER TABLE advertisement ADD COLUMN column_header_bidding SHORT DEFAULT 0");
        }
    }
}
