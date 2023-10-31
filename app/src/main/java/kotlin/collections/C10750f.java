package kotlin.collections;

import kotlin.SinceKotlin;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nArrays.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Arrays.kt\nkotlin/collections/ArraysKt__ArraysKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* renamed from: kotlin.collections.f */
/* loaded from: classes3.dex */
public class C10750f {
    @SinceKotlin(version = "1.3")
    /* renamed from: a */
    public static final void m495a(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }
}
