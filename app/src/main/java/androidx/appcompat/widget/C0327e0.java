package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.C0157c;
import androidx.appcompat.view.menu.C0235r;
import androidx.core.content.res.C0676f;
import androidx.core.util.C0804h;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.C0939d;
import androidx.core.widget.InterfaceC1061p;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.e0 */
/* loaded from: classes.dex */
public final class C0327e0 {
    @NonNull

    /* renamed from: a */
    public final TextView f1176a;

    /* renamed from: b */
    public C0422v1 f1177b;

    /* renamed from: c */
    public C0422v1 f1178c;

    /* renamed from: d */
    public C0422v1 f1179d;

    /* renamed from: e */
    public C0422v1 f1180e;

    /* renamed from: f */
    public C0422v1 f1181f;

    /* renamed from: g */
    public C0422v1 f1182g;

    /* renamed from: h */
    public C0422v1 f1183h;
    @NonNull

    /* renamed from: i */
    public final C0389n0 f1184i;

    /* renamed from: j */
    public int f1185j = 0;

    /* renamed from: k */
    public int f1186k = -1;

    /* renamed from: l */
    public Typeface f1187l;

    /* renamed from: m */
    public boolean f1188m;

    /* renamed from: androidx.appcompat.widget.e0$a */
    /* loaded from: classes.dex */
    public class C0328a extends C0676f.AbstractC0681e {

        /* renamed from: a */
        public final /* synthetic */ int f1189a;

        /* renamed from: b */
        public final /* synthetic */ int f1190b;

        /* renamed from: c */
        public final /* synthetic */ WeakReference f1191c;

        public C0328a(int i, int i2, WeakReference weakReference) {
            this.f1189a = i;
            this.f1190b = i2;
            this.f1191c = weakReference;
        }

        @Override // androidx.core.content.res.C0676f.AbstractC0681e
        public final void onFontRetrievalFailed(int i) {
        }

