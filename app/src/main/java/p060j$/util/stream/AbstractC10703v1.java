package p060j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.v1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10703v1 extends CountedCompleter {

    /* renamed from: a */
    protected final InterfaceC10509F0 f21277a;

    /* renamed from: b */
    protected final int f21278b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10703v1(InterfaceC10509F0 interfaceC10509F0) {
        this.f21277a = interfaceC10509F0;
        this.f21278b = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10703v1(AbstractC10703v1 abstractC10703v1, InterfaceC10509F0 interfaceC10509F0, int i) {
        super(abstractC10703v1);
        this.f21277a = interfaceC10509F0;
        this.f21278b = i;
    }

    /* renamed from: a */
    abstract void mo603a();

    /* renamed from: b */
    abstract C10698u1 mo602b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        AbstractC10703v1 abstractC10703v1 = this;
        while (abstractC10703v1.f21277a.mo618p() != 0) {
            abstractC10703v1.setPendingCount(abstractC10703v1.f21277a.mo618p() - 1);
            int i = 0;
            int i2 = 0;
            while (i < abstractC10703v1.f21277a.mo618p() - 1) {
                C10698u1 mo602b = abstractC10703v1.mo602b(i, abstractC10703v1.f21278b + i2);
                i2 = (int) (i2 + mo602b.f21277a.count());
                mo602b.fork();
                i++;
            }
            abstractC10703v1 = abstractC10703v1.mo602b(i, abstractC10703v1.f21278b + i2);
        }
        abstractC10703v1.mo603a();
        abstractC10703v1.propagateCompletion();
    }
}
