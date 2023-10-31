package p060j$.util.stream;

import java.util.Collection;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10321P;
import p060j$.util.InterfaceC10333b;
import p060j$.util.function.Consumer;
import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.J0 */
/* loaded from: classes2.dex */
public final class C10529J0 implements InterfaceC10509F0 {

    /* renamed from: a */
    private final Collection f21022a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10529J0(Collection collection) {
        this.f21022a = collection;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: a */
    public final void mo621a(Consumer consumer) {
        AbstractC10331a.m1002v(this.f21022a, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: b */
    public final InterfaceC10509F0 mo620b(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final long count() {
        return this.f21022a.size();
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: k */
    public final void mo619k(Object[] objArr, int i) {
        for (Object obj : this.f21022a) {
            objArr[i] = obj;
            i++;
        }
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: p */
    public final /* synthetic */ int mo618p() {
        return 0;
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: r */
    public final Object[] mo617r(InterfaceC10397N interfaceC10397N) {
        Collection collection = this.f21022a;
        return collection.toArray((Object[]) interfaceC10397N.apply(collection.size()));
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: s */
    public final /* synthetic */ InterfaceC10509F0 mo616s(long j, long j2, InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m589K0(this, j, j2, interfaceC10397N);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    public final InterfaceC10321P spliterator() {
        Collection collection = this.f21022a;
        return (collection instanceof InterfaceC10333b ? ((InterfaceC10333b) collection).stream() : AbstractC10331a.m1010m(collection)).spliterator();
    }

    public final String toString() {
        Collection collection = this.f21022a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