        @Override // androidx.core.content.res.C0676f.AbstractC0681e
        public final void onFontRetrieved(@NonNull Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1189a) != -1) {
                if ((this.f1190b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = C0333f.m12654a(typeface, i, z);
            }
            C0327e0 c0327e0 = C0327e0.this;
            if (c0327e0.f1188m) {
                c0327e0.f1187l = typeface;
                TextView textView = (TextView) this.f1191c.get();
                if (textView != null) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    if (ViewCompat.C0817g.m11730b(textView)) {
                        textView.post(new RunnableC0344f0(textView, typeface, c0327e0.f1185j));
                    } else {
                        textView.setTypeface(typeface, c0327e0.f1185j);
                    }
                }
            }
        }
    }

    @RequiresApi(17)
    /* renamed from: androidx.appcompat.widget.e0$b */
    /* loaded from: classes.dex */
    public static class C0329b {
        @DoNotInline
        /* renamed from: a */
        public static Drawable[] m12664a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12663b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m12662c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.appcompat.widget.e0$c */
    /* loaded from: classes.dex */
    public static class C0330c {
        @DoNotInline
        /* renamed from: a */
        public static Locale m12661a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.appcompat.widget.e0$d */
    /* loaded from: classes.dex */
    public static class C0331d {
        @DoNotInline
        /* renamed from: a */
        public static LocaleList m12660a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12659b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi(26)
    /* renamed from: androidx.appcompat.widget.e0$e */
    /* loaded from: classes.dex */
    public static class C0332e {
        @DoNotInline
        /* renamed from: a */
        public static int m12658a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12657b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m12656c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m12655d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.appcompat.widget.e0$f */
    /* loaded from: classes.dex */
    public static class C0333f {
        @DoNotInline
        /* renamed from: a */
        public static Typeface m12654a(Typeface typeface, int i, boolean z) {
            Typeface create;
            create = Typeface.create(typeface, i, z);
            return create;
        }
    }

    public C0327e0(@NonNull TextView textView) {
        this.f1176a = textView;
        this.f1184i = new C0389n0(textView);
    }

    /* renamed from: c */
    public static C0422v1 m12676c(Context context, C0363j c0363j, int i) {
        ColorStateList m12592i;
        synchronized (c0363j) {
            m12592i = c0363j.f1281a.m12592i(context, i);
        }
        if (m12592i != null) {
            C0422v1 c0422v1 = new C0422v1();
            c0422v1.f1394d = true;
            c0422v1.f1391a = m12592i;
            return c0422v1;
        }
        return null;
    }

    /* renamed from: h */
    public static void m12671h(@NonNull TextView textView, @Nullable InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        int i;
        int i2;
        boolean z;
        int i3;
        CharSequence subSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i4 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            text.getClass();
            if (i4 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i5 = editorInfo.initialSelStart;
            int i6 = editorInfo.initialSelEnd;
            if (i5 > i6) {
                i = i6 + 0;
            } else {
                i = i5 + 0;
            }
            if (i5 > i6) {
                i2 = i5 - 0;
            } else {
                i2 = i6 + 0;
            }
            int length = text.length();
            if (i >= 0 && i2 <= length) {
                int i7 = editorInfo.inputType & 4095;
                if (i7 != 129 && i7 != 225 && i7 != 18) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (length <= 2048) {
                        C0939d.m11445a(editorInfo, text, i, i2);
                        return;
                    }
                    int i8 = i2 - i;
                    if (i8 > 1024) {
                        i3 = 0;
                    } else {
                        i3 = i8;
                    }
                    int i9 = 2048 - i3;
                    int min = Math.min(text.length() - i2, i9 - Math.min(i, (int) (i9 * 0.8d)));
                    int min2 = Math.min(i, i9 - min);
                    int i10 = i - min2;
                    if (Character.isLowSurrogate(text.charAt(i10))) {
                        i10++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
                        min--;
                    }
                    int i11 = min2 + i3 + min;
                    if (i3 != i8) {
                        subSequence = TextUtils.concat(text.subSequence(i10, i10 + min2), text.subSequence(i2, min + i2));
                    } else {
                        subSequence = text.subSequence(i10, i11 + i10);
                    }
                    int i12 = min2 + 0;
                    C0939d.m11445a(editorInfo, subSequence, i12, i3 + i12);
                    return;
                }
            }
            C0939d.m11445a(editorInfo, null, 0, 0);
        }
    }

    /* renamed from: a */
    public final void m12678a(Drawable drawable, C0422v1 c0422v1) {
        if (drawable == null || c0422v1 == null) {
            return;
        }
        C0363j.m12611e(drawable, c0422v1, this.f1176a.getDrawableState());
    }

    /* renamed from: b */
    public final void m12677b() {
        C0422v1 c0422v1 = this.f1177b;
        TextView textView = this.f1176a;
        if (c0422v1 != null || this.f1178c != null || this.f1179d != null || this.f1180e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m12678a(compoundDrawables[0], this.f1177b);
            m12678a(compoundDrawables[1], this.f1178c);
            m12678a(compoundDrawables[2], this.f1179d);
            m12678a(compoundDrawables[3], this.f1180e);
        }
        if (this.f1181f == null && this.f1182g == null) {
            return;
        }
        Drawable[] m12664a = C0329b.m12664a(textView);
        m12678a(m12664a[0], this.f1181f);
        m12678a(m12664a[2], this.f1182g);
    }

    @Nullable
    /* renamed from: d */
    public final ColorStateList m12675d() {
        C0422v1 c0422v1 = this.f1183h;
        if (c0422v1 != null) {
            return c0422v1.f1391a;
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public final PorterDuff.Mode m12674e() {
        C0422v1 c0422v1 = this.f1183h;
        if (c0422v1 != null) {
            return c0422v1.f1392b;
        }
        return null;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public final void m12673f(@Nullable AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        float f;
        float f2;
        float f3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Paint.FontMetricsInt fontMetricsInt;
        int fontMetricsInt2;
        int i2;
        int resourceId;
        int i3;
        TextView textView = this.f1176a;
        Context context = textView.getContext();
        C0363j m12615a = C0363j.m12615a();
        int[] iArr = C0157c.f417h;
        C0430x1 m12465m = C0430x1.m12465m(context, attributeSet, iArr, i);
        ViewCompat.m11772m(textView, textView.getContext(), iArr, attributeSet, m12465m.f1406b, i);
        int m12469i = m12465m.m12469i(0, -1);
        if (m12465m.m12466l(3)) {
            this.f1177b = m12676c(context, m12615a, m12465m.m12469i(3, 0));
        }
        if (m12465m.m12466l(1)) {
            this.f1178c = m12676c(context, m12615a, m12465m.m12469i(1, 0));
        }
        if (m12465m.m12466l(4)) {
            this.f1179d = m12676c(context, m12615a, m12465m.m12469i(4, 0));
        }
        if (m12465m.m12466l(2)) {
            this.f1180e = m12676c(context, m12615a, m12465m.m12469i(2, 0));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (m12465m.m12466l(5)) {
            this.f1181f = m12676c(context, m12615a, m12465m.m12469i(5, 0));
        }
        if (m12465m.m12466l(6)) {
            this.f1182g = m12676c(context, m12615a, m12465m.m12469i(6, 0));
        }
        m12465m.m12464n();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = C0157c.f433x;
        if (m12469i != -1) {
            C0430x1 c0430x1 = new C0430x1(context, context.obtainStyledAttributes(m12469i, iArr2));
            if (!z3 && c0430x1.m12466l(14)) {
                z = c0430x1.m12477a(14, false);
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            m12665n(context, c0430x1);
            if (c0430x1.m12466l(15)) {
                str = c0430x1.m12468j(15);
                i3 = 26;
            } else {
                i3 = 26;
                str = null;
            }
            if (i4 >= i3 && c0430x1.m12466l(13)) {
                str2 = c0430x1.m12468j(13);
            } else {
                str2 = null;
            }
            c0430x1.m12464n();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        C0430x1 c0430x12 = new C0430x1(context, context.obtainStyledAttributes(attributeSet, iArr2, i, 0));
        if (!z3 && c0430x12.m12466l(14)) {
            z = c0430x12.m12477a(14, false);
            z2 = true;
        }
        if (c0430x12.m12466l(15)) {
            str = c0430x12.m12468j(15);
        }
        String str3 = str;
        if (i4 >= 26 && c0430x12.m12466l(13)) {
            str2 = c0430x12.m12468j(13);
        }
        String str4 = str2;
        if (i4 >= 28 && c0430x12.m12466l(0) && c0430x12.m12474d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m12665n(context, c0430x12);
        c0430x12.m12464n();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        Typeface typeface = this.f1187l;
        if (typeface != null) {
            if (this.f1186k == -1) {
                textView.setTypeface(typeface, this.f1185j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            C0332e.m12655d(textView, str4);
        }
        if (str3 != null) {
            if (i4 >= 24) {
                C0331d.m12659b(textView, C0331d.m12660a(str3));
            } else {
                C0329b.m12662c(textView, C0330c.m12661a(str3.split(",")[0]));
            }
        }
        int[] iArr3 = C0157c.f418i;
        C0389n0 c0389n0 = this.f1184i;
        Context context2 = c0389n0.f1339j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0389n0.f1338i;
        ViewCompat.m11772m(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i);
        if (obtainStyledAttributes.hasValue(5)) {
            c0389n0.f1330a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f2 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f3 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = obtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                c0389n0.f1335f = C0389n0.m12563b(iArr4);
                c0389n0.m12557h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (c0389n0.m12556i()) {
            if (c0389n0.f1330a == 1) {
                if (!c0389n0.f1336g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f2 == -1.0f) {
                        i2 = 2;
                        f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i2 = 2;
                    }
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(i2, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    c0389n0.m12555j(f2, f3, f);
                }
                c0389n0.m12558g();
            }
        } else {
            c0389n0.f1330a = 0;
        }
        if (C0362i2.f1278b && c0389n0.f1330a != 0) {
            int[] iArr5 = c0389n0.f1335f;
            if (iArr5.length > 0) {
                if (C0332e.m12658a(textView) != -1.0f) {
                    C0332e.m12657b(textView, Math.round(c0389n0.f1333d), Math.round(c0389n0.f1334e), Math.round(c0389n0.f1332c), 0);
                } else {
                    C0332e.m12656c(textView, iArr5, 0);
                }
            }
        }
        C0430x1 c0430x13 = new C0430x1(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int m12469i2 = c0430x13.m12469i(8, -1);
        if (m12469i2 != -1) {
            drawable = m12615a.m12614b(context, m12469i2);
        } else {
            drawable = null;
        }
        int m12469i3 = c0430x13.m12469i(13, -1);
        if (m12469i3 != -1) {
            drawable2 = m12615a.m12614b(context, m12469i3);
        } else {
            drawable2 = null;
        }
        int m12469i4 = c0430x13.m12469i(9, -1);
        if (m12469i4 != -1) {
            drawable3 = m12615a.m12614b(context, m12469i4);
        } else {
            drawable3 = null;
        }
        int m12469i5 = c0430x13.m12469i(6, -1);
        if (m12469i5 != -1) {
            drawable4 = m12615a.m12614b(context, m12469i5);
        } else {
            drawable4 = null;
        }
        int m12469i6 = c0430x13.m12469i(10, -1);
        if (m12469i6 != -1) {
            drawable5 = m12615a.m12614b(context, m12469i6);
        } else {
            drawable5 = null;
        }
        int m12469i7 = c0430x13.m12469i(7, -1);
        if (m12469i7 != -1) {
            drawable6 = m12615a.m12614b(context, m12469i7);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] m12664a = C0329b.m12664a(textView);
                Drawable drawable7 = m12664a[0];
                if (drawable7 == null && m12664a[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = m12664a[1];
                    }
                    Drawable drawable8 = m12664a[2];
                    if (drawable4 == null) {
                        drawable4 = m12664a[3];
                    }
                    C0329b.m12663b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] m12664a2 = C0329b.m12664a(textView);
            if (drawable5 == null) {
                drawable5 = m12664a2[0];
            }
            if (drawable2 == null) {
                drawable2 = m12664a2[1];
            }
            if (drawable6 == null) {
                drawable6 = m12664a2[2];
            }
            if (drawable4 == null) {
                drawable4 = m12664a2[3];
            }
            C0329b.m12663b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (c0430x13.m12466l(11)) {
            ColorStateList m12476b = c0430x13.m12476b(11);
            if (Build.VERSION.SDK_INT >= 24) {
                TextViewCompat.C1038c.m11281f(textView, m12476b);
            } else if (textView instanceof InterfaceC1061p) {
                ((InterfaceC1061p) textView).setSupportCompoundDrawablesTintList(m12476b);
            }
        }
        if (c0430x13.m12466l(12)) {
            fontMetricsInt = null;
            PorterDuff.Mode m12479c = C0427x0.m12479c(c0430x13.m12470h(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                TextViewCompat.C1038c.m11280g(textView, m12479c);
            } else if (textView instanceof InterfaceC1061p) {
                ((InterfaceC1061p) textView).setSupportCompoundDrawablesTintMode(m12479c);
            }
        } else {
            fontMetricsInt = null;
        }
        int m12474d = c0430x13.m12474d(15, -1);
        int m12474d2 = c0430x13.m12474d(18, -1);
        int m12474d3 = c0430x13.m12474d(19, -1);
        c0430x13.m12464n();
        if (m12474d != -1) {
            TextViewCompat.m11301b(textView, m12474d);
        }
        if (m12474d2 != -1) {
            TextViewCompat.m11300c(textView, m12474d2);
        }
        if (m12474d3 != -1) {
            C0804h.m11792b(m12474d3);
            if (m12474d3 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(m12474d3 - fontMetricsInt2, 1.0f);
            }
        }
    }

    /* renamed from: g */
    public final void m12672g(Context context, int i) {
        String m12468j;
        C0430x1 c0430x1 = new C0430x1(context, context.obtainStyledAttributes(i, C0157c.f433x));
        boolean m12466l = c0430x1.m12466l(14);
        TextView textView = this.f1176a;
        if (m12466l) {
            textView.setAllCaps(c0430x1.m12477a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (c0430x1.m12466l(0) && c0430x1.m12474d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m12665n(context, c0430x1);
        if (i2 >= 26 && c0430x1.m12466l(13) && (m12468j = c0430x1.m12468j(13)) != null) {
            C0332e.m12655d(textView, m12468j);
        }
        c0430x1.m12464n();
        Typeface typeface = this.f1187l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1185j);
        }
    }

    /* renamed from: i */
    public final void m12670i(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        C0389n0 c0389n0 = this.f1184i;
        if (c0389n0.m12556i()) {
            DisplayMetrics displayMetrics = c0389n0.f1339j.getResources().getDisplayMetrics();
            c0389n0.m12555j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0389n0.m12558g()) {
                c0389n0.m12564a();
            }
        }
    }

    /* renamed from: j */
    public final void m12669j(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        C0389n0 c0389n0 = this.f1184i;
        if (c0389n0.m12556i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0389n0.f1339j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0389n0.f1335f = C0389n0.m12563b(iArr2);
                if (!c0389n0.m12557h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0389n0.f1336g = false;
            }
            if (c0389n0.m12558g()) {
                c0389n0.m12564a();
            }
        }
    }

    /* renamed from: k */
    public final void m12668k(int i) {
        C0389n0 c0389n0 = this.f1184i;
        if (c0389n0.m12556i()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = c0389n0.f1339j.getResources().getDisplayMetrics();
                    c0389n0.m12555j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c0389n0.m12558g()) {
                        c0389n0.m12564a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(C0235r.m12816a("Unknown auto-size text type: ", i));
            }
            c0389n0.f1330a = 0;
            c0389n0.f1333d = -1.0f;
            c0389n0.f1334e = -1.0f;
            c0389n0.f1332c = -1.0f;
            c0389n0.f1335f = new int[0];
            c0389n0.f1331b = false;
        }
    }

    /* renamed from: l */
    public final void m12667l(@Nullable ColorStateList colorStateList) {
        boolean z;
        if (this.f1183h == null) {
            this.f1183h = new C0422v1();
        }
        C0422v1 c0422v1 = this.f1183h;
        c0422v1.f1391a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        c0422v1.f1394d = z;
        this.f1177b = c0422v1;
        this.f1178c = c0422v1;
        this.f1179d = c0422v1;
        this.f1180e = c0422v1;
        this.f1181f = c0422v1;
        this.f1182g = c0422v1;
    }

    /* renamed from: m */
    public final void m12666m(@Nullable PorterDuff.Mode mode) {
        boolean z;
        if (this.f1183h == null) {
            this.f1183h = new C0422v1();
        }
        C0422v1 c0422v1 = this.f1183h;
        c0422v1.f1392b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        c0422v1.f1393c = z;
        this.f1177b = c0422v1;
        this.f1178c = c0422v1;
        this.f1179d = c0422v1;
        this.f1180e = c0422v1;
        this.f1181f = c0422v1;
        this.f1182g = c0422v1;
    }

    /* renamed from: n */
    public final void m12665n(Context context, C0430x1 c0430x1) {
        String m12468j;
        Typeface create;
        Typeface typeface;
        this.f1185j = c0430x1.m12470h(2, this.f1185j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int m12470h = c0430x1.m12470h(11, -1);
            this.f1186k = m12470h;
            if (m12470h != -1) {
                this.f1185j = (this.f1185j & 2) | 0;
            }
        }
        if (!c0430x1.m12466l(10) && !c0430x1.m12466l(12)) {
            if (c0430x1.m12466l(1)) {
                this.f1188m = false;
                int m12470h2 = c0430x1.m12470h(1, 1);
                if (m12470h2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (m12470h2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (m12470h2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1187l = typeface;
                return;
            }
            return;
        }
        this.f1187l = null;
        int i2 = c0430x1.m12466l(12) ? 12 : 10;
        int i3 = this.f1186k;
        int i4 = this.f1185j;
        if (!context.isRestricted()) {
            try {
                Typeface m12471g = c0430x1.m12471g(i2, this.f1185j, new C0328a(i3, i4, new WeakReference(this.f1176a)));
                if (m12471g != null) {
                    if (i >= 28 && this.f1186k != -1) {
                        m12471g = C0333f.m12654a(Typeface.create(m12471g, 0), this.f1186k, (this.f1185j & 2) != 0);
                    }
                    this.f1187l = m12471g;
                }
                this.f1188m = this.f1187l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1187l != null || (m12468j = c0430x1.m12468j(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1186k == -1) {
            create = Typeface.create(m12468j, this.f1185j);
        } else {
            create = C0333f.m12654a(Typeface.create(m12468j, 0), this.f1186k, (this.f1185j & 2) != 0);
        }
        this.f1187l = create;
    }
}
