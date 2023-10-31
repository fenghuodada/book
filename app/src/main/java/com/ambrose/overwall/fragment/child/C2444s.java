package com.ambrose.overwall.fragment.child;

import android.content.Intent;
import android.widget.Toast;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.android.tool.util.proxy.WifiDirectService;
import com.android.tool.util.util.C2603g;
import com.qmuiteam.qmui.widget.dialog.DialogC9181l;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

/* renamed from: com.ambrose.overwall.fragment.child.s */
/* loaded from: classes.dex */
public final class C2444s implements QMUIDialogAction.InterfaceC9166a {

    /* renamed from: a */
    public final /* synthetic */ DialogC9181l.C9183b f5854a;

    /* renamed from: b */
    public final /* synthetic */ C2439o f5855b;

    public C2444s(C2439o c2439o, DialogC9181l.C9183b c9183b) {
        this.f5855b = c2439o;
        this.f5854a = c9183b;
    }

    @Override // com.qmuiteam.qmui.widget.dialog.QMUIDialogAction.InterfaceC9166a
    /* renamed from: a */
    public final void mo2596a(DialogC9181l dialogC9181l) {
        MyApplication myApplication;
        int i;
        String trim = this.f5854a.f17732m.getText().toString().trim();
        C2439o c2439o = this.f5855b;
        if (trim != null && trim.length() != 0) {
            if (Integer.valueOf(trim).intValue() > 1024 && Integer.valueOf(trim).intValue() <= 65535) {
                C2603g.m9336d("ProxyPort", trim);
                c2439o.f5845v.setDetailText(trim);
                MyApplication myApplication2 = MyApplication.f5741c;
                WifiDirectService.C2590b c2590b = WifiDirectService.f6094a;
                Intent intent = new Intent();
                intent.setAction("com.ambrose.overwall.action.STOP");
                myApplication2.sendBroadcast(intent);
                c2439o.f5847x.getSwitch().setChecked(false);
                dialogC9181l.dismiss();
                return;
            }
            myApplication = MyApplication.f5741c;
            i = R.string.proxy_send_support;
        } else {
            myApplication = MyApplication.f5741c;
            i = R.string.proxy_send_null;
        }
        Toast.makeText(myApplication, c2439o.getString(i), 0).show();
    }
}
