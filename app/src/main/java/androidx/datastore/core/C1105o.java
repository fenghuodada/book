package androidx.datastore.core;

import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlinx.coroutines.InterfaceC10976e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.SimpleActor$offer$2", m453f = "SimpleActor.kt", m452i = {}, m451l = {122, 122}, m450m = "invokeSuspend", m449n = {}, m448s = {})
/* renamed from: androidx.datastore.core.o */
/* loaded from: classes.dex */
public final class C1105o extends AbstractC10790f implements InterfaceC10824p<InterfaceC10976e0, InterfaceC10772d<? super C10868p>, Object> {

    /* renamed from: a */
    public InterfaceC10824p f2821a;

    /* renamed from: b */
    public int f2822b;

    /* renamed from: c */
    public final /* synthetic */ C1106p<Object> f2823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1105o(C1106p<Object> c1106p, InterfaceC10772d<? super C1105o> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.f2823c = c1106p;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        return new C1105o(this.f2823c, interfaceC10772d);
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final Object invoke(InterfaceC10976e0 interfaceC10976e0, InterfaceC10772d<? super C10868p> interfaceC10772d) {
        return ((C1105o) create(interfaceC10976e0, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006a -> B:29:0x006d). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r1 = r6.f2822b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L21
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            kotlin.C10864l.m418b(r7)
            r7 = r6
            goto L6d
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.jvm.functions.p r1 = r6.f2821a
            kotlin.C10864l.m418b(r7)
            r4 = r7
            r7 = r6
            goto L61
        L21:
            kotlin.C10864l.m418b(r7)
            androidx.datastore.core.p<java.lang.Object> r7 = r6.f2823c
            java.util.concurrent.atomic.AtomicInteger r7 = r7.f2827d
            int r7 = r7.get()
            if (r7 <= 0) goto L30
            r7 = r3
            goto L31
        L30:
            r7 = 0
        L31:
            if (r7 == 0) goto L7a
            r7 = r6
        L34:
            androidx.datastore.core.p<java.lang.Object> r1 = r7.f2823c
            kotlinx.coroutines.e0 r4 = r1.f2824a
            kotlin.coroutines.f r4 = r4.mo266i()
            kotlinx.coroutines.h1$b r5 = kotlinx.coroutines.InterfaceC11017h1.C11019b.f21607a
            kotlin.coroutines.f$b r4 = r4.mo195a(r5)
            kotlinx.coroutines.h1 r4 = (kotlinx.coroutines.InterfaceC11017h1) r4
            if (r4 == 0) goto L52
            boolean r5 = r4.mo191c()
            if (r5 == 0) goto L4d
            goto L52
        L4d:
            java.util.concurrent.CancellationException r7 = r4.mo188j()
            throw r7
        L52:
            kotlinx.coroutines.channels.a r4 = r1.f2826c
            kotlin.jvm.functions.p<T, kotlin.coroutines.d<? super kotlin.p>, java.lang.Object> r1 = r1.f2825b
            r7.f2821a = r1
            r7.f2822b = r3
            java.lang.Object r4 = r4.m325t(r7)
            if (r4 != r0) goto L61
            return r0
        L61:
            r5 = 0
            r7.f2821a = r5
            r7.f2822b = r2
            java.lang.Object r1 = r1.invoke(r4, r7)
            if (r1 != r0) goto L6d
            return r0
        L6d:
            androidx.datastore.core.p<java.lang.Object> r1 = r7.f2823c
            java.util.concurrent.atomic.AtomicInteger r1 = r1.f2827d
            int r1 = r1.decrementAndGet()
            if (r1 != 0) goto L34
            kotlin.p r7 = kotlin.C10868p.f21418a
            return r7
        L7a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1105o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
