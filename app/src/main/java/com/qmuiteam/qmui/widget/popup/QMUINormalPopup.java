package com.qmuiteam.qmui.widget.popup;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.layout.C9059c;
import com.qmuiteam.qmui.skin.InterfaceC9100b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.popup.AbstractC9221a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class QMUINormalPopup<T extends AbstractC9221a> extends AbstractC9221a<T> {

    /* renamed from: j */
    public boolean f17848j;

    /* renamed from: k */
    public boolean f17849k;

    /* renamed from: l */
    public int f17850l;

    /* renamed from: m */
    public int f17851m;

    /* renamed from: n */
    public final int f17852n;

    /* renamed from: o */
    public int f17853o;

    /* renamed from: p */
    public int f17854p;

    /* renamed from: q */
    public float f17855q;

    /* renamed from: r */
    public int f17856r;

    /* renamed from: s */
    public int f17857s;

    /* renamed from: t */
    public final int f17858t;

    /* renamed from: u */
    public final int f17859u;

    /* renamed from: v */
    public final int f17860v;

    /* renamed from: w */
    public final int f17861w;

    /* renamed from: x */
    public int f17862x;

    /* renamed from: y */
    public int f17863y;

    /* renamed from: z */
    public View f17864z;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Direction {
    }

    /* renamed from: com.qmuiteam.qmui.widget.popup.QMUINormalPopup$a */
    /* loaded from: classes3.dex */
    public static class C9217a extends C9059c {
        public C9217a(Context context) {
            super(context);
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.popup.QMUINormalPopup$b */
    /* loaded from: classes3.dex */
    public class C9218b extends FrameLayout implements InterfaceC9100b {

        /* renamed from: a */
        public final QMUINormalPopup<T>.C9220c f17865a;

        /* renamed from: b */
        public View f17866b;

        /* renamed from: c */
        public final Paint f17867c;

        /* renamed from: d */
        public final Path f17868d;

        /* renamed from: e */
        public final RectF f17869e;

        /* renamed from: f */
        public final PorterDuffXfermode f17870f;

        /* renamed from: g */
        public int f17871g;

        /* renamed from: h */
        public int f17872h;

        /* renamed from: i */
        public final RunnableC9219a f17873i;

        /* renamed from: j */
        public final /* synthetic */ QMUINormalPopup f17874j;

        /* renamed from: com.qmuiteam.qmui.widget.popup.QMUINormalPopup$b$a */
        /* loaded from: classes3.dex */
        public class RunnableC9219a implements Runnable {
            public RunnableC9219a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C9218b c9218b = C9218b.this;
                QMUINormalPopup<T>.C9220c c9220c = c9218b.f17865a;
                c9220c.f17879d = c9218b.f17871g;
                c9220c.f17880e = c9218b.f17872h;
                QMUINormalPopup qMUINormalPopup = c9218b.f17874j;
                qMUINormalPopup.m2568d(c9220c);
                QMUINormalPopup<T>.C9220c c9220c2 = c9218b.f17865a;
                qMUINormalPopup.m2569c(c9220c2);
                PopupWindow popupWindow = qMUINormalPopup.f17892a;
                int i = c9220c2.f17881f;
                int[] iArr = c9220c2.f17876a;
                popupWindow.update(i - iArr[0], c9220c2.f17882g - iArr[1], c9220c2.f17888m + c9220c2.f17879d + c9220c2.f17889n, c9220c2.f17890o + c9220c2.f17880e + c9220c2.f17891p);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9218b(C9231d c9231d, Context context, C9220c c9220c) {
            super(context);
            this.f17874j = c9231d;
            this.f17869e = new RectF();
            this.f17870f = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.f17873i = new RunnableC9219a();
            this.f17865a = c9220c;
            Paint paint = new Paint();
            this.f17867c = paint;
            paint.setAntiAlias(true);
            this.f17868d = new Path();
        }

        @Override // com.qmuiteam.qmui.skin.InterfaceC9100b
        /* renamed from: a */
        public final void mo2566a(@NotNull Resources.Theme theme) {
            QMUINormalPopup qMUINormalPopup = this.f17874j;
            qMUINormalPopup.getClass();
            int i = qMUINormalPopup.f17852n;
            if (i != 0) {
                qMUINormalPopup.f17851m = C9145f.m2639b(i, theme);
            }
            int i2 = qMUINormalPopup.f17858t;
            if (i2 != 0) {
                qMUINormalPopup.f17857s = C9145f.m2639b(i2, theme);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void dispatchDraw(Canvas canvas) {
            QMUINormalPopup<T>.C9220c c9220c;
            int i;
            int saveLayer;
            float f;
            float f2;
            float f3;
            float f4;
            super.dispatchDraw(canvas);
            QMUINormalPopup qMUINormalPopup = this.f17874j;
            if (qMUINormalPopup.f17848j) {
                int i2 = this.f17865a.f17885j;
                PorterDuffXfermode porterDuffXfermode = this.f17870f;
                RectF rectF = this.f17869e;
                Path path = this.f17868d;
                Paint paint = this.f17867c;
                if (i2 == 0) {
                    canvas.save();
                    rectF.set(0.0f, 0.0f, c9220c.f17879d, c9220c.f17880e);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setColor(qMUINormalPopup.f17857s);
                    paint.setXfermode(null);
                    canvas.translate(Math.min(Math.max((c9220c.f17884i - c9220c.f17881f) - (qMUINormalPopup.f17862x / 2), c9220c.f17888m), (getWidth() - c9220c.f17889n) - qMUINormalPopup.f17862x), (c9220c.f17890o + c9220c.f17880e) - qMUINormalPopup.f17853o);
                    path.reset();
                    path.setLastPoint((-qMUINormalPopup.f17862x) / 2.0f, -qMUINormalPopup.f17863y);
                    path.lineTo(qMUINormalPopup.f17862x / 2.0f, qMUINormalPopup.f17863y);
                    path.lineTo((qMUINormalPopup.f17862x * 3) / 2.0f, -qMUINormalPopup.f17863y);
                    path.close();
                    canvas.drawPath(path, paint);
                    qMUINormalPopup.getClass();
                    int i3 = qMUINormalPopup.f17853o;
                    rectF.set(0.0f, -i3, qMUINormalPopup.f17862x, qMUINormalPopup.f17863y + i3);
                    saveLayer = canvas.saveLayer(rectF, paint, 31);
                    paint.setStrokeWidth(qMUINormalPopup.f17853o);
                    paint.setColor(qMUINormalPopup.f17851m);
                    paint.setStyle(Paint.Style.STROKE);
                    canvas.drawPath(path, paint);
                    paint.setXfermode(porterDuffXfermode);
                    paint.setStyle(Paint.Style.FILL);
                    f = 0.0f;
                    f2 = -qMUINormalPopup.f17853o;
                    f3 = qMUINormalPopup.f17862x;
                    f4 = 0.0f;
                } else if (i2 == 1) {
                    canvas.save();
                    paint.setStyle(Paint.Style.FILL);
                    paint.setXfermode(null);
                    paint.setColor(qMUINormalPopup.f17857s);
                    canvas.translate(Math.min(Math.max((c9220c.f17884i - c9220c.f17881f) - (qMUINormalPopup.f17862x / 2), c9220c.f17888m), (getWidth() - c9220c.f17889n) - qMUINormalPopup.f17862x), c9220c.f17890o + qMUINormalPopup.f17853o);
                    path.reset();
                    path.setLastPoint((-qMUINormalPopup.f17862x) / 2.0f, qMUINormalPopup.f17863y);
                    path.lineTo(qMUINormalPopup.f17862x / 2.0f, -qMUINormalPopup.f17863y);
                    path.lineTo((qMUINormalPopup.f17862x * 3) / 2.0f, qMUINormalPopup.f17863y);
                    path.close();
                    canvas.drawPath(path, paint);
                    qMUINormalPopup.getClass();
                    rectF.set(0.0f, (-qMUINormalPopup.f17863y) - i, qMUINormalPopup.f17862x, qMUINormalPopup.f17853o);
                    saveLayer = canvas.saveLayer(rectF, paint, 31);
                    paint.setStrokeWidth(qMUINormalPopup.f17853o);
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setColor(qMUINormalPopup.f17851m);
                    canvas.drawPath(path, paint);
                    paint.setXfermode(porterDuffXfermode);
                    paint.setStyle(Paint.Style.FILL);
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = qMUINormalPopup.f17862x;
                    f4 = qMUINormalPopup.f17853o;
                } else {
                    return;
                }
                canvas.drawRect(f, f2, f3, f4, paint);
                canvas.restoreToCount(saveLayer);
                canvas.restore();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            removeCallbacks(this.f17873i);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            View view = this.f17866b;
            if (view != null) {
                QMUINormalPopup<T>.C9220c c9220c = this.f17865a;
                int i5 = c9220c.f17888m;
                int i6 = c9220c.f17890o;
                view.layout(i5, i6, c9220c.f17879d + i5, c9220c.f17880e + i6);
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            RunnableC9219a runnableC9219a = this.f17873i;
            removeCallbacks(runnableC9219a);
            View view = this.f17866b;
            QMUINormalPopup<T>.C9220c c9220c = this.f17865a;
            if (view != null) {
                view.measure(c9220c.f17886k, c9220c.f17887l);
                int measuredWidth = this.f17866b.getMeasuredWidth();
                int measuredHeight = this.f17866b.getMeasuredHeight();
                if (c9220c.f17879d != measuredWidth || c9220c.f17880e != measuredHeight) {
                    this.f17871g = measuredWidth;
                    this.f17872h = measuredHeight;
                    post(runnableC9219a);
                }
            }
            setMeasuredDimension(c9220c.f17888m + c9220c.f17879d + c9220c.f17889n, c9220c.f17890o + c9220c.f17880e + c9220c.f17891p);
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.popup.QMUINormalPopup$c */
    /* loaded from: classes3.dex */
    public class C9220c {

        /* renamed from: a */
        public final int[] f17876a;

        /* renamed from: b */
        public final Rect f17877b;

        /* renamed from: c */
        public final Rect f17878c;

        /* renamed from: d */
        public int f17879d;

        /* renamed from: e */
        public int f17880e;

        /* renamed from: f */
        public int f17881f;

        /* renamed from: g */
        public int f17882g;

        /* renamed from: h */
        public final int f17883h;

        /* renamed from: i */
        public final int f17884i;

        /* renamed from: j */
        public int f17885j;

        /* renamed from: k */
        public int f17886k;

        /* renamed from: l */
        public int f17887l;

        /* renamed from: m */
        public int f17888m;

        /* renamed from: n */
        public int f17889n;

        /* renamed from: o */
        public int f17890o;

        /* renamed from: p */
        public int f17891p;

        public C9220c(C9231d c9231d, View view, int i, int i2) {
            int[] iArr = new int[2];
            this.f17876a = iArr;
            Rect rect = new Rect();
            this.f17877b = rect;
            Rect rect2 = new Rect();
            this.f17878c = rect2;
            this.f17885j = c9231d.f17859u;
            this.f17888m = 0;
            this.f17889n = 0;
            this.f17890o = 0;
            this.f17891p = 0;
            this.f17883h = i2 + 0;
            view.getRootView().getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            this.f17884i = ((0 + i) / 2) + iArr2[0];
            view.getWindowVisibleDisplayFrame(rect2);
            int i3 = iArr2[0];
            rect.left = 0 + i3;
            int i4 = iArr2[1];
            rect.top = 0 + i4;
            rect.right = i3 + i;
            rect.bottom = i4 + i2;
        }
    }

    public QMUINormalPopup(Context context, int i) {
        super(context);
        this.f17848j = true;
        this.f17849k = false;
        this.f17850l = -1;
        this.f17851m = 0;
        this.f17852n = R.attr.qmui_skin_support_popup_border_color;
        this.f17853o = -1;
        this.f17854p = -1;
        this.f17855q = 0.0f;
        this.f17856r = -1;
        this.f17857s = 0;
        this.f17858t = R.attr.qmui_skin_support_popup_bg;
        this.f17859u = 1;
        this.f17862x = -1;
        this.f17863y = -1;
        this.f17860v = i;
        this.f17861w = -2;
    }

    /* renamed from: e */
    public static void m2567e(C9220c c9220c, int i, int i2) {
        if (i == 2) {
            Rect rect = c9220c.f17878c;
            c9220c.f17881f = ((rect.width() - c9220c.f17879d) / 2) + rect.left;
            Rect rect2 = c9220c.f17878c;
            c9220c.f17882g = ((rect2.height() - c9220c.f17880e) / 2) + rect2.top;
            c9220c.f17885j = 2;
            return;
        }
        if (i == 0) {
            int i3 = (c9220c.f17877b.top - c9220c.f17880e) - 0;
            c9220c.f17882g = i3;
            if (i3 >= c9220c.f17878c.top + 0) {
                c9220c.f17885j = 0;
                return;
            }
        } else if (i == 1) {
            int i4 = c9220c.f17877b.top + c9220c.f17883h + 0;
            c9220c.f17882g = i4;
            if (i4 <= (c9220c.f17878c.bottom - 0) - c9220c.f17880e) {
                c9220c.f17885j = 1;
                return;
            }
        } else {
            return;
        }
        m2567e(c9220c, i2, 2);
    }

    /* renamed from: c */
    public final void m2569c(QMUINormalPopup<T>.C9220c c9220c) {
        boolean z = this.f17849k;
        Context context = this.f17894c;
        if (z) {
            if (this.f17854p == -1) {
                this.f17854p = C9145f.m2636e(context, R.attr.qmui_popup_shadow_elevation);
                this.f17855q = C9145f.m2633h(R.attr.qmui_popup_shadow_alpha, context.getTheme());
            }
            if (this.f17856r == -1) {
                this.f17856r = C9145f.m2636e(context, R.attr.qmui_popup_shadow_inset);
            }
            int i = c9220c.f17881f;
            int i2 = c9220c.f17882g;
            int i3 = this.f17856r;
            int i4 = i - i3;
            Rect rect = c9220c.f17878c;
            int i5 = rect.left;
            if (i4 > i5) {
                c9220c.f17881f = i4;
                c9220c.f17888m = i3;
            } else {
                c9220c.f17888m = i - i5;
                c9220c.f17881f = i5;
            }
            int i6 = c9220c.f17879d;
            int i7 = i + i6 + i3;
            int i8 = rect.right;
            if (i7 < i8) {
                c9220c.f17889n = i3;
            } else {
                c9220c.f17889n = (i8 - i) - i6;
            }
            int i9 = i2 - i3;
            int i10 = rect.top;
            if (i9 > i10) {
                c9220c.f17882g = i9;
                c9220c.f17890o = i3;
            } else {
                c9220c.f17890o = i2 - i10;
                c9220c.f17882g = i10;
            }
            int i11 = c9220c.f17880e;
            int i12 = i2 + i11 + i3;
            int i13 = rect.bottom;
            if (i12 < i13) {
                c9220c.f17891p = i3;
            } else {
                c9220c.f17891p = (i13 - i2) - i11;
            }
        }
        if (this.f17848j && c9220c.f17885j != 2) {
            if (this.f17862x == -1) {
                this.f17862x = C9145f.m2636e(context, R.attr.qmui_popup_arrow_width);
            }
            if (this.f17863y == -1) {
                this.f17863y = C9145f.m2636e(context, R.attr.qmui_popup_arrow_height);
            }
            int i14 = c9220c.f17885j;
            if (i14 == 1) {
                if (this.f17849k) {
                    c9220c.f17882g += this.f17863y;
                }
                c9220c.f17890o = Math.max(c9220c.f17890o, this.f17863y);
            } else if (i14 == 0) {
                c9220c.f17891p = Math.max(c9220c.f17891p, this.f17863y);
                c9220c.f17882g -= this.f17863y;
            }
        }
    }

    /* renamed from: d */
    public final void m2568d(QMUINormalPopup<T>.C9220c c9220c) {
        int min;
        int i = c9220c.f17884i;
        Rect rect = c9220c.f17878c;
        int i2 = 2;
        int width = (rect.width() / 2) + rect.left;
        int i3 = c9220c.f17884i;
        if (i < width) {
            min = Math.max(rect.left + 0, (i3 - (c9220c.f17879d / 2)) + 0);
        } else {
            int i4 = c9220c.f17879d;
            min = Math.min((rect.right - 0) - i4, (i3 - (i4 / 2)) + 0);
        }
        c9220c.f17881f = min;
        int i5 = this.f17859u;
        if (i5 == 1) {
            i2 = 0;
        } else if (i5 == 0) {
            i2 = 1;
        }
        m2567e(c9220c, i5, i2);
    }
}
