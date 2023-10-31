package androidx.sqlite.p004db.framework;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import androidx.sqlite.p004db.C1700a;
import androidx.sqlite.p004db.InterfaceC1701b;
import androidx.sqlite.p004db.InterfaceC1706d;
import java.io.IOException;

/* renamed from: androidx.sqlite.db.framework.a */
/* loaded from: classes.dex */
public final class C1707a implements InterfaceC1701b {

    /* renamed from: b */
    public static final String[] f4155b = new String[0];

    /* renamed from: a */
    public final SQLiteDatabase f4156a;

    /* renamed from: androidx.sqlite.db.framework.a$a */
    /* loaded from: classes.dex */
    public class C1708a implements SQLiteDatabase.CursorFactory {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC1706d f4157a;

        public C1708a(InterfaceC1706d interfaceC1706d) {
            this.f4157a = interfaceC1706d;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f4157a.mo10034a(new C1713d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public C1707a(SQLiteDatabase sQLiteDatabase) {
        this.f4156a = sQLiteDatabase;
    }

    /* renamed from: a */
    public final void m10032a() {
        this.f4156a.beginTransaction();
    }

    /* renamed from: c */
    public final void m10031c() {
        this.f4156a.endTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4156a.close();
    }

    /* renamed from: d */
    public final void m10030d(String str) throws SQLException {
        this.f4156a.execSQL(str);
    }

    /* renamed from: e */
    public final String m10029e() {
        return this.f4156a.getPath();
    }

    /* renamed from: f */
    public final Cursor m10028f(InterfaceC1706d interfaceC1706d) {
        return this.f4156a.rawQueryWithFactory(new C1708a(interfaceC1706d), interfaceC1706d.mo10033c(), f4155b, null);
    }

    /* renamed from: g */
    public final Cursor m10027g(String str) {
        return m10028f(new C1700a(str));
    }

    /* renamed from: h */
    public final void m10026h() {
        this.f4156a.setTransactionSuccessful();
    }
}
