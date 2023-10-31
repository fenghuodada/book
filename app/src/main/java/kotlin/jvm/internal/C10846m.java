package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.InterfaceC10885c;
import kotlin.reflect.InterfaceC10886d;

/* renamed from: kotlin.jvm.internal.m */
/* loaded from: classes3.dex */
public class C10846m extends AbstractC10845l {
    @SinceKotlin(version = "1.4")
    public C10846m(Class cls, String str, String str2, int i) {
        super(AbstractC10834b.NO_RECEIVER, cls, str, str2, i);
    }

    @SinceKotlin(version = "1.4")
    public C10846m(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    public C10846m(InterfaceC10886d interfaceC10886d, String str, String str2) {
        super(AbstractC10834b.NO_RECEIVER, ((InterfaceC10836c) interfaceC10886d).mo423a(), str, str2, !(interfaceC10886d instanceof InterfaceC10885c) ? 1 : 0);
    }

    @Override // kotlin.reflect.InterfaceC10893i
    public Object get() {
        mo13091getGetter();
        throw null;
    }

    public void set(Object obj) {
        mo13092getSetter();
        throw null;
    }
}
