package p060j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import p060j$.util.function.C10377D;
import p060j$.util.function.C10398N0;
import p060j$.util.function.C10417a;
import p060j$.util.function.C10425e;

/* renamed from: j$.util.stream.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10651l implements Collector {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10656m f21201a;

    private /* synthetic */ C10651l(InterfaceC10656m interfaceC10656m) {
        this.f21201a = interfaceC10656m;
    }

    /* renamed from: a */
    public static /* synthetic */ Collector m660a(InterfaceC10656m interfaceC10656m) {
        if (interfaceC10656m == null) {
            return null;
        }
        return interfaceC10656m instanceof C10646k ? ((C10646k) interfaceC10656m).f21195a : new C10651l(interfaceC10656m);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BiConsumer accumulator() {
        return C10417a.m892a(((C10646k) this.f21201a).m675a());
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Set characteristics() {
        return ((C10646k) this.f21201a).m674b();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ BinaryOperator combiner() {
        return C10425e.m887a(((C10646k) this.f21201a).m673c());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC10656m interfaceC10656m = this.f21201a;
        if (obj instanceof C10651l) {
            obj = ((C10651l) obj).f21201a;
        }
        return interfaceC10656m.equals(obj);
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Function finisher() {
        return C10377D.m928a(((C10646k) this.f21201a).m671e());
    }

    public final /* synthetic */ int hashCode() {
        return this.f21201a.hashCode();
    }

    @Override // java.util.stream.Collector
    public final /* synthetic */ Supplier supplier() {
        return C10398N0.m916a(((C10646k) this.f21201a).m670f());
    }
}
