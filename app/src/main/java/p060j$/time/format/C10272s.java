package p060j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.s */
/* loaded from: classes2.dex */
public final class C10272s {

    /* renamed from: a */
    private final Map f20654a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10272s(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.f20654a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i = C10255b.f20613c;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = C10255b.f20612b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((EnumC10276w) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = C10255b.f20612b;
        Collections.sort(arrayList, comparator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final String m1105a(long j, EnumC10276w enumC10276w) {
        Map map = (Map) this.f20654a.get(enumC10276w);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}
