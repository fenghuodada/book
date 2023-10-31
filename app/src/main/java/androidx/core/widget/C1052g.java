package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.core.widget.g */
/* loaded from: classes.dex */
public final class C1052g {
    @DoNotInline
    /* renamed from: a */
    public static ColorStateList m11255a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    @DoNotInline
    /* renamed from: b */
    public static PorterDuff.Mode m11254b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    @DoNotInline
    /* renamed from: c */
    public static void m11253c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    @DoNotInline
    /* renamed from: d */
    public static void m11252d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
