package androidx.appcompat.app;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.C0107e0;
import androidx.appcompat.app.LayoutInflater$Factory2C0114h;
import androidx.appcompat.view.AbstractC0178a;
import androidx.appcompat.view.C0186f;
import androidx.appcompat.view.C0189g;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0309c;
import androidx.appcompat.widget.InterfaceC0412s0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0922g2;
import androidx.core.view.C0934i2;
import androidx.core.view.InterfaceC0955j2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.app.e0 */
/* loaded from: classes.dex */
public final class C0107e0 extends ActionBar implements ActionBarOverlayLayout.InterfaceC0242d {

    /* renamed from: a */
    public Context f255a;

    /* renamed from: b */
    public Context f256b;

    /* renamed from: c */
    public ActionBarOverlayLayout f257c;

    /* renamed from: d */
    public ActionBarContainer f258d;

    /* renamed from: e */
    public InterfaceC0412s0 f259e;

    /* renamed from: f */
    public ActionBarContextView f260f;

    /* renamed from: g */
    public final View f261g;

    /* renamed from: h */
    public boolean f262h;

    /* renamed from: i */
    public C0111d f263i;

    /* renamed from: j */
    public C0111d f264j;

    /* renamed from: k */
    public AbstractC0178a.InterfaceC0179a f265k;

    /* renamed from: l */
    public boolean f266l;

    /* renamed from: m */
    public final ArrayList<ActionBar.InterfaceC0081b> f267m;

    /* renamed from: n */
    public boolean f268n;

    /* renamed from: o */
    public int f269o;

    /* renamed from: p */
    public boolean f270p;

    /* renamed from: q */
    public boolean f271q;

    /* renamed from: r */
    public boolean f272r;

    /* renamed from: s */
    public boolean f273s;

    /* renamed from: t */
    public C0189g f274t;

    /* renamed from: u */
    public boolean f275u;

    /* renamed from: v */
    public boolean f276v;

    /* renamed from: w */
    public final C0108a f277w;

    /* renamed from: x */
    public final C0109b f278x;

    /* renamed from: y */
    public final C0110c f279y;

    /* renamed from: z */
    public static final AccelerateInterpolator f254z = new AccelerateInterpolator();

    /* renamed from: A */
    public static final DecelerateInterpolator f253A = new DecelerateInterpolator();

    /* renamed from: androidx.appcompat.app.e0$a */
    /* loaded from: classes.dex */
    public class C0108a extends C0934i2 {
        public C0108a() {
        }

