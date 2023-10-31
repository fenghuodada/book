package p060j$.util.function;

import java.util.function.BiConsumer;
import p060j$.util.function.BiConsumer;

/* renamed from: j$.util.function.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C10417a implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f20896a;

    private /* synthetic */ C10417a(BiConsumer biConsumer) {
        this.f20896a = biConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ BiConsumer m892a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).f20856a : new C10417a(biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.f20896a.accept(obj, obj2);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return m892a(this.f20896a.mo692c(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiConsumer biConsumer = this.f20896a;
        if (obj instanceof C10417a) {
            obj = ((C10417a) obj).f20896a;
        }
        return biConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f20896a.hashCode();
    }
}
