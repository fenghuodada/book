package p060j$.util.function;

import java.util.Comparator;
import p060j$.util.concurrent.C10359u;

/* renamed from: j$.util.function.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10421c implements InterfaceC10427f {

    /* renamed from: a */
    public final /* synthetic */ int f20899a;

    /* renamed from: b */
    public final /* synthetic */ Comparator f20900b;

    public /* synthetic */ C10421c(Comparator comparator, int i) {
        this.f20899a = i;
        this.f20900b = comparator;
    }

    @Override // p060j$.util.function.BiFunction
    /* renamed from: a */
    public final BiFunction mo622a(Function function) {
        switch (this.f20899a) {
            case 0:
                function.getClass();
                return new C10359u(this, function);
            default:
                function.getClass();
                return new C10359u(this, function);
        }
    }

    @Override // p060j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f20899a;
        Comparator comparator = this.f20900b;
        switch (i) {
            case 0:
                return comparator.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
