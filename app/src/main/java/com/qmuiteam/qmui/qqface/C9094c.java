package com.qmuiteam.qmui.qqface;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.qmuiteam.qmui.link.InterfaceC9067a;
import com.qmuiteam.qmui.qqface.C9091b;
import com.qmuiteam.qmui.span.AbstractC9139d;
import com.qmuiteam.qmui.util.C9143d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* renamed from: com.qmuiteam.qmui.qqface.c */
/* loaded from: classes3.dex */
public final class C9094c extends View {

    /* renamed from: A */
    public int f17469A;

    /* renamed from: B */
    public int f17470B;

    /* renamed from: C */
    public int f17471C;

    /* renamed from: D */
    public RunnableC9096b f17472D;

    /* renamed from: E */
    public boolean f17473E;

    /* renamed from: F */
    public boolean f17474F;

    /* renamed from: G */
    public Typeface f17475G;

    /* renamed from: H */
    public int f17476H;

    /* renamed from: I */
    public int f17477I;

    /* renamed from: J */
    public int f17478J;

    /* renamed from: K */
    public final int[] f17479K;

    /* renamed from: L */
    public boolean f17480L;

    /* renamed from: M */
    public ColorStateList f17481M;

    /* renamed from: N */
    public int f17482N;

    /* renamed from: O */
    public C9098d f17483O;

    /* renamed from: P */
    public boolean f17484P;

    /* renamed from: Q */
    public int f17485Q;

    /* renamed from: R */
    public int f17486R;

    /* renamed from: S */
    public int f17487S;

    /* renamed from: T */
    public boolean f17488T;

    /* renamed from: U */
    public int f17489U;

    /* renamed from: V */
    public int f17490V;

    /* renamed from: W */
    public int f17491W;

    /* renamed from: a */
    public CharSequence f17492a;

    /* renamed from: b */
    public C9091b.C9093b f17493b;

    /* renamed from: c */
    public C9091b f17494c;

    /* renamed from: d */
    public boolean f17495d;

    /* renamed from: d0 */
    public int f17496d0;

    /* renamed from: e */
    public final TextPaint f17497e;

    /* renamed from: e0 */
    public int f17498e0;

    /* renamed from: f */
    public final Paint f17499f;

    /* renamed from: f0 */
    public int f17500f0;

    /* renamed from: g */
    public int f17501g;

    /* renamed from: g0 */
    public boolean f17502g0;

    /* renamed from: h */
    public ColorStateList f17503h;

    /* renamed from: h0 */
    public AbstractC9139d f17504h0;

    /* renamed from: i */
    public int f17505i;

    /* renamed from: i0 */
    public int f17506i0;

    /* renamed from: j */
    public int f17507j;

    /* renamed from: j0 */
    public boolean f17508j0;

    /* renamed from: k */
    public int f17509k;

    /* renamed from: k0 */
    public int f17510k0;

    /* renamed from: l */
    public int f17511l;

    /* renamed from: m */
    public int f17512m;

    /* renamed from: n */
    public boolean f17513n;

    /* renamed from: o */
    public int f17514o;

    /* renamed from: p */
    public final HashMap<C9091b.C9092a, C9098d> f17515p;

    /* renamed from: q */
    public boolean f17516q;

    /* renamed from: r */
    public final Rect f17517r;

    /* renamed from: s */
    public String f17518s;

    /* renamed from: t */
    public ColorStateList f17519t;

    /* renamed from: u */
    public ColorStateList f17520u;

    /* renamed from: v */
    public int f17521v;

    /* renamed from: w */
    public int f17522w;

    /* renamed from: x */
    public TextUtils.TruncateAt f17523x;

    /* renamed from: y */
    public boolean f17524y;

    /* renamed from: z */
    public int f17525z;

