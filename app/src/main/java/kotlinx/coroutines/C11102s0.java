package kotlinx.coroutines;

import androidx.core.p003os.C0740h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.s0 */
/* loaded from: classes3.dex */
public final class C11102s0 implements InterfaceC10954c1 {

    /* renamed from: a */
    public final boolean f21717a;

    public C11102s0(boolean z) {
        this.f21717a = z;
    }

    @Override // kotlinx.coroutines.InterfaceC10954c1
    /* renamed from: c */
    public final boolean mo165c() {
        return this.f21717a;
    }

    @Override // kotlinx.coroutines.InterfaceC10954c1
    @Nullable
    /* renamed from: e */
    public final C11100r1 mo164e() {
        return null;
    }

    @NotNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.f21717a) {
            str = "Active";
        } else {
            str = "New";
        }
        return C0740h.m11848b(sb, str, '}');
    }
}
