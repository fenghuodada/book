package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.C1437b;
import androidx.interpolator.view.animation.C1438c;
import com.ambrose.overwall.R;
import com.google.android.material.C7621c;
import com.google.android.material.animation.C7556a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.color.C7661a;
import com.google.android.material.internal.C7758l;
import com.google.android.material.internal.C7764q;
import com.google.android.material.internal.C7768s;
import com.google.android.material.motion.C7769a;
import com.google.android.material.resources.C7774c;
import com.google.android.material.shape.C7801j;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C7844o;
import com.google.android.material.theme.overlay.C7899a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a */
    public final int f15333a;

    /* renamed from: b */
    public final int f15334b;

    /* renamed from: c */
    public final int f15335c;

    /* renamed from: d */
    public final TimeInterpolator f15336d;

    /* renamed from: e */
    public final TimeInterpolator f15337e;

    /* renamed from: f */
    public final TimeInterpolator f15338f;
    @NonNull

    /* renamed from: g */
    public final ViewGroup f15339g;

    /* renamed from: h */
    public final Context f15340h;
    @NonNull

    /* renamed from: i */
    public final C7828e f15341i;
    @NonNull

    /* renamed from: j */
    public final InterfaceC7843n f15342j;

    /* renamed from: k */
    public int f15343k;

    /* renamed from: m */
    public int f15345m;

    /* renamed from: n */
    public int f15346n;

    /* renamed from: o */
    public int f15347o;

    /* renamed from: p */
    public int f15348p;

    /* renamed from: q */
    public int f15349q;

    /* renamed from: r */
    public boolean f15350r;
    @Nullable

    /* renamed from: s */
    public final AccessibilityManager f15351s;

    /* renamed from: u */
    public static final C1437b f15327u = C7556a.f14283b;

    /* renamed from: v */
    public static final LinearInterpolator f15328v = C7556a.f14282a;

    /* renamed from: w */
    public static final C1438c f15329w = C7556a.f14285d;

    /* renamed from: y */
    public static final int[] f15331y = {R.attr.snackbarStyle};

    /* renamed from: z */
    public static final String f15332z = BaseTransientBottomBar.class.getSimpleName();
    @NonNull

    /* renamed from: x */
    public static final Handler f15330x = new Handler(Looper.getMainLooper(), new C7824a());
    @RequiresApi(29)

    /* renamed from: l */
    public final RunnableC7825b f15344l = new RunnableC7825b();
    @NonNull

    /* renamed from: t */
    public final C7826c f15352t = new C7826c();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface AnimationMode {
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends SwipeDismissBehavior<View> {
        @NonNull

        /* renamed from: j */
        public final C7827d f15353j = new C7827d(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0588c
        /* renamed from: g */
        public final boolean mo2599g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
            C7827d c7827d = this.f15353j;
            c7827d.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C7844o.m4413b().m4410e(c7827d.f15356a);
                }
            } else if (coordinatorLayout.m12120i(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C7844o m4413b = C7844o.m4413b();
                C7826c c7826c = c7827d.f15356a;
                synchronized (m4413b.f15389a) {
                    if (m4413b.m4412c(c7826c)) {
                        C7844o.C7847c c7847c = m4413b.f15391c;
                        if (!c7847c.f15396c) {
                            c7847c.f15396c = true;
                            m4413b.f15390b.removeCallbacksAndMessages(c7847c);
                        }
                    }
                }
            }
            return super.mo2599g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* renamed from: t */
        public final boolean mo4420t(View view) {
            this.f15353j.getClass();
            return view instanceof C7828e;
        }
    }

    @IntRange(from = -2)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public @interface Duration {
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    /* loaded from: classes3.dex */
    public class C7824a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(@NonNull Message message) {
            boolean z;
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                int i2 = message.arg1;
                AccessibilityManager accessibilityManager = baseTransientBottomBar.f15351s;
                if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C7828e c7828e = baseTransientBottomBar.f15341i;
                    if (c7828e.getVisibility() == 0) {
                        if (c7828e.getAnimationMode() == 1) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                            ofFloat.setInterpolator(baseTransientBottomBar.f15336d);
                            ofFloat.addUpdateListener(new C7831b(baseTransientBottomBar));
                            ofFloat.setDuration(baseTransientBottomBar.f15334b);
                            ofFloat.addListener(new C7830a(baseTransientBottomBar, i2));
                            ofFloat.start();
                        } else {
                            ValueAnimator valueAnimator = new ValueAnimator();
                            int[] iArr = new int[2];
                            iArr[0] = 0;
                            int height = c7828e.getHeight();
                            ViewGroup.LayoutParams layoutParams = c7828e.getLayoutParams();
                            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                                height += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            }
                            iArr[1] = height;
                            valueAnimator.setIntValues(iArr);
                            valueAnimator.setInterpolator(baseTransientBottomBar.f15337e);
                            valueAnimator.setDuration(baseTransientBottomBar.f15335c);
                            valueAnimator.addListener(new C7835f(baseTransientBottomBar, i2));
                            valueAnimator.addUpdateListener(new C7836g(baseTransientBottomBar));
                            valueAnimator.start();
                        }
                        return true;
                    }
                }
                baseTransientBottomBar.m4424c();
                return true;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            C7828e c7828e2 = baseTransientBottomBar2.f15341i;
            if (c7828e2.getParent() == null) {
                ViewGroup.LayoutParams layoutParams2 = c7828e2.getLayoutParams();
                if (layoutParams2 instanceof CoordinatorLayout.C0590e) {
                    CoordinatorLayout.C0590e c0590e = (CoordinatorLayout.C0590e) layoutParams2;
                    Behavior behavior = new Behavior();
                    C7827d c7827d = behavior.f15353j;
                    c7827d.getClass();
                    c7827d.f15356a = baseTransientBottomBar2.f15352t;
                    behavior.f14390b = new C7840k(baseTransientBottomBar2);
                    c0590e.m12108b(behavior);
                    c0590e.f2219g = 80;
                }
                c7828e2.f15368k = true;
                baseTransientBottomBar2.f15339g.addView(c7828e2);
                c7828e2.f15368k = false;
                baseTransientBottomBar2.m4421f();
                c7828e2.setVisibility(4);
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (ViewCompat.C0817g.m11729c(c7828e2)) {
                baseTransientBottomBar2.m4422e();
            } else {
                baseTransientBottomBar2.f15350r = true;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    /* loaded from: classes3.dex */
    public class RunnableC7825b implements Runnable {
        public RunnableC7825b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            Rect rect;
            WindowMetrics currentWindowMetrics;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f15341i != null && (context = baseTransientBottomBar.f15340h) != null) {
                int i = C7768s.f15130a;
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    rect = currentWindowMetrics.getBounds();
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int height = rect.height();
                int[] iArr = new int[2];
                C7828e c7828e = baseTransientBottomBar.f15341i;
                c7828e.getLocationOnScreen(iArr);
                int height2 = (height - (c7828e.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f15341i.getTranslationY());
                int i2 = baseTransientBottomBar.f15348p;
                if (height2 >= i2) {
                    baseTransientBottomBar.f15349q = i2;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f15341i.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f15332z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                int i3 = baseTransientBottomBar.f15348p;
                baseTransientBottomBar.f15349q = i3;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                baseTransientBottomBar.f15341i.requestLayout();
            }
        }
    }

    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    /* loaded from: classes3.dex */
    public class C7826c implements C7844o.InterfaceC7846b {
        public C7826c() {
        }

        @Override // com.google.android.material.snackbar.C7844o.InterfaceC7846b
        /* renamed from: a */
        public final void mo4408a(int i) {
            Handler handler = BaseTransientBottomBar.f15330x;
            handler.sendMessage(handler.obtainMessage(1, i, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C7844o.InterfaceC7846b
        public final void show() {
            Handler handler = BaseTransientBottomBar.f15330x;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    /* loaded from: classes3.dex */
    public static class C7827d {

        /* renamed from: a */
        public C7826c f15356a;

        public C7827d(@NonNull SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f14395g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f14396h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f14393e = 0;
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    /* loaded from: classes3.dex */
    public static class C7828e extends FrameLayout {

        /* renamed from: l */
        public static final View$OnTouchListenerC7829a f15357l = new View$OnTouchListenerC7829a();
        @Nullable

        /* renamed from: a */
        public BaseTransientBottomBar<?> f15358a;
        @Nullable

        /* renamed from: b */
        public final C7801j f15359b;

        /* renamed from: c */
        public int f15360c;

        /* renamed from: d */
        public final float f15361d;

        /* renamed from: e */
        public final float f15362e;

        /* renamed from: f */
        public final int f15363f;

        /* renamed from: g */
        public final int f15364g;

        /* renamed from: h */
        public ColorStateList f15365h;

        /* renamed from: i */
        public PorterDuff.Mode f15366i;
        @Nullable

        /* renamed from: j */
        public Rect f15367j;

        /* renamed from: k */
        public boolean f15368k;

        /* renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e$a */
        /* loaded from: classes3.dex */
        public class View$OnTouchListenerC7829a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C7828e(@NonNull Context context, AttributeSet attributeSet) {
            super(C7899a.m4316a(context, attributeSet, 0, 0), attributeSet);
            GradientDrawable gradientDrawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C7621c.f14604x);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0819i.m11703s(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f15360c = obtainStyledAttributes.getInt(2, 0);
            if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
                this.f15359b = new C7801j(C7801j.m4457b(context2, attributeSet, 0, 0));
            }
            this.f15361d = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(C7774c.m4495a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(C7764q.m4504b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f15362e = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f15363f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f15364g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f15357l);
            setFocusable(true);
            if (getBackground() == null) {
                int m4618d = C7661a.m4618d(C7661a.m4621a(R.attr.colorSurface, this), getBackgroundOverlayColorAlpha(), C7661a.m4621a(R.attr.colorOnSurface, this));
                C7801j c7801j = this.f15359b;
                if (c7801j != null) {
                    C1437b c1437b = BaseTransientBottomBar.f15327u;
                    MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(c7801j);
                    materialShapeDrawable.m4467k(ColorStateList.valueOf(m4618d));
                    gradientDrawable = materialShapeDrawable;
                } else {
                    Resources resources = getResources();
                    C1437b c1437b2 = BaseTransientBottomBar.f15327u;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setShape(0);
                    gradientDrawable2.setCornerRadius(dimension);
                    gradientDrawable2.setColor(m4618d);
                    gradientDrawable = gradientDrawable2;
                }
                ColorStateList colorStateList = this.f15365h;
                if (colorStateList != null) {
                    C0700a.C0702b.m11924h(gradientDrawable, colorStateList);
                }
                WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                ViewCompat.C0814d.m11748q(this, gradientDrawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f15358a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f15362e;
        }

        public int getAnimationMode() {
            return this.f15360c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f15361d;
        }

        public int getMaxInlineActionWidth() {
            return this.f15364g;
        }

        public int getMaxWidth() {
            return this.f15363f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            Insets mandatorySystemGestureInsets;
            int i;
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f15358a;
            if (baseTransientBottomBar != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = baseTransientBottomBar.f15341i.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
                        i = mandatorySystemGestureInsets.bottom;
                        baseTransientBottomBar.f15348p = i;
                        baseTransientBottomBar.m4421f();
                    }
                } else {
                    baseTransientBottomBar.getClass();
                }
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0818h.m11722c(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
        @Override // android.view.ViewGroup, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onDetachedFromWindow() {
            /*
                r6 = this;
                super.onDetachedFromWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r0 = r6.f15358a
                if (r0 == 0) goto L44
                com.google.android.material.snackbar.o r1 = com.google.android.material.snackbar.C7844o.m4413b()
                com.google.android.material.snackbar.BaseTransientBottomBar$c r2 = r0.f15352t
                java.lang.Object r3 = r1.f15389a
                monitor-enter(r3)
                boolean r4 = r1.m4412c(r2)     // Catch: java.lang.Throwable -> L28
                r5 = 1
                if (r4 != 0) goto L34
                com.google.android.material.snackbar.o$c r1 = r1.f15392d     // Catch: java.lang.Throwable -> L28
                r4 = 0
                if (r1 == 0) goto L2f
                if (r2 == 0) goto L2a
                java.lang.ref.WeakReference<com.google.android.material.snackbar.o$b> r1 = r1.f15394a     // Catch: java.lang.Throwable -> L28
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L28
                if (r1 != r2) goto L2a
                r1 = r5
                goto L2b
            L28:
                r0 = move-exception
                goto L42
            L2a:
                r1 = r4
            L2b:
                if (r1 == 0) goto L2f
                r1 = r5
                goto L30
            L2f:
                r1 = r4
            L30:
                if (r1 == 0) goto L33
                goto L34
            L33:
                r5 = r4
            L34:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
                if (r5 == 0) goto L44
                android.os.Handler r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f15330x
                com.google.android.material.snackbar.j r2 = new com.google.android.material.snackbar.j
                r2.<init>(r0)
                r1.post(r2)
                goto L44
            L42:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L28
                throw r0
            L44:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.BaseTransientBottomBar.C7828e.onDetachedFromWindow():void");
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f15358a;
            if (baseTransientBottomBar != null && baseTransientBottomBar.f15350r) {
                baseTransientBottomBar.m4422e();
                baseTransientBottomBar.f15350r = false;
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int i3 = this.f15363f;
            if (i3 <= 0 || getMeasuredWidth() <= i3) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }

        public void setAnimationMode(int i) {
            this.f15360c = i;
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f15365h != null) {
                drawable = drawable.mutate();
                C0700a.C0702b.m11924h(drawable, this.f15365h);
                C0700a.C0702b.m11923i(drawable, this.f15366i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f15365h = colorStateList;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                C0700a.C0702b.m11924h(mutate, colorStateList);
                C0700a.C0702b.m11923i(mutate, this.f15366i);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.f15366i = mode;
            if (getBackground() != null) {
                Drawable mutate = getBackground().mutate();
                C0700a.C0702b.m11923i(mutate, mode);
                if (mutate != getBackground()) {
                    super.setBackgroundDrawable(mutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f15368k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f15367j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f15358a;
                if (baseTransientBottomBar != null) {
                    C1437b c1437b = BaseTransientBottomBar.f15327u;
                    baseTransientBottomBar.m4421f();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f15357l);
            super.setOnClickListener(onClickListener);
        }
    }

    public BaseTransientBottomBar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull SnackbarContentLayout snackbarContentLayout, @NonNull SnackbarContentLayout snackbarContentLayout2) {
        boolean z;
        int i;
        if (snackbarContentLayout != null) {
            if (snackbarContentLayout2 != null) {
                this.f15339g = viewGroup;
                this.f15342j = snackbarContentLayout2;
                this.f15340h = context;
                C7758l.m4509c(context, C7758l.f15120a, "Theme.AppCompat");
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f15331y);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = R.layout.mtrl_layout_snackbar;
                } else {
                    i = R.layout.design_layout_snackbar;
                }
                C7828e c7828e = (C7828e) from.inflate(i, viewGroup, false);
                this.f15341i = c7828e;
                c7828e.setBaseTransientBottomBar(this);
                float actionTextColorAlpha = c7828e.getActionTextColorAlpha();
                if (actionTextColorAlpha != 1.0f) {
                    snackbarContentLayout.f15372b.setTextColor(C7661a.m4618d(C7661a.m4621a(R.attr.colorSurface, snackbarContentLayout), actionTextColorAlpha, snackbarContentLayout.f15372b.getCurrentTextColor()));
                }
                snackbarContentLayout.setMaxInlineActionWidth(c7828e.getMaxInlineActionWidth());
                c7828e.addView(snackbarContentLayout);
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0817g.m11726f(c7828e, 1);
                ViewCompat.C0814d.m11746s(c7828e, 1);
                c7828e.setFitsSystemWindows(true);
                ViewCompat.C0819i.m11701u(c7828e, new C7837h(this));
                ViewCompat.m11771n(c7828e, new C7838i(this));
                this.f15351s = (AccessibilityManager) context.getSystemService("accessibility");
                this.f15335c = C7769a.m4500c(context, R.attr.motionDurationLong2, 250);
                this.f15333a = C7769a.m4500c(context, R.attr.motionDurationLong2, 150);
                this.f15334b = C7769a.m4500c(context, R.attr.motionDurationMedium1, 75);
                this.f15336d = C7769a.m4499d(context, R.attr.motionEasingEmphasizedInterpolator, f15328v);
                this.f15338f = C7769a.m4499d(context, R.attr.motionEasingEmphasizedInterpolator, f15329w);
                this.f15337e = C7769a.m4499d(context, R.attr.motionEasingEmphasizedInterpolator, f15327u);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    /* renamed from: a */
    public void mo4418a() {
        m4425b(3);
    }

    /* renamed from: b */
    public final void m4425b(int i) {
        C7844o.C7847c c7847c;
        boolean z;
        C7844o m4413b = C7844o.m4413b();
        C7826c c7826c = this.f15352t;
        synchronized (m4413b.f15389a) {
            if (m4413b.m4412c(c7826c)) {
                c7847c = m4413b.f15391c;
            } else {
                C7844o.C7847c c7847c2 = m4413b.f15392d;
                boolean z2 = false;
                if (c7847c2 != null) {
                    if (c7826c != null && c7847c2.f15394a.get() == c7826c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    c7847c = m4413b.f15392d;
                }
            }
            m4413b.m4414a(c7847c, i);
        }
    }

    /* renamed from: c */
    public final void m4424c() {
        C7844o m4413b = C7844o.m4413b();
        C7826c c7826c = this.f15352t;
        synchronized (m4413b.f15389a) {
            try {
                if (m4413b.m4412c(c7826c)) {
                    m4413b.f15391c = null;
                    C7844o.C7847c c7847c = m4413b.f15392d;
                    if (c7847c != null && c7847c != null) {
                        m4413b.f15391c = c7847c;
                        m4413b.f15392d = null;
                        C7844o.InterfaceC7846b interfaceC7846b = c7847c.f15394a.get();
                        if (interfaceC7846b != null) {
                            interfaceC7846b.show();
                        } else {
                            m4413b.f15391c = null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ViewParent parent = this.f15341i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f15341i);
        }
    }

    /* renamed from: d */
    public final void m4423d() {
        C7844o m4413b = C7844o.m4413b();
        C7826c c7826c = this.f15352t;
        synchronized (m4413b.f15389a) {
            if (m4413b.m4412c(c7826c)) {
                m4413b.m4409f(m4413b.f15391c);
            }
        }
    }

    /* renamed from: e */
    public final void m4422e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z = true;
        AccessibilityManager accessibilityManager = this.f15351s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z = false;
        }
        C7828e c7828e = this.f15341i;
        if (z) {
            c7828e.post(new RunnableC7841l(this));
            return;
        }
        if (c7828e.getParent() != null) {
            c7828e.setVisibility(0);
        }
        m4423d();
    }

    /* renamed from: f */
    public final void m4421f() {
        boolean z;
        boolean z2;
        String str;
        C7828e c7828e = this.f15341i;
        ViewGroup.LayoutParams layoutParams = c7828e.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            str = "Unable to update margins because layout params are not MarginLayoutParams";
        } else if (c7828e.f15367j == null) {
            str = "Unable to update margins because original view margins are not set";
        } else if (c7828e.getParent() == null) {
            return;
        } else {
            int i = this.f15345m;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Rect rect = c7828e.f15367j;
            int i2 = rect.bottom + i;
            int i3 = rect.left + this.f15346n;
            int i4 = rect.right + this.f15347o;
            int i5 = rect.top;
            boolean z3 = false;
            if (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                marginLayoutParams.bottomMargin = i2;
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = i4;
                marginLayoutParams.topMargin = i5;
                c7828e.requestLayout();
            }
            if ((z || this.f15349q != this.f15348p) && Build.VERSION.SDK_INT >= 29) {
                if (this.f15348p > 0) {
                    ViewGroup.LayoutParams layoutParams2 = c7828e.getLayoutParams();
                    if ((layoutParams2 instanceof CoordinatorLayout.C0590e) && (((CoordinatorLayout.C0590e) layoutParams2).f2213a instanceof SwipeDismissBehavior)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z3 = true;
                    }
                }
                if (z3) {
                    RunnableC7825b runnableC7825b = this.f15344l;
                    c7828e.removeCallbacks(runnableC7825b);
                    c7828e.post(runnableC7825b);
                    return;
                }
                return;
            }
            return;
        }
        Log.w(f15332z, str);
    }
}
