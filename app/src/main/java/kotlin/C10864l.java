package kotlin;

import kotlin.C10862k;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Result.kt\nkotlin/ResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
/* renamed from: kotlin.l */
/* loaded from: classes3.dex */
public final class C10864l {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    /* renamed from: a */
    public static final C10862k.C10863a m419a(@NotNull Throwable exception) {
        C10843j.m430f(exception, "exception");
        return new C10862k.C10863a(exception);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: b */
    public static final void m418b(@NotNull Object obj) {
        if (obj instanceof C10862k.C10863a) {
            throw ((C10862k.C10863a) obj).f21413a;
        }
    }
}
