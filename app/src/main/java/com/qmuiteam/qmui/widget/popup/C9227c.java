package com.qmuiteam.qmui.widget.popup;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.alpha.C9002d;
import com.qmuiteam.qmui.layout.C9058b;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.util.C9148i;
import com.qmuiteam.qmui.util.C9150j;
import com.qmuiteam.qmui.widget.InterfaceC9158a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.qmuiteam.qmui.widget.popup.c */
/* loaded from: classes3.dex */
public class C9227c extends AbstractC9221a<C9227c> {

    /* renamed from: j */
    public InterfaceC9228a f17906j;

    /* renamed from: k */
    public boolean f17907k;

    /* renamed from: l */
    public final int f17908l;

    /* renamed from: m */
    public ConstraintLayout.C0562a f17909m;

    /* renamed from: n */
    public final int f17910n;

    /* renamed from: o */
    public final ArrayList<C9230c> f17911o;

    /* renamed from: com.qmuiteam.qmui.widget.popup.c$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9228a {
    }

    /* renamed from: com.qmuiteam.qmui.widget.popup.c$b */
    /* loaded from: classes3.dex */
    public class C9229b extends C9058b {

        /* renamed from: s */
        public boolean f17912s;

        public C9229b(Context context) {
            super(context);
            this.f17912s = false;
        }

        @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            C9150j c9150j;
            super.onLayout(z, i, i2, i3, i4);
            Iterator<C9230c> it = C9227c.this.f17911o.iterator();
            while (it.hasNext()) {
                View view = it.next().f17914a;
                int i5 = C9148i.f17583a;
                Object tag = view.getTag(R.id.qmui_view_offset_helper);
                if (tag instanceof C9150j) {
                    c9150j = (C9150j) tag;
                } else {
                    c9150j = new C9150j(view);
                    view.setTag(R.id.qmui_view_offset_helper, c9150j);
                }
                c9150j.m2625b(true);
            }
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            C9227c c9227c = C9227c.this;
            if (c9227c.f17906j == null) {
                return true;
            }
            if (actionMasked == 0) {
                this.f17912s = m2561x(motionEvent);
            } else {
                boolean z = false;
                if (actionMasked == 2) {
                    if (this.f17912s && m2561x(motionEvent)) {
                        z = true;
                    }
                    this.f17912s = z;
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (this.f17912s && m2561x(motionEvent)) {
                        z = true;
                    }
                    this.f17912s = z;
                    if (z) {
                        c9227c.f17906j.getClass();
                    }
                }
            }
            return true;
        }

        /* renamed from: x */
        public final boolean m2561x(MotionEvent motionEvent) {
            View view;
            boolean z;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    view = getChildAt(childCount);
                    float translationX = view.getTranslationX();
                    float translationY = view.getTranslationY();
                    if (x >= view.getLeft() + translationX && x <= view.getRight() + translationX && y >= view.getTop() + translationY && y <= view.getBottom() + translationY) {
                        break;
                    }
                } else {
                    view = null;
                    break;
                }
            }
            if (view == null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && (view instanceof InterfaceC9158a)) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.offsetLocation(getScrollX() - view.getLeft(), getScrollY() - view.getTop());
                boolean m2607a = ((InterfaceC9158a) view).m2607a();
                obtain.recycle();
                return m2607a;
            }
            return z;
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.popup.c$c */
    /* loaded from: classes3.dex */
    public class C9230c {

        /* renamed from: a */
        public final View f17914a;

        /* renamed from: b */
        public final ConstraintLayout.C0562a f17915b;

        public C9230c(View view, ConstraintLayout.C0562a c0562a) {
            this.f17914a = view;
            this.f17915b = c0562a;
        }
    }

    public C9227c(Context context) {
        super(context);
        this.f17907k = false;
        this.f17908l = R.attr.qmui_skin_support_popup_close_icon;
        this.f17910n = -1;
        this.f17911o = new ArrayList<>();
        this.f17892a.setWidth(-1);
        this.f17892a.setHeight(-1);
        this.f17892a.setSoftInputMode(16);
        this.f17896e = 0.6f;
    }

    @Override // com.qmuiteam.qmui.widget.popup.AbstractC9221a
    /* renamed from: a */
    public final void mo2563a(WindowManager.LayoutParams layoutParams) {
        layoutParams.flags |= 65792;
    }

    /* renamed from: c */
    public final void m2562c(View view) {
        Drawable drawable;
        PopupWindow popupWindow = this.f17892a;
        if (popupWindow.isShowing()) {
            return;
        }
        ArrayList<C9230c> arrayList = this.f17911o;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            Context context = this.f17894c;
            C9229b c9229b = new C9229b(context);
            for (int i = 0; i < arrayList2.size(); i++) {
                C9230c c9230c = arrayList.get(i);
                View view2 = c9230c.f17914a;
                if (view2.getParent() != null) {
                    ((ViewGroup) view2.getParent()).removeView(view2);
                }
                c9229b.addView(view2, c9230c.f17915b);
            }
            if (this.f17907k) {
                if (this.f17909m == null) {
                    ConstraintLayout.C0562a c0562a = new ConstraintLayout.C0562a(-2, -2);
                    c0562a.f1960e = 0;
                    c0562a.f1966h = 0;
                    c0562a.f1974l = 0;
                    ((ViewGroup.MarginLayoutParams) c0562a).bottomMargin = C9141b.m2646a(context, 48);
                    this.f17909m = c0562a;
                }
                C9002d c9002d = new C9002d(context);
                c9002d.setPadding(0, 0, 0, 0);
                c9002d.setScaleType(ImageView.ScaleType.CENTER);
                c9002d.setId(R.id.qmui_popup_close_btn_id);
                c9002d.setOnClickListener(new View$OnClickListenerC9226b(this));
                c9002d.setFitsSystemWindows(true);
                int i2 = this.f17908l;
                if (i2 != 0) {
                    C9135i m2657a = C9135i.m2657a();
                    m2657a.f17563a.put("src", String.valueOf(i2));
                    int i3 = C9106f.f17535a;
                    C9106f.m2677c(c9002d, m2657a.m2655c());
                    C9135i.m2653e(m2657a);
                    drawable = C9145f.m2634g(context, i2);
                } else {
                    drawable = null;
                }
                c9002d.setImageDrawable(drawable);
                c9229b.addView(c9002d, this.f17909m);
            }
            popupWindow.setContentView(c9229b);
            int i4 = this.f17910n;
            if (i4 != -1) {
                popupWindow.setAnimationStyle(i4);
            }
            m2565b(view, 0, 0);
            return;
        }
        throw new RuntimeException("you should call addView() to add content view");
    }
}
