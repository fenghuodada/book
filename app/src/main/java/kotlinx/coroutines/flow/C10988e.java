package kotlinx.coroutines.flow;

import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10856u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.flow.e */
/* loaded from: classes3.dex */
public final class C10988e<T> implements InterfaceC10986c {

    /* renamed from: a */
    public final /* synthetic */ C10856u f21556a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC10986c<T> f21557b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC10824p<T, InterfaceC10772d<? super Boolean>, Object> f21558c;

    @DebugMetadata(m454c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m453f = "Limit.kt", m452i = {1, 1}, m451l = {37, 38, 40}, m450m = "emit", m449n = {"this", "value"}, m448s = {"L$0", "L$1"})
    /* renamed from: kotlinx.coroutines.flow.e$a */
    /* loaded from: classes3.dex */
    public static final class C10989a extends AbstractC10786c {

        /* renamed from: a */
        public C10988e f21559a;

        /* renamed from: b */
        public Object f21560b;

        /* renamed from: c */
        public /* synthetic */ Object f21561c;

        /* renamed from: d */
        public final /* synthetic */ C10988e<T> f21562d;

        /* renamed from: e */
        public int f21563e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C10989a(C10988e<? super T> c10988e, InterfaceC10772d<? super C10989a> interfaceC10772d) {
            super(interfaceC10772d);
            this.f21562d = c10988e;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f21561c = obj;
            this.f21563e |= Integer.MIN_VALUE;
            return this.f21562d.mo299b(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10988e(C10856u c10856u, InterfaceC10986c<? super T> interfaceC10986c, InterfaceC10824p<? super T, ? super InterfaceC10772d<? super Boolean>, ? extends Object> interfaceC10824p) {
        this.f21556a = c10856u;
        this.f21557b = interfaceC10986c;
        this.f21558c = interfaceC10824p;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // kotlinx.coroutines.flow.InterfaceC10986c
    @org.jetbrains.annotations.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo299b(T r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<? super kotlin.C10868p> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.C10988e.C10989a
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.e$a r0 = (kotlinx.coroutines.flow.C10988e.C10989a) r0
            int r1 = r0.f21563e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21563e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.e$a r0 = new kotlinx.coroutines.flow.e$a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f21561c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f21563e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.C10864l.m418b(r8)
            goto L84
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f21560b
            kotlinx.coroutines.flow.e r2 = r0.f21559a
            kotlin.C10864l.m418b(r8)
            goto L68
        L3d:
            kotlin.C10864l.m418b(r8)
            goto L55
        L41:
            kotlin.C10864l.m418b(r8)
            kotlin.jvm.internal.u r8 = r6.f21556a
            boolean r8 = r8.f21407a
            if (r8 == 0) goto L58
            r0.f21563e = r5
            kotlinx.coroutines.flow.c<T> r8 = r6.f21557b
            java.lang.Object r7 = r8.mo299b(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            kotlin.p r7 = kotlin.C10868p.f21418a
            return r7
        L58:
            r0.f21559a = r6
            r0.f21560b = r7
            r0.f21563e = r4
            kotlin.jvm.functions.p<T, kotlin.coroutines.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f21558c
            java.lang.Object r8 = r8.invoke(r7, r0)
            if (r8 != r1) goto L67
            return r1
        L67:
            r2 = r6
        L68:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L87
            kotlin.jvm.internal.u r8 = r2.f21556a
            r8.f21407a = r5
            r8 = 0
            r0.f21559a = r8
            r0.f21560b = r8
            r0.f21563e = r3
            kotlinx.coroutines.flow.c<T> r8 = r2.f21557b
            java.lang.Object r7 = r8.mo299b(r7, r0)
            if (r7 != r1) goto L84
            return r1
        L84:
            kotlin.p r7 = kotlin.C10868p.f21418a
            return r7
        L87:
            kotlin.p r7 = kotlin.C10868p.f21418a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10988e.mo299b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
