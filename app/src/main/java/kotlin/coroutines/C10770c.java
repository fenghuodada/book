package kotlin.coroutines;

import androidx.core.p003os.C0740h;
import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.coroutines.InterfaceC10775f;
import kotlin.jvm.functions.InterfaceC10824p;
import kotlin.jvm.internal.AbstractC10844k;
import kotlin.jvm.internal.C10843j;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
/* renamed from: kotlin.coroutines.c */
/* loaded from: classes3.dex */
public final class C10770c implements InterfaceC10775f, Serializable {
    @NotNull

    /* renamed from: a */
    public final InterfaceC10775f f21371a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC10775f.InterfaceC10778b f21372b;

    /* renamed from: kotlin.coroutines.c$a */
    /* loaded from: classes3.dex */
    public static final class C10771a extends AbstractC10844k implements InterfaceC10824p<String, InterfaceC10775f.InterfaceC10778b, String> {

        /* renamed from: a */
        public static final C10771a f21373a = new C10771a();

        public C10771a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.InterfaceC10824p
        public final String invoke(String str, InterfaceC10775f.InterfaceC10778b interfaceC10778b) {
            boolean z;
            String acc = str;
            InterfaceC10775f.InterfaceC10778b element = interfaceC10778b;
            C10843j.m430f(acc, "acc");
            C10843j.m430f(element, "element");
            if (acc.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public C10770c(@NotNull InterfaceC10775f.InterfaceC10778b element, @NotNull InterfaceC10775f left) {
        C10843j.m430f(left, "left");
        C10843j.m430f(element, "element");
        this.f21371a = left;
        this.f21372b = element;
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @Nullable
    /* renamed from: a */
    public final <E extends InterfaceC10775f.InterfaceC10778b> E mo195a(@NotNull InterfaceC10775f.InterfaceC10780c<E> key) {
        C10843j.m430f(key, "key");
        C10770c c10770c = this;
        while (true) {
            E e = (E) c10770c.f21372b.mo195a(key);
            if (e != null) {
                return e;
            }
            InterfaceC10775f interfaceC10775f = c10770c.f21371a;
            if (!(interfaceC10775f instanceof C10770c)) {
                return (E) interfaceC10775f.mo195a(key);
            }
            c10770c = (C10770c) interfaceC10775f;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof C10770c)) {
                return false;
            }
            C10770c c10770c = (C10770c) obj;
            c10770c.getClass();
            int i = 2;
            C10770c c10770c2 = c10770c;
            int i2 = 2;
            while (true) {
                InterfaceC10775f interfaceC10775f = c10770c2.f21371a;
                if (interfaceC10775f instanceof C10770c) {
                    c10770c2 = (C10770c) interfaceC10775f;
                } else {
                    c10770c2 = null;
                }
                if (c10770c2 == null) {
                    break;
                }
                i2++;
            }
            C10770c c10770c3 = this;
            while (true) {
                InterfaceC10775f interfaceC10775f2 = c10770c3.f21371a;
                if (interfaceC10775f2 instanceof C10770c) {
                    c10770c3 = (C10770c) interfaceC10775f2;
                } else {
                    c10770c3 = null;
                }
                if (c10770c3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            C10770c c10770c4 = this;
            while (true) {
                InterfaceC10775f.InterfaceC10778b interfaceC10778b = c10770c4.f21372b;
                if (!C10843j.m435a(c10770c.mo195a(interfaceC10778b.getKey()), interfaceC10778b)) {
                    z = false;
                    break;
                }
                InterfaceC10775f interfaceC10775f3 = c10770c4.f21371a;
                if (interfaceC10775f3 instanceof C10770c) {
                    c10770c4 = (C10770c) interfaceC10775f3;
                } else {
                    C10843j.m432d(interfaceC10775f3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    InterfaceC10775f.InterfaceC10778b interfaceC10778b2 = (InterfaceC10775f.InterfaceC10778b) interfaceC10775f3;
                    z = C10843j.m435a(c10770c.mo195a(interfaceC10778b2.getKey()), interfaceC10778b2);
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: f */
    public final InterfaceC10775f mo190f(@NotNull InterfaceC10775f interfaceC10775f) {
        return InterfaceC10775f.C10776a.m460a(this, interfaceC10775f);
    }

    public final int hashCode() {
        return this.f21372b.hashCode() + this.f21371a.hashCode();
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    @NotNull
    /* renamed from: l */
    public final InterfaceC10775f mo186l(@NotNull InterfaceC10775f.InterfaceC10780c<?> key) {
        C10843j.m430f(key, "key");
        InterfaceC10775f.InterfaceC10778b interfaceC10778b = this.f21372b;
        InterfaceC10775f.InterfaceC10778b mo195a = interfaceC10778b.mo195a(key);
        InterfaceC10775f interfaceC10775f = this.f21371a;
        if (mo195a != null) {
            return interfaceC10775f;
        }
        InterfaceC10775f mo186l = interfaceC10775f.mo186l(key);
        return mo186l == interfaceC10775f ? this : mo186l == C10781g.f21377a ? interfaceC10778b : new C10770c(interfaceC10778b, mo186l);
    }

    @NotNull
    public final String toString() {
        return C0740h.m11848b(new StringBuilder("["), (String) mo183w("", C10771a.f21373a), ']');
    }

    @Override // kotlin.coroutines.InterfaceC10775f
    /* renamed from: w */
    public final <R> R mo183w(R r, @NotNull InterfaceC10824p<? super R, ? super InterfaceC10775f.InterfaceC10778b, ? extends R> operation) {
        C10843j.m430f(operation, "operation");
        return operation.invoke((Object) this.f21371a.mo183w(r, operation), this.f21372b);
    }
}
