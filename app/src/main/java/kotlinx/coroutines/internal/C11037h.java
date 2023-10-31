package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.C10898a;
import kotlin.sequences.C10903e;
import kotlin.sequences.C10904f;
import kotlinx.coroutines.InterfaceC10952c0;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.h */
/* loaded from: classes3.dex */
public final class C11037h {
    @NotNull

    /* renamed from: a */
    public static final Collection<InterfaceC10952c0> f21628a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.sequences.a] */
    static {
        Iterator m265a = C11035g.m265a();
        C10843j.m430f(m265a, "<this>");
        C10904f c10904f = new C10904f(m265a);
        if (!(c10904f instanceof C10898a)) {
            c10904f = new C10898a(c10904f);
        }
        f21628a = C10903e.m408h(c10904f);
    }
}
