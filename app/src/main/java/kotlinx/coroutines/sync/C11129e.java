package kotlinx.coroutines.sync;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;

/* renamed from: kotlinx.coroutines.sync.e */
/* loaded from: classes3.dex */
public final class C11129e extends AbstractC10844k implements InterfaceC10820l<Throwable, C10868p> {

    /* renamed from: a */
    public final /* synthetic */ C11126d f21775a;

    /* renamed from: b */
    public final /* synthetic */ Object f21776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11129e(C11126d c11126d, Object obj) {
        super(1);
        this.f21775a = c11126d;
        this.f21776b = obj;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final C10868p invoke(Throwable th) {
        this.f21775a.mo139b(this.f21776b);
        return C10868p.f21418a;
    }
}
