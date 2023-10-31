package androidx.core.view;

import android.text.TextUtils;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;

/* renamed from: androidx.core.view.q0 */
/* loaded from: classes.dex */
public final class C0990q0 extends ViewCompat.AbstractC0812b<CharSequence> {
    public C0990q0() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    @RequiresApi(30)
    /* renamed from: b */
    public final CharSequence mo11380b(View view) {
        return ViewCompat.C0825n.m11663a(view);
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    @RequiresApi(30)
    /* renamed from: c */
    public final void mo11379c(View view, CharSequence charSequence) {
        ViewCompat.C0825n.m11662b(view, charSequence);
    }

    @Override // androidx.core.view.ViewCompat.AbstractC0812b
    /* renamed from: f */
    public final boolean mo11378f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
