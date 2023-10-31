package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0157c;
import androidx.emoji2.viewsintegration.C1337f;

/* renamed from: androidx.appcompat.widget.m */
/* loaded from: classes.dex */
public final class C0382m {
    @NonNull

    /* renamed from: a */
    public final TextView f1307a;
    @NonNull

    /* renamed from: b */
    public final C1337f f1308b;

    public C0382m(@NonNull TextView textView) {
        this.f1307a = textView;
        this.f1308b = new C1337f(textView);
    }

    @NonNull
    /* renamed from: a */
    public final InputFilter[] m12580a(@NonNull InputFilter[] inputFilterArr) {
        return this.f1308b.f3241a.mo10651a(inputFilterArr);
    }

    /* renamed from: b */
    public final void m12579b(@Nullable AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f1307a.getContext().obtainStyledAttributes(attributeSet, C0157c.f418i, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            m12577d(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public final void m12578c(boolean z) {
        this.f1308b.f3241a.mo10649c(z);
    }

    /* renamed from: d */
    public final void m12577d(boolean z) {
        this.f1308b.f3241a.mo10648d(z);
    }
}
