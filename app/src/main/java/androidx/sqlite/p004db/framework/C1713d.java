package androidx.sqlite.p004db.framework;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* renamed from: androidx.sqlite.db.framework.d */
/* loaded from: classes.dex */
public class C1713d implements Closeable {

    /* renamed from: a */
    public final SQLiteProgram f4170a;

    public C1713d(SQLiteProgram sQLiteProgram) {
        this.f4170a = sQLiteProgram;
    }

    /* renamed from: a */
    public final void m10021a(int i, byte[] bArr) {
        this.f4170a.bindBlob(i, bArr);
    }

    /* renamed from: c */
    public final void m10020c(double d, int i) {
        this.f4170a.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4170a.close();
    }

    /* renamed from: d */
    public final void m10019d(int i, long j) {
        this.f4170a.bindLong(i, j);
    }

    /* renamed from: e */
    public final void m10018e(int i) {
        this.f4170a.bindNull(i);
    }

    /* renamed from: f */
    public final void m10017f(int i, String str) {
        this.f4170a.bindString(i, str);
    }
}
