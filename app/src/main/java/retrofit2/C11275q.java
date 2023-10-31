package retrofit2;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;

/* renamed from: retrofit2.q */
/* loaded from: classes3.dex */
public final class C11275q extends AbstractC10844k implements InterfaceC10820l<Throwable, C10868p> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC11230b f22045a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11275q(InterfaceC11230b interfaceC11230b) {
        super(1);
        this.f22045a = interfaceC11230b;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final C10868p invoke(Throwable th) {
        this.f22045a.cancel();
        return C10868p.f21418a;
    }
}
