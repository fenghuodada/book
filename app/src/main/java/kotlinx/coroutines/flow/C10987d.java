package kotlinx.coroutines.flow;

/* renamed from: kotlinx.coroutines.flow.d */
/* loaded from: classes3.dex */
public final class C10987d {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m307a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.InterfaceC10985b<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.C10991g
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.g r0 = (kotlinx.coroutines.flow.C10991g) r0
            int r1 = r0.f21568d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21568d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.g r0 = new kotlinx.coroutines.flow.g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f21567c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f21568d
            kotlinx.coroutines.internal.f0 r3 = kotlinx.coroutines.flow.internal.C10999f.f21577a
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            kotlinx.coroutines.flow.f r5 = r0.f21566b
            kotlin.jvm.internal.x r0 = r0.f21565a
            kotlin.C10864l.m418b(r6)     // Catch: kotlinx.coroutines.flow.internal.C10994a -> L2d
            goto L5d
        L2d:
            r6 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.C10864l.m418b(r6)
            kotlin.jvm.internal.x r6 = new kotlin.jvm.internal.x
            r6.<init>()
            r6.f21410a = r3
            kotlinx.coroutines.flow.f r2 = new kotlinx.coroutines.flow.f
            r2.<init>(r6)
            r0.f21565a = r6     // Catch: kotlinx.coroutines.flow.internal.C10994a -> L55
            r0.f21566b = r2     // Catch: kotlinx.coroutines.flow.internal.C10994a -> L55
            r0.f21568d = r4     // Catch: kotlinx.coroutines.flow.internal.C10994a -> L55
            java.lang.Object r5 = r5.mo304a(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.C10994a -> L55
            if (r5 != r1) goto L53
            goto L61
        L53:
            r0 = r6
            goto L5d
        L55:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L59:
            kotlinx.coroutines.flow.c<?> r1 = r6.f21570a
            if (r1 != r5) goto L6a
        L5d:
            T r1 = r0.f21410a
            if (r1 == r3) goto L62
        L61:
            return r1
        L62:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C10987d.m307a(kotlinx.coroutines.flow.b, kotlin.coroutines.d):java.lang.Object");
    }
}
