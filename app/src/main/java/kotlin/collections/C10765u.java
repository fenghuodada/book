package kotlin.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C10806j;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.u */
/* loaded from: classes3.dex */
public class C10765u extends C10764t {
    @NotNull
    /* renamed from: c */
    public static final Map m466c(@NotNull C10806j... c10806jArr) {
        if (c10806jArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C10764t.m468a(c10806jArr.length));
            for (C10806j c10806j : c10806jArr) {
                linkedHashMap.put(c10806j.f21397a, c10806j.f21398b);
            }
            return linkedHashMap;
        }
        return C10760p.f21364a;
    }

    /* renamed from: d */
    public static final void m465d(@NotNull ArrayList arrayList, @NotNull LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10806j c10806j = (C10806j) it.next();
            linkedHashMap.put(c10806j.f21397a, c10806j.f21398b);
        }
    }

    @NotNull
    /* renamed from: e */
    public static final Map m464e(@NotNull ArrayList arrayList) {
        C10760p c10760p = C10760p.f21364a;
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(C10764t.m468a(arrayList.size()));
                m465d(arrayList, linkedHashMap);
                return linkedHashMap;
            }
            C10806j pair = (C10806j) arrayList.get(0);
            C10843j.m430f(pair, "pair");
            Map singletonMap = Collections.singletonMap(pair.f21397a, pair.f21398b);
            C10843j.m431e(singletonMap, "singletonMap(pair.first, pair.second)");
            return singletonMap;
        }
        return c10760p;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    /* renamed from: f */
    public static final Map m463f(@NotNull LinkedHashMap linkedHashMap) {
        C10843j.m430f(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        return size != 0 ? size != 1 ? m462g(linkedHashMap) : C10764t.m467b(linkedHashMap) : C10760p.f21364a;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    /* renamed from: g */
    public static final LinkedHashMap m462g(@NotNull Map map) {
        C10843j.m430f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