        @Override // androidx.core.view.InterfaceC0928h2
        /* renamed from: c */
        public final void mo11463c() {
            View view;
            C0107e0 c0107e0 = C0107e0.this;
            if (c0107e0.f270p && (view = c0107e0.f261g) != null) {
                view.setTranslationY(0.0f);
                c0107e0.f258d.setTranslationY(0.0f);
            }
            c0107e0.f258d.setVisibility(8);
            c0107e0.f258d.setTransitioning(false);
            c0107e0.f274t = null;
            AbstractC0178a.InterfaceC0179a interfaceC0179a = c0107e0.f265k;
            if (interfaceC0179a != null) {
                interfaceC0179a.mo12880a(c0107e0.f264j);
                c0107e0.f264j = null;
                c0107e0.f265k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = c0107e0.f257c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0818h.m11722c(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e0$b */
    /* loaded from: classes.dex */
    public class C0109b extends C0934i2 {
        public C0109b() {
        }

        @Override // androidx.core.view.InterfaceC0928h2
        /* renamed from: c */
        public final void mo11463c() {
            C0107e0 c0107e0 = C0107e0.this;
            c0107e0.f274t = null;
            c0107e0.f258d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.e0$c */
    /* loaded from: classes.dex */
    public class C0110c implements InterfaceC0955j2 {
        public C0110c() {
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.app.e0$d */
    /* loaded from: classes.dex */
    public class C0111d extends AbstractC0178a implements C0210g.InterfaceC0211a {

        /* renamed from: c */
        public final Context f283c;

        /* renamed from: d */
        public final C0210g f284d;

        /* renamed from: e */
        public AbstractC0178a.InterfaceC0179a f285e;

        /* renamed from: f */
        public WeakReference<View> f286f;

        public C0111d(Context context, LayoutInflater$Factory2C0114h.C0119e c0119e) {
            this.f283c = context;
            this.f285e = c0119e;
            C0210g c0210g = new C0210g(context);
            c0210g.f696l = 1;
            this.f284d = c0210g;
            c0210g.f689e = this;
        }

        @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
        /* renamed from: a */
        public final boolean mo12747a(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
            AbstractC0178a.InterfaceC0179a interfaceC0179a = this.f285e;
            if (interfaceC0179a != null) {
                return interfaceC0179a.mo12878c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
        /* renamed from: b */
        public final void mo12746b(@NonNull C0210g c0210g) {
            if (this.f285e == null) {
                return;
            }
            mo12888i();
            C0309c c0309c = C0107e0.this.f260f.f1073d;
            if (c0309c != null) {
                c0309c.m12703l();
            }
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: c */
        public final void mo12894c() {
            C0107e0 c0107e0 = C0107e0.this;
            if (c0107e0.f263i != this) {
                return;
            }
            if (!(!c0107e0.f271q)) {
                c0107e0.f264j = this;
                c0107e0.f265k = this.f285e;
            } else {
                this.f285e.mo12880a(this);
            }
            this.f285e = null;
            c0107e0.m13013p(false);
            ActionBarContextView actionBarContextView = c0107e0.f260f;
            if (actionBarContextView.f804k == null) {
                actionBarContextView.m12804h();
            }
            c0107e0.f257c.setHideOnContentScrollEnabled(c0107e0.f276v);
            c0107e0.f263i = null;
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: d */
        public final View mo12893d() {
            WeakReference<View> weakReference = this.f286f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: e */
        public final C0210g mo12892e() {
            return this.f284d;
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: f */
        public final MenuInflater mo12891f() {
            return new C0186f(this.f283c);
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: g */
        public final CharSequence mo12890g() {
            return C0107e0.this.f260f.getSubtitle();
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: h */
        public final CharSequence mo12889h() {
            return C0107e0.this.f260f.getTitle();
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: i */
        public final void mo12888i() {
            if (C0107e0.this.f263i != this) {
                return;
            }
            C0210g c0210g = this.f284d;
            c0210g.m12836w();
            try {
                this.f285e.mo12877d(this, c0210g);
            } finally {
                c0210g.m12837v();
            }
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: j */
        public final boolean mo12887j() {
            return C0107e0.this.f260f.f812s;
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: k */
        public final void mo12886k(View view) {
            C0107e0.this.f260f.setCustomView(view);
            this.f286f = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: l */
        public final void mo12885l(int i) {
            mo12884m(C0107e0.this.f255a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: m */
        public final void mo12884m(CharSequence charSequence) {
            C0107e0.this.f260f.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: n */
        public final void mo12883n(int i) {
            mo12882o(C0107e0.this.f255a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: o */
        public final void mo12882o(CharSequence charSequence) {
            C0107e0.this.f260f.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.AbstractC0178a
        /* renamed from: p */
        public final void mo12881p(boolean z) {
            this.f507b = z;
            C0107e0.this.f260f.setTitleOptional(z);
        }
    }

    public C0107e0(Dialog dialog) {
        new ArrayList();
        this.f267m = new ArrayList<>();
        this.f269o = 0;
        this.f270p = true;
        this.f273s = true;
        this.f277w = new C0108a();
        this.f278x = new C0109b();
        this.f279y = new C0110c();
        m13012q(dialog.getWindow().getDecorView());
    }

    public C0107e0(boolean z, Activity activity) {
        new ArrayList();
        this.f267m = new ArrayList<>();
        this.f269o = 0;
        this.f270p = true;
        this.f273s = true;
        this.f277w = new C0108a();
        this.f278x = new C0109b();
        this.f279y = new C0110c();
        View decorView = activity.getWindow().getDecorView();
        m13012q(decorView);
        if (z) {
            return;
        }
        this.f261g = decorView.findViewById(16908290);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: b */
    public final boolean mo13023b() {
        InterfaceC0412s0 interfaceC0412s0 = this.f259e;
        if (interfaceC0412s0 == null || !interfaceC0412s0.mo12512j()) {
            return false;
        }
        this.f259e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: c */
    public final void mo13022c(boolean z) {
        if (z == this.f266l) {
            return;
        }
        this.f266l = z;
        ArrayList<ActionBar.InterfaceC0081b> arrayList = this.f267m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).m13042a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: d */
    public final int mo13021d() {
        return this.f259e.mo12505q();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: e */
    public final Context mo13020e() {
        if (this.f256b == null) {
            TypedValue typedValue = new TypedValue();
            this.f255a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f256b = new ContextThemeWrapper(this.f255a, i);
            } else {
                this.f256b = this.f255a;
            }
        }
        return this.f256b;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public final void mo13019g() {
        m13011r(this.f255a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public final boolean mo13018i(int i, KeyEvent keyEvent) {
        C0210g c0210g;
        int i2;
        C0111d c0111d = this.f263i;
        if (c0111d == null || (c0210g = c0111d.f284d) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        c0210g.setQwertyMode(z);
        return c0210g.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public final void mo13017l(boolean z) {
        int i;
        if (!this.f262h) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            int mo12505q = this.f259e.mo12505q();
            this.f262h = true;
            this.f259e.mo12511k((i & 4) | (mo12505q & (-5)));
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public final void mo13016m(boolean z) {
        C0189g c0189g;
        this.f275u = z;
        if (z || (c0189g = this.f274t) == null) {
            return;
        }
        c0189g.m12871a();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    public final void mo13015n(CharSequence charSequence) {
        this.f259e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public final AbstractC0178a mo13014o(LayoutInflater$Factory2C0114h.C0119e c0119e) {
        C0111d c0111d = this.f263i;
        if (c0111d != null) {
            c0111d.mo12894c();
        }
        this.f257c.setHideOnContentScrollEnabled(false);
        this.f260f.m12804h();
        C0111d c0111d2 = new C0111d(this.f260f.getContext(), c0119e);
        C0210g c0210g = c0111d2.f284d;
        c0210g.m12836w();
        try {
            if (c0111d2.f285e.mo12879b(c0111d2, c0210g)) {
                this.f263i = c0111d2;
                c0111d2.mo12888i();
                this.f260f.m12806f(c0111d2);
                m13013p(true);
                return c0111d2;
            }
            return null;
        } finally {
            c0210g.m12837v();
        }
    }

    /* renamed from: p */
    public final void m13013p(boolean z) {
        C0922g2 mo12507o;
        C0922g2 m12734e;
        long j;
        if (z) {
            if (!this.f272r) {
                this.f272r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f257c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m13010s(false);
            }
        } else if (this.f272r) {
            this.f272r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f257c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m13010s(false);
        }
        ActionBarContainer actionBarContainer = this.f258d;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0817g.m11729c(actionBarContainer)) {
            if (z) {
                m12734e = this.f259e.mo12507o(4, 100L);
                mo12507o = this.f260f.m12734e(0, 200L);
            } else {
                mo12507o = this.f259e.mo12507o(0, 200L);
                m12734e = this.f260f.m12734e(8, 100L);
            }
            C0189g c0189g = new C0189g();
            ArrayList<C0922g2> arrayList = c0189g.f566a;
            arrayList.add(m12734e);
            View view = m12734e.f2634a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = mo12507o.f2634a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(mo12507o);
            c0189g.m12870b();
        } else if (z) {
            this.f259e.mo12506p(4);
            this.f260f.setVisibility(0);
        } else {
            this.f259e.mo12506p(0);
            this.f260f.setVisibility(8);
        }
    }

    /* renamed from: q */
    public final void m13012q(View view) {
        String str;
        InterfaceC0412s0 wrapper;
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f257c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof InterfaceC0412s0) {
            wrapper = (InterfaceC0412s0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.f259e = wrapper;
        this.f260f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f258d = actionBarContainer;
        InterfaceC0412s0 interfaceC0412s0 = this.f259e;
        if (interfaceC0412s0 != null && this.f260f != null && actionBarContainer != null) {
            this.f255a = interfaceC0412s0.getContext();
            if ((this.f259e.mo12505q() & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f262h = true;
            }
            Context context = this.f255a;
            if (context.getApplicationInfo().targetSdkVersion < 14) {
            }
            this.f259e.mo12513i();
            m13011r(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f255a.obtainStyledAttributes(null, C0157c.f410a, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f257c;
                if (actionBarOverlayLayout2.f824h) {
                    this.f276v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.f258d;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0819i.m11703s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(C0107e0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    /* renamed from: r */
    public final void m13011r(boolean z) {
        this.f268n = z;
        if (!z) {
            this.f259e.mo12510l();
            this.f258d.setTabContainer(null);
        } else {
            this.f258d.setTabContainer(null);
            this.f259e.mo12510l();
        }
        this.f259e.mo12508n();
        InterfaceC0412s0 interfaceC0412s0 = this.f259e;
        boolean z2 = this.f268n;
        interfaceC0412s0.mo12502t(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f257c;
        boolean z3 = this.f268n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: s */
    public final void m13010s(boolean z) {
        boolean z2;
        int[] iArr;
        int[] iArr2;
        boolean z3 = this.f271q;
        if (this.f272r || !z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.f261g;
        final C0110c c0110c = this.f279y;
        if (z2) {
            if (!this.f273s) {
                this.f273s = true;
                C0189g c0189g = this.f274t;
                if (c0189g != null) {
                    c0189g.m12871a();
                }
                this.f258d.setVisibility(0);
                int i = this.f269o;
                C0109b c0109b = this.f278x;
                if (i == 0 && (this.f275u || z)) {
                    this.f258d.setTranslationY(0.0f);
                    float f = -this.f258d.getHeight();
                    if (z) {
                        this.f258d.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.f258d.setTranslationY(f);
                    C0189g c0189g2 = new C0189g();
                    C0922g2 m11784a = ViewCompat.m11784a(this.f258d);
                    m11784a.m11469e(0.0f);
                    final View view2 = m11784a.f2634a.get();
                    if (view2 != null) {
                        if (c0110c != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.e2
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) C0107e0.this.f258d.getParent()).invalidate();
                                }
                            };
                        }
                        C0922g2.C0923a.m11468a(view2.animate(), animatorUpdateListener);
                    }
                    boolean z4 = c0189g2.f570e;
                    ArrayList<C0922g2> arrayList = c0189g2.f566a;
                    if (!z4) {
                        arrayList.add(m11784a);
                    }
                    if (this.f270p && view != null) {
                        view.setTranslationY(f);
                        C0922g2 m11784a2 = ViewCompat.m11784a(view);
                        m11784a2.m11469e(0.0f);
                        if (!c0189g2.f570e) {
                            arrayList.add(m11784a2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f253A;
                    boolean z5 = c0189g2.f570e;
                    if (!z5) {
                        c0189g2.f568c = decelerateInterpolator;
                    }
                    if (!z5) {
                        c0189g2.f567b = 250L;
                    }
                    if (!z5) {
                        c0189g2.f569d = c0109b;
                    }
                    this.f274t = c0189g2;
                    c0189g2.m12870b();
                } else {
                    this.f258d.setAlpha(1.0f);
                    this.f258d.setTranslationY(0.0f);
                    if (this.f270p && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    c0109b.mo11463c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f257c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0818h.m11722c(actionBarOverlayLayout);
                }
            }
        } else if (this.f273s) {
            this.f273s = false;
            C0189g c0189g3 = this.f274t;
            if (c0189g3 != null) {
                c0189g3.m12871a();
            }
            int i2 = this.f269o;
            C0108a c0108a = this.f277w;
            if (i2 == 0 && (this.f275u || z)) {
                this.f258d.setAlpha(1.0f);
                this.f258d.setTransitioning(true);
                C0189g c0189g4 = new C0189g();
                float f2 = -this.f258d.getHeight();
                if (z) {
                    this.f258d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                C0922g2 m11784a3 = ViewCompat.m11784a(this.f258d);
                m11784a3.m11469e(f2);
                final View view3 = m11784a3.f2634a.get();
                if (view3 != null) {
                    if (c0110c != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.e2
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) C0107e0.this.f258d.getParent()).invalidate();
                            }
                        };
                    }
                    C0922g2.C0923a.m11468a(view3.animate(), animatorUpdateListener);
                }
                boolean z6 = c0189g4.f570e;
                ArrayList<C0922g2> arrayList2 = c0189g4.f566a;
                if (!z6) {
                    arrayList2.add(m11784a3);
                }
                if (this.f270p && view != null) {
                    C0922g2 m11784a4 = ViewCompat.m11784a(view);
                    m11784a4.m11469e(f2);
                    if (!c0189g4.f570e) {
                        arrayList2.add(m11784a4);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f254z;
                boolean z7 = c0189g4.f570e;
                if (!z7) {
                    c0189g4.f568c = accelerateInterpolator;
                }
                if (!z7) {
                    c0189g4.f567b = 250L;
                }
                if (!z7) {
                    c0189g4.f569d = c0108a;
                }
                this.f274t = c0189g4;
                c0189g4.m12870b();
                return;
            }
            c0108a.mo11463c();
        }
    }
}
