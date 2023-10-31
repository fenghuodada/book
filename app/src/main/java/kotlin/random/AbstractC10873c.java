package kotlin.random;

import java.io.Serializable;
import kotlin.SinceKotlin;
import kotlin.internal.C10799b;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.3")
@SourceDebugExtension({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/Random\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
/* renamed from: kotlin.random.c */
/* loaded from: classes3.dex */
public abstract class AbstractC10873c {
    @NotNull

    /* renamed from: a */
    public static final C10874a f21420a = new C10874a(0);
    @NotNull

    /* renamed from: b */
    public static final AbstractC10873c f21421b = C10799b.f21392a.mo444b();

    /* renamed from: kotlin.random.c$a */
    /* loaded from: classes3.dex */
    public static final class C10874a extends AbstractC10873c implements Serializable {
        public C10874a(int i) {
        }

        @Override // kotlin.random.AbstractC10873c
        /* renamed from: a */
        public final int mo416a() {
            return AbstractC10873c.f21421b.mo416a();
        }
    }

    /* renamed from: a */
    public abstract int mo416a();
}
