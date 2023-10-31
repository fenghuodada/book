package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n394#1:473\n1#2:472\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n388#1:473\n*E\n"})
/* renamed from: kotlin.collections.h */
/* loaded from: classes3.dex */
public class C10752h {
    @NotNull
    /* renamed from: a */
    public static final <T> ArrayList<T> m488a(@NotNull T... tArr) {
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C10748d(tArr, true));
    }

    /* renamed from: b */
    public static final <T> int m487b(@NotNull List<? extends T> list) {
        C10843j.m430f(list, "<this>");
        return list.size() - 1;
    }

    @NotNull
    /* renamed from: c */
    public static final List m486c(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C10843j.m431e(singletonList, "singletonList(element)");
        return singletonList;
    }

    @NotNull
    /* renamed from: d */
    public static final <T> List<T> m485d(@NotNull T... elements) {
        C10843j.m430f(elements, "elements");
        if (elements.length > 0) {
            List<T> asList = Arrays.asList(elements);
            C10843j.m431e(asList, "asList(this)");
            return asList;
        }
        return C10759o.f21363a;
    }

    @NotNull
    /* renamed from: e */
    public static final List m484e(@NotNull ArrayList arrayList) {
        int size = arrayList.size();
        return size != 0 ? size != 1 ? arrayList : m486c(arrayList.get(0)) : C10759o.f21363a;
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: f */
    public static final void m483f() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
