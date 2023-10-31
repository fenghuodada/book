package com.applovin.impl.mediation.debugger.p021ui.p023b;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.adview.C2671a;
import com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a;
import com.applovin.impl.mediation.debugger.p021ui.p023b.C2946b;
import com.applovin.impl.mediation.debugger.p021ui.p023b.p024a.C2944a;
import com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2955a;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.sdk.AppLovinContentProviderUtils;
import com.applovin.impl.sdk.C3038a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.sdk.C3393R;

/* renamed from: com.applovin.impl.mediation.debugger.ui.b.a */
/* loaded from: classes.dex */
public class ActivityC2937a extends AbstractActivityC2918a {

    /* renamed from: a */
    private C2946b f7184a;

    /* renamed from: b */
    private DataSetObserver f7185b;

    /* renamed from: c */
    private FrameLayout f7186c;

    /* renamed from: d */
    private ListView f7187d;

    /* renamed from: e */
    private C2671a f7188e;

    /* renamed from: a */
    private void m8331a() {
        Uri cacheJPEGImageWithFileName;
        Bitmap m8237a = this.f7184a.m8237a(this.f7187d);
        if (m8237a == null || (cacheJPEGImageWithFileName = AppLovinContentProviderUtils.cacheJPEGImageWithFileName(m8237a, "mediation_debugger_screenshot.jpeg")) == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/jpeg");
        intent.putExtra("android.intent.extra.STREAM", cacheJPEGImageWithFileName);
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, "Share Mediation Debugger"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8330a(final Context context) {
        if (!StringUtils.isValidString(this.f7184a.m8300g()) || this.f7184a.m8305c()) {
            return;
        }
        this.f7184a.m8307a(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.3
            @Override // java.lang.Runnable
            public void run() {
                Utils.showAlert(ActivityC2937a.this.f7184a.m8301f(), ActivityC2937a.this.f7184a.m8300g(), context);
            }
        });
    }

    /* renamed from: b */
    private void m8326b() {
        m8323c();
        C2671a c2671a = new C2671a(this, 50, 16842874);
        this.f7188e = c2671a;
        c2671a.setColor(-3355444);
        this.f7186c.addView(this.f7188e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f7186c.bringChildToFront(this.f7188e);
        this.f7188e.m9180a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m8323c() {
        C2671a c2671a = this.f7188e;
        if (c2671a != null) {
            c2671a.m9179b();
            this.f7186c.removeView(this.f7188e);
            this.f7188e = null;
        }
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a
    public C3214m getSdk() {
        C2946b c2946b = this.f7184a;
        if (c2946b != null) {
            return c2946b.m8303d();
        }
        return null;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(C3393R.C3398layout.list_view);
        this.f7186c = (FrameLayout) findViewById(16908290);
        this.f7187d = (ListView) findViewById(C3393R.C3396id.listView);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C3393R.C3399menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C2946b c2946b = this.f7184a;
        if (c2946b != null) {
            c2946b.unregisterDataSetObserver(this.f7185b);
            this.f7184a.m8236a((AbstractView$OnClickListenerC2961d.InterfaceC2963a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C3393R.C3396id.action_share == menuItem.getItemId()) {
            m8331a();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f7187d.setAdapter((ListAdapter) this.f7184a);
        C2946b c2946b = this.f7184a;
        if (c2946b == null || c2946b.m8313a()) {
            return;
        }
        m8326b();
    }

    public void setListAdapter(C2946b c2946b, final C3038a c3038a) {
        DataSetObserver dataSetObserver;
        C2946b c2946b2 = this.f7184a;
        if (c2946b2 != null && (dataSetObserver = this.f7185b) != null) {
            c2946b2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f7184a = c2946b;
        this.f7185b = new DataSetObserver() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                ActivityC2937a.this.m8323c();
                ActivityC2937a activityC2937a = ActivityC2937a.this;
                activityC2937a.m8330a((Context) activityC2937a);
            }
        };
        m8330a((Context) this);
        this.f7184a.registerDataSetObserver(this.f7185b);
        this.f7184a.m8236a(new AbstractView$OnClickListenerC2961d.InterfaceC2963a() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2
            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d.InterfaceC2963a
            /* renamed from: a */
            public void mo8220a(C2955a c2955a, final C2957c c2957c) {
                String str;
                ActivityC2937a activityC2937a;
                String str2;
                int m8273a = c2955a.m8273a();
                if (m8273a == C2946b.EnumC2949b.MAX.ordinal()) {
                    Utils.showAlert(c2957c.m8258l(), c2957c.m8257m(), ActivityC2937a.this);
                } else if (m8273a != C2946b.EnumC2949b.ADS.ordinal()) {
                    if ((m8273a == C2946b.EnumC2949b.INCOMPLETE_NETWORKS.ordinal() || m8273a == C2946b.EnumC2949b.COMPLETED_NETWORKS.ordinal()) && (c2957c instanceof C2944a)) {
                        ActivityC2937a.this.startActivity(MaxDebuggerDetailActivity.class, c3038a, new AbstractActivityC2918a.InterfaceC2920a<MaxDebuggerDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.3
                            @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a.InterfaceC2920a
                            /* renamed from: a  reason: avoid collision after fix types in other method */
                            public void mo8290a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                                maxDebuggerDetailActivity.initialize(((C2944a) c2957c).m8318d());
                            }
                        });
                    }
                } else {
                    if (c2955a.m8272b() == C2946b.EnumC2948a.AD_UNITS.ordinal()) {
                        if (ActivityC2937a.this.f7184a.m8302e().size() > 0) {
                            ActivityC2937a.this.startActivity(MaxDebuggerAdUnitsListActivity.class, c3038a, new AbstractActivityC2918a.InterfaceC2920a<MaxDebuggerAdUnitsListActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.1
                                @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a.InterfaceC2920a
                                /* renamed from: a  reason: avoid collision after fix types in other method */
                                public void mo8290a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                                    maxDebuggerAdUnitsListActivity.initialize(ActivityC2937a.this.f7184a.m8302e(), ActivityC2937a.this.f7184a.m8303d());
                                }
                            });
                            return;
                        }
                        str = "Please setup or enable your MAX ad units on https://applovin.com.";
                        activityC2937a = ActivityC2937a.this;
                        str2 = "No live ad units";
                    } else if (c2955a.m8272b() != C2946b.EnumC2948a.SELECT_LIVE_NETWORKS.ordinal()) {
                        return;
                    } else {
                        if (ActivityC2937a.this.f7184a.m8299h().size() > 0 || ActivityC2937a.this.f7184a.m8298i().size() > 0) {
                            if (ActivityC2937a.this.f7184a.m8303d().m7478J().m8198a()) {
                                Utils.showAlert("Restart Required", c2957c.m8257m(), ActivityC2937a.this);
                                return;
                            } else {
                                ActivityC2937a.this.startActivity(MaxDebuggerTestLiveNetworkActivity.class, c3038a, new AbstractActivityC2918a.InterfaceC2920a<MaxDebuggerTestLiveNetworkActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.b.a.2.2
                                    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a.InterfaceC2920a
                                    /* renamed from: a  reason: avoid collision after fix types in other method */
                                    public void mo8290a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                                        maxDebuggerTestLiveNetworkActivity.initialize(ActivityC2937a.this.f7184a.m8299h(), ActivityC2937a.this.f7184a.m8298i(), ActivityC2937a.this.f7184a.m8303d());
                                    }
                                });
                                return;
                            }
                        }
                        str = "Please complete integrations in order to access this.";
                        activityC2937a = ActivityC2937a.this;
                        str2 = "Complete Integrations";
                    }
                    Utils.showAlert(str2, str, activityC2937a);
                }
            }
        });
    }
}
