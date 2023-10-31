package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C10862k;
import kotlin.C10868p;
import kotlin.collections.C10749e;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.jvm.internal.InterfaceC10787d;
import kotlin.jvm.JvmField;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC10946b0;
import kotlinx.coroutines.AbstractC11080m0;
import kotlinx.coroutines.AbstractC11138t0;
import kotlinx.coroutines.C11016h0;
import kotlinx.coroutines.C11137t;
import kotlinx.coroutines.C11143u;
import kotlinx.coroutines.C11164z1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,315:1\n241#1,8:379\n253#1:387\n254#1,2:398\n256#1:402\n1#2:316\n1#2:322\n1#2:363\n295#3,5:317\n300#3,12:323\n312#3:357\n295#3,5:358\n300#3,12:364\n312#3:417\n198#4,3:335\n201#4,14:343\n198#4,3:376\n201#4,14:403\n95#5,5:338\n107#5,10:388\n118#5,2:400\n107#5,13:418\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n222#1:379,8\n223#1:387\n223#1:398,2\n223#1:402\n200#1:322\n221#1:363\n200#1:317,5\n200#1:323,12\n200#1:357\n221#1:358,5\n221#1:364,12\n221#1:417\n200#1:335,3\n200#1:343,14\n221#1:376,3\n221#1:403,14\n201#1:338,5\n223#1:388,10\n223#1:400,2\n253#1:418,13\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.k */
/* loaded from: classes3.dex */
public final class C11046k<T> extends AbstractC11080m0<T> implements InterfaceC10787d, InterfaceC10772d<T> {
    @NotNull

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f21640h = AtomicReferenceFieldUpdater.newUpdater(C11046k.class, Object.class, "_reusableCancellableContinuation");
    @Volatile
    @Nullable
    private volatile Object _reusableCancellableContinuation;
    @JvmField
    @NotNull

    /* renamed from: d */
    public final AbstractC10946b0 f21641d;
    @JvmField
    @NotNull

    /* renamed from: e */
    public final InterfaceC10772d<T> f21642e;
    @JvmField
    @Nullable

    /* renamed from: f */
    public Object f21643f;
    @JvmField
    @NotNull

    /* renamed from: g */
    public final Object f21644g;

    /* JADX WARN: Multi-variable type inference failed */
    public C11046k(@NotNull AbstractC10946b0 abstractC10946b0, @NotNull InterfaceC10772d<? super T> interfaceC10772d) {
        super(-1);
        this.f21641d = abstractC10946b0;
        this.f21642e = interfaceC10772d;
        this.f21643f = C11048l.f21645a;
        Object mo183w = getContext().mo183w(0, C11040i0.f21631b);
        C10843j.m433c(mo183w);
        this.f21644g = mo183w;
    }

    @Override // kotlinx.coroutines.AbstractC11080m0
    /* renamed from: a */
    public final void mo223a(@Nullable Object obj, @NotNull CancellationException cancellationException) {
        if (obj instanceof C11143u) {
            ((C11143u) obj).f21804b.invoke(cancellationException);
        }
    }

    @Override // kotlinx.coroutines.AbstractC11080m0
    @NotNull
    /* renamed from: c */
    public final InterfaceC10772d<T> mo222c() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC10787d
    @Nullable
    public final InterfaceC10787d getCallerFrame() {
        InterfaceC10772d<T> interfaceC10772d = this.f21642e;
        if (interfaceC10772d instanceof InterfaceC10787d) {
            return (InterfaceC10787d) interfaceC10772d;
        }
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC10772d
    @NotNull
    public final InterfaceC10775f getContext() {
        return this.f21642e.getContext();
    }

    @Override // kotlinx.coroutines.AbstractC11080m0
    @Nullable
    /* renamed from: h */
    public final Object mo218h() {
        Object obj = this.f21643f;
        this.f21643f = C11048l.f21645a;
        return obj;
    }

    @Override // kotlin.coroutines.InterfaceC10772d
    public final void resumeWith(@NotNull Object obj) {
        Object c11137t;
        boolean z;
        InterfaceC10772d<T> interfaceC10772d = this.f21642e;
        InterfaceC10775f context = interfaceC10772d.getContext();
        Throwable m420a = C10862k.m420a(obj);
        if (m420a == null) {
            c11137t = obj;
        } else {
            c11137t = new C11137t(false, m420a);
        }
        AbstractC10946b0 abstractC10946b0 = this.f21641d;
        if (abstractC10946b0.mo352H()) {
            this.f21643f = c11137t;
            this.f21685c = 0;
            abstractC10946b0.mo100G(context, this);
            return;
        }
        AbstractC11138t0 m99a = C11164z1.m99a();
        if (m99a.f21798c >= 4294967296L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f21643f = c11137t;
            this.f21685c = 0;
            C10749e<AbstractC11080m0<?>> c10749e = m99a.f21800e;
            if (c10749e == null) {
                c10749e = new C10749e<>();
                m99a.f21800e = c10749e;
            }
            c10749e.addLast(this);
            return;
        }
        m99a.m126J(true);
        try {
            InterfaceC10775f context2 = getContext();
            Object m260b = C11040i0.m260b(context2, this.f21644g);
            interfaceC10772d.resumeWith(obj);
            C10868p c10868p = C10868p.f21418a;
            C11040i0.m261a(context2, m260b);
            do {
            } while (m99a.m125L());
        } finally {
            try {
            } finally {
            }
        }
    }

    @NotNull
    public final String toString() {
        return "DispatchedContinuation[" + this.f21641d + ", " + C11016h0.m297b(this.f21642e) + ']';
    }
}
