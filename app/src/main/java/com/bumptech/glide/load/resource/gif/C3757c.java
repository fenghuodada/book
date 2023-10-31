package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.resource.gif.C3762g;
import com.bumptech.glide.util.C3860j;
import java.util.ArrayList;

/* renamed from: com.bumptech.glide.load.resource.gif.c */
/* loaded from: classes.dex */
public final class C3757c extends Drawable implements C3762g.InterfaceC3764b, Animatable {

    /* renamed from: a */
    public final C3758a f9743a;

    /* renamed from: b */
    public boolean f9744b;

    /* renamed from: c */
    public boolean f9745c;

    /* renamed from: d */
    public boolean f9746d;

    /* renamed from: e */
    public boolean f9747e;

    /* renamed from: f */
    public int f9748f;

    /* renamed from: g */
    public final int f9749g;

    /* renamed from: h */
    public boolean f9750h;

    /* renamed from: i */
    public Paint f9751i;

    /* renamed from: j */
    public Rect f9752j;

    /* renamed from: com.bumptech.glide.load.resource.gif.c$a */
    /* loaded from: classes.dex */
    public static final class C3758a extends Drawable.ConstantState {
        @VisibleForTesting

        /* renamed from: a */
        public final C3762g f9753a;

        public C3758a(C3762g c3762g) {
            this.f9753a = c3762g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new C3757c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new C3757c(this);
        }
    }

    public C3757c() {
        throw null;
    }

    public C3757c(C3758a c3758a) {
        this.f9747e = true;
        this.f9749g = -1;
        C3860j.m6404b(c3758a);
        this.f9743a = c3758a;
    }

    @Override // com.bumptech.glide.load.resource.gif.C3762g.InterfaceC3764b
    /* renamed from: a */
    public final void mo6505a() {
        C3762g c3762g;
        int i;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        C3762g.C3763a c3763a = this.f9743a.f9753a.f9763i;
        if (c3763a != null) {
            i = c3763a.f9773e;
        } else {
            i = -1;
        }
        if (i == c3762g.f9755a.mo6754c() - 1) {
            this.f9748f++;
        }
        int i2 = this.f9749g;
        if (i2 != -1 && this.f9748f >= i2) {
            stop();
        }
    }

    /* renamed from: b */
    public final void m6513b() {
        C3860j.m6405a(!this.f9746d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        C3758a c3758a = this.f9743a;
        if (c3758a.f9753a.f9755a.mo6754c() != 1) {
            if (!this.f9744b) {
                this.f9744b = true;
                C3762g c3762g = c3758a.f9753a;
                if (!c3762g.f9764j) {
                    ArrayList arrayList = c3762g.f9757c;
                    if (!arrayList.contains(this)) {
                        boolean isEmpty = arrayList.isEmpty();
                        arrayList.add(this);
                        if (isEmpty && !c3762g.f9760f) {
                            c3762g.f9760f = true;
                            c3762g.f9764j = false;
                            c3762g.m6508a();
                        }
                    } else {
                        throw new IllegalStateException("Cannot subscribe twice in a row");
                    }
                } else {
                    throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
                }
            } else {
                return;
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Bitmap bitmap;
        if (this.f9746d) {
            return;
        }
        if (this.f9750h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f9752j == null) {
                this.f9752j = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f9752j);
            this.f9750h = false;
        }
        C3762g c3762g = this.f9743a.f9753a;
        C3762g.C3763a c3763a = c3762g.f9763i;
        if (c3763a != null) {
            bitmap = c3763a.f9775g;
        } else {
            bitmap = c3762g.f9766l;
        }
        if (this.f9752j == null) {
            this.f9752j = new Rect();
        }
        Rect rect = this.f9752j;
        if (this.f9751i == null) {
            this.f9751i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f9751i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f9743a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9743a.f9753a.f9771q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9743a.f9753a.f9770p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f9744b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f9750h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f9751i == null) {
            this.f9751i = new Paint(2);
        }
        this.f9751i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f9751i == null) {
            this.f9751i = new Paint(2);
        }
        this.f9751i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        C3860j.m6405a(!this.f9746d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f9747e = z;
        if (!z) {
            this.f9744b = false;
            C3762g c3762g = this.f9743a.f9753a;
            ArrayList arrayList = c3762g.f9757c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c3762g.f9760f = false;
            }
        } else if (this.f9745c) {
            m6513b();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f9745c = true;
        this.f9748f = 0;
        if (this.f9747e) {
            m6513b();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f9745c = false;
        this.f9744b = false;
        C3762g c3762g = this.f9743a.f9753a;
        ArrayList arrayList = c3762g.f9757c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c3762g.f9760f = false;
        }
    }
}
