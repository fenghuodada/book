package com.permissionx.guolindev.dialog;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.C10806j;
import kotlin.collections.C10764t;
import kotlin.collections.C10765u;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.permissionx.guolindev.dialog.a */
/* loaded from: classes3.dex */
public final class C8966a {
    @NotNull

    /* renamed from: a */
    public static final LinkedHashSet f17135a;

    static {
        String[] strArr = {"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_SETTINGS", "android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.REQUEST_INSTALL_PACKAGES", "android.permission.POST_NOTIFICATIONS", "android.permission.BODY_SENSORS_BACKGROUND"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10764t.m468a(7));
        for (int i = 0; i < 7; i++) {
            linkedHashSet.add(strArr[i]);
        }
        f17135a = linkedHashSet;
        Map m466c = C10765u.m466c(new C10806j("android.permission.READ_CALENDAR", "android.permission-group.CALENDAR"), new C10806j("android.permission.WRITE_CALENDAR", "android.permission-group.CALENDAR"), new C10806j("android.permission.READ_CALL_LOG", "android.permission-group.CALL_LOG"), new C10806j("android.permission.WRITE_CALL_LOG", "android.permission-group.CALL_LOG"), new C10806j("android.permission.PROCESS_OUTGOING_CALLS", "android.permission-group.CALL_LOG"), new C10806j("android.permission.CAMERA", "android.permission-group.CAMERA"), new C10806j("android.permission.READ_CONTACTS", "android.permission-group.CONTACTS"), new C10806j("android.permission.WRITE_CONTACTS", "android.permission-group.CONTACTS"), new C10806j("android.permission.GET_ACCOUNTS", "android.permission-group.CONTACTS"), new C10806j("android.permission.ACCESS_FINE_LOCATION", "android.permission-group.LOCATION"), new C10806j("android.permission.ACCESS_COARSE_LOCATION", "android.permission-group.LOCATION"), new C10806j("android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission-group.LOCATION"), new C10806j("android.permission.RECORD_AUDIO", "android.permission-group.MICROPHONE"), new C10806j("android.permission.READ_PHONE_STATE", "android.permission-group.PHONE"), new C10806j("android.permission.READ_PHONE_NUMBERS", "android.permission-group.PHONE"), new C10806j("android.permission.CALL_PHONE", "android.permission-group.PHONE"), new C10806j("android.permission.ANSWER_PHONE_CALLS", "android.permission-group.PHONE"), new C10806j("com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission-group.PHONE"), new C10806j("android.permission.USE_SIP", "android.permission-group.PHONE"), new C10806j("android.permission.ACCEPT_HANDOVER", "android.permission-group.PHONE"), new C10806j("android.permission.BODY_SENSORS", "android.permission-group.SENSORS"), new C10806j("android.permission.ACTIVITY_RECOGNITION", "android.permission-group.ACTIVITY_RECOGNITION"), new C10806j("android.permission.SEND_SMS", "android.permission-group.SMS"), new C10806j("android.permission.RECEIVE_SMS", "android.permission-group.SMS"), new C10806j("android.permission.READ_SMS", "android.permission-group.SMS"), new C10806j("android.permission.RECEIVE_WAP_PUSH", "android.permission-group.SMS"), new C10806j("android.permission.RECEIVE_MMS", "android.permission-group.SMS"), new C10806j("android.permission.READ_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new C10806j("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission-group.STORAGE"), new C10806j("android.permission.ACCESS_MEDIA_LOCATION", "android.permission-group.STORAGE"));
        Map singletonMap = Collections.singletonMap("android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission-group.STORAGE");
        C10843j.m431e(singletonMap, "singletonMap(pair.first, pair.second)");
        LinkedHashMap m462g = C10765u.m462g(singletonMap);
        m462g.putAll(m466c);
        Map m463f = C10765u.m463f(m462g);
        LinkedHashMap m462g2 = C10765u.m462g(C10765u.m466c(new C10806j("android.permission.BLUETOOTH_SCAN", "android.permission-group.NEARBY_DEVICES"), new C10806j("android.permission.BLUETOOTH_ADVERTISE", "android.permission-group.NEARBY_DEVICES"), new C10806j("android.permission.BLUETOOTH_CONNECT", "android.permission-group.NEARBY_DEVICES")));
        m462g2.putAll(m463f);
        Map m463f2 = C10765u.m463f(m462g2);
        LinkedHashMap m462g3 = C10765u.m462g(C10765u.m466c(new C10806j("android.permission.READ_MEDIA_IMAGES", "android.permission-group.READ_MEDIA_VISUAL"), new C10806j("android.permission.READ_MEDIA_VIDEO", "android.permission-group.READ_MEDIA_VISUAL"), new C10806j("android.permission.READ_MEDIA_AUDIO", "android.permission-group.READ_MEDIA_AURAL"), new C10806j("android.permission.POST_NOTIFICATIONS", "android.permission-group.NOTIFICATIONS"), new C10806j("android.permission.NEARBY_WIFI_DEVICES", "android.permission-group.NEARBY_DEVICES"), new C10806j("android.permission.BODY_SENSORS_BACKGROUND", "android.permission-group.SENSORS")));
        m462g3.putAll(m463f2);
        C10765u.m463f(m462g3);
    }
}
