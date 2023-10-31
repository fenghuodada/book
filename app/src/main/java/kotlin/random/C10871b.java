package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.random.b */
/* loaded from: classes3.dex */
public final class C10871b extends AbstractC10870a {
    @NotNull

    /* renamed from: c */
    public final C10872a f21419c = new C10872a();

    /* renamed from: kotlin.random.b$a */
    /* loaded from: classes3.dex */
    public static final class C10872a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // kotlin.random.AbstractC10870a
    @NotNull
    /* renamed from: b */
    public final Random mo415b() {
        Random random = this.f21419c.get();
        C10843j.m431e(random, "implStorage.get()");
        return random;
    }
}
