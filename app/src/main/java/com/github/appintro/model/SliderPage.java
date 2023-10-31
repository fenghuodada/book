package com.github.appintro.model;

import android.os.Bundle;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import androidx.constraintlayout.core.widgets.C0539e;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.google.android.gms.ads.AdRequest;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B}\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\u0006\u0012\b\b\u0003\u0010\n\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0006¢\u0006\u0002\u0010\u0010J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00103\u001a\u00020\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\rHÆ\u0003J\u007f\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u00062\b\b\u0003\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0003\u0010\u000f\u001a\u00020\u0006HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0006HÖ\u0001J\u0006\u0010A\u001a\u00020BJ\t\u0010C\u001a\u00020\rHÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001f\"\u0004\b!\u0010\"R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u0013\u0010+\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b,\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010\"R\u001a\u0010\n\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u0014¨\u0006D"}, m508d2 = {"Lcom/github/appintro/model/SliderPage;", "", AppIntroBaseFragmentKt.ARG_TITLE, "", "description", "imageDrawable", "", "backgroundColor", "titleColor", "descriptionColor", "titleTypefaceFontRes", "descriptionTypefaceFontRes", "titleTypeface", "", "descriptionTypeface", "backgroundDrawable", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIIIIILjava/lang/String;Ljava/lang/String;I)V", "getBackgroundColor", "()I", "setBackgroundColor", "(I)V", "getBackgroundDrawable", "setBackgroundDrawable", "getDescription", "()Ljava/lang/CharSequence;", "setDescription", "(Ljava/lang/CharSequence;)V", "getDescriptionColor", "setDescriptionColor", "descriptionString", "getDescriptionString", "()Ljava/lang/String;", "getDescriptionTypeface", "setDescriptionTypeface", "(Ljava/lang/String;)V", "getDescriptionTypefaceFontRes", "setDescriptionTypefaceFontRes", "getImageDrawable", "setImageDrawable", "getTitle", "setTitle", "getTitleColor", "setTitleColor", "titleString", "getTitleString", "getTitleTypeface", "setTitleTypeface", "getTitleTypefaceFontRes", "setTitleTypefaceFontRes", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toBundle", "Landroid/os/Bundle;", "toString", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class SliderPage {
    private int backgroundColor;
    private int backgroundDrawable;
    @Nullable
    private CharSequence description;
    private int descriptionColor;
    @Nullable
    private String descriptionTypeface;
    private int descriptionTypefaceFontRes;
    private int imageDrawable;
    @Nullable
    private CharSequence title;
    private int titleColor;
    @Nullable
    private String titleTypeface;
    private int titleTypefaceFontRes;

    @JvmOverloads
    public SliderPage() {
        this(null, null, 0, 0, 0, 0, 0, 0, null, null, 0, 2047, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence) {
        this(charSequence, null, 0, 0, 0, 0, 0, 0, null, null, 0, 2046, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        this(charSequence, charSequence2, 0, 0, 0, 0, 0, 0, null, null, 0, 2044, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i) {
        this(charSequence, charSequence2, i, 0, 0, 0, 0, 0, null, null, 0, 2040, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2) {
        this(charSequence, charSequence2, i, i2, 0, 0, 0, 0, null, null, 0, 2032, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3) {
        this(charSequence, charSequence2, i, i2, i3, 0, 0, 0, null, null, 0, 2016, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        this(charSequence, charSequence2, i, i2, i3, i4, 0, 0, null, null, 0, 1984, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5) {
        this(charSequence, charSequence2, i, i2, i3, i4, i5, 0, null, null, 0, 1920, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5, @FontRes int i6) {
        this(charSequence, charSequence2, i, i2, i3, i4, i5, i6, null, null, 0, 1792, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5, @FontRes int i6, @Nullable String str) {
        this(charSequence, charSequence2, i, i2, i3, i4, i5, i6, str, null, 0, 1536, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5, @FontRes int i6, @Nullable String str, @Nullable String str2) {
        this(charSequence, charSequence2, i, i2, i3, i4, i5, i6, str, str2, 0, 1024, null);
    }

    @JvmOverloads
    public SliderPage(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5, @FontRes int i6, @Nullable String str, @Nullable String str2, @DrawableRes int i7) {
        this.title = charSequence;
        this.description = charSequence2;
        this.imageDrawable = i;
        this.backgroundColor = i2;
        this.titleColor = i3;
        this.descriptionColor = i4;
        this.titleTypefaceFontRes = i5;
        this.descriptionTypefaceFontRes = i6;
        this.titleTypeface = str;
        this.descriptionTypeface = str2;
        this.backgroundDrawable = i7;
    }

    public /* synthetic */ SliderPage(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, int i4, int i5, int i6, String str, String str2, int i7, int i8, C10839f c10839f) {
        this((i8 & 1) != 0 ? null : charSequence, (i8 & 2) != 0 ? null : charSequence2, (i8 & 4) != 0 ? 0 : i, (i8 & 8) != 0 ? 0 : i2, (i8 & 16) != 0 ? 0 : i3, (i8 & 32) != 0 ? 0 : i4, (i8 & 64) != 0 ? 0 : i5, (i8 & 128) != 0 ? 0 : i6, (i8 & 256) != 0 ? null : str, (i8 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? str2 : null, (i8 & 1024) == 0 ? i7 : 0);
    }

    @Nullable
    public final CharSequence component1() {
        return this.title;
    }

    @Nullable
    public final String component10() {
        return this.descriptionTypeface;
    }

    public final int component11() {
        return this.backgroundDrawable;
    }

    @Nullable
    public final CharSequence component2() {
        return this.description;
    }

    public final int component3() {
        return this.imageDrawable;
    }

    public final int component4() {
        return this.backgroundColor;
    }

    public final int component5() {
        return this.titleColor;
    }

    public final int component6() {
        return this.descriptionColor;
    }

    public final int component7() {
        return this.titleTypefaceFontRes;
    }

    public final int component8() {
        return this.descriptionTypefaceFontRes;
    }

    @Nullable
    public final String component9() {
        return this.titleTypeface;
    }

    @NotNull
    public final SliderPage copy(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5, @FontRes int i6, @Nullable String str, @Nullable String str2, @DrawableRes int i7) {
        return new SliderPage(charSequence, charSequence2, i, i2, i3, i4, i5, i6, str, str2, i7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof SliderPage) {
                SliderPage sliderPage = (SliderPage) obj;
                return C10843j.m435a(this.title, sliderPage.title) && C10843j.m435a(this.description, sliderPage.description) && this.imageDrawable == sliderPage.imageDrawable && this.backgroundColor == sliderPage.backgroundColor && this.titleColor == sliderPage.titleColor && this.descriptionColor == sliderPage.descriptionColor && this.titleTypefaceFontRes == sliderPage.titleTypefaceFontRes && this.descriptionTypefaceFontRes == sliderPage.descriptionTypefaceFontRes && C10843j.m435a(this.titleTypeface, sliderPage.titleTypeface) && C10843j.m435a(this.descriptionTypeface, sliderPage.descriptionTypeface) && this.backgroundDrawable == sliderPage.backgroundDrawable;
            }
            return false;
        }
        return true;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    @Nullable
    public final CharSequence getDescription() {
        return this.description;
    }

    public final int getDescriptionColor() {
        return this.descriptionColor;
    }

    @Nullable
    public final String getDescriptionString() {
        CharSequence charSequence = this.description;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Nullable
    public final String getDescriptionTypeface() {
        return this.descriptionTypeface;
    }

    public final int getDescriptionTypefaceFontRes() {
        return this.descriptionTypefaceFontRes;
    }

    public final int getImageDrawable() {
        return this.imageDrawable;
    }

    @Nullable
    public final CharSequence getTitle() {
        return this.title;
    }

    public final int getTitleColor() {
        return this.titleColor;
    }

    @Nullable
    public final String getTitleString() {
        CharSequence charSequence = this.title;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Nullable
    public final String getTitleTypeface() {
        return this.titleTypeface;
    }

    public final int getTitleTypefaceFontRes() {
        return this.titleTypefaceFontRes;
    }

    public int hashCode() {
        CharSequence charSequence = this.title;
        int hashCode = (charSequence != null ? charSequence.hashCode() : 0) * 31;
        CharSequence charSequence2 = this.description;
        int hashCode2 = (((((((((((((hashCode + (charSequence2 != null ? charSequence2.hashCode() : 0)) * 31) + this.imageDrawable) * 31) + this.backgroundColor) * 31) + this.titleColor) * 31) + this.descriptionColor) * 31) + this.titleTypefaceFontRes) * 31) + this.descriptionTypefaceFontRes) * 31;
        String str = this.titleTypeface;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.descriptionTypeface;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.backgroundDrawable;
    }

    public final void setBackgroundColor(int i) {
        this.backgroundColor = i;
    }

    public final void setBackgroundDrawable(int i) {
        this.backgroundDrawable = i;
    }

    public final void setDescription(@Nullable CharSequence charSequence) {
        this.description = charSequence;
    }

    public final void setDescriptionColor(int i) {
        this.descriptionColor = i;
    }

    public final void setDescriptionTypeface(@Nullable String str) {
        this.descriptionTypeface = str;
    }

    public final void setDescriptionTypefaceFontRes(int i) {
        this.descriptionTypefaceFontRes = i;
    }

    public final void setImageDrawable(int i) {
        this.imageDrawable = i;
    }

    public final void setTitle(@Nullable CharSequence charSequence) {
        this.title = charSequence;
    }

    public final void setTitleColor(int i) {
        this.titleColor = i;
    }

    public final void setTitleTypeface(@Nullable String str) {
        this.titleTypeface = str;
    }

    public final void setTitleTypefaceFontRes(int i) {
        this.titleTypefaceFontRes = i;
    }

    @NotNull
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString(AppIntroBaseFragmentKt.ARG_TITLE, getTitleString());
        bundle.putString(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE, this.titleTypeface);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_TITLE_TYPEFACE_RES, this.titleTypefaceFontRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_TITLE_COLOR, this.titleColor);
        bundle.putString(AppIntroBaseFragmentKt.ARG_DESC, getDescriptionString());
        bundle.putString(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE, this.descriptionTypeface);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DESC_TYPEFACE_RES, this.descriptionTypefaceFontRes);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DESC_COLOR, this.descriptionColor);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_DRAWABLE, this.imageDrawable);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_BG_COLOR, this.backgroundColor);
        bundle.putInt(AppIntroBaseFragmentKt.ARG_BG_DRAWABLE, this.backgroundDrawable);
        return bundle;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SliderPage(title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", imageDrawable=");
        sb.append(this.imageDrawable);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", titleColor=");
        sb.append(this.titleColor);
        sb.append(", descriptionColor=");
        sb.append(this.descriptionColor);
        sb.append(", titleTypefaceFontRes=");
        sb.append(this.titleTypefaceFontRes);
        sb.append(", descriptionTypefaceFontRes=");
        sb.append(this.descriptionTypefaceFontRes);
        sb.append(", titleTypeface=");
        sb.append(this.titleTypeface);
        sb.append(", descriptionTypeface=");
        sb.append(this.descriptionTypeface);
        sb.append(", backgroundDrawable=");
        return C0539e.m12264b(sb, this.backgroundDrawable, ")");
    }
}
