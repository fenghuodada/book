package androidx.sqlite.p004db.framework;

import android.database.sqlite.SQLiteStatement;

/* renamed from: androidx.sqlite.db.framework.e */
/* loaded from: classes.dex */
public final class C1714e extends C1713d {

    /* renamed from: b */
    public final SQLiteStatement f4171b;

    public C1714e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f4171b = sQLiteStatement;
    }

    /* renamed from: g */
    public final int m10016g() {
        return this.f4171b.executeUpdateDelete();
    }
}
