package com.applovin.impl.sdk.p031c;

import android.net.Uri;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.p008a.C2666m;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.ConnectionResult;
import com.vungle.warren.VungleApiClient;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.c.b */
/* loaded from: classes.dex */
public class C3109b<T> implements Comparable {

    /* renamed from: W */
    public static final C3109b<Boolean> f7791W;

    /* renamed from: X */
    public static final C3109b<String> f7792X;

    /* renamed from: Y */
    public static final C3109b<Boolean> f7793Y;

    /* renamed from: Z */
    public static final C3109b<String> f7794Z;

    /* renamed from: aA */
    public static final C3109b<Long> f7796aA;

    /* renamed from: aB */
    public static final C3109b<Long> f7797aB;

    /* renamed from: aC */
    public static final C3109b<Long> f7798aC;

    /* renamed from: aD */
    public static final C3109b<Long> f7799aD;

    /* renamed from: aE */
    public static final C3109b<Long> f7800aE;

    /* renamed from: aF */
    public static final C3109b<Long> f7801aF;

    /* renamed from: aG */
    public static final C3109b<String> f7802aG;

    /* renamed from: aH */
    public static final C3109b<String> f7803aH;

    /* renamed from: aI */
    public static final C3109b<String> f7804aI;

    /* renamed from: aJ */
    public static final C3109b<String> f7805aJ;

    /* renamed from: aK */
    public static final C3109b<Long> f7806aK;

    /* renamed from: aL */
    public static final C3109b<Integer> f7807aL;

    /* renamed from: aM */
    public static final C3109b<Integer> f7808aM;

    /* renamed from: aN */
    public static final C3109b<Integer> f7809aN;

    /* renamed from: aO */
    public static final C3109b<String> f7810aO;

    /* renamed from: aP */
    public static final C3109b<String> f7811aP;

    /* renamed from: aQ */
    public static final C3109b<String> f7812aQ;

    /* renamed from: aR */
    public static final C3109b<String> f7813aR;

    /* renamed from: aS */
    public static final C3109b<String> f7814aS;

    /* renamed from: aT */
    public static final C3109b<String> f7815aT;

    /* renamed from: aU */
    public static final C3109b<String> f7816aU;

    /* renamed from: aV */
    public static final C3109b<String> f7817aV;

    /* renamed from: aW */
    public static final C3109b<String> f7818aW;

    /* renamed from: aX */
    public static final C3109b<String> f7819aX;

    /* renamed from: aY */
    public static final C3109b<String> f7820aY;

    /* renamed from: aZ */
    public static final C3109b<String> f7821aZ;

    /* renamed from: aa */
    public static final C3109b<Long> f7822aa;

    /* renamed from: ab */
    public static final C3109b<Boolean> f7823ab;

    /* renamed from: ac */
    public static final C3109b<String> f7824ac;

    /* renamed from: ad */
    public static final C3109b<String> f7825ad;

    /* renamed from: ae */
    public static final C3109b<String> f7826ae;

    /* renamed from: af */
    public static final C3109b<String> f7827af;

    /* renamed from: ag */
    public static final C3109b<Boolean> f7828ag;

    /* renamed from: ah */
    public static final C3109b<Boolean> f7829ah;

    /* renamed from: ai */
    public static final C3109b<Boolean> f7830ai;

    /* renamed from: aj */
    public static final C3109b<Boolean> f7831aj;

    /* renamed from: ak */
    public static final C3109b<Long> f7832ak;

    /* renamed from: al */
    public static final C3109b<Integer> f7833al;

    /* renamed from: am */
    public static final C3109b<Integer> f7834am;

    /* renamed from: an */
    public static final C3109b<Boolean> f7835an;

    /* renamed from: ao */
    public static final C3109b<Boolean> f7836ao;

    /* renamed from: ap */
    public static final C3109b<Integer> f7837ap;

    /* renamed from: aq */
    public static final C3109b<Boolean> f7838aq;

    /* renamed from: ar */
    public static final C3109b<String> f7839ar;

    /* renamed from: as */
    public static final C3109b<Boolean> f7840as;

    /* renamed from: at */
    public static final C3109b<String> f7841at;

    /* renamed from: au */
    public static final C3109b<Boolean> f7842au;

    /* renamed from: av */
    public static final C3109b<Long> f7843av;

    /* renamed from: aw */
    public static final C3109b<Boolean> f7844aw;

    /* renamed from: ax */
    public static final C3109b<Boolean> f7845ax;

    /* renamed from: ay */
    public static final C3109b<Boolean> f7846ay;

    /* renamed from: az */
    public static final C3109b<Boolean> f7847az;

    /* renamed from: bA */
    public static final C3109b<String> f7849bA;

    /* renamed from: bB */
    public static final C3109b<String> f7850bB;

    /* renamed from: bC */
    public static final C3109b<String> f7851bC;

    /* renamed from: bD */
    public static final C3109b<String> f7852bD;

    /* renamed from: bE */
    public static final C3109b<Boolean> f7853bE;

    /* renamed from: bF */
    public static final C3109b<Integer> f7854bF;

    /* renamed from: bG */
    public static final C3109b<Integer> f7855bG;

    /* renamed from: bH */
    public static final C3109b<Boolean> f7856bH;

