package androidx.core.view;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;

/* renamed from: androidx.core.view.r0 */
/* loaded from: classes.dex */
public final class C0995r0 extends ViewCompat.AbstractC0812b<Boolean> {
    public C0995r0() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    @RequiresApi(28)
    /* renamed from: b */
    public final Boolean mo11380b(View view) {
        return Boolean.valueOf(ViewCompat.C0823l.m11674c(view));
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    @RequiresApi(28)
    /* renamed from: c */
    public final void mo11379c(View view, Boolean bool) {
        ViewCompat.C0823l.m11670g(view, bool.booleanValue());
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    /* renamed from: f */
    public final boolean mo11378f(Boolean bool, Boolean bool2) {
        return !ViewCompat.AbstractC0812b.m11768a(bool, bool2);
    }
}
