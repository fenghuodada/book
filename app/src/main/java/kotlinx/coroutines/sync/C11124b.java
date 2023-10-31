package kotlinx.coroutines.sync;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlinx.coroutines.sync.C11126d;

/* renamed from: kotlinx.coroutines.sync.b */
/* loaded from: classes3.dex */
public final class C11124b extends AbstractC10844k implements InterfaceC10820l<Throwable, C10868p> {

    /* renamed from: a */
    public final /* synthetic */ C11126d f21766a;

    /* renamed from: b */
    public final /* synthetic */ C11126d.C11127a f21767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11124b(C11126d c11126d, C11126d.C11127a c11127a) {
        super(1);
        this.f21766a = c11126d;
        this.f21767b = c11127a;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final C10868p invoke(Throwable th) {
        this.f21766a.mo139b(this.f21767b.f21772b);
        return C10868p.f21418a;
    }
}
