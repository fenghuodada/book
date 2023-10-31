package p060j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import p060j$.util.InterfaceC10321P;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.f */
/* loaded from: classes2.dex */
public abstract class AbstractC10621f extends CountedCompleter {

    /* renamed from: g */
    static final int f21163g = ForkJoinPool.getCommonPoolParallelism() << 2;

    /* renamed from: a */
    protected final AbstractC10707w0 f21164a;

    /* renamed from: b */
    protected InterfaceC10321P f21165b;

    /* renamed from: c */
    protected long f21166c;

    /* renamed from: d */
    protected AbstractC10621f f21167d;

    /* renamed from: e */
    protected AbstractC10621f f21168e;

    /* renamed from: f */
    private Object f21169f;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10621f(AbstractC10621f abstractC10621f, InterfaceC10321P interfaceC10321P) {
        super(abstractC10621f);
        this.f21165b = interfaceC10321P;
        this.f21164a = abstractC10621f.f21164a;
        this.f21166c = abstractC10621f.f21166c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC10621f(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P) {
        super(null);
        this.f21164a = abstractC10707w0;
        this.f21165b = interfaceC10321P;
        this.f21166c = 0L;
    }

    /* renamed from: f */
    public static long m693f(long j) {
        long j2 = j / f21163g;
        if (j2 > 0) {
            return j2;
        }
        return 1L;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo606a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public Object mo696b() {
        return this.f21169f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final AbstractC10621f m695c() {
        return (AbstractC10621f) getCompleter();
    }

    @Override // java.util.concurrent.CountedCompleter
    public void compute() {
        InterfaceC10321P trySplit;
        InterfaceC10321P interfaceC10321P = this.f21165b;
        long estimateSize = interfaceC10321P.estimateSize();
        long j = this.f21166c;
        if (j == 0) {
            j = m693f(estimateSize);
            this.f21166c = j;
        }
        boolean z = false;
        AbstractC10621f abstractC10621f = this;
        while (estimateSize > j && (trySplit = interfaceC10321P.trySplit()) != null) {
            AbstractC10621f mo605d = abstractC10621f.mo605d(trySplit);
            abstractC10621f.f21167d = mo605d;
            AbstractC10621f mo605d2 = abstractC10621f.mo605d(interfaceC10321P);
            abstractC10621f.f21168e = mo605d2;
            abstractC10621f.setPendingCount(1);
            if (z) {
                interfaceC10321P = trySplit;
                abstractC10621f = mo605d;
                mo605d = mo605d2;
            } else {
                abstractC10621f = mo605d2;
            }
            z = !z;
            mo605d.fork();
            estimateSize = interfaceC10321P.estimateSize();
        }
        abstractC10621f.mo694e(abstractC10621f.mo606a());
        abstractC10621f.tryComplete();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract AbstractC10621f mo605d(InterfaceC10321P interfaceC10321P);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public void mo694e(Object obj) {
        this.f21169f = obj;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    public Object getRawResult() {
        return this.f21169f;
    }

    @Override // java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        this.f21165b = null;
        this.f21168e = null;
        this.f21167d = null;
    }

    @Override // java.util.concurrent.CountedCompleter, java.util.concurrent.ForkJoinTask
    protected final void setRawResult(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }
}
