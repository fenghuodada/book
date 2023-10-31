package androidx.sqlite.p004db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.RequiresApi;
import androidx.room.C1672j;
import androidx.sqlite.p004db.InterfaceC1701b;
import androidx.sqlite.p004db.InterfaceC1702c;
import java.io.File;

/* renamed from: androidx.sqlite.db.framework.b */
/* loaded from: classes.dex */
public final class C1709b implements InterfaceC1702c {

    /* renamed from: a */
    public final Context f4158a;

    /* renamed from: b */
    public final String f4159b;

    /* renamed from: c */
    public final InterfaceC1702c.AbstractC1703a f4160c;

    /* renamed from: d */
    public final boolean f4161d;

    /* renamed from: e */
    public final Object f4162e = new Object();

    /* renamed from: f */
    public C1710a f4163f;

    /* renamed from: g */
    public boolean f4164g;

    /* renamed from: androidx.sqlite.db.framework.b$a */
    /* loaded from: classes.dex */
    public static class C1710a extends SQLiteOpenHelper {

        /* renamed from: a */
        public final C1707a[] f4165a;

        /* renamed from: b */
        public final InterfaceC1702c.AbstractC1703a f4166b;

        /* renamed from: c */
        public boolean f4167c;

        /* renamed from: androidx.sqlite.db.framework.b$a$a */
        /* loaded from: classes.dex */
        public class C1711a implements DatabaseErrorHandler {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC1702c.AbstractC1703a f4168a;

            /* renamed from: b */
            public final /* synthetic */ C1707a[] f4169b;

