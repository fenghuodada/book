package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.strictmode.k */
/* loaded from: classes.dex */
public final class C1426k extends AbstractC1428m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426k(@NotNull Fragment fragment, boolean z) {
        super(fragment, "Attempting to set user visible hint to " + z + " for fragment " + fragment);
        C10843j.m430f(fragment, "fragment");
    }
}
