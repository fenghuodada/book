package p060j$.util.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import p060j$.util.function.Function;

/* renamed from: j$.util.function.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10425e implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10427f f20903a;

    private /* synthetic */ C10425e(InterfaceC10427f interfaceC10427f) {
        this.f20903a = interfaceC10427f;
    }

    /* renamed from: a */
    public static /* synthetic */ BinaryOperator m887a(InterfaceC10427f interfaceC10427f) {
        if (interfaceC10427f == null) {
            return null;
        }
        return interfaceC10427f instanceof C10423d ? ((C10423d) interfaceC10427f).f20902a : new C10425e(interfaceC10427f);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return C10419b.m891a(this.f20903a.mo622a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f20903a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10427f interfaceC10427f = this.f20903a;
        if (obj instanceof C10425e) {
            obj = ((C10425e) obj).f20903a;
        }
        return interfaceC10427f.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20903a.hashCode();
    }
}
