package com.vungle.warren.persistence;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.error.VungleException;
import com.vungle.warren.model.AdAsset;
import com.vungle.warren.model.Advertisement;
import com.vungle.warren.model.C9852a;
import com.vungle.warren.model.C9856b;
import com.vungle.warren.model.C9863c;
import com.vungle.warren.model.C9864d;
import com.vungle.warren.model.C9866f;
import com.vungle.warren.model.C9867g;
import com.vungle.warren.model.C9868h;
import com.vungle.warren.model.C9875k;
import com.vungle.warren.model.C9876l;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.model.C9880n;
import com.vungle.warren.model.C9881o;
import com.vungle.warren.model.C9882p;
import com.vungle.warren.model.CacheBust;
import com.vungle.warren.model.Placement;
import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.utility.C10089k;
import com.vungle.warren.utility.C10111y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.vungle.warren.persistence.h */
/* loaded from: classes3.dex */
public final class C9928h {

    /* renamed from: f */
    public static final /* synthetic */ int f19928f = 0;
    @VisibleForTesting

    /* renamed from: a */
    public final C9919c f19929a;

    /* renamed from: b */
    public final C10111y f19930b;

    /* renamed from: c */
    public final ExecutorService f19931c;

    /* renamed from: d */
    public final InterfaceC9923d f19932d;

    /* renamed from: e */
    public final HashMap f19933e;

    /* renamed from: com.vungle.warren.persistence.h$a */
    /* loaded from: classes3.dex */
    public class CallableC9929a implements Callable<List<Advertisement>> {

        /* renamed from: a */
        public final /* synthetic */ String f19934a;

        /* renamed from: b */
        public final /* synthetic */ String f19935b;

