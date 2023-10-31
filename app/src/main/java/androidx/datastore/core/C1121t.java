package androidx.datastore.core;

import androidx.datastore.core.C1107q;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.SingleProcessDataStore$actor$3", m453f = "SingleProcessDataStore.kt", m452i = {}, m451l = {239, 242}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* renamed from: androidx.datastore.core.t */
/* loaded from: classes.dex */
public final class C1121t extends AbstractC10790f implements InterfaceC10824p<C1107q.AbstractC1108a<Object>, InterfaceC10772d<? super C10868p>, Object> {

    /* renamed from: a */
    public int f2886a;

    /* renamed from: b */
    public /* synthetic */ Object f2887b;

    /* renamed from: c */
    public final /* synthetic */ C1107q<Object> f2888c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1121t(C1107q<Object> c1107q, InterfaceC10772d<? super C1121t> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.f2888c = c1107q;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        C1121t c1121t = new C1121t(this.f2888c, interfaceC10772d);
        c1121t.f2887b = obj;
        return c1121t;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final Object invoke(C1107q.AbstractC1108a<Object> abstractC1108a, InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((C1121t) create(abstractC1108a, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r6 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r1 = r5.f2886a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            kotlin.C10864l.m418b(r6)
            goto L79
        L19:
            kotlin.C10864l.m418b(r6)
            java.lang.Object r6 = r5.f2887b
            androidx.datastore.core.q$a r6 = (androidx.datastore.core.C1107q.AbstractC1108a) r6
            boolean r1 = r6 instanceof androidx.datastore.core.C1107q.AbstractC1108a.C1109a
            androidx.datastore.core.q<java.lang.Object> r4 = r5.f2888c
            if (r1 == 0) goto L6a
            androidx.datastore.core.q$a$a r6 = (androidx.datastore.core.C1107q.AbstractC1108a.C1109a) r6
            r5.f2886a = r3
            kotlinx.coroutines.flow.j r1 = r4.f2837h
            java.lang.Object r1 = r1.m303d()
            androidx.datastore.core.b0 r1 = (androidx.datastore.core.AbstractC1088b0) r1
            boolean r2 = r1 instanceof androidx.datastore.core.C1089c
            if (r2 == 0) goto L37
            goto L59
        L37:
            boolean r2 = r1 instanceof androidx.datastore.core.C1102l
            if (r2 == 0) goto L46
            androidx.datastore.core.b0<T> r6 = r6.f2840a
            if (r1 != r6) goto L59
            java.lang.Object r6 = r4.m11192f(r5)
            if (r6 != r0) goto L59
            goto L5b
        L46:
            androidx.datastore.core.c0 r6 = androidx.datastore.core.C1090c0.f2797a
            boolean r6 = kotlin.jvm.internal.C10843j.m435a(r1, r6)
            if (r6 == 0) goto L55
            java.lang.Object r6 = r4.m11192f(r5)
            if (r6 != r0) goto L59
            goto L5b
        L55:
            boolean r6 = r1 instanceof androidx.datastore.core.C1100j
            if (r6 != 0) goto L5e
        L59:
            kotlin.p r6 = kotlin.C10868p.f21418a
        L5b:
            if (r6 != r0) goto L79
            return r0
        L5e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L6a:
            boolean r1 = r6 instanceof androidx.datastore.core.C1107q.AbstractC1108a.C1110b
            if (r1 == 0) goto L79
            androidx.datastore.core.q$a$b r6 = (androidx.datastore.core.C1107q.AbstractC1108a.C1110b) r6
            r5.f2886a = r2
            java.lang.Object r6 = androidx.datastore.core.C1107q.m11196b(r4, r6, r5)
            if (r6 != r0) goto L79
            return r0
        L79:
            kotlin.p r6 = kotlin.C10868p.f21418a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1121t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
