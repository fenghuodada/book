package kotlinx.coroutines.internal;

import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlinx.coroutines.InterfaceC11159y1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.i0 */
/* loaded from: classes3.dex */
public final class C11040i0 {
    @JvmField
    @NotNull

    /* renamed from: a */
    public static final C11034f0 f21630a = new C11034f0("NO_THREAD_ELEMENTS");
    @NotNull

    /* renamed from: b */
    public static final C11041a f21631b = C11041a.f21634a;
    @NotNull

    /* renamed from: c */
    public static final C11042b f21632c = C11042b.f21635a;
    @NotNull

    /* renamed from: d */
    public static final C11043c f21633d = C11043c.f21636a;

    /* renamed from: kotlinx.coroutines.internal.i0$a */
    /* loaded from: classes3.dex */
    public static final class C11041a extends AbstractC10844k implements InterfaceC10824p<Object, InterfaceC10775f.InterfaceC10778b, Object> {

        /* renamed from: a */
        public static final C11041a f21634a = new C11041a();

        public C11041a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final Object invoke(Object obj, InterfaceC10775f.InterfaceC10778b interfaceC10778b) {
            Integer num;
            int i;
            InterfaceC10775f.InterfaceC10778b interfaceC10778b2 = interfaceC10778b;
            if (interfaceC10778b2 instanceof InterfaceC11159y1) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i == 0) {
                    return interfaceC10778b2;
                }
                return Integer.valueOf(i + 1);
            }
            return obj;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i0$b */
    /* loaded from: classes3.dex */
    public static final class C11042b extends AbstractC10844k implements InterfaceC10824p<InterfaceC11159y1<?>, InterfaceC10775f.InterfaceC10778b, InterfaceC11159y1<?>> {

        /* renamed from: a */
        public static final C11042b f21635a = new C11042b();

        public C11042b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final InterfaceC11159y1<?> invoke(InterfaceC11159y1<?> interfaceC11159y1, InterfaceC10775f.InterfaceC10778b interfaceC10778b) {
            InterfaceC11159y1<?> interfaceC11159y12 = interfaceC11159y1;
            InterfaceC10775f.InterfaceC10778b interfaceC10778b2 = interfaceC10778b;
            if (interfaceC11159y12 == null) {
                if (interfaceC10778b2 instanceof InterfaceC11159y1) {
                    return (InterfaceC11159y1) interfaceC10778b2;
                }
                return null;
            }
            return interfaceC11159y12;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i0$c */
    /* loaded from: classes3.dex */
    public static final class C11043c extends AbstractC10844k implements InterfaceC10824p<C11049l0, InterfaceC10775f.InterfaceC10778b, C11049l0> {

        /* renamed from: a */
        public static final C11043c f21636a = new C11043c();

        public C11043c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final C11049l0 invoke(C11049l0 c11049l0, InterfaceC10775f.InterfaceC10778b interfaceC10778b) {
            C11049l0 c11049l02 = c11049l0;
            InterfaceC10775f.InterfaceC10778b interfaceC10778b2 = interfaceC10778b;
            if (interfaceC10778b2 instanceof InterfaceC11159y1) {
                InterfaceC11159y1<Object> interfaceC11159y1 = (InterfaceC11159y1) interfaceC10778b2;
                String m104F = interfaceC11159y1.m104F(c11049l02.f21647a);
                int i = c11049l02.f21650d;
                c11049l02.f21648b[i] = m104F;
                c11049l02.f21650d = i + 1;
                c11049l02.f21649c[i] = interfaceC11159y1;
            }
            return c11049l02;
        }
    }

    /* renamed from: a */
    public static final void m261a(@NotNull InterfaceC10775f interfaceC10775f, @Nullable Object obj) {
        if (obj == f21630a) {
            return;
        }
        if (obj instanceof C11049l0) {
            C11049l0 c11049l0 = (C11049l0) obj;
            InterfaceC11159y1<Object>[] interfaceC11159y1Arr = c11049l0.f21649c;
            int length = interfaceC11159y1Arr.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                InterfaceC11159y1<Object> interfaceC11159y1 = interfaceC11159y1Arr[length];
                C10843j.m433c(interfaceC11159y1);
                interfaceC11159y1.m103u(c11049l0.f21648b[length]);
                if (i >= 0) {
                    length = i;
                } else {
                    return;
                }
            }
        } else {
            Object mo183w = interfaceC10775f.mo183w(null, f21632c);
            C10843j.m432d(mo183w, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((InterfaceC11159y1) mo183w).m103u(obj);
        }
    }

    @Nullable
    /* renamed from: b */
    public static final Object m260b(@NotNull InterfaceC10775f interfaceC10775f, @Nullable Object obj) {
        if (obj == null) {
            obj = interfaceC10775f.mo183w(0, f21631b);
            C10843j.m433c(obj);
        }
        if (obj == 0) {
            return f21630a;
        }
        if (obj instanceof Integer) {
            return interfaceC10775f.mo183w(new C11049l0(interfaceC10775f, ((Number) obj).intValue()), f21633d);
        }
        return ((InterfaceC11159y1) obj).m104F(interfaceC10775f);
    }
}
