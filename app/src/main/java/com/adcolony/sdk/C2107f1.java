package com.adcolony.sdk;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.C10752h;
import kotlin.jvm.internal.C10843j;
import kotlin.text.C10929r;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.adcolony.sdk.f1 */
/* loaded from: classes.dex */
public final class C2107f1 extends WebMessagePort.WebMessageCallback {

    /* renamed from: a */
    public final /* synthetic */ C2088e1 f5106a;

    public C2107f1(C2088e1 c2088e1) {
        this.f5106a = c2088e1;
    }

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public final void onMessage(@Nullable WebMessagePort webMessagePort, @Nullable WebMessage webMessage) {
        String data;
        List list;
        if (webMessage != null && (data = webMessage.getData()) != null) {
            Pattern compile = Pattern.compile(":");
            C10843j.m431e(compile, "compile(pattern)");
            C10929r.m389C(2);
            Matcher matcher = compile.matcher(data);
            if (!matcher.find()) {
                list = C10752h.m486c(data.toString());
            } else {
                ArrayList arrayList = new ArrayList(2);
                int i = 0;
                do {
                    arrayList.add(data.subSequence(i, matcher.start()).toString());
                    i = matcher.end();
                    if (arrayList.size() == 1) {
                        break;
                    }
                } while (matcher.find());
                arrayList.add(data.subSequence(i, data.length()).toString());
                list = arrayList;
            }
            if (list.size() == 2 && C10843j.m435a(list.get(0), this.f5106a.f5084y)) {
                C2201m0.m9588d().m9688o().m9629e(C2080d1.m9665c((String) list.get(1), null));
            }
        }
    }
}
