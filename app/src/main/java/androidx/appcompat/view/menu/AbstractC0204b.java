package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.InterfaceC0226m;
import com.ambrose.overwall.R;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: classes.dex */
public abstract class AbstractC0204b implements InterfaceC0226m {

    /* renamed from: a */
    public final Context f655a;

    /* renamed from: b */
    public Context f656b;

    /* renamed from: c */
    public C0210g f657c;

    /* renamed from: d */
    public final LayoutInflater f658d;

    /* renamed from: e */
    public InterfaceC0226m.InterfaceC0227a f659e;

    /* renamed from: f */
    public final int f660f = R.layout.abc_action_menu_layout;

    /* renamed from: g */
    public final int f661g = R.layout.abc_action_menu_item_layout;

    /* renamed from: h */
    public InterfaceC0228n f662h;

    public AbstractC0204b(Context context) {
        this.f655a = context;
        this.f658d = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: d */
    public final void mo12825d(InterfaceC0226m.InterfaceC0227a interfaceC0227a) {
        this.f659e = interfaceC0227a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: e */
    public final boolean mo12741e(C0214i c0214i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: j */
    public final boolean mo12740j(C0214i c0214i) {
        return false;
    }
}
