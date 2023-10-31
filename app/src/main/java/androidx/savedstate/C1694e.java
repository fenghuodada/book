package androidx.savedstate;

import android.view.View;
import com.ambrose.overwall.R;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JvmName(name = "ViewTreeSavedStateRegistryOwner")
/* renamed from: androidx.savedstate.e */
/* loaded from: classes.dex */
public final class C1694e {
    @JvmName(name = "set")
    /* renamed from: a */
    public static final void m10045a(@NotNull View view, @Nullable InterfaceC1693d interfaceC1693d) {
        C10843j.m430f(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC1693d);
    }
}
