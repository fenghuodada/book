package com.adcolony.sdk;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.concurrent.futures.C0484a;
import com.adcolony.sdk.C2378z3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.adcolony.sdk.y3 */
/* loaded from: classes.dex */
public final class C2370y3 {

    /* renamed from: a */
    public final SQLiteDatabase f5693a;

    /* renamed from: com.adcolony.sdk.y3$a */
    /* loaded from: classes.dex */
    public static class C2371a {

        /* renamed from: a */
        public final String f5694a;

        /* renamed from: b */
        public final String f5695b;

        /* renamed from: c */
        public final String f5696c;

        public C2371a(String[] strArr) {
            this.f5694a = strArr[1];
            this.f5695b = strArr[2];
            this.f5696c = strArr[4];
        }
    }

    public C2370y3(SQLiteDatabase sQLiteDatabase, C2378z3 c2378z3) {
        this.f5693a = sQLiteDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList<java.lang.String> m9433a() {
        /*
            r4 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.f5693a
            java.lang.String r2 = "SELECT name FROM sqlite_master  WHERE type='table' ORDER BY name"
            android.database.Cursor r0 = r1.rawQuery(r2, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 == 0) goto L24
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L24
        L16:
            r2 = 0
            java.lang.String r2 = r0.getString(r2)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L16
        L24:
            r0.close()
            int r0 = r1.size()
            int r0 = r0 + (-1)
        L2d:
            if (r0 < 0) goto L4b
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "android_"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L45
            java.lang.String r3 = "sqlite_"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L48
        L45:
            r1.remove(r0)
        L48:
            int r0 = r0 + (-1)
            goto L2d
        L4b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2370y3.m9433a():java.util.ArrayList");
    }

    /* renamed from: b */
    public final void m9432b(C2378z3.C2381c c2381c, String str) {
        String join = TextUtils.join(", ", c2381c.f5717b);
        StringBuilder sb = new StringBuilder("CREATE INDEX ");
        sb.append(c2381c.f5716a);
        sb.append(" ON ");
        sb.append(str);
        sb.append("(");
        this.f5693a.execSQL(C0484a.m12392a(sb, join, ")"));
    }

    /* renamed from: c */
    public final void m9431c(C2378z3.C2379a c2379a) {
        String obj;
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        sb.append(c2379a.f5705b);
        sb.append(" (");
        int i = 0;
        while (true) {
            ArrayList arrayList = c2379a.f5709f;
            if (i < arrayList.size()) {
                C2378z3.C2380b c2380b = (C2378z3.C2380b) arrayList.get(i);
                sb.append(c2380b.f5713a);
                sb.append(" ");
                sb.append(c2380b.f5714b);
                Object obj2 = c2380b.f5715c;
                if (obj2 != null) {
                    if (obj2 instanceof Boolean) {
                        if (((Boolean) obj2).booleanValue()) {
                            obj = "1";
                        } else {
                            obj = "0";
                        }
                    } else if (obj2 instanceof String) {
                        obj = "'" + obj2 + "'";
                    } else {
                        obj = obj2.toString();
                    }
                    sb.append(" DEFAULT ");
                    sb.append(obj);
                }
                if (i < arrayList.size() - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append(")");
                this.f5693a.execSQL(sb.toString());
                return;
            }
        }
    }

    /* renamed from: d */
    public final ArrayList<String[]> m9430d(String str) {
        Cursor rawQuery = this.f5693a.rawQuery(str, null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            int columnCount = rawQuery.getColumnCount();
            String[] strArr = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                strArr[i] = rawQuery.getString(i);
            }
            arrayList.add(strArr);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: e */
    public final void m9429e(C2378z3.C2379a c2379a) {
        boolean z;
        boolean z2;
        boolean z3;
        C2371a c2371a;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("PRAGMA table_info(");
        String str = c2379a.f5705b;
        sb.append(str);
        sb.append(")");
        Iterator<String[]> it = m9430d(sb.toString()).iterator();
        while (it.hasNext()) {
            String[] next = it.next();
            if (next.length >= 5) {
                c2371a = new C2371a(next);
            } else {
                c2371a = null;
            }
            if (c2371a != null) {
                arrayList.add(c2371a);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = c2379a.f5709f.iterator();
        boolean z4 = false;
        while (it2.hasNext()) {
            C2378z3.C2380b c2380b = (C2378z3.C2380b) it2.next();
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    C2371a c2371a2 = (C2371a) arrayList.get(size);
                    if (Objects.equals(c2371a2.f5694a, c2380b.f5713a)) {
                        String str2 = c2380b.f5713a;
                        arrayList2.add(str2);
                        if (Objects.equals(c2371a2.f5694a, str2) && Objects.equals(c2371a2.f5695b, c2380b.f5714b) && Objects.equals(c2371a2.f5696c, c2380b.f5715c)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList.remove(size);
                        z3 = true;
                    } else {
                        size--;
                    }
                } else {
                    z2 = false;
                    z3 = false;
                    break;
                }
            }
            if (!z3 || !z2) {
                z4 = true;
            }
        }
        if (arrayList.size() > 0) {
            z4 = true;
        }
        SQLiteDatabase sQLiteDatabase = this.f5693a;
        ArrayList arrayList3 = c2379a.f5710g;
        if (z4) {
            sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO manager_tmp_table");
            m9431c(c2379a);
            String join = TextUtils.join(", ", arrayList2);
            StringBuilder m9460b = C2362x3.m9460b("INSERT INTO ", str, " (", join, ") SELECT ");
            m9460b.append(join);
            m9460b.append(" FROM manager_tmp_table");
            sQLiteDatabase.execSQL(m9460b.toString());
            sQLiteDatabase.execSQL("DROP TABLE manager_tmp_table");
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                m9432b((C2378z3.C2381c) it3.next(), str);
            }
            return;
        }
        ArrayList<String[]> m9430d = m9430d("PRAGMA index_list(" + str + ")");
        ArrayList arrayList4 = new ArrayList();
        Iterator<String[]> it4 = m9430d.iterator();
        while (it4.hasNext()) {
            String[] next2 = it4.next();
            if (next2.length >= 3) {
                arrayList4.add(next2[1]);
            }
        }
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            C2378z3.C2381c c2381c = (C2378z3.C2381c) it5.next();
            boolean contains = arrayList4.contains(c2381c.f5716a);
            String str3 = c2381c.f5716a;
            if (contains) {
                ArrayList<String[]> m9430d2 = m9430d("PRAGMA index_info(" + str3 + ")");
                String[] strArr = c2381c.f5717b;
                if (strArr.length == m9430d2.size()) {
                    z = false;
                    for (int i = 0; i < strArr.length; i++) {
                        if (!Objects.equals(strArr[i], m9430d2.get(i)[2])) {
                            z = true;
                        }
                    }
                } else {
                    z = true;
                }
                if (z) {
                    sQLiteDatabase.execSQL("DROP INDEX " + str3);
                    m9432b(c2381c, str);
                }
            } else {
                m9432b(c2381c, str);
            }
            arrayList4.remove(str3);
        }
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            sQLiteDatabase.execSQL("DROP INDEX " + ((String) it6.next()));
        }
    }
}
