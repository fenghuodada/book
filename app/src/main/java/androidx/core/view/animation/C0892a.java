package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.PathInterpolator;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* renamed from: androidx.core.view.animation.a */
/* loaded from: classes.dex */
public final class C0892a {
    @DoNotInline
    /* renamed from: a */
    public static PathInterpolator m11538a(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    @DoNotInline
    /* renamed from: b */
    public static PathInterpolator m11537b(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    @DoNotInline
    /* renamed from: c */
    public static PathInterpolator m11536c(Path path) {
        return new PathInterpolator(path);
    }
}
