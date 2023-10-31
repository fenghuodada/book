package com.github.appintro;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FontRes;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import com.github.appintro.internal.TypefaceContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m509d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0011\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u0018\u001a\u00020\u0002J\u0010\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0002J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eR\u001a\u0010 \u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, m508d2 = {"Lcom/github/appintro/AppIntro;", "Lcom/github/appintro/AppIntroBase;", "", "color", "Lkotlin/p;", "setBarColor", "setNextArrowColor", "setBackArrowColor", "setSeparatorColor", "", "text", "setSkipText", "skipResId", "typeface", "setSkipTextTypeface", "", "typeURL", "setDoneText", "doneResId", "setDoneTextTypeface", "colorDoneText", "setColorDoneText", "textAppearance", "setDoneTextAppearance", "colorSkipButton", "setColorSkipButton", "setSkipTextAppearance", "Landroid/graphics/drawable/Drawable;", "imageNextButton", "setImageNextButton", "", "showSeparator", "layoutId", "I", "getLayoutId", "()I", "<init>", "()V", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public abstract class AppIntro extends AppIntroBase {
    private final int layoutId = C6356R.C6361layout.appintro_intro_layout;

    @Override // com.github.appintro.AppIntroBase
    public int getLayoutId() {
        return this.layoutId;
    }

    public final void setBackArrowColor(@ColorInt int i) {
        ((ImageButton) findViewById(C6356R.C6359id.back)).setColorFilter(i);
    }

    public final void setBarColor(@ColorInt int i) {
        findViewById(C6356R.C6359id.bottom).setBackgroundColor(i);
    }

    public final void setColorDoneText(@ColorInt int i) {
        ((TextView) findViewById(C6356R.C6359id.done)).setTextColor(i);
    }

    public final void setColorSkipButton(@ColorInt int i) {
        ((TextView) findViewById(C6356R.C6359id.skip)).setTextColor(i);
    }

    public final void setDoneText(@StringRes int i) {
        ((TextView) findViewById(C6356R.C6359id.done)).setText(i);
    }

    public final void setDoneText(@Nullable CharSequence charSequence) {
        TextView doneText = (TextView) findViewById(C6356R.C6359id.done);
        C10843j.m431e(doneText, "doneText");
        doneText.setText(charSequence);
    }

    public final void setDoneTextAppearance(@StyleRes int i) {
        ((TextView) findViewById(C6356R.C6359id.done)).setTextAppearance(i);
    }

    public final void setDoneTextTypeface(@FontRes int i) {
        new TypefaceContainer(null, i).applyTo((TextView) findViewById(C6356R.C6359id.done));
    }

    public final void setDoneTextTypeface(@Nullable String str) {
        new TypefaceContainer(str, 0).applyTo((TextView) findViewById(C6356R.C6359id.done));
    }

    public final void setImageNextButton(@NotNull Drawable imageNextButton) {
        C10843j.m430f(imageNextButton, "imageNextButton");
        ((ImageView) findViewById(C6356R.C6359id.next)).setImageDrawable(imageNextButton);
    }

    public final void setNextArrowColor(@ColorInt int i) {
        ((ImageButton) findViewById(C6356R.C6359id.next)).setColorFilter(i);
    }

    public final void setSeparatorColor(@ColorInt int i) {
        findViewById(C6356R.C6359id.bottom_separator).setBackgroundColor(i);
    }

    public final void setSkipText(@StringRes int i) {
        ((TextView) findViewById(C6356R.C6359id.skip)).setText(i);
    }

    public final void setSkipText(@Nullable CharSequence charSequence) {
        TextView skipText = (TextView) findViewById(C6356R.C6359id.skip);
        C10843j.m431e(skipText, "skipText");
        skipText.setText(charSequence);
    }

    public final void setSkipTextAppearance(@StyleRes int i) {
        ((TextView) findViewById(C6356R.C6359id.skip)).setTextAppearance(i);
    }

    public final void setSkipTextTypeface(@FontRes int i) {
        new TypefaceContainer(null, i).applyTo((TextView) findViewById(C6356R.C6359id.skip));
    }

    public final void setSkipTextTypeface(@Nullable String str) {
        new TypefaceContainer(str, 0).applyTo((TextView) findViewById(C6356R.C6359id.skip));
    }

    public final void showSeparator(boolean z) {
        View bottomSeparator = findViewById(C6356R.C6359id.bottom_separator);
        C10843j.m431e(bottomSeparator, "bottomSeparator");
        bottomSeparator.setVisibility(z ? 0 : 4);
    }
}
