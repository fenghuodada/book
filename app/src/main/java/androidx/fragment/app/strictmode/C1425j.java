package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.strictmode.j */
/* loaded from: classes.dex */
public final class C1425j extends AbstractC1427l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1425j(@NotNull Fragment fragment, @NotNull Fragment targetFragment, int i) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i + " for fragment " + fragment);
        C10843j.m430f(fragment, "fragment");
        C10843j.m430f(targetFragment, "targetFragment");
    }
}
