package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ambrose.overwall.R;
import com.google.android.material.C7582b;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.InterfaceC8934f;
import com.kongzue.dialogx.interfaces.InterfaceC8936h;
import com.kongzue.dialogx.interfaces.InterfaceC8940l;
import com.kongzue.dialogx.style.C8941a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class DialogXBaseRelativeLayout extends RelativeLayout {

    /* renamed from: p */
    public static final HashMap f17060p = new HashMap();

    /* renamed from: a */
    public BaseDialog f17061a;

    /* renamed from: b */
    public boolean f17062b;

    /* renamed from: c */
    public boolean f17063c;

    /* renamed from: d */
    public boolean f17064d;

    /* renamed from: e */
    public AbstractC8951d f17065e;

    /* renamed from: f */
    public InterfaceC8952e f17066f;

    /* renamed from: g */
    public boolean f17067g;

    /* renamed from: h */
    public ViewTreeObserver$OnGlobalLayoutListenerC8949b f17068h;

    /* renamed from: i */
    public C8948a f17069i;

    /* renamed from: j */
    public String f17070j;

    /* renamed from: k */
    public boolean f17071k;

    /* renamed from: l */
    public Rect f17072l;

    /* renamed from: m */
    public boolean f17073m;

    /* renamed from: n */
    public float f17074n;

    /* renamed from: o */
    public final int[] f17075o;

    /* renamed from: com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$a */
    /* loaded from: classes3.dex */
    public class C8948a implements InterfaceC8936h {
        public C8948a() {
        }

        @Override // com.kongzue.dialogx.interfaces.InterfaceC8936h
        /* renamed from: a */
        public final void mo2838a(WindowInsets windowInsets) {
            DialogXBaseRelativeLayout.this.m2840d(windowInsets);
        }
    }

    /* renamed from: com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$b */
    /* loaded from: classes3.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC8949b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC8949b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            HashMap hashMap = DialogXBaseRelativeLayout.f17060p;
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = DialogXBaseRelativeLayout.this;
            dialogXBaseRelativeLayout.m2840d(dialogXBaseRelativeLayout.getRootWindowInsets());
        }
    }

    /* renamed from: com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$c */
    /* loaded from: classes3.dex */
    public class C8950c extends WindowInsetsAnimationCompat.Callback {
        public C8950c() {
            super(1);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
        @NonNull
        /* renamed from: c */
        public final WindowInsetsCompat mo2837c(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
            View view = (View) DialogXBaseRelativeLayout.this.getParent();
            if (view != null) {
                for (InterfaceC8936h interfaceC8936h : DialogXBaseRelativeLayout.m2843a(Integer.toHexString(view.hashCode()))) {
                    interfaceC8936h.mo2838a(windowInsetsCompat.m11636h());
                }
            }
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8951d {
        /* renamed from: a */
        public abstract void mo2836a();

        /* renamed from: b */
        public abstract void mo2835b();
    }

    /* renamed from: com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout$e */
    /* loaded from: classes3.dex */
    public interface InterfaceC8952e {
        void onBackPressed();
    }

    public DialogXBaseRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17062b = true;
        this.f17063c = true;
        this.f17064d = true;
        this.f17067g = false;
        this.f17071k = false;
        this.f17072l = new Rect();
        this.f17073m = true;
        this.f17075o = new int[4];
        if (Build.VERSION.SDK_INT >= 29) {
            setForceDarkAllowed(false);
        }
        if (!this.f17067g) {
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7582b.f14377a);
                this.f17063c = obtainStyledAttributes.getBoolean(1, true);
                this.f17062b = obtainStyledAttributes.getBoolean(0, true);
                this.f17064d = obtainStyledAttributes.getBoolean(2, true);
                obtainStyledAttributes.recycle();
                this.f17067g = true;
            }
            if (this.f17063c) {
                setFocusable(true);
                setFocusableInTouchMode(true);
                requestFocus();
            }
            m2839e(0.0f);
            if (getParentDialog() != null && getParentDialog().f17015d != 1) {
                setFitsSystemWindows(true);
            }
            setClipChildren(false);
            setClipToPadding(false);
        }
    }

    /* renamed from: a */
    public static List m2843a(String str) {
        HashMap hashMap = f17060p;
        List list = (List) hashMap.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    private void getWindowInsetsByDisplayMetrics() {
        if (getParentDialog() == null || getParentDialog().m2871k() == null) {
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getParentDialog().m2871k().getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        Rect rect = new Rect();
        ((View) getParent()).getWindowVisibleDisplayFrame(rect);
        int i = rect.left;
        if (i == 0 && rect.top == 0 && rect.right == 0 && rect.bottom == 0) {
            return;
        }
        m2841c(i, rect.top, displayMetrics.widthPixels - rect.right, displayMetrics.heightPixels - rect.bottom);
    }

    @RequiresApi(api = 20)
    /* renamed from: b */
    public final void m2842b() {
        View view = (View) getParent();
        if (view != null) {
            this.f17071k = true;
            ViewCompat.m11769p(view, new C8950c());
        }
    }

    /* renamed from: c */
    public final void m2841c(int i, int i2, int i3, int i4) {
        this.f17072l = new Rect(i, i2, i3, i4);
        MaxRelativeLayout maxRelativeLayout = (MaxRelativeLayout) findViewById(R.id.bkg);
        int[] iArr = this.f17075o;
        if (maxRelativeLayout != null && (maxRelativeLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) && ((RelativeLayout.LayoutParams) maxRelativeLayout.getLayoutParams()).getRules()[12] == -1 && this.f17062b) {
            maxRelativeLayout.setNavBarHeight(i4);
            setPadding(iArr[0] + i, iArr[1] + i2, iArr[2] + i3, iArr[3]);
            if ((getParentDialog() instanceof InterfaceC8934f) && ((InterfaceC8934f) getParentDialog()).m2853a()) {
                maxRelativeLayout.setPadding(0, 0, 0, 0);
            } else {
                maxRelativeLayout.setPadding(0, 0, 0, i4);
            }
        } else if (this.f17062b) {
            setPadding(iArr[0] + i, iArr[1] + i2, iArr[2] + i3, iArr[3] + i4);
        }
    }

    @Override // android.view.View
    public final boolean callOnClick() {
        if (isEnabled()) {
            return super.callOnClick();
        }
        return false;
    }

    /* renamed from: d */
    public final void m2840d(WindowInsets windowInsets) {
        if (!isAttachedToWindow()) {
            m2843a(this.f17070j).remove(this.f17069i);
        } else if (windowInsets == null && (windowInsets = BaseDialog.f17010u) == null) {
        } else {
            if (windowInsets.getSystemWindowInsetLeft() == 0 && windowInsets.getSystemWindowInsetTop() == 0 && windowInsets.getSystemWindowInsetRight() == 0 && windowInsets.getSystemWindowInsetBottom() == 0) {
                getWindowInsetsByDisplayMetrics();
                return;
            }
            m2841c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            windowInsets.getSystemWindowInsetBottom();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        if (!this.f17071k) {
            C8941a c8941a = C8877a.f16910a;
            if (getParentDialog() != null && getParentDialog().f17015d != 1) {
                m2841c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                windowInsets.getSystemWindowInsetBottom();
            }
        }
        return super.dispatchApplyWindowInsets(windowInsets);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC8952e interfaceC8952e;
        keyEvent.getKeyCode();
        if (isAttachedToWindow() && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4 && this.f17064d && (interfaceC8952e = this.f17066f) != null) {
            interfaceC8952e.onBackPressed();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    public final void m2839e(float f) {
        this.f17074n = f;
        if (getBackground() != null) {
            getBackground().mutate().setAlpha((int) (f * 255.0f));
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        if (!this.f17071k) {
            C8941a c8941a = C8877a.f16910a;
            if (getParentDialog() != null && getParentDialog().f17015d != 1) {
                m2841c(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
        return super.fitSystemWindows(rect);
    }

    public InterfaceC8940l getOnSafeInsetsChangeListener() {
        return null;
    }

    public BaseDialog getParentDialog() {
        return this.f17061a;
    }

    public int getRootPaddingBottom() {
        return this.f17075o[3];
    }

    public int getRootPaddingLeft() {
        return this.f17075o[0];
    }

    public int getRootPaddingRight() {
        return this.f17075o[2];
    }

    public int getRootPaddingTop() {
        return this.f17075o[1];
    }

    public float getSafeHeight() {
        int measuredHeight = getMeasuredHeight();
        Rect rect = this.f17072l;
        return (measuredHeight - rect.bottom) - rect.top;
    }

    public Rect getUnsafePlace() {
        return this.f17072l;
    }

    public int getUseAreaHeight() {
        return getHeight() - getRootPaddingBottom();
    }

    public int getUseAreaWidth() {
        return getWidth() - getRootPaddingRight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                setFitsSystemWindows(ViewCompat.C0814d.m11763b((View) parent));
            }
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            ViewCompat.C0818h.m11722c(this);
            if (getParentDialog() != null && getParentDialog().m2871k() != null) {
                View view = (View) getParent();
                if (view != null) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        String hexString = Integer.toHexString(view.hashCode());
                        this.f17070j = hexString;
                        List m2843a = m2843a(hexString);
                        C8948a c8948a = new C8948a();
                        this.f17069i = c8948a;
                        m2843a.add(c8948a);
                        m2840d(getRootWindowInsets());
                        m2842b();
                    } else {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        ViewTreeObserver$OnGlobalLayoutListenerC8949b viewTreeObserver$OnGlobalLayoutListenerC8949b = new ViewTreeObserver$OnGlobalLayoutListenerC8949b();
                        this.f17068h = viewTreeObserver$OnGlobalLayoutListenerC8949b;
                        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC8949b);
                        this.f17068h.onGlobalLayout();
                    }
                }
                AbstractC8951d abstractC8951d = this.f17065e;
                if (abstractC8951d != null) {
                    abstractC8951d.mo2835b();
                }
                if ((getResources().getConfiguration().uiMode & 48) == 16) {
                    z = true;
                } else {
                    z = false;
                }
                this.f17073m = z;
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f17073m != ((configuration.uiMode & 48) == 16)) {
            C8941a c8941a = C8877a.f16910a;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = (View) getParent();
        if (this.f17068h != null && view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f17068h);
        }
        AbstractC8951d abstractC8951d = this.f17065e;
        if (abstractC8951d != null) {
            abstractC8951d.mo2836a();
        }
        m2843a(this.f17070j).remove(this.f17069i);
        this.f17061a = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        getParentDialog();
        ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 2);
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled()) {
            return super.performClick();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (getParentDialog() != null) {
            getParentDialog();
        }
        m2842b();
        View findFocus = findFocus();
        if (findFocus == null || findFocus == this) {
            return super.requestFocus(i, rect);
        }
        findFocus.requestFocus();
        return true;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        drawable.setAlpha((int) (this.f17074n * 255.0f));
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        setBackground(new ColorDrawable(i));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i == 8 && getAlpha() == 0.0f) {
            setAlpha(0.01f);
        }
        super.setVisibility(i);
    }
}
