package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.C10738b;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.scheduling.AbstractRunnableC11112h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,220:1\n1#2:221\n107#3,10:222\n118#3,2:236\n218#4:232\n219#4:235\n61#5,2:233\n75#6:238\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n88#1:222,10\n88#1:236,2\n101#1:232\n101#1:235\n101#1:233,2\n140#1:238\n*E\n"})
/* renamed from: kotlinx.coroutines.m0 */
/* loaded from: classes3.dex */
public abstract class AbstractC11080m0<T> extends AbstractRunnableC11112h {
    @JvmField

    /* renamed from: c */
    public int f21685c;

    public AbstractC11080m0(int i) {
        this.f21685c = i;
    }

    /* renamed from: a */
    public void mo223a(@Nullable Object obj, @NotNull CancellationException cancellationException) {
    }

    @NotNull
    /* renamed from: c */
    public abstract InterfaceC10772d<T> mo222c();

    @Nullable
    /* renamed from: d */
    public Throwable mo221d(@Nullable Object obj) {
        C11137t c11137t = obj instanceof C11137t ? (C11137t) obj : null;
        if (c11137t != null) {
            return c11137t.f21796a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T> T mo220e(@Nullable Object obj) {
        return obj;
    }

    /* renamed from: f */
    public final void m219f(@Nullable Throwable th, @Nullable Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C10738b.m502a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C10843j.m433c(th);
        C10972d0.m311a(mo222c().getContext(), new C11013g0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Nullable
    /* renamed from: h */
    public abstract Object mo218h();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        r6 = (kotlinx.coroutines.InterfaceC11017h1) r6.mo195a(kotlinx.coroutines.InterfaceC11017h1.C11019b.f21607a);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r12 = this;
            kotlinx.coroutines.scheduling.i r0 = r12.f21745b
            kotlin.coroutines.d r1 = r12.mo222c()     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.C10843j.m432d(r1, r2)     // Catch: java.lang.Throwable -> L98
            kotlinx.coroutines.internal.k r1 = (kotlinx.coroutines.internal.C11046k) r1     // Catch: java.lang.Throwable -> L98
            kotlin.coroutines.d<T> r2 = r1.f21642e     // Catch: java.lang.Throwable -> L98
            java.lang.Object r1 = r1.f21644g     // Catch: java.lang.Throwable -> L98
            kotlin.coroutines.f r3 = r2.getContext()     // Catch: java.lang.Throwable -> L98
            java.lang.Object r1 = kotlinx.coroutines.internal.C11040i0.m260b(r3, r1)     // Catch: java.lang.Throwable -> L98
            kotlinx.coroutines.internal.f0 r4 = kotlinx.coroutines.internal.C11040i0.f21630a     // Catch: java.lang.Throwable -> L98
            r5 = 0
            if (r1 == r4) goto L23
            kotlinx.coroutines.b2 r4 = kotlinx.coroutines.C11160z.m101b(r2, r3, r1)     // Catch: java.lang.Throwable -> L98
            goto L24
        L23:
            r4 = r5
        L24:
            kotlin.coroutines.f r6 = r2.getContext()     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = r12.mo218h()     // Catch: java.lang.Throwable -> L5c
            java.lang.Throwable r8 = r12.mo221d(r7)     // Catch: java.lang.Throwable -> L5c
            if (r8 != 0) goto L47
            int r9 = r12.f21685c     // Catch: java.lang.Throwable -> L5c
            r10 = 1
            if (r9 == r10) goto L3c
            r11 = 2
            if (r9 != r11) goto L3b
            goto L3c
        L3b:
            r10 = 0
        L3c:
            if (r10 == 0) goto L47
            kotlinx.coroutines.h1$b r9 = kotlinx.coroutines.InterfaceC11017h1.C11019b.f21607a     // Catch: java.lang.Throwable -> L5c
            kotlin.coroutines.f$b r6 = r6.mo195a(r9)     // Catch: java.lang.Throwable -> L5c
            kotlinx.coroutines.h1 r6 = (kotlinx.coroutines.InterfaceC11017h1) r6     // Catch: java.lang.Throwable -> L5c
            goto L48
        L47:
            r6 = r5
        L48:
            if (r6 == 0) goto L5e
            boolean r9 = r6.mo191c()     // Catch: java.lang.Throwable -> L5c
            if (r9 != 0) goto L5e
            java.util.concurrent.CancellationException r6 = r6.mo188j()     // Catch: java.lang.Throwable -> L5c
            r12.mo223a(r7, r6)     // Catch: java.lang.Throwable -> L5c
            kotlin.k$a r6 = kotlin.C10864l.m419a(r6)     // Catch: java.lang.Throwable -> L5c
            goto L69
        L5c:
            r2 = move-exception
            goto L8c
        L5e:
            if (r8 == 0) goto L65
            kotlin.k$a r6 = kotlin.C10864l.m419a(r8)     // Catch: java.lang.Throwable -> L5c
            goto L69
        L65:
            java.lang.Object r6 = r12.mo220e(r7)     // Catch: java.lang.Throwable -> L5c
        L69:
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L5c
            kotlin.p r2 = kotlin.C10868p.f21418a     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L76
            boolean r2 = r4.m349e0()     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L79
        L76:
            kotlinx.coroutines.internal.C11040i0.m261a(r3, r1)     // Catch: java.lang.Throwable -> L98
        L79:
            r0.mo148a()     // Catch: java.lang.Throwable -> L7f
            kotlin.p r0 = kotlin.C10868p.f21418a     // Catch: java.lang.Throwable -> L7f
            goto L84
        L7f:
            r0 = move-exception
            kotlin.k$a r0 = kotlin.C10864l.m419a(r0)
        L84:
            java.lang.Throwable r0 = kotlin.C10862k.m420a(r0)
            r12.m219f(r5, r0)
            goto Lab
        L8c:
            if (r4 == 0) goto L94
            boolean r4 = r4.m349e0()     // Catch: java.lang.Throwable -> L98
            if (r4 == 0) goto L97
        L94:
            kotlinx.coroutines.internal.C11040i0.m261a(r3, r1)     // Catch: java.lang.Throwable -> L98
        L97:
            throw r2     // Catch: java.lang.Throwable -> L98
        L98:
            r1 = move-exception
            r0.mo148a()     // Catch: java.lang.Throwable -> L9f
            kotlin.p r0 = kotlin.C10868p.f21418a     // Catch: java.lang.Throwable -> L9f
            goto La4
        L9f:
            r0 = move-exception
            kotlin.k$a r0 = kotlin.C10864l.m419a(r0)
        La4:
            java.lang.Throwable r0 = kotlin.C10862k.m420a(r0)
            r12.m219f(r1, r0)
        Lab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.AbstractC11080m0.run():void");
    }
}
