package p060j$.util.stream;

import java.util.Comparator;
import p060j$.util.AbstractC10331a;
import p060j$.util.InterfaceC10321P;
import p060j$.util.function.InterfaceC10400O0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Z2 */
/* loaded from: classes2.dex */
public abstract class AbstractC10595Z2 implements InterfaceC10321P {

    /* renamed from: a */
    final boolean f21121a;

    /* renamed from: b */
    final AbstractC10707w0 f21122b;

    /* renamed from: c */
    private InterfaceC10400O0 f21123c;

    /* renamed from: d */
    InterfaceC10321P f21124d;

    /* renamed from: e */
    InterfaceC10634h2 f21125e;

    /* renamed from: f */
    C10596a f21126f;

    /* renamed from: g */
    long f21127g;

    /* renamed from: h */
    AbstractC10616e f21128h;

    /* renamed from: i */
    boolean f21129i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10595Z2(AbstractC10707w0 abstractC10707w0, InterfaceC10321P interfaceC10321P, boolean z) {
        this.f21122b = abstractC10707w0;
        this.f21123c = null;
        this.f21124d = interfaceC10321P;
        this.f21121a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10595Z2(AbstractC10707w0 abstractC10707w0, C10596a c10596a, boolean z) {
        this.f21122b = abstractC10707w0;
        this.f21123c = c10596a;
        this.f21124d = null;
        this.f21121a = z;
    }

    /* renamed from: g */
    private boolean m731g() {
        boolean mo534a;
        while (this.f21128h.count() == 0) {
            if (!this.f21125e.mo530i()) {
                C10596a c10596a = this.f21126f;
                int i = c10596a.f21130a;
                Object obj = c10596a.f21131b;
                switch (i) {
                    case 4:
                        C10640i3 c10640i3 = (C10640i3) obj;
                        mo534a = c10640i3.f21124d.mo534a(c10640i3.f21125e);
                        break;
                    case 5:
                        C10650k3 c10650k3 = (C10650k3) obj;
                        mo534a = c10650k3.f21124d.mo534a(c10650k3.f21125e);
                        break;
                    case 6:
                        C10660m3 c10660m3 = (C10660m3) obj;
                        mo534a = c10660m3.f21124d.mo534a(c10660m3.f21125e);
                        break;
                    default:
                        C10507E3 c10507e3 = (C10507E3) obj;
                        mo534a = c10507e3.f21124d.mo534a(c10507e3.f21125e);
                        break;
                }
                if (mo534a) {
                    continue;
                }
            }
            if (this.f21129i) {
                return false;
            }
            this.f21125e.end();
            this.f21129i = true;
        }
        return true;
    }

    @Override // p060j$.util.InterfaceC10321P
    public final int characteristics() {
        m730h();
        int m756g = EnumC10587X2.m756g(this.f21122b.mo564i1()) & EnumC10587X2.f21097f;
        return (m756g & 64) != 0 ? (m756g & (-16449)) | (this.f21124d.characteristics() & 16448) : m756g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m732e() {
        AbstractC10616e abstractC10616e = this.f21128h;
        if (abstractC10616e == null) {
            if (this.f21129i) {
                return false;
            }
            m730h();
            mo649i();
            this.f21127g = 0L;
            this.f21125e.mo531g(this.f21124d.getExactSizeIfKnown());
            return m731g();
        }
        long j = this.f21127g + 1;
        this.f21127g = j;
        boolean z = j < abstractC10616e.count();
        if (z) {
            return z;
        }
        this.f21127g = 0L;
        this.f21128h.clear();
        return m731g();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long estimateSize() {
        m730h();
        return this.f21124d.estimateSize();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final Comparator getComparator() {
        if (AbstractC10331a.m1012j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p060j$.util.InterfaceC10321P
    public final long getExactSizeIfKnown() {
        m730h();
        if (EnumC10587X2.SIZED.m759d(this.f21122b.mo564i1())) {
            return this.f21124d.getExactSizeIfKnown();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m730h() {
        if (this.f21124d == null) {
            this.f21124d = (InterfaceC10321P) this.f21123c.get();
            this.f21123c = null;
        }
    }

    @Override // p060j$.util.InterfaceC10321P
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC10331a.m1012j(this, i);
    }

    /* renamed from: i */
    abstract void mo649i();

    /* renamed from: j */
    abstract AbstractC10595Z2 mo648j(InterfaceC10321P interfaceC10321P);

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f21124d);
    }

    @Override // p060j$.util.InterfaceC10321P
    public InterfaceC10321P trySplit() {
        if (!this.f21121a || this.f21129i) {
            return null;
        }
        m730h();
        InterfaceC10321P trySplit = this.f21124d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return mo648j(trySplit);
    }
}
