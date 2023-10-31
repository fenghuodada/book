package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.animation.C7556a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.material.bottomsheet.d */
/* loaded from: classes3.dex */
public final class C7610d extends WindowInsetsAnimationCompat.Callback {

    /* renamed from: c */
    public final View f14519c;

    /* renamed from: d */
    public int f14520d;

    /* renamed from: e */
    public int f14521e;

    /* renamed from: f */
    public final int[] f14522f;

    public C7610d(View view) {
        super(0);
        this.f14522f = new int[2];
        this.f14519c = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    /* renamed from: a */
    public final void mo4733a() {
        this.f14519c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    /* renamed from: b */
    public final void mo4732b() {
        View view = this.f14519c;
        int[] iArr = this.f14522f;
        view.getLocationOnScreen(iArr);
        this.f14520d = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    /* renamed from: c */
    public final WindowInsetsCompat mo2837c(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
        Iterator<WindowInsetsAnimationCompat> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WindowInsetsAnimationCompat next = it.next();
            if ((next.f2537a.mo11645c() & 8) != 0) {
                int i = this.f14521e;
                float mo11646b = next.f2537a.mo11646b();
                LinearInterpolator linearInterpolator = C7556a.f14282a;
                this.f14519c.setTranslationY(Math.round(mo11646b * (0 - i)) + i);
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    @NonNull
    /* renamed from: d */
    public final WindowInsetsAnimationCompat.C0830a mo4731d(@NonNull WindowInsetsAnimationCompat.C0830a c0830a) {
        View view = this.f14519c;
        int[] iArr = this.f14522f;
        view.getLocationOnScreen(iArr);
        int i = this.f14520d - iArr[1];
        this.f14521e = i;
        view.setTranslationY(i);
        return c0830a;
    }
}
