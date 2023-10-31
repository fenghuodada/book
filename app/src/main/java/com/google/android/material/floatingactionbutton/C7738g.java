package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

@RequiresApi(21)
/* renamed from: com.google.android.material.floatingactionbutton.g */
/* loaded from: classes3.dex */
public final class C7738g extends C7726d {
    @Nullable

    /* renamed from: I */
    public StateListAnimator f15005I;

    public C7738g(FloatingActionButton floatingActionButton, FloatingActionButton.C7721b c7721b) {
        super(floatingActionButton, c7721b);
    }

    @Override // com.google.android.material.floatingactionbutton.C7726d
    /* renamed from: e */
    public final float mo4543e() {
        return this.f14981q.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C7726d
    /* renamed from: f */
    public final void mo4542f(@NonNull Rect rect) {
        boolean z;
        if (FloatingActionButton.this.f14940j) {
            super.mo4542f(rect);
            return;
        }
        boolean z2 = this.f14966b;
        int i = 0;
        FloatingActionButton floatingActionButton = this.f14981q;
        if (z2 && floatingActionButton.getSizeDimension() < 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i = (0 - floatingActionButton.getSizeDimension()) / 2;
        }
        rect.set(i, i, i, i);
    }

    @Override // com.google.android.material.floatingactionbutton.C7726d
    /* renamed from: g */
    public final void mo4541g() {
    }

    @Override // com.google.android.material.floatingactionbutton.C7726d
    /* renamed from: h */
    public final void mo4540h() {
        m4547n();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.C7726d
    /* renamed from: i */
    public final void mo4539i(int[] iArr) {
    }

    @Override // com.google.android.material.floatingactionbutton.C7726d
    /* renamed from: j */
    public final void mo4538j(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f14981q;
        if (floatingActionButton.getStateListAnimator() == this.f15005I) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C7726d.f14956C, m4535o(f, f3));
            stateListAnimator.addState(C7726d.f14957D, m4535o(f, f2));
            stateListAnimator.addState(C7726d.f14958E, m4535o(f, f2));
            stateListAnimator.addState(C7726d.f14959F, m4535o(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C7726d.f14962x);
            stateListAnimator.addState(C7726d.f14960G, animatorSet);
            stateListAnimator.addState(C7726d.f14961H, m4535o(0.0f, 0.0f));
            this.f15005I = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (!m4534p()) {
            return;
        }
        m4547n();
        throw null;
    }

    @Override // com.google.android.material.floatingactionbutton.C7726d
    /* renamed from: l */
    public final void mo4537l() {
    }

    @Override // com.google.android.material.floatingactionbutton.C7726d
    /* renamed from: m */
    public final void mo4536m() {
    }

    @NonNull
    /* renamed from: o */
    public final AnimatorSet m4535o(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f14981q;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(C7726d.f14962x);
        return animatorSet;
    }

    /* renamed from: p */
    public final boolean m4534p() {
        boolean z;
        if (FloatingActionButton.this.f14940j) {
            return true;
        }
        if (this.f14966b && this.f14981q.getSizeDimension() < 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return false;
    }
}
