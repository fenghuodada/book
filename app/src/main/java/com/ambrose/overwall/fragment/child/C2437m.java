package com.ambrose.overwall.fragment.child;

import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.fragment.C1349a;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;

/* renamed from: com.ambrose.overwall.fragment.child.m */
/* loaded from: classes.dex */
public final class C2437m implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C2430g f5841a;

    public C2437m(C2430g c2430g) {
        this.f5841a = c2430g;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = MyApplication.f5741c.getResources().getConfiguration().uiMode & 48;
        C2430g c2430g = this.f5841a;
        if (i == 32) {
            c2430g.f5837z.getSwitch().setChecked(true);
            Toast.makeText(MyApplication.f5741c, c2430g.getString(R.string.black_tips), 0).show();
        } else if (!z) {
            C1349a.m10608c(3);
            c2430g.f5837z.getSwitch().setChecked(false);
        } else if (z) {
            C1349a.m10608c(2);
            c2430g.f5837z.getSwitch().setChecked(true);
        }
    }
}
