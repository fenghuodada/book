package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.CascadingMenuPopup;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public final class RunnableC0206d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ CascadingMenuPopup.C0202d f666a;

    /* renamed from: b */
    public final /* synthetic */ MenuItem f667b;

    /* renamed from: c */
    public final /* synthetic */ C0210g f668c;

    /* renamed from: d */
    public final /* synthetic */ CascadingMenuPopup.C0201c f669d;

    public RunnableC0206d(CascadingMenuPopup.C0201c c0201c, CascadingMenuPopup.C0202d c0202d, C0214i c0214i, C0210g c0210g) {
        this.f669d = c0201c;
        this.f666a = c0202d;
        this.f667b = c0214i;
        this.f668c = c0210g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CascadingMenuPopup.C0202d c0202d = this.f666a;
        if (c0202d != null) {
            CascadingMenuPopup.C0201c c0201c = this.f669d;
            CascadingMenuPopup.this.f588A = true;
            c0202d.f618b.m12848c(false);
            CascadingMenuPopup.this.f588A = false;
        }
        MenuItem menuItem = this.f667b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f668c.m12842q(menuItem, null, 4);
        }
    }
}
