package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.LayoutInflater$Factory2C0114h;
import androidx.appcompat.view.menu.C0210g;
import androidx.core.view.C0922g2;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes.dex */
public interface InterfaceC0412s0 {
    /* renamed from: a */
    boolean mo12521a();

    /* renamed from: b */
    void mo12520b();

    /* renamed from: c */
    boolean mo12519c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo12518d();

    /* renamed from: e */
    void mo12517e(C0210g c0210g, LayoutInflater$Factory2C0114h.C0118d c0118d);

    /* renamed from: f */
    boolean mo12516f();

    /* renamed from: g */
    boolean mo12515g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    void mo12514h();

    /* renamed from: i */
    void mo12513i();

    /* renamed from: j */
    boolean mo12512j();

    /* renamed from: k */
    void mo12511k(int i);

    /* renamed from: l */
    void mo12510l();

    /* renamed from: m */
    void mo12509m(int i);

    /* renamed from: n */
    void mo12508n();

    /* renamed from: o */
    C0922g2 mo12507o(int i, long j);

    /* renamed from: p */
    void mo12506p(int i);

    /* renamed from: q */
    int mo12505q();

    /* renamed from: r */
    void mo12504r();

    /* renamed from: s */
    void mo12503s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo12502t(boolean z);
}
