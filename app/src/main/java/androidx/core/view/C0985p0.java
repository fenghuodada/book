package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;

/* renamed from: androidx.core.view.p0 */
/* loaded from: classes.dex */
public final class C0985p0 extends ViewCompat.AbstractC0812b<CharSequence> {
    public C0985p0() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    @RequiresApi(28)
    /* renamed from: b */
    public final CharSequence mo11380b(View view) {
        return ViewCompat.C0823l.m11675b(view);
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    @RequiresApi(28)
    /* renamed from: c */
    public final void mo11379c(View view, CharSequence charSequence) {
        ViewCompat.C0823l.m11669h(view, charSequence);
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    /* renamed from: f */
    public final boolean mo11378f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
