package com.qmuiteam.qmui.alpha;

import android.view.View;
import androidx.annotation.NonNull;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.util.C9145f;
import java.lang.ref.WeakReference;

/* renamed from: com.qmuiteam.qmui.alpha.h */
/* loaded from: classes3.dex */
public final class C9006h {

    /* renamed from: a */
    public final WeakReference<View> f17192a;

    /* renamed from: b */
    public boolean f17193b = true;

    /* renamed from: c */
    public boolean f17194c = true;

    /* renamed from: d */
    public final float f17195d;

    /* renamed from: e */
    public final float f17196e;

    public C9006h(@NonNull View view) {
        this.f17195d = 0.5f;
        this.f17196e = 0.5f;
        this.f17192a = new WeakReference<>(view);
        this.f17195d = C9145f.m2633h(R.attr.qmui_alpha_pressed, view.getContext().getTheme());
        this.f17196e = C9145f.m2633h(R.attr.qmui_alpha_disabled, view.getContext().getTheme());
    }

    /* renamed from: a */
    public final void m2818a(View view, boolean z) {
        View view2 = this.f17192a.get();
        if (view2 == null) {
            return;
        }
        float f = 1.0f;
        if (this.f17194c && !z) {
            f = this.f17196e;
        }
        if (view != view2 && view2.isEnabled() != z) {
            view2.setEnabled(z);
        }
        view2.setAlpha(f);
    }

    /* renamed from: b */
    public final void m2817b(View view, boolean z) {
        float f;
        View view2 = this.f17192a.get();
        if (view2 == null) {
            return;
        }
        if (view.isEnabled()) {
            f = (this.f17193b && z && view.isClickable()) ? this.f17195d : 1.0f;
        } else if (!this.f17194c) {
            return;
        } else {
            f = this.f17196e;
        }
        view2.setAlpha(f);
    }

    /* renamed from: c */
    public final void m2816c(boolean z) {
        this.f17194c = z;
        View view = this.f17192a.get();
        if (view != null) {
            m2818a(view, view.isEnabled());
        }
    }
}
