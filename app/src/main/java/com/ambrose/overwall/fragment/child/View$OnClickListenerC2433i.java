package com.ambrose.overwall.fragment.child;

import android.os.Environment;
import android.view.View;
import android.widget.Toast;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.android.tool.util.util.C2597b;

/* renamed from: com.ambrose.overwall.fragment.child.i */
/* loaded from: classes.dex */
public final class View$OnClickListenerC2433i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C2430g f5840a;

    public View$OnClickListenerC2433i(C2430g c2430g) {
        this.f5840a = c2430g;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2430g c2430g = this.f5840a;
        MyApplication myApplication = MyApplication.f5741c;
        C2597b.m9345a(myApplication.getCacheDir());
        if (Environment.getExternalStorageState().equals("mounted")) {
            C2597b.m9345a(myApplication.getExternalCacheDir());
        }
        try {
            c2430g.f5828A.setDetailText("0K");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Toast.makeText(MyApplication.f5741c, c2430g.getString(R.string.clearsuccess), 0).show();
    }
}