    /* renamed from: bI */
    public static final C3109b<Long> f7857bI;

    /* renamed from: bJ */
    public static final C3109b<Integer> f7858bJ;

    /* renamed from: bK */
    public static final C3109b<Integer> f7859bK;

    /* renamed from: bL */
    public static final C3109b<Integer> f7860bL;

    /* renamed from: bM */
    public static final C3109b<Integer> f7861bM;

    /* renamed from: bN */
    public static final C3109b<Integer> f7862bN;

    /* renamed from: bO */
    public static final C3109b<Integer> f7863bO;

    /* renamed from: bP */
    public static final C3109b<Integer> f7864bP;

    /* renamed from: bQ */
    public static final C3109b<Integer> f7865bQ;

    /* renamed from: bR */
    public static final C3109b<Float> f7866bR;

    /* renamed from: bS */
    public static final C3109b<Long> f7867bS;

    /* renamed from: bT */
    public static final C3109b<Long> f7868bT;

    /* renamed from: bU */
    public static final C3109b<Integer> f7869bU;

    /* renamed from: bV */
    public static final C3109b<Integer> f7870bV;

    /* renamed from: bW */
    public static final C3109b<Integer> f7871bW;

    /* renamed from: bX */
    public static final C3109b<Boolean> f7872bX;

    /* renamed from: bY */
    public static final C3109b<Integer> f7873bY;

    /* renamed from: bZ */
    public static final C3109b<Boolean> f7874bZ;

    /* renamed from: ba */
    public static final C3109b<String> f7875ba;

    /* renamed from: bb */
    public static final C3109b<String> f7876bb;

    /* renamed from: bc */
    public static final C3109b<String> f7877bc;

    /* renamed from: bd */
    public static final C3109b<String> f7878bd;

    /* renamed from: be */
    public static final C3109b<Boolean> f7879be;

    /* renamed from: bf */
    public static final C3109b<Integer> f7880bf;

    /* renamed from: bg */
    public static final C3109b<Integer> f7881bg;

    /* renamed from: bh */
    public static final C3109b<Long> f7882bh;

    /* renamed from: bi */
    public static final C3109b<Boolean> f7883bi;

    /* renamed from: bj */
    public static final C3109b<Boolean> f7884bj;

    /* renamed from: bk */
    public static final C3109b<Long> f7885bk;

    /* renamed from: bl */
    public static final C3109b<Integer> f7886bl;

    /* renamed from: bm */
    public static final C3109b<String> f7887bm;

    /* renamed from: bn */
    public static final C3109b<Boolean> f7888bn;

    /* renamed from: bo */
    public static final C3109b<Boolean> f7889bo;

    /* renamed from: bp */
    public static final C3109b<String> f7890bp;

    /* renamed from: bq */
    public static final C3109b<String> f7891bq;

    /* renamed from: br */
    public static final C3109b<Boolean> f7892br;

    /* renamed from: bs */
    public static final C3109b<Integer> f7893bs;

    /* renamed from: bt */
    public static final C3109b<Integer> f7894bt;

    /* renamed from: bu */
    public static final C3109b<Boolean> f7895bu;

    /* renamed from: bv */
    public static final C3109b<String> f7896bv;

    /* renamed from: bw */
    public static final C3109b<String> f7897bw;

    /* renamed from: bx */
    public static final C3109b<String> f7898bx;

    /* renamed from: by */
    public static final C3109b<String> f7899by;

    /* renamed from: bz */
    public static final C3109b<Boolean> f7900bz;

    /* renamed from: cA */
    public static final C3109b<Integer> f7901cA;

    /* renamed from: cB */
    public static final C3109b<Integer> f7902cB;

    /* renamed from: cC */
    public static final C3109b<Long> f7903cC;

    /* renamed from: cD */
    public static final C3109b<Integer> f7904cD;

    /* renamed from: cE */
    public static final C3109b<Integer> f7905cE;

    /* renamed from: cF */
    public static final C3109b<Boolean> f7906cF;

    /* renamed from: cG */
    public static final C3109b<Boolean> f7907cG;

    /* renamed from: cH */
    public static final C3109b<Integer> f7908cH;

    /* renamed from: cI */
    public static final C3109b<Integer> f7909cI;

    /* renamed from: cJ */
    public static final C3109b<Integer> f7910cJ;

    /* renamed from: cK */
    public static final C3109b<Boolean> f7911cK;

    /* renamed from: cL */
    public static final C3109b<Integer> f7912cL;

    /* renamed from: cM */
    public static final C3109b<Boolean> f7913cM;

    /* renamed from: cN */
    public static final C3109b<Integer> f7914cN;

    /* renamed from: cO */
    public static final C3109b<Integer> f7915cO;

    /* renamed from: cP */
    public static final C3109b<Integer> f7916cP;

    /* renamed from: cQ */
    public static final C3109b<Boolean> f7917cQ;

    /* renamed from: cR */
    public static final C3109b<Integer> f7918cR;

    /* renamed from: cS */
    public static final C3109b<Integer> f7919cS;

    /* renamed from: cT */
    public static final C3109b<Boolean> f7920cT;

    /* renamed from: cU */
    public static final C3109b<Boolean> f7921cU;

