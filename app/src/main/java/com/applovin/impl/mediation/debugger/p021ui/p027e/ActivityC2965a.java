package com.applovin.impl.mediation.debugger.p021ui.p027e;

import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2908d;
import com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a;
import com.applovin.impl.mediation.debugger.p021ui.p023b.p024a.C2944a;
import com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2955a;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2964e;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.C3393R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.e.a */
/* loaded from: classes.dex */
public class ActivityC2965a extends AbstractActivityC2918a {

    /* renamed from: a */
    private C3214m f7304a;

    /* renamed from: b */
    private List<C2908d> f7305b;

    /* renamed from: c */
    private List<C2908d> f7306c;

    /* renamed from: d */
    private AbstractView$OnClickListenerC2961d f7307d;

    /* renamed from: e */
    private List<C2957c> f7308e;

    /* renamed from: f */
    private List<C2957c> f7309f;

    /* renamed from: g */
    private ListView f7310g;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.e.a$a */
    /* loaded from: classes.dex */
    public enum EnumC2969a {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public ActivityC2965a() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C2908d m8232a(C2955a c2955a) {
        return (c2955a.m8273a() == EnumC2969a.BIDDERS.ordinal() ? this.f7305b : this.f7306c).get(c2955a.m8272b());
    }

    /* renamed from: a */
    private List<C2957c> m8229a(List<C2908d> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (final C2908d c2908d : list) {
            arrayList.add(new C2944a(c2908d.m8409c(), this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.3
                @Override // com.applovin.impl.mediation.debugger.p021ui.p023b.p024a.C2944a, com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
                /* renamed from: f */
                public int mo8219f() {
                    if (ActivityC2965a.this.f7304a.m7478J().m8192c() == null || !ActivityC2965a.this.f7304a.m7478J().m8192c().equals(c2908d.m8412a())) {
                        return 0;
                    }
                    return C3393R.C3395drawable.applovin_ic_check_mark_borderless;
                }

                @Override // com.applovin.impl.mediation.debugger.p021ui.p023b.p024a.C2944a, com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
                /* renamed from: g */
                public int mo8218g() {
                    if (ActivityC2965a.this.f7304a.m7478J().m8192c() == null || !ActivityC2965a.this.f7304a.m7478J().m8192c().equals(c2908d.m8412a())) {
                        return super.mo8218g();
                    }
                    return -16776961;
                }

                @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c
                /* renamed from: k */
                public SpannedString mo8217k() {
                    return StringUtils.createSpannedString(c2908d.m8410b(), mo8266b() ? -16777216 : -7829368, 18, 1);
                }
            });
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a
    public C3214m getSdk() {
        return this.f7304a;
    }

    public void initialize(List<C2908d> list, List<C2908d> list2, final C3214m c3214m) {
        this.f7304a = c3214m;
        this.f7305b = list;
        this.f7306c = list2;
        this.f7308e = m8229a(list);
        this.f7309f = m8229a(list2);
        AbstractView$OnClickListenerC2961d abstractView$OnClickListenerC2961d = new AbstractView$OnClickListenerC2961d(this) { // from class: com.applovin.impl.mediation.debugger.ui.e.a.1
            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
            /* renamed from: a */
            public int mo8225a(int i) {
                return (i == EnumC2969a.BIDDERS.ordinal() ? ActivityC2965a.this.f7308e : ActivityC2965a.this.f7309f).size();
            }

            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
            /* renamed from: b */
            public int mo8224b() {
                return EnumC2969a.COUNT.ordinal();
            }

            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
            /* renamed from: b */
            public C2957c mo8223b(int i) {
                return i == EnumC2969a.BIDDERS.ordinal() ? new C2964e("BIDDERS") : new C2964e("WATERFALL");
            }

            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
            /* renamed from: c */
            public List<C2957c> mo8222c(int i) {
                return i == EnumC2969a.BIDDERS.ordinal() ? ActivityC2965a.this.f7308e : ActivityC2965a.this.f7309f;
            }

            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
            /* renamed from: k */
            public C2957c mo8221k() {
                return new C2957c.C2959a(C2957c.EnumC2960b.SECTION_CENTERED).m8249a("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").m8253a();
            }
        };
        this.f7307d = abstractView$OnClickListenerC2961d;
        abstractView$OnClickListenerC2961d.m8236a(new AbstractView$OnClickListenerC2961d.InterfaceC2963a() { // from class: com.applovin.impl.mediation.debugger.ui.e.a.2
            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d.InterfaceC2963a
            /* renamed from: a */
            public void mo8220a(C2955a c2955a, C2957c c2957c) {
                String m8412a = ActivityC2965a.this.m8232a(c2955a).m8412a();
                if (StringUtils.isValidString(m8412a) && StringUtils.isValidString(c3214m.m7478J().m8192c()) && m8412a.equals(c3214m.m7478J().m8192c())) {
                    c3214m.m7478J().m8195a(false);
                    c3214m.m7478J().m8197a((String) null);
                } else {
                    c3214m.m7478J().m8195a(true);
                    c3214m.m7478J().m8197a(m8412a);
                }
                ActivityC2965a.this.f7307d.notifyDataSetChanged();
            }
        });
        this.f7307d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(C3393R.C3398layout.list_view);
        ListView listView = (ListView) findViewById(C3393R.C3396id.listView);
        this.f7310g = listView;
        listView.setAdapter((ListAdapter) this.f7307d);
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f7308e = m8229a(this.f7305b);
        this.f7309f = m8229a(this.f7306c);
        this.f7307d.m8233j();
    }
}
