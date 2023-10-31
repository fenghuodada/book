package kotlinx.coroutines.internal;

import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.internal.AbstractC11028c0;
import org.jetbrains.annotations.NotNull;

@JvmInline
/* renamed from: kotlinx.coroutines.internal.d0 */
/* loaded from: classes3.dex */
public final class C11030d0<S extends AbstractC11028c0<S>> {
    @NotNull
    /* renamed from: a */
    public static final S m272a(Object obj) {
        if (obj != C11029d.f21622a) {
            C10843j.m432d(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    /* renamed from: b */
    public static final boolean m271b(Object obj) {
        return obj == C11029d.f21622a;
    }
}
