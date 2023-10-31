package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10862k;
import kotlin.C10868p;
import kotlin.collections.C10752h;
import kotlin.collections.C10753i;
import kotlin.collections.C10757m;
import kotlin.coroutines.C10781g;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.coroutines.intrinsics.EnumC10782a;
import kotlin.coroutines.jvm.internal.AbstractC10786c;
import kotlin.coroutines.jvm.internal.InterfaceC10787d;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.functions.InterfaceC10825q;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C10909a;
import kotlin.text.C10920i;
import kotlin.text.C10925n;
import kotlin.text.C10929r;
import kotlin.text.C10930s;
import kotlinx.coroutines.InterfaceC11017h1;
import kotlinx.coroutines.flow.InterfaceC10986c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
/* renamed from: kotlinx.coroutines.flow.internal.g */
/* loaded from: classes3.dex */
public final class C11000g<T> extends AbstractC10786c implements InterfaceC10986c<T> {
    @JvmField
    @NotNull

    /* renamed from: a */
    public final InterfaceC10986c<T> f21578a;
    @JvmField
    @NotNull

    /* renamed from: b */
    public final InterfaceC10775f f21579b;
    @JvmField

    /* renamed from: c */
    public final int f21580c;
    @Nullable

    /* renamed from: d */
    public InterfaceC10775f f21581d;
    @Nullable

    /* renamed from: e */
    public InterfaceC10772d<? super C10868p> f21582e;

    /* renamed from: kotlinx.coroutines.flow.internal.g$a */
    /* loaded from: classes3.dex */
    public static final class C11001a extends AbstractC10844k implements InterfaceC10824p<Integer, InterfaceC10775f.InterfaceC10778b, Integer> {

        /* renamed from: a */
        public static final C11001a f21583a = new C11001a();

        public C11001a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final Integer invoke(Integer num, InterfaceC10775f.InterfaceC10778b interfaceC10778b) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C11000g(@NotNull InterfaceC10986c<? super T> interfaceC10986c, @NotNull InterfaceC10775f interfaceC10775f) {
        super(C10998e.f21576a, C10781g.f21377a);
        this.f21578a = interfaceC10986c;
        this.f21579b = interfaceC10775f;
        this.f21580c = ((Number) interfaceC10775f.mo183w(0, C11001a.f21583a)).intValue();
    }

    @Override // kotlinx.coroutines.flow.InterfaceC10986c
    @Nullable
    /* renamed from: b */
    public final Object mo299b(T t, @NotNull InterfaceC10772d<? super C10868p> frame) {
        try {
            Object m305c = m305c(frame, t);
            EnumC10782a enumC10782a = EnumC10782a.COROUTINE_SUSPENDED;
            if (m305c == enumC10782a) {
                C10843j.m430f(frame, "frame");
            }
            if (m305c == enumC10782a) {
                return m305c;
            }
            return C10868p.f21418a;
        } catch (Throwable th) {
            this.f21581d = new C10997d(frame.getContext(), th);
            throw th;
        }
    }

    /* renamed from: c */
    public final Object m305c(InterfaceC10772d<? super C10868p> interfaceC10772d, T t) {
        Comparable comparable;
        int i;
        InterfaceC10775f context = interfaceC10772d.getContext();
        InterfaceC11017h1 interfaceC11017h1 = (InterfaceC11017h1) context.mo195a(InterfaceC11017h1.C11019b.f21607a);
        if (interfaceC11017h1 != null && !interfaceC11017h1.mo191c()) {
            throw interfaceC11017h1.mo188j();
        }
        InterfaceC10775f interfaceC10775f = this.f21581d;
        if (interfaceC10775f != context) {
            int i2 = 0;
            if (interfaceC10775f instanceof C10997d) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C10997d) interfaceC10775f).f21574a + ", but then emission attempt of value '" + t + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                C10843j.m430f(str, "<this>");
                List<String> m369w = C10929r.m369w(str);
                List<String> list = m369w;
                ArrayList arrayList = new ArrayList();
                for (T t2 : list) {
                    if (!C10925n.m396g((String) t2)) {
                        arrayList.add(t2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C10753i.m482g(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int length = str2.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 < length) {
                            if (!C10909a.m405c(str2.charAt(i3))) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 == -1) {
                        i3 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(i3));
                }
                Iterator it2 = arrayList2.iterator();
                if (!it2.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                int size = (m369w.size() * 0) + str.length();
                int m487b = C10752h.m487b(m369w);
                ArrayList arrayList3 = new ArrayList();
                for (T t3 : list) {
                    int i4 = i2 + 1;
                    if (i2 >= 0) {
                        String str3 = (String) t3;
                        if ((i2 == 0 || i2 == m487b) && C10925n.m396g(str3)) {
                            str3 = null;
                        } else {
                            String invoke = C10920i.f21471a.invoke(C10930s.m365L(i, str3));
                            if (invoke != null) {
                                str3 = invoke;
                            }
                        }
                        if (str3 != null) {
                            arrayList3.add(str3);
                        }
                        i2 = i4;
                    } else {
                        C10752h.m483f();
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder(size);
                C10757m.m477l(arrayList3, sb, "\n", "", "", -1, "...", null);
                String sb2 = sb.toString();
                C10843j.m431e(sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
                throw new IllegalStateException(sb2.toString());
            } else if (((Number) context.mo183w(0, new C11004i(this))).intValue() == this.f21580c) {
                this.f21581d = context;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f21579b + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f21582e = interfaceC10772d;
        InterfaceC10825q<InterfaceC10986c<Object>, Object, InterfaceC10772d<? super C10868p>, Object> interfaceC10825q = C11002h.f21584a;
        InterfaceC10986c<T> interfaceC10986c = this.f21578a;
        C10843j.m432d(interfaceC10986c, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object mo132a = interfaceC10825q.mo132a(interfaceC10986c, t, this);
        if (!C10843j.m435a(mo132a, EnumC10782a.COROUTINE_SUSPENDED)) {
            this.f21582e = null;
        }
        return mo132a;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a, kotlin.coroutines.jvm.internal.InterfaceC10787d
    @Nullable
    public final InterfaceC10787d getCallerFrame() {
        InterfaceC10772d<? super C10868p> interfaceC10772d = this.f21582e;
        if (interfaceC10772d instanceof InterfaceC10787d) {
            return (InterfaceC10787d) interfaceC10772d;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10786c, kotlin.coroutines.InterfaceC10772d
    @NotNull
    public final InterfaceC10775f getContext() {
        InterfaceC10775f interfaceC10775f = this.f21581d;
        return interfaceC10775f == null ? C10781g.f21377a : interfaceC10775f;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @Nullable
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10784a
    @NotNull
    public final Object invokeSuspend(@NotNull Object obj) {
        Throwable m420a = C10862k.m420a(obj);
        if (m420a != null) {
            this.f21581d = new C10997d(getContext(), m420a);
        }
        InterfaceC10772d<? super C10868p> interfaceC10772d = this.f21582e;
        if (interfaceC10772d != null) {
            interfaceC10772d.resumeWith(obj);
        }
        return EnumC10782a.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC10786c, kotlin.coroutines.jvm.internal.AbstractC10784a
    public final void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
