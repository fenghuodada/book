package com.qmuiteam.qmui.arch;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.AbstractC0050l;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.p003os.C0740h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.C1469h0;
import androidx.lifecycle.C1478j0;
import androidx.lifecycle.C1489r;
import androidx.lifecycle.InterfaceC1459f;
import androidx.lifecycle.InterfaceC1480k0;
import androidx.lifecycle.viewmodel.AbstractC1497a;
import com.ambrose.overwall.R;
import com.ambrose.overwall.p006ui.AbstractC2518d;
import com.qmuiteam.qmui.arch.C9037l;
import com.qmuiteam.qmui.arch.C9045n;
import com.qmuiteam.qmui.arch.C9048p;
import com.qmuiteam.qmui.arch.annotation.LatestVisitRecord;
import com.qmuiteam.qmui.arch.effect.AbstractC9023c;
import com.qmuiteam.qmui.arch.effect.QMUIFragmentEffectRegistry;
import com.qmuiteam.qmui.arch.record.C9050a;
import com.qmuiteam.qmui.arch.record.C9052c;
import com.qmuiteam.qmui.arch.record.C9053d;
import com.qmuiteam.qmui.arch.record.InterfaceC9051b;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.qmuiteam.qmui.arch.b */
/* loaded from: classes3.dex */
public abstract class AbstractC9008b extends Fragment {

    /* renamed from: p */
    public static final C9016g f17201p = new C9016g(R.animator.slide_in_right, R.animator.slide_out_left, R.animator.slide_in_left, R.animator.slide_out_right, R.anim.slide_in_left, R.anim.slide_out_right);

    /* renamed from: q */
    public static final C9016g f17202q = new C9016g(R.animator.scale_enter, R.animator.slide_still, R.animator.slide_still, R.animator.scale_exit, R.anim.slide_still, R.anim.scale_exit);

    /* renamed from: r */
    public static boolean f17203r = false;

    /* renamed from: s */
    public static final AtomicInteger f17204s = new AtomicInteger(1);

    /* renamed from: a */
    public View f17205a;

    /* renamed from: b */
    public View f17206b;

    /* renamed from: c */
    public C9037l f17207c;

    /* renamed from: d */
    public boolean f17208d;

    /* renamed from: e */
    public C9044m f17209e;

    /* renamed from: f */
    public C9045n f17210f;

    /* renamed from: g */
    public int f17211g;

    /* renamed from: h */
    public final C1489r<Boolean> f17212h;

    /* renamed from: i */
    public boolean f17213i;

    /* renamed from: j */
    public ArrayList<Runnable> f17214j;

    /* renamed from: k */
    public RunnableC9009a f17215k;

    /* renamed from: l */
    public QMUIFragmentEffectRegistry f17216l;

    /* renamed from: m */
    public OnBackPressedDispatcher f17217m;

    /* renamed from: n */
    public final C9010b f17218n;

    /* renamed from: o */
    public final C9013e f17219o;

