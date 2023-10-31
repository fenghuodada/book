package androidx.datastore.core;

import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC10986c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: androidx.datastore.core.v */
/* loaded from: classes.dex */
public final class C1124v implements InterfaceC10986c<AbstractC1088b0<Object>> {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC10986c f2894a;

    @DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", m453f = "SingleProcessDataStore.kt", m452i = {}, m451l = {137}, m450m = "emit", m449n = {}, m448s = {})
    /* renamed from: androidx.datastore.core.v$a */
    /* loaded from: classes.dex */
    public static final class C1125a extends AbstractC10786c {

        /* renamed from: a */
        public /* synthetic */ Object f2895a;

        /* renamed from: b */
        public int f2896b;

        public C1125a(InterfaceC10772d interfaceC10772d) {
            super(interfaceC10772d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f2895a = obj;
            this.f2896b |= Integer.MIN_VALUE;
            return C1124v.this.mo299b(null, this);
        }
    }

    public C1124v(InterfaceC10986c interfaceC10986c) {
        this.f2894a = interfaceC10986c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // kotlinx.coroutines.flow.InterfaceC10986c
    @org.jetbrains.annotations.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo299b(androidx.datastore.core.AbstractC1088b0<java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.C1124v.C1125a
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.v$a r0 = (androidx.datastore.core.C1124v.C1125a) r0
            int r1 = r0.f2896b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2896b = r1
            goto L18
        L13:
            androidx.datastore.core.v$a r0 = new androidx.datastore.core.v$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2895a
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f2896b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.C10864l.m418b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.C10864l.m418b(r6)
            androidx.datastore.core.b0 r5 = (androidx.datastore.core.AbstractC1088b0) r5
            boolean r6 = r5 instanceof androidx.datastore.core.C1102l
            if (r6 != 0) goto L6d
            boolean r6 = r5 instanceof androidx.datastore.core.C1100j
            if (r6 != 0) goto L68
            boolean r6 = r5 instanceof androidx.datastore.core.C1089c
            if (r6 == 0) goto L52
            androidx.datastore.core.c r5 = (androidx.datastore.core.C1089c) r5
            T r5 = r5.f2795a
            r0.f2896b = r3
            kotlinx.coroutines.flow.c r6 = r4.f2894a
            java.lang.Object r5 = r6.mo299b(r5, r0)
            if (r5 != r1) goto L4f
            return r1
        L4f:
            kotlin.p r5 = kotlin.C10868p.f21418a
            return r5
        L52:
            boolean r5 = r5 instanceof androidx.datastore.core.C1090c0
            if (r5 == 0) goto L62
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L62:
            kotlin.i r5 = new kotlin.i
            r5.<init>()
            throw r5
        L68:
            androidx.datastore.core.j r5 = (androidx.datastore.core.C1100j) r5
            java.lang.Throwable r5 = r5.f2816a
            throw r5
        L6d:
            androidx.datastore.core.l r5 = (androidx.datastore.core.C1102l) r5
            java.lang.Throwable r5 = r5.f2817a
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1124v.mo299b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
