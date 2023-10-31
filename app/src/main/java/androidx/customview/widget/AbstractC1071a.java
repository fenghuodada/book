package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.C0851a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.core.view.accessibility.C0877p;
import androidx.core.view.accessibility.C0882r;
import androidx.customview.widget.C1075b;
import com.google.android.material.chip.C7645d;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: androidx.customview.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC1071a extends C0851a {

    /* renamed from: n */
    public static final Rect f2748n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C1072a f2749o = new C1072a();

    /* renamed from: p */
    public static final C1073b f2750p = new C1073b();

    /* renamed from: h */
    public final AccessibilityManager f2755h;

    /* renamed from: i */
    public final View f2756i;

    /* renamed from: j */
    public C1074c f2757j;

    /* renamed from: d */
    public final Rect f2751d = new Rect();

    /* renamed from: e */
    public final Rect f2752e = new Rect();

    /* renamed from: f */
    public final Rect f2753f = new Rect();

    /* renamed from: g */
    public final int[] f2754g = new int[2];

    /* renamed from: k */
    public int f2758k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f2759l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f2760m = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.widget.a$a */
    /* loaded from: classes.dex */
    public class C1072a implements C1075b.InterfaceC1076a<C0874o> {
    }

    /* renamed from: androidx.customview.widget.a$b */
    /* loaded from: classes.dex */
    public class C1073b {
    }

    /* renamed from: androidx.customview.widget.a$c */
    /* loaded from: classes.dex */
    public class C1074c extends C0877p {
        public C1074c() {
        }

        @Override // androidx.core.view.accessibility.C0877p
        /* renamed from: a */
        public final C0874o mo11231a(int i) {
            return new C0874o(AccessibilityNodeInfo.obtain(AbstractC1071a.this.m11234n(i).f2606a));
        }

        @Override // androidx.core.view.accessibility.C0877p
        /* renamed from: b */
        public final C0874o mo11230b(int i) {
            AbstractC1071a abstractC1071a = AbstractC1071a.this;
            int i2 = i == 2 ? abstractC1071a.f2758k : abstractC1071a.f2759l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo11231a(i2);
        }

        @Override // androidx.core.view.accessibility.C0877p
        /* renamed from: c */
        public final boolean mo11229c(int i, int i2, Bundle bundle) {
            int i3;
            AbstractC1071a abstractC1071a = AbstractC1071a.this;
            View view = abstractC1071a.f2756i;
            if (i != -1) {
                boolean z = true;
                if (i2 != 1) {
                    if (i2 != 2) {
                        boolean z2 = false;
                        if (i2 != 64) {
                            if (i2 != 128) {
                                Chip.C7641b c7641b = (Chip.C7641b) abstractC1071a;
                                if (i2 == 16) {
                                    Chip chip = Chip.this;
                                    if (i == 0) {
                                        return chip.performClick();
                                    }
                                    if (i == 1) {
                                        chip.playSoundEffect(0);
                                        View.OnClickListener onClickListener = chip.f14689h;
                                        if (onClickListener != null) {
                                            onClickListener.onClick(chip);
                                            z2 = true;
                                        }
                                        if (chip.f14700s) {
                                            chip.f14699r.m11232q(1, 1);
                                        }
                                    }
                                }
                                return z2;
                            }
                            if (abstractC1071a.f2758k == i) {
                                abstractC1071a.f2758k = Integer.MIN_VALUE;
                                view.invalidate();
                                abstractC1071a.m11232q(i, 65536);
                            }
                            z = false;
                        } else {
                            AccessibilityManager accessibilityManager = abstractC1071a.f2755h;
                            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = abstractC1071a.f2758k) != i) {
                                if (i3 != Integer.MIN_VALUE) {
                                    abstractC1071a.f2758k = Integer.MIN_VALUE;
                                    abstractC1071a.f2756i.invalidate();
                                    abstractC1071a.m11232q(i3, 65536);
                                }
                                abstractC1071a.f2758k = i;
                                view.invalidate();
                                abstractC1071a.m11232q(i, 32768);
                            }
                            z = false;
                        }
                        return z;
                    }
                    return abstractC1071a.m11237j(i);
                }
                return abstractC1071a.m11233p(i);
            }
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            return ViewCompat.C0814d.m11755j(view, i2, bundle);
        }
    }

    public AbstractC1071a(@NonNull View view) {
        if (view != null) {
            this.f2756i = view;
            this.f2755h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (ViewCompat.C0814d.m11762c(view) == 0) {
                ViewCompat.C0814d.m11746s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: b */
    public final C0877p mo10096b(View view) {
        if (this.f2757j == null) {
            this.f2757j = new C1074c();
        }
        return this.f2757j;
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: c */
    public final void mo4531c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo4531c(view, accessibilityEvent);
    }

    @Override // androidx.core.view.C0851a
    /* renamed from: d */
    public final void mo4308d(View view, C0874o c0874o) {
        boolean z;
        View.AccessibilityDelegate accessibilityDelegate = this.f2597a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0874o.f2606a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        C7645d c7645d = chip.f14686e;
        if (c7645d != null && c7645d.f14735Q) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c0874o.m11551g(chip.getAccessibilityClassName());
        c0874o.m11547k(chip.getText());
    }

    /* renamed from: j */
    public final boolean m11237j(int i) {
        if (this.f2759l != i) {
            return false;
        }
        this.f2759l = Integer.MIN_VALUE;
        Chip.C7641b c7641b = (Chip.C7641b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.f14694m = false;
            chip.refreshDrawableState();
        }
        m11232q(i, 8);
        return true;
    }

    @NonNull
    /* renamed from: k */
    public final C0874o m11236k(int i) {
        boolean z;
        AccessibilityNodeInfo accessibilityNodeInfo;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C0874o c0874o = new C0874o(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        c0874o.m11551g("android.view.View");
        Rect rect = f2748n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        c0874o.f2607b = -1;
        View view = this.f2756i;
        obtain.setParent(view);
        mo4661o(i, c0874o);
        if (c0874o.m11553e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f2752e;
        c0874o.m11554d(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    c0874o.f2608c = i;
                    obtain.setSource(view, i);
                    boolean z2 = false;
                    if (this.f2758k == i) {
                        obtain.setAccessibilityFocused(true);
                        c0874o.m11557a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        c0874o.m11557a(64);
                    }
                    if (this.f2759l == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c0874o.m11557a(2);
                    } else if (obtain.isFocusable()) {
                        c0874o.m11557a(1);
                    }
                    obtain.setFocused(z);
                    int[] iArr = this.f2754g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.f2751d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        c0874o.m11554d(rect3);
                        if (c0874o.f2607b != -1) {
                            C0874o c0874o2 = new C0874o(AccessibilityNodeInfo.obtain());
                            int i2 = c0874o.f2607b;
                            while (true) {
                                accessibilityNodeInfo = c0874o2.f2606a;
                                if (i2 == -1) {
                                    break;
                                }
                                c0874o2.f2607b = -1;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                mo4661o(i2, c0874o2);
                                c0874o2.m11554d(rect2);
                                rect3.offset(rect2.left, rect2.top);
                                i2 = c0874o2.f2607b;
                            }
                            accessibilityNodeInfo.recycle();
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f2753f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            c0874o.f2606a.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                while (true) {
                                    ViewParent parent = view.getParent();
                                    if (parent instanceof View) {
                                        view = (View) parent;
                                        if (view.getAlpha() > 0.0f) {
                                            if (view.getVisibility() != 0) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else if (parent != null) {
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                obtain.setVisibleToUser(true);
                            }
                        }
                    }
                    return c0874o;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    /* renamed from: l */
    public abstract void mo4662l(ArrayList arrayList);

    /* JADX WARN: Code restructure failed: missing block: B:68:0x013f, code lost:
        if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m11235m(int r19, @androidx.annotation.Nullable android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.AbstractC1071a.m11235m(int, android.graphics.Rect):boolean");
    }

    @NonNull
    /* renamed from: n */
    public final C0874o m11234n(int i) {
        if (i == -1) {
            View view = this.f2756i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            C0874o c0874o = new C0874o(obtain);
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            mo4662l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                c0874o.f2606a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return c0874o;
        }
        return m11236k(i);
    }

    /* renamed from: o */
    public abstract void mo4661o(int i, @NonNull C0874o c0874o);

    /* renamed from: p */
    public final boolean m11233p(int i) {
        int i2;
        View view = this.f2756i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.f2759l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m11237j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f2759l = i;
        Chip.C7641b c7641b = (Chip.C7641b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.f14694m = true;
            chip.refreshDrawableState();
        }
        m11232q(i, 8);
        return true;
    }

    /* renamed from: q */
    public final void m11232q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.f2755h.isEnabled() || (parent = (view = this.f2756i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            C0874o m11234n = m11234n(i);
            obtain.getText().add(m11234n.m11553e());
            AccessibilityNodeInfo accessibilityNodeInfo = m11234n.f2606a;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(accessibilityNodeInfo.getClassName());
            C0882r.m11539a(obtain, view, i);
            obtain.setPackageName(view.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(view, obtain);
    }
}
