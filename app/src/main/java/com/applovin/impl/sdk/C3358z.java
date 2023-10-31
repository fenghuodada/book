package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.mediation.p011a.AbstractC2827e;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.z */
/* loaded from: classes.dex */
public class C3358z {

    /* renamed from: a */
    private final C3214m f8848a;

    /* renamed from: b */
    private final C3349v f8849b;

    /* renamed from: c */
    private final View f8850c;

    public C3358z(View view, C3214m c3214m) {
        this.f8848a = c3214m;
        this.f8849b = c3214m.m7487A();
        this.f8850c = view;
    }

    /* renamed from: a */
    public long m6825a(AbstractC2827e abstractC2827e) {
        long j;
        if (C3349v.m6862a()) {
            this.f8849b.m6855b("ViewabilityTracker", "Checking visibility...");
        }
        if (this.f8850c.isShown()) {
            j = 0;
        } else {
            if (C3349v.m6862a()) {
                this.f8849b.m6850e("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.f8850c.getAlpha() < abstractC2827e.m8750E()) {
            if (C3349v.m6862a()) {
                this.f8849b.m6850e("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.f8850c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (C3349v.m6862a()) {
                this.f8849b.m6850e("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.f8850c.getParent() == null) {
            if (C3349v.m6862a()) {
                this.f8849b.m6850e("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f8850c.getContext(), this.f8850c.getWidth());
        if (pxToDp < abstractC2827e.m8752C()) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f8849b;
                c3349v.m6850e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f8850c.getContext(), this.f8850c.getHeight());
        if (pxToDp2 < abstractC2827e.m8751D()) {
            if (C3349v.m6862a()) {
                C3349v c3349v2 = this.f8849b;
                c3349v2.m6850e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Point m7027a = C3294g.m7027a(this.f8850c.getContext());
        Rect rect = new Rect(0, 0, m7027a.x, m7027a.y);
        int[] iArr = {-1, -1};
        this.f8850c.getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect2 = new Rect(i, iArr[1], this.f8850c.getWidth() + i, this.f8850c.getHeight() + iArr[1]);
        if (!Rect.intersects(rect, rect2)) {
            if (C3349v.m6862a()) {
                C3349v c3349v3 = this.f8849b;
                c3349v3.m6850e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity m8070a = this.f8848a.m7434af().m8070a();
        if (m8070a != null && !Utils.isViewInTopActivity(this.f8850c, m8070a)) {
            if (C3349v.m6862a()) {
                this.f8849b.m6850e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v4 = this.f8849b;
            c3349v4.m6855b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}
