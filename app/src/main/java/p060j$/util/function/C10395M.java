package p060j$.util.function;

import java.util.function.IntFunction;

/* renamed from: j$.util.function.M */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10395M implements IntFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10397N f20877a;

    private /* synthetic */ C10395M(InterfaceC10397N interfaceC10397N) {
        this.f20877a = interfaceC10397N;
    }

    /* renamed from: a */
    public static /* synthetic */ IntFunction m918a(InterfaceC10397N interfaceC10397N) {
        if (interfaceC10397N == null) {
            return null;
        }
        return interfaceC10397N instanceof C10393L ? ((C10393L) interfaceC10397N).f20876a : new C10395M(interfaceC10397N);
    }

    @Override // java.util.function.IntFunction
    public final /* synthetic */ Object apply(int i) {
        return this.f20877a.apply(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10397N interfaceC10397N = this.f20877a;
        if (obj instanceof C10395M) {
            obj = ((C10395M) obj).f20877a;
        }
        return interfaceC10397N.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20877a.hashCode();
    }
}
