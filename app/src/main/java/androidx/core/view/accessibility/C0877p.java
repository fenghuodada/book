package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.p */
/* loaded from: classes.dex */
public class C0877p {
    @Nullable

    /* renamed from: a */
    public final Object f2622a;

    @RequiresApi(16)
    /* renamed from: androidx.core.view.accessibility.p$a */
    /* loaded from: classes.dex */
    public static class C0878a extends AccessibilityNodeProvider {

        /* renamed from: a */
        public final C0877p f2623a;

        public C0878a(C0877p c0877p) {
            this.f2623a = c0877p;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0874o mo11231a = this.f2623a.mo11231a(i);
            if (mo11231a == null) {
                return null;
            }
            return mo11231a.f2606a;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            this.f2623a.getClass();
            return null;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i, int i2, Bundle bundle) {
            return this.f2623a.mo11229c(i, i2, bundle);
        }
    }

    @RequiresApi(19)
    /* renamed from: androidx.core.view.accessibility.p$b */
    /* loaded from: classes.dex */
    public static class C0879b extends C0878a {
        public C0879b(C0877p c0877p) {
            super(c0877p);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i) {
            C0874o mo11230b = this.f2623a.mo11230b(i);
            if (mo11230b == null) {
                return null;
            }
            return mo11230b.f2606a;
        }
    }

    @RequiresApi(26)
    /* renamed from: androidx.core.view.accessibility.p$c */
    /* loaded from: classes.dex */
    public static class C0880c extends C0879b {
        public C0880c(C0877p c0877p) {
            super(c0877p);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f2623a.getClass();
        }
    }

    public C0877p() {
        this.f2622a = Build.VERSION.SDK_INT >= 26 ? new C0880c(this) : new C0879b(this);
    }

    public C0877p(@Nullable AccessibilityNodeProvider accessibilityNodeProvider) {
        this.f2622a = accessibilityNodeProvider;
    }

    @Nullable
    /* renamed from: a */
    public C0874o mo11231a(int i) {
        return null;
    }

    @Nullable
    /* renamed from: b */
    public C0874o mo11230b(int i) {
        return null;
    }

    /* renamed from: c */
    public boolean mo11229c(int i, int i2, @Nullable Bundle bundle) {
        return false;
    }
}
