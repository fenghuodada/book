package com.github.appintro;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.annotation.ColorInt;
import androidx.annotation.IdRes;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0006R\u001a\u0010\u000f\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R.\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006+"}, m508d2 = {"Lcom/github/appintro/AppIntro2;", "Lcom/github/appintro/AppIntroBase;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/p;", "onCreate", "", "color", "setBarColor", "Landroid/graphics/drawable/Drawable;", "imageSkipButton", "setImageSkipButton", "setNextArrowColor", "colorSkipButton", "setSkipArrowColor", "layoutId", "I", "getLayoutId", "()I", "value", "backgroundResource", "Ljava/lang/Integer;", "getBackgroundResource", "()Ljava/lang/Integer;", "setBackgroundResource", "(Ljava/lang/Integer;)V", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "setBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "backgroundFrame", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "bottomBar", "Landroid/view/View;", "Landroid/widget/ImageButton;", "skipImageButton", "Landroid/widget/ImageButton;", "<init>", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public abstract class AppIntro2 extends AppIntroBase {
    @Nullable
    private Drawable backgroundDrawable;
    private ConstraintLayout backgroundFrame;
    @IdRes
    @Nullable
    private Integer backgroundResource;
    private View bottomBar;
    private final int layoutId = C6356R.C6361layout.appintro_intro_layout2;
    private ImageButton skipImageButton;

    @Nullable
    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    @Nullable
    public final Integer getBackgroundResource() {
        return this.backgroundResource;
    }

    @Override // com.github.appintro.AppIntroBase
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // com.github.appintro.AppIntroBase, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0629l, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C6356R.C6359id.background);
        C10843j.m431e(findViewById, "findViewById(R.id.background)");
        this.backgroundFrame = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(C6356R.C6359id.bottom);
        C10843j.m431e(findViewById2, "findViewById(R.id.bottom)");
        this.bottomBar = findViewById2;
        View findViewById3 = findViewById(C6356R.C6359id.skip);
        C10843j.m431e(findViewById3, "findViewById(R.id.skip)");
        this.skipImageButton = (ImageButton) findViewById3;
        if (isRtl$appintro_release()) {
            ImageButton imageButton = this.skipImageButton;
            if (imageButton != null) {
                imageButton.setScaleX(-1.0f);
            } else {
                C10843j.m424l("skipImageButton");
                throw null;
            }
        }
    }

    public final void setBackgroundDrawable(@Nullable Drawable drawable) {
        this.backgroundDrawable = drawable;
        if (drawable != null) {
            ConstraintLayout constraintLayout = this.backgroundFrame;
            if (constraintLayout != null) {
                constraintLayout.setBackground(drawable);
            } else {
                C10843j.m424l("backgroundFrame");
                throw null;
            }
        }
    }

    public final void setBackgroundResource(@Nullable Integer num) {
        this.backgroundResource = num;
        if (num == null || num == null) {
            return;
        }
        int intValue = num.intValue();
        ConstraintLayout constraintLayout = this.backgroundFrame;
        if (constraintLayout != null) {
            constraintLayout.setBackgroundResource(intValue);
        } else {
            C10843j.m424l("backgroundFrame");
            throw null;
        }
    }

    public final void setBarColor(@ColorInt int i) {
        View view = this.bottomBar;
        if (view != null) {
            view.setBackgroundColor(i);
        } else {
            C10843j.m424l("bottomBar");
            throw null;
        }
    }

    public final void setImageSkipButton(@NotNull Drawable imageSkipButton) {
        C10843j.m430f(imageSkipButton, "imageSkipButton");
        ImageButton imageButton = this.skipImageButton;
        if (imageButton != null) {
            imageButton.setImageDrawable(imageSkipButton);
        } else {
            C10843j.m424l("skipImageButton");
            throw null;
        }
    }

    public final void setNextArrowColor(@ColorInt int i) {
        ((ImageButton) findViewById(C6356R.C6359id.next)).setColorFilter(i);
    }

    public final void setSkipArrowColor(@ColorInt int i) {
        ((ImageButton) findViewById(C6356R.C6359id.skip)).setColorFilter(i);
    }
}
