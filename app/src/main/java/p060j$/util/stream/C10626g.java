package p060j$.util.stream;

import java.util.Iterator;
import java.util.stream.BaseStream;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import p060j$.util.C10319N;
import p060j$.util.InterfaceC10321P;
import p060j$.util.stream.IntStream;

/* renamed from: j$.util.stream.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10626g implements InterfaceC10636i {

    /* renamed from: a */
    public final /* synthetic */ BaseStream f21172a;

    private /* synthetic */ C10626g(BaseStream baseStream) {
        this.f21172a = baseStream;
    }

    /* renamed from: A */
    public static /* synthetic */ InterfaceC10636i m691A(BaseStream baseStream) {
        if (baseStream == null) {
            return null;
        }
        return baseStream instanceof C10631h ? ((C10631h) baseStream).f21179a : baseStream instanceof DoubleStream ? C10503E.m816A((DoubleStream) baseStream) : baseStream instanceof IntStream ? IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) baseStream) : baseStream instanceof LongStream ? C10652l0.m659A((LongStream) baseStream) : baseStream instanceof Stream ? C10567S2.m770A((Stream) baseStream) : new C10626g(baseStream);
    }

    @Override // p060j$.util.stream.InterfaceC10636i, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.f21172a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10626g) {
            obj = ((C10626g) obj).f21172a;
        }
        return this.f21172a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f21172a.hashCode();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ boolean isParallel() {
        return this.f21172a.isParallel();
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ Iterator iterator() {
        return this.f21172a.iterator();
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ InterfaceC10636i onClose(Runnable runnable) {
        return m691A(this.f21172a.onClose(runnable));
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10636i parallel() {
        return m691A(this.f21172a.parallel());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10636i sequential() {
        return m691A(this.f21172a.sequential());
    }

    @Override // p060j$.util.stream.InterfaceC10636i, p060j$.util.stream.InterfaceC10513G
    public final /* synthetic */ InterfaceC10321P spliterator() {
        return C10319N.m1029e(this.f21172a.spliterator());
    }

    @Override // p060j$.util.stream.InterfaceC10636i
    public final /* synthetic */ InterfaceC10636i unordered() {
        return m691A(this.f21172a.unordered());
    }
}
