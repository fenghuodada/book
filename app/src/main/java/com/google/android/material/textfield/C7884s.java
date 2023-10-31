package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.core.view.accessibility.InterfaceC0863d;
import com.ambrose.overwall.R;
import com.google.android.exoplayer2.C7134r;
import com.google.android.material.animation.C7556a;
import com.google.android.material.motion.C7769a;
import java.util.WeakHashMap;

/* renamed from: com.google.android.material.textfield.s */
/* loaded from: classes3.dex */
public final class C7884s extends AbstractC7890u {

    /* renamed from: e */
    public final int f15522e;

    /* renamed from: f */
    public final int f15523f;
    @NonNull

    /* renamed from: g */
    public final TimeInterpolator f15524g;
    @Nullable

    /* renamed from: h */
    public AutoCompleteTextView f15525h;

    /* renamed from: i */
    public final View$OnClickListenerC7877l f15526i;

    /* renamed from: j */
    public final View$OnFocusChangeListenerC7878m f15527j;

    /* renamed from: k */
    public final C7134r f15528k;

    /* renamed from: l */
    public boolean f15529l;

    /* renamed from: m */
    public boolean f15530m;

    /* renamed from: n */
    public boolean f15531n;

    /* renamed from: o */
    public long f15532o;
    @Nullable

    /* renamed from: p */
    public AccessibilityManager f15533p;

    /* renamed from: q */
    public ValueAnimator f15534q;

    /* renamed from: r */
    public ValueAnimator f15535r;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.material.textfield.l] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.material.textfield.m] */
    public C7884s(@NonNull C7885t c7885t) {
        super(c7885t);
        this.f15526i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7884s.this.m4373u();
            }
        };
        this.f15527j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                C7884s c7884s = C7884s.this;
                c7884s.f15529l = z;
                c7884s.m4342q();
                if (z) {
                    return;
                }
                c7884s.m4374t(false);
                c7884s.f15530m = false;
            }
        };
        this.f15528k = new C7134r(this);
        this.f15532o = Long.MAX_VALUE;
        this.f15523f = C7769a.m4500c(c7885t.getContext(), R.attr.motionDurationShort3, 67);
        this.f15522e = C7769a.m4500c(c7885t.getContext(), R.attr.motionDurationShort3, 50);
        this.f15524g = C7769a.m4499d(c7885t.getContext(), R.attr.motionEasingLinearInterpolator, C7556a.f14282a);
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: a */
    public final void mo4358a() {
        boolean z;
        if (this.f15533p.isTouchExplorationEnabled()) {
            if (this.f15525h.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && !this.f15568d.hasFocus()) {
                this.f15525h.dismissDropDown();
            }
        }
        this.f15525h.post(new RunnableC7880o(this, 0));
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: c */
    public final int mo4356c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: d */
    public final int mo4355d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: e */
    public final View.OnFocusChangeListener mo4354e() {
        return this.f15527j;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: f */
    public final View.OnClickListener mo4353f() {
        return this.f15526i;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: h */
    public final InterfaceC0863d mo4351h() {
        return this.f15528k;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: i */
    public final boolean mo4350i(int i) {
        return i != 0;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: j */
    public final boolean mo4349j() {
        return this.f15529l;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: l */
    public final boolean mo4347l() {
        return this.f15531n;
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: m */
    public final void mo4346m(@Nullable EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f15525h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.p
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    C7884s c7884s = C7884s.this;
                    c7884s.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - c7884s.f15532o;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            c7884s.f15530m = false;
                        }
                        c7884s.m4373u();
                        c7884s.f15530m = true;
                        c7884s.f15532o = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f15525h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.q
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    C7884s c7884s = C7884s.this;
                    c7884s.f15530m = true;
                    c7884s.f15532o = System.currentTimeMillis();
                    c7884s.m4374t(false);
                }
            });
            boolean z = false;
            this.f15525h.setThreshold(0);
            TextInputLayout textInputLayout = this.f15565a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z = true;
            }
            if (!z && this.f15533p.isTouchExplorationEnabled()) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11746s(this.f15568d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: n */
    public final void mo4345n(@NonNull C0874o c0874o) {
        boolean z;
        boolean z2 = true;
        if (this.f15525h.getInputType() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c0874o.m11551g(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
        if (i >= 26) {
            z2 = accessibilityNodeInfo.isShowingHintText();
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                z2 = false;
            }
        }
        if (z2) {
            c0874o.m11549i(null);
        }
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    @SuppressLint({"WrongConstant"})
    /* renamed from: o */
    public final void mo4344o(@NonNull AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.f15533p.isEnabled()) {
            boolean z2 = false;
            if (this.f15525h.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (accessibilityEvent.getEventType() == 32768 && this.f15531n && !this.f15525h.isPopupShowing()) {
                    z2 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z2) {
                    m4373u();
                    this.f15530m = true;
                    this.f15532o = System.currentTimeMillis();
                }
            }
        }
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    /* renamed from: r */
    public final void mo4341r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f15524g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f15523f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7884s c7884s = C7884s.this;
                c7884s.getClass();
                c7884s.f15568d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f15535r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f15522e);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.n
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7884s c7884s = C7884s.this;
                c7884s.getClass();
                c7884s.f15568d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f15534q = ofFloat2;
        ofFloat2.addListener(new C7883r(this));
        this.f15533p = (AccessibilityManager) this.f15567c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.AbstractC7890u
    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: s */
    public final void mo4340s() {
        AutoCompleteTextView autoCompleteTextView = this.f15525h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f15525h.setOnDismissListener(null);
        }
    }

    /* renamed from: t */
    public final void m4374t(boolean z) {
        if (this.f15531n != z) {
            this.f15531n = z;
            this.f15535r.cancel();
            this.f15534q.start();
        }
    }

    /* renamed from: u */
    public final void m4373u() {
        boolean z;
        if (this.f15525h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f15532o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f15530m = false;
        }
        if (!this.f15530m) {
            m4374t(!this.f15531n);
            if (this.f15531n) {
                this.f15525h.requestFocus();
                this.f15525h.showDropDown();
                return;
            }
            this.f15525h.dismissDropDown();
            return;
        }
        this.f15530m = false;
    }
}