    /* renamed from: com.qmuiteam.qmui.arch.b$a */
    /* loaded from: classes3.dex */
    public class RunnableC9009a implements Runnable {
        public RunnableC9009a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<Runnable> arrayList;
            AbstractC9008b abstractC9008b = AbstractC9008b.this;
            if (abstractC9008b.isResumed() && (arrayList = abstractC9008b.f17214j) != null) {
                if (!arrayList.isEmpty()) {
                    Iterator<Runnable> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().run();
                    }
                }
                abstractC9008b.f17214j = null;
            }
        }
    }

    /* renamed from: com.qmuiteam.qmui.arch.b$b */
    /* loaded from: classes3.dex */
    public class C9010b extends AbstractC0050l {
        public C9010b() {
            super(true);
        }

        @Override // androidx.activity.AbstractC0050l
        public final void handleOnBackPressed() {
            boolean z = AbstractC9008b.f17203r;
            AbstractC9008b abstractC9008b = AbstractC9008b.this;
            if (z) {
                abstractC9008b.m2805t();
            } else {
                abstractC9008b.mo2808p();
            }
        }
    }

    /* renamed from: com.qmuiteam.qmui.arch.b$c */
    /* loaded from: classes3.dex */
    public class C9011c extends AbstractC9023c {
        public C9011c(AbstractC9008b abstractC9008b) {
        }
    }

    /* renamed from: com.qmuiteam.qmui.arch.b$d */
    /* loaded from: classes3.dex */
    public class C9012d implements C9037l.InterfaceC9040c {
        public C9012d() {
        }
    }

    /* renamed from: com.qmuiteam.qmui.arch.b$e */
    /* loaded from: classes3.dex */
    public class C9013e implements C9037l.InterfaceC9041d {

        /* renamed from: a */
        public AbstractC9008b f17223a = null;

        /* renamed from: com.qmuiteam.qmui.arch.b$e$a */
        /* loaded from: classes3.dex */
        public class C9014a implements C9048p.InterfaceC9049a {

            /* renamed from: a */
            public final /* synthetic */ FragmentContainerView f17225a;

            /* renamed from: b */
            public final /* synthetic */ int f17226b;

            public C9014a(FragmentContainerView fragmentContainerView, int i, int i2) {
                this.f17225a = fragmentContainerView;
                this.f17226b = i;
            }

            @Override // com.qmuiteam.qmui.arch.C9048p.InterfaceC9049a
            /* renamed from: a */
            public final String mo2765a() {
                return null;
            }

            @Override // com.qmuiteam.qmui.arch.C9048p.InterfaceC9049a
            /* renamed from: b */
            public final boolean mo2764b() {
                return false;
            }

            @Override // com.qmuiteam.qmui.arch.C9048p.InterfaceC9049a
            /* renamed from: c */
            public final boolean mo2763c(Object obj) {
                Field m2766b;
                int i = this.f17226b;
                FragmentContainerView fragmentContainerView = this.f17225a;
                C9013e c9013e = C9013e.this;
                Field m2766b2 = C9048p.m2766b(obj, "mCmd", "cmd");
                if (m2766b2 == null) {
                    return false;
                }
                try {
                    m2766b2.setAccessible(true);
                    if (((Integer) m2766b2.get(obj)).intValue() == 3 && (m2766b = C9048p.m2766b(obj, "mFragment", "fragment")) != null) {
                        m2766b.setAccessible(true);
                        Object obj2 = m2766b.get(obj);
                        if (obj2 instanceof AbstractC9008b) {
                            AbstractC9008b abstractC9008b = (AbstractC9008b) obj2;
                            c9013e.f17223a = abstractC9008b;
                            AbstractC9008b abstractC9008b2 = AbstractC9008b.this;
                            abstractC9008b.f17208d = true;
                            View onCreateView = abstractC9008b.onCreateView(LayoutInflater.from(abstractC9008b2.getContext()), fragmentContainerView, null);
                            c9013e.f17223a.f17208d = false;
                            if (onCreateView != null) {
                                if (fragmentContainerView != null) {
                                    onCreateView.setTag(R.id.qmui_arch_swipe_layout_in_back, "swipe_back_view");
                                    fragmentContainerView.addView(onCreateView, 0);
                                }
                                C9013e.m2802e(c9013e.f17223a, onCreateView);
                                C9037l.m2778h(onCreateView, i, Math.abs(abstractC9008b2.mo2814i(onCreateView.getContext(), i)));
                            }
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                return false;
            }
        }

        public C9013e() {
        }

        /* renamed from: e */
        public static void m2802e(Fragment fragment, View view) throws IllegalAccessException {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroup viewGroup2 = null;
                int i = 0;
                for (Fragment fragment2 : fragment.getChildFragmentManager().getFragments()) {
                    if (fragment2 instanceof AbstractC9008b) {
                        AbstractC9008b abstractC9008b = (AbstractC9008b) fragment2;
                        try {
                            Field declaredField = Fragment.class.getDeclaredField("mContainerId");
                            declaredField.setAccessible(true);
                            int i2 = declaredField.getInt(abstractC9008b);
                            if (i2 != 0) {
                                if (i != i2) {
                                    viewGroup2 = (ViewGroup) viewGroup.findViewById(i2);
                                    i = i2;
                                }
                                if (viewGroup2 != null) {
                                    abstractC9008b.f17208d = true;
                                    View onCreateView = fragment2.onCreateView(LayoutInflater.from(viewGroup2.getContext()), viewGroup2, null);
                                    abstractC9008b.f17208d = false;
                                    if (onCreateView != null) {
                                        onCreateView.setTag(R.id.qmui_arch_swipe_layout_in_back, "swipe_back_view");
                                        viewGroup2.addView(onCreateView, -1);
                                    }
                                    m2802e(fragment2, onCreateView);
                                }
                            }
                        } catch (NoSuchFieldException unused) {
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public static void m2801f(ViewGroup viewGroup, C9019e c9019e) {
            if (viewGroup == null) {
                return;
            }
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    return;
                }
                View childAt = viewGroup.getChildAt(childCount);
                if ("swipe_back_view".equals(childAt.getTag(R.id.qmui_arch_swipe_layout_in_back))) {
                    if (c9019e != null) {
                        c9019e.apply(childAt);
                    }
                    childAt.setTranslationY(0.0f);
                    childAt.setTranslationX(0.0f);
                    viewGroup.removeView(childAt);
                }
            }
        }

        @Override // com.qmuiteam.qmui.arch.C9037l.InterfaceC9041d
        /* renamed from: a */
        public final void mo2776a(int i, float f, int i2) {
            float max = Math.max(0.0f, Math.min(1.0f, f));
            AbstractC9008b abstractC9008b = AbstractC9008b.this;
            InterfaceC9030g m2812l = abstractC9008b.m2812l(false);
            if (m2812l != null && m2812l.mo2793c() != null) {
                FragmentContainerView mo2793c = m2812l.mo2793c();
                int abs = (int) ((1.0f - max) * Math.abs(abstractC9008b.mo2814i(mo2793c.getContext(), i2)));
                int childCount = mo2793c.getChildCount();
                while (true) {
                    childCount--;
                    if (childCount < 0) {
                        break;
                    }
                    View childAt = mo2793c.getChildAt(childCount);
                    if ("swipe_back_view".equals(childAt.getTag(R.id.qmui_arch_swipe_layout_in_back))) {
                        C9037l.m2778h(childAt, i2, abs);
                    }
                }
                C9045n c9045n = abstractC9008b.f17210f;
                if (c9045n != null) {
                    C9037l.m2778h(c9045n, i2, abs);
                }
            }
        }

        @Override // com.qmuiteam.qmui.arch.C9037l.InterfaceC9041d
        /* renamed from: b */
        public final void mo2775b() {
            C9016g c9016g = AbstractC9008b.f17201p;
            Log.i("b", "SwipeListener:onEdgeTouch:onScrollOverThreshold");
        }

        @Override // com.qmuiteam.qmui.arch.C9037l.InterfaceC9041d
        /* renamed from: c */
        public final void mo2774c(float f, int i) {
            FragmentActivity activity;
            int i2;
            C9016g c9016g = AbstractC9008b.f17201p;
            Log.i("b", "SwipeListener:onScrollStateChange: state = " + i + " ;scrollPercent = " + f);
            AbstractC9008b abstractC9008b = AbstractC9008b.this;
            InterfaceC9030g m2812l = abstractC9008b.m2812l(false);
            if (m2812l != null && m2812l.mo2793c() != null) {
                FragmentContainerView mo2793c = m2812l.mo2793c();
                boolean z = true;
                abstractC9008b.getClass();
                if (i == 0) {
                    C9045n c9045n = abstractC9008b.f17210f;
                    if (c9045n != null) {
                        if (f <= 0.0f) {
                            ArrayList<C9045n.C9046a> arrayList = c9045n.f17291a;
                            if (arrayList != null) {
                                arrayList.clear();
                            }
                            c9045n.f17291a = null;
                            c9045n.f17292b = false;
                            abstractC9008b.f17210f = null;
                        } else if (f >= 1.0f && (activity = abstractC9008b.getActivity()) != null) {
                            AbstractC9008b.f17203r = true;
                            ArrayList<C9045n.C9046a> arrayList2 = abstractC9008b.f17210f.f17291a;
                            if (arrayList2 == null || arrayList2.size() <= 1) {
                                z = false;
                            }
                            if (z) {
                                i2 = R.anim.swipe_back_exit_still;
                            } else {
                                i2 = R.anim.swipe_back_exit;
                            }
                            abstractC9008b.m2804u();
                            activity.overridePendingTransition(R.anim.swipe_back_enter, i2);
                            AbstractC9008b.f17203r = false;
                        }
                    } else if (f <= 0.0f) {
                        m2801f(mo2793c, new C9019e(this));
                        this.f17223a = null;
                    } else if (f >= 1.0f) {
                        m2801f(mo2793c, new C9019e(this));
                        this.f17223a = null;
                        C9048p.m2767a(m2812l.mo2791e(), new C9018d());
                        AbstractC9008b.f17203r = true;
                        abstractC9008b.m2804u();
                        AbstractC9008b.f17203r = false;
                    }
                }
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(22:19|(2:20|21)|(18:23|24|25|(4:27|(1:29)(2:33|(1:35))|30|31)|36|(1:38)(1:130)|39|(1:41)|42|(2:44|(1:66)(2:47|(9:49|50|51|(3:53|(2:55|56)(1:58)|57)|59|60|61|62|63)))|67|68|69|(3:71|(1:(2:73|(2:76|77)(1:75))(2:101|102))|(3:79|(4:81|(1:83)(1:98)|(3:90|(1:92)|(2:94|95)(2:96|97))(1:88)|89)|100))|103|(4:107|(1:109)|110|111)|62|63)|133|36|(0)(0)|39|(0)|42|(0)|67|68|69|(0)|103|(1:105)|107|(0)|110|111|62|63) */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x025c, code lost:
            r2 = r10.findViewById(16908290);
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x0265, code lost:
            if (r6.f17291a == null) goto L128;
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0267, code lost:
            r6.f17291a = new java.util.ArrayList<>();
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x026e, code lost:
            r6.f17291a.add(new com.qmuiteam.qmui.arch.C9045n.C9046a(r2, null, true));
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x027a, code lost:
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x027b, code lost:
            r3 = r6.f17291a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x027d, code lost:
            if (r3 == null) goto L116;
         */
        /* JADX WARN: Code restructure failed: missing block: B:110:0x0285, code lost:
            r3 = r10.findViewById(16908290);
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x028e, code lost:
            if (r6.f17291a == null) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:112:0x0290, code lost:
            r6.f17291a = new java.util.ArrayList<>();
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x0297, code lost:
            r4 = r6.f17291a;
            r7 = new com.qmuiteam.qmui.arch.C9045n.C9046a(r3, null, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0251, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0252, code lost:
            r2 = r6.f17291a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x0254, code lost:
            if (r2 == null) goto L126;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x018f A[Catch: all -> 0x0251, Exception -> 0x027b, TryCatch #5 {Exception -> 0x027b, all -> 0x0251, blocks: (B:61:0x0167, B:63:0x018f, B:65:0x01be, B:67:0x01d0, B:71:0x01d9, B:73:0x01e1, B:78:0x01f8, B:81:0x01fe, B:83:0x0206, B:85:0x020f, B:86:0x021a, B:68:0x01d3), top: B:128:0x0167 }] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0240  */
        @Override // com.qmuiteam.qmui.arch.C9037l.InterfaceC9041d
        @android.annotation.SuppressLint({"PrivateApi"})
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo2773d(int r18, int r19) {
            /*
                Method dump skipped, instructions count: 705
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.arch.AbstractC9008b.C9013e.mo2773d(int, int):void");
        }
    }

    /* renamed from: com.qmuiteam.qmui.arch.b$f */
    /* loaded from: classes3.dex */
    public class C9015f extends AnimatorListenerAdapter {
        public C9015f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            AbstractC9008b abstractC9008b = AbstractC9008b.this;
            abstractC9008b.f17213i = true;
            abstractC9008b.f17211g = 1;
            abstractC9008b.f17212h.mo10510i(Boolean.FALSE);
            abstractC9008b.m2809o();
            if (abstractC9008b.f17213i) {
                return;
            }
            throw new RuntimeException(abstractC9008b.getClass().getSimpleName().concat(" did not call through to super.onEnterAnimationEnd(Animation)"));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            AbstractC9008b abstractC9008b = AbstractC9008b.this;
            abstractC9008b.f17213i = true;
            abstractC9008b.f17211g = 0;
            abstractC9008b.f17212h.mo10510i(Boolean.TRUE);
            if (abstractC9008b.f17213i) {
                return;
            }
            throw new RuntimeException(abstractC9008b.getClass().getSimpleName().concat(" did not call through to super.onEnterAnimationStart(Animation)"));
        }
    }

    /* renamed from: com.qmuiteam.qmui.arch.b$g */
    /* loaded from: classes3.dex */
    public static final class C9016g {

        /* renamed from: a */
        public final int f17229a;

        /* renamed from: b */
        public final int f17230b;

        /* renamed from: c */
        public final int f17231c;

        /* renamed from: d */
        public final int f17232d;

        /* renamed from: e */
        public final int f17233e;

        /* renamed from: f */
        public final int f17234f;

        public C9016g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f17229a = i;
            this.f17230b = i2;
            this.f17231c = i3;
            this.f17232d = i4;
            this.f17233e = i5;
            this.f17234f = i6;
        }
    }

    public AbstractC9008b() {
        f17204s.getAndIncrement();
        this.f17208d = false;
        this.f17211g = -1;
        this.f17212h = new C1489r<>(Boolean.FALSE);
        this.f17213i = true;
        this.f17215k = new RunnableC9009a();
        this.f17218n = new C9010b();
        this.f17219o = new C9013e();
    }

    @Deprecated
    /* renamed from: h */
    public int mo2815h() {
        return 0;
    }

    /* renamed from: i */
    public int mo2814i(Context context, int i) {
        return mo2815h();
    }

    /* renamed from: j */
    public final void m2813j() {
        C9010b c9010b = this.f17218n;
        c9010b.setEnabled(false);
        this.f17217m.m13062b();
        c9010b.setEnabled(true);
    }

    /* renamed from: k */
    public void mo2789k() {
        InterfaceC9030g m2812l = m2812l(false);
        if (m2812l != null) {
            m2812l.mo2792d(false);
        }
    }

    @Nullable
    /* renamed from: l */
    public final InterfaceC9030g m2812l(boolean z) {
        for (Fragment parentFragment = z ? this : getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof InterfaceC9030g) {
                return (InterfaceC9030g) parentFragment;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof InterfaceC9030g) {
            return (InterfaceC9030g) activity;
        }
        return null;
    }

    /* renamed from: m */
    public final AbstractActivityC9024f m2811m() {
        return (AbstractActivityC9024f) getActivity();
    }

    /* renamed from: n */
    public final void m2810n(C9037l c9037l) {
        C9044m c9044m = this.f17209e;
        if (c9044m != null) {
            c9044m.f17290b.f17264c.remove(c9044m.f17289a);
        }
        if (c9037l.f17264c == null) {
            c9037l.f17264c = new ArrayList();
        }
        ArrayList arrayList = c9037l.f17264c;
        C9013e c9013e = this.f17219o;
        arrayList.add(c9013e);
        this.f17209e = new C9044m(c9037l, c9013e);
        c9037l.setOnInsetsHandler(new C9012d());
        if (this.f17208d) {
            c9037l.setTag(R.id.fragment_container_view_tag, this);
        }
    }

    /* renamed from: o */
    public final void m2809o() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NonNull Context context) {
        InterfaceC1480k0 owner;
        C1469h0.InterfaceC1471b interfaceC1471b;
        AbstractC1497a abstractC1497a;
        super.onAttach(context);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        this.f17217m = onBackPressedDispatcher;
        onBackPressedDispatcher.m13063a(this, this.f17218n);
        C9011c c9011c = new C9011c(this);
        if (getActivity() != null) {
            if (this.f17216l == null) {
                InterfaceC9030g m2812l = m2812l(false);
                if (m2812l != null) {
                    owner = m2812l.mo2794b();
                } else {
                    owner = requireActivity();
                }
                C10843j.m430f(owner, "owner");
                C1478j0 viewModelStore = owner.getViewModelStore();
                boolean z = owner instanceof InterfaceC1459f;
                if (z) {
                    interfaceC1471b = ((InterfaceC1459f) owner).getDefaultViewModelProviderFactory();
                } else {
                    if (C1469h0.C1472c.f3447a == null) {
                        C1469h0.C1472c.f3447a = new C1469h0.C1472c();
                    }
                    interfaceC1471b = C1469h0.C1472c.f3447a;
                    C10843j.m433c(interfaceC1471b);
                }
                if (z) {
                    abstractC1497a = ((InterfaceC1459f) owner).getDefaultViewModelCreationExtras();
                } else {
                    abstractC1497a = AbstractC1497a.C1498a.f3475b;
                }
                this.f17216l = (QMUIFragmentEffectRegistry) new C1469h0(viewModelStore, interfaceC1471b, abstractC1497a).m10545a(QMUIFragmentEffectRegistry.class);
            }
            this.f17216l.m2800a(this, c9011c);
            return;
        }
        throw new RuntimeException("Fragment(" + getClass().getSimpleName() + ") not attached to Activity.");
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        if (!z || i2 == 0) {
            return super.onCreateAnimator(i, z, i2);
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), i2);
        loadAnimator.addListener(new C9015f());
        return loadAnimator;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(@androidx.annotation.NonNull android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
        /*
            r0 = this;
            com.qmuiteam.qmui.arch.l r1 = r0.f17207c
            if (r1 == 0) goto L2f
            androidx.fragment.app.Fragment r1 = r0.getParentFragment()
            if (r1 == 0) goto L2f
            com.qmuiteam.qmui.arch.l r1 = r0.f17207c
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L1f
            com.qmuiteam.qmui.arch.l r1 = r0.f17207c
            android.view.ViewParent r1 = r1.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            com.qmuiteam.qmui.arch.l r2 = r0.f17207c
            r1.removeView(r2)
        L1f:
            com.qmuiteam.qmui.arch.l r1 = r0.f17207c
            android.view.ViewParent r1 = r1.getParent()
            if (r1 != 0) goto L2f
            com.qmuiteam.qmui.arch.l r1 = r0.f17207c
            r0.m2810n(r1)
            com.qmuiteam.qmui.arch.l r1 = r0.f17207c
            goto L5d
        L2f:
            android.view.View r1 = r0.f17206b
            if (r1 != 0) goto L3a
            android.view.View r1 = r0.mo2788q()
            r0.f17206b = r1
            goto L49
        L3a:
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == 0) goto L49
            android.view.ViewParent r2 = r1.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.removeView(r1)
        L49:
            com.qmuiteam.qmui.arch.c r2 = new com.qmuiteam.qmui.arch.c
            r2.<init>(r0)
            com.qmuiteam.qmui.arch.l r1 = com.qmuiteam.qmui.arch.C9037l.m2777i(r1, r2)
            r0.m2810n(r1)
            androidx.fragment.app.Fragment r2 = r0.getParentFragment()
            if (r2 == 0) goto L5d
            r0.f17207c = r1
        L5d:
            boolean r2 = r0.f17208d
            if (r2 != 0) goto L6e
            android.view.View r2 = r1.getContentView()
            r0.f17205a = r2
            r2 = 2131362353(0x7f0a0231, float:1.8344484E38)
            r3 = 0
            r1.setTag(r2, r3)
        L6e:
            r2 = 0
            r1.setFitsSystemWindows(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.arch.AbstractC9008b.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C9045n c9045n = this.f17210f;
        if (c9045n != null) {
            ArrayList<C9045n.C9046a> arrayList = c9045n.f17291a;
            if (arrayList != null) {
                arrayList.clear();
            }
            c9045n.f17291a = null;
            c9045n.f17292b = false;
            this.f17210f = null;
        }
        this.f17206b = null;
        this.f17215k = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view;
        super.onDestroyView();
        C9044m c9044m = this.f17209e;
        if (c9044m != null) {
            c9044m.f17290b.f17264c.remove(c9044m.f17289a);
            this.f17209e = null;
        }
        if (getParentFragment() == null && (view = this.f17206b) != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f17206b.getParent()).removeView(this.f17206b);
        }
        this.f17205a = null;
        this.f17211g = -1;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        boolean z;
        ArrayList<Runnable> arrayList;
        if (this.f17211g != 1) {
            this.f17211g = 1;
        }
        int i = 0;
        if (getParentFragment() != null && !(getParentFragment() instanceof C9033i)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            FragmentActivity activity = getActivity();
            if ((activity instanceof AbstractActivityC9024f) && !(this instanceof C9033i)) {
                LatestVisitRecord latestVisitRecord = (LatestVisitRecord) getClass().getAnnotation(LatestVisitRecord.class);
                if (latestVisitRecord != null && !latestVisitRecord.onlyForDebug()) {
                    if (activity.getClass().isAnnotationPresent(LatestVisitRecord.class)) {
                        C9031h m2797a = C9031h.m2797a(getContext());
                        int idByRecordClass = m2797a.f17251c.getIdByRecordClass(getClass());
                        if (idByRecordClass != -1) {
                            m2797a.f17252d.m2760a();
                            m2797a.f17253e.m2760a();
                            Fragment parentFragment = getParentFragment();
                            while (parentFragment instanceof C9033i) {
                                String m11849a = C0740h.m11849a("_qmui_nav", i, "_");
                                C9033i c9033i = (C9033i) parentFragment;
                                m2797a.f17253e.m2760a();
                                c9033i.getClass();
                                C9053d c9053d = m2797a.f17253e;
                                c9053d.getClass();
                                HashMap hashMap = new HashMap(c9053d.f17305a);
                                C9053d c9053d2 = m2797a.f17252d;
                                String m13053a = C0063d.m13053a(m11849a, ".class");
                                String name = c9033i.getClass().getName();
                                synchronized (c9053d2) {
                                    c9053d2.f17305a.put(m13053a, new C9052c(name));
                                }
                                for (String str : hashMap.keySet()) {
                                    m2797a.f17252d.f17305a.put(C0063d.m13053a(m11849a, str), (C9052c) hashMap.get(str));
                                }
                                parentFragment = parentFragment.getParentFragment();
                                i++;
                            }
                            InterfaceC9051b m2796b = m2797a.m2796b();
                            C9053d c9053d3 = m2797a.f17252d;
                            c9053d3.getClass();
                            HashMap hashMap2 = new HashMap(c9053d3.f17305a);
                            C9050a c9050a = (C9050a) m2796b;
                            SharedPreferences.Editor edit = c9050a.f17302a.edit();
                            edit.putInt("id_qmui_f_r", idByRecordClass);
                            c9050a.m2761b(edit, "a_f_", hashMap2);
                            edit.apply();
                            m2797a.f17252d.m2760a();
                            m2797a.f17253e.m2760a();
                        }
                    } else {
                        throw new RuntimeException(String.format("Can not perform LatestVisitRecord, %s must be annotated by LatestVisitRecord", activity.getClass().getSimpleName()));
                    }
                } else {
                    C9050a c9050a2 = (C9050a) C9031h.m2797a(getContext()).m2796b();
                    SharedPreferences.Editor edit2 = c9050a2.f17302a.edit();
                    edit2.remove("id_qmui_f_r");
                    c9050a2.m2762a(edit2, "a_f_");
                    edit2.apply();
                }
            }
        }
        mo2789k();
        super.onResume();
        if (this.f17205a != null && (arrayList = this.f17214j) != null && !arrayList.isEmpty()) {
            this.f17205a.post(this.f17215k);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f17205a.getTag(R.id.qmui_arch_reused_layout) == null) {
            this.f17205a.setTag(R.id.qmui_arch_reused_layout, Boolean.TRUE);
        }
    }

    /* renamed from: p */
    public void mo2808p() {
        m2805t();
    }

    /* renamed from: q */
    public abstract View mo2788q();

    /* renamed from: r */
    public C9016g mo2807r() {
        return f17201p;
    }

    /* renamed from: s */
    public Object mo2806s() {
        return null;
    }

    /* renamed from: t */
    public final void m2805t() {
        if (getParentFragment() != null) {
            m2813j();
            return;
        }
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof InterfaceC9030g) {
            InterfaceC9030g interfaceC9030g = (InterfaceC9030g) requireActivity;
            if (interfaceC9030g.mo2791e().getBackStackEntryCount() <= 1 && interfaceC9030g.mo2791e().getPrimaryNavigationFragment() != this) {
                C9016g mo2807r = mo2807r();
                C9035j c9035j = C9035j.f17257c;
                if (c9035j != null) {
                    if (c9035j.m2786a()) {
                        if (!f17203r) {
                            requireActivity.finishAfterTransition();
                        } else {
                            requireActivity.finish();
                        }
                        requireActivity.overridePendingTransition(mo2807r.f17233e, mo2807r.f17234f);
                        return;
                    }
                    Object mo2806s = mo2806s();
                    if (mo2806s != null) {
                        if (mo2806s instanceof AbstractC9008b) {
                            AbstractC9008b abstractC9008b = (AbstractC9008b) mo2806s;
                            boolean z = false;
                            if (isAdded() && !getParentFragmentManager().isStateSaved()) {
                                z = true;
                            }
                            if (z) {
                                InterfaceC9030g m2812l = m2812l(true);
                                if (m2812l == null) {
                                    Log.d("b", "Can not find the fragment container provider.");
                                    return;
                                }
                                C9016g mo2807r2 = abstractC9008b.mo2807r();
                                String simpleName = abstractC9008b.getClass().getSimpleName();
                                FragmentManager mo2791e = m2812l.mo2791e();
                                FragmentTransaction primaryNavigationFragment = mo2791e.beginTransaction().setCustomAnimations(mo2807r2.f17229a, mo2807r2.f17230b, mo2807r2.f17231c, mo2807r2.f17232d).setPrimaryNavigationFragment(null);
                                m2812l.mo2790f();
                                primaryNavigationFragment.replace(R.id.qmui_activity_fragment_container_id, abstractC9008b, simpleName).commit();
                                C9048p.m2767a(mo2791e, new C9047o(mo2807r2, abstractC9008b));
                                return;
                            }
                            return;
                        } else if (mo2806s instanceof Intent) {
                            startActivity((Intent) mo2806s);
                            requireActivity.overridePendingTransition(mo2807r.f17233e, mo2807r.f17234f);
                            requireActivity.finish();
                            return;
                        } else {
                            requireActivity.finish();
                            requireActivity.overridePendingTransition(mo2807r.f17233e, mo2807r.f17234f);
                            return;
                        }
                    }
                    if (!f17203r) {
                        requireActivity.finishAfterTransition();
                    } else {
                        requireActivity.finish();
                    }
                    requireActivity.overridePendingTransition(mo2807r.f17233e, mo2807r.f17234f);
                    return;
                }
                throw new IllegalAccessError("the QMUISwipeBackActivityManager is not initialized; please call QMUISwipeBackActivityManager.init(Application) in your application.");
            }
        }
        m2813j();
    }

    /* renamed from: u */
    public final void m2804u() {
        OnBackPressedDispatcher onBackPressedDispatcher = this.f17217m;
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.m13062b();
        }
    }

    /* renamed from: v */
    public final void m2803v(AbstractC2518d abstractC2518d) {
        boolean z = false;
        if (isAdded() && !getParentFragmentManager().isStateSaved()) {
            z = true;
        }
        if (!z) {
            return;
        }
        InterfaceC9030g m2812l = m2812l(true);
        if (m2812l == null) {
            Log.d("b", "Can not find the fragment container provider.");
            return;
        }
        C9016g mo2807r = abstractC2518d.mo2807r();
        String simpleName = abstractC2518d.getClass().getSimpleName();
        FragmentTransaction customAnimations = m2812l.mo2791e().beginTransaction().setPrimaryNavigationFragment(null).setCustomAnimations(mo2807r.f17229a, mo2807r.f17230b, mo2807r.f17231c, mo2807r.f17232d);
        m2812l.mo2790f();
        customAnimations.replace(R.id.qmui_activity_fragment_container_id, abstractC2518d, simpleName).addToBackStack(simpleName).commit();
    }
}
