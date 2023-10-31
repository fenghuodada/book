package com.qmuiteam.qmui.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatImageView;

/* renamed from: com.qmuiteam.qmui.widget.f */
/* loaded from: classes3.dex */
public final class C9209f extends AppCompatImageView {

    /* renamed from: w */
    public static final Bitmap.Config f17788w = Bitmap.Config.ARGB_8888;

    /* renamed from: d */
    public boolean f17789d;

    /* renamed from: e */
    public boolean f17790e;

    /* renamed from: f */
    public boolean f17791f;

    /* renamed from: g */
    public int f17792g;

    /* renamed from: h */
    public int f17793h;

    /* renamed from: i */
    public int f17794i;

    /* renamed from: j */
    public int f17795j;

    /* renamed from: k */
    public int f17796k;

    /* renamed from: l */
    public boolean f17797l;

    /* renamed from: m */
    public int f17798m;

    /* renamed from: n */
    public Paint f17799n;

    /* renamed from: o */
    public ColorFilter f17800o;

    /* renamed from: p */
    public ColorFilter f17801p;

    /* renamed from: q */
    public BitmapShader f17802q;

    /* renamed from: r */
    public boolean f17803r;

    /* renamed from: s */
    public Bitmap f17804s;

    /* renamed from: t */
    public int f17805t;

    /* renamed from: u */
    public int f17806u;

    /* renamed from: v */
    public ImageView.ScaleType f17807v;

    private Bitmap getBitmap() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            try {
                boolean z = drawable instanceof ColorDrawable;
                Bitmap.Config config = f17788w;
                Bitmap createBitmap = z ? Bitmap.createBitmap(2, 2, config) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), config);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                drawable.draw(canvas);
                return createBitmap;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap == null) {
            return null;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        if (width == 0.0f || height == 0.0f) {
            return null;
        }
        float minimumWidth = getMinimumWidth() / width;
        float minimumHeight = getMinimumHeight() / height;
        if (minimumWidth > 1.0f || minimumHeight > 1.0f) {
            float max = Math.max(minimumWidth, minimumHeight);
            Matrix matrix = new Matrix();
            matrix.postScale(max, max);
            return Bitmap.createBitmap(bitmap, 0, 0, (int) width, (int) height, matrix, false);
        }
        return bitmap;
    }

    /* renamed from: a */
    public final void m2576a() {
        Bitmap bitmap = getBitmap();
        if (bitmap == this.f17804s) {
            return;
        }
        this.f17804s = bitmap;
        if (bitmap == null) {
            this.f17802q = null;
        } else {
            this.f17803r = true;
            Bitmap bitmap2 = this.f17804s;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f17802q = new BitmapShader(bitmap2, tileMode, tileMode);
            if (this.f17799n == null) {
                Paint paint = new Paint();
                this.f17799n = paint;
                paint.setAntiAlias(true);
            }
            this.f17799n.setShader(this.f17802q);
            requestLayout();
        }
        invalidate();
    }

    public int getBorderColor() {
        return this.f17793h;
    }

    public int getBorderWidth() {
        return this.f17792g;
    }

    public int getCornerRadius() {
        return this.f17798m;
    }

    public int getSelectedBorderColor() {
        return this.f17795j;
    }

    public int getSelectedBorderWidth() {
        return this.f17794i;
    }

    public int getSelectedMaskColor() {
        return this.f17796k;
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.f17789d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        ColorFilter colorFilter;
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            if (this.f17789d) {
                i = this.f17794i;
            } else {
                i = this.f17792g;
            }
            if (this.f17804s != null && this.f17802q != null) {
                if (this.f17805t == width && this.f17806u == height && this.f17807v == getScaleType() && !this.f17803r) {
                    Paint paint = this.f17799n;
                    if (this.f17789d) {
                        colorFilter = this.f17801p;
                    } else {
                        colorFilter = this.f17800o;
                    }
                    paint.setColorFilter(colorFilter);
                    throw null;
                }
                this.f17805t = width;
                this.f17806u = height;
                this.f17807v = getScaleType();
                throw null;
            } else if (i <= 0) {
            } else {
                throw null;
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
        } else if (!this.f17791f) {
            super.onMeasure(i, i2);
        } else if (mode == 1073741824) {
            setMeasuredDimension(size, size);
        } else if (mode2 == 1073741824) {
            setMeasuredDimension(size2, size2);
        } else {
            Bitmap bitmap = this.f17804s;
            int min = bitmap == null ? 0 : Math.min(Math.min(bitmap.getWidth(), size), Math.min(this.f17804s.getHeight(), size2));
            setMeasuredDimension(min, min);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            setSelected(false);
            return super.onTouchEvent(motionEvent);
        } else if (this.f17797l) {
            int action = motionEvent.getAction();
            if (action == 0) {
                setSelected(true);
            } else if (action == 1 || action == 3 || action == 4 || action == 8) {
                setSelected(false);
            }
            return super.onTouchEvent(motionEvent);
        } else {
            return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("不支持adjustViewBounds");
        }
    }

    public void setBorderColor(@ColorInt int i) {
        if (this.f17793h != i) {
            this.f17793h = i;
            invalidate();
        }
    }

    public void setBorderWidth(int i) {
        if (this.f17792g != i) {
            this.f17792g = i;
            invalidate();
        }
    }

    public void setCircle(boolean z) {
        if (this.f17791f != z) {
            this.f17791f = z;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f17800o == colorFilter) {
            return;
        }
        this.f17800o = colorFilter;
        if (this.f17789d) {
            return;
        }
        invalidate();
    }

    public void setCornerRadius(int i) {
        if (this.f17798m != i) {
            this.f17798m = i;
            if (this.f17791f || this.f17790e) {
                return;
            }
            invalidate();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m2576a();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m2576a();
    }

    public void setOval(boolean z) {
        boolean z2 = false;
        if (z && this.f17791f) {
            this.f17791f = false;
            z2 = true;
        }
        if (this.f17790e != z || z2) {
            this.f17790e = z;
            requestLayout();
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        if (this.f17789d != z) {
            this.f17789d = z;
            invalidate();
        }
    }

    public void setSelectedBorderColor(@ColorInt int i) {
        if (this.f17795j != i) {
            this.f17795j = i;
            if (this.f17789d) {
                invalidate();
            }
        }
    }

    public void setSelectedBorderWidth(int i) {
        if (this.f17794i != i) {
            this.f17794i = i;
            if (this.f17789d) {
                invalidate();
            }
        }
    }

    public void setSelectedColorFilter(ColorFilter colorFilter) {
        if (this.f17801p == colorFilter) {
            return;
        }
        this.f17801p = colorFilter;
        if (this.f17789d) {
            invalidate();
        }
    }

    public void setSelectedMaskColor(@ColorInt int i) {
        if (this.f17796k != i) {
            this.f17796k = i;
            this.f17801p = i != 0 ? new PorterDuffColorFilter(this.f17796k, PorterDuff.Mode.DARKEN) : null;
            if (this.f17789d) {
                invalidate();
            }
        }
        this.f17796k = i;
    }

    public void setTouchSelectModeEnabled(boolean z) {
        this.f17797l = z;
    }
}
