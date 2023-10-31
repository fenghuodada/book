package com.google.firebase.sessions.settings;

import java.util.Map;
import kotlin.C10868p;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC10772d;
import kotlin.jvm.functions.InterfaceC10824p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(m509d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J~\u0010\u000e\u001a\u00020\b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000521\u0010\r\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m508d2 = {"Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "", "", "", "headerOptions", "Lkotlin/Function2;", "Lorg/json/JSONObject;", "Lkotlin/coroutines/d;", "Lkotlin/p;", "onSuccess", "Lkotlin/ParameterName;", "name", "msg", "onFailure", "doConfigFetch", "(Ljava/util/Map;Lkotlin/jvm/functions/p;Lkotlin/jvm/functions/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "com.google.firebase-firebase-sessions"}, m507k = 1, m506mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface CrashlyticsSettingsFetcher {
    @Nullable
    Object doConfigFetch(@NotNull Map<String, String> map, @NotNull InterfaceC10824p<? super JSONObject, ? super InterfaceC10772d<? super C10868p>, ? extends Object> interfaceC10824p, @NotNull InterfaceC10824p<? super String, ? super InterfaceC10772d<? super C10868p>, ? extends Object> interfaceC10824p2, @NotNull InterfaceC10772d<? super C10868p> interfaceC10772d);
}
