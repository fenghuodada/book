package androidx.appcompat.text;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.Locale;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.text.a */
/* loaded from: classes.dex */
public final class C0177a implements TransformationMethod {

    /* renamed from: a */
    public final Locale f505a;

    public C0177a(Context context) {
        this.f505a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f505a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
