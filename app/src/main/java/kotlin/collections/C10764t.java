package kotlin.collections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.PublishedApi;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
/* renamed from: kotlin.collections.t */
/* loaded from: classes3.dex */
public class C10764t {
    @PublishedApi
    /* renamed from: a */
    public static final int m468a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    /* renamed from: b */
    public static final Map m467b(@NotNull LinkedHashMap linkedHashMap) {
        C10843j.m430f(linkedHashMap, "<this>");
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C10843j.m431e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
