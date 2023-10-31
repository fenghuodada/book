package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.LayoutInflater$Factory2C0114h;
import androidx.appcompat.view.menu.C0210g;
import androidx.appcompat.view.menu.InterfaceC0226m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0307b2;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.app.b0 */
/* loaded from: classes.dex */
public final class C0092b0 extends ActionBar {

    /* renamed from: a */
    public final C0307b2 f224a;

    /* renamed from: b */
    public final Window.Callback f225b;

    /* renamed from: c */
    public final C0097e f226c;

    /* renamed from: d */
    public boolean f227d;

    /* renamed from: e */
    public boolean f228e;

    /* renamed from: f */
    public boolean f229f;

    /* renamed from: g */
    public final ArrayList<ActionBar.InterfaceC0081b> f230g = new ArrayList<>();

    /* renamed from: h */
    public final RunnableC0093a f231h = new RunnableC0093a();

    /* renamed from: androidx.appcompat.app.b0$a */
    /* loaded from: classes.dex */
    public class RunnableC0093a implements Runnable {
        public RunnableC0093a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0210g c0210g;
            C0092b0 c0092b0 = C0092b0.this;
            Window.Callback callback = c0092b0.f225b;
            Menu m13026p = c0092b0.m13026p();
            if (m13026p instanceof C0210g) {
                c0210g = (C0210g) m13026p;
            } else {
                c0210g = null;
            }
            if (c0210g != null) {
                c0210g.m12836w();
            }
            try {
                m13026p.clear();
                if (!callback.onCreatePanelMenu(0, m13026p) || !callback.onPreparePanel(0, null, m13026p)) {
                    m13026p.clear();
                }
            } finally {
                if (c0210g != null) {
                    c0210g.m12837v();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b0$b */
    /* loaded from: classes.dex */
    public class C0094b implements Toolbar.InterfaceC0280h {
        public C0094b() {
        }
    }

    /* renamed from: androidx.appcompat.app.b0$c */
    /* loaded from: classes.dex */
    public final class C0095c implements InterfaceC0226m.InterfaceC0227a {

        /* renamed from: a */
        public boolean f234a;

        public C0095c() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: b */
        public final void mo12698b(@NonNull C0210g c0210g, boolean z) {
            if (this.f234a) {
                return;
            }
            this.f234a = true;
            C0092b0 c0092b0 = C0092b0.this;
            c0092b0.f224a.mo12514h();
            c0092b0.f225b.onPanelClosed(108, c0210g);
            this.f234a = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
        /* renamed from: c */
        public final boolean mo12697c(@NonNull C0210g c0210g) {
            C0092b0.this.f225b.onMenuOpened(108, c0210g);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.b0$d */
    /* loaded from: classes.dex */
    public final class C0096d implements C0210g.InterfaceC0211a {
        public C0096d() {
        }

        @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
        /* renamed from: a */
        public final boolean mo12747a(@NonNull C0210g c0210g, @NonNull MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0210g.InterfaceC0211a
        /* renamed from: b */
        public final void mo12746b(@NonNull C0210g c0210g) {
            C0092b0 c0092b0 = C0092b0.this;
            boolean mo12521a = c0092b0.f224a.mo12521a();
            Window.Callback callback = c0092b0.f225b;
            if (mo12521a) {
                callback.onPanelClosed(108, c0210g);
            } else if (callback.onPreparePanel(0, null, c0210g)) {
                callback.onMenuOpened(108, c0210g);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b0$e */
    /* loaded from: classes.dex */
    public class C0097e implements LayoutInflater$Factory2C0114h.InterfaceC0117c {
        public C0097e() {
        }
    }

    public C0092b0(@NonNull Toolbar toolbar, @Nullable CharSequence charSequence, @NonNull LayoutInflater$Factory2C0114h.C0125j c0125j) {
        C0094b c0094b = new C0094b();
        toolbar.getClass();
        C0307b2 c0307b2 = new C0307b2(toolbar, false);
        this.f224a = c0307b2;
        c0125j.getClass();
        this.f225b = c0125j;
        c0307b2.f1132l = c0125j;
        toolbar.setOnMenuItemClickListener(c0094b);
        c0307b2.setWindowTitle(charSequence);
        this.f226c = new C0097e();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: a */
    public final boolean mo13031a() {
        return this.f224a.mo12516f();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: b */
    public final boolean mo13023b() {
        C0307b2 c0307b2 = this.f224a;
        if (c0307b2.mo12512j()) {
            c0307b2.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: c */
    public final void mo13022c(boolean z) {
        if (z == this.f229f) {
            return;
        }
        this.f229f = z;
        ArrayList<ActionBar.InterfaceC0081b> arrayList = this.f230g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).m13042a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: d */
    public final int mo13021d() {
        return this.f224a.f1122b;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: e */
    public final Context mo13020e() {
        return this.f224a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: f */
    public final boolean mo13030f() {
        C0307b2 c0307b2 = this.f224a;
        Toolbar toolbar = c0307b2.f1121a;
        RunnableC0093a runnableC0093a = this.f231h;
        toolbar.removeCallbacks(runnableC0093a);
        Toolbar toolbar2 = c0307b2.f1121a;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11752m(toolbar2, runnableC0093a);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public final void mo13019g() {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public final void mo13029h() {
        this.f224a.f1121a.removeCallbacks(this.f231h);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public final boolean mo13018i(int i, KeyEvent keyEvent) {
        Menu m13026p = m13026p();
        if (m13026p != null) {
            m13026p.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            return m13026p.performShortcut(i, keyEvent, 0);
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public final boolean mo13028j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo13027k();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public final boolean mo13027k() {
        return this.f224a.mo12515g();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public final void mo13017l(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public final void mo13016m(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    public final void mo13015n(CharSequence charSequence) {
        this.f224a.setWindowTitle(charSequence);
    }

    /* renamed from: p */
    public final Menu m13026p() {
        boolean z = this.f228e;
        C0307b2 c0307b2 = this.f224a;
        if (!z) {
            C0095c c0095c = new C0095c();
            C0096d c0096d = new C0096d();
            Toolbar toolbar = c0307b2.f1121a;
            toolbar.f1023N = c0095c;
            toolbar.f1024O = c0096d;
            ActionMenuView actionMenuView = toolbar.f1030a;
            if (actionMenuView != null) {
                actionMenuView.f852u = c0095c;
                actionMenuView.f853v = c0096d;
            }
            this.f228e = true;
        }
        return c0307b2.f1121a.getMenu();
    }
}
