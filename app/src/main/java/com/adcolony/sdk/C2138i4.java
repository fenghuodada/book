package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.datastore.preferences.protobuf.C1169e;

/* renamed from: com.adcolony.sdk.i4 */
/* loaded from: classes.dex */
public final class C2138i4 {
    /* renamed from: a */
    public static void m9616a(String str, ContentValues contentValues, SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.insertOrThrow(str, null, contentValues);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error on insert to " + str + ", db version:");
                sb.append(sQLiteDatabase.getVersion());
                sb.append(". Values: " + contentValues.toString() + " caused: ");
                sb.append(th.toString());
                C1169e.m11129c(sb.toString(), 0, 0, true);
                return;
            }
        } catch (SQLException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception on insert to " + str + ", db version:");
            sb2.append(sQLiteDatabase.getVersion());
            sb2.append(". Values: " + contentValues.toString() + " caused: ");
            sb2.append(e.toString());
            C2201m0.m9588d().m9689n().m9706d(sb2.toString(), 0, 1, true);
        }
        sQLiteDatabase.endTransaction();
    }
}
