package com.adcolony.sdk;

import android.content.ContentValues;
import com.adcolony.sdk.C2070c4;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.adcolony.sdk.b4 */
/* loaded from: classes.dex */
public final class C2061b4 {

    /* renamed from: a */
    public final int f5010a;

    /* renamed from: b */
    public final ConcurrentHashMap f5011b = new ConcurrentHashMap();

    /* renamed from: com.adcolony.sdk.b4$a */
    /* loaded from: classes.dex */
    public static class C2062a {

        /* renamed from: a */
        public final String f5012a;

        /* renamed from: b */
        public final C2070c4 f5013b;

        public C2062a(String str, C2070c4 c2070c4) {
            this.f5012a = str;
            this.f5013b = c2070c4;
        }
    }

    public C2061b4(int i) {
        this.f5010a = i;
    }

    /* renamed from: a */
    public final C2367y1 m9684a() {
        Iterator it;
        String str;
        Iterator it2;
        int i;
        String asString;
        Object obj;
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9657k(this.f5010a, c2367y1, MediationMetaData.KEY_VERSION);
        Iterator it3 = this.f5011b.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            C2367y1 c2367y12 = new C2367y1();
            Iterator it4 = ((ArrayList) entry.getValue()).iterator();
            while (it4.hasNext()) {
                C2062a c2062a = (C2062a) it4.next();
                C2328v1 c2328v1 = new C2328v1();
                C2070c4 c2070c4 = c2062a.f5013b;
                c2070c4.getClass();
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = c2070c4.f5037b;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    if (i2 >= 0 && i2 < arrayList2.size()) {
                        ContentValues contentValues = (ContentValues) arrayList2.get(i2);
                        StringBuilder sb = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            ArrayList arrayList3 = c2070c4.f5036a;
                            if (i3 >= arrayList3.size()) {
                                break;
                            }
                            if (i3 >= 0 && i3 < arrayList3.size()) {
                                i = ((C2070c4.C2071a) arrayList3.get(i3)).f5040c;
                                it2 = it3;
                            } else {
                                it2 = it3;
                                i = -1;
                            }
                            if (i == 3) {
                                asString = "\"";
                                sb.append("\"");
                                sb.append(contentValues.get(c2070c4.m9678a(i3)));
                            } else {
                                asString = contentValues.getAsString(c2070c4.m9678a(i3));
                            }
                            sb.append(asString);
                            if (i3 == arrayList3.size() - 1) {
                                obj = "";
                            } else {
                                obj = ',';
                            }
                            sb.append(obj);
                            i3++;
                            it3 = it2;
                        }
                        it = it3;
                        str = sb.toString();
                    } else {
                        it = it3;
                        str = null;
                    }
                    arrayList.add(str);
                    i2++;
                    it3 = it;
                }
                Iterator it5 = it3;
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    c2328v1.m9483d((String) it6.next());
                }
                C2080d1.m9662f(c2367y12, c2062a.f5012a, c2328v1);
                it3 = it5;
            }
            C2080d1.m9661g(c2367y1, (String) entry.getKey(), c2367y12);
        }
        return c2367y1;
    }
}
