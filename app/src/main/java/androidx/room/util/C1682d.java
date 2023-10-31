package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.C0406q1;
import androidx.concurrent.futures.C0484a;
import androidx.room.ColumnInfo;
import androidx.sqlite.p004db.framework.C1707a;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.room.util.d */
/* loaded from: classes.dex */
public final class C1682d {

    /* renamed from: a */
    public final String f4098a;

    /* renamed from: b */
    public final Map<String, C1683a> f4099b;

    /* renamed from: c */
    public final Set<C1684b> f4100c;
    @Nullable

    /* renamed from: d */
    public final Set<C1686d> f4101d;

    /* renamed from: androidx.room.util.d$a */
    /* loaded from: classes.dex */
    public static class C1683a {

        /* renamed from: a */
        public final String f4102a;

        /* renamed from: b */
        public final String f4103b;
        @ColumnInfo.SQLiteTypeAffinity

        /* renamed from: c */
        public final int f4104c;

        /* renamed from: d */
        public final boolean f4105d;

        /* renamed from: e */
        public final int f4106e;

        /* renamed from: f */
        public final String f4107f;

        /* renamed from: g */
        public final int f4108g;

        public C1683a(int i, String str, String str2, String str3, boolean z, int i2) {
            this.f4102a = str;
            this.f4103b = str2;
            this.f4105d = z;
            this.f4106e = i;
            int i3 = 5;
            if (str2 != null) {
                String upperCase = str2.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    i3 = 3;
                } else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                    if (!upperCase.contains("BLOB")) {
                        i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
                    }
                } else {
                    i3 = 2;
                }
            }
            this.f4104c = i3;
            this.f4107f = str3;
            this.f4108g = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1683a.class != obj.getClass()) {
                return false;
            }
            C1683a c1683a = (C1683a) obj;
            if (this.f4106e == c1683a.f4106e && this.f4102a.equals(c1683a.f4102a) && this.f4105d == c1683a.f4105d) {
                String str = this.f4107f;
                int i = this.f4108g;
                int i2 = c1683a.f4108g;
                String str2 = c1683a.f4107f;
                if (i != 1 || i2 != 2 || str == null || str.equals(str2)) {
                    if (i != 2 || i2 != 1 || str2 == null || str2.equals(str)) {
                        return (i == 0 || i != i2 || (str == null ? str2 == null : str.equals(str2))) && this.f4104c == c1683a.f4104c;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }

        public final int hashCode() {
            return (((((this.f4102a.hashCode() * 31) + this.f4104c) * 31) + (this.f4105d ? 1231 : 1237)) * 31) + this.f4106e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.f4102a);
            sb.append("', type='");
            sb.append(this.f4103b);
            sb.append("', affinity='");
            sb.append(this.f4104c);
            sb.append("', notNull=");
            sb.append(this.f4105d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.f4106e);
            sb.append(", defaultValue='");
            return C0484a.m12392a(sb, this.f4107f, "'}");
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.room.util.d$b */
    /* loaded from: classes.dex */
    public static class C1684b {
        @NonNull

        /* renamed from: a */
        public final String f4109a;
        @NonNull

        /* renamed from: b */
        public final String f4110b;
        @NonNull

        /* renamed from: c */
        public final String f4111c;
        @NonNull

        /* renamed from: d */
        public final List<String> f4112d;
        @NonNull

        /* renamed from: e */
        public final List<String> f4113e;

        public C1684b(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<String> list, @NonNull List<String> list2) {
            this.f4109a = str;
            this.f4110b = str2;
            this.f4111c = str3;
            this.f4112d = Collections.unmodifiableList(list);
            this.f4113e = Collections.unmodifiableList(list2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1684b.class != obj.getClass()) {
                return false;
            }
            C1684b c1684b = (C1684b) obj;
            if (this.f4109a.equals(c1684b.f4109a) && this.f4110b.equals(c1684b.f4110b) && this.f4111c.equals(c1684b.f4111c) && this.f4112d.equals(c1684b.f4112d)) {
                return this.f4113e.equals(c1684b.f4113e);
            }
            return false;
        }

        public final int hashCode() {
            int m12537a = C0406q1.m12537a(this.f4111c, C0406q1.m12537a(this.f4110b, this.f4109a.hashCode() * 31, 31), 31);
            return this.f4113e.hashCode() + ((this.f4112d.hashCode() + m12537a) * 31);
        }

        public final String toString() {
            return "ForeignKey{referenceTable='" + this.f4109a + "', onDelete='" + this.f4110b + "', onUpdate='" + this.f4111c + "', columnNames=" + this.f4112d + ", referenceColumnNames=" + this.f4113e + '}';
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.room.util.d$c */
    /* loaded from: classes.dex */
    public static class C1685c implements Comparable<C1685c> {

        /* renamed from: a */
        public final int f4114a;

        /* renamed from: b */
        public final int f4115b;

        /* renamed from: c */
        public final String f4116c;

        /* renamed from: d */
        public final String f4117d;

        public C1685c(int i, int i2, String str, String str2) {
            this.f4114a = i;
            this.f4115b = i2;
            this.f4116c = str;
            this.f4117d = str2;
        }

        @Override // java.lang.Comparable
        public final int compareTo(@NonNull C1685c c1685c) {
            C1685c c1685c2 = c1685c;
            int i = this.f4114a - c1685c2.f4114a;
            if (i == 0) {
                return this.f4115b - c1685c2.f4115b;
            }
            return i;
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.room.util.d$d */
    /* loaded from: classes.dex */
    public static class C1686d {

        /* renamed from: a */
        public final String f4118a;

        /* renamed from: b */
        public final boolean f4119b;

        /* renamed from: c */
        public final List<String> f4120c;

        public C1686d(String str, List list, boolean z) {
            this.f4118a = str;
            this.f4119b = z;
            this.f4120c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1686d.class != obj.getClass()) {
                return false;
            }
            C1686d c1686d = (C1686d) obj;
            if (this.f4119b == c1686d.f4119b && this.f4120c.equals(c1686d.f4120c)) {
                String str = this.f4118a;
                boolean startsWith = str.startsWith("index_");
                String str2 = c1686d.f4118a;
                return startsWith ? str2.startsWith("index_") : str.equals(str2);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f4118a;
            return this.f4120c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f4119b ? 1 : 0)) * 31);
        }

        public final String toString() {
            return "Index{name='" + this.f4118a + "', unique=" + this.f4119b + ", columns=" + this.f4120c + '}';
        }
    }

    public C1682d(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        this.f4098a = str;
        this.f4099b = Collections.unmodifiableMap(hashMap);
        this.f4100c = Collections.unmodifiableSet(hashSet);
        this.f4101d = hashSet2 == null ? null : Collections.unmodifiableSet(hashSet2);
    }

    /* renamed from: a */
    public static C1682d m10057a(C1707a c1707a, String str) {
        HashSet hashSet;
        boolean z;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        Cursor m10027g = c1707a.m10027g("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (m10027g.getColumnCount() > 0) {
                int columnIndex = m10027g.getColumnIndex("name");
                int columnIndex2 = m10027g.getColumnIndex("type");
                int columnIndex3 = m10027g.getColumnIndex("notnull");
                int columnIndex4 = m10027g.getColumnIndex("pk");
                int columnIndex5 = m10027g.getColumnIndex("dflt_value");
                while (m10027g.moveToNext()) {
                    String string = m10027g.getString(columnIndex);
                    String string2 = m10027g.getString(columnIndex2);
                    if (m10027g.getInt(columnIndex3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hashMap.put(string, new C1683a(m10027g.getInt(columnIndex4), string, string2, m10027g.getString(columnIndex5), z2, 2));
                }
            }
            m10027g.close();
            HashSet hashSet2 = new HashSet();
            m10027g = c1707a.m10027g("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = m10027g.getColumnIndex(FacebookAdapter.KEY_ID);
                int columnIndex7 = m10027g.getColumnIndex("seq");
                int columnIndex8 = m10027g.getColumnIndex("table");
                int columnIndex9 = m10027g.getColumnIndex("on_delete");
                int columnIndex10 = m10027g.getColumnIndex("on_update");
                ArrayList m10056b = m10056b(m10027g);
                int count = m10027g.getCount();
                int i4 = 0;
                while (i4 < count) {
                    m10027g.moveToPosition(i4);
                    if (m10027g.getInt(columnIndex7) != 0) {
                        i = columnIndex6;
                        i2 = columnIndex7;
                        arrayList = m10056b;
                        i3 = count;
                    } else {
                        int i5 = m10027g.getInt(columnIndex6);
                        i = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = m10056b.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = m10056b;
                            C1685c c1685c = (C1685c) it.next();
                            int i6 = count;
                            if (c1685c.f4114a == i5) {
                                arrayList2.add(c1685c.f4116c);
                                arrayList3.add(c1685c.f4117d);
                            }
                            m10056b = arrayList4;
                            count = i6;
                        }
                        arrayList = m10056b;
                        i3 = count;
                        hashSet2.add(new C1684b(m10027g.getString(columnIndex8), m10027g.getString(columnIndex9), m10027g.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i4++;
                    columnIndex6 = i;
                    columnIndex7 = i2;
                    m10056b = arrayList;
                    count = i3;
                }
                m10027g.close();
                m10027g = c1707a.m10027g("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = m10027g.getColumnIndex("name");
                    int columnIndex12 = m10027g.getColumnIndex("origin");
                    int columnIndex13 = m10027g.getColumnIndex("unique");
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        hashSet = new HashSet();
                        while (m10027g.moveToNext()) {
                            if ("c".equals(m10027g.getString(columnIndex12))) {
                                String string3 = m10027g.getString(columnIndex11);
                                if (m10027g.getInt(columnIndex13) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                C1686d m10055c = m10055c(c1707a, string3, z);
                                if (m10055c != null) {
                                    hashSet.add(m10055c);
                                }
                            }
                        }
                        return new C1682d(str, hashMap, hashSet2, hashSet);
                    }
                    m10027g.close();
                    hashSet = null;
                    return new C1682d(str, hashMap, hashSet2, hashSet);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: b */
    public static ArrayList m10056b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(FacebookAdapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C1685c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @Nullable
    /* renamed from: c */
    public static C1686d m10055c(C1707a c1707a, String str, boolean z) {
        Cursor m10027g = c1707a.m10027g("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = m10027g.getColumnIndex("seqno");
            int columnIndex2 = m10027g.getColumnIndex("cid");
            int columnIndex3 = m10027g.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (m10027g.moveToNext()) {
                    if (m10027g.getInt(columnIndex2) >= 0) {
                        int i = m10027g.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), m10027g.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new C1686d(str, arrayList, z);
            }
            m10027g.close();
            return null;
        } finally {
            m10027g.close();
        }
    }

    public final boolean equals(Object obj) {
        Set<C1686d> set;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1682d.class != obj.getClass()) {
            return false;
        }
        C1682d c1682d = (C1682d) obj;
        String str = c1682d.f4098a;
        String str2 = this.f4098a;
        if (str2 == null ? str == null : str2.equals(str)) {
            Map<String, C1683a> map = c1682d.f4099b;
            Map<String, C1683a> map2 = this.f4099b;
            if (map2 == null ? map == null : map2.equals(map)) {
                Set<C1684b> set2 = c1682d.f4100c;
                Set<C1684b> set3 = this.f4100c;
                if (set3 == null ? set2 == null : set3.equals(set2)) {
                    Set<C1686d> set4 = this.f4101d;
                    if (set4 == null || (set = c1682d.f4101d) == null) {
                        return true;
                    }
                    return set4.equals(set);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4098a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, C1683a> map = this.f4099b;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<C1684b> set = this.f4100c;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f4098a + "', columns=" + this.f4099b + ", foreignKeys=" + this.f4100c + ", indices=" + this.f4101d + '}';
    }
}
