package com.ambrose.overwall.fragment;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.VpnService;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActivityC0101d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1469h0;
import androidx.lifecycle.C1489r;
import androidx.lifecycle.InterfaceC1490s;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.security.crypto.SharedPreferencesC1695a;
import androidx.viewbinding.C1806b;
import cn.hutool.core.codec.C2026c;
import com.ambrose.overwall.MyApplication;
import com.ambrose.overwall.R;
import com.ambrose.overwall.databinding.C2395c;
import com.ambrose.overwall.fragment.base.AbstractC2407b;
import com.ambrose.overwall.p005mv.main.C2497d;
import com.ambrose.overwall.p005mv.main.C2498e;
import com.ambrose.overwall.p005mv.main.C2501h;
import com.ambrose.overwall.p005mv.main.C2502i;
import com.ambrose.overwall.p005mv.main.C2506m;
import com.ambrose.overwall.p005mv.main.C2507n;
import com.ambrose.overwall.p005mv.main.C2514o;
import com.ambrose.overwall.p007v2.C2525f;
import com.android.tool.ApplicationC2534a;
import com.android.tool.adapter.C2538c;
import com.android.tool.apps.InterfaceC2547a;
import com.android.tool.bean.ResultsBean;
import com.android.tool.bean.SectionServerBean;
import com.android.tool.bean.TitleBean;
import com.android.tool.util.manager.C2559b;
import com.android.tool.util.util.C2595a;
import com.android.tool.util.util.C2599d;
import com.android.tool.util.util.C2603g;
import com.android.tool.util.weight.DrawableTextView;
import com.android.tool.util.weight.recommendDialog.C2618a;
import com.android.tool.util.weight.recommendDialog.C2620b;
import com.android.tool.util.weight.recommendDialog.C2621c;
import com.android.tool.util.weight.sectionDialog.C2627c;
import com.android.tool.util.weight.sectionDialog.C2634e;
import com.android.tool.util.weight.xselector.shadow.C2643a;
import com.bitvale.switcher.SwitcherC;
import com.google.android.ads.nativetemplates.C6427a;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C7844o;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.google.gson.C8686j;
import com.kongzue.dialogx.dialogs.C8887i;
import com.kongzue.dialogx.dialogs.C8897o;
import com.kongzue.dialogx.dialogs.RunnableC8878a;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.InterfaceC8937i;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.widget.QMUIEmptyView;
import com.qmuiteam.qmui.widget.QMUITopBarLayout;
import com.qmuiteam.qmui.widget.QMUIWindowInsetLayout;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import io.reactivex.rxjava3.android.schedulers.C10142b;
import io.reactivex.rxjava3.schedulers.C10235a;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C10843j;
import libv2ray.GoFlyVpnService;

/* renamed from: com.ambrose.overwall.fragment.n */
/* loaded from: classes.dex */
public class C2470n extends AbstractC2407b {

    /* renamed from: e0 */
    public static final /* synthetic */ int f5898e0 = 0;

    /* renamed from: A */
    public int f5899A;

    /* renamed from: B */
    public int f5900B;

    /* renamed from: C */
    public int f5901C;

    /* renamed from: D */
    public int f5902D;

    /* renamed from: F */
    public LinearLayout.LayoutParams f5904F;

    /* renamed from: G */
    public C2395c f5905G;

    /* renamed from: H */
    public C2507n f5906H;

    /* renamed from: I */
    public ArrayList f5907I;

    /* renamed from: J */
    public ArrayList f5908J;

    /* renamed from: K */
    public ArrayList f5909K;

    /* renamed from: L */
    public C2489x f5910L;

    /* renamed from: M */
    public int f5911M;

    /* renamed from: N */
    public int f5912N;

    /* renamed from: P */
    public Boolean f5914P;

    /* renamed from: Q */
    public String f5915Q;

    /* renamed from: R */
    public Boolean f5916R;

    /* renamed from: S */
    public InterstitialAd f5917S;

    /* renamed from: T */
    public Boolean f5918T;

    /* renamed from: U */
    public long f5919U;

    /* renamed from: V */
    public boolean f5920V;

    /* renamed from: W */
    public Boolean f5921W;

    /* renamed from: X */
    public Boolean f5922X;

    /* renamed from: Y */
    public C2472b f5923Y;

    /* renamed from: Z */
    public C2473c f5924Z;

    /* renamed from: d0 */
    public Boolean f5925d0;

    /* renamed from: v */
    public List<ResultsBean> f5926v;

    /* renamed from: w */
    public List<ResultsBean> f5927w;

    /* renamed from: x */
    public C6427a f5928x;

    /* renamed from: z */
    public int f5930z;

    /* renamed from: y */
    public long f5929y = 0;

