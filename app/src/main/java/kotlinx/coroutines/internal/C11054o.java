package kotlinx.coroutines.internal;

import androidx.appcompat.view.menu.C0235r;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcherKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.o */
/* loaded from: classes3.dex */
public final class C11054o {
    /* renamed from: a */
    public static final void m249a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(C0235r.m12816a("Expected positive parallelism level, but got ", i).toString());
    }
}
