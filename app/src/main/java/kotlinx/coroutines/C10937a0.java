package kotlinx.coroutines;

import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;

/* renamed from: kotlinx.coroutines.a0 */
/* loaded from: classes3.dex */
public final class C10937a0 extends AbstractC10844k implements InterfaceC10824p<Boolean, InterfaceC10775f.InterfaceC10778b, Boolean> {

    /* renamed from: a */
    public static final C10937a0 f21491a = new C10937a0();

    public C10937a0() {
        super(2);
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final Boolean invoke(Boolean bool, InterfaceC10775f.InterfaceC10778b interfaceC10778b) {
        boolean z;
        InterfaceC10775f.InterfaceC10778b interfaceC10778b2 = interfaceC10778b;
        if (!bool.booleanValue() && !(interfaceC10778b2 instanceof InterfaceC11157y)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
