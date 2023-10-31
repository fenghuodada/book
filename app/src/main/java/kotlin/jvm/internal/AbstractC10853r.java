package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.InterfaceC10884b;
import kotlin.reflect.InterfaceC10895j;

/* renamed from: kotlin.jvm.internal.r */
/* loaded from: classes3.dex */
public abstract class AbstractC10853r extends AbstractC10855t implements InterfaceC10895j {
    @SinceKotlin(version = "1.4")
    public AbstractC10853r(Class cls) {
        super(AbstractC10834b.NO_RECEIVER, cls, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }

    @Override // kotlin.jvm.internal.AbstractC10834b
    public final InterfaceC10884b computeReflected() {
        C10860y.f21411a.getClass();
        return this;
    }

    @Override // kotlin.reflect.InterfaceC10895j
    public final void getGetter() {
        ((InterfaceC10895j) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final Object invoke(Object obj, Object obj2) {
        ((C10854s) this).getGetter();
        throw null;
    }
}
