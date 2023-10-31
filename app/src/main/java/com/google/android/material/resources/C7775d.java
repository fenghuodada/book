package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.C0676f;
import com.google.android.material.C7621c;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: com.google.android.material.resources.d */
/* loaded from: classes3.dex */
public final class C7775d {
    @Nullable

    /* renamed from: a */
    public final ColorStateList f15137a;
    @Nullable

    /* renamed from: b */
    public final String f15138b;

    /* renamed from: c */
    public final int f15139c;

    /* renamed from: d */
    public final int f15140d;

    /* renamed from: e */
    public final float f15141e;

    /* renamed from: f */
    public final float f15142f;

    /* renamed from: g */
    public final float f15143g;

    /* renamed from: h */
    public final boolean f15144h;

    /* renamed from: i */
    public final float f15145i;
    @Nullable

    /* renamed from: j */
    public ColorStateList f15146j;

    /* renamed from: k */
    public float f15147k;
    @FontRes

    /* renamed from: l */
    public final int f15148l;

    /* renamed from: m */
    public boolean f15149m = false;

    /* renamed from: n */
    public Typeface f15150n;

    /* renamed from: com.google.android.material.resources.d$a */
    /* loaded from: classes3.dex */
    public class C7776a extends C0676f.AbstractC0681e {

        /* renamed from: a */
        public final /* synthetic */ AbstractC7778f f15151a;

        public C7776a(AbstractC7778f abstractC7778f) {
            this.f15151a = abstractC7778f;
        }

        @Override // androidx.core.content.res.C0676f.AbstractC0681e
        public final void onFontRetrievalFailed(int i) {
            C7775d.this.f15149m = true;
            this.f15151a.mo4484a(i);
        }

        @Override // androidx.core.content.res.C0676f.AbstractC0681e
        public final void onFontRetrieved(@NonNull Typeface typeface) {
            C7775d c7775d = C7775d.this;
            c7775d.f15150n = Typeface.create(typeface, c7775d.f15139c);
            c7775d.f15149m = true;
            this.f15151a.mo4483b(c7775d.f15150n, false);
        }
    }

    public C7775d(@NonNull Context context, @StyleRes int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7621c.f14605y);
        this.f15147k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f15146j = C7774c.m4495a(context, obtainStyledAttributes, 3);
        C7774c.m4495a(context, obtainStyledAttributes, 4);
        C7774c.m4495a(context, obtainStyledAttributes, 5);
        this.f15139c = obtainStyledAttributes.getInt(2, 0);
        this.f15140d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f15148l = obtainStyledAttributes.getResourceId(i2, 0);
        this.f15138b = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f15137a = C7774c.m4495a(context, obtainStyledAttributes, 6);
        this.f15141e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f15142f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f15143g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C7621c.f14597q);
        this.f15144h = obtainStyledAttributes2.hasValue(0);
        this.f15145i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m4491a() {
        String str;
        Typeface typeface = this.f15150n;
        int i = this.f15139c;
        if (typeface == null && (str = this.f15138b) != null) {
            this.f15150n = Typeface.create(str, i);
        }
        if (this.f15150n == null) {
            int i2 = this.f15140d;
            this.f15150n = i2 != 1 ? i2 != 2 ? i2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f15150n = Typeface.create(this.f15150n, i);
        }
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: b */
    public final Typeface m4490b(@NonNull Context context) {
        if (this.f15149m) {
            return this.f15150n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m11989b = C0676f.m11989b(context, this.f15148l);
                this.f15150n = m11989b;
                if (m11989b != null) {
                    this.f15150n = Typeface.create(m11989b, this.f15139c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f15138b, e);
            }
        }
        m4491a();
        this.f15149m = true;
        return this.f15150n;
    }

    /* renamed from: c */
    public final void m4489c(@NonNull Context context, @NonNull AbstractC7778f abstractC7778f) {
        if (m4488d(context)) {
            m4490b(context);
        } else {
            m4491a();
        }
        int i = this.f15148l;
        if (i == 0) {
            this.f15149m = true;
        }
        if (this.f15149m) {
            abstractC7778f.mo4483b(this.f15150n, true);
            return;
        }
        try {
            C0676f.m11988c(context, i, new C7776a(abstractC7778f));
        } catch (Resources.NotFoundException unused) {
            this.f15149m = true;
            abstractC7778f.mo4484a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f15138b, e);
            this.f15149m = true;
            abstractC7778f.mo4484a(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[ORIG_RETURN, RETURN] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4488d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f15148l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.core.content.res.C0676f.f2356a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = androidx.core.content.res.C0676f.m11987d(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.resources.C7775d.m4488d(android.content.Context):boolean");
    }

    /* renamed from: e */
    public final void m4487e(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull AbstractC7778f abstractC7778f) {
        m4486f(context, textPaint, abstractC7778f);
        ColorStateList colorStateList = this.f15146j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f15137a;
        textPaint.setShadowLayer(this.f15143g, this.f15141e, this.f15142f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: f */
    public final void m4486f(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull AbstractC7778f abstractC7778f) {
        if (m4488d(context)) {
            m4485g(context, textPaint, m4490b(context));
            return;
        }
        m4491a();
        m4485g(context, textPaint, this.f15150n);
        m4489c(context, new C7777e(this, context, textPaint, abstractC7778f));
    }

    /* renamed from: g */
    public final void m4485g(@NonNull Context context, @NonNull TextPaint textPaint, @NonNull Typeface typeface) {
        boolean z;
        float f;
        Typeface m4481a = C7780h.m4481a(context.getResources().getConfiguration(), typeface);
        if (m4481a != null) {
            typeface = m4481a;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f15139c;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f15147k);
        if (this.f15144h) {
            textPaint.setLetterSpacing(this.f15145i);
        }
    }
}
