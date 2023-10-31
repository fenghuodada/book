package com.applovin.impl.sdk.p030b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.b.b */
/* loaded from: classes.dex */
public class C3097b {

    /* renamed from: a */
    private final C3214m f7724a;

    /* renamed from: b */
    private final Activity f7725b;

    /* renamed from: c */
    private AlertDialog f7726c;

    /* renamed from: d */
    private InterfaceC3104a f7727d;

    /* renamed from: com.applovin.impl.sdk.b.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3104a {
        /* renamed from: a */
        void mo7826a();

        /* renamed from: b */
        void mo7825b();
    }

    public C3097b(Activity activity, C3214m c3214m) {
        this.f7724a = c3214m;
        this.f7725b = activity;
    }

    /* renamed from: a */
    public void m7836a() {
        this.f7725b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3097b.this.f7726c != null) {
                    C3097b.this.f7726c.dismiss();
                }
            }
        });
    }

    /* renamed from: a */
    public void m7835a(final AbstractC3080e abstractC3080e, @Nullable final Runnable runnable) {
        this.f7725b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.3
            @Override // java.lang.Runnable
            public void run() {
                AlertDialog.Builder builder = new AlertDialog.Builder(C3097b.this.f7725b);
                builder.setTitle(abstractC3080e.m7916an());
                String m7915ao = abstractC3080e.m7915ao();
                if (AppLovinSdkUtils.isValidString(m7915ao)) {
                    builder.setMessage(m7915ao);
                }
                builder.setPositiveButton(abstractC3080e.m7914ap(), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.3.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Runnable runnable2 = runnable;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                });
                builder.setCancelable(false);
                C3097b.this.f7726c = builder.show();
            }
        });
    }

    /* renamed from: a */
    public void m7834a(InterfaceC3104a interfaceC3104a) {
        this.f7727d = interfaceC3104a;
    }

    /* renamed from: b */
    public void m7831b() {
        this.f7725b.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.b.2
            @Override // java.lang.Runnable
            public void run() {
                C3097b.this.f7726c = new AlertDialog.Builder(C3097b.this.f7725b).setTitle((CharSequence) C3097b.this.f7724a.m7456a(C3109b.f7896bv)).setMessage((CharSequence) C3097b.this.f7724a.m7456a(C3109b.f7897bw)).setCancelable(false).setPositiveButton((CharSequence) C3097b.this.f7724a.m7456a(C3109b.f7899by), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.2
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C3097b.this.f7727d.mo7826a();
                    }
                }).setNegativeButton((CharSequence) C3097b.this.f7724a.m7456a(C3109b.f7898bx), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.b.b.2.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public void onClick(DialogInterface dialogInterface, int i) {
                        C3097b.this.f7727d.mo7825b();
                    }
                }).show();
            }
        });
    }

    /* renamed from: c */
    public boolean m7829c() {
        AlertDialog alertDialog = this.f7726c;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }
}