    /* renamed from: cV */
    public static final C3109b<Integer> f7922cV;

    /* renamed from: cW */
    public static final C3109b<Integer> f7923cW;

    /* renamed from: cX */
    public static final C3109b<Integer> f7924cX;

    /* renamed from: cY */
    public static final C3109b<Integer> f7925cY;

    /* renamed from: cZ */
    public static final C3109b<Boolean> f7926cZ;

    /* renamed from: ca */
    public static final C3109b<String> f7927ca;

    /* renamed from: cb */
    public static final C3109b<String> f7928cb;

    /* renamed from: cc */
    public static final C3109b<String> f7929cc;

    /* renamed from: cd */
    public static final C3109b<Integer> f7930cd;

    /* renamed from: ce */
    public static final C3109b<Integer> f7931ce;

    /* renamed from: cf */
    public static final C3109b<Long> f7932cf;

    /* renamed from: cg */
    public static final C3109b<Long> f7933cg;

    /* renamed from: ch */
    public static final C3109b<Boolean> f7934ch;

    /* renamed from: ci */
    public static final C3109b<Integer> f7935ci;

    /* renamed from: cj */
    public static final C3109b<Integer> f7936cj;

    /* renamed from: ck */
    public static final C3109b<Integer> f7937ck;

    /* renamed from: cl */
    public static final C3109b<Long> f7938cl;

    /* renamed from: cm */
    public static final C3109b<Long> f7939cm;

    /* renamed from: cn */
    public static final C3109b<Boolean> f7940cn;

    /* renamed from: co */
    public static final C3109b<Boolean> f7941co;

    /* renamed from: cp */
    public static final C3109b<Boolean> f7942cp;

    /* renamed from: cq */
    public static final C3109b<Boolean> f7943cq;

    /* renamed from: cr */
    public static final C3109b<Boolean> f7944cr;

    /* renamed from: cs */
    public static final C3109b<Boolean> f7945cs;

    /* renamed from: ct */
    public static final C3109b<Boolean> f7946ct;

    /* renamed from: cu */
    public static final C3109b<Boolean> f7947cu;

    /* renamed from: cv */
    public static final C3109b<Integer> f7948cv;

    /* renamed from: cw */
    public static final C3109b<Integer> f7949cw;

    /* renamed from: cx */
    public static final C3109b<Integer> f7950cx;

    /* renamed from: cy */
    public static final C3109b<Long> f7951cy;

    /* renamed from: cz */
    public static final C3109b<Integer> f7952cz;

    /* renamed from: dA */
    public static final C3109b<Boolean> f7953dA;

    /* renamed from: dB */
    public static final C3109b<Boolean> f7954dB;

    /* renamed from: dC */
    public static final C3109b<Boolean> f7955dC;

    /* renamed from: dD */
    public static final C3109b<Boolean> f7956dD;

    /* renamed from: dE */
    public static final C3109b<Boolean> f7957dE;

    /* renamed from: dF */
    public static final C3109b<Boolean> f7958dF;

    /* renamed from: dG */
    public static final C3109b<Boolean> f7959dG;

    /* renamed from: dH */
    public static final C3109b<Boolean> f7960dH;

    /* renamed from: dI */
    public static final C3109b<Boolean> f7961dI;

    /* renamed from: dJ */
    public static final C3109b<Boolean> f7962dJ;

    /* renamed from: dK */
    public static final C3109b<Boolean> f7963dK;

    /* renamed from: dL */
    public static final C3109b<Float> f7964dL;

    /* renamed from: dM */
    public static final C3109b<Boolean> f7965dM;

    /* renamed from: dN */
    public static final C3109b<Boolean> f7966dN;

    /* renamed from: dO */
    public static final C3109b<Boolean> f7967dO;

    /* renamed from: dP */
    public static final C3109b<Boolean> f7968dP;

    /* renamed from: dQ */
    public static final C3109b<Float> f7969dQ;

    /* renamed from: dR */
    public static final C3109b<Integer> f7970dR;

    /* renamed from: dS */
    public static final C3109b<Boolean> f7971dS;

    /* renamed from: dT */
    public static final C3109b<Boolean> f7972dT;

    /* renamed from: dU */
    public static final C3109b<Long> f7973dU;

    /* renamed from: dV */
    public static final C3109b<Integer> f7974dV;

    /* renamed from: dW */
    public static final C3109b<Boolean> f7975dW;

    /* renamed from: dX */
    public static final C3109b<Long> f7976dX;

    /* renamed from: dY */
    public static final C3109b<Integer> f7977dY;

    /* renamed from: dZ */
    public static final C3109b<Boolean> f7978dZ;

    /* renamed from: da */
    public static final C3109b<Boolean> f7979da;

    /* renamed from: db */
    public static final C3109b<Integer> f7980db;

    /* renamed from: dc */
    public static final C3109b<Integer> f7981dc;

    /* renamed from: dd */
    public static final C3109b<Boolean> f7982dd;

    /* renamed from: de */
    public static final C3109b<Boolean> f7983de;

    /* renamed from: df */
    public static final C3109b<Boolean> f7984df;

    /* renamed from: dg */
    public static final C3109b<Boolean> f7985dg;

