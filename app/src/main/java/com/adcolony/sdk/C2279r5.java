package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2378z3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.r5 */
/* loaded from: classes.dex */
public final class C2279r5 {

    /* renamed from: f */
    public static C2279r5 f5544f;

    /* renamed from: b */
    public SQLiteDatabase f5546b;

    /* renamed from: d */
    public InterfaceC2280a f5548d;

    /* renamed from: a */
    public final ExecutorService f5545a = Executors.newSingleThreadExecutor();

    /* renamed from: c */
    public boolean f5547c = false;

    /* renamed from: e */
    public final HashSet f5549e = new HashSet();

    /* renamed from: com.adcolony.sdk.r5$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2280a {
    }

    /* renamed from: a */
    public static C2279r5 m9508a() {
        if (f5544f == null) {
            synchronized (C2279r5.class) {
                if (f5544f == null) {
                    f5544f = new C2279r5();
                }
            }
        }
        return f5544f;
    }

    /* renamed from: b */
    public final void m9507b(ContentValues contentValues, String str) {
        if (this.f5547c) {
            try {
                this.f5545a.execute(new RunnableC2270q5(this, str, contentValues));
            } catch (RejectedExecutionException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("ADCEventsRepository.saveEvent failed with: " + e.toString());
                C1169e.m11129c(sb.toString(), 0, 0, true);
            }
        }
    }

    /* renamed from: c */
    public final void m9506c(C2378z3.C2379a c2379a, ContentValues contentValues) {
        String str;
        long j;
        HashSet hashSet = this.f5549e;
        String str2 = c2379a.f5705b;
        if (!hashSet.contains(str2)) {
            hashSet.add(str2);
            long j2 = -1;
            C2378z3.C2382d c2382d = c2379a.f5711h;
            if (c2382d != null) {
                str = c2382d.f5719b;
                j = contentValues.getAsLong(str).longValue() - c2382d.f5718a;
            } else {
                str = null;
                j = -1;
            }
            SQLiteDatabase sQLiteDatabase = this.f5546b;
            try {
                try {
                    sQLiteDatabase.beginTransaction();
                    if (str == null) {
                        str = "rowid";
                    } else {
                        j2 = j;
                    }
                    int i = c2379a.f5706c;
                    if (i >= 0) {
                        Cursor rawQuery = sQLiteDatabase.rawQuery("select " + str + " from " + str2 + " order by " + str + " desc limit 1 offset " + i, null);
                        if (rawQuery.moveToFirst()) {
                            j2 = Math.max(j2, rawQuery.getLong(0));
                        }
                        rawQuery.close();
                    }
                    if (j2 >= 0) {
                        sQLiteDatabase.execSQL("delete from " + str2 + " where " + str + " <= " + j2);
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable th) {
                    C1169e.m11129c("Error on deleting excessive rows:" + th.toString(), 0, 0, true);
                    return;
                }
            } catch (SQLException e) {
                C2201m0.m9588d().m9689n().m9706d("Exception on deleting excessive rows:" + e.toString(), 0, 1, true);
            }
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: d */
    public final boolean m9505d(C2378z3 c2378z3) {
        boolean z;
        int i = c2378z3.f5702a;
        SQLiteDatabase sQLiteDatabase = this.f5546b;
        C2370y3 c2370y3 = new C2370y3(sQLiteDatabase, c2378z3);
        int version = sQLiteDatabase.getVersion();
        sQLiteDatabase.beginTransaction();
        boolean z2 = true;
        try {
            try {
                ArrayList arrayList = c2378z3.f5703b;
                ArrayList<String> m9433a = c2370y3.m9433a();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C2378z3.C2379a c2379a = (C2378z3.C2379a) it.next();
                    boolean contains = m9433a.contains(c2379a.f5705b);
                    String str = c2379a.f5705b;
                    if (contains) {
                        c2370y3.m9429e(c2379a);
                    } else {
                        c2370y3.m9431c(c2379a);
                        Iterator it2 = c2379a.f5710g.iterator();
                        while (it2.hasNext()) {
                            c2370y3.m9432b((C2378z3.C2381c) it2.next(), str);
                        }
                    }
                    m9433a.remove(str);
                }
                Iterator<String> it3 = m9433a.iterator();
                while (it3.hasNext()) {
                    c2370y3.f5693a.execSQL("DROP TABLE " + it3.next());
                }
                sQLiteDatabase.setVersion(i);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e) {
                e = e;
                z = false;
            }
            try {
                C2201m0.m9588d().m9689n().m9706d("Success upgrading database from " + version + " to " + i, 0, 2, true);
            } catch (SQLException e2) {
                e = e2;
                z = true;
                C2201m0.m9588d().m9689n().m9706d("Upgrading database from " + version + " to " + i + "caused: " + e.toString(), 0, 1, true);
                z2 = z;
                sQLiteDatabase.endTransaction();
                return z2;
            }
            sQLiteDatabase.endTransaction();
            return z2;
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }
}
