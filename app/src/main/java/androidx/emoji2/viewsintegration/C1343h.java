package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.emoji2.viewsintegration.h */
/* loaded from: classes.dex */
public final class C1343h implements TransformationMethod {
    @Nullable

    /* renamed from: a */
    public final TransformationMethod f3251a;

    public C1343h(@Nullable TransformationMethod transformationMethod) {
        this.f3251a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(@Nullable CharSequence charSequence, @NonNull View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f3251a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && EmojiCompat.m10693a().m10692b() == 1) {
            EmojiCompat m10693a = EmojiCompat.m10693a();
            m10693a.getClass();
            return m10693a.m10688f(0, charSequence.length(), charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f3251a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
