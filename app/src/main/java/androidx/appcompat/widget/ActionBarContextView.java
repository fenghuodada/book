package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.view.AbstractC0178a;
import androidx.appcompat.widget.C0309c;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0284a {

    /* renamed from: i */
    public CharSequence f802i;

    /* renamed from: j */
    public CharSequence f803j;

    /* renamed from: k */
    public View f804k;

    /* renamed from: l */
    public View f805l;

    /* renamed from: m */
    public View f806m;

    /* renamed from: n */
    public LinearLayout f807n;

    /* renamed from: o */
    public TextView f808o;

    /* renamed from: p */
    public TextView f809p;

    /* renamed from: q */
    public final int f810q;

    /* renamed from: r */
    public final int f811r;

    /* renamed from: s */
    public boolean f812s;

    /* renamed from: t */
    public final int f813t;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0238a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0178a f814a;

        public View$OnClickListenerC0238a(AbstractC0178a abstractC0178a) {
            this.f814a = abstractC0178a;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f814a.mo12894c();
        }
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0157c.f413d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = C0158a.m12920a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11748q(this, drawable);
        this.f810q = obtainStyledAttributes.getResourceId(5, 0);
        this.f811r = obtainStyledAttributes.getResourceId(4, 0);
        this.f1074e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f813t = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12806f(androidx.appcompat.view.AbstractC0178a r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f804k
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.f813t
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.f804k = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r5.f804k
        L1e:
            r5.addView(r0)
        L21:
            android.view.View r0 = r5.f804k
            r2 = 2131361865(0x7f0a0049, float:1.8343494E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.f805l = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6)
            r0.setOnClickListener(r2)
            androidx.appcompat.view.menu.g r6 = r6.mo12892e()
            androidx.appcompat.widget.c r0 = r5.f1073d
            if (r0 == 0) goto L4e
            r0.m12706h()
            androidx.appcompat.widget.c$a r0 = r0.f1151t
            if (r0 == 0) goto L4e
            boolean r2 = r0.m12828b()
            if (r2 == 0) goto L4e
            androidx.appcompat.view.menu.k r0 = r0.f762j
            r0.dismiss()
        L4e:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f1073d = r0
            r2 = 1
            r0.f1143l = r2
            r0.f1144m = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.c r2 = r5.f1073d
            android.content.Context r3 = r5.f1071b
            r6.m12849b(r2, r3)
            androidx.appcompat.widget.c r6 = r5.f1073d
            androidx.appcompat.view.menu.n r2 = r6.f662h
            if (r2 != 0) goto L86
            android.view.LayoutInflater r3 = r6.f658d
            int r4 = r6.f660f
            android.view.View r1 = r3.inflate(r4, r5, r1)
            androidx.appcompat.view.menu.n r1 = (androidx.appcompat.view.menu.InterfaceC0228n) r1
            r6.f662h = r1
            androidx.appcompat.view.menu.g r3 = r6.f657c
            r1.mo4532b(r3)
            r6.mo12707g()
        L86:
            androidx.appcompat.view.menu.n r1 = r6.f662h
            if (r2 == r1) goto L90
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L90:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f1072c = r1
            java.util.WeakHashMap<android.view.View, androidx.core.view.g2> r6 = androidx.core.view.ViewCompat.f2518a
            r6 = 0
            androidx.core.view.ViewCompat.C0814d.m11748q(r1, r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f1072c
            r5.addView(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m12806f(androidx.appcompat.view.a):void");
    }

    /* renamed from: g */
    public final void m12805g() {
        if (this.f807n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f807n = linearLayout;
            this.f808o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f809p = (TextView) this.f807n.findViewById(R.id.action_bar_subtitle);
            int i = this.f810q;
            if (i != 0) {
                this.f808o.setTextAppearance(getContext(), i);
            }
            int i2 = this.f811r;
            if (i2 != 0) {
                this.f809p.setTextAppearance(getContext(), i2);
            }
        }
        this.f808o.setText(this.f802i);
        this.f809p.setText(this.f803j);
        boolean z = !TextUtils.isEmpty(this.f802i);
        boolean z2 = !TextUtils.isEmpty(this.f803j);
        int i3 = 0;
        this.f809p.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f807n;
        if (!z && !z2) {
            i3 = 8;
        }
        linearLayout2.setVisibility(i3);
        if (this.f807n.getParent() == null) {
            addView(this.f807n);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbstractC0284a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbstractC0284a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f803j;
    }

    public CharSequence getTitle() {
        return this.f802i;
    }

    /* renamed from: h */
    public final void m12804h() {
        removeAllViews();
        this.f806m = null;
        this.f1072c = null;
        this.f1073d = null;
        View view = this.f805l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0309c c0309c = this.f1073d;
        if (c0309c != null) {
            c0309c.m12706h();
            C0309c.C0310a c0310a = this.f1073d.f1151t;
            if (c0310a != null && c0310a.m12828b()) {
                c0310a.f762j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean m12616a = C0362i2.m12616a(this);
        int paddingRight = m12616a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f804k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f804k.getLayoutParams();
            int i5 = m12616a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = m12616a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = m12616a ? paddingRight - i5 : paddingRight + i5;
            int m12735d = AbstractC0284a.m12735d(this.f804k, m12616a, i7, paddingTop, paddingTop2) + i7;
            paddingRight = m12616a ? m12735d - i6 : m12735d + i6;
        }
        LinearLayout linearLayout = this.f807n;
        if (linearLayout != null && this.f806m == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC0284a.m12735d(this.f807n, m12616a, paddingRight, paddingTop, paddingTop2);
        }
        View view2 = this.f806m;
        if (view2 != null) {
            AbstractC0284a.m12735d(view2, m12616a, paddingRight, paddingTop, paddingTop2);
        }
        int paddingLeft = m12616a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1072c;
        if (actionMenuView != null) {
            AbstractC0284a.m12735d(actionMenuView, !m12616a, paddingLeft, paddingTop, paddingTop2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f1074e;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        View view = this.f804k;
        if (view != null) {
            int m12736c = AbstractC0284a.m12736c(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f804k.getLayoutParams();
            paddingLeft = m12736c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1072c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbstractC0284a.m12736c(this.f1072c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f807n;
        if (linearLayout != null && this.f806m == null) {
            if (this.f812s) {
                this.f807n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f807n.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f807n.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = AbstractC0284a.m12736c(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f806m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.f806m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1074e <= 0) {
            int childCount = getChildCount();
            i3 = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
        }
        setMeasuredDimension(size, i3);
    }

    @Override // androidx.appcompat.widget.AbstractC0284a
    public void setContentHeight(int i) {
        this.f1074e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f806m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f806m = view;
        if (view != null && (linearLayout = this.f807n) != null) {
            removeView(linearLayout);
            this.f807n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f803j = charSequence;
        m12805g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f802i = charSequence;
        m12805g();
        ViewCompat.m11770o(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f812s) {
            requestLayout();
        }
        this.f812s = z;
    }

    @Override // androidx.appcompat.widget.AbstractC0284a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
