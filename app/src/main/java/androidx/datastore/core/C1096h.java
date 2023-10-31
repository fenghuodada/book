package androidx.datastore.core;

import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.datastore.core.h */
/* loaded from: classes.dex */
public final class C1096h<T> {
    @NotNull

    /* renamed from: a */
    public static final C1097a f2815a = new C1097a();

    /* renamed from: androidx.datastore.core.h$a */
    /* loaded from: classes.dex */
    public static final class C1097a {
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:23:0x0069). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x008a -> B:23:0x0069). Please submit an issue!!! */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object m11199a(androidx.datastore.core.C1096h.C1097a r5, java.util.List r6, androidx.datastore.core.InterfaceC1101k r7, kotlin.coroutines.InterfaceC10772d r8) {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof androidx.datastore.core.C1093f
                if (r0 == 0) goto L16
                r0 = r8
                androidx.datastore.core.f r0 = (androidx.datastore.core.C1093f) r0
                int r1 = r0.f2805e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f2805e = r1
                goto L1b
            L16:
                androidx.datastore.core.f r0 = new androidx.datastore.core.f
                r0.<init>(r5, r8)
            L1b:
                java.lang.Object r5 = r0.f2803c
                kotlin.coroutines.intrinsics.a r8 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
                int r1 = r0.f2805e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L43
                if (r1 == r3) goto L3b
                if (r1 != r2) goto L33
                java.util.Iterator r6 = r0.f2802b
                java.io.Serializable r7 = r0.f2801a
                kotlin.jvm.internal.x r7 = (kotlin.jvm.internal.C10859x) r7
                kotlin.C10864l.m418b(r5)     // Catch: java.lang.Throwable -> L82
                goto L69
            L33:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3b:
                java.io.Serializable r6 = r0.f2801a
                java.util.List r6 = (java.util.List) r6
                kotlin.C10864l.m418b(r5)
                goto L5d
            L43:
                kotlin.C10864l.m418b(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                androidx.datastore.core.g r1 = new androidx.datastore.core.g
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.f2801a = r5
                r0.f2805e = r3
                java.lang.Object r6 = r7.mo11187a(r1, r0)
                if (r6 != r8) goto L5c
                goto L98
            L5c:
                r6 = r5
            L5d:
                kotlin.jvm.internal.x r5 = new kotlin.jvm.internal.x
                r5.<init>()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L69:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L90
                java.lang.Object r5 = r6.next()
                kotlin.jvm.functions.l r5 = (kotlin.jvm.functions.InterfaceC10820l) r5
                r0.f2801a = r7     // Catch: java.lang.Throwable -> L82
                r0.f2802b = r6     // Catch: java.lang.Throwable -> L82
                r0.f2805e = r2     // Catch: java.lang.Throwable -> L82
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L82
                if (r5 != r8) goto L69
                goto L98
            L82:
                r5 = move-exception
                T r1 = r7.f21410a
                if (r1 != 0) goto L8a
                r7.f21410a = r5
                goto L69
            L8a:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                kotlin.C10738b.m502a(r1, r5)
                goto L69
            L90:
                T r5 = r7.f21410a
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L99
                kotlin.p r8 = kotlin.C10868p.f21418a
            L98:
                return r8
            L99:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1096h.C1097a.m11199a(androidx.datastore.core.h$a, java.util.List, androidx.datastore.core.k, kotlin.coroutines.d):java.lang.Object");
        }
    }
}
