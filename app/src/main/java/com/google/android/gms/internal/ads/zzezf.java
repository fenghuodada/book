package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzezf {
    public final String zzA;
    public final zzbwr zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfad zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbsb zzae;
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    @Nullable
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    @Nullable
    public final zzbvi zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    @Nullable
    public final zzezk zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v2, types: [java.util.List] */
    public zzezf(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List list;
        List list2;
        char c;
        zzfrr zzfrrVar;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfrr zzl = zzfrr.zzl();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        zzfrr zzfrrVar2 = zzl;
        String str = "";
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i2 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i3 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        zzezk zzezkVar = null;
        zzbwr zzbwrVar = null;
        zzbsb zzbsbVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        String str18 = null;
        int i4 = -1;
        int i5 = -1;
        List list3 = emptyList11;
        List list4 = emptyList12;
        List list5 = emptyList13;
        List list6 = emptyList14;
        JSONObject jSONObject12 = jSONObject;
        String str19 = str17;
        String str20 = str19;
        int i6 = 0;
        int i7 = 0;
        zzbvi zzbviVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str21 = nextName == null ? "" : nextName;
            switch (str21.hashCode()) {
                case -2138196627:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_source_instance_name")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case -1980587809:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("debug_signals")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -1965512151:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("omid_settings")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case -1871425831:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("recursive_server_response_data")) {
                        c = 'E';
                        break;
                    }
                    c = 65535;
                    break;
                case -1812055556:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("play_prewarm_options")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case -1776946669:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_source_name")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case -1662989631:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("is_interscroller")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case -1620470467:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("backend_query_id")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case -1550155393:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("nofill_urls")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1440104884:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("is_custom_close_blocked")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case -1439500848:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("orientation")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case -1428969291:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("enable_omid")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case -1406227629:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("buffer_click_url_as_ready_to_ping")) {
                        c = 'C';
                        break;
                    }
                    c = 65535;
                    break;
                case -1403779768:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("showable_impression_type")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case -1375413093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_cover")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case -1360811658:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_sizes")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -1306015996:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("adapters")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -1303332046:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("test_mode_enabled")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case -1289032093:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("extras")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -1240082064:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_event_value")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case -1234181075:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("allow_pub_rendered_attribution")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -1168140544:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("presentation_error_urls")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1152230954:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_type")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1146534047:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("is_scroll_aware")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case -1115838944:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("fill_urls")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1081936678:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("allocation_id")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -1078050970:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("video_complete_urls")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1051269058:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("active_view")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -982608540:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("valid_from_timestamp")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -972056451:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_source_instance_id")) {
                        c = '<';
                        break;
                    }
                    c = 65535;
                    break;
                case -776859333:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("click_urls")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -544216775:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("safe_browsing")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -437057161:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("imp_urls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -404433734:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("rtb_native_required_assets")) {
                        c = '>';
                        break;
                    }
                    c = 65535;
                    break;
                case -404326515:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("render_timeout_ms")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case -397704715:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_close_time_ms")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case -388807511:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("content_url")) {
                        c = '@';
                        break;
                    }
                    c = 65535;
                    break;
                case -369773488:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("is_close_button_enabled")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case -213449460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("force_disable_hardware_acceleration")) {
                        c = 'A';
                        break;
                    }
                    c = 65535;
                    break;
                case -213424028:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("watermark")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case -180214626:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("native_required_asset_viewability")) {
                        c = '?';
                        break;
                    }
                    c = 65535;
                    break;
                case -154616268:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("is_offline_ad")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case -29338502:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("allow_custom_click_gesture")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 3107:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals(FacebookAdapter.KEY_ID)) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 3076010:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("data")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 37109963:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("request_id")) {
                        c = 'D';
                        break;
                    }
                    c = 65535;
                    break;
                case 63195984:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("render_test_label")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 107433883:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("qdata")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 230323073:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_load_urls")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 418392395:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("is_closable_area_disabled")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case 549176928:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("presentation_error_timeout_ms")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 597473788:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("debug_dialog_string")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 754887508:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("container_sizes")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 791122864:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("impression_type")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1010584092:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("transaction_id")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1100650276:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("rewards")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1141602460:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("adapter_response_info_key")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 1186014765:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("cache_hit_urls")) {
                        c = 'B';
                        break;
                    }
                    c = 65535;
                    break;
                case 1321720943:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("allow_pub_owned_ad_view")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 1437255331:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_source_id")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case 1637553475:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("bid_response")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 1638957285:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("video_start_urls")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1686319423:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("ad_network_class_name")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 1688341040:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("video_reward_urls")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1799285870:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("use_third_party_container_height")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 1839650832:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("renderers")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1875425491:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("is_analytics_logging_enabled")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 2068142375:
                    list = emptyList9;
                    list2 = emptyList10;
                    if (str21.equals("rule_line_external_id")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 2072888499:
                    list2 = emptyList10;
                    list = emptyList9;
                    if (str21.equals("manual_tracking_urls")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    list = emptyList9;
                    list2 = emptyList10;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    emptyList = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 1:
                    i6 = zzb(jsonReader.nextString());
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 2:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 3:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 4:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 5:
                    i7 = zzc(jsonReader.nextInt());
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 6:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 7:
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '\b':
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '\t':
                    str20 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '\n':
                    str19 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 11:
                    zzbviVar = zzbvi.zza(com.google.android.gms.ads.internal.util.zzbu.zze(jsonReader));
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '\f':
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '\r':
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    emptyList10 = list2;
                    continue;
                case 14:
                    emptyList10 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar2 = zzfrrVar2;
                    break;
                case 15:
                    list3 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 16:
                    i = jsonReader.nextInt();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 17:
                    list4 = zzezg.zza(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 18:
                    zzezkVar = new zzezk(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 19:
                    list6 = zzezg.zza(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 20:
                    list5 = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 21:
                    str = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 22:
                    jSONObject12 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 23:
                    str2 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 24:
                    str3 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 25:
                    str4 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader).toString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 26:
                    zzbwrVar = zzbwr.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 27:
                    str5 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 28:
                    jSONObject7 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 29:
                    jSONObject8 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 30:
                    z = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 31:
                    z2 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case ' ':
                    z3 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '!':
                    z4 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '\"':
                    z5 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '#':
                    z6 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '$':
                    z7 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '%':
                    i4 = zzd(jsonReader.nextString());
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '&':
                    i2 = jsonReader.nextInt();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '\'':
                    z8 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '(':
                    str6 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case ')':
                    jSONObject9 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '*':
                    z9 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '+':
                    z10 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case ',':
                    i3 = jsonReader.nextInt();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '-':
                    i5 = jsonReader.nextInt();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '.':
                    str7 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '/':
                    str8 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '0':
                    z11 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '1':
                    zzbsbVar = zzbsb.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '2':
                    jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '3':
                    zzsVar = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader));
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '4':
                    str9 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '5':
                    z12 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '6':
                    jSONObject10 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '7':
                    str10 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '8':
                    str17 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '9':
                    if (((Boolean) zzbbk.zzgz.zzl()).booleanValue()) {
                        str11 = jsonReader.nextString();
                        zzfrrVar = zzfrrVar2;
                        emptyList10 = list2;
                        zzfrrVar2 = zzfrrVar;
                        break;
                    }
                    jsonReader.skipValue();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                case ':':
                    if (((Boolean) zzbbk.zzgz.zzl()).booleanValue()) {
                        str12 = jsonReader.nextString();
                        zzfrrVar = zzfrrVar2;
                        emptyList10 = list2;
                        zzfrrVar2 = zzfrrVar;
                        break;
                    }
                    jsonReader.skipValue();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                case ';':
                    if (((Boolean) zzbbk.zzgz.zzl()).booleanValue()) {
                        str13 = jsonReader.nextString();
                        zzfrrVar = zzfrrVar2;
                        emptyList10 = list2;
                        zzfrrVar2 = zzfrrVar;
                        break;
                    }
                    jsonReader.skipValue();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                case '<':
                    if (((Boolean) zzbbk.zzgz.zzl()).booleanValue()) {
                        str14 = jsonReader.nextString();
                        zzfrrVar = zzfrrVar2;
                        emptyList10 = list2;
                        zzfrrVar2 = zzfrrVar;
                        break;
                    }
                    jsonReader.skipValue();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                case '=':
                    z13 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '>':
                    jSONObject11 = com.google.android.gms.ads.internal.util.zzbu.zzh(jsonReader);
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '?':
                    z14 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case '@':
                    str18 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 'A':
                    z15 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 'B':
                    zzfrrVar = com.google.android.gms.ads.internal.util.zzbu.zzd(jsonReader);
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 'C':
                    z16 = jsonReader.nextBoolean();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 'D':
                    str15 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                case 'E':
                    str16 = jsonReader.nextString();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
                default:
                    jsonReader.skipValue();
                    zzfrrVar = zzfrrVar2;
                    emptyList10 = list2;
                    zzfrrVar2 = zzfrrVar;
                    break;
            }
            emptyList9 = list;
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i6;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i7;
        this.zzh = emptyList5;
        this.zzi = emptyList6;
        this.zzj = emptyList7;
        this.zzk = str20;
        this.zzl = str19;
        this.zzm = zzbviVar;
        this.zzn = emptyList8;
        this.zzo = emptyList9;
        this.zzp = emptyList10;
        this.zzq = list3;
        this.zzr = i;
        this.zzs = list4;
        this.zzt = zzezkVar;
        this.zzu = list5;
        this.zzv = list6;
        this.zzx = str;
        this.zzw = jSONObject12;
        this.zzy = str2;
        this.zzz = str3;
        this.zzA = str4;
        this.zzB = zzbwrVar;
        this.zzC = str5;
        this.zzD = jSONObject7;
        this.zzE = jSONObject8;
        this.zzK = z;
        this.zzL = z2;
        this.zzM = z3;
        this.zzN = z4;
        this.zzO = z5;
        this.zzP = z6;
        this.zzQ = z7;
        this.zzR = i4;
        this.zzS = i2;
        this.zzU = z8;
        this.zzV = str6;
        this.zzW = new zzfad(jSONObject9);
        this.zzX = z9;
        this.zzY = z10;
        this.zzZ = i3;
        this.zzaa = str7;
        this.zzab = i5;
        this.zzac = str8;
        this.zzad = z11;
        this.zzae = zzbsbVar;
        this.zzaf = zzsVar;
        this.zzag = str9;
        this.zzah = z12;
        this.zzai = jSONObject10;
        this.zzF = str10;
        this.zzG = str11;
        this.zzH = str12;
        this.zzI = str13;
        this.zzJ = str14;
        this.zzaj = z13;
        this.zzak = jSONObject11;
        this.zzal = z14;
        this.zzam = str18;
        this.zzan = z15;
        this.zze = zzfrrVar2;
        this.zzT = z16;
        this.zzao = str15;
        this.zzap = str16;
        this.zzaq = str17;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i) {
        if (i == 0 || i == 1) {
            return i;
        }
        return 0;
    }

    private static final int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }
}
