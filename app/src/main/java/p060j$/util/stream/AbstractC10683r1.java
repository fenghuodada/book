package p060j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p060j$.util.InterfaceC10321P;
import p060j$.util.concurrent.C10359u;
import p060j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.r1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10683r1 extends CountedCompleter implements InterfaceC10634h2 {

    /* renamed from: a */
    protected final InterfaceC10321P f21242a;

    /* renamed from: b */
    protected final AbstractC10707w0 f21243b;

    /* renamed from: c */
    protected final long f21244c;

    /* renamed from: d */
    protected long f21245d;

    /* renamed from: e */
    protected long f21246e;

    /* renamed from: f */
    protected int f21247f;

    /* renamed from: g */
    protected int f21248g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10683r1(int i, InterfaceC10321P interfaceC10321P, AbstractC10707w0 abstractC10707w0) {
        this.f21242a = interfaceC10321P;
        this.f21243b = abstractC10707w0;
        this.f21244c = AbstractC10621f.m693f(interfaceC10321P.estimateSize());
        this.f21245d = 0L;
        this.f21246e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10683r1(AbstractC10683r1 abstractC10683r1, InterfaceC10321P interfaceC10321P, long j, long j2, int i) {
        super(abstractC10683r1);
        this.f21242a = interfaceC10321P;
        this.f21243b = abstractC10683r1.f21243b;
        this.f21244c = abstractC10683r1.f21244c;
        this.f21245d = j;
        this.f21246e = j2;
        if (j < 0 || j2 < 0 || (j + j2) - 1 >= i) {
            throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    abstract AbstractC10683r1 mo626a(InterfaceC10321P interfaceC10321P, long j, long j2);

    public /* synthetic */ void accept(double d) {
        AbstractC10707w0.m554r0();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC10707w0.m541y0();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC10707w0.m539z0();
        throw null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC10321P trySplit;
        InterfaceC10321P interfaceC10321P = this.f21242a;
        AbstractC10683r1 abstractC10683r1 = this;
        while (interfaceC10321P.estimateSize() > abstractC10683r1.f21244c && (trySplit = interfaceC10321P.trySplit()) != null) {
            abstractC10683r1.setPendingCount(1);
            long estimateSize = trySplit.estimateSize();
            abstractC10683r1.mo626a(trySplit, abstractC10683r1.f21245d, estimateSize).fork();
            abstractC10683r1 = abstractC10683r1.mo626a(interfaceC10321P, abstractC10683r1.f21245d + estimateSize, abstractC10683r1.f21246e - estimateSize);
        }
        abstractC10683r1.f21243b.mo540y1(interfaceC10321P, abstractC10683r1);
        abstractC10683r1.propagateCompletion();
    }

    @Override // p060j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo532e(Consumer consumer) {
        consumer.getClass();
        return new C10359u(3, this, consumer);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    public final /* synthetic */ void end() {
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        long j2 = this.f21246e;
        if (j > j2) {
            throw new IllegalStateException("size passed to Sink.begin exceeds array length");
        }
        int i = (int) this.f21245d;
        this.f21247f = i;
        this.f21248g = i + ((int) j2);
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: i */
    public final /* synthetic */ boolean mo530i() {
        return false;
    }
}
