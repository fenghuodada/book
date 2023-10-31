package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.InterfaceC0228n;
import androidx.appcompat.widget.AbstractView$OnTouchListenerC0304b1;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0309c;
import androidx.appcompat.widget.C0324d2;
import androidx.appcompat.widget.C0383m0;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionMenuItemView extends C0383m0 implements InterfaceC0228n.InterfaceC0229a, View.OnClickListener, ActionMenuView.InterfaceC0244a {

    /* renamed from: h */
    public C0214i f576h;

    /* renamed from: i */
    public CharSequence f577i;

    /* renamed from: j */
    public Drawable f578j;

    /* renamed from: k */
    public C0210g.InterfaceC0212b f579k;

    /* renamed from: l */
    public C0197a f580l;

    /* renamed from: m */
    public AbstractC0198b f581m;

    /* renamed from: n */
    public boolean f582n;

    /* renamed from: o */
    public boolean f583o;

    /* renamed from: p */
    public final int f584p;

    /* renamed from: q */
    public int f585q;

    /* renamed from: r */
    public final int f586r;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    public class C0197a extends AbstractView$OnTouchListenerC0304b1 {
        public C0197a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0304b1
        /* renamed from: b */
        public final InterfaceC0231p mo12457b() {
            C0309c.C0310a c0310a;
            AbstractC0198b abstractC0198b = ActionMenuItemView.this.f581m;
            if (abstractC0198b == null || (c0310a = C0309c.this.f1151t) == null) {
                return null;
            }
            return c0310a.m12829a();
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0304b1
        /* renamed from: c */
        public final boolean mo12456c() {
            InterfaceC0231p mo12457b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0210g.InterfaceC0212b interfaceC0212b = actionMenuItemView.f579k;
            return interfaceC0212b != null && interfaceC0212b.mo12799a(actionMenuItemView.f576h) && (mo12457b = mo12457b()) != null && mo12457b.mo12653a();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0198b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f582n = m12860v();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0157c.f412c, 0, 0);
        this.f584p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f586r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f585q = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0244a
    /* renamed from: d */
    public final boolean mo12702d() {
        return m12861u();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0244a
    /* renamed from: f */
    public final boolean mo12701f() {
        return m12861u() && this.f576h.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228n.InterfaceC0229a
    public C0214i getItemData() {
        return this.f576h;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0228n.InterfaceC0229a
    /* renamed from: j */
    public final void mo4533j(C0214i c0214i) {
        int i;
        this.f576h = c0214i;
        setIcon(c0214i.getIcon());
        setTitle(c0214i.getTitleCondensed());
        setId(c0214i.f715a);
        if (c0214i.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(c0214i.isEnabled());
        if (c0214i.hasSubMenu() && this.f580l == null) {
            this.f580l = new C0197a();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0210g.InterfaceC0212b interfaceC0212b = this.f579k;
        if (interfaceC0212b != null) {
            interfaceC0212b.mo12799a(this.f576h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f582n = m12860v();
        m12859w();
    }

    @Override // androidx.appcompat.widget.C0383m0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean m12861u = m12861u();
        if (m12861u && (i3 = this.f585q) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f584p;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (m12861u || this.f578j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f578j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0197a c0197a;
        if (this.f576h.hasSubMenu() && (c0197a = this.f580l) != null && c0197a.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f583o != z) {
            this.f583o = z;
            C0214i c0214i = this.f576h;
            if (c0214i != null) {
                C0210g c0210g = c0214i.f728n;
                c0210g.f695k = true;
                c0210g.m12843p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f578j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f586r;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m12859w();
    }

    public void setItemInvoker(C0210g.InterfaceC0212b interfaceC0212b) {
        this.f579k = interfaceC0212b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f585q = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0198b abstractC0198b) {
        this.f581m = abstractC0198b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f577i = charSequence;
        m12859w();
    }

    /* renamed from: u */
    public final boolean m12861u() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: v */
    public final boolean m12860v() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: w */
    public final void m12859w() {
        CharSequence charSequence;
        boolean z;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f577i);
        if (this.f578j != null) {
            if ((this.f576h.f739y & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!this.f582n && !this.f583o)) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence2 = null;
        if (z4) {
            charSequence = this.f577i;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.f576h.f731q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z4) {
                charSequence3 = null;
            } else {
                charSequence3 = this.f576h.f719e;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.f576h.f732r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z4) {
                charSequence2 = this.f576h.f719e;
            }
            C0324d2.m12689a(this, charSequence2);
            return;
        }
        C0324d2.m12689a(this, charSequence4);
    }
}
