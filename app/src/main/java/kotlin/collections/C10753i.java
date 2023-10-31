package kotlin.collections;

import java.util.Collection;
import kotlin.PublishedApi;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.i */
/* loaded from: classes3.dex */
public class C10753i extends C10752h {
    @PublishedApi
    /* renamed from: g */
    public static final int m482g(@NotNull Iterable iterable) {
        C10843j.m430f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
