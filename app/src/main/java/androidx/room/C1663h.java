package androidx.room;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.internal.C0450b;
import androidx.core.p003os.C0740h;
import androidx.sqlite.p004db.C1700a;
import androidx.sqlite.p004db.InterfaceC1701b;
import androidx.sqlite.p004db.framework.C1707a;
import androidx.sqlite.p004db.framework.C1714e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: androidx.room.h */
/* loaded from: classes.dex */
public final class C1663h {

    /* renamed from: j */
    public static final String[] f4034j = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: b */
    public final String[] f4036b;

    /* renamed from: c */
    public final AbstractC1668i f4037c;

    /* renamed from: f */
    public volatile C1714e f4040f;

    /* renamed from: g */
    public final C1665b f4041g;

    /* renamed from: d */
    public final AtomicBoolean f4038d = new AtomicBoolean(false);

    /* renamed from: e */
    public volatile boolean f4039e = false;
    @SuppressLint({"RestrictedApi"})
    @VisibleForTesting

    /* renamed from: h */
    public final C0450b<AbstractC1666c, C1667d> f4042h = new C0450b<>();
    @VisibleForTesting

    /* renamed from: i */
    public final RunnableC1664a f4043i = new RunnableC1664a();
    @NonNull

    /* renamed from: a */
    public final HashMap<String, Integer> f4035a = new HashMap<>();

    /* renamed from: androidx.room.h$a */
    /* loaded from: classes.dex */
    public class RunnableC1664a implements Runnable {
        public RunnableC1664a() {
        }

        /* renamed from: b */
        public final HashSet m10079b() {
            HashSet hashSet = new HashSet();
            Cursor m10072g = C1663h.this.f4037c.m10072g(new C1700a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (m10072g.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(m10072g.getInt(0)));
                } catch (Throwable th) {
                    m10072g.close();
                    throw th;
                }
            }
            m10072g.close();
            if (!hashSet.isEmpty()) {
                C1663h.this.f4040f.m10016g();
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ad A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r5 = this;
                androidx.room.h r0 = androidx.room.C1663h.this
                androidx.room.i r0 = r0.f4037c
                java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f4057h
                java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
                r1 = 1
                r2 = 0
                r3 = 0
                r0.lock()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                androidx.room.h r4 = androidx.room.C1663h.this     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                boolean r4 = r4.m10082a()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                if (r4 != 0) goto L1c
                r0.unlock()
                return
            L1c:
                androidx.room.h r4 = androidx.room.C1663h.this     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f4038d     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                boolean r1 = r4.compareAndSet(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                if (r1 != 0) goto L2a
                r0.unlock()
                return
            L2a:
                androidx.room.h r1 = androidx.room.C1663h.this     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                androidx.room.i r1 = r1.f4037c     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                androidx.sqlite.db.c r1 = r1.f4052c     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                androidx.sqlite.db.b r1 = r1.mo10024r()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                androidx.sqlite.db.framework.a r1 = (androidx.sqlite.p004db.framework.C1707a) r1     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                android.database.sqlite.SQLiteDatabase r1 = r1.f4156a     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                boolean r1 = r1.inTransaction()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                if (r1 == 0) goto L42
                r0.unlock()
                return
            L42:
                androidx.room.h r1 = androidx.room.C1663h.this     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                androidx.room.i r1 = r1.f4037c     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                boolean r2 = r1.f4055f     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                if (r2 == 0) goto L69
                androidx.sqlite.db.c r1 = r1.f4052c     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                androidx.sqlite.db.b r1 = r1.mo10024r()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                androidx.sqlite.db.framework.a r1 = (androidx.sqlite.p004db.framework.C1707a) r1     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                r1.m10032a()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                java.util.HashSet r3 = r5.m10079b()     // Catch: java.lang.Throwable -> L64
                r1.m10026h()     // Catch: java.lang.Throwable -> L64
                r1.m10031c()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                goto L77
            L60:
                r1 = move-exception
                goto L70
            L62:
                r1 = move-exception
                goto L70
            L64:
                r2 = move-exception
                r1.m10031c()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                throw r2     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
            L69:
                java.util.HashSet r3 = r5.m10079b()     // Catch: android.database.sqlite.SQLiteException -> L60 java.lang.IllegalStateException -> L62 java.lang.Throwable -> L6e
                goto L77
            L6e:
                r1 = move-exception
                goto Lae
            L70:
                java.lang.String r2 = "ROOM"
                java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
                android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L6e
            L77:
                r0.unlock()
                if (r3 == 0) goto Lad
                boolean r0 = r3.isEmpty()
                if (r0 != 0) goto Lad
                androidx.room.h r0 = androidx.room.C1663h.this
                androidx.arch.core.internal.b<androidx.room.h$c, androidx.room.h$d> r0 = r0.f4042h
                monitor-enter(r0)
                androidx.room.h r1 = androidx.room.C1663h.this     // Catch: java.lang.Throwable -> Laa
                androidx.arch.core.internal.b<androidx.room.h$c, androidx.room.h$d> r1 = r1.f4042h     // Catch: java.lang.Throwable -> Laa
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Laa
                androidx.arch.core.internal.b$e r1 = (androidx.arch.core.internal.C0450b.AbstractC0455e) r1     // Catch: java.lang.Throwable -> Laa
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Laa
                if (r2 != 0) goto L99
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
                goto Lad
            L99:
                java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> Laa
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Laa
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Laa
                androidx.room.h$d r1 = (androidx.room.C1663h.C1667d) r1     // Catch: java.lang.Throwable -> Laa
                r1.getClass()     // Catch: java.lang.Throwable -> Laa
                r1 = 0
                throw r1     // Catch: java.lang.Throwable -> Laa
            Laa:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
                throw r1
            Lad:
                return
            Lae:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1663h.RunnableC1664a.run():void");
        }
    }

