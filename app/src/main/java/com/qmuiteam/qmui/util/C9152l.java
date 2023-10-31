package com.qmuiteam.qmui.util;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.C0690b;
import androidx.core.view.C0922g2;
import androidx.core.view.InterfaceC0932i0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ambrose.overwall.R;
import java.util.WeakHashMap;

/* renamed from: com.qmuiteam.qmui.util.l */
/* loaded from: classes3.dex */
public final class C9152l {

    /* renamed from: a */
    public static final C9153a f17591a = new C9153a();

    /* renamed from: com.qmuiteam.qmui.util.l$a */
    /* loaded from: classes3.dex */
    public class C9153a implements InterfaceC9155c {
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
            if (r1.f1974l == 0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x005d, code lost:
            if (r1 != 80) goto L21;
         */
        @Override // com.qmuiteam.qmui.util.C9152l.InterfaceC9155c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo2620a(android.view.View r10, androidx.core.graphics.C0690b r11) {
            /*
                r9 = this;
                int r0 = r11.f2384a
                android.view.ViewGroup$LayoutParams r1 = r10.getLayoutParams()
                boolean r2 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout.C0562a
                r3 = 0
                int r4 = r11.f2386c
                int r5 = r11.f2387d
                if (r2 == 0) goto L31
                androidx.constraintlayout.widget.ConstraintLayout$a r1 = (androidx.constraintlayout.widget.ConstraintLayout.C0562a) r1
                int r2 = r1.width
                r6 = -2
                if (r2 != r6) goto L21
                int r2 = r1.f1960e
                if (r2 != 0) goto L1c
                r4 = r3
                goto L21
            L1c:
                int r2 = r1.f1966h
                if (r2 != 0) goto L21
                r0 = r3
            L21:
                int r2 = r1.height
                if (r2 != r6) goto L2f
                int r2 = r1.f1968i
                if (r2 != 0) goto L2a
                goto L60
            L2a:
                int r1 = r1.f1974l
                if (r1 != 0) goto L2f
                goto L64
            L2f:
                r3 = r5
                goto L60
            L31:
                boolean r2 = r1 instanceof android.widget.FrameLayout.LayoutParams
                r6 = -1
                if (r2 == 0) goto L3c
                r2 = r1
                android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
                int r2 = r2.gravity
                goto L3d
            L3c:
                r2 = r6
            L3d:
                if (r2 != r6) goto L41
                r2 = 51
            L41:
                int r7 = r1.width
                if (r7 == r6) goto L51
                r7 = r2 & 7
                r8 = 3
                if (r7 == r8) goto L50
                r8 = 5
                if (r7 == r8) goto L4e
                goto L51
            L4e:
                r0 = r3
                goto L51
            L50:
                r4 = r3
            L51:
                int r1 = r1.height
                if (r1 == r6) goto L2f
                r1 = r2 & 112(0x70, float:1.57E-43)
                r2 = 48
                if (r1 == r2) goto L60
                r2 = 80
                if (r1 == r2) goto L64
                goto L2f
            L60:
                int r11 = r11.f2385b
                r5 = r3
                r3 = r11
            L64:
                androidx.core.graphics.b r11 = androidx.core.graphics.C0690b.m11968b(r0, r3, r4, r5)
                int r0 = r11.f2386c
                int r1 = r11.f2387d
                int r2 = r11.f2384a
                int r11 = r11.f2385b
                r10.setPadding(r2, r11, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.util.C9152l.C9153a.mo2620a(android.view.View, androidx.core.graphics.b):void");
        }
    }

    /* renamed from: com.qmuiteam.qmui.util.l$b */
    /* loaded from: classes3.dex */
    public class View$OnApplyWindowInsetsListenerC9154b implements View.OnApplyWindowInsetsListener {

        /* renamed from: a */
        public WindowInsetsCompat f17592a = null;

        /* renamed from: b */
        public WindowInsets f17593b = null;

        /* renamed from: c */
        public final /* synthetic */ View f17594c;

        /* renamed from: d */
        public final /* synthetic */ boolean f17595d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC0932i0 f17596e;

        public View$OnApplyWindowInsetsListenerC9154b(View view, InterfaceC0932i0 interfaceC0932i0, boolean z) {
            this.f17594c = view;
            this.f17595d = z;
            this.f17596e = interfaceC0932i0;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            WindowInsetsCompat m11635i = WindowInsetsCompat.m11635i(view, windowInsets);
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i < 30) {
                View view2 = this.f17594c;
                View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view2.getTag(R.id.tag_window_insets_animation_callback);
                if (onApplyWindowInsetsListener != null) {
                    onApplyWindowInsetsListener.onApplyWindowInsets(view2, windowInsets);
                }
                if (m11635i.equals(this.f17592a)) {
                    if (this.f17595d) {
                        return this.f17593b;
                    }
                    z = false;
                }
                this.f17592a = m11635i;
            }
            WindowInsetsCompat mo2619a = this.f17596e.mo2619a(view, m11635i);
            if (i >= 30) {
                return mo2619a.m11636h();
            }
            if (z) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0818h.m11722c(view);
            }
            WindowInsets m11636h = mo2619a.m11636h();
            this.f17593b = m11636h;
            return m11636h;
        }
    }

    /* renamed from: com.qmuiteam.qmui.util.l$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9155c {
        /* renamed from: a */
        void mo2620a(View view, C0690b c0690b);
    }

    /* renamed from: a */
    public static void m2621a(@NonNull View view, @Nullable InterfaceC0932i0 interfaceC0932i0, boolean z) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, interfaceC0932i0);
        }
        view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC9154b(view, interfaceC0932i0, z));
    }
}
