package kotlin.coroutines;

import kotlin.SinceKotlin;
import kotlin.coroutines.InterfaceC10773e;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
/* renamed from: kotlin.coroutines.f */
/* loaded from: classes3.dex */
public interface InterfaceC10775f {

    /* renamed from: kotlin.coroutines.f$a */
    /* loaded from: classes3.dex */
    public static final class C10776a {

        /* renamed from: kotlin.coroutines.f$a$a */
        /* loaded from: classes3.dex */
        public static final class C10777a extends AbstractC10844k implements InterfaceC10824p<InterfaceC10775f, InterfaceC10778b, InterfaceC10775f> {

            /* renamed from: a */
            public static final C10777a f21376a = new C10777a();

            public C10777a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.InterfaceC10824p
            public final InterfaceC10775f invoke(InterfaceC10775f interfaceC10775f, InterfaceC10778b interfaceC10778b) {
                C10770c c10770c;
                InterfaceC10775f acc = interfaceC10775f;
                InterfaceC10778b element = interfaceC10778b;
                C10843j.m430f(acc, "acc");
                C10843j.m430f(element, "element");
                InterfaceC10775f mo186l = acc.mo186l(element.getKey());
                C10781g c10781g = C10781g.f21377a;
                if (mo186l != c10781g) {
                    int i = InterfaceC10773e.f21374b0;
                    InterfaceC10773e.C10774a c10774a = InterfaceC10773e.C10774a.f21375a;
                    InterfaceC10773e interfaceC10773e = (InterfaceC10773e) mo186l.mo195a(c10774a);
                    if (interfaceC10773e == null) {
                        c10770c = new C10770c(element, mo186l);
                    } else {
                        InterfaceC10775f mo186l2 = mo186l.mo186l(c10774a);
                        if (mo186l2 == c10781g) {
                            return new C10770c(interfaceC10773e, element);
                        }
                        c10770c = new C10770c(interfaceC10773e, new C10770c(element, mo186l2));
                    }
                    return c10770c;
                }
                return element;
            }
        }

        @NotNull
        /* renamed from: a */
        public static InterfaceC10775f m460a(@NotNull InterfaceC10775f interfaceC10775f, @NotNull InterfaceC10775f context) {
            C10843j.m430f(context, "context");
            return context == C10781g.f21377a ? interfaceC10775f : (InterfaceC10775f) context.mo183w(interfaceC10775f, C10777a.f21376a);
        }
    }

    /* renamed from: kotlin.coroutines.f$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10778b extends InterfaceC10775f {

        /* renamed from: kotlin.coroutines.f$b$a */
        /* loaded from: classes3.dex */
        public static final class C10779a {
            /* JADX WARN: Multi-variable type inference failed */
            @Nullable
            /* renamed from: a */
            public static <E extends InterfaceC10778b> E m459a(@NotNull InterfaceC10778b interfaceC10778b, @NotNull InterfaceC10780c<E> key) {
                C10843j.m430f(key, "key");
                if (C10843j.m435a(interfaceC10778b.getKey(), key)) {
                    return interfaceC10778b;
                }
                return null;
            }

            @NotNull
            /* renamed from: b */
            public static InterfaceC10775f m458b(@NotNull InterfaceC10778b interfaceC10778b, @NotNull InterfaceC10780c<?> key) {
                C10843j.m430f(key, "key");
                return C10843j.m435a(interfaceC10778b.getKey(), key) ? C10781g.f21377a : interfaceC10778b;
            }

            @NotNull
            /* renamed from: c */
            public static InterfaceC10775f m457c(@NotNull InterfaceC10778b interfaceC10778b, @NotNull InterfaceC10775f context) {
                C10843j.m430f(context, "context");
                return C10776a.m460a(interfaceC10778b, context);
            }
        }

        @Override // kotlin.coroutines.InterfaceC10775f
        @Nullable
        /* renamed from: a */
        <E extends InterfaceC10778b> E mo195a(@NotNull InterfaceC10780c<E> interfaceC10780c);

        @NotNull
        InterfaceC10780c<?> getKey();
    }

    /* renamed from: kotlin.coroutines.f$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC10780c<E extends InterfaceC10778b> {
    }

    @Nullable
    /* renamed from: a */
    <E extends InterfaceC10778b> E mo195a(@NotNull InterfaceC10780c<E> interfaceC10780c);

    @NotNull
    /* renamed from: f */
    InterfaceC10775f mo190f(@NotNull InterfaceC10775f interfaceC10775f);

    @NotNull
    /* renamed from: l */
    InterfaceC10775f mo186l(@NotNull InterfaceC10780c<?> interfaceC10780c);

    /* renamed from: w */
    <R> R mo183w(R r, @NotNull InterfaceC10824p<? super R, ? super InterfaceC10778b, ? extends R> interfaceC10824p);
}
