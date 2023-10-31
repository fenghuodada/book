package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* renamed from: kotlinx.coroutines.c */
/* loaded from: classes3.dex */
public final class C10951c<T> extends AbstractC10936a<T> {
    @NotNull

    /* renamed from: d */
    public final Thread f21502d;
    @Nullable

    /* renamed from: e */
    public final AbstractC11138t0 f21503e;

    public C10951c(@NotNull InterfaceC10775f interfaceC10775f, @NotNull Thread thread, @Nullable AbstractC11138t0 abstractC11138t0) {
        super(interfaceC10775f, true);
        this.f21502d = thread;
        this.f21503e = abstractC11138t0;
    }

    @Override // kotlinx.coroutines.C11084n1
    /* renamed from: t */
    public final void mo184t(@Nullable Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f21502d;
        if (C10843j.m435a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
