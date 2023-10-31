package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.content.res.i */
/* loaded from: classes.dex */
public final class C0687i {
    /* renamed from: a */
    public static C0674d m11978a(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @Nullable Resources.Theme theme, @NonNull String str, @StyleableRes int i) {
        C0674d c0674d;
        if (m11974e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new C0674d(null, null, typedValue.data);
            }
            try {
                c0674d = C0674d.m11992a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                c0674d = null;
            }
            if (c0674d != null) {
                return c0674d;
            }
        }
        return new C0674d(null, null, 0);
    }

    /* renamed from: b */
    public static float m11977b(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, float f) {
        return !m11974e(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: c */
    public static int m11976c(@NonNull TypedArray typedArray, @NonNull XmlPullParser xmlPullParser, @NonNull String str, @StyleableRes int i, int i2) {
        return !m11974e(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    @Nullable
    /* renamed from: d */
    public static String m11975d(@NonNull TypedArray typedArray, @NonNull XmlResourceParser xmlResourceParser, @NonNull String str, @StyleableRes int i) {
        if (m11974e(xmlResourceParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m11974e(@NonNull XmlPullParser xmlPullParser, @NonNull String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    @NonNull
    /* renamed from: f */
    public static TypedArray m11973f(@NonNull Resources resources, @Nullable Resources.Theme theme, @NonNull AttributeSet attributeSet, @NonNull int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
