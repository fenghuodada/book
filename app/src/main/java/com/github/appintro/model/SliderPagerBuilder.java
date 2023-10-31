package com.github.appintro.model;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import com.github.appintro.AppIntroBaseFragmentKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u0004R\u0012\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m508d2 = {"Lcom/github/appintro/model/SliderPagerBuilder;", "", "()V", "backgroundColor", "", "backgroundDrawable", "description", "", "descriptionColor", "descriptionTypeface", "", "descriptionTypefaceFontRes", "imageDrawable", AppIntroBaseFragmentKt.ARG_TITLE, "titleColor", "titleTypeface", "titleTypefaceFontRes", "build", "Lcom/github/appintro/model/SliderPage;", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class SliderPagerBuilder {
    @ColorInt
    private int backgroundColor;
    @DrawableRes
    private int backgroundDrawable;
    private CharSequence description;
    @ColorInt
    private int descriptionColor;
    private String descriptionTypeface;
    @FontRes
    private int descriptionTypefaceFontRes;
    @DrawableRes
    private int imageDrawable;
    private CharSequence title;
    @ColorInt
    private int titleColor;
    private String titleTypeface;
    @FontRes
    private int titleTypefaceFontRes;

    @NotNull
    public final SliderPagerBuilder backgroundColor(@ColorInt int i) {
        this.backgroundColor = i;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder backgroundDrawable(@DrawableRes int i) {
        this.backgroundDrawable = i;
        return this;
    }

    @NotNull
    public final SliderPage build() {
        CharSequence charSequence = this.title;
        CharSequence charSequence2 = this.description;
        int i = this.imageDrawable;
        int i2 = this.backgroundColor;
        int i3 = this.titleColor;
        int i4 = this.descriptionColor;
        int i5 = this.titleTypefaceFontRes;
        String str = this.descriptionTypeface;
        return new SliderPage(charSequence, charSequence2, i, i2, i3, i4, i5, this.descriptionTypefaceFontRes, this.titleTypeface, str, this.backgroundDrawable);
    }

    @NotNull
    public final SliderPagerBuilder description(@NotNull CharSequence description) {
        C10843j.m430f(description, "description");
        this.description = description;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder descriptionColor(@ColorInt int i) {
        this.descriptionColor = i;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder descriptionTypeface(@NotNull String descriptionTypeface) {
        C10843j.m430f(descriptionTypeface, "descriptionTypeface");
        this.descriptionTypeface = descriptionTypeface;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder descriptionTypefaceFontRes(@FontRes int i) {
        this.descriptionTypefaceFontRes = i;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder imageDrawable(@DrawableRes int i) {
        this.imageDrawable = i;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder title(@NotNull CharSequence title) {
        C10843j.m430f(title, "title");
        this.title = title;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder titleColor(@ColorInt int i) {
        this.titleColor = i;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder titleTypeface(@NotNull String titleTypeface) {
        C10843j.m430f(titleTypeface, "titleTypeface");
        this.titleTypeface = titleTypeface;
        return this;
    }

    @NotNull
    public final SliderPagerBuilder titleTypefaceFontRes(@FontRes int i) {
        this.titleTypefaceFontRes = i;
        return this;
    }
}
