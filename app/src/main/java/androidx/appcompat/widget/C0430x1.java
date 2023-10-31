package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.widget.C0327e0;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.C0676f;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.x1 */
/* loaded from: classes.dex */
public final class C0430x1 {

    /* renamed from: a */
    public final Context f1405a;

    /* renamed from: b */
    public final TypedArray f1406b;

    /* renamed from: c */
    public TypedValue f1407c;

    public C0430x1(Context context, TypedArray typedArray) {
        this.f1405a = context;
        this.f1406b = typedArray;
    }

    /* renamed from: m */
    public static C0430x1 m12465m(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0430x1(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* renamed from: a */
    public final boolean m12477a(int i, boolean z) {
        return this.f1406b.getBoolean(i, z);
    }

    /* renamed from: b */
    public final ColorStateList m12476b(int i) {
        int resourceId;
        ColorStateList m12039b;
        TypedArray typedArray = this.f1406b;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (m12039b = ContextCompat.m12039b(this.f1405a, resourceId)) != null) {
            return m12039b;
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: c */
    public final int m12475c(int i, int i2) {
        return this.f1406b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: d */
    public final int m12474d(int i, int i2) {
        return this.f1406b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: e */
    public final Drawable m12473e(int i) {
        int resourceId;
        TypedArray typedArray = this.f1406b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : C0158a.m12920a(this.f1405a, resourceId);
    }

    /* renamed from: f */
    public final Drawable m12472f(int i) {
        int resourceId;
        Drawable m12594g;
        if (this.f1406b.hasValue(i) && (resourceId = this.f1406b.getResourceId(i, 0)) != 0) {
            C0363j m12615a = C0363j.m12615a();
            Context context = this.f1405a;
            synchronized (m12615a) {
                m12594g = m12615a.f1281a.m12594g(context, resourceId, true);
            }
            return m12594g;
        }
        return null;
    }

    @Nullable
    /* renamed from: g */
    public final Typeface m12471g(@StyleableRes int i, int i2, @Nullable C0327e0.C0328a c0328a) {
        int resourceId = this.f1406b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1407c == null) {
            this.f1407c = new TypedValue();
        }
        TypedValue typedValue = this.f1407c;
        ThreadLocal<TypedValue> threadLocal = C0676f.f2356a;
        Context context = this.f1405a;
        if (context.isRestricted()) {
            return null;
        }
        return C0676f.m11987d(context, resourceId, typedValue, i2, c0328a, true, false);
    }

    /* renamed from: h */
    public final int m12470h(int i, int i2) {
        return this.f1406b.getInt(i, i2);
    }

    /* renamed from: i */
    public final int m12469i(int i, int i2) {
        return this.f1406b.getResourceId(i, i2);
    }

    /* renamed from: j */
    public final String m12468j(int i) {
        return this.f1406b.getString(i);
    }

    /* renamed from: k */
    public final CharSequence m12467k(int i) {
        return this.f1406b.getText(i);
    }

    /* renamed from: l */
    public final boolean m12466l(int i) {
        return this.f1406b.hasValue(i);
    }

    /* renamed from: n */
    public final void m12464n() {
        this.f1406b.recycle();
    }
}
