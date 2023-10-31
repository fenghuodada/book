package kotlinx.coroutines;

import kotlin.C10796i;
import kotlin.C10862k;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.C10783b;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.C10833a0;
import kotlinx.coroutines.InterfaceC11017h1;
import kotlinx.coroutines.internal.C11040i0;
import kotlinx.coroutines.internal.C11048l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalCoroutinesApi
/* renamed from: kotlinx.coroutines.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10936a<T> extends C11084n1 implements InterfaceC10772d<T>, InterfaceC10976e0 {
    @NotNull

    /* renamed from: c */
    public final InterfaceC10775f f21490c;

    public AbstractC10936a(@NotNull InterfaceC10775f interfaceC10775f, boolean z) {
        super(z);
        m205P((InterfaceC11017h1) interfaceC10775f.mo195a(InterfaceC11017h1.C11019b.f21607a));
        this.f21490c = interfaceC10775f.mo190f(this);
    }

    @Override // kotlinx.coroutines.C11084n1
    @NotNull
    /* renamed from: C */
    public final String mo214C() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.C11084n1
    /* renamed from: O */
    public final void mo206O(@NotNull C11151w c11151w) {
        C10972d0.m311a(this.f21490c, c11151w);
    }

    @Override // kotlinx.coroutines.C11084n1
    @NotNull
    /* renamed from: S */
    public final String mo202S() {
        return super.mo202S();
    }

    @Override // kotlinx.coroutines.C11084n1
    /* renamed from: V */
    public final void mo199V(@Nullable Object obj) {
        if (obj instanceof C11137t) {
            C11137t c11137t = (C11137t) obj;
            Throwable th = c11137t.f21796a;
            c11137t.getClass();
            C11137t.f21795b.get(c11137t);
        }
    }

    @Override // kotlinx.coroutines.C11084n1, kotlinx.coroutines.InterfaceC11017h1
    /* renamed from: c */
    public final boolean mo191c() {
        return super.mo191c();
    }

    /* renamed from: c0 */
    public void mo225c0(@Nullable Object obj) {
        mo184t(obj);
    }

    /* renamed from: d0 */
    public final void m355d0(@NotNull int i, AbstractC10936a abstractC10936a, @NotNull InterfaceC10824p interfaceC10824p) {
        Object m419a;
        if (i != 0) {
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            try {
                                InterfaceC10775f interfaceC10775f = this.f21490c;
                                Object m260b = C11040i0.m260b(interfaceC10775f, null);
                                C10833a0.m439b(2, interfaceC10824p);
                                m419a = interfaceC10824p.invoke(abstractC10936a, this);
                                C11040i0.m261a(interfaceC10775f, m260b);
                                if (m419a == EnumC10782a.COROUTINE_SUSPENDED) {
                                    return;
                                }
                            } catch (Throwable th) {
                                m419a = C10864l.m419a(th);
                            }
                            resumeWith(m419a);
                            return;
                        }
                        throw new C10796i();
                    }
                    C10783b.m455b(C10783b.m456a(abstractC10936a, this, interfaceC10824p)).resumeWith(C10868p.f21418a);
                    return;
                }
                return;
            }
            try {
                C11048l.m252a(C10783b.m455b(C10783b.m456a(abstractC10936a, this, interfaceC10824p)), C10868p.f21418a, null);
                return;
            } catch (Throwable th2) {
                resumeWith(C10864l.m419a(th2));
                throw th2;
            }
        }
        throw null;
    }

    @Override // kotlin.coroutines.InterfaceC10772d
    @NotNull
    public final InterfaceC10775f getContext() {
        return this.f21490c;
    }

    @Override // kotlinx.coroutines.InterfaceC10976e0
    @NotNull
    /* renamed from: i */
    public final InterfaceC10775f mo266i() {
        return this.f21490c;
    }

    @Override // kotlin.coroutines.InterfaceC10772d
    public final void resumeWith(@NotNull Object obj) {
        Throwable m420a = C10862k.m420a(obj);
        if (m420a != null) {
            obj = new C11137t(false, m420a);
        }
        Object m203R = m203R(obj);
        if (m203R == C11091o1.f21702b) {
            return;
        }
        mo225c0(m203R);
    }
}
