package com.vungle.warren.p058ui.view;

import android.content.Context;
import android.view.MotionEvent;
import android.view.Window;
import androidx.annotation.NonNull;
import com.vungle.warren.p058ui.InterfaceC10008d;
import com.vungle.warren.p058ui.InterfaceC9998a;
import com.vungle.warren.p058ui.contract.InterfaceC10006d;
import com.vungle.warren.p058ui.contract.InterfaceC10007e;

/* renamed from: com.vungle.warren.ui.view.j */
/* loaded from: classes3.dex */
public final class C10052j extends AbstractC10038a<InterfaceC10006d> implements InterfaceC10007e {

    /* renamed from: g */
    public InterfaceC10006d f20240g;

    /* renamed from: com.vungle.warren.ui.view.j$a */
    /* loaded from: classes3.dex */
    public class C10053a implements InterfaceC10054k {
        public C10053a() {
        }

        @Override // com.vungle.warren.p058ui.view.InterfaceC10054k
        /* renamed from: a */
        public final void mo1296a(MotionEvent motionEvent) {
            InterfaceC10006d interfaceC10006d = C10052j.this.f20240g;
            if (interfaceC10006d != null) {
                interfaceC10006d.mo1338d(motionEvent);
            }
        }
    }

    public C10052j(@NonNull Context context, @NonNull FullAdWidget fullAdWidget, @NonNull InterfaceC10008d interfaceC10008d, @NonNull InterfaceC9998a interfaceC9998a) {
        super(context, fullAdWidget, interfaceC10008d, interfaceC9998a);
        this.f20216d.setOnViewTouchListener(new C10053a());
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10007e
    /* renamed from: l */
    public final void mo1302l() {
        Window window = this.f20216d.f20189b;
        window.setFlags(1024, 1024);
        window.getDecorView().setBackgroundColor(-16777216);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: o */
    public final void mo1300o(@NonNull String str) {
        this.f20216d.m1316d(str);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    public final void setPresenter(@NonNull InterfaceC10006d interfaceC10006d) {
        this.f20240g = interfaceC10006d;
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10007e
    public final void setVisibility(boolean z) {
        this.f20216d.setVisibility(0);
    }
}
