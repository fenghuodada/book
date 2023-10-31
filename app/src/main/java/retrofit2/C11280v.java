package retrofit2;

import kotlin.C10864l;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "KotlinExtensions")
/* renamed from: retrofit2.v */
/* loaded from: classes3.dex */
public final class C11280v {

    /* renamed from: retrofit2.v$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC11281a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10772d f22050a;

        /* renamed from: b */
        public final /* synthetic */ Exception f22051b;

        public RunnableC11281a(Exception exc, C11282b c11282b) {
            this.f22050a = c11282b;
            this.f22051b = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C10783b.m455b(this.f22050a).resumeWith(C10864l.m419a(this.f22051b));
        }
    }

    @DebugMetadata(m454c = "retrofit2.KotlinExtensions", m453f = "KotlinExtensions.kt", m452i = {0}, m451l = {113}, m450m = "suspendAndThrow", m449n = {"$this$suspendAndThrow"}, m448s = {"L$0"})
    /* renamed from: retrofit2.v$b */
    /* loaded from: classes3.dex */
    public static final class C11282b extends AbstractC10786c {

        /* renamed from: a */
        public /* synthetic */ Object f22052a;

        /* renamed from: b */
        public int f22053b;

        public C11282b(InterfaceC10772d interfaceC10772d) {
            super(interfaceC10772d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22052a = obj;
            this.f22053b |= Integer.MIN_VALUE;
            return C11280v.m7a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @org.jetbrains.annotations.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m7a(@org.jetbrains.annotations.NotNull java.lang.Exception r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.InterfaceC10772d<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.C11280v.C11282b
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.v$b r0 = (retrofit2.C11280v.C11282b) r0
            int r1 = r0.f22053b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22053b = r1
            goto L18
        L13:
            retrofit2.v$b r0 = new retrofit2.v$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f22052a
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r2 = r0.f22053b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C10864l.m418b(r5)
            kotlin.p r4 = kotlin.C10868p.f21418a
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C10864l.m418b(r5)
            r0.getClass()
            r0.f22053b = r3
            kotlinx.coroutines.scheduling.c r5 = kotlinx.coroutines.C11093p0.f21708a
            kotlin.coroutines.f r2 = r0.getContext()
            retrofit2.v$a r3 = new retrofit2.v$a
            r3.<init>(r4, r0)
            r5.mo100G(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.C11280v.m7a(java.lang.Exception, kotlin.coroutines.d):java.lang.Object");
    }
}
