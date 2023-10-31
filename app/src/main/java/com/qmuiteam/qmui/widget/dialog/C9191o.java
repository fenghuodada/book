package com.qmuiteam.qmui.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.qmuiteam.qmui.widget.dialog.C9197t;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;

/* renamed from: com.qmuiteam.qmui.widget.dialog.o */
/* loaded from: classes3.dex */
public final class C9191o implements DialogC9181l.C9184c.InterfaceC9185a {

    /* renamed from: a */
    public final /* synthetic */ DialogC9181l.C9184c.InterfaceC9185a f17743a;

    /* renamed from: b */
    public final /* synthetic */ DialogInterface.OnClickListener f17744b;

    /* renamed from: c */
    public final /* synthetic */ DialogC9181l.C9184c f17745c;

    /* renamed from: com.qmuiteam.qmui.widget.dialog.o$a */
    /* loaded from: classes3.dex */
    public class C9192a implements C9197t.InterfaceC9200c {
        public C9192a() {
        }
    }

    public C9191o(DialogC9181l.C9184c c9184c, DialogC9181l.C9184c.InterfaceC9185a interfaceC9185a, DialogInterface.OnClickListener onClickListener) {
        this.f17745c = c9184c;
        this.f17743a = interfaceC9185a;
        this.f17744b = onClickListener;
    }

    @Override // com.qmuiteam.qmui.widget.dialog.DialogC9181l.C9184c.InterfaceC9185a
    /* renamed from: a */
    public final C9197t mo2580a(Context context) {
        C9197t mo2580a = this.f17743a.mo2580a(context);
        mo2580a.setMenuIndex(this.f17745c.f17735l.indexOf(this));
        mo2580a.setListener(new C9192a());
        return mo2580a;
    }
}
