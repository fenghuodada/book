package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.strictmode.g */
/* loaded from: classes.dex */
public final class C1422g extends AbstractC1427l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422g(@NotNull Fragment fragment) {
        super(fragment, "Attempting to get target fragment from fragment " + fragment);
        C10843j.m430f(fragment, "fragment");
    }
}
