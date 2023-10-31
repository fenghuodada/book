package kotlinx.coroutines.flow;

import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,426:1\n329#2:427\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n417#1:427\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.n */
/* loaded from: classes3.dex */
public final class C11010n<T> implements InterfaceC10986c<T> {
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.flow.internal.g, int] */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.C10868p m300a(@org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.C11009m
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.m r0 = (kotlinx.coroutines.flow.C11009m) r0
            int r1 = r0.f21604e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21604e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.m r0 = new kotlinx.coroutines.flow.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f21602c
            int r1 = r0.f21604e
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L32
            r0 = 2
            if (r1 != r0) goto L2a
            kotlin.C10864l.m418b(r5)
        L27:
            kotlin.p r5 = kotlin.C10868p.f21418a
            return r5
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlinx.coroutines.flow.internal.g r1 = r0.f21601b
            kotlinx.coroutines.flow.n r0 = r0.f21600a
            kotlin.C10864l.m418b(r5)     // Catch: java.lang.Throwable -> L54
            r1.releaseIntercepted()
            r0.getClass()
            goto L27
        L40:
            kotlin.C10864l.m418b(r5)
            kotlinx.coroutines.flow.internal.g r1 = new kotlinx.coroutines.flow.internal.g
            kotlin.coroutines.f r5 = r0.getContext()
            r3 = 0
            r1.<init>(r3, r5)
            r0.f21600a = r4     // Catch: java.lang.Throwable -> L54
            r0.f21601b = r1     // Catch: java.lang.Throwable -> L54
            r0.f21604e = r2     // Catch: java.lang.Throwable -> L54
            throw r3     // Catch: java.lang.Throwable -> L54
        L54:
            r5 = move-exception
            r1.releaseIntercepted()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C11010n.m300a(kotlin.coroutines.d):kotlin.p");
    }

    @Override // kotlinx.coroutines.flow.InterfaceC10986c
    @Nullable
    /* renamed from: b */
    public final Object mo299b(T t, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d) {
        throw null;
    }
}
