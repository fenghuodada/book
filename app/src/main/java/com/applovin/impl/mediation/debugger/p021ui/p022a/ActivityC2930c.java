package com.applovin.impl.mediation.debugger.p021ui.p022a;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2905a;
import com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a;
import com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2955a;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2964e;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.sdk.C3393R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.c */
/* loaded from: classes.dex */
public class ActivityC2930c extends AbstractActivityC2918a {

    /* renamed from: a */
    private List<C2905a> f7166a;

    /* renamed from: b */
    private C3214m f7167b;

    /* renamed from: c */
    private AbstractView$OnClickListenerC2961d f7168c;

    /* renamed from: d */
    private List<C2957c> f7169d;

    /* renamed from: e */
    private ListView f7170e;

    /* renamed from: a */
    private List<C2957c> m8333a(List<C2905a> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C2905a c2905a : list) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c2905a.m8430a(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c2905a.m8427c(), -16777216));
            arrayList.add(C2957c.m8267a(C2957c.EnumC2960b.DETAIL).m8250a(StringUtils.createSpannedString(c2905a.m8428b(), -16777216, 18, 1)).m8246b(new SpannedString(spannableStringBuilder)).m8251a(this).m8248a(true).m8253a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a
    public C3214m getSdk() {
        return this.f7167b;
    }

    public void initialize(final List<C2905a> list, final C3214m c3214m) {
        this.f7166a = list;
        this.f7167b = c3214m;
        this.f7169d = m8333a(list);
        AbstractView$OnClickListenerC2961d abstractView$OnClickListenerC2961d = new AbstractView$OnClickListenerC2961d(this) { // from class: com.applovin.impl.mediation.debugger.ui.a.c.1
            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
            /* renamed from: a */
            public int mo8225a(int i) {
                return list.size();
            }

            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
            /* renamed from: b */
            public int mo8224b() {
                return 1;
            }

            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
            /* renamed from: b */
            public C2957c mo8223b(int i) {
                return new C2964e("");
            }

            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d
            /* renamed from: c */
            public List<C2957c> mo8222c(int i) {
                return ActivityC2930c.this.f7169d;
            }
        };
        this.f7168c = abstractView$OnClickListenerC2961d;
        abstractView$OnClickListenerC2961d.m8236a(new AbstractView$OnClickListenerC2961d.InterfaceC2963a() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2
            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d.InterfaceC2963a
            /* renamed from: a */
            public void mo8220a(final C2955a c2955a, C2957c c2957c) {
                ActivityC2930c.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, c3214m.m7434af(), new AbstractActivityC2918a.InterfaceC2920a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.c.2.1
                    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a.InterfaceC2920a
                    /* renamed from: a  reason: avoid collision after fix types in other method */
                    public void mo8290a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                        maxDebuggerAdUnitDetailActivity.initialize((C2905a) list.get(c2955a.m8272b()), null, c3214m);
                    }
                });
            }
        });
        this.f7168c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Ad Units");
        setContentView(C3393R.C3398layout.list_view);
        ListView listView = (ListView) findViewById(C3393R.C3396id.listView);
        this.f7170e = listView;
        listView.setAdapter((ListAdapter) this.f7168c);
    }
}
