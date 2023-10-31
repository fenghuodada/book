package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.C0157c;
import androidx.appcompat.app.C0092b0;
import androidx.appcompat.app.C0104d0;
import androidx.appcompat.content.res.C0158a;
import androidx.appcompat.view.AbstractC0178a;
import androidx.appcompat.view.C0181c;
import androidx.appcompat.view.C0184e;
import androidx.appcompat.view.C0186f;
import androidx.appcompat.view.Window$CallbackC0191h;
import androidx.appcompat.view.menu.C0207e;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.InterfaceC0226m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0362i2;
import androidx.appcompat.widget.C0363j;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0408r0;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0482i;
import androidx.core.app.C0635n;
import androidx.core.content.PermissionChecker;
import androidx.core.content.res.C0676f;
import androidx.core.p003os.BuildCompat;
import androidx.core.p003os.C0735e;
import androidx.core.p003os.InterfaceC0742j;
import androidx.core.util.C0799c;
import androidx.core.view.C0922g2;
import androidx.core.view.C0934i2;
import androidx.core.view.C0957k;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.appcompat.app.h */
/* loaded from: classes.dex */
public final class LayoutInflater$Factory2C0114h extends AppCompatDelegate implements C0210g.InterfaceC0211a, LayoutInflater.Factory2 {

    /* renamed from: l0 */
    public static final C0482i<String, Integer> f289l0 = new C0482i<>();

    /* renamed from: m0 */
    public static final int[] f290m0 = {16842836};

    /* renamed from: n0 */
    public static final boolean f291n0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: o0 */
    public static final boolean f292o0 = true;

    /* renamed from: A */
    public boolean f293A;

    /* renamed from: B */
    public ViewGroup f294B;

    /* renamed from: C */
    public TextView f295C;

    /* renamed from: D */
    public View f296D;

    /* renamed from: E */
    public boolean f297E;

    /* renamed from: F */
    public boolean f298F;

    /* renamed from: G */
    public boolean f299G;

    /* renamed from: H */
    public boolean f300H;

    /* renamed from: I */
    public boolean f301I;

    /* renamed from: J */
    public boolean f302J;

    /* renamed from: K */
    public boolean f303K;

    /* renamed from: L */
    public boolean f304L;

    /* renamed from: M */
    public C0131o[] f305M;

    /* renamed from: N */
    public C0131o f306N;

    /* renamed from: O */
    public boolean f307O;

    /* renamed from: P */
    public boolean f308P;

    /* renamed from: Q */
    public boolean f309Q;

    /* renamed from: R */
    public boolean f310R;

    /* renamed from: S */
    public Configuration f311S;

    /* renamed from: T */
    public final int f312T;

    /* renamed from: U */
    public int f313U;

    /* renamed from: V */
    public int f314V;

    /* renamed from: W */
    public boolean f315W;

    /* renamed from: X */
    public C0129m f316X;

    /* renamed from: Y */
    public C0126k f317Y;

    /* renamed from: Z */
    public boolean f318Z;

    /* renamed from: d0 */
    public int f319d0;

    /* renamed from: f0 */
    public boolean f321f0;

    /* renamed from: g0 */
    public Rect f322g0;

    /* renamed from: h0 */
    public Rect f323h0;

    /* renamed from: i0 */
    public C0148w f324i0;

    /* renamed from: j */
    public final Object f325j;

    /* renamed from: j0 */
    public OnBackInvokedDispatcher f326j0;

    /* renamed from: k */
    public final Context f327k;

    /* renamed from: k0 */
    public OnBackInvokedCallback f328k0;

    /* renamed from: l */
    public Window f329l;

    /* renamed from: m */
    public C0125j f330m;

    /* renamed from: n */
    public final InterfaceC0106e f331n;

    /* renamed from: o */
    public ActionBar f332o;

    /* renamed from: p */
    public C0186f f333p;

    /* renamed from: q */
    public CharSequence f334q;

    /* renamed from: r */
    public InterfaceC0408r0 f335r;

    /* renamed from: s */
    public C0118d f336s;

    /* renamed from: t */
    public C0132p f337t;

    /* renamed from: u */
    public AbstractC0178a f338u;

    /* renamed from: v */
    public ActionBarContextView f339v;

    /* renamed from: w */
    public PopupWindow f340w;

    /* renamed from: x */
    public RunnableC0135k f341x;

    /* renamed from: y */
    public C0922g2 f342y = null;

    /* renamed from: z */
    public final boolean f343z = true;

    /* renamed from: e0 */
    public final RunnableC0115a f320e0 = new RunnableC0115a();

    /* renamed from: androidx.appcompat.app.h$a */
    /* loaded from: classes.dex */
    public class RunnableC0115a implements Runnable {
        public RunnableC0115a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = LayoutInflater$Factory2C0114h.this;
            if ((layoutInflater$Factory2C0114h.f319d0 & 1) != 0) {
                layoutInflater$Factory2C0114h.m12995N(0);
            }
            if ((layoutInflater$Factory2C0114h.f319d0 & 4096) != 0) {
                layoutInflater$Factory2C0114h.m12995N(108);
            }
            layoutInflater$Factory2C0114h.f318Z = false;
            layoutInflater$Factory2C0114h.f319d0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.h$b */
    /* loaded from: classes.dex */
    public class C0116b implements InterfaceC0088a {
    }

