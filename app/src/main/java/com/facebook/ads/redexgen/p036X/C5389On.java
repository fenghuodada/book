package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.On */
/* loaded from: assets/audience_network.dex */
public class C5389On extends AnimatorListenerAdapter {
    public static String[] A02 = {"R9x3aA0CxKnsz3as3yTNo", "wj3", "QXJ1VvuxLHED1mtMWLYdqrUglWa9lzRq", "lkNOeAB6Ljcfoc1GYo9neKrfDLaf7fDy", "DjE9g1oV3RhQW9", "kuoJdNjNcIUcz8fbOu7oHrt", "PXWkVVH6OcZLxwrP3oXHVUdgM2dUbdjZ", "8PrLrYluZp2AIaWhf9UgS"};
    public final /* synthetic */ C5635Sm A00;
    public final /* synthetic */ boolean A01;

    public C5389On(C5635Sm c5635Sm, boolean z) {
        this.A00 = c5635Sm;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C5392Oq c5392Oq;
        C5663TE c5663te;
        C5663TE c5663te2;
        super.onAnimationEnd(animator);
        c5392Oq = this.A00.A0F;
        c5392Oq.setTranslationY(0.0f);
        this.A00.A0H();
        if (this.A01) {
            return;
        }
        c5663te = this.A00.A0D;
        if (c5663te != null) {
            C5635Sm c5635Sm = this.A00;
            String[] strArr = A02;
            if (strArr[2].charAt(23) != strArr[6].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[2] = "czZD1KZ4paLzcRsa7FTotpjgHmPZqDaL";
            strArr2[6] = "ekjCDFK0XFV5sAsD0BjD76lgNibQF4SI";
            c5663te2 = c5635Sm.A0D;
            c5663te2.destroy();
        }
    }
}
