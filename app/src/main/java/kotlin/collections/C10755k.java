package kotlin.collections;

import java.util.Collection;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.k */
/* loaded from: classes3.dex */
public class C10755k extends C10754j {
    /* renamed from: h */
    public static final void m481h(@NotNull Iterable elements, @NotNull Collection collection) {
        C10843j.m430f(collection, "<this>");
        C10843j.m430f(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        for (Object obj : elements) {
            collection.add(obj);
        }
    }
}
