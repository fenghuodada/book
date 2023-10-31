package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.C0203a;

/* renamed from: androidx.appcompat.widget.a2 */
/* loaded from: classes.dex */
public final class View$OnClickListenerC0301a2 implements View.OnClickListener {

    /* renamed from: a */
    public final C0203a f1107a;

    /* renamed from: b */
    public final /* synthetic */ C0307b2 f1108b;

    public View$OnClickListenerC0301a2(C0307b2 c0307b2) {
        this.f1108b = c0307b2;
        this.f1107a = new C0203a(c0307b2.f1121a.getContext(), c0307b2.f1129i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0307b2 c0307b2 = this.f1108b;
        Window.Callback callback = c0307b2.f1132l;
        if (callback == null || !c0307b2.f1133m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f1107a);
    }
}