    /* renamed from: E */
    public int f5903E = 0;

    /* renamed from: O */
    public int f5913O = 0;

    /* renamed from: com.ambrose.overwall.fragment.n$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2471a implements View.OnClickListener {
        public View$OnClickListenerC2471a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2470n.this.m2803v(new C2451e0());
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.n$b */
    /* loaded from: classes.dex */
    public class C2472b implements IUnityAdsLoadListener {
        public C2472b() {
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public final void onUnityAdsAdLoaded(String str) {
            Log.e("ConnectFragment", "onUnityInterstitialAdsAdLoaded: ");
            Boolean bool = Boolean.TRUE;
            C2470n c2470n = C2470n.this;
            c2470n.f5921W = bool;
            c2470n.f5918T = Boolean.FALSE;
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            C2470n.this.f5918T = Boolean.FALSE;
            Log.e("ConnectFragment", "onUnityInterstitialAdsFailedToLoad: ");
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.n$c */
    /* loaded from: classes.dex */
    public class C2473c implements IUnityAdsShowListener {
        public C2473c() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowClick(String str) {
            C2470n.this.f5922X = Boolean.TRUE;
            Log.e("ConnectFragment", "onUnityInterstitialAdsShowClick: ");
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            Log.e("ConnectFragment", "onUnityInterstitialAdsShowComplete: ");
            C2470n.this.f5922X = Boolean.TRUE;
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            Boolean bool = Boolean.TRUE;
            C2470n c2470n = C2470n.this;
            c2470n.f5918T = bool;
            c2470n.f5922X = bool;
            Log.e("ConnectFragment", "onUnityInterstitialAdsShowFailure: ");
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowStart(String str) {
            C2470n.this.f5922X = Boolean.TRUE;
            Log.e("ConnectFragment", "onUnityInterstitialAdsShowStart: ");
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.n$d */
    /* loaded from: classes.dex */
    public class C2474d extends InterstitialAdLoadCallback {
        public C2474d() {
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
            Log.e("ConnectFragment", "onAdFailedToLoad:  =====");
            Boolean bool = Boolean.FALSE;
            C2470n c2470n = C2470n.this;
            c2470n.f5918T = bool;
            c2470n.f5917S = null;
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public final void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
            Boolean bool = Boolean.FALSE;
            C2470n c2470n = C2470n.this;
            c2470n.f5918T = bool;
            c2470n.f5917S = interstitialAd;
            Log.e("ConnectFragment", "onAdLoaded:   ===  InterstitialAd");
            c2470n.f5917S.setFullScreenContentCallback(new C2485t(this));
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.n$e */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2475e implements View.OnClickListener {
        public View$OnClickListenerC2475e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C2470n c2470n = C2470n.this;
            if (c2470n.f5905G.f5762h.getText().toString().equals(c2470n.getString(R.string.ic_server_select))) {
                Toast.makeText(MyApplication.f5741c, c2470n.getString(R.string.unselecet_server), 0).show();
                return;
            }
            Object obj = c2470n.f5906H.m9405c().f3387e;
            if (obj == LiveData.f3382k) {
                obj = null;
            }
            if (((Boolean) obj).booleanValue()) {
                c2470n.f5906H.getClass();
                C2507n.m9402f();
                return;
            }
            Intent prepare = VpnService.prepare(c2470n.m2811m());
            c2470n.getClass();
            if (prepare == null) {
                c2470n.m9409F();
            } else {
                c2470n.startActivityForResult(prepare, 0);
            }
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.n$f */
    /* loaded from: classes.dex */
    public class C2476f implements InterfaceC8937i {
        public C2476f() {
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.n$g */
    /* loaded from: classes.dex */
    public class C2477g implements InterfaceC1490s<List<ResultsBean>> {
        public C2477g() {
        }

        @Override // androidx.lifecycle.InterfaceC1490s
        public final void onChanged(List<ResultsBean> list) {
            String str;
            String str2;
            C1489r<TitleBean.ResultsBean> c1489r;
            String str3;
            List<ResultsBean> list2 = list;
            C2470n c2470n = C2470n.this;
            if (list2 != null) {
                c2470n.f5926v = list2;
                C2507n c2507n = c2470n.f5906H;
                String m3230h = new C8686j().m3230h(c2470n.f5926v);
                SharedPreferencesC1695a sharedPreferencesC1695a = c2507n.f5982j;
                if (sharedPreferencesC1695a != null) {
                    SharedPreferencesC1695a.SharedPreferences$EditorC1696a sharedPreferences$EditorC1696a = (SharedPreferencesC1695a.SharedPreferences$EditorC1696a) sharedPreferencesC1695a.edit();
                    sharedPreferences$EditorC1696a.putString("CACHESERVER", m3230h);
                    sharedPreferences$EditorC1696a.apply();
                }
                C2603g.m9336d("cachetime", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
            } else {
                SharedPreferencesC1695a sharedPreferencesC1695a2 = c2470n.f5906H.f5982j;
                if (sharedPreferencesC1695a2 != null) {
                    str = sharedPreferencesC1695a2.getString("CACHESERVER", null);
                } else {
                    str = null;
                }
                if (str != null) {
                    C8686j c8686j = new C8686j();
                    SharedPreferencesC1695a sharedPreferencesC1695a3 = c2470n.f5906H.f5982j;
                    if (sharedPreferencesC1695a3 != null) {
                        str2 = sharedPreferencesC1695a3.getString("CACHESERVER", null);
                    } else {
                        str2 = null;
                    }
                    c2470n.f5926v = (List) c8686j.m3234d(str2, new C2486u().getType());
                    c2470n.f5905G.f5756b.addView(c2470n.m9420x(c2470n.getString(R.string.cache_server) + "\n" + c2470n.getString(R.string.cachetime) + "\u3000" + C2603g.m9338b("cachetime") + "\n" + c2470n.getString(R.string.errorcachetime), "errserver", Boolean.TRUE, Boolean.FALSE), c2470n.f5904F);
                }
            }
            c2470n.f5911M = c2470n.f5926v.size();
            if (c2470n.f5926v.size() == 0) {
                C8887i c8887i = new C8887i(c2470n.getString(R.string.tips), c2470n.getString(R.string.weihunow), c2470n.getString(R.string.ic_ok));
                c8887i.m2911E();
                c8887i.f16930y = 2;
                if (c8887i.f16927H != null) {
                    BaseDialog.m2856z(new RunnableC8878a(c8887i));
                }
                c8887i.f16926G = new C2488w();
                c2470n.f5905G.f5761g.setVisibility(8);
                c2470n.f5905G.f5759e.setLoadingShowing(false);
                c2470n.f5905G.f5759e.setDetailText(c2470n.getString(R.string.weihunowtwo));
            } else {
                c2470n.f5907I = new ArrayList();
                Collections.shuffle(c2470n.f5926v);
                List<ResultsBean> list3 = c2470n.f5926v;
                list3.getClass();
                HashMap hashMap = new HashMap();
                Iterator it = null;
                while (true) {
                    if (it == null) {
                        it = list3.iterator();
                    }
                    if (it.hasNext()) {
                        Object next = it.next();
                        String imgUrl = ((ResultsBean) next).getImgUrl();
                        if (imgUrl != null) {
                            Object obj = hashMap.get(imgUrl);
                            if (obj == null) {
                                obj = new ArrayList();
                                hashMap.put(imgUrl, obj);
                            }
                            ((List) obj).add(next);
                        } else {
                            throw new NullPointerException("element cannot be mapped to a null key");
                        }
                    } else {
                        for (Map.Entry entry : hashMap.entrySet()) {
                            entry.setValue(entry.getValue());
                        }
                        Set entrySet = hashMap.entrySet();
                        Iterator it2 = null;
                        while (true) {
                            if (it2 == null) {
                                it2 = entrySet.iterator();
                            }
                            if (!it2.hasNext()) {
                                break;
                            }
                            Map.Entry entry2 = (Map.Entry) it2.next();
                            c2470n.f5907I.add(new SectionServerBean(((ResultsBean) ((List) entry2.getValue()).get(0)).getMsg(), ((ResultsBean) ((List) entry2.getValue()).get(0)).getObjectId(), ((ResultsBean) ((List) entry2.getValue()).get(0)).getImgUrl(), (List) entry2.getValue()));
                        }
                        ArrayList arrayList = c2470n.f5907I;
                        int i = c2470n.f5911M;
                        ArrayList arrayList2 = c2470n.f5908J;
                        if (arrayList2 != null && c2470n.f5909K != null) {
                            arrayList2.clear();
                            c2470n.f5908J = null;
                            c2470n.f5909K.clear();
                            c2470n.f5909K = null;
                        }
                        c2470n.f5908J = new ArrayList();
                        c2470n.f5909K = new ArrayList();
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ArrayList arrayList3 = c2470n.f5908J;
                            ((SectionServerBean) arrayList.get(i2)).getId();
                            arrayList3.add(new C2627c(((SectionServerBean) arrayList.get(i2)).getTitle(), ((SectionServerBean) arrayList.get(i2)).getPhotoUrl()));
                            ArrayList arrayList4 = c2470n.f5909K;
                            String id = ((SectionServerBean) arrayList.get(i2)).getId();
                            String title = ((SectionServerBean) arrayList.get(i2)).getTitle();
                            ((SectionServerBean) arrayList.get(i2)).getPhotoUrl();
                            C2634e c2634e = new C2634e();
                            c2634e.f6183a = id;
                            c2634e.f6184b = title;
                            c2634e.f6186d = 1;
                            c2634e.f6187e = i2;
                            arrayList4.add(c2634e);
                            for (int i3 = 0; i3 < ((SectionServerBean) arrayList.get(i2)).getResultsBeanList().size(); i3++) {
                                ArrayList arrayList5 = c2470n.f5909K;
                                String objectId = ((SectionServerBean) arrayList.get(i2)).getResultsBeanList().get(i3).getObjectId();
                                String msg = ((SectionServerBean) arrayList.get(i2)).getResultsBeanList().get(i3).getMsg();
                                ((SectionServerBean) arrayList.get(i2)).getResultsBeanList().get(i3).getImgUrl();
                                arrayList5.add(new C2634e(objectId, msg, ((SectionServerBean) arrayList.get(i2)).getResultsBeanList().get(i3).getGoFlyKey(), i2));
                            }
                        }
                        c2470n.f5905G.f5762h.setOnClickListener(new View$OnClickListenerC2481q(c2470n, i));
                        c2470n.f5905G.f5761g.setVisibility(8);
                        QMUIEmptyView qMUIEmptyView = c2470n.f5905G.f5759e;
                        qMUIEmptyView.setVisibility(8);
                        qMUIEmptyView.setLoadingShowing(false);
                        qMUIEmptyView.setTitleText(null);
                        qMUIEmptyView.setDetailText(null);
                        qMUIEmptyView.f17604t.setText((CharSequence) null);
                        qMUIEmptyView.f17604t.setVisibility(8);
                        qMUIEmptyView.f17604t.setOnClickListener(null);
                        c2470n.f5910L = new C2489x(c2470n);
                        c2470n.f5905G.f5764j.f17642c.m2617f(R.mipmap.ic_speed, R.id.topbar_view_left_secound, -1).setOnClickListener(new View$OnClickListenerC2404b(c2470n));
                        if (C2603g.m9338b("LASTCONNECT") != null && C2603g.m9338b("SELECTSERVERNAME") != null) {
                            c2470n.f5905G.f5762h.setText(c2470n.getString(R.string.server_msg) + C2603g.m9338b("SELECTSERVERNAME"));
                        }
                    }
                }
            }
            C2507n c2507n2 = c2470n.f5906H;
            c2507n2.getClass();
            Calendar calendar = Calendar.getInstance();
            C2559b.m9372a(ApplicationC2534a.f6025a).getClass();
            calendar.setTime(new Date(C2559b.f6057a.getLong("AnnouncementTime", 0L)));
            calendar.add(10, 7);
            int i4 = (calendar.getTimeInMillis() > System.currentTimeMillis() ? 1 : (calendar.getTimeInMillis() == System.currentTimeMillis() ? 0 : -1));
            C2506m c2506m = c2507n2.f5979g;
            if (i4 >= 0) {
                SharedPreferencesC1695a sharedPreferencesC1695a4 = c2507n2.f5982j;
                if (sharedPreferencesC1695a4 != null) {
                    str3 = sharedPreferencesC1695a4.getString("NOTICEMEBEANV2", null);
                } else {
                    str3 = null;
                }
                if (str3 != null) {
                    c1489r = c2506m.f5973d;
                    c1489r.mo10510i((TitleBean.ResultsBean) new C8686j().m3235c(TitleBean.ResultsBean.class, sharedPreferencesC1695a4.getString("NOTICEMEBEANV2", null)));
                    c1489r.m10572e(new C2487v(c2470n));
                }
            }
            c2506m.getClass();
            InterfaceC2547a interfaceC2547a = c2506m.f5971b;
            String str4 = c2507n2.f5976d;
            String str5 = c2507n2.f5977e;
            c2506m.f5970a.mo1209c(interfaceC2547a.m9379a("https://api." + C2603g.m9338b("CUSTOMDOMAIN") + C2026c.m9721b("L2dvZmx5L3ZlcnNpb25UaXRsZQ=="), str4, str5).m1223b(C10142b.m1225a()).m1220f(C10235a.f20570b).m1222c(new C2501h(c2506m), new C2502i(c2506m, str4, str5)));
            c1489r = c2506m.f5973d;
            c1489r.m10572e(new C2487v(c2470n));
        }
    }

    /* renamed from: com.ambrose.overwall.fragment.n$h */
    /* loaded from: classes.dex */
    public class C2478h implements InterfaceC1490s<Boolean> {
        public C2478h() {
        }

        @Override // androidx.lifecycle.InterfaceC1490s
        public final void onChanged(Boolean bool) {
            String str;
            Boolean bool2 = bool;
            boolean booleanValue = bool2.booleanValue();
            C2470n c2470n = C2470n.this;
            if (booleanValue) {
                C8897o.m2905E();
                if (c2470n.f5920V) {
                    if (c2470n.f5918T.booleanValue()) {
                        str = "showInterstitialAd:   =  InterstitialRequesting";
                    } else if (c2470n.f5917S != null) {
                        if (!c2470n.f5916R.booleanValue() && System.currentTimeMillis() - c2470n.f5919U < 60000) {
                            str = "showInterstitial: NOSHOW 60";
                        } else {
                            c2470n.f5917S.show(c2470n.m2811m());
                            c2470n.f5919U = System.currentTimeMillis();
                        }
                    } else {
                        c2470n.m9410E();
                    }
                    Log.e("ConnectFragment", str);
                } else if (!c2470n.f5918T.booleanValue() && !c2470n.f5922X.booleanValue() && c2470n.f5924Z != null) {
                    if (c2470n.f5921W.booleanValue()) {
                        c2470n.f5919U = System.currentTimeMillis();
                        UnityAds.show(c2470n.m2811m(), "Interstitial_Android", new UnityAdsShowOptions(), c2470n.f5924Z);
                    } else {
                        c2470n.m9411D();
                    }
                }
            }
            c2470n.f5905G.f5763i.mo6789b(bool2.booleanValue(), true);
        }
    }

    public C2470n() {
        Boolean bool = Boolean.FALSE;
        this.f5914P = bool;
        this.f5915Q = "The current function is abnormal and cannot be used";
        Boolean bool2 = Boolean.TRUE;
        this.f5916R = bool2;
        this.f5918T = bool2;
        this.f5919U = 0L;
        this.f5920V = true;
        this.f5921W = bool;
        this.f5922X = bool;
        this.f5925d0 = bool;
    }

    /* renamed from: A */
    public static void m9414A(C2470n c2470n, String str) {
        c2470n.f5906H.getClass();
        C2507n.m9402f();
        C2603g.m9336d("SELECTSERVERNAME", str);
        DrawableTextView drawableTextView = c2470n.f5905G.f5762h;
        drawableTextView.setText(c2470n.getString(R.string.server_msg) + str);
    }

    /* renamed from: z */
    public static void m9408z(C2470n c2470n, List list) {
        FragmentActivity activity = c2470n.getActivity();
        C2618a c2618a = new C2618a(activity);
        c2618a.f6155o = new C2480p(c2470n);
        int i = c2470n.f5900B;
        int i2 = c2470n.f5901C;
        Collections.sort(list, C2595a.f6117a);
        c2618a.f6153m.m2611o(activity.getString(R.string.delat_lsit));
        c2618a.f6154n = new C2538c(list);
        ApplicationC2534a applicationC2534a = ApplicationC2534a.f6025a;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        c2618a.f6159s = linearLayoutManager;
        RecyclerView recyclerView = c2618a.f6151k;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(c2618a.f6154n);
        c2618a.f6154n.f9970k = new C2620b(c2618a);
        recyclerView.m10369h(new C2621c(c2618a));
        c2618a.f6157q = i;
        c2618a.f6158r = i2;
        if (recyclerView.getLayoutManager() != null && i2 >= 0) {
            ((LinearLayoutManager) recyclerView.getLayoutManager()).m10418d1(i2, i);
        }
        c2618a.m9323e();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[LOOP:0: B:10:0x003a->B:12:0x003e, LOOP_END] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9413B(boolean r4) {
        /*
            r3 = this;
            r0 = 2131952024(0x7f130198, float:1.954048E38)
            java.lang.String r0 = r3.getString(r0)
            com.kongzue.dialogx.dialogs.o r0 = com.kongzue.dialogx.dialogs.C8897o.m2896N(r0)
            r1 = 2
            r0.f16961F = r1
            r0.m2899K()
            r0 = 0
            r3.f5913O = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f5927w = r1
            if (r4 == 0) goto L1e
            goto L30
        L1e:
            java.util.List<com.android.tool.bean.ResultsBean> r4 = r3.f5926v
            java.util.Collections.shuffle(r4)
            int r4 = r3.f5911M
            r1 = 30
            if (r4 < r1) goto L30
            java.util.List<com.android.tool.bean.ResultsBean> r4 = r3.f5926v
            java.util.List r4 = r4.subList(r0, r1)
            goto L32
        L30:
            java.util.List<com.android.tool.bean.ResultsBean> r4 = r3.f5926v
        L32:
            r3.f5927w = r4
            int r4 = r4.size()
            r3.f5912N = r4
        L3a:
            int r4 = r3.f5912N
            if (r0 >= r4) goto L5c
            com.ambrose.overwall.mv.main.n r4 = r3.f5906H
            java.util.List<com.android.tool.bean.ResultsBean> r1 = r3.f5927w
            java.lang.Object r1 = r1.get(r0)
            com.android.tool.bean.ResultsBean r1 = (com.android.tool.bean.ResultsBean) r1
            java.lang.String r1 = r1.getGoFlyKey()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            androidx.lifecycle.r r4 = r4.m9407a(r1, r2)
            com.ambrose.overwall.fragment.x r1 = r3.f5910L
            r4.m10572e(r1)
            int r0 = r0 + 1
            goto L3a
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ambrose.overwall.fragment.C2470n.m9413B(boolean):void");
    }

    /* renamed from: C */
    public final void m9412C() {
        Application application = m2811m().getApplication();
        C10843j.m430f(application, "application");
        if (C1469h0.C1470a.f3445c == null) {
            C1469h0.C1470a.f3445c = new C1469h0.C1470a(application);
        }
        C1469h0.C1470a c1470a = C1469h0.C1470a.f3445c;
        C10843j.m433c(c1470a);
        C2507n c2507n = (C2507n) new C1469h0(this, c1470a).m10545a(C2507n.class);
        this.f5906H = c2507n;
        c2507n.f5980h = m2811m();
        c2507n.m9405c().mo10510i(Boolean.FALSE);
        Application application2 = c2507n.f3407a;
        C10843j.m432d(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        ((MyApplication) application2).registerReceiver(c2507n.f5983k, new IntentFilter("com.ambrose.overwall.action.activity"));
        C10843j.m432d(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        try {
            Intent intent = new Intent();
            intent.setAction("com.ambrose.overwall.action.service");
            intent.setPackage("com.ambrose.overwall");
            intent.putExtra("key", 1);
            intent.putExtra("content", (Serializable) "");
            application2.sendBroadcast(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (C2603g.m9338b("WHICHInterstitialAd") == null) {
            this.f5920V = true;
            m9410E();
        } else {
            this.f5920V = false;
            m9411D();
        }
        new AdLoader.Builder(ApplicationC2534a.f6025a, "ca-app-pub-3572596334288821/6859479287").forNativeAd(new C2484s(this)).withNativeAdOptions(new NativeAdOptions.Builder().build()).withAdListener(new C2483r(this)).build().loadAd(new AdRequest.Builder().build());
        FrameLayout frameLayout = this.f5905G.f5757c;
        C2507n c2507n2 = this.f5906H;
        c2507n2.getClass();
        ActivityC0101d activityC0101d = c2507n2.f5980h;
        C10843j.m433c(activityC0101d);
        AdView adView = new AdView(activityC0101d);
        adView.setAdListener(new C2514o(c2507n2));
        adView.setAdUnitId("ca-app-pub-3572596334288821/2699908279");
        AdRequest build = new AdRequest.Builder().build();
        C10843j.m431e(build, "Builder().build()");
        ActivityC0101d activityC0101d2 = c2507n2.f5980h;
        C10843j.m433c(activityC0101d2);
        Display defaultDisplay = activityC0101d2.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        ActivityC0101d activityC0101d3 = c2507n2.f5980h;
        C10843j.m433c(activityC0101d3);
        AdSize currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activityC0101d3, (int) (displayMetrics.widthPixels / displayMetrics.density));
        C10843j.m431e(currentOrientationAnchoredAdaptiveBannerAdSize, "getCurrentOrientationAnc…gmentActivity!!, adWidth)");
        adView.setAdSize(currentOrientationAnchoredAdaptiveBannerAdSize);
        adView.loadAd(build);
        frameLayout.addView(adView);
        C2507n c2507n3 = this.f5906H;
        c2507n3.getClass();
        C2506m c2506m = c2507n3.f5979g;
        InterfaceC2547a interfaceC2547a = c2506m.f5971b;
        String str = c2507n3.f5976d;
        String str2 = c2507n3.f5977e;
        c2506m.f5970a.mo1209c(interfaceC2547a.m9376d("https://api." + C2603g.m9338b("CUSTOMDOMAIN") + C2599d.m9341a("buORYQqQ2mcm5xEabsMPVg=="), str, str2).m1223b(C10142b.m1225a()).m1220f(C10235a.f20570b).m1222c(new C2497d(c2506m), new C2498e(c2506m, str, str2)));
        c2506m.f5972c.m10572e(new C2477g());
        this.f5906H.m9405c().m10572e(new C2478h());
    }

    /* renamed from: D */
    public final void m9411D() {
        Log.e("ConnectFragment", "loadInsertAD:  startRequest loadUnityInsertAD");
        if (this.f5923Y == null) {
            this.f5923Y = new C2472b();
        }
        if (this.f5924Z == null) {
            this.f5924Z = new C2473c();
        }
        this.f5918T = Boolean.TRUE;
        this.f5921W = Boolean.FALSE;
        UnityAds.load("Interstitial_Android", this.f5923Y);
    }

    /* renamed from: E */
    public final void m9410E() {
        this.f5918T = Boolean.TRUE;
        InterstitialAd.load(m2811m(), "ca-app-pub-3572596334288821/2058401133", new AdRequest.Builder().build(), new C2474d());
    }

    /* renamed from: F */
    public final void m9409F() {
        this.f5906H.getClass();
        String str = C2525f.f6010a;
        MyApplication myApplication = MyApplication.f5741c;
        C10843j.m431e(myApplication, "getContext()");
        Intent intent = new Intent(myApplication.getApplicationContext(), GoFlyVpnService.class);
        if (Build.VERSION.SDK_INT > 25) {
            myApplication.startForegroundService(intent);
        } else {
            myApplication.startService(intent);
        }
        C8897o m2897M = C8897o.m2897M(m2811m(), getString(R.string.ic_server_now));
        m2897M.f16968z = new C2476f();
        m2897M.m2899K();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        ViewGroup viewGroup;
        boolean z;
        int i3;
        boolean z2;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            m9409F();
        }
        if (i2 == 0) {
            boolean z3 = false;
            this.f5905G.f5763i.mo6789b(false, true);
            C8897o.m2905E();
            View view = this.f5905G.f5764j;
            String string = getString(R.string.connect_reject);
            int[] iArr = Snackbar.f15369B;
            ViewGroup viewGroup2 = null;
            while (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
            viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                Context context = viewGroup.getContext();
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.f15369B);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1 && resourceId2 != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i3 = R.layout.mtrl_layout_snackbar_include;
                } else {
                    i3 = R.layout.design_layout_snackbar_include;
                }
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i3, viewGroup, false);
                Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
                ((SnackbarContentLayout) snackbar.f15341i.getChildAt(0)).getMessageView().setText(string);
                snackbar.f15343k = 0;
                snackbar.f15341i.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#1DE9B6")));
                ((SnackbarContentLayout) snackbar.f15341i.getChildAt(0)).getMessageView().setTextColor(Color.parseColor("#FFFFFF"));
                C7844o m4413b = C7844o.m4413b();
                int m4417g = snackbar.m4417g();
                BaseTransientBottomBar.C7826c c7826c = snackbar.f15352t;
                synchronized (m4413b.f15389a) {
                    if (m4413b.m4412c(c7826c)) {
                        C7844o.C7847c c7847c = m4413b.f15391c;
                        c7847c.f15395b = m4417g;
                        m4413b.f15390b.removeCallbacksAndMessages(c7847c);
                        m4413b.m4409f(m4413b.f15391c);
                    } else {
                        C7844o.C7847c c7847c2 = m4413b.f15392d;
                        if (c7847c2 != null) {
                            if (c7826c != null && c7847c2.f15394a.get() == c7826c) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                z3 = true;
                            }
                        }
                        if (z3) {
                            m4413b.f15392d.f15395b = m4417g;
                        } else {
                            m4413b.f15392d = new C7844o.C7847c(m4417g, c7826c);
                        }
                        C7844o.C7847c c7847c3 = m4413b.f15391c;
                        if (c7847c3 == null || !m4413b.m4414a(c7847c3, 4)) {
                            m4413b.f15391c = null;
                            C7844o.C7847c c7847c4 = m4413b.f15392d;
                            if (c7847c4 != null) {
                                m4413b.f15391c = c7847c4;
                                m4413b.f15392d = null;
                                C7844o.InterfaceC7846b interfaceC7846b = c7847c4.f15394a.get();
                                if (interfaceC7846b != null) {
                                    interfaceC7846b.show();
                                } else {
                                    m4413b.f15391c = null;
                                }
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
    }

    @Override // com.ambrose.overwall.fragment.base.AbstractC2407b, com.qmuiteam.qmui.arch.AbstractC9008b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f5906H.m9404d();
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: p */
    public final void mo2808p() {
        if (System.currentTimeMillis() - this.f5929y < 2000) {
            this.f5906H.m9404d();
            m2805t();
            return;
        }
        this.f5929y = System.currentTimeMillis();
        Toast.makeText(MyApplication.f5741c, getString(R.string.exitapp), 0).show();
    }

    @Override // com.qmuiteam.qmui.arch.AbstractC9008b
    @SuppressLint({"WrongConstant", "SimpleDateFormat"})
    /* renamed from: q */
    public final View mo2788q() {
        View inflate = LayoutInflater.from(m2811m()).inflate(R.layout.fragment_connect, (ViewGroup) null, false);
        int i = R.id.colldeclayout;
        LinearLayout linearLayout = (LinearLayout) C1806b.m9912a(R.id.colldeclayout, inflate);
        if (linearLayout != null) {
            i = R.id.customlayout;
            FrameLayout frameLayout = (FrameLayout) C1806b.m9912a(R.id.customlayout, inflate);
            if (frameLayout != null) {
                i = R.id.my_template;
                TemplateView templateView = (TemplateView) C1806b.m9912a(R.id.my_template, inflate);
                if (templateView != null) {
                    i = R.id.qmuiemptyview;
                    QMUIEmptyView qMUIEmptyView = (QMUIEmptyView) C1806b.m9912a(R.id.qmuiemptyview, inflate);
                    if (qMUIEmptyView != null) {
                        QMUIWindowInsetLayout qMUIWindowInsetLayout = (QMUIWindowInsetLayout) inflate;
                        i = R.id.qmuprox;
                        ProgressBar progressBar = (ProgressBar) C1806b.m9912a(R.id.qmuprox, inflate);
                        if (progressBar != null) {
                            i = R.id.showConnect;
                            DrawableTextView drawableTextView = (DrawableTextView) C1806b.m9912a(R.id.showConnect, inflate);
                            if (drawableTextView != null) {
                                i = R.id.switcher;
                                SwitcherC switcherC = (SwitcherC) C1806b.m9912a(R.id.switcher, inflate);
                                if (switcherC != null) {
                                    i = R.id.topbar;
                                    QMUITopBarLayout qMUITopBarLayout = (QMUITopBarLayout) C1806b.m9912a(R.id.topbar, inflate);
                                    if (qMUITopBarLayout != null) {
                                        this.f5905G = new C2395c(qMUIWindowInsetLayout, linearLayout, frameLayout, templateView, qMUIEmptyView, qMUIWindowInsetLayout, progressBar, drawableTextView, switcherC, qMUITopBarLayout);
                                        qMUITopBarLayout.m2608f(MyApplication.f5741c.getString(R.string.app_name));
                                        this.f5905G.f5764j.f17642c.m2616j(R.mipmap.ic_other, R.id.topbar_view_right).setOnClickListener(new View$OnClickListenerC2471a());
                                        C9135i m2657a = C9135i.m2657a();
                                        m2657a.m2656b(R.attr.app_skin_common_background);
                                        QMUIWindowInsetLayout qMUIWindowInsetLayout2 = this.f5905G.f5760f;
                                        int i2 = C9106f.f17535a;
                                        C9106f.m2677c(qMUIWindowInsetLayout2, m2657a.m2655c());
                                        this.f5905G.f5759e.setLoadingShowing(false);
                                        this.f5926v = new ArrayList();
                                        C2643a c2643a = new C2643a();
                                        c2643a.f6217h[0] = Color.parseColor("#000000");
                                        c2643a.f6214e = AbstractC2407b.m9419y(34);
                                        int parseColor = Color.parseColor("#a0673AB7");
                                        c2643a.f6212c = parseColor;
                                        Paint paint = c2643a.f6210a;
                                        paint.setShadowLayer(c2643a.f6211b, c2643a.f6215f, c2643a.f6216g, parseColor);
                                        int m9419y = AbstractC2407b.m9419y(6);
                                        c2643a.f6211b = m9419y;
                                        paint.setShadowLayer(m9419y, c2643a.f6215f, c2643a.f6216g, c2643a.f6212c);
                                        c2643a.f6215f = 0;
                                        paint.setShadowLayer(c2643a.f6211b, 0, c2643a.f6216g, c2643a.f6212c);
                                        int m9419y2 = AbstractC2407b.m9419y(4);
                                        c2643a.f6216g = m9419y2;
                                        paint.setShadowLayer(c2643a.f6211b, c2643a.f6215f, m9419y2, c2643a.f6212c);
                                        DrawableTextView drawableTextView2 = this.f5905G.f5762h;
                                        if (drawableTextView2 != null) {
                                            drawableTextView2.setLayerType(1, null);
                                            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                                            ViewCompat.C0814d.m11748q(drawableTextView2, c2643a);
                                        }
                                        this.f5904F = new LinearLayout.LayoutParams(-1, -2);
                                        int m2646a = C9141b.m2646a(ApplicationC2534a.f6025a, 10);
                                        this.f5904F.setMargins(m2646a, m2646a, m2646a, m2646a);
                                        this.f5905G.f5763i.setOnClickListener(new View$OnClickListenerC2475e());
                                        m9412C();
                                        return this.f5905G.f5755a;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.ambrose.overwall.p006ui.AbstractC2518d, com.qmuiteam.qmui.arch.AbstractC9008b
    /* renamed from: s */
    public final Object mo2806s() {
        return null;
    }
}
