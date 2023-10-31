package kotlinx.coroutines.channels;

import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlinx.coroutines.internal.C11034f0;
import kotlinx.coroutines.internal.C11066x;
import kotlinx.coroutines.selects.InterfaceC11121b;

/* renamed from: kotlinx.coroutines.channels.b */
/* loaded from: classes3.dex */
public final class C10960b extends AbstractC10844k implements InterfaceC10820l<Throwable, C10868p> {

    /* renamed from: a */
    public final /* synthetic */ Object f21518a;

    /* renamed from: b */
    public final /* synthetic */ C10956a<Object> f21519b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC11121b<?> f21520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10960b(Object obj, C10956a<Object> c10956a, InterfaceC11121b<?> interfaceC11121b) {
        super(1);
        this.f21518a = obj;
        this.f21519b = c10956a;
        this.f21520c = interfaceC11121b;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final C10868p invoke(Throwable th) {
        C11034f0 c11034f0 = C10962d.f21533l;
        Object obj = this.f21518a;
        if (obj != c11034f0) {
            C11066x.m230a(this.f21519b.f21516b, obj, this.f21520c.getContext());
        }
        return C10868p.f21418a;
    }
}
