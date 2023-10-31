package p060j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import p060j$.util.C10320O;
import p060j$.util.stream.IntStream;

/* renamed from: j$.util.stream.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10631h implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10636i f21179a;

    private /* synthetic */ C10631h(InterfaceC10636i interfaceC10636i) {
        this.f21179a = interfaceC10636i;
    }

    /* renamed from: A */
    public static /* synthetic */ BaseStream m689A(InterfaceC10636i interfaceC10636i) {
        if (interfaceC10636i == null) {
            return null;
        }
        return interfaceC10636i instanceof C10626g ? ((C10626g) interfaceC10636i).f21172a : interfaceC10636i instanceof InterfaceC10513G ? C10508F.m815A((InterfaceC10513G) interfaceC10636i) : interfaceC10636i instanceof IntStream ? IntStream.Wrapper.convert((IntStream) interfaceC10636i) : interfaceC10636i instanceof InterfaceC10662n0 ? C10657m0.m657A((InterfaceC10662n0) interfaceC10636i) : interfaceC10636i instanceof InterfaceC10575U2 ? C10571T2.m769A((InterfaceC10575U2) interfaceC10636i) : new C10631h(interfaceC10636i);
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21179a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10636i interfaceC10636i = this.f21179a;
        if (obj instanceof C10631h) {
            obj = ((C10631h) obj).f21179a;
        }
        return interfaceC10636i.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21179a.hashCode();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ boolean isParallel() {
        return this.f21179a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Iterator iterator() {
        return this.f21179a.iterator();
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return m689A(this.f21179a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream parallel() {
        return m689A(this.f21179a.parallel());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream sequential() {
        return m689A(this.f21179a.sequential());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ Spliterator spliterator() {
        return C10320O.m1028a(this.f21179a.spliterator());
    }

    @Override // java.util.stream.BaseStream
    public final /* synthetic */ BaseStream unordered() {
        return m689A(this.f21179a.unordered());
    }
}
