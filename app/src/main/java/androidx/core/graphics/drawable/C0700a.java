package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
/* loaded from: classes.dex */
public final class C0700a {

    @RequiresApi(19)
    /* renamed from: androidx.core.graphics.drawable.a$a */
    /* loaded from: classes.dex */
    public static class C0701a {
        @DoNotInline
        /* renamed from: a */
        public static int m11936a(Drawable drawable) {
            return drawable.getAlpha();
        }

        @DoNotInline
        /* renamed from: b */
        public static Drawable m11935b(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        @DoNotInline
        /* renamed from: c */
        public static Drawable m11934c(InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m11933d(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m11932e(Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.graphics.drawable.a$b */
    /* loaded from: classes.dex */
    public static class C0702b {
        @DoNotInline
        /* renamed from: a */
        public static void m11931a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m11930b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @DoNotInline
        /* renamed from: c */
        public static ColorFilter m11929c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @DoNotInline
        /* renamed from: d */
        public static void m11928d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @DoNotInline
        /* renamed from: e */
        public static void m11927e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m11926f(Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m11925g(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m11924h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m11923i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.core.graphics.drawable.a$c */
    /* loaded from: classes.dex */
    public static class C0703c {
        @DoNotInline
        /* renamed from: a */
        public static int m11922a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m11921b(Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }
    }

    /* renamed from: a */
    public static void m11939a(@NonNull Drawable drawable, @ColorInt int i) {
        C0702b.m11925g(drawable, i);
    }

    /* renamed from: b */
    public static void m11938b(@NonNull Drawable drawable, @Nullable ColorStateList colorStateList) {
        C0702b.m11924h(drawable, colorStateList);
    }

    /* renamed from: c */
    public static void m11937c(@NonNull Drawable drawable, @Nullable PorterDuff.Mode mode) {
        C0702b.m11923i(drawable, mode);
    }
}
