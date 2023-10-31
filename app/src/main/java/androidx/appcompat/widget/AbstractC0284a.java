package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0157c;
import androidx.appcompat.view.menu.C0210g;
import androidx.core.view.C0922g2;
import androidx.core.view.InterfaceC0928h2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0284a extends ViewGroup {

    /* renamed from: a */
    public final C0285a f1070a;

    /* renamed from: b */
    public final Context f1071b;

    /* renamed from: c */
    public ActionMenuView f1072c;

    /* renamed from: d */
    public C0309c f1073d;

    /* renamed from: e */
    public int f1074e;

    /* renamed from: f */
    public C0922g2 f1075f;

    /* renamed from: g */
    public boolean f1076g;

    /* renamed from: h */
    public boolean f1077h;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class C0285a implements InterfaceC0928h2 {

        /* renamed from: a */
        public boolean f1078a = false;

        /* renamed from: b */
        public int f1079b;

        public C0285a() {
        }

        @Override // androidx.core.view.InterfaceC0928h2
        /* renamed from: a */
        public final void mo11452a(View view) {
            this.f1078a = true;
        }

        @Override // androidx.core.view.InterfaceC0928h2
        /* renamed from: b */
        public final void mo11451b() {
            AbstractC0284a.super.setVisibility(0);
            this.f1078a = false;
        }

        @Override // androidx.core.view.InterfaceC0928h2
        /* renamed from: c */
        public final void mo11463c() {
            if (this.f1078a) {
                return;
            }
            AbstractC0284a abstractC0284a = AbstractC0284a.this;
            abstractC0284a.f1075f = null;
            AbstractC0284a.super.setVisibility(this.f1079b);
        }
    }

    public AbstractC0284a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0284a(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1070a = new C0285a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1071b = context;
        } else {
            this.f1071b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: c */
    public static int m12736c(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    /* renamed from: d */
    public static int m12735d(View view, boolean z, int i, int i2, int i3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: e */
    public final C0922g2 m12734e(int i, long j) {
        C0922g2 c0922g2 = this.f1075f;
        if (c0922g2 != null) {
            c0922g2.m11472b();
        }
        C0285a c0285a = this.f1070a;
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C0922g2 m11784a = ViewCompat.m11784a(this);
            m11784a.m11473a(1.0f);
            m11784a.m11471c(j);
            AbstractC0284a.this.f1075f = m11784a;
            c0285a.f1079b = i;
            m11784a.m11470d(c0285a);
            return m11784a;
        }
        C0922g2 m11784a2 = ViewCompat.m11784a(this);
        m11784a2.m11473a(0.0f);
        m11784a2.m11471c(j);
        AbstractC0284a.this.f1075f = m11784a2;
        c0285a.f1079b = i;
        m11784a2.m11470d(c0285a);
        return m11784a2;
    }

    public int getAnimatedVisibility() {
        return this.f1075f != null ? this.f1070a.f1079b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1074e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C0157c.f410a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0309c c0309c = this.f1073d;
        if (c0309c != null) {
            Configuration configuration2 = c0309c.f656b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
                if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                    if (i2 >= 360) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 5;
            }
            c0309c.f1147p = i;
            C0210g c0210g = c0309c.f657c;
            if (c0210g != null) {
                c0210g.m12843p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1077h = false;
        }
        if (!this.f1077h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1077h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1077h = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1076g = false;
        }
        if (!this.f1076g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1076g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1076g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1074e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0922g2 c0922g2 = this.f1075f;
            if (c0922g2 != null) {
                c0922g2.m11472b();
            }
            super.setVisibility(i);
        }
    }
}