    /* renamed from: com.qmuiteam.qmui.qqface.c$a */
    /* loaded from: classes3.dex */
    public class RunnableC9095a implements Runnable {
        public RunnableC9095a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RunnableC9096b runnableC9096b = C9094c.this.f17472D;
            if (runnableC9096b != null) {
                runnableC9096b.run();
            }
        }
    }

    /* renamed from: com.qmuiteam.qmui.qqface.c$b */
    /* loaded from: classes3.dex */
    public static class RunnableC9096b implements Runnable {

        /* renamed from: a */
        public final WeakReference<C9098d> f17527a;

        public RunnableC9096b(C9098d c9098d) {
            this.f17527a = new WeakReference<>(c9098d);
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9098d c9098d = this.f17527a.get();
            if (c9098d != null) {
                c9098d.f17528a.mo2649b(false);
                c9098d.m2683a();
            }
        }
    }

    /* renamed from: com.qmuiteam.qmui.qqface.c$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9097c {
    }

    /* renamed from: com.qmuiteam.qmui.qqface.c$d */
    /* loaded from: classes3.dex */
    public class C9098d {

        /* renamed from: a */
        public final InterfaceC9067a f17528a;

        /* renamed from: b */
        public int f17529b = -1;

        /* renamed from: c */
        public int f17530c = -1;

        /* renamed from: d */
        public int f17531d = -1;

        /* renamed from: e */
        public int f17532e = -1;

        public C9098d(AbstractC9139d abstractC9139d) {
            this.f17528a = abstractC9139d;
        }

        /* renamed from: a */
        public final void m2683a() {
            C9094c c9094c = C9094c.this;
            int paddingTop = c9094c.getPaddingTop();
            int i = this.f17531d;
            if (i > 1) {
                paddingTop += (c9094c.f17507j + c9094c.f17505i) * (i - 1);
            }
            int i2 = c9094c.f17507j;
            int i3 = c9094c.f17505i + i2;
            Rect rect = new Rect();
            rect.top = paddingTop;
            rect.bottom = (i3 * (this.f17532e - 1)) + paddingTop + i2;
            rect.left = c9094c.getPaddingLeft();
            rect.right = c9094c.getWidth() - c9094c.getPaddingRight();
            if (this.f17531d == this.f17532e) {
                rect.left = this.f17529b;
                rect.right = this.f17530c;
            }
            c9094c.invalidate(rect);
        }

        /* renamed from: b */
        public final boolean m2682b(int i, int i2) {
            C9094c c9094c = C9094c.this;
            int paddingTop = c9094c.getPaddingTop();
            int i3 = this.f17531d;
            if (i3 > 1) {
                paddingTop += (c9094c.f17507j + c9094c.f17505i) * (i3 - 1);
            }
            int i4 = (c9094c.f17507j + c9094c.f17505i) * (this.f17532e - 1);
            int i5 = c9094c.f17507j;
            int paddingTop2 = c9094c.getPaddingTop() + i4 + i5;
            if (i2 < paddingTop || i2 > paddingTop2) {
                return false;
            }
            int i6 = this.f17531d;
            int i7 = this.f17532e;
            if (i6 == i7) {
                if (i >= this.f17529b && i <= this.f17530c) {
                    return true;
                }
                return false;
            }
            int i8 = paddingTop + i5;
            int i9 = paddingTop2 - i5;
            if (i2 > i8 && i2 < i9) {
                if (i7 - i6 != 1) {
                    return true;
                }
                if (i >= this.f17529b && i <= this.f17530c) {
                    return true;
                }
                return false;
            } else if (i2 <= i8) {
                if (i >= this.f17529b) {
                    return true;
                }
                return false;
            } else if (i <= this.f17530c) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9094c(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.qqface.C9094c.<init>(android.content.Context):void");
    }

    private int getMiddleEllipsizeLine() {
        int i = this.f17525z;
        if (i % 2 != 0) {
            i++;
        }
        return i / 2;
    }

    private void setContentCalMaxWidth(int i) {
        this.f17487S = Math.max(i, this.f17487S);
    }

    /* renamed from: a */
    public final int m2702a(int i) {
        boolean z;
        ArrayList arrayList;
        if (i > getPaddingLeft() + getPaddingRight()) {
            C9091b.C9093b c9093b = this.f17493b;
            if (c9093b != null && (arrayList = c9093b.f17468c) != null && !arrayList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (!this.f17488T && this.f17489U == i) {
                    this.f17514o = this.f17491W;
                    return this.f17490V;
                }
                this.f17489U = i;
                ArrayList arrayList2 = this.f17493b.f17468c;
                this.f17486R = 1;
                this.f17485Q = getPaddingLeft();
                m2701b(i, arrayList2);
                int i2 = this.f17486R;
                if (i2 != this.f17514o) {
                    this.f17514o = i2;
                }
                if (this.f17514o == 1) {
                    this.f17490V = getPaddingRight() + this.f17485Q;
                } else {
                    this.f17490V = i;
                }
                this.f17491W = this.f17514o;
                return this.f17490V;
            }
        }
        this.f17514o = 0;
        this.f17469A = 0;
        this.f17491W = 0;
        this.f17490V = 0;
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* renamed from: b */
    public final void m2701b(int i, ArrayList arrayList) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = i - getPaddingRight();
        boolean z = false;
        int i2 = 0;
        while (i2 < arrayList.size() && !this.f17473E) {
            if (this.f17486R <= this.f17512m || this.f17523x != TextUtils.TruncateAt.END) {
                C9091b.C9092a c9092a = (C9091b.C9092a) arrayList.get(i2);
                int i3 = c9092a.f17462a;
                boolean z2 = true;
                if (i3 == 2) {
                    if (this.f17485Q + this.f17509k > paddingRight) {
                        m2695h(paddingLeft, z);
                    }
                    int i4 = this.f17485Q;
                    int i5 = this.f17509k;
                    this.f17485Q = i4 + i5;
                    if (paddingRight - paddingLeft < i5) {
                        this.f17473E = true;
                    }
                } else if (i3 == 1) {
                    CharSequence charSequence = c9092a.f17463b;
                    int length = charSequence.length();
                    float[] fArr = new float[length];
                    this.f17497e.getTextWidths(charSequence.toString(), fArr);
                    int i6 = paddingRight - paddingLeft;
                    long currentTimeMillis = System.currentTimeMillis();
                    for (int i7 = z; i7 < length; i7++) {
                        if (i6 < fArr[i7] || System.currentTimeMillis() - currentTimeMillis > 2000) {
                            this.f17473E = z2;
                            break;
                        }
                        if (this.f17485Q + fArr[i7] > paddingRight) {
                            m2695h(paddingLeft, z);
                        }
                        this.f17485Q = (int) (Math.ceil(fArr[i7]) + this.f17485Q);
                        currentTimeMillis = currentTimeMillis;
                        z = false;
                        z2 = true;
                    }
                } else if (i3 == 4) {
                    C9091b.C9093b c9093b = c9092a.f17464c;
                    if (c9093b != null) {
                        ArrayList arrayList2 = c9093b.f17468c;
                        if (arrayList2.size() > 0) {
                            m2701b(i, arrayList2);
                        }
                    }
                } else if (i3 == 5) {
                    m2695h(paddingLeft, true);
                } else if (i3 == 3) {
                    throw null;
                }
                i2++;
                z = false;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r4 < r0) goto L4;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2700c(int r4) {
        /*
            r3 = this;
            int r0 = r3.f17514o
            r3.f17525z = r0
            boolean r1 = r3.f17513n
            r2 = 1
            if (r1 == 0) goto L10
            int r4 = java.lang.Math.min(r2, r0)
        Ld:
            r3.f17525z = r4
            goto L13
        L10:
            if (r4 >= r0) goto L13
            goto Ld
        L13:
            int r4 = r3.f17514o
            int r0 = r3.f17525z
            if (r4 <= r0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            r3.f17524y = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.qqface.C9094c.m2700c(int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r15 == (r19.size() - 1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r15 == (r19.size() - 1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        m2691l(r18, 0, null, r11, r12, r0, r3);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2699d(android.graphics.Canvas r18, java.util.ArrayList r19, int r20) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.qqface.C9094c.m2699d(android.graphics.Canvas, java.util.ArrayList, int):void");
    }

    /* renamed from: e */
    public final void m2698e(Canvas canvas) {
        int i;
        if (C9143d.m2642c(this.f17518s)) {
            return;
        }
        ColorStateList colorStateList = this.f17519t;
        if (colorStateList == null) {
            colorStateList = this.f17503h;
        }
        int i2 = 0;
        int[] iArr = this.f17479K;
        if (colorStateList != null) {
            i = colorStateList.getDefaultColor();
            if (this.f17516q) {
                i = colorStateList.getColorForState(iArr, i);
            }
        } else {
            i = 0;
        }
        ColorStateList colorStateList2 = this.f17520u;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getDefaultColor();
            if (this.f17516q) {
                i2 = this.f17520u.getColorForState(iArr, i2);
            }
        }
        int paddingTop = getPaddingTop();
        int i3 = this.f17498e0;
        if (i3 > 1) {
            paddingTop += (this.f17507j + this.f17505i) * (i3 - 1);
        }
        int i4 = this.f17500f0;
        Rect rect = this.f17517r;
        rect.set(i4, paddingTop, this.f17521v + i4, this.f17507j + paddingTop);
        Paint paint = this.f17499f;
        if (i2 != 0) {
            paint.setColor(i2);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, paint);
        }
        TextPaint textPaint = this.f17497e;
        textPaint.setColor(i);
        String str = this.f17518s;
        canvas.drawText(str, 0, str.length(), this.f17500f0, this.f17496d0, (Paint) textPaint);
        if (this.f17480L && this.f17482N > 0) {
            ColorStateList colorStateList3 = this.f17481M;
            if (colorStateList3 == null) {
                colorStateList3 = this.f17503h;
            }
            if (colorStateList3 != null) {
                int defaultColor = colorStateList3.getDefaultColor();
                if (this.f17516q) {
                    defaultColor = colorStateList3.getColorForState(iArr, defaultColor);
                }
                paint.setColor(defaultColor);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.f17482N);
                float f = rect.left;
                float f2 = rect.bottom;
                canvas.drawLine(f, f2, rect.right, f2, paint);
            }
        }
        m2687p();
    }

    /* renamed from: f */
    public final void m2697f(Canvas canvas, int i, @Nullable Drawable drawable, int i2, boolean z, boolean z2) {
        Drawable drawable2;
        AbstractC9139d abstractC9139d;
        AbstractC9139d abstractC9139d2;
        if (i != 0) {
            Context context = getContext();
            Object obj = ContextCompat.f2323a;
            drawable2 = ContextCompat.C0651c.m12032b(context, i);
        } else {
            drawable2 = drawable;
        }
        if (i == 0 && drawable != null) {
            drawable.getIntrinsicWidth();
        }
        if (drawable2 == null) {
            return;
        }
        int i3 = 0;
        if (i != 0) {
            int i4 = this.f17507j;
            int i5 = this.f17509k;
            int i6 = (i4 - i5) / 2;
            drawable2.setBounds(0, i6, i5, i6 + i5);
        } else {
            if (z2) {
                i3 = this.f17477I;
            }
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i7 = this.f17507j;
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
                intrinsicHeight = i7;
            }
            int i8 = (i7 - intrinsicHeight) / 2;
            drawable2.setBounds(i3, i8, intrinsicWidth + i3, intrinsicHeight + i8);
        }
        int paddingTop = getPaddingTop();
        if (i2 > 1) {
            paddingTop = this.f17496d0 - this.f17511l;
        }
        canvas.save();
        canvas.translate(this.f17500f0, paddingTop);
        if (this.f17502g0 && (abstractC9139d2 = this.f17504h0) != null) {
            boolean z3 = abstractC9139d2.f17572a;
            abstractC9139d2.getClass();
        }
        drawable2.draw(canvas);
        if (this.f17502g0 && (abstractC9139d = this.f17504h0) != null) {
            abstractC9139d.getClass();
        }
        canvas.restore();
    }

    /* renamed from: g */
    public final void m2696g(Canvas canvas, CharSequence charSequence, int i, int i2) {
        if (i2 > i && i2 <= charSequence.length() && i < charSequence.length()) {
            boolean z = this.f17502g0;
            canvas.drawText(charSequence, i, i2, this.f17500f0, this.f17496d0, this.f17497e);
        }
    }

    public int getFontHeight() {
        return this.f17507j;
    }

    public int getGravity() {
        return this.f17478J;
    }

    public int getLineCount() {
        return this.f17514o;
    }

    public int getLineSpace() {
        return this.f17505i;
    }

    public int getMaxLine() {
        return this.f17512m;
    }

    public int getMaxWidth() {
        return this.f17471C;
    }

    public Rect getMoreHitRect() {
        return this.f17517r;
    }

    public TextPaint getPaint() {
        return this.f17497e;
    }

    public CharSequence getText() {
        return this.f17492a;
    }

    public int getTextSize() {
        return this.f17501g;
    }

    /* renamed from: h */
    public final void m2695h(int i, boolean z) {
        this.f17486R++;
        setContentCalMaxWidth(this.f17485Q);
        this.f17485Q = i;
        if (z) {
            TextUtils.TruncateAt truncateAt = this.f17523x;
            if (truncateAt != null && (truncateAt != TextUtils.TruncateAt.END || this.f17486R > this.f17512m)) {
                return;
            }
            this.f17469A++;
        }
    }

    /* renamed from: i */
    public final void m2694i(Canvas canvas, int i, Drawable drawable, int i2, int i3, int i4, boolean z, boolean z2) {
        int intrinsicWidth;
        if (i != 0) {
            intrinsicWidth = this.f17509k;
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth() + ((z || z2) ? this.f17477I : this.f17477I * 2);
        }
        int i5 = this.f17506i0;
        if (i5 == -1) {
            m2689n(canvas, i, drawable, i4 - this.f17510k0, i2, i3, z, z2);
            return;
        }
        int i6 = this.f17485Q;
        int i7 = (i3 - i6) - (i5 - i2);
        int i8 = this.f17514o - (this.f17525z - i4);
        if (i7 > 0) {
            i8--;
        }
        int i9 = i7 > 0 ? i3 - i7 : i5 - (i3 - i6);
        int i10 = this.f17498e0;
        if (i10 < i8) {
            int i11 = this.f17500f0;
            if (intrinsicWidth + i11 <= i3) {
                this.f17500f0 = i11 + intrinsicWidth;
                return;
            }
            m2684s(i2, i3 - i2, false);
        } else if (i10 != i8) {
            m2689n(canvas, i, drawable, i4 - i8, i2, i3, z, z2);
            return;
        } else {
            int i12 = this.f17500f0;
            if (intrinsicWidth + i12 <= i9) {
                this.f17500f0 = i12 + intrinsicWidth;
                return;
            }
            boolean z3 = i12 >= i9;
            this.f17500f0 = i5;
            this.f17506i0 = -1;
            this.f17510k0 = i8;
            if (!z3) {
                return;
            }
        }
        m2691l(canvas, i, drawable, i2, i3, z, z2);
    }

    /* renamed from: j */
    public final void m2693j(Canvas canvas, CharSequence charSequence, float[] fArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        if (i5 >= charSequence.length()) {
            return;
        }
        int i6 = this.f17506i0;
        if (i6 == -1) {
            m2688o(canvas, charSequence, fArr, i, i3, i4);
            return;
        }
        int i7 = i4 - this.f17485Q;
        int i8 = i7 - (i6 - i3);
        int i9 = this.f17514o - (this.f17525z - i2);
        if (i8 > 0) {
            i9--;
        }
        int i10 = i8 > 0 ? i4 - i8 : i6 - i7;
        int i11 = this.f17498e0;
        if (i11 < i9) {
            while (i5 < fArr.length) {
                float f = this.f17500f0 + fArr[i5];
                if (f > i4) {
                    m2684s(i3, i3 - i4, false);
                    m2693j(canvas, charSequence, fArr, i5, i2, i3, i4);
                    return;
                }
                this.f17500f0 = (int) f;
                i5++;
            }
        } else if (i11 != i9) {
            m2688o(canvas, charSequence, fArr, i, i3, i4);
        } else {
            while (i5 < fArr.length) {
                int i12 = this.f17500f0;
                float f2 = i12 + fArr[i5];
                if (f2 > i10) {
                    int i13 = i5 + 1;
                    if (i12 < i10) {
                        i5 = i13;
                    }
                    this.f17500f0 = this.f17506i0;
                    this.f17506i0 = -1;
                    this.f17510k0 = i9;
                    m2688o(canvas, charSequence, fArr, i5, i3, i4);
                    return;
                }
                this.f17500f0 = (int) f2;
                i5++;
            }
        }
    }

    /* renamed from: k */
    public final void m2692k() {
        this.f17521v = C9143d.m2642c(this.f17518s) ? 0 : (int) Math.ceil(this.f17497e.measureText(this.f17518s));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
        if ((r15.f17500f0 + r11) > r20) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
        if ((r15.f17500f0 + r11) > r20) goto L65;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2691l(android.graphics.Canvas r16, int r17, @androidx.annotation.Nullable android.graphics.drawable.Drawable r18, int r19, int r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.qqface.C9094c.m2691l(android.graphics.Canvas, int, android.graphics.drawable.Drawable, int, int, boolean, boolean):void");
    }

    /* renamed from: m */
    public final void m2690m(Canvas canvas, CharSequence charSequence, float[] fArr, int i, int i2, int i3) {
        int i4;
        int length;
        int i5 = i;
        if (i5 >= charSequence.length()) {
            return;
        }
        if (this.f17524y) {
            TextUtils.TruncateAt truncateAt = this.f17523x;
            if (truncateAt == TextUtils.TruncateAt.START) {
                int i6 = this.f17498e0;
                int i7 = this.f17514o - this.f17525z;
                if (i6 > i7) {
                    m2688o(canvas, charSequence, fArr, i, i2, i3);
                    return;
                } else if (i6 < i7) {
                    while (i5 < charSequence.length()) {
                        float f = this.f17500f0 + fArr[i5];
                        if (f <= i3) {
                            this.f17500f0 = (int) f;
                            i5++;
                        } else {
                            m2684s(i2, i3 - i2, false);
                            m2690m(canvas, charSequence, fArr, i5, i2, i3);
                            return;
                        }
                    }
                    return;
                } else {
                    int i8 = this.f17485Q + this.f17522w;
                    while (i5 < charSequence.length()) {
                        int i9 = this.f17500f0;
                        float f2 = i9 + fArr[i5];
                        if (f2 <= i8) {
                            this.f17500f0 = (int) f2;
                            i5++;
                        } else {
                            int i10 = i5 + 1;
                            if (i9 <= i8) {
                                i5 = i10;
                            }
                            m2684s(this.f17522w + i2, i3 - i2, false);
                            m2690m(canvas, charSequence, fArr, i5, i2, i3);
                            return;
                        }
                    }
                    return;
                }
            }
            if (truncateAt == TextUtils.TruncateAt.MIDDLE) {
                int middleEllipsizeLine = getMiddleEllipsizeLine();
                int i11 = this.f17498e0;
                if (i11 < middleEllipsizeLine) {
                    i4 = this.f17500f0;
                    for (int i12 = i5; i12 < fArr.length; i12++) {
                        float f3 = i4 + fArr[i12];
                        if (f3 <= i3) {
                            i4 = (int) f3;
                        } else {
                            m2696g(canvas, charSequence, i5, i12);
                            m2684s(i2, i3 - i2, false);
                            m2690m(canvas, charSequence, fArr, i12, i2, i3);
                            return;
                        }
                    }
                    length = charSequence.length();
                } else if (i11 == middleEllipsizeLine) {
                    if (this.f17508j0) {
                        m2693j(canvas, charSequence, fArr, i, middleEllipsizeLine, i2, i3);
                        return;
                    }
                    int i13 = ((i3 + i2) / 2) - (this.f17522w / 2);
                    int i14 = this.f17500f0;
                    for (int i15 = i5; i15 < fArr.length; i15++) {
                        float f4 = i14 + fArr[i15];
                        if (f4 <= i13) {
                            i14 = (int) f4;
                        } else {
                            m2696g(canvas, charSequence, i5, i15);
                            this.f17500f0 = i14;
                            m2696g(canvas, "...", 0, 3);
                            this.f17506i0 = this.f17500f0 + this.f17522w;
                            this.f17508j0 = true;
                            m2693j(canvas, charSequence, fArr, i15, middleEllipsizeLine, i2, i3);
                            return;
                        }
                    }
                    m2696g(canvas, charSequence, i5, charSequence.length());
                    this.f17500f0 = i14;
                    return;
                } else {
                    m2693j(canvas, charSequence, fArr, i, middleEllipsizeLine, i2, i3);
                    return;
                }
            } else {
                int i16 = this.f17498e0;
                int i17 = this.f17525z;
                if (i16 < i17) {
                    i4 = this.f17500f0;
                    for (int i18 = i5; i18 < fArr.length; i18++) {
                        float f5 = i4 + fArr[i18];
                        if (f5 <= i3) {
                            i4 = (int) f5;
                        } else {
                            m2696g(canvas, charSequence, i5, i18);
                            m2684s(i2, i3 - i2, false);
                            m2690m(canvas, charSequence, fArr, i18, i2, i3);
                            return;
                        }
                    }
                } else if (i16 == i17) {
                    int i19 = this.f17521v;
                    if (truncateAt == TextUtils.TruncateAt.END) {
                        i19 += this.f17522w;
                    }
                    i4 = this.f17500f0;
                    for (int i20 = i5; i20 < fArr.length; i20++) {
                        float f6 = i4 + fArr[i20];
                        if (f6 <= i3 - i19) {
                            i4 = (int) f6;
                        } else {
                            m2696g(canvas, charSequence, i5, i20);
                            this.f17500f0 = i4;
                            if (this.f17523x == TextUtils.TruncateAt.END) {
                                m2696g(canvas, "...", 0, 3);
                                this.f17500f0 += this.f17522w;
                            }
                            m2698e(canvas);
                            m2684s(i2, i3 - i2, false);
                            return;
                        }
                    }
                } else {
                    return;
                }
                length = fArr.length;
            }
            m2696g(canvas, charSequence, i5, length);
            this.f17500f0 = i4;
            return;
        }
        m2688o(canvas, charSequence, fArr, 0, i2, i3);
    }

    /* renamed from: n */
    public final void m2689n(Canvas canvas, int i, @Nullable Drawable drawable, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5;
        if (i != 0 || drawable == null) {
            i5 = this.f17509k;
        } else {
            i5 = drawable.getIntrinsicWidth() + ((z || z2) ? this.f17477I : this.f17477I * 2);
        }
        int i6 = i5;
        if (this.f17500f0 + i6 > i4) {
            m2684s(i3, i4 - i3, false);
        }
        m2697f(canvas, i, drawable, this.f17498e0 + i2, z, z2);
        this.f17500f0 += i6;
    }

    /* renamed from: o */
    public final void m2688o(Canvas canvas, CharSequence charSequence, float[] fArr, int i, int i2, int i3) {
        int i4 = this.f17500f0;
        int i5 = i;
        while (i < fArr.length) {
            if (i4 + fArr[i] > i3) {
                m2696g(canvas, charSequence, i5, i);
                m2684s(i2, i3 - i2, false);
                i4 = this.f17500f0;
                i5 = i;
            }
            i4 = (int) (i4 + fArr[i]);
            i++;
        }
        if (i5 < fArr.length) {
            m2696g(canvas, charSequence, i5, fArr.length);
            this.f17500f0 = i4;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        ArrayList arrayList;
        if (!this.f17473E && this.f17492a != null && this.f17514o != 0) {
            C9091b.C9093b c9093b = this.f17493b;
            if (c9093b != null && (arrayList = c9093b.f17468c) != null && !arrayList.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                m2687p();
                ArrayList arrayList2 = this.f17493b.f17468c;
                this.f17496d0 = getPaddingTop() + this.f17511l;
                this.f17498e0 = 1;
                m2686q(getPaddingLeft(), (getWidth() - getPaddingLeft()) - getPaddingRight());
                this.f17508j0 = false;
                m2699d(canvas, arrayList2, (getWidth() - getPaddingLeft()) - getPaddingRight());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
        if (r8 < 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
        if (r8 < 2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
        r8 = r8 * r6.f17507j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ee, code lost:
        r1 = r6.f17507j;
        r8 = (r6.f17469A * r6.f17476H) + (((r6.f17505i + r1) * (r8 - 1)) + r1);
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.qqface.C9094c.onMeasure(int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        if (r8.f17516q != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
        if (r4.contains(r0, r1) == false) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.qqface.C9094c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m2687p() {
        ColorStateList colorStateList = this.f17503h;
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            boolean isPressed = isPressed();
            TextPaint textPaint = this.f17497e;
            if (isPressed) {
                defaultColor = this.f17503h.getColorForState(this.f17479K, defaultColor);
            }
            textPaint.setColor(defaultColor);
        }
    }

    /* renamed from: q */
    public final void m2686q(int i, int i2) {
        int i3;
        if (this.f17524y) {
            this.f17500f0 = i;
            return;
        }
        if (this.f17498e0 == this.f17525z) {
            int i4 = this.f17478J;
            if (i4 == 17) {
                i3 = (i2 - (this.f17485Q - i)) / 2;
            } else if (i4 == 5) {
                i3 = i2 - (this.f17485Q - i);
            }
            this.f17500f0 = i3 + i;
            return;
        }
        this.f17500f0 = i;
    }

    /* renamed from: r */
    public final void m2685r(CharSequence charSequence, boolean z) {
        C9091b c9091b;
        if (z && Objects.equals(charSequence, this.f17492a)) {
            return;
        }
        this.f17492a = charSequence;
        setContentDescription(charSequence);
        if (this.f17495d && this.f17494c == null) {
            throw new RuntimeException("mCompiler == null");
        }
        HashMap<C9091b.C9092a, C9098d> hashMap = this.f17515p;
        hashMap.clear();
        C9091b.C9093b c9093b = null;
        if (C9143d.m2642c(this.f17492a)) {
            this.f17493b = null;
        } else {
            if (this.f17495d && (c9091b = this.f17494c) != null) {
                CharSequence charSequence2 = this.f17492a;
                if (!C9143d.m2642c(charSequence2)) {
                    c9093b = c9091b.m2706a(charSequence2, charSequence2.length(), false);
                }
                this.f17493b = c9093b;
                ArrayList arrayList = c9093b.f17468c;
                if (arrayList != null) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        C9091b.C9092a c9092a = (C9091b.C9092a) arrayList.get(i);
                        if (c9092a.f17462a == 4) {
                            hashMap.put(c9092a, new C9098d(c9092a.f17465d));
                        }
                    }
                }
            } else {
                this.f17493b = new C9091b.C9093b(this.f17492a.length());
                String[] split = this.f17492a.toString().split("\\n");
                for (int i2 = 0; i2 < split.length; i2++) {
                    this.f17493b.m2703a(C9091b.C9092a.m2705a(split[i2]));
                    if (i2 != split.length - 1) {
                        C9091b.C9093b c9093b2 = this.f17493b;
                        C9091b.C9092a c9092a2 = new C9091b.C9092a();
                        c9092a2.f17462a = 5;
                        c9093b2.m2703a(c9092a2);
                    }
                }
            }
            this.f17488T = true;
            if (getLayoutParams() == null) {
                return;
            }
            if (getLayoutParams().width != -2 && getLayoutParams().height != -2) {
                int paddingRight = getPaddingRight() + getPaddingLeft();
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (getWidth() > paddingRight && getHeight() > paddingTop) {
                    this.f17514o = 0;
                    m2702a(getWidth());
                    int i3 = this.f17525z;
                    int height = getHeight() - paddingTop;
                    int i4 = this.f17505i;
                    m2700c(Math.min((height + i4) / (this.f17507j + i4), this.f17512m));
                    if (i3 != this.f17525z) {
                        requestLayout();
                    }
                    invalidate();
                    return;
                }
                return;
            }
        }
        requestLayout();
        invalidate();
    }

    /* renamed from: s */
    public final void m2684s(int i, int i2, boolean z) {
        TextUtils.TruncateAt truncateAt;
        int i3 = ((z && ((truncateAt = this.f17523x) == null || truncateAt == TextUtils.TruncateAt.END)) ? this.f17476H : 0) + this.f17505i;
        int i4 = this.f17498e0 + 1;
        this.f17498e0 = i4;
        if (this.f17524y) {
            TextUtils.TruncateAt truncateAt2 = this.f17523x;
            if (truncateAt2 != TextUtils.TruncateAt.START ? truncateAt2 != TextUtils.TruncateAt.MIDDLE || !this.f17508j0 || this.f17506i0 == -1 : i4 > (this.f17514o - this.f17525z) + 1) {
                this.f17496d0 = this.f17507j + i3 + this.f17496d0;
            }
            if (truncateAt2 != null && truncateAt2 != TextUtils.TruncateAt.END && this.f17496d0 > getHeight() - getPaddingBottom()) {
                this.f17523x.name();
                getWidth();
                getHeight();
                getPaddingLeft();
                getPaddingRight();
                getPaddingTop();
                getPaddingBottom();
            }
        } else {
            this.f17496d0 = this.f17507j + i3 + this.f17496d0;
        }
        m2686q(i, i2);
    }

    public void setCompiler(C9091b c9091b) {
        if (this.f17494c != c9091b) {
            this.f17494c = c9091b;
            m2685r(this.f17492a, false);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f17523x != truncateAt) {
            this.f17523x = truncateAt;
            requestLayout();
            invalidate();
        }
    }

    public void setGravity(int i) {
        this.f17478J = i;
    }

    public void setIncludeFontPadding(boolean z) {
        if (this.f17474F != z) {
            this.f17484P = true;
            this.f17474F = z;
            requestLayout();
            invalidate();
        }
    }

    public void setLineSpace(int i) {
        if (this.f17505i != i) {
            this.f17505i = i;
            requestLayout();
            invalidate();
        }
    }

    public void setLinkUnderLineColor(int i) {
        setLinkUnderLineColor(ColorStateList.valueOf(i));
    }

    public void setLinkUnderLineColor(ColorStateList colorStateList) {
        if (this.f17481M != colorStateList) {
            this.f17481M = colorStateList;
            invalidate();
        }
    }

    public void setLinkUnderLineHeight(int i) {
        if (this.f17482N != i) {
            this.f17482N = i;
            invalidate();
        }
    }

    public void setListener(InterfaceC9097c interfaceC9097c) {
    }

    public void setMaxLine(int i) {
        if (this.f17512m != i) {
            this.f17512m = i;
            requestLayout();
            invalidate();
        }
    }

    public void setMaxWidth(int i) {
        if (this.f17471C != i) {
            this.f17471C = i;
            requestLayout();
        }
    }

    public void setMoreActionBgColor(int i) {
        setMoreActionBgColor(ColorStateList.valueOf(i));
    }

    public void setMoreActionBgColor(ColorStateList colorStateList) {
        if (this.f17520u != colorStateList) {
            this.f17520u = colorStateList;
            invalidate();
        }
    }

    public void setMoreActionColor(int i) {
        setMoreActionColor(ColorStateList.valueOf(i));
    }

    public void setMoreActionColor(ColorStateList colorStateList) {
        if (this.f17519t != colorStateList) {
            this.f17519t = colorStateList;
            invalidate();
        }
    }

    public void setMoreActionText(String str) {
        String str2 = this.f17518s;
        if (str2 == null || !str2.equals(str)) {
            this.f17518s = str;
            m2692k();
            requestLayout();
            invalidate();
        }
    }

    public void setNeedUnderlineForMoreText(boolean z) {
        if (this.f17480L != z) {
            this.f17480L = z;
            invalidate();
        }
    }

    public void setOpenQQFace(boolean z) {
        this.f17495d = z;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (getPaddingLeft() != i || getPaddingRight() != i3) {
            this.f17488T = true;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public void setParagraphSpace(int i) {
        if (this.f17476H != i) {
            this.f17476H = i;
            requestLayout();
            invalidate();
        }
    }

    public void setQQFaceSizeAddon(int i) {
        if (this.f17470B != i) {
            this.f17470B = i;
            this.f17488T = true;
            requestLayout();
            invalidate();
        }
    }

    public void setSingleLine(boolean z) {
        if (this.f17513n != z) {
            this.f17513n = z;
            requestLayout();
            invalidate();
        }
    }

    public void setSpecialDrawablePadding(int i) {
        if (this.f17477I != i) {
            this.f17477I = i;
            requestLayout();
            invalidate();
        }
    }

    public void setText(CharSequence charSequence) {
        m2685r(charSequence, true);
    }

    public void setTextColor(@ColorInt int i) {
        setTextColor(ColorStateList.valueOf(i));
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (this.f17503h != colorStateList) {
            this.f17503h = colorStateList;
            invalidate();
        }
    }

    public void setTextSize(int i) {
        if (this.f17501g != i) {
            this.f17501g = i;
            TextPaint textPaint = this.f17497e;
            textPaint.setTextSize(i);
            this.f17484P = true;
            this.f17488T = true;
            this.f17522w = (int) Math.ceil(textPaint.measureText("..."));
            m2692k();
            requestLayout();
            invalidate();
        }
    }

    public void setTypeface(Typeface typeface) {
        if (this.f17475G != typeface) {
            this.f17475G = typeface;
            this.f17484P = true;
            this.f17497e.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }
}