    /* renamed from: dh */
    public static final C3109b<Long> f7986dh;

    /* renamed from: di */
    public static final C3109b<Integer> f7987di;

    /* renamed from: dj */
    public static final C3109b<Long> f7988dj;

    /* renamed from: dk */
    public static final C3109b<Integer> f7989dk;

    /* renamed from: dl */
    public static final C3109b<Boolean> f7990dl;

    /* renamed from: dm */
    public static final C3109b<Long> f7991dm;

    /* renamed from: dn */
    public static final C3109b<Long> f7992dn;

    /* renamed from: do */
    public static final C3109b<Boolean> f7993do;

    /* renamed from: dp */
    public static final C3109b<Boolean> f7994dp;

    /* renamed from: dq */
    public static final C3109b<Boolean> f7995dq;

    /* renamed from: dr */
    public static final C3109b<Boolean> f7996dr;

    /* renamed from: ds */
    public static final C3109b<Boolean> f7997ds;

    /* renamed from: dt */
    public static final C3109b<Boolean> f7998dt;

    /* renamed from: du */
    public static final C3109b<Boolean> f7999du;

    /* renamed from: dv */
    public static final C3109b<Boolean> f8000dv;

    /* renamed from: dw */
    public static final C3109b<Boolean> f8001dw;

    /* renamed from: dx */
    public static final C3109b<Boolean> f8002dx;

    /* renamed from: dy */
    public static final C3109b<Boolean> f8003dy;

    /* renamed from: dz */
    public static final C3109b<String> f8004dz;

    /* renamed from: eA */
    public static final C3109b<Boolean> f8005eA;

    /* renamed from: eB */
    public static final C3109b<Boolean> f8006eB;

    /* renamed from: eC */
    public static final C3109b<Boolean> f8007eC;

    /* renamed from: eD */
    public static final C3109b<Boolean> f8008eD;

    /* renamed from: eE */
    public static final C3109b<Boolean> f8009eE;

    /* renamed from: eF */
    public static final C3109b<Boolean> f8010eF;

    /* renamed from: eG */
    public static final C3109b<Boolean> f8011eG;

    /* renamed from: eH */
    public static final C3109b<Boolean> f8012eH;

    /* renamed from: eI */
    public static final C3109b<Boolean> f8013eI;

    /* renamed from: eJ */
    public static final C3109b<Boolean> f8014eJ;

    /* renamed from: eK */
    public static final C3109b<Boolean> f8015eK;

    /* renamed from: eL */
    public static final C3109b<Boolean> f8016eL;

    /* renamed from: eM */
    public static final C3109b<Boolean> f8017eM;

    /* renamed from: eN */
    public static final C3109b<Boolean> f8018eN;

    /* renamed from: eO */
    public static final C3109b<Boolean> f8019eO;

    /* renamed from: eP */
    public static final C3109b<Boolean> f8020eP;

    /* renamed from: eQ */
    public static final C3109b<Long> f8021eQ;

    /* renamed from: eR */
    public static final C3109b<Long> f8022eR;

    /* renamed from: eS */
    public static final C3109b<Long> f8023eS;

    /* renamed from: eT */
    public static final C3109b<Boolean> f8024eT;

    /* renamed from: eU */
    public static final C3109b<String> f8025eU;

    /* renamed from: eV */
    public static final C3109b<String> f8026eV;

    /* renamed from: eW */
    public static final C3109b<String> f8027eW;

    /* renamed from: eX */
    public static final C3109b<Boolean> f8028eX;

    /* renamed from: ea */
    public static final C3109b<Boolean> f8029ea;

    /* renamed from: eb */
    public static final C3109b<Integer> f8030eb;

    /* renamed from: ec */
    public static final C3109b<Integer> f8031ec;

    /* renamed from: ed */
    public static final C3109b<Integer> f8032ed;

    /* renamed from: ee */
    public static final C3109b<Boolean> f8033ee;

    /* renamed from: ef */
    public static final C3109b<String> f8034ef;

    /* renamed from: eg */
    public static final C3109b<String> f8035eg;

    /* renamed from: eh */
    public static final C3109b<Integer> f8036eh;

    /* renamed from: ei */
    public static final C3109b<Integer> f8037ei;

    /* renamed from: ej */
    public static final C3109b<String> f8038ej;

    /* renamed from: ek */
    public static final C3109b<String> f8039ek;

    /* renamed from: el */
    public static final C3109b<Boolean> f8040el;

    /* renamed from: em */
    public static final C3109b<Integer> f8041em;

    /* renamed from: en */
    public static final C3109b<Integer> f8042en;

    /* renamed from: eo */
    public static final C3109b<Integer> f8043eo;

    /* renamed from: ep */
    public static final C3109b<Boolean> f8044ep;

    /* renamed from: eq */
    public static final C3109b<Boolean> f8045eq;

    /* renamed from: er */
    public static final C3109b<Long> f8046er;

    /* renamed from: es */
    public static final C3109b<Long> f8047es;

    /* renamed from: et */
    public static final C3109b<Integer> f8048et;

    /* renamed from: eu */
    public static final C3109b<Boolean> f8049eu;

    /* renamed from: ev */
    public static final C3109b<Boolean> f8050ev;

