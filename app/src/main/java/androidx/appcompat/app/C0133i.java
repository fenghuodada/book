package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0362i2;
import androidx.core.content.ContextCompat;
import androidx.core.view.C0922g2;
import androidx.core.view.InterfaceC0932i0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ambrose.overwall.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.app.i */
/* loaded from: classes.dex */
public final class C0133i implements InterfaceC0932i0 {

    /* renamed from: a */
    public final /* synthetic */ LayoutInflater$Factory2C0114h f379a;

    public C0133i(LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h) {
        this.f379a = layoutInflater$Factory2C0114h;
    }

    @Override // androidx.core.view.InterfaceC0932i0
    /* renamed from: a */
    public final WindowInsetsCompat mo2619a(View view, WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        View view2;
        WindowInsetsCompat windowInsetsCompat2;
        int m11641c;
        int m11640d;
        boolean z2;
        int i;
        int m11639e = windowInsetsCompat.m11639e();
        LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = this.f379a;
        layoutInflater$Factory2C0114h.getClass();
        int m11639e2 = windowInsetsCompat.m11639e();
        ActionBarContextView actionBarContextView = layoutInflater$Factory2C0114h.f339v;
        int i2 = 0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflater$Factory2C0114h.f339v.getLayoutParams();
            boolean z3 = true;
            if (layoutInflater$Factory2C0114h.f339v.isShown()) {
                if (layoutInflater$Factory2C0114h.f322g0 == null) {
                    layoutInflater$Factory2C0114h.f322g0 = new Rect();
                    layoutInflater$Factory2C0114h.f323h0 = new Rect();
                }
                Rect rect = layoutInflater$Factory2C0114h.f322g0;
                Rect rect2 = layoutInflater$Factory2C0114h.f323h0;
                rect.set(windowInsetsCompat.m11641c(), windowInsetsCompat.m11639e(), windowInsetsCompat.m11640d(), windowInsetsCompat.m11642b());
                ViewGroup viewGroup = layoutInflater$Factory2C0114h.f294B;
                Method method = C0362i2.f1277a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i3 = rect.top;
                int i4 = rect.left;
                int i5 = rect.right;
                ViewGroup viewGroup2 = layoutInflater$Factory2C0114h.f294B;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                WindowInsetsCompat m11695a = ViewCompat.C0821j.m11695a(viewGroup2);
                if (m11695a == null) {
                    m11641c = 0;
                } else {
                    m11641c = m11695a.m11641c();
                }
                if (m11695a == null) {
                    m11640d = 0;
                } else {
                    m11640d = m11695a.m11640d();
                }
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                Context context = layoutInflater$Factory2C0114h.f327k;
                if (i3 > 0 && layoutInflater$Factory2C0114h.f296D == null) {
                    View view3 = new View(context);
                    layoutInflater$Factory2C0114h.f296D = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m11641c;
                    layoutParams.rightMargin = m11640d;
                    layoutInflater$Factory2C0114h.f294B.addView(layoutInflater$Factory2C0114h.f296D, -1, layoutParams);
                } else {
                    View view4 = layoutInflater$Factory2C0114h.f296D;
                    if (view4 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view4.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != m11641c || marginLayoutParams2.rightMargin != m11640d) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = m11641c;
                            marginLayoutParams2.rightMargin = m11640d;
                            layoutInflater$Factory2C0114h.f296D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view5 = layoutInflater$Factory2C0114h.f296D;
                if (view5 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && view5.getVisibility() != 0) {
                    View view6 = layoutInflater$Factory2C0114h.f296D;
                    if ((ViewCompat.C0814d.m11758g(view6) & 8192) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        Object obj = ContextCompat.f2323a;
                        i = R.color.abc_decor_view_status_guard_light;
                    } else {
                        Object obj2 = ContextCompat.f2323a;
                        i = R.color.abc_decor_view_status_guard;
                    }
                    view6.setBackgroundColor(ContextCompat.C0652d.m12030a(context, i));
                }
                if (!layoutInflater$Factory2C0114h.f301I && z) {
                    m11639e2 = 0;
                }
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z3 = false;
                z = false;
            }
            if (z3) {
                layoutInflater$Factory2C0114h.f339v.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view7 = layoutInflater$Factory2C0114h.f296D;
        if (view7 != null) {
            if (!z) {
                i2 = 8;
            }
            view7.setVisibility(i2);
        }
        if (m11639e != m11639e2) {
            windowInsetsCompat2 = windowInsetsCompat.m11637g(windowInsetsCompat.m11641c(), m11639e2, windowInsetsCompat.m11640d(), windowInsetsCompat.m11642b());
            view2 = view;
        } else {
            view2 = view;
            windowInsetsCompat2 = windowInsetsCompat;
        }
        return ViewCompat.m11776i(view2, windowInsetsCompat2);
    }
}
