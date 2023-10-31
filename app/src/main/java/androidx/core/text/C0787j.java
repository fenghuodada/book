package androidx.core.text;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.widgets.analyzer.C0522f;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.core.util.C0799c;

/* renamed from: androidx.core.text.j */
/* loaded from: classes.dex */
public final class C0787j implements Spannable {

    /* renamed from: androidx.core.text.j$a */
    /* loaded from: classes.dex */
    public static final class C0788a {
        @NonNull

        /* renamed from: a */
        public final TextPaint f2488a;
        @Nullable

        /* renamed from: b */
        public final TextDirectionHeuristic f2489b;

        /* renamed from: c */
        public final int f2490c;

        /* renamed from: d */
        public final int f2491d;

        @RequiresApi(28)
        public C0788a(@NonNull PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f2488a = textPaint;
            textDirection = params.getTextDirection();
            this.f2489b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f2490c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f2491d = hyphenationFrequency;
        }

        public C0788a(@NonNull TextPaint textPaint, @NonNull TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            }
            this.f2488a = textPaint;
            this.f2489b = textDirectionHeuristic;
            this.f2490c = i;
            this.f2491d = i2;
        }

        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
        /* renamed from: a */
        public final boolean m11801a(@NonNull C0788a c0788a) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i = Build.VERSION.SDK_INT;
            if (this.f2490c != c0788a.f2490c || this.f2491d != c0788a.f2491d) {
                return false;
            }
            TextPaint textPaint = this.f2488a;
            if (textPaint.getTextSize() != c0788a.f2488a.getTextSize()) {
                return false;
            }
            float textScaleX = textPaint.getTextScaleX();
            TextPaint textPaint2 = c0788a.f2488a;
            if (textScaleX != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags()) {
                return false;
            }
            if (i >= 24) {
                textLocales = textPaint.getTextLocales();
                textLocales2 = textPaint2.getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!textPaint.getTextLocale().equals(textPaint2.getTextLocale())) {
                return false;
            }
            if (textPaint.getTypeface() == null) {
                if (textPaint2.getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0788a) {
                C0788a c0788a = (C0788a) obj;
                return m11801a(c0788a) && this.f2489b == c0788a.f2489b;
            }
            return false;
        }

        public final int hashCode() {
            LocaleList textLocales;
            int i = Build.VERSION.SDK_INT;
            int i2 = this.f2491d;
            int i3 = this.f2490c;
            TextDirectionHeuristic textDirectionHeuristic = this.f2489b;
            TextPaint textPaint = this.f2488a;
            if (i >= 24) {
                textLocales = textPaint.getTextLocales();
                return C0799c.m11794b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
            }
            return C0799c.m11794b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
        }

        public final String toString() {
            StringBuilder sb;
            Object textLocale;
            String fontVariationSettings;
            StringBuilder sb2 = new StringBuilder("{");
            StringBuilder sb3 = new StringBuilder("textSize=");
            TextPaint textPaint = this.f2488a;
            sb3.append(textPaint.getTextSize());
            sb2.append(sb3.toString());
            sb2.append(", textScaleX=" + textPaint.getTextScaleX());
            sb2.append(", textSkewX=" + textPaint.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
            if (i >= 24) {
                sb = new StringBuilder(", textLocale=");
                textLocale = textPaint.getTextLocales();
            } else {
                sb = new StringBuilder(", textLocale=");
                textLocale = textPaint.getTextLocale();
            }
            sb.append(textLocale);
            sb2.append(sb.toString());
            sb2.append(", typeface=" + textPaint.getTypeface());
            if (i >= 26) {
                StringBuilder sb4 = new StringBuilder(", variationSettings=");
                fontVariationSettings = textPaint.getFontVariationSettings();
                sb4.append(fontVariationSettings);
                sb2.append(sb4.toString());
            }
            sb2.append(", textDir=" + this.f2489b);
            sb2.append(", breakStrategy=" + this.f2490c);
            sb2.append(", hyphenationFrequency=" + this.f2491d);
            sb2.append("}");
            return sb2.toString();
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0552c.m12191c(i, i2, cls);
            throw null;
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        C0780c.m11812b(obj);
        throw null;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT < 29) {
            throw null;
        }
        C0522f.m12316b(obj, i, i2, i3);
        throw null;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    @NonNull
    public final String toString() {
        throw null;
    }
}
