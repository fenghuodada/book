package androidx.datastore.core;

import java.util.Iterator;
import java.util.List;
import kotlin.C10864l;
import kotlin.C10868p;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10790f;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.InterfaceC10820l;
import kotlin.jvm.functions.InterfaceC10824p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(m454c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", m453f = "DataMigrationInitializer.kt", m452i = {0, 0}, m451l = {44, 46}, m450m = "invokeSuspend", m449n = {"migration", "data"}, m448s = {"L$2", "L$3"})
/* renamed from: androidx.datastore.core.g */
/* loaded from: classes.dex */
public final class C1094g extends AbstractC10790f implements InterfaceC10824p<Object, InterfaceC10772d<Object>, Object> {

    /* renamed from: a */
    public Iterator f2806a;

    /* renamed from: b */
    public InterfaceC1091d f2807b;

    /* renamed from: c */
    public Object f2808c;

    /* renamed from: d */
    public int f2809d;

    /* renamed from: e */
    public /* synthetic */ Object f2810e;

    /* renamed from: f */
    public final /* synthetic */ List<InterfaceC1091d<Object>> f2811f;

    /* renamed from: g */
    public final /* synthetic */ List<InterfaceC10820l<InterfaceC10772d<? super C10868p>, Object>> f2812g;

    @DebugMetadata(m454c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", m453f = "DataMigrationInitializer.kt", m452i = {}, m451l = {45}, m450m = "invokeSuspend", m449n = {}, m448s = {})
    /* renamed from: androidx.datastore.core.g$a */
    /* loaded from: classes.dex */
    public static final class C1095a extends AbstractC10790f implements InterfaceC10820l<InterfaceC10772d<? super C10868p>, Object> {

        /* renamed from: a */
        public int f2813a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC1091d<Object> f2814b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1095a(InterfaceC1091d<Object> interfaceC1091d, InterfaceC10772d<? super C1095a> interfaceC10772d) {
            super(1, interfaceC10772d);
            this.f2814b = interfaceC1091d;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @NotNull
        public final InterfaceC10772d<C10868p> create(@NotNull InterfaceC10772d<?> interfaceC10772d) {
            return new C1095a(this.f2814b, interfaceC10772d);
        }

        @Override // kotlin.jvm.functions.InterfaceC10820l
        public final Object invoke(InterfaceC10772d<? super C10868p> interfaceC10772d) {
            return ((C1095a) create(interfaceC10772d)).invokeSuspend(C10868p.f21418a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
            int i = this.f2813a;
            if (i == 0) {
                C10864l.m418b(obj);
                this.f2813a = 1;
                if (this.f2814b.m11202b() == enumC10782a) {
                    return enumC10782a;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C10864l.m418b(obj);
            }
            return C10868p.f21418a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1094g(List<? extends InterfaceC1091d<Object>> list, List<InterfaceC10820l<InterfaceC10772d<? super C10868p>, Object>> list2, InterfaceC10772d<? super C1094g> interfaceC10772d) {
        super(2, interfaceC10772d);
        this.f2811f = list;
        this.f2812g = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final InterfaceC10772d<C10868p> create(@Nullable Object obj, @NotNull InterfaceC10772d<?> interfaceC10772d) {
        C1094g c1094g = new C1094g(this.f2811f, this.f2812g, interfaceC10772d);
        c1094g.f2810e = obj;
        return c1094g;
    }

    @Override // kotlin.jvm.functions.InterfaceC10824p
    public final Object invoke(Object obj, InterfaceC10772d<Object> interfaceC10772d) {
        return ((C1094g) create(obj, interfaceC10772d)).invokeSuspend(C10868p.f21418a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0085 -> B:12:0x003d). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.EnumC10782a.COROUTINE_SUSPENDED
            int r1 = r10.f2809d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2d
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r10.f2806a
            java.lang.Object r4 = r10.f2810e
            java.util.List r4 = (java.util.List) r4
            kotlin.C10864l.m418b(r11)
            goto L3c
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            java.lang.Object r1 = r10.f2808c
            androidx.datastore.core.d r4 = r10.f2807b
            java.util.Iterator r5 = r10.f2806a
            java.lang.Object r6 = r10.f2810e
            java.util.List r6 = (java.util.List) r6
            kotlin.C10864l.m418b(r11)
            r7 = r10
            goto L62
        L2d:
            kotlin.C10864l.m418b(r11)
            java.lang.Object r11 = r10.f2810e
            java.util.List<androidx.datastore.core.d<java.lang.Object>> r1 = r10.f2811f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.List<kotlin.jvm.functions.l<kotlin.coroutines.d<? super kotlin.p>, java.lang.Object>> r4 = r10.f2812g
        L3c:
            r5 = r10
        L3d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L89
            java.lang.Object r6 = r1.next()
            androidx.datastore.core.d r6 = (androidx.datastore.core.InterfaceC1091d) r6
            r5.f2810e = r4
            r5.f2806a = r1
            r5.f2807b = r6
            r5.f2808c = r11
            r5.f2809d = r3
            java.lang.Object r7 = r6.m11200d()
            if (r7 != r0) goto L5a
            return r0
        L5a:
            r8 = r1
            r1 = r11
            r11 = r7
            r7 = r5
            r5 = r8
            r9 = r6
            r6 = r4
            r4 = r9
        L62:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L84
            androidx.datastore.core.g$a r11 = new androidx.datastore.core.g$a
            r1 = 0
            r11.<init>(r4, r1)
            r6.add(r11)
            r7.f2810e = r6
            r7.f2806a = r5
            r7.f2807b = r1
            r7.f2808c = r1
            r7.f2809d = r2
            java.lang.Object r11 = r4.m11201c()
            if (r11 != r0) goto L85
            return r0
        L84:
            r11 = r1
        L85:
            r1 = r5
            r4 = r6
            r5 = r7
            goto L3d
        L89:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C1094g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