    /* renamed from: androidx.appcompat.app.h$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0117c {
    }

    /* renamed from: androidx.appcompat.app.h$d */
    /* loaded from: classes.dex */
    public final class C0118d implements InterfaceC0226m.InterfaceC0227a {
        public C0118d() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: b */
        public final void mo12698b(@NonNull C0210g c0210g, boolean z) {
            LayoutInflater$Factory2C0114h.this.m12999J(c0210g);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: c */
        public final boolean mo12697c(@NonNull C0210g c0210g) {
            Window.Callback m12989T = LayoutInflater$Factory2C0114h.this.m12989T();
            if (m12989T != null) {
                m12989T.onMenuOpened(108, c0210g);
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.h$e */
    /* loaded from: classes.dex */
    public class C0119e implements AbstractC0178a.InterfaceC0179a {

        /* renamed from: a */
        public final AbstractC0178a.InterfaceC0179a f346a;

        /* renamed from: androidx.appcompat.app.h$e$a */
        /* loaded from: classes.dex */
        public class C0120a extends C0934i2 {
            public C0120a() {
            }

            @Override // androidx.core.view.InterfaceC0928h2
            /* renamed from: c */
            public final void mo11463c() {
                C0119e c0119e = C0119e.this;
                LayoutInflater$Factory2C0114h.this.f339v.setVisibility(8);
                LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = LayoutInflater$Factory2C0114h.this;
                PopupWindow popupWindow = layoutInflater$Factory2C0114h.f340w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C0114h.f339v.getParent() instanceof View) {
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0818h.m11722c((View) layoutInflater$Factory2C0114h.f339v.getParent());
                }
                layoutInflater$Factory2C0114h.f339v.m12804h();
                layoutInflater$Factory2C0114h.f342y.m11470d(null);
                layoutInflater$Factory2C0114h.f342y = null;
                ViewGroup viewGroup = layoutInflater$Factory2C0114h.f294B;
                WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                ViewCompat.C0818h.m11722c(viewGroup);
            }
        }

        public C0119e(AbstractC0178a.InterfaceC0179a interfaceC0179a) {
            this.f346a = interfaceC0179a;
        }

        @Override // androidx.appcompat.view.AbstractC0178a.InterfaceC0179a
        /* renamed from: a */
        public final void mo12880a(AbstractC0178a abstractC0178a) {
            this.f346a.mo12880a(abstractC0178a);
            LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = LayoutInflater$Factory2C0114h.this;
            if (layoutInflater$Factory2C0114h.f340w != null) {
                layoutInflater$Factory2C0114h.f329l.getDecorView().removeCallbacks(layoutInflater$Factory2C0114h.f341x);
            }
            if (layoutInflater$Factory2C0114h.f339v != null) {
                C0922g2 c0922g2 = layoutInflater$Factory2C0114h.f342y;
                if (c0922g2 != null) {
                    c0922g2.m11472b();
                }
                C0922g2 m11784a = ViewCompat.m11784a(layoutInflater$Factory2C0114h.f339v);
                m11784a.m11473a(0.0f);
                layoutInflater$Factory2C0114h.f342y = m11784a;
                m11784a.m11470d(new C0120a());
            }
            InterfaceC0106e interfaceC0106e = layoutInflater$Factory2C0114h.f331n;
            if (interfaceC0106e != null) {
                interfaceC0106e.onSupportActionModeFinished(layoutInflater$Factory2C0114h.f338u);
            }
            layoutInflater$Factory2C0114h.f338u = null;
            ViewGroup viewGroup = layoutInflater$Factory2C0114h.f294B;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0818h.m11722c(viewGroup);
            layoutInflater$Factory2C0114h.m12981b0();
        }

        @Override // androidx.appcompat.view.AbstractC0178a.InterfaceC0179a
        /* renamed from: b */
        public final boolean mo12879b(AbstractC0178a abstractC0178a, C0210g c0210g) {
            return this.f346a.mo12879b(abstractC0178a, c0210g);
        }

        @Override // androidx.appcompat.view.AbstractC0178a.InterfaceC0179a
        /* renamed from: c */
        public final boolean mo12878c(AbstractC0178a abstractC0178a, MenuItem menuItem) {
            return this.f346a.mo12878c(abstractC0178a, menuItem);
        }

        @Override // androidx.appcompat.view.AbstractC0178a.InterfaceC0179a
        /* renamed from: d */
        public final boolean mo12877d(AbstractC0178a abstractC0178a, C0210g c0210g) {
            ViewGroup viewGroup = LayoutInflater$Factory2C0114h.this.f294B;
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            ViewCompat.C0818h.m11722c(viewGroup);
            return this.f346a.mo12877d(abstractC0178a, c0210g);
        }
    }

    @RequiresApi(17)
    /* renamed from: androidx.appcompat.app.h$f */
    /* loaded from: classes.dex */
    public static class C0121f {
        @DoNotInline
        /* renamed from: a */
        public static void m12958a(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        @DoNotInline
        /* renamed from: b */
        public static void m12957b(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.appcompat.app.h$g */
    /* loaded from: classes.dex */
    public static class C0122g {
        @DoNotInline
        /* renamed from: a */
        public static String m12956a(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @RequiresApi(24)
    /* renamed from: androidx.appcompat.app.h$h */
    /* loaded from: classes.dex */
    public static class C0123h {
        @DoNotInline
        /* renamed from: a */
        public static void m12955a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (equals) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @DoNotInline
        /* renamed from: b */
        public static C0735e m12954b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return C0735e.m11859b(languageTags);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m12953c(C0735e c0735e) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(c0735e.f2425a.mo11835a());
            LocaleList.setDefault(forLanguageTags);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m12952d(Configuration configuration, C0735e c0735e) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(c0735e.f2425a.mo11835a());
            configuration.setLocales(forLanguageTags);
        }
    }

    @RequiresApi(33)
    /* renamed from: androidx.appcompat.app.h$i */
    /* loaded from: classes.dex */
    public static class C0124i {
        @DoNotInline
        /* renamed from: a */
        public static OnBackInvokedDispatcher m12951a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        @DoNotInline
        /* renamed from: b */
        public static OnBackInvokedCallback m12950b(Object obj, final LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h) {
            Objects.requireNonNull(layoutInflater$Factory2C0114h);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.t
                public final void onBackInvoked() {
                    LayoutInflater$Factory2C0114h.this.m12986W();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        @DoNotInline
        /* renamed from: c */
        public static void m12949c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.appcompat.app.h$j */
    /* loaded from: classes.dex */
    public class C0125j extends Window$CallbackC0191h {

        /* renamed from: b */
        public InterfaceC0117c f349b;

        /* renamed from: c */
        public boolean f350c;

        /* renamed from: d */
        public boolean f351d;

        /* renamed from: e */
        public boolean f352e;

        public C0125j(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: a */
        public final void m12948a(Window.Callback callback) {
            try {
                this.f350c = true;
                callback.onContentChanged();
            } finally {
                this.f350c = false;
            }
        }

        @Override // androidx.appcompat.view.Window$CallbackC0191h, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f351d ? this.f575a.dispatchKeyEvent(keyEvent) : LayoutInflater$Factory2C0114h.this.m12996M(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
            if (r6 != false) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // androidx.appcompat.view.Window$CallbackC0191h, android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                boolean r0 = super.dispatchKeyShortcutEvent(r6)
                r1 = 1
                if (r0 != 0) goto L4f
                int r0 = r6.getKeyCode()
                androidx.appcompat.app.h r2 = androidx.appcompat.app.LayoutInflater$Factory2C0114h.this
                r2.m12988U()
                androidx.appcompat.app.ActionBar r3 = r2.f332o
                r4 = 0
                if (r3 == 0) goto L1c
                boolean r0 = r3.mo13018i(r0, r6)
                if (r0 == 0) goto L1c
                goto L48
            L1c:
                androidx.appcompat.app.h$o r0 = r2.f306N
                if (r0 == 0) goto L31
                int r3 = r6.getKeyCode()
                boolean r0 = r2.m12984Y(r0, r3, r6)
                if (r0 == 0) goto L31
                androidx.appcompat.app.h$o r6 = r2.f306N
                if (r6 == 0) goto L48
                r6.f373l = r1
                goto L48
            L31:
                androidx.appcompat.app.h$o r0 = r2.f306N
                if (r0 != 0) goto L4a
                androidx.appcompat.app.h$o r0 = r2.m12990S(r4)
                r2.m12983Z(r0, r6)
                int r3 = r6.getKeyCode()
                boolean r6 = r2.m12984Y(r0, r3, r6)
                r0.f372k = r4
                if (r6 == 0) goto L4a
            L48:
                r6 = r1
                goto L4b
            L4a:
                r6 = r4
            L4b:
                if (r6 == 0) goto L4e
                goto L4f
            L4e:
                r1 = r4
            L4f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0114h.C0125j.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f350c) {
                this.f575a.onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.Window$CallbackC0191h, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0210g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0191h, android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            View view;
            InterfaceC0117c interfaceC0117c = this.f349b;
            if (interfaceC0117c != null) {
                C0092b0.C0097e c0097e = (C0092b0.C0097e) interfaceC0117c;
                if (i == 0) {
                    view = new View(C0092b0.this.f224a.getContext());
                } else {
                    view = null;
                }
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0191h, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = LayoutInflater$Factory2C0114h.this;
            if (i == 108) {
                layoutInflater$Factory2C0114h.m12988U();
                ActionBar actionBar = layoutInflater$Factory2C0114h.f332o;
                if (actionBar != null) {
                    actionBar.mo13022c(true);
                }
            } else {
                layoutInflater$Factory2C0114h.getClass();
            }
            return true;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0191h, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.f352e) {
                this.f575a.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = LayoutInflater$Factory2C0114h.this;
            if (i == 108) {
                layoutInflater$Factory2C0114h.m12988U();
                ActionBar actionBar = layoutInflater$Factory2C0114h.f332o;
                if (actionBar != null) {
                    actionBar.mo13022c(false);
                }
            } else if (i == 0) {
                C0131o m12990S = layoutInflater$Factory2C0114h.m12990S(i);
                if (m12990S.f374m) {
                    layoutInflater$Factory2C0114h.m12998K(m12990S, false);
                }
            } else {
                layoutInflater$Factory2C0114h.getClass();
            }
        }

        @Override // androidx.appcompat.view.Window$CallbackC0191h, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            C0210g c0210g;
            if (menu instanceof C0210g) {
                c0210g = (C0210g) menu;
            } else {
                c0210g = null;
            }
            if (i == 0 && c0210g == null) {
                return false;
            }
            if (c0210g != null) {
                c0210g.f708x = true;
            }
            InterfaceC0117c interfaceC0117c = this.f349b;
            if (interfaceC0117c != null) {
                C0092b0.C0097e c0097e = (C0092b0.C0097e) interfaceC0117c;
                if (i == 0) {
                    C0092b0 c0092b0 = C0092b0.this;
                    if (!c0092b0.f227d) {
                        c0092b0.f224a.f1133m = true;
                        c0092b0.f227d = true;
                    }
                }
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0210g != null) {
                c0210g.f708x = false;
            }
            return onPreparePanel;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0191h, android.view.Window.Callback
        @RequiresApi(24)
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0210g c0210g = LayoutInflater$Factory2C0114h.this.m12990S(0).f369h;
            if (c0210g != null) {
                super.onProvideKeyboardShortcuts(list, c0210g, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0191h, android.view.Window.Callback
        @RequiresApi(23)
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = LayoutInflater$Factory2C0114h.this;
            if (layoutInflater$Factory2C0114h.f343z && i == 0) {
                C0184e.C0185a c0185a = new C0184e.C0185a(layoutInflater$Factory2C0114h.f327k, callback);
                AbstractC0178a mo13004E = layoutInflater$Factory2C0114h.mo13004E(c0185a);
                if (mo13004E != null) {
                    return c0185a.m12876e(mo13004E);
                }
                return null;
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    /* renamed from: androidx.appcompat.app.h$k */
    /* loaded from: classes.dex */
    public class C0126k extends AbstractC0127l {

        /* renamed from: c */
        public final PowerManager f354c;

        public C0126k(@NonNull Context context) {
            super();
            this.f354c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0114h.AbstractC0127l
        /* renamed from: b */
        public final IntentFilter mo12945b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0114h.AbstractC0127l
        /* renamed from: c */
        public final int mo12944c() {
            return this.f354c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0114h.AbstractC0127l
        /* renamed from: d */
        public final void mo12943d() {
            LayoutInflater$Factory2C0114h.this.m13003F(true, true);
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    @VisibleForTesting
    /* renamed from: androidx.appcompat.app.h$l */
    /* loaded from: classes.dex */
    public abstract class AbstractC0127l {

        /* renamed from: a */
        public C0128a f356a;

        /* renamed from: androidx.appcompat.app.h$l$a */
        /* loaded from: classes.dex */
        public class C0128a extends BroadcastReceiver {
            public C0128a() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                AbstractC0127l.this.mo12943d();
            }
        }

        public AbstractC0127l() {
        }

        /* renamed from: a */
        public final void m12947a() {
            C0128a c0128a = this.f356a;
            if (c0128a != null) {
                try {
                    LayoutInflater$Factory2C0114h.this.f327k.unregisterReceiver(c0128a);
                } catch (IllegalArgumentException unused) {
                }
                this.f356a = null;
            }
        }

        @Nullable
        /* renamed from: b */
        public abstract IntentFilter mo12945b();

        /* renamed from: c */
        public abstract int mo12944c();

        /* renamed from: d */
        public abstract void mo12943d();

        /* renamed from: e */
        public final void m12946e() {
            m12947a();
            IntentFilter mo12945b = mo12945b();
            if (mo12945b == null || mo12945b.countActions() == 0) {
                return;
            }
            if (this.f356a == null) {
                this.f356a = new C0128a();
            }
            LayoutInflater$Factory2C0114h.this.f327k.registerReceiver(this.f356a, mo12945b);
        }
    }

    /* renamed from: androidx.appcompat.app.h$m */
    /* loaded from: classes.dex */
    public class C0129m extends AbstractC0127l {

        /* renamed from: c */
        public final C0104d0 f359c;

        public C0129m(@NonNull C0104d0 c0104d0) {
            super();
            this.f359c = c0104d0;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0114h.AbstractC0127l
        /* renamed from: b */
        public final IntentFilter mo12945b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0114h.AbstractC0127l
        /* renamed from: c */
        public final int mo12944c() {
            boolean z;
            Location location;
            boolean z2;
            long j;
            long j2;
            Location location2;
            C0104d0 c0104d0 = this.f359c;
            C0104d0.C0105a c0105a = c0104d0.f250c;
            boolean z3 = false;
            if (c0105a.f252b > System.currentTimeMillis()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = c0105a.f251a;
            } else {
                Context context = c0104d0.f248a;
                int m12016c = PermissionChecker.m12016c(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location location3 = null;
                LocationManager locationManager = c0104d0.f249b;
                if (m12016c == 0) {
                    try {
                    } catch (Exception e) {
                        Log.d("TwilightManager", "Failed to get last known location", e);
                    }
                    if (locationManager.isProviderEnabled("network")) {
                        location2 = locationManager.getLastKnownLocation("network");
                        location = location2;
                    }
                    location2 = null;
                    location = location2;
                } else {
                    location = null;
                }
                if (PermissionChecker.m12016c(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            location3 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                }
                if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                    location = location3;
                }
                if (location != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (C0100c0.f241d == null) {
                        C0100c0.f241d = new C0100c0();
                    }
                    C0100c0 c0100c0 = C0100c0.f241d;
                    c0100c0.m13024a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                    c0100c0.m13024a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                    if (c0100c0.f244c == 1) {
                        z3 = true;
                    }
                    long j3 = c0100c0.f243b;
                    long j4 = c0100c0.f242a;
                    c0100c0.m13024a(location.getLatitude(), location.getLongitude(), 86400000 + currentTimeMillis);
                    long j5 = c0100c0.f243b;
                    if (j3 != -1 && j4 != -1) {
                        if (currentTimeMillis > j4) {
                            j2 = j5 + 0;
                        } else if (currentTimeMillis > j3) {
                            j2 = j4 + 0;
                        } else {
                            j2 = j3 + 0;
                        }
                        j = j2 + 60000;
                    } else {
                        j = 43200000 + currentTimeMillis;
                    }
                    c0105a.f251a = z3;
                    c0105a.f252b = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (!z2) {
                return 1;
            }
            return 2;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0114h.AbstractC0127l
        /* renamed from: d */
        public final void mo12943d() {
            LayoutInflater$Factory2C0114h.this.m13003F(true, true);
        }
    }

    /* renamed from: androidx.appcompat.app.h$n */
    /* loaded from: classes.dex */
    public class C0130n extends ContentFrameLayout {
        public C0130n(C0181c c0181c) {
            super(c0181c, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflater$Factory2C0114h.this.m12996M(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            boolean z;
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x >= -5 && y >= -5 && x <= getWidth() + 5 && y <= getHeight() + 5) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = LayoutInflater$Factory2C0114h.this;
                    layoutInflater$Factory2C0114h.m12998K(layoutInflater$Factory2C0114h.m12990S(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(C0158a.m12920a(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.h$o */
    /* loaded from: classes.dex */
    public static final class C0131o {

        /* renamed from: a */
        public final int f362a;

        /* renamed from: b */
        public int f363b;

        /* renamed from: c */
        public int f364c;

        /* renamed from: d */
        public int f365d;

        /* renamed from: e */
        public C0130n f366e;

        /* renamed from: f */
        public View f367f;

        /* renamed from: g */
        public View f368g;

        /* renamed from: h */
        public C0210g f369h;

        /* renamed from: i */
        public C0207e f370i;

        /* renamed from: j */
        public C0181c f371j;

        /* renamed from: k */
        public boolean f372k;

        /* renamed from: l */
        public boolean f373l;

        /* renamed from: m */
        public boolean f374m;

        /* renamed from: n */
        public boolean f375n = false;

        /* renamed from: o */
        public boolean f376o;

        /* renamed from: p */
        public Bundle f377p;

        public C0131o(int i) {
            this.f362a = i;
        }
    }

    /* renamed from: androidx.appcompat.app.h$p */
    /* loaded from: classes.dex */
    public final class C0132p implements InterfaceC0226m.InterfaceC0227a {
        public C0132p() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: b */
        public final void mo12698b(@NonNull C0210g c0210g, boolean z) {
            boolean z2;
            int i;
            C0131o c0131o;
            C0210g mo12811k = c0210g.mo12811k();
            int i2 = 0;
            if (mo12811k != c0210g) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c0210g = mo12811k;
            }
            LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = LayoutInflater$Factory2C0114h.this;
            C0131o[] c0131oArr = layoutInflater$Factory2C0114h.f305M;
            if (c0131oArr != null) {
                i = c0131oArr.length;
            } else {
                i = 0;
            }
            while (true) {
                if (i2 < i) {
                    c0131o = c0131oArr[i2];
                    if (c0131o != null && c0131o.f369h == c0210g) {
                        break;
                    }
                    i2++;
                } else {
                    c0131o = null;
                    break;
                }
            }
            if (c0131o != null) {
                if (z2) {
                    layoutInflater$Factory2C0114h.m13000I(c0131o.f362a, c0131o, mo12811k);
                    layoutInflater$Factory2C0114h.m12998K(c0131o, true);
                    return;
                }
                layoutInflater$Factory2C0114h.m12998K(c0131o, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: c */
        public final boolean mo12697c(@NonNull C0210g c0210g) {
            Window.Callback m12989T;
            if (c0210g == c0210g.mo12811k()) {
                LayoutInflater$Factory2C0114h layoutInflater$Factory2C0114h = LayoutInflater$Factory2C0114h.this;
                if (!layoutInflater$Factory2C0114h.f299G || (m12989T = layoutInflater$Factory2C0114h.m12989T()) == null || layoutInflater$Factory2C0114h.f310R) {
                    return true;
                }
                m12989T.onMenuOpened(108, c0210g);
                return true;
            }
            return true;
        }
    }

    public LayoutInflater$Factory2C0114h(Context context, Window window, InterfaceC0106e interfaceC0106e, Object obj) {
        C0482i<String, Integer> c0482i;
        Integer orDefault;
        ActivityC0101d activityC0101d;
        this.f312T = -100;
        this.f327k = context;
        this.f331n = interfaceC0106e;
        this.f325j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof ActivityC0101d) {
                    activityC0101d = (ActivityC0101d) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            activityC0101d = null;
            if (activityC0101d != null) {
                this.f312T = activityC0101d.getDelegate().mo12974i();
            }
        }
        if (this.f312T == -100 && (orDefault = (c0482i = f289l0).getOrDefault(this.f325j.getClass().getName(), null)) != null) {
            this.f312T = orDefault.intValue();
            c0482i.remove(this.f325j.getClass().getName());
        }
        if (window != null) {
            m13002G(window);
        }
        C0363j.m12612d();
    }

    @Nullable
    /* renamed from: H */
    public static C0735e m13001H(@NonNull Context context) {
        C0735e c0735e;
        C0735e m11859b;
        Locale m11858c;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c0735e = AppCompatDelegate.f207c) == null) {
            return null;
        }
        C0735e m12991R = m12991R(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC0742j interfaceC0742j = c0735e.f2425a;
        if (i >= 24) {
            if (interfaceC0742j.isEmpty()) {
                m11859b = C0735e.f2424b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < m12991R.f2425a.size() + interfaceC0742j.size(); i2++) {
                    if (i2 < interfaceC0742j.size()) {
                        m11858c = c0735e.m11858c(i2);
                    } else {
                        m11858c = m12991R.m11858c(i2 - interfaceC0742j.size());
                    }
                    if (m11858c != null) {
                        linkedHashSet.add(m11858c);
                    }
                }
                m11859b = C0735e.m11860a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (interfaceC0742j.isEmpty()) {
            m11859b = C0735e.f2424b;
        } else {
            m11859b = C0735e.m11859b(c0735e.m11858c(0).toString());
        }
        if (!m11859b.f2425a.isEmpty()) {
            return m11859b;
        }
        return m12991R;
    }

    @NonNull
    /* renamed from: L */
    public static Configuration m12997L(@NonNull Context context, int i, @Nullable C0735e c0735e, @Nullable Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c0735e != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                C0123h.m12952d(configuration2, c0735e);
            } else {
                C0121f.m12957b(configuration2, c0735e.m11858c(0));
                C0121f.m12958a(configuration2, c0735e.m11858c(0));
            }
        }
        return configuration2;
    }

    /* renamed from: R */
    public static C0735e m12991R(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? C0123h.m12954b(configuration) : C0735e.m11859b(C0122g.m12956a(configuration.locale));
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: A */
    public final void mo13008A(View view, ViewGroup.LayoutParams layoutParams) {
        m12994O();
        ViewGroup viewGroup = (ViewGroup) this.f294B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f330m.m12948a(this.f329l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: B */
    public final void mo13007B(Toolbar toolbar) {
        CharSequence charSequence;
        Object obj = this.f325j;
        if (!(obj instanceof Activity)) {
            return;
        }
        m12988U();
        ActionBar actionBar = this.f332o;
        if (!(actionBar instanceof C0107e0)) {
            this.f333p = null;
            if (actionBar != null) {
                actionBar.mo13029h();
            }
            this.f332o = null;
            if (toolbar != null) {
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = this.f334q;
                }
                C0092b0 c0092b0 = new C0092b0(toolbar, charSequence, this.f330m);
                this.f332o = c0092b0;
                this.f330m.f349b = c0092b0.f226c;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f330m.f349b = null;
            }
            mo12970m();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: C */
    public final void mo13006C(@StyleRes int i) {
        this.f313U = i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: D */
    public final void mo13005D(CharSequence charSequence) {
        this.f334q = charSequence;
        InterfaceC0408r0 interfaceC0408r0 = this.f335r;
        if (interfaceC0408r0 != null) {
            interfaceC0408r0.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f332o;
        if (actionBar != null) {
            actionBar.mo13015n(charSequence);
            return;
        }
        TextView textView = this.f295C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x013c, code lost:
        if (androidx.core.view.ViewCompat.C0817g.m11729c(r9) != false) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0049  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.appcompat.view.AbstractC0178a mo13004E(@androidx.annotation.NonNull androidx.appcompat.view.AbstractC0178a.InterfaceC0179a r9) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0114h.mo13004E(androidx.appcompat.view.a$a):androidx.appcompat.view.a");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef A[ADDED_TO_REGION] */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m13003F(boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0114h.m13003F(boolean, boolean):boolean");
    }

    /* renamed from: G */
    public final void m13002G(@NonNull Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f329l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0125j)) {
                C0125j c0125j = new C0125j(callback);
                this.f330m = c0125j;
                window.setCallback(c0125j);
                Context context = this.f327k;
                OnBackInvokedDispatcher onBackInvokedDispatcher2 = null;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f290m0);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    C0363j m12615a = C0363j.m12615a();
                    synchronized (m12615a) {
                        drawable = m12615a.f1281a.m12594g(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.f329l = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f326j0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f328k0) != null) {
                        C0124i.m12949c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f328k0 = null;
                    }
                    Object obj = this.f325j;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            onBackInvokedDispatcher2 = C0124i.m12951a(activity);
                        }
                    }
                    this.f326j0 = onBackInvokedDispatcher2;
                    m12981b0();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: I */
    public final void m13000I(int i, C0131o c0131o, C0210g c0210g) {
        if (c0210g == null) {
            if (c0131o == null && i >= 0) {
                C0131o[] c0131oArr = this.f305M;
                if (i < c0131oArr.length) {
                    c0131o = c0131oArr[i];
                }
            }
            if (c0131o != null) {
                c0210g = c0131o.f369h;
            }
        }
        if ((c0131o == null || c0131o.f374m) && !this.f310R) {
            C0125j c0125j = this.f330m;
            Window.Callback callback = this.f329l.getCallback();
            c0125j.getClass();
            try {
                c0125j.f352e = true;
                callback.onPanelClosed(i, c0210g);
            } finally {
                c0125j.f352e = false;
            }
        }
    }

    /* renamed from: J */
    public final void m12999J(@NonNull C0210g c0210g) {
        if (this.f304L) {
            return;
        }
        this.f304L = true;
        this.f335r.mo12527i();
        Window.Callback m12989T = m12989T();
        if (m12989T != null && !this.f310R) {
            m12989T.onPanelClosed(108, c0210g);
        }
        this.f304L = false;
    }

    /* renamed from: K */
    public final void m12998K(C0131o c0131o, boolean z) {
        C0130n c0130n;
        InterfaceC0408r0 interfaceC0408r0;
        if (z && c0131o.f362a == 0 && (interfaceC0408r0 = this.f335r) != null && interfaceC0408r0.mo12535a()) {
            m12999J(c0131o.f369h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f327k.getSystemService("window");
        if (windowManager != null && c0131o.f374m && (c0130n = c0131o.f366e) != null) {
            windowManager.removeView(c0130n);
            if (z) {
                m13000I(c0131o.f362a, c0131o, null);
            }
        }
        c0131o.f372k = false;
        c0131o.f373l = false;
        c0131o.f374m = false;
        c0131o.f367f = null;
        c0131o.f375n = true;
        if (this.f306N == c0131o) {
            this.f306N = null;
        }
        if (c0131o.f362a == 0) {
            m12981b0();
        }
    }

    /* renamed from: M */
    public final boolean m12996M(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj = this.f325j;
        boolean z4 = true;
        if (((obj instanceof C0957k.InterfaceC0958a) || (obj instanceof DialogC0147v)) && (decorView = this.f329l.getDecorView()) != null && C0957k.m11427a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            C0125j c0125j = this.f330m;
            Window.Callback callback = this.f329l.getCallback();
            c0125j.getClass();
            try {
                c0125j.f351d = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                c0125j.f351d = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() != 0) {
                        return true;
                    }
                    C0131o m12990S = m12990S(0);
                    if (m12990S.f374m) {
                        return true;
                    }
                    m12983Z(m12990S, keyEvent);
                    return true;
                }
            } else {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z4 = false;
                }
                this.f307O = z4;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f338u != null) {
                    return true;
                }
                C0131o m12990S2 = m12990S(0);
                InterfaceC0408r0 interfaceC0408r0 = this.f335r;
                Context context = this.f327k;
                if (interfaceC0408r0 != null && interfaceC0408r0.mo12533c() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    if (!this.f335r.mo12535a()) {
                        if (!this.f310R && m12983Z(m12990S2, keyEvent)) {
                            z2 = this.f335r.mo12529g();
                        }
                        z2 = false;
                    } else {
                        z2 = this.f335r.mo12530f();
                    }
                } else {
                    boolean z5 = m12990S2.f374m;
                    if (!z5 && !m12990S2.f373l) {
                        if (m12990S2.f372k) {
                            if (m12990S2.f376o) {
                                m12990S2.f372k = false;
                                z3 = m12983Z(m12990S2, keyEvent);
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                m12985X(m12990S2, keyEvent);
                                z2 = true;
                            }
                        }
                        z2 = false;
                    } else {
                        m12998K(m12990S2, true);
                        z2 = z5;
                    }
                }
                if (!z2) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (m12986W()) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public final void m12995N(int i) {
        C0131o m12990S = m12990S(i);
        if (m12990S.f369h != null) {
            Bundle bundle = new Bundle();
            m12990S.f369h.m12839t(bundle);
            if (bundle.size() > 0) {
                m12990S.f377p = bundle;
            }
            m12990S.f369h.m12836w();
            m12990S.f369h.clear();
        }
        m12990S.f376o = true;
        m12990S.f375n = true;
        if ((i == 108 || i == 0) && this.f335r != null) {
            C0131o m12990S2 = m12990S(0);
            m12990S2.f372k = false;
            m12983Z(m12990S2, null);
        }
    }

    /* renamed from: O */
    public final void m12994O() {
        int i;
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.f293A) {
            int[] iArr = C0157c.f419j;
            Context context2 = this.f327k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    mo12961x(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    mo12961x(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    mo12961x(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    mo12961x(10);
                }
                this.f302J = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                m12993P();
                this.f329l.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.f303K) {
                    if (this.f302J) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.f300H = false;
                        this.f299G = false;
                    } else if (this.f299G) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new C0181c(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        InterfaceC0408r0 interfaceC0408r0 = (InterfaceC0408r0) viewGroup.findViewById(R.id.decor_content_parent);
                        this.f335r = interfaceC0408r0;
                        interfaceC0408r0.setWindowCallback(m12989T());
                        if (this.f300H) {
                            this.f335r.mo12528h(109);
                        }
                        if (this.f297E) {
                            this.f335r.mo12528h(2);
                        }
                        if (this.f298F) {
                            this.f335r.mo12528h(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    if (this.f301I) {
                        i = R.layout.abc_screen_simple_overlay_action_mode;
                    } else {
                        i = R.layout.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    C0133i c0133i = new C0133i(this);
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0819i.m11701u(viewGroup, c0133i);
                    if (this.f335r == null) {
                        this.f295C = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = C0362i2.f1277a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e) {
                        e = e;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e2) {
                        e = e2;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f329l.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.f329l.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C0134j(this));
                    this.f294B = viewGroup;
                    Object obj = this.f325j;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.f334q;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        InterfaceC0408r0 interfaceC0408r02 = this.f335r;
                        if (interfaceC0408r02 != null) {
                            interfaceC0408r02.setWindowTitle(charSequence);
                        } else {
                            ActionBar actionBar = this.f332o;
                            if (actionBar != null) {
                                actionBar.mo13015n(charSequence);
                            } else {
                                TextView textView = this.f295C;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f294B.findViewById(16908290);
                    View decorView = this.f329l.getDecorView();
                    contentFrameLayout2.f881g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                    if (ViewCompat.C0817g.m11729c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f293A = true;
                    C0131o m12990S = m12990S(0);
                    if (!this.f310R && m12990S.f369h == null) {
                        this.f319d0 |= 4096;
                        if (!this.f318Z) {
                            ViewCompat.C0814d.m11752m(this.f329l.getDecorView(), this.f320e0);
                            this.f318Z = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f299G + ", windowActionBarOverlay: " + this.f300H + ", android:windowIsFloating: " + this.f302J + ", windowActionModeOverlay: " + this.f301I + ", windowNoTitle: " + this.f303K + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    /* renamed from: P */
    public final void m12993P() {
        if (this.f329l == null) {
            Object obj = this.f325j;
            if (obj instanceof Activity) {
                m13002G(((Activity) obj).getWindow());
            }
        }
        if (this.f329l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: Q */
    public final AbstractC0127l m12992Q(@NonNull Context context) {
        if (this.f316X == null) {
            if (C0104d0.f247d == null) {
                Context applicationContext = context.getApplicationContext();
                C0104d0.f247d = new C0104d0(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
            }
            this.f316X = new C0129m(C0104d0.f247d);
        }
        return this.f316X;
    }

    /* renamed from: S */
    public final C0131o m12990S(int i) {
        C0131o[] c0131oArr = this.f305M;
        if (c0131oArr == null || c0131oArr.length <= i) {
            C0131o[] c0131oArr2 = new C0131o[i + 1];
            if (c0131oArr != null) {
                System.arraycopy(c0131oArr, 0, c0131oArr2, 0, c0131oArr.length);
            }
            this.f305M = c0131oArr2;
            c0131oArr = c0131oArr2;
        }
        C0131o c0131o = c0131oArr[i];
        if (c0131o == null) {
            C0131o c0131o2 = new C0131o(i);
            c0131oArr[i] = c0131o2;
            return c0131o2;
        }
        return c0131o;
    }

    /* renamed from: T */
    public final Window.Callback m12989T() {
        return this.f329l.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12988U() {
        /*
            r3 = this;
            r3.m12994O()
            boolean r0 = r3.f299G
            if (r0 == 0) goto L33
            androidx.appcompat.app.ActionBar r0 = r3.f332o
            if (r0 == 0) goto Lc
            goto L33
        Lc:
            java.lang.Object r0 = r3.f325j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            androidx.appcompat.app.e0 r1 = new androidx.appcompat.app.e0
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.f300H
            r1.<init>(r2, r0)
        L1b:
            r3.f332o = r1
            goto L2a
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2a
            androidx.appcompat.app.e0 r1 = new androidx.appcompat.app.e0
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L1b
        L2a:
            androidx.appcompat.app.ActionBar r0 = r3.f332o
            if (r0 == 0) goto L33
            boolean r1 = r3.f321f0
            r0.mo13017l(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0114h.m12988U():void");
    }

    /* renamed from: V */
    public final int m12987V(@NonNull Context context, int i) {
        AbstractC0127l m12992Q;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        if (this.f317Y == null) {
                            this.f317Y = new C0126k(context);
                        }
                        m12992Q = this.f317Y;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                m12992Q = m12992Q(context);
            }
            return m12992Q.mo12944c();
        }
        return i;
    }

    /* renamed from: W */
    public final boolean m12986W() {
        boolean z = this.f307O;
        this.f307O = false;
        C0131o m12990S = m12990S(0);
        if (m12990S.f374m) {
            if (!z) {
                m12998K(m12990S, true);
            }
            return true;
        }
        AbstractC0178a abstractC0178a = this.f338u;
        if (abstractC0178a != null) {
            abstractC0178a.mo12894c();
            return true;
        }
        m12988U();
        ActionBar actionBar = this.f332o;
        if (actionBar == null || !actionBar.mo13023b()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0151, code lost:
        if (r2 != null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0175, code lost:
        if (r2.f675f.getCount() > 0) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017d  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12985X(androidx.appcompat.app.LayoutInflater$Factory2C0114h.C0131o r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0114h.m12985X(androidx.appcompat.app.h$o, android.view.KeyEvent):void");
    }

    /* renamed from: Y */
    public final boolean m12984Y(C0131o c0131o, int i, KeyEvent keyEvent) {
        C0210g c0210g;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0131o.f372k || m12983Z(c0131o, keyEvent)) && (c0210g = c0131o.f369h) != null) {
            return c0210g.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: Z */
    public final boolean m12983Z(C0131o c0131o, KeyEvent keyEvent) {
        boolean z;
        InterfaceC0408r0 interfaceC0408r0;
        InterfaceC0408r0 interfaceC0408r02;
        Resources.Theme theme;
        int i;
        boolean z2;
        InterfaceC0408r0 interfaceC0408r03;
        InterfaceC0408r0 interfaceC0408r04;
        if (this.f310R) {
            return false;
        }
        if (c0131o.f372k) {
            return true;
        }
        C0131o c0131o2 = this.f306N;
        if (c0131o2 != null && c0131o2 != c0131o) {
            m12998K(c0131o2, false);
        }
        Window.Callback m12989T = m12989T();
        int i2 = c0131o.f362a;
        if (m12989T != null) {
            c0131o.f368g = m12989T.onCreatePanelView(i2);
        }
        if (i2 != 0 && i2 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (interfaceC0408r04 = this.f335r) != null) {
            interfaceC0408r04.mo12534b();
        }
        if (c0131o.f368g == null && (!z || !(this.f332o instanceof C0092b0))) {
            C0210g c0210g = c0131o.f369h;
            if (c0210g == null || c0131o.f376o) {
                if (c0210g == null) {
                    Context context = this.f327k;
                    if ((i2 == 0 || i2 == 108) && this.f335r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            C0181c c0181c = new C0181c(context, 0);
                            c0181c.getTheme().setTo(theme);
                            context = c0181c;
                        }
                    }
                    C0210g c0210g2 = new C0210g(context);
                    c0210g2.f689e = this;
                    C0210g c0210g3 = c0131o.f369h;
                    if (c0210g2 != c0210g3) {
                        if (c0210g3 != null) {
                            c0210g3.m12841r(c0131o.f370i);
                        }
                        c0131o.f369h = c0210g2;
                        C0207e c0207e = c0131o.f370i;
                        if (c0207e != null) {
                            c0210g2.m12849b(c0207e, c0210g2.f685a);
                        }
                    }
                    if (c0131o.f369h == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0408r02 = this.f335r) != null) {
                    if (this.f336s == null) {
                        this.f336s = new C0118d();
                    }
                    interfaceC0408r02.mo12531e(c0131o.f369h, this.f336s);
                }
                c0131o.f369h.m12836w();
                if (!m12989T.onCreatePanelMenu(i2, c0131o.f369h)) {
                    C0210g c0210g4 = c0131o.f369h;
                    if (c0210g4 != null) {
                        if (c0210g4 != null) {
                            c0210g4.m12841r(c0131o.f370i);
                        }
                        c0131o.f369h = null;
                    }
                    if (z && (interfaceC0408r0 = this.f335r) != null) {
                        interfaceC0408r0.mo12531e(null, this.f336s);
                    }
                    return false;
                }
                c0131o.f376o = false;
            }
            c0131o.f369h.m12836w();
            Bundle bundle = c0131o.f377p;
            if (bundle != null) {
                c0131o.f369h.m12840s(bundle);
                c0131o.f377p = null;
            }
            if (!m12989T.onPreparePanel(0, c0131o.f368g, c0131o.f369h)) {
                if (z && (interfaceC0408r03 = this.f335r) != null) {
                    interfaceC0408r03.mo12531e(null, this.f336s);
                }
                c0131o.f369h.m12837v();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c0131o.f369h.setQwertyMode(z2);
            c0131o.f369h.m12837v();
        }
        c0131o.f372k = true;
        c0131o.f373l = false;
        this.f306N = c0131o;
        return true;
    }

    @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
    /* renamed from: a */
    public final boolean mo12747a(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
        int i;
        int i2;
        C0131o c0131o;
        Window.Callback m12989T = m12989T();
        if (m12989T != null && !this.f310R) {
            C0210g mo12811k = c0210g.mo12811k();
            C0131o[] c0131oArr = this.f305M;
            if (c0131oArr != null) {
                i = c0131oArr.length;
                i2 = 0;
            } else {
                i = 0;
                i2 = 0;
            }
            while (true) {
                if (i2 < i) {
                    c0131o = c0131oArr[i2];
                    if (c0131o != null && c0131o.f369h == mo12811k) {
                        break;
                    }
                    i2++;
                } else {
                    c0131o = null;
                    break;
                }
            }
            if (c0131o != null) {
                return m12989T.onMenuItemSelected(c0131o.f362a, menuItem);
            }
        }
        return false;
    }

    /* renamed from: a0 */
    public final void m12982a0() {
        if (this.f293A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
    /* renamed from: b */
    public final void mo12746b(@NonNull C0210g c0210g) {
        InterfaceC0408r0 interfaceC0408r0 = this.f335r;
        if (interfaceC0408r0 == null || !interfaceC0408r0.mo12533c() || (ViewConfiguration.get(this.f327k).hasPermanentMenuKey() && !this.f335r.mo12532d())) {
            C0131o m12990S = m12990S(0);
            m12990S.f375n = true;
            m12998K(m12990S, false);
            m12985X(m12990S, null);
            return;
        }
        Window.Callback m12989T = m12989T();
        if (this.f335r.mo12535a()) {
            this.f335r.mo12530f();
            if (this.f310R) {
                return;
            }
            m12989T.onPanelClosed(108, m12990S(0).f369h);
        } else if (m12989T == null || this.f310R) {
        } else {
            if (this.f318Z && (1 & this.f319d0) != 0) {
                View decorView = this.f329l.getDecorView();
                RunnableC0115a runnableC0115a = this.f320e0;
                decorView.removeCallbacks(runnableC0115a);
                runnableC0115a.run();
            }
            C0131o m12990S2 = m12990S(0);
            C0210g c0210g2 = m12990S2.f369h;
            if (c0210g2 == null || m12990S2.f376o || !m12989T.onPreparePanel(0, m12990S2.f368g, c0210g2)) {
                return;
            }
            m12989T.onMenuOpened(108, m12990S2.f369h);
            this.f335r.mo12529g();
        }
    }

    /* renamed from: b0 */
    public final void m12981b0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f326j0 != null && (m12990S(0).f374m || this.f338u != null)) {
                z = true;
            }
            if (z && this.f328k0 == null) {
                this.f328k0 = C0124i.m12950b(this.f326j0, this);
            } else if (!z && (onBackInvokedCallback = this.f328k0) != null) {
                C0124i.m12949c(this.f326j0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: c */
    public final void mo12980c(View view, ViewGroup.LayoutParams layoutParams) {
        m12994O();
        ((ViewGroup) this.f294B.findViewById(16908290)).addView(view, layoutParams);
        this.f330m.m12948a(this.f329l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @NonNull
    @CallSuper
    /* renamed from: d */
    public final Context mo12979d(@NonNull final Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z = true;
        this.f308P = true;
        int i9 = this.f312T;
        if (i9 == -100) {
            i9 = AppCompatDelegate.f206b;
        }
        int m12987V = m12987V(context, i9);
        if (AppCompatDelegate.m13038n(context) && AppCompatDelegate.m13038n(context)) {
            if (BuildCompat.m11866c()) {
                if (!AppCompatDelegate.f210f) {
                    AppCompatDelegate.f205a.execute(new Runnable() { // from class: androidx.appcompat.app.f
                        /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
                            if (r5 != null) goto L19;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final void run() {
                            /*
                                r7 = this;
                                int r0 = android.os.Build.VERSION.SDK_INT
                                r1 = 33
                                r2 = 1
                                if (r0 < r1) goto L83
                                android.content.ComponentName r0 = new android.content.ComponentName
                                android.content.Context r1 = r1
                                java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
                                r0.<init>(r1, r3)
                                android.content.pm.PackageManager r3 = r1.getPackageManager()
                                int r3 = r3.getComponentEnabledSetting(r0)
                                if (r3 == r2) goto L83
                                boolean r3 = androidx.core.p003os.BuildCompat.m11866c()
                                java.lang.String r4 = "locale"
                                if (r3 == 0) goto L5c
                                androidx.collection.d<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r3 = androidx.appcompat.app.AppCompatDelegate.f211g
                                java.util.Iterator r3 = r3.iterator()
                            L28:
                                r5 = r3
                                androidx.collection.h$a r5 = (androidx.collection.AbstractC0476h.C0477a) r5
                                boolean r6 = r5.hasNext()
                                if (r6 == 0) goto L4a
                                java.lang.Object r5 = r5.next()
                                java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
                                java.lang.Object r5 = r5.get()
                                androidx.appcompat.app.AppCompatDelegate r5 = (androidx.appcompat.app.AppCompatDelegate) r5
                                if (r5 == 0) goto L28
                                android.content.Context r5 = r5.mo12976g()
                                if (r5 == 0) goto L28
                                java.lang.Object r3 = r5.getSystemService(r4)
                                goto L4b
                            L4a:
                                r3 = 0
                            L4b:
                                if (r3 == 0) goto L61
                                android.os.LocaleList r3 = androidx.appcompat.app.AppCompatDelegate.C0087b.m13035a(r3)
                                androidx.core.os.e r5 = new androidx.core.os.e
                                androidx.core.os.p r6 = new androidx.core.os.p
                                r6.<init>(r3)
                                r5.<init>(r6)
                                goto L63
                            L5c:
                                androidx.core.os.e r5 = androidx.appcompat.app.AppCompatDelegate.f207c
                                if (r5 == 0) goto L61
                                goto L63
                            L61:
                                androidx.core.os.e r5 = androidx.core.p003os.C0735e.f2424b
                            L63:
                                androidx.core.os.j r3 = r5.f2425a
                                boolean r3 = r3.isEmpty()
                                if (r3 == 0) goto L7c
                                java.lang.String r3 = androidx.appcompat.app.C0153z.m12926b(r1)
                                java.lang.Object r4 = r1.getSystemService(r4)
                                if (r4 == 0) goto L7c
                                android.os.LocaleList r3 = androidx.appcompat.app.AppCompatDelegate.C0086a.m13036a(r3)
                                androidx.appcompat.app.AppCompatDelegate.C0087b.m13034b(r4, r3)
                            L7c:
                                android.content.pm.PackageManager r1 = r1.getPackageManager()
                                r1.setComponentEnabledSetting(r0, r2, r2)
                            L83:
                                androidx.appcompat.app.AppCompatDelegate.f210f = r2
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.RunnableC0112f.run():void");
                        }
                    });
                }
            } else {
                synchronized (AppCompatDelegate.f213i) {
                    C0735e c0735e = AppCompatDelegate.f207c;
                    if (c0735e == null) {
                        if (AppCompatDelegate.f208d == null) {
                            AppCompatDelegate.f208d = C0735e.m11859b(C0153z.m12926b(context));
                        }
                        if (!AppCompatDelegate.f208d.f2425a.isEmpty()) {
                            AppCompatDelegate.f207c = AppCompatDelegate.f208d;
                        }
                    } else if (!c0735e.equals(AppCompatDelegate.f208d)) {
                        C0735e c0735e2 = AppCompatDelegate.f207c;
                        AppCompatDelegate.f208d = c0735e2;
                        C0153z.m12927a(context, c0735e2.f2425a.mo11835a());
                    }
                }
            }
        }
        C0735e m13001H = m13001H(context);
        boolean z2 = false;
        Configuration configuration = null;
        if (f292o0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m12997L(context, m12987V, m13001H, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0181c) {
            try {
                ((C0181c) context).m12897a(m12997L(context, m12987V, m13001H, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f291n0) {
            return context;
        }
        int i10 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i11 = configuration3.mcc;
                int i12 = configuration4.mcc;
                if (i11 != i12) {
                    configuration.mcc = i12;
                }
                int i13 = configuration3.mnc;
                int i14 = configuration4.mnc;
                if (i13 != i14) {
                    configuration.mnc = i14;
                }
                if (i10 >= 24) {
                    C0123h.m12955a(configuration3, configuration4, configuration);
                } else if (!C0799c.m11795a(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i15 = configuration3.touchscreen;
                int i16 = configuration4.touchscreen;
                if (i15 != i16) {
                    configuration.touchscreen = i16;
                }
                int i17 = configuration3.keyboard;
                int i18 = configuration4.keyboard;
                if (i17 != i18) {
                    configuration.keyboard = i18;
                }
                int i19 = configuration3.keyboardHidden;
                int i20 = configuration4.keyboardHidden;
                if (i19 != i20) {
                    configuration.keyboardHidden = i20;
                }
                int i21 = configuration3.navigation;
                int i22 = configuration4.navigation;
                if (i21 != i22) {
                    configuration.navigation = i22;
                }
                int i23 = configuration3.navigationHidden;
                int i24 = configuration4.navigationHidden;
                if (i23 != i24) {
                    configuration.navigationHidden = i24;
                }
                int i25 = configuration3.orientation;
                int i26 = configuration4.orientation;
                if (i25 != i26) {
                    configuration.orientation = i26;
                }
                int i27 = configuration3.screenLayout & 15;
                int i28 = configuration4.screenLayout & 15;
                if (i27 != i28) {
                    configuration.screenLayout |= i28;
                }
                int i29 = configuration3.screenLayout & 192;
                int i30 = configuration4.screenLayout & 192;
                if (i29 != i30) {
                    configuration.screenLayout |= i30;
                }
                int i31 = configuration3.screenLayout & 48;
                int i32 = configuration4.screenLayout & 48;
                if (i31 != i32) {
                    configuration.screenLayout |= i32;
                }
                int i33 = configuration3.screenLayout & 768;
                int i34 = configuration4.screenLayout & 768;
                if (i33 != i34) {
                    configuration.screenLayout |= i34;
                }
                if (i10 >= 26) {
                    i = configuration3.colorMode;
                    int i35 = i & 3;
                    i2 = configuration4.colorMode;
                    if (i35 != (i2 & 3)) {
                        i7 = configuration.colorMode;
                        i8 = configuration4.colorMode;
                        configuration.colorMode = i7 | (i8 & 3);
                    }
                    i3 = configuration3.colorMode;
                    int i36 = i3 & 12;
                    i4 = configuration4.colorMode;
                    if (i36 != (i4 & 12)) {
                        i5 = configuration.colorMode;
                        i6 = configuration4.colorMode;
                        configuration.colorMode = i5 | (i6 & 12);
                    }
                }
                int i37 = configuration3.uiMode & 15;
                int i38 = configuration4.uiMode & 15;
                if (i37 != i38) {
                    configuration.uiMode |= i38;
                }
                int i39 = configuration3.uiMode & 48;
                int i40 = configuration4.uiMode & 48;
                if (i39 != i40) {
                    configuration.uiMode |= i40;
                }
                int i41 = configuration3.screenWidthDp;
                int i42 = configuration4.screenWidthDp;
                if (i41 != i42) {
                    configuration.screenWidthDp = i42;
                }
                int i43 = configuration3.screenHeightDp;
                int i44 = configuration4.screenHeightDp;
                if (i43 != i44) {
                    configuration.screenHeightDp = i44;
                }
                int i45 = configuration3.smallestScreenWidthDp;
                int i46 = configuration4.smallestScreenWidthDp;
                if (i45 != i46) {
                    configuration.smallestScreenWidthDp = i46;
                }
                int i47 = configuration3.densityDpi;
                int i48 = configuration4.densityDpi;
                if (i47 != i48) {
                    configuration.densityDpi = i48;
                }
            }
        }
        Configuration m12997L = m12997L(context, m12987V, m13001H, configuration, true);
        C0181c c0181c = new C0181c(context, 2132017828);
        c0181c.m12897a(m12997L);
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C0676f.C0682f.m11980a(c0181c.getTheme());
        }
        return c0181c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0110, code lost:
        if (r10.equals("ImageButton") == false) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fd A[Catch: all -> 0x0207, Exception -> 0x020d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x020d, all -> 0x0207, blocks: (B:108:0x01d6, B:111:0x01e3, B:113:0x01e7, B:118:0x01fd), top: B:151:0x01d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018a  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View mo12978e(java.lang.String r10, @androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0114h.mo12978e(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @Nullable
    /* renamed from: f */
    public final <T extends View> T mo12977f(@IdRes int i) {
        m12994O();
        return (T) this.f329l.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: g */
    public final Context mo12976g() {
        return this.f327k;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: h */
    public final C0116b mo12975h() {
        return new C0116b();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: i */
    public final int mo12974i() {
        return this.f312T;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: j */
    public final MenuInflater mo12973j() {
        if (this.f333p == null) {
            m12988U();
            ActionBar actionBar = this.f332o;
            this.f333p = new C0186f(actionBar != null ? actionBar.mo13020e() : this.f327k);
        }
        return this.f333p;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: k */
    public final ActionBar mo12972k() {
        m12988U();
        return this.f332o;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: l */
    public final void mo12971l() {
        LayoutInflater from = LayoutInflater.from(this.f327k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof LayoutInflater$Factory2C0114h)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: m */
    public final void mo12970m() {
        if (this.f332o != null) {
            m12988U();
            if (!this.f332o.mo13030f()) {
                this.f319d0 |= 1;
                if (!this.f318Z) {
                    View decorView = this.f329l.getDecorView();
                    WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                    ViewCompat.C0814d.m11752m(decorView, this.f320e0);
                    this.f318Z = true;
                }
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: o */
    public final void mo12969o(Configuration configuration) {
        if (this.f299G && this.f293A) {
            m12988U();
            ActionBar actionBar = this.f332o;
            if (actionBar != null) {
                actionBar.mo13019g();
            }
        }
        C0363j m12615a = C0363j.m12615a();
        Context context = this.f327k;
        synchronized (m12615a) {
            m12615a.f1281a.m12590k(context);
        }
        this.f311S = new Configuration(this.f327k.getResources().getConfiguration());
        m13003F(false, false);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo12978e(str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return mo12978e(str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: p */
    public final void mo12968p() {
        String str;
        this.f308P = true;
        m13003F(false, true);
        m12993P();
        Object obj = this.f325j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = C0635n.m12064b(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar actionBar = this.f332o;
                if (actionBar == null) {
                    this.f321f0 = true;
                } else {
                    actionBar.mo13017l(true);
                }
            }
            synchronized (AppCompatDelegate.f212h) {
                AppCompatDelegate.m13037w(this);
                AppCompatDelegate.f211g.add(new WeakReference<>(this));
            }
        }
        this.f311S = new Configuration(this.f327k.getResources().getConfiguration());
        this.f309Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo12967q() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f325j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.f212h
            monitor-enter(r0)
            androidx.appcompat.app.AppCompatDelegate.m13037w(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f318Z
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f329l
            android.view.View r0 = r0.getDecorView()
            androidx.appcompat.app.h$a r1 = r3.f320e0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f310R = r0
            int r0 = r3.f312T
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f325j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            androidx.collection.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0114h.f289l0
            java.lang.Object r1 = r3.f325j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f312T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            androidx.collection.i<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0114h.f289l0
            java.lang.Object r1 = r3.f325j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            androidx.appcompat.app.ActionBar r0 = r3.f332o
            if (r0 == 0) goto L63
            r0.mo13029h()
        L63:
            androidx.appcompat.app.h$m r0 = r3.f316X
            if (r0 == 0) goto L6a
            r0.m12947a()
        L6a:
            androidx.appcompat.app.h$k r0 = r3.f317Y
            if (r0 == 0) goto L71
            r0.m12947a()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0114h.mo12967q():void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: r */
    public final void mo12966r() {
        m12994O();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: s */
    public final void mo12965s() {
        m12988U();
        ActionBar actionBar = this.f332o;
        if (actionBar != null) {
            actionBar.mo13016m(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: t */
    public final void mo12964t() {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: u */
    public final void mo12963u() {
        m13003F(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: v */
    public final void mo12962v() {
        m12988U();
        ActionBar actionBar = this.f332o;
        if (actionBar != null) {
            actionBar.mo13016m(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: x */
    public final boolean mo12961x(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f303K && i == 108) {
            return false;
        }
        if (this.f299G && i == 1) {
            this.f299G = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.f329l.requestFeature(i);
                            }
                            m12982a0();
                            this.f300H = true;
                            return true;
                        }
                        m12982a0();
                        this.f299G = true;
                        return true;
                    }
                    m12982a0();
                    this.f301I = true;
                    return true;
                }
                m12982a0();
                this.f298F = true;
                return true;
            }
            m12982a0();
            this.f297E = true;
            return true;
        }
        m12982a0();
        this.f303K = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: y */
    public final void mo12960y(int i) {
        m12994O();
        ViewGroup viewGroup = (ViewGroup) this.f294B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f327k).inflate(i, viewGroup);
        this.f330m.m12948a(this.f329l.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: z */
    public final void mo12959z(View view) {
        m12994O();
        ViewGroup viewGroup = (ViewGroup) this.f294B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f330m.m12948a(this.f329l.getCallback());
    }
}
