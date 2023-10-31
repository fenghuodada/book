package com.kongzue.dialogx.dialogs;

import android.app.Activity;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.C0511i;
import com.ambrose.overwall.R;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.InterfaceC8931c;
import com.kongzue.dialogx.interfaces.InterfaceC8937i;
import com.kongzue.dialogx.style.C8941a;
import com.kongzue.dialogx.util.views.C8955b;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import com.qmuiteam.qmui.arch.AbstractActivityC9024f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.kongzue.dialogx.dialogs.o */
/* loaded from: classes3.dex */
public final class C8897o extends BaseDialog {

    /* renamed from: J */
    public static WeakReference<C8897o> f16955J;

    /* renamed from: A */
    public CharSequence f16956A;

    /* renamed from: F */
    public int f16961F;

    /* renamed from: G */
    public WeakReference<View> f16962G;

    /* renamed from: H */
    public WeakReference<C8899b> f16963H;

    /* renamed from: I */
    public int f16964I;

    /* renamed from: y */
    public C8912w f16967y;

    /* renamed from: z */
    public InterfaceC8937i<C8897o> f16968z;

    /* renamed from: w */
    public final boolean f16965w = true;

    /* renamed from: x */
    public final float f16966x = -1.0f;

    /* renamed from: B */
    public final long f16957B = 1500;

    /* renamed from: C */
    public final float f16958C = -1.0f;

    /* renamed from: D */
    public int f16959D = -1;

    /* renamed from: E */
    public final int f16960E = -1;