    /* renamed from: ew */
    public static final C3109b<Boolean> f8051ew;

    /* renamed from: ex */
    public static final C3109b<Boolean> f8052ex;

    /* renamed from: ey */
    public static final C3109b<Boolean> f8053ey;

    /* renamed from: ez */
    public static final C3109b<Boolean> f8054ez;

    /* renamed from: c */
    private final String f8055c;

    /* renamed from: d */
    private final T f8056d;

    /* renamed from: a */
    private static final List<?> f7795a = Arrays.asList(Boolean.class, Float.class, Integer.class, Long.class, String.class);

    /* renamed from: b */
    private static final Map<String, C3109b<?>> f7848b = new HashMap((int) AdRequest.MAX_CONTENT_URL_LENGTH);

    static {
        Boolean bool = Boolean.FALSE;
        f7791W = m7810a("is_disabled", bool);
        f7792X = m7810a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        f7793Y = m7810a("rss", bool2);
        f7794Z = m7810a("device_token", "");
        f7822aa = m7810a("publisher_id", 0L);
        f7823ab = m7810a("is_verbose_logging", bool);
        f7824ac = m7810a("sc", "");
        f7825ad = m7810a("sc2", "");
        f7826ae = m7810a("sc3", "");
        f7827af = m7810a("server_installed_at", "");
        f7828ag = m7810a("track_network_response_codes", bool);
        f7829ah = m7810a("submit_network_response_codes", bool);
        f7830ai = m7810a("clear_network_response_codes_on_request", bool2);
        f7831aj = m7810a("clear_completion_callback_on_failure", bool);
        f7832ak = m7810a("sicd_ms", 0L);
        f7833al = m7810a("logcat_max_line_size", 1000);
        f7834am = m7810a("stps", 16);
        f7835an = m7810a("ustp", bool);
        f7836ao = m7810a("exception_handler_enabled", bool2);
        f7837ap = m7810a("network_thread_count", 4);
        f7838aq = m7810a("init_omsdk", bool2);
        f7839ar = m7810a("omsdk_partner_name", "applovin");
        f7840as = m7810a("publisher_can_show_consent_dialog", bool2);
        f7841at = m7810a("consent_dialog_url", "https://assets.applovin.com/gdpr/flow_v1/gdpr-flow-1.html");
        f7842au = m7810a("consent_dialog_immersive_mode_on", bool);
        f7843av = m7810a("consent_dialog_show_from_alert_delay_ms", 450L);
        f7844aw = m7810a("alert_consent_for_dialog_rejected", bool);
        f7845ax = m7810a("alert_consent_for_dialog_closed", bool);
        f7846ay = m7810a("alert_consent_for_dialog_closed_with_back_button", bool);
        f7847az = m7810a("alert_consent_after_init", bool);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f7796aA = C3114f.m7779a(timeUnit, 5L, "alert_consent_after_init_interval_ms");
        f7797aB = C3114f.m7779a(timeUnit, 30L, "alert_consent_after_dialog_rejection_interval_ms");
        f7798aC = C3114f.m7779a(timeUnit, 5L, "alert_consent_after_dialog_close_interval_ms");
        f7799aD = C3114f.m7779a(timeUnit, 5L, "alert_consent_after_dialog_close_with_back_button_interval_ms");
        f7800aE = C3114f.m7779a(timeUnit, 10L, "alert_consent_after_cancel_interval_ms");
        f7801aF = C3114f.m7779a(timeUnit, 5L, "alert_consent_reschedule_interval_ms");
        f7802aG = m7810a("text_alert_consent_title", "Make this App Better and Stay Free!");
        f7803aH = m7810a("text_alert_consent_body", "If you don't give us consent to use your data, you will be making our ability to support this app harder, which may negatively affect the user experience.");
        f7804aI = m7810a("text_alert_consent_yes_option", "I Agree");
        f7805aJ = m7810a("text_alert_consent_no_option", "Cancel");
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        f7806aK = C3114f.m7779a(timeUnit2, 1L, "ttc_max_click_duration_ms");
        f7807aL = m7810a("ttc_max_click_distance_dp", 10);
        f7808aM = m7810a("ttc_acrsv2a", Integer.valueOf(AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN.ordinal()));
        f7809aN = m7810a("ttc_edge_buffer_dp", 0);
        f7810aO = m7810a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        f7811aP = m7810a("fetch_settings_endpoint", "https://ms.applovin.com/");
        f7812aQ = m7810a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        f7813aR = m7810a("adserver_endpoint", "https://a.applovin.com/");
        f7814aS = m7810a("adserver_backup_endpoint", "https://a.applvn.com/");
        f7815aT = m7810a("api_endpoint", "https://d.applovin.com/");
        f7816aU = m7810a("api_backup_endpoint", "https://d.applvn.com/");
        f7817aV = m7810a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        f7818aW = m7810a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        f7819aX = m7810a("fetch_variables_endpoint", "https://ms.applovin.com/");
        f7820aY = m7810a("fetch_variables_backup_endpoint", "https://ms.applvn.com/");
        f7821aZ = m7810a("anr_postback_endpoint", "https://ms.applovin.com/1.0/sdk/error");
        f7875ba = m7810a("token_type_prefixes_r", "4!");
        f7876bb = m7810a("token_type_prefixes_arj", "json_v3!");
        f7877bc = m7810a("top_level_events", "landing,paused,resumed,ref,rdf,checkout,iap");
        f7878bd = m7810a("valid_super_property_types", String.class.getName() + "," + Integer.class.getName() + "," + Long.class.getName() + "," + Double.class.getName() + "," + Float.class.getName() + "," + Date.class.getName() + "," + Uri.class.getName() + "," + List.class.getName() + "," + Map.class.getName());
        f7879be = m7810a("persist_super_properties", bool2);
        f7880bf = m7810a("super_property_string_max_length", 1024);
        f7881bg = m7810a("super_property_url_max_length", 1024);
        f7882bh = C3114f.m7779a(timeUnit, 10L, "cached_advertising_info_ttl_ms");
        f7883bi = m7810a("use_per_format_cache_queues", bool2);
        f7884bj = m7810a("cache_cleanup_enabled", bool);
        f7885bk = m7810a("cache_file_ttl_seconds", Long.valueOf(TimeUnit.DAYS.toSeconds(1L)));
        f7886bl = m7810a("cache_max_size_mb", -1);
        f7887bm = m7810a("precache_delimiters", ")]',");
        f7888bn = m7810a("ad_resource_caching_enabled", bool2);
        f7889bo = m7810a("fail_ad_load_on_failed_video_cache", bool2);
        f7890bp = m7810a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        f7891bq = m7810a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        f7892br = m7810a("use_old_file_manager", bool);
        f7893bs = m7810a("vr_retry_count_v1", 1);
        f7894bt = m7810a("cr_retry_count_v1", 1);
        f7895bu = m7810a("incent_warning_enabled", bool);
        f7896bv = m7810a("text_incent_warning_title", "Attention!");
        f7897bw = m7810a("text_incent_warning_body", "You won’t get your reward if the video hasn’t finished.");
        f7898bx = m7810a("text_incent_warning_close_option", "Close");
        f7899by = m7810a("text_incent_warning_continue_option", "Keep Watching");
        f7900bz = m7810a("incent_nonvideo_warning_enabled", bool);
        f7849bA = m7810a("text_incent_nonvideo_warning_title", "Attention!");
        f7850bB = m7810a("text_incent_nonvideo_warning_body", "You won’t get your reward if the game hasn’t finished.");
        f7851bC = m7810a("text_incent_nonvideo_warning_close_option", "Close");
        f7852bD = m7810a("text_incent_nonvideo_warning_continue_option", "Keep Playing");
        f7853bE = m7810a("check_webview_has_gesture", bool);
        f7854bF = m7810a("close_button_touch_area", 0);
        f7855bG = m7810a("close_button_outside_touch_area", 0);
        f7856bH = m7810a("creative_debugger_enabled", bool);
        f7857bI = C3114f.m7779a(timeUnit2, 1L, "viewability_adview_imp_delay_ms");
        f7858bJ = m7810a("viewability_adview_banner_min_width", 320);
        f7859bK = m7810a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        f7860bL = m7810a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        f7861bM = m7810a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        f7862bN = m7810a("viewability_adview_leader_min_width", 728);
        f7863bO = m7810a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        f7864bP = m7810a("viewability_adview_native_min_width", 0);
        f7865bQ = m7810a("viewability_adview_native_min_height", 0);
        f7866bR = m7810a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        f7867bS = C3114f.m7779a(timeUnit2, 1L, "viewability_timer_min_visible_ms");
        f7868bT = m7810a("viewability_timer_interval_ms", 100L);
        f7869bU = m7810a("expandable_close_button_size", 27);
        f7870bV = m7810a("expandable_h_close_button_margin", 10);
        f7871bW = m7810a("expandable_t_close_button_margin", 10);
        f7872bX = m7810a("expandable_lhs_close_button", bool);
        f7873bY = m7810a("expandable_close_button_touch_area", 0);
        f7874bZ = m7810a("iaad", bool);
        f7927ca = m7810a("js_tag_schemes", "applovin,mopub");
        f7928cb = m7810a("js_tag_load_success_hosts", "load,load_succeeded");
        f7929cc = m7810a("js_tag_load_failure_hosts", "failLoad,load_failed");
        f7930cd = m7810a("auxiliary_operations_threads", 3);
        f7931ce = m7810a("caching_operations_threads", 8);
        f7932cf = C3114f.m7779a(timeUnit2, 10L, "fullscreen_ad_pending_display_state_timeout_ms");
        f7933cg = C3114f.m7779a(timeUnit, 2L, "fullscreen_ad_showing_state_timeout_ms");
        f7934ch = m7810a("lhs_close_button_video", bool);
        f7935ci = m7810a("close_button_right_margin_video", 4);
        f7936cj = m7810a("close_button_size_video", 30);
        f7937ck = m7810a("close_button_top_margin_video", 8);
        f7938cl = m7810a("inter_display_delay", 200L);
        f7939cm = m7810a("maximum_close_button_delay_seconds", 999L);
        f7940cn = m7810a("respect_close_button", bool2);
        f7941co = m7810a("lhs_skip_button", bool2);
        f7942cp = m7810a("track_app_killed", bool);
        f7943cq = m7810a("mute_controls_enabled", bool);
        f7944cr = m7810a("allow_user_muting", bool2);
        f7945cs = m7810a("mute_videos", bool);
        f7946ct = m7810a("show_mute_by_default", bool);
        f7947cu = m7810a("mute_with_user_settings", bool2);
        f7948cv = m7810a("mute_button_size", 32);
        f7949cw = m7810a("mute_button_margin", 10);
        f7950cx = m7810a("mute_button_gravity", 85);
        f7951cy = m7810a("progress_bar_step", 25L);
        f7952cz = m7810a("progress_bar_scale", 10000);
        f7901cA = m7810a("progress_bar_vertical_padding", -8);
        f7902cB = m7810a("vs_buffer_indicator_size", 50);
        f7903cC = m7810a("set_poststitial_muted_initial_delay_ms", 500L);
        f7904cD = m7810a("minepsv", -1);
        f7905cE = m7810a("maxepsv", -1);
        f7906cF = m7810a("fasuic", bool2);
        f7907cG = m7810a("ssfwif", bool);
        f7908cH = m7810a("submit_postback_timeout", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        f7909cI = m7810a("submit_postback_retries", 4);
        f7910cJ = m7810a("max_postback_attempts", 3);
        f7911cK = m7810a("fppopq", bool);
        f7912cL = m7810a("max_persisted_postbacks", 100);
        f7913cM = m7810a("retry_on_all_errors", bool);
        f7914cN = m7810a("get_retry_delay_v1", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        f7915cO = m7810a("http_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        f7916cP = m7810a("http_socket_timeout", Integer.valueOf((int) timeUnit2.toMillis(20L)));
        f7917cQ = m7810a("force_ssl", bool);
        f7918cR = m7810a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        f7919cS = m7810a("fetch_ad_retry_count_v1", 1);
        f7920cT = m7810a("faer", bool);
        f7921cU = m7810a("faroae", bool);
        f7922cV = m7810a("submit_data_retry_count_v1", 1);
        f7923cW = m7810a("response_buffer_size", 16000);
        f7924cX = m7810a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(10L)));
        f7925cY = m7810a("fetch_basic_settings_retry_count", 3);
        f7926cZ = m7810a("fetch_basic_settings_on_reconnect", bool);
        f7979da = m7810a("skip_fetch_basic_settings_if_not_connected", bool);
        f7980db = m7810a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit2.toMillis(2L)));
        f7981dc = m7810a("fetch_variables_connection_timeout_ms", Integer.valueOf((int) timeUnit2.toMillis(5L)));
        f7982dd = m7810a("idflrwbe", bool);
        f7983de = m7810a("falawpr", bool);
        f7984df = m7810a("sort_query_parameters", bool);
        f7985dg = m7810a("encode_amp_query_value", bool);
        f7986dh = C3114f.m7779a(timeUnit2, 10L, "communicator_request_timeout_ms");
        f7987di = m7810a("communicator_request_retry_count", 3);
        f7988dj = C3114f.m7779a(timeUnit2, 2L, "communicator_request_retry_delay_ms");
        f7989dk = m7810a("ad_session_minutes", 60);
        f7990dl = m7810a("session_tracking_cooldown_on_event_fire", bool2);
        f7991dm = m7810a("session_tracking_resumed_cooldown_minutes", 90L);
        f7992dn = m7810a("session_tracking_paused_cooldown_minutes", 90L);
        f7993do = m7810a("qq", bool);
        f7994dp = m7810a("qq1", bool2);
        f7995dq = m7810a("qq2", bool2);
        f7996dr = m7810a("qq3", bool2);
        f7997ds = m7810a("qq4", bool2);
        f7998dt = m7810a("qq5", bool2);
        f7999du = m7810a("qq6", bool2);
        f8000dv = m7810a("qq7", bool2);
        f8001dw = m7810a("qq8", bool2);
        f8002dx = m7810a("qq9", bool);
        f8003dy = m7810a("pui", bool2);
        f8004dz = m7810a("plugin_version", "");
        f7953dA = m7810a("hgn", bool);
        f7954dB = m7810a("cso", bool);
        f7955dC = m7810a("cfs", bool);
        f7956dD = m7810a("cmi", bool);
        f7957dE = m7810a("crat", bool);
        f7958dF = m7810a("cvs", bool);
        f7959dG = m7810a("caf", bool);
        f7960dH = m7810a("cf", bool);
        f7961dI = m7810a("cmtl", bool2);
        f7962dJ = m7810a("cnr", bool);
        f7963dK = m7810a("adr", bool);
        f7964dL = m7810a("volume_normalization_factor", Float.valueOf(6.6666665f));
        f7965dM = m7810a("system_user_agent_collection_enabled", bool);
        f7966dN = m7810a("user_agent_collection_enabled", bool);
        f7967dO = m7810a("collect_device_angle", bool);
        f7968dP = m7810a("collect_device_movement", bool);
        f7969dQ = m7810a("movement_degradation", Float.valueOf(0.75f));
        f7970dR = m7810a("device_sensor_period_ms", 250);
        f7971dS = m7810a("dte", bool2);
        f7972dT = m7810a("idcw", bool);
        f7973dU = m7810a("anr_debug_thread_refresh_time_ms", -1L);
        f7974dV = m7810a("fetch_basic_settings_delay_ms", Integer.valueOf((int) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED));
        f7975dW = m7810a("cclia", bool2);
        f7976dX = m7810a("lccdm", 10L);
        f7977dY = m7810a("lmfd", 3);
        f7978dZ = m7810a("is_track_ad_info", bool2);
        f8029ea = m7810a("submit_ad_stats_enabled", bool);
        f8030eb = m7810a("submit_ad_stats_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        f8031ec = m7810a("submit_ad_stats_retry_count", 1);
        f8032ed = m7810a("submit_ad_stats_max_count", 500);
        f8033ee = m7810a("asdm", bool);
        f8034ef = m7810a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        f8035eg = m7810a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        f8036eh = m7810a("vast_max_response_length", 640000);
        f8037ei = m7810a("vast_max_wrapper_depth", 5);
        f8038ej = m7810a("vast_unsupported_video_extensions", "ogv,flv");
        f8039ek = m7810a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        f8040el = m7810a("vast_validate_with_extension_if_no_video_type", bool2);
        f8041em = m7810a("vast_video_selection_policy", Integer.valueOf(C2666m.EnumC2668a.MEDIUM.ordinal()));
        f8042en = m7810a("vast_wrapper_resolution_retry_count_v1", 1);
        f8043eo = m7810a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit2.toMillis(30L)));
        f8044ep = m7810a("ree", bool2);
        f8045eq = m7810a("btee", bool2);
        f8046er = m7810a("server_timestamp_ms", 0L);
        f8047es = m7810a("device_timestamp_ms", 0L);
        f8048et = m7810a("gzip_min_length", 0);
        f8049eu = m7810a("gzip_encoding_default", bool);
        f8050ev = m7810a("fetch_settings_gzip", bool);
        f8051ew = m7810a("device_init_gzip", bool);
        f8052ex = m7810a("fetch_ad_gzip", bool);
        f8053ey = m7810a("event_tracking_gzip", bool);
        f8054ez = m7810a("submit_ad_stats_gzip", bool);
        f8005eA = m7810a("reward_postback_gzip", bool);
        f8006eB = m7810a("force_rerender", bool);
        f8007eC = m7810a("daostr", bool);
        f8008eD = m7810a("tctlaa", bool);
        f8009eE = m7810a("rwvdv", bool);
        f8010eF = m7810a("handle_render_process_gone", bool2);
        f8011eG = m7810a("comcr", bool2);
        f8012eH = m7810a("teorpc", bool);
        f8013eI = m7810a("rmpibt", bool);
        f8014eJ = m7810a("spbcioa", bool);
        f8015eK = m7810a("set_webview_render_process_client", bool);
        f8016eL = m7810a("disable_webview_hardware_acceleration", bool);
        f8017eM = m7810a("dsaovcf", bool);
        f8018eN = m7810a("daoar", bool);
        f8019eO = m7810a("use_uri_encode", bool);
        f8020eP = m7810a("anr_detection_enabled", bool);
        f8021eQ = m7810a("anr_trigger_millis", 4000L);
        f8022eR = m7810a("anr_touch_millis", 3000L);
        f8023eS = m7810a("anr_check_millis", 3000L);
        f8024eT = m7810a("frpcfn", bool);
        f8025eU = m7810a("config_consent_dialog_state", VungleApiClient.ConnectionTypeDetail.UNKNOWN);
        f8026eV = m7810a("country_code", "");
        f8027eW = m7810a("c_sticky_topics", "user_engagement_sdk_init,adjust_init,safedk_init,discovery_init,max_ad_events,send_http_request,adapter_initialization_status,privacy_setting_updated,network_sdk_version_updated");
        f8028eX = m7810a("communicator_enabled", bool2);
    }

    public C3109b(String str, T t) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (t == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f8055c = str;
        this.f8056d = t;
    }

    /* renamed from: a */
    public static <T> C3109b<T> m7810a(String str, T t) {
        if (t != null) {
            if (f7795a.contains(t.getClass())) {
                C3109b<T> c3109b = new C3109b<>(str, t);
                Map<String, C3109b<?>> map = f7848b;
                if (!map.containsKey(str)) {
                    map.put(str, c3109b);
                    return c3109b;
                }
                throw new IllegalArgumentException(C0552c.m12192b("Setting has already been used: ", str));
            }
            throw new IllegalArgumentException("Unsupported value type: " + t.getClass());
        }
        throw new IllegalArgumentException("No default value specified");
    }

    /* renamed from: c */
    public static Collection<C3109b<?>> m7808c() {
        return Collections.synchronizedCollection(f7848b.values());
    }

    /* renamed from: a */
    public T m7811a(Object obj) {
        return (T) this.f8056d.getClass().cast(obj);
    }

    /* renamed from: a */
    public String m7812a() {
        return this.f8055c;
    }

    /* renamed from: b */
    public T m7809b() {
        return this.f8056d;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (obj instanceof C3109b) {
            return this.f8055c.compareTo(((C3109b) obj).m7812a());
        }
        return 0;
    }
}
