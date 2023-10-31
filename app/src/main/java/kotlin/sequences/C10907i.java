package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import org.jetbrains.annotations.NotNull;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

/* renamed from: kotlin.sequences.i */
/* loaded from: classes3.dex */
public final class C10907i<T, R> implements InterfaceC10902d<R> {
    @NotNull

    /* renamed from: a */
    public final InterfaceC10902d<T> f21445a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC10820l<T, R> f21446b;

    /* renamed from: kotlin.sequences.i$a */
    /* loaded from: classes3.dex */
    public static final class C10908a implements Iterator<R>, InterfaceC10847a, p060j$.util.Iterator {
        @NotNull

        /* renamed from: a */
        public final Iterator<T> f21447a;

        /* renamed from: b */
        public final /* synthetic */ C10907i<T, R> f21448b;

        public C10908a(C10907i<T, R> c10907i) {
            this.f21448b = c10907i;
            this.f21447a = c10907i.f21445a.iterator();
        }

        @Override // p060j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final boolean hasNext() {
            return this.f21447a.hasNext();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final R next() {
            return this.f21448b.f21446b.invoke(this.f21447a.next());
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10907i(@NotNull InterfaceC10902d<? extends T> interfaceC10902d, @NotNull InterfaceC10820l<? super T, ? extends R> interfaceC10820l) {
        this.f21445a = interfaceC10902d;
        this.f21446b = interfaceC10820l;
    }

    @Override // kotlin.sequences.InterfaceC10902d
    @NotNull
    public final java.util.Iterator<R> iterator() {
        return new C10908a(this);
    }
}