            public C1711a(InterfaceC1702c.AbstractC1703a abstractC1703a, C1707a[] c1707aArr) {
                this.f4168a = abstractC1703a;
                this.f4169b = c1707aArr;
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
                if (r2 == false) goto L37;
             */
            @Override // android.database.DatabaseErrorHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
                /*
                    r3 = this;
                    androidx.sqlite.db.framework.a[] r0 = r3.f4169b
                    r1 = 0
                    r2 = r0[r1]
                    if (r2 == 0) goto L10
                    android.database.sqlite.SQLiteDatabase r2 = r2.f4156a
                    if (r2 != r4) goto Ld
                    r2 = 1
                    goto Le
                Ld:
                    r2 = r1
                Le:
                    if (r2 != 0) goto L17
                L10:
                    androidx.sqlite.db.framework.a r2 = new androidx.sqlite.db.framework.a
                    r2.<init>(r4)
                    r0[r1] = r2
                L17:
                    r4 = r0[r1]
                    androidx.sqlite.db.c$a r0 = r3.f4168a
                    r0.getClass()
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "Corruption reported by sqlite on database: "
                    r0.<init>(r1)
                    java.lang.String r1 = r4.m10029e()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    java.lang.String r1 = "SupportSQLite"
                    android.util.Log.e(r1, r0)
                    android.database.sqlite.SQLiteDatabase r0 = r4.f4156a
                    boolean r1 = r0.isOpen()
                    if (r1 != 0) goto L3e
                    goto L86
                L3e:
                    r1 = 0
                    java.util.List r1 = r0.getAttachedDbs()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
                    goto L46
                L44:
                    r0 = move-exception
                    goto L4a
                L46:
                    r4.close()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L6c
                    goto L6c
                L4a:
                    if (r1 == 0) goto L64
                    java.util.Iterator r4 = r1.iterator()
                L50:
                    boolean r1 = r4.hasNext()
                    if (r1 == 0) goto L6b
                    java.lang.Object r1 = r4.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    androidx.sqlite.p004db.InterfaceC1702c.AbstractC1703a.m10036a(r1)
                    goto L50
                L64:
                    java.lang.String r4 = r4.m10029e()
                    androidx.sqlite.p004db.InterfaceC1702c.AbstractC1703a.m10036a(r4)
                L6b:
                    throw r0
                L6c:
                    if (r1 == 0) goto L86
                    java.util.Iterator r4 = r1.iterator()
                L72:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L8d
                    java.lang.Object r0 = r4.next()
                    android.util.Pair r0 = (android.util.Pair) r0
                    java.lang.Object r0 = r0.second
                    java.lang.String r0 = (java.lang.String) r0
                    androidx.sqlite.p004db.InterfaceC1702c.AbstractC1703a.m10036a(r0)
                    goto L72
                L86:
                    java.lang.String r4 = r4.m10029e()
                    androidx.sqlite.p004db.InterfaceC1702c.AbstractC1703a.m10036a(r4)
                L8d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p004db.framework.C1709b.C1710a.C1711a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public C1710a(Context context, String str, C1707a[] c1707aArr, InterfaceC1702c.AbstractC1703a abstractC1703a) {
            super(context, str, null, abstractC1703a.f4150a, new C1711a(abstractC1703a, c1707aArr));
            this.f4166b = abstractC1703a;
            this.f4165a = c1707aArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
            if (r2 == false) goto L11;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.sqlite.p004db.framework.C1707a m10023a(android.database.sqlite.SQLiteDatabase r4) {
            /*
                r3 = this;
                androidx.sqlite.db.framework.a[] r0 = r3.f4165a
                r1 = 0
                r2 = r0[r1]
                if (r2 == 0) goto L10
                android.database.sqlite.SQLiteDatabase r2 = r2.f4156a
                if (r2 != r4) goto Ld
                r2 = 1
                goto Le
            Ld:
                r2 = r1
            Le:
                if (r2 != 0) goto L17
            L10:
                androidx.sqlite.db.framework.a r2 = new androidx.sqlite.db.framework.a
                r2.<init>(r4)
                r0[r1] = r2
            L17:
                r4 = r0[r1]
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p004db.framework.C1709b.C1710a.m10023a(android.database.sqlite.SQLiteDatabase):androidx.sqlite.db.framework.a");
        }

        /* renamed from: c */
        public final synchronized InterfaceC1701b m10022c() {
            this.f4167c = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!this.f4167c) {
                return m10023a(writableDatabase);
            }
            close();
            return m10022c();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.f4165a[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            m10023a(sQLiteDatabase);
            this.f4166b.getClass();
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[ORIG_RETURN, RETURN] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onCreate(android.database.sqlite.SQLiteDatabase r6) {
            /*
                r5 = this;
                androidx.sqlite.db.framework.a r6 = r5.m10023a(r6)
                androidx.sqlite.db.c$a r0 = r5.f4166b
                androidx.room.j r0 = (androidx.room.C1672j) r0
                r0.getClass()
                java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
                android.database.Cursor r1 = r6.m10027g(r1)
                boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L6c
                r3 = 0
                if (r2 == 0) goto L20
                int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L6c
                if (r2 != 0) goto L20
                r2 = 1
                goto L21
            L20:
                r2 = r3
            L21:
                r1.close()
                androidx.room.j$a r1 = r0.f4073c
                r1.mo9891a(r6)
                if (r2 != 0) goto L4a
                androidx.room.j$b r2 = r1.mo9890b(r6)
                boolean r4 = r2.f4075a
                if (r4 == 0) goto L34
                goto L4a
            L34:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Pre-packaged database has an invalid schema: "
                r0.<init>(r1)
                java.lang.String r1 = r2.f4076b
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            L4a:
                r0.m10069c(r6)
                androidx.work.impl.WorkDatabase_Impl$a r1 = (androidx.work.impl.WorkDatabase_Impl.C1842a) r1
                int r6 = androidx.work.impl.WorkDatabase_Impl.f4467s
                androidx.work.impl.WorkDatabase_Impl r6 = androidx.work.impl.WorkDatabase_Impl.this
                java.util.List<androidx.room.i$b> r0 = r6.f4056g
                if (r0 == 0) goto L6b
                int r0 = r0.size()
            L5b:
                if (r3 >= r0) goto L6b
                java.util.List<androidx.room.i$b> r1 = r6.f4056g
                java.lang.Object r1 = r1.get(r3)
                androidx.room.i$b r1 = (androidx.room.AbstractC1668i.AbstractC1670b) r1
                r1.getClass()
                int r3 = r3 + 1
                goto L5b
            L6b:
                return
            L6c:
                r6 = move-exception
                r1.close()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p004db.framework.C1709b.C1710a.onCreate(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f4167c = true;
            ((C1672j) this.f4166b).mo10035b(m10023a(sQLiteDatabase), i, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0085 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onOpen(android.database.sqlite.SQLiteDatabase r10) {
            /*
                Method dump skipped, instructions count: 243
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.sqlite.p004db.framework.C1709b.C1710a.onOpen(android.database.sqlite.SQLiteDatabase):void");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f4167c = true;
            this.f4166b.mo10035b(m10023a(sQLiteDatabase), i, i2);
        }
    }

    public C1709b(Context context, String str, InterfaceC1702c.AbstractC1703a abstractC1703a, boolean z) {
        this.f4158a = context;
        this.f4159b = str;
        this.f4160c = abstractC1703a;
        this.f4161d = z;
    }

    /* renamed from: a */
    public final C1710a m10025a() {
        C1710a c1710a;
        synchronized (this.f4162e) {
            if (this.f4163f == null) {
                C1707a[] c1707aArr = new C1707a[1];
                if (this.f4159b == null || !this.f4161d) {
                    this.f4163f = new C1710a(this.f4158a, this.f4159b, c1707aArr, this.f4160c);
                } else {
                    this.f4163f = new C1710a(this.f4158a, new File(this.f4158a.getNoBackupFilesDir(), this.f4159b).getAbsolutePath(), c1707aArr, this.f4160c);
                }
                this.f4163f.setWriteAheadLoggingEnabled(this.f4164g);
            }
            c1710a = this.f4163f;
        }
        return c1710a;
    }

    @Override // androidx.sqlite.p004db.InterfaceC1702c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m10025a().close();
    }

    @Override // androidx.sqlite.p004db.InterfaceC1702c
    public final String getDatabaseName() {
        return this.f4159b;
    }

    @Override // androidx.sqlite.p004db.InterfaceC1702c
    /* renamed from: r */
    public final InterfaceC1701b mo10024r() {
        return m10025a().m10022c();
    }

    @Override // androidx.sqlite.p004db.InterfaceC1702c
    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f4162e) {
            C1710a c1710a = this.f4163f;
            if (c1710a != null) {
                c1710a.setWriteAheadLoggingEnabled(z);
            }
            this.f4164g = z;
        }
    }
}
