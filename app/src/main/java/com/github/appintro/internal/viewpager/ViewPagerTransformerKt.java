package com.github.appintro.internal.viewpager;

import android.view.View;
import kotlin.Metadata;

@Metadata(m509d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\"\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u00038\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0005\"(\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00038B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m508d2 = {"Landroid/view/View;", "Lkotlin/p;", "transformDefaults", "", "MIN_SCALE_DEPTH", "F", "MIN_SCALE_ZOOM", "MIN_ALPHA_ZOOM", "SCALE_FACTOR_SLIDE", "MIN_ALPHA_SLIDE", "FLOW_ROTATION_ANGLE", "value", "getScaleXY", "(Landroid/view/View;)F", "setScaleXY", "(Landroid/view/View;F)V", "scaleXY", "appintro_release"}, m507k = 2, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class ViewPagerTransformerKt {
    private static final float FLOW_ROTATION_ANGLE = -30.0f;
    private static final float MIN_ALPHA_SLIDE = 0.35f;
    private static final float MIN_ALPHA_ZOOM = 0.5f;
    private static final float MIN_SCALE_DEPTH = 0.75f;
    private static final float MIN_SCALE_ZOOM = 0.85f;
    private static final float SCALE_FACTOR_SLIDE = 0.85f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getScaleXY(View view) {
        return view.getScaleX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setScaleXY(View view, float f) {
        view.setScaleX(f);
        view.setScaleY(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void transformDefaults(View view) {
        view.setAlpha(1.0f);
        setScaleXY(view, 1.0f);
        view.setTranslationX(0.0f);
    }
}
