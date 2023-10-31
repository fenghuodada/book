package kotlinx.coroutines.sync;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;

/* renamed from: kotlinx.coroutines.sync.h */
/* loaded from: classes3.dex */
public final class C11132h extends AbstractC10844k implements InterfaceC10820l<Throwable, C10868p> {

    /* renamed from: a */
    public final /* synthetic */ C11134j f21779a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11132h(C11134j c11134j) {
        super(1);
        this.f21779a = c11134j;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final C10868p invoke(Throwable th) {
        this.f21779a.m130e();
        return C10868p.f21418a;
    }
}