    /* renamed from: com.kongzue.dialogx.dialogs.o$a */
    /* loaded from: classes3.dex */
    public class RunnableC8898a implements Runnable {
        public RunnableC8898a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C8897o c8897o = C8897o.this;
            if (c8897o.m2904F() != null) {
                c8897o.m2904F().m2892d();
            }
        }
    }

    /* renamed from: com.kongzue.dialogx.dialogs.o$b */
    /* loaded from: classes3.dex */
    public class C8899b {

        /* renamed from: a */
        public ArrayList f16970a;

        /* renamed from: b */
        public DialogXBaseRelativeLayout f16971b;

        /* renamed from: c */
        public MaxRelativeLayout f16972c;

        /* renamed from: d */
        public RelativeLayout f16973d;

        /* renamed from: e */
        public C8955b f16974e;

        /* renamed from: f */
        public RelativeLayout f16975f;

        /* renamed from: g */
        public TextView f16976g;

        /* renamed from: h */
        public final int f16977h = R.layout.layout_dialogx_wait;

        /* renamed from: i */
        public float f16978i;

        /* renamed from: com.kongzue.dialogx.dialogs.o$b$a */
        /* loaded from: classes3.dex */
        public class C8900a extends ViewOutlineProvider {
            public C8900a() {
            }

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), C8897o.this.f16966x);
            }
        }

        /* renamed from: com.kongzue.dialogx.dialogs.o$b$b */
        /* loaded from: classes3.dex */
        public class View$OnClickListenerC8901b implements View.OnClickListener {
            public View$OnClickListenerC8901b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8899b c8899b = C8899b.this;
                C8897o.this.getClass();
                c8899b.m2895a(view);
            }
        }

        /* renamed from: com.kongzue.dialogx.dialogs.o$b$c */
        /* loaded from: classes3.dex */
        public class RunnableC8902c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ View f16982a;

            /* renamed from: com.kongzue.dialogx.dialogs.o$b$c$a */
            /* loaded from: classes3.dex */
            public class RunnableC8903a implements Runnable {
                public RunnableC8903a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC8902c runnableC8902c = RunnableC8902c.this;
                    DialogXBaseRelativeLayout dialogXBaseRelativeLayout = C8899b.this.f16971b;
                    if (dialogXBaseRelativeLayout != null) {
                        dialogXBaseRelativeLayout.setVisibility(8);
                    }
                    BaseDialog.m2878d(C8897o.this.m2902H());
                }
            }

            public RunnableC8902c(View view) {
                this.f16982a = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                View view = this.f16982a;
                if (view != null) {
                    view.setEnabled(false);
                }
                C8899b c8899b = C8899b.this;
                C8897o c8897o = C8897o.this;
                if (c8897o.f16967y == null) {
                    c8897o.f16967y = new C8912w(c8899b);
                }
                c8897o.f16967y.m2891a(c8897o);
                BaseDialog.m2885A(new RunnableC8903a(), c8899b.m2894b(null));
            }
        }

        public C8899b() {
        }

        /* renamed from: a */
        public final void m2895a(View view) {
            if (this.f16971b == null) {
                return;
            }
            C8897o c8897o = C8897o.this;
            if (c8897o.m2871k() != null && !c8897o.f17027p) {
                c8897o.f17027p = true;
                this.f16971b.post(new RunnableC8902c(view));
            }
        }

        /* renamed from: b */
        public final long m2894b(@Nullable Animation animation) {
            long j;
            if (animation == null && this.f16972c.getAnimation() != null) {
                animation = this.f16972c.getAnimation();
            }
            if (animation != null && animation.getDuration() != 0) {
                j = animation.getDuration();
            } else {
                j = 300;
            }
            long j2 = C8897o.this.f17025n;
            if (j2 != -1) {
                return j2;
            }
            return j;
        }

        /* renamed from: c */
        public final void m2893c() {
            int i;
            int intValue;
            C8897o c8897o = C8897o.this;
            c8897o.getClass();
            View m2880b = BaseDialog.m2880b(this.f16977h);
            if (m2880b == null) {
                return;
            }
            c8897o.f16962G = new WeakReference<>(m2880b);
            this.f16971b = (DialogXBaseRelativeLayout) m2880b.findViewById(R.id.box_root);
            this.f16972c = (MaxRelativeLayout) m2880b.findViewById(R.id.bkg);
            this.f16973d = (RelativeLayout) m2880b.findViewById(R.id.box_progress);
            C8941a c8941a = c8897o.f17020i;
            c8941a.getClass();
            Activity m2871k = c8897o.m2871k();
            c8897o.mo2862t();
            C8955b c8955b = new C8955b(m2871k);
            this.f16974e = c8955b;
            this.f16973d.addView(c8955b, new RelativeLayout.LayoutParams(-1, -1));
            this.f16975f = (RelativeLayout) m2880b.findViewById(R.id.box_customView);
            this.f16976g = (TextView) m2880b.findViewById(R.id.txt_info);
            this.f16970a = BaseDialog.m2876f(m2880b);
            C8941a c8941a2 = C8877a.f16910a;
            if (c8897o.f17023l == -1) {
                c8897o.f17023l = -1;
            }
            this.f16970a = BaseDialog.m2876f(c8897o.f16962G.get());
            boolean mo2862t = c8897o.mo2862t();
            int i2 = R.color.dialogxWaitBkgDark;
            if (mo2862t) {
                i = R.color.dialogxWaitBkgDark;
            } else {
                i = R.color.dialogxWaitBkgLight;
            }
            Integer valueOf = Integer.valueOf(c8897o.m2875g(i));
            Float valueOf2 = Float.valueOf((int) ((c8897o.m2869m().getDisplayMetrics().density * 15.0f) + 0.5f));
            c8941a.getClass();
            c8941a.getClass();
            Float valueOf3 = Float.valueOf(-1);
            if (valueOf3.floatValue() <= 0.0f) {
                BaseDialog.m2860v("styleValue=" + valueOf3 + "<=0 ");
                StringBuilder sb = new StringBuilder("return defaultValue=");
                sb.append(valueOf2);
                BaseDialog.m2860v(sb.toString());
            } else {
                BaseDialog.m2860v("return styleValue=" + valueOf3);
                valueOf2 = valueOf3;
            }
            c8941a.getClass();
            c8897o.mo2862t();
            Integer num = 0;
            if (!c8897o.mo2862t()) {
                i2 = R.color.dialogxWaitBkgLight;
            }
            Integer valueOf4 = Integer.valueOf(i2);
            if (num.intValue() <= 0) {
                num = valueOf4;
            }
            if (num == null) {
                intValue = valueOf.intValue();
            } else {
                intValue = num.intValue();
            }
            Integer valueOf5 = Integer.valueOf(c8897o.m2875g(intValue));
            ArrayList arrayList = this.f16970a;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC8931c interfaceC8931c = (InterfaceC8931c) ((View) it.next());
                    interfaceC8931c.m2855a();
                    interfaceC8931c.m2854b();
                }
            } else {
                GradientDrawable gradientDrawable = (GradientDrawable) c8897o.m2869m().getDrawable(R.drawable.rect_dialogx_material_wait_bkg);
                gradientDrawable.setColor(valueOf5.intValue());
                gradientDrawable.setCornerRadius(valueOf2.floatValue());
                this.f16972c.setBackground(gradientDrawable);
            }
            this.f16971b.setClickable(true);
            DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f16971b;
            C8897o m2900J = C8897o.m2900J();
            dialogXBaseRelativeLayout.f17061a = m2900J;
            if (m2900J != null && m2900J.f17015d != 1) {
                dialogXBaseRelativeLayout.setFitsSystemWindows(true);
                dialogXBaseRelativeLayout.m2840d(dialogXBaseRelativeLayout.getRootWindowInsets());
            }
            this.f16971b.f17065e = new C8906r(this);
            int i3 = c8897o.f16964I;
            if (i3 != 0 && i3 != 1) {
                C8955b c8955b2 = this.f16974e;
                c8955b2.f17098B = true;
                c8955b2.postDelayed(new RunnableC8908s(this), 100L);
            }
            this.f16971b.f17066f = new C8909t(this);
            WeakReference<C8899b> weakReference = c8897o.f16963H;
            if (weakReference != null && weakReference.get() != this) {
                c8897o.f16963H = new WeakReference<>(this);
            }
            m2892d();
        }

        /* renamed from: d */
        public final void m2892d() {
            int i;
            View$OnClickListenerC8901b view$OnClickListenerC8901b;
            ArrayList arrayList;
            if (this.f16971b != null) {
                C8897o c8897o = C8897o.this;
                if (c8897o.m2871k() != null) {
                    DialogXBaseRelativeLayout dialogXBaseRelativeLayout = this.f16971b;
                    int[] iArr = c8897o.f17026o;
                    boolean z = false;
                    int i2 = iArr[0];
                    int i3 = iArr[1];
                    int i4 = iArr[2];
                    int i5 = iArr[3];
                    int[] iArr2 = dialogXBaseRelativeLayout.f17075o;
                    iArr2[0] = i2;
                    iArr2[1] = i3;
                    iArr2[2] = i4;
                    iArr2[3] = i5;
                    MaxRelativeLayout maxRelativeLayout = this.f16972c;
                    C8941a c8941a = C8877a.f16910a;
                    maxRelativeLayout.getClass();
                    this.f16972c.getClass();
                    this.f16972c.setMinWidth(0);
                    this.f16972c.setMinHeight(0);
                    if (c8897o.f17023l != -1 && (arrayList = this.f16970a) != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            c8897o.m2869m().getColor(c8897o.f17023l);
                            ((InterfaceC8931c) ((View) it.next())).m2855a();
                        }
                    }
                    C8941a c8941a2 = c8897o.f17020i;
                    c8941a2.getClass();
                    c8941a2.getClass();
                    boolean mo2862t = c8897o.mo2862t();
                    int i6 = R.color.white;
                    if (mo2862t) {
                        i = R.color.white;
                    } else {
                        i = R.color.black;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (!c8897o.mo2862t()) {
                        i6 = R.color.black;
                    }
                    Integer valueOf2 = Integer.valueOf(i6);
                    if (valueOf.intValue() <= 0) {
                        valueOf = valueOf2;
                    }
                    int intValue = valueOf.intValue();
                    this.f16976g.setTextColor(c8897o.m2869m().getColor(intValue));
                    this.f16974e.m2830e(c8897o.m2869m().getColor(intValue));
                    C8941a c8941a3 = C8877a.f16910a;
                    float f = c8897o.f16958C;
                    if (f >= 0.0f && f <= 1.0f && this.f16978i != f) {
                        this.f16974e.m2831d(f);
                        this.f16978i = f;
                    }
                    if (c8897o.f16966x > -1.0f) {
                        this.f16972c.setOutlineProvider(new C8900a());
                        this.f16972c.setClipToOutline(true);
                        ArrayList arrayList2 = this.f16970a;
                        if (arrayList2 != null) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((InterfaceC8931c) ((View) it2.next())).m2854b();
                            }
                        }
                    }
                    BaseDialog.m2882D(this.f16976g, c8897o.f16956A);
                    int i7 = c8897o.f16960E;
                    if (i7 != -1) {
                        this.f16971b.setBackgroundColor(i7);
                    }
                    this.f16975f.setVisibility(8);
                    this.f16973d.setVisibility(0);
                    if (c8897o.f16965w) {
                        int i8 = c8897o.f16961F;
                        if (i8 != 0) {
                            if (i8 == 1) {
                                z = true;
                            }
                        } else {
                            C8941a c8941a4 = C8877a.f16910a;
                        }
                        DialogXBaseRelativeLayout dialogXBaseRelativeLayout2 = this.f16971b;
                        if (z) {
                            view$OnClickListenerC8901b = new View$OnClickListenerC8901b();
                        } else {
                            view$OnClickListenerC8901b = null;
                        }
                        dialogXBaseRelativeLayout2.setOnClickListener(view$OnClickListenerC8901b);
                        return;
                    }
                    this.f16971b.setClickable(false);
                }
            }
        }
    }

    public C8897o() {
        C8941a c8941a = C8877a.f16910a;
        this.f17018g = false;
    }

    /* renamed from: E */
    public static void m2905E() {
        C8897o m2900J = m2900J();
        m2900J.f17019h = false;
        BaseDialog.m2856z(new RunnableC8904p(m2900J));
    }

    /* renamed from: G */
    public static C8897o m2903G(Activity activity) {
        for (BaseDialog baseDialog : BaseDialog.m2867o()) {
            if ((baseDialog instanceof C8897o) && baseDialog.f17019h && baseDialog.m2871k() == activity) {
                return (C8897o) baseDialog;
            }
        }
        return null;
    }

    /* renamed from: I */
    public static C8897o m2901I() {
        WeakReference<C8897o> weakReference = new WeakReference<>(new C8897o());
        f16955J = weakReference;
        return weakReference.get();
    }

    /* renamed from: J */
    public static C8897o m2900J() {
        for (BaseDialog baseDialog : BaseDialog.m2867o()) {
            if ((baseDialog instanceof C8897o) && baseDialog.f17019h && baseDialog.m2871k() == BaseDialog.m2866p()) {
                return (C8897o) baseDialog;
            }
        }
        WeakReference<C8897o> weakReference = f16955J;
        if (weakReference != null && weakReference.get() != null) {
            return f16955J.get();
        }
        return m2901I();
    }

    /* renamed from: M */
    public static C8897o m2897M(AbstractActivityC9024f abstractActivityC9024f, String str) {
        WeakReference<C8897o> weakReference;
        boolean z;
        C8897o m2901I;
        if ((BaseDialog.m2866p() != null && m2903G(abstractActivityC9024f) != null) || ((weakReference = f16955J) != null && weakReference.get() != null && f16955J.get().m2871k() != null && f16955J.get().m2871k() == abstractActivityC9024f && f16955J.get().f17019h)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m2901I();
        }
        Iterator<BaseDialog> it = BaseDialog.m2867o().iterator();
        while (true) {
            if (it.hasNext()) {
                BaseDialog next = it.next();
                if ((next instanceof C8897o) && next.f17019h && next.m2871k() == abstractActivityC9024f) {
                    m2901I = (C8897o) next;
                    break;
                }
            } else {
                m2901I = m2901I();
                break;
            }
        }
        m2901I.m2898L(str);
        if (z) {
            if (abstractActivityC9024f == null) {
                m2901I.m2881a();
                BaseDialog.m2856z(new RunnableC8895m(m2901I));
            } else {
                m2901I.m2881a();
                abstractActivityC9024f.runOnUiThread(new RunnableC8896n(m2901I, abstractActivityC9024f));
            }
        }
        return m2901I;
    }

    /* renamed from: N */
    public static C8897o m2896N(String str) {
        WeakReference<C8897o> weakReference;
        boolean z;
        if ((BaseDialog.m2866p() != null && m2903G(BaseDialog.m2866p()) != null) || ((weakReference = f16955J) != null && weakReference.get() != null && f16955J.get().m2871k() != null && f16955J.get().m2871k() == BaseDialog.m2866p() && f16955J.get().f17019h)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            m2901I();
        }
        m2900J().m2898L(str);
        C8897o m2900J = m2900J();
        if (z) {
            m2900J.m2881a();
            BaseDialog.m2856z(new RunnableC8895m(m2900J));
        } else {
            m2900J.m2899K();
        }
        return m2900J();
    }

    /* renamed from: F */
    public final C8899b m2904F() {
        WeakReference<C8899b> weakReference = this.f16963H;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: H */
    public final View m2902H() {
        WeakReference<View> weakReference = this.f16962G;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: K */
    public final void m2899K() {
        if (m2904F() == null) {
            return;
        }
        BaseDialog.m2856z(new RunnableC8898a());
    }

    /* renamed from: L */
    public final void m2898L(String str) {
        this.f16956A = str;
        if (this.f16964I != 1) {
            this.f16959D = C0511i.m12337b(1);
            this.f16964I = 1;
            if (m2904F() != null) {
                C8899b m2904F = m2904F();
                m2904F.getClass();
                BaseDialog.m2856z(new RunnableC8913x(m2904F, 1));
            }
        }
        m2899K();
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    /* renamed from: c */
    public final String mo2879c() {
        return C8897o.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    @Override // com.kongzue.dialogx.interfaces.BaseDialog
    /* renamed from: t */
    public final boolean mo2862t() {
        C8941a c8941a = C8877a.f16910a;
        return super.mo2862t();
    }
}
