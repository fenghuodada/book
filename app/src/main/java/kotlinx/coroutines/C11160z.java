package kotlinx.coroutines;

import kotlin.coroutines.C10781g;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.jvm.internal.InterfaceC10787d;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10859x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.z */
/* loaded from: classes3.dex */
public final class C11160z {

    /* renamed from: kotlinx.coroutines.z$a */
    /* loaded from: classes3.dex */
    public static final class C11161a extends AbstractC10844k implements InterfaceC10824p<InterfaceC10775f, InterfaceC10775f.InterfaceC10778b, InterfaceC10775f> {

        /* renamed from: a */
        public static final C11161a f21815a = new C11161a();

        public C11161a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final InterfaceC10775f invoke(InterfaceC10775f interfaceC10775f, InterfaceC10775f.InterfaceC10778b interfaceC10778b) {
            InterfaceC10775f interfaceC10775f2 = interfaceC10775f;
            InterfaceC10775f.InterfaceC10778b interfaceC10778b2 = interfaceC10778b;
            if (interfaceC10778b2 instanceof InterfaceC11157y) {
                interfaceC10778b2 = ((InterfaceC11157y) interfaceC10778b2).m105o();
            }
            return interfaceC10775f2.mo190f(interfaceC10778b2);
        }
    }

    /* renamed from: kotlinx.coroutines.z$b */
    /* loaded from: classes3.dex */
    public static final class C11162b extends AbstractC10844k implements InterfaceC10824p<InterfaceC10775f, InterfaceC10775f.InterfaceC10778b, InterfaceC10775f> {

        /* renamed from: a */
        public final /* synthetic */ C10859x<InterfaceC10775f> f21816a;

        /* renamed from: b */
        public final /* synthetic */ boolean f21817b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11162b(C10859x<InterfaceC10775f> c10859x, boolean z) {
            super(2);
            this.f21816a = c10859x;
            this.f21817b = z;
        }

        /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.coroutines.f, T] */
        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final InterfaceC10775f invoke(InterfaceC10775f interfaceC10775f, InterfaceC10775f.InterfaceC10778b interfaceC10778b) {
            InterfaceC10775f interfaceC10775f2 = interfaceC10775f;
            InterfaceC10775f.InterfaceC10778b interfaceC10778b2 = interfaceC10778b;
            boolean z = interfaceC10778b2 instanceof InterfaceC11157y;
            InterfaceC11157y interfaceC11157y = interfaceC10778b2;
            if (z) {
                C10859x<InterfaceC10775f> c10859x = this.f21816a;
                if (c10859x.f21410a.mo195a(interfaceC10778b2.getKey()) == null) {
                    InterfaceC11157y interfaceC11157y2 = (InterfaceC11157y) interfaceC10778b2;
                    interfaceC11157y = interfaceC11157y2;
                    if (this.f21817b) {
                        interfaceC11157y = interfaceC11157y2.m105o();
                    }
                } else {
                    c10859x.f21410a = c10859x.f21410a.mo186l(interfaceC10778b2.getKey());
                    interfaceC11157y = ((InterfaceC11157y) interfaceC10778b2).m106A();
                }
            }
            return interfaceC10775f2.mo190f(interfaceC11157y);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: a */
    public static final InterfaceC10775f m102a(InterfaceC10775f interfaceC10775f, InterfaceC10775f interfaceC10775f2, boolean z) {
        Boolean bool = Boolean.FALSE;
        C10937a0 c10937a0 = C10937a0.f21491a;
        boolean booleanValue = ((Boolean) interfaceC10775f.mo183w(bool, c10937a0)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC10775f2.mo183w(bool, c10937a0)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC10775f.mo190f(interfaceC10775f2);
        }
        C10859x c10859x = new C10859x();
        c10859x.f21410a = interfaceC10775f2;
        C10781g c10781g = C10781g.f21377a;
        InterfaceC10775f interfaceC10775f3 = (InterfaceC10775f) interfaceC10775f.mo183w(c10781g, new C11162b(c10859x, z));
        if (booleanValue2) {
            c10859x.f21410a = ((InterfaceC10775f) c10859x.f21410a).mo183w(c10781g, C11161a.f21815a);
        }
        return interfaceC10775f3.mo190f((InterfaceC10775f) c10859x.f21410a);
    }

    @Nullable
    /* renamed from: b */
    public static final C10950b2<?> m101b(@NotNull InterfaceC10772d<?> interfaceC10772d, @NotNull InterfaceC10775f interfaceC10775f, @Nullable Object obj) {
        boolean z;
        C10950b2<?> c10950b2 = null;
        if (!(interfaceC10772d instanceof InterfaceC10787d)) {
            return null;
        }
        if (interfaceC10775f.mo195a(C10955c2.f21505a) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        InterfaceC10787d interfaceC10787d = (InterfaceC10787d) interfaceC10772d;
        while (true) {
            if (!(interfaceC10787d instanceof C11077l0) && (interfaceC10787d = interfaceC10787d.getCallerFrame()) != null) {
                if (interfaceC10787d instanceof C10950b2) {
                    c10950b2 = (C10950b2) interfaceC10787d;
                    break;
                }
            } else {
                break;
            }
        }
        if (c10950b2 != null) {
            c10950b2.m348f0(interfaceC10775f, obj);
        }
        return c10950b2;
    }
}
