package com.android.tool.util.weight.sectionDialog;

import android.util.SparseIntArray;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.fragment.C2470n;
import com.ambrose.overwall.fragment.View$OnClickListenerC2481q;
import com.android.tool.util.weight.dialogFragment.C2617c;
import com.qmuiteam.qmui.layout.QMUIRelativeLayout;
import com.qmuiteam.qmui.skin.C9108h;
import com.qmuiteam.qmui.widget.QMUITopBar;

/* renamed from: com.android.tool.util.weight.sectionDialog.k */
/* loaded from: classes.dex */
public final class C2640k {

    /* renamed from: a */
    public static final SparseIntArray f6194a = new SparseIntArray();

    /* renamed from: com.android.tool.util.weight.sectionDialog.k$a */
    /* loaded from: classes.dex */
    public static final class C2641a extends C2617c<C2641a> {

        /* renamed from: j */
        public InterfaceC2642b f6195j;

        /* renamed from: k */
        public final RecyclerView f6196k;

        /* renamed from: l */
        public final RecyclerView f6197l;

        /* renamed from: m */
        public View$OnClickListenerC2624b f6198m;

        /* renamed from: n */
        public C2628d f6199n;

        /* renamed from: o */
        public final QMUIRelativeLayout f6200o;

        /* renamed from: p */
        public final FragmentActivity f6201p;

        /* renamed from: q */
        public final QMUITopBar f6202q;

        /* renamed from: r */
        public int f6203r;

        /* renamed from: s */
        public int f6204s;

        /* renamed from: t */
        public int f6205t;

        /* renamed from: u */
        public int f6206u;

        /* renamed from: v */
        public String f6207v;

        /* renamed from: w */
        public CenterLayoutManager f6208w;

        /* renamed from: x */
        public GridLayoutManager f6209x;

