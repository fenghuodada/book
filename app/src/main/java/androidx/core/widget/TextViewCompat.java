package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.PrecomputedText;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.InterfaceC0074Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.C0804h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public final class TextViewCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface AutoSizeTextType {
    }

    @RequiresApi(16)
    /* renamed from: androidx.core.widget.TextViewCompat$a */
    /* loaded from: classes.dex */
    public static class C1036a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m11297a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m11296b(TextView textView) {
            return textView.getMaxLines();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m11295c(TextView textView) {
            return textView.getMinLines();
        }
    }

    @RequiresApi(17)
    /* renamed from: androidx.core.widget.TextViewCompat$b */
    /* loaded from: classes.dex */
    public static class C1037b {
        @DoNotInline
        /* renamed from: a */
        public static Drawable[] m11294a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @DoNotInline
        /* renamed from: b */
        public static int m11293b(View view) {
            return view.getLayoutDirection();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m11292c(View view) {
            return view.getTextDirection();
        }

        @DoNotInline
        /* renamed from: d */
        public static Locale m11291d(TextView textView) {
            return textView.getTextLocale();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m11290e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m11289f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m11288g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m11287h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.core.widget.TextViewCompat$c */
    /* loaded from: classes.dex */
    public static class C1038c {
        @DoNotInline
        /* renamed from: a */
        public static int m11286a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @DoNotInline
        /* renamed from: b */
        public static ColorStateList m11285b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @DoNotInline
        /* renamed from: c */
        public static PorterDuff.Mode m11284c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m11283d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m11282e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m11281f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m11280g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m11279h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.core.widget.TextViewCompat$d */
    /* loaded from: classes.dex */
    public static class C1039d {
        @DoNotInline
        /* renamed from: a */
        public static DecimalFormatSymbols m11278a(Locale locale) {
            DecimalFormatSymbols decimalFormatSymbols;
            decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
            return decimalFormatSymbols;
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.core.widget.TextViewCompat$e */
    /* loaded from: classes.dex */
    public static class C1040e {
        @DoNotInline
        /* renamed from: a */
        public static String[] m11277a(DecimalFormatSymbols decimalFormatSymbols) {
            String[] digitStrings;
            digitStrings = decimalFormatSymbols.getDigitStrings();
            return digitStrings;
        }

        @DoNotInline
        /* renamed from: b */
        public static PrecomputedText.Params m11276b(TextView textView) {
            PrecomputedText.Params textMetricsParams;
            textMetricsParams = textView.getTextMetricsParams();
            return textMetricsParams;
        }

        @DoNotInline
        /* renamed from: c */
        public static void m11275c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    @RequiresApi(26)
    /* renamed from: androidx.core.widget.TextViewCompat$f */
    /* loaded from: classes.dex */
    public static class ActionMode$CallbackC1041f implements ActionMode.Callback {

        /* renamed from: a */
        public final ActionMode.Callback f2699a;

        /* renamed from: b */
        public final TextView f2700b;

        /* renamed from: c */
        public Class<?> f2701c;

        /* renamed from: d */
        public Method f2702d;

        /* renamed from: e */
        public boolean f2703e;

        /* renamed from: f */
        public boolean f2704f = false;

        public ActionMode$CallbackC1041f(ActionMode.Callback callback, TextView textView) {
            this.f2699a = callback;
            this.f2700b = textView;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2699a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2699a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f2699a.onDestroyActionMode(actionMode);
        }

        /* JADX WARN: Removed duplicated region for block: B:69:0x00d1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x009f A[SYNTHETIC] */
        @Override // android.view.ActionMode.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.TextViewCompat.ActionMode$CallbackC1041f.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r7 != 2) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r5 != false) goto L26;
     */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.text.C0787j.C0788a m11302a(@androidx.annotation.NonNull android.widget.TextView r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            androidx.core.text.j$a r0 = new androidx.core.text.j$a
            android.text.PrecomputedText$Params r7 = androidx.core.widget.TextViewCompat.C1040e.m11276b(r7)
            r0.<init>(r7)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r7.getPaint()
            r2.<init>(r3)
            android.text.TextDirectionHeuristic r3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            int r3 = androidx.core.widget.TextViewCompat.C1038c.m11286a(r7)
            int r4 = androidx.core.widget.TextViewCompat.C1038c.m11283d(r7)
            android.text.method.TransformationMethod r5 = r7.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L2e
        L2b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LTR
            goto L76
        L2e:
            r5 = 1
            r6 = 0
            if (r0 < r1) goto L57
            int r0 = r7.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L57
            java.util.Locale r7 = androidx.core.widget.TextViewCompat.C1037b.m11291d(r7)
            android.icu.text.DecimalFormatSymbols r7 = androidx.core.widget.TextViewCompat.C1039d.m11278a(r7)
            java.lang.String[] r7 = androidx.core.widget.TextViewCompat.C1040e.m11277a(r7)
            r7 = r7[r6]
            int r7 = r7.codePointAt(r6)
            byte r7 = java.lang.Character.getDirectionality(r7)
            if (r7 == r5) goto L6e
            r0 = 2
            if (r7 != r0) goto L2b
            goto L6e
        L57:
            int r0 = androidx.core.widget.TextViewCompat.C1037b.m11293b(r7)
            if (r0 != r5) goto L5e
            goto L5f
        L5e:
            r5 = r6
        L5f:
            int r7 = androidx.core.widget.TextViewCompat.C1037b.m11292c(r7)
            switch(r7) {
                case 2: goto L71;
                case 3: goto L2b;
                case 4: goto L6e;
                case 5: goto L6b;
                case 6: goto L74;
                case 7: goto L68;
                default: goto L66;
            }
        L66:
            if (r5 == 0) goto L74
        L68:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L76
        L6b:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.LOCALE
            goto L76
        L6e:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.RTL
            goto L76
        L71:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L76
        L74:
            android.text.TextDirectionHeuristic r7 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L76:
            androidx.core.text.j$a r0 = new androidx.core.text.j$a
            r0.<init>(r2, r7, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.TextViewCompat.m11302a(android.widget.TextView):androidx.core.text.j$a");
    }

    /* renamed from: b */
    public static void m11301b(@NonNull TextView textView, @IntRange(from = 0) @InterfaceC0074Px int i) {
        C0804h.m11792b(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C1040e.m11275c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = C1036a.m11297a(textView) ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: c */
    public static void m11300c(@NonNull TextView textView, @IntRange(from = 0) @InterfaceC0074Px int i) {
        C0804h.m11792b(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = C1036a.m11297a(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: d */
    public static ActionMode.Callback m11299d(@Nullable ActionMode.Callback callback) {
        if ((callback instanceof ActionMode$CallbackC1041f) && Build.VERSION.SDK_INT >= 26) {
            return ((ActionMode$CallbackC1041f) callback).f2699a;
        }
        return callback;
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: e */
    public static ActionMode.Callback m11298e(@Nullable ActionMode.Callback callback, @NonNull TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof ActionMode$CallbackC1041f) || callback == null) ? callback : new ActionMode$CallbackC1041f(callback, textView);
    }
}
