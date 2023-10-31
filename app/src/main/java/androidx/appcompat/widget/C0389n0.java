package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.n0 */
/* loaded from: classes.dex */
public final class C0389n0 {

    /* renamed from: l */
    public static final RectF f1328l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m */
    public static final ConcurrentHashMap<String, Method> f1329m = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f1330a = 0;

    /* renamed from: b */
    public boolean f1331b = false;

    /* renamed from: c */
    public float f1332c = -1.0f;

    /* renamed from: d */
    public float f1333d = -1.0f;

    /* renamed from: e */
    public float f1334e = -1.0f;

    /* renamed from: f */
    public int[] f1335f = new int[0];

    /* renamed from: g */
    public boolean f1336g = false;

    /* renamed from: h */
    public TextPaint f1337h;
    @NonNull

    /* renamed from: i */
    public final TextView f1338i;

    /* renamed from: j */
    public final Context f1339j;

    /* renamed from: k */
    public final C0393d f1340k;

    @RequiresApi(16)
    /* renamed from: androidx.appcompat.widget.n0$a */
    /* loaded from: classes.dex */
    public static final class C0390a {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static StaticLayout m12554a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, @NonNull TextView textView, @NonNull TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @DoNotInline
        /* renamed from: b */
        public static int m12553b(@NonNull TextView textView) {
            return textView.getMaxLines();
        }
    }

    @RequiresApi(18)
    /* renamed from: androidx.appcompat.widget.n0$b */
    /* loaded from: classes.dex */
    public static final class C0391b {
        @DoNotInline
        /* renamed from: a */
        public static boolean m12552a(@NonNull View view) {
            return view.isInLayout();
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.appcompat.widget.n0$c */
    /* loaded from: classes.dex */
    public static final class C0392c {
        @NonNull
        @DoNotInline
        /* renamed from: a */
        public static StaticLayout m12551a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i, int i2, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull C0395f c0395f) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                c0395f.mo12550a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.appcompat.widget.n0$d */
    /* loaded from: classes.dex */
    public static class C0393d extends C0395f {
        @Override // androidx.appcompat.widget.C0389n0.C0395f
        /* renamed from: a */
        public void mo12550a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0389n0.m12560e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.appcompat.widget.n0$e */
    /* loaded from: classes.dex */
    public static class C0394e extends C0393d {
        @Override // androidx.appcompat.widget.C0389n0.C0393d, androidx.appcompat.widget.C0389n0.C0395f
        /* renamed from: a */
        public void mo12550a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.C0389n0.C0395f
        /* renamed from: b */
        public boolean mo12549b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* renamed from: androidx.appcompat.widget.n0$f */
    /* loaded from: classes.dex */
    public static class C0395f {
        /* renamed from: a */
        public void mo12550a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* renamed from: b */
        public boolean mo12549b(TextView textView) {
            return ((Boolean) C0389n0.m12560e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public C0389n0(@NonNull TextView textView) {
        this.f1338i = textView;
        this.f1339j = textView.getContext();
        this.f1340k = Build.VERSION.SDK_INT >= 29 ? new C0394e() : new C0393d();
    }

    /* renamed from: b */
    public static int[] m12563b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    @Nullable
    /* renamed from: d */
    public static Method m12561d(@NonNull String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f1329m;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* renamed from: e */
    public static <T> T m12560e(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            return (T) m12561d(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public final void m12564a() {
        boolean z;
        int measuredWidth;
        if (m12556i() && this.f1330a != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        if (this.f1331b) {
            if (this.f1338i.getMeasuredHeight() > 0 && this.f1338i.getMeasuredWidth() > 0) {
                if (this.f1340k.mo12549b(this.f1338i)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f1338i.getMeasuredWidth() - this.f1338i.getTotalPaddingLeft()) - this.f1338i.getTotalPaddingRight();
                }
                int height = (this.f1338i.getHeight() - this.f1338i.getCompoundPaddingBottom()) - this.f1338i.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f1328l;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float m12562c = m12562c(rectF);
                        if (m12562c != this.f1338i.getTextSize()) {
                            m12559f(m12562c, 0);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f1331b = true;
    }

    /* renamed from: c */
    public final int m12562c(RectF rectF) {
        boolean z;
        CharSequence transformation;
        int length = this.f1335f.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.f1335f[i4];
                TextView textView = this.f1338i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int m12553b = C0390a.m12553b(textView);
                TextPaint textPaint = this.f1337h;
                if (textPaint == null) {
                    this.f1337h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f1337h.set(textView.getPaint());
                this.f1337h.setTextSize(i5);
                StaticLayout m12551a = C0392c.m12551a(text, (Layout.Alignment) m12560e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), m12553b, this.f1338i, this.f1337h, this.f1340k);
                if ((m12553b != -1 && (m12551a.getLineCount() > m12553b || m12551a.getLineEnd(m12551a.getLineCount() - 1) != text.length())) || m12551a.getHeight() > rectF.bottom) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1335f[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: f */
    public final void m12559f(float f, int i) {
        Resources resources;
        Context context = this.f1339j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.f1338i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean m12552a = C0391b.m12552a(textView);
            if (textView.getLayout() != null) {
                this.f1331b = false;
                try {
                    Method m12561d = m12561d("nullLayouts");
                    if (m12561d != null) {
                        m12561d.invoke(textView, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!m12552a) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* renamed from: g */
    public final boolean m12558g() {
        if (m12556i() && this.f1330a == 1) {
            if (!this.f1336g || this.f1335f.length == 0) {
                int floor = ((int) Math.floor((this.f1334e - this.f1333d) / this.f1332c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f1332c) + this.f1333d);
                }
                this.f1335f = m12563b(iArr);
            }
            this.f1331b = true;
        } else {
            this.f1331b = false;
        }
        return this.f1331b;
    }

    /* renamed from: h */
    public final boolean m12557h() {
        int[] iArr = this.f1335f;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1336g = z;
        if (z) {
            this.f1330a = 1;
            this.f1333d = iArr[0];
            this.f1334e = iArr[length - 1];
            this.f1332c = -1.0f;
        }
        return z;
    }

    /* renamed from: i */
    public final boolean m12556i() {
        return !(this.f1338i instanceof C0368k);
    }

    /* renamed from: j */
    public final void m12555j(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f1330a = 1;
            this.f1333d = f;
            this.f1334e = f2;
            this.f1332c = f3;
            this.f1336g = false;
        }
    }
}
