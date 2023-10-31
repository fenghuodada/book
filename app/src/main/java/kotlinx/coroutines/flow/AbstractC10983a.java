package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.internal.C11000g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalCoroutinesApi
/* renamed from: kotlinx.coroutines.flow.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10983a<T> implements InterfaceC10985b<T> {

    @DebugMetadata(m454c = "kotlinx.coroutines.flow.AbstractFlow", m453f = "Flow.kt", m452i = {0}, m451l = {230}, m450m = "collect", m449n = {"safeCollector"}, m448s = {"L$0"})
    /* renamed from: kotlinx.coroutines.flow.a$a */
    /* loaded from: classes3.dex */
    public static final class C10984a extends AbstractC10786c {

        /* renamed from: a */
        public C11000g f21552a;

        /* renamed from: b */
        public /* synthetic */ Object f21553b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC10983a<T> f21554c;

        /* renamed from: d */
        public int f21555d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10984a(AbstractC10983a<T> abstractC10983a, InterfaceC10772d<? super C10984a> interfaceC10772d) {
            super(interfaceC10772d);
            this.f21554c = abstractC10983a;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21553b = obj;
            this.f21555d |= Integer.MIN_VALUE;
            return this.f21554c.mo304a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // kotlinx.coroutines.flow.InterfaceC10985b
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo304a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.InterfaceC10986c<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.AbstractC10983a.C10984a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.a$a r0 = (kotlinx.coroutines.flow.AbstractC10983a.C10984a) r0
            int r1 = r0.f21555d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21555d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.a$a r0 = new kotlinx.coroutines.flow.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f21553b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f21555d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlinx.coroutines.flow.internal.g r6 = r0.f21552a
            kotlin.C10864l.m418b(r7)     // Catch: java.lang.Throwable -> L29
            goto L55
        L29:
            r7 = move-exception
            goto L5f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.C10864l.m418b(r7)
            kotlinx.coroutines.flow.internal.g r7 = new kotlinx.coroutines.flow.internal.g
            kotlin.coroutines.f r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f21552a = r7     // Catch: java.lang.Throwable -> L5b
            r0.f21555d = r3     // Catch: java.lang.Throwable -> L5b
            r6 = r5
            kotlinx.coroutines.flow.i r6 = (kotlinx.coroutines.flow.C10993i) r6     // Catch: java.lang.Throwable -> L5b
            kotlin.jvm.functions.p<kotlinx.coroutines.flow.c<? super T>, kotlin.coroutines.d<? super kotlin.p>, java.lang.Object> r6 = r6.f21569a     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L5b
            if (r6 != r1) goto L4f
            goto L51
        L4f:
            kotlin.p r6 = kotlin.C10868p.f21418a     // Catch: java.lang.Throwable -> L5b
        L51:
            if (r6 != r1) goto L54
            return r1
        L54:
            r6 = r7
        L55:
            r6.releaseIntercepted()
            kotlin.p r6 = kotlin.C10868p.f21418a
            return r6
        L5b:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L5f:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.AbstractC10983a.mo304a(kotlinx.coroutines.flow.c, kotlin.coroutines.d):java.lang.Object");
    }
}
