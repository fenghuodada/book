package com.ambrose.overwall.fragment;

import com.ambrose.overwall.R;
import com.android.tool.bean.SectionServerBean;
import com.kongzue.dialogx.dialogs.C8897o;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;
import java.util.ArrayList;

/* renamed from: com.ambrose.overwall.fragment.e */
/* loaded from: classes.dex */
public final class C2450e implements QMUIDialogAction.InterfaceC9166a {

    /* renamed from: a */
    public final /* synthetic */ DialogC9181l.C9188f f5863a;

    /* renamed from: b */
    public final /* synthetic */ C2470n f5864b;

    public C2450e(C2470n c2470n, DialogC9181l.C9188f c9188f) {
        this.f5864b = c2470n;
        this.f5863a = c9188f;
    }

    @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogAction.InterfaceC9166a
    /* renamed from: a */
    public final void mo2596a(DialogC9181l dialogC9181l) {
        dialogC9181l.dismiss();
        DialogC9181l.C9188f c9188f = this.f5863a;
        if (c9188f.m2581j().length == 0) {
            return;
        }
        C2470n c2470n = this.f5864b;
        c2470n.f5913O = 0;
        C8897o m2896N = C8897o.m2896N(c2470n.getString(R.string.ping_doing));
        m2896N.f16961F = 2;
        m2896N.m2899K();
        c2470n.f5927w = new ArrayList();
        for (int i = 0; i < c9188f.m2581j().length; i++) {
            for (int i2 = 0; i2 < ((SectionServerBean) c2470n.f5907I.get(c9188f.m2581j()[i])).getResultsBeanList().size(); i2++) {
                c2470n.f5927w.add(((SectionServerBean) c2470n.f5907I.get(c9188f.m2581j()[i])).getResultsBeanList().get(i2));
            }
        }
        c2470n.f5912N = c2470n.f5927w.size();
        for (int i3 = 0; i3 < c2470n.f5912N; i3++) {
            c2470n.f5906H.m9407a(c2470n.f5927w.get(i3).getGoFlyKey(), Integer.valueOf(i3)).m10572e(c2470n.f5910L);
        }
    }
}
