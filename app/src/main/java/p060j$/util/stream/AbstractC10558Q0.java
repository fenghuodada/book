package p060j$.util.stream;

import p060j$.util.function.InterfaceC10397N;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.Q0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10558Q0 extends AbstractC10519H0 implements InterfaceC10504E0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC10558Q0(InterfaceC10504E0 interfaceC10504E0, InterfaceC10504E0 interfaceC10504E02) {
        super(interfaceC10504E0, interfaceC10504E02);
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: c */
    public final Object mo655c() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo654d(newArray, 0);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: d */
    public final void mo654d(Object obj, int i) {
        InterfaceC10509F0 interfaceC10509F0 = this.f21002a;
        ((InterfaceC10504E0) interfaceC10509F0).mo654d(obj, i);
        ((InterfaceC10504E0) this.f21003b).mo654d(obj, i + ((int) ((InterfaceC10504E0) interfaceC10509F0).count()));
    }

    @Override // p060j$.util.stream.InterfaceC10504E0
    /* renamed from: f */
    public final void mo653f(Object obj) {
        ((InterfaceC10504E0) this.f21002a).mo653f(obj);
        ((InterfaceC10504E0) this.f21003b).mo653f(obj);
    }

    @Override // p060j$.util.stream.InterfaceC10509F0
    /* renamed from: r */
    public final /* synthetic */ Object[] mo617r(InterfaceC10397N interfaceC10397N) {
        return AbstractC10707w0.m599A0(this, interfaceC10397N);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f21002a, this.f21003b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
