package com.github.appintro.internal.viewpager;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.github.appintro.AppIntroPageTransformerType;
import com.github.appintro.C6356R;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m509d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m508d2 = {"Lcom/github/appintro/internal/viewpager/ViewPagerTransformer;", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "Landroid/view/View;", "page", "Lkotlin/p;", "transformParallax", "applyParallax", "", "parallaxFactor", "computeParallax", "transformFade", "transformZoom", "transformDepth", "transformSlideOver", "transformPage", "titlePF", "D", "imagePF", "descriptionPF", "Lcom/github/appintro/AppIntroPageTransformerType;", "transformType", "Lcom/github/appintro/AppIntroPageTransformerType;", "<init>", "(Lcom/github/appintro/AppIntroPageTransformerType;)V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class ViewPagerTransformer implements ViewPager.InterfaceC1816j {
    private double descriptionPF;
    private double imagePF;
    private double titlePF;
    private final AppIntroPageTransformerType transformType;

    public ViewPagerTransformer(@NotNull AppIntroPageTransformerType transformType) {
        C10843j.m430f(transformType, "transformType");
        this.transformType = transformType;
    }

    private final void applyParallax(View view, float f) {
        View findViewById = view.findViewById(C6356R.C6359id.title);
        C10843j.m431e(findViewById, "page.findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setTranslationX(computeParallax(view, f, this.titlePF));
        View findViewById2 = view.findViewById(C6356R.C6359id.image);
        C10843j.m431e(findViewById2, "page.findViewById<ImageView>(R.id.image)");
        ((ImageView) findViewById2).setTranslationX(computeParallax(view, f, this.imagePF));
        View findViewById3 = view.findViewById(C6356R.C6359id.description);
        C10843j.m431e(findViewById3, "page.findViewById<TextView>(R.id.description)");
        ((TextView) findViewById3).setTranslationX(computeParallax(view, f, this.descriptionPF));
    }

    private final float computeParallax(View view, float f, double d) {
        return (float) ((view.getWidth() / d) * (-f));
    }

    private final void transformDepth(float f, View view) {
        if (f > 0) {
            float f2 = 1;
            if (f < f2) {
                view.setAlpha(f2 - f);
                ViewPagerTransformerKt.setScaleXY(view, ((f2 - Math.abs(f)) * 0.25f) + 0.75f);
                view.setTranslationX(view.getWidth() * (-f));
                return;
            }
        }
        ViewPagerTransformerKt.transformDefaults(view);
    }

    private final void transformFade(float f, View view) {
        boolean z;
        if (f <= -1.0f || f >= 1.0f) {
            view.setTranslationX(view.getWidth());
            view.setAlpha(0.0f);
            z = false;
        } else if (f != 0.0f) {
            view.setTranslationX(view.getWidth() * (-f));
            view.setAlpha(1.0f - Math.abs(f));
            return;
        } else {
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
            z = true;
        }
        view.setClickable(z);
    }

    private final void transformParallax(float f, View view) {
        if (f <= -1 || f >= 1) {
            return;
        }
        try {
            applyParallax(view, f);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private final void transformSlideOver(float f, View view) {
        if (f >= 0 || f <= -1) {
            ViewPagerTransformerKt.transformDefaults(view);
            return;
        }
        float f2 = 1;
        ViewPagerTransformerKt.setScaleXY(view, (Math.abs(Math.abs(f) - f2) * 0.14999998f) + 0.85f);
        view.setAlpha(Math.max(0.35f, f2 - Math.abs(f)));
        float f3 = -view.getWidth();
        float f4 = f * f3;
        if (f4 <= f3) {
            f4 = 0.0f;
        }
        view.setTranslationX(f4);
    }

    private final void transformZoom(float f, View view) {
        float scaleXY;
        float scaleXY2;
        float scaleXY3;
        if (f >= -1) {
            float f2 = 1;
            if (f <= f2) {
                ViewPagerTransformerKt.setScaleXY(view, Math.max(0.85f, f2 - Math.abs(f)));
                scaleXY = ViewPagerTransformerKt.getScaleXY(view);
                view.setAlpha((((scaleXY - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
                scaleXY2 = ViewPagerTransformerKt.getScaleXY(view);
                float f3 = 2;
                float height = ((f2 - scaleXY2) * view.getHeight()) / f3;
                scaleXY3 = ViewPagerTransformerKt.getScaleXY(view);
                float width = ((f2 - scaleXY3) * view.getWidth()) / f3;
                if (f < 0) {
                    view.setTranslationX(width - (height / f3));
                    return;
                }
                view.setTranslationX((height / f3) + (-width));
                return;
            }
        }
        ViewPagerTransformerKt.transformDefaults(view);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC1816j
    public void transformPage(@NotNull View page, float f) {
        C10843j.m430f(page, "page");
        AppIntroPageTransformerType appIntroPageTransformerType = this.transformType;
        if (C10843j.m435a(appIntroPageTransformerType, AppIntroPageTransformerType.Flow.INSTANCE)) {
            page.setRotationY(f * (-30.0f));
        } else if (C10843j.m435a(appIntroPageTransformerType, AppIntroPageTransformerType.SlideOver.INSTANCE)) {
            transformSlideOver(f, page);
        } else if (C10843j.m435a(appIntroPageTransformerType, AppIntroPageTransformerType.Depth.INSTANCE)) {
            transformDepth(f, page);
        } else if (C10843j.m435a(appIntroPageTransformerType, AppIntroPageTransformerType.Zoom.INSTANCE)) {
            transformZoom(f, page);
        } else if (C10843j.m435a(appIntroPageTransformerType, AppIntroPageTransformerType.Fade.INSTANCE)) {
            transformFade(f, page);
        } else if (appIntroPageTransformerType instanceof AppIntroPageTransformerType.Parallax) {
            this.titlePF = ((AppIntroPageTransformerType.Parallax) this.transformType).getTitleParallaxFactor();
            this.imagePF = ((AppIntroPageTransformerType.Parallax) this.transformType).getImageParallaxFactor();
            this.descriptionPF = ((AppIntroPageTransformerType.Parallax) this.transformType).getDescriptionParallaxFactor();
            transformParallax(f, page);
        }
    }
}
