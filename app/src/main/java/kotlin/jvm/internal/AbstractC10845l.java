package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.InterfaceC10884b;
import kotlin.reflect.InterfaceC10888f;
import kotlin.reflect.InterfaceC10889g;
import kotlin.reflect.InterfaceC10891h;
import kotlin.reflect.InterfaceC10893i;

/* renamed from: kotlin.jvm.internal.l */
/* loaded from: classes3.dex */
public abstract class AbstractC10845l extends AbstractC10849n implements InterfaceC10889g {
    public AbstractC10845l() {
    }

    @SinceKotlin(version = "1.1")
    public AbstractC10845l(Object obj) {
        super(obj);
    }

    @SinceKotlin(version = "1.4")
    public AbstractC10845l(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.jvm.internal.AbstractC10834b
    public InterfaceC10884b computeReflected() {
        C10860y.f21411a.getClass();
        return this;
    }

    @Override // kotlin.reflect.InterfaceC10893i
    @SinceKotlin(version = "1.1")
    public Object getDelegate() {
        return ((InterfaceC10889g) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ InterfaceC10891h.InterfaceC10892a getGetter() {
        mo13091getGetter();
        return null;
    }

    @Override // kotlin.reflect.InterfaceC10893i
    /* renamed from: getGetter  reason: collision with other method in class */
    public InterfaceC10893i.InterfaceC10894a mo13091getGetter() {
        ((InterfaceC10889g) getReflected()).mo13091getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC10888f getSetter() {
        mo13092getSetter();
        return null;
    }

    @Override // kotlin.reflect.InterfaceC10889g
    /* renamed from: getSetter  reason: collision with other method in class */
    public InterfaceC10889g.InterfaceC10890a mo13092getSetter() {
        ((InterfaceC10889g) getReflected()).mo13092getSetter();
        return null;
    }

    @Override // kotlin.jvm.functions.InterfaceC10809a
    public Object invoke() {
        return get();
    }
}
