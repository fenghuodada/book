package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.strictmode.a */
/* loaded from: classes.dex */
public final class C1414a extends AbstractC1428m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1414a(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId);
        C10843j.m430f(fragment, "fragment");
        C10843j.m430f(previousFragmentId, "previousFragmentId");
    }
}
