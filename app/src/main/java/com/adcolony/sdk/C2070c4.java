package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.adcolony.sdk.c4 */
/* loaded from: classes.dex */
public final class C2070c4 {

    /* renamed from: a */
    public final ArrayList f5036a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f5037b = new ArrayList();

    /* renamed from: com.adcolony.sdk.c4$a */
    /* loaded from: classes.dex */
    public static class C2071a {

        /* renamed from: a */
        public final int f5038a;

        /* renamed from: b */
        public final String f5039b;

        /* renamed from: c */
        public final int f5040c;

        public C2071a(int i, String str, int i2) {
            this.f5038a = i;
            this.f5039b = str;
            this.f5040c = i2;
        }
    }

    /* renamed from: b */
    public static void m9677b(C2070c4 c2070c4, Cursor cursor) {
        ContentValues contentValues = new ContentValues();
        Iterator it = c2070c4.f5036a.iterator();
        while (it.hasNext()) {
            C2071a c2071a = (C2071a) it.next();
            int i = c2071a.f5040c;
            int i2 = c2071a.f5038a;
            String str = c2071a.f5039b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        contentValues.put(str, cursor.getString(i2));
                    } else {
                        contentValues.put(str, cursor.getBlob(i2));
                    }
                } else {
                    contentValues.put(str, Double.valueOf(cursor.getDouble(i2)));
                }
            } else {
                contentValues.put(str, Long.valueOf(cursor.getLong(i2)));
            }
        }
        c2070c4.f5037b.add(contentValues);
    }

    /* renamed from: a */
    public final String m9678a(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.f5036a;
            if (i < arrayList.size()) {
                return ((C2071a) arrayList.get(i)).f5039b;
            }
        }
        return null;
    }

    @NonNull
    public final String toString() {
        ArrayList arrayList;
        String str;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            arrayList = this.f5036a;
            String str2 = "\n";
            if (i >= arrayList.size()) {
                break;
            }
            sb.append(((C2071a) arrayList.get(i)).f5039b);
            if (i != arrayList.size() - 1) {
                str2 = " | ";
            }
            sb.append(str2);
            i++;
        }
        Iterator it = this.f5037b.iterator();
        while (it.hasNext()) {
            ContentValues contentValues = (ContentValues) it.next();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sb.append(contentValues.getAsString(m9678a(i2)));
                if (i2 == arrayList.size() - 1) {
                    str = "\n";
                } else {
                    str = " | ";
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
