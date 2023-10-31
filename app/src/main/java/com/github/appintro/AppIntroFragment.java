package com.github.appintro;

import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FontRes;
import com.github.appintro.model.SliderPage;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.C10839f;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m508d2 = {"Lcom/github/appintro/AppIntroFragment;", "Lcom/github/appintro/AppIntroBaseFragment;", "()V", "layoutId", "", "getLayoutId", "()I", "Companion", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class AppIntroFragment extends AppIntroBaseFragment {
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m510bv = {1, 0, 3}, m509d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007Jf\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u000b2\b\b\u0003\u0010\u000e\u001a\u00020\u000b2\b\b\u0003\u0010\u000f\u001a\u00020\u000b2\b\b\u0003\u0010\u0010\u001a\u00020\u000b2\b\b\u0003\u0010\u0011\u001a\u00020\u000bH\u0007¨\u0006\u0012"}, m508d2 = {"Lcom/github/appintro/AppIntroFragment$Companion;", "", "()V", "newInstance", "Lcom/github/appintro/AppIntroFragment;", "sliderPage", "Lcom/github/appintro/model/SliderPage;", AppIntroBaseFragmentKt.ARG_TITLE, "", "description", "imageDrawable", "", "backgroundColor", "titleColor", "descriptionColor", "titleTypefaceFontRes", "descriptionTypefaceFontRes", "backgroundDrawable", "appintro_release"}, m507k = 1, m506mv = {1, 4, 1})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10839f c10839f) {
            this();
        }

        public static /* synthetic */ AppIntroFragment newInstance$default(Companion companion, CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                charSequence = null;
            }
            if ((i8 & 2) != 0) {
                charSequence2 = null;
            }
            if ((i8 & 4) != 0) {
                i = 0;
            }
            if ((i8 & 8) != 0) {
                i2 = 0;
            }
            if ((i8 & 16) != 0) {
                i3 = 0;
            }
            if ((i8 & 32) != 0) {
                i4 = 0;
            }
            if ((i8 & 64) != 0) {
                i5 = 0;
            }
            if ((i8 & 128) != 0) {
                i6 = 0;
            }
            if ((i8 & 256) != 0) {
                i7 = 0;
            }
            return companion.newInstance(charSequence, charSequence2, i, i2, i3, i4, i5, i6, i7);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance() {
            return newInstance$default(this, null, null, 0, 0, 0, 0, 0, 0, 0, 511, null);
        }

        @JvmStatic
        @NotNull
        public final AppIntroFragment newInstance(@NotNull SliderPage sliderPage) {
            C10843j.m430f(sliderPage, "sliderPage");
            AppIntroFragment appIntroFragment = new AppIntroFragment();
            appIntroFragment.setArguments(sliderPage.toBundle());
            return appIntroFragment;
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance(@Nullable CharSequence charSequence) {
            return newInstance$default(this, charSequence, null, 0, 0, 0, 0, 0, 0, 0, 510, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
            return newInstance$default(this, charSequence, charSequence2, 0, 0, 0, 0, 0, 0, 0, 508, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i) {
            return newInstance$default(this, charSequence, charSequence2, i, 0, 0, 0, 0, 0, 0, 504, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2) {
            return newInstance$default(this, charSequence, charSequence2, i, i2, 0, 0, 0, 0, 0, 496, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3) {
            return newInstance$default(this, charSequence, charSequence2, i, i2, i3, 0, 0, 0, 0, 480, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
            return newInstance$default(this, charSequence, charSequence2, i, i2, i3, i4, 0, 0, 0, 448, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5) {
            return newInstance$default(this, charSequence, charSequence2, i, i2, i3, i4, i5, 0, 0, 384, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5, @FontRes int i6) {
            return newInstance$default(this, charSequence, charSequence2, i, i2, i3, i4, i5, i6, 0, 256, null);
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        public final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5, @FontRes int i6, @DrawableRes int i7) {
            return newInstance(new SliderPage(charSequence, charSequence2, i, i2, i3, i4, i5, i6, null, null, i7, 768, null));
        }
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance() {
        return Companion.newInstance$default(Companion, null, null, 0, 0, 0, 0, 0, 0, 0, 511, null);
    }

    @JvmStatic
    @NotNull
    public static final AppIntroFragment newInstance(@NotNull SliderPage sliderPage) {
        return Companion.newInstance(sliderPage);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance(@Nullable CharSequence charSequence) {
        return Companion.newInstance$default(Companion, charSequence, null, 0, 0, 0, 0, 0, 0, 0, 510, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        return Companion.newInstance$default(Companion, charSequence, charSequence2, 0, 0, 0, 0, 0, 0, 0, 508, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i) {
        return Companion.newInstance$default(Companion, charSequence, charSequence2, i, 0, 0, 0, 0, 0, 0, 504, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2) {
        return Companion.newInstance$default(Companion, charSequence, charSequence2, i, i2, 0, 0, 0, 0, 0, 496, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3) {
        return Companion.newInstance$default(Companion, charSequence, charSequence2, i, i2, i3, 0, 0, 0, 0, 480, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        return Companion.newInstance$default(Companion, charSequence, charSequence2, i, i2, i3, i4, 0, 0, 0, 448, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5) {
        return Companion.newInstance$default(Companion, charSequence, charSequence2, i, i2, i3, i4, i5, 0, 0, 384, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5, @FontRes int i6) {
        return Companion.newInstance$default(Companion, charSequence, charSequence2, i, i2, i3, i4, i5, i6, 0, 256, null);
    }

    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final AppIntroFragment newInstance(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, @DrawableRes int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4, @FontRes int i5, @FontRes int i6, @DrawableRes int i7) {
        return Companion.newInstance(charSequence, charSequence2, i, i2, i3, i4, i5, i6, i7);
    }

    @Override // com.github.appintro.AppIntroBaseFragment
    public int getLayoutId() {
        return C6356R.C6361layout.appintro_fragment_intro;
    }
}
