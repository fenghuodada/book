package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.activity.RunnableC0046h;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0856a2;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.f2 */
/* loaded from: classes.dex */
public final class View$OnLongClickListenerC0346f2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k */
    public static View$OnLongClickListenerC0346f2 f1235k;

    /* renamed from: l */
    public static View$OnLongClickListenerC0346f2 f1236l;

    /* renamed from: a */
    public final View f1237a;

    /* renamed from: b */
    public final CharSequence f1238b;

    /* renamed from: c */
    public final int f1239c;

    /* renamed from: d */
    public final RunnableC0342e2 f1240d = new Runnable() { // from class: androidx.appcompat.widget.e2
        @Override // java.lang.Runnable
        public final void run() {
            View$OnLongClickListenerC0346f2.this.m12635c(false);
        }
    };

    /* renamed from: e */
    public final RunnableC0046h f1241e = new RunnableC0046h(this, 1);

    /* renamed from: f */
    public int f1242f;

    /* renamed from: g */
    public int f1243g;

    /* renamed from: h */
    public C0350g2 f1244h;

    /* renamed from: i */
    public boolean f1245i;

    /* renamed from: j */
    public boolean f1246j;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.e2] */
    public View$OnLongClickListenerC0346f2(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f1237a = view;
        this.f1238b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C0856a2.f2600a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = C0856a2.C0858b.m11580a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f1239c = scaledTouchSlop;
        this.f1246j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m12636b(View$OnLongClickListenerC0346f2 view$OnLongClickListenerC0346f2) {
        View$OnLongClickListenerC0346f2 view$OnLongClickListenerC0346f22 = f1235k;
        if (view$OnLongClickListenerC0346f22 != null) {
            view$OnLongClickListenerC0346f22.f1237a.removeCallbacks(view$OnLongClickListenerC0346f22.f1240d);
        }
        f1235k = view$OnLongClickListenerC0346f2;
        if (view$OnLongClickListenerC0346f2 != null) {
            view$OnLongClickListenerC0346f2.f1237a.postDelayed(view$OnLongClickListenerC0346f2.f1240d, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m12637a() {
        boolean z;
        View$OnLongClickListenerC0346f2 view$OnLongClickListenerC0346f2 = f1236l;
        View view = this.f1237a;
        if (view$OnLongClickListenerC0346f2 == this) {
            f1236l = null;
            C0350g2 c0350g2 = this.f1244h;
            if (c0350g2 != null) {
                View view2 = c0350g2.f1252b;
                if (view2.getParent() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((WindowManager) c0350g2.f1251a.getSystemService("window")).removeView(view2);
                }
                this.f1244h = null;
                this.f1246j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1235k == this) {
            m12636b(null);
        }
        view.removeCallbacks(this.f1241e);
    }

    /* renamed from: c */
    public final void m12635c(boolean z) {
        boolean z2;
        int height;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        long longPressTimeout;
        long j;
        long j2;
        boolean z3;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        View view = this.f1237a;
        if (!ViewCompat.C0817g.m11730b(view)) {
            return;
        }
        m12636b(null);
        View$OnLongClickListenerC0346f2 view$OnLongClickListenerC0346f2 = f1236l;
        if (view$OnLongClickListenerC0346f2 != null) {
            view$OnLongClickListenerC0346f2.m12637a();
        }
        f1236l = this;
        this.f1245i = z;
        C0350g2 c0350g2 = new C0350g2(view.getContext());
        this.f1244h = c0350g2;
        int i5 = this.f1242f;
        int i6 = this.f1243g;
        boolean z4 = this.f1245i;
        View view2 = c0350g2.f1252b;
        if (view2.getParent() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Context context = c0350g2.f1251a;
        if (z2) {
            if (view2.getParent() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
        }
        c0350g2.f1253c.setText(this.f1238b);
        WindowManager.LayoutParams layoutParams = c0350g2.f1254d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i5 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i6 + dimensionPixelOffset2;
            i = i6 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = context.getResources();
        if (z4) {
            i2 = R.dimen.tooltip_y_offset_touch;
        } else {
            i2 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context2 = view.getContext();
            while (true) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else if (context2 instanceof Activity) {
                    rootView = ((Activity) context2).getWindow().getDecorView();
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = c0350g2.f1255e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                i3 = 0;
            } else {
                Resources resources2 = context.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i4 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i4 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i3 = 0;
                rect.set(0, i4, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] iArr = c0350g2.f1257g;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = c0350g2.f1256f;
            view.getLocationOnScreen(iArr2);
            int i7 = iArr2[i3] - iArr[i3];
            iArr2[i3] = i7;
            iArr2[1] = iArr2[1] - iArr[1];
            layoutParams.x = (i7 + i5) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i8 = iArr2[1];
            int i9 = ((i + i8) - dimensionPixelOffset3) - measuredHeight;
            int i10 = i8 + height + dimensionPixelOffset3;
            if (!z4 ? measuredHeight + i10 <= rect.height() : i9 < 0) {
                layoutParams.y = i10;
            } else {
                layoutParams.y = i9;
            }
            str2 = str;
        }
        ((WindowManager) context.getSystemService(str2)).addView(view2, layoutParams);
        view.addOnAttachStateChangeListener(this);
        if (this.f1245i) {
            j2 = 2500;
        } else {
            if ((ViewCompat.C0814d.m11758g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        RunnableC0046h runnableC0046h = this.f1241e;
        view.removeCallbacks(runnableC0046h);
        view.postDelayed(runnableC0046h, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.widget.g2 r5 = r4.f1244h
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.f1245i
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f1237a
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.f1246j = r3
            r4.m12637a()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            androidx.appcompat.widget.g2 r5 = r4.f1244h
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.f1246j
            if (r1 != 0) goto L69
            int r1 = r4.f1242f
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.f1239c
            if (r1 > r2) goto L69
            int r1 = r4.f1243g
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = r0
            goto L6f
        L69:
            r4.f1242f = r5
            r4.f1243g = r6
            r4.f1246j = r0
        L6f:
            if (r3 == 0) goto L74
            m12636b(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.View$OnLongClickListenerC0346f2.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f1242f = view.getWidth() / 2;
        this.f1243g = view.getHeight() / 2;
        m12635c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m12637a();
    }
}