        /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C2641a(com.qmuiteam.qmui.arch.AbstractActivityC9024f r7) {
            /*
                r6 = this;
                r6.<init>(r7)
                r0 = 0
                r6.f6206u = r0
                r6.f6201p = r7
                r0 = 2131558596(0x7f0d00c4, float:1.8742512E38)
                r6.m9329c(r0)
                java.lang.String r0 = "AnimStyle"
                int r1 = com.android.tool.util.util.C2603g.m9339a(r0)
                r2 = 1
                r3 = 3
                if (r1 != r2) goto L19
                goto L4f
            L19:
                int r1 = com.android.tool.util.util.C2603g.m9339a(r0)
                r2 = 2
                if (r1 != r2) goto L24
                r0 = 2132017625(0x7f1401d9, float:1.9673534E38)
                goto L52
            L24:
                int r1 = com.android.tool.util.util.C2603g.m9339a(r0)
                if (r1 != r3) goto L2e
                r0 = 2132018029(0x7f14036d, float:1.9674353E38)
                goto L52
            L2e:
                int r1 = com.android.tool.util.util.C2603g.m9339a(r0)
                r2 = 4
                if (r1 != r2) goto L39
                r0 = 2132017452(0x7f14012c, float:1.9673183E38)
                goto L52
            L39:
                int r1 = com.android.tool.util.util.C2603g.m9339a(r0)
                r2 = 5
                if (r1 != r2) goto L44
                r0 = 2132017506(0x7f140162, float:1.9673292E38)
                goto L52
            L44:
                int r0 = com.android.tool.util.util.C2603g.m9339a(r0)
                r1 = 6
                if (r0 != r1) goto L4f
                r0 = 2132017607(0x7f1401c7, float:1.9673497E38)
                goto L52
            L4f:
                r0 = 2132017502(0x7f14015e, float:1.9673284E38)
            L52:
                r6.m9330b(r0)
                android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
                r0.<init>()
                java.lang.Object r1 = androidx.core.content.ContextCompat.f2323a
                java.lang.Class<android.view.WindowManager> r1 = android.view.WindowManager.class
                java.lang.Object r1 = androidx.core.content.ContextCompat.C0652d.m12029b(r7, r1)
                android.view.WindowManager r1 = (android.view.WindowManager) r1
                android.view.Display r1 = r1.getDefaultDisplay()
                r1.getMetrics(r0)
                int r0 = r0.heightPixels
                int r1 = r0 / 8
                int r0 = r0 - r1
                r6.m9328d(r0)
                r0 = 2131362406(0x7f0a0266, float:1.8344592E38)
                android.view.View r0 = r6.m9331a(r0)
                androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
                r6.f6196k = r0
                r0 = 2131362407(0x7f0a0267, float:1.8344594E38)
                android.view.View r0 = r6.m9331a(r0)
                androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
                r6.f6197l = r0
                r0 = 2131362347(0x7f0a022b, float:1.8344472E38)
                android.view.View r0 = r6.m9331a(r0)
                com.qmuiteam.qmui.layout.QMUIRelativeLayout r0 = (com.qmuiteam.qmui.layout.QMUIRelativeLayout) r0
                r6.f6200o = r0
                r1 = 2131362248(0x7f0a01c8, float:1.8344271E38)
                android.view.View r1 = r6.m9331a(r1)
                com.qmuiteam.qmui.widget.QMUITopBar r1 = (com.qmuiteam.qmui.widget.QMUITopBar) r1
                r6.f6202q = r1
                r2 = 2131755009(0x7f100001, float:1.9140885E38)
                r4 = 2131362542(0x7f0a02ee, float:1.8344868E38)
                com.qmuiteam.qmui.alpha.d r1 = r1.m2616j(r2, r4)
                com.android.tool.util.weight.sectionDialog.f r2 = new com.android.tool.util.weight.sectionDialog.f
                r2.<init>(r6)
                r1.setOnClickListener(r2)
                r1 = 15
                int r1 = com.qmuiteam.qmui.util.C9141b.m2646a(r7, r1)
                com.qmuiteam.qmui.layout.g r2 = r0.f17326b
                int r4 = r2.f17331A
                if (r4 != r1) goto Lc2
                int r4 = r2.f17332B
                if (r3 != r4) goto Lc2
                goto Lc9
            Lc2:
                int r4 = r2.f17343M
                float r5 = r2.f17344N
                r2.m2744v(r1, r5, r3, r4)
            Lc9:
                com.qmuiteam.qmui.skin.h r7 = com.qmuiteam.qmui.skin.C9108h.m2670f(r7)
                boolean r1 = r7.m2672d(r0)
                if (r1 != 0) goto Ldd
                java.util.ArrayList r1 = r7.f17556g
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r0)
                r1.add(r2)
            Ldd:
                int r1 = r7.f17555f
                r7.m2669g(r1, r0)
                com.qmuiteam.qmui.skin.i r7 = com.qmuiteam.qmui.skin.C9135i.m2657a()
                r1 = 2130968660(0x7f040054, float:1.754598E38)
                r7.m2656b(r1)
                int r1 = com.qmuiteam.qmui.skin.C9106f.f17535a
                java.lang.String r7 = r7.m2655c()
                com.qmuiteam.qmui.skin.C9106f.m2677c(r0, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.tool.util.weight.sectionDialog.C2640k.C2641a.<init>(com.qmuiteam.qmui.arch.f):void");
        }

        public final Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        /* renamed from: f */
        public final void m9319f() {
            FragmentActivity fragmentActivity;
            InterfaceC2642b interfaceC2642b = this.f6195j;
            if (interfaceC2642b != null) {
                int i = this.f6203r;
                int i2 = this.f6204s;
                int i3 = this.f6205t;
                int i4 = this.f6206u;
                C2470n c2470n = View$OnClickListenerC2481q.this.f5941b;
                c2470n.f5930z = i;
                c2470n.f5899A = i2;
                c2470n.f5902D = i3;
                c2470n.f5903E = i4;
            }
            QMUIRelativeLayout qMUIRelativeLayout = this.f6200o;
            if (qMUIRelativeLayout != null && (fragmentActivity = this.f6201p) != null) {
                C9108h.m2670f(fragmentActivity).m2664l(qMUIRelativeLayout);
            }
            this.f6149i.dismissAllowingStateLoss();
        }
    }

    /* renamed from: com.android.tool.util.weight.sectionDialog.k$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2642b {
    }
}
