package kotlin.sequences;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.sequences.a */
/* loaded from: classes3.dex */
public final class C10898a<T> implements InterfaceC10902d<T> {
    @NotNull

    /* renamed from: a */
    public final AtomicReference<InterfaceC10902d<T>> f21438a;

    public C10898a(@NotNull C10904f c10904f) {
        this.f21438a = new AtomicReference<>(c10904f);
    }

    @Override // kotlin.sequences.InterfaceC10902d
    @NotNull
    public final Iterator<T> iterator() {
        InterfaceC10902d<T> andSet = this.f21438a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