    /* renamed from: androidx.room.h$b */
    /* loaded from: classes.dex */
    public static class C1665b {

        /* renamed from: a */
        public final long[] f4045a;

        /* renamed from: b */
        public final boolean[] f4046b;

        /* renamed from: c */
        public final int[] f4047c;

        /* renamed from: d */
        public boolean f4048d;

        /* renamed from: e */
        public boolean f4049e;

        public C1665b(int i) {
            long[] jArr = new long[i];
            this.f4045a = jArr;
            boolean[] zArr = new boolean[i];
            this.f4046b = zArr;
            this.f4047c = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        @Nullable
        /* renamed from: a */
        public final int[] m10078a() {
            synchronized (this) {
                if (this.f4048d && !this.f4049e) {
                    int length = this.f4045a.length;
                    int i = 0;
                    while (true) {
                        int i2 = 1;
                        if (i >= length) {
                            this.f4049e = true;
                            this.f4048d = false;
                            return this.f4047c;
                        }
                        boolean z = this.f4045a[i] > 0;
                        boolean[] zArr = this.f4046b;
                        if (z != zArr[i]) {
                            int[] iArr = this.f4047c;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.f4047c[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    }
                }
                return null;
            }
        }
    }

    /* renamed from: androidx.room.h$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1666c {
        /* renamed from: a */
        public abstract void m10077a(@NonNull Set<String> set);
    }

    /* renamed from: androidx.room.h$d */
    /* loaded from: classes.dex */
    public static class C1667d {
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public C1663h(AbstractC1668i abstractC1668i, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f4037c = abstractC1668i;
        this.f4041g = new C1665b(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f4036b = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f4035a.put(lowerCase, Integer.valueOf(i));
            String str2 = (String) hashMap.get(strArr[i]);
            if (str2 != null) {
                this.f4036b[i] = str2.toLowerCase(locale);
            } else {
                this.f4036b[i] = lowerCase;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            Locale locale2 = Locale.US;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            if (this.f4035a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap<String, Integer> hashMap3 = this.f4035a;
                hashMap3.put(lowerCase3, hashMap3.get(lowerCase2));
            }
        }
    }

    /* renamed from: a */
    public final boolean m10082a() {
        boolean z;
        InterfaceC1701b interfaceC1701b = this.f4037c.f4050a;
        if (interfaceC1701b != null && ((C1707a) interfaceC1701b).f4156a.isOpen()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (!this.f4039e) {
            this.f4037c.f4052c.mo10024r();
        }
        if (this.f4039e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    /* renamed from: b */
    public final void m10081b(InterfaceC1701b interfaceC1701b, int i) {
        C1707a c1707a = (C1707a) interfaceC1701b;
        c1707a.m10030d(C0740h.m11849a("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i, ", 0)"));
        String str = this.f4036b[i];
        StringBuilder sb = new StringBuilder();
        String[] strArr = f4034j;
        for (int i2 = 0; i2 < 3; i2++) {
            String str2 = strArr[i2];
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb.append("`");
            sb.append("room_table_modification_trigger_");
            sb.append(str);
            sb.append("_");
            sb.append(str2);
            sb.append("`");
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            c1707a.m10030d(sb.toString());
        }
    }

    /* renamed from: c */
    public final void m10080c(InterfaceC1701b interfaceC1701b) {
        C1707a c1707a = (C1707a) interfaceC1701b;
        if (c1707a.f4156a.inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.f4037c.f4057h.readLock();
                readLock.lock();
                try {
                    int[] m10078a = this.f4041g.m10078a();
                    if (m10078a == null) {
                        return;
                    }
                    int length = m10078a.length;
                    c1707a.m10032a();
                    for (int i = 0; i < length; i++) {
                        int i2 = m10078a[i];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                String str = this.f4036b[i];
                                StringBuilder sb = new StringBuilder();
                                String[] strArr = f4034j;
                                for (int i3 = 0; i3 < 3; i3++) {
                                    String str2 = strArr[i3];
                                    sb.setLength(0);
                                    sb.append("DROP TRIGGER IF EXISTS ");
                                    sb.append("`");
                                    sb.append("room_table_modification_trigger_");
                                    sb.append(str);
                                    sb.append("_");
                                    sb.append(str2);
                                    sb.append("`");
                                    c1707a.m10030d(sb.toString());
                                }
                            }
                        } else {
                            m10081b(c1707a, i);
                        }
                    }
                    c1707a.m10026h();
                    c1707a.m10031c();
                    C1665b c1665b = this.f4041g;
                    synchronized (c1665b) {
                        c1665b.f4049e = false;
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException | IllegalStateException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                return;
            }
        }
    }
}
