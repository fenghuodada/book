package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: androidx.core.view.e0 */
/* loaded from: classes.dex */
public final class C0910e0 {

    /* renamed from: a */
    public ViewParent f2625a;

    /* renamed from: b */
    public ViewParent f2626b;

    /* renamed from: c */
    public final View f2627c;

    /* renamed from: d */
    public boolean f2628d;

    /* renamed from: e */
    public int[] f2629e;

    public C0910e0(@NonNull View view) {
        this.f2627c = view;
    }

    /* renamed from: a */
    public final boolean m11495a(float f, float f2, boolean z) {
        ViewParent m11490f;
        if (!this.f2628d || (m11490f = m11490f(0)) == null) {
            return false;
        }
        try {
            return C0907d2.m11506a(m11490f, this.f2627c, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + m11490f + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean m11494b(float f, float f2) {
        ViewParent m11490f;
        if (!this.f2628d || (m11490f = m11490f(0)) == null) {
            return false;
        }
        try {
            return C0907d2.m11505b(m11490f, this.f2627c, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + m11490f + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean m11493c(int i, int i2, int i3, @Nullable int[] iArr, @Nullable int[] iArr2) {
        ViewParent m11490f;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f2628d || (m11490f = m11490f(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f2627c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f2629e == null) {
                this.f2629e = new int[2];
            }
            iArr3 = this.f2629e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f2627c;
        if (m11490f instanceof InterfaceC0915f0) {
            ((InterfaceC0915f0) m11490f).mo2709o(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                C0907d2.m11504c(m11490f, view2, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + m11490f + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void m11492d(int i, int i2, int i3, @Nullable int[] iArr) {
        m11491e(0, i, 0, i2, null, i3, iArr);
    }

    /* renamed from: e */
    public final boolean m11491e(int i, int i2, int i3, int i4, @Nullable int[] iArr, int i5, @Nullable int[] iArr2) {
        ViewParent m11490f;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f2628d || (m11490f = m11490f(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f2627c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f2629e == null) {
                this.f2629e = new int[2];
            }
            int[] iArr4 = this.f2629e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f2627c;
        if (m11490f instanceof InterfaceC0920g0) {
            ((InterfaceC0920g0) m11490f).mo11312k(view2, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (m11490f instanceof InterfaceC0915f0) {
                ((InterfaceC0915f0) m11490f).mo2712l(view2, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    C0907d2.m11503d(m11490f, view2, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + m11490f + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: f */
    public final ViewParent m11490f(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f2626b;
        }
        return this.f2625a;
    }

    /* renamed from: g */
    public final boolean m11489g(int i, int i2) {
        boolean z;
        boolean m11501f;
        if (m11490f(i2) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.f2628d) {
            View view = this.f2627c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0915f0;
                if (z2) {
                    m11501f = ((InterfaceC0915f0) parent).mo2711m(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            m11501f = C0907d2.m11501f(parent, view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    m11501f = false;
                }
                if (m11501f) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.f2626b = parent;
                        }
                    } else {
                        this.f2625a = parent;
                    }
                    if (z2) {
                        ((InterfaceC0915f0) parent).mo2710n(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            C0907d2.m11502e(parent, view2, view, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void m11488h(int i) {
        ViewParent m11490f = m11490f(i);
        if (m11490f != null) {
            boolean z = m11490f instanceof InterfaceC0915f0;
            View view = this.f2627c;
            if (z) {
                ((InterfaceC0915f0) m11490f).mo2713j(i, view);
            } else if (i == 0) {
                try {
                    C0907d2.m11500g(m11490f, view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + m11490f + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.f2626b = null;
                    return;
                }
                return;
            }
            this.f2625a = null;
        }
    }
}
