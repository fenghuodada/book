package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.C6429b;
import com.google.android.datatransport.EnumC6464d;
import com.google.android.datatransport.runtime.AbstractC6512h;
import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.C6477b;
import com.google.android.datatransport.runtime.C6511g;
import com.google.android.datatransport.runtime.firebase.transport.C6503a;
import com.google.android.datatransport.runtime.firebase.transport.C6505b;
import com.google.android.datatransport.runtime.firebase.transport.C6506c;
import com.google.android.datatransport.runtime.firebase.transport.C6508d;
import com.google.android.datatransport.runtime.firebase.transport.C6509e;
import com.google.android.datatransport.runtime.firebase.transport.C6510f;
import com.google.android.datatransport.runtime.logging.C6520a;
import com.google.android.datatransport.runtime.scheduling.persistence.C6567a0;
import com.google.android.datatransport.runtime.synchronization.C6607a;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import com.google.android.datatransport.runtime.time.InterfaceC6611a;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.android.datatransport.runtime.util.C6619a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.InterfaceC10733a;
import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@WorkerThread
/* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a0 */
/* loaded from: classes.dex */
public final class C6567a0 implements InterfaceC6574d, InterfaceC6608b, InterfaceC6572c {

    /* renamed from: f */
    public static final C6429b f10393f = new C6429b("proto");

    /* renamed from: a */
    public final C6584h0 f10394a;

    /* renamed from: b */
    public final InterfaceC6611a f10395b;

    /* renamed from: c */
    public final InterfaceC6611a f10396c;

    /* renamed from: d */
    public final AbstractC6576e f10397d;

