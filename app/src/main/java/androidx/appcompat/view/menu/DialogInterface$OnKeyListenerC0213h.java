package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogInterfaceC0098c;
import androidx.appcompat.view.menu.C0207e;
import androidx.appcompat.view.menu.InterfaceC0226m;

/* renamed from: androidx.appcompat.view.menu.h */
/* loaded from: classes.dex */
public final class DialogInterface$OnKeyListenerC0213h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0226m.InterfaceC0227a {

    /* renamed from: a */
    public final C0210g f709a;

    /* renamed from: b */
    public DialogInterfaceC0098c f710b;

    /* renamed from: c */
    public C0207e f711c;

    public DialogInterface$OnKeyListenerC0213h(C0210g c0210g) {
        this.f709a = c0210g;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
    /* renamed from: b */
    public final void mo12698b(@NonNull C0210g c0210g, boolean z) {
        DialogInterfaceC0098c dialogInterfaceC0098c;
        if ((z || c0210g == this.f709a) && (dialogInterfaceC0098c = this.f710b) != null) {
            dialogInterfaceC0098c.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m.InterfaceC0227a
    /* renamed from: c */
    public final boolean mo12697c(@NonNull C0210g c0210g) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0207e c0207e = this.f711c;
        if (c0207e.f675f == null) {
            c0207e.f675f = new C0207e.C0208a();
        }
        this.f709a.m12842q(c0207e.f675f.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f711c.mo12710b(this.f709a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C0210g c0210g = this.f709a;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f710b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f710b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c0210g.m12848c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c0210g.performShortcut(i, keyEvent, 0);
    }
}
