package androidx.fragment.app;

import androidx.core.p003os.C0732c;
import androidx.fragment.app.SpecialEffectsController;
import com.google.android.exoplayer2.C7508z0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C1434w implements C0732c.InterfaceC0733a, C7417m.InterfaceC7418a {

    /* renamed from: b */
    public final /* synthetic */ Object f3368b;

    public /* synthetic */ C1434w(Object obj) {
        this.f3368b = obj;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((Player.InterfaceC6626b) obj).onPlayerError(((C7508z0) this.f3368b).f14261f);
    }

    @Override // androidx.core.p003os.C0732c.InterfaceC0733a
    public final void onCancel() {
        SpecialEffectsController.Operation._init_$lambda$0((SpecialEffectsController.Operation) this.f3368b);
    }
}