    /* renamed from: e */
    public final InterfaceC10733a<String> f10398e;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6568a<T, U> {
        U apply(T t);
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.a0$b */
    /* loaded from: classes.dex */
    public static class C6569b {

        /* renamed from: a */
        public final String f10399a;

        /* renamed from: b */
        public final String f10400b;

        public C6569b(String str, String str2) {
            this.f10399a = str;
            this.f10400b = str2;
        }
    }

    @Inject
    public C6567a0(@WallTime InterfaceC6611a interfaceC6611a, @Monotonic InterfaceC6611a interfaceC6611a2, AbstractC6576e abstractC6576e, C6584h0 c6584h0, @Named("PACKAGE_NAME") InterfaceC10733a<String> interfaceC10733a) {
        this.f10394a = c6584h0;
        this.f10395b = interfaceC6611a;
        this.f10396c = interfaceC6611a2;
        this.f10397d = abstractC6576e;
        this.f10398e = interfaceC10733a;
    }

    @Nullable
    /* renamed from: g */
    public static Long m6256g(SQLiteDatabase sQLiteDatabase, AbstractC6522n abstractC6522n) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC6522n.mo6277b(), String.valueOf(C6619a.m6225a(abstractC6522n.mo6275d()))));
        if (abstractC6522n.mo6276c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC6522n.mo6276c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    /* renamed from: k */
    public static String m6253k(Iterable<AbstractC6591k> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC6591k> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo6231b());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @VisibleForTesting
    /* renamed from: l */
    public static <T> T m6252l(Cursor cursor, InterfaceC6568a<Cursor, T> interfaceC6568a) {
        try {
            return interfaceC6568a.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d
    /* renamed from: B */
    public final long mo6248B(AbstractC6522n abstractC6522n) {
        long j;
        Cursor rawQuery = m6257f().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC6522n.mo6277b(), String.valueOf(C6619a.m6225a(abstractC6522n.mo6275d()))});
        try {
            if (rawQuery.moveToNext()) {
                j = rawQuery.getLong(0);
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            rawQuery.close();
            return valueOf.longValue();
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d
    /* renamed from: C */
    public final boolean mo6247C(final AbstractC6522n abstractC6522n) {
        return ((Boolean) m6255h(new InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
            public final Object apply(Object obj) {
                C6567a0 c6567a0 = C6567a0.this;
                c6567a0.getClass();
                Long m6256g = C6567a0.m6256g((SQLiteDatabase) obj, abstractC6522n);
                if (m6256g == null) {
                    return Boolean.FALSE;
                }
                Cursor rawQuery = c6567a0.m6257f().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m6256g.toString()});
                try {
                    return Boolean.valueOf(rawQuery.moveToNext());
                } finally {
                    rawQuery.close();
                }
            }
        })).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d
    /* renamed from: D */
    public final void mo6246D(Iterable<AbstractC6591k> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m6253k(iterable);
        SQLiteDatabase m6257f = m6257f();
        m6257f.beginTransaction();
        try {
            m6257f.compileStatement(str).execute();
            Cursor rawQuery = m6257f.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
            while (rawQuery.moveToNext()) {
                mo6249e(rawQuery.getInt(0), C6506c.EnumC6507a.MAX_RETRIES_REACHED, rawQuery.getString(1));
            }
            rawQuery.close();
            m6257f.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
            m6257f.setTransactionSuccessful();
        } finally {
            m6257f.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6572c
    /* renamed from: a */
    public final void mo6251a() {
        m6255h(new InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.u
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C6567a0 c6567a0 = C6567a0.this;
                c6567a0.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c6567a0.f10395b.mo6226a()).execute();
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d
    /* renamed from: b */
    public final int mo6245b() {
        final long mo6226a = this.f10395b.mo6226a() - this.f10397d.mo6238b();
        return ((Integer) m6255h(new InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.n
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C6567a0 c6567a0 = C6567a0.this;
                c6567a0.getClass();
                String[] strArr = {String.valueOf(mo6226a)};
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                while (rawQuery.moveToNext()) {
                    try {
                        c6567a0.mo6249e(rawQuery.getInt(0), C6506c.EnumC6507a.MESSAGE_TOO_OLD, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            }
        })).intValue();
    }

    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b
    /* renamed from: c */
    public final <T> T mo6227c(InterfaceC6608b.InterfaceC6609a<T> interfaceC6609a) {
        SQLiteDatabase m6257f = m6257f();
        InterfaceC6611a interfaceC6611a = this.f10396c;
        long mo6226a = interfaceC6611a.mo6226a();
        while (true) {
            try {
                m6257f.beginTransaction();
                try {
                    T execute = interfaceC6609a.execute();
                    m6257f.setTransactionSuccessful();
                    return execute;
                } finally {
                    m6257f.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC6611a.mo6226a() < this.f10397d.mo6239a() + mo6226a) {
                    SystemClock.sleep(50L);
                } else {
                    throw new C6607a("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10394a.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6572c
    /* renamed from: d */
    public final C6503a mo6250d() {
        int i = C6503a.f10244e;
        final C6503a.C6504a c6504a = new C6503a.C6504a();
        final HashMap hashMap = new HashMap();
        SQLiteDatabase m6257f = m6257f();
        m6257f.beginTransaction();
        try {
            C6503a c6503a = (C6503a) m6252l(m6257f.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.z
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
                public final Object apply(Object obj) {
                    Map map;
                    Cursor cursor = (Cursor) obj;
                    C6567a0 c6567a0 = C6567a0.this;
                    c6567a0.getClass();
                    while (true) {
                        boolean moveToNext = cursor.moveToNext();
                        map = hashMap;
                        if (!moveToNext) {
                            break;
                        }
                        String string = cursor.getString(0);
                        int i2 = cursor.getInt(1);
                        C6506c.EnumC6507a enumC6507a = C6506c.EnumC6507a.REASON_UNKNOWN;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                enumC6507a = C6506c.EnumC6507a.MESSAGE_TOO_OLD;
                            } else if (i2 == 2) {
                                enumC6507a = C6506c.EnumC6507a.CACHE_FULL;
                            } else if (i2 == 3) {
                                enumC6507a = C6506c.EnumC6507a.PAYLOAD_TOO_BIG;
                            } else if (i2 == 4) {
                                enumC6507a = C6506c.EnumC6507a.MAX_RETRIES_REACHED;
                            } else if (i2 == 5) {
                                enumC6507a = C6506c.EnumC6507a.INVALID_PAYLOD;
                            } else if (i2 == 6) {
                                enumC6507a = C6506c.EnumC6507a.SERVER_ERROR;
                            } else {
                                C6520a.m6286a(Integer.valueOf(i2), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                            }
                        }
                        long j = cursor.getLong(2);
                        if (!map.containsKey(string)) {
                            map.put(string, new ArrayList());
                        }
                        ((List) map.get(string)).add(new C6506c(j, enumC6507a));
                    }
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        C6503a.C6504a c6504a2 = c6504a;
                        if (hasNext) {
                            Map.Entry entry = (Map.Entry) it.next();
                            int i3 = C6508d.f10265c;
                            new ArrayList();
                            c6504a2.f10250b.add(new C6508d((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                        } else {
                            final long mo6226a = c6567a0.f10395b.mo6226a();
                            SQLiteDatabase m6257f2 = c6567a0.m6257f();
                            m6257f2.beginTransaction();
                            try {
                                C6510f c6510f = (C6510f) C6567a0.m6252l(m6257f2.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C6567a0.InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.q
                                    @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
                                    public final Object apply(Object obj2) {
                                        Cursor cursor2 = (Cursor) obj2;
                                        cursor2.moveToNext();
                                        return new C6510f(cursor2.getLong(0), mo6226a);
                                    }
                                });
                                m6257f2.setTransactionSuccessful();
                                m6257f2.endTransaction();
                                c6504a2.f10249a = c6510f;
                                c6504a2.f10251c = new C6505b(new C6509e(c6567a0.m6257f().compileStatement("PRAGMA page_size").simpleQueryForLong() * c6567a0.m6257f().compileStatement("PRAGMA page_count").simpleQueryForLong(), AbstractC6576e.f10409a.f10388b));
                                c6504a2.f10252d = c6567a0.f10398e.get();
                                return new C6503a(c6504a2.f10249a, Collections.unmodifiableList(c6504a2.f10250b), c6504a2.f10251c, c6504a2.f10252d);
                            } catch (Throwable th) {
                                m6257f2.endTransaction();
                                throw th;
                            }
                        }
                    }
                }
            });
            m6257f.setTransactionSuccessful();
            return c6503a;
        } finally {
            m6257f.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6572c
    /* renamed from: e */
    public final void mo6249e(final long j, final C6506c.EnumC6507a enumC6507a, final String str) {
        m6255h(new InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
            public final Object apply(Object obj) {
                boolean z;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                String str2 = str;
                C6506c.EnumC6507a enumC6507a2 = enumC6507a;
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(enumC6507a2.f10264a)});
                try {
                    if (rawQuery.getCount() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Boolean valueOf = Boolean.valueOf(z);
                    rawQuery.close();
                    boolean booleanValue = valueOf.booleanValue();
                    long j2 = j;
                    int i = enumC6507a2.f10264a;
                    if (!booleanValue) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("log_source", str2);
                        contentValues.put("reason", Integer.valueOf(i));
                        contentValues.put("events_dropped_count", Long.valueOf(j2));
                        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    } else {
                        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str2, Integer.toString(i)});
                    }
                    return null;
                } catch (Throwable th) {
                    rawQuery.close();
                    throw th;
                }
            }
        });
    }

    @VisibleForTesting
    /* renamed from: f */
    public final SQLiteDatabase m6257f() {
        C6584h0 c6584h0 = this.f10394a;
        Objects.requireNonNull(c6584h0);
        InterfaceC6611a interfaceC6611a = this.f10396c;
        long mo6226a = interfaceC6611a.mo6226a();
        while (true) {
            try {
                return c6584h0.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (interfaceC6611a.mo6226a() < this.f10397d.mo6239a() + mo6226a) {
                    SystemClock.sleep(50L);
                } else {
                    throw new C6607a("Timed out while trying to open db.", e);
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: h */
    public final <T> T m6255h(InterfaceC6568a<SQLiteDatabase, T> interfaceC6568a) {
        SQLiteDatabase m6257f = m6257f();
        m6257f.beginTransaction();
        try {
            T apply = interfaceC6568a.apply(m6257f);
            m6257f.setTransactionSuccessful();
            return apply;
        } finally {
            m6257f.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d
    /* renamed from: i */
    public final void mo6244i(Iterable<AbstractC6591k> iterable) {
        if (iterable.iterator().hasNext()) {
            m6257f().compileStatement("DELETE FROM events WHERE _id in " + m6253k(iterable)).execute();
        }
    }

    /* renamed from: j */
    public final ArrayList m6254j(SQLiteDatabase sQLiteDatabase, final AbstractC6522n abstractC6522n, int i) {
        final ArrayList arrayList = new ArrayList();
        Long m6256g = m6256g(sQLiteDatabase, abstractC6522n);
        if (m6256g == null) {
            return arrayList;
        }
        m6252l(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m6256g.toString()}, null, null, null, String.valueOf(i)), new InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.x
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
            public final Object apply(Object obj) {
                boolean z;
                C6429b c6429b;
                C6429b c6429b2;
                Cursor cursor = (Cursor) obj;
                C6567a0 c6567a0 = C6567a0.this;
                c6567a0.getClass();
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    if (cursor.getInt(7) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C6477b.C6478a c6478a = new C6477b.C6478a();
                    c6478a.f10201f = new HashMap();
                    c6478a.m6314d(cursor.getString(1));
                    c6478a.f10199d = Long.valueOf(cursor.getLong(2));
                    c6478a.f10200e = Long.valueOf(cursor.getLong(3));
                    if (z) {
                        String string = cursor.getString(4);
                        if (string == null) {
                            c6429b2 = C6567a0.f10393f;
                        } else {
                            c6429b2 = new C6429b(string);
                        }
                        c6478a.m6315c(new C6511g(c6429b2, cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(4);
                        if (string2 == null) {
                            c6429b = C6567a0.f10393f;
                        } else {
                            c6429b = new C6429b(string2);
                        }
                        Cursor query = c6567a0.m6257f().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i2 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i2 += blob.length;
                            }
                            byte[] bArr = new byte[i2];
                            int i3 = 0;
                            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i4);
                                System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                                i3 += bArr2.length;
                            }
                            query.close();
                            c6478a.m6315c(new C6511g(c6429b, bArr));
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        c6478a.f10197b = Integer.valueOf(cursor.getInt(6));
                    }
                    arrayList.add(new C6570b(j, abstractC6522n, c6478a.m6316b()));
                }
                return null;
            }
        });
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d
    /* renamed from: n */
    public final Iterable<AbstractC6591k> mo6243n(final AbstractC6522n abstractC6522n) {
        return (Iterable) m6255h(new InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
            public final Object apply(Object obj) {
                EnumC6464d[] values;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C6567a0 c6567a0 = C6567a0.this;
                AbstractC6576e abstractC6576e = c6567a0.f10397d;
                int mo6237c = abstractC6576e.mo6237c();
                AbstractC6522n abstractC6522n2 = abstractC6522n;
                ArrayList m6254j = c6567a0.m6254j(sQLiteDatabase, abstractC6522n2, mo6237c);
                for (EnumC6464d enumC6464d : EnumC6464d.values()) {
                    if (enumC6464d != abstractC6522n2.mo6275d()) {
                        int mo6237c2 = abstractC6576e.mo6237c() - m6254j.size();
                        if (mo6237c2 <= 0) {
                            break;
                        }
                        m6254j.addAll(c6567a0.m6254j(sQLiteDatabase, abstractC6522n2.m6274e(enumC6464d), mo6237c2));
                    }
                }
                final HashMap hashMap = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i = 0; i < m6254j.size(); i++) {
                    sb.append(((AbstractC6591k) m6254j.get(i)).mo6231b());
                    if (i < m6254j.size() - 1) {
                        sb.append(',');
                    }
                }
                sb.append(')');
                C6567a0.m6252l(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new C6567a0.InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.w
                    @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
                    public final Object apply(Object obj2) {
                        Cursor cursor = (Cursor) obj2;
                        while (cursor.moveToNext()) {
                            long j = cursor.getLong(0);
                            Long valueOf = Long.valueOf(j);
                            Map map = hashMap;
                            Set set = (Set) map.get(valueOf);
                            if (set == null) {
                                set = new HashSet();
                                map.put(Long.valueOf(j), set);
                            }
                            set.add(new C6567a0.C6569b(cursor.getString(1), cursor.getString(2)));
                        }
                        return null;
                    }
                });
                ListIterator listIterator = m6254j.listIterator();
                while (listIterator.hasNext()) {
                    AbstractC6591k abstractC6591k = (AbstractC6591k) listIterator.next();
                    if (hashMap.containsKey(Long.valueOf(abstractC6591k.mo6231b()))) {
                        C6477b.C6478a m6289i = abstractC6591k.mo6232a().m6289i();
                        for (C6567a0.C6569b c6569b : (Set) hashMap.get(Long.valueOf(abstractC6591k.mo6231b()))) {
                            m6289i.m6288a(c6569b.f10399a, c6569b.f10400b);
                        }
                        listIterator.set(new C6570b(abstractC6591k.mo6231b(), abstractC6591k.mo6230c(), m6289i.m6316b()));
                    }
                }
                return m6254j;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d
    /* renamed from: p */
    public final Iterable<AbstractC6522n> mo6242p() {
        SQLiteDatabase m6257f = m6257f();
        m6257f.beginTransaction();
        try {
            List list = (List) m6252l(m6257f.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new C6595o());
            m6257f.setTransactionSuccessful();
            m6257f.endTransaction();
            return list;
        } catch (Throwable th) {
            m6257f.endTransaction();
            throw th;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d
    /* renamed from: t */
    public final void mo6241t(final long j, final AbstractC6522n abstractC6522n) {
        m6255h(new InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.t
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                AbstractC6522n abstractC6522n2 = abstractC6522n;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC6522n2.mo6277b(), String.valueOf(C6619a.m6225a(abstractC6522n2.mo6275d()))}) < 1) {
                    contentValues.put("backend_name", abstractC6522n2.mo6277b());
                    contentValues.put("priority", Integer.valueOf(C6619a.m6225a(abstractC6522n2.mo6275d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d
    @Nullable
    /* renamed from: z */
    public final C6570b mo6240z(final AbstractC6522n abstractC6522n, final AbstractC6512h abstractC6512h) {
        Object[] objArr = {abstractC6522n.mo6275d(), abstractC6512h.mo6291g(), abstractC6522n.mo6277b()};
        String m6284c = C6520a.m6284c("SQLiteEventStore");
        if (Log.isLoggable(m6284c, 3)) {
            Log.d(m6284c, String.format("Storing event with priority=%s, name=%s for destination %s", objArr));
        }
        long longValue = ((Long) m6255h(new InterfaceC6568a() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.C6567a0.InterfaceC6568a
            public final Object apply(Object obj) {
                boolean z;
                long insert;
                boolean z2;
                byte[] bArr;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C6567a0 c6567a0 = C6567a0.this;
                long simpleQueryForLong = c6567a0.m6257f().compileStatement("PRAGMA page_size").simpleQueryForLong() * c6567a0.m6257f().compileStatement("PRAGMA page_count").simpleQueryForLong();
                AbstractC6576e abstractC6576e = c6567a0.f10397d;
                int i = (simpleQueryForLong > abstractC6576e.mo6235e() ? 1 : (simpleQueryForLong == abstractC6576e.mo6235e() ? 0 : -1));
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                AbstractC6512h abstractC6512h2 = abstractC6512h;
                if (z) {
                    c6567a0.mo6249e(1L, C6506c.EnumC6507a.CACHE_FULL, abstractC6512h2.mo6291g());
                    return -1L;
                }
                AbstractC6522n abstractC6522n2 = abstractC6522n;
                Long m6256g = C6567a0.m6256g(sQLiteDatabase, abstractC6522n2);
                if (m6256g != null) {
                    insert = m6256g.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", abstractC6522n2.mo6277b());
                    contentValues.put("priority", Integer.valueOf(C6619a.m6225a(abstractC6522n2.mo6275d())));
                    contentValues.put("next_request_ms", (Integer) 0);
                    if (abstractC6522n2.mo6276c() != null) {
                        contentValues.put("extras", Base64.encodeToString(abstractC6522n2.mo6276c(), 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int mo6236d = abstractC6576e.mo6236d();
                byte[] bArr2 = abstractC6512h2.mo6294d().f10273b;
                if (bArr2.length <= mo6236d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", abstractC6512h2.mo6291g());
                contentValues2.put("timestamp_ms", Long.valueOf(abstractC6512h2.mo6293e()));
                contentValues2.put("uptime_ms", Long.valueOf(abstractC6512h2.mo6290h()));
                contentValues2.put("payload_encoding", abstractC6512h2.mo6294d().f10272a.f10059a);
                contentValues2.put("code", abstractC6512h2.mo6295c());
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z2));
                if (z2) {
                    bArr = bArr2;
                } else {
                    bArr = new byte[0];
                }
                contentValues2.put("payload", bArr);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z2) {
                    int ceil = (int) Math.ceil(bArr2.length / mo6236d);
                    for (int i2 = 1; i2 <= ceil; i2++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i2 - 1) * mo6236d, Math.min(i2 * mo6236d, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i2));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(abstractC6512h2.mo6296b()).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return new C6570b(longValue, abstractC6522n, abstractC6512h);
    }
}
