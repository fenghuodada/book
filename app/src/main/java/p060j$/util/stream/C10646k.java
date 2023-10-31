package p060j$.util.stream;

import java.util.Set;
import java.util.stream.Collector;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.C10396M0;
import p060j$.util.function.C10423d;
import p060j$.util.function.Function;
import p060j$.util.function.InterfaceC10400O0;
import p060j$.util.function.InterfaceC10427f;

/* renamed from: j$.util.stream.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10646k implements InterfaceC10656m {

    /* renamed from: a */
    public final /* synthetic */ Collector f21195a;

    private /* synthetic */ C10646k(Collector collector) {
        this.f21195a = collector;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC10656m m672d(Collector collector) {
        if (collector == null) {
            return null;
        }
        return collector instanceof C10651l ? ((C10651l) collector).f21201a : new C10646k(collector);
    }

    /* renamed from: a */
    public final /* synthetic */ BiConsumer m675a() {
        return BiConsumer.VivifiedWrapper.convert(this.f21195a.accumulator());
    }

    /* renamed from: b */
    public final /* synthetic */ Set m674b() {
        return this.f21195a.characteristics();
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10427f m673c() {
        return C10423d.m888b(this.f21195a.combiner());
    }

    /* renamed from: e */
    public final /* synthetic */ Function m671e() {
        return Function.VivifiedWrapper.convert(this.f21195a.finisher());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C10646k) {
            obj = ((C10646k) obj).f21195a;
        }
        return this.f21195a.equals(obj);
    }

    /* renamed from: f */
    public final /* synthetic */ InterfaceC10400O0 m670f() {
        return C10396M0.m917a(this.f21195a.supplier());
    }

    public final /* synthetic */ int hashCode() {
        return this.f21195a.hashCode();
    }
}
