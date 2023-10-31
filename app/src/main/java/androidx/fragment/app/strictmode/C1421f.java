package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.strictmode.f */
/* loaded from: classes.dex */
public final class C1421f extends AbstractC1427l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421f(@NotNull Fragment fragment) {
        super(fragment, "Attempting to get target request code from fragment " + fragment);
        C10843j.m430f(fragment, "fragment");
    }
}
