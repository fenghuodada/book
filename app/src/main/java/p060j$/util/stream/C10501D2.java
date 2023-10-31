package p060j$.util.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import p060j$.util.AbstractC10331a;

/* renamed from: j$.util.stream.D2 */
/* loaded from: classes2.dex */
final class C10501D2 extends AbstractC10704v2 {

    /* renamed from: d */
    private ArrayList f20974d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10501D2(InterfaceC10634h2 interfaceC10634h2, Comparator comparator) {
        super(interfaceC10634h2, comparator);
    }

    @Override // p060j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f20974d.add(obj);
    }

    @Override // p060j$.util.stream.AbstractC10614d2, p060j$.util.stream.InterfaceC10634h2
    public final void end() {
        AbstractC10331a.m1019E(this.f20974d, this.f21279b);
        InterfaceC10634h2 interfaceC10634h2 = this.f21154a;
        interfaceC10634h2.mo531g(this.f20974d.size());
        if (this.f21280c) {
            Iterator it = this.f20974d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC10634h2.mo530i()) {
                    break;
                }
                interfaceC10634h2.accept(next);
            }
        } else {
            ArrayList arrayList = this.f20974d;
            interfaceC10634h2.getClass();
            AbstractC10331a.m1002v(arrayList, new C10596a(interfaceC10634h2, 3));
        }
        interfaceC10634h2.end();
        this.f20974d = null;
    }

    @Override // p060j$.util.stream.InterfaceC10634h2
    /* renamed from: g */
    public final void mo531g(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f20974d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
