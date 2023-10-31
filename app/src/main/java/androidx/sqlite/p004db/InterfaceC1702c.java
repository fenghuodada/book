package androidx.sqlite.p004db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.sqlite.p004db.framework.C1707a;
import java.io.Closeable;
import java.io.File;

/* renamed from: androidx.sqlite.db.c */
/* loaded from: classes.dex */
public interface InterfaceC1702c extends Closeable {

    /* renamed from: androidx.sqlite.db.c$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1703a {

        /* renamed from: a */
        public final int f4150a;

        public AbstractC1703a(int i) {
            this.f4150a = i;
        }

        /* renamed from: a */
        public static void m10036a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: ".concat(str));
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        /* renamed from: b */
        public abstract void mo10035b(@NonNull C1707a c1707a, int i, int i2);
    }

    /* renamed from: androidx.sqlite.db.c$b */
    /* loaded from: classes.dex */
    public static class C1704b {
        @NonNull

        /* renamed from: a */
        public final Context f4151a;
        @Nullable

        /* renamed from: b */
        public final String f4152b;
        @NonNull

        /* renamed from: c */
        public final AbstractC1703a f4153c;

        /* renamed from: d */
        public final boolean f4154d;

        public C1704b(@NonNull Context context, @Nullable String str, @NonNull AbstractC1703a abstractC1703a, boolean z) {
            this.f4151a = context;
            this.f4152b = str;
            this.f4153c = abstractC1703a;
            this.f4154d = z;
        }
    }

    /* renamed from: androidx.sqlite.db.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1705c {
        @NonNull
        /* renamed from: a */
        InterfaceC1702c mo9821a(@NonNull C1704b c1704b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Nullable
    String getDatabaseName();

    /* renamed from: r */
    InterfaceC1701b mo10024r();

    @RequiresApi(api = 16)
    void setWriteAheadLoggingEnabled(boolean z);
}
