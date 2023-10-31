package kotlin.sequences;

import java.util.Iterator;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.InterfaceC10847a;
import org.jetbrains.annotations.NotNull;
import p060j$.util.Iterator;
import p060j$.util.function.Consumer;

@SourceDebugExtension({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/DropSequence\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,680:1\n1#2:681\n*E\n"})
/* renamed from: kotlin.sequences.b */
/* loaded from: classes3.dex */
public final class C10899b<T> implements InterfaceC10902d<T>, InterfaceC10901c<T> {
    @NotNull

    /* renamed from: a */
    public final InterfaceC10902d<T> f21439a;

    /* renamed from: b */
    public final int f21440b;

    /* renamed from: kotlin.sequences.b$a */
    /* loaded from: classes3.dex */
    public static final class C10900a implements Iterator<T>, InterfaceC10847a, p060j$.util.Iterator {
        @NotNull

        /* renamed from: a */
        public final Iterator<T> f21441a;

        /* renamed from: b */
        public int f21442b;

        public C10900a(C10899b<T> c10899b) {
            this.f21441a = c10899b.f21439a.iterator();
            this.f21442b = c10899b.f21440b;
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
            java.util.Iterator<T> it;
            while (true) {
                int i = this.f21442b;
                it = this.f21441a;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f21442b--;
            }
            return it.hasNext();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final T next() {
            java.util.Iterator<T> it;
            while (true) {
                int i = this.f21442b;
                it = this.f21441a;
                if (i <= 0 || !it.hasNext()) {
                    break;
                }
                it.next();
                this.f21442b--;
            }
            return it.next();
        }

        @Override // java.util.Iterator, p060j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10899b(@NotNull InterfaceC10902d<? extends T> sequence, int i) {
        C10843j.m430f(sequence, "sequence");
        this.f21439a = sequence;
        this.f21440b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // kotlin.sequences.InterfaceC10901c
    @NotNull
    /* renamed from: a */
    public final C10899b mo409a(int i) {
        int i2 = this.f21440b + i;
        return i2 < 0 ? new C10899b(this, i) : new C10899b(this.f21439a, i2);
    }

    @Override // kotlin.sequences.InterfaceC10902d
    @NotNull
    public final java.util.Iterator<T> iterator() {
        return new C10900a(this);
    }
}
