package kotlinx.coroutines.internal;

import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;

/* renamed from: kotlinx.coroutines.internal.w */
/* loaded from: classes3.dex */
public final class C11065w extends AbstractC10844k implements InterfaceC10820l<Throwable, C10868p> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10820l<Object, C10868p> f21675a;

    /* renamed from: b */
    public final /* synthetic */ Object f21676b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10775f f21677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11065w(InterfaceC10820l<Object, C10868p> interfaceC10820l, Object obj, InterfaceC10775f interfaceC10775f) {
        super(1);
        this.f21675a = interfaceC10820l;
        this.f21676b = obj;
        this.f21677c = interfaceC10775f;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final C10868p invoke(Throwable th) {
        C11066x.m230a(this.f21675a, this.f21676b, this.f21677c);
        return C10868p.f21418a;
    }
}
