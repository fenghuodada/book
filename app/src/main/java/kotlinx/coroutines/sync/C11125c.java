package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10868p;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.sync.C11126d;

@SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner$tryResume$token$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,300:1\n1#2:301\n*E\n"})
/* renamed from: kotlinx.coroutines.sync.c */
/* loaded from: classes3.dex */
public final class C11125c extends AbstractC10844k implements InterfaceC10820l<Throwable, C10868p> {

    /* renamed from: a */
    public final /* synthetic */ C11126d f21768a;

    /* renamed from: b */
    public final /* synthetic */ C11126d.C11127a f21769b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11125c(C11126d c11126d, C11126d.C11127a c11127a) {
        super(1);
        this.f21768a = c11126d;
        this.f21769b = c11127a;
    }

    @Override // kotlin.jvm.functions.InterfaceC10820l
    public final C10868p invoke(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C11126d.f21770h;
        C11126d.C11127a c11127a = this.f21769b;
        Object obj = c11127a.f21772b;
        C11126d c11126d = this.f21768a;
        atomicReferenceFieldUpdater.set(c11126d, obj);
        c11126d.mo139b(c11127a.f21772b);
        return C10868p.f21418a;
    }
}
