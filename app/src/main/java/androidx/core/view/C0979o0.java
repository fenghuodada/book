package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;

/* renamed from: androidx.core.view.o0 */
/* loaded from: classes.dex */
public final class C0979o0 extends ViewCompat.AbstractC0812b<Boolean> {
    public C0979o0() {
        super(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28);
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    @RequiresApi(28)
    /* renamed from: b */
    public final Boolean mo11380b(@NonNull View view) {
        return Boolean.valueOf(ViewCompat.C0823l.m11673d(view));
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    @RequiresApi(28)
    /* renamed from: c */
    public final void mo11379c(@NonNull View view, Boolean bool) {
        ViewCompat.C0823l.m11668i(view, bool.booleanValue());
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    /* renamed from: f */
    public final boolean mo11378f(Boolean bool, Boolean bool2) {
        return !ViewCompat.AbstractC0812b.m11768a(bool, bool2);
    }
}
