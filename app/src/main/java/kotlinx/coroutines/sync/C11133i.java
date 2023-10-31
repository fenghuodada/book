package kotlinx.coroutines.sync;

import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10842i;

/* renamed from: kotlinx.coroutines.sync.i */
/* loaded from: classes3.dex */
public final /* synthetic */ class C11133i extends C10842i implements InterfaceC10824p<Long, C11136l, C11136l> {

    /* renamed from: a */
    public static final C11133i f21780a = new C11133i();

    public C11133i() {
        super(2, C11135k.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final C11136l invoke(Long l, C11136l c11136l) {
        int i = C11135k.f21788a;
        return new C11136l(l.longValue(), c11136l, 0);
    }
}
