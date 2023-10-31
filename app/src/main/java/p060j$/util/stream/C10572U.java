package p060j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p060j$.util.InterfaceC10321P;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.util.stream.U */
/* loaded from: classes2.dex */
final class C10572U extends CountedCompleter {

    /* renamed from: h */
    public static final /* synthetic */ int f21076h = 0;

    /* renamed from: a */
    private final AbstractC10707w0 f21077a;

    /* renamed from: b */
    private InterfaceC10321P f21078b;

    /* renamed from: c */
    private final long f21079c;

    /* renamed from: d */
    private final ConcurrentHashMap f21080d;

    /* renamed from: e */
    private final InterfaceC10634h2 f21081e;

    /* renamed from: f */
    private final C10572U f21082f;

    /* renamed from: g */
    private InterfaceC10509F0 f21083g;

    C10572U(C10572U c10572u, InterfaceC10321P interfaceC10321P, C10572U c10572u2) {
        super(c10572u);
        this.f21077a = c10572u.f21077a;
        this.f21078b = interfaceC10321P;
        this.f21079c = c10572u.f21079c;
        this.f21080d = c10572u.f21080d;
        this.f21081e = c10572u.f21081e;
        this.f21082f = c10572u2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C10572U(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, InterfaceC10634h2 interfaceC10634h2) {
        super(null);
        this.f21077a = abstractC10707w0;
        this.f21078b = interfaceC10321P;
        this.f21079c = AbstractC10621f.m693f(interfaceC10321P.estimateSize());
        this.f21080d = new ConcurrentHashMap(Math.max(16, AbstractC10621f.f21163g << 1));
        this.f21081e = interfaceC10634h2;
        this.f21082f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        InterfaceC10321P trySplit;
        InterfaceC10321P interfaceC10321P = this.f21078b;
        long j = this.f21079c;
        boolean z = false;
        C10572U c10572u = this;
        while (interfaceC10321P.estimateSize() > j && (trySplit = interfaceC10321P.trySplit()) != null) {
            C10572U c10572u2 = new C10572U(c10572u, trySplit, c10572u.f21082f);
            C10572U c10572u3 = new C10572U(c10572u, interfaceC10321P, c10572u2);
            c10572u.addToPendingCount(1);
            c10572u3.addToPendingCount(1);
            c10572u.f21080d.put(c10572u2, c10572u3);
            if (c10572u.f21082f != null) {
                c10572u2.addToPendingCount(1);
                if (c10572u.f21080d.replace(c10572u.f21082f, c10572u, c10572u2)) {
                    c10572u.addToPendingCount(-1);
                } else {
                    c10572u2.addToPendingCount(-1);
                }
            }
            if (z) {
                interfaceC10321P = trySplit;
                c10572u = c10572u2;
                c10572u2 = c10572u3;
            } else {
                c10572u = c10572u3;
            }
            z = !z;
            c10572u2.fork();
        }
        if (c10572u.getPendingCount() > 0) {
            C10601b c10601b = new C10601b(14);
            AbstractC10707w0 abstractC10707w0 = c10572u.f21077a;
            InterfaceC10484A0 mo549t1 = abstractC10707w0.mo549t1(abstractC10707w0.mo570c1(interfaceC10321P), c10601b);
            c10572u.f21077a.mo540y1(interfaceC10321P, mo549t1);
            c10572u.f21083g = mo549t1.build();
            c10572u.f21078b = null;
        }
        c10572u.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC10509F0 interfaceC10509F0 = this.f21083g;
        if (interfaceC10509F0 != null) {
            interfaceC10509F0.mo621a(this.f21081e);
            this.f21083g = null;
        } else {
            InterfaceC10321P interfaceC10321P = this.f21078b;
            if (interfaceC10321P != null) {
                this.f21077a.mo540y1(interfaceC10321P, this.f21081e);
                this.f21078b = null;
            }
        }
        C10572U c10572u = (C10572U) this.f21080d.remove(this);
        if (c10572u != null) {
            c10572u.tryComplete();
        }
    }
}