        public CallableC9929a(String str, String str2) {
            this.f19934a = str;
            this.f19935b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final List<Advertisement> call() throws Exception {
            String[] strArr;
            C9928h c9928h = C9928h.this;
            c9928h.getClass();
            StringBuilder sb = new StringBuilder(" Searching for valid advertisement for placement with ");
            String str = this.f19934a;
            sb.append(str);
            sb.append("event ID ");
            String str2 = this.f19935b;
            sb.append(str2);
            Log.i("h", sb.toString());
            StringBuilder sb2 = new StringBuilder("placement_id = ? AND (state = ? OR state = ?) AND expire_time > ?");
            if (str2 != null) {
                sb2.append(" AND item_id = ?");
                strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000), str2};
            } else {
                strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000)};
            }
            String sb3 = sb2.toString();
            C9856b c9856b = (C9856b) c9928h.f19933e.get(Advertisement.class);
            ArrayList arrayList = new ArrayList();
            Cursor query = c9928h.f19929a.m1411a().query("advertisement", null, sb3, strArr, null, null, "state DESC", null);
            if (query != null) {
                while (c9856b != null) {
                    try {
                        try {
                            if (!query.moveToNext()) {
                                break;
                            }
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(query, contentValues);
                            arrayList.add(c9856b.mo1412b(contentValues));
                        } catch (Exception e) {
                            VungleLogger.m1605a(C9928h.class.getSimpleName(), "findValidAdvertisementsForPlacementFromDB", e.toString());
                            arrayList = new ArrayList();
                        }
                    } finally {
                        query.close();
                    }
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.vungle.warren.persistence.h$b */
    /* loaded from: classes3.dex */
    public class CallableC9930b<T> implements Callable<List<T>> {

        /* renamed from: a */
        public final /* synthetic */ Class f19937a;

        public CallableC9930b(Class cls) {
            this.f19937a = cls;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() throws Exception {
            return C9928h.this.m1379t(this.f19937a);
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$c */
    /* loaded from: classes3.dex */
    public class CallableC9931c implements Callable<List<AdAsset>> {

        /* renamed from: a */
        public final /* synthetic */ String f19939a;

        public CallableC9931c(String str) {
            this.f19939a = str;
        }

        @Override // java.util.concurrent.Callable
        public final List<AdAsset> call() throws Exception {
            C9928h c9928h = C9928h.this;
            c9928h.getClass();
            return c9928h.m1388k(AdAsset.class, c9928h.f19929a.m1411a().query("adAsset", null, "ad_identifier = ? ", new String[]{this.f19939a}, null, null, null, null));
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$d */
    /* loaded from: classes3.dex */
    public class CallableC9932d implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Object f19941a;

        public CallableC9932d(Object obj) {
            this.f19941a = obj;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            C9928h.this.m1389j(this.f19941a);
            return null;
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$e */
    /* loaded from: classes3.dex */
    public class CallableC9933e implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ String f19943a;

        public CallableC9933e(String str) {
            this.f19943a = str;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            C9928h.m1397b(C9928h.this, this.f19943a);
            return null;
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$f */
    /* loaded from: classes3.dex */
    public class CallableC9934f implements Callable<Collection<Placement>> {
        public CallableC9934f() {
        }

        @Override // java.util.concurrent.Callable
        public final Collection<Placement> call() throws Exception {
            List m1388k;
            synchronized (C9928h.this) {
                m1388k = C9928h.this.m1388k(Placement.class, C9928h.this.f19929a.m1411a().query("placement", null, "is_valid = ?", new String[]{"1"}, null, null, null, null));
            }
            return m1388k;
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$g */
    /* loaded from: classes3.dex */
    public class CallableC9935g implements Callable<File> {

        /* renamed from: a */
        public final /* synthetic */ String f19946a;

        public CallableC9935g(String str) {
            this.f19946a = str;
        }

        @Override // java.util.concurrent.Callable
        public final File call() throws Exception {
            return C9928h.this.f19932d.mo1401c(this.f19946a);
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$h */
    /* loaded from: classes3.dex */
    public class CallableC9936h implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ int f19948a;

        /* renamed from: b */
        public final /* synthetic */ Advertisement f19949b;

        /* renamed from: c */
        public final /* synthetic */ String f19950c;

        public CallableC9936h(int i, Advertisement advertisement, String str) {
            this.f19948a = i;
            this.f19949b = advertisement;
            this.f19950c = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
            if (r1 != 5) goto L13;
         */
        @Override // java.util.concurrent.Callable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Void call() throws java.lang.Exception {
            /*
                r6 = this;
                int r0 = com.vungle.warren.persistence.C9928h.f19928f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Setting "
                r0.<init>(r1)
                int r1 = r6.f19948a
                r0.append(r1)
                java.lang.String r2 = " for adv "
                r0.append(r2)
                com.vungle.warren.model.Advertisement r2 = r6.f19949b
                java.lang.String r3 = r2.getId()
                r0.append(r3)
                java.lang.String r3 = " and pl "
                r0.append(r3)
                java.lang.String r3 = r6.f19950c
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r4 = "h"
                android.util.Log.i(r4, r0)
                r2.f19725M = r1
                r0 = 0
                com.vungle.warren.persistence.h r4 = com.vungle.warren.persistence.C9928h.this
                if (r1 == 0) goto L51
                r5 = 1
                if (r1 == r5) goto L51
                r5 = 2
                if (r1 == r5) goto L4e
                r5 = 3
                if (r1 == r5) goto L46
                r5 = 4
                if (r1 == r5) goto L46
                r5 = 5
                if (r1 == r5) goto L51
                goto L56
            L46:
                java.lang.String r1 = r2.getId()
                com.vungle.warren.persistence.C9928h.m1397b(r4, r1)
                goto L56
            L4e:
                r2.f19726N = r0
                goto L53
            L51:
                r2.f19726N = r3
            L53:
                com.vungle.warren.persistence.C9928h.m1394e(r4, r2)
            L56:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.persistence.C9928h.CallableC9936h.call():java.lang.Object");
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$i */
    /* loaded from: classes3.dex */
    public class CallableC9937i implements Callable<Void> {

        /* renamed from: a */
        public final /* synthetic */ Object f19952a;

        public CallableC9937i(Object obj) {
            this.f19952a = obj;
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            C9928h.m1394e(C9928h.this, this.f19952a);
            return null;
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$j */
    /* loaded from: classes3.dex */
    public class RunnableC9938j implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f19954a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9943n f19955b;

        /* renamed from: com.vungle.warren.persistence.h$j$a */
        /* loaded from: classes3.dex */
        public class RunnableC9939a implements Runnable {
            public RunnableC9939a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC9938j.this.f19955b.mo1325b();
            }
        }

        public RunnableC9938j(Object obj, InterfaceC9943n interfaceC9943n) {
            this.f19954a = obj;
            this.f19955b = interfaceC9943n;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC9943n interfaceC9943n = this.f19955b;
            C9928h c9928h = C9928h.this;
            try {
                C9928h.m1394e(c9928h, this.f19954a);
                if (interfaceC9943n != null) {
                    c9928h.f19931c.execute(new RunnableC9939a());
                }
            } catch (C9919c.C9920a e) {
                c9928h.getClass();
                if (interfaceC9943n != null) {
                    c9928h.f19931c.execute(new RunnableC9959v(interfaceC9943n, e));
                }
            }
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$k */
    /* loaded from: classes3.dex */
    public class RunnableC9940k implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9943n f19958a;

        public RunnableC9940k(InterfaceC9943n interfaceC9943n) {
            this.f19958a = interfaceC9943n;
        }

        @Override // java.lang.Runnable
        public final void run() {
            VungleException vungleException = new VungleException(39);
            C9928h c9928h = C9928h.this;
            c9928h.getClass();
            InterfaceC9943n interfaceC9943n = this.f19958a;
            if (interfaceC9943n != null) {
                c9928h.f19931c.execute(new RunnableC9959v(interfaceC9943n, vungleException));
            }
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$l */
    /* loaded from: classes3.dex */
    public class CallableC9941l implements Callable<Advertisement> {

        /* renamed from: a */
        public final /* synthetic */ String f19960a;

        /* renamed from: b */
        public final /* synthetic */ String f19961b;

        public CallableC9941l(String str, String str2) {
            this.f19960a = str;
            this.f19961b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final Advertisement call() throws Exception {
            String[] strArr;
            C9928h c9928h = C9928h.this;
            c9928h.getClass();
            StringBuilder sb = new StringBuilder(" Searching for valid advertisement for placement with ");
            String str = this.f19960a;
            sb.append(str);
            sb.append("event ID ");
            String str2 = this.f19961b;
            sb.append(str2);
            Log.i("h", sb.toString());
            StringBuilder sb2 = new StringBuilder("placement_id = ? AND (state = ? OR state = ?) AND expire_time > ?");
            if (str2 != null) {
                sb2.append(" AND item_id = ?");
                strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000), str2};
            } else {
                strArr = new String[]{str, String.valueOf(1), String.valueOf(0), String.valueOf(System.currentTimeMillis() / 1000)};
            }
            Cursor query = c9928h.f19929a.m1411a().query("advertisement", null, sb2.toString(), strArr, null, null, null, "1");
            Advertisement advertisement = null;
            if (query != null) {
                try {
                    try {
                        C9856b c9856b = (C9856b) c9928h.f19933e.get(Advertisement.class);
                        if (c9856b != null && query.moveToNext()) {
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(query, contentValues);
                            advertisement = c9856b.mo1412b(contentValues);
                        }
                    } catch (Exception e) {
                        VungleLogger.m1605a(C9928h.class.getSimpleName(), "findValidAdvertisementForPlacementFromDB", e.toString());
                    }
                } finally {
                    query.close();
                }
            }
            return advertisement;
        }
    }

    /* renamed from: com.vungle.warren.persistence.h$m */
    /* loaded from: classes3.dex */
    public interface InterfaceC9942m<T> {
        /* renamed from: a */
        void mo1373a(T t);
    }

    /* renamed from: com.vungle.warren.persistence.h$n */
    /* loaded from: classes3.dex */
    public interface InterfaceC9943n {
        /* renamed from: a */
        void mo1326a();

        /* renamed from: b */
        void mo1325b();
    }

    /* renamed from: com.vungle.warren.persistence.h$o */
    /* loaded from: classes3.dex */
    public static class C9944o implements C9919c.InterfaceC9921b {

        /* renamed from: a */
        public final Context f19963a;

        public C9944o(Context context) {
            this.f19963a = context;
        }

        /* renamed from: a */
        public final void m1372a(SQLiteDatabase sQLiteDatabase) {
            boolean z;
            Context context = this.f19963a;
            context.deleteDatabase("vungle");
            File externalFilesDir = context.getExternalFilesDir(null);
            if (Environment.getExternalStorageState().equals("mounted") && externalFilesDir != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && externalFilesDir.exists()) {
                try {
                    C10089k.m1268b(new File(externalFilesDir, ".vungle"));
                } catch (IOException e) {
                    int i = C9928h.f19928f;
                    Log.e("h", "IOException ", e);
                }
            }
            File filesDir = context.getFilesDir();
            if (filesDir.exists()) {
                try {
                    C10089k.m1268b(new File(filesDir, "vungle"));
                } catch (IOException e2) {
                    int i2 = C9928h.f19928f;
                    Log.e("h", "IOException ", e2);
                }
            }
            try {
                C10089k.m1268b(new File(context.getCacheDir() + File.separator + "downloads_vungle"));
            } catch (IOException e3) {
                int i3 = C9928h.f19928f;
                Log.e("h", "IOException ", e3);
            }
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS advertisement(_id INTEGER PRIMARY KEY AUTOINCREMENT,  item_id TEXT UNIQUE, ad_config TEXT,ad_type INT, expire_time NUMERIC, delay NUMERIC, show_close_delay INT, show_close_incentivized INT, countdown INT, video_height INT, video_width INT, cta_overlay_enabled SHORT, cta_click_area NUMERIC, retry_count INT, requires_non_market_install SHORT, app_id TEXT, campaign TEXT, video_url TEXT, md5 TEXT, postroll_bundle_url TEXT, cta_destination_url TEXT, cta_url TEXT, ad_token TEXT, video_identifier TEXT, template_url TEXT, TEMPLATE_ID TEXT, TEMPLATE_TYPE TEXT, ad_market_id TEXT,bid_token TEXT,  checkpoints TEXT, template_settings TEXT, mraid_files TEXT, cacheable_assets TEXT, state INT, placement_id TEXT, tt_download NUMERIC,asset_download_timestamp NUMERIC,asset_download_duration NUMERIC,ad_request_start_time NUMERIC,column_enable_om_sdk SHORT,column_om_sdk_extra_vast TEXT,column_request_timestamp NUMERIC,column_click_coordinates_enabled SHORT,dynamic_events_and_urls TEXT, column_deep_link TEXT, column_notifications TEXT, column_assets_fully_downloaded SHORT, column_header_bidding SHORT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS placement(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, incentivized SHORT, auto_cached SHORT, is_valid SHORT, wakeup_time NUMERIC, header_bidding SHORT, refresh_duration NUMERIC, supported_template_types NUMERIC, ad_size TEXT, autocache_priority NUMERIC, max_hb_cache NUMERIC, recommended_ad_size TEXT)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cookie(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, bools TEXT, ints TEXT, longs TEXT, strings TEXT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS report(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE,appId TEXT, placementId TEXT, adToken TEXT, incentivized SHORT, header_bidding SHORT, adStartTime NUMERIC, url TEXT, ad_duration NUMERIC, tt_download NUMERIC, campaign TEXT, videoViewed NUMERIC, ad_type TEXT, template_id TEXT, was_CTAC_licked SHORT, clicked_through TEXT, errors TEXT, user_actions TEXT, user_id TEXT, ordinal INT, videoLength NUMERIC, status INT, ad_size TEXT, init_timestamp NUMERIC, asset_download_duration NUMERIC,play_remote_url SHORT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS adAsset ( _id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, paren_id TEXT , ad_identifier TEXT NOT NULL, server_path TEXT, local_path TEXT NOT NULL, file_status SHORT, file_type SHORT, file_size INT, retry_count SHORT, retry_error SHORT, unique ( local_path, ad_identifier ));");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS vision_data(_id INTEGER PRIMARY KEY AUTOINCREMENT, timestamp NUMERIC, creative TEXT, campaign TEXT, advertiser TEXT )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS analytic_url(_id INTEGER PRIMARY KEY AUTOINCREMENT,  item_id TEXT UNIQUE)");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cache_bust(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE, id TEXT, time_window_end INTEGER, id_type INTEGER, event_ids TEXT, timestamp_processed INTEGER )");
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session_data(_id INTEGER PRIMARY KEY AUTOINCREMENT, item_id TEXT UNIQUE,json_string TEXT, send_attempts INT)");
        }

        /* renamed from: b */
        public final void m1371b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS advertisement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cookie");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS placement");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS report");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS adAsset");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS vision_data");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS analytic_url");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cache_bust");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS session_data");
        }
    }

    public C9928h(Context context, InterfaceC9923d interfaceC9923d, C10111y c10111y, ExecutorService executorService) {
        HashMap hashMap = new HashMap();
        this.f19933e = hashMap;
        Context applicationContext = context.getApplicationContext();
        this.f19930b = c10111y;
        this.f19931c = executorService;
        this.f19929a = new C9919c(context, new C9944o(applicationContext));
        this.f19932d = interfaceC9923d;
        hashMap.put(Placement.class, new C9875k());
        hashMap.put(C9867g.class, new C9868h());
        hashMap.put(Report.class, new C9876l());
        hashMap.put(Advertisement.class, new C9856b());
        hashMap.put(AdAsset.class, new C9852a());
        hashMap.put(C9881o.class, new C9882p());
        hashMap.put(C9863c.class, new C9864d());
        hashMap.put(CacheBust.class, new C9866f());
        hashMap.put(C9879m.class, new C9880n());
    }

    /* renamed from: a */
    public static Object m1398a(C9928h c9928h, Class cls, String str) {
        InterfaceC9918b interfaceC9918b = (InterfaceC9918b) c9928h.f19933e.get(cls);
        Cursor query = c9928h.f19929a.m1411a().query(interfaceC9918b.tableName(), null, "item_id = ? ", new String[]{str}, null, null, null, null);
        Object obj = null;
        if (query != null) {
            try {
                try {
                    if (query.moveToNext()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(query, contentValues);
                        obj = interfaceC9918b.mo1412b(contentValues);
                    }
                } catch (Exception e) {
                    VungleLogger.m1605a(C9928h.class.getSimpleName(), "loadModel", e.toString());
                }
            } finally {
                query.close();
            }
        }
        return obj;
    }

    /* renamed from: b */
    public static void m1397b(C9928h c9928h, String str) throws C9919c.C9920a {
        c9928h.getClass();
        if (!TextUtils.isEmpty(str)) {
            String tableName = ((InterfaceC9918b) c9928h.f19933e.get(AdAsset.class)).tableName();
            String[] strArr = {str};
            C9919c c9919c = c9928h.f19929a;
            c9919c.getClass();
            try {
                c9919c.m1411a().delete(tableName, "ad_identifier=?", strArr);
                c9928h.m1390i(Advertisement.class, str);
                try {
                    c9928h.f19932d.mo1400d(str);
                } catch (IOException e) {
                    Log.e("h", "IOException ", e);
                }
            } catch (SQLException e2) {
                throw new C9919c.C9920a(e2.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static ArrayList m1396c(C9928h c9928h) {
        String[] strArr = {FirebaseAnalytics.Param.ITEM_ID};
        Cursor query = c9928h.f19929a.m1411a().query("placement", strArr, "is_valid = ?", new String[]{"1"}, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    try {
                        arrayList.add(query.getString(query.getColumnIndex(FirebaseAnalytics.Param.ITEM_ID)));
                    } catch (Exception e) {
                        VungleLogger.m1605a(C9928h.class.getSimpleName(), "loadValidPlacementIds", e.toString());
                    }
                } finally {
                    query.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static ArrayList m1395d(C9928h c9928h, String str) {
        c9928h.getClass();
        String[] strArr = {FirebaseAnalytics.Param.ITEM_ID};
        String[] strArr2 = {str};
        ArrayList arrayList = new ArrayList();
        Cursor query = c9928h.f19929a.m1411a().query("advertisement", strArr, "placement_id=?", strArr2, null, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    try {
                        arrayList.add(query.getString(query.getColumnIndex(FirebaseAnalytics.Param.ITEM_ID)));
                    } catch (Exception e) {
                        VungleLogger.m1605a(C9928h.class.getSimpleName(), "getAdsForPlacement", e.toString());
                        arrayList = new ArrayList();
                    }
                } finally {
                    query.close();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static void m1394e(C9928h c9928h, Object obj) throws C9919c.C9920a {
        InterfaceC9918b interfaceC9918b = (InterfaceC9918b) c9928h.f19933e.get(obj.getClass());
        ContentValues mo1413a = interfaceC9918b.mo1413a(obj);
        String tableName = interfaceC9918b.tableName();
        C9919c c9919c = c9928h.f19929a;
        c9919c.getClass();
        try {
            c9919c.m1411a().insertWithOnConflict(tableName, null, mo1413a, 5);
        } catch (SQLException e) {
            throw new C9919c.C9920a(e.getMessage());
        }
    }

    /* renamed from: f */
    public final <T> void m1393f(T t) throws C9919c.C9920a {
        m1377v(new CallableC9932d(t));
    }

    /* renamed from: g */
    public final void m1392g(String str) throws C9919c.C9920a {
        m1377v(new CallableC9933e(str));
    }

    /* renamed from: h */
    public final <T> void m1391h(Class<T> cls) {
        if (cls == Advertisement.class) {
            for (T t : m1382q(Advertisement.class).get()) {
                try {
                    m1392g(t.getId());
                } catch (C9919c.C9920a e) {
                    Log.e("h", "DB Exception deleting advertisement", e);
                }
            }
            return;
        }
        for (T t2 : m1382q(cls).get()) {
            try {
                m1389j(t2);
            } catch (C9919c.C9920a e2) {
                Log.e("h", "DB Exception deleting db entry", e2);
            }
        }
    }

    /* renamed from: i */
    public final <T> void m1390i(Class<T> cls, String str) throws C9919c.C9920a {
        String tableName = ((InterfaceC9918b) this.f19933e.get(cls)).tableName();
        String[] strArr = {str};
        C9919c c9919c = this.f19929a;
        c9919c.getClass();
        try {
            c9919c.m1411a().delete(tableName, "item_id=?", strArr);
        } catch (SQLException e) {
            throw new C9919c.C9920a(e.getMessage());
        }
    }

    /* renamed from: j */
    public final <T> void m1389j(T t) throws C9919c.C9920a {
        m1390i(t.getClass(), ((InterfaceC9918b) this.f19933e.get(t.getClass())).mo1413a(t).getAsString(FirebaseAnalytics.Param.ITEM_ID));
    }

    @NonNull
    /* renamed from: k */
    public final <T> List<T> m1388k(Class<T> cls, Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC9918b interfaceC9918b = (InterfaceC9918b) this.f19933e.get(cls);
            while (cursor.moveToNext()) {
                ContentValues contentValues = new ContentValues();
                DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                arrayList.add(interfaceC9918b.mo1412b(contentValues));
            }
            return arrayList;
        } catch (Exception e) {
            VungleLogger.m1605a(C9928h.class.getSimpleName(), "extractModels", e.toString());
            return new ArrayList();
        } finally {
            cursor.close();
        }
    }

    /* renamed from: l */
    public final FutureC9926f<Advertisement> m1387l(String str, @Nullable String str2) {
        return new FutureC9926f<>(this.f19930b.submit(new CallableC9941l(str, str2)));
    }

    /* renamed from: m */
    public final FutureC9926f<List<Advertisement>> m1386m(String str, @Nullable String str2) {
        return new FutureC9926f<>(this.f19930b.submit(new CallableC9929a(str, str2)));
    }

    /* renamed from: n */
    public final FutureC9926f<File> m1385n(String str) {
        return new FutureC9926f<>(this.f19930b.submit(new CallableC9935g(str)));
    }

    /* renamed from: o */
    public final ArrayList m1384o() {
        List<CacheBust> m1379t = m1379t(CacheBust.class);
        ArrayList arrayList = new ArrayList();
        for (CacheBust cacheBust : m1379t) {
            if (cacheBust.m1463c() == 0) {
                arrayList.add(cacheBust);
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public final FutureC9926f m1383p(@NonNull Class cls, @NonNull String str) {
        return new FutureC9926f(this.f19930b.submit(new CallableC9956t(this, cls, str)));
    }

    /* renamed from: q */
    public final <T> FutureC9926f<List<T>> m1382q(Class<T> cls) {
        return new FutureC9926f<>(this.f19930b.submit(new CallableC9930b(cls)));
    }

    /* renamed from: r */
    public final List m1381r(@NonNull String str) {
        return m1388k(AdAsset.class, this.f19929a.m1411a().query("adAsset", null, "ad_identifier = ?  AND file_status = ? ", new String[]{str, String.valueOf(3)}, null, null, null, null));
    }

    /* renamed from: s */
    public final FutureC9926f<List<AdAsset>> m1380s(@NonNull String str) {
        return new FutureC9926f<>(this.f19930b.submit(new CallableC9931c(str)));
    }

    /* renamed from: t */
    public final <T> List<T> m1379t(Class<T> cls) {
        InterfaceC9918b interfaceC9918b = (InterfaceC9918b) this.f19933e.get(cls);
        if (interfaceC9918b == null) {
            return Collections.EMPTY_LIST;
        }
        return m1388k(cls, this.f19929a.m1411a().query(interfaceC9918b.tableName(), null, null, null, null, null, null, null));
    }

    /* renamed from: u */
    public final FutureC9926f<Collection<Placement>> m1378u() {
        return new FutureC9926f<>(this.f19930b.submit(new CallableC9934f()));
    }

    /* renamed from: v */
    public final void m1377v(Callable<Void> callable) throws C9919c.C9920a {
        try {
            this.f19930b.submit(callable).get();
        } catch (InterruptedException e) {
            Log.e("h", "InterruptedException ", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof C9919c.C9920a) {
                throw ((C9919c.C9920a) e2.getCause());
            }
            Log.e("h", "Exception during runAndWait", e2);
        }
    }

    /* renamed from: w */
    public final <T> void m1376w(T t) throws C9919c.C9920a {
        m1377v(new CallableC9937i(t));
    }

    /* renamed from: x */
    public final <T> void m1375x(T t, @Nullable InterfaceC9943n interfaceC9943n, boolean z) {
        Future m1235b = this.f19930b.m1235b(new RunnableC9938j(t, interfaceC9943n), new RunnableC9940k(interfaceC9943n));
        if (z) {
            try {
                m1235b.get();
            } catch (InterruptedException e) {
                Log.e("h", "InterruptedException ", e);
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                Log.e("h", "Error on execution during saving", e2);
            }
        }
    }

    /* renamed from: y */
    public final void m1374y(@NonNull Advertisement advertisement, @NonNull String str, @Advertisement.State int i) throws C9919c.C9920a {
        m1377v(new CallableC9936h(i, advertisement, str));
    }
}
